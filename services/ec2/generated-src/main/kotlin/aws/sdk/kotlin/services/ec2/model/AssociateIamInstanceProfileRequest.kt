// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class AssociateIamInstanceProfileRequest private constructor(builder: BuilderImpl) {
    /**
     * The IAM instance profile.
     */
    val iamInstanceProfile: IamInstanceProfileSpecification? = builder.iamInstanceProfile
    /**
     * The ID of the instance.
     */
    val instanceId: String? = builder.instanceId

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): AssociateIamInstanceProfileRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("AssociateIamInstanceProfileRequest(")
        append("iamInstanceProfile=$iamInstanceProfile,")
        append("instanceId=$instanceId)")
    }

    override fun hashCode(): kotlin.Int {
        var result = iamInstanceProfile?.hashCode() ?: 0
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AssociateIamInstanceProfileRequest

        if (iamInstanceProfile != other.iamInstanceProfile) return false
        if (instanceId != other.instanceId) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): AssociateIamInstanceProfileRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): AssociateIamInstanceProfileRequest
        /**
         * The IAM instance profile.
         */
        fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileSpecification): FluentBuilder
        /**
         * The ID of the instance.
         */
        fun instanceId(instanceId: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The IAM instance profile.
         */
        var iamInstanceProfile: IamInstanceProfileSpecification?
        /**
         * The ID of the instance.
         */
        var instanceId: String?

        fun build(): AssociateIamInstanceProfileRequest
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.IamInstanceProfileSpecification] inside the given [block]
         */
        fun iamInstanceProfile(block: IamInstanceProfileSpecification.DslBuilder.() -> kotlin.Unit) {
            this.iamInstanceProfile = IamInstanceProfileSpecification.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var iamInstanceProfile: IamInstanceProfileSpecification? = null
        override var instanceId: String? = null

        constructor(x: AssociateIamInstanceProfileRequest) : this() {
            this.iamInstanceProfile = x.iamInstanceProfile
            this.instanceId = x.instanceId
        }

        override fun build(): AssociateIamInstanceProfileRequest = AssociateIamInstanceProfileRequest(this)
        override fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileSpecification): FluentBuilder = apply { this.iamInstanceProfile = iamInstanceProfile }
        override fun instanceId(instanceId: String): FluentBuilder = apply { this.instanceId = instanceId }
    }
}
