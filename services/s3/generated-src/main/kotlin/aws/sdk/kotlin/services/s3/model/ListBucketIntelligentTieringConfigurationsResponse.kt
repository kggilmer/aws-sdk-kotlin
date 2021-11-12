// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class ListBucketIntelligentTieringConfigurationsResponse private constructor(builder: BuilderImpl) {
    /**
     * The ContinuationToken that represents a placeholder from where this request should
     * begin.
     */
    val continuationToken: String? = builder.continuationToken
    /**
     * The list of S3 Intelligent-Tiering configurations for a bucket.
     */
    val intelligentTieringConfigurationList: List<IntelligentTieringConfiguration>? = builder.intelligentTieringConfigurationList
    /**
     * Indicates whether the returned list of analytics configurations is complete. A value of
     * true indicates that the list is not complete and the NextContinuationToken will be provided
     * for a subsequent request.
     */
    val isTruncated: Boolean = builder.isTruncated
    /**
     * The marker used to continue this inventory configuration listing. Use the
     * NextContinuationToken from this response to continue the listing in a
     * subsequent request. The continuation token is an opaque value that Amazon S3 understands.
     */
    val nextContinuationToken: String? = builder.nextContinuationToken

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ListBucketIntelligentTieringConfigurationsResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ListBucketIntelligentTieringConfigurationsResponse(")
        append("continuationToken=$continuationToken,")
        append("intelligentTieringConfigurationList=$intelligentTieringConfigurationList,")
        append("isTruncated=$isTruncated,")
        append("nextContinuationToken=$nextContinuationToken)")
    }

    override fun hashCode(): kotlin.Int {
        var result = continuationToken?.hashCode() ?: 0
        result = 31 * result + (intelligentTieringConfigurationList?.hashCode() ?: 0)
        result = 31 * result + (isTruncated.hashCode())
        result = 31 * result + (nextContinuationToken?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ListBucketIntelligentTieringConfigurationsResponse

        if (continuationToken != other.continuationToken) return false
        if (intelligentTieringConfigurationList != other.intelligentTieringConfigurationList) return false
        if (isTruncated != other.isTruncated) return false
        if (nextContinuationToken != other.nextContinuationToken) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ListBucketIntelligentTieringConfigurationsResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ListBucketIntelligentTieringConfigurationsResponse
        /**
         * The ContinuationToken that represents a placeholder from where this request should
         * begin.
         */
        fun continuationToken(continuationToken: String): FluentBuilder
        /**
         * The list of S3 Intelligent-Tiering configurations for a bucket.
         */
        fun intelligentTieringConfigurationList(intelligentTieringConfigurationList: List<IntelligentTieringConfiguration>): FluentBuilder
        /**
         * Indicates whether the returned list of analytics configurations is complete. A value of
         * true indicates that the list is not complete and the NextContinuationToken will be provided
         * for a subsequent request.
         */
        fun isTruncated(isTruncated: Boolean): FluentBuilder
        /**
         * The marker used to continue this inventory configuration listing. Use the
         * NextContinuationToken from this response to continue the listing in a
         * subsequent request. The continuation token is an opaque value that Amazon S3 understands.
         */
        fun nextContinuationToken(nextContinuationToken: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The ContinuationToken that represents a placeholder from where this request should
         * begin.
         */
        var continuationToken: String?
        /**
         * The list of S3 Intelligent-Tiering configurations for a bucket.
         */
        var intelligentTieringConfigurationList: List<IntelligentTieringConfiguration>?
        /**
         * Indicates whether the returned list of analytics configurations is complete. A value of
         * true indicates that the list is not complete and the NextContinuationToken will be provided
         * for a subsequent request.
         */
        var isTruncated: Boolean
        /**
         * The marker used to continue this inventory configuration listing. Use the
         * NextContinuationToken from this response to continue the listing in a
         * subsequent request. The continuation token is an opaque value that Amazon S3 understands.
         */
        var nextContinuationToken: String?

        fun build(): ListBucketIntelligentTieringConfigurationsResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var continuationToken: String? = null
        override var intelligentTieringConfigurationList: List<IntelligentTieringConfiguration>? = null
        override var isTruncated: Boolean = false
        override var nextContinuationToken: String? = null

        constructor(x: ListBucketIntelligentTieringConfigurationsResponse) : this() {
            this.continuationToken = x.continuationToken
            this.intelligentTieringConfigurationList = x.intelligentTieringConfigurationList
            this.isTruncated = x.isTruncated
            this.nextContinuationToken = x.nextContinuationToken
        }

        override fun build(): ListBucketIntelligentTieringConfigurationsResponse = ListBucketIntelligentTieringConfigurationsResponse(this)
        override fun continuationToken(continuationToken: String): FluentBuilder = apply { this.continuationToken = continuationToken }
        override fun intelligentTieringConfigurationList(intelligentTieringConfigurationList: List<IntelligentTieringConfiguration>): FluentBuilder = apply { this.intelligentTieringConfigurationList = intelligentTieringConfigurationList }
        override fun isTruncated(isTruncated: Boolean): FluentBuilder = apply { this.isTruncated = isTruncated }
        override fun nextContinuationToken(nextContinuationToken: String): FluentBuilder = apply { this.nextContinuationToken = nextContinuationToken }
    }
}
