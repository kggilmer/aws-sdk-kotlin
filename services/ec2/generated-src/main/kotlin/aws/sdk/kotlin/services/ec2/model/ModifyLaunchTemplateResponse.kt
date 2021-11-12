// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyLaunchTemplateResponse private constructor(builder: BuilderImpl) {
    /**
     * Information about the launch template.
     */
    val launchTemplate: LaunchTemplate? = builder.launchTemplate

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ModifyLaunchTemplateResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyLaunchTemplateResponse(")
        append("launchTemplate=$launchTemplate)")
    }

    override fun hashCode(): kotlin.Int {
        var result = launchTemplate?.hashCode() ?: 0
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ModifyLaunchTemplateResponse

        if (launchTemplate != other.launchTemplate) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ModifyLaunchTemplateResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ModifyLaunchTemplateResponse
        /**
         * Information about the launch template.
         */
        fun launchTemplate(launchTemplate: LaunchTemplate): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Information about the launch template.
         */
        var launchTemplate: LaunchTemplate?

        fun build(): ModifyLaunchTemplateResponse
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.LaunchTemplate] inside the given [block]
         */
        fun launchTemplate(block: LaunchTemplate.DslBuilder.() -> kotlin.Unit) {
            this.launchTemplate = LaunchTemplate.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var launchTemplate: LaunchTemplate? = null

        constructor(x: ModifyLaunchTemplateResponse) : this() {
            this.launchTemplate = x.launchTemplate
        }

        override fun build(): ModifyLaunchTemplateResponse = ModifyLaunchTemplateResponse(this)
        override fun launchTemplate(launchTemplate: LaunchTemplate): FluentBuilder = apply { this.launchTemplate = launchTemplate }
    }
}
