// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for DisableVgwRoutePropagation.
 */
class DisableVgwRoutePropagationRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually
     * making the request, and provides an error response. If you have the required
     * permissions, the error response is DryRunOperation. Otherwise, it is
     * UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The ID of the virtual private gateway.
     */
    val gatewayId: String? = builder.gatewayId
    /**
     * The ID of the route table.
     */
    val routeTableId: String? = builder.routeTableId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DisableVgwRoutePropagationRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DisableVgwRoutePropagationRequest(")
        append("dryRun=$dryRun,")
        append("gatewayId=$gatewayId,")
        append("routeTableId=$routeTableId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (gatewayId?.hashCode() ?: 0)
        result = 31 * result + (routeTableId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DisableVgwRoutePropagationRequest

        if (dryRun != other.dryRun) return false
        if (gatewayId != other.gatewayId) return false
        if (routeTableId != other.routeTableId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DisableVgwRoutePropagationRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DisableVgwRoutePropagationRequest
        /**
         * Checks whether you have the required permissions for the action, without actually
         * making the request, and provides an error response. If you have the required
         * permissions, the error response is DryRunOperation. Otherwise, it is
         * UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The ID of the virtual private gateway.
         */
        fun gatewayId(gatewayId: String): FluentBuilder
        /**
         * The ID of the route table.
         */
        fun routeTableId(routeTableId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Checks whether you have the required permissions for the action, without actually
         * making the request, and provides an error response. If you have the required
         * permissions, the error response is DryRunOperation. Otherwise, it is
         * UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The ID of the virtual private gateway.
         */
        var gatewayId: String?
        /**
         * The ID of the route table.
         */
        var routeTableId: String?

        fun build(): DisableVgwRoutePropagationRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var gatewayId: String? = null
        override var routeTableId: String? = null

        constructor(x: DisableVgwRoutePropagationRequest) : this() {
            this.dryRun = x.dryRun
            this.gatewayId = x.gatewayId
            this.routeTableId = x.routeTableId
        }

        override fun build(): DisableVgwRoutePropagationRequest = DisableVgwRoutePropagationRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun gatewayId(gatewayId: String): FluentBuilder = apply { this.gatewayId = gatewayId }
        override fun routeTableId(routeTableId: String): FluentBuilder = apply { this.routeTableId = routeTableId }
    }
}
