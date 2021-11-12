// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class CreateDefaultSubnetResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about the subnet.
     */
    val subnet: Subnet? = builder.subnet

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): CreateDefaultSubnetResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("CreateDefaultSubnetResponse(")
        append("subnet=$subnet)")
    }

    override fun hashCode(): kotlin.Int {
        var result = subnet?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as CreateDefaultSubnetResponse

        if (subnet != other.subnet) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): CreateDefaultSubnetResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): CreateDefaultSubnetResponse
        /**
         * Information about the subnet.
         */
        fun subnet(subnet: Subnet): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the subnet.
         */
        var subnet: Subnet?

        fun build(): CreateDefaultSubnetResponse
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.Subnet] inside the given [block]
         */
        fun subnet(block: Subnet.DslBuilder.() -> kotlin.Unit) {
            this.subnet = Subnet.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var subnet: Subnet? = null

        constructor(x: CreateDefaultSubnetResponse) : this() {
            this.subnet = x.subnet
        }

        override fun build(): CreateDefaultSubnetResponse = CreateDefaultSubnetResponse(this)
        override fun subnet(subnet: Subnet): FluentBuilder = apply { this.subnet = subnet }
    }
}
