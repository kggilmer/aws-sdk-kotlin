// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ResetEbsDefaultKmsKeyIdResponse private constructor(builder: BuilderImpl) {
    /**
     * The Amazon Resource Name (ARN) of the default KMS key for EBS encryption by default.
     */
    val kmsKeyId: String? = builder.kmsKeyId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ResetEbsDefaultKmsKeyIdResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ResetEbsDefaultKmsKeyIdResponse(")
        append("kmsKeyId=$kmsKeyId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = kmsKeyId?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ResetEbsDefaultKmsKeyIdResponse

        if (kmsKeyId != other.kmsKeyId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ResetEbsDefaultKmsKeyIdResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ResetEbsDefaultKmsKeyIdResponse
        /**
         * The Amazon Resource Name (ARN) of the default KMS key for EBS encryption by default.
         */
        fun kmsKeyId(kmsKeyId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The Amazon Resource Name (ARN) of the default KMS key for EBS encryption by default.
         */
        var kmsKeyId: String?

        fun build(): ResetEbsDefaultKmsKeyIdResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var kmsKeyId: String? = null

        constructor(x: ResetEbsDefaultKmsKeyIdResponse) : this() {
            this.kmsKeyId = x.kmsKeyId
        }

        override fun build(): ResetEbsDefaultKmsKeyIdResponse = ResetEbsDefaultKmsKeyIdResponse(this)
        override fun kmsKeyId(kmsKeyId: String): FluentBuilder = apply { this.kmsKeyId = kmsKeyId }
    }
}
