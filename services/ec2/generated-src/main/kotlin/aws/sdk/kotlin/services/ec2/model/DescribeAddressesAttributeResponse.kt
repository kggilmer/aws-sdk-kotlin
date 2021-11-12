// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeAddressesAttributeResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about the IP addresses.
     */
    val addresses: List<AddressAttribute>? = builder.addresses
    /**
     * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
     */
    val nextToken: String? = builder.nextToken

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeAddressesAttributeResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeAddressesAttributeResponse(")
        append("addresses=$addresses,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = addresses?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeAddressesAttributeResponse

        if (addresses != other.addresses) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeAddressesAttributeResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeAddressesAttributeResponse
        /**
         * Information about the IP addresses.
         */
        fun addresses(addresses: List<AddressAttribute>): FluentBuilder
        /**
         * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
         */
        fun nextToken(nextToken: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the IP addresses.
         */
        var addresses: List<AddressAttribute>?
        /**
         * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
         */
        var nextToken: String?

        fun build(): DescribeAddressesAttributeResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var addresses: List<AddressAttribute>? = null
        override var nextToken: String? = null

        constructor(x: DescribeAddressesAttributeResponse) : this() {
            this.addresses = x.addresses
            this.nextToken = x.nextToken
        }

        override fun build(): DescribeAddressesAttributeResponse = DescribeAddressesAttributeResponse(this)
        override fun addresses(addresses: List<AddressAttribute>): FluentBuilder = apply { this.addresses = addresses }
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
    }
}
