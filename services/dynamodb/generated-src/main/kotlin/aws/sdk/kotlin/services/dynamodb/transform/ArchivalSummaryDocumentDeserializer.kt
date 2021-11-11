// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.ArchivalSummary
import aws.smithy.kotlin.runtime.serde.Deserializer
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.json.JsonDeserializer
import aws.smithy.kotlin.runtime.serde.json.JsonSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct
import aws.smithy.kotlin.runtime.time.Instant


internal suspend fun deserializeArchivalSummaryDocument(deserializer: Deserializer): ArchivalSummary {
    val builder = ArchivalSummary.builder()
    val ARCHIVALBACKUPARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ArchivalBackupArn"))
    val ARCHIVALDATETIME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, JsonSerialName("ArchivalDateTime"))
    val ARCHIVALREASON_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ArchivalReason"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(ARCHIVALBACKUPARN_DESCRIPTOR)
        field(ARCHIVALDATETIME_DESCRIPTOR)
        field(ARCHIVALREASON_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ARCHIVALBACKUPARN_DESCRIPTOR.index -> builder.archivalBackupArn = deserializeString()
                ARCHIVALDATETIME_DESCRIPTOR.index -> builder.archivalDateTime = deserializeString().let { Instant.fromEpochSeconds(it) }
                ARCHIVALREASON_DESCRIPTOR.index -> builder.archivalReason = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
