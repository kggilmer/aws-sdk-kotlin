// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeMovingAddressesRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * One or more filters.
     * moving-status - The status of the Elastic IP address
     * (MovingToVpc | RestoringToClassic).
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The maximum number of results to return for the request in a single page. The remaining
     * results of the initial request can be seen by sending another request with the returned
     * NextToken value. This value can be between 5 and 1000; if
     * MaxResults is given a value outside of this range, an error is returned.
     * Default: If no value is provided, the default is 1000.
     */
    val maxResults: Int? = builder.maxResults
    /**
     * The token for the next page of results.
     */
    val nextToken: String? = builder.nextToken
    /**
     * One or more Elastic IP addresses.
     */
    val publicIps: List<String>? = builder.publicIps

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeMovingAddressesRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeMovingAddressesRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("publicIps=$publicIps)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (publicIps?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeMovingAddressesRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (publicIps != other.publicIps) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeMovingAddressesRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeMovingAddressesRequest
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * One or more filters.
         * moving-status - The status of the Elastic IP address
         * (MovingToVpc | RestoringToClassic).
         */
        fun filters(filters: List<Filter>): FluentBuilder
        /**
         * The maximum number of results to return for the request in a single page. The remaining
         * results of the initial request can be seen by sending another request with the returned
         * NextToken value. This value can be between 5 and 1000; if
         * MaxResults is given a value outside of this range, an error is returned.
         * Default: If no value is provided, the default is 1000.
         */
        fun maxResults(maxResults: Int): FluentBuilder
        /**
         * The token for the next page of results.
         */
        fun nextToken(nextToken: String): FluentBuilder
        /**
         * One or more Elastic IP addresses.
         */
        fun publicIps(publicIps: List<String>): FluentBuilder
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
         * moving-status - The status of the Elastic IP address
         * (MovingToVpc | RestoringToClassic).
         */
        var filters: List<Filter>?
        /**
         * The maximum number of results to return for the request in a single page. The remaining
         * results of the initial request can be seen by sending another request with the returned
         * NextToken value. This value can be between 5 and 1000; if
         * MaxResults is given a value outside of this range, an error is returned.
         * Default: If no value is provided, the default is 1000.
         */
        var maxResults: Int?
        /**
         * The token for the next page of results.
         */
        var nextToken: String?
        /**
         * One or more Elastic IP addresses.
         */
        var publicIps: List<String>?

        fun build(): DescribeMovingAddressesRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var filters: List<Filter>? = null
        override var maxResults: Int? = null
        override var nextToken: String? = null
        override var publicIps: List<String>? = null

        constructor(x: DescribeMovingAddressesRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.publicIps = x.publicIps
        }

        override fun build(): DescribeMovingAddressesRequest = DescribeMovingAddressesRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun filters(filters: List<Filter>): FluentBuilder = apply { this.filters = filters }
        override fun maxResults(maxResults: Int): FluentBuilder = apply { this.maxResults = maxResults }
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
        override fun publicIps(publicIps: List<String>): FluentBuilder = apply { this.publicIps = publicIps }
    }
}
