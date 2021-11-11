// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Specifies the encryption algorithm for the VPN tunnel for phase 1 IKE
 * negotiations.
 */
class Phase1EncryptionAlgorithmsRequestListValue private constructor(builder: BuilderImpl) {
    /**
     * The value for the encryption algorithm.
     */
    val value: String? = builder.value

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): Phase1EncryptionAlgorithmsRequestListValue = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("Phase1EncryptionAlgorithmsRequestListValue(")
        append("value=$value)")
    }

    override fun hashCode(): kotlin.Int {
        var result = value?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Phase1EncryptionAlgorithmsRequestListValue

        if (value != other.value) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): Phase1EncryptionAlgorithmsRequestListValue = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): Phase1EncryptionAlgorithmsRequestListValue
        /**
         * The value for the encryption algorithm.
         */
        fun value(value: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The value for the encryption algorithm.
         */
        var value: String?

        fun build(): Phase1EncryptionAlgorithmsRequestListValue
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var value: String? = null

        constructor(x: Phase1EncryptionAlgorithmsRequestListValue) : this() {
            this.value = x.value
        }

        override fun build(): Phase1EncryptionAlgorithmsRequestListValue = Phase1EncryptionAlgorithmsRequestListValue(this)
        override fun value(value: String): FluentBuilder = apply { this.value = value }
    }
}
