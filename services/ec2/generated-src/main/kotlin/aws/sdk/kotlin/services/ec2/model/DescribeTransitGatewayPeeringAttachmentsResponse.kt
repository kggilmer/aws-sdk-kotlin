// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeTransitGatewayPeeringAttachmentsResponse private constructor(builder: BuilderImpl) {
    /**
     * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
     */
    val nextToken: String? = builder.nextToken
    /**
     * The transit gateway peering attachments.
     */
    val transitGatewayPeeringAttachments: List<TransitGatewayPeeringAttachment>? = builder.transitGatewayPeeringAttachments

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeTransitGatewayPeeringAttachmentsResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeTransitGatewayPeeringAttachmentsResponse(")
        append("nextToken=$nextToken,")
        append("transitGatewayPeeringAttachments=$transitGatewayPeeringAttachments)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (transitGatewayPeeringAttachments?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeTransitGatewayPeeringAttachmentsResponse

        if (nextToken != other.nextToken) return false
        if (transitGatewayPeeringAttachments != other.transitGatewayPeeringAttachments) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeTransitGatewayPeeringAttachmentsResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeTransitGatewayPeeringAttachmentsResponse
        /**
         * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
         */
        fun nextToken(nextToken: String): FluentBuilder
        /**
         * The transit gateway peering attachments.
         */
        fun transitGatewayPeeringAttachments(transitGatewayPeeringAttachments: List<TransitGatewayPeeringAttachment>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
         */
        var nextToken: String?
        /**
         * The transit gateway peering attachments.
         */
        var transitGatewayPeeringAttachments: List<TransitGatewayPeeringAttachment>?

        fun build(): DescribeTransitGatewayPeeringAttachmentsResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var nextToken: String? = null
        override var transitGatewayPeeringAttachments: List<TransitGatewayPeeringAttachment>? = null

        constructor(x: DescribeTransitGatewayPeeringAttachmentsResponse) : this() {
            this.nextToken = x.nextToken
            this.transitGatewayPeeringAttachments = x.transitGatewayPeeringAttachments
        }

        override fun build(): DescribeTransitGatewayPeeringAttachmentsResponse = DescribeTransitGatewayPeeringAttachmentsResponse(this)
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
        override fun transitGatewayPeeringAttachments(transitGatewayPeeringAttachments: List<TransitGatewayPeeringAttachment>): FluentBuilder = apply { this.transitGatewayPeeringAttachments = transitGatewayPeeringAttachments }
    }
}
