// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.polly.transform

import aws.sdk.kotlin.services.polly.model.LexiconNotFoundException
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.operation.HttpDeserialize
import aws.smithy.kotlin.runtime.http.readAll
import aws.smithy.kotlin.runtime.http.response.HttpResponse
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


internal class LexiconNotFoundExceptionDeserializer: HttpDeserialize<LexiconNotFoundException> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): LexiconNotFoundException {
        val builder = LexiconNotFoundException.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeLexiconNotFoundExceptionError(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun deserializeLexiconNotFoundExceptionError(builder: LexiconNotFoundException.DslBuilder, payload: ByteArray) {
    val deserializer = JsonDeserializer(payload)
    val MESSAGE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("message"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(MESSAGE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                MESSAGE_DESCRIPTOR.index -> builder.message = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}
