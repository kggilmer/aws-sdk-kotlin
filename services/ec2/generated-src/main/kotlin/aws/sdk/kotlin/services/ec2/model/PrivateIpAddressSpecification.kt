// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes a secondary private IPv4 address for a network interface.
 */
class PrivateIpAddressSpecification private constructor(builder: BuilderImpl) {
    /**
     * Indicates whether the private IPv4 address is the primary private IPv4 address. Only
     * one IPv4 address can be designated as primary.
     */
    val primary: Boolean? = builder.primary
    /**
     * The private IPv4 addresses.
     */
    val privateIpAddress: String? = builder.privateIpAddress

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): PrivateIpAddressSpecification = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("PrivateIpAddressSpecification(")
        append("primary=$primary,")
        append("privateIpAddress=$privateIpAddress)")
    }

    override fun hashCode(): kotlin.Int {
        var result = primary?.hashCode() ?: 0
        result = 31 * result + (privateIpAddress?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as PrivateIpAddressSpecification

        if (primary != other.primary) return false
        if (privateIpAddress != other.privateIpAddress) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): PrivateIpAddressSpecification = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): PrivateIpAddressSpecification
        /**
         * Indicates whether the private IPv4 address is the primary private IPv4 address. Only
         * one IPv4 address can be designated as primary.
         */
        fun primary(primary: Boolean): FluentBuilder
        /**
         * The private IPv4 addresses.
         */
        fun privateIpAddress(privateIpAddress: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Indicates whether the private IPv4 address is the primary private IPv4 address. Only
         * one IPv4 address can be designated as primary.
         */
        var primary: Boolean?
        /**
         * The private IPv4 addresses.
         */
        var privateIpAddress: String?

        fun build(): PrivateIpAddressSpecification
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var primary: Boolean? = null
        override var privateIpAddress: String? = null

        constructor(x: PrivateIpAddressSpecification) : this() {
            this.primary = x.primary
            this.privateIpAddress = x.privateIpAddress
        }

        override fun build(): PrivateIpAddressSpecification = PrivateIpAddressSpecification(this)
        override fun primary(primary: Boolean): FluentBuilder = apply { this.primary = primary }
        override fun privateIpAddress(privateIpAddress: String): FluentBuilder = apply { this.privateIpAddress = privateIpAddress }
    }
}
