// Code generated by smithy-kotlin-codegen. DO NOT EDIT!

package aws.sdk.kotlin.services.ec2.transform

import aws.sdk.kotlin.services.ec2.model.AnalysisRouteTableRoute
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


internal suspend fun deserializeAnalysisRouteTableRouteDocument(deserializer: Deserializer): AnalysisRouteTableRoute {
    val builder = AnalysisRouteTableRoute.builder()
    val DESTINATIONCIDR_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("destinationCidr"))
    val DESTINATIONPREFIXLISTID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("destinationPrefixListId"))
    val EGRESSONLYINTERNETGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("egressOnlyInternetGatewayId"))
    val GATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("gatewayId"))
    val INSTANCEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("instanceId"))
    val NATGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("natGatewayId"))
    val NETWORKINTERFACEID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("networkInterfaceId"))
    val ORIGIN_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("origin"))
    val TRANSITGATEWAYID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("transitGatewayId"))
    val VPCPEERINGCONNECTIONID_DESCRIPTOR = SdkFieldDescriptor(SerialKind.String, XmlSerialName("vpcPeeringConnectionId"))
    val OBJ_DESCRIPTOR = SdkObjectDescriptor.build {
        trait(XmlSerialName("AnalysisRouteTableRoute"))
        trait(XmlNamespace("http://ec2.amazonaws.com/doc/2016-11-15"))
        field(DESTINATIONCIDR_DESCRIPTOR)
        field(DESTINATIONPREFIXLISTID_DESCRIPTOR)
        field(EGRESSONLYINTERNETGATEWAYID_DESCRIPTOR)
        field(GATEWAYID_DESCRIPTOR)
        field(INSTANCEID_DESCRIPTOR)
        field(NATGATEWAYID_DESCRIPTOR)
        field(NETWORKINTERFACEID_DESCRIPTOR)
        field(ORIGIN_DESCRIPTOR)
        field(TRANSITGATEWAYID_DESCRIPTOR)
        field(VPCPEERINGCONNECTIONID_DESCRIPTOR)
    }

    deserializer.deserializeStruct(OBJ_DESCRIPTOR) {
        loop@while (true) {
            when (findNextFieldIndex()) {
                DESTINATIONCIDR_DESCRIPTOR.index -> builder.destinationCidr = deserializeString()
                DESTINATIONPREFIXLISTID_DESCRIPTOR.index -> builder.destinationPrefixListId = deserializeString()
                EGRESSONLYINTERNETGATEWAYID_DESCRIPTOR.index -> builder.egressOnlyInternetGatewayId = deserializeString()
                GATEWAYID_DESCRIPTOR.index -> builder.gatewayId = deserializeString()
                INSTANCEID_DESCRIPTOR.index -> builder.instanceId = deserializeString()
                NATGATEWAYID_DESCRIPTOR.index -> builder.natGatewayId = deserializeString()
                NETWORKINTERFACEID_DESCRIPTOR.index -> builder.networkInterfaceId = deserializeString()
                ORIGIN_DESCRIPTOR.index -> builder.origin = deserializeString()
                TRANSITGATEWAYID_DESCRIPTOR.index -> builder.transitGatewayId = deserializeString()
                VPCPEERINGCONNECTIONID_DESCRIPTOR.index -> builder.vpcPeeringConnectionId = deserializeString()
                null -> break@loop
                else -> skipValue()
            }
        }
    }
    return builder.build()
}
