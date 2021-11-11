// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.LocalGatewayRouteTableVirtualInterfaceGroupAssociation
import aws.sdk.kotlin.services.ec2.model.Tag
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
import aws.smithy.kotlin.runtime.serde.xml.XmlCollectionName
import aws.smithy.kotlin.runtime.serde.xml.XmlDeserializer
import aws.smithy.kotlin.runtime.serde.xml.XmlNamespace
import aws.smithy.kotlin.runtime.serde.xml.XmlSerialName


internal suspend fun deserializeLocalGatewayRouteTableVirtualInterfaceGroupAssociationDocument(deserializer: Deserializer): LocalGatewayRouteTableVirtualInterfaceGroupAssociation {
    val builder = LocalGatewayRouteTableVirtualInterfaceGroupAssociation.builder()
    val LOCALGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("localGatewayId"))
    val LOCALGATEWAYROUTETABLEARN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("localGatewayRouteTableArn"))
    val LOCALGATEWAYROUTETABLEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("localGatewayRouteTableId"))
    val LOCALGATEWAYROUTETABLEVIRTUALINTERFACEGROUPASSOCIATIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("localGatewayRouteTableVirtualInterfaceGroupAssociationId"))
    val LOCALGATEWAYVIRTUALINTERFACEGROUPID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("localGatewayVirtualInterfaceGroupId"))
    val OWNERID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("ownerId"))
    val STATE_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("state"))
    val TAGS_DESCRIPTOR = SdkFieldDescriptor(SerialKind.List, XmlSerialName("tagSet"), XmlCollectionName("item"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("LocalGatewayRouteTableVirtualInterfaceGroupAssociation"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(LOCALGATEWAYID_DESCRIPTOR)
        field(LOCALGATEWAYROUTETABLEARN_DESCRIPTOR)
        field(LOCALGATEWAYROUTETABLEID_DESCRIPTOR)
        field(LOCALGATEWAYROUTETABLEVIRTUALINTERFACEGROUPASSOCIATIONID_DESCRIPTOR)
        field(LOCALGATEWAYVIRTUALINTERFACEGROUPID_DESCRIPTOR)
        field(OWNERID_DESCRIPTOR)
        field(STATE_DESCRIPTOR)
        field(TAGS_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                LOCALGATEWAYID_DESCRIPTOR.index -> builder.localGatewayId = deserializeString()
                LOCALGATEWAYROUTETABLEARN_DESCRIPTOR.index -> builder.localGatewayRouteTableArn = deserializeString()
                LOCALGATEWAYROUTETABLEID_DESCRIPTOR.index -> builder.localGatewayRouteTableId = deserializeString()
                LOCALGATEWAYROUTETABLEVIRTUALINTERFACEGROUPASSOCIATIONID_DESCRIPTOR.index -> builder.localGatewayRouteTableVirtualInterfaceGroupAssociationId = deserializeString()
                LOCALGATEWAYVIRTUALINTERFACEGROUPID_DESCRIPTOR.index -> builder.localGatewayVirtualInterfaceGroupId = deserializeString()
                OWNERID_DESCRIPTOR.index -> builder.ownerId = deserializeString()
                STATE_DESCRIPTOR.index -> builder.state = deserializeString()
                TAGS_DESCRIPTOR.index -> builder.tags =
                    deserializer.deserializeList(TAGS_DESCRIPTOR) {
                        val col0 = mutableListOf<Tag>()
                        while (hasNextElement()) {
                            val el0 = if (nextHasValue()) { deserializeTagDocument(deserializer) } else { deserializeNull(); continue }
                            col0.add(el0)
                        }
                        col0
                    }
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
