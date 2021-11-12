// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.sts.model

import aws.smithy.kotlin.runtime.ServiceErrorMetadata

/**
 * The request could not be fulfilled because the identity provider (IDP) that
 * was asked to verify the incoming identity token could not be reached. This is often a
 * transient error caused by network conditions. Retry the request a limited number of
 * times so that you don't exceed the request rate. If the error persists, the
 * identity provider might be down or not responding.
 */
class IdpCommunicationErrorException private constructor(builder: BuilderImpl) : StsException() {

    override val message: String? = builder.message

    init {
        sdkErrorMetadata.attributes[ServiceErrorMetadata.ErrorType] = ErrorType.Client
    }

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): IdpCommunicationErrorException = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("IdpCommunicationErrorException(")
        append("message=$message)")
    }

    override fun hashCode(): kotlin.Int {
        var result = message?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as IdpCommunicationErrorException

        if (message != other.message) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): IdpCommunicationErrorException = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): IdpCommunicationErrorException
        fun message(message: String): FluentBuilder
    }

    interface DslBuilder {
        var message: String?

        fun build(): IdpCommunicationErrorException
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var message: String? = null

        constructor(x: IdpCommunicationErrorException) : this() {
            this.message = x.message
        }

        override fun build(): IdpCommunicationErrorException = IdpCommunicationErrorException(this)
        override fun message(message: String): FluentBuilder = apply { this.message = message }
    }
}
