// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents one of the following:
 * A new replica to be added to an existing regional table or global table. This
 * request invokes the CreateTableReplica action in the destination
 * Region.
 * New parameters for an existing replica. This request invokes the
 * UpdateTable action in the destination Region.
 * An existing replica to be deleted. The request invokes the
 * DeleteTableReplica action in the destination Region, deleting the
 * replica and all if its items in the destination Region.
 */
class ReplicationGroupUpdate private constructor(builder: BuilderImpl) {
    /**
     * The parameters required for creating a replica for the table.
     */
    val create: CreateReplicationGroupMemberAction? = builder.create
    /**
     * The parameters required for deleting a replica for the table.
     */
    val delete: DeleteReplicationGroupMemberAction? = builder.delete
    /**
     * The parameters required for updating a replica for the table.
     */
    val update: UpdateReplicationGroupMemberAction? = builder.update

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ReplicationGroupUpdate = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ReplicationGroupUpdate(")
        append("create=$create,")
        append("delete=$delete,")
        append("update=$update)")
    }

    override fun hashCode(): kotlin.Int {
        var result = create?.hashCode() ?: 0
        result = 31 * result + (delete?.hashCode() ?: 0)
        result = 31 * result + (update?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ReplicationGroupUpdate

        if (create != other.create) return false
        if (delete != other.delete) return false
        if (update != other.update) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ReplicationGroupUpdate = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ReplicationGroupUpdate
        /**
         * The parameters required for creating a replica for the table.
         */
        fun create(create: CreateReplicationGroupMemberAction): FluentBuilder
        /**
         * The parameters required for deleting a replica for the table.
         */
        fun delete(delete: DeleteReplicationGroupMemberAction): FluentBuilder
        /**
         * The parameters required for updating a replica for the table.
         */
        fun update(update: UpdateReplicationGroupMemberAction): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The parameters required for creating a replica for the table.
         */
        var create: CreateReplicationGroupMemberAction?
        /**
         * The parameters required for deleting a replica for the table.
         */
        var delete: DeleteReplicationGroupMemberAction?
        /**
         * The parameters required for updating a replica for the table.
         */
        var update: UpdateReplicationGroupMemberAction?

        fun build(): ReplicationGroupUpdate
        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.CreateReplicationGroupMemberAction] inside the given [block]
         */
        fun create(block: CreateReplicationGroupMemberAction.DslBuilder.() -> kotlin.Unit) {
            this.create = CreateReplicationGroupMemberAction.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.DeleteReplicationGroupMemberAction] inside the given [block]
         */
        fun delete(block: DeleteReplicationGroupMemberAction.DslBuilder.() -> kotlin.Unit) {
            this.delete = DeleteReplicationGroupMemberAction.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.dynamodb.model.UpdateReplicationGroupMemberAction] inside the given [block]
         */
        fun update(block: UpdateReplicationGroupMemberAction.DslBuilder.() -> kotlin.Unit) {
            this.update = UpdateReplicationGroupMemberAction.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var create: CreateReplicationGroupMemberAction? = null
        override var delete: DeleteReplicationGroupMemberAction? = null
        override var update: UpdateReplicationGroupMemberAction? = null

        constructor(x: ReplicationGroupUpdate) : this() {
            this.create = x.create
            this.delete = x.delete
            this.update = x.update
        }

        override fun build(): ReplicationGroupUpdate = ReplicationGroupUpdate(this)
        override fun create(create: CreateReplicationGroupMemberAction): FluentBuilder = apply { this.create = create }
        override fun delete(delete: DeleteReplicationGroupMemberAction): FluentBuilder = apply { this.delete = delete }
        override fun update(update: UpdateReplicationGroupMemberAction): FluentBuilder = apply { this.update = update }
    }
}
