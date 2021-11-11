// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output of DescribeReservedInstancesOfferings.
 */
class DescribeReservedInstancesOfferingsResponse private constructor(builder: BuilderImpl) {
    /**
     * The token to use to retrieve the next page of results. This value is null when
     * there are no more results to return.
     */
    val nextToken: String? = builder.nextToken
    /**
     * A list of Reserved Instances offerings.
     */
    val reservedInstancesOfferings: List<ReservedInstancesOffering>? = builder.reservedInstancesOfferings

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeReservedInstancesOfferingsResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeReservedInstancesOfferingsResponse(")
        append("nextToken=$nextToken,")
        append("reservedInstancesOfferings=$reservedInstancesOfferings)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (reservedInstancesOfferings?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeReservedInstancesOfferingsResponse

        if (nextToken != other.nextToken) return false
        if (reservedInstancesOfferings != other.reservedInstancesOfferings) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeReservedInstancesOfferingsResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeReservedInstancesOfferingsResponse
        /**
         * The token to use to retrieve the next page of results. This value is null when
         * there are no more results to return.
         */
        fun nextToken(nextToken: String): FluentBuilder
        /**
         * A list of Reserved Instances offerings.
         */
        fun reservedInstancesOfferings(reservedInstancesOfferings: List<ReservedInstancesOffering>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The token to use to retrieve the next page of results. This value is null when
         * there are no more results to return.
         */
        var nextToken: String?
        /**
         * A list of Reserved Instances offerings.
         */
        var reservedInstancesOfferings: List<ReservedInstancesOffering>?

        fun build(): DescribeReservedInstancesOfferingsResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var nextToken: String? = null
        override var reservedInstancesOfferings: List<ReservedInstancesOffering>? = null

        constructor(x: DescribeReservedInstancesOfferingsResponse) : this() {
            this.nextToken = x.nextToken
            this.reservedInstancesOfferings = x.reservedInstancesOfferings
        }

        override fun build(): DescribeReservedInstancesOfferingsResponse = DescribeReservedInstancesOfferingsResponse(this)
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
        override fun reservedInstancesOfferings(reservedInstancesOfferings: List<ReservedInstancesOffering>): FluentBuilder = apply { this.reservedInstancesOfferings = reservedInstancesOfferings }
    }
}
