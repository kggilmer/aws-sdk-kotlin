// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class CompleteMultipartUploadResponse private constructor(builder: BuilderImpl) {
    /**
     * The name of the bucket that contains the newly created object. Does not return the access point ARN or access point alias if used.
     * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
     * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
     */
    val bucket: String? = builder.bucket
    /**
     * Indicates whether the multipart upload uses an S3 Bucket Key for server-side encryption with Amazon Web Services KMS (SSE-KMS).
     */
    val bucketKeyEnabled: Boolean = builder.bucketKeyEnabled
    /**
     * Entity tag that identifies the newly created object's data. Objects with different
     * object data will have different entity tags. The entity tag is an opaque string. The entity
     * tag may or may not be an MD5 digest of the object data. If the entity tag is not an MD5
     * digest of the object data, it will contain one or more nonhexadecimal characters and/or
     * will consist of less than 32 or more than 32 hexadecimal digits.
     */
    val eTag: String? = builder.eTag
    /**
     * If the object expiration is configured, this will contain the expiration date
     * (expiry-date) and rule ID (rule-id). The value of rule-id is URL encoded.
     */
    val expiration: String? = builder.expiration
    /**
     * The object key of the newly created object.
     */
    val key: String? = builder.key
    /**
     * The URI that identifies the newly created object.
     */
    val location: String? = builder.location
    /**
     * If present, indicates that the requester was successfully charged for the
     * request.
     */
    val requestCharged: RequestCharged? = builder.requestCharged
    /**
     * If you specified server-side encryption either with an Amazon S3-managed encryption key or an
     * Amazon Web Services KMS key in your initiate multipart upload request, the response
     * includes this header. It confirms the encryption algorithm that Amazon S3 used to encrypt the
     * object.
     */
    val serverSideEncryption: ServerSideEncryption? = builder.serverSideEncryption
    /**
     * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric
     * customer managed key that was used for the object.
     */
    val ssekmsKeyId: String? = builder.ssekmsKeyId
    /**
     * Version ID of the newly created object, in case the bucket has versioning turned
     * on.
     */
    val versionId: String? = builder.versionId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CompleteMultipartUploadResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CompleteMultipartUploadResponse(")
        append("bucket=$bucket,")
        append("bucketKeyEnabled=$bucketKeyEnabled,")
        append("eTag=$eTag,")
        append("expiration=$expiration,")
        append("key=$key,")
        append("location=$location,")
        append("requestCharged=$requestCharged,")
        append("serverSideEncryption=$serverSideEncryption,")
        append("ssekmsKeyId=*** Sensitive Data Redacted ***,")
        append("versionId=$versionId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = bucket?.hashCode() ?: 0
        result = 31 * result + (bucketKeyEnabled.hashCode())
        result = 31 * result + (eTag?.hashCode() ?: 0)
        result = 31 * result + (expiration?.hashCode() ?: 0)
        result = 31 * result + (key?.hashCode() ?: 0)
        result = 31 * result + (location?.hashCode() ?: 0)
        result = 31 * result + (requestCharged?.hashCode() ?: 0)
        result = 31 * result + (serverSideEncryption?.hashCode() ?: 0)
        result = 31 * result + (ssekmsKeyId?.hashCode() ?: 0)
        result = 31 * result + (versionId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CompleteMultipartUploadResponse

        if (bucket != other.bucket) return false
        if (bucketKeyEnabled != other.bucketKeyEnabled) return false
        if (eTag != other.eTag) return false
        if (expiration != other.expiration) return false
        if (key != other.key) return false
        if (location != other.location) return false
        if (requestCharged != other.requestCharged) return false
        if (serverSideEncryption != other.serverSideEncryption) return false
        if (ssekmsKeyId != other.ssekmsKeyId) return false
        if (versionId != other.versionId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CompleteMultipartUploadResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CompleteMultipartUploadResponse
        /**
         * The name of the bucket that contains the newly created object. Does not return the access point ARN or access point alias if used.
         * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
         * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
         */
        fun bucket(bucket: String): FluentBuilder
        /**
         * Indicates whether the multipart upload uses an S3 Bucket Key for server-side encryption with Amazon Web Services KMS (SSE-KMS).
         */
        fun bucketKeyEnabled(bucketKeyEnabled: Boolean): FluentBuilder
        /**
         * Entity tag that identifies the newly created object's data. Objects with different
         * object data will have different entity tags. The entity tag is an opaque string. The entity
         * tag may or may not be an MD5 digest of the object data. If the entity tag is not an MD5
         * digest of the object data, it will contain one or more nonhexadecimal characters and/or
         * will consist of less than 32 or more than 32 hexadecimal digits.
         */
        fun eTag(eTag: String): FluentBuilder
        /**
         * If the object expiration is configured, this will contain the expiration date
         * (expiry-date) and rule ID (rule-id). The value of rule-id is URL encoded.
         */
        fun expiration(expiration: String): FluentBuilder
        /**
         * The object key of the newly created object.
         */
        fun key(key: String): FluentBuilder
        /**
         * The URI that identifies the newly created object.
         */
        fun location(location: String): FluentBuilder
        /**
         * If present, indicates that the requester was successfully charged for the
         * request.
         */
        fun requestCharged(requestCharged: RequestCharged): FluentBuilder
        /**
         * If you specified server-side encryption either with an Amazon S3-managed encryption key or an
         * Amazon Web Services KMS key in your initiate multipart upload request, the response
         * includes this header. It confirms the encryption algorithm that Amazon S3 used to encrypt the
         * object.
         */
        fun serverSideEncryption(serverSideEncryption: ServerSideEncryption): FluentBuilder
        /**
         * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric
         * customer managed key that was used for the object.
         */
        fun ssekmsKeyId(ssekmsKeyId: String): FluentBuilder
        /**
         * Version ID of the newly created object, in case the bucket has versioning turned
         * on.
         */
        fun versionId(versionId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The name of the bucket that contains the newly created object. Does not return the access point ARN or access point alias if used.
         * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
         * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
         */
        var bucket: String?
        /**
         * Indicates whether the multipart upload uses an S3 Bucket Key for server-side encryption with Amazon Web Services KMS (SSE-KMS).
         */
        var bucketKeyEnabled: Boolean
        /**
         * Entity tag that identifies the newly created object's data. Objects with different
         * object data will have different entity tags. The entity tag is an opaque string. The entity
         * tag may or may not be an MD5 digest of the object data. If the entity tag is not an MD5
         * digest of the object data, it will contain one or more nonhexadecimal characters and/or
         * will consist of less than 32 or more than 32 hexadecimal digits.
         */
        var eTag: String?
        /**
         * If the object expiration is configured, this will contain the expiration date
         * (expiry-date) and rule ID (rule-id). The value of rule-id is URL encoded.
         */
        var expiration: String?
        /**
         * The object key of the newly created object.
         */
        var key: String?
        /**
         * The URI that identifies the newly created object.
         */
        var location: String?
        /**
         * If present, indicates that the requester was successfully charged for the
         * request.
         */
        var requestCharged: RequestCharged?
        /**
         * If you specified server-side encryption either with an Amazon S3-managed encryption key or an
         * Amazon Web Services KMS key in your initiate multipart upload request, the response
         * includes this header. It confirms the encryption algorithm that Amazon S3 used to encrypt the
         * object.
         */
        var serverSideEncryption: ServerSideEncryption?
        /**
         * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric
         * customer managed key that was used for the object.
         */
        var ssekmsKeyId: String?
        /**
         * Version ID of the newly created object, in case the bucket has versioning turned
         * on.
         */
        var versionId: String?

        fun build(): CompleteMultipartUploadResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var bucket: String? = null
        override var bucketKeyEnabled: Boolean = false
        override var eTag: String? = null
        override var expiration: String? = null
        override var key: String? = null
        override var location: String? = null
        override var requestCharged: RequestCharged? = null
        override var serverSideEncryption: ServerSideEncryption? = null
        override var ssekmsKeyId: String? = null
        override var versionId: String? = null

        constructor(x: CompleteMultipartUploadResponse) : this() {
            this.bucket = x.bucket
            this.bucketKeyEnabled = x.bucketKeyEnabled
            this.eTag = x.eTag
            this.expiration = x.expiration
            this.key = x.key
            this.location = x.location
            this.requestCharged = x.requestCharged
            this.serverSideEncryption = x.serverSideEncryption
            this.ssekmsKeyId = x.ssekmsKeyId
            this.versionId = x.versionId
        }

        override fun build(): CompleteMultipartUploadResponse = CompleteMultipartUploadResponse(this)
        override fun bucket(bucket: String): FluentBuilder = apply { this.bucket = bucket }
        override fun bucketKeyEnabled(bucketKeyEnabled: Boolean): FluentBuilder = apply { this.bucketKeyEnabled = bucketKeyEnabled }
        override fun eTag(eTag: String): FluentBuilder = apply { this.eTag = eTag }
        override fun expiration(expiration: String): FluentBuilder = apply { this.expiration = expiration }
        override fun key(key: String): FluentBuilder = apply { this.key = key }
        override fun location(location: String): FluentBuilder = apply { this.location = location }
        override fun requestCharged(requestCharged: RequestCharged): FluentBuilder = apply { this.requestCharged = requestCharged }
        override fun serverSideEncryption(serverSideEncryption: ServerSideEncryption): FluentBuilder = apply { this.serverSideEncryption = serverSideEncryption }
        override fun ssekmsKeyId(ssekmsKeyId: String): FluentBuilder = apply { this.ssekmsKeyId = ssekmsKeyId }
        override fun versionId(versionId: String): FluentBuilder = apply { this.versionId = versionId }
    }
}
