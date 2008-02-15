/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractAsyncReplyRouter <em>Abstract Async Reply Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractBinding <em>Abstract Binding</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractCatchAllStrategy <em>Abstract Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractComponent <em>Abstract Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractComponentThreadingProfile <em>Abstract Component Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractConnectionStrategy <em>Abstract Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractConnector <em>Abstract Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractDefineNotification <em>Abstract Define Notification</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractDisableNotification <em>Abstract Disable Notification</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractEntryPointResolver <em>Abstract Entry Point Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractEntryPointResolverSet <em>Abstract Entry Point Resolver Set</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractExceptionStrategy <em>Abstract Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractExtension <em>Abstract Extension</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractFilter <em>Abstract Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractGlobalEndpoint <em>Abstract Global Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractInboundRouter <em>Abstract Inbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractModel <em>Abstract Model</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractObjectFactory <em>Abstract Object Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractOutboundEndpoint <em>Abstract Outbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractOutboundRouter <em>Abstract Outbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractPoolingProfile <em>Abstract Pooling Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractPropertyExtractor <em>Abstract Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractQueueProfile <em>Abstract Queue Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractSecurityFilter <em>Abstract Security Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractSecurityManager <em>Abstract Security Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractService <em>Abstract Service</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractStorage <em>Abstract Storage</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractTransaction <em>Abstract Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractTransactionManager <em>Abstract Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractTransformer <em>Abstract Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAndFilter <em>And Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAppendStringTransformer <em>Append String Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getArrayEntryPointResolver <em>Array Entry Point Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getBase64DecoderTransformer <em>Base64 Decoder Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getBase64EncoderTransformer <em>Base64 Encoder Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getBeanPropertyExtractor <em>Bean Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getBridgeComponent <em>Bridge Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getByteArrayToHexStringTransformer <em>Byte Array To Hex String Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getByteArrayToObjectTransformer <em>Byte Array To Object Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getByteArrayToSerializableTransformer <em>Byte Array To Serializable Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getByteArrayToStringTransformer <em>Byte Array To String Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCallableEntryPointResolver <em>Callable Entry Point Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getChainingRouter <em>Chaining Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getComponent <em>Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getComponentThreadingProfile <em>Component Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCorrelationPropertyExtractor <em>Correlation Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCorrelationResequencerRouter <em>Correlation Resequencer Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomAsyncReplyRouter <em>Custom Async Reply Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomCatchAllStrategy <em>Custom Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomConnectionStrategy <em>Custom Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomConnector <em>Custom Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomContainer <em>Custom Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomCorrelationAggregatorRouter <em>Custom Correlation Aggregator Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomEntryPointResolver <em>Custom Entry Point Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomEntryPointResolverSet <em>Custom Entry Point Resolver Set</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomExceptionStrategy <em>Custom Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomFilter <em>Custom Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomForwardingCatchAllStrategy <em>Custom Forwarding Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomInboundRouter <em>Custom Inbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomOutboundRouter <em>Custom Outbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomPropertyExtractor <em>Custom Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomTransaction <em>Custom Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomTransactionManager <em>Custom Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomTransformer <em>Custom Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getDecryptTransformer <em>Decrypt Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getDefaultConnectorExceptionStrategy <em>Default Connector Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getDefaultServiceExceptionStrategy <em>Default Service Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getDisableNotification <em>Disable Notification</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getEchoComponent <em>Echo Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getEjbContainer <em>Ejb Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getEncryptionSecurityFilter <em>Encryption Security Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getEncryptTransformer <em>Encrypt Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getEndpointSelectorRouter <em>Endpoint Selector Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getEntryPointResolverSet <em>Entry Point Resolver Set</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getExceptionBasedRouter <em>Exception Based Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getExceptionTypeFilter <em>Exception Type Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getFilteringRouter <em>Filtering Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getForwardingCatchAllStrategy <em>Forwarding Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getForwardingRouter <em>Forwarding Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getGzipCompressTransformer <em>Gzip Compress Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getGzipUncompressTransformer <em>Gzip Uncompress Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getHexStringToByteArrayTransformer <em>Hex String To Byte Array Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getHivemindContainer <em>Hivemind Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getIdempotentReceiverRouter <em>Idempotent Receiver Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getIdempotentSecureHashReceiverRouter <em>Idempotent Secure Hash Receiver Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getInboundEndpoint <em>Inbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getInboundPassThroughRouter <em>Inbound Pass Through Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getIncludeEntryPoint <em>Include Entry Point</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getJbossTransactionManager <em>Jboss Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getJndiContainer <em>Jndi Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getJndiTransactionManager <em>Jndi Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getJrunTransactionManager <em>Jrun Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getLegacyEntryPointResolverSet <em>Legacy Entry Point Resolver Set</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getListMessageSplitterRouter <em>List Message Splitter Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getLogComponent <em>Log Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getLoggingCatchAllStrategy <em>Logging Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getMapPropertyExtractor <em>Map Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getMessageChunkingAggregatorRouter <em>Message Chunking Aggregator Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getMessageChunkingRouter <em>Message Chunking Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getMessagePropertiesTransformer <em>Message Properties Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getMessagePropertyExtractor <em>Message Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getMessagePropertyFilter <em>Message Property Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getMethodEntryPointResolver <em>Method Entry Point Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getModel <em>Model</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getMule <em>Mule</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getMulticastingRouter <em>Multicasting Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getNoActionTransformer <em>No Action Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getNoArgumentsEntryPointResolver <em>No Arguments Entry Point Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getNotFilter <em>Not Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getNotification <em>Notification</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getNullComponent <em>Null Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getObjectToByteArrayTransformer <em>Object To Byte Array Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getObjectToStringTransformer <em>Object To String Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getOrFilter <em>Or Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getOutboundEndpoint <em>Outbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getOutboundPassThroughRouter <em>Outbound Pass Through Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getPassThroughComponent <em>Pass Through Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getPayloadPropertyExtractor <em>Payload Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getPayloadTypeFilter <em>Payload Type Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getPicoContainer <em>Pico Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getPlexusContainer <em>Plexus Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getPooledObject <em>Pooled Object</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getPoolingProfile <em>Pooling Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getPropertiesContainer <em>Properties Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getPropertyEntryPointResolver <em>Property Entry Point Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getPrototypeObject <em>Prototype Object</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getQueueProfile <em>Queue Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getReflectionEntryPointResolver <em>Reflection Entry Point Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getRegexFilter <em>Regex Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getResinTransactionManager <em>Resin Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getRetryConnectionStrategy <em>Retry Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getRmiContainer <em>Rmi Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getSecurityManager <em>Security Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getSedaModel <em>Seda Model</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getSelectiveConsumerRouter <em>Selective Consumer Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getSerializableToByteArrayTransformer <em>Serializable To Byte Array Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getService <em>Service</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getSingleAsyncReplyRouter <em>Single Async Reply Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getSingletonObject <em>Singleton Object</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getSpringObject <em>Spring Object</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getStaticRecipientListRouter <em>Static Recipient List Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getStringToByteArrayTransformer <em>String To Byte Array Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTemplateEndpointRouter <em>Template Endpoint Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getUcDecoderTransformer <em>Uc Decoder Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getUcEncoderTransformer <em>Uc Encoder Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getUuDecoderTransformer <em>Uu Decoder Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getUuEncoderTransformer <em>Uu Encoder Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getWeblogicTransactionManager <em>Weblogic Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getWebsphereTransactionManager <em>Websphere Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getWildcardFilter <em>Wildcard Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getWireTapRouter <em>Wire Tap Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getXmlEntityDecoderTransformer <em>Xml Entity Decoder Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getXmlEntityEncoderTransformer <em>Xml Entity Encoder Transformer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Abstract Async Reply Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Async Reply Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Async Reply Router</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractAsyncReplyRouter()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-async-reply-router' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractAsyncReplyRouterType getAbstractAsyncReplyRouter();

	/**
	 * Returns the value of the '<em><b>Abstract Binding</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Binding</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Binding</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractBinding()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-binding' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractBindingType getAbstractBinding();

	/**
	 * Returns the value of the '<em><b>Abstract Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Catch All Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Catch All Strategy</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractCatchAllStrategy()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-catch-all-strategy' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractCatchAllStrategyType getAbstractCatchAllStrategy();

	/**
	 * Returns the value of the '<em><b>Abstract Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Component</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractComponent()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-component' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractComponentType getAbstractComponent();

	/**
	 * Returns the value of the '<em><b>Abstract Component Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Component Threading Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Component Threading Profile</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractComponentThreadingProfile()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-component-threading-profile' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractComponentThreadingProfileType getAbstractComponentThreadingProfile();

	/**
	 * Returns the value of the '<em><b>Abstract Connection Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Connection Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Connection Strategy</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractConnectionStrategy()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-connection-strategy' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractConnectionStrategyType getAbstractConnectionStrategy();

	/**
	 * Returns the value of the '<em><b>Abstract Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Connector</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractConnector()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-connector' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractConnectorType getAbstractConnector();

	/**
	 * Returns the value of the '<em><b>Abstract Define Notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Define Notification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Define Notification</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractDefineNotification()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-define-notification' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractDefineNotificationType getAbstractDefineNotification();

	/**
	 * Returns the value of the '<em><b>Abstract Disable Notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Disable Notification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Disable Notification</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractDisableNotification()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-disable-notification' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractDisableNotificationType getAbstractDisableNotification();

	/**
	 * Returns the value of the '<em><b>Abstract Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Entry Point Resolver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Entry Point Resolver</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractEntryPointResolver()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-entry-point-resolver' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractEntryPointResolverType getAbstractEntryPointResolver();

	/**
	 * Returns the value of the '<em><b>Abstract Entry Point Resolver Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Entry Point Resolver Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Entry Point Resolver Set</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractEntryPointResolverSet()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-entry-point-resolver-set' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractEntryPointResolverSetType getAbstractEntryPointResolverSet();

	/**
	 * Returns the value of the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Exception Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Exception Strategy</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractExceptionStrategy()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-exception-strategy' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractExceptionStrategyType getAbstractExceptionStrategy();

	/**
	 * Returns the value of the '<em><b>Abstract Extension</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Abstract base for arbitrary extensions as children of the mule element.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Extension</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractExtension()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-extension' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractExtensionType getAbstractExtension();

	/**
	 * Returns the value of the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Filter</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractFilter()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-filter' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractFilterType getAbstractFilter();

	/**
	 * Returns the value of the '<em><b>Abstract Global Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Global Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Global Endpoint</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractGlobalEndpoint()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-global-endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractGlobalEndpointType getAbstractGlobalEndpoint();

	/**
	 * Returns the value of the '<em><b>Abstract Inbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Inbound Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Inbound Endpoint</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractInboundEndpoint()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-inbound-endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractInboundEndpointType getAbstractInboundEndpoint();

	/**
	 * Returns the value of the '<em><b>Abstract Inbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Inbound Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Inbound Router</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractInboundRouter()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-inbound-router' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractInboundRouterType getAbstractInboundRouter();

	/**
	 * Returns the value of the '<em><b>Abstract Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Model</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractModel()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-model' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractModelType getAbstractModel();

	/**
	 * Returns the value of the '<em><b>Abstract Object Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Object Factory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Object Factory</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractObjectFactory()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-object-factory' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractObjectFactoryType getAbstractObjectFactory();

	/**
	 * Returns the value of the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Outbound Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Outbound Endpoint</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractOutboundEndpoint()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-outbound-endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractOutboundEndpointType getAbstractOutboundEndpoint();

	/**
	 * Returns the value of the '<em><b>Abstract Outbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Outbound Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Outbound Router</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractOutboundRouter()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-outbound-router' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractOutboundRouterType getAbstractOutboundRouter();

	/**
	 * Returns the value of the '<em><b>Abstract Pooling Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Pooling Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Pooling Profile</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractPoolingProfile()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-pooling-profile' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractPoolingProfileType getAbstractPoolingProfile();

	/**
	 * Returns the value of the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Property Extractor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Property Extractor</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractPropertyExtractor()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-property-extractor' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractPropertyExtractorType getAbstractPropertyExtractor();

	/**
	 * Returns the value of the '<em><b>Abstract Queue Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Queue Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Queue Profile</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractQueueProfile()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-queue-profile' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractQueueProfileType getAbstractQueueProfile();

	/**
	 * Returns the value of the '<em><b>Abstract Security Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Security Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Security Filter</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractSecurityFilter()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-security-filter' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractSecurityFilterType getAbstractSecurityFilter();

	/**
	 * Returns the value of the '<em><b>Abstract Security Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A security manager is a container for security providers. More than one
	 *                 security manager may be configured; each contains providers from a particular
	 *                 module and has that module's type. This element is abstract - a security
	 *                 related module or transport will provide a suitable implementation.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Security Manager</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractSecurityManager()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-security-manager' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractSecurityManagerType getAbstractSecurityManager();

	/**
	 * Returns the value of the '<em><b>Abstract Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Service</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractService()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-service' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractServiceType getAbstractService();

	/**
	 * Returns the value of the '<em><b>Abstract Storage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Storage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Storage</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractStorage()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-storage' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractStorageType getAbstractStorage();

	/**
	 * Returns the value of the '<em><b>Abstract Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transaction</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractTransaction()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-transaction' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractTransactionType getAbstractTransaction();

	/**
	 * Returns the value of the '<em><b>Abstract Transaction Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transaction Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transaction Manager</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractTransactionManager()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-transaction-manager' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractTransactionManagerType getAbstractTransactionManager();

	/**
	 * Returns the value of the '<em><b>Abstract Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transformer</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractTransformer()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-transformer' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractTransformerType getAbstractTransformer();

	/**
	 * Returns the value of the '<em><b>And Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>And Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>And Filter</em>' containment reference.
	 * @see #setAndFilter(CollectionFilterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AndFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='and-filter' namespace='##targetNamespace' affiliation='abstract-filter'"
	 * @generated
	 */
	CollectionFilterType getAndFilter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getAndFilter <em>And Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>And Filter</em>' containment reference.
	 * @see #getAndFilter()
	 * @generated
	 */
	void setAndFilter(CollectionFilterType value);

	/**
	 * Returns the value of the '<em><b>Append String Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Append String Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Append String Transformer</em>' containment reference.
	 * @see #setAppendStringTransformer(AppendStringTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AppendStringTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='append-string-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AppendStringTransformerType getAppendStringTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getAppendStringTransformer <em>Append String Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Append String Transformer</em>' containment reference.
	 * @see #getAppendStringTransformer()
	 * @generated
	 */
	void setAppendStringTransformer(AppendStringTransformerType value);

	/**
	 * Returns the value of the '<em><b>Array Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array Entry Point Resolver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array Entry Point Resolver</em>' containment reference.
	 * @see #setArrayEntryPointResolver(ComplexEntryPointResolverType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_ArrayEntryPointResolver()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='array-entry-point-resolver' namespace='##targetNamespace' affiliation='abstract-entry-point-resolver'"
	 * @generated
	 */
	ComplexEntryPointResolverType getArrayEntryPointResolver();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getArrayEntryPointResolver <em>Array Entry Point Resolver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Entry Point Resolver</em>' containment reference.
	 * @see #getArrayEntryPointResolver()
	 * @generated
	 */
	void setArrayEntryPointResolver(ComplexEntryPointResolverType value);

	/**
	 * Returns the value of the '<em><b>Base64 Decoder Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base64 Decoder Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base64 Decoder Transformer</em>' containment reference.
	 * @see #setBase64DecoderTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_Base64DecoderTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='base64-decoder-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getBase64DecoderTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getBase64DecoderTransformer <em>Base64 Decoder Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base64 Decoder Transformer</em>' containment reference.
	 * @see #getBase64DecoderTransformer()
	 * @generated
	 */
	void setBase64DecoderTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Base64 Encoder Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base64 Encoder Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base64 Encoder Transformer</em>' containment reference.
	 * @see #setBase64EncoderTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_Base64EncoderTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='base64-encoder-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getBase64EncoderTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getBase64EncoderTransformer <em>Base64 Encoder Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base64 Encoder Transformer</em>' containment reference.
	 * @see #getBase64EncoderTransformer()
	 * @generated
	 */
	void setBase64EncoderTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Bean Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bean Property Extractor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bean Property Extractor</em>' containment reference.
	 * @see #setBeanPropertyExtractor(AbstractPropertyExtractorType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_BeanPropertyExtractor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bean-property-extractor' namespace='##targetNamespace' affiliation='abstract-property-extractor'"
	 * @generated
	 */
	AbstractPropertyExtractorType getBeanPropertyExtractor();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getBeanPropertyExtractor <em>Bean Property Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bean Property Extractor</em>' containment reference.
	 * @see #getBeanPropertyExtractor()
	 * @generated
	 */
	void setBeanPropertyExtractor(AbstractPropertyExtractorType value);

	/**
	 * Returns the value of the '<em><b>Bridge Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Built-in BridgeComponent that enables a bridge between an inbound and outbound endpoints.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bridge Component</em>' containment reference.
	 * @see #setBridgeComponent(DefaultComponentType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_BridgeComponent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bridge-component' namespace='##targetNamespace' affiliation='abstract-component'"
	 * @generated
	 */
	DefaultComponentType getBridgeComponent();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getBridgeComponent <em>Bridge Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bridge Component</em>' containment reference.
	 * @see #getBridgeComponent()
	 * @generated
	 */
	void setBridgeComponent(DefaultComponentType value);

	/**
	 * Returns the value of the '<em><b>Byte Array To Hex String Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Array To Hex String Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Array To Hex String Transformer</em>' containment reference.
	 * @see #setByteArrayToHexStringTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_ByteArrayToHexStringTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='byte-array-to-hex-string-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getByteArrayToHexStringTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getByteArrayToHexStringTransformer <em>Byte Array To Hex String Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Array To Hex String Transformer</em>' containment reference.
	 * @see #getByteArrayToHexStringTransformer()
	 * @generated
	 */
	void setByteArrayToHexStringTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Byte Array To Object Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Array To Object Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Array To Object Transformer</em>' containment reference.
	 * @see #setByteArrayToObjectTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_ByteArrayToObjectTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='byte-array-to-object-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getByteArrayToObjectTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getByteArrayToObjectTransformer <em>Byte Array To Object Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Array To Object Transformer</em>' containment reference.
	 * @see #getByteArrayToObjectTransformer()
	 * @generated
	 */
	void setByteArrayToObjectTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Byte Array To Serializable Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Array To Serializable Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Array To Serializable Transformer</em>' containment reference.
	 * @see #setByteArrayToSerializableTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_ByteArrayToSerializableTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='byte-array-to-serializable-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getByteArrayToSerializableTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getByteArrayToSerializableTransformer <em>Byte Array To Serializable Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Array To Serializable Transformer</em>' containment reference.
	 * @see #getByteArrayToSerializableTransformer()
	 * @generated
	 */
	void setByteArrayToSerializableTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Byte Array To String Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Array To String Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Array To String Transformer</em>' containment reference.
	 * @see #setByteArrayToStringTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_ByteArrayToStringTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='byte-array-to-string-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getByteArrayToStringTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getByteArrayToStringTransformer <em>Byte Array To String Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Array To String Transformer</em>' containment reference.
	 * @see #getByteArrayToStringTransformer()
	 * @generated
	 */
	void setByteArrayToStringTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Callable Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callable Entry Point Resolver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callable Entry Point Resolver</em>' containment reference.
	 * @see #setCallableEntryPointResolver(AbstractEntryPointResolverType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CallableEntryPointResolver()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='callable-entry-point-resolver' namespace='##targetNamespace' affiliation='abstract-entry-point-resolver'"
	 * @generated
	 */
	AbstractEntryPointResolverType getCallableEntryPointResolver();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCallableEntryPointResolver <em>Callable Entry Point Resolver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callable Entry Point Resolver</em>' containment reference.
	 * @see #getCallableEntryPointResolver()
	 * @generated
	 */
	void setCallableEntryPointResolver(AbstractEntryPointResolverType value);

	/**
	 * Returns the value of the '<em><b>Chaining Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chaining Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chaining Router</em>' containment reference.
	 * @see #setChainingRouter(FilteringOutboundRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_ChainingRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='chaining-router' namespace='##targetNamespace' affiliation='abstract-outbound-router'"
	 * @generated
	 */
	FilteringOutboundRouterType getChainingRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getChainingRouter <em>Chaining Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chaining Router</em>' containment reference.
	 * @see #getChainingRouter()
	 * @generated
	 */
	void setChainingRouter(FilteringOutboundRouterType value);

	/**
	 * Returns the value of the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' containment reference.
	 * @see #setComponent(PojoComponentType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_Component()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='component' namespace='##targetNamespace' affiliation='abstract-component'"
	 * @generated
	 */
	PojoComponentType getComponent();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getComponent <em>Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component</em>' containment reference.
	 * @see #getComponent()
	 * @generated
	 */
	void setComponent(PojoComponentType value);

	/**
	 * Returns the value of the '<em><b>Component Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Threading Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Threading Profile</em>' containment reference.
	 * @see #setComponentThreadingProfile(ThreadingProfileType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_ComponentThreadingProfile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='component-threading-profile' namespace='##targetNamespace' affiliation='abstract-component-threading-profile'"
	 * @generated
	 */
	ThreadingProfileType getComponentThreadingProfile();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getComponentThreadingProfile <em>Component Threading Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Threading Profile</em>' containment reference.
	 * @see #getComponentThreadingProfile()
	 * @generated
	 */
	void setComponentThreadingProfile(ThreadingProfileType value);

	/**
	 * Returns the value of the '<em><b>Correlation Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Property Extractor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Property Extractor</em>' containment reference.
	 * @see #setCorrelationPropertyExtractor(AbstractPropertyExtractorType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CorrelationPropertyExtractor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='correlation-property-extractor' namespace='##targetNamespace' affiliation='abstract-property-extractor'"
	 * @generated
	 */
	AbstractPropertyExtractorType getCorrelationPropertyExtractor();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCorrelationPropertyExtractor <em>Correlation Property Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Property Extractor</em>' containment reference.
	 * @see #getCorrelationPropertyExtractor()
	 * @generated
	 */
	void setCorrelationPropertyExtractor(AbstractPropertyExtractorType value);

	/**
	 * Returns the value of the '<em><b>Correlation Resequencer Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Resequencer Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Resequencer Router</em>' containment reference.
	 * @see #setCorrelationResequencerRouter(SelectiveConsumerRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CorrelationResequencerRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='correlation-resequencer-router' namespace='##targetNamespace' affiliation='abstract-inbound-router'"
	 * @generated
	 */
	SelectiveConsumerRouterType getCorrelationResequencerRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCorrelationResequencerRouter <em>Correlation Resequencer Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Resequencer Router</em>' containment reference.
	 * @see #getCorrelationResequencerRouter()
	 * @generated
	 */
	void setCorrelationResequencerRouter(SelectiveConsumerRouterType value);

	/**
	 * Returns the value of the '<em><b>Custom Async Reply Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Async Reply Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Async Reply Router</em>' containment reference.
	 * @see #setCustomAsyncReplyRouter(CustomAsyncReplyRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomAsyncReplyRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-async-reply-router' namespace='##targetNamespace' affiliation='abstract-async-reply-router'"
	 * @generated
	 */
	CustomAsyncReplyRouterType getCustomAsyncReplyRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomAsyncReplyRouter <em>Custom Async Reply Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Async Reply Router</em>' containment reference.
	 * @see #getCustomAsyncReplyRouter()
	 * @generated
	 */
	void setCustomAsyncReplyRouter(CustomAsyncReplyRouterType value);

	/**
	 * Returns the value of the '<em><b>Custom Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Catch All Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Catch All Strategy</em>' containment reference.
	 * @see #setCustomCatchAllStrategy(CustomCatchAllStrategyType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomCatchAllStrategy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-catch-all-strategy' namespace='##targetNamespace' affiliation='abstract-catch-all-strategy'"
	 * @generated
	 */
	CustomCatchAllStrategyType getCustomCatchAllStrategy();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomCatchAllStrategy <em>Custom Catch All Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Catch All Strategy</em>' containment reference.
	 * @see #getCustomCatchAllStrategy()
	 * @generated
	 */
	void setCustomCatchAllStrategy(CustomCatchAllStrategyType value);

	/**
	 * Returns the value of the '<em><b>Custom Connection Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Connection Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Connection Strategy</em>' containment reference.
	 * @see #setCustomConnectionStrategy(CustomConnectionStrategyType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomConnectionStrategy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-connection-strategy' namespace='##targetNamespace' affiliation='abstract-connection-strategy'"
	 * @generated
	 */
	CustomConnectionStrategyType getCustomConnectionStrategy();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomConnectionStrategy <em>Custom Connection Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Connection Strategy</em>' containment reference.
	 * @see #getCustomConnectionStrategy()
	 * @generated
	 */
	void setCustomConnectionStrategy(CustomConnectionStrategyType value);

	/**
	 * Returns the value of the '<em><b>Custom Connector</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Connector</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Connector</em>' containment reference.
	 * @see #setCustomConnector(CustomConnectorType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomConnector()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-connector' namespace='##targetNamespace' affiliation='abstract-connector'"
	 * @generated
	 */
	CustomConnectorType getCustomConnector();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomConnector <em>Custom Connector</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Connector</em>' containment reference.
	 * @see #getCustomConnector()
	 * @generated
	 */
	void setCustomConnector(CustomConnectorType value);

	/**
	 * Returns the value of the '<em><b>Custom Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Container</em>' containment reference.
	 * @see #setCustomContainer(CustomContainerContextType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomContainer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-container' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomContainerContextType getCustomContainer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomContainer <em>Custom Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Container</em>' containment reference.
	 * @see #getCustomContainer()
	 * @generated
	 */
	void setCustomContainer(CustomContainerContextType value);

	/**
	 * Returns the value of the '<em><b>Custom Correlation Aggregator Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Correlation Aggregator Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Correlation Aggregator Router</em>' containment reference.
	 * @see #setCustomCorrelationAggregatorRouter(CustomCorrelationAggregatorRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomCorrelationAggregatorRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-correlation-aggregator-router' namespace='##targetNamespace' affiliation='abstract-inbound-router'"
	 * @generated
	 */
	CustomCorrelationAggregatorRouterType getCustomCorrelationAggregatorRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomCorrelationAggregatorRouter <em>Custom Correlation Aggregator Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Correlation Aggregator Router</em>' containment reference.
	 * @see #getCustomCorrelationAggregatorRouter()
	 * @generated
	 */
	void setCustomCorrelationAggregatorRouter(CustomCorrelationAggregatorRouterType value);

	/**
	 * Returns the value of the '<em><b>Custom Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Entry Point Resolver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Entry Point Resolver</em>' containment reference.
	 * @see #setCustomEntryPointResolver(CustomEntryPointResolverType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomEntryPointResolver()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-entry-point-resolver' namespace='##targetNamespace' affiliation='abstract-entry-point-resolver'"
	 * @generated
	 */
	CustomEntryPointResolverType getCustomEntryPointResolver();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomEntryPointResolver <em>Custom Entry Point Resolver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Entry Point Resolver</em>' containment reference.
	 * @see #getCustomEntryPointResolver()
	 * @generated
	 */
	void setCustomEntryPointResolver(CustomEntryPointResolverType value);

	/**
	 * Returns the value of the '<em><b>Custom Entry Point Resolver Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Entry Point Resolver Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Entry Point Resolver Set</em>' containment reference.
	 * @see #setCustomEntryPointResolverSet(CustomEntryPointResolverSetType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomEntryPointResolverSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-entry-point-resolver-set' namespace='##targetNamespace' affiliation='abstract-entry-point-resolver-set'"
	 * @generated
	 */
	CustomEntryPointResolverSetType getCustomEntryPointResolverSet();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomEntryPointResolverSet <em>Custom Entry Point Resolver Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Entry Point Resolver Set</em>' containment reference.
	 * @see #getCustomEntryPointResolverSet()
	 * @generated
	 */
	void setCustomEntryPointResolverSet(CustomEntryPointResolverSetType value);

	/**
	 * Returns the value of the '<em><b>Custom Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Exception Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Exception Strategy</em>' containment reference.
	 * @see #setCustomExceptionStrategy(CustomExceptionStrategyType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomExceptionStrategy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-exception-strategy' namespace='##targetNamespace' affiliation='abstract-exception-strategy'"
	 * @generated
	 */
	CustomExceptionStrategyType getCustomExceptionStrategy();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomExceptionStrategy <em>Custom Exception Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Exception Strategy</em>' containment reference.
	 * @see #getCustomExceptionStrategy()
	 * @generated
	 */
	void setCustomExceptionStrategy(CustomExceptionStrategyType value);

	/**
	 * Returns the value of the '<em><b>Custom Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Filter</em>' containment reference.
	 * @see #setCustomFilter(CustomFilterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-filter' namespace='##targetNamespace' affiliation='abstract-filter'"
	 * @generated
	 */
	CustomFilterType getCustomFilter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomFilter <em>Custom Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Filter</em>' containment reference.
	 * @see #getCustomFilter()
	 * @generated
	 */
	void setCustomFilter(CustomFilterType value);

	/**
	 * Returns the value of the '<em><b>Custom Forwarding Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Forwarding Catch All Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Forwarding Catch All Strategy</em>' containment reference.
	 * @see #setCustomForwardingCatchAllStrategy(CustomForwardingCatchAllStrategyType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomForwardingCatchAllStrategy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-forwarding-catch-all-strategy' namespace='##targetNamespace' affiliation='abstract-catch-all-strategy'"
	 * @generated
	 */
	CustomForwardingCatchAllStrategyType getCustomForwardingCatchAllStrategy();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomForwardingCatchAllStrategy <em>Custom Forwarding Catch All Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Forwarding Catch All Strategy</em>' containment reference.
	 * @see #getCustomForwardingCatchAllStrategy()
	 * @generated
	 */
	void setCustomForwardingCatchAllStrategy(CustomForwardingCatchAllStrategyType value);

	/**
	 * Returns the value of the '<em><b>Custom Inbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Inbound Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Inbound Router</em>' containment reference.
	 * @see #setCustomInboundRouter(CustomInboundRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomInboundRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-inbound-router' namespace='##targetNamespace' affiliation='abstract-inbound-router'"
	 * @generated
	 */
	CustomInboundRouterType getCustomInboundRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomInboundRouter <em>Custom Inbound Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Inbound Router</em>' containment reference.
	 * @see #getCustomInboundRouter()
	 * @generated
	 */
	void setCustomInboundRouter(CustomInboundRouterType value);

	/**
	 * Returns the value of the '<em><b>Custom Outbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Outbound Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Outbound Router</em>' containment reference.
	 * @see #setCustomOutboundRouter(CustomOutboundRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomOutboundRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-outbound-router' namespace='##targetNamespace' affiliation='abstract-outbound-router'"
	 * @generated
	 */
	CustomOutboundRouterType getCustomOutboundRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomOutboundRouter <em>Custom Outbound Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Outbound Router</em>' containment reference.
	 * @see #getCustomOutboundRouter()
	 * @generated
	 */
	void setCustomOutboundRouter(CustomOutboundRouterType value);

	/**
	 * Returns the value of the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Property Extractor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Property Extractor</em>' containment reference.
	 * @see #setCustomPropertyExtractor(CustomPropertyExtractorType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomPropertyExtractor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-property-extractor' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomPropertyExtractorType getCustomPropertyExtractor();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomPropertyExtractor <em>Custom Property Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Property Extractor</em>' containment reference.
	 * @see #getCustomPropertyExtractor()
	 * @generated
	 */
	void setCustomPropertyExtractor(CustomPropertyExtractorType value);

	/**
	 * Returns the value of the '<em><b>Custom Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Transaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Transaction</em>' containment reference.
	 * @see #setCustomTransaction(CustomTransactionType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomTransaction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-transaction' namespace='##targetNamespace' affiliation='abstract-transaction'"
	 * @generated
	 */
	CustomTransactionType getCustomTransaction();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomTransaction <em>Custom Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Transaction</em>' containment reference.
	 * @see #getCustomTransaction()
	 * @generated
	 */
	void setCustomTransaction(CustomTransactionType value);

	/**
	 * Returns the value of the '<em><b>Custom Transaction Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Transaction Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Transaction Manager</em>' containment reference.
	 * @see #setCustomTransactionManager(CustomTransactionManagerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomTransactionManager()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-transaction-manager' namespace='##targetNamespace' affiliation='abstract-transaction-manager'"
	 * @generated
	 */
	CustomTransactionManagerType getCustomTransactionManager();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomTransactionManager <em>Custom Transaction Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Transaction Manager</em>' containment reference.
	 * @see #getCustomTransactionManager()
	 * @generated
	 */
	void setCustomTransactionManager(CustomTransactionManagerType value);

	/**
	 * Returns the value of the '<em><b>Custom Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Transformer</em>' containment reference.
	 * @see #setCustomTransformer(CustomTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	CustomTransformerType getCustomTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomTransformer <em>Custom Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Transformer</em>' containment reference.
	 * @see #getCustomTransformer()
	 * @generated
	 */
	void setCustomTransformer(CustomTransformerType value);

	/**
	 * Returns the value of the '<em><b>Decrypt Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decrypt Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decrypt Transformer</em>' containment reference.
	 * @see #setDecryptTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_DecryptTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='decrypt-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getDecryptTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getDecryptTransformer <em>Decrypt Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decrypt Transformer</em>' containment reference.
	 * @see #getDecryptTransformer()
	 * @generated
	 */
	void setDecryptTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Default Connector Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Connector Exception Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Connector Exception Strategy</em>' containment reference.
	 * @see #setDefaultConnectorExceptionStrategy(ExceptionStrategyType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_DefaultConnectorExceptionStrategy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='default-connector-exception-strategy' namespace='##targetNamespace' affiliation='abstract-exception-strategy'"
	 * @generated
	 */
	ExceptionStrategyType getDefaultConnectorExceptionStrategy();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getDefaultConnectorExceptionStrategy <em>Default Connector Exception Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Connector Exception Strategy</em>' containment reference.
	 * @see #getDefaultConnectorExceptionStrategy()
	 * @generated
	 */
	void setDefaultConnectorExceptionStrategy(ExceptionStrategyType value);

	/**
	 * Returns the value of the '<em><b>Default Service Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Service Exception Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Service Exception Strategy</em>' containment reference.
	 * @see #setDefaultServiceExceptionStrategy(ExceptionStrategyType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_DefaultServiceExceptionStrategy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='default-service-exception-strategy' namespace='##targetNamespace' affiliation='abstract-exception-strategy'"
	 * @generated
	 */
	ExceptionStrategyType getDefaultServiceExceptionStrategy();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getDefaultServiceExceptionStrategy <em>Default Service Exception Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Service Exception Strategy</em>' containment reference.
	 * @see #getDefaultServiceExceptionStrategy()
	 * @generated
	 */
	void setDefaultServiceExceptionStrategy(ExceptionStrategyType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(DescriptionType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_Description()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	DescriptionType getDescription();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(DescriptionType value);

	/**
	 * Returns the value of the '<em><b>Disable Notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Notification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Notification</em>' containment reference.
	 * @see #setDisableNotification(DisableNotificationType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_DisableNotification()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='disable-notification' namespace='##targetNamespace' affiliation='abstract-disable-notification'"
	 * @generated
	 */
	DisableNotificationType getDisableNotification();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getDisableNotification <em>Disable Notification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Notification</em>' containment reference.
	 * @see #getDisableNotification()
	 * @generated
	 */
	void setDisableNotification(DisableNotificationType value);

	/**
	 * Returns the value of the '<em><b>Echo Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Built-in EchoComponent that logs the message and returns the payload back as the result.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Echo Component</em>' containment reference.
	 * @see #setEchoComponent(DefaultComponentType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_EchoComponent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='echo-component' namespace='##targetNamespace' affiliation='abstract-component'"
	 * @generated
	 */
	DefaultComponentType getEchoComponent();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getEchoComponent <em>Echo Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Echo Component</em>' containment reference.
	 * @see #getEchoComponent()
	 * @generated
	 */
	void setEchoComponent(DefaultComponentType value);

	/**
	 * Returns the value of the '<em><b>Ejb Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ejb Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ejb Container</em>' containment reference.
	 * @see #setEjbContainer(RmiContainerContextType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_EjbContainer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ejb-container' namespace='##targetNamespace'"
	 * @generated
	 */
	RmiContainerContextType getEjbContainer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getEjbContainer <em>Ejb Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ejb Container</em>' containment reference.
	 * @see #getEjbContainer()
	 * @generated
	 */
	void setEjbContainer(RmiContainerContextType value);

	/**
	 * Returns the value of the '<em><b>Encryption Security Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encryption Security Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encryption Security Filter</em>' containment reference.
	 * @see #setEncryptionSecurityFilter(EncryptionSecurityFilterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_EncryptionSecurityFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='encryption-security-filter' namespace='##targetNamespace' affiliation='abstract-security-filter'"
	 * @generated
	 */
	EncryptionSecurityFilterType getEncryptionSecurityFilter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getEncryptionSecurityFilter <em>Encryption Security Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encryption Security Filter</em>' containment reference.
	 * @see #getEncryptionSecurityFilter()
	 * @generated
	 */
	void setEncryptionSecurityFilter(EncryptionSecurityFilterType value);

	/**
	 * Returns the value of the '<em><b>Encrypt Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encrypt Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encrypt Transformer</em>' containment reference.
	 * @see #setEncryptTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_EncryptTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='encrypt-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getEncryptTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getEncryptTransformer <em>Encrypt Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encrypt Transformer</em>' containment reference.
	 * @see #getEncryptTransformer()
	 * @generated
	 */
	void setEncryptTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint</em>' containment reference.
	 * @see #setEndpoint(GlobalEndpointType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_Endpoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='endpoint' namespace='##targetNamespace' affiliation='abstract-global-endpoint'"
	 * @generated
	 */
	GlobalEndpointType getEndpoint();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getEndpoint <em>Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint</em>' containment reference.
	 * @see #getEndpoint()
	 * @generated
	 */
	void setEndpoint(GlobalEndpointType value);

	/**
	 * Returns the value of the '<em><b>Endpoint Selector Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Endpoint Selector Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endpoint Selector Router</em>' containment reference.
	 * @see #setEndpointSelectorRouter(EndpointSelectorRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_EndpointSelectorRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='endpoint-selector-router' namespace='##targetNamespace' affiliation='abstract-outbound-router'"
	 * @generated
	 */
	EndpointSelectorRouterType getEndpointSelectorRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getEndpointSelectorRouter <em>Endpoint Selector Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Endpoint Selector Router</em>' containment reference.
	 * @see #getEndpointSelectorRouter()
	 * @generated
	 */
	void setEndpointSelectorRouter(EndpointSelectorRouterType value);

	/**
	 * Returns the value of the '<em><b>Entry Point Resolver Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Point Resolver Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Point Resolver Set</em>' containment reference.
	 * @see #setEntryPointResolverSet(ExtensibleEntryPointResolverSet)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_EntryPointResolverSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='entry-point-resolver-set' namespace='##targetNamespace' affiliation='abstract-entry-point-resolver-set'"
	 * @generated
	 */
	ExtensibleEntryPointResolverSet getEntryPointResolverSet();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getEntryPointResolverSet <em>Entry Point Resolver Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entry Point Resolver Set</em>' containment reference.
	 * @see #getEntryPointResolverSet()
	 * @generated
	 */
	void setEntryPointResolverSet(ExtensibleEntryPointResolverSet value);

	/**
	 * Returns the value of the '<em><b>Exception Based Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Based Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Based Router</em>' containment reference.
	 * @see #setExceptionBasedRouter(FilteringOutboundRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_ExceptionBasedRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exception-based-router' namespace='##targetNamespace' affiliation='abstract-outbound-router'"
	 * @generated
	 */
	FilteringOutboundRouterType getExceptionBasedRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getExceptionBasedRouter <em>Exception Based Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Based Router</em>' containment reference.
	 * @see #getExceptionBasedRouter()
	 * @generated
	 */
	void setExceptionBasedRouter(FilteringOutboundRouterType value);

	/**
	 * Returns the value of the '<em><b>Exception Type Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception Type Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception Type Filter</em>' containment reference.
	 * @see #setExceptionTypeFilter(TypeFilterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_ExceptionTypeFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='exception-type-filter' namespace='##targetNamespace' affiliation='abstract-filter'"
	 * @generated
	 */
	TypeFilterType getExceptionTypeFilter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getExceptionTypeFilter <em>Exception Type Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Type Filter</em>' containment reference.
	 * @see #getExceptionTypeFilter()
	 * @generated
	 */
	void setExceptionTypeFilter(TypeFilterType value);

	/**
	 * Returns the value of the '<em><b>Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter</em>' containment reference.
	 * @see #setFilter(RefFilterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_Filter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace' affiliation='abstract-filter'"
	 * @generated
	 */
	RefFilterType getFilter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(RefFilterType value);

	/**
	 * Returns the value of the '<em><b>Filtering Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filtering Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filtering Router</em>' containment reference.
	 * @see #setFilteringRouter(FilteringOutboundRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_FilteringRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filtering-router' namespace='##targetNamespace' affiliation='abstract-outbound-router'"
	 * @generated
	 */
	FilteringOutboundRouterType getFilteringRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getFilteringRouter <em>Filtering Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filtering Router</em>' containment reference.
	 * @see #getFilteringRouter()
	 * @generated
	 */
	void setFilteringRouter(FilteringOutboundRouterType value);

	/**
	 * Returns the value of the '<em><b>Forwarding Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forwarding Catch All Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forwarding Catch All Strategy</em>' containment reference.
	 * @see #setForwardingCatchAllStrategy(ForwardingCatchAllStrategyType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_ForwardingCatchAllStrategy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='forwarding-catch-all-strategy' namespace='##targetNamespace' affiliation='abstract-catch-all-strategy'"
	 * @generated
	 */
	ForwardingCatchAllStrategyType getForwardingCatchAllStrategy();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getForwardingCatchAllStrategy <em>Forwarding Catch All Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forwarding Catch All Strategy</em>' containment reference.
	 * @see #getForwardingCatchAllStrategy()
	 * @generated
	 */
	void setForwardingCatchAllStrategy(ForwardingCatchAllStrategyType value);

	/**
	 * Returns the value of the '<em><b>Forwarding Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forwarding Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forwarding Router</em>' containment reference.
	 * @see #setForwardingRouter(ForwardingRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_ForwardingRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='forwarding-router' namespace='##targetNamespace' affiliation='abstract-inbound-router'"
	 * @generated
	 */
	ForwardingRouterType getForwardingRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getForwardingRouter <em>Forwarding Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forwarding Router</em>' containment reference.
	 * @see #getForwardingRouter()
	 * @generated
	 */
	void setForwardingRouter(ForwardingRouterType value);

	/**
	 * Returns the value of the '<em><b>Gzip Compress Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gzip Compress Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gzip Compress Transformer</em>' containment reference.
	 * @see #setGzipCompressTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_GzipCompressTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='gzip-compress-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getGzipCompressTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getGzipCompressTransformer <em>Gzip Compress Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gzip Compress Transformer</em>' containment reference.
	 * @see #getGzipCompressTransformer()
	 * @generated
	 */
	void setGzipCompressTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Gzip Uncompress Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gzip Uncompress Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gzip Uncompress Transformer</em>' containment reference.
	 * @see #setGzipUncompressTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_GzipUncompressTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='gzip-uncompress-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getGzipUncompressTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getGzipUncompressTransformer <em>Gzip Uncompress Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gzip Uncompress Transformer</em>' containment reference.
	 * @see #getGzipUncompressTransformer()
	 * @generated
	 */
	void setGzipUncompressTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Hex String To Byte Array Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hex String To Byte Array Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hex String To Byte Array Transformer</em>' containment reference.
	 * @see #setHexStringToByteArrayTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_HexStringToByteArrayTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hex-string-to-byte-array-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getHexStringToByteArrayTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getHexStringToByteArrayTransformer <em>Hex String To Byte Array Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hex String To Byte Array Transformer</em>' containment reference.
	 * @see #getHexStringToByteArrayTransformer()
	 * @generated
	 */
	void setHexStringToByteArrayTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Hivemind Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hivemind Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hivemind Container</em>' containment reference.
	 * @see #setHivemindContainer(IocContainerContextType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_HivemindContainer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hivemind-container' namespace='##targetNamespace'"
	 * @generated
	 */
	IocContainerContextType getHivemindContainer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getHivemindContainer <em>Hivemind Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hivemind Container</em>' containment reference.
	 * @see #getHivemindContainer()
	 * @generated
	 */
	void setHivemindContainer(IocContainerContextType value);

	/**
	 * Returns the value of the '<em><b>Idempotent Receiver Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idempotent Receiver Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idempotent Receiver Router</em>' containment reference.
	 * @see #setIdempotentReceiverRouter(IdempotentReceiverRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_IdempotentReceiverRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='idempotent-receiver-router' namespace='##targetNamespace' affiliation='abstract-inbound-router'"
	 * @generated
	 */
	IdempotentReceiverRouterType getIdempotentReceiverRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getIdempotentReceiverRouter <em>Idempotent Receiver Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idempotent Receiver Router</em>' containment reference.
	 * @see #getIdempotentReceiverRouter()
	 * @generated
	 */
	void setIdempotentReceiverRouter(IdempotentReceiverRouterType value);

	/**
	 * Returns the value of the '<em><b>Idempotent Secure Hash Receiver Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idempotent Secure Hash Receiver Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idempotent Secure Hash Receiver Router</em>' containment reference.
	 * @see #setIdempotentSecureHashReceiverRouter(FilteredInboundRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_IdempotentSecureHashReceiverRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='idempotent-secure-hash-receiver-router' namespace='##targetNamespace' affiliation='abstract-inbound-router'"
	 * @generated
	 */
	FilteredInboundRouterType getIdempotentSecureHashReceiverRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getIdempotentSecureHashReceiverRouter <em>Idempotent Secure Hash Receiver Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idempotent Secure Hash Receiver Router</em>' containment reference.
	 * @see #getIdempotentSecureHashReceiverRouter()
	 * @generated
	 */
	void setIdempotentSecureHashReceiverRouter(FilteredInboundRouterType value);

	/**
	 * Returns the value of the '<em><b>Inbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound Endpoint</em>' containment reference.
	 * @see #setInboundEndpoint(InboundEndpointType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_InboundEndpoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inbound-endpoint' namespace='##targetNamespace' affiliation='abstract-inbound-endpoint'"
	 * @generated
	 */
	InboundEndpointType getInboundEndpoint();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getInboundEndpoint <em>Inbound Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inbound Endpoint</em>' containment reference.
	 * @see #getInboundEndpoint()
	 * @generated
	 */
	void setInboundEndpoint(InboundEndpointType value);

	/**
	 * Returns the value of the '<em><b>Inbound Pass Through Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound Pass Through Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound Pass Through Router</em>' containment reference.
	 * @see #setInboundPassThroughRouter(FilteredInboundRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_InboundPassThroughRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='inbound-pass-through-router' namespace='##targetNamespace' affiliation='abstract-inbound-router'"
	 * @generated
	 */
	FilteredInboundRouterType getInboundPassThroughRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getInboundPassThroughRouter <em>Inbound Pass Through Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inbound Pass Through Router</em>' containment reference.
	 * @see #getInboundPassThroughRouter()
	 * @generated
	 */
	void setInboundPassThroughRouter(FilteredInboundRouterType value);

	/**
	 * Returns the value of the '<em><b>Include Entry Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Entry Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Entry Point</em>' containment reference.
	 * @see #setIncludeEntryPoint(MethodType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_IncludeEntryPoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='include-entry-point' namespace='##targetNamespace'"
	 * @generated
	 */
	MethodType getIncludeEntryPoint();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getIncludeEntryPoint <em>Include Entry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Entry Point</em>' containment reference.
	 * @see #getIncludeEntryPoint()
	 * @generated
	 */
	void setIncludeEntryPoint(MethodType value);

	/**
	 * Returns the value of the '<em><b>Jboss Transaction Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jboss Transaction Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jboss Transaction Manager</em>' containment reference.
	 * @see #setJbossTransactionManager(TransactionManagerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_JbossTransactionManager()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jboss-transaction-manager' namespace='##targetNamespace' affiliation='abstract-transaction-manager'"
	 * @generated
	 */
	TransactionManagerType getJbossTransactionManager();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getJbossTransactionManager <em>Jboss Transaction Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jboss Transaction Manager</em>' containment reference.
	 * @see #getJbossTransactionManager()
	 * @generated
	 */
	void setJbossTransactionManager(TransactionManagerType value);

	/**
	 * Returns the value of the '<em><b>Jndi Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jndi Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jndi Container</em>' containment reference.
	 * @see #setJndiContainer(BaseContainerContextType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_JndiContainer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jndi-container' namespace='##targetNamespace'"
	 * @generated
	 */
	BaseContainerContextType getJndiContainer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getJndiContainer <em>Jndi Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi Container</em>' containment reference.
	 * @see #getJndiContainer()
	 * @generated
	 */
	void setJndiContainer(BaseContainerContextType value);

	/**
	 * Returns the value of the '<em><b>Jndi Transaction Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jndi Transaction Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jndi Transaction Manager</em>' containment reference.
	 * @see #setJndiTransactionManager(TransactionManagerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_JndiTransactionManager()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jndi-transaction-manager' namespace='##targetNamespace' affiliation='abstract-transaction-manager'"
	 * @generated
	 */
	TransactionManagerType getJndiTransactionManager();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getJndiTransactionManager <em>Jndi Transaction Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi Transaction Manager</em>' containment reference.
	 * @see #getJndiTransactionManager()
	 * @generated
	 */
	void setJndiTransactionManager(TransactionManagerType value);

	/**
	 * Returns the value of the '<em><b>Jrun Transaction Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Jrun Transaction Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Jrun Transaction Manager</em>' containment reference.
	 * @see #setJrunTransactionManager(TransactionManagerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_JrunTransactionManager()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='jrun-transaction-manager' namespace='##targetNamespace' affiliation='abstract-transaction-manager'"
	 * @generated
	 */
	TransactionManagerType getJrunTransactionManager();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getJrunTransactionManager <em>Jrun Transaction Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jrun Transaction Manager</em>' containment reference.
	 * @see #getJrunTransactionManager()
	 * @generated
	 */
	void setJrunTransactionManager(TransactionManagerType value);

	/**
	 * Returns the value of the '<em><b>Legacy Entry Point Resolver Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legacy Entry Point Resolver Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legacy Entry Point Resolver Set</em>' containment reference.
	 * @see #setLegacyEntryPointResolverSet(ExtensibleEntryPointResolverSet)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_LegacyEntryPointResolverSet()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='legacy-entry-point-resolver-set' namespace='##targetNamespace' affiliation='abstract-entry-point-resolver-set'"
	 * @generated
	 */
	ExtensibleEntryPointResolverSet getLegacyEntryPointResolverSet();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getLegacyEntryPointResolverSet <em>Legacy Entry Point Resolver Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legacy Entry Point Resolver Set</em>' containment reference.
	 * @see #getLegacyEntryPointResolverSet()
	 * @generated
	 */
	void setLegacyEntryPointResolverSet(ExtensibleEntryPointResolverSet value);

	/**
	 * Returns the value of the '<em><b>List Message Splitter Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Message Splitter Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Message Splitter Router</em>' containment reference.
	 * @see #setListMessageSplitterRouter(MessageSplitterOutboundRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_ListMessageSplitterRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='list-message-splitter-router' namespace='##targetNamespace' affiliation='abstract-outbound-router'"
	 * @generated
	 */
	MessageSplitterOutboundRouterType getListMessageSplitterRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getListMessageSplitterRouter <em>List Message Splitter Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Message Splitter Router</em>' containment reference.
	 * @see #getListMessageSplitterRouter()
	 * @generated
	 */
	void setListMessageSplitterRouter(MessageSplitterOutboundRouterType value);

	/**
	 * Returns the value of the '<em><b>Log Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Built-in LogComponent that simply logs the message content (or content length if it is a
	 *                 large message).
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Log Component</em>' containment reference.
	 * @see #setLogComponent(DefaultComponentType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_LogComponent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='log-component' namespace='##targetNamespace' affiliation='abstract-component'"
	 * @generated
	 */
	DefaultComponentType getLogComponent();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getLogComponent <em>Log Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Log Component</em>' containment reference.
	 * @see #getLogComponent()
	 * @generated
	 */
	void setLogComponent(DefaultComponentType value);

	/**
	 * Returns the value of the '<em><b>Logging Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logging Catch All Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logging Catch All Strategy</em>' containment reference.
	 * @see #setLoggingCatchAllStrategy(LoggingCatchAllStrategyType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_LoggingCatchAllStrategy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='logging-catch-all-strategy' namespace='##targetNamespace' affiliation='abstract-catch-all-strategy'"
	 * @generated
	 */
	LoggingCatchAllStrategyType getLoggingCatchAllStrategy();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getLoggingCatchAllStrategy <em>Logging Catch All Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logging Catch All Strategy</em>' containment reference.
	 * @see #getLoggingCatchAllStrategy()
	 * @generated
	 */
	void setLoggingCatchAllStrategy(LoggingCatchAllStrategyType value);

	/**
	 * Returns the value of the '<em><b>Map Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Property Extractor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Property Extractor</em>' containment reference.
	 * @see #setMapPropertyExtractor(AbstractPropertyExtractorType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_MapPropertyExtractor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='map-property-extractor' namespace='##targetNamespace' affiliation='abstract-property-extractor'"
	 * @generated
	 */
	AbstractPropertyExtractorType getMapPropertyExtractor();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getMapPropertyExtractor <em>Map Property Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Property Extractor</em>' containment reference.
	 * @see #getMapPropertyExtractor()
	 * @generated
	 */
	void setMapPropertyExtractor(AbstractPropertyExtractorType value);

	/**
	 * Returns the value of the '<em><b>Message Chunking Aggregator Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Chunking Aggregator Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Chunking Aggregator Router</em>' containment reference.
	 * @see #setMessageChunkingAggregatorRouter(MessageChunkingAggregatorRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_MessageChunkingAggregatorRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='message-chunking-aggregator-router' namespace='##targetNamespace' affiliation='abstract-inbound-router'"
	 * @generated
	 */
	MessageChunkingAggregatorRouterType getMessageChunkingAggregatorRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getMessageChunkingAggregatorRouter <em>Message Chunking Aggregator Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Chunking Aggregator Router</em>' containment reference.
	 * @see #getMessageChunkingAggregatorRouter()
	 * @generated
	 */
	void setMessageChunkingAggregatorRouter(MessageChunkingAggregatorRouterType value);

	/**
	 * Returns the value of the '<em><b>Message Chunking Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Chunking Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Chunking Router</em>' containment reference.
	 * @see #setMessageChunkingRouter(ChunkingRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_MessageChunkingRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='message-chunking-router' namespace='##targetNamespace' affiliation='abstract-outbound-router'"
	 * @generated
	 */
	ChunkingRouterType getMessageChunkingRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getMessageChunkingRouter <em>Message Chunking Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Chunking Router</em>' containment reference.
	 * @see #getMessageChunkingRouter()
	 * @generated
	 */
	void setMessageChunkingRouter(ChunkingRouterType value);

	/**
	 * Returns the value of the '<em><b>Message Properties Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Properties Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Properties Transformer</em>' containment reference.
	 * @see #setMessagePropertiesTransformer(MessagePropertiesTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_MessagePropertiesTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='message-properties-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	MessagePropertiesTransformerType getMessagePropertiesTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getMessagePropertiesTransformer <em>Message Properties Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Properties Transformer</em>' containment reference.
	 * @see #getMessagePropertiesTransformer()
	 * @generated
	 */
	void setMessagePropertiesTransformer(MessagePropertiesTransformerType value);

	/**
	 * Returns the value of the '<em><b>Message Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Property Extractor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Property Extractor</em>' containment reference.
	 * @see #setMessagePropertyExtractor(AbstractPropertyExtractorType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_MessagePropertyExtractor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='message-property-extractor' namespace='##targetNamespace' affiliation='abstract-property-extractor'"
	 * @generated
	 */
	AbstractPropertyExtractorType getMessagePropertyExtractor();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getMessagePropertyExtractor <em>Message Property Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Property Extractor</em>' containment reference.
	 * @see #getMessagePropertyExtractor()
	 * @generated
	 */
	void setMessagePropertyExtractor(AbstractPropertyExtractorType value);

	/**
	 * Returns the value of the '<em><b>Message Property Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Property Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Property Filter</em>' containment reference.
	 * @see #setMessagePropertyFilter(PatternFilterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_MessagePropertyFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='message-property-filter' namespace='##targetNamespace' affiliation='abstract-filter'"
	 * @generated
	 */
	PatternFilterType getMessagePropertyFilter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getMessagePropertyFilter <em>Message Property Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Property Filter</em>' containment reference.
	 * @see #getMessagePropertyFilter()
	 * @generated
	 */
	void setMessagePropertyFilter(PatternFilterType value);

	/**
	 * Returns the value of the '<em><b>Method Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Entry Point Resolver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Entry Point Resolver</em>' containment reference.
	 * @see #setMethodEntryPointResolver(MethodEntryPointResolverType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_MethodEntryPointResolver()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='method-entry-point-resolver' namespace='##targetNamespace' affiliation='abstract-entry-point-resolver'"
	 * @generated
	 */
	MethodEntryPointResolverType getMethodEntryPointResolver();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getMethodEntryPointResolver <em>Method Entry Point Resolver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Entry Point Resolver</em>' containment reference.
	 * @see #getMethodEntryPointResolver()
	 * @generated
	 */
	void setMethodEntryPointResolver(MethodEntryPointResolverType value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' containment reference.
	 * @see #setModel(DefaultModelType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_Model()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='model' namespace='##targetNamespace' affiliation='abstract-model'"
	 * @generated
	 */
	DefaultModelType getModel();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getModel <em>Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' containment reference.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(DefaultModelType value);

	/**
	 * Returns the value of the '<em><b>Mule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Either the root element or a "top-level" element in a Spring configuration,
	 *                 which contains further Mule elements.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mule</em>' containment reference.
	 * @see #setMule(MuleType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_Mule()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mule' namespace='##targetNamespace'"
	 * @generated
	 */
	MuleType getMule();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getMule <em>Mule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mule</em>' containment reference.
	 * @see #getMule()
	 * @generated
	 */
	void setMule(MuleType value);

	/**
	 * Returns the value of the '<em><b>Multicasting Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multicasting Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multicasting Router</em>' containment reference.
	 * @see #setMulticastingRouter(FilteringOutboundRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_MulticastingRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='multicasting-router' namespace='##targetNamespace' affiliation='abstract-outbound-router'"
	 * @generated
	 */
	FilteringOutboundRouterType getMulticastingRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getMulticastingRouter <em>Multicasting Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multicasting Router</em>' containment reference.
	 * @see #getMulticastingRouter()
	 * @generated
	 */
	void setMulticastingRouter(FilteringOutboundRouterType value);

	/**
	 * Returns the value of the '<em><b>No Action Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Action Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Action Transformer</em>' containment reference.
	 * @see #setNoActionTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_NoActionTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='no-action-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getNoActionTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getNoActionTransformer <em>No Action Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Action Transformer</em>' containment reference.
	 * @see #getNoActionTransformer()
	 * @generated
	 */
	void setNoActionTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>No Arguments Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No Arguments Entry Point Resolver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>No Arguments Entry Point Resolver</em>' containment reference.
	 * @see #setNoArgumentsEntryPointResolver(ComplexEntryPointResolverType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_NoArgumentsEntryPointResolver()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='no-arguments-entry-point-resolver' namespace='##targetNamespace' affiliation='abstract-entry-point-resolver'"
	 * @generated
	 */
	ComplexEntryPointResolverType getNoArgumentsEntryPointResolver();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getNoArgumentsEntryPointResolver <em>No Arguments Entry Point Resolver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Arguments Entry Point Resolver</em>' containment reference.
	 * @see #getNoArgumentsEntryPointResolver()
	 * @generated
	 */
	void setNoArgumentsEntryPointResolver(ComplexEntryPointResolverType value);

	/**
	 * Returns the value of the '<em><b>Not Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Not Filter</em>' containment reference.
	 * @see #setNotFilter(UnitaryFilterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_NotFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='not-filter' namespace='##targetNamespace' affiliation='abstract-filter'"
	 * @generated
	 */
	UnitaryFilterType getNotFilter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getNotFilter <em>Not Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not Filter</em>' containment reference.
	 * @see #getNotFilter()
	 * @generated
	 */
	void setNotFilter(UnitaryFilterType value);

	/**
	 * Returns the value of the '<em><b>Notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notification</em>' containment reference.
	 * @see #setNotification(DefineNotificationType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_Notification()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='notification' namespace='##targetNamespace' affiliation='abstract-define-notification'"
	 * @generated
	 */
	DefineNotificationType getNotification();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getNotification <em>Notification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notification</em>' containment reference.
	 * @see #getNotification()
	 * @generated
	 */
	void setNotification(DefineNotificationType value);

	/**
	 * Returns the value of the '<em><b>Null Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Built-in NullComponent that will throw an exception if it receives a message.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Null Component</em>' containment reference.
	 * @see #setNullComponent(DefaultComponentType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_NullComponent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='null-component' namespace='##targetNamespace' affiliation='abstract-component'"
	 * @generated
	 */
	DefaultComponentType getNullComponent();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getNullComponent <em>Null Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Component</em>' containment reference.
	 * @see #getNullComponent()
	 * @generated
	 */
	void setNullComponent(DefaultComponentType value);

	/**
	 * Returns the value of the '<em><b>Object To Byte Array Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object To Byte Array Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object To Byte Array Transformer</em>' containment reference.
	 * @see #setObjectToByteArrayTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_ObjectToByteArrayTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object-to-byte-array-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getObjectToByteArrayTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getObjectToByteArrayTransformer <em>Object To Byte Array Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object To Byte Array Transformer</em>' containment reference.
	 * @see #getObjectToByteArrayTransformer()
	 * @generated
	 */
	void setObjectToByteArrayTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Object To String Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object To String Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object To String Transformer</em>' containment reference.
	 * @see #setObjectToStringTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_ObjectToStringTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object-to-string-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getObjectToStringTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getObjectToStringTransformer <em>Object To String Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object To String Transformer</em>' containment reference.
	 * @see #getObjectToStringTransformer()
	 * @generated
	 */
	void setObjectToStringTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Or Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Or Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Or Filter</em>' containment reference.
	 * @see #setOrFilter(CollectionFilterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_OrFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='or-filter' namespace='##targetNamespace' affiliation='abstract-filter'"
	 * @generated
	 */
	CollectionFilterType getOrFilter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getOrFilter <em>Or Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Or Filter</em>' containment reference.
	 * @see #getOrFilter()
	 * @generated
	 */
	void setOrFilter(CollectionFilterType value);

	/**
	 * Returns the value of the '<em><b>Outbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound Endpoint</em>' containment reference.
	 * @see #setOutboundEndpoint(OutboundEndpointType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_OutboundEndpoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='outbound-endpoint' namespace='##targetNamespace' affiliation='abstract-outbound-endpoint'"
	 * @generated
	 */
	OutboundEndpointType getOutboundEndpoint();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getOutboundEndpoint <em>Outbound Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outbound Endpoint</em>' containment reference.
	 * @see #getOutboundEndpoint()
	 * @generated
	 */
	void setOutboundEndpoint(OutboundEndpointType value);

	/**
	 * Returns the value of the '<em><b>Outbound Pass Through Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound Pass Through Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound Pass Through Router</em>' containment reference.
	 * @see #setOutboundPassThroughRouter(OutboundRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_OutboundPassThroughRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='outbound-pass-through-router' namespace='##targetNamespace' affiliation='abstract-outbound-router'"
	 * @generated
	 */
	OutboundRouterType getOutboundPassThroughRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getOutboundPassThroughRouter <em>Outbound Pass Through Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outbound Pass Through Router</em>' containment reference.
	 * @see #getOutboundPassThroughRouter()
	 * @generated
	 */
	void setOutboundPassThroughRouter(OutboundRouterType value);

	/**
	 * Returns the value of the '<em><b>Pass Through Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Built-in PassThroughComponent that enables a bridge between an inbound and outbound endpoints.
	 *                 This is less efficient than the BridgeComponent, but respects inbound routers that "consume"
	 *                 messages.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pass Through Component</em>' containment reference.
	 * @see #setPassThroughComponent(DefaultComponentType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_PassThroughComponent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pass-through-component' namespace='##targetNamespace' affiliation='abstract-component'"
	 * @generated
	 */
	DefaultComponentType getPassThroughComponent();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getPassThroughComponent <em>Pass Through Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pass Through Component</em>' containment reference.
	 * @see #getPassThroughComponent()
	 * @generated
	 */
	void setPassThroughComponent(DefaultComponentType value);

	/**
	 * Returns the value of the '<em><b>Payload Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payload Property Extractor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload Property Extractor</em>' containment reference.
	 * @see #setPayloadPropertyExtractor(AbstractPropertyExtractorType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_PayloadPropertyExtractor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='payload-property-extractor' namespace='##targetNamespace' affiliation='abstract-property-extractor'"
	 * @generated
	 */
	AbstractPropertyExtractorType getPayloadPropertyExtractor();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getPayloadPropertyExtractor <em>Payload Property Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload Property Extractor</em>' containment reference.
	 * @see #getPayloadPropertyExtractor()
	 * @generated
	 */
	void setPayloadPropertyExtractor(AbstractPropertyExtractorType value);

	/**
	 * Returns the value of the '<em><b>Payload Type Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payload Type Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payload Type Filter</em>' containment reference.
	 * @see #setPayloadTypeFilter(TypeFilterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_PayloadTypeFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='payload-type-filter' namespace='##targetNamespace' affiliation='abstract-filter'"
	 * @generated
	 */
	TypeFilterType getPayloadTypeFilter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getPayloadTypeFilter <em>Payload Type Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payload Type Filter</em>' containment reference.
	 * @see #getPayloadTypeFilter()
	 * @generated
	 */
	void setPayloadTypeFilter(TypeFilterType value);

	/**
	 * Returns the value of the '<em><b>Pico Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pico Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pico Container</em>' containment reference.
	 * @see #setPicoContainer(IocContainerContextType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_PicoContainer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pico-container' namespace='##targetNamespace'"
	 * @generated
	 */
	IocContainerContextType getPicoContainer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getPicoContainer <em>Pico Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pico Container</em>' containment reference.
	 * @see #getPicoContainer()
	 * @generated
	 */
	void setPicoContainer(IocContainerContextType value);

	/**
	 * Returns the value of the '<em><b>Plexus Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plexus Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plexus Container</em>' containment reference.
	 * @see #setPlexusContainer(IocContainerContextType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_PlexusContainer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='plexus-container' namespace='##targetNamespace'"
	 * @generated
	 */
	IocContainerContextType getPlexusContainer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getPlexusContainer <em>Plexus Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plexus Container</em>' containment reference.
	 * @see #getPlexusContainer()
	 * @generated
	 */
	void setPlexusContainer(IocContainerContextType value);

	/**
	 * Returns the value of the '<em><b>Pooled Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pooled Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pooled Object</em>' containment reference.
	 * @see #setPooledObject(PooledObjectFactoryType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_PooledObject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pooled-object' namespace='##targetNamespace' affiliation='abstract-object-factory'"
	 * @generated
	 */
	PooledObjectFactoryType getPooledObject();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getPooledObject <em>Pooled Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pooled Object</em>' containment reference.
	 * @see #getPooledObject()
	 * @generated
	 */
	void setPooledObject(PooledObjectFactoryType value);

	/**
	 * Returns the value of the '<em><b>Pooling Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pooling Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pooling Profile</em>' containment reference.
	 * @see #setPoolingProfile(PoolingProfileType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_PoolingProfile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pooling-profile' namespace='##targetNamespace' affiliation='abstract-pooling-profile'"
	 * @generated
	 */
	PoolingProfileType getPoolingProfile();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getPoolingProfile <em>Pooling Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pooling Profile</em>' containment reference.
	 * @see #getPoolingProfile()
	 * @generated
	 */
	void setPoolingProfile(PoolingProfileType value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Set properties via Spring's entry attribute.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(MapType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_Properties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	MapType getProperties();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(MapType value);

	/**
	 * Returns the value of the '<em><b>Properties Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties Container</em>' containment reference.
	 * @see #setPropertiesContainer(PropertiesContainerContextType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_PropertiesContainer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='properties-container' namespace='##targetNamespace'"
	 * @generated
	 */
	PropertiesContainerContextType getPropertiesContainer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getPropertiesContainer <em>Properties Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties Container</em>' containment reference.
	 * @see #getPropertiesContainer()
	 * @generated
	 */
	void setPropertiesContainer(PropertiesContainerContextType value);

	/**
	 * Returns the value of the '<em><b>Property Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property Entry Point Resolver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Property Entry Point Resolver</em>' containment reference.
	 * @see #setPropertyEntryPointResolver(PropertyEntryPointResolverType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_PropertyEntryPointResolver()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property-entry-point-resolver' namespace='##targetNamespace' affiliation='abstract-entry-point-resolver'"
	 * @generated
	 */
	PropertyEntryPointResolverType getPropertyEntryPointResolver();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getPropertyEntryPointResolver <em>Property Entry Point Resolver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Property Entry Point Resolver</em>' containment reference.
	 * @see #getPropertyEntryPointResolver()
	 * @generated
	 */
	void setPropertyEntryPointResolver(PropertyEntryPointResolverType value);

	/**
	 * Returns the value of the '<em><b>Prototype Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prototype Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prototype Object</em>' containment reference.
	 * @see #setPrototypeObject(PrototypeObjectFactoryType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_PrototypeObject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='prototype-object' namespace='##targetNamespace' affiliation='abstract-object-factory'"
	 * @generated
	 */
	PrototypeObjectFactoryType getPrototypeObject();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getPrototypeObject <em>Prototype Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prototype Object</em>' containment reference.
	 * @see #getPrototypeObject()
	 * @generated
	 */
	void setPrototypeObject(PrototypeObjectFactoryType value);

	/**
	 * Returns the value of the '<em><b>Queue Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Profile</em>' containment reference.
	 * @see #setQueueProfile(QueueProfileType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_QueueProfile()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='queue-profile' namespace='##targetNamespace' affiliation='abstract-queue-profile'"
	 * @generated
	 */
	QueueProfileType getQueueProfile();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getQueueProfile <em>Queue Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Profile</em>' containment reference.
	 * @see #getQueueProfile()
	 * @generated
	 */
	void setQueueProfile(QueueProfileType value);

	/**
	 * Returns the value of the '<em><b>Reflection Entry Point Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflection Entry Point Resolver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflection Entry Point Resolver</em>' containment reference.
	 * @see #setReflectionEntryPointResolver(ReflectionEntryPointResolverType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_ReflectionEntryPointResolver()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='reflection-entry-point-resolver' namespace='##targetNamespace' affiliation='abstract-entry-point-resolver'"
	 * @generated
	 */
	ReflectionEntryPointResolverType getReflectionEntryPointResolver();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getReflectionEntryPointResolver <em>Reflection Entry Point Resolver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflection Entry Point Resolver</em>' containment reference.
	 * @see #getReflectionEntryPointResolver()
	 * @generated
	 */
	void setReflectionEntryPointResolver(ReflectionEntryPointResolverType value);

	/**
	 * Returns the value of the '<em><b>Regex Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regex Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regex Filter</em>' containment reference.
	 * @see #setRegexFilter(PatternFilterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_RegexFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='regex-filter' namespace='##targetNamespace' affiliation='abstract-filter'"
	 * @generated
	 */
	PatternFilterType getRegexFilter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getRegexFilter <em>Regex Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regex Filter</em>' containment reference.
	 * @see #getRegexFilter()
	 * @generated
	 */
	void setRegexFilter(PatternFilterType value);

	/**
	 * Returns the value of the '<em><b>Resin Transaction Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resin Transaction Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resin Transaction Manager</em>' containment reference.
	 * @see #setResinTransactionManager(TransactionManagerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_ResinTransactionManager()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='resin-transaction-manager' namespace='##targetNamespace' affiliation='abstract-transaction-manager'"
	 * @generated
	 */
	TransactionManagerType getResinTransactionManager();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getResinTransactionManager <em>Resin Transaction Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resin Transaction Manager</em>' containment reference.
	 * @see #getResinTransactionManager()
	 * @generated
	 */
	void setResinTransactionManager(TransactionManagerType value);

	/**
	 * Returns the value of the '<em><b>Retry Connection Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry Connection Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retry Connection Strategy</em>' containment reference.
	 * @see #setRetryConnectionStrategy(RetryConnectionStrategyType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_RetryConnectionStrategy()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='retry-connection-strategy' namespace='##targetNamespace' affiliation='abstract-connection-strategy'"
	 * @generated
	 */
	RetryConnectionStrategyType getRetryConnectionStrategy();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getRetryConnectionStrategy <em>Retry Connection Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Connection Strategy</em>' containment reference.
	 * @see #getRetryConnectionStrategy()
	 * @generated
	 */
	void setRetryConnectionStrategy(RetryConnectionStrategyType value);

	/**
	 * Returns the value of the '<em><b>Rmi Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rmi Container</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rmi Container</em>' containment reference.
	 * @see #setRmiContainer(RmiContainerContextType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_RmiContainer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='rmi-container' namespace='##targetNamespace'"
	 * @generated
	 */
	RmiContainerContextType getRmiContainer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getRmiContainer <em>Rmi Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rmi Container</em>' containment reference.
	 * @see #getRmiContainer()
	 * @generated
	 */
	void setRmiContainer(RmiContainerContextType value);

	/**
	 * Returns the value of the '<em><b>Security Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 The default security manager.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Manager</em>' containment reference.
	 * @see #setSecurityManager(SecurityManagerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_SecurityManager()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='security-manager' namespace='##targetNamespace' affiliation='abstract-security-manager'"
	 * @generated
	 */
	SecurityManagerType getSecurityManager();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getSecurityManager <em>Security Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Manager</em>' containment reference.
	 * @see #getSecurityManager()
	 * @generated
	 */
	void setSecurityManager(SecurityManagerType value);

	/**
	 * Returns the value of the '<em><b>Seda Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seda Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seda Model</em>' containment reference.
	 * @see #setSedaModel(SedaModelType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_SedaModel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='seda-model' namespace='##targetNamespace' affiliation='abstract-model'"
	 * @generated
	 */
	SedaModelType getSedaModel();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getSedaModel <em>Seda Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seda Model</em>' containment reference.
	 * @see #getSedaModel()
	 * @generated
	 */
	void setSedaModel(SedaModelType value);

	/**
	 * Returns the value of the '<em><b>Selective Consumer Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selective Consumer Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selective Consumer Router</em>' containment reference.
	 * @see #setSelectiveConsumerRouter(SelectiveConsumerRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_SelectiveConsumerRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='selective-consumer-router' namespace='##targetNamespace' affiliation='abstract-inbound-router'"
	 * @generated
	 */
	SelectiveConsumerRouterType getSelectiveConsumerRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getSelectiveConsumerRouter <em>Selective Consumer Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selective Consumer Router</em>' containment reference.
	 * @see #getSelectiveConsumerRouter()
	 * @generated
	 */
	void setSelectiveConsumerRouter(SelectiveConsumerRouterType value);

	/**
	 * Returns the value of the '<em><b>Serializable To Byte Array Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serializable To Byte Array Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serializable To Byte Array Transformer</em>' containment reference.
	 * @see #setSerializableToByteArrayTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_SerializableToByteArrayTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='serializable-to-byte-array-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getSerializableToByteArrayTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getSerializableToByteArrayTransformer <em>Serializable To Byte Array Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serializable To Byte Array Transformer</em>' containment reference.
	 * @see #getSerializableToByteArrayTransformer()
	 * @generated
	 */
	void setSerializableToByteArrayTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(SedaServiceType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_Service()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='service' namespace='##targetNamespace' affiliation='abstract-service'"
	 * @generated
	 */
	SedaServiceType getService();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(SedaServiceType value);

	/**
	 * Returns the value of the '<em><b>Single Async Reply Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Async Reply Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Async Reply Router</em>' containment reference.
	 * @see #setSingleAsyncReplyRouter(AsyncReplyRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_SingleAsyncReplyRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='single-async-reply-router' namespace='##targetNamespace' affiliation='abstract-async-reply-router'"
	 * @generated
	 */
	AsyncReplyRouterType getSingleAsyncReplyRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getSingleAsyncReplyRouter <em>Single Async Reply Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Async Reply Router</em>' containment reference.
	 * @see #getSingleAsyncReplyRouter()
	 * @generated
	 */
	void setSingleAsyncReplyRouter(AsyncReplyRouterType value);

	/**
	 * Returns the value of the '<em><b>Singleton Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Singleton Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Singleton Object</em>' containment reference.
	 * @see #setSingletonObject(SingletonObjectFactoryType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_SingletonObject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='singleton-object' namespace='##targetNamespace' affiliation='abstract-object-factory'"
	 * @generated
	 */
	SingletonObjectFactoryType getSingletonObject();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getSingletonObject <em>Singleton Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Singleton Object</em>' containment reference.
	 * @see #getSingletonObject()
	 * @generated
	 */
	void setSingletonObject(SingletonObjectFactoryType value);

	/**
	 * Returns the value of the '<em><b>Spring Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spring Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spring Object</em>' containment reference.
	 * @see #setSpringObject(SpringBeanLookupType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_SpringObject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='spring-object' namespace='##targetNamespace' affiliation='abstract-object-factory'"
	 * @generated
	 */
	SpringBeanLookupType getSpringObject();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getSpringObject <em>Spring Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spring Object</em>' containment reference.
	 * @see #getSpringObject()
	 * @generated
	 */
	void setSpringObject(SpringBeanLookupType value);

	/**
	 * Returns the value of the '<em><b>Static Recipient List Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Recipient List Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Recipient List Router</em>' containment reference.
	 * @see #setStaticRecipientListRouter(StaticRecipientListRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_StaticRecipientListRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='static-recipient-list-router' namespace='##targetNamespace' affiliation='abstract-outbound-router'"
	 * @generated
	 */
	StaticRecipientListRouterType getStaticRecipientListRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getStaticRecipientListRouter <em>Static Recipient List Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Recipient List Router</em>' containment reference.
	 * @see #getStaticRecipientListRouter()
	 * @generated
	 */
	void setStaticRecipientListRouter(StaticRecipientListRouterType value);

	/**
	 * Returns the value of the '<em><b>String To Byte Array Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String To Byte Array Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String To Byte Array Transformer</em>' containment reference.
	 * @see #setStringToByteArrayTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_StringToByteArrayTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='string-to-byte-array-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getStringToByteArrayTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getStringToByteArrayTransformer <em>String To Byte Array Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String To Byte Array Transformer</em>' containment reference.
	 * @see #getStringToByteArrayTransformer()
	 * @generated
	 */
	void setStringToByteArrayTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Template Endpoint Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Endpoint Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Endpoint Router</em>' containment reference.
	 * @see #setTemplateEndpointRouter(FilteringOutboundRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TemplateEndpointRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='template-endpoint-router' namespace='##targetNamespace' affiliation='abstract-outbound-router'"
	 * @generated
	 */
	FilteringOutboundRouterType getTemplateEndpointRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTemplateEndpointRouter <em>Template Endpoint Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Endpoint Router</em>' containment reference.
	 * @see #getTemplateEndpointRouter()
	 * @generated
	 */
	void setTemplateEndpointRouter(FilteringOutboundRouterType value);

	/**
	 * Returns the value of the '<em><b>Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer</em>' containment reference.
	 * @see #setTransformer(RefTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_Transformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	RefTransformerType getTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformer <em>Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer</em>' containment reference.
	 * @see #getTransformer()
	 * @generated
	 */
	void setTransformer(RefTransformerType value);

	/**
	 * Returns the value of the '<em><b>Uc Decoder Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uc Decoder Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uc Decoder Transformer</em>' containment reference.
	 * @see #setUcDecoderTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_UcDecoderTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uc-decoder-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getUcDecoderTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getUcDecoderTransformer <em>Uc Decoder Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uc Decoder Transformer</em>' containment reference.
	 * @see #getUcDecoderTransformer()
	 * @generated
	 */
	void setUcDecoderTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Uc Encoder Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uc Encoder Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uc Encoder Transformer</em>' containment reference.
	 * @see #setUcEncoderTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_UcEncoderTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uc-encoder-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getUcEncoderTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getUcEncoderTransformer <em>Uc Encoder Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uc Encoder Transformer</em>' containment reference.
	 * @see #getUcEncoderTransformer()
	 * @generated
	 */
	void setUcEncoderTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Uu Decoder Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uu Decoder Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uu Decoder Transformer</em>' containment reference.
	 * @see #setUuDecoderTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_UuDecoderTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uu-decoder-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getUuDecoderTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getUuDecoderTransformer <em>Uu Decoder Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uu Decoder Transformer</em>' containment reference.
	 * @see #getUuDecoderTransformer()
	 * @generated
	 */
	void setUuDecoderTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Uu Encoder Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uu Encoder Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uu Encoder Transformer</em>' containment reference.
	 * @see #setUuEncoderTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_UuEncoderTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='uu-encoder-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getUuEncoderTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getUuEncoderTransformer <em>Uu Encoder Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uu Encoder Transformer</em>' containment reference.
	 * @see #getUuEncoderTransformer()
	 * @generated
	 */
	void setUuEncoderTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Weblogic Transaction Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weblogic Transaction Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weblogic Transaction Manager</em>' containment reference.
	 * @see #setWeblogicTransactionManager(JndiTransactionManagerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_WeblogicTransactionManager()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='weblogic-transaction-manager' namespace='##targetNamespace' affiliation='abstract-transaction-manager'"
	 * @generated
	 */
	JndiTransactionManagerType getWeblogicTransactionManager();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getWeblogicTransactionManager <em>Weblogic Transaction Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weblogic Transaction Manager</em>' containment reference.
	 * @see #getWeblogicTransactionManager()
	 * @generated
	 */
	void setWeblogicTransactionManager(JndiTransactionManagerType value);

	/**
	 * Returns the value of the '<em><b>Websphere Transaction Manager</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Websphere Transaction Manager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Websphere Transaction Manager</em>' containment reference.
	 * @see #setWebsphereTransactionManager(TransactionManagerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_WebsphereTransactionManager()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='websphere-transaction-manager' namespace='##targetNamespace' affiliation='abstract-transaction-manager'"
	 * @generated
	 */
	TransactionManagerType getWebsphereTransactionManager();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getWebsphereTransactionManager <em>Websphere Transaction Manager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Websphere Transaction Manager</em>' containment reference.
	 * @see #getWebsphereTransactionManager()
	 * @generated
	 */
	void setWebsphereTransactionManager(TransactionManagerType value);

	/**
	 * Returns the value of the '<em><b>Wildcard Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wildcard Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wildcard Filter</em>' containment reference.
	 * @see #setWildcardFilter(WildcardFilterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_WildcardFilter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='wildcard-filter' namespace='##targetNamespace' affiliation='abstract-filter'"
	 * @generated
	 */
	WildcardFilterType getWildcardFilter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getWildcardFilter <em>Wildcard Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wildcard Filter</em>' containment reference.
	 * @see #getWildcardFilter()
	 * @generated
	 */
	void setWildcardFilter(WildcardFilterType value);

	/**
	 * Returns the value of the '<em><b>Wire Tap Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wire Tap Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wire Tap Router</em>' containment reference.
	 * @see #setWireTapRouter(WireTapRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_WireTapRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='wire-tap-router' namespace='##targetNamespace' affiliation='abstract-inbound-router'"
	 * @generated
	 */
	WireTapRouterType getWireTapRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getWireTapRouter <em>Wire Tap Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wire Tap Router</em>' containment reference.
	 * @see #getWireTapRouter()
	 * @generated
	 */
	void setWireTapRouter(WireTapRouterType value);

	/**
	 * Returns the value of the '<em><b>Xml Entity Decoder Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Entity Decoder Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Entity Decoder Transformer</em>' containment reference.
	 * @see #setXmlEntityDecoderTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_XmlEntityDecoderTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='xml-entity-decoder-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getXmlEntityDecoderTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getXmlEntityDecoderTransformer <em>Xml Entity Decoder Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Entity Decoder Transformer</em>' containment reference.
	 * @see #getXmlEntityDecoderTransformer()
	 * @generated
	 */
	void setXmlEntityDecoderTransformer(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Xml Entity Encoder Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml Entity Encoder Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml Entity Encoder Transformer</em>' containment reference.
	 * @see #setXmlEntityEncoderTransformer(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_XmlEntityEncoderTransformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='xml-entity-encoder-transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getXmlEntityEncoderTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getXmlEntityEncoderTransformer <em>Xml Entity Encoder Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml Entity Encoder Transformer</em>' containment reference.
	 * @see #getXmlEntityEncoderTransformer()
	 * @generated
	 */
	void setXmlEntityEncoderTransformer(AbstractTransformerType value);

} // DocumentRoot
