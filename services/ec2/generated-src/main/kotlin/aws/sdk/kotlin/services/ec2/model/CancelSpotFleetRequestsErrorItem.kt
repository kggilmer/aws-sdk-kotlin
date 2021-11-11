// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a Spot Fleet request that was not successfully canceled.
 */
class CancelSpotFleetRequestsErrorItem private constructor(builder: BuilderImpl) {
    /**
     * The error.
     */
    val error: CancelSpotFleetRequestsError? = builder.error
    /**
     * The ID of the Spot Fleet request.
     */
    val spotFleetRequestId: String? = builder.spotFleetRequestId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CancelSpotFleetRequestsErrorItem = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CancelSpotFleetRequestsErrorItem(")
        append("error=$error,")
        append("spotFleetRequestId=$spotFleetRequestId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = error?.hashCode() ?: 0
        result = 31 * result + (spotFleetRequestId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CancelSpotFleetRequestsErrorItem

        if (error != other.error) return false
        if (spotFleetRequestId != other.spotFleetRequestId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CancelSpotFleetRequestsErrorItem = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CancelSpotFleetRequestsErrorItem
        /**
         * The error.
         */
        fun error(error: CancelSpotFleetRequestsError): FluentBuilder
        /**
         * The ID of the Spot Fleet request.
         */
        fun spotFleetRequestId(spotFleetRequestId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The error.
         */
        var error: CancelSpotFleetRequestsError?
        /**
         * The ID of the Spot Fleet request.
         */
        var spotFleetRequestId: String?

        fun build(): CancelSpotFleetRequestsErrorItem
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.CancelSpotFleetRequestsError] inside the given [block]
         */
        fun error(block: CancelSpotFleetRequestsError.DslBuilder.() -> kotlin.Unit) {
            this.error = CancelSpotFleetRequestsError.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var error: CancelSpotFleetRequestsError? = null
        override var spotFleetRequestId: String? = null

        constructor(x: CancelSpotFleetRequestsErrorItem) : this() {
            this.error = x.error
            this.spotFleetRequestId = x.spotFleetRequestId
        }

        override fun build(): CancelSpotFleetRequestsErrorItem = CancelSpotFleetRequestsErrorItem(this)
        override fun error(error: CancelSpotFleetRequestsError): FluentBuilder = apply { this.error = error }
        override fun spotFleetRequestId(spotFleetRequestId: String): FluentBuilder = apply { this.spotFleetRequestId = spotFleetRequestId }
    }
}
