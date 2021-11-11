// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class HypervisorType {

    abstract val value: kotlin.String

    object Ovm : aws.sdk.kotlin.services.ec2.model.HypervisorType() {
        override val value: kotlin.String = "ovm"
        override fun toString(): kotlin.String = value
    }

    object Xen : aws.sdk.kotlin.services.ec2.model.HypervisorType() {
        override val value: kotlin.String = "xen"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.HypervisorType() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.HypervisorType = when(str) {
            "ovm" -> Ovm
            "xen" -> Xen
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.HypervisorType> = listOf(
            Ovm,
            Xen
        )
    }
}
