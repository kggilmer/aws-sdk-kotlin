// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Information about a Capacity Reservation in a Capacity Reservation Fleet.
 */
class FleetCapacityReservation private constructor(builder: BuilderImpl) {
    /**
     * The Availability Zone in which the Capacity Reservation reserves capacity.
     */
    val availabilityZone: String? = builder.availabilityZone
    /**
     * The ID of the Availability Zone in which the Capacity Reservation reserves capacity.
     */
    val availabilityZoneId: String? = builder.availabilityZoneId
    /**
     * The ID of the Capacity Reservation.
     */
    val capacityReservationId: String? = builder.capacityReservationId
    /**
     * The date and time at which the Capacity Reservation was created.
     */
    val createDate: Instant? = builder.createDate
    /**
     * Indicates whether the Capacity Reservation reserves capacity for EBS-optimized instance types.
     */
    val ebsOptimized: Boolean? = builder.ebsOptimized
    /**
     * The number of capacity units fulfilled by the Capacity Reservation. For more information, see
     * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">
     * Total target capacity in the Amazon EC2 User Guide.
     */
    val fulfilledCapacity: Double? = builder.fulfilledCapacity
    /**
     * The type of operating system for which the Capacity Reservation reserves capacity.
     */
    val instancePlatform: CapacityReservationInstancePlatform? = builder.instancePlatform
    /**
     * The instance type for which the Capacity Reservation reserves capacity.
     */
    val instanceType: InstanceType? = builder.instanceType
    /**
     * The priority of the instance type in the Capacity Reservation Fleet. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority">
     * Instance type priority in the Amazon EC2 User Guide.
     */
    val priority: Int? = builder.priority
    /**
     * The total number of instances for which the Capacity Reservation reserves capacity.
     */
    val totalInstanceCount: Int? = builder.totalInstanceCount
    /**
     * The weight of the instance type in the Capacity Reservation Fleet. For more information,
     * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-weight">
     * Instance type weight in the Amazon EC2 User Guide.
     */
    val weight: Double? = builder.weight

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): FleetCapacityReservation = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("FleetCapacityReservation(")
        append("availabilityZone=$availabilityZone,")
        append("availabilityZoneId=$availabilityZoneId,")
        append("capacityReservationId=$capacityReservationId,")
        append("createDate=$createDate,")
        append("ebsOptimized=$ebsOptimized,")
        append("fulfilledCapacity=$fulfilledCapacity,")
        append("instancePlatform=$instancePlatform,")
        append("instanceType=$instanceType,")
        append("priority=$priority,")
        append("totalInstanceCount=$totalInstanceCount,")
        append("weight=$weight)")
    }

    override fun hashCode(): kotlin.Int {
        var result = availabilityZone?.hashCode() ?: 0
        result = 31 * result + (availabilityZoneId?.hashCode() ?: 0)
        result = 31 * result + (capacityReservationId?.hashCode() ?: 0)
        result = 31 * result + (createDate?.hashCode() ?: 0)
        result = 31 * result + (ebsOptimized?.hashCode() ?: 0)
        result = 31 * result + (fulfilledCapacity?.hashCode() ?: 0)
        result = 31 * result + (instancePlatform?.hashCode() ?: 0)
        result = 31 * result + (instanceType?.hashCode() ?: 0)
        result = 31 * result + (priority ?: 0)
        result = 31 * result + (totalInstanceCount ?: 0)
        result = 31 * result + (weight?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FleetCapacityReservation

        if (availabilityZone != other.availabilityZone) return false
        if (availabilityZoneId != other.availabilityZoneId) return false
        if (capacityReservationId != other.capacityReservationId) return false
        if (createDate != other.createDate) return false
        if (ebsOptimized != other.ebsOptimized) return false
        if (fulfilledCapacity != other.fulfilledCapacity) return false
        if (instancePlatform != other.instancePlatform) return false
        if (instanceType != other.instanceType) return false
        if (priority != other.priority) return false
        if (totalInstanceCount != other.totalInstanceCount) return false
        if (weight != other.weight) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): FleetCapacityReservation = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): FleetCapacityReservation
        /**
         * The Availability Zone in which the Capacity Reservation reserves capacity.
         */
        fun availabilityZone(availabilityZone: String): FluentBuilder
        /**
         * The ID of the Availability Zone in which the Capacity Reservation reserves capacity.
         */
        fun availabilityZoneId(availabilityZoneId: String): FluentBuilder
        /**
         * The ID of the Capacity Reservation.
         */
        fun capacityReservationId(capacityReservationId: String): FluentBuilder
        /**
         * The date and time at which the Capacity Reservation was created.
         */
        fun createDate(createDate: Instant): FluentBuilder
        /**
         * Indicates whether the Capacity Reservation reserves capacity for EBS-optimized instance types.
         */
        fun ebsOptimized(ebsOptimized: Boolean): FluentBuilder
        /**
         * The number of capacity units fulfilled by the Capacity Reservation. For more information, see
         * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">
         * Total target capacity in the Amazon EC2 User Guide.
         */
        fun fulfilledCapacity(fulfilledCapacity: Double): FluentBuilder
        /**
         * The type of operating system for which the Capacity Reservation reserves capacity.
         */
        fun instancePlatform(instancePlatform: CapacityReservationInstancePlatform): FluentBuilder
        /**
         * The instance type for which the Capacity Reservation reserves capacity.
         */
        fun instanceType(instanceType: InstanceType): FluentBuilder
        /**
         * The priority of the instance type in the Capacity Reservation Fleet. For more information,
         * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority">
         * Instance type priority in the Amazon EC2 User Guide.
         */
        fun priority(priority: Int): FluentBuilder
        /**
         * The total number of instances for which the Capacity Reservation reserves capacity.
         */
        fun totalInstanceCount(totalInstanceCount: Int): FluentBuilder
        /**
         * The weight of the instance type in the Capacity Reservation Fleet. For more information,
         * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-weight">
         * Instance type weight in the Amazon EC2 User Guide.
         */
        fun weight(weight: Double): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The Availability Zone in which the Capacity Reservation reserves capacity.
         */
        var availabilityZone: String?
        /**
         * The ID of the Availability Zone in which the Capacity Reservation reserves capacity.
         */
        var availabilityZoneId: String?
        /**
         * The ID of the Capacity Reservation.
         */
        var capacityReservationId: String?
        /**
         * The date and time at which the Capacity Reservation was created.
         */
        var createDate: Instant?
        /**
         * Indicates whether the Capacity Reservation reserves capacity for EBS-optimized instance types.
         */
        var ebsOptimized: Boolean?
        /**
         * The number of capacity units fulfilled by the Capacity Reservation. For more information, see
         * <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#target-capacity">
         * Total target capacity in the Amazon EC2 User Guide.
         */
        var fulfilledCapacity: Double?
        /**
         * The type of operating system for which the Capacity Reservation reserves capacity.
         */
        var instancePlatform: CapacityReservationInstancePlatform?
        /**
         * The instance type for which the Capacity Reservation reserves capacity.
         */
        var instanceType: InstanceType?
        /**
         * The priority of the instance type in the Capacity Reservation Fleet. For more information,
         * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-priority">
         * Instance type priority in the Amazon EC2 User Guide.
         */
        var priority: Int?
        /**
         * The total number of instances for which the Capacity Reservation reserves capacity.
         */
        var totalInstanceCount: Int?
        /**
         * The weight of the instance type in the Capacity Reservation Fleet. For more information,
         * see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/crfleet-concepts.html#instance-weight">
         * Instance type weight in the Amazon EC2 User Guide.
         */
        var weight: Double?

        fun build(): FleetCapacityReservation
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var availabilityZone: String? = null
        override var availabilityZoneId: String? = null
        override var capacityReservationId: String? = null
        override var createDate: Instant? = null
        override var ebsOptimized: Boolean? = null
        override var fulfilledCapacity: Double? = null
        override var instancePlatform: CapacityReservationInstancePlatform? = null
        override var instanceType: InstanceType? = null
        override var priority: Int? = null
        override var totalInstanceCount: Int? = null
        override var weight: Double? = null

        constructor(x: FleetCapacityReservation) : this() {
            this.availabilityZone = x.availabilityZone
            this.availabilityZoneId = x.availabilityZoneId
            this.capacityReservationId = x.capacityReservationId
            this.createDate = x.createDate
            this.ebsOptimized = x.ebsOptimized
            this.fulfilledCapacity = x.fulfilledCapacity
            this.instancePlatform = x.instancePlatform
            this.instanceType = x.instanceType
            this.priority = x.priority
            this.totalInstanceCount = x.totalInstanceCount
            this.weight = x.weight
        }

        override fun build(): FleetCapacityReservation = FleetCapacityReservation(this)
        override fun availabilityZone(availabilityZone: String): FluentBuilder = apply { this.availabilityZone = availabilityZone }
        override fun availabilityZoneId(availabilityZoneId: String): FluentBuilder = apply { this.availabilityZoneId = availabilityZoneId }
        override fun capacityReservationId(capacityReservationId: String): FluentBuilder = apply { this.capacityReservationId = capacityReservationId }
        override fun createDate(createDate: Instant): FluentBuilder = apply { this.createDate = createDate }
        override fun ebsOptimized(ebsOptimized: Boolean): FluentBuilder = apply { this.ebsOptimized = ebsOptimized }
        override fun fulfilledCapacity(fulfilledCapacity: Double): FluentBuilder = apply { this.fulfilledCapacity = fulfilledCapacity }
        override fun instancePlatform(instancePlatform: CapacityReservationInstancePlatform): FluentBuilder = apply { this.instancePlatform = instancePlatform }
        override fun instanceType(instanceType: InstanceType): FluentBuilder = apply { this.instanceType = instanceType }
        override fun priority(priority: Int): FluentBuilder = apply { this.priority = priority }
        override fun totalInstanceCount(totalInstanceCount: Int): FluentBuilder = apply { this.totalInstanceCount = totalInstanceCount }
        override fun weight(weight: Double): FluentBuilder = apply { this.weight = weight }
    }
}
