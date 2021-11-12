// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a Traffic Mirror target.
 */
class TrafficMirrorTarget private constructor(builder: BuilderImpl) {
    /**
     * Information about the Traffic Mirror target.
     */
    val description: String? = builder.description
    /**
     * The network interface ID that is attached to the target.
     */
    val networkInterfaceId: String? = builder.networkInterfaceId
    /**
     * The Amazon Resource Name (ARN) of the Network Load Balancer.
     */
    val networkLoadBalancerArn: String? = builder.networkLoadBalancerArn
    /**
     * The ID of the account that owns the Traffic Mirror target.
     */
    val ownerId: String? = builder.ownerId
    /**
     * The tags assigned to the Traffic Mirror target.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The ID of the Traffic Mirror target.
     */
    val trafficMirrorTargetId: String? = builder.trafficMirrorTargetId
    /**
     * The type of Traffic Mirror target.
     */
    val type: TrafficMirrorTargetType? = builder.type

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): TrafficMirrorTarget = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("TrafficMirrorTarget(")
        append("description=$description,")
        append("networkInterfaceId=$networkInterfaceId,")
        append("networkLoadBalancerArn=$networkLoadBalancerArn,")
        append("ownerId=$ownerId,")
        append("tags=$tags,")
        append("trafficMirrorTargetId=$trafficMirrorTargetId,")
        append("type=$type)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (networkInterfaceId?.hashCode() ?: 0)
        result = 31 * result + (networkLoadBalancerArn?.hashCode() ?: 0)
        result = 31 * result + (ownerId?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (trafficMirrorTargetId?.hashCode() ?: 0)
        result = 31 * result + (type?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TrafficMirrorTarget

        if (description != other.description) return false
        if (networkInterfaceId != other.networkInterfaceId) return false
        if (networkLoadBalancerArn != other.networkLoadBalancerArn) return false
        if (ownerId != other.ownerId) return false
        if (tags != other.tags) return false
        if (trafficMirrorTargetId != other.trafficMirrorTargetId) return false
        if (type != other.type) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): TrafficMirrorTarget = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): TrafficMirrorTarget
        /**
         * Information about the Traffic Mirror target.
         */
        fun description(description: String): FluentBuilder
        /**
         * The network interface ID that is attached to the target.
         */
        fun networkInterfaceId(networkInterfaceId: String): FluentBuilder
        /**
         * The Amazon Resource Name (ARN) of the Network Load Balancer.
         */
        fun networkLoadBalancerArn(networkLoadBalancerArn: String): FluentBuilder
        /**
         * The ID of the account that owns the Traffic Mirror target.
         */
        fun ownerId(ownerId: String): FluentBuilder
        /**
         * The tags assigned to the Traffic Mirror target.
         */
        fun tags(tags: List<Tag>): FluentBuilder
        /**
         * The ID of the Traffic Mirror target.
         */
        fun trafficMirrorTargetId(trafficMirrorTargetId: String): FluentBuilder
        /**
         * The type of Traffic Mirror target.
         */
        fun type(type: TrafficMirrorTargetType): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the Traffic Mirror target.
         */
        var description: String?
        /**
         * The network interface ID that is attached to the target.
         */
        var networkInterfaceId: String?
        /**
         * The Amazon Resource Name (ARN) of the Network Load Balancer.
         */
        var networkLoadBalancerArn: String?
        /**
         * The ID of the account that owns the Traffic Mirror target.
         */
        var ownerId: String?
        /**
         * The tags assigned to the Traffic Mirror target.
         */
        var tags: List<Tag>?
        /**
         * The ID of the Traffic Mirror target.
         */
        var trafficMirrorTargetId: String?
        /**
         * The type of Traffic Mirror target.
         */
        var type: TrafficMirrorTargetType?

        fun build(): TrafficMirrorTarget
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var description: String? = null
        override var networkInterfaceId: String? = null
        override var networkLoadBalancerArn: String? = null
        override var ownerId: String? = null
        override var tags: List<Tag>? = null
        override var trafficMirrorTargetId: String? = null
        override var type: TrafficMirrorTargetType? = null

        constructor(x: TrafficMirrorTarget) : this() {
            this.description = x.description
            this.networkInterfaceId = x.networkInterfaceId
            this.networkLoadBalancerArn = x.networkLoadBalancerArn
            this.ownerId = x.ownerId
            this.tags = x.tags
            this.trafficMirrorTargetId = x.trafficMirrorTargetId
            this.type = x.type
        }

        override fun build(): TrafficMirrorTarget = TrafficMirrorTarget(this)
        override fun description(description: String): FluentBuilder = apply { this.description = description }
        override fun networkInterfaceId(networkInterfaceId: String): FluentBuilder = apply { this.networkInterfaceId = networkInterfaceId }
        override fun networkLoadBalancerArn(networkLoadBalancerArn: String): FluentBuilder = apply { this.networkLoadBalancerArn = networkLoadBalancerArn }
        override fun ownerId(ownerId: String): FluentBuilder = apply { this.ownerId = ownerId }
        override fun tags(tags: List<Tag>): FluentBuilder = apply { this.tags = tags }
        override fun trafficMirrorTargetId(trafficMirrorTargetId: String): FluentBuilder = apply { this.trafficMirrorTargetId = trafficMirrorTargetId }
        override fun type(type: TrafficMirrorTargetType): FluentBuilder = apply { this.type = type }
    }
}
