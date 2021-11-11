// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model

import aws.smithy.kotlin.runtime.ServiceErrorMetadata

/**
 * The specified content does not exist.
 */
class NotFound private constructor(builder: BuilderImpl) : S3Exception() {

    init {
        sdkErrorMetadata.attributes[ServiceErrorMetadata.ErrorType] = ErrorType.Client
    }

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): NotFound = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("NotFound(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        var result = javaClass.hashCode()
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as NotFound

        return true
    }

    interface FluentBuilder {
        fun build(): NotFound
    }

    interface DslBuilder {

        fun build(): NotFound
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {

        constructor(x: NotFound) : this() {
        }

        override fun build(): NotFound = NotFound(this)
    }
}
