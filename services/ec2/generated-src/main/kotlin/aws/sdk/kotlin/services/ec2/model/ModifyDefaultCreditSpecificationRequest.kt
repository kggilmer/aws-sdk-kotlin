// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyDefaultCreditSpecificationRequest private constructor(builder: BuilderImpl) {
    /**
     * The credit option for CPU usage of the instance family.
     * Valid Values: standard | unlimited
     */
    val cpuCredits: String? = builder.cpuCredits
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The instance family.
     */
    val instanceFamily: UnlimitedSupportedInstanceFamily? = builder.instanceFamily

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ModifyDefaultCreditSpecificationRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyDefaultCreditSpecificationRequest(")
        append("cpuCredits=$cpuCredits,")
        append("dryRun=$dryRun,")
        append("instanceFamily=$instanceFamily)")
    }

    override fun hashCode(): kotlin.Int {
        var result = cpuCredits?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (instanceFamily?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ModifyDefaultCreditSpecificationRequest

        if (cpuCredits != other.cpuCredits) return false
        if (dryRun != other.dryRun) return false
        if (instanceFamily != other.instanceFamily) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ModifyDefaultCreditSpecificationRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ModifyDefaultCreditSpecificationRequest
        /**
         * The credit option for CPU usage of the instance family.
         * Valid Values: standard | unlimited
         */
        fun cpuCredits(cpuCredits: String): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The instance family.
         */
        fun instanceFamily(instanceFamily: UnlimitedSupportedInstanceFamily): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The credit option for CPU usage of the instance family.
         * Valid Values: standard | unlimited
         */
        var cpuCredits: String?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The instance family.
         */
        var instanceFamily: UnlimitedSupportedInstanceFamily?

        fun build(): ModifyDefaultCreditSpecificationRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var cpuCredits: String? = null
        override var dryRun: Boolean? = null
        override var instanceFamily: UnlimitedSupportedInstanceFamily? = null

        constructor(x: ModifyDefaultCreditSpecificationRequest) : this() {
            this.cpuCredits = x.cpuCredits
            this.dryRun = x.dryRun
            this.instanceFamily = x.instanceFamily
        }

        override fun build(): ModifyDefaultCreditSpecificationRequest = ModifyDefaultCreditSpecificationRequest(this)
        override fun cpuCredits(cpuCredits: String): FluentBuilder = apply { this.cpuCredits = cpuCredits }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun instanceFamily(instanceFamily: UnlimitedSupportedInstanceFamily): FluentBuilder = apply { this.instanceFamily = instanceFamily }
    }
}
