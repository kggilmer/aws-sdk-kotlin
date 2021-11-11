// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3

import aws.sdk.kotlin.runtime.auth.credentials.Credentials
import aws.sdk.kotlin.runtime.auth.credentials.StaticCredentialsProvider
import aws.sdk.kotlin.services.s3.model.*
import aws.smithy.kotlin.runtime.config.IdempotencyTokenProvider
import aws.smithy.kotlin.runtime.http.HttpStatusCode
import aws.smithy.kotlin.runtime.smithy.test.*
import kotlin.test.Test
import kotlin.test.assertFailsWith


class HeadBucketNotFoundTest {
    /**
     * This test case validates https://github.com/awslabs/aws-sdk-kotlin/issues/152
     */
    @Test
    fun `HeadObjectEmptyBody`() = httpResponseTest<NotFound> {
        expected {
            statusCode = HttpStatusCode.fromValue(404)
            headers = mapOf(
                "content-type" to "application/xml",
                "date" to "Thu, 03 Jun 2021 04:05:52 GMT",
                "server" to "AmazonS3",
                "x-amz-id-2" to "UTniwu6QmCIjVeuK2ZfeWBOnu7SqMQOS3Vac6B/K4H2ZCawYUl+nDbhGTImuyhZ5DFiojR3Kcz4=",
                "x-amz-request-id" to "GRZ6BZ468DF52F2E"
            )

            response = NotFound {

            }

        }

        test { expectedResult, mockEngine ->
            val input = HeadBucketRequest{}
            val service = S3Client {
                httpClientEngine = mockEngine
                val credentials = Credentials("AKID", "SECRET")
                credentialsProvider = StaticCredentialsProvider(credentials)
                region = "us-east-1"
            }
            assertFailsWith(NotFound::class) {
                service.headBucket(input)
            }
        }
    }
}
