// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.services.dynamodb.model.GetItemRequest
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.url
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
import aws.smithy.kotlin.runtime.serde.json.JsonSerializer
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class GetItemOperationSerializer: HttpSerialize<GetItemRequest> {
    override suspend fun serialize(context: ExecutionContext, input: GetItemRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeGetItemOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-amz-json-1.0")
        return builder
    }
}

private fun serializeGetItemOperationBody(context: ExecutionContext, input: GetItemRequest): ByteArray {
    val serializer = JsonSerializer()
    val ATTRIBUTESTOGET_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, JsonSerialName("AttributesToGet"))
    val CONSISTENTREAD_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, JsonSerialName("ConsistentRead"))
    val EXPRESSIONATTRIBUTENAMES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Map, JsonSerialName("ExpressionAttributeNames"))
    val KEY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Map, JsonSerialName("Key"))
    val PROJECTIONEXPRESSION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ProjectionExpression"))
    val RETURNCONSUMEDCAPACITY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("ReturnConsumedCapacity"))
    val TABLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableName"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(ATTRIBUTESTOGET_DESCRIPTOR)
        field(CONSISTENTREAD_DESCRIPTOR)
        field(EXPRESSIONATTRIBUTENAMES_DESCRIPTOR)
        field(KEY_DESCRIPTOR)
        field(PROJECTIONEXPRESSION_DESCRIPTOR)
        field(RETURNCONSUMEDCAPACITY_DESCRIPTOR)
        field(TABLENAME_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.attributesToGet != null) {
            listField(ATTRIBUTESTOGET_DESCRIPTOR) {
                for (el0 in input.attributesToGet) {
                    serializeString(el0)
                }
            }
        }
        input.consistentRead?.let { field(CONSISTENTREAD_DESCRIPTOR, it) }
        if (input.expressionAttributeNames != null) {
            mapField(EXPRESSIONATTRIBUTENAMES_DESCRIPTOR) {
                input.expressionAttributeNames.forEach { (key, value) -> entry(key, value) }
            }
        }
        if (input.key != null) {
            mapField(KEY_DESCRIPTOR) {
                input.key.forEach { (key, value) -> entry(key, asSdkSerializable(value, ::serializeAttributeValueDocument)) }
            }
        }
        input.projectionExpression?.let { field(PROJECTIONEXPRESSION_DESCRIPTOR, it) }
        input.returnConsumedCapacity?.let { field(RETURNCONSUMEDCAPACITY_DESCRIPTOR, it.value) }
        input.tableName?.let { field(TABLENAME_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
