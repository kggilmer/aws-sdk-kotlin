// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ReplaceRouteTableAssociationResponse private constructor(builder: BuilderImpl) {
    /**
     * The state of the association.
     */
    val associationState: RouteTableAssociationState? = builder.associationState
    /**
     * The ID of the new association.
     */
    val newAssociationId: String? = builder.newAssociationId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ReplaceRouteTableAssociationResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ReplaceRouteTableAssociationResponse(")
        append("associationState=$associationState,")
        append("newAssociationId=$newAssociationId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = associationState?.hashCode() ?: 0
        result = 31 * result + (newAssociationId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ReplaceRouteTableAssociationResponse

        if (associationState != other.associationState) return false
        if (newAssociationId != other.newAssociationId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ReplaceRouteTableAssociationResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ReplaceRouteTableAssociationResponse
        /**
         * The state of the association.
         */
        fun associationState(associationState: RouteTableAssociationState): FluentBuilder
        /**
         * The ID of the new association.
         */
        fun newAssociationId(newAssociationId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The state of the association.
         */
        var associationState: RouteTableAssociationState?
        /**
         * The ID of the new association.
         */
        var newAssociationId: String?

        fun build(): ReplaceRouteTableAssociationResponse
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.RouteTableAssociationState] inside the given [block]
         */
        fun associationState(block: RouteTableAssociationState.DslBuilder.() -> kotlin.Unit) {
            this.associationState = RouteTableAssociationState.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var associationState: RouteTableAssociationState? = null
        override var newAssociationId: String? = null

        constructor(x: ReplaceRouteTableAssociationResponse) : this() {
            this.associationState = x.associationState
            this.newAssociationId = x.newAssociationId
        }

        override fun build(): ReplaceRouteTableAssociationResponse = ReplaceRouteTableAssociationResponse(this)
        override fun associationState(associationState: RouteTableAssociationState): FluentBuilder = apply { this.associationState = associationState }
        override fun newAssociationId(newAssociationId: String): FluentBuilder = apply { this.newAssociationId = newAssociationId }
    }
}
