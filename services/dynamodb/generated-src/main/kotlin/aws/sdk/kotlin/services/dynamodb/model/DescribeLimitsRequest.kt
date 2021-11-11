// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the input of a DescribeLimits operation. Has no content.
 */
class DescribeLimitsRequest private constructor(builder: BuilderImpl) {

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeLimitsRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeLimitsRequest(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        var result = javaClass.hashCode()
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeLimitsRequest

        return true
    }

    interface FluentBuilder {
        fun build(): DescribeLimitsRequest
    }

    interface DslBuilder {

        fun build(): DescribeLimitsRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {

        constructor(x: DescribeLimitsRequest) : this() {
        }

        override fun build(): DescribeLimitsRequest = DescribeLimitsRequest(this)
    }
}
