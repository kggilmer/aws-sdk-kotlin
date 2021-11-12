// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.model



class ModifyInstanceAttributeRequest private constructor(builder: BuilderImpl) {
    /**
     * The name of the attribute.
     */
    val attribute: InstanceAttributeName? = builder.attribute
    /**
     * Modifies the DeleteOnTermination attribute for volumes that are currently
     * attached. The volume must be owned by the caller. If no value is specified for
     * DeleteOnTermination, the default is true and the volume is
     * deleted when the instance is terminated.
     * To add instance store volumes to an Amazon EBS-backed instance, you must add them when
     * you launch the instance. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM">Updating the block device mapping when launching an instance in the
     * Amazon EC2 User Guide.
     */
    val blockDeviceMappings: List<InstanceBlockDeviceMappingSpecification>? = builder.blockDeviceMappings
    /**
     * If the value is true, you can't terminate the instance using the Amazon
     * EC2 console, CLI, or API; otherwise, you can. You cannot use this parameter for Spot
     * Instances.
     */
    val disableApiTermination: AttributeBooleanValue? = builder.disableApiTermination
    /**
     * Checks whether you have the required permissions for the action, without actually making the request,
     * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
     * Otherwise, it is UnauthorizedOperation.
     */
    val dryRun: Boolean? = builder.dryRun
    /**
     * Specifies whether the instance is optimized for Amazon EBS I/O. This optimization
     * provides dedicated throughput to Amazon EBS and an optimized configuration stack to
     * provide optimal EBS I/O performance. This optimization isn't available with all instance
     * types. Additional usage charges apply when using an EBS Optimized instance.
     */
    val ebsOptimized: AttributeBooleanValue? = builder.ebsOptimized
    /**
     * Set to true to enable enhanced networking with ENA for the
     * instance.
     * This option is supported only for HVM instances. Specifying this option with a PV
     * instance can make it unreachable.
     */
    val enaSupport: AttributeBooleanValue? = builder.enaSupport
    /**
     * &#91;EC2-VPC&#93; Replaces the security groups of the instance with the specified security groups.
     * You must specify at least one security group, even if it's just the default security group for the VPC. You must
     * specify the security group ID, not the security group name.
     */
    val groups: List<String>? = builder.groups
    /**
     * The ID of the instance.
     */
    val instanceId: String? = builder.instanceId
    /**
     * Specifies whether an instance stops or terminates when you initiate shutdown from the
     * instance (using the operating system command for system shutdown).
     */
    val instanceInitiatedShutdownBehavior: AttributeValue? = builder.instanceInitiatedShutdownBehavior
    /**
     * Changes the instance type to the specified value. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
     * types in the Amazon EC2 User Guide. If the instance type is not valid,
     * the error returned is InvalidInstanceAttributeValue.
     */
    val instanceType: AttributeValue? = builder.instanceType
    /**
     * Changes the instance's kernel to the specified value. We recommend that you use
     * PV-GRUB instead of kernels and RAM disks. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html">PV-GRUB.
     */
    val kernel: AttributeValue? = builder.kernel
    /**
     * Changes the instance's RAM disk to the specified value. We recommend that you use
     * PV-GRUB instead of kernels and RAM disks. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html">PV-GRUB.
     */
    val ramdisk: AttributeValue? = builder.ramdisk
    /**
     * Enable or disable source/destination checks, which ensure that the instance
     * is either the source or the destination of any traffic that it receives.
     * If the value is true, source/destination checks are enabled;
     * otherwise, they are disabled. The default value is true.
     * You must disable source/destination checks if the instance runs services
     * such as network address translation, routing, or firewalls.
     */
    val sourceDestCheck: AttributeBooleanValue? = builder.sourceDestCheck
    /**
     * Set to simple to enable enhanced networking with the Intel 82599 Virtual
     * Function interface for the instance.
     * There is no way to disable enhanced networking with the Intel 82599 Virtual Function
     * interface at this time.
     * This option is supported only for HVM instances. Specifying this option with a PV
     * instance can make it unreachable.
     */
    val sriovNetSupport: AttributeValue? = builder.sriovNetSupport
    /**
     * Changes the instance's user data to the specified value. If you are using an Amazon Web Services SDK
     * or command line tool, base64-encoding is performed for you, and you can load the text
     * from a file. Otherwise, you must provide base64-encoded text.
     */
    val userData: BlobAttributeValue? = builder.userData
    /**
     * A new value for the attribute. Use only with the kernel,
     * ramdisk, userData, disableApiTermination, or
     * instanceInitiatedShutdownBehavior attribute.
     */
    val value: String? = builder.value

