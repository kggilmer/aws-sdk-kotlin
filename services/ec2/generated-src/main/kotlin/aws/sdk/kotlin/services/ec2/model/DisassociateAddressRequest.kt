// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DisassociateAddressRequest private constructor(builder: BuilderImpl) {
    /**
     * &#91;EC2-VPC&#93; The association ID. Required for EC2-VPC.
     */
    val associationId: String? = builder.associationId
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * &#91;EC2-Classic&#93; The Elastic IP address. Required for EC2-Classic.
     */
    val publicIp: String? = builder.publicIp

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DisassociateAddressRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DisassociateAddressRequest(")
        append("associationId=$associationId,")
        append("dryRun=$dryRun,")
        append("publicIp=$publicIp)")
    }

    override fun hashCode(): kotlin.Int {
        var result = associationId?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (publicIp?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DisassociateAddressRequest

        if (associationId != other.associationId) return false
        if (dryRun != other.dryRun) return false
        if (publicIp != other.publicIp) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DisassociateAddressRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DisassociateAddressRequest
        /**
         * &#91;EC2-VPC&#93; The association ID. Required for EC2-VPC.
         */
        fun associationId(associationId: String): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * &#91;EC2-Classic&#93; The Elastic IP address. Required for EC2-Classic.
         */
        fun publicIp(publicIp: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * &#91;EC2-VPC&#93; The association ID. Required for EC2-VPC.
         */
        var associationId: String?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * &#91;EC2-Classic&#93; The Elastic IP address. Required for EC2-Classic.
         */
        var publicIp: String?

        fun build(): DisassociateAddressRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var associationId: String? = null
        override var dryRun: Boolean? = null
        override var publicIp: String? = null

        constructor(x: DisassociateAddressRequest) : this() {
            this.associationId = x.associationId
            this.dryRun = x.dryRun
            this.publicIp = x.publicIp
        }

        override fun build(): DisassociateAddressRequest = DisassociateAddressRequest(this)
        override fun associationId(associationId: String): FluentBuilder = apply { this.associationId = associationId }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun publicIp(publicIp: String): FluentBuilder = apply { this.publicIp = publicIp }
    }
}
