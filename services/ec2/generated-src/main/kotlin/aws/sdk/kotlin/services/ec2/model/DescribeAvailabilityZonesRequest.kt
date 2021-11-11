// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeAvailabilityZonesRequest private constructor(builder: BuilderImpl) {
    /**
     * Include all Availability Zones, Local Zones, and Wavelength Zones regardless of your
     * opt-in status.
     * If you do not use this parameter, the results include only the zones for the Regions where you have chosen the option to opt in.
     */
    val allAvailabilityZones: Boolean? = builder.allAvailabilityZones
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The filters.
     * group-name - For Availability Zones, use the Region name. For Local
     * Zones, use the name of the group associated with the Local Zone (for example,
     * us-west-2-lax-1) For Wavelength Zones, use the name of the group associated
     * with the Wavelength Zone (for example, us-east-1-wl1-bos-wlz-1).
     * message - The Zone message.
     * opt-in-status - The opt-in status (opted-in, and
     * not-opted-in | opt-in-not-required).
     * parent-zoneID - The ID of the zone that handles some of the Local Zone
     * and Wavelength Zone control plane operations, such as API calls.
     * parent-zoneName - The ID of the zone that handles some of the Local Zone
     * and Wavelength Zone control plane operations, such as API calls.
     * region-name - The name of the Region for the Zone (for example,
     * us-east-1).
     * state - The state of the Availability Zone, the Local Zone, or the
     * Wavelength Zone (available | information | impaired
     * | unavailable).
     * zone-id - The ID of the Availability Zone (for example,
     * use1-az1), the Local Zone (for example, usw2-lax1-az1), or the
     * Wavelength Zone (for example, us-east-1-wl1-bos-wlz-1).
     * zone-type - The type of zone, for example, local-zone.
     * zone-name - The name of the Availability Zone (for example,
     * us-east-1a), the Local Zone (for example, us-west-2-lax-1a), or
     * the Wavelength Zone (for example, us-east-1-wl1-bos-wlz-1).
     * zone-type - The type of zone, for example, local-zone.
     */
    val filters: List<Filter>? = builder.filters
    /**
     * The IDs of the Availability Zones, Local Zones, and Wavelength Zones.
     */
    val zoneIds: List<String>? = builder.zoneIds
    /**
     * The names of the Availability Zones, Local Zones, and Wavelength Zones.
     */
    val zoneNames: List<String>? = builder.zoneNames

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeAvailabilityZonesRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeAvailabilityZonesRequest(")
        append("allAvailabilityZones=$allAvailabilityZones,")
        append("dryRun=$dryRun,")
        append("filters=$filters,")
        append("zoneIds=$zoneIds,")
        append("zoneNames=$zoneNames)")
    }

    override fun hashCode(): kotlin.Int {
        var result = allAvailabilityZones?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (filters?.hashCode() ?: 0)
        result = 31 * result + (zoneIds?.hashCode() ?: 0)
        result = 31 * result + (zoneNames?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeAvailabilityZonesRequest

        if (allAvailabilityZones != other.allAvailabilityZones) return false
        if (dryRun != other.dryRun) return false
        if (filters != other.filters) return false
        if (zoneIds != other.zoneIds) return false
        if (zoneNames != other.zoneNames) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeAvailabilityZonesRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeAvailabilityZonesRequest
        /**
         * Include all Availability Zones, Local Zones, and Wavelength Zones regardless of your
         * opt-in status.
         * If you do not use this parameter, the results include only the zones for the Regions where you have chosen the option to opt in.
         */
        fun allAvailabilityZones(allAvailabilityZones: Boolean): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The filters.
         * group-name - For Availability Zones, use the Region name. For Local
         * Zones, use the name of the group associated with the Local Zone (for example,
         * us-west-2-lax-1) For Wavelength Zones, use the name of the group associated
         * with the Wavelength Zone (for example, us-east-1-wl1-bos-wlz-1).
         * message - The Zone message.
         * opt-in-status - The opt-in status (opted-in, and
         * not-opted-in | opt-in-not-required).
         * parent-zoneID - The ID of the zone that handles some of the Local Zone
         * and Wavelength Zone control plane operations, such as API calls.
         * parent-zoneName - The ID of the zone that handles some of the Local Zone
         * and Wavelength Zone control plane operations, such as API calls.
         * region-name - The name of the Region for the Zone (for example,
         * us-east-1).
         * state - The state of the Availability Zone, the Local Zone, or the
         * Wavelength Zone (available | information | impaired
         * | unavailable).
         * zone-id - The ID of the Availability Zone (for example,
         * use1-az1), the Local Zone (for example, usw2-lax1-az1), or the
         * Wavelength Zone (for example, us-east-1-wl1-bos-wlz-1).
         * zone-type - The type of zone, for example, local-zone.
         * zone-name - The name of the Availability Zone (for example,
         * us-east-1a), the Local Zone (for example, us-west-2-lax-1a), or
         * the Wavelength Zone (for example, us-east-1-wl1-bos-wlz-1).
         * zone-type - The type of zone, for example, local-zone.
         */
        fun filters(filters: List<Filter>): FluentBuilder
        /**
         * The IDs of the Availability Zones, Local Zones, and Wavelength Zones.
         */
        fun zoneIds(zoneIds: List<String>): FluentBuilder
        /**
         * The names of the Availability Zones, Local Zones, and Wavelength Zones.
         */
        fun zoneNames(zoneNames: List<String>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Include all Availability Zones, Local Zones, and Wavelength Zones regardless of your
         * opt-in status.
         * If you do not use this parameter, the results include only the zones for the Regions where you have chosen the option to opt in.
         */
        var allAvailabilityZones: Boolean?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The filters.
         * group-name - For Availability Zones, use the Region name. For Local
         * Zones, use the name of the group associated with the Local Zone (for example,
         * us-west-2-lax-1) For Wavelength Zones, use the name of the group associated
         * with the Wavelength Zone (for example, us-east-1-wl1-bos-wlz-1).
         * message - The Zone message.
         * opt-in-status - The opt-in status (opted-in, and
         * not-opted-in | opt-in-not-required).
         * parent-zoneID - The ID of the zone that handles some of the Local Zone
         * and Wavelength Zone control plane operations, such as API calls.
         * parent-zoneName - The ID of the zone that handles some of the Local Zone
         * and Wavelength Zone control plane operations, such as API calls.
         * region-name - The name of the Region for the Zone (for example,
         * us-east-1).
         * state - The state of the Availability Zone, the Local Zone, or the
         * Wavelength Zone (available | information | impaired
         * | unavailable).
         * zone-id - The ID of the Availability Zone (for example,
         * use1-az1), the Local Zone (for example, usw2-lax1-az1), or the
         * Wavelength Zone (for example, us-east-1-wl1-bos-wlz-1).
         * zone-type - The type of zone, for example, local-zone.
         * zone-name - The name of the Availability Zone (for example,
         * us-east-1a), the Local Zone (for example, us-west-2-lax-1a), or
         * the Wavelength Zone (for example, us-east-1-wl1-bos-wlz-1).
         * zone-type - The type of zone, for example, local-zone.
         */
        var filters: List<Filter>?
        /**
         * The IDs of the Availability Zones, Local Zones, and Wavelength Zones.
         */
        var zoneIds: List<String>?
        /**
         * The names of the Availability Zones, Local Zones, and Wavelength Zones.
         */
        var zoneNames: List<String>?

        fun build(): DescribeAvailabilityZonesRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var allAvailabilityZones: Boolean? = null
        override var dryRun: Boolean? = null
        override var filters: List<Filter>? = null
        override var zoneIds: List<String>? = null
        override var zoneNames: List<String>? = null

        constructor(x: DescribeAvailabilityZonesRequest) : this() {
            this.allAvailabilityZones = x.allAvailabilityZones
            this.dryRun = x.dryRun
            this.filters = x.filters
            this.zoneIds = x.zoneIds
            this.zoneNames = x.zoneNames
        }

        override fun build(): DescribeAvailabilityZonesRequest = DescribeAvailabilityZonesRequest(this)
        override fun allAvailabilityZones(allAvailabilityZones: Boolean): FluentBuilder = apply { this.allAvailabilityZones = allAvailabilityZones }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun filters(filters: List<Filter>): FluentBuilder = apply { this.filters = filters }
        override fun zoneIds(zoneIds: List<String>): FluentBuilder = apply { this.zoneIds = zoneIds }
        override fun zoneNames(zoneNames: List<String>): FluentBuilder = apply { this.zoneNames = zoneNames }
    }
}
