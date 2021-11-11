// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a carrier gateway.
 */
class CarrierGateway private constructor(builder: BuilderImpl) {
    /**
     * The ID of the carrier gateway.
     */
    val carrierGatewayId: String? = builder.carrierGatewayId
    /**
     * The Amazon Web Services account ID of the owner of the carrier gateway.
     */
    val ownerId: String? = builder.ownerId
    /**
     * The state of the carrier gateway.
     */
    val state: CarrierGatewayState? = builder.state
    /**
     * The tags assigned to the carrier gateway.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The ID of the VPC associated with the carrier gateway.
     */
    val vpcId: String? = builder.vpcId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CarrierGateway = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CarrierGateway(")
        append("carrierGatewayId=$carrierGatewayId,")
        append("ownerId=$ownerId,")
        append("state=$state,")
        append("tags=$tags,")
        append("vpcId=$vpcId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = carrierGatewayId?.hashCode() ?: 0
        result = 31 * result + (ownerId?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (vpcId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CarrierGateway

        if (carrierGatewayId != other.carrierGatewayId) return false
        if (ownerId != other.ownerId) return false
        if (state != other.state) return false
        if (tags != other.tags) return false
        if (vpcId != other.vpcId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CarrierGateway = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CarrierGateway
        /**
         * The ID of the carrier gateway.
         */
        fun carrierGatewayId(carrierGatewayId: String): FluentBuilder
        /**
         * The Amazon Web Services account ID of the owner of the carrier gateway.
         */
        fun ownerId(ownerId: String): FluentBuilder
        /**
         * The state of the carrier gateway.
         */
        fun state(state: CarrierGatewayState): FluentBuilder
        /**
         * The tags assigned to the carrier gateway.
         */
        fun tags(tags: List<Tag>): FluentBuilder
        /**
         * The ID of the VPC associated with the carrier gateway.
         */
        fun vpcId(vpcId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The ID of the carrier gateway.
         */
        var carrierGatewayId: String?
        /**
         * The Amazon Web Services account ID of the owner of the carrier gateway.
         */
        var ownerId: String?
        /**
         * The state of the carrier gateway.
         */
        var state: CarrierGatewayState?
        /**
         * The tags assigned to the carrier gateway.
         */
        var tags: List<Tag>?
        /**
         * The ID of the VPC associated with the carrier gateway.
         */
        var vpcId: String?

        fun build(): CarrierGateway
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var carrierGatewayId: String? = null
        override var ownerId: String? = null
        override var state: CarrierGatewayState? = null
        override var tags: List<Tag>? = null
        override var vpcId: String? = null

        constructor(x: CarrierGateway) : this() {
            this.carrierGatewayId = x.carrierGatewayId
            this.ownerId = x.ownerId
            this.state = x.state
            this.tags = x.tags
            this.vpcId = x.vpcId
        }

        override fun build(): CarrierGateway = CarrierGateway(this)
        override fun carrierGatewayId(carrierGatewayId: String): FluentBuilder = apply { this.carrierGatewayId = carrierGatewayId }
        override fun ownerId(ownerId: String): FluentBuilder = apply { this.ownerId = ownerId }
        override fun state(state: CarrierGatewayState): FluentBuilder = apply { this.state = state }
        override fun tags(tags: List<Tag>): FluentBuilder = apply { this.tags = tags }
        override fun vpcId(vpcId: String): FluentBuilder = apply { this.vpcId = vpcId }
    }
}
