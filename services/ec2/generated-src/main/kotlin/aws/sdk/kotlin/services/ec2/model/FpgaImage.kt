// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model

import aws.smithy.kotlin.runtime.time.Instant

/**
 * Describes an Amazon FPGA image (AFI).
 */
class FpgaImage private constructor(builder: BuilderImpl) {
    /**
     * The date and time the AFI was created.
     */
    val createTime: Instant? = builder.createTime
    /**
     * Indicates whether data retention support is enabled for the AFI.
     */
    val dataRetentionSupport: Boolean? = builder.dataRetentionSupport
    /**
     * The description of the AFI.
     */
    val description: String? = builder.description
    /**
     * The global FPGA image identifier (AGFI ID).
     */
    val fpgaImageGlobalId: String? = builder.fpgaImageGlobalId
    /**
     * The FPGA image identifier (AFI ID).
     */
    val fpgaImageId: String? = builder.fpgaImageId
    /**
     * The name of the AFI.
     */
    val name: String? = builder.name
    /**
     * The alias of the AFI owner. Possible values include self, amazon, and aws-marketplace.
     */
    val ownerAlias: String? = builder.ownerAlias
    /**
     * The ID of the Amazon Web Services account that owns the AFI.
     */
    val ownerId: String? = builder.ownerId
    /**
     * Information about the PCI bus.
     */
    val pciId: PciId? = builder.pciId
    /**
     * The product codes for the AFI.
     */
    val productCodes: List<ProductCode>? = builder.productCodes
    /**
     * Indicates whether the AFI is public.
     */
    val public: Boolean? = builder.public
    /**
     * The version of the Amazon Web Services Shell that was used to create the bitstream.
     */
    val shellVersion: String? = builder.shellVersion
    /**
     * Information about the state of the AFI.
     */
    val state: FpgaImageState? = builder.state
    /**
     * Any tags assigned to the AFI.
     */
    val tags: List<Tag>? = builder.tags
    /**
     * The time of the most recent update to the AFI.
     */
    val updateTime: Instant? = builder.updateTime

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): FpgaImage = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("FpgaImage(")
        append("createTime=$createTime,")
        append("dataRetentionSupport=$dataRetentionSupport,")
        append("description=$description,")
        append("fpgaImageGlobalId=$fpgaImageGlobalId,")
        append("fpgaImageId=$fpgaImageId,")
        append("name=$name,")
        append("ownerAlias=$ownerAlias,")
        append("ownerId=$ownerId,")
        append("pciId=$pciId,")
        append("productCodes=$productCodes,")
        append("public=$public,")
        append("shellVersion=$shellVersion,")
        append("state=$state,")
        append("tags=$tags,")
        append("updateTime=$updateTime)")
    }

    override fun hashCode(): kotlin.Int {
        var result = createTime?.hashCode() ?: 0
        result = 31 * result + (dataRetentionSupport?.hashCode() ?: 0)
        result = 31 * result + (description?.hashCode() ?: 0)
        result = 31 * result + (fpgaImageGlobalId?.hashCode() ?: 0)
        result = 31 * result + (fpgaImageId?.hashCode() ?: 0)
        result = 31 * result + (name?.hashCode() ?: 0)
        result = 31 * result + (ownerAlias?.hashCode() ?: 0)
        result = 31 * result + (ownerId?.hashCode() ?: 0)
        result = 31 * result + (pciId?.hashCode() ?: 0)
        result = 31 * result + (productCodes?.hashCode() ?: 0)
        result = 31 * result + (public?.hashCode() ?: 0)
        result = 31 * result + (shellVersion?.hashCode() ?: 0)
        result = 31 * result + (state?.hashCode() ?: 0)
        result = 31 * result + (tags?.hashCode() ?: 0)
        result = 31 * result + (updateTime?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as FpgaImage

        if (createTime != other.createTime) return false
        if (dataRetentionSupport != other.dataRetentionSupport) return false
        if (description != other.description) return false
        if (fpgaImageGlobalId != other.fpgaImageGlobalId) return false
        if (fpgaImageId != other.fpgaImageId) return false
        if (name != other.name) return false
        if (ownerAlias != other.ownerAlias) return false
        if (ownerId != other.ownerId) return false
        if (pciId != other.pciId) return false
        if (productCodes != other.productCodes) return false
        if (public != other.public) return false
        if (shellVersion != other.shellVersion) return false
        if (state != other.state) return false
        if (tags != other.tags) return false
        if (updateTime != other.updateTime) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): FpgaImage = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): FpgaImage
        /**
         * The date and time the AFI was created.
         */
        fun createTime(createTime: Instant): FluentBuilder
        /**
         * Indicates whether data retention support is enabled for the AFI.
         */
        fun dataRetentionSupport(dataRetentionSupport: Boolean): FluentBuilder
        /**
         * The description of the AFI.
         */
        fun description(description: String): FluentBuilder
        /**
         * The global FPGA image identifier (AGFI ID).
         */
        fun fpgaImageGlobalId(fpgaImageGlobalId: String): FluentBuilder
        /**
         * The FPGA image identifier (AFI ID).
         */
        fun fpgaImageId(fpgaImageId: String): FluentBuilder
        /**
         * The name of the AFI.
         */
        fun name(name: String): FluentBuilder
        /**
         * The alias of the AFI owner. Possible values include self, amazon, and aws-marketplace.
         */
        fun ownerAlias(ownerAlias: String): FluentBuilder
        /**
         * The ID of the Amazon Web Services account that owns the AFI.
         */
        fun ownerId(ownerId: String): FluentBuilder
        /**
         * Information about the PCI bus.
         */
        fun pciId(pciId: PciId): FluentBuilder
        /**
         * The product codes for the AFI.
         */
        fun productCodes(productCodes: List<ProductCode>): FluentBuilder
        /**
         * Indicates whether the AFI is public.
         */
        fun public(public: Boolean): FluentBuilder
        /**
         * The version of the Amazon Web Services Shell that was used to create the bitstream.
         */
        fun shellVersion(shellVersion: String): FluentBuilder
        /**
         * Information about the state of the AFI.
         */
        fun state(state: FpgaImageState): FluentBuilder
        /**
         * Any tags assigned to the AFI.
         */
        fun tags(tags: List<Tag>): FluentBuilder
        /**
         * The time of the most recent update to the AFI.
         */
        fun updateTime(updateTime: Instant): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The date and time the AFI was created.
         */
        var createTime: Instant?
        /**
         * Indicates whether data retention support is enabled for the AFI.
         */
        var dataRetentionSupport: Boolean?
        /**
         * The description of the AFI.
         */
        var description: String?
        /**
         * The global FPGA image identifier (AGFI ID).
         */
        var fpgaImageGlobalId: String?
        /**
         * The FPGA image identifier (AFI ID).
         */
        var fpgaImageId: String?
        /**
         * The name of the AFI.
         */
        var name: String?
        /**
         * The alias of the AFI owner. Possible values include self, amazon, and aws-marketplace.
         */
        var ownerAlias: String?
        /**
         * The ID of the Amazon Web Services account that owns the AFI.
         */
        var ownerId: String?
        /**
         * Information about the PCI bus.
         */
        var pciId: PciId?
        /**
         * The product codes for the AFI.
         */
        var productCodes: List<ProductCode>?
        /**
         * Indicates whether the AFI is public.
         */
        var public: Boolean?
        /**
         * The version of the Amazon Web Services Shell that was used to create the bitstream.
         */
        var shellVersion: String?
        /**
         * Information about the state of the AFI.
         */
        var state: FpgaImageState?
        /**
         * Any tags assigned to the AFI.
         */
        var tags: List<Tag>?
        /**
         * The time of the most recent update to the AFI.
         */
        var updateTime: Instant?

        fun build(): FpgaImage
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.PciId] inside the given [block]
         */
        fun pciId(block: PciId.DslBuilder.() -> kotlin.Unit) {
            this.pciId = PciId.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.FpgaImageState] inside the given [block]
         */
        fun state(block: FpgaImageState.DslBuilder.() -> kotlin.Unit) {
            this.state = FpgaImageState.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var createTime: Instant? = null
        override var dataRetentionSupport: Boolean? = null
        override var description: String? = null
        override var fpgaImageGlobalId: String? = null
        override var fpgaImageId: String? = null
        override var name: String? = null
        override var ownerAlias: String? = null
        override var ownerId: String? = null
        override var pciId: PciId? = null
        override var productCodes: List<ProductCode>? = null
        override var public: Boolean? = null
        override var shellVersion: String? = null
        override var state: FpgaImageState? = null
        override var tags: List<Tag>? = null
        override var updateTime: Instant? = null

        constructor(x: FpgaImage) : this() {
            this.createTime = x.createTime
            this.dataRetentionSupport = x.dataRetentionSupport
            this.description = x.description
            this.fpgaImageGlobalId = x.fpgaImageGlobalId
            this.fpgaImageId = x.fpgaImageId
            this.name = x.name
            this.ownerAlias = x.ownerAlias
            this.ownerId = x.ownerId
            this.pciId = x.pciId
            this.productCodes = x.productCodes
            this.public = x.public
            this.shellVersion = x.shellVersion
            this.state = x.state
            this.tags = x.tags
            this.updateTime = x.updateTime
        }

        override fun build(): FpgaImage = FpgaImage(this)
        override fun createTime(createTime: Instant): FluentBuilder = apply { this.createTime = createTime }
        override fun dataRetentionSupport(dataRetentionSupport: Boolean): FluentBuilder = apply { this.dataRetentionSupport = dataRetentionSupport }
        override fun description(description: String): FluentBuilder = apply { this.description = description }
        override fun fpgaImageGlobalId(fpgaImageGlobalId: String): FluentBuilder = apply { this.fpgaImageGlobalId = fpgaImageGlobalId }
        override fun fpgaImageId(fpgaImageId: String): FluentBuilder = apply { this.fpgaImageId = fpgaImageId }
        override fun name(name: String): FluentBuilder = apply { this.name = name }
        override fun ownerAlias(ownerAlias: String): FluentBuilder = apply { this.ownerAlias = ownerAlias }
        override fun ownerId(ownerId: String): FluentBuilder = apply { this.ownerId = ownerId }
        override fun pciId(pciId: PciId): FluentBuilder = apply { this.pciId = pciId }
        override fun productCodes(productCodes: List<ProductCode>): FluentBuilder = apply { this.productCodes = productCodes }
        override fun public(public: Boolean): FluentBuilder = apply { this.public = public }
        override fun shellVersion(shellVersion: String): FluentBuilder = apply { this.shellVersion = shellVersion }
        override fun state(state: FpgaImageState): FluentBuilder = apply { this.state = state }
        override fun tags(tags: List<Tag>): FluentBuilder = apply { this.tags = tags }
        override fun updateTime(updateTime: Instant): FluentBuilder = apply { this.updateTime = updateTime }
    }
}
