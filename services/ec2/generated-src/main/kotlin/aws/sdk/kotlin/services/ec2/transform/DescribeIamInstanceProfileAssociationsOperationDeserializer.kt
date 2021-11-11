// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.runtime.UnknownServiceErrorException
import aws.sdk.kotlin.runtime.http.setAseErrorMetadata
import aws.sdk.kotlin.runtime.http.withPayload
import aws.sdk.kotlin.runtime.protocol.xml.parseEc2QueryErrorResponse
import aws.sdk.kotlin.services.ec2.model.DescribeIamInstanceProfileAssociationsResponse
import aws.sdk.kotlin.services.ec2.model.Ec2Exception
import aws.sdk.kotlin.services.ec2.model.IamInstanceProfileAssociation
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


internal class DescribeIamInstanceProfileAssociationsOperationDeserializer: HttpDeserialize<DescribeIamInstanceProfileAssociationsResponse> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): DescribeIamInstanceProfileAssociationsResponse {
        if (!response.status.isSuccess()) {
            throwDescribeIamInstanceProfileAssociationsError(context, response)
        }
        val builder = DescribeIamInstanceProfileAssociationsResponse.builder()

        val payload = response.body.readAll()
        if (payload != null) {
            deserializeDescribeIamInstanceProfileAssociationsOperationBody(builder, payload)
        }
        return builder.build()
    }
}

private suspend fun deserializeDescribeIamInstanceProfileAssociationsOperationBody(builder: DescribeIamInstanceProfileAssociationsResponse.DslBuilder, payload: ByteArray) {
    val deserializer = XmlDeserializer(payload)
    val IAMINSTANCEPROFILEASSOCIATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("iamInstanceProfileAssociationSet"), XmlCollectionName("item"))
    val NEXTTOKEN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("nextToken"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        trait(XmlSerialName("DescribeIamInstanceProfileAssociationsResult"))
        field(IAMINSTANCEPROFILEASSOCIATIONS_DESCRIPTOR)
        field(NEXTTOKEN_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                IAMINSTANCEPROFILEASSOCIATIONS_DESCRIPTOR.index -> builder.iamInstanceProfileAssociations =
                    deserializer.deserializeList(IAMINSTANCEPROFILEASSOCIATIONS_DESCRIPTOR) {
                        val col0 = mutableListOf<IamInstanceProfileAssociation>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeIamInstanceProfileAssociationDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                NEXTTOKEN_DESCRIPTOR.index -> builder.nextToken = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
}

private suspend fun throwDescribeIamInstanceProfileAssociationsError(context: ExecutionContext, response: HttpResponse): kotlin.Nothing {
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
