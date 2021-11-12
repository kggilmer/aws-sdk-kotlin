// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model

import aws.smithy.kotlin.runtime.time.Instant

class ExportTableToPointInTimeRequest private constructor(builder: BuilderImpl) {
    /**
     * Providing a ClientToken makes the call to
     * ExportTableToPointInTimeInput idempotent, meaning that multiple
     * identical calls have the same effect as one single call.
     * A client token is valid for 8 hours after the first request that uses it is
     * completed. After 8 hours, any request with the same client token is treated as a new
     * request. Do not resubmit the same request with the same client token for more than 8
     * hours, or the result might not be idempotent.
     * If you submit a request with the same client token but a change in other parameters
     * within the 8-hour idempotency window, DynamoDB returns an
     * IdempotentParameterMismatch exception.
     */
    val clientToken: String? = builder.clientToken
    /**
     * The format for the exported data. Valid values for ExportFormat are
     * DYNAMODB_JSON or ION.
     */
    val exportFormat: ExportFormat? = builder.exportFormat
    /**
     * Time in the past from which to export table data. The table export will be a snapshot
     * of the table's state at this point in time.
     */
    val exportTime: Instant? = builder.exportTime
    /**
     * The name of the Amazon S3 bucket to export the snapshot to.
     */
    val s3Bucket: String? = builder.s3Bucket
    /**
     * The ID of the AWS account that owns the bucket the export will be stored in.
     */
    val s3BucketOwner: String? = builder.s3BucketOwner
    /**
     * The Amazon S3 bucket prefix to use as the file name and path of the exported
     * snapshot.
     */
    val s3Prefix: String? = builder.s3Prefix
    /**
     * Type of encryption used on the bucket where export data will be stored. Valid values
     * for S3SseAlgorithm are:
     * AES256 - server-side encryption with Amazon S3 managed keys
     * KMS - server-side encryption with AWS KMS managed keys
     */
    val s3SseAlgorithm: S3SseAlgorithm? = builder.s3SseAlgorithm
    /**
     * The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data will
     * be stored (if applicable).
     */
    val s3SseKmsKeyId: String? = builder.s3SseKmsKeyId
    /**
     * The Amazon Resource Name (ARN) associated with the table to export.
     */
    val tableArn: String? = builder.tableArn

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ExportTableToPointInTimeRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ExportTableToPointInTimeRequest(")
        append("clientToken=$clientToken,")
        append("exportFormat=$exportFormat,")
        append("exportTime=$exportTime,")
        append("s3Bucket=$s3Bucket,")
        append("s3BucketOwner=$s3BucketOwner,")
        append("s3Prefix=$s3Prefix,")
        append("s3SseAlgorithm=$s3SseAlgorithm,")
        append("s3SseKmsKeyId=$s3SseKmsKeyId,")
        append("tableArn=$tableArn)")
    }

