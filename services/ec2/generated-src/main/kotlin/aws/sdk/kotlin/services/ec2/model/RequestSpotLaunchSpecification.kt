// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



/**
 * Describes the launch specification for an instance.
 */
class RequestSpotLaunchSpecification private constructor(builder: BuilderImpl) {
    /**
     * Deprecated.
     */
    val addressingType: String? = builder.addressingType
    /**
     * One or more block device mapping entries. You can't specify both a snapshot ID and an encryption value.
     * This is because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume,
     * it is not blank and its encryption status is used for the volume encryption status.
     */
    val blockDeviceMappings: List<BlockDeviceMapping>? = builder.blockDeviceMappings
    /**
     * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
     * Default: false
     */
    val ebsOptimized: Boolean? = builder.ebsOptimized
    /**
     * The IAM instance profile.
     */
    val iamInstanceProfile: IamInstanceProfileSpecification? = builder.iamInstanceProfile
    /**
     * The ID of the AMI.
     */
    val imageId: String? = builder.imageId
    /**
     * The instance type.
     */
    val instanceType: InstanceType? = builder.instanceType
    /**
     * The ID of the kernel.
     */
    val kernelId: String? = builder.kernelId
    /**
     * The name of the key pair.
     */
    val keyName: String? = builder.keyName
    /**
     * Indicates whether basic or detailed monitoring is enabled for the instance.
     * Default: Disabled
     */
    val monitoring: RunInstancesMonitoringEnabled? = builder.monitoring
    /**
     * One or more network interfaces. If you specify a network interface, you must specify
     * subnet IDs and security group IDs using the network interface.
     */
    val networkInterfaces: List<InstanceNetworkInterfaceSpecification>? = builder.networkInterfaces
    /**
     * The placement information for the instance.
     */
    val placement: SpotPlacement? = builder.placement
    /**
     * The ID of the RAM disk.
     */
    val ramdiskId: String? = builder.ramdiskId
    /**
     * One or more security group IDs.
     */
    val securityGroupIds: List<String>? = builder.securityGroupIds
    /**
     * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
     */
    val securityGroups: List<String>? = builder.securityGroups
    /**
     * The ID of the subnet in which to launch the instance.
     */
    val subnetId: String? = builder.subnetId
    /**
     * The Base64-encoded user data for the instance. User data is limited to 16 KB.
     */
    val userData: String? = builder.userData

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): RequestSpotLaunchSpecification = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("RequestSpotLaunchSpecification(")
        append("addressingType=$addressingType,")
        append("blockDeviceMappings=$blockDeviceMappings,")
        append("ebsOptimized=$ebsOptimized,")
        append("iamInstanceProfile=$iamInstanceProfile,")
        append("imageId=$imageId,")
        append("instanceType=$instanceType,")
        append("kernelId=$kernelId,")
        append("keyName=$keyName,")
        append("monitoring=$monitoring,")
        append("networkInterfaces=$networkInterfaces,")
        append("placement=$placement,")
        append("ramdiskId=$ramdiskId,")
        append("securityGroupIds=$securityGroupIds,")
        append("securityGroups=$securityGroups,")
        append("subnetId=$subnetId,")
        append("userData=$userData)")
    }

    override fun hashCode(): kotlin.Int {
        var result = addressingType?.hashCode() ?: 0
        result = 31 * result + (blockDeviceMappings?.hashCode() ?: 0)
        result = 31 * result + (ebsOptimized?.hashCode() ?: 0)
        result = 31 * result + (iamInstanceProfile?.hashCode() ?: 0)
        result = 31 * result + (imageId?.hashCode() ?: 0)
        result = 31 * result + (instanceType?.hashCode() ?: 0)
        result = 31 * result + (kernelId?.hashCode() ?: 0)
        result = 31 * result + (keyName?.hashCode() ?: 0)
        result = 31 * result + (monitoring?.hashCode() ?: 0)
        result = 31 * result + (networkInterfaces?.hashCode() ?: 0)
        result = 31 * result + (placement?.hashCode() ?: 0)
        result = 31 * result + (ramdiskId?.hashCode() ?: 0)
        result = 31 * result + (securityGroupIds?.hashCode() ?: 0)
        result = 31 * result + (securityGroups?.hashCode() ?: 0)
        result = 31 * result + (subnetId?.hashCode() ?: 0)
        result = 31 * result + (userData?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as RequestSpotLaunchSpecification

        if (addressingType != other.addressingType) return false
        if (blockDeviceMappings != other.blockDeviceMappings) return false
        if (ebsOptimized != other.ebsOptimized) return false
        if (iamInstanceProfile != other.iamInstanceProfile) return false
        if (imageId != other.imageId) return false
        if (instanceType != other.instanceType) return false
        if (kernelId != other.kernelId) return false
        if (keyName != other.keyName) return false
        if (monitoring != other.monitoring) return false
        if (networkInterfaces != other.networkInterfaces) return false
        if (placement != other.placement) return false
        if (ramdiskId != other.ramdiskId) return false
        if (securityGroupIds != other.securityGroupIds) return false
        if (securityGroups != other.securityGroups) return false
        if (subnetId != other.subnetId) return false
        if (userData != other.userData) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): RequestSpotLaunchSpecification = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): RequestSpotLaunchSpecification
        /**
         * Deprecated.
         */
        fun addressingType(addressingType: String): FluentBuilder
        /**
         * One or more block device mapping entries. You can't specify both a snapshot ID and an encryption value.
         * This is because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume,
         * it is not blank and its encryption status is used for the volume encryption status.
         */
        fun blockDeviceMappings(blockDeviceMappings: List<BlockDeviceMapping>): FluentBuilder
        /**
         * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
         * Default: false
         */
        fun ebsOptimized(ebsOptimized: Boolean): FluentBuilder
        /**
         * The IAM instance profile.
         */
        fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileSpecification): FluentBuilder
        /**
         * The ID of the AMI.
         */
        fun imageId(imageId: String): FluentBuilder
        /**
         * The instance type.
         */
        fun instanceType(instanceType: InstanceType): FluentBuilder
        /**
         * The ID of the kernel.
         */
        fun kernelId(kernelId: String): FluentBuilder
        /**
         * The name of the key pair.
         */
        fun keyName(keyName: String): FluentBuilder
        /**
         * Indicates whether basic or detailed monitoring is enabled for the instance.
         * Default: Disabled
         */
        fun monitoring(monitoring: RunInstancesMonitoringEnabled): FluentBuilder
        /**
         * One or more network interfaces. If you specify a network interface, you must specify
         * subnet IDs and security group IDs using the network interface.
         */
        fun networkInterfaces(networkInterfaces: List<InstanceNetworkInterfaceSpecification>): FluentBuilder
        /**
         * The placement information for the instance.
         */
        fun placement(placement: SpotPlacement): FluentBuilder
        /**
         * The ID of the RAM disk.
         */
        fun ramdiskId(ramdiskId: String): FluentBuilder
        /**
         * One or more security group IDs.
         */
        fun securityGroupIds(securityGroupIds: List<String>): FluentBuilder
        /**
         * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
         */
        fun securityGroups(securityGroups: List<String>): FluentBuilder
        /**
         * The ID of the subnet in which to launch the instance.
         */
        fun subnetId(subnetId: String): FluentBuilder
        /**
         * The Base64-encoded user data for the instance. User data is limited to 16 KB.
         */
        fun userData(userData: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * Deprecated.
         */
        var addressingType: String?
        /**
         * One or more block device mapping entries. You can't specify both a snapshot ID and an encryption value.
         * This is because only blank volumes can be encrypted on creation. If a snapshot is the basis for a volume,
         * it is not blank and its encryption status is used for the volume encryption status.
         */
        var blockDeviceMappings: List<BlockDeviceMapping>?
        /**
         * Indicates whether the instance is optimized for EBS I/O. This optimization provides dedicated throughput to Amazon EBS and an optimized configuration stack to provide optimal EBS I/O performance. This optimization isn't available with all instance types. Additional usage charges apply when using an EBS Optimized instance.
         * Default: false
         */
        var ebsOptimized: Boolean?
        /**
         * The IAM instance profile.
         */
        var iamInstanceProfile: IamInstanceProfileSpecification?
        /**
         * The ID of the AMI.
         */
        var imageId: String?
        /**
         * The instance type.
         */
        var instanceType: InstanceType?
        /**
         * The ID of the kernel.
         */
        var kernelId: String?
        /**
         * The name of the key pair.
         */
        var keyName: String?
        /**
         * Indicates whether basic or detailed monitoring is enabled for the instance.
         * Default: Disabled
         */
        var monitoring: RunInstancesMonitoringEnabled?
        /**
         * One or more network interfaces. If you specify a network interface, you must specify
         * subnet IDs and security group IDs using the network interface.
         */
        var networkInterfaces: List<InstanceNetworkInterfaceSpecification>?
        /**
         * The placement information for the instance.
         */
        var placement: SpotPlacement?
        /**
         * The ID of the RAM disk.
         */
        var ramdiskId: String?
        /**
         * One or more security group IDs.
         */
        var securityGroupIds: List<String>?
        /**
         * One or more security groups. When requesting instances in a VPC, you must specify the IDs of the security groups. When requesting instances in EC2-Classic, you can specify the names or the IDs of the security groups.
         */
        var securityGroups: List<String>?
        /**
         * The ID of the subnet in which to launch the instance.
         */
        var subnetId: String?
        /**
         * The Base64-encoded user data for the instance. User data is limited to 16 KB.
         */
        var userData: String?

        fun build(): RequestSpotLaunchSpecification
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.IamInstanceProfileSpecification] inside the given [block]
         */
        fun iamInstanceProfile(block: IamInstanceProfileSpecification.DslBuilder.() -> kotlin.Unit) {
            this.iamInstanceProfile = IamInstanceProfileSpecification.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.RunInstancesMonitoringEnabled] inside the given [block]
         */
        fun monitoring(block: RunInstancesMonitoringEnabled.DslBuilder.() -> kotlin.Unit) {
            this.monitoring = RunInstancesMonitoringEnabled.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.SpotPlacement] inside the given [block]
         */
        fun placement(block: SpotPlacement.DslBuilder.() -> kotlin.Unit) {
            this.placement = SpotPlacement.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var addressingType: String? = null
        override var blockDeviceMappings: List<BlockDeviceMapping>? = null
        override var ebsOptimized: Boolean? = null
        override var iamInstanceProfile: IamInstanceProfileSpecification? = null
        override var imageId: String? = null
        override var instanceType: InstanceType? = null
        override var kernelId: String? = null
        override var keyName: String? = null
        override var monitoring: RunInstancesMonitoringEnabled? = null
        override var networkInterfaces: List<InstanceNetworkInterfaceSpecification>? = null
        override var placement: SpotPlacement? = null
        override var ramdiskId: String? = null
        override var securityGroupIds: List<String>? = null
        override var securityGroups: List<String>? = null
        override var subnetId: String? = null
        override var userData: String? = null

        constructor(x: RequestSpotLaunchSpecification) : this() {
            this.addressingType = x.addressingType
            this.blockDeviceMappings = x.blockDeviceMappings
            this.ebsOptimized = x.ebsOptimized
            this.iamInstanceProfile = x.iamInstanceProfile
            this.imageId = x.imageId
            this.instanceType = x.instanceType
            this.kernelId = x.kernelId
            this.keyName = x.keyName
            this.monitoring = x.monitoring
            this.networkInterfaces = x.networkInterfaces
            this.placement = x.placement
            this.ramdiskId = x.ramdiskId
            this.securityGroupIds = x.securityGroupIds
            this.securityGroups = x.securityGroups
            this.subnetId = x.subnetId
            this.userData = x.userData
        }

        override fun build(): RequestSpotLaunchSpecification = RequestSpotLaunchSpecification(this)
        override fun addressingType(addressingType: String): FluentBuilder = apply { this.addressingType = addressingType }
        override fun blockDeviceMappings(blockDeviceMappings: List<BlockDeviceMapping>): FluentBuilder = apply { this.blockDeviceMappings = blockDeviceMappings }
        override fun ebsOptimized(ebsOptimized: Boolean): FluentBuilder = apply { this.ebsOptimized = ebsOptimized }
        override fun iamInstanceProfile(iamInstanceProfile: IamInstanceProfileSpecification): FluentBuilder = apply { this.iamInstanceProfile = iamInstanceProfile }
        override fun imageId(imageId: String): FluentBuilder = apply { this.imageId = imageId }
        override fun instanceType(instanceType: InstanceType): FluentBuilder = apply { this.instanceType = instanceType }
        override fun kernelId(kernelId: String): FluentBuilder = apply { this.kernelId = kernelId }
        override fun keyName(keyName: String): FluentBuilder = apply { this.keyName = keyName }
        override fun monitoring(monitoring: RunInstancesMonitoringEnabled): FluentBuilder = apply { this.monitoring = monitoring }
        override fun networkInterfaces(networkInterfaces: List<InstanceNetworkInterfaceSpecification>): FluentBuilder = apply { this.networkInterfaces = networkInterfaces }
        override fun placement(placement: SpotPlacement): FluentBuilder = apply { this.placement = placement }
        override fun ramdiskId(ramdiskId: String): FluentBuilder = apply { this.ramdiskId = ramdiskId }
        override fun securityGroupIds(securityGroupIds: List<String>): FluentBuilder = apply { this.securityGroupIds = securityGroupIds }
        override fun securityGroups(securityGroups: List<String>): FluentBuilder = apply { this.securityGroups = securityGroups }
        override fun subnetId(subnetId: String): FluentBuilder = apply { this.subnetId = subnetId }
        override fun userData(userData: String): FluentBuilder = apply { this.userData = userData }
    }
}
