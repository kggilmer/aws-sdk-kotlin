// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class GetBucketLifecycleConfigurationResponse private constructor(builder: BuilderImpl) {
    /**
     * Container for a lifecycle rule.
     */
    val rules: List<LifecycleRule>? = builder.rules

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): GetBucketLifecycleConfigurationResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("GetBucketLifecycleConfigurationResponse(")
        append("rules=$rules)")
    }

    override fun hashCode(): kotlin.Int {
        var result = rules?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GetBucketLifecycleConfigurationResponse

        if (rules != other.rules) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): GetBucketLifecycleConfigurationResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): GetBucketLifecycleConfigurationResponse
        /**
         * Container for a lifecycle rule.
         */
        fun rules(rules: List<LifecycleRule>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Container for a lifecycle rule.
         */
        var rules: List<LifecycleRule>?

        fun build(): GetBucketLifecycleConfigurationResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var rules: List<LifecycleRule>? = null

        constructor(x: GetBucketLifecycleConfigurationResponse) : this() {
            this.rules = x.rules
        }

        override fun build(): GetBucketLifecycleConfigurationResponse = GetBucketLifecycleConfigurationResponse(this)
        override fun rules(rules: List<LifecycleRule>): FluentBuilder = apply { this.rules = rules }
    }
}
