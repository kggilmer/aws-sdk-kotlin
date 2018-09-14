package software.amazon.awssdk.kotlin.codegen.poet.specs

import software.amazon.awssdk.kotlin.codegen.poet.ClassSpec
import software.amazon.awssdk.kotlin.codegen.poet.PoetExtensions
import software.amazon.awssdk.kotlin.codegen.poet.PoetExtensions.Companion.classNameForType
import com.squareup.kotlinpoet.*
import com.squareup.kotlinpoet.KModifier.DATA
import com.squareup.kotlinpoet.KModifier.PRIVATE
import software.amazon.awssdk.codegen.model.intermediate.MemberModel
import software.amazon.awssdk.codegen.model.intermediate.ShapeModel
import software.amazon.awssdk.kotlin.codegen.CodeGenOptions
import software.amazon.awssdk.kotlin.codegen.isCollection


class ShapeModelSpec(private val model: ShapeModel, private val poetExtensions: PoetExtensions, val codeGenOptions: CodeGenOptions) : ClassSpec(model.shapeName) {

    private val className = poetExtensions.modelClass(model.shapeName)
    private val members = model.nonStreamingMembers.filterNotNull()

    override fun typeSpec(): TypeSpec {

        val params = parameters()

        return TypeSpec.classBuilder(className)
                .apply {
                    if (params.isNotEmpty()) {
                        this.addModifiers(DATA)
                                .primaryConstructor(FunSpec.constructorBuilder()
                                        .addParameters(params)
                                        .build())
                                .addProperties(params.map { PropertySpec.builder(it.name, it.type).initializer(it.name).build() }).apply {
                            if (codeGenOptions.builderSyntax) {
                                this.addFunction(builderConstructor())
                                        .addFunction(applyConstructor())
                                        .addType(TypeSpec.classBuilder("Builder")
                                                .addModifiers(DATA)
                                                .primaryConstructor(FunSpec.constructorBuilder().addParameters(params).build())
                                                .addProperties(params.map { PropertySpec.builder(it.name, it.type).initializer(it.name).mutable(true).build() })
                                                .addFunction(builderBuildMethod())
                                                .addFunctions(complexBuilderSetters())
                                                .build())
                            }
                        }
                    }
                }
                .addAnnotation(poetExtensions.generated)
                .addKdoc("See [%L]", poetExtensions.javaSdkModelClass(model.shapeName).canonicalName)
                .build()
    }

    private fun builderConstructor(): FunSpec {
        val builder = className.nestedClass("Builder")

        val assignments = members.map { CodeBlock.of("%1N = builder.%1N", it.variable.variableName) }.toTypedArray()

        return FunSpec.constructorBuilder()
                .addModifiers(PRIVATE)
                .addParameter("builder", builder)
                .callThisConstructor(*assignments)
                .build()
    }

    private fun applyConstructor(): FunSpec {
        val builder = className.nestedClass("Builder")
        val block = LambdaTypeName.get(builder, returnType = Unit::class.asTypeName())
        return FunSpec.constructorBuilder()
                .addParameter("block", block)
                .callThisConstructor(CodeBlock.of("builder = %T().apply(block)", builder))
                .build()
    }

    private fun builderBuildMethod(): FunSpec {
        return FunSpec.builder("build")
                .returns(className)
                .addCode("return %T(this)", className)
                .build()
    }

    private fun complexBuilderSetters(): Iterable<FunSpec> {
        return members.filterNot { it.isCollection || it.isSimple }.filter { it.variable != null }.map {
            val builder = poetExtensions.modelClass(it.variable.variableType).nestedClass("Builder")
            val block = LambdaTypeName.get(builder, returnType = Unit::class.asTypeName())

            FunSpec.builder(it.variable.variableName)
                    .addParameter("block", block)
                    .addCode("%N = %T().apply(block).build()", it.variable.variableName, builder)
                    .build()
        }
    }

    private fun parameters(): List<ParameterSpec> {
        return members.map {
            val typeName = determineTypeName(it)
            ParameterSpec.builder(it.variable.variableName, typeName.asNullable())
                    .defaultValue("null")
                    .build()
        }
    }

    private fun determineTypeName(memberModel: MemberModel): TypeName {
        if (!memberModel.enumType.isNullOrEmpty()) {
            return poetExtensions.javaSdkModelClass(memberModel.enumType)
        }

        if (memberModel.isSimple) {
            return classNameForType(memberModel.variable.variableType)
        }

        if (memberModel.isList) {
            return ParameterizedTypeName.get(List::class.asClassName(), determineTypeName(memberModel.listModel.listMemberModel))
        }

        if (memberModel.isMap) {
            return ParameterizedTypeName.get(Map::class.asClassName(),
                    determineTypeName(memberModel.mapModel.keyModel),
                    determineTypeName(memberModel.mapModel.valueModel))
        }
        return poetExtensions.modelClass(memberModel.variable.variableType)
    }
}