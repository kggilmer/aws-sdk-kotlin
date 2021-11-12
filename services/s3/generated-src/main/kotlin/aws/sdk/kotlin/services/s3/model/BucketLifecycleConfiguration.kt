// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Specifies the lifecycle configuration for objects in an Amazon S3 bucket. For more
 * information, see <a href="https://docs.aws.amazon.com/AmazonS3/latest/dev/object-lifecycle-mgmt.html">Object Lifecycle Management
 * in the Amazon S3 User Guide.
 */
class BucketLifecycleConfiguration private constructor(builder: BuilderImpl) {
    /**
     * A lifecycle rule for individual objects in an Amazon S3 bucket.
     */
    val rules: List<LifecycleRule>? = builder.rules

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): BucketLifecycleConfiguration = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("BucketLifecycleConfiguration(")
        append("rules=$rules)")
    }

    override fun hashCode(): kotlin.Int {
        var result = rules?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as BucketLifecycleConfiguration

        if (rules != other.rules) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): BucketLifecycleConfiguration = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): BucketLifecycleConfiguration
        /**
         * A lifecycle rule for individual objects in an Amazon S3 bucket.
         */
        fun rules(rules: List<LifecycleRule>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * A lifecycle rule for individual objects in an Amazon S3 bucket.
         */
        var rules: List<LifecycleRule>?

        fun build(): BucketLifecycleConfiguration
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var rules: List<LifecycleRule>? = null

        constructor(x: BucketLifecycleConfiguration) : this() {
            this.rules = x.rules
        }

        override fun build(): BucketLifecycleConfiguration = BucketLifecycleConfiguration(this)
        override fun rules(rules: List<LifecycleRule>): FluentBuilder = apply { this.rules = rules }
    }
}
