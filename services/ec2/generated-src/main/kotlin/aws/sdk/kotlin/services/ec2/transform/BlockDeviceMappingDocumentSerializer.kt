// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.BlockDeviceMapping
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal fun serializeBlockDeviceMappingDocument(serializer: Serializer, input: BlockDeviceMapping) {
    val DEVICENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("DeviceName"))
    val EBS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("Ebs"))
    val NODEVICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("NoDevice"))
    val VIRTUALNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("VirtualName"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("BlockDeviceMapping"))
        field(DEVICENAME_DESCRIPTOR)
        field(EBS_DESCRIPTOR)
        field(NODEVICE_DESCRIPTOR)
        field(VIRTUALNAME_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.deviceName?.let { field(DEVICENAME_DESCRIPTOR, it) }
        input.virtualName?.let { field(VIRTUALNAME_DESCRIPTOR, it) }
        input.ebs?.let { field(EBS_DESCRIPTOR, it, ::serializeEbsBlockDeviceDocument) }
        input.noDevice?.let { field(NODEVICE_DESCRIPTOR, it) }
    }
}
