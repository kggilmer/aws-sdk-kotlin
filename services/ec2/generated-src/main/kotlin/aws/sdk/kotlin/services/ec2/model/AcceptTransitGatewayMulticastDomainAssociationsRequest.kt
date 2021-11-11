// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class AcceptTransitGatewayMulticastDomainAssociationsRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The IDs of the subnets to associate with the transit gateway multicast domain.
     */
    val subnetIds: List<String>? = builder.subnetIds
    /**
     * The ID of the transit gateway attachment.
     */
    val transitGatewayAttachmentId: String? = builder.transitGatewayAttachmentId
    /**
     * The ID of the transit gateway multicast domain.
     */
    val transitGatewayMulticastDomainId: String? = builder.transitGatewayMulticastDomainId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): AcceptTransitGatewayMulticastDomainAssociationsRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("AcceptTransitGatewayMulticastDomainAssociationsRequest(")
        append("dryRun=$dryRun,")
        append("subnetIds=$subnetIds,")
        append("transitGatewayAttachmentId=$transitGatewayAttachmentId,")
        append("transitGatewayMulticastDomainId=$transitGatewayMulticastDomainId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (subnetIds?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayAttachmentId?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayMulticastDomainId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AcceptTransitGatewayMulticastDomainAssociationsRequest

        if (dryRun != other.dryRun) return false
        if (subnetIds != other.subnetIds) return false
        if (transitGatewayAttachmentId != other.transitGatewayAttachmentId) return false
        if (transitGatewayMulticastDomainId != other.transitGatewayMulticastDomainId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): AcceptTransitGatewayMulticastDomainAssociationsRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): AcceptTransitGatewayMulticastDomainAssociationsRequest
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The IDs of the subnets to associate with the transit gateway multicast domain.
         */
        fun subnetIds(subnetIds: List<String>): FluentBuilder
        /**
         * The ID of the transit gateway attachment.
         */
        fun transitGatewayAttachmentId(transitGatewayAttachmentId: String): FluentBuilder
        /**
         * The ID of the transit gateway multicast domain.
         */
        fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The IDs of the subnets to associate with the transit gateway multicast domain.
         */
        var subnetIds: List<String>?
        /**
         * The ID of the transit gateway attachment.
         */
        var transitGatewayAttachmentId: String?
        /**
         * The ID of the transit gateway multicast domain.
         */
        var transitGatewayMulticastDomainId: String?

        fun build(): AcceptTransitGatewayMulticastDomainAssociationsRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var subnetIds: List<String>? = null
        override var transitGatewayAttachmentId: String? = null
        override var transitGatewayMulticastDomainId: String? = null

        constructor(x: AcceptTransitGatewayMulticastDomainAssociationsRequest) : this() {
            this.dryRun = x.dryRun
            this.subnetIds = x.subnetIds
            this.transitGatewayAttachmentId = x.transitGatewayAttachmentId
            this.transitGatewayMulticastDomainId = x.transitGatewayMulticastDomainId
        }

        override fun build(): AcceptTransitGatewayMulticastDomainAssociationsRequest = AcceptTransitGatewayMulticastDomainAssociationsRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun subnetIds(subnetIds: List<String>): FluentBuilder = apply { this.subnetIds = subnetIds }
        override fun transitGatewayAttachmentId(transitGatewayAttachmentId: String): FluentBuilder = apply { this.transitGatewayAttachmentId = transitGatewayAttachmentId }
        override fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String): FluentBuilder = apply { this.transitGatewayMulticastDomainId = transitGatewayMulticastDomainId }
    }
}
