// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Specifies a Diffie-Hellman group number for the VPN tunnel for phase 2 IKE
 * negotiations.
 */
class Phase2DhGroupNumbersRequestListValue private constructor(builder: BuilderImpl) {
    /**
     * The Diffie-Hellmann group number.
     */
    val value: Int? = builder.value

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): Phase2DhGroupNumbersRequestListValue = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("Phase2DhGroupNumbersRequestListValue(")
        append("value=$value)")
    }

    override fun hashCode(): kotlin.Int {
        var result = value ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Phase2DhGroupNumbersRequestListValue

        if (value != other.value) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): Phase2DhGroupNumbersRequestListValue = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): Phase2DhGroupNumbersRequestListValue
        /**
         * The Diffie-Hellmann group number.
         */
        fun value(value: Int): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The Diffie-Hellmann group number.
         */
        var value: Int?

        fun build(): Phase2DhGroupNumbersRequestListValue
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var value: Int? = null

        constructor(x: Phase2DhGroupNumbersRequestListValue) : this() {
            this.value = x.value
        }

        override fun build(): Phase2DhGroupNumbersRequestListValue = Phase2DhGroupNumbersRequestListValue(this)
        override fun value(value: Int): FluentBuilder = apply { this.value = value }
    }
}
