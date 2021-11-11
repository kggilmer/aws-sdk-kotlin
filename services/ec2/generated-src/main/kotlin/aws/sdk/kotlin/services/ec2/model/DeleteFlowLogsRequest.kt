// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DeleteFlowLogsRequest private constructor(builder: BuilderImpl) {
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * One or more flow log IDs.
     * Constraint: Maximum of 1000 flow log IDs.
     */
    val flowLogIds: List<String>? = builder.flowLogIds

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DeleteFlowLogsRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DeleteFlowLogsRequest(")
        append("dryRun=$dryRun,")
        append("flowLogIds=$flowLogIds)")
    }

    override fun hashCode(): kotlin.Int {
        var result = dryRun?.hashCode() ?: 0
        result = 31 * result + (flowLogIds?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DeleteFlowLogsRequest

        if (dryRun != other.dryRun) return false
        if (flowLogIds != other.flowLogIds) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DeleteFlowLogsRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DeleteFlowLogsRequest
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * One or more flow log IDs.
         * Constraint: Maximum of 1000 flow log IDs.
         */
        fun flowLogIds(flowLogIds: List<String>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * One or more flow log IDs.
         * Constraint: Maximum of 1000 flow log IDs.
         */
        var flowLogIds: List<String>?

        fun build(): DeleteFlowLogsRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var dryRun: Boolean? = null
        override var flowLogIds: List<String>? = null

        constructor(x: DeleteFlowLogsRequest) : this() {
            this.dryRun = x.dryRun
            this.flowLogIds = x.flowLogIds
        }

        override fun build(): DeleteFlowLogsRequest = DeleteFlowLogsRequest(this)
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun flowLogIds(flowLogIds: List<String>): FluentBuilder = apply { this.flowLogIds = flowLogIds }
    }
}
