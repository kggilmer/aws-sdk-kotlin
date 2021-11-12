// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



class CreateBackupRequest private constructor(builder: BuilderImpl) {
    /**
     * Specified name for the backup.
     */
    val backupName: String? = builder.backupName
    /**
     * The name of the table.
     */
    val tableName: String? = builder.tableName

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CreateBackupRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CreateBackupRequest(")
        append("backupName=$backupName,")
        append("tableName=$tableName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = backupName?.hashCode() ?: 0
        result = 31 * result + (tableName?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CreateBackupRequest

        if (backupName != other.backupName) return false
        if (tableName != other.tableName) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CreateBackupRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CreateBackupRequest
        /**
         * Specified name for the backup.
         */
        fun backupName(backupName: String): FluentBuilder
        /**
         * The name of the table.
         */
        fun tableName(tableName: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Specified name for the backup.
         */
        var backupName: String?
        /**
         * The name of the table.
         */
        var tableName: String?

        fun build(): CreateBackupRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var backupName: String? = null
        override var tableName: String? = null

        constructor(x: CreateBackupRequest) : this() {
            this.backupName = x.backupName
            this.tableName = x.tableName
        }

        override fun build(): CreateBackupRequest = CreateBackupRequest(this)
        override fun backupName(backupName: String): FluentBuilder = apply { this.backupName = backupName }
        override fun tableName(tableName: String): FluentBuilder = apply { this.tableName = tableName }
    }
}
