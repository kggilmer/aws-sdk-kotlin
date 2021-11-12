// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateEgressOnlyInternetGatewayRequest private constructor(builder: BuilderImpl) {
    /**
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
     * request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to ensure
     * idempotency.
     */
    val clientToken: String? = builder.clientToken
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The tags to assign to the egress-only internet gateway.
     */
    val tagSpecifications: List<TagSpecification>? = builder.tagSpecifications
    /**
     * The ID of the VPC for which to create the egress-only internet gateway.
     */
    val vpcId: String? = builder.vpcId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CreateEgressOnlyInternetGatewayRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CreateEgressOnlyInternetGatewayRequest(")
        append("clientToken=$clientToken,")
        append("dryRun=$dryRun,")
        append("tagSpecifications=$tagSpecifications,")
        append("vpcId=$vpcId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (tagSpecifications?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CreateEgressOnlyInternetGatewayRequest

        if (clientToken != other.clientToken) return false
        if (dryRun != other.dryRun) return false
        if (tagSpecifications != other.tagSpecifications) return false
        if (vpcId != other.vpcId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CreateEgressOnlyInternetGatewayRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CreateEgressOnlyInternetGatewayRequest
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
         * request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to ensure
         * idempotency.
         */
        fun clientToken(clientToken: String): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The tags to assign to the egress-only internet gateway.
         */
        fun tagSpecifications(tagSpecifications: List<TagSpecification>): FluentBuilder
        /**
         * The ID of the VPC for which to create the egress-only internet gateway.
         */
        fun vpcId(vpcId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Unique, case-sensitive identifier that you provide to ensure the idempotency of the
         * request. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/Run_Instance_Idempotency.html">How to ensure
         * idempotency.
         */
        var clientToken: String?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The tags to assign to the egress-only internet gateway.
         */
        var tagSpecifications: List<TagSpecification>?
        /**
         * The ID of the VPC for which to create the egress-only internet gateway.
         */
        var vpcId: String?

        fun build(): CreateEgressOnlyInternetGatewayRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var clientToken: String? = null
        override var dryRun: Boolean? = null
        override var tagSpecifications: List<TagSpecification>? = null
        override var vpcId: String? = null

        constructor(x: CreateEgressOnlyInternetGatewayRequest) : this() {
            this.clientToken = x.clientToken
            this.dryRun = x.dryRun
            this.tagSpecifications = x.tagSpecifications
            this.vpcId = x.vpcId
        }

        override fun build(): CreateEgressOnlyInternetGatewayRequest = CreateEgressOnlyInternetGatewayRequest(this)
        override fun clientToken(clientToken: String): FluentBuilder = apply { this.clientToken = clientToken }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun tagSpecifications(tagSpecifications: List<TagSpecification>): FluentBuilder = apply { this.tagSpecifications = tagSpecifications }
        override fun vpcId(vpcId: String): FluentBuilder = apply { this.vpcId = vpcId }
    }
}
