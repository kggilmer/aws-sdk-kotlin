// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateKeyPairRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * A unique name for the key pair.
     * Constraints: Up to 255 ASCII characters
     */
    val keyName: String? = builder.keyName
    /**
     * The type of key pair. Note that ED25519 keys are not supported for Windows instances, EC2 Instance Connect, and EC2 Serial Console.
     * Default: rsa
     */
    val keyType: KeyType? = builder.keyType
    /**
     * The tags to apply to the new key pair.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CreateKeyPairRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CreateKeyPairRequest(")
        append("dryRun=$dryRun,")
        append("keyName=$keyName,")
        append("keyType=$keyType,")
        append("tagSpecifications=$tagSpecifications)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (keyName?.hashCode() ?: 0)
        result = 31 * result + (keyType?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CreateKeyPairRequest

        if (dryRun != other.dryRun) return false
        if (keyName != other.keyName) return false
        if (keyType != other.keyType) return false
        if (tagSpecifications != other.tagSpecifications) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CreateKeyPairRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CreateKeyPairRequest
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * A unique name for the key pair.
         * Constraints: Up to 255 ASCII characters
         */
        fun keyName(keyName: String): FluentBuilder
        /**
         * The type of key pair. Note that ED25519 keys are not supported for Windows instances, EC2 Instance Connect, and EC2 Serial Console.
         * Default: rsa
         */
        fun keyType(keyType: KeyType): FluentBuilder
        /**
         * The tags to apply to the new key pair.
         */
        fun tagSpecifications(tagSpecifications: List<TagSpecification>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * A unique name for the key pair.
         * Constraints: Up to 255 ASCII characters
         */
        var keyName: String?
        /**
         * The type of key pair. Note that ED25519 keys are not supported for Windows instances, EC2 Instance Connect, and EC2 Serial Console.
         * Default: rsa
         */
        var keyType: KeyType?
        /**
         * The tags to apply to the new key pair.
         */
        var tagSpecifications: List<TagSpecification>?

        fun build(): CreateKeyPairRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var keyName: String? = null
        override var keyType: KeyType? = null
        override var tagSpecifications: List<TagSpecification>? = null

        constructor(x: CreateKeyPairRequest) : this() {
            this.dryRun = x.dryRun
            this.keyName = x.keyName
            this.keyType = x.keyType
            this.tagSpecifications = x.tagSpecifications
        }

        override fun build(): CreateKeyPairRequest = CreateKeyPairRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun keyName(keyName: String): FluentBuilder = apply { this.keyName = keyName }
        override fun keyType(keyType: KeyType): FluentBuilder = apply { this.keyType = keyType }
        override fun tagSpecifications(tagSpecifications: List<TagSpecification>): FluentBuilder = apply { this.tagSpecifications = tagSpecifications }
    }
}
