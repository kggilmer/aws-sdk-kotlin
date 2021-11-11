// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class GetBucketEncryptionResponse private constructor(builder: BuilderImpl) {
    /**
     * Specifies the default server-side-encryption configuration.
     */
    val serverSideEncryptionConfiguration: ServerSideEncryptionConfiguration? = builder.serverSideEncryptionConfiguration

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): GetBucketEncryptionResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("GetBucketEncryptionResponse(")
        append("serverSideEncryptionConfiguration=$serverSideEncryptionConfiguration)")
    }

    override fun hashCode(): kotlin.Int {
        var result = serverSideEncryptionConfiguration?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GetBucketEncryptionResponse

        if (serverSideEncryptionConfiguration != other.serverSideEncryptionConfiguration) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): GetBucketEncryptionResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): GetBucketEncryptionResponse
        /**
         * Specifies the default server-side-encryption configuration.
         */
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfiguration): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Specifies the default server-side-encryption configuration.
         */
        var serverSideEncryptionConfiguration: ServerSideEncryptionConfiguration?

        fun build(): GetBucketEncryptionResponse
        /**
         * construct an [aws.sdk.kotlin.services.s3.model.ServerSideEncryptionConfiguration] inside the given [block]
         */
        fun serverSideEncryptionConfiguration(block: ServerSideEncryptionConfiguration.DslBuilder.() -> kotlin.Unit) {
            this.serverSideEncryptionConfiguration = ServerSideEncryptionConfiguration.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var serverSideEncryptionConfiguration: ServerSideEncryptionConfiguration? = null

        constructor(x: GetBucketEncryptionResponse) : this() {
            this.serverSideEncryptionConfiguration = x.serverSideEncryptionConfiguration
        }

        override fun build(): GetBucketEncryptionResponse = GetBucketEncryptionResponse(this)
        override fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: ServerSideEncryptionConfiguration): FluentBuilder = apply { this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration }
    }
}
