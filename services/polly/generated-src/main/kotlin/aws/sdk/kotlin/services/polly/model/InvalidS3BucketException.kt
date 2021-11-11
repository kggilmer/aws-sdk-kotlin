// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.model

import aws.smithy.kotlin.runtime.ServiceErrorMetadata

/**
 * The provided Amazon S3 bucket name is invalid. Please check your input
 * with S3 bucket naming requirements and try again.
 */
class InvalidS3BucketException private constructor(builder: BuilderImpl) : PollyException() {

    override val message: String? = builder.message

    init {
        sdkErrorMetadata.attributes[ServiceErrorMetadata.ErrorType] = ErrorType.Client
    }

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): InvalidS3BucketException = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("InvalidS3BucketException(")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = message?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as InvalidS3BucketException

        if (message != other.message) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): InvalidS3BucketException = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): InvalidS3BucketException
        fun message(message: String): FluentBuilder
    }

    interface DslBuilder {
        var message: String?

        fun build(): InvalidS3BucketException
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var message: String? = null

        constructor(x: InvalidS3BucketException) : this() {
            this.message = x.message
        }

        override fun build(): InvalidS3BucketException = InvalidS3BucketException(this)
        override fun message(message: String): FluentBuilder = apply { this.message = message }
    }
}
