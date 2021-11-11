// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a transit gateway prefix list attachment.
 */
class TransitGatewayPrefixListAttachment private constructor(builder: BuilderImpl) {
    /**
     * The ID of the resource.
     */
    val resourceId: String? = builder.resourceId
    /**
     * The resource type. Note that the tgw-peering resource type has been deprecated.
     */
    val resourceType: TransitGatewayAttachmentResourceType? = builder.resourceType
    /**
     * The ID of the attachment.
     */
    val transitGatewayAttachmentId: String? = builder.transitGatewayAttachmentId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): TransitGatewayPrefixListAttachment = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("TransitGatewayPrefixListAttachment(")
        append("resourceId=$resourceId,")
        append("resourceType=$resourceType,")
        append("transitGatewayAttachmentId=$transitGatewayAttachmentId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = resourceId?.hashCode() ?: 0
        result = 31 * result + (resourceType?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayAttachmentId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TransitGatewayPrefixListAttachment

        if (resourceId != other.resourceId) return false
        if (resourceType != other.resourceType) return false
        if (transitGatewayAttachmentId != other.transitGatewayAttachmentId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): TransitGatewayPrefixListAttachment = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): TransitGatewayPrefixListAttachment
        /**
         * The ID of the resource.
         */
        fun resourceId(resourceId: String): FluentBuilder
        /**
         * The resource type. Note that the tgw-peering resource type has been deprecated.
         */
        fun resourceType(resourceType: TransitGatewayAttachmentResourceType): FluentBuilder
        /**
         * The ID of the attachment.
         */
        fun transitGatewayAttachmentId(transitGatewayAttachmentId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The ID of the resource.
         */
        var resourceId: String?
        /**
         * The resource type. Note that the tgw-peering resource type has been deprecated.
         */
        var resourceType: TransitGatewayAttachmentResourceType?
        /**
         * The ID of the attachment.
         */
        var transitGatewayAttachmentId: String?

        fun build(): TransitGatewayPrefixListAttachment
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var resourceId: String? = null
        override var resourceType: TransitGatewayAttachmentResourceType? = null
        override var transitGatewayAttachmentId: String? = null

        constructor(x: TransitGatewayPrefixListAttachment) : this() {
            this.resourceId = x.resourceId
            this.resourceType = x.resourceType
            this.transitGatewayAttachmentId = x.transitGatewayAttachmentId
        }

        override fun build(): TransitGatewayPrefixListAttachment = TransitGatewayPrefixListAttachment(this)
        override fun resourceId(resourceId: String): FluentBuilder = apply { this.resourceId = resourceId }
        override fun resourceType(resourceType: TransitGatewayAttachmentResourceType): FluentBuilder = apply { this.resourceType = resourceType }
        override fun transitGatewayAttachmentId(transitGatewayAttachmentId: String): FluentBuilder = apply { this.transitGatewayAttachmentId = transitGatewayAttachmentId }
    }
}