    override fun hashCode(): kotlin.Int {
        var result = clientToken?.hashCode() ?: 0
        result = 31 * result + (exportFormat?.hashCode() ?: 0)
        result = 31 * result + (exportTime?.hashCode() ?: 0)
        result = 31 * result + (s3Bucket?.hashCode() ?: 0)
        result = 31 * result + (s3BucketOwner?.hashCode() ?: 0)
        result = 31 * result + (s3Prefix?.hashCode() ?: 0)
        result = 31 * result + (s3SseAlgorithm?.hashCode() ?: 0)
        result = 31 * result + (s3SseKmsKeyId?.hashCode() ?: 0)
        result = 31 * result + (tableArn?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ExportTableToPointInTimeRequest

        if (clientToken != other.clientToken) return false
        if (exportFormat != other.exportFormat) return false
        if (exportTime != other.exportTime) return false
        if (s3Bucket != other.s3Bucket) return false
        if (s3BucketOwner != other.s3BucketOwner) return false
        if (s3Prefix != other.s3Prefix) return false
        if (s3SseAlgorithm != other.s3SseAlgorithm) return false
        if (s3SseKmsKeyId != other.s3SseKmsKeyId) return false
        if (tableArn != other.tableArn) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ExportTableToPointInTimeRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ExportTableToPointInTimeRequest
        /**
         * Providing a ClientToken makes the call to
         * ExportTableToPointInTimeInput idempotent, meaning that multiple
         * identical calls have the same effect as one single call.
         * A client token is valid for 8 hours after the first request that uses it is
         * completed. After 8 hours, any request with the same client token is treated as a new
         * request. Do not resubmit the same request with the same client token for more than 8
         * hours, or the result might not be idempotent.
         * If you submit a request with the same client token but a change in other parameters
         * within the 8-hour idempotency window, DynamoDB returns an
         * IdempotentParameterMismatch exception.
         */
        fun clientToken(clientToken: String): FluentBuilder
        /**
         * The format for the exported data. Valid values for ExportFormat are
         * DYNAMODB_JSON or ION.
         */
        fun exportFormat(exportFormat: ExportFormat): FluentBuilder
        /**
         * Time in the past from which to export table data. The table export will be a snapshot
         * of the table's state at this point in time.
         */
        fun exportTime(exportTime: Instant): FluentBuilder
        /**
         * The name of the Amazon S3 bucket to export the snapshot to.
         */
        fun s3Bucket(s3Bucket: String): FluentBuilder
        /**
         * The ID of the AWS account that owns the bucket the export will be stored in.
         */
        fun s3BucketOwner(s3BucketOwner: String): FluentBuilder
        /**
         * The Amazon S3 bucket prefix to use as the file name and path of the exported
         * snapshot.
         */
        fun s3Prefix(s3Prefix: String): FluentBuilder
        /**
         * Type of encryption used on the bucket where export data will be stored. Valid values
         * for S3SseAlgorithm are:
         * AES256 - server-side encryption with Amazon S3 managed keys
         * KMS - server-side encryption with AWS KMS managed keys
         */
        fun s3SseAlgorithm(s3SseAlgorithm: S3SseAlgorithm): FluentBuilder
        /**
         * The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data will
         * be stored (if applicable).
         */
        fun s3SseKmsKeyId(s3SseKmsKeyId: String): FluentBuilder
        /**
         * The Amazon Resource Name (ARN) associated with the table to export.
         */
        fun tableArn(tableArn: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Providing a ClientToken makes the call to
         * ExportTableToPointInTimeInput idempotent, meaning that multiple
         * identical calls have the same effect as one single call.
         * A client token is valid for 8 hours after the first request that uses it is
         * completed. After 8 hours, any request with the same client token is treated as a new
         * request. Do not resubmit the same request with the same client token for more than 8
         * hours, or the result might not be idempotent.
         * If you submit a request with the same client token but a change in other parameters
         * within the 8-hour idempotency window, DynamoDB returns an
         * IdempotentParameterMismatch exception.
         */
        var clientToken: String?
        /**
         * The format for the exported data. Valid values for ExportFormat are
         * DYNAMODB_JSON or ION.
         */
        var exportFormat: ExportFormat?
        /**
         * Time in the past from which to export table data. The table export will be a snapshot
         * of the table's state at this point in time.
         */
        var exportTime: Instant?
        /**
         * The name of the Amazon S3 bucket to export the snapshot to.
         */
        var s3Bucket: String?
        /**
         * The ID of the AWS account that owns the bucket the export will be stored in.
         */
        var s3BucketOwner: String?
        /**
         * The Amazon S3 bucket prefix to use as the file name and path of the exported
         * snapshot.
         */
        var s3Prefix: String?
        /**
         * Type of encryption used on the bucket where export data will be stored. Valid values
         * for S3SseAlgorithm are:
         * AES256 - server-side encryption with Amazon S3 managed keys
         * KMS - server-side encryption with AWS KMS managed keys
         */
        var s3SseAlgorithm: S3SseAlgorithm?
        /**
         * The ID of the AWS KMS managed key used to encrypt the S3 bucket where export data will
         * be stored (if applicable).
         */
        var s3SseKmsKeyId: String?
        /**
         * The Amazon Resource Name (ARN) associated with the table to export.
         */
        var tableArn: String?

        fun build(): ExportTableToPointInTimeRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var clientToken: String? = null
        override var exportFormat: ExportFormat? = null
        override var exportTime: Instant? = null
        override var s3Bucket: String? = null
        override var s3BucketOwner: String? = null
        override var s3Prefix: String? = null
        override var s3SseAlgorithm: S3SseAlgorithm? = null
        override var s3SseKmsKeyId: String? = null
        override var tableArn: String? = null

        constructor(x: ExportTableToPointInTimeRequest) : this() {
            this.clientToken = x.clientToken
            this.exportFormat = x.exportFormat
            this.exportTime = x.exportTime
            this.s3Bucket = x.s3Bucket
            this.s3BucketOwner = x.s3BucketOwner
            this.s3Prefix = x.s3Prefix
            this.s3SseAlgorithm = x.s3SseAlgorithm
            this.s3SseKmsKeyId = x.s3SseKmsKeyId
            this.tableArn = x.tableArn
        }

        override fun build(): ExportTableToPointInTimeRequest = ExportTableToPointInTimeRequest(this)
        override fun clientToken(clientToken: String): FluentBuilder = apply { this.clientToken = clientToken }
        override fun exportFormat(exportFormat: ExportFormat): FluentBuilder = apply { this.exportFormat = exportFormat }
        override fun exportTime(exportTime: Instant): FluentBuilder = apply { this.exportTime = exportTime }
        override fun s3Bucket(s3Bucket: String): FluentBuilder = apply { this.s3Bucket = s3Bucket }
        override fun s3BucketOwner(s3BucketOwner: String): FluentBuilder = apply { this.s3BucketOwner = s3BucketOwner }
        override fun s3Prefix(s3Prefix: String): FluentBuilder = apply { this.s3Prefix = s3Prefix }
        override fun s3SseAlgorithm(s3SseAlgorithm: S3SseAlgorithm): FluentBuilder = apply { this.s3SseAlgorithm = s3SseAlgorithm }
        override fun s3SseKmsKeyId(s3SseKmsKeyId: String): FluentBuilder = apply { this.s3SseKmsKeyId = s3SseKmsKeyId }
        override fun tableArn(tableArn: String): FluentBuilder = apply { this.tableArn = tableArn }
    }
}
