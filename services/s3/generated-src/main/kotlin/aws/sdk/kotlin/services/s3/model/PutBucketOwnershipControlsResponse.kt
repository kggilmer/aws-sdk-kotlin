// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



class PutBucketOwnershipControlsResponse private constructor(builder: BuilderImpl) {

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): PutBucketOwnershipControlsResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("PutBucketOwnershipControlsResponse(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        var result = javaClass.hashCode()
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PutBucketOwnershipControlsResponse

        return true
    }

    interface FluentBuilder {
        fun build(): PutBucketOwnershipControlsResponse
    }

    interface DslBuilder {

        fun build(): PutBucketOwnershipControlsResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {

        constructor(x: PutBucketOwnershipControlsResponse) : this() {
        }

        override fun build(): PutBucketOwnershipControlsResponse = PutBucketOwnershipControlsResponse(this)
    }
}
