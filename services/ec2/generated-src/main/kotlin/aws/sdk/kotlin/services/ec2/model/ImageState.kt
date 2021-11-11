// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class ImageState {

    abstract val value: kotlin.String

    object Available : aws.sdk.kotlin.services.ec2.model.ImageState() {
        override val value: kotlin.String = "available"
        override fun toString(): kotlin.String = value
    }

    object Deregistered : aws.sdk.kotlin.services.ec2.model.ImageState() {
        override val value: kotlin.String = "deregistered"
        override fun toString(): kotlin.String = value
    }

    object Error : aws.sdk.kotlin.services.ec2.model.ImageState() {
        override val value: kotlin.String = "error"
        override fun toString(): kotlin.String = value
    }

    object Failed : aws.sdk.kotlin.services.ec2.model.ImageState() {
        override val value: kotlin.String = "failed"
        override fun toString(): kotlin.String = value
    }

    object Invalid : aws.sdk.kotlin.services.ec2.model.ImageState() {
        override val value: kotlin.String = "invalid"
        override fun toString(): kotlin.String = value
    }

    object Pending : aws.sdk.kotlin.services.ec2.model.ImageState() {
        override val value: kotlin.String = "pending"
        override fun toString(): kotlin.String = value
    }

    object Transient : aws.sdk.kotlin.services.ec2.model.ImageState() {
        override val value: kotlin.String = "transient"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.ImageState() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.ImageState = when(str) {
            "available" -> Available
            "deregistered" -> Deregistered
            "error" -> Error
            "failed" -> Failed
            "invalid" -> Invalid
            "pending" -> Pending
            "transient" -> Transient
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.ImageState> = listOf(
            Available,
            Deregistered,
            Error,
            Failed,
            Invalid,
            Pending,
            Transient
        )
    }
}
