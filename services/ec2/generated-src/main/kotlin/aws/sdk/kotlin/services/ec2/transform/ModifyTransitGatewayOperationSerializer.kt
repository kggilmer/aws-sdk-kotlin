// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ModifyTransitGatewayRequest
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
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer
import aws.smithy.kotlin.runtime.serde.formurl.QueryLiteral
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class ModifyTransitGatewayOperationSerializer: HttpSerialize<ModifyTransitGatewayRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ModifyTransitGatewayRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeModifyTransitGatewayOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeModifyTransitGatewayOperationBody(context: ExecutionContext, input: ModifyTransitGatewayRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DESCRIPTION_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("Description"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val OPTIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Struct, FormUrlSerialName("Options"))
    val TRANSITGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("TransitGatewayId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ModifyTransitGatewayRequest"))
        trait(QueryLiteral("Action", "ModifyTransitGateway"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DESCRIPTION_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(OPTIONS_DESCRIPTOR)
        field(TRANSITGATEWAYID_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.description?.let { field(DESCRIPTION_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.options?.let { field(OPTIONS_DESCRIPTOR, it, ::serializeModifyTransitGatewayOptionsDocument) }
        input.transitGatewayId?.let { field(TRANSITGATEWAYID_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
