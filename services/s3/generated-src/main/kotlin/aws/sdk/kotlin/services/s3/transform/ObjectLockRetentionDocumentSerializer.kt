// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.s3.transform

import aws.sdk.kotlin.services.s3.model.ObjectLockRetention
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName
import aws.smithy.kotlin.runtime.time.TimestampFormat


internal fun serializeObjectLockRetentionDocument(serializer: Serializer, input: ObjectLockRetention) {
    val MODE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("Mode"))
    val RETAINUNTILDATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Timestamp, XmlSerialName("RetainUntilDate"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("ObjectLockRetention"))
        trait(XmlNamespace("http://s3.amazonaws.com/doc/2006-03-01/"))
        field(MODE_DESCRIPTOR)
        field(RETAINUNTILDATE_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        input.mode?.let { field(MODE_DESCRIPTOR, it.value) }
        input.retainUntilDate?.let { field(RETAINUNTILDATE_DESCRIPTOR, it, TimestampFormat.ISO_8601) }
    }
}
