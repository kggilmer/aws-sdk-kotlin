// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.DnsServersOptionsModifyStructure
import aws.smithy.kotlin.runtime.serde.SdkFieldDescriptor
import aws.smithy.kotlin.runtime.serde.SdkObjectDescriptor
import aws.smithy.kotlin.runtime.serde.SerialKind
import aws.smithy.kotlin.runtime.serde.Serializer
import aws.smithy.kotlin.runtime.serde.asSdkSerializable
import aws.smithy.kotlin.runtime.serde.deserializeList
import aws.smithy.kotlin.runtime.serde.deserializeMap
import aws.smithy.kotlin.runtime.serde.deserializeStruct
import aws.smithy.kotlin.runtime.serde.field
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlFlattened
import aws.smithy.kotlin.runtime.serde.formurl.FormUrlSerialName
import aws.smithy.kotlin.runtime.serde.serializeList
import aws.smithy.kotlin.runtime.serde.serializeMap
import aws.smithy.kotlin.runtime.serde.serializeStruct


internal fun serializeDnsServersOptionsModifyStructureDocument(serializer: Serializer, input: DnsServersOptionsModifyStructure) {
    val CUSTOMDNSSERVERS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, FormUrlSerialName("CustomDnsServers"), FormUrlFlattened)
    val ENABLED_DESCRIPTOR = SdkFieldDescriptor(SerialKind.Boolean, FormUrlSerialName("Enabled"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(FormUrlSerialName("DnsServersOptionsModifyStructure"))
        field(CUSTOMDNSSERVERS_DESCRIPTOR)
        field(ENABLED_DESCRIPTOR)
    }

    serializer.serializeStruct(OBJ_DESCRIPTOR) {
        if (input.customDnsServers != null) {
            listField(CUSTOMDNSSERVERS_DESCRIPTOR) {
                for (el0 in input.customDnsServers) {
                    serializeString(el0)
                }
            }
        }
        input.enabled?.let { field(ENABLED_DESCRIPTOR, it) }
    }
}
