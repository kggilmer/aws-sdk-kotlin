// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.Ipv6CidrAssociation
import aws.smithy.kotlin.runtime.serde.Deserializer
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
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal suspend fun deserializeIpv6CidrAssociationDocument(deserializer: Deserializer): Ipv6CidrAssociation {
    val builder = Ipv6CidrAssociation.builder()
    val ASSOCIATEDRESOURCE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("associatedResource"))
    val IPV6CIDR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ipv6Cidr"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("Ipv6CidrAssociation"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(ASSOCIATEDRESOURCE_DESCRIPTOR)
        field(IPV6CIDR_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                ASSOCIATEDRESOURCE_DESCRIPTOR.index -> builder.associatedResource = deserializeString()
                IPV6CIDR_DESCRIPTOR.index -> builder.ipv6Cidr = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
