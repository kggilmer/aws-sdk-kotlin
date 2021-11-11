// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.dynamodb.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.json.RestJsonErrorDeserializer
import aws.sdk.kotlin.services.dynamodb.model.DestinationStatus
import aws.sdk.kotlin.services.dynamodb.model.DynamoDbException
import aws.sdk.kotlin.services.dynamodb.model.EnableKinesisStreamingDestinationResponse
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.isSuccess
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


internal class EnableKinesisStreamingDestinationOperationDeserializer: HttpDeserialize<EnableKinesisStreamingDestinationResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): EnableKinesisStreamingDestinationResponse {
        if (!response.status.isSuccess()) {
            throwEnableKinesisStreamingDestinationError(context, response)
        }
        val builder = EnableKinesisStreamingDestinationResponse.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeEnableKinesisStreamingDestinationOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun deserializeEnableKinesisStreamingDestinationOperationBody(builder: EnableKinesisStreamingDestinationResponse.DslBuilder, payload: ByteArray) {
    val deserializer = JsonDeserializer(payload)
    val DESTINATIONSTATUS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("DestinationStatus"))
    val STREAMARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("StreamArn"))
    val TABLENAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, JsonSerialName("TableName"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        field(DESTINATIONSTATUS_DESCRIPTOR)
        field(STREAMARN_DESCRIPTOR)
        field(TABLENAME_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DESTINATIONSTATUS_DESCRIPTOR.index -> builder.destinationStatus = deserializeString().let { DestinationStatus.fromValue(it) }
                STREAMARN_DESCRIPTOR.index -> builder.streamArn = deserializeString()
                TABLENAME_DESCRIPTOR.index -> builder.tableName = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwEnableKinesisStreamingDestinationError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
    val payload = response.body.readAll()
    val wrappedResponse = response.withPayload(payload)

    val errorDetails = try {
        RestJsonErrorDeserializer.deserialize(response.headers, payload)
    } catch (ex: Exception) {
        throw UnknownServiceErrorException("failed to parse response as awsJson1_0 error", ex).also {
            setAseErrorMetadata(it, wrappedResponse, null)
        }
    }

    val modeledExceptionDeserializer = when(errorDetails.code) {
        "InternalServerError" -> InternalServerErrorDeserializer()
        "InvalidEndpointException" -> InvalidEndpointExceptionDeserializer()
        "LimitExceededException" -> LimitExceededExceptionDeserializer()
        "ResourceInUseException" -> ResourceInUseExceptionDeserializer()
        "ResourceNotFoundException" -> ResourceNotFoundExceptionDeserializer()
        else -> throw DynamoDbException(errorDetails.message)
    }

    val modeledException = modeledExceptionDeserializer.deserialize(context, wrappedResponse)
    setAseErrorMetadata(modeledException, wrappedResponse, errorDetails)
    throw modeledException
}
