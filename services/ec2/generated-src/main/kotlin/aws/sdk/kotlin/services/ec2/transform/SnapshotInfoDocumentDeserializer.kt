// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.SnapshotInfo
import aws.sdk.kotlin.services.ec2.model.SnapshotState
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


internal suspend fun deserializeSnapshotInfoDocument(deserializer: Deserializer): SnapshotInfo {
    val builder = SnapshotInfo.builder()
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("description"))
    val ENCRYPTED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, XmlSerialName("encrypted"))
    val OUTPOSTARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("outpostArn"))
    val OWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ownerId"))
    val PROGRESS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("progress"))
    val SNAPSHOTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("snapshotId"))
    val STARTTIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("startTime"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val VOLUMEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("volumeId"))
    val VOLUMESIZE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, XmlSerialName("volumeSize"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("SnapshotInfo"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DESCRIPTION_DESCRIPTOR)
        field(ENCRYPTED_DESCRIPTOR)
        field(OUTPOSTARN_DESCRIPTOR)
        field(OWNERID_DESCRIPTOR)
        field(PROGRESS_DESCRIPTOR)
        field(SNAPSHOTID_DESCRIPTOR)
        field(STARTTIME_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
        field(VOLUMEID_DESCRIPTOR)
        field(VOLUMESIZE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DESCRIPTION_DESCRIPTOR.index -> builder.description = deserializeString()
                ENCRYPTED_DESCRIPTOR.index -> builder.encrypted = deserializeBoolean()
                OUTPOSTARN_DESCRIPTOR.index -> builder.outpostArn = deserializeString()
                OWNERID_DESCRIPTOR.index -> builder.ownerId = deserializeString()
                PROGRESS_DESCRIPTOR.index -> builder.progress = deserializeString()
                SNAPSHOTID_DESCRIPTOR.index -> builder.snapshotId = deserializeString()
                STARTTIME_DESCRIPTOR.index -> builder.startTime = deserializeString().let { Instant.fromIso8601(it) }
                STATE_DESCRIPTOR.index -> builder.state = deserializeString().let { SnapshotState.fromValue(it) }
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                VOLUMEID_DESCRIPTOR.index -> builder.volumeId = deserializeString()
                VOLUMESIZE_DESCRIPTOR.index -> builder.volumeSize = deserializeInt()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
