// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.CurrencyCodeValues
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.GetHostReservationPurchasePreviewResponse
import aws.sdk.kotlin.services.ec2.model.Purchase
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


internal class GetHostReservationPurchasePreviewOperationDeserializer: HttpDeserialize<GetHostReservationPurchasePreviewResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): GetHostReservationPurchasePreviewResponse {
        if (!response.status.isSuccess()) {
            throwGetHostReservationPurchasePreviewError(context, response)
        }
        val builder = GetHostReservationPurchasePreviewResponse.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeGetHostReservationPurchasePreviewOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun deserializeGetHostReservationPurchasePreviewOperationBody(builder: GetHostReservationPurchasePreviewResponse.DslBuilder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val CURRENCYCODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("currencyCode"))
    val PURCHASE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("purchase"), XmlCollectionName("item"))
    val TOTALHOURLYPRICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("totalHourlyPrice"))
    val TOTALUPFRONTPRICE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("totalUpfrontPrice"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("GetHostReservationPurchasePreviewResult"))
        field(CURRENCYCODE_DESCRIPTOR)
        field(PURCHASE_DESCRIPTOR)
        field(TOTALHOURLYPRICE_DESCRIPTOR)
        field(TOTALUPFRONTPRICE_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                CURRENCYCODE_DESCRIPTOR.index -> builder.currencyCode = deserializeString().let { CurrencyCodeValues.fromValue(it) }
                PURCHASE_DESCRIPTOR.index -> builder.purchase =
                    deserializer.deserializeList(PURCHASE_DESCRIPTOR) {
                        val col0 = mutableListOf<Purchase>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializePurchaseDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                TOTALHOURLYPRICE_DESCRIPTOR.index -> builder.totalHourlyPrice = deserializeString()
                TOTALUPFRONTPRICE_DESCRIPTOR.index -> builder.totalUpfrontPrice = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwGetHostReservationPurchasePreviewError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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
