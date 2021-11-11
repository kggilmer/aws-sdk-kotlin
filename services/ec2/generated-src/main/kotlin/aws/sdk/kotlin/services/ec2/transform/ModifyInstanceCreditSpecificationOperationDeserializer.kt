// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.ModifyInstanceCreditSpecificationResponse
import aws.sdk.kotlin.services.ec2.model.SuccessfulInstanceCreditSpecificationItem
import aws.sdk.kotlin.services.ec2.model.UnsuccessfulInstanceCreditSpecificationItem
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


internal class ModifyInstanceCreditSpecificationOperationDeserializer: HttpDeserialize<ModifyInstanceCreditSpecificationResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): ModifyInstanceCreditSpecificationResponse {
        if (!response.status.isSuccess()) {
            throwModifyInstanceCreditSpecificationError(context, response)
        }
        val builder = ModifyInstanceCreditSpecificationResponse.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeModifyInstanceCreditSpecificationOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun deserializeModifyInstanceCreditSpecificationOperationBody(builder: ModifyInstanceCreditSpecificationResponse.DslBuilder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val SUCCESSFULINSTANCECREDITSPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("successfulInstanceCreditSpecificationSet"), XmlCollectionName("item"))
    val UNSUCCESSFULINSTANCECREDITSPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("unsuccessfulInstanceCreditSpecificationSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("ModifyInstanceCreditSpecificationResult"))
        field(SUCCESSFULINSTANCECREDITSPECIFICATIONS_DESCRIPTOR)
        field(UNSUCCESSFULINSTANCECREDITSPECIFICATIONS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                SUCCESSFULINSTANCECREDITSPECIFICATIONS_DESCRIPTOR.index -> builder.successfulInstanceCreditSpecifications =
                    deserializer.deserializeList(SUCCESSFULINSTANCECREDITSPECIFICATIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<SuccessfulInstanceCreditSpecificationItem>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeSuccessfulInstanceCreditSpecificationItemDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                UNSUCCESSFULINSTANCECREDITSPECIFICATIONS_DESCRIPTOR.index -> builder.unsuccessfulInstanceCreditSpecifications =
                    deserializer.deserializeList(UNSUCCESSFULINSTANCECREDITSPECIFICATIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<UnsuccessfulInstanceCreditSpecificationItem>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeUnsuccessfulInstanceCreditSpecificationItemDocument(deserializer) } else { deserializeNull(); continue }
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

private suspend fun throwModifyInstanceCreditSpecificationError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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
