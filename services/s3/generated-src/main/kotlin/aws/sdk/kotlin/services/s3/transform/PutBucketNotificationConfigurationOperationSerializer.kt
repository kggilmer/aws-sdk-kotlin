// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.PutBucketNotificationConfigurationRequest
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.HttpBody
import aws.smithy.kotlin.runtime.http.HttpMethod
import aws.smithy.kotlin.runtime.http.content.ByteArrayContent
import aws.smithy.kotlin.runtime.http.operation.HttpSerialize
import aws.smithy.kotlin.runtime.http.parameters
import aws.smithy.kotlin.runtime.http.request.HttpRequestBuilder
import aws.smithy.kotlin.runtime.http.request.headers
import aws.smithy.kotlin.runtime.http.request.url
import aws.smithy.kotlin.runtime.http.util.encodeLabel
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
import aws.smithy.kotlin.runtime.serde.xml.Flattened
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName
import aws.smithy.kotlin.runtime.serde.xml.XmlSerializer


internal class PutBucketNotificationConfigurationOperationSerializer: HttpSerialize<PutBucketNotificationConfigurationRequest> {
    override suspend fun serialize(context: ExecutionContext, input: PutBucketNotificationConfigurationRequest): HttpRequestBuilder {
        val builder = HttpRequestBuilder()
        builder.method = HttpMethod.PUT

        builder.url {
            val pathSegments = listOf(
                "${input.bucket}".encodeLabel(),
            )
            path = pathSegments.joinToString(separator = "/", prefix = "/")
            parameters {
                append("notification", "")
            }
        }

        builder.headers {
            if (input.expectedBucketOwner?.isNotEmpty() == true) append("x-amz-expected-bucket-owner", input.expectedBucketOwner)
        }

        if (input.notificationConfiguration != null) {
            val payload = serializePutBucketNotificationConfigurationOperationBody(context, input)
            builder.body = ByteArrayContent(payload)
        }
        builder.headers.setMissing("Content-Type", "application/xml")
        return builder
    }
}

private fun serializePutBucketNotificationConfigurationOperationBody(context: ExecutionContext, input: PutBucketNotificationConfigurationRequest): ByteArray {
    val serializer = XmlSerializer()
    val input = requireNotNull(input.notificationConfiguration)
    val LAMBDAFUNCTIONCONFIGURATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("CloudFunctionConfiguration"), Flattened)
    val QUEUECONFIGURATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("QueueConfiguration"), Flattened)
    val TOPICCONFIGURATIONS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("TopicConfiguration"), Flattened)
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("NotificationConfiguration"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(LAMBDAFUNCTIONCONFIGURATIONS_DESCRIPTOR)
        field(QUEUECONFIGURATIONS_DESCRIPTOR)
        field(TOPICCONFIGURATIONS_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.lambdaFunctionConfigurations != null) {
            listField(LAMBDAFUNCTIONCONFIGURATIONS_DESCRIPTOR) {
                for (el0 in input.lambdaFunctionConfigurations) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeLambdaFunctionConfigurationDocument))
                }
            }
        }
        if (input.queueConfigurations != null) {
            listField(QUEUECONFIGURATIONS_DESCRIPTOR) {
                for (el0 in input.queueConfigurations) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeQueueConfigurationDocument))
                }
            }
        }
        if (input.topicConfigurations != null) {
            listField(TOPICCONFIGURATIONS_DESCRIPTOR) {
                for (el0 in input.topicConfigurations) {
                    serializeSdkSerializable(asSdkSerializable(el0, ::serializeTopicConfigurationDocument))
                }
            }
        }
    }
    return serializer.toByteArray()
}
