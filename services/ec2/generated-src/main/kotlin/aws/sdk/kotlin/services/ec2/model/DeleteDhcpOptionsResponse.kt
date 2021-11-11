// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteDhcpOptionsResponse private constructor(builder: BuilderImpl) {

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DeleteDhcpOptionsResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteDhcpOptionsResponse(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        var result = javaClass.hashCode()
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DeleteDhcpOptionsResponse

        return true
    }

    interface FluentBuilder {
        fun build(): DeleteDhcpOptionsResponse
    }

    interface DslBuilder {

        fun build(): DeleteDhcpOptionsResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {

        constructor(x: DeleteDhcpOptionsResponse) : this() {
        }

        override fun build(): DeleteDhcpOptionsResponse = DeleteDhcpOptionsResponse(this)
    }
}
