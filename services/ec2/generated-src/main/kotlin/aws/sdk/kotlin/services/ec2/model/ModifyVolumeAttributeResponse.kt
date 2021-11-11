// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyVolumeAttributeResponse private constructor(builder: BuilderImpl) {

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ModifyVolumeAttributeResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyVolumeAttributeResponse(")
        append(")")
    }

    override fun hashCode(): kotlin.Int {
        var result = javaClass.hashCode()
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ModifyVolumeAttributeResponse

        return true
    }

    interface FluentBuilder {
        fun build(): ModifyVolumeAttributeResponse
    }

    interface DslBuilder {

        fun build(): ModifyVolumeAttributeResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {

        constructor(x: ModifyVolumeAttributeResponse) : this() {
        }

        override fun build(): ModifyVolumeAttributeResponse = ModifyVolumeAttributeResponse(this)
    }
}
