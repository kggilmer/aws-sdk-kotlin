// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes volume attachment details.
 */
class AttachVolumeResponse private constructor(builder: BuilderImpl) {
    /**
     * The time stamp when the attachment initiated.
     */
    val attachTime: Instant? = builder.attachTime
    /**
     * Indicates whether the EBS volume is deleted on instance termination.
     */
    val deleteOnTermination: Boolean? = builder.deleteOnTermination
    /**
     * The device name.
     */
    val device: String? = builder.device
    /**
     * The ID of the instance.
     */
    val instanceId: String? = builder.instanceId
    /**
     * The attachment state of the volume.
     */
    val state: VolumeAttachmentState? = builder.state
    /**
     * The ID of the volume.
     */
    val volumeId: String? = builder.volumeId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): AttachVolumeResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("AttachVolumeResponse(")
        append("attachTime=$attachTime,")
        append("deleteOnTermination=$deleteOnTermination,")
        append("device=$device,")
        append("instanceId=$instanceId,")
        append("state=$state,")
        append("volumeId=$volumeId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = attachTime?.hashCode() ?: 0
        result = 31 * result + (deleteOnTermination?.hashCode() ?: 0)
        result = 31 * result + (device?.hashCode() ?: 0)
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (volumeId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AttachVolumeResponse

        if (attachTime != other.attachTime) return false
        if (deleteOnTermination != other.deleteOnTermination) return false
        if (device != other.device) return false
        if (instanceId != other.instanceId) return false
        if (state != other.state) return false
        if (volumeId != other.volumeId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): AttachVolumeResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): AttachVolumeResponse
        /**
         * The time stamp when the attachment initiated.
         */
        fun attachTime(attachTime: Instant): FluentBuilder
        /**
         * Indicates whether the EBS volume is deleted on instance termination.
         */
        fun deleteOnTermination(deleteOnTermination: Boolean): FluentBuilder
        /**
         * The device name.
         */
        fun device(device: String): FluentBuilder
        /**
         * The ID of the instance.
         */
        fun instanceId(instanceId: String): FluentBuilder
        /**
         * The attachment state of the volume.
         */
        fun state(state: VolumeAttachmentState): FluentBuilder
        /**
         * The ID of the volume.
         */
        fun volumeId(volumeId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The time stamp when the attachment initiated.
         */
        var attachTime: Instant?
        /**
         * Indicates whether the EBS volume is deleted on instance termination.
         */
        var deleteOnTermination: Boolean?
        /**
         * The device name.
         */
        var device: String?
        /**
         * The ID of the instance.
         */
        var instanceId: String?
        /**
         * The attachment state of the volume.
         */
        var state: VolumeAttachmentState?
        /**
         * The ID of the volume.
         */
        var volumeId: String?

        fun build(): AttachVolumeResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var attachTime: Instant? = null
        override var deleteOnTermination: Boolean? = null
        override var device: String? = null
        override var instanceId: String? = null
        override var state: VolumeAttachmentState? = null
        override var volumeId: String? = null

        constructor(x: AttachVolumeResponse) : this() {
            this.attachTime = x.attachTime
            this.deleteOnTermination = x.deleteOnTermination
            this.device = x.device
            this.instanceId = x.instanceId
            this.state = x.state
            this.volumeId = x.volumeId
        }

        override fun build(): AttachVolumeResponse = AttachVolumeResponse(this)
        override fun attachTime(attachTime: Instant): FluentBuilder = apply { this.attachTime = attachTime }
        override fun deleteOnTermination(deleteOnTermination: Boolean): FluentBuilder = apply { this.deleteOnTermination = deleteOnTermination }
        override fun device(device: String): FluentBuilder = apply { this.device = device }
        override fun instanceId(instanceId: String): FluentBuilder = apply { this.instanceId = instanceId }
        override fun state(state: VolumeAttachmentState): FluentBuilder = apply { this.state = state }
        override fun volumeId(volumeId: String): FluentBuilder = apply { this.volumeId = volumeId }
    }
}
