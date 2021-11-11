// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.EbsInstanceBlockDeviceSpecification
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


internal fun serializeEbsInstanceBlockDeviceSpecificationDocument(serializer: Serializer, input: EbsInstanceBlockDeviceSpecification) {
    val DELETEONTERMINATION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DeleteOnTermination"))
    val VOLUMEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("VolumeId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("EbsInstanceBlockDeviceSpecification"))
        field(DELETEONTERMINATION_DESCRIPTOR)
        field(VOLUMEID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.deleteOnTermination?.let { field(DELETEONTERMINATION_DESCRIPTOR, it) }
        input.volumeId?.let { field(VOLUMEID_DESCRIPTOR, it) }
    }
}
