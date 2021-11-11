// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import aws.smithy.kotlin.runtime.time.Instant

class CreateMultipartUploadResponse private constructor(builder: BuilderImpl) {
    /**
     * If the bucket has a lifecycle rule configured with an action to abort incomplete
     * multipart uploads and the prefix in the lifecycle rule matches the object name in the
     * request, the response includes this header. The header indicates when the initiated
     * multipart upload becomes eligible for an abort operation. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config">
     * Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy.
     * The response also includes the x-amz-abort-rule-id header that provides the
     * ID of the lifecycle configuration rule that defines this action.
     */
    val abortDate: Instant? = builder.abortDate
    /**
     * This header is returned along with the x-amz-abort-date header. It
     * identifies the applicable lifecycle configuration rule that defines the action to abort
     * incomplete multipart uploads.
     */
    val abortRuleId: String? = builder.abortRuleId
    /**
     * The name of the bucket to which the multipart upload was initiated. Does not return the access point ARN or access point alias if used.
     * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
     * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
     */
    val bucket: String? = builder.bucket
    /**
     * Indicates whether the multipart upload uses an S3 Bucket Key for server-side encryption with Amazon Web Services KMS (SSE-KMS).
     */
    val bucketKeyEnabled: Boolean = builder.bucketKeyEnabled
    /**
     * Object key for which the multipart upload was initiated.
     */
    val key: String? = builder.key
    /**
     * If present, indicates that the requester was successfully charged for the
     * request.
     */
    val requestCharged: RequestCharged? = builder.requestCharged
    /**
     * The server-side encryption algorithm used when storing this object in Amazon S3 (for example,
     * AES256, aws:kms).
     */
    val serverSideEncryption: ServerSideEncryption? = builder.serverSideEncryption
    /**
     * If server-side encryption with a customer-provided encryption key was requested, the
     * response will include this header confirming the encryption algorithm used.
     */
    val sseCustomerAlgorithm: String? = builder.sseCustomerAlgorithm
    /**
     * If server-side encryption with a customer-provided encryption key was requested, the
     * response will include this header to provide round-trip message integrity verification of
     * the customer-provided encryption key.
     */
    val sseCustomerKeyMd5: String? = builder.sseCustomerKeyMd5
    /**
     * If present, specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The
     * value of this header is a base64-encoded UTF-8 string holding JSON with the encryption
     * context key-value pairs.
     */
    val ssekmsEncryptionContext: String? = builder.ssekmsEncryptionContext
    /**
     * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric
     * customer managed key that was used for the object.
     */
    val ssekmsKeyId: String? = builder.ssekmsKeyId
    /**
     * ID for the initiated multipart upload.
     */
    val uploadId: String? = builder.uploadId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CreateMultipartUploadResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CreateMultipartUploadResponse(")
        append("abortDate=$abortDate,")
        append("abortRuleId=$abortRuleId,")
        append("bucket=$bucket,")
        append("bucketKeyEnabled=$bucketKeyEnabled,")
        append("key=$key,")
        append("requestCharged=$requestCharged,")
        append("serverSideEncryption=$serverSideEncryption,")
        append("sseCustomerAlgorithm=$sseCustomerAlgorithm,")
        append("sseCustomerKeyMd5=$sseCustomerKeyMd5,")
        append("ssekmsEncryptionContext=*** Sensitive Data Redacted ***,")
        append("ssekmsKeyId=*** Sensitive Data Redacted ***,")
        append("uploadId=$uploadId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = abortDate?.hashCode() ?: 0
        result = 31 * result + (abortRuleId?.hashCode() ?: 0)
        result = 31 * result + (bucket?.hashCode() ?: 0)
        result = 31 * result + (bucketKeyEnabled.hashCode())
        result = 31 * result + (key?.hashCode() ?: 0)
        result = 31 * result + (requestCharged?.hashCode() ?: 0)
        result = 31 * result + (serverSideEncryption?.hashCode() ?: 0)
        result = 31 * result + (sseCustomerAlgorithm?.hashCode() ?: 0)
        result = 31 * result + (sseCustomerKeyMd5?.hashCode() ?: 0)
        result = 31 * result + (ssekmsEncryptionContext?.hashCode() ?: 0)
        result = 31 * result + (ssekmsKeyId?.hashCode() ?: 0)
        result = 31 * result + (uploadId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CreateMultipartUploadResponse

        if (abortDate != other.abortDate) return false
        if (abortRuleId != other.abortRuleId) return false
        if (bucket != other.bucket) return false
        if (bucketKeyEnabled != other.bucketKeyEnabled) return false
        if (key != other.key) return false
        if (requestCharged != other.requestCharged) return false
        if (serverSideEncryption != other.serverSideEncryption) return false
        if (sseCustomerAlgorithm != other.sseCustomerAlgorithm) return false
        if (sseCustomerKeyMd5 != other.sseCustomerKeyMd5) return false
        if (ssekmsEncryptionContext != other.ssekmsEncryptionContext) return false
        if (ssekmsKeyId != other.ssekmsKeyId) return false
        if (uploadId != other.uploadId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CreateMultipartUploadResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CreateMultipartUploadResponse
        /**
         * If the bucket has a lifecycle rule configured with an action to abort incomplete
         * multipart uploads and the prefix in the lifecycle rule matches the object name in the
         * request, the response includes this header. The header indicates when the initiated
         * multipart upload becomes eligible for an abort operation. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config">
         * Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy.
         * The response also includes the x-amz-abort-rule-id header that provides the
         * ID of the lifecycle configuration rule that defines this action.
         */
        fun abortDate(abortDate: Instant): FluentBuilder
        /**
         * This header is returned along with the x-amz-abort-date header. It
         * identifies the applicable lifecycle configuration rule that defines the action to abort
         * incomplete multipart uploads.
         */
        fun abortRuleId(abortRuleId: String): FluentBuilder
        /**
         * The name of the bucket to which the multipart upload was initiated. Does not return the access point ARN or access point alias if used.
         * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
         * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
         */
        fun bucket(bucket: String): FluentBuilder
        /**
         * Indicates whether the multipart upload uses an S3 Bucket Key for server-side encryption with Amazon Web Services KMS (SSE-KMS).
         */
        fun bucketKeyEnabled(bucketKeyEnabled: Boolean): FluentBuilder
        /**
         * Object key for which the multipart upload was initiated.
         */
        fun key(key: String): FluentBuilder
        /**
         * If present, indicates that the requester was successfully charged for the
         * request.
         */
        fun requestCharged(requestCharged: RequestCharged): FluentBuilder
        /**
         * The server-side encryption algorithm used when storing this object in Amazon S3 (for example,
         * AES256, aws:kms).
         */
        fun serverSideEncryption(serverSideEncryption: ServerSideEncryption): FluentBuilder
        /**
         * If server-side encryption with a customer-provided encryption key was requested, the
         * response will include this header confirming the encryption algorithm used.
         */
        fun sseCustomerAlgorithm(sseCustomerAlgorithm: String): FluentBuilder
        /**
         * If server-side encryption with a customer-provided encryption key was requested, the
         * response will include this header to provide round-trip message integrity verification of
         * the customer-provided encryption key.
         */
        fun sseCustomerKeyMd5(sseCustomerKeyMd5: String): FluentBuilder
        /**
         * If present, specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The
         * value of this header is a base64-encoded UTF-8 string holding JSON with the encryption
         * context key-value pairs.
         */
        fun ssekmsEncryptionContext(ssekmsEncryptionContext: String): FluentBuilder
        /**
         * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric
         * customer managed key that was used for the object.
         */
        fun ssekmsKeyId(ssekmsKeyId: String): FluentBuilder
        /**
         * ID for the initiated multipart upload.
         */
        fun uploadId(uploadId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * If the bucket has a lifecycle rule configured with an action to abort incomplete
         * multipart uploads and the prefix in the lifecycle rule matches the object name in the
         * request, the response includes this header. The header indicates when the initiated
         * multipart upload becomes eligible for an abort operation. For more information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/mpuoverview.html#mpu-abort-incomplete-mpu-lifecycle-config">
         * Aborting Incomplete Multipart Uploads Using a Bucket Lifecycle Policy.
         * The response also includes the x-amz-abort-rule-id header that provides the
         * ID of the lifecycle configuration rule that defines this action.
         */
        var abortDate: Instant?
        /**
         * This header is returned along with the x-amz-abort-date header. It
         * identifies the applicable lifecycle configuration rule that defines the action to abort
         * incomplete multipart uploads.
         */
        var abortRuleId: String?
        /**
         * The name of the bucket to which the multipart upload was initiated. Does not return the access point ARN or access point alias if used.
         * When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-access-points.html">Using access points in the Amazon S3 User Guide.
         * When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action using S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/userguide/S3onOutposts.html">Using S3 on Outposts in the Amazon S3 User Guide.
         */
        var bucket: String?
        /**
         * Indicates whether the multipart upload uses an S3 Bucket Key for server-side encryption with Amazon Web Services KMS (SSE-KMS).
         */
        var bucketKeyEnabled: Boolean
        /**
         * Object key for which the multipart upload was initiated.
         */
        var key: String?
        /**
         * If present, indicates that the requester was successfully charged for the
         * request.
         */
        var requestCharged: RequestCharged?
        /**
         * The server-side encryption algorithm used when storing this object in Amazon S3 (for example,
         * AES256, aws:kms).
         */
        var serverSideEncryption: ServerSideEncryption?
        /**
         * If server-side encryption with a customer-provided encryption key was requested, the
         * response will include this header confirming the encryption algorithm used.
         */
        var sseCustomerAlgorithm: String?
        /**
         * If server-side encryption with a customer-provided encryption key was requested, the
         * response will include this header to provide round-trip message integrity verification of
         * the customer-provided encryption key.
         */
        var sseCustomerKeyMd5: String?
        /**
         * If present, specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The
         * value of this header is a base64-encoded UTF-8 string holding JSON with the encryption
         * context key-value pairs.
         */
        var ssekmsEncryptionContext: String?
        /**
         * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric
         * customer managed key that was used for the object.
         */
        var ssekmsKeyId: String?
        /**
         * ID for the initiated multipart upload.
         */
        var uploadId: String?

        fun build(): CreateMultipartUploadResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var abortDate: Instant? = null
        override var abortRuleId: String? = null
        override var bucket: String? = null
        override var bucketKeyEnabled: Boolean = false
        override var key: String? = null
        override var requestCharged: RequestCharged? = null
        override var serverSideEncryption: ServerSideEncryption? = null
        override var sseCustomerAlgorithm: String? = null
        override var sseCustomerKeyMd5: String? = null
        override var ssekmsEncryptionContext: String? = null
        override var ssekmsKeyId: String? = null
        override var uploadId: String? = null

        constructor(x: CreateMultipartUploadResponse) : this() {
            this.abortDate = x.abortDate
            this.abortRuleId = x.abortRuleId
            this.bucket = x.bucket
            this.bucketKeyEnabled = x.bucketKeyEnabled
            this.key = x.key
            this.requestCharged = x.requestCharged
            this.serverSideEncryption = x.serverSideEncryption
            this.sseCustomerAlgorithm = x.sseCustomerAlgorithm
            this.sseCustomerKeyMd5 = x.sseCustomerKeyMd5
            this.ssekmsEncryptionContext = x.ssekmsEncryptionContext
            this.ssekmsKeyId = x.ssekmsKeyId
            this.uploadId = x.uploadId
        }

        override fun build(): CreateMultipartUploadResponse = CreateMultipartUploadResponse(this)
        override fun abortDate(abortDate: Instant): FluentBuilder = apply { this.abortDate = abortDate }
        override fun abortRuleId(abortRuleId: String): FluentBuilder = apply { this.abortRuleId = abortRuleId }
        override fun bucket(bucket: String): FluentBuilder = apply { this.bucket = bucket }
        override fun bucketKeyEnabled(bucketKeyEnabled: Boolean): FluentBuilder = apply { this.bucketKeyEnabled = bucketKeyEnabled }
        override fun key(key: String): FluentBuilder = apply { this.key = key }
        override fun requestCharged(requestCharged: RequestCharged): FluentBuilder = apply { this.requestCharged = requestCharged }
        override fun serverSideEncryption(serverSideEncryption: ServerSideEncryption): FluentBuilder = apply { this.serverSideEncryption = serverSideEncryption }
        override fun sseCustomerAlgorithm(sseCustomerAlgorithm: String): FluentBuilder = apply { this.sseCustomerAlgorithm = sseCustomerAlgorithm }
        override fun sseCustomerKeyMd5(sseCustomerKeyMd5: String): FluentBuilder = apply { this.sseCustomerKeyMd5 = sseCustomerKeyMd5 }
        override fun ssekmsEncryptionContext(ssekmsEncryptionContext: String): FluentBuilder = apply { this.ssekmsEncryptionContext = ssekmsEncryptionContext }
        override fun ssekmsKeyId(ssekmsKeyId: String): FluentBuilder = apply { this.ssekmsKeyId = ssekmsKeyId }
        override fun uploadId(uploadId: String): FluentBuilder = apply { this.uploadId = uploadId }
    }
}
