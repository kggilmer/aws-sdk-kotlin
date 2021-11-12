// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeFpgaImageAttributeRequest private constructor(builder: BuilderImpl) {
    /**
     * The AFI attribute.
     */
    val attribute: FpgaImageAttributeName? = builder.attribute
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The ID of the AFI.
     */
    val fpgaImageId: String? = builder.fpgaImageId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeFpgaImageAttributeRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeFpgaImageAttributeRequest(")
        append("attribute=$attribute,")
        append("dryRun=$dryRun,")
        append("fpgaImageId=$fpgaImageId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = attribute?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (fpgaImageId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeFpgaImageAttributeRequest

        if (attribute != other.attribute) return false
        if (dryRun != other.dryRun) return false
        if (fpgaImageId != other.fpgaImageId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeFpgaImageAttributeRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeFpgaImageAttributeRequest
        /**
         * The AFI attribute.
         */
        fun attribute(attribute: FpgaImageAttributeName): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The ID of the AFI.
         */
        fun fpgaImageId(fpgaImageId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The AFI attribute.
         */
        var attribute: FpgaImageAttributeName?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The ID of the AFI.
         */
        var fpgaImageId: String?

        fun build(): DescribeFpgaImageAttributeRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var attribute: FpgaImageAttributeName? = null
        override var dryRun: Boolean? = null
        override var fpgaImageId: String? = null

        constructor(x: DescribeFpgaImageAttributeRequest) : this() {
            this.attribute = x.attribute
            this.dryRun = x.dryRun
            this.fpgaImageId = x.fpgaImageId
        }

        override fun build(): DescribeFpgaImageAttributeRequest = DescribeFpgaImageAttributeRequest(this)
        override fun attribute(attribute: FpgaImageAttributeName): FluentBuilder = apply { this.attribute = attribute }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun fpgaImageId(fpgaImageId: String): FluentBuilder = apply { this.fpgaImageId = fpgaImageId }
    }
}
