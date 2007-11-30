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
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractBinding <em>Abstract Binding</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractCatchAllStrategy <em>Abstract Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractComponent <em>Abstract Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractComponentThreadingProfile <em>Abstract Component Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractConnectionStrategy <em>Abstract Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractConnector <em>Abstract Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractEntrypointResolver <em>Abstract Entrypoint Resolver</em>}</li>
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
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractResponseEndpoint <em>Abstract Response Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractResponseRouter <em>Abstract Response Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractSecurityFilter <em>Abstract Security Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractSecurityManager <em>Abstract Security Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractService <em>Abstract Service</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractStorage <em>Abstract Storage</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractTransaction <em>Abstract Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractTransactionFactory <em>Abstract Transaction Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractTransactionManager <em>Abstract Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAbstractTransformer <em>Abstract Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getAndFilter <em>And Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getBeanPropertyExtractor <em>Bean Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getBridgeComponent <em>Bridge Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCallableEntrypointResolver <em>Callable Entrypoint Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getChainingRouter <em>Chaining Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getComponent <em>Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getComponentThreadingProfile <em>Component Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCorrelationAggregatorRouter <em>Correlation Aggregator Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCorrelationPropertyExtractor <em>Correlation Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCorrelationResequencerRouter <em>Correlation Resequencer Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomCatchAllStrategy <em>Custom Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomConnectionStrategy <em>Custom Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomConnector <em>Custom Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomContainer <em>Custom Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomEntrypointResolver <em>Custom Entrypoint Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomExceptionStrategy <em>Custom Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomFilter <em>Custom Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomForwardingCatchAllStrategy <em>Custom Forwarding Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomInboundRouter <em>Custom Inbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomOutboundRouter <em>Custom Outbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomPropertyExtractor <em>Custom Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomResponseRouter <em>Custom Response Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomTransactionFactory <em>Custom Transaction Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomTransactionManager <em>Custom Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getCustomTransformer <em>Custom Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getDefaultConnectorExceptionStrategy <em>Default Connector Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getDefaultServiceExceptionStrategy <em>Default Service Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getEchoComponent <em>Echo Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getEjbContainer <em>Ejb Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getEncryptionSecurityFilter <em>Encryption Security Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getEndpointSelectorRouter <em>Endpoint Selector Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getExceptionBasedRouter <em>Exception Based Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getExceptionTypeFilter <em>Exception Type Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getFilteringRouter <em>Filtering Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getForwardingCatchAllStrategy <em>Forwarding Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getForwardingRouter <em>Forwarding Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getHivemindContainer <em>Hivemind Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getIdempotentReceiverRouter <em>Idempotent Receiver Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getIdempotentSecureHashReceiverRouter <em>Idempotent Secure Hash Receiver Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getInboundEndpoint <em>Inbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getInboundPassThroughRouter <em>Inbound Pass Through Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getJndiContainer <em>Jndi Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getListMessageSplitterRouter <em>List Message Splitter Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getLogComponent <em>Log Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getLoggingCatchAllStrategy <em>Logging Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getMapPropertyExtractor <em>Map Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getMessageChunkingAggregatorRouter <em>Message Chunking Aggregator Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getMessageChunkingRouter <em>Message Chunking Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getMessagePropertyExtractor <em>Message Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getMessagePropertyFilter <em>Message Property Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getModel <em>Model</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getMule <em>Mule</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getMuleUnsafe <em>Mule Unsafe</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getMulticastingRouter <em>Multicasting Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getNoArgsCallComponent <em>No Args Call Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getNotFilter <em>Not Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getNullComponent <em>Null Component</em>}</li>
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
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getPrototypeObject <em>Prototype Object</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getQueueProfile <em>Queue Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getRegexFilter <em>Regex Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getResponseEndpoint <em>Response Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getRetryConnectionStrategy <em>Retry Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getRmiContainer <em>Rmi Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getSecurityManager <em>Security Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getSedaModel <em>Seda Model</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getSelectiveConsumerRouter <em>Selective Consumer Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getService <em>Service</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getSingleResponseRouter <em>Single Response Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getSingletonObject <em>Singleton Object</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getStaticRecipientListRouter <em>Static Recipient List Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTemplateEndpointRouter <em>Template Endpoint Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransactionFactory <em>Transaction Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransactionManagerJboss <em>Transaction Manager Jboss</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransactionManagerJndi <em>Transaction Manager Jndi</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransactionManagerJrun <em>Transaction Manager Jrun</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransactionManagerResin <em>Transaction Manager Resin</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransactionManagerWeblogic <em>Transaction Manager Weblogic</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransactionManagerWebsphere <em>Transaction Manager Websphere</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerAppendString <em>Transformer Append String</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerBase64Decoder <em>Transformer Base64 Decoder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerBase64Encoder <em>Transformer Base64 Encoder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerByteArrayToHexString <em>Transformer Byte Array To Hex String</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerByteArrayToObject <em>Transformer Byte Array To Object</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerByteArrayToSerializable <em>Transformer Byte Array To Serializable</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerByteArrayToString <em>Transformer Byte Array To String</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerDecrypt <em>Transformer Decrypt</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerEncrypt <em>Transformer Encrypt</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerGzipCompress <em>Transformer Gzip Compress</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerGzipUncompress <em>Transformer Gzip Uncompress</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerHexStingToByteArray <em>Transformer Hex Sting To Byte Array</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerMessageProperties <em>Transformer Message Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerNoAction <em>Transformer No Action</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerObjectToByteArray <em>Transformer Object To Byte Array</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerObjectToString <em>Transformer Object To String</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerSerializableToByteArray <em>Transformer Serializable To Byte Array</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerStringToByteArray <em>Transformer String To Byte Array</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerUcDecoder <em>Transformer Uc Decoder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerUcEncoder <em>Transformer Uc Encoder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerUuDecoder <em>Transformer Uu Decoder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerUuEncoder <em>Transformer Uu Encoder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerXmlEntityDecoder <em>Transformer Xml Entity Decoder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getTransformerXmlEntityEncoder <em>Transformer Xml Entity Encoder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getWildcardFilter <em>Wildcard Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.DocumentRoot#getWireTapRouter <em>Wire Tap Router</em>}</li>
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
	 * Returns the value of the '<em><b>Abstract Entrypoint Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Entrypoint Resolver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Entrypoint Resolver</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractEntrypointResolver()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-entrypoint-resolver' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractEntrypointResolverType getAbstractEntrypointResolver();

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
	 * Returns the value of the '<em><b>Abstract Response Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Response Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Response Endpoint</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractResponseEndpoint()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-response-endpoint' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractResponseEndpointType getAbstractResponseEndpoint();

	/**
	 * Returns the value of the '<em><b>Abstract Response Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Response Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Response Router</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractResponseRouter()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-response-router' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractResponseRouterType getAbstractResponseRouter();

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
	 * Returns the value of the '<em><b>Abstract Transaction Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transaction Factory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transaction Factory</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_AbstractTransactionFactory()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-transaction-factory' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractTransactionFactoryType getAbstractTransactionFactory();

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
	 * Returns the value of the '<em><b>Callable Entrypoint Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Callable Entrypoint Resolver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callable Entrypoint Resolver</em>' containment reference.
	 * @see #setCallableEntrypointResolver(CallableEntrypointResolverType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CallableEntrypointResolver()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='callable-entrypoint-resolver' namespace='##targetNamespace' affiliation='abstract-entrypoint-resolver'"
	 * @generated
	 */
	CallableEntrypointResolverType getCallableEntrypointResolver();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCallableEntrypointResolver <em>Callable Entrypoint Resolver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Callable Entrypoint Resolver</em>' containment reference.
	 * @see #getCallableEntrypointResolver()
	 * @generated
	 */
	void setCallableEntrypointResolver(CallableEntrypointResolverType value);

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
	 * Returns the value of the '<em><b>Correlation Aggregator Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Aggregator Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Aggregator Router</em>' containment reference.
	 * @see #setCorrelationAggregatorRouter(CorrelationAggregatorRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CorrelationAggregatorRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='correlation-aggregator-router' namespace='##targetNamespace' affiliation='abstract-inbound-router'"
	 * @generated
	 */
	CorrelationAggregatorRouterType getCorrelationAggregatorRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCorrelationAggregatorRouter <em>Correlation Aggregator Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Aggregator Router</em>' containment reference.
	 * @see #getCorrelationAggregatorRouter()
	 * @generated
	 */
	void setCorrelationAggregatorRouter(CorrelationAggregatorRouterType value);

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
	 * @see #setCorrelationResequencerRouter(CorrelationRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CorrelationResequencerRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='correlation-resequencer-router' namespace='##targetNamespace' affiliation='abstract-inbound-router'"
	 * @generated
	 */
	CorrelationRouterType getCorrelationResequencerRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCorrelationResequencerRouter <em>Correlation Resequencer Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Resequencer Router</em>' containment reference.
	 * @see #getCorrelationResequencerRouter()
	 * @generated
	 */
	void setCorrelationResequencerRouter(CorrelationRouterType value);

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
	 * Returns the value of the '<em><b>Custom Entrypoint Resolver</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Entrypoint Resolver</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Entrypoint Resolver</em>' containment reference.
	 * @see #setCustomEntrypointResolver(CustomEntrypointResolverType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomEntrypointResolver()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-entrypoint-resolver' namespace='##targetNamespace' affiliation='abstract-entrypoint-resolver'"
	 * @generated
	 */
	CustomEntrypointResolverType getCustomEntrypointResolver();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomEntrypointResolver <em>Custom Entrypoint Resolver</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Entrypoint Resolver</em>' containment reference.
	 * @see #getCustomEntrypointResolver()
	 * @generated
	 */
	void setCustomEntrypointResolver(CustomEntrypointResolverType value);

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
	 * @see #setCustomPropertyExtractor(EObject)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomPropertyExtractor()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-property-extractor' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getCustomPropertyExtractor();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomPropertyExtractor <em>Custom Property Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Property Extractor</em>' containment reference.
	 * @see #getCustomPropertyExtractor()
	 * @generated
	 */
	void setCustomPropertyExtractor(EObject value);

	/**
	 * Returns the value of the '<em><b>Custom Response Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Response Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Response Router</em>' containment reference.
	 * @see #setCustomResponseRouter(CustomResponseRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomResponseRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-response-router' namespace='##targetNamespace' affiliation='abstract-response-router'"
	 * @generated
	 */
	CustomResponseRouterType getCustomResponseRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomResponseRouter <em>Custom Response Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Response Router</em>' containment reference.
	 * @see #getCustomResponseRouter()
	 * @generated
	 */
	void setCustomResponseRouter(CustomResponseRouterType value);

	/**
	 * Returns the value of the '<em><b>Custom Transaction Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 This can be used at the top level with a name, and then referenced with
	 *                 &lt;transaction-factory&gt;, or embedded directly in a &lt;transaction&gt;
	 *                 (in which case name cannot be given).
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Transaction Factory</em>' containment reference.
	 * @see #setCustomTransactionFactory(CustomTransactionFactoryType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_CustomTransactionFactory()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='custom-transaction-factory' namespace='##targetNamespace' affiliation='abstract-transaction-factory'"
	 * @generated
	 */
	CustomTransactionFactoryType getCustomTransactionFactory();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getCustomTransactionFactory <em>Custom Transaction Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Transaction Factory</em>' containment reference.
	 * @see #getCustomTransactionFactory()
	 * @generated
	 */
	void setCustomTransactionFactory(CustomTransactionFactoryType value);

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
	 * @see #setFilter(FilterRefType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_Filter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='filter' namespace='##targetNamespace' affiliation='abstract-filter'"
	 * @generated
	 */
	FilterRefType getFilter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getFilter <em>Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter</em>' containment reference.
	 * @see #getFilter()
	 * @generated
	 */
	void setFilter(FilterRefType value);

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
	 * @see #setIdempotentReceiverRouter(IdempotentReceiverType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_IdempotentReceiverRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='idempotent-receiver-router' namespace='##targetNamespace' affiliation='abstract-inbound-router'"
	 * @generated
	 */
	IdempotentReceiverType getIdempotentReceiverRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getIdempotentReceiverRouter <em>Idempotent Receiver Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idempotent Receiver Router</em>' containment reference.
	 * @see #getIdempotentReceiverRouter()
	 * @generated
	 */
	void setIdempotentReceiverRouter(IdempotentReceiverType value);

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
	 * @see #setMessageChunkingAggregatorRouter(CorrelationRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_MessageChunkingAggregatorRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='message-chunking-aggregator-router' namespace='##targetNamespace' affiliation='abstract-inbound-router'"
	 * @generated
	 */
	CorrelationRouterType getMessageChunkingAggregatorRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getMessageChunkingAggregatorRouter <em>Message Chunking Aggregator Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Chunking Aggregator Router</em>' containment reference.
	 * @see #getMessageChunkingAggregatorRouter()
	 * @generated
	 */
	void setMessageChunkingAggregatorRouter(CorrelationRouterType value);

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
	 * Returns the value of the '<em><b>Mule Unsafe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 An aternative root element that is more flexible, but which is less
	 *                 likely to detect configuration errors during schema validation.
	 *                 In addition, IDEs may give less useful prompts when using this element.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mule Unsafe</em>' containment reference.
	 * @see #setMuleUnsafe(MuleUnsafeType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_MuleUnsafe()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='mule-unsafe' namespace='##targetNamespace'"
	 * @generated
	 */
	MuleUnsafeType getMuleUnsafe();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getMuleUnsafe <em>Mule Unsafe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mule Unsafe</em>' containment reference.
	 * @see #getMuleUnsafe()
	 * @generated
	 */
	void setMuleUnsafe(MuleUnsafeType value);

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
	 * Returns the value of the '<em><b>No Args Call Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Built-in NoArgsCallWrapper
	 *                 There's a need to call a method having no arguments.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>No Args Call Component</em>' containment reference.
	 * @see #setNoArgsCallComponent(NoArgsCallWrapperType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_NoArgsCallComponent()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='no-args-call-component' namespace='##targetNamespace' affiliation='abstract-component'"
	 * @generated
	 */
	NoArgsCallWrapperType getNoArgsCallComponent();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getNoArgsCallComponent <em>No Args Call Component</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>No Args Call Component</em>' containment reference.
	 * @see #getNoArgsCallComponent()
	 * @generated
	 */
	void setNoArgsCallComponent(NoArgsCallWrapperType value);

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
	 * Returns the value of the '<em><b>Response Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Endpoint</em>' containment reference.
	 * @see #setResponseEndpoint(ResponseEndpointType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_ResponseEndpoint()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='response-endpoint' namespace='##targetNamespace' affiliation='abstract-response-endpoint'"
	 * @generated
	 */
	ResponseEndpointType getResponseEndpoint();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getResponseEndpoint <em>Response Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Endpoint</em>' containment reference.
	 * @see #getResponseEndpoint()
	 * @generated
	 */
	void setResponseEndpoint(ResponseEndpointType value);

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
	 * Returns the value of the '<em><b>Single Response Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Single Response Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Single Response Router</em>' containment reference.
	 * @see #setSingleResponseRouter(ResponseRouterType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_SingleResponseRouter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='single-response-router' namespace='##targetNamespace' affiliation='abstract-response-router'"
	 * @generated
	 */
	ResponseRouterType getSingleResponseRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getSingleResponseRouter <em>Single Response Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Single Response Router</em>' containment reference.
	 * @see #getSingleResponseRouter()
	 * @generated
	 */
	void setSingleResponseRouter(ResponseRouterType value);

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
	 * Returns the value of the '<em><b>Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction</em>' containment reference.
	 * @see #setTransaction(TransactionType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_Transaction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transaction' namespace='##targetNamespace' affiliation='abstract-transaction'"
	 * @generated
	 */
	TransactionType getTransaction();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransaction <em>Transaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction</em>' containment reference.
	 * @see #getTransaction()
	 * @generated
	 */
	void setTransaction(TransactionType value);

	/**
	 * Returns the value of the '<em><b>Transaction Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Factory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Factory</em>' containment reference.
	 * @see #setTransactionFactory(TransactionRefFactoryType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransactionFactory()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transaction-factory' namespace='##targetNamespace'"
	 * @generated
	 */
	TransactionRefFactoryType getTransactionFactory();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransactionFactory <em>Transaction Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Factory</em>' containment reference.
	 * @see #getTransactionFactory()
	 * @generated
	 */
	void setTransactionFactory(TransactionRefFactoryType value);

	/**
	 * Returns the value of the '<em><b>Transaction Manager Jboss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Manager Jboss</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Manager Jboss</em>' containment reference.
	 * @see #setTransactionManagerJboss(TransactionManagerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransactionManagerJboss()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transaction-manager-jboss' namespace='##targetNamespace' affiliation='abstract-transaction-manager'"
	 * @generated
	 */
	TransactionManagerType getTransactionManagerJboss();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransactionManagerJboss <em>Transaction Manager Jboss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Manager Jboss</em>' containment reference.
	 * @see #getTransactionManagerJboss()
	 * @generated
	 */
	void setTransactionManagerJboss(TransactionManagerType value);

	/**
	 * Returns the value of the '<em><b>Transaction Manager Jndi</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Manager Jndi</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Manager Jndi</em>' containment reference.
	 * @see #setTransactionManagerJndi(TransactionManagerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransactionManagerJndi()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transaction-manager-jndi' namespace='##targetNamespace' affiliation='abstract-transaction-manager'"
	 * @generated
	 */
	TransactionManagerType getTransactionManagerJndi();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransactionManagerJndi <em>Transaction Manager Jndi</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Manager Jndi</em>' containment reference.
	 * @see #getTransactionManagerJndi()
	 * @generated
	 */
	void setTransactionManagerJndi(TransactionManagerType value);

	/**
	 * Returns the value of the '<em><b>Transaction Manager Jrun</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Manager Jrun</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Manager Jrun</em>' containment reference.
	 * @see #setTransactionManagerJrun(TransactionManagerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransactionManagerJrun()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transaction-manager-jrun' namespace='##targetNamespace' affiliation='abstract-transaction-manager'"
	 * @generated
	 */
	TransactionManagerType getTransactionManagerJrun();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransactionManagerJrun <em>Transaction Manager Jrun</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Manager Jrun</em>' containment reference.
	 * @see #getTransactionManagerJrun()
	 * @generated
	 */
	void setTransactionManagerJrun(TransactionManagerType value);

	/**
	 * Returns the value of the '<em><b>Transaction Manager Resin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Manager Resin</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Manager Resin</em>' containment reference.
	 * @see #setTransactionManagerResin(TransactionManagerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransactionManagerResin()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transaction-manager-resin' namespace='##targetNamespace' affiliation='abstract-transaction-manager'"
	 * @generated
	 */
	TransactionManagerType getTransactionManagerResin();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransactionManagerResin <em>Transaction Manager Resin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Manager Resin</em>' containment reference.
	 * @see #getTransactionManagerResin()
	 * @generated
	 */
	void setTransactionManagerResin(TransactionManagerType value);

	/**
	 * Returns the value of the '<em><b>Transaction Manager Weblogic</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Manager Weblogic</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Manager Weblogic</em>' containment reference.
	 * @see #setTransactionManagerWeblogic(JndiTransactionManagerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransactionManagerWeblogic()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transaction-manager-weblogic' namespace='##targetNamespace' affiliation='abstract-transaction-manager'"
	 * @generated
	 */
	JndiTransactionManagerType getTransactionManagerWeblogic();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransactionManagerWeblogic <em>Transaction Manager Weblogic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Manager Weblogic</em>' containment reference.
	 * @see #getTransactionManagerWeblogic()
	 * @generated
	 */
	void setTransactionManagerWeblogic(JndiTransactionManagerType value);

	/**
	 * Returns the value of the '<em><b>Transaction Manager Websphere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Manager Websphere</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Manager Websphere</em>' containment reference.
	 * @see #setTransactionManagerWebsphere(TransactionManagerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransactionManagerWebsphere()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transaction-manager-websphere' namespace='##targetNamespace' affiliation='abstract-transaction-manager'"
	 * @generated
	 */
	TransactionManagerType getTransactionManagerWebsphere();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransactionManagerWebsphere <em>Transaction Manager Websphere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Manager Websphere</em>' containment reference.
	 * @see #getTransactionManagerWebsphere()
	 * @generated
	 */
	void setTransactionManagerWebsphere(TransactionManagerType value);

	/**
	 * Returns the value of the '<em><b>Transformer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer</em>' containment reference.
	 * @see #setTransformer(TransformerRefType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_Transformer()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	TransformerRefType getTransformer();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformer <em>Transformer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer</em>' containment reference.
	 * @see #getTransformer()
	 * @generated
	 */
	void setTransformer(TransformerRefType value);

	/**
	 * Returns the value of the '<em><b>Transformer Append String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Append String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Append String</em>' containment reference.
	 * @see #setTransformerAppendString(TransformerAppendStringType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerAppendString()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-append-string' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	TransformerAppendStringType getTransformerAppendString();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerAppendString <em>Transformer Append String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Append String</em>' containment reference.
	 * @see #getTransformerAppendString()
	 * @generated
	 */
	void setTransformerAppendString(TransformerAppendStringType value);

	/**
	 * Returns the value of the '<em><b>Transformer Base64 Decoder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Base64 Decoder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Base64 Decoder</em>' containment reference.
	 * @see #setTransformerBase64Decoder(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerBase64Decoder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-base64-decoder' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerBase64Decoder();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerBase64Decoder <em>Transformer Base64 Decoder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Base64 Decoder</em>' containment reference.
	 * @see #getTransformerBase64Decoder()
	 * @generated
	 */
	void setTransformerBase64Decoder(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Base64 Encoder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Base64 Encoder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Base64 Encoder</em>' containment reference.
	 * @see #setTransformerBase64Encoder(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerBase64Encoder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-base64-encoder' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerBase64Encoder();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerBase64Encoder <em>Transformer Base64 Encoder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Base64 Encoder</em>' containment reference.
	 * @see #getTransformerBase64Encoder()
	 * @generated
	 */
	void setTransformerBase64Encoder(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Byte Array To Hex String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Byte Array To Hex String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Byte Array To Hex String</em>' containment reference.
	 * @see #setTransformerByteArrayToHexString(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerByteArrayToHexString()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-byte-array-to-hex-string' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerByteArrayToHexString();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerByteArrayToHexString <em>Transformer Byte Array To Hex String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Byte Array To Hex String</em>' containment reference.
	 * @see #getTransformerByteArrayToHexString()
	 * @generated
	 */
	void setTransformerByteArrayToHexString(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Byte Array To Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Byte Array To Object</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Byte Array To Object</em>' containment reference.
	 * @see #setTransformerByteArrayToObject(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerByteArrayToObject()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-byte-array-to-object' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerByteArrayToObject();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerByteArrayToObject <em>Transformer Byte Array To Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Byte Array To Object</em>' containment reference.
	 * @see #getTransformerByteArrayToObject()
	 * @generated
	 */
	void setTransformerByteArrayToObject(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Byte Array To Serializable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Byte Array To Serializable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Byte Array To Serializable</em>' containment reference.
	 * @see #setTransformerByteArrayToSerializable(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerByteArrayToSerializable()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-byte-array-to-serializable' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerByteArrayToSerializable();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerByteArrayToSerializable <em>Transformer Byte Array To Serializable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Byte Array To Serializable</em>' containment reference.
	 * @see #getTransformerByteArrayToSerializable()
	 * @generated
	 */
	void setTransformerByteArrayToSerializable(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Byte Array To String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Byte Array To String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Byte Array To String</em>' containment reference.
	 * @see #setTransformerByteArrayToString(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerByteArrayToString()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-byte-array-to-string' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerByteArrayToString();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerByteArrayToString <em>Transformer Byte Array To String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Byte Array To String</em>' containment reference.
	 * @see #getTransformerByteArrayToString()
	 * @generated
	 */
	void setTransformerByteArrayToString(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Decrypt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Decrypt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Decrypt</em>' containment reference.
	 * @see #setTransformerDecrypt(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerDecrypt()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-decrypt' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerDecrypt();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerDecrypt <em>Transformer Decrypt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Decrypt</em>' containment reference.
	 * @see #getTransformerDecrypt()
	 * @generated
	 */
	void setTransformerDecrypt(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Encrypt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Encrypt</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Encrypt</em>' containment reference.
	 * @see #setTransformerEncrypt(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerEncrypt()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-encrypt' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerEncrypt();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerEncrypt <em>Transformer Encrypt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Encrypt</em>' containment reference.
	 * @see #getTransformerEncrypt()
	 * @generated
	 */
	void setTransformerEncrypt(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Gzip Compress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Gzip Compress</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Gzip Compress</em>' containment reference.
	 * @see #setTransformerGzipCompress(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerGzipCompress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-gzip-compress' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerGzipCompress();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerGzipCompress <em>Transformer Gzip Compress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Gzip Compress</em>' containment reference.
	 * @see #getTransformerGzipCompress()
	 * @generated
	 */
	void setTransformerGzipCompress(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Gzip Uncompress</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Gzip Uncompress</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Gzip Uncompress</em>' containment reference.
	 * @see #setTransformerGzipUncompress(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerGzipUncompress()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-gzip-uncompress' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerGzipUncompress();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerGzipUncompress <em>Transformer Gzip Uncompress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Gzip Uncompress</em>' containment reference.
	 * @see #getTransformerGzipUncompress()
	 * @generated
	 */
	void setTransformerGzipUncompress(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Hex Sting To Byte Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Hex Sting To Byte Array</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Hex Sting To Byte Array</em>' containment reference.
	 * @see #setTransformerHexStingToByteArray(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerHexStingToByteArray()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-hex-sting-to-byte-array' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerHexStingToByteArray();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerHexStingToByteArray <em>Transformer Hex Sting To Byte Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Hex Sting To Byte Array</em>' containment reference.
	 * @see #getTransformerHexStingToByteArray()
	 * @generated
	 */
	void setTransformerHexStingToByteArray(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Message Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Message Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Message Properties</em>' containment reference.
	 * @see #setTransformerMessageProperties(MessagePropertiesTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerMessageProperties()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-message-properties' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	MessagePropertiesTransformerType getTransformerMessageProperties();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerMessageProperties <em>Transformer Message Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Message Properties</em>' containment reference.
	 * @see #getTransformerMessageProperties()
	 * @generated
	 */
	void setTransformerMessageProperties(MessagePropertiesTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer No Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer No Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer No Action</em>' containment reference.
	 * @see #setTransformerNoAction(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerNoAction()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-no-action' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerNoAction();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerNoAction <em>Transformer No Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer No Action</em>' containment reference.
	 * @see #getTransformerNoAction()
	 * @generated
	 */
	void setTransformerNoAction(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Object To Byte Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Object To Byte Array</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Object To Byte Array</em>' containment reference.
	 * @see #setTransformerObjectToByteArray(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerObjectToByteArray()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-object-to-byte-array' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerObjectToByteArray();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerObjectToByteArray <em>Transformer Object To Byte Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Object To Byte Array</em>' containment reference.
	 * @see #getTransformerObjectToByteArray()
	 * @generated
	 */
	void setTransformerObjectToByteArray(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Object To String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Object To String</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Object To String</em>' containment reference.
	 * @see #setTransformerObjectToString(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerObjectToString()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-object-to-string' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerObjectToString();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerObjectToString <em>Transformer Object To String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Object To String</em>' containment reference.
	 * @see #getTransformerObjectToString()
	 * @generated
	 */
	void setTransformerObjectToString(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Serializable To Byte Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Serializable To Byte Array</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Serializable To Byte Array</em>' containment reference.
	 * @see #setTransformerSerializableToByteArray(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerSerializableToByteArray()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-serializable-to-byte-array' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerSerializableToByteArray();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerSerializableToByteArray <em>Transformer Serializable To Byte Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Serializable To Byte Array</em>' containment reference.
	 * @see #getTransformerSerializableToByteArray()
	 * @generated
	 */
	void setTransformerSerializableToByteArray(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer String To Byte Array</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer String To Byte Array</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer String To Byte Array</em>' containment reference.
	 * @see #setTransformerStringToByteArray(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerStringToByteArray()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-string-to-byte-array' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerStringToByteArray();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerStringToByteArray <em>Transformer String To Byte Array</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer String To Byte Array</em>' containment reference.
	 * @see #getTransformerStringToByteArray()
	 * @generated
	 */
	void setTransformerStringToByteArray(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Uc Decoder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Uc Decoder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Uc Decoder</em>' containment reference.
	 * @see #setTransformerUcDecoder(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerUcDecoder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-uc-decoder' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerUcDecoder();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerUcDecoder <em>Transformer Uc Decoder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Uc Decoder</em>' containment reference.
	 * @see #getTransformerUcDecoder()
	 * @generated
	 */
	void setTransformerUcDecoder(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Uc Encoder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Uc Encoder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Uc Encoder</em>' containment reference.
	 * @see #setTransformerUcEncoder(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerUcEncoder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-uc-encoder' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerUcEncoder();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerUcEncoder <em>Transformer Uc Encoder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Uc Encoder</em>' containment reference.
	 * @see #getTransformerUcEncoder()
	 * @generated
	 */
	void setTransformerUcEncoder(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Uu Decoder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Uu Decoder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Uu Decoder</em>' containment reference.
	 * @see #setTransformerUuDecoder(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerUuDecoder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-uu-decoder' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerUuDecoder();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerUuDecoder <em>Transformer Uu Decoder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Uu Decoder</em>' containment reference.
	 * @see #getTransformerUuDecoder()
	 * @generated
	 */
	void setTransformerUuDecoder(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Uu Encoder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Uu Encoder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Uu Encoder</em>' containment reference.
	 * @see #setTransformerUuEncoder(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerUuEncoder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-uu-encoder' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerUuEncoder();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerUuEncoder <em>Transformer Uu Encoder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Uu Encoder</em>' containment reference.
	 * @see #getTransformerUuEncoder()
	 * @generated
	 */
	void setTransformerUuEncoder(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Xml Entity Decoder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Xml Entity Decoder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Xml Entity Decoder</em>' containment reference.
	 * @see #setTransformerXmlEntityDecoder(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerXmlEntityDecoder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-xml-entity-decoder' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerXmlEntityDecoder();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerXmlEntityDecoder <em>Transformer Xml Entity Decoder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Xml Entity Decoder</em>' containment reference.
	 * @see #getTransformerXmlEntityDecoder()
	 * @generated
	 */
	void setTransformerXmlEntityDecoder(AbstractTransformerType value);

	/**
	 * Returns the value of the '<em><b>Transformer Xml Entity Encoder</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Xml Entity Encoder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Xml Entity Encoder</em>' containment reference.
	 * @see #setTransformerXmlEntityEncoder(AbstractTransformerType)
	 * @see org.mule.ide.config.core.CorePackage#getDocumentRoot_TransformerXmlEntityEncoder()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformer-xml-entity-encoder' namespace='##targetNamespace' affiliation='abstract-transformer'"
	 * @generated
	 */
	AbstractTransformerType getTransformerXmlEntityEncoder();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.DocumentRoot#getTransformerXmlEntityEncoder <em>Transformer Xml Entity Encoder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Xml Entity Encoder</em>' containment reference.
	 * @see #getTransformerXmlEntityEncoder()
	 * @generated
	 */
	void setTransformerXmlEntityEncoder(AbstractTransformerType value);

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

} // DocumentRoot
