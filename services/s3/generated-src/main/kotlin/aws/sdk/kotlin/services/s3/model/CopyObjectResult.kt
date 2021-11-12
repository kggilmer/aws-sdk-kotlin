// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Container for all response elements.
 */
class CopyObjectResult private constructor(builder: BuilderImpl) {
    /**
     * Returns the ETag of the new object. The ETag reflects only changes to the contents of an object, not its metadata.
     */
    val eTag: String? = builder.eTag
    /**
     * Creation date of the object.
     */
    val lastModified: Instant? = builder.lastModified

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CopyObjectResult = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CopyObjectResult(")
        append("eTag=$eTag,")
        append("lastModified=$lastModified)")
    }

    override fun hashCode(): kotlin.Int {
        var result = eTag?.hashCode() ?: 0
        result = 31 * result + (lastModified?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CopyObjectResult

        if (eTag != other.eTag) return false
        if (lastModified != other.lastModified) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CopyObjectResult = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CopyObjectResult
        /**
         * Returns the ETag of the new object. The ETag reflects only changes to the contents of an object, not its metadata.
         */
        fun eTag(eTag: String): FluentBuilder
        /**
         * Creation date of the object.
         */
        fun lastModified(lastModified: Instant): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Returns the ETag of the new object. The ETag reflects only changes to the contents of an object, not its metadata.
         */
        var eTag: String?
        /**
         * Creation date of the object.
         */
        var lastModified: Instant?

        fun build(): CopyObjectResult
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var eTag: String? = null
        override var lastModified: Instant? = null

        constructor(x: CopyObjectResult) : this() {
            this.eTag = x.eTag
            this.lastModified = x.lastModified
        }

        override fun build(): CopyObjectResult = CopyObjectResult(this)
        override fun eTag(eTag: String): FluentBuilder = apply { this.eTag = eTag }
        override fun lastModified(lastModified: Instant): FluentBuilder = apply { this.lastModified = lastModified }
    }
}