    companion object {
        @JvmStatic
        fun fluentBuilder(): FluentBuilder = BuilderImpl()

        internal fun builder(): DslBuilder = BuilderImpl()

        operator fun invoke(block: DslBuilder.() -> kotlin.Unit): ModifyInstanceAttributeRequest = BuilderImpl().apply(block).build()

    }

    override fun toString(): kotlin.String = buildString {
        append("ModifyInstanceAttributeRequest(")
        append("attribute=$attribute,")
        append("blockDeviceMappings=$blockDeviceMappings,")
        append("disableApiTermination=$disableApiTermination,")
        append("dryRun=$dryRun,")
        append("ebsOptimized=$ebsOptimized,")
        append("enaSupport=$enaSupport,")
        append("groups=$groups,")
        append("instanceId=$instanceId,")
        append("instanceInitiatedShutdownBehavior=$instanceInitiatedShutdownBehavior,")
        append("instanceType=$instanceType,")
        append("kernel=$kernel,")
        append("ramdisk=$ramdisk,")
        append("sourceDestCheck=$sourceDestCheck,")
        append("sriovNetSupport=$sriovNetSupport,")
        append("userData=$userData,")
        append("value=$value)")
    }

    override fun hashCode(): kotlin.Int {
        var result = attribute?.hashCode() ?: 0
        result = 31 * result + (blockDeviceMappings?.hashCode() ?: 0)
        result = 31 * result + (disableApiTermination?.hashCode() ?: 0)
        result = 31 * result + (dryRun?.hashCode() ?: 0)
        result = 31 * result + (ebsOptimized?.hashCode() ?: 0)
        result = 31 * result + (enaSupport?.hashCode() ?: 0)
        result = 31 * result + (groups?.hashCode() ?: 0)
        result = 31 * result + (instanceId?.hashCode() ?: 0)
        result = 31 * result + (instanceInitiatedShutdownBehavior?.hashCode() ?: 0)
        result = 31 * result + (instanceType?.hashCode() ?: 0)
        result = 31 * result + (kernel?.hashCode() ?: 0)
        result = 31 * result + (ramdisk?.hashCode() ?: 0)
        result = 31 * result + (sourceDestCheck?.hashCode() ?: 0)
        result = 31 * result + (sriovNetSupport?.hashCode() ?: 0)
        result = 31 * result + (userData?.hashCode() ?: 0)
        result = 31 * result + (value?.hashCode() ?: 0)
        return result
    }

    override fun equals(other: kotlin.Any?): kotlin.Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ModifyInstanceAttributeRequest

        if (attribute != other.attribute) return false
        if (blockDeviceMappings != other.blockDeviceMappings) return false
        if (disableApiTermination != other.disableApiTermination) return false
        if (dryRun != other.dryRun) return false
        if (ebsOptimized != other.ebsOptimized) return false
        if (enaSupport != other.enaSupport) return false
        if (groups != other.groups) return false
        if (instanceId != other.instanceId) return false
        if (instanceInitiatedShutdownBehavior != other.instanceInitiatedShutdownBehavior) return false
        if (instanceType != other.instanceType) return false
        if (kernel != other.kernel) return false
        if (ramdisk != other.ramdisk) return false
        if (sourceDestCheck != other.sourceDestCheck) return false
        if (sriovNetSupport != other.sriovNetSupport) return false
        if (userData != other.userData) return false
        if (value != other.value) return false

