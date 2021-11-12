// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class TrafficDirection {

    abstract val value: kotlin.String

    object Egress : aws.sdk.kotlin.services.ec2.model.TrafficDirection() {
        override val value: kotlin.String = "egress"
        override fun toString(): kotlin.String = value
    }

    object Ingress : aws.sdk.kotlin.services.ec2.model.TrafficDirection() {
        override val value: kotlin.String = "ingress"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.TrafficDirection() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.TrafficDirection = when(str) {
            "egress" -> Egress
            "ingress" -> Ingress
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.TrafficDirection> = listOf(
            Egress,
            Ingress
        )
    }
}
