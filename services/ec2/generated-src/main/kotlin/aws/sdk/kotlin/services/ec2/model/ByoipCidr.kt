// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Information about an address range that is provisioned for use with your Amazon Web Services resources
 * through bring your own IP addresses (BYOIP).
 */
class ByoipCidr private constructor(builder: BuilderImpl) {
    /**
     * The address range, in CIDR notation.
     */
    val cidr: String? = builder.cidr
    /**
     * The description of the address range.
     */
    val description: String? = builder.description
    /**
     * The state of the address pool.
     */
    val state: ByoipCidrState? = builder.state
    /**
     * Upon success, contains the ID of the address pool. Otherwise, contains an error message.
     */
    val statusMessage: String? = builder.statusMessage

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ByoipCidr = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ByoipCidr(")
        append("cidr=$cidr,")
        append("description=$description,")
        append("state=$state,")
        append("statusMessage=$statusMessage)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cidr?.hashCode() ?: 0
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (statusMessage?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ByoipCidr

        if (cidr != other.cidr) return false
        if (description != other.description) return false
        if (state != other.state) return false
        if (statusMessage != other.statusMessage) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ByoipCidr = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ByoipCidr
        /**
         * The address range, in CIDR notation.
         */
        fun cidr(cidr: String): FluentBuilder
        /**
         * The description of the address range.
         */
        fun description(description: String): FluentBuilder
        /**
         * The state of the address pool.
         */
        fun state(state: ByoipCidrState): FluentBuilder
        /**
         * Upon success, contains the ID of the address pool. Otherwise, contains an error message.
         */
        fun statusMessage(statusMessage: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The address range, in CIDR notation.
         */
        var cidr: String?
        /**
         * The description of the address range.
         */
        var description: String?
        /**
         * The state of the address pool.
         */
        var state: ByoipCidrState?
        /**
         * Upon success, contains the ID of the address pool. Otherwise, contains an error message.
         */
        var statusMessage: String?

        fun build(): ByoipCidr
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var cidr: String? = null
        override var description: String? = null
        override var state: ByoipCidrState? = null
        override var statusMessage: String? = null

        constructor(x: ByoipCidr) : this() {
            this.cidr = x.cidr
            this.description = x.description
            this.state = x.state
            this.statusMessage = x.statusMessage
        }

        override fun build(): ByoipCidr = ByoipCidr(this)
        override fun cidr(cidr: String): FluentBuilder = apply { this.cidr = cidr }
        override fun description(description: String): FluentBuilder = apply { this.description = description }
        override fun state(state: ByoipCidrState): FluentBuilder = apply { this.state = state }
        override fun statusMessage(statusMessage: String): FluentBuilder = apply { this.statusMessage = statusMessage }
    }
}
