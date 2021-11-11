// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes a volume status event.
 */
class VolumeStatusEvent private constructor(builder: BuilderImpl) {
    /**
     * A description of the event.
     */
    val description: String? = builder.description
    /**
     * The ID of this event.
     */
    val eventId: String? = builder.eventId
    /**
     * The type of this event.
     */
    val eventType: String? = builder.eventType
    /**
     * The ID of the instance associated with the event.
     */
    val instanceId: String? = builder.instanceId
    /**
     * The latest end time of the event.
     */
    val notAfter: Instant? = builder.notAfter
    /**
     * The earliest start time of the event.
     */
    val notBefore: Instant? = builder.notBefore

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): VolumeStatusEvent = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("VolumeStatusEvent(")
        append("description=$description,")
        append("eventId=$eventId,")
        append("eventType=$eventType,")
        append("instanceId=$instanceId,")
        append("notAfter=$notAfter,")
        append("notBefore=$notBefore)")
    }

    override fun hashCode(): kotlin.Int {
        var result = description?.hashCode() ?: 0
        result = 31 * result + (eventId?.hashCode() ?: 0)
        result = 31 * result + (eventType?.hashCode() ?: 0)
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (notAfter?.hashCode() ?: 0)
        result = 31 * result + (notBefore?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as VolumeStatusEvent

        if (description != other.description) return false
        if (eventId != other.eventId) return false
        if (eventType != other.eventType) return false
        if (instanceId != other.instanceId) return false
        if (notAfter != other.notAfter) return false
        if (notBefore != other.notBefore) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): VolumeStatusEvent = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): VolumeStatusEvent
        /**
         * A description of the event.
         */
        fun description(description: String): FluentBuilder
        /**
         * The ID of this event.
         */
        fun eventId(eventId: String): FluentBuilder
        /**
         * The type of this event.
         */
        fun eventType(eventType: String): FluentBuilder
        /**
         * The ID of the instance associated with the event.
         */
        fun instanceId(instanceId: String): FluentBuilder
        /**
         * The latest end time of the event.
         */
        fun notAfter(notAfter: Instant): FluentBuilder
        /**
         * The earliest start time of the event.
         */
        fun notBefore(notBefore: Instant): FluentBuilder
    }

    interface DslBuilder {
        /**
         * A description of the event.
         */
        var description: String?
        /**
         * The ID of this event.
         */
        var eventId: String?
        /**
         * The type of this event.
         */
        var eventType: String?
        /**
         * The ID of the instance associated with the event.
         */
        var instanceId: String?
        /**
         * The latest end time of the event.
         */
        var notAfter: Instant?
        /**
         * The earliest start time of the event.
         */
        var notBefore: Instant?

        fun build(): VolumeStatusEvent
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var description: String? = null
        override var eventId: String? = null
        override var eventType: String? = null
        override var instanceId: String? = null
        override var notAfter: Instant? = null
        override var notBefore: Instant? = null

        constructor(x: VolumeStatusEvent) : this() {
            this.description = x.description
            this.eventId = x.eventId
            this.eventType = x.eventType
            this.instanceId = x.instanceId
            this.notAfter = x.notAfter
            this.notBefore = x.notBefore
        }

        override fun build(): VolumeStatusEvent = VolumeStatusEvent(this)
        override fun description(description: String): FluentBuilder = apply { this.description = description }
        override fun eventId(eventId: String): FluentBuilder = apply { this.eventId = eventId }
        override fun eventType(eventType: String): FluentBuilder = apply { this.eventType = eventType }
        override fun instanceId(instanceId: String): FluentBuilder = apply { this.instanceId = instanceId }
        override fun notAfter(notAfter: Instant): FluentBuilder = apply { this.notAfter = notAfter }
        override fun notBefore(notBefore: Instant): FluentBuilder = apply { this.notBefore = notBefore }
    }
}
