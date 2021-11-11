// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AuthorizeSecurityGroupEgressRequest
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


internal class AuthorizeSecurityGroupEgressOperationSerializer: HttpSerialize<AuthorizeSecurityGroupEgressRequest> {
    override suspend fun serialize(context: ExecutionContext, input: AuthorizeSecurityGroupEgressRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.POST

        builder.url {
            path = "/"
        }

        val payload = serializeAuthorizeSecurityGroupEgressOperationBody(context, input)
        builder.body = ByteArrayContent(payload)
        builder.headers.setMissing("Content-Type", "application/x-www-form-urlencoded")
        return builder
    }
}

private fun serializeAuthorizeSecurityGroupEgressOperationBody(context: ExecutionContext, input: AuthorizeSecurityGroupEgressRequest): ByteArray {
    val serializer = FormUrlSerializer()
    val CIDRIP_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("CidrIp"))
    val DRYRUN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("DryRun"))
    val FROMPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("FromPort"))
    val GROUPID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("GroupId"))
    val IPPERMISSIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("IpPermissions"), FormUrlFlattened)
    val IPPROTOCOL_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("IpProtocol"))
    val SOURCESECURITYGROUPNAME_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("SourceSecurityGroupName"))
    val SOURCESECURITYGROUPOWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, FormUrlSerialName("SourceSecurityGroupOwnerId"))
    val TAGSPECIFICATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("TagSpecification"), FormUrlFlattened)
    val TOPORT_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Integer, FormUrlSerialName("ToPort"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("AuthorizeSecurityGroupEgressRequest"))
        trait(QueryLiteral("Action", "AuthorizeSecurityGroupEgress"))
        trait(QueryLiteral("Version", "2016-11-15"))
        field(CIDRIP_DESCRIPTOR)
        field(DRYRUN_DESCRIPTOR)
        field(FROMPORT_DESCRIPTOR)
        field(GROUPID_DESCRIPTOR)
        field(IPPERMISSIONS_DESCRIPTOR)
        field(IPPROTOCOL_DESCRIPTOR)
        field(SOURCESECURITYGROUPNAME_DESCRIPTOR)
        field(SOURCESECURITYGROUPOWNERID_DESCRIPTOR)
        field(TAGSPECIFICATIONS_DESCRIPTOR)
        field(TOPORT_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.cidrIp?.let { field(CIDRIP_DESCRIPTOR, it) }
        input.dryRun?.let { field(DRYRUN_DESCRIPTOR, it) }
        input.fromPort?.let { field(FROMPORT_DESCRIPTOR, it) }
        input.groupId?.let { field(GROUPID_DESCRIPTOR, it) }
        if (input.ipPermissions != null) {
            listField(IPPERMISSIONS_DESCRIPTOR) {
                for (el0 in input.ipPermissions) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeIpPermissionDocument))
                }
            }
        }
        input.ipProtocol?.let { field(IPPROTOCOL_DESCRIPTOR, it) }
        input.sourceSecurityGroupName?.let { field(SOURCESECURITYGROUPNAME_DESCRIPTOR, it) }
        input.sourceSecurityGroupOwnerId?.let { field(SOURCESECURITYGROUPOWNERID_DESCRIPTOR, it) }
        if (input.tagSpecifications != null) {
            listField(TAGSPECIFICATIONS_DESCRIPTOR) {
                for (el0 in input.tagSpecifications) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeTagSpecificationDocument))
                }
            }
        }
        input.toPort?.let { field(TOPORT_DESCRIPTOR, it) }
    }
    return serializer.toByteArray()
}