        return true
    }

    fun copy(block: DslBuilder.() -> kotlin.Unit = {}): ModifyInstanceAttributeRequest = BuilderImpl(this).apply(block).build()

    interface FluentBuilder {
        fun build(): ModifyInstanceAttributeRequest
        /**
         * The name of the attribute.
         */
        fun attribute(attribute: InstanceAttributeName): FluentBuilder
        /**
         * Modifies the DeleteOnTermination attribute for volumes that are currently
         * attached. The volume must be owned by the caller. If no value is specified for
         * DeleteOnTermination, the default is true and the volume is
         * deleted when the instance is terminated.
         * To add instance store volumes to an Amazon EBS-backed instance, you must add them when
         * you launch the instance. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM">Updating the block device mapping when launching an instance in the
         * Amazon EC2 User Guide.
         */
        fun blockDeviceMappings(blockDeviceMappings: List<InstanceBlockDeviceMappingSpecification>): FluentBuilder
        /**
         * If the value is true, you can't terminate the instance using the Amazon
         * EC2 console, CLI, or API; otherwise, you can. You cannot use this parameter for Spot
         * Instances.
         */
        fun disableApiTermination(disableApiTermination: AttributeBooleanValue): FluentBuilder
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        fun dryRun(dryRun: Boolean): FluentBuilder
        /**
         * Specifies whether the instance is optimized for Amazon EBS I/O. This optimization
         * provides dedicated throughput to Amazon EBS and an optimized configuration stack to
         * provide optimal EBS I/O performance. This optimization isn't available with all instance
         * types. Additional usage charges apply when using an EBS Optimized instance.
         */
        fun ebsOptimized(ebsOptimized: AttributeBooleanValue): FluentBuilder
        /**
         * Set to true to enable enhanced networking with ENA for the
         * instance.
         * This option is supported only for HVM instances. Specifying this option with a PV
         * instance can make it unreachable.
         */
        fun enaSupport(enaSupport: AttributeBooleanValue): FluentBuilder
        /**
         * &#91;EC2-VPC&#93; Replaces the security groups of the instance with the specified security groups.
         * You must specify at least one security group, even if it's just the default security group for the VPC. You must
         * specify the security group ID, not the security group name.
         */
        fun groups(groups: List<String>): FluentBuilder
        /**
         * The ID of the instance.
         */
        fun instanceId(instanceId: String): FluentBuilder
        /**
         * Specifies whether an instance stops or terminates when you initiate shutdown from the
         * instance (using the operating system command for system shutdown).
         */
        fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: AttributeValue): FluentBuilder
        /**
         * Changes the instance type to the specified value. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
         * types in the Amazon EC2 User Guide. If the instance type is not valid,
         * the error returned is InvalidInstanceAttributeValue.
         */
        fun instanceType(instanceType: AttributeValue): FluentBuilder
        /**
         * Changes the instance's kernel to the specified value. We recommend that you use
         * PV-GRUB instead of kernels and RAM disks. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html">PV-GRUB.
         */
        fun kernel(kernel: AttributeValue): FluentBuilder
        /**
         * Changes the instance's RAM disk to the specified value. We recommend that you use
         * PV-GRUB instead of kernels and RAM disks. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html">PV-GRUB.
         */
        fun ramdisk(ramdisk: AttributeValue): FluentBuilder
        /**
         * Enable or disable source/destination checks, which ensure that the instance
         * is either the source or the destination of any traffic that it receives.
         * If the value is true, source/destination checks are enabled;
         * otherwise, they are disabled. The default value is true.
         * You must disable source/destination checks if the instance runs services
         * such as network address translation, routing, or firewalls.
         */
        fun sourceDestCheck(sourceDestCheck: AttributeBooleanValue): FluentBuilder
        /**
         * Set to simple to enable enhanced networking with the Intel 82599 Virtual
         * Function interface for the instance.
         * There is no way to disable enhanced networking with the Intel 82599 Virtual Function
         * interface at this time.
         * This option is supported only for HVM instances. Specifying this option with a PV
         * instance can make it unreachable.
         */
        fun sriovNetSupport(sriovNetSupport: AttributeValue): FluentBuilder
        /**
         * Changes the instance's user data to the specified value. If you are using an Amazon Web Services SDK
         * or command line tool, base64-encoding is performed for you, and you can load the text
         * from a file. Otherwise, you must provide base64-encoded text.
         */
        fun userData(userData: BlobAttributeValue): FluentBuilder
        /**
         * A new value for the attribute. Use only with the kernel,
         * ramdisk, userData, disableApiTermination, or
         * instanceInitiatedShutdownBehavior attribute.
         */
        fun value(value: String): FluentBuilder
    }

    interface DslBuilder {
        /**
         * The name of the attribute.
         */
        var attribute: InstanceAttributeName?
        /**
         * Modifies the DeleteOnTermination attribute for volumes that are currently
         * attached. The volume must be owned by the caller. If no value is specified for
         * DeleteOnTermination, the default is true and the volume is
         * deleted when the instance is terminated.
         * To add instance store volumes to an Amazon EBS-backed instance, you must add them when
         * you launch the instance. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/block-device-mapping-concepts.html#Using_OverridingAMIBDM">Updating the block device mapping when launching an instance in the
         * Amazon EC2 User Guide.
         */
        var blockDeviceMappings: List<InstanceBlockDeviceMappingSpecification>?
        /**
         * If the value is true, you can't terminate the instance using the Amazon
         * EC2 console, CLI, or API; otherwise, you can. You cannot use this parameter for Spot
         * Instances.
         */
        var disableApiTermination: AttributeBooleanValue?
        /**
         * Checks whether you have the required permissions for the action, without actually making the request,
         * and provides an error response. If you have the required permissions, the error response is DryRunOperation.
         * Otherwise, it is UnauthorizedOperation.
         */
        var dryRun: Boolean?
        /**
         * Specifies whether the instance is optimized for Amazon EBS I/O. This optimization
         * provides dedicated throughput to Amazon EBS and an optimized configuration stack to
         * provide optimal EBS I/O performance. This optimization isn't available with all instance
         * types. Additional usage charges apply when using an EBS Optimized instance.
         */
        var ebsOptimized: AttributeBooleanValue?
        /**
         * Set to true to enable enhanced networking with ENA for the
         * instance.
         * This option is supported only for HVM instances. Specifying this option with a PV
         * instance can make it unreachable.
         */
        var enaSupport: AttributeBooleanValue?
        /**
         * &#91;EC2-VPC&#93; Replaces the security groups of the instance with the specified security groups.
         * You must specify at least one security group, even if it's just the default security group for the VPC. You must
         * specify the security group ID, not the security group name.
         */
        var groups: List<String>?
        /**
         * The ID of the instance.
         */
        var instanceId: String?
        /**
         * Specifies whether an instance stops or terminates when you initiate shutdown from the
         * instance (using the operating system command for system shutdown).
         */
        var instanceInitiatedShutdownBehavior: AttributeValue?
        /**
         * Changes the instance type to the specified value. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/instance-types.html">Instance
         * types in the Amazon EC2 User Guide. If the instance type is not valid,
         * the error returned is InvalidInstanceAttributeValue.
         */
        var instanceType: AttributeValue?
        /**
         * Changes the instance's kernel to the specified value. We recommend that you use
         * PV-GRUB instead of kernels and RAM disks. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html">PV-GRUB.
         */
        var kernel: AttributeValue?
        /**
         * Changes the instance's RAM disk to the specified value. We recommend that you use
         * PV-GRUB instead of kernels and RAM disks. For more information, see <a href="https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/UserProvidedKernels.html">PV-GRUB.
         */
        var ramdisk: AttributeValue?
        /**
         * Enable or disable source/destination checks, which ensure that the instance
         * is either the source or the destination of any traffic that it receives.
         * If the value is true, source/destination checks are enabled;
         * otherwise, they are disabled. The default value is true.
         * You must disable source/destination checks if the instance runs services
         * such as network address translation, routing, or firewalls.
         */
        var sourceDestCheck: AttributeBooleanValue?
        /**
         * Set to simple to enable enhanced networking with the Intel 82599 Virtual
         * Function interface for the instance.
         * There is no way to disable enhanced networking with the Intel 82599 Virtual Function
         * interface at this time.
         * This option is supported only for HVM instances. Specifying this option with a PV
         * instance can make it unreachable.
         */
        var sriovNetSupport: AttributeValue?
        /**
         * Changes the instance's user data to the specified value. If you are using an Amazon Web Services SDK
         * or command line tool, base64-encoding is performed for you, and you can load the text
         * from a file. Otherwise, you must provide base64-encoded text.
         */
        var userData: BlobAttributeValue?
        /**
         * A new value for the attribute. Use only with the kernel,
         * ramdisk, userData, disableApiTermination, or
         * instanceInitiatedShutdownBehavior attribute.
         */
        var value: String?

        fun build(): ModifyInstanceAttributeRequest
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeBooleanValue] inside the given [block]
         */
        fun disableApiTermination(block: AttributeBooleanValue.DslBuilder.() -> kotlin.Unit) {
            this.disableApiTermination = AttributeBooleanValue.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeBooleanValue] inside the given [block]
         */
        fun ebsOptimized(block: AttributeBooleanValue.DslBuilder.() -> kotlin.Unit) {
            this.ebsOptimized = AttributeBooleanValue.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeBooleanValue] inside the given [block]
         */
        fun enaSupport(block: AttributeBooleanValue.DslBuilder.() -> kotlin.Unit) {
            this.enaSupport = AttributeBooleanValue.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        fun instanceInitiatedShutdownBehavior(block: AttributeValue.DslBuilder.() -> kotlin.Unit) {
            this.instanceInitiatedShutdownBehavior = AttributeValue.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        fun instanceType(block: AttributeValue.DslBuilder.() -> kotlin.Unit) {
            this.instanceType = AttributeValue.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        fun kernel(block: AttributeValue.DslBuilder.() -> kotlin.Unit) {
            this.kernel = AttributeValue.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        fun ramdisk(block: AttributeValue.DslBuilder.() -> kotlin.Unit) {
            this.ramdisk = AttributeValue.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeBooleanValue] inside the given [block]
         */
        fun sourceDestCheck(block: AttributeBooleanValue.DslBuilder.() -> kotlin.Unit) {
            this.sourceDestCheck = AttributeBooleanValue.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.AttributeValue] inside the given [block]
         */
        fun sriovNetSupport(block: AttributeValue.DslBuilder.() -> kotlin.Unit) {
            this.sriovNetSupport = AttributeValue.invoke(block)
        }
        /**
         * construct an [aws.sdk.kotlin.services.ec2.model.BlobAttributeValue] inside the given [block]
         */
        fun userData(block: BlobAttributeValue.DslBuilder.() -> kotlin.Unit) {
            this.userData = BlobAttributeValue.invoke(block)
        }
    }

    private class BuilderImpl() : FluentBuilder, DslBuilder {
        override var attribute: InstanceAttributeName? = null
        override var blockDeviceMappings: List<InstanceBlockDeviceMappingSpecification>? = null
        override var disableApiTermination: AttributeBooleanValue? = null
        override var dryRun: Boolean? = null
        override var ebsOptimized: AttributeBooleanValue? = null
        override var enaSupport: AttributeBooleanValue? = null
        override var groups: List<String>? = null
        override var instanceId: String? = null
        override var instanceInitiatedShutdownBehavior: AttributeValue? = null
        override var instanceType: AttributeValue? = null
        override var kernel: AttributeValue? = null
        override var ramdisk: AttributeValue? = null
        override var sourceDestCheck: AttributeBooleanValue? = null
        override var sriovNetSupport: AttributeValue? = null
        override var userData: BlobAttributeValue? = null
        override var value: String? = null

        constructor(x: ModifyInstanceAttributeRequest) : this() {
            this.attribute = x.attribute
            this.blockDeviceMappings = x.blockDeviceMappings
            this.disableApiTermination = x.disableApiTermination
            this.dryRun = x.dryRun
            this.ebsOptimized = x.ebsOptimized
            this.enaSupport = x.enaSupport
            this.groups = x.groups
            this.instanceId = x.instanceId
            this.instanceInitiatedShutdownBehavior = x.instanceInitiatedShutdownBehavior
            this.instanceType = x.instanceType
            this.kernel = x.kernel
            this.ramdisk = x.ramdisk
            this.sourceDestCheck = x.sourceDestCheck
            this.sriovNetSupport = x.sriovNetSupport
            this.userData = x.userData
            this.value = x.value
        }

        override fun build(): ModifyInstanceAttributeRequest = ModifyInstanceAttributeRequest(this)
        override fun attribute(attribute: InstanceAttributeName): FluentBuilder = apply { this.attribute = attribute }
        override fun blockDeviceMappings(blockDeviceMappings: List<InstanceBlockDeviceMappingSpecification>): FluentBuilder = apply { this.blockDeviceMappings = blockDeviceMappings }
        override fun disableApiTermination(disableApiTermination: AttributeBooleanValue): FluentBuilder = apply { this.disableApiTermination = disableApiTermination }
        override fun dryRun(dryRun: Boolean): FluentBuilder = apply { this.dryRun = dryRun }
        override fun ebsOptimized(ebsOptimized: AttributeBooleanValue): FluentBuilder = apply { this.ebsOptimized = ebsOptimized }
        override fun enaSupport(enaSupport: AttributeBooleanValue): FluentBuilder = apply { this.enaSupport = enaSupport }
        override fun groups(groups: List<String>): FluentBuilder = apply { this.groups = groups }
        override fun instanceId(instanceId: String): FluentBuilder = apply { this.instanceId = instanceId }
        override fun instanceInitiatedShutdownBehavior(instanceInitiatedShutdownBehavior: AttributeValue): FluentBuilder = apply { this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior }
        override fun instanceType(instanceType: AttributeValue): FluentBuilder = apply { this.instanceType = instanceType }
        override fun kernel(kernel: AttributeValue): FluentBuilder = apply { this.kernel = kernel }
        override fun ramdisk(ramdisk: AttributeValue): FluentBuilder = apply { this.ramdisk = ramdisk }
        override fun sourceDestCheck(sourceDestCheck: AttributeBooleanValue): FluentBuilder = apply { this.sourceDestCheck = sourceDestCheck }
        override fun sriovNetSupport(sriovNetSupport: AttributeValue): FluentBuilder = apply { this.sriovNetSupport = sriovNetSupport }
        override fun userData(userData: BlobAttributeValue): FluentBuilder = apply { this.userData = userData }
        override fun value(value: String): FluentBuilder = apply { this.value = value }
    }
}
