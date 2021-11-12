// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class ServiceState {

    abstract val value: kotlin.String

    object Available : aws.sdk.kotlin.services.ec2.model.ServiceState() {
        override val value: kotlin.String = "Available"
        override fun toString(): kotlin.String = value
    }

    object Deleted : aws.sdk.kotlin.services.ec2.model.ServiceState() {
        override val value: kotlin.String = "Deleted"
        override fun toString(): kotlin.String = value
    }

    object Deleting : aws.sdk.kotlin.services.ec2.model.ServiceState() {
        override val value: kotlin.String = "Deleting"
        override fun toString(): kotlin.String = value
    }

    object Failed : aws.sdk.kotlin.services.ec2.model.ServiceState() {
        override val value: kotlin.String = "Failed"
        override fun toString(): kotlin.String = value
    }

    object Pending : aws.sdk.kotlin.services.ec2.model.ServiceState() {
        override val value: kotlin.String = "Pending"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.ServiceState() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.ServiceState = when(str) {
            "Available" -> Available
            "Deleted" -> Deleted
            "Deleting" -> Deleting
            "Failed" -> Failed
            "Pending" -> Pending
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.ServiceState> = listOf(
            Available,
            Deleted,
            Deleting,
            Failed,
            Pending
        )
    }
}
