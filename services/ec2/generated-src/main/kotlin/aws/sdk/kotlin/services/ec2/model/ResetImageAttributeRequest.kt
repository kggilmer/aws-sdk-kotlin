// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Contains the parameters for ResetImageAttribute.
 */
class ResetImageAttributeRequest private constructor(builder: BuilderImpl) {
    /**
     * The attribute to reset (currently you can only reset the launch permission attribute).
     */
    val attribute: ResetImageAttributeName? = builder.attribute
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * The ID of the AMI.
     */
    val imageId: String? = builder.imageId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ResetImageAttributeRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ResetImageAttributeRequest(")
        append("attribute=$attribute,")
        append("dryRun=$dryRun,")
        append("imageId=$imageId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = attribute?.hashCode() ?: 0
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (imageId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ResetImageAttributeRequest

        if (attribute != other.attribute) return false
        if (dryRun != other.dryRun) return false
        if (imageId != other.imageId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ResetImageAttributeRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ResetImageAttributeRequest
        /**
         * The attribute to reset (currently you can only reset the launch permission attribute).
         */
        fun attribute(attribute: ResetImageAttributeName): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * The ID of the AMI.
         */
        fun imageId(imageId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The attribute to reset (currently you can only reset the launch permission attribute).
         */
        var attribute: ResetImageAttributeName?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * The ID of the AMI.
         */
        var imageId: String?

        fun build(): ResetImageAttributeRequest
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var attribute: ResetImageAttributeName? = null
        override var dryRun: Boolean? = null
        override var imageId: String? = null

        constructor(x: ResetImageAttributeRequest) : this() {
            this.attribute = x.attribute
            this.dryRun = x.dryRun
            this.imageId = x.imageId
        }

        override fun build(): ResetImageAttributeRequest = ResetImageAttributeRequest(this)
        override fun attribute(attribute: ResetImageAttributeName): FluentBuilder = apply { this.attribute = attribute }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun imageId(imageId: String): FluentBuilder = apply { this.imageId = imageId }
    }
}
