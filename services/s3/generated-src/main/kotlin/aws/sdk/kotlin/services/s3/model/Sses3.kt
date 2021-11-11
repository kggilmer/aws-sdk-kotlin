// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



/**
 * Specifies the use of SSE-S3 to encrypt delivered inventory reports.
 */
class Sses3 private constructor(builder: BuilderImpl) {

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): Sses3 = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("Sses3(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        var result = javaClass.hashCode()
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Sses3

        return true
    }

    interface FluentBuilder {
        fun build(): Sses3
    }

    interface DslBuilder {

        fun build(): Sses3
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {

        constructor(x: Sses3) : this() {
        }

        override fun build(): Sses3 = Sses3(this)
    }
}
