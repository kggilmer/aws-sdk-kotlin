// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeTransitGatewayConnectPeersRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * One or more filters. The possible values are:
     * state - The state of the Connect peer (pending |
     * available | deleting |
     * deleted).
     * transit-gateway-attachment-id - The ID of the attachment.
     * transit-gateway-connect-peer-id - The ID of the Connect peer.
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The maximum number of results to return with a single call.
     * To retrieve the remaining results, make another call with the returned nextToken value.
     */
    val maxResults: Int? = builder.maxResults
    /**
     * The token for the next page of results.
     */
    val nextToken: String? = builder.nextToken
    /**
     * The IDs of the Connect peers.
     */
    val transitGatewayConnectPeerIds: List<String>? = builder.transitGatewayConnectPeerIds

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeTransitGatewayConnectPeersRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeTransitGatewayConnectPeersRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("transitGatewayConnectPeerIds=$transitGatewayConnectPeerIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (transitGatewayConnectPeerIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeTransitGatewayConnectPeersRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (transitGatewayConnectPeerIds != other.transitGatewayConnectPeerIds) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeTransitGatewayConnectPeersRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeTransitGatewayConnectPeersRequest
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * One or more filters. The possible values are:
         * state - The state of the Connect peer (pending |
         * available | deleting |
         * deleted).
         * transit-gateway-attachment-id - The ID of the attachment.
         * transit-gateway-connect-peer-id - The ID of the Connect peer.
         */
        fun filters(filters: List<Filter>): FluentBuilder
        /**
         * The maximum number of results to return with a single call.
         * To retrieve the remaining results, make another call with the returned nextToken value.
         */
        fun maxResults(maxResults: Int): FluentBuilder
        /**
         * The token for the next page of results.
         */
        fun nextToken(nextToken: String): FluentBuilder
        /**
         * The IDs of the Connect peers.
         */
        fun transitGatewayConnectPeerIds(transitGatewayConnectPeerIds: List<String>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * One or more filters. The possible values are:
         * state - The state of the Connect peer (pending |
         * available | deleting |
         * deleted).
         * transit-gateway-attachment-id - The ID of the attachment.
         * transit-gateway-connect-peer-id - The ID of the Connect peer.
         */
        var filters: List<Filter>?
        /**
         * The maximum number of results to return with a single call.
         * To retrieve the remaining results, make another call with the returned nextToken value.
         */
        var maxResults: Int?
        /**
         * The token for the next page of results.
         */
        var nextToken: String?
        /**
         * The IDs of the Connect peers.
         */
        var transitGatewayConnectPeerIds: List<String>?

        fun build(): DescribeTransitGatewayConnectPeersRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var filters: List<Filter>? = null
        override var maxResults: Int? = null
        override var nextToken: String? = null
        override var transitGatewayConnectPeerIds: List<String>? = null

        constructor(x: DescribeTransitGatewayConnectPeersRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.transitGatewayConnectPeerIds = x.transitGatewayConnectPeerIds
        }

        override fun build(): DescribeTransitGatewayConnectPeersRequest = DescribeTransitGatewayConnectPeersRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun filters(filters: List<Filter>): FluentBuilder = apply { this.filters = filters }
        override fun maxResults(maxResults: Int): FluentBuilder = apply { this.maxResults = maxResults }
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
        override fun transitGatewayConnectPeerIds(transitGatewayConnectPeerIds: List<String>): FluentBuilder = apply { this.transitGatewayConnectPeerIds = transitGatewayConnectPeerIds }
    }
}
