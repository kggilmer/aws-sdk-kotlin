// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CapacityReservationPreference
import aws.sdk.kotlin.services.ec2.model.CapacityReservationSpecificationResponse
import aws.smithy.kotlin.runtime.serde.Deserializer
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal suspend fun deserializeCapacityReservationSpecificationResponseDocument(deserializer: Deserializer): CapacityReservationSpecificationResponse {
    val builder = CapacityReservationSpecificationResponse.builder()
    val CAPACITYRESERVATIONPREFERENCE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("capacityReservationPreference"))
    val CAPACITYRESERVATIONTARGET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("capacityReservationTarget"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("CapacityReservationSpecificationResponse"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CAPACITYRESERVATIONPREFERENCE_DESCRIPTOR)
        field(CAPACITYRESERVATIONTARGET_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CAPACITYRESERVATIONPREFERENCE_DESCRIPTOR.index -> builder.capacityReservationPreference = deserializeString().let { CapacityReservationPreference.fromValue(it) }
                CAPACITYRESERVATIONTARGET_DESCRIPTOR.index -> builder.capacityReservationTarget = deserializeCapacityReservationTargetResponseDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
