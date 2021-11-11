// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class ListObjectsV2Request private constructor(builder: BuilderImpl) {
    /**
     * Bucket name to list.
     * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
     * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
     */
    val bucket: String? = builder.bucket
    /**
     * ContinuationToken indicates Amazon S3 that the list is being continued on this bucket with a
     * token. ContinuationToken is obfuscated and is not a real key.
     */
    val continuationToken: String? = builder.continuationToken
    /**
     * A delimiter is a character you use to group keys.
     */
    val delimiter: String? = builder.delimiter
    /**
     * Encoding type used by Amazon S3 to encode object keys in the response.
     */
    val encodingType: EncodingType? = builder.encodingType
    /**
     * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
     */
    val expectedBucketOwner: String? = builder.expectedBucketOwner
    /**
     * The owner field is not present in listV2 by default, if you want to return owner field
     * with each key in the result then set the fetch owner field to true.
     */
    val fetchOwner: Boolean = builder.fetchOwner
    /**
     * Sets the maximum number of keys returned in the response. By default the action returns up
     * to 1,000 key names. The response might contain fewer keys but will never contain
     * more.
     */
    val maxKeys: Int = builder.maxKeys
    /**
     * Limits the response to keys that begin with the specified prefix.
     */
    val prefix: String? = builder.prefix
    /**
     * Confirms that the requester knows that she or he will be charged for the list objects
     * request in V2 style. Bucket owners need not specify this parameter in their
     * requests.
     */
    val requestPayer: RequestPayer? = builder.requestPayer
    /**
     * StartAfter is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this
     * specified key. StartAfter can be any key in the bucket.
     */
    val startAfter: String? = builder.startAfter

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ListObjectsV2Request = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ListObjectsV2Request(")
        append("bucket=$bucket,")
        append("continuationToken=$continuationToken,")
        append("delimiter=$delimiter,")
        append("encodingType=$encodingType,")
        append("expectedBucketOwner=$expectedBucketOwner,")
        append("fetchOwner=$fetchOwner,")
        append("maxKeys=$maxKeys,")
        append("prefix=$prefix,")
        append("requestPayer=$requestPayer,")
        append("startAfter=$startAfter)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (continuationToken?.hashCode() ?: 0)
        result = 31 * result + (delimiter?.hashCode() ?: 0)
        result = 31 * result + (encodingType?.hashCode() ?: 0)
        result = 31 * result + (expectedBucketOwner?.hashCode() ?: 0)
        result = 31 * result + (fetchOwner.hashCode())
        result = 31 * result + (maxKeys)
        result = 31 * result + (prefix?.hashCode() ?: 0)
        result = 31 * result + (requestPayer?.hashCode() ?: 0)
        result = 31 * result + (startAfter?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ListObjectsV2Request

        if (bucket != other.bucket) return false
        if (continuationToken != other.continuationToken) return false
        if (delimiter != other.delimiter) return false
        if (encodingType != other.encodingType) return false
        if (expectedBucketOwner != other.expectedBucketOwner) return false
        if (fetchOwner != other.fetchOwner) return false
        if (maxKeys != other.maxKeys) return false
        if (prefix != other.prefix) return false
        if (requestPayer != other.requestPayer) return false
        if (startAfter != other.startAfter) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ListObjectsV2Request = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ListObjectsV2Request
        /**
         * Bucket name to list.
         * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
         * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
         */
        fun bucket(bucket: String): FluentBuilder
        /**
         * ContinuationToken indicates Amazon S3 that the list is being continued on this bucket with a
         * token. ContinuationToken is obfuscated and is not a real key.
         */
        fun continuationToken(continuationToken: String): FluentBuilder
        /**
         * A delimiter is a character you use to group keys.
         */
        fun delimiter(delimiter: String): FluentBuilder
        /**
         * Encoding type used by Amazon S3 to encode object keys in the response.
         */
        fun encodingType(encodingType: EncodingType): FluentBuilder
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        fun expectedBucketOwner(expectedBucketOwner: String): FluentBuilder
        /**
         * The owner field is not present in listV2 by default, if you want to return owner field
         * with each key in the result then set the fetch owner field to true.
         */
        fun fetchOwner(fetchOwner: Boolean): FluentBuilder
        /**
         * Sets the maximum number of keys returned in the response. By default the action returns up
         * to 1,000 key names. The response might contain fewer keys but will never contain
         * more.
         */
        fun maxKeys(maxKeys: Int): FluentBuilder
        /**
         * Limits the response to keys that begin with the specified prefix.
         */
        fun prefix(prefix: String): FluentBuilder
        /**
         * Confirms that the requester knows that she or he will be charged for the list objects
         * request in V2 style. Bucket owners need not specify this parameter in their
         * requests.
         */
        fun requestPayer(requestPayer: RequestPayer): FluentBuilder
        /**
         * StartAfter is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this
         * specified key. StartAfter can be any key in the bucket.
         */
        fun startAfter(startAfter: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Bucket name to list.
         * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
         * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
         */
        var bucket: String?
        /**
         * ContinuationToken indicates Amazon S3 that the list is being continued on this bucket with a
         * token. ContinuationToken is obfuscated and is not a real key.
         */
        var continuationToken: String?
        /**
         * A delimiter is a character you use to group keys.
         */
        var delimiter: String?
        /**
         * Encoding type used by Amazon S3 to encode object keys in the response.
         */
        var encodingType: EncodingType?
        /**
         * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
         */
        var expectedBucketOwner: String?
        /**
         * The owner field is not present in listV2 by default, if you want to return owner field
         * with each key in the result then set the fetch owner field to true.
         */
        var fetchOwner: Boolean
        /**
         * Sets the maximum number of keys returned in the response. By default the action returns up
         * to 1,000 key names. The response might contain fewer keys but will never contain
         * more.
         */
        var maxKeys: Int
        /**
         * Limits the response to keys that begin with the specified prefix.
         */
        var prefix: String?
        /**
         * Confirms that the requester knows that she or he will be charged for the list objects
         * request in V2 style. Bucket owners need not specify this parameter in their
         * requests.
         */
        var requestPayer: RequestPayer?
        /**
         * StartAfter is where you want Amazon S3 to start listing from. Amazon S3 starts listing after this
         * specified key. StartAfter can be any key in the bucket.
         */
        var startAfter: String?

        fun build(): ListObjectsV2Request
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var bucket: String? = null
        override var continuationToken: String? = null
        override var delimiter: String? = null
        override var encodingType: EncodingType? = null
        override var expectedBucketOwner: String? = null
        override var fetchOwner: Boolean = false
        override var maxKeys: Int = 0
        override var prefix: String? = null
        override var requestPayer: RequestPayer? = null
        override var startAfter: String? = null

        constructor(x: ListObjectsV2Request) : this() {
            this.bucket = x.bucket
            this.continuationToken = x.continuationToken
            this.delimiter = x.delimiter
            this.encodingType = x.encodingType
            this.expectedBucketOwner = x.expectedBucketOwner
            this.fetchOwner = x.fetchOwner
            this.maxKeys = x.maxKeys
            this.prefix = x.prefix
            this.requestPayer = x.requestPayer
            this.startAfter = x.startAfter
        }

        override fun build(): ListObjectsV2Request = ListObjectsV2Request(this)
        override fun bucket(bucket: String): FluentBuilder = apply { this.bucket = bucket }
        override fun continuationToken(continuationToken: String): FluentBuilder = apply { this.continuationToken = continuationToken }
        override fun delimiter(delimiter: String): FluentBuilder = apply { this.delimiter = delimiter }
        override fun encodingType(encodingType: EncodingType): FluentBuilder = apply { this.encodingType = encodingType }
        override fun expectedBucketOwner(expectedBucketOwner: String): FluentBuilder = apply { this.expectedBucketOwner = expectedBucketOwner }
        override fun fetchOwner(fetchOwner: Boolean): FluentBuilder = apply { this.fetchOwner = fetchOwner }
        override fun maxKeys(maxKeys: Int): FluentBuilder = apply { this.maxKeys = maxKeys }
        override fun prefix(prefix: String): FluentBuilder = apply { this.prefix = prefix }
        override fun requestPayer(requestPayer: RequestPayer): FluentBuilder = apply { this.requestPayer = requestPayer }
        override fun startAfter(startAfter: String): FluentBuilder = apply { this.startAfter = startAfter }
    }
}
