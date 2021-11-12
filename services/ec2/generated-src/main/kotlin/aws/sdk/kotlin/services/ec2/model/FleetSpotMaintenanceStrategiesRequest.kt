// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The strategies for managing your Spot Instances that are at an elevated risk of being interrupted.
 */
class FleetSpotMaintenanceStrategiesRequest private constructor(builder: BuilderImpl) {
    /**
     * The strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an
     * elevated risk of being interrupted.
     */
    val capacityRebalance: FleetSpotCapacityRebalanceRequest? = builder.capacityRebalance

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): FleetSpotMaintenanceStrategiesRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("FleetSpotMaintenanceStrategiesRequest(")
        append("capacityRebalance=$capacityRebalance)")
    }

    override fun hashCode(): kotlin.Int {
        var result = capacityRebalance?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FleetSpotMaintenanceStrategiesRequest

        if (capacityRebalance != other.capacityRebalance) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): FleetSpotMaintenanceStrategiesRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): FleetSpotMaintenanceStrategiesRequest
        /**
         * The strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an
         * elevated risk of being interrupted.
         */
        fun capacityRebalance(capacityRebalance: FleetSpotCapacityRebalanceRequest): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The strategy to use when Amazon EC2 emits a signal that your Spot Instance is at an
         * elevated risk of being interrupted.
         */
        var capacityRebalance: FleetSpotCapacityRebalanceRequest?

        fun build(): FleetSpotMaintenanceStrategiesRequest
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.FleetSpotCapacityRebalanceRequest] inside the given [block]
         */
        fun capacityRebalance(block: FleetSpotCapacityRebalanceRequest.DslBuilder.() -> kotlin.Unit) {
            this.capacityRebalance = FleetSpotCapacityRebalanceRequest.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var capacityRebalance: FleetSpotCapacityRebalanceRequest? = null

        constructor(x: FleetSpotMaintenanceStrategiesRequest) : this() {
            this.capacityRebalance = x.capacityRebalance
        }

        override fun build(): FleetSpotMaintenanceStrategiesRequest = FleetSpotMaintenanceStrategiesRequest(this)
        override fun capacityRebalance(capacityRebalance: FleetSpotCapacityRebalanceRequest): FluentBuilder = apply { this.capacityRebalance = capacityRebalance }
    }
}
