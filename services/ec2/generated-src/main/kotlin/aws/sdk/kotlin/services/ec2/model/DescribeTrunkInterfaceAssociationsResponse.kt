// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeTrunkInterfaceAssociationsResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about the trunk associations.
     */
    val interfaceAssociations: List<TrunkInterfaceAssociation>? = builder.interfaceAssociations
    /**
     * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
     */
    val nextToken: String? = builder.nextToken

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeTrunkInterfaceAssociationsResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeTrunkInterfaceAssociationsResponse(")
        append("interfaceAssociations=$interfaceAssociations,")
        append("nextToken=$nextToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = interfaceAssociations?.hashCode() ?: 0
        result = 31 * result + (nextToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeTrunkInterfaceAssociationsResponse

        if (interfaceAssociations != other.interfaceAssociations) return false
        if (nextToken != other.nextToken) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeTrunkInterfaceAssociationsResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeTrunkInterfaceAssociationsResponse
        /**
         * Information about the trunk associations.
         */
        fun interfaceAssociations(interfaceAssociations: List<TrunkInterfaceAssociation>): FluentBuilder
        /**
         * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
         */
        fun nextToken(nextToken: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the trunk associations.
         */
        var interfaceAssociations: List<TrunkInterfaceAssociation>?
        /**
         * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
         */
        var nextToken: String?

        fun build(): DescribeTrunkInterfaceAssociationsResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var interfaceAssociations: List<TrunkInterfaceAssociation>? = null
        override var nextToken: String? = null

        constructor(x: DescribeTrunkInterfaceAssociationsResponse) : this() {
            this.interfaceAssociations = x.interfaceAssociations
            this.nextToken = x.nextToken
        }

        override fun build(): DescribeTrunkInterfaceAssociationsResponse = DescribeTrunkInterfaceAssociationsResponse(this)
        override fun interfaceAssociations(interfaceAssociations: List<TrunkInterfaceAssociation>): FluentBuilder = apply { this.interfaceAssociations = interfaceAssociations }
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
    }
}
