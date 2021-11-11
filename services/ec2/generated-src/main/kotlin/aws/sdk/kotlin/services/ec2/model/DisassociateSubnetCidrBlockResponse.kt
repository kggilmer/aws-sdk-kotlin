// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DisassociateSubnetCidrBlockResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about the IPv6 CIDR block association.
     */
    val ipv6CidrBlockAssociation: SubnetIpv6CidrBlockAssociation? = builder.ipv6CidrBlockAssociation
    /**
     * The ID of the subnet.
     */
    val subnetId: String? = builder.subnetId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DisassociateSubnetCidrBlockResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DisassociateSubnetCidrBlockResponse(")
        append("ipv6CidrBlockAssociation=$ipv6CidrBlockAssociation,")
        append("subnetId=$subnetId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = ipv6CidrBlockAssociation?.hashCode() ?: 0
        result = 31 * result + (subnetId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DisassociateSubnetCidrBlockResponse

        if (ipv6CidrBlockAssociation != other.ipv6CidrBlockAssociation) return false
        if (subnetId != other.subnetId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DisassociateSubnetCidrBlockResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DisassociateSubnetCidrBlockResponse
        /**
         * Information about the IPv6 CIDR block association.
         */
        fun ipv6CidrBlockAssociation(ipv6CidrBlockAssociation: SubnetIpv6CidrBlockAssociation): FluentBuilder
        /**
         * The ID of the subnet.
         */
        fun subnetId(subnetId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the IPv6 CIDR block association.
         */
        var ipv6CidrBlockAssociation: SubnetIpv6CidrBlockAssociation?
        /**
         * The ID of the subnet.
         */
        var subnetId: String?

        fun build(): DisassociateSubnetCidrBlockResponse
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.SubnetIpv6CidrBlockAssociation] inside the given [block]
         */
        fun ipv6CidrBlockAssociation(block: SubnetIpv6CidrBlockAssociation.DslBuilder.() -> kotlin.Unit) {
            this.ipv6CidrBlockAssociation = SubnetIpv6CidrBlockAssociation.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var ipv6CidrBlockAssociation: SubnetIpv6CidrBlockAssociation? = null
        override var subnetId: String? = null

        constructor(x: DisassociateSubnetCidrBlockResponse) : this() {
            this.ipv6CidrBlockAssociation = x.ipv6CidrBlockAssociation
            this.subnetId = x.subnetId
        }

        override fun build(): DisassociateSubnetCidrBlockResponse = DisassociateSubnetCidrBlockResponse(this)
        override fun ipv6CidrBlockAssociation(ipv6CidrBlockAssociation: SubnetIpv6CidrBlockAssociation): FluentBuilder = apply { this.ipv6CidrBlockAssociation = ipv6CidrBlockAssociation }
        override fun subnetId(subnetId: String): FluentBuilder = apply { this.subnetId = subnetId }
    }
}
