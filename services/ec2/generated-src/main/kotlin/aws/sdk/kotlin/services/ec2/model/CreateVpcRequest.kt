// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateVpcRequest private constructor(builder: BuilderImpl) {
    /**
     * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC.
     * You cannot specify the range of IP addresses, or the size of the CIDR block.
     */
    val amazonProvidedIpv6CidrBlock: Boolean? = builder.amazonProvidedIpv6CidrBlock
    /**
     * The IPv4 network range for the VPC, in CIDR notation. For example,
     * 10.0.0.0/16. We modify the specified CIDR block to its canonical form; for example, if you specify 100.68.0.18/18, we modify it to 100.68.0.0/18.
     */
    val cidrBlock: String? = builder.cidrBlock
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The tenancy options for instances launched into the VPC. For default, instances
     * are launched with shared tenancy by default. You can launch instances with any tenancy into a
     * shared tenancy VPC. For dedicated, instances are launched as dedicated tenancy
     * instances by default. You can only launch instances with a tenancy of dedicated
     * or host into a dedicated tenancy VPC.
     * Important: The host value cannot be used with this parameter. Use the default or dedicated values only.
     * Default: default
     */
    val instanceTenancy: Tenancy? = builder.instanceTenancy
    /**
     * The IPv6 CIDR block from the IPv6 address pool. You must also specify Ipv6Pool in the request.
     * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
     */
    val ipv6CidrBlock: String? = builder.ipv6CidrBlock
    /**
     * The name of the location from which we advertise the IPV6 CIDR block. Use this parameter to limit the address to this location.
     * You must set AmazonProvidedIpv6CidrBlock to true to use this parameter.
     */
    val ipv6CidrBlockNetworkBorderGroup: String? = builder.ipv6CidrBlockNetworkBorderGroup
    /**
     * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
     */
    val ipv6Pool: String? = builder.ipv6Pool
    /**
     * The tags to assign to the VPC.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CreateVpcRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CreateVpcRequest(")
        append("amazonProvidedIpv6CidrBlock=$amazonProvidedIpv6CidrBlock,")
        append("cidrBlock=$cidrBlock,")
        append("dryRun=$dryRun,")
        append("instanceTenancy=$instanceTenancy,")
        append("ipv6CidrBlock=$ipv6CidrBlock,")
        append("ipv6CidrBlockNetworkBorderGroup=$ipv6CidrBlockNetworkBorderGroup,")
        append("ipv6Pool=$ipv6Pool,")
        append("tagSpecifications=$tagSpecifications)")
    }

    override fun hashCode(): kotlin.Int {
        var result = amazonProvidedIpv6CidrBlock?.hashCode() ?: 0
        result = 31 * result + (cidrBlock?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (instanceTenancy?.hashCode() ?: 0)
        result = 31 * result + (ipv6CidrBlock?.hashCode() ?: 0)
        result = 31 * result + (ipv6CidrBlockNetworkBorderGroup?.hashCode() ?: 0)
        result = 31 * result + (ipv6Pool?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CreateVpcRequest

        if (amazonProvidedIpv6CidrBlock != other.amazonProvidedIpv6CidrBlock) return false
        if (cidrBlock != other.cidrBlock) return false
        if (dryRun != other.dryRun) return false
        if (instanceTenancy != other.instanceTenancy) return false
        if (ipv6CidrBlock != other.ipv6CidrBlock) return false
        if (ipv6CidrBlockNetworkBorderGroup != other.ipv6CidrBlockNetworkBorderGroup) return false
        if (ipv6Pool != other.ipv6Pool) return false
        if (tagSpecifications != other.tagSpecifications) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CreateVpcRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CreateVpcRequest
        /**
         * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC.
         * You cannot specify the range of IP addresses, or the size of the CIDR block.
         */
        fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: Boolean): FluentBuilder
        /**
         * The IPv4 network range for the VPC, in CIDR notation. For example,
         * 10.0.0.0/16. We modify the specified CIDR block to its canonical form; for example, if you specify 100.68.0.18/18, we modify it to 100.68.0.0/18.
         */
        fun cidrBlock(cidrBlock: String): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The tenancy options for instances launched into the VPC. For default, instances
         * are launched with shared tenancy by default. You can launch instances with any tenancy into a
         * shared tenancy VPC. For dedicated, instances are launched as dedicated tenancy
         * instances by default. You can only launch instances with a tenancy of dedicated
         * or host into a dedicated tenancy VPC.
         * Important: The host value cannot be used with this parameter. Use the default or dedicated values only.
         * Default: default
         */
        fun instanceTenancy(instanceTenancy: Tenancy): FluentBuilder
        /**
         * The IPv6 CIDR block from the IPv6 address pool. You must also specify Ipv6Pool in the request.
         * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
         */
        fun ipv6CidrBlock(ipv6CidrBlock: String): FluentBuilder
        /**
         * The name of the location from which we advertise the IPV6 CIDR block. Use this parameter to limit the address to this location.
         * You must set AmazonProvidedIpv6CidrBlock to true to use this parameter.
         */
        fun ipv6CidrBlockNetworkBorderGroup(ipv6CidrBlockNetworkBorderGroup: String): FluentBuilder
        /**
         * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
         */
        fun ipv6Pool(ipv6Pool: String): FluentBuilder
        /**
         * The tags to assign to the VPC.
         */
        fun tagSpecifications(tagSpecifications: List<TagSpecification>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Requests an Amazon-provided IPv6 CIDR block with a /56 prefix length for the VPC.
         * You cannot specify the range of IP addresses, or the size of the CIDR block.
         */
        var amazonProvidedIpv6CidrBlock: Boolean?
        /**
         * The IPv4 network range for the VPC, in CIDR notation. For example,
         * 10.0.0.0/16. We modify the specified CIDR block to its canonical form; for example, if you specify 100.68.0.18/18, we modify it to 100.68.0.0/18.
         */
        var cidrBlock: String?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The tenancy options for instances launched into the VPC. For default, instances
         * are launched with shared tenancy by default. You can launch instances with any tenancy into a
         * shared tenancy VPC. For dedicated, instances are launched as dedicated tenancy
         * instances by default. You can only launch instances with a tenancy of dedicated
         * or host into a dedicated tenancy VPC.
         * Important: The host value cannot be used with this parameter. Use the default or dedicated values only.
         * Default: default
         */
        var instanceTenancy: Tenancy?
        /**
         * The IPv6 CIDR block from the IPv6 address pool. You must also specify Ipv6Pool in the request.
         * To let Amazon choose the IPv6 CIDR block for you, omit this parameter.
         */
        var ipv6CidrBlock: String?
        /**
         * The name of the location from which we advertise the IPV6 CIDR block. Use this parameter to limit the address to this location.
         * You must set AmazonProvidedIpv6CidrBlock to true to use this parameter.
         */
        var ipv6CidrBlockNetworkBorderGroup: String?
        /**
         * The ID of an IPv6 address pool from which to allocate the IPv6 CIDR block.
         */
        var ipv6Pool: String?
        /**
         * The tags to assign to the VPC.
         */
        var tagSpecifications: List<TagSpecification>?

        fun build(): CreateVpcRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var amazonProvidedIpv6CidrBlock: Boolean? = null
        override var cidrBlock: String? = null
        override var dryRun: Boolean? = null
        override var instanceTenancy: Tenancy? = null
        override var ipv6CidrBlock: String? = null
        override var ipv6CidrBlockNetworkBorderGroup: String? = null
        override var ipv6Pool: String? = null
        override var tagSpecifications: List<TagSpecification>? = null

        constructor(x: CreateVpcRequest) : this() {
            this.amazonProvidedIpv6CidrBlock = x.amazonProvidedIpv6CidrBlock
            this.cidrBlock = x.cidrBlock
            this.dryRun = x.dryRun
            this.instanceTenancy = x.instanceTenancy
            this.ipv6CidrBlock = x.ipv6CidrBlock
            this.ipv6CidrBlockNetworkBorderGroup = x.ipv6CidrBlockNetworkBorderGroup
            this.ipv6Pool = x.ipv6Pool
            this.tagSpecifications = x.tagSpecifications
        }

        override fun build(): CreateVpcRequest = CreateVpcRequest(this)
        override fun amazonProvidedIpv6CidrBlock(amazonProvidedIpv6CidrBlock: Boolean): FluentBuilder = apply { this.amazonProvidedIpv6CidrBlock = amazonProvidedIpv6CidrBlock }
        override fun cidrBlock(cidrBlock: String): FluentBuilder = apply { this.cidrBlock = cidrBlock }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun instanceTenancy(instanceTenancy: Tenancy): FluentBuilder = apply { this.instanceTenancy = instanceTenancy }
        override fun ipv6CidrBlock(ipv6CidrBlock: String): FluentBuilder = apply { this.ipv6CidrBlock = ipv6CidrBlock }
        override fun ipv6CidrBlockNetworkBorderGroup(ipv6CidrBlockNetworkBorderGroup: String): FluentBuilder = apply { this.ipv6CidrBlockNetworkBorderGroup = ipv6CidrBlockNetworkBorderGroup }
        override fun ipv6Pool(ipv6Pool: String): FluentBuilder = apply { this.ipv6Pool = ipv6Pool }
        override fun tagSpecifications(tagSpecifications: List<TagSpecification>): FluentBuilder = apply { this.tagSpecifications = tagSpecifications }
    }
}
