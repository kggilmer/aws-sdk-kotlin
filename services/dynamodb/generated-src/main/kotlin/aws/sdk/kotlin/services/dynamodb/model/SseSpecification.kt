// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the settings used to enable server-side encryption.
 */
class SseSpecification private constructor(builder: BuilderImpl) {
    /**
     * Indicates whether server-side encryption is done using an AWS managed CMK or an AWS owned CMK. If enabled (true),
     * server-side encryption type is set to KMS and an AWS managed CMK is used (AWS KMS charges apply). If disabled (false) or not specified, server-side
     * encryption is set to AWS owned CMK.
     */
    val enabled: Boolean? = builder.enabled
    /**
     * The AWS KMS customer master key (CMK) that should be used for the AWS KMS encryption. To
     * specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note
     * that you should only provide this parameter if the key is different from the default
     * DynamoDB customer master key alias/aws/dynamodb.
     */
    val kmsMasterKeyId: String? = builder.kmsMasterKeyId
    /**
     * Server-side encryption type. The only supported value is:
     * KMS - Server-side encryption that uses AWS Key Management Service. The
     * key is stored in your account and is managed by AWS KMS (AWS KMS charges
     * apply).
     */
    val sseType: SseType? = builder.sseType

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): SseSpecification = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("SseSpecification(")
        append("enabled=$enabled,")
        append("kmsMasterKeyId=$kmsMasterKeyId,")
        append("sseType=$sseType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = enabled?.hashCode() ?: 0
        result = 31 * result + (kmsMasterKeyId?.hashCode() ?: 0)
        result = 31 * result + (sseType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SseSpecification

        if (enabled != other.enabled) return false
        if (kmsMasterKeyId != other.kmsMasterKeyId) return false
        if (sseType != other.sseType) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): SseSpecification = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): SseSpecification
        /**
         * Indicates whether server-side encryption is done using an AWS managed CMK or an AWS owned CMK. If enabled (true),
         * server-side encryption type is set to KMS and an AWS managed CMK is used (AWS KMS charges apply). If disabled (false) or not specified, server-side
         * encryption is set to AWS owned CMK.
         */
        fun enabled(enabled: Boolean): FluentBuilder
        /**
         * The AWS KMS customer master key (CMK) that should be used for the AWS KMS encryption. To
         * specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note
         * that you should only provide this parameter if the key is different from the default
         * DynamoDB customer master key alias/aws/dynamodb.
         */
        fun kmsMasterKeyId(kmsMasterKeyId: String): FluentBuilder
        /**
         * Server-side encryption type. The only supported value is:
         * KMS - Server-side encryption that uses AWS Key Management Service. The
         * key is stored in your account and is managed by AWS KMS (AWS KMS charges
         * apply).
         */
        fun sseType(sseType: SseType): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Indicates whether server-side encryption is done using an AWS managed CMK or an AWS owned CMK. If enabled (true),
         * server-side encryption type is set to KMS and an AWS managed CMK is used (AWS KMS charges apply). If disabled (false) or not specified, server-side
         * encryption is set to AWS owned CMK.
         */
        var enabled: Boolean?
        /**
         * The AWS KMS customer master key (CMK) that should be used for the AWS KMS encryption. To
         * specify a CMK, use its key ID, Amazon Resource Name (ARN), alias name, or alias ARN. Note
         * that you should only provide this parameter if the key is different from the default
         * DynamoDB customer master key alias/aws/dynamodb.
         */
        var kmsMasterKeyId: String?
        /**
         * Server-side encryption type. The only supported value is:
         * KMS - Server-side encryption that uses AWS Key Management Service. The
         * key is stored in your account and is managed by AWS KMS (AWS KMS charges
         * apply).
         */
        var sseType: SseType?

        fun build(): SseSpecification
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var enabled: Boolean? = null
        override var kmsMasterKeyId: String? = null
        override var sseType: SseType? = null

        constructor(x: SseSpecification) : this() {
            this.enabled = x.enabled
            this.kmsMasterKeyId = x.kmsMasterKeyId
            this.sseType = x.sseType
        }

        override fun build(): SseSpecification = SseSpecification(this)
        override fun enabled(enabled: Boolean): FluentBuilder = apply { this.enabled = enabled }
        override fun kmsMasterKeyId(kmsMasterKeyId: String): FluentBuilder = apply { this.kmsMasterKeyId = kmsMasterKeyId }
        override fun sseType(sseType: SseType): FluentBuilder = apply { this.sseType = sseType }
    }
}
