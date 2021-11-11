// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.model



sealed class StorageClass {

    abstract val value: kotlin.String

    object DeepArchive : aws.sdk.kotlin.services.s3.model.StorageClass() {
        override val value: kotlin.String = "DEEP_ARCHIVE"
        override fun toString(): kotlin.String = value
    }

    object Glacier : aws.sdk.kotlin.services.s3.model.StorageClass() {
        override val value: kotlin.String = "GLACIER"
        override fun toString(): kotlin.String = value
    }

    object IntelligentTiering : aws.sdk.kotlin.services.s3.model.StorageClass() {
        override val value: kotlin.String = "INTELLIGENT_TIERING"
        override fun toString(): kotlin.String = value
    }

    object OnezoneIa : aws.sdk.kotlin.services.s3.model.StorageClass() {
        override val value: kotlin.String = "ONEZONE_IA"
        override fun toString(): kotlin.String = value
    }

    object Outposts : aws.sdk.kotlin.services.s3.model.StorageClass() {
        override val value: kotlin.String = "OUTPOSTS"
        override fun toString(): kotlin.String = value
    }

    object ReducedRedundancy : aws.sdk.kotlin.services.s3.model.StorageClass() {
        override val value: kotlin.String = "REDUCED_REDUNDANCY"
        override fun toString(): kotlin.String = value
    }

    object Standard : aws.sdk.kotlin.services.s3.model.StorageClass() {
        override val value: kotlin.String = "STANDARD"
        override fun toString(): kotlin.String = value
    }

    object StandardIa : aws.sdk.kotlin.services.s3.model.StorageClass() {
        override val value: kotlin.String = "STANDARD_IA"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.s3.model.StorageClass() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.s3.model.StorageClass = when(str) {
            "DEEP_ARCHIVE" -> DeepArchive
            "GLACIER" -> Glacier
            "INTELLIGENT_TIERING" -> IntelligentTiering
            "ONEZONE_IA" -> OnezoneIa
            "OUTPOSTS" -> Outposts
            "REDUCED_REDUNDANCY" -> ReducedRedundancy
            "STANDARD" -> Standard
            "STANDARD_IA" -> StandardIa
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.s3.model.StorageClass> = listOf(
            DeepArchive,
            Glacier,
            IntelligentTiering,
            OnezoneIa,
            Outposts,
            ReducedRedundancy,
            Standard,
            StandardIa
        )
    }
}
