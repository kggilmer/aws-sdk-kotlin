// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes an Active Directory.
 */
class DirectoryServiceAuthentication private constructor(builder: BuilderImpl) {
    /**
     * The ID of the Active Directory used for authentication.
     */
    val directoryId: String? = builder.directoryId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DirectoryServiceAuthentication = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DirectoryServiceAuthentication(")
        append("directoryId=$directoryId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = directoryId?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DirectoryServiceAuthentication

        if (directoryId != other.directoryId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DirectoryServiceAuthentication = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DirectoryServiceAuthentication
        /**
         * The ID of the Active Directory used for authentication.
         */
        fun directoryId(directoryId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The ID of the Active Directory used for authentication.
         */
        var directoryId: String?

        fun build(): DirectoryServiceAuthentication
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var directoryId: String? = null

        constructor(x: DirectoryServiceAuthentication) : this() {
            this.directoryId = x.directoryId
        }

        override fun build(): DirectoryServiceAuthentication = DirectoryServiceAuthentication(this)
        override fun directoryId(directoryId: String): FluentBuilder = apply { this.directoryId = directoryId }
    }
}
