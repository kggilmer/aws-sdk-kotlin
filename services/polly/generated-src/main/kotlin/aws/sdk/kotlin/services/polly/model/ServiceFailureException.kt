// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.model

import aws.smithy.kotlin.runtime.ServiceErrorMetadata

/**
 * An unknown condition has caused a service failure.
 */
class ServiceFailureException private constructor(builder: BuilderImpl) : PollyException() {

    override val message: String? = builder.message

    init {
        sdkErrorMetadata.attributes[ServiceErrorMetadata.ErrorType] = ErrorType.Server
    }

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ServiceFailureException = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ServiceFailureException(")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = message?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ServiceFailureException

        if (message != other.message) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ServiceFailureException = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ServiceFailureException
        fun message(message: String): FluentBuilder
    }

    interface DslBuilder {
        var message: String?

        fun build(): ServiceFailureException
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var message: String? = null

        constructor(x: ServiceFailureException) : this() {
            this.message = x.message
        }

        override fun build(): ServiceFailureException = ServiceFailureException(this)
        override fun message(message: String): FluentBuilder = apply { this.message = message }
    }
}
