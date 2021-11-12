// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.SubnetCidrReservation
import aws.sdk.kotlin.services.ec2.model.SubnetCidrReservationType
import aws.sdk.kotlin.services.ec2.model.Tag
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
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal suspend fun deserializeSubnetCidrReservationDocument(deserializer: Deserializer): SubnetCidrReservation {
    val builder = SubnetCidrReservation.builder()
    val CIDR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("cidr"))
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val OWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ownerId"))
    val RESERVATIONTYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("reservationType"))
    val SUBNETCIDRRESERVATIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("subnetCidrReservationId"))
    val SUBNETID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("subnetId"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("SubnetCidrReservation"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CIDR_DESCRIPTOR)
        field(DESCRIPTION_DESCRIPTOR)
        field(OWNERID_DESCRIPTOR)
        field(RESERVATIONTYPE_DESCRIPTOR)
        field(SUBNETCIDRRESERVATIONID_DESCRIPTOR)
        field(SUBNETID_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CIDR_DESCRIPTOR.index -> builder.cidr = deserializeString()
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                OWNERID_DESCRIPTOR.index -> builder.ownerId = deserializeString()
                RESERVATIONTYPE_DESCRIPTOR.index -> builder.reservationType = deserializeString().let { SubnetCidrReservationType.fromValue(it) }
                SUBNETCIDRRESERVATIONID_DESCRIPTOR.index -> builder.subnetCidrReservationId = deserializeString()
                SUBNETID_DESCRIPTOR.index -> builder.subnetId = deserializeString()
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
