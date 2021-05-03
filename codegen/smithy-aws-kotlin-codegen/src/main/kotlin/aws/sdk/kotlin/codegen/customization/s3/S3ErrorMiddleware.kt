package aws.sdk.kotlin.codegen.customization.s3

import aws.sdk.kotlin.codegen.AWS_CLIENT_RT_GROUP
import aws.sdk.kotlin.codegen.AWS_CLIENT_RT_ROOT_NS
import aws.sdk.kotlin.codegen.AWS_CLIENT_RT_VERSION
import aws.sdk.kotlin.codegen.AwsKotlinDependency
import aws.sdk.kotlin.codegen.protocols.middleware.ModeledExceptionsMiddleware
import software.amazon.smithy.kotlin.codegen.core.GradleConfiguration
import software.amazon.smithy.kotlin.codegen.core.KotlinDependency
import software.amazon.smithy.kotlin.codegen.core.KotlinWriter
import software.amazon.smithy.kotlin.codegen.core.addImport
import software.amazon.smithy.kotlin.codegen.model.getTrait
import software.amazon.smithy.kotlin.codegen.rendering.protocol.HttpBindingResolver
import software.amazon.smithy.kotlin.codegen.rendering.protocol.ProtocolGenerator
import software.amazon.smithy.model.traits.HttpErrorTrait


class S3ErrorMiddleware(
    ctx: ProtocolGenerator.GenerationContext,
    httpBindingResolver: HttpBindingResolver
) : ModeledExceptionsMiddleware(ctx, httpBindingResolver) {
    override val name: String = "S3ErrorFeature"

    override fun addImportsAndDependencies(writer: KotlinWriter) {
        super.addImportsAndDependencies(writer)
        val S3DEP = KotlinDependency(GradleConfiguration.Implementation, "aws.sdk.kotlin.runtime.customizations.s3", AWS_CLIENT_RT_GROUP, "s3", AWS_CLIENT_RT_VERSION)
        writer.addImport("S3ErrorFeature", S3DEP)
    }

    override fun renderRegisterErrors(writer: KotlinWriter) {
        val errors = getModeledErrors()

        errors.forEach { errShape ->
            val code = errShape.id.name
            val symbol = ctx.symbolProvider.toSymbol(errShape)
            val deserializerName = "${symbol.name}Deserializer"
            errShape.getTrait<HttpErrorTrait>()?.code?.let { httpStatusCode ->
                writer.write("register(code = #S, deserializer = $deserializerName(), httpStatusCode = $httpStatusCode)", code)
            }
        }
    }
}
