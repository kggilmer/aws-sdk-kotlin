// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ActivityStatus
import aws.sdk.kotlin.services.ec2.model.BatchState
import aws.sdk.kotlin.services.ec2.model.SpotFleetRequestConfig
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


internal suspend fun deserializeSpotFleetRequestConfigDocument(deserializer: Deserializer): SpotFleetRequestConfig {
    val builder = SpotFleetRequestConfig.builder()
    val ACTIVITYSTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("activityStatus"))
    val CREATETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("createTime"))
    val SPOTFLEETREQUESTCONFIG_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("spotFleetRequestConfig"))
    val SPOTFLEETREQUESTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("spotFleetRequestId"))
    val SPOTFLEETREQUESTSTATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("spotFleetRequestState"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("SpotFleetRequestConfig"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ACTIVITYSTATUS_DESCRIPTOR)
        field(CREATETIME_DESCRIPTOR)
        field(SPOTFLEETREQUESTCONFIG_DESCRIPTOR)
        field(SPOTFLEETREQUESTID_DESCRIPTOR)
        field(SPOTFLEETREQUESTSTATE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ACTIVITYSTATUS_DESCRIPTOR.index -> builder.activityStatus = deserializeString().let { ActivityStatus.fromValue(it) }
                CREATETIME_DESCRIPTOR.index -> builder.createTime = deserializeString().let { Instant.fromIso8601(it) }
                SPOTFLEETREQUESTCONFIG_DESCRIPTOR.index -> builder.spotFleetRequestConfig = deserializeSpotFleetRequestConfigDataDocument(deserializer)
                SPOTFLEETREQUESTID_DESCRIPTOR.index -> builder.spotFleetRequestId = deserializeString()
                SPOTFLEETREQUESTSTATE_DESCRIPTOR.index -> builder.spotFleetRequestState = deserializeString().let { BatchState.fromValue(it) }
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
