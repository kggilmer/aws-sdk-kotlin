// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents one of the following:
 * A new replica to be added to an existing global table.
 * New parameters for an existing replica.
 * An existing replica to be removed from an existing global table.
 */
class ReplicaUpdate private constructor(builder: BuilderImpl) {
    /**
     * The parameters required for creating a replica on an existing global table.
     */
    val create: CreateReplicaAction? = builder.create
    /**
     * The name of the existing replica to be removed.
     */
    val delete: DeleteReplicaAction? = builder.delete

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ReplicaUpdate = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ReplicaUpdate(")
        append("create=$create,")
        append("delete=$delete)")
    }

    override fun hashCode(): kotlin.Int {
        var result = create?.hashCode() ?: 0
        result = 31 * result + (delete?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ReplicaUpdate

        if (create != other.create) return false
        if (delete != other.delete) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ReplicaUpdate = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ReplicaUpdate
        /**
         * The parameters required for creating a replica on an existing global table.
         */
        fun create(create: CreateReplicaAction): FluentBuilder
        /**
         * The name of the existing replica to be removed.
         */
        fun delete(delete: DeleteReplicaAction): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The parameters required for creating a replica on an existing global table.
         */
        var create: CreateReplicaAction?
        /**
         * The name of the existing replica to be removed.
         */
        var delete: DeleteReplicaAction?

        fun build(): ReplicaUpdate
        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.CreateReplicaAction] inside the given [block]
         */
        fun create(block: CreateReplicaAction.DslBuilder.() -> kotlin.Unit) {
            this.create = CreateReplicaAction.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.DeleteReplicaAction] inside the given [block]
         */
        fun delete(block: DeleteReplicaAction.DslBuilder.() -> kotlin.Unit) {
            this.delete = DeleteReplicaAction.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var create: CreateReplicaAction? = null
        override var delete: DeleteReplicaAction? = null

        constructor(x: ReplicaUpdate) : this() {
            this.create = x.create
            this.delete = x.delete
        }

        override fun build(): ReplicaUpdate = ReplicaUpdate(this)
        override fun create(create: CreateReplicaAction): FluentBuilder = apply { this.create = create }
        override fun delete(delete: DeleteReplicaAction): FluentBuilder = apply { this.delete = delete }
    }
}
