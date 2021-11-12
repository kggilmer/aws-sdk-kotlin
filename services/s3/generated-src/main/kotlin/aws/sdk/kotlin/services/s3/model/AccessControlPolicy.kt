// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Contains the elements that set the ACL permissions for an object per grantee.
 */
class AccessControlPolicy private constructor(builder: BuilderImpl) {
    /**
     * A list of grants.
     */
    val grants: List<Grant>? = builder.grants
    /**
     * Container for the bucket owner's display name and ID.
     */
    val owner: Owner? = builder.owner

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): AccessControlPolicy = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("AccessControlPolicy(")
        append("grants=$grants,")
        append("owner=$owner)")
    }

    override fun hashCode(): kotlin.Int {
        var result = grants?.hashCode() ?: 0
        result = 31 * result + (owner?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AccessControlPolicy

        if (grants != other.grants) return false
        if (owner != other.owner) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): AccessControlPolicy = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): AccessControlPolicy
        /**
         * A list of grants.
         */
        fun grants(grants: List<Grant>): FluentBuilder
        /**
         * Container for the bucket owner's display name and ID.
         */
        fun owner(owner: Owner): FluentBuilder
    }

    interface DslBuilder {
        /**
         * A list of grants.
         */
        var grants: List<Grant>?
        /**
         * Container for the bucket owner's display name and ID.
         */
        var owner: Owner?

        fun build(): AccessControlPolicy
        /**
         * construct an [aws.sdk.kotlin.services.s3.model.Owner] inside the given [block]
         */
        fun owner(block: Owner.DslBuilder.() -> kotlin.Unit) {
            this.owner = Owner.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var grants: List<Grant>? = null
        override var owner: Owner? = null

        constructor(x: AccessControlPolicy) : this() {
            this.grants = x.grants
            this.owner = x.owner
        }

        override fun build(): AccessControlPolicy = AccessControlPolicy(this)
        override fun grants(grants: List<Grant>): FluentBuilder = apply { this.grants = grants }
        override fun owner(owner: Owner): FluentBuilder = apply { this.owner = owner }
    }
}
