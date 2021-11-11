// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.KeySchemaElement
import aws.sdk.kotlin.services.dynamodb.model.LocalSecondaryIndexInfo
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


internal suspend fun deserializeLocalSecondaryIndexInfoDocument(deserializer: Deserializer): LocalSecondaryIndexInfo {
    val builder = LocalSecondaryIndexInfo.builder()
    val INDEXNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("IndexName"))
    val KEYSCHEMA_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("KeySchema"))
    val PROJECTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, JsonSerialName("Projection"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(INDEXNAME_DESCRIPTOR)
        field(KEYSCHEMA_DESCRIPTOR)
        field(PROJECTION_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                INDEXNAME_DESCRIPTOR.index -> builder.indexName = deserializeString()
                KEYSCHEMA_DESCRIPTOR.index -> builder.keySchema =
                    deserializer.deserializeList(KEYSCHEMA_DESCRIPTOR) {
                        val col0 = mutableListOf<KeySchemaElement>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeKeySchemaElementDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                PROJECTION_DESCRIPTOR.index -> builder.projection = deserializeProjectionDocument(deserializer)
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
