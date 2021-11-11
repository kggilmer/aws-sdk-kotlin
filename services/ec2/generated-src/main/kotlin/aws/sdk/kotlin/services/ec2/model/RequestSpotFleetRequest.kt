// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for RequestSpotFleet.
 */
class RequestSpotFleetRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually
     * making the request, and provides an error response. If you have the required
     * permissions, the error response is DryRunOperation. Otherwise, it is
     * UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The configuration for the Spot Fleet request.
     */
    val spotFleetRequestConfig: SpotFleetRequestConfigData? = builder.spotFleetRequestConfig

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): RequestSpotFleetRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("RequestSpotFleetRequest(")
        append("dryRun=$dryRun,")
        append("spotFleetRequestConfig=$spotFleetRequestConfig)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (spotFleetRequestConfig?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RequestSpotFleetRequest

        if (dryRun != other.dryRun) return false
        if (spotFleetRequestConfig != other.spotFleetRequestConfig) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): RequestSpotFleetRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): RequestSpotFleetRequest
        /**
         * Checks whether you have the required permissions for the action, without actually
         * making the request, and provides an error response. If you have the required
         * permissions, the error response is DryRunOperation. Otherwise, it is
         * UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The configuration for the Spot Fleet request.
         */
        fun spotFleetRequestConfig(spotFleetRequestConfig: SpotFleetRequestConfigData): FluentBuilder
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
         * The configuration for the Spot Fleet request.
         */
        var spotFleetRequestConfig: SpotFleetRequestConfigData?

        fun build(): RequestSpotFleetRequest
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.SpotFleetRequestConfigData] inside the given [block]
         */
        fun spotFleetRequestConfig(block: SpotFleetRequestConfigData.DslBuilder.() -> kotlin.Unit) {
            this.spotFleetRequestConfig = SpotFleetRequestConfigData.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var spotFleetRequestConfig: SpotFleetRequestConfigData? = null

        constructor(x: RequestSpotFleetRequest) : this() {
            this.dryRun = x.dryRun
            this.spotFleetRequestConfig = x.spotFleetRequestConfig
        }

        override fun build(): RequestSpotFleetRequest = RequestSpotFleetRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun spotFleetRequestConfig(spotFleetRequestConfig: SpotFleetRequestConfigData): FluentBuilder = apply { this.spotFleetRequestConfig = spotFleetRequestConfig }
    }
}
