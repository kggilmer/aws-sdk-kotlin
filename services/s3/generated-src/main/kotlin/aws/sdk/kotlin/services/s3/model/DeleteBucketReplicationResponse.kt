// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class DeleteBucketReplicationResponse private constructor(builder: BuilderImpl) {

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DeleteBucketReplicationResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteBucketReplicationResponse(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        var result = javaClass.hashCode()
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DeleteBucketReplicationResponse

        return true
    }

    interface FluentBuilder {
        fun build(): DeleteBucketReplicationResponse
    }

    interface DslBuilder {

        fun build(): DeleteBucketReplicationResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {

        constructor(x: DeleteBucketReplicationResponse) : this() {
        }

        override fun build(): DeleteBucketReplicationResponse = DeleteBucketReplicationResponse(this)
    }
}
