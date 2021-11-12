// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * The instance types offered.
 */
class InstanceTypeOffering private constructor(builder: BuilderImpl) {
    /**
     * The instance type. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types in the Amazon EC2 User Guide.
     */
    val instanceType: InstanceType? = builder.instanceType
    /**
     * The identifier for the location. This depends on the location type. For example, if the location type is
     * region, the location is the Region code (for example, us-east-2.)
     */
    val location: String? = builder.location
    /**
     * The location type.
     */
    val locationType: LocationType? = builder.locationType

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): InstanceTypeOffering = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("InstanceTypeOffering(")
        append("instanceType=$instanceType,")
        append("location=$location,")
        append("locationType=$locationType)")
    }

    override fun hashCode(): kotlin.Int {
        var result = instanceType?.hashCode() ?: 0
        result = 31 * result + (location?.hashCode() ?: 0)
        result = 31 * result + (locationType?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as InstanceTypeOffering

        if (instanceType != other.instanceType) return false
        if (location != other.location) return false
        if (locationType != other.locationType) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): InstanceTypeOffering = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): InstanceTypeOffering
        /**
         * The instance type. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types in the Amazon EC2 User Guide.
         */
        fun instanceType(instanceType: InstanceType): FluentBuilder
        /**
         * The identifier for the location. This depends on the location type. For example, if the location type is
         * region, the location is the Region code (for example, us-east-2.)
         */
        fun location(location: String): FluentBuilder
        /**
         * The location type.
         */
        fun locationType(locationType: LocationType): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The instance type. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance types in the Amazon EC2 User Guide.
         */
        var instanceType: InstanceType?
        /**
         * The identifier for the location. This depends on the location type. For example, if the location type is
         * region, the location is the Region code (for example, us-east-2.)
         */
        var location: String?
        /**
         * The location type.
         */
        var locationType: LocationType?

        fun build(): InstanceTypeOffering
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var instanceType: InstanceType? = null
        override var location: String? = null
        override var locationType: LocationType? = null

        constructor(x: InstanceTypeOffering) : this() {
            this.instanceType = x.instanceType
            this.location = x.location
            this.locationType = x.locationType
        }

        override fun build(): InstanceTypeOffering = InstanceTypeOffering(this)
        override fun instanceType(instanceType: InstanceType): FluentBuilder = apply { this.instanceType = instanceType }
        override fun location(location: String): FluentBuilder = apply { this.location = location }
        override fun locationType(locationType: LocationType): FluentBuilder = apply { this.locationType = locationType }
    }
}
