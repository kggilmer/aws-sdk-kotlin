// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class AllocateAddressRequest private constructor(builder: BuilderImpl) {
    /**
     * &#91;EC2-VPC&#93; The Elastic IP address to recover or an IPv4 address from an address pool.
     */
    val address: String? = builder.address
    /**
     * The ID of a customer-owned address pool. Use this parameter to let Amazon EC2
     * select an address from the address pool. Alternatively, specify a specific
     * address from the address pool.
     */
    val customerOwnedIpv4Pool: String? = builder.customerOwnedIpv4Pool
    /**
     * Indicates whether the Elastic IP address is for use with instances in a VPC or instances in EC2-Classic.
     * Default: If the Region supports EC2-Classic, the default is standard. Otherwise, the default
     * is vpc.
     */
    val domain: DomainType? = builder.domain
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * A unique set of Availability Zones, Local Zones, or Wavelength Zones from which Amazon Web Services
     * advertises IP addresses. Use this parameter to limit the IP address to this location. IP
     * addresses cannot move between network border groups.
     * Use <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html">DescribeAvailabilityZones to view the network border groups.
     * You cannot use a network border group with EC2 Classic. If you attempt this operation on EC2 Classic,
     * you receive an InvalidParameterCombination error.
     */
    val networkBorderGroup: String? = builder.networkBorderGroup
    /**
     * The ID of an address pool that you own. Use this parameter to let Amazon EC2 select an address from the address pool.
     * To specify a specific address from the address pool, use the Address parameter instead.
     */
    val publicIpv4Pool: String? = builder.publicIpv4Pool
    /**
     * The tags to assign to the Elastic IP address.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): AllocateAddressRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("AllocateAddressRequest(")
        append("address=$address,")
        append("customerOwnedIpv4Pool=$customerOwnedIpv4Pool,")
        append("domain=$domain,")
        append("dryRun=$dryRun,")
        append("networkBorderGroup=$networkBorderGroup,")
        append("publicIpv4Pool=$publicIpv4Pool,")
        append("tagSpecifications=$tagSpecifications)")
    }

    override fun hashCode(): kotlin.Int {
        var result = address?.hashCode() ?: 0
        result = 31 * result + (customerOwnedIpv4Pool?.hashCode() ?: 0)
        result = 31 * result + (domain?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (networkBorderGroup?.hashCode() ?: 0)
        result = 31 * result + (publicIpv4Pool?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AllocateAddressRequest

        if (address != other.address) return false
        if (customerOwnedIpv4Pool != other.customerOwnedIpv4Pool) return false
        if (domain != other.domain) return false
        if (dryRun != other.dryRun) return false
        if (networkBorderGroup != other.networkBorderGroup) return false
        if (publicIpv4Pool != other.publicIpv4Pool) return false
        if (tagSpecifications != other.tagSpecifications) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): AllocateAddressRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): AllocateAddressRequest
        /**
         * &#91;EC2-VPC&#93; The Elastic IP address to recover or an IPv4 address from an address pool.
         */
        fun address(address: String): FluentBuilder
        /**
         * The ID of a customer-owned address pool. Use this parameter to let Amazon EC2
         * select an address from the address pool. Alternatively, specify a specific
         * address from the address pool.
         */
        fun customerOwnedIpv4Pool(customerOwnedIpv4Pool: String): FluentBuilder
        /**
         * Indicates whether the Elastic IP address is for use with instances in a VPC or instances in EC2-Classic.
         * Default: If the Region supports EC2-Classic, the default is standard. Otherwise, the default
         * is vpc.
         */
        fun domain(domain: DomainType): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * A unique set of Availability Zones, Local Zones, or Wavelength Zones from which Amazon Web Services
         * advertises IP addresses. Use this parameter to limit the IP address to this location. IP
         * addresses cannot move between network border groups.
         * Use <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html">DescribeAvailabilityZones to view the network border groups.
         * You cannot use a network border group with EC2 Classic. If you attempt this operation on EC2 Classic,
         * you receive an InvalidParameterCombination error.
         */
        fun networkBorderGroup(networkBorderGroup: String): FluentBuilder
        /**
         * The ID of an address pool that you own. Use this parameter to let Amazon EC2 select an address from the address pool.
         * To specify a specific address from the address pool, use the Address parameter instead.
         */
        fun publicIpv4Pool(publicIpv4Pool: String): FluentBuilder
        /**
         * The tags to assign to the Elastic IP address.
         */
        fun tagSpecifications(tagSpecifications: List<TagSpecification>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * &#91;EC2-VPC&#93; The Elastic IP address to recover or an IPv4 address from an address pool.
         */
        var address: String?
        /**
         * The ID of a customer-owned address pool. Use this parameter to let Amazon EC2
         * select an address from the address pool. Alternatively, specify a specific
         * address from the address pool.
         */
        var customerOwnedIpv4Pool: String?
        /**
         * Indicates whether the Elastic IP address is for use with instances in a VPC or instances in EC2-Classic.
         * Default: If the Region supports EC2-Classic, the default is standard. Otherwise, the default
         * is vpc.
         */
        var domain: DomainType?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * A unique set of Availability Zones, Local Zones, or Wavelength Zones from which Amazon Web Services
         * advertises IP addresses. Use this parameter to limit the IP address to this location. IP
         * addresses cannot move between network border groups.
         * Use <a href="https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeAvailabilityZones.html">DescribeAvailabilityZones to view the network border groups.
         * You cannot use a network border group with EC2 Classic. If you attempt this operation on EC2 Classic,
         * you receive an InvalidParameterCombination error.
         */
        var networkBorderGroup: String?
        /**
         * The ID of an address pool that you own. Use this parameter to let Amazon EC2 select an address from the address pool.
         * To specify a specific address from the address pool, use the Address parameter instead.
         */
        var publicIpv4Pool: String?
        /**
         * The tags to assign to the Elastic IP address.
         */
        var tagSpecifications: List<TagSpecification>?

        fun build(): AllocateAddressRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var address: String? = null
        override var customerOwnedIpv4Pool: String? = null
        override var domain: DomainType? = null
        override var dryRun: Boolean? = null
        override var networkBorderGroup: String? = null
        override var publicIpv4Pool: String? = null
        override var tagSpecifications: List<TagSpecification>? = null

        constructor(x: AllocateAddressRequest) : this() {
            this.address = x.address
            this.customerOwnedIpv4Pool = x.customerOwnedIpv4Pool
            this.domain = x.domain
            this.dryRun = x.dryRun
            this.networkBorderGroup = x.networkBorderGroup
            this.publicIpv4Pool = x.publicIpv4Pool
            this.tagSpecifications = x.tagSpecifications
        }

        override fun build(): AllocateAddressRequest = AllocateAddressRequest(this)
        override fun address(address: String): FluentBuilder = apply { this.address = address }
        override fun customerOwnedIpv4Pool(customerOwnedIpv4Pool: String): FluentBuilder = apply { this.customerOwnedIpv4Pool = customerOwnedIpv4Pool }
        override fun domain(domain: DomainType): FluentBuilder = apply { this.domain = domain }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun networkBorderGroup(networkBorderGroup: String): FluentBuilder = apply { this.networkBorderGroup = networkBorderGroup }
        override fun publicIpv4Pool(publicIpv4Pool: String): FluentBuilder = apply { this.publicIpv4Pool = publicIpv4Pool }
        override fun tagSpecifications(tagSpecifications: List<TagSpecification>): FluentBuilder = apply { this.tagSpecifications = tagSpecifications }
    }
}
