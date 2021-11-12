// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class GetBucketTaggingResponse private constructor(builder: BuilderImpl) {
    /**
     * Contains the tag set.
     */
    val tagSet: List<Tag>? = builder.tagSet

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): GetBucketTaggingResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("GetBucketTaggingResponse(")
        append("tagSet=$tagSet)")
    }

    override fun hashCode(): kotlin.Int {
        var result = tagSet?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GetBucketTaggingResponse

        if (tagSet != other.tagSet) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): GetBucketTaggingResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): GetBucketTaggingResponse
        /**
         * Contains the tag set.
         */
        fun tagSet(tagSet: List<Tag>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Contains the tag set.
         */
        var tagSet: List<Tag>?

        fun build(): GetBucketTaggingResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var tagSet: List<Tag>? = null

        constructor(x: GetBucketTaggingResponse) : this() {
            this.tagSet = x.tagSet
        }

        override fun build(): GetBucketTaggingResponse = GetBucketTaggingResponse(this)
        override fun tagSet(tagSet: List<Tag>): FluentBuilder = apply { this.tagSet = tagSet }
    }
}
