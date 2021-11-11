// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class DescribeVolumesModificationsResponse private constructor(builder: BuilderImpl) {
    /**
     * Token for pagination, null if there are no more results
     */
    val nextToken: String? = builder.nextToken
    /**
     * Information about the volume modifications.
     */
    val volumesModifications: List<VolumeModification>? = builder.volumesModifications

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): DescribeVolumesModificationsResponse = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("DescribeVolumesModificationsResponse(")
        append("nextToken=$nextToken,")
        append("volumesModifications=$volumesModifications)")
    }

    override fun hashCode(): kotlin.Int {
        var result = nextToken?.hashCode() ?: 0
        result = 31 * result + (volumesModifications?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as DescribeVolumesModificationsResponse

        if (nextToken != other.nextToken) return false
        if (volumesModifications != other.volumesModifications) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): DescribeVolumesModificationsResponse = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): DescribeVolumesModificationsResponse
        /**
         * Token for pagination, null if there are no more results
         */
        fun nextToken(nextToken: String): FluentBuilder
        /**
         * Information about the volume modifications.
         */
        fun volumesModifications(volumesModifications: List<VolumeModification>): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Token for pagination, null if there are no more results
         */
        var nextToken: String?
        /**
         * Information about the volume modifications.
         */
        var volumesModifications: List<VolumeModification>?

        fun build(): DescribeVolumesModificationsResponse
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var nextToken: String? = null
        override var volumesModifications: List<VolumeModification>? = null

        constructor(x: DescribeVolumesModificationsResponse) : this() {
            this.nextToken = x.nextToken
            this.volumesModifications = x.volumesModifications
        }

        override fun build(): DescribeVolumesModificationsResponse = DescribeVolumesModificationsResponse(this)
        override fun nextToken(nextToken: String): FluentBuilder = apply { this.nextToken = nextToken }
        override fun volumesModifications(volumesModifications: List<VolumeModification>): FluentBuilder = apply { this.volumesModifications = volumesModifications }
    }
}
