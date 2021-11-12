// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateNatGatewayResponse private constructor(builder: BuilderImpl) {
    /**
     * Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client token was provided in the request.
     */
    val clientToken: String? = builder.clientToken
    /**
     * Information about the NAT gateway.
     */
    val natGateway: NatGateway? = builder.natGateway

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CreateNatGatewayResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CreateNatGatewayResponse(")
        append("clientToken=$clientToken,")
        append("natGateway=$natGateway)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (natGateway?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CreateNatGatewayResponse

        if (clientToken != other.clientToken) return false
        if (natGateway != other.natGateway) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CreateNatGatewayResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CreateNatGatewayResponse
        /**
         * Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client token was provided in the request.
         */
        fun clientToken(clientToken: String): FluentBuilder
        /**
         * Information about the NAT gateway.
         */
        fun natGateway(natGateway: NatGateway): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client token was provided in the request.
         */
        var clientToken: String?
        /**
         * Information about the NAT gateway.
         */
        var natGateway: NatGateway?

        fun build(): CreateNatGatewayResponse
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.NatGateway] inside the given [block]
         */
        fun natGateway(block: NatGateway.DslBuilder.() -> kotlin.Unit) {
            this.natGateway = NatGateway.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var clientToken: String? = null
        override var natGateway: NatGateway? = null

        constructor(x: CreateNatGatewayResponse) : this() {
            this.clientToken = x.clientToken
            this.natGateway = x.natGateway
        }

        override fun build(): CreateNatGatewayResponse = CreateNatGatewayResponse(this)
        override fun clientToken(clientToken: String): FluentBuilder = apply { this.clientToken = clientToken }
        override fun natGateway(natGateway: NatGateway): FluentBuilder = apply { this.natGateway = natGateway }
    }
}
