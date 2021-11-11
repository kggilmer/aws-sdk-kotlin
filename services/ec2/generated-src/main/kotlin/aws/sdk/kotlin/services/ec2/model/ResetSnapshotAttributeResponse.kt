// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ResetSnapshotAttributeResponse private constructor(builder: BuilderImpl) {

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ResetSnapshotAttributeResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ResetSnapshotAttributeResponse(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        var result = javaClass.hashCode()
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ResetSnapshotAttributeResponse

        return true
    }

    interface FluentBuilder {
        fun build(): ResetSnapshotAttributeResponse
    }

    interface DslBuilder {

        fun build(): ResetSnapshotAttributeResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {

        constructor(x: ResetSnapshotAttributeResponse) : this() {
        }

        override fun build(): ResetSnapshotAttributeResponse = ResetSnapshotAttributeResponse(this)
    }
}
