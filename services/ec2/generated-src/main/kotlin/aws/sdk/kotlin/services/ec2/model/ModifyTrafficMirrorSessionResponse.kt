// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyTrafficMirrorSessionResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about the Traffic Mirror session.
     */
    val trafficMirrorSession: TrafficMirrorSession? = builder.trafficMirrorSession

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ModifyTrafficMirrorSessionResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyTrafficMirrorSessionResponse(")
        append("trafficMirrorSession=$trafficMirrorSession)")
    }

    override fun hashCode(): kotlin.Int {
        var result = trafficMirrorSession?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ModifyTrafficMirrorSessionResponse

        if (trafficMirrorSession != other.trafficMirrorSession) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ModifyTrafficMirrorSessionResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ModifyTrafficMirrorSessionResponse
        /**
         * Information about the Traffic Mirror session.
         */
        fun trafficMirrorSession(trafficMirrorSession: TrafficMirrorSession): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the Traffic Mirror session.
         */
        var trafficMirrorSession: TrafficMirrorSession?

        fun build(): ModifyTrafficMirrorSessionResponse
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.TrafficMirrorSession] inside the given [block]
         */
        fun trafficMirrorSession(block: TrafficMirrorSession.DslBuilder.() -> kotlin.Unit) {
            this.trafficMirrorSession = TrafficMirrorSession.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var trafficMirrorSession: TrafficMirrorSession? = null

        constructor(x: ModifyTrafficMirrorSessionResponse) : this() {
            this.trafficMirrorSession = x.trafficMirrorSession
        }

        override fun build(): ModifyTrafficMirrorSessionResponse = ModifyTrafficMirrorSessionResponse(this)
        override fun trafficMirrorSession(trafficMirrorSession: TrafficMirrorSession): FluentBuilder = apply { this.trafficMirrorSession = trafficMirrorSession }
    }
}
