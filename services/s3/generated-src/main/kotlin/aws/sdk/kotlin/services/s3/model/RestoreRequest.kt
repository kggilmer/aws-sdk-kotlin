// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Container for restore job parameters.
 */
class RestoreRequest private constructor(builder: BuilderImpl) {
    /**
     * Lifetime of the active copy in days. Do not use with restores that specify
     * OutputLocation.
     * The Days element is required for regular restores, and must not be provided for select
     * requests.
     */
    val days: Int = builder.days
    /**
     * The optional description for the job.
     */
    val description: String? = builder.description
    /**
     * S3 Glacier related parameters pertaining to this job. Do not use with restores that
     * specify OutputLocation.
     */
    val glacierJobParameters: GlacierJobParameters? = builder.glacierJobParameters
    /**
     * Describes the location where the restore job's output is stored.
     */
    val outputLocation: OutputLocation? = builder.outputLocation
    /**
     * Describes the parameters for Select job types.
     */
    val selectParameters: SelectParameters? = builder.selectParameters
    /**
     * Retrieval tier at which the restore will be processed.
     */
    val tier: Tier? = builder.tier
    /**
     * Type of restore request.
     */
    val type: RestoreRequestType? = builder.type

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): RestoreRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("RestoreRequest(")
        append("days=$days,")
        append("description=$description,")
        append("glacierJobParameters=$glacierJobParameters,")
        append("outputLocation=$outputLocation,")
        append("selectParameters=$selectParameters,")
        append("tier=$tier,")
        append("type=$type)")
    }

    override fun hashCode(): kotlin.Int {
        var result = days
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (glacierJobParameters?.hashCode() ?: 0)
        result = 31 * result + (outputLocation?.hashCode() ?: 0)
        result = 31 * result + (selectParameters?.hashCode() ?: 0)
        result = 31 * result + (tier?.hashCode() ?: 0)
        result = 31 * result + (type?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RestoreRequest

        if (days != other.days) return false
        if (description != other.description) return false
        if (glacierJobParameters != other.glacierJobParameters) return false
        if (outputLocation != other.outputLocation) return false
        if (selectParameters != other.selectParameters) return false
        if (tier != other.tier) return false
        if (type != other.type) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): RestoreRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): RestoreRequest
        /**
         * Lifetime of the active copy in days. Do not use with restores that specify
         * OutputLocation.
         * The Days element is required for regular restores, and must not be provided for select
         * requests.
         */
        fun days(days: Int): FluentBuilder
        /**
         * The optional description for the job.
         */
        fun description(description: String): FluentBuilder
        /**
         * S3 Glacier related parameters pertaining to this job. Do not use with restores that
         * specify OutputLocation.
         */
        fun glacierJobParameters(glacierJobParameters: GlacierJobParameters): FluentBuilder
        /**
         * Describes the location where the restore job's output is stored.
         */
        fun outputLocation(outputLocation: OutputLocation): FluentBuilder
        /**
         * Describes the parameters for Select job types.
         */
        fun selectParameters(selectParameters: SelectParameters): FluentBuilder
        /**
         * Retrieval tier at which the restore will be processed.
         */
        fun tier(tier: Tier): FluentBuilder
        /**
         * Type of restore request.
         */
        fun type(type: RestoreRequestType): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Lifetime of the active copy in days. Do not use with restores that specify
         * OutputLocation.
         * The Days element is required for regular restores, and must not be provided for select
         * requests.
         */
        var days: Int
        /**
         * The optional description for the job.
         */
        var description: String?
        /**
         * S3 Glacier related parameters pertaining to this job. Do not use with restores that
         * specify OutputLocation.
         */
        var glacierJobParameters: GlacierJobParameters?
        /**
         * Describes the location where the restore job's output is stored.
         */
        var outputLocation: OutputLocation?
        /**
         * Describes the parameters for Select job types.
         */
        var selectParameters: SelectParameters?
        /**
         * Retrieval tier at which the restore will be processed.
         */
        var tier: Tier?
        /**
         * Type of restore request.
         */
        var type: RestoreRequestType?

        fun build(): RestoreRequest
        /**
         * construct an [aws.sdk.kotlin.services.s3.model.GlacierJobParameters] inside the given [block]
         */
        fun glacierJobParameters(block: GlacierJobParameters.DslBuilder.() -> kotlin.Unit) {
            this.glacierJobParameters = GlacierJobParameters.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.s3.model.OutputLocation] inside the given [block]
         */
        fun outputLocation(block: OutputLocation.DslBuilder.() -> kotlin.Unit) {
            this.outputLocation = OutputLocation.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.s3.model.SelectParameters] inside the given [block]
         */
        fun selectParameters(block: SelectParameters.DslBuilder.() -> kotlin.Unit) {
            this.selectParameters = SelectParameters.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var days: Int = 0
        override var description: String? = null
        override var glacierJobParameters: GlacierJobParameters? = null
        override var outputLocation: OutputLocation? = null
        override var selectParameters: SelectParameters? = null
        override var tier: Tier? = null
        override var type: RestoreRequestType? = null

        constructor(x: RestoreRequest) : this() {
            this.days = x.days
            this.description = x.description
            this.glacierJobParameters = x.glacierJobParameters
            this.outputLocation = x.outputLocation
            this.selectParameters = x.selectParameters
            this.tier = x.tier
            this.type = x.type
        }

        override fun build(): RestoreRequest = RestoreRequest(this)
        override fun days(days: Int): FluentBuilder = apply { this.days = days }
        override fun description(description: String): FluentBuilder = apply { this.description = description }
        override fun glacierJobParameters(glacierJobParameters: GlacierJobParameters): FluentBuilder = apply { this.glacierJobParameters = glacierJobParameters }
        override fun outputLocation(outputLocation: OutputLocation): FluentBuilder = apply { this.outputLocation = outputLocation }
        override fun selectParameters(selectParameters: SelectParameters): FluentBuilder = apply { this.selectParameters = selectParameters }
        override fun tier(tier: Tier): FluentBuilder = apply { this.tier = tier }
        override fun type(type: RestoreRequestType): FluentBuilder = apply { this.type = type }
    }
}
