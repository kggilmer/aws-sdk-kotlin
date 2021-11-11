// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DisableEbsEncryptionByDefaultResponse private constructor(builder: BuilderImpl) {
    /**
     * The updated status of encryption by default.
     */
    val ebsEncryptionByDefault: Boolean? = builder.ebsEncryptionByDefault

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DisableEbsEncryptionByDefaultResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DisableEbsEncryptionByDefaultResponse(")
        append("ebsEncryptionByDefault=$ebsEncryptionByDefault)")
    }

    override fun hashCode(): kotlin.Int {
        var result = ebsEncryptionByDefault?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DisableEbsEncryptionByDefaultResponse

        if (ebsEncryptionByDefault != other.ebsEncryptionByDefault) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DisableEbsEncryptionByDefaultResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DisableEbsEncryptionByDefaultResponse
        /**
         * The updated status of encryption by default.
         */
        fun ebsEncryptionByDefault(ebsEncryptionByDefault: Boolean): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The updated status of encryption by default.
         */
        var ebsEncryptionByDefault: Boolean?

        fun build(): DisableEbsEncryptionByDefaultResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var ebsEncryptionByDefault: Boolean? = null

        constructor(x: DisableEbsEncryptionByDefaultResponse) : this() {
            this.ebsEncryptionByDefault = x.ebsEncryptionByDefault
        }

        override fun build(): DisableEbsEncryptionByDefaultResponse = DisableEbsEncryptionByDefaultResponse(this)
        override fun ebsEncryptionByDefault(ebsEncryptionByDefault: Boolean): FluentBuilder = apply { this.ebsEncryptionByDefault = ebsEncryptionByDefault }
    }
}
