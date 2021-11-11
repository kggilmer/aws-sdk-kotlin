// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Describes an Amazon S3 location that will receive the results of the restore request.
 */
class S3Location private constructor(builder: BuilderImpl) {
    /**
     * A list of grants that control access to the staged results.
     */
    val accessControlList: List<Grant>? = builder.accessControlList
    /**
     * The name of the bucket where the restore results will be placed.
     */
    val bucketName: String? = builder.bucketName
    /**
     * The canned ACL to apply to the restore results.
     */
    val cannedAcl: ObjectCannedAcl? = builder.cannedAcl
    /**
     * Contains the type of server-side encryption used.
     */
    val encryption: Encryption? = builder.encryption
    /**
     * The prefix that is prepended to the restore results for this request.
     */
    val prefix: String? = builder.prefix
    /**
     * The class of storage used to store the restore results.
     */
    val storageClass: StorageClass? = builder.storageClass
    /**
     * The tag-set that is applied to the restore results.
     */
    val tagging: Tagging? = builder.tagging
    /**
     * A list of metadata to store with the restore results in S3.
     */
    val userMetadata: List<MetadataEntry>? = builder.userMetadata

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): S3Location = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("S3Location(")
        append("accessControlList=$accessControlList,")
        append("bucketName=$bucketName,")
        append("cannedAcl=$cannedAcl,")
        append("encryption=$encryption,")
        append("prefix=$prefix,")
        append("storageClass=$storageClass,")
        append("tagging=$tagging,")
        append("userMetadata=$userMetadata)")
    }

    override fun hashCode(): kotlin.Int {
        var result = accessControlList?.hashCode() ?: 0
        result = 31 * result + (bucketName?.hashCode() ?: 0)
        result = 31 * result + (cannedAcl?.hashCode() ?: 0)
        result = 31 * result + (encryption?.hashCode() ?: 0)
        result = 31 * result + (prefix?.hashCode() ?: 0)
        result = 31 * result + (storageClass?.hashCode() ?: 0)
        result = 31 * result + (tagging?.hashCode() ?: 0)
        result = 31 * result + (userMetadata?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as S3Location

        if (accessControlList != other.accessControlList) return false
        if (bucketName != other.bucketName) return false
        if (cannedAcl != other.cannedAcl) return false
        if (encryption != other.encryption) return false
        if (prefix != other.prefix) return false
        if (storageClass != other.storageClass) return false
        if (tagging != other.tagging) return false
        if (userMetadata != other.userMetadata) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): S3Location = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): S3Location
        /**
         * A list of grants that control access to the staged results.
         */
        fun accessControlList(accessControlList: List<Grant>): FluentBuilder
        /**
         * The name of the bucket where the restore results will be placed.
         */
        fun bucketName(bucketName: String): FluentBuilder
        /**
         * The canned ACL to apply to the restore results.
         */
        fun cannedAcl(cannedAcl: ObjectCannedAcl): FluentBuilder
        /**
         * Contains the type of server-side encryption used.
         */
        fun encryption(encryption: Encryption): FluentBuilder
        /**
         * The prefix that is prepended to the restore results for this request.
         */
        fun prefix(prefix: String): FluentBuilder
        /**
         * The class of storage used to store the restore results.
         */
        fun storageClass(storageClass: StorageClass): FluentBuilder
        /**
         * The tag-set that is applied to the restore results.
         */
        fun tagging(tagging: Tagging): FluentBuilder
        /**
         * A list of metadata to store with the restore results in S3.
         */
        fun userMetadata(userMetadata: List<MetadataEntry>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * A list of grants that control access to the staged results.
         */
        var accessControlList: List<Grant>?
        /**
         * The name of the bucket where the restore results will be placed.
         */
        var bucketName: String?
        /**
         * The canned ACL to apply to the restore results.
         */
        var cannedAcl: ObjectCannedAcl?
        /**
         * Contains the type of server-side encryption used.
         */
        var encryption: Encryption?
        /**
         * The prefix that is prepended to the restore results for this request.
         */
        var prefix: String?
        /**
         * The class of storage used to store the restore results.
         */
        var storageClass: StorageClass?
        /**
         * The tag-set that is applied to the restore results.
         */
        var tagging: Tagging?
        /**
         * A list of metadata to store with the restore results in S3.
         */
        var userMetadata: List<MetadataEntry>?

        fun build(): S3Location
        /**
         * construct an [aws.sdk.kotlin.services.s3.model.Encryption] inside the given [block]
         */
        fun encryption(block: Encryption.DslBuilder.() -> kotlin.Unit) {
            this.encryption = Encryption.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.s3.model.Tagging] inside the given [block]
         */
        fun tagging(block: Tagging.DslBuilder.() -> kotlin.Unit) {
            this.tagging = Tagging.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var accessControlList: List<Grant>? = null
        override var bucketName: String? = null
        override var cannedAcl: ObjectCannedAcl? = null
        override var encryption: Encryption? = null
        override var prefix: String? = null
        override var storageClass: StorageClass? = null
        override var tagging: Tagging? = null
        override var userMetadata: List<MetadataEntry>? = null

        constructor(x: S3Location) : this() {
            this.accessControlList = x.accessControlList
            this.bucketName = x.bucketName
            this.cannedAcl = x.cannedAcl
            this.encryption = x.encryption
            this.prefix = x.prefix
            this.storageClass = x.storageClass
            this.tagging = x.tagging
            this.userMetadata = x.userMetadata
        }

        override fun build(): S3Location = S3Location(this)
        override fun accessControlList(accessControlList: List<Grant>): FluentBuilder = apply { this.accessControlList = accessControlList }
        override fun bucketName(bucketName: String): FluentBuilder = apply { this.bucketName = bucketName }
        override fun cannedAcl(cannedAcl: ObjectCannedAcl): FluentBuilder = apply { this.cannedAcl = cannedAcl }
        override fun encryption(encryption: Encryption): FluentBuilder = apply { this.encryption = encryption }
        override fun prefix(prefix: String): FluentBuilder = apply { this.prefix = prefix }
        override fun storageClass(storageClass: StorageClass): FluentBuilder = apply { this.storageClass = storageClass }
        override fun tagging(tagging: Tagging): FluentBuilder = apply { this.tagging = tagging }
        override fun userMetadata(userMetadata: List<MetadataEntry>): FluentBuilder = apply { this.userMetadata = userMetadata }
    }
}
