// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.ModifyHostsRequest
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
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlFlattened
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerializer
import aws.smithy.kotlin.runtime.serde.formurl.QueryLiteral
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal class ModifyHostsOperationSerializer: HttpSerialize<ModifyHostsRequest> {
    override suspend fun serialize(context: ExecutionContext, input: ModifyHostsRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeModifyHostsOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeModifyHostsOperationBody(context: ExecutionContext, input: ModifyHostsRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val AUTOPLACEMENT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("AutoPlacement"))
    val HOSTIDS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("HostId"), FormUrlFlattened)
    val HOSTRECOVERY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("HostRecovery"))
    val INSTANCEFAMILY_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceFamily"))
    val INSTANCETYPE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("InstanceType"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("ModifyHostsRequest"))
        trait(QueryLiteral("Action", "ModifyHosts"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(AUTOPLACEMENT_DESCRIPTOR)
        field(HOSTIDS_DESCRIPTOR)
        field(HOSTRECOVERY_DESCRIPTOR)
        field(INSTANCEFAMILY_DESCRIPTOR)
        field(INSTANCETYPE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.autoPlacement?.let { field(AUTOPLACEMENT_DESCRIPTOR, it.value) }
        if (input.hostIds != null) {
            listField(HOSTIDS_DESCRIPTOR) {
                for (el0 in input.hostIds) {
                    serializeString(el0)
                }
            }
        }
        input.hostRecovery?.let { field(HOSTRECOVERY_DESCRIPTOR, it.value) }
        input.instanceFamily?.let { field(INSTANCEFAMILY_DESCRIPTOR, it) }
        input.instanceType?.let { field(INSTANCETYPE_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
