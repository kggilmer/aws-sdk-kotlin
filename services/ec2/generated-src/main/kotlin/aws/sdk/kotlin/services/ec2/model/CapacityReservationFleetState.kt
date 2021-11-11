// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class CapacityReservationFleetState {

    abstract val value: kotlin.String

    object Active : aws.sdk.kotlin.services.ec2.model.CapacityReservationFleetState() {
        override val value: kotlin.String = "active"
        override fun toString(): kotlin.String = value
    }

    object Cancelled : aws.sdk.kotlin.services.ec2.model.CapacityReservationFleetState() {
        override val value: kotlin.String = "cancelled"
        override fun toString(): kotlin.String = value
    }

    object Cancelling : aws.sdk.kotlin.services.ec2.model.CapacityReservationFleetState() {
        override val value: kotlin.String = "cancelling"
        override fun toString(): kotlin.String = value
    }

    object Expired : aws.sdk.kotlin.services.ec2.model.CapacityReservationFleetState() {
        override val value: kotlin.String = "expired"
        override fun toString(): kotlin.String = value
    }

    object Expiring : aws.sdk.kotlin.services.ec2.model.CapacityReservationFleetState() {
        override val value: kotlin.String = "expiring"
        override fun toString(): kotlin.String = value
    }

    object Failed : aws.sdk.kotlin.services.ec2.model.CapacityReservationFleetState() {
        override val value: kotlin.String = "failed"
        override fun toString(): kotlin.String = value
    }

    object Modifying : aws.sdk.kotlin.services.ec2.model.CapacityReservationFleetState() {
        override val value: kotlin.String = "modifying"
        override fun toString(): kotlin.String = value
    }

    object PartiallyFulfilled : aws.sdk.kotlin.services.ec2.model.CapacityReservationFleetState() {
        override val value: kotlin.String = "partially_fulfilled"
        override fun toString(): kotlin.String = value
    }

    object Submitted : aws.sdk.kotlin.services.ec2.model.CapacityReservationFleetState() {
        override val value: kotlin.String = "submitted"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.CapacityReservationFleetState() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.CapacityReservationFleetState = when(str) {
            "active" -> Active
            "cancelled" -> Cancelled
            "cancelling" -> Cancelling
            "expired" -> Expired
            "expiring" -> Expiring
            "failed" -> Failed
            "modifying" -> Modifying
            "partially_fulfilled" -> PartiallyFulfilled
            "submitted" -> Submitted
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.CapacityReservationFleetState> = listOf(
            Active,
            Cancelled,
            Cancelling,
            Expired,
            Expiring,
            Failed,
            Modifying,
            PartiallyFulfilled,
            Submitted
        )
    }
}
