// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the status of an Elastic Graphics accelerator.
 */
class ElasticGpuHealth private constructor(builder: BuilderImpl) {
    /**
     * The health status.
     */
    val status: ElasticGpuStatus? = builder.status

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ElasticGpuHealth = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ElasticGpuHealth(")
        append("status=$status)")
    }

    override fun hashCode(): kotlin.Int {
        var result = status?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ElasticGpuHealth

        if (status != other.status) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ElasticGpuHealth = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ElasticGpuHealth
        /**
         * The health status.
         */
        fun status(status: ElasticGpuStatus): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The health status.
         */
        var status: ElasticGpuStatus?

        fun build(): ElasticGpuHealth
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var status: ElasticGpuStatus? = null

        constructor(x: ElasticGpuHealth) : this() {
            this.status = x.status
        }

        override fun build(): ElasticGpuHealth = ElasticGpuHealth(this)
        override fun status(status: ElasticGpuStatus): FluentBuilder = apply { this.status = status }
    }
}
