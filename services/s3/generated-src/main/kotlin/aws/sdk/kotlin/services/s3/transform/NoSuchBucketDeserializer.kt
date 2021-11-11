// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.NoSuchBucket
import aws.smithy.kotlin.runtime.client.ExecutionContext
import aws.smithy.kotlin.runtime.http.operation.HttpDeserialize
import aws.smithy.kotlin.runtime.http.response.HttpResponse
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.deserializeStruct


internal class NoSuchBucketDeserializer: HttpDeserialize<NoSuchBucket> {

    override suspend fun deserialize(context: ExecutionContext, response: HttpResponse): NoSuchBucket {
        val builder = NoSuchBucket.builder()

        return builder.build()
    }
}
