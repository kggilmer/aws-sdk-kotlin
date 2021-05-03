/*
 * Copyright Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: Apache-2.0.
 */

description = "Runtime customizations for AWS Services"
extra["displayName"] = "Software :: AWS :: Kotlin SDK :: Customizations :: S3"
extra["moduleName"] = "aws.sdk.kotlin.runtime.customizations.s3"
val smithyKotlinVersion: String by project
val crtKotlinVersion: String by project

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                api(project(":client-runtime:aws-client-rt"))
                api(project(":client-runtime:protocols:http"))
                api(project(":client-runtime:protocols:aws-xml-protocols"))
                api("software.aws.smithy.kotlin:client-rt-core:$smithyKotlinVersion")
                api("software.amazon.smithy:smithy-kotlin-codegen:$smithyKotlinVersion")
                api("software.aws.smithy.kotlin:http:$smithyKotlinVersion")
                implementation("software.aws.smithy.kotlin:serde:$smithyKotlinVersion")
                implementation("software.aws.smithy.kotlin:serde-xml:$smithyKotlinVersion")
            }
        }
    }
}

