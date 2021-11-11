// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.model



/**
 * Represents the properties of a replica.
 */
class Replica private constructor(builder: BuilderImpl) {
    /**
     * The Region where the replica needs to be created.
     */
    val regionName: String? = builder.regionName

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): Replica = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("Replica(")
        append("regionName=$regionName)")
    }

    override fun hashCode(): kotlin.Int {
        var result = regionName?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Replica

        if (regionName != other.regionName) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): Replica = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): Replica
        /**
         * The Region where the replica needs to be created.
         */
        fun regionName(regionName: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The Region where the replica needs to be created.
         */
        var regionName: String?

        fun build(): Replica
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var regionName: String? = null

        constructor(x: Replica) : this() {
            this.regionName = x.regionName
        }

        override fun build(): Replica = Replica(this)
        override fun regionName(regionName: String): FluentBuilder = apply { this.regionName = regionName }
    }
}
