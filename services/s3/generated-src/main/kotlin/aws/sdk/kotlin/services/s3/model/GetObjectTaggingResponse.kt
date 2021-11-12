// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class GetObjectTaggingResponse private constructor(builder: BuilderImpl) {
    /**
     * Contains the tag set.
     */
    val tagSet: List<Tag>? = builder.tagSet
    /**
     * The versionId of the object for which you got the tagging information.
     */
    val versionId: String? = builder.versionId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): GetObjectTaggingResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("GetObjectTaggingResponse(")
        append("tagSet=$tagSet,")
        append("versionId=$versionId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = tagSet?.hashCode() ?: 0
        result = 31 * result + (versionId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GetObjectTaggingResponse

        if (tagSet != other.tagSet) return false
        if (versionId != other.versionId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): GetObjectTaggingResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): GetObjectTaggingResponse
        /**
         * Contains the tag set.
         */
        fun tagSet(tagSet: List<Tag>): FluentBuilder
        /**
         * The versionId of the object for which you got the tagging information.
         */
        fun versionId(versionId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Contains the tag set.
         */
        var tagSet: List<Tag>?
        /**
         * The versionId of the object for which you got the tagging information.
         */
        var versionId: String?

        fun build(): GetObjectTaggingResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var tagSet: List<Tag>? = null
        override var versionId: String? = null

        constructor(x: GetObjectTaggingResponse) : this() {
            this.tagSet = x.tagSet
            this.versionId = x.versionId
        }

        override fun build(): GetObjectTaggingResponse = GetObjectTaggingResponse(this)
        override fun tagSet(tagSet: List<Tag>): FluentBuilder = apply { this.tagSet = tagSet }
        override fun versionId(versionId: String): FluentBuilder = apply { this.versionId = versionId }
    }
}
