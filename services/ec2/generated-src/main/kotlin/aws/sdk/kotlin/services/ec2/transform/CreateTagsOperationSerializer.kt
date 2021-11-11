// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.CreateTagsRequest
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


internal class CreateTagsOperationSerializer: HttpSerialize<CreateTagsRequest> {
    override suspend fun serialize(context: ExecutionContext, input: CreateTagsRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeCreateTagsOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeCreateTagsOperationBody(context: ExecutionContext, input: CreateTagsRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val RESOURCES_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("ResourceId"), FormUrlFlattened)
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("Tag"), FormUrlFlattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("CreateTagsRequest"))
        trait(QueryLiteral("Action", "CreateTags"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(DRYRUN_DESCRIPTOR)
        field(RESOURCES_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        if (input.resources != null) {
            listField(RESOURCES_DESCRIPTOR) {
                for (el0 in input.resources) {
                    serializeString(el0)
                }
            }
        }
        if (input.tags != null) {
            listField(TAGS_DESCRIPTOR) {
                for (el0 in input.tags) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeTagDocument))
                }
            }
        }
    }
    return serializer.toByteArray()
}
