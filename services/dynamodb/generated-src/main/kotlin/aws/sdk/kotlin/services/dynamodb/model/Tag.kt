// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Describes a tag. A tag is a key-value pair. You can add up to 50 tags to a single DynamoDB table.
 * AWS-assigned tag names and values are automatically assigned the aws:
 * prefix, which the user cannot assign. AWS-assigned tag names do not count towards the
 * tag limit of 50. User-assigned tag names have the prefix user: in the Cost
 * Allocation Report. You cannot backdate the application of a tag.
 * For an overview on tagging DynamoDB resources, see
 * <a href="https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/Tagging.html">Tagging for DynamoDB
 * in the Amazon DynamoDB Developer Guide.
 */
class Tag private constructor(builder: BuilderImpl) {
    /**
     * The key of the tag. Tag keys are case sensitive. Each DynamoDB table can only have up to
     * one tag with the same key. If you try to add an existing tag (same key), the existing
     * tag value will be updated to the new value.
     */
    val key: String? = builder.key
    /**
     * The value of the tag. Tag values are case-sensitive and can be null.
     */
    val value: String? = builder.value

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): Tag = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("Tag(")
        append("key=$key,")
        append("value=$value)")
    }

    override fun hashCode(): kotlin.Int {
        var result = key?.hashCode() ?: 0
        result = 31 * result + (value?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Tag

        if (key != other.key) return false
        if (value != other.value) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): Tag = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): Tag
        /**
         * The key of the tag. Tag keys are case sensitive. Each DynamoDB table can only have up to
         * one tag with the same key. If you try to add an existing tag (same key), the existing
         * tag value will be updated to the new value.
         */
        fun key(key: String): FluentBuilder
        /**
         * The value of the tag. Tag values are case-sensitive and can be null.
         */
        fun value(value: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The key of the tag. Tag keys are case sensitive. Each DynamoDB table can only have up to
         * one tag with the same key. If you try to add an existing tag (same key), the existing
         * tag value will be updated to the new value.
         */
        var key: String?
        /**
         * The value of the tag. Tag values are case-sensitive and can be null.
         */
        var value: String?

        fun build(): Tag
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var key: String? = null
        override var value: String? = null

        constructor(x: Tag) : this() {
            this.key = x.key
            this.value = x.value
        }

        override fun build(): Tag = Tag(this)
        override fun key(key: String): FluentBuilder = apply { this.key = key }
        override fun value(value: String): FluentBuilder = apply { this.value = value }
    }
}
