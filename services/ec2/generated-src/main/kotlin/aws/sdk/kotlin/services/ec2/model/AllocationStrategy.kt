// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



sealed class AllocationStrategy {

    abstract val value: kotlin.String

    object CapacityOptimized : aws.sdk.kotlin.services.ec2.model.AllocationStrategy() {
        override val value: kotlin.String = "capacityOptimized"
        override fun toString(): kotlin.String = value
    }

    object CapacityOptimizedPrioritized : aws.sdk.kotlin.services.ec2.model.AllocationStrategy() {
        override val value: kotlin.String = "capacityOptimizedPrioritized"
        override fun toString(): kotlin.String = value
    }

    object Diversified : aws.sdk.kotlin.services.ec2.model.AllocationStrategy() {
        override val value: kotlin.String = "diversified"
        override fun toString(): kotlin.String = value
    }

    object LowestPrice : aws.sdk.kotlin.services.ec2.model.AllocationStrategy() {
        override val value: kotlin.String = "lowestPrice"
        override fun toString(): kotlin.String = value
    }

    data class SdkUnknown(override val value: kotlin.String) : aws.sdk.kotlin.services.ec2.model.AllocationStrategy() {
        override fun toString(): kotlin.String = value
    }

    companion object {
        /**
         * Convert a raw value to one of the sealed variants or [SdkUnknown]
         */
        fun fromValue(str: kotlin.String): aws.sdk.kotlin.services.ec2.model.AllocationStrategy = when(str) {
            "capacityOptimized" -> CapacityOptimized
            "capacityOptimizedPrioritized" -> CapacityOptimizedPrioritized
            "diversified" -> Diversified
            "lowestPrice" -> LowestPrice
            else -> SdkUnknown(str)
        }

        /**
         * Get a list of all possible variants
         */
        fun values(): kotlin.collections.List<aws.sdk.kotlin.services.ec2.model.AllocationStrategy> = listOf(
            CapacityOptimized,
            CapacityOptimizedPrioritized,
            Diversified,
            LowestPrice
        )
    }
}
