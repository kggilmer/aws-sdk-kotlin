// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.TerminateClientVpnConnectionsResponse
import aws.sdk.kotlin.services.ec2.model.TerminateConnectionStatus
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


internal class TerminateClientVpnConnectionsOperationDeserializer: HttpDeserialize<TerminateClientVpnConnectionsResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): TerminateClientVpnConnectionsResponse {
        if (!response.status.isSuccess()) {
            throwTerminateClientVpnConnectionsError(context, response)
        }
        val builder = TerminateClientVpnConnectionsResponse.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeTerminateClientVpnConnectionsOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun deserializeTerminateClientVpnConnectionsOperationBody(builder: TerminateClientVpnConnectionsResponse.DslBuilder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val CLIENTVPNENDPOINTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("clientVpnEndpointId"))
    val CONNECTIONSTATUSES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("connectionStatuses"), XmlCollectionName("item"))
    val USERNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("username"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("TerminateClientVpnConnectionsResult"))
        field(CLIENTVPNENDPOINTID_DESCRIPTOR)
        field(CONNECTIONSTATUSES_DESCRIPTOR)
        field(USERNAME_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CLIENTVPNENDPOINTID_DESCRIPTOR.index -> builder.clientVpnEndpointId = deserializeString()
                CONNECTIONSTATUSES_DESCRIPTOR.index -> builder.connectionStatuses =
                    deserializer.deserializeList(CONNECTIONSTATUSES_DESCRIPTOR) {
                        val col0 = mutableListOf<TerminateConnectionStatus>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTerminateConnectionStatusDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                USERNAME_DESCRIPTOR.index -> builder.username = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwTerminateClientVpnConnectionsError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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
