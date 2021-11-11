// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



sealed class ProjectionType {

    abstract val value: kotlin.String

    object All : aws.sdk.kotlin.services.dynamodb.model.ProjectionType() {
        override val value: kotlin.String = "ALL"
        override fun toString(): kotlin.String = value
    }

    object Include : aws.sdk.kotlin.services.dynamodb.model.ProjectionType() {
        override val value: kotlin.String = "INCLUDE"
        override fun toString(): kotlin.String = value
    }

    object KeysOnly : aws.sdk.kotlin.services.dynamodb.model.ProjectionType() {
        override val value: kotlin.String = "KEYS_ONLY"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.dynamodb.model.ProjectionType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.dynamodb.model.ProjectionType = when(str) {
            "ALL" -> All
            "INCLUDE" -> Include
            "KEYS_ONLY" -> KeysOnly
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.dynamodb.model.ProjectionType> = listOf(
            All,
            Include,
            KeysOnly
        )
    }
}
