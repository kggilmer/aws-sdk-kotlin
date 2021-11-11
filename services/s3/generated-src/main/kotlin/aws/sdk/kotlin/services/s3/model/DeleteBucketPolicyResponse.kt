// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class DeleteBucketPolicyResponse private constructor(builder: BuilderImpl) {

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DeleteBucketPolicyResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteBucketPolicyResponse(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        var result = javaClass.hashCode()
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DeleteBucketPolicyResponse

        return true
    }

    interface FluentBuilder {
        fun build(): DeleteBucketPolicyResponse
    }

    interface DslBuilder {

        fun build(): DeleteBucketPolicyResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {

        constructor(x: DeleteBucketPolicyResponse) : this() {
        }

        override fun build(): DeleteBucketPolicyResponse = DeleteBucketPolicyResponse(this)
    }
}
