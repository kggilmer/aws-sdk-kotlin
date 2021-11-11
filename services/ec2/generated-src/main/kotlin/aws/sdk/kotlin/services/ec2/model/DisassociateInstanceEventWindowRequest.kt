// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DisassociateInstanceEventWindowRequest private constructor(builder: BuilderImpl) {
    /**
     * One or more targets to disassociate from the specified event window.
     */
    val associationTarget: InstanceEventWindowDisassociationRequest? = builder.associationTarget
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The ID of the event window.
     */
    val instanceEventWindowId: String? = builder.instanceEventWindowId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DisassociateInstanceEventWindowRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DisassociateInstanceEventWindowRequest(")
        append("associationTarget=$associationTarget,")
        append("dryRun=$dryRun,")
        append("instanceEventWindowId=$instanceEventWindowId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = associationTarget?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (instanceEventWindowId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DisassociateInstanceEventWindowRequest

        if (associationTarget != other.associationTarget) return false
        if (dryRun != other.dryRun) return false
        if (instanceEventWindowId != other.instanceEventWindowId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DisassociateInstanceEventWindowRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DisassociateInstanceEventWindowRequest
        /**
         * One or more targets to disassociate from the specified event window.
         */
        fun associationTarget(associationTarget: InstanceEventWindowDisassociationRequest): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The ID of the event window.
         */
        fun instanceEventWindowId(instanceEventWindowId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * One or more targets to disassociate from the specified event window.
         */
        var associationTarget: InstanceEventWindowDisassociationRequest?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The ID of the event window.
         */
        var instanceEventWindowId: String?

        fun build(): DisassociateInstanceEventWindowRequest
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.InstanceEventWindowDisassociationRequest] inside the given [block]
         */
        fun associationTarget(block: InstanceEventWindowDisassociationRequest.DslBuilder.() -> kotlin.Unit) {
            this.associationTarget = InstanceEventWindowDisassociationRequest.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var associationTarget: InstanceEventWindowDisassociationRequest? = null
        override var dryRun: Boolean? = null
        override var instanceEventWindowId: String? = null

        constructor(x: DisassociateInstanceEventWindowRequest) : this() {
            this.associationTarget = x.associationTarget
            this.dryRun = x.dryRun
            this.instanceEventWindowId = x.instanceEventWindowId
        }

        override fun build(): DisassociateInstanceEventWindowRequest = DisassociateInstanceEventWindowRequest(this)
        override fun associationTarget(associationTarget: InstanceEventWindowDisassociationRequest): FluentBuilder = apply { this.associationTarget = associationTarget }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun instanceEventWindowId(instanceEventWindowId: String): FluentBuilder = apply { this.instanceEventWindowId = instanceEventWindowId }
    }
}
