// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeIdentityIdFormatRequest private constructor(builder: BuilderImpl) {
    /**
     * The ARN of the principal, which can be an IAM role, IAM user, or the root user.
     */
    val principalArn: String? = builder.principalArn
    /**
     * The type of resource: bundle |
     * conversion-task | customer-gateway | dhcp-options |
     * elastic-ip-allocation | elastic-ip-association |
     * export-task | flow-log | image |
     * import-task | instance | internet-gateway |
     * network-acl | network-acl-association |
     * network-interface | network-interface-attachment |
     * prefix-list | reservation | route-table |
     * route-table-association | security-group |
     * snapshot | subnet |
     * subnet-cidr-block-association | volume | vpc
     * | vpc-cidr-block-association | vpc-endpoint |
     * vpc-peering-connection | vpn-connection | vpn-gateway
     */
    val resource: String? = builder.resource

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeIdentityIdFormatRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeIdentityIdFormatRequest(")
        append("principalArn=$principalArn,")
        append("resource=$resource)")
    }

    override fun hashCode(): kotlin.Int {
        var result = principalArn?.hashCode() ?: 0
        result = 31 * result + (resource?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeIdentityIdFormatRequest

        if (principalArn != other.principalArn) return false
        if (resource != other.resource) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeIdentityIdFormatRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeIdentityIdFormatRequest
        /**
         * The ARN of the principal, which can be an IAM role, IAM user, or the root user.
         */
        fun principalArn(principalArn: String): FluentBuilder
        /**
         * The type of resource: bundle |
         * conversion-task | customer-gateway | dhcp-options |
         * elastic-ip-allocation | elastic-ip-association |
         * export-task | flow-log | image |
         * import-task | instance | internet-gateway |
         * network-acl | network-acl-association |
         * network-interface | network-interface-attachment |
         * prefix-list | reservation | route-table |
         * route-table-association | security-group |
         * snapshot | subnet |
         * subnet-cidr-block-association | volume | vpc
         * | vpc-cidr-block-association | vpc-endpoint |
         * vpc-peering-connection | vpn-connection | vpn-gateway
         */
        fun resource(resource: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The ARN of the principal, which can be an IAM role, IAM user, or the root user.
         */
        var principalArn: String?
        /**
         * The type of resource: bundle |
         * conversion-task | customer-gateway | dhcp-options |
         * elastic-ip-allocation | elastic-ip-association |
         * export-task | flow-log | image |
         * import-task | instance | internet-gateway |
         * network-acl | network-acl-association |
         * network-interface | network-interface-attachment |
         * prefix-list | reservation | route-table |
         * route-table-association | security-group |
         * snapshot | subnet |
         * subnet-cidr-block-association | volume | vpc
         * | vpc-cidr-block-association | vpc-endpoint |
         * vpc-peering-connection | vpn-connection | vpn-gateway
         */
        var resource: String?

        fun build(): DescribeIdentityIdFormatRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var principalArn: String? = null
        override var resource: String? = null

        constructor(x: DescribeIdentityIdFormatRequest) : this() {
            this.principalArn = x.principalArn
            this.resource = x.resource
        }

        override fun build(): DescribeIdentityIdFormatRequest = DescribeIdentityIdFormatRequest(this)
        override fun principalArn(principalArn: String): FluentBuilder = apply { this.principalArn = principalArn }
        override fun resource(resource: String): FluentBuilder = apply { this.resource = resource }
    }
}
