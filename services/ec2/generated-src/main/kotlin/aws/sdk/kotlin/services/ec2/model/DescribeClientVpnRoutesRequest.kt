// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeClientVpnRoutesRequest private constructor(builder: BuilderImpl) {
    /**
     * The ID of the Client VPN endpoint.
     */
    val clientVpnEndpointId: String? = builder.clientVpnEndpointId
    /**
     * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * One or more filters. Filter names and values are case-sensitive.
     * destination-cidr - The CIDR of the route destination.
     * origin - How the route was associated with the Client VPN endpoint (associate | add-route).
     * target-subnet - The ID of the subnet through which traffic is routed.
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the nextToken value.
     */
    val maxResults: Int? = builder.maxResults
    /**
     * The token to retrieve the next page of results.
     */
    val nextToken: String? = builder.nextToken

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeClientVpnRoutesRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeClientVpnRoutesRequest(")
        append("clientVpnEndpointId=$clientVpnEndpointId,")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientVpnEndpointId?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeClientVpnRoutesRequest

        if (clientVpnEndpointId != other.clientVpnEndpointId) return false
        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeClientVpnRoutesRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeClientVpnRoutesRequest
        /**
         * The ID of the Client VPN endpoint.
         */
        fun clientVpnEndpointId(clientVpnEndpointId: String): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * One or more filters. Filter names and values are case-sensitive.
         * destination-cidr - The CIDR of the route destination.
         * origin - How the route was associated with the Client VPN endpoint (associate | add-route).
         * target-subnet - The ID of the subnet through which traffic is routed.
         */
        fun filters(filters: List<Filter>): FluentBuilder
        /**
         * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the nextToken value.
         */
        fun maxResults(maxResults: Int): FluentBuilder
        /**
         * The token to retrieve the next page of results.
         */
        fun nextToken(nextToken: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The ID of the Client VPN endpoint.
         */
        var clientVpnEndpointId: String?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * One or more filters. Filter names and values are case-sensitive.
         * destination-cidr - The CIDR of the route destination.
         * origin - How the route was associated with the Client VPN endpoint (associate | add-route).
         * target-subnet - The ID of the subnet through which traffic is routed.
         */
        var filters: List<Filter>?
        /**
         * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the nextToken value.
         */
        var maxResults: Int?
        /**
         * The token to retrieve the next page of results.
         */
        var nextToken: String?

        fun build(): DescribeClientVpnRoutesRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var clientVpnEndpointId: String? = null
        override var dryRun: Boolean? = null
        override var filters: List<Filter>? = null
        override var maxResults: Int? = null
        override var nextToken: String? = null

        constructor(x: DescribeClientVpnRoutesRequest) : this() {
            this.clientVpnEndpointId = x.clientVpnEndpointId
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
        }

        override fun build(): DescribeClientVpnRoutesRequest = DescribeClientVpnRoutesRequest(this)
        override fun clientVpnEndpointId(clientVpnEndpointId: String): FluentBuilder = apply { this.clientVpnEndpointId = clientVpnEndpointId }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun filters(filters: List<Filter>): FluentBuilder = apply { this.filters = filters }
        override fun maxResults(maxResults: Int): FluentBuilder = apply { this.maxResults = maxResults }
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
    }
}
