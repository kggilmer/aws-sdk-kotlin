// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeLocalGatewaysRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * One or more filters.
     */
    val filters: List<Filter>? = builder.filters
    /**
     * One or more filters.
     * local-gateway-id - The ID of a local gateway.
     * local-gateway-route-table-id - The ID of the local gateway route table.
     * local-gateway-route-table-virtual-interface-group-association-id - The ID of the association.
     * local-gateway-route-table-virtual-interface-group-id - The ID of the virtual interface group.
     * outpost-arn - The Amazon Resource Name (ARN) of the Outpost.
     * state - The state of the association.
     */
    val localGatewayIds: List<String>? = builder.localGatewayIds
    /**
     * The maximum number of results to return with a single call.
     * To retrieve the remaining results, make another call with the returned nextToken value.
     */
    val maxResults: Int? = builder.maxResults
    /**
     * The token for the next page of results.
     */
    val nextToken: String? = builder.nextToken

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeLocalGatewaysRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeLocalGatewaysRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("localGatewayIds=$localGatewayIds,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (localGatewayIds?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeLocalGatewaysRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (localGatewayIds != other.localGatewayIds) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeLocalGatewaysRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeLocalGatewaysRequest
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * One or more filters.
         */
        fun filters(filters: List<Filter>): FluentBuilder
        /**
         * One or more filters.
         * local-gateway-id - The ID of a local gateway.
         * local-gateway-route-table-id - The ID of the local gateway route table.
         * local-gateway-route-table-virtual-interface-group-association-id - The ID of the association.
         * local-gateway-route-table-virtual-interface-group-id - The ID of the virtual interface group.
         * outpost-arn - The Amazon Resource Name (ARN) of the Outpost.
         * state - The state of the association.
         */
        fun localGatewayIds(localGatewayIds: List<String>): FluentBuilder
        /**
         * The maximum number of results to return with a single call.
         * To retrieve the remaining results, make another call with the returned nextToken value.
         */
        fun maxResults(maxResults: Int): FluentBuilder
        /**
         * The token for the next page of results.
         */
        fun nextToken(nextToken: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * One or more filters.
         */
        var filters: List<Filter>?
        /**
         * One or more filters.
         * local-gateway-id - The ID of a local gateway.
         * local-gateway-route-table-id - The ID of the local gateway route table.
         * local-gateway-route-table-virtual-interface-group-association-id - The ID of the association.
         * local-gateway-route-table-virtual-interface-group-id - The ID of the virtual interface group.
         * outpost-arn - The Amazon Resource Name (ARN) of the Outpost.
         * state - The state of the association.
         */
        var localGatewayIds: List<String>?
        /**
         * The maximum number of results to return with a single call.
         * To retrieve the remaining results, make another call with the returned nextToken value.
         */
        var maxResults: Int?
        /**
         * The token for the next page of results.
         */
        var nextToken: String?

        fun build(): DescribeLocalGatewaysRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var filters: List<Filter>? = null
        override var localGatewayIds: List<String>? = null
        override var maxResults: Int? = null
        override var nextToken: String? = null

        constructor(x: DescribeLocalGatewaysRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.localGatewayIds = x.localGatewayIds
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
        }

        override fun build(): DescribeLocalGatewaysRequest = DescribeLocalGatewaysRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun filters(filters: List<Filter>): FluentBuilder = apply { this.filters = filters }
        override fun localGatewayIds(localGatewayIds: List<String>): FluentBuilder = apply { this.localGatewayIds = localGatewayIds }
        override fun maxResults(maxResults: Int): FluentBuilder = apply { this.maxResults = maxResults }
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
    }
}
