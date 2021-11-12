// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyTransitGatewayVpcAttachmentResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about the modified attachment.
     */
    val transitGatewayVpcAttachment: TransitGatewayVpcAttachment? = builder.transitGatewayVpcAttachment

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ModifyTransitGatewayVpcAttachmentResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyTransitGatewayVpcAttachmentResponse(")
        append("transitGatewayVpcAttachment=$transitGatewayVpcAttachment)")
    }

    override fun hashCode(): kotlin.Int {
        var result = transitGatewayVpcAttachment?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ModifyTransitGatewayVpcAttachmentResponse

        if (transitGatewayVpcAttachment != other.transitGatewayVpcAttachment) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ModifyTransitGatewayVpcAttachmentResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ModifyTransitGatewayVpcAttachmentResponse
        /**
         * Information about the modified attachment.
         */
        fun transitGatewayVpcAttachment(transitGatewayVpcAttachment: TransitGatewayVpcAttachment): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the modified attachment.
         */
        var transitGatewayVpcAttachment: TransitGatewayVpcAttachment?

        fun build(): ModifyTransitGatewayVpcAttachmentResponse
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TransitGatewayVpcAttachment] inside the given [block]
         */
        fun transitGatewayVpcAttachment(block: TransitGatewayVpcAttachment.DslBuilder.() -> kotlin.Unit) {
            this.transitGatewayVpcAttachment = TransitGatewayVpcAttachment.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var transitGatewayVpcAttachment: TransitGatewayVpcAttachment? = null

        constructor(x: ModifyTransitGatewayVpcAttachmentResponse) : this() {
            this.transitGatewayVpcAttachment = x.transitGatewayVpcAttachment
        }

        override fun build(): ModifyTransitGatewayVpcAttachmentResponse = ModifyTransitGatewayVpcAttachmentResponse(this)
        override fun transitGatewayVpcAttachment(transitGatewayVpcAttachment: TransitGatewayVpcAttachment): FluentBuilder = apply { this.transitGatewayVpcAttachment = transitGatewayVpcAttachment }
    }
}
