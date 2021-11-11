// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the output of DescribeReservedInstancesModifications.
 */
class DescribeReservedInstancesModificationsResponse private constructor(builder: BuilderImpl) {
    /**
     * The token to use to retrieve the next page of results. This value is null when
     * there are no more results to return.
     */
    val nextToken: String? = builder.nextToken
    /**
     * The Reserved Instance modification information.
     */
    val reservedInstancesModifications: List<ReservedInstancesModification>? = builder.reservedInstancesModifications

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeReservedInstancesModificationsResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeReservedInstancesModificationsResponse(")
        append("nextToken=$nextToken,")
        append("reservedInstancesModifications=$reservedInstancesModifications)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (reservedInstancesModifications?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeReservedInstancesModificationsResponse

        if (nextToken != other.nextToken) return false
        if (reservedInstancesModifications != other.reservedInstancesModifications) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeReservedInstancesModificationsResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeReservedInstancesModificationsResponse
        /**
         * The token to use to retrieve the next page of results. This value is null when
         * there are no more results to return.
         */
        fun nextToken(nextToken: String): FluentBuilder
        /**
         * The Reserved Instance modification information.
         */
        fun reservedInstancesModifications(reservedInstancesModifications: List<ReservedInstancesModification>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The token to use to retrieve the next page of results. This value is null when
         * there are no more results to return.
         */
        var nextToken: String?
        /**
         * The Reserved Instance modification information.
         */
        var reservedInstancesModifications: List<ReservedInstancesModification>?

        fun build(): DescribeReservedInstancesModificationsResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var nextToken: String? = null
        override var reservedInstancesModifications: List<ReservedInstancesModification>? = null

        constructor(x: DescribeReservedInstancesModificationsResponse) : this() {
            this.nextToken = x.nextToken
            this.reservedInstancesModifications = x.reservedInstancesModifications
        }

        override fun build(): DescribeReservedInstancesModificationsResponse = DescribeReservedInstancesModificationsResponse(this)
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
        override fun reservedInstancesModifications(reservedInstancesModifications: List<ReservedInstancesModification>): FluentBuilder = apply { this.reservedInstancesModifications = reservedInstancesModifications }
    }
}
