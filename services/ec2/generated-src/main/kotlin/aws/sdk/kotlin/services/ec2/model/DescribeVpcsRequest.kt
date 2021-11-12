// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeVpcsRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * One or more filters.
     * cidr - The primary IPv4 CIDR block of the VPC. The CIDR block you
     * specify must exactly match the VPC's CIDR block for information to be returned
     * for the VPC. Must contain the slash followed by one or two digits (for example,
     * /28).
     * cidr-block-association.cidr-block - An IPv4 CIDR block associated with the
     * VPC.
     * cidr-block-association.association-id - The association ID for
     * an IPv4 CIDR block associated with the VPC.
     * cidr-block-association.state - The state of an IPv4 CIDR block
     * associated with the VPC.
     * dhcp-options-id - The ID of a set of DHCP options.
     * ipv6-cidr-block-association.ipv6-cidr-block - An IPv6 CIDR
     * block associated with the VPC.
     * ipv6-cidr-block-association.ipv6-pool - The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.
     * ipv6-cidr-block-association.association-id - The association
     * ID for an IPv6 CIDR block associated with the VPC.
     * ipv6-cidr-block-association.state - The state of an IPv6 CIDR
     * block associated with the VPC.
     * is-default - Indicates whether the VPC is the default VPC.
     * owner-id - The ID of the Amazon Web Services account that owns the VPC.
     * state - The state of the VPC (pending | available).
     * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
     * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
     * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
     * vpc-id - The ID of the VPC.
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
     * One or more VPC IDs.
     * Default: Describes all your VPCs.
     */
    val vpcIds: List<String>? = builder.vpcIds

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeVpcsRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeVpcsRequest(")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("maxResults=$maxResults,")
        append("nextToken=$nextToken,")
        append("vpcIds=$vpcIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (maxResults ?: 0)
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        result = 31 * result + (vpcIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeVpcsRequest

        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (maxResults != other.maxResults) return false
        if (nextToken != other.nextToken) return false
        if (vpcIds != other.vpcIds) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeVpcsRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeVpcsRequest
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * One or more filters.
         * cidr - The primary IPv4 CIDR block of the VPC. The CIDR block you
         * specify must exactly match the VPC's CIDR block for information to be returned
         * for the VPC. Must contain the slash followed by one or two digits (for example,
         * /28).
         * cidr-block-association.cidr-block - An IPv4 CIDR block associated with the
         * VPC.
         * cidr-block-association.association-id - The association ID for
         * an IPv4 CIDR block associated with the VPC.
         * cidr-block-association.state - The state of an IPv4 CIDR block
         * associated with the VPC.
         * dhcp-options-id - The ID of a set of DHCP options.
         * ipv6-cidr-block-association.ipv6-cidr-block - An IPv6 CIDR
         * block associated with the VPC.
         * ipv6-cidr-block-association.ipv6-pool - The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.
         * ipv6-cidr-block-association.association-id - The association
         * ID for an IPv6 CIDR block associated with the VPC.
         * ipv6-cidr-block-association.state - The state of an IPv6 CIDR
         * block associated with the VPC.
         * is-default - Indicates whether the VPC is the default VPC.
         * owner-id - The ID of the Amazon Web Services account that owns the VPC.
         * state - The state of the VPC (pending | available).
         * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
         * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
         * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
         * vpc-id - The ID of the VPC.
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
         * One or more VPC IDs.
         * Default: Describes all your VPCs.
         */
        fun vpcIds(vpcIds: List<String>): FluentBuilder
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
         * cidr - The primary IPv4 CIDR block of the VPC. The CIDR block you
         * specify must exactly match the VPC's CIDR block for information to be returned
         * for the VPC. Must contain the slash followed by one or two digits (for example,
         * /28).
         * cidr-block-association.cidr-block - An IPv4 CIDR block associated with the
         * VPC.
         * cidr-block-association.association-id - The association ID for
         * an IPv4 CIDR block associated with the VPC.
         * cidr-block-association.state - The state of an IPv4 CIDR block
         * associated with the VPC.
         * dhcp-options-id - The ID of a set of DHCP options.
         * ipv6-cidr-block-association.ipv6-cidr-block - An IPv6 CIDR
         * block associated with the VPC.
         * ipv6-cidr-block-association.ipv6-pool - The ID of the IPv6 address pool from which the IPv6 CIDR block is allocated.
         * ipv6-cidr-block-association.association-id - The association
         * ID for an IPv6 CIDR block associated with the VPC.
         * ipv6-cidr-block-association.state - The state of an IPv6 CIDR
         * block associated with the VPC.
         * is-default - Indicates whether the VPC is the default VPC.
         * owner-id - The ID of the Amazon Web Services account that owns the VPC.
         * state - The state of the VPC (pending | available).
         * tag:<key> - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value.
         * For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.
         * tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.
         * vpc-id - The ID of the VPC.
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
         * One or more VPC IDs.
         * Default: Describes all your VPCs.
         */
        var vpcIds: List<String>?

        fun build(): DescribeVpcsRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var filters: List<Filter>? = null
        override var maxResults: Int? = null
        override var nextToken: String? = null
        override var vpcIds: List<String>? = null

        constructor(x: DescribeVpcsRequest) : this() {
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.maxResults = x.maxResults
            this.nextToken = x.nextToken
            this.vpcIds = x.vpcIds
        }

        override fun build(): DescribeVpcsRequest = DescribeVpcsRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun filters(filters: List<Filter>): FluentBuilder = apply { this.filters = filters }
        override fun maxResults(maxResults: Int): FluentBuilder = apply { this.maxResults = maxResults }
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
        override fun vpcIds(vpcIds: List<String>): FluentBuilder = apply { this.vpcIds = vpcIds }
    }
}
