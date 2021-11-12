// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class GetObjectLockConfigurationResponse private constructor(builder: BuilderImpl) {
    /**
     * The specified bucket's Object Lock configuration.
     */
    val objectLockConfiguration: ObjectLockConfiguration? = builder.objectLockConfiguration

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): GetObjectLockConfigurationResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("GetObjectLockConfigurationResponse(")
        append("objectLockConfiguration=$objectLockConfiguration)")
    }

    override fun hashCode(): kotlin.Int {
        var result = objectLockConfiguration?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as GetObjectLockConfigurationResponse

        if (objectLockConfiguration != other.objectLockConfiguration) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): GetObjectLockConfigurationResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): GetObjectLockConfigurationResponse
        /**
         * The specified bucket's Object Lock configuration.
         */
        fun objectLockConfiguration(objectLockConfiguration: ObjectLockConfiguration): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The specified bucket's Object Lock configuration.
         */
        var objectLockConfiguration: ObjectLockConfiguration?

        fun build(): GetObjectLockConfigurationResponse
        /**
         * construct an [aws.sdk.kotlin.services.s3.model.ObjectLockConfiguration] inside the given [block]
         */
        fun objectLockConfiguration(block: ObjectLockConfiguration.DslBuilder.() -> kotlin.Unit) {
            this.objectLockConfiguration = ObjectLockConfiguration.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var objectLockConfiguration: ObjectLockConfiguration? = null

        constructor(x: GetObjectLockConfigurationResponse) : this() {
            this.objectLockConfiguration = x.objectLockConfiguration
        }

        override fun build(): GetObjectLockConfigurationResponse = GetObjectLockConfigurationResponse(this)
        override fun objectLockConfiguration(objectLockConfiguration: ObjectLockConfiguration): FluentBuilder = apply { this.objectLockConfiguration = objectLockConfiguration }
    }
}
