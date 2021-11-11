// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



class UpdateGlobalTableResponse private constructor(builder: BuilderImpl) {
    /**
     * Contains the details of the global table.
     */
    val globalTableDescription: GlobalTableDescription? = builder.globalTableDescription

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): UpdateGlobalTableResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("UpdateGlobalTableResponse(")
        append("globalTableDescription=$globalTableDescription)")
    }

    override fun hashCode(): kotlin.Int {
        var result = globalTableDescription?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as UpdateGlobalTableResponse

        if (globalTableDescription != other.globalTableDescription) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): UpdateGlobalTableResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): UpdateGlobalTableResponse
        /**
         * Contains the details of the global table.
         */
        fun globalTableDescription(globalTableDescription: GlobalTableDescription): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Contains the details of the global table.
         */
        var globalTableDescription: GlobalTableDescription?

        fun build(): UpdateGlobalTableResponse
        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.GlobalTableDescription] inside the given [block]
         */
        fun globalTableDescription(block: GlobalTableDescription.DslBuilder.() -> kotlin.Unit) {
            this.globalTableDescription = GlobalTableDescription.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var globalTableDescription: GlobalTableDescription? = null

        constructor(x: UpdateGlobalTableResponse) : this() {
            this.globalTableDescription = x.globalTableDescription
        }

        override fun build(): UpdateGlobalTableResponse = UpdateGlobalTableResponse(this)
        override fun globalTableDescription(globalTableDescription: GlobalTableDescription): FluentBuilder = apply { this.globalTableDescription = globalTableDescription }
    }
}
