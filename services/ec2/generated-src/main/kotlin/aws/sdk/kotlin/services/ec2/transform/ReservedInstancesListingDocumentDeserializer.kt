// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.InstanceCount
import aws.sdk.kotlin.services.ec2.model.ListingStatus
import aws.sdk.kotlin.services.ec2.model.PriceSchedule
import aws.sdk.kotlin.services.ec2.model.ReservedInstancesListing
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
import aws.smithy.kotlin.runtime.time.Instant


internal suspend fun deserializeReservedInstancesListingDocument(deserializer: Deserializer): ReservedInstancesListing {
    val builder = ReservedInstancesListing.builder()
    val CLIENTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("clientToken"))
    val CREATEDATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("createDate"))
    val INSTANCECOUNTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("instanceCounts"), XmlCollectionName("item"))
    val PRICESCHEDULES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("priceSchedules"), XmlCollectionName("item"))
    val RESERVEDINSTANCESID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("reservedInstancesId"))
    val RESERVEDINSTANCESLISTINGID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("reservedInstancesListingId"))
    val STATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("status"))
    val STATUSMESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("statusMessage"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val UPDATEDATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("updateDate"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ReservedInstancesListing"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(CLIENTTOKEN_DESCRIPTOR)
        field(CREATEDATE_DESCRIPTOR)
        field(INSTANCECOUNTS_DESCRIPTOR)
        field(PRICESCHEDULES_DESCRIPTOR)
        field(RESERVEDINSTANCESID_DESCRIPTOR)
        field(RESERVEDINSTANCESLISTINGID_DESCRIPTOR)
        field(STATUS_DESCRIPTOR)
        field(STATUSMESSAGE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(UPDATEDATE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CLIENTTOKEN_DESCRIPTOR.index -> builder.clientToken = deserializeString()
                CREATEDATE_DESCRIPTOR.index -> builder.createDate = deserializeString().let { Instant.fromIso8601(it) }
                INSTANCECOUNTS_DESCRIPTOR.index -> builder.instanceCounts =
                    deserializer.deserializeList(INSTANCECOUNTS_DESCRIPTOR) {
                        val col0 = mutableListOf<InstanceCount>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeInstanceCountDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                PRICESCHEDULES_DESCRIPTOR.index -> builder.priceSchedules =
                    deserializer.deserializeList(PRICESCHEDULES_DESCRIPTOR) {
                        val col0 = mutableListOf<PriceSchedule>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializePriceScheduleDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                RESERVEDINSTANCESID_DESCRIPTOR.index -> builder.reservedInstancesId = deserializeString()
                RESERVEDINSTANCESLISTINGID_DESCRIPTOR.index -> builder.reservedInstancesListingId = deserializeString()
                STATUS_DESCRIPTOR.index -> builder.status = deserializeString().let { ListingStatus.fromValue(it) }
                STATUSMESSAGE_DESCRIPTOR.index -> builder.statusMessage = deserializeString()
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                UPDATEDATE_DESCRIPTOR.index -> builder.updateDate = deserializeString().let { Instant.fromIso8601(it) }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
