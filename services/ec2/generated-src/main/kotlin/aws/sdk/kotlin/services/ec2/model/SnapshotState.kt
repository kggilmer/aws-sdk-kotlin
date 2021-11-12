// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class SnapshotState {

    abstract val value: kotlin.String

    object Completed : aws.sdk.kotlin.services.ec2.model.SnapshotState() {
        override val value: kotlin.String = "completed"
        override fun toString(): kotlin.String = value
    }

    object Error : aws.sdk.kotlin.services.ec2.model.SnapshotState() {
        override val value: kotlin.String = "error"
        override fun toString(): kotlin.String = value
    }

    object Pending : aws.sdk.kotlin.services.ec2.model.SnapshotState() {
        override val value: kotlin.String = "pending"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.SnapshotState() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.SnapshotState = when(str) {
            "completed" -> Completed
            "error" -> Error
            "pending" -> Pending
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.SnapshotState> = listOf(
            Completed,
            Error,
            Pending
        )
    }
}
