// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.DisableFastSnapshotRestoreErrorItem
import aws.sdk.kotlin.services.ec2.model.DisableFastSnapshotRestoreSuccessItem
import aws.sdk.kotlin.services.ec2.model.DisableFastSnapshotRestoresResponse
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
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
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal class DisableFastSnapshotRestoresOperationDeserializer: HttpDeserialize<DisableFastSnapshotRestoresResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): DisableFastSnapshotRestoresResponse {
        if (!response.status.isSuccess()) {
            throwDisableFastSnapshotRestoresError(context, response)
        }
        val builder = DisableFastSnapshotRestoresResponse.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeDisableFastSnapshotRestoresOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun deserializeDisableFastSnapshotRestoresOperationBody(builder: DisableFastSnapshotRestoresResponse.DslBuilder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val SUCCESSFUL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("successful"), XmlCollectionName("item"))
    val UNSUCCESSFUL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("unsuccessful"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("DisableFastSnapshotRestoresResult"))
        field(SUCCESSFUL_DESCRIPTOR)
        field(UNSUCCESSFUL_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                SUCCESSFUL_DESCRIPTOR.index -> builder.successful =
                    deserializer.deserializeList(SUCCESSFUL_DESCRIPTOR) {
                        val col0 = mutableListOf<DisableFastSnapshotRestoreSuccessItem>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeDisableFastSnapshotRestoreSuccessItemDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                UNSUCCESSFUL_DESCRIPTOR.index -> builder.unsuccessful =
                    deserializer.deserializeList(UNSUCCESSFUL_DESCRIPTOR) {
                        val col0 = mutableListOf<DisableFastSnapshotRestoreErrorItem>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeDisableFastSnapshotRestoreErrorItemDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwDisableFastSnapshotRestoresError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
    val payload = response.body.readAll()
    val wrappedResponse = response.withPayload(payload)

    val errorDetails = try {
        checkNotNull(payload){ "unable to parse error from empty response" }
        parseEc2QueryErrorResponse(payload)
    } catch (ex: Exception) {
        throw UnknownServiceErrorException("failed to parse response as ec2Query error", ex).also {
            setAseErrorMetadata(it, wrappedResponse, null)
        }
    }

    throw Ec2Exception(errorDetails.message)
}
