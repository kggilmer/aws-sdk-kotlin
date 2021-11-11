// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.Event
import aws.sdk.kotlin.services.s3.model.QueueConfiguration
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
import aws.smithy.kotlin.runtime.serde.xml.Flattened
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal suspend fun deserializeQueueConfigurationDocument(deserializer: Deserializer): QueueConfiguration {
    val builder = QueueConfiguration.builder()
    val EVENTS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("Event"), Flattened)
    val FILTER_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("Filter"))
    val ID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Id"))
    val QUEUEARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Queue"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("QueueConfiguration"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(EVENTS_DESCRIPTOR)
        field(FILTER_DESCRIPTOR)
        field(ID_DESCRIPTOR)
        field(QUEUEARN_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                EVENTS_DESCRIPTOR.index -> builder.events =
                    deserializer.deserializeList(EVENTS_DESCRIPTOR) {
                        val col0 = mutableListOf<Event>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeString().let { Event.fromValue(it) } } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                FILTER_DESCRIPTOR.index -> builder.filter = deserializeNotificationConfigurationFilterDocument(deserializer)
                ID_DESCRIPTOR.index -> builder.id = deserializeString()
                QUEUEARN_DESCRIPTOR.index -> builder.queueArn = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
