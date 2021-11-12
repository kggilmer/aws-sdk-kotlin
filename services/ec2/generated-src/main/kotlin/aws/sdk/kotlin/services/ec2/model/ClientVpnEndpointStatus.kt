// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the state of a Client VPN endpoint.
 */
class ClientVpnEndpointStatus private constructor(builder: BuilderImpl) {
    /**
     * The state of the Client VPN endpoint. Possible states include:
     * pending-associate - The Client VPN endpoint has been created but no target networks
     * have been associated. The Client VPN endpoint cannot accept connections.
     * available - The Client VPN endpoint has been created and a target network has been
     * associated. The Client VPN endpoint can accept connections.
     * deleting - The Client VPN endpoint is being deleted. The Client VPN endpoint cannot accept
     * connections.
     * deleted - The Client VPN endpoint has been deleted. The Client VPN endpoint cannot accept
     * connections.
     */
    val code: ClientVpnEndpointStatusCode? = builder.code
    /**
     * A message about the status of the Client VPN endpoint.
     */
    val message: String? = builder.message

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ClientVpnEndpointStatus = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ClientVpnEndpointStatus(")
        append("code=$code,")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = code?.hashCode() ?: 0
        result = 31 * result + (message?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ClientVpnEndpointStatus

        if (code != other.code) return false
        if (message != other.message) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ClientVpnEndpointStatus = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ClientVpnEndpointStatus
        /**
         * The state of the Client VPN endpoint. Possible states include:
         * pending-associate - The Client VPN endpoint has been created but no target networks
         * have been associated. The Client VPN endpoint cannot accept connections.
         * available - The Client VPN endpoint has been created and a target network has been
         * associated. The Client VPN endpoint can accept connections.
         * deleting - The Client VPN endpoint is being deleted. The Client VPN endpoint cannot accept
         * connections.
         * deleted - The Client VPN endpoint has been deleted. The Client VPN endpoint cannot accept
         * connections.
         */
        fun code(code: ClientVpnEndpointStatusCode): FluentBuilder
        /**
         * A message about the status of the Client VPN endpoint.
         */
        fun message(message: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The state of the Client VPN endpoint. Possible states include:
         * pending-associate - The Client VPN endpoint has been created but no target networks
         * have been associated. The Client VPN endpoint cannot accept connections.
         * available - The Client VPN endpoint has been created and a target network has been
         * associated. The Client VPN endpoint can accept connections.
         * deleting - The Client VPN endpoint is being deleted. The Client VPN endpoint cannot accept
         * connections.
         * deleted - The Client VPN endpoint has been deleted. The Client VPN endpoint cannot accept
         * connections.
         */
        var code: ClientVpnEndpointStatusCode?
        /**
         * A message about the status of the Client VPN endpoint.
         */
        var message: String?

        fun build(): ClientVpnEndpointStatus
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var code: ClientVpnEndpointStatusCode? = null
        override var message: String? = null

        constructor(x: ClientVpnEndpointStatus) : this() {
            this.code = x.code
            this.message = x.message
        }

        override fun build(): ClientVpnEndpointStatus = ClientVpnEndpointStatus(this)
        override fun code(code: ClientVpnEndpointStatusCode): FluentBuilder = apply { this.code = code }
        override fun message(message: String): FluentBuilder = apply { this.message = message }
    }
}
