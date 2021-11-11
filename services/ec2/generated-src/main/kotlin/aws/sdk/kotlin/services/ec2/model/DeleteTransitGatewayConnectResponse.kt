// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteTransitGatewayConnectResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about the deleted Connect attachment.
     */
    val transitGatewayConnect: TransitGatewayConnect? = builder.transitGatewayConnect

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DeleteTransitGatewayConnectResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteTransitGatewayConnectResponse(")
        append("transitGatewayConnect=$transitGatewayConnect)")
    }

    override fun hashCode(): kotlin.Int {
        var result = transitGatewayConnect?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DeleteTransitGatewayConnectResponse

        if (transitGatewayConnect != other.transitGatewayConnect) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DeleteTransitGatewayConnectResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DeleteTransitGatewayConnectResponse
        /**
         * Information about the deleted Connect attachment.
         */
        fun transitGatewayConnect(transitGatewayConnect: TransitGatewayConnect): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the deleted Connect attachment.
         */
        var transitGatewayConnect: TransitGatewayConnect?

        fun build(): DeleteTransitGatewayConnectResponse
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TransitGatewayConnect] inside the given [block]
         */
        fun transitGatewayConnect(block: TransitGatewayConnect.DslBuilder.() -> kotlin.Unit) {
            this.transitGatewayConnect = TransitGatewayConnect.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var transitGatewayConnect: TransitGatewayConnect? = null

        constructor(x: DeleteTransitGatewayConnectResponse) : this() {
            this.transitGatewayConnect = x.transitGatewayConnect
        }

        override fun build(): DeleteTransitGatewayConnectResponse = DeleteTransitGatewayConnectResponse(this)
        override fun transitGatewayConnect(transitGatewayConnect: TransitGatewayConnect): FluentBuilder = apply { this.transitGatewayConnect = transitGatewayConnect }
    }
}
