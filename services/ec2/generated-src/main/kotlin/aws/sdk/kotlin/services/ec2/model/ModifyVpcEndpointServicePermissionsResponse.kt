// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyVpcEndpointServicePermissionsResponse private constructor(builder: BuilderImpl) {
    /**
     * Returns true if the request succeeds; otherwise, it returns an error.
     */
    val returnValue: Boolean? = builder.returnValue

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ModifyVpcEndpointServicePermissionsResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyVpcEndpointServicePermissionsResponse(")
        append("returnValue=$returnValue)")
    }

    override fun hashCode(): kotlin.Int {
        var result = returnValue?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ModifyVpcEndpointServicePermissionsResponse

        if (returnValue != other.returnValue) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ModifyVpcEndpointServicePermissionsResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ModifyVpcEndpointServicePermissionsResponse
        /**
         * Returns true if the request succeeds; otherwise, it returns an error.
         */
        fun returnValue(returnValue: Boolean): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Returns true if the request succeeds; otherwise, it returns an error.
         */
        var returnValue: Boolean?

        fun build(): ModifyVpcEndpointServicePermissionsResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var returnValue: Boolean? = null

        constructor(x: ModifyVpcEndpointServicePermissionsResponse) : this() {
            this.returnValue = x.returnValue
        }

        override fun build(): ModifyVpcEndpointServicePermissionsResponse = ModifyVpcEndpointServicePermissionsResponse(this)
        override fun returnValue(returnValue: Boolean): FluentBuilder = apply { this.returnValue = returnValue }
    }
}
