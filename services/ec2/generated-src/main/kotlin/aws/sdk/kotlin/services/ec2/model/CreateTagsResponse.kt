// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateTagsResponse private constructor(builder: BuilderImpl) {

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CreateTagsResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CreateTagsResponse(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        var result = javaClass.hashCode()
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CreateTagsResponse

        return true
    }

    interface FluentBuilder {
        fun build(): CreateTagsResponse
    }

    interface DslBuilder {

        fun build(): CreateTagsResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {

        constructor(x: CreateTagsResponse) : this() {
        }

        override fun build(): CreateTagsResponse = CreateTagsResponse(this)
    }
}
