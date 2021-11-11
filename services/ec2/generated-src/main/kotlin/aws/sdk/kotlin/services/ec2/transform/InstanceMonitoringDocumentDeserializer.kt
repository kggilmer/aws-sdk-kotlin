// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.InstanceMonitoring
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


internal suspend fun deserializeInstanceMonitoringDocument(deserializer: Deserializer): InstanceMonitoring {
    val builder = InstanceMonitoring.builder()
    val INSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceId"))
    val MONITORING_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, XmlSerialName("monitoring"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("InstanceMonitoring"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(INSTANCEID_DESCRIPTOR)
        field(MONITORING_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                INSTANCEID_DESCRIPTOR.index -> builder.instanceId = deserializeString()
                MONITORING_DESCRIPTOR.index -> builder.monitoring = deserializeMonitoringDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
