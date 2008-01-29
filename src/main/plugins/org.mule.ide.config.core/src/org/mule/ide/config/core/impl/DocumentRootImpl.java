/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractAsyncReplyRouterType;
import org.mule.ide.config.core.AbstractBindingType;
import org.mule.ide.config.core.AbstractCatchAllStrategyType;
import org.mule.ide.config.core.AbstractComponentThreadingProfileType;
import org.mule.ide.config.core.AbstractComponentType;
import org.mule.ide.config.core.AbstractConnectionStrategyType;
import org.mule.ide.config.core.AbstractConnectorType;
import org.mule.ide.config.core.AbstractDefineNotificationType;
import org.mule.ide.config.core.AbstractDisableNotificationType;
import org.mule.ide.config.core.AbstractEntryPointResolverSetType;
import org.mule.ide.config.core.AbstractEntryPointResolverType;
import org.mule.ide.config.core.AbstractExceptionStrategyType;
import org.mule.ide.config.core.AbstractExtensionType;
import org.mule.ide.config.core.AbstractFilterType;
import org.mule.ide.config.core.AbstractGlobalEndpointType;
import org.mule.ide.config.core.AbstractInboundEndpointType;
import org.mule.ide.config.core.AbstractInboundRouterType;
import org.mule.ide.config.core.AbstractModelType;
import org.mule.ide.config.core.AbstractObjectFactoryType;
import org.mule.ide.config.core.AbstractOutboundEndpointType;
import org.mule.ide.config.core.AbstractOutboundRouterType;
import org.mule.ide.config.core.AbstractPoolingProfileType;
import org.mule.ide.config.core.AbstractPropertyExtractorType;
import org.mule.ide.config.core.AbstractQueueProfileType;
import org.mule.ide.config.core.AbstractSecurityFilterType;
import org.mule.ide.config.core.AbstractSecurityManagerType;
import org.mule.ide.config.core.AbstractServiceType;
import org.mule.ide.config.core.AbstractStorageType;
import org.mule.ide.config.core.AbstractTransactionManagerType;
import org.mule.ide.config.core.AbstractTransactionType;
import org.mule.ide.config.core.AbstractTransformerType;
import org.mule.ide.config.core.AppendStringTransformerType;
import org.mule.ide.config.core.AsyncReplyRouterType;
import org.mule.ide.config.core.BaseContainerContextType;
import org.mule.ide.config.core.ChunkingRouterType;
import org.mule.ide.config.core.CollectionFilterType;
import org.mule.ide.config.core.ComplexEntryPointResolverType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.CustomAsyncReplyRouterType;
import org.mule.ide.config.core.CustomCatchAllStrategyType;
import org.mule.ide.config.core.CustomConnectionStrategyType;
import org.mule.ide.config.core.CustomConnectorType;
import org.mule.ide.config.core.CustomContainerContextType;
import org.mule.ide.config.core.CustomCorrelationAggregatorRouterType;
import org.mule.ide.config.core.CustomEntryPointResolverSetType;
import org.mule.ide.config.core.CustomEntryPointResolverType;
import org.mule.ide.config.core.CustomExceptionStrategyType;
import org.mule.ide.config.core.CustomFilterType;
import org.mule.ide.config.core.CustomForwardingCatchAllStrategyType;
import org.mule.ide.config.core.CustomInboundRouterType;
import org.mule.ide.config.core.CustomOutboundRouterType;
import org.mule.ide.config.core.CustomPropertyExtractorType;
import org.mule.ide.config.core.CustomTransactionManagerType;
import org.mule.ide.config.core.CustomTransactionType;
import org.mule.ide.config.core.CustomTransformerType;
import org.mule.ide.config.core.DefaultComponentType;
import org.mule.ide.config.core.DefaultModelType;
import org.mule.ide.config.core.DefineNotificationType;
import org.mule.ide.config.core.DefaultServiceType;
import org.mule.ide.config.core.DescriptionType;
import org.mule.ide.config.core.DisableNotificationType;
import org.mule.ide.config.core.DocumentRoot;
import org.mule.ide.config.core.EncryptionSecurityFilterType;
import org.mule.ide.config.core.EndpointSelectorRouterType;
import org.mule.ide.config.core.ExceptionStrategyType;
import org.mule.ide.config.core.ExtensibleEntryPointResolverSet;
import org.mule.ide.config.core.FilteredInboundRouterType;
import org.mule.ide.config.core.FilteringOutboundRouterType;
import org.mule.ide.config.core.ForwardingCatchAllStrategyType;
import org.mule.ide.config.core.ForwardingRouterType;
import org.mule.ide.config.core.GlobalEndpointType;
import org.mule.ide.config.core.IdempotentReceiverRouterType;
import org.mule.ide.config.core.InboundEndpointType;
import org.mule.ide.config.core.IocContainerContextType;
import org.mule.ide.config.core.JndiTransactionManagerType;
import org.mule.ide.config.core.LoggingCatchAllStrategyType;
import org.mule.ide.config.core.MapType;
import org.mule.ide.config.core.MessageChunkingAggregatorRouterType;
import org.mule.ide.config.core.MessagePropertiesTransformerType;
import org.mule.ide.config.core.MessageSplitterOutboundRouterType;
import org.mule.ide.config.core.MethodEntryPointResolverType;
import org.mule.ide.config.core.MethodType;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.core.MuleUnsafeType;
import org.mule.ide.config.core.OutboundEndpointType;
import org.mule.ide.config.core.OutboundRouterType;
import org.mule.ide.config.core.PatternFilterType;
import org.mule.ide.config.core.PojoComponentType;
import org.mule.ide.config.core.PooledObjectFactoryType;
import org.mule.ide.config.core.PoolingProfileType;
import org.mule.ide.config.core.PropertiesContainerContextType;
import org.mule.ide.config.core.PropertyEntryPointResolverType;
import org.mule.ide.config.core.PrototypeObjectFactoryType;
import org.mule.ide.config.core.QueueProfileType;
import org.mule.ide.config.core.RefFilterType;
import org.mule.ide.config.core.RefTransformerType;
import org.mule.ide.config.core.ReflectionEntryPointResolverType;
import org.mule.ide.config.core.RetryConnectionStrategyType;
import org.mule.ide.config.core.RmiContainerContextType;
import org.mule.ide.config.core.SecurityManagerType;
import org.mule.ide.config.core.SedaModelType;
import org.mule.ide.config.core.SedaServiceType;
import org.mule.ide.config.core.SelectiveConsumerRouterType;
import org.mule.ide.config.core.SingletonObjectFactoryType;
import org.mule.ide.config.core.SpringBeanLookupType;
import org.mule.ide.config.core.StaticRecipientListRouterType;
import org.mule.ide.config.core.ThreadingProfileType;
import org.mule.ide.config.core.TransactionManagerType;
import org.mule.ide.config.core.TypeFilterType;
import org.mule.ide.config.core.UnitaryFilterType;
import org.mule.ide.config.core.WildcardFilterType;
import org.mule.ide.config.core.WireTapRouterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractAsyncReplyRouter <em>Abstract Async Reply Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractBinding <em>Abstract Binding</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractCatchAllStrategy <em>Abstract Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractComponent <em>Abstract Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractComponentThreadingProfile <em>Abstract Component Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractConnectionStrategy <em>Abstract Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractConnector <em>Abstract Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractDefineNotification <em>Abstract Define Notification</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractDisableNotification <em>Abstract Disable Notification</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractEntryPointResolver <em>Abstract Entry Point Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractEntryPointResolverSet <em>Abstract Entry Point Resolver Set</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractExceptionStrategy <em>Abstract Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractExtension <em>Abstract Extension</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractFilter <em>Abstract Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractGlobalEndpoint <em>Abstract Global Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractInboundRouter <em>Abstract Inbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractModel <em>Abstract Model</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractObjectFactory <em>Abstract Object Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractOutboundEndpoint <em>Abstract Outbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractOutboundRouter <em>Abstract Outbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractPoolingProfile <em>Abstract Pooling Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractPropertyExtractor <em>Abstract Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractQueueProfile <em>Abstract Queue Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractSecurityFilter <em>Abstract Security Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractSecurityManager <em>Abstract Security Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractService <em>Abstract Service</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractStorage <em>Abstract Storage</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractTransaction <em>Abstract Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractTransactionManager <em>Abstract Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractTransformer <em>Abstract Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAndFilter <em>And Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAppendStringTransformer <em>Append String Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getArrayEntryPointResolver <em>Array Entry Point Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getBase64DecoderTransformer <em>Base64 Decoder Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getBase64EncoderTransformer <em>Base64 Encoder Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getBeanPropertyExtractor <em>Bean Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getBridgeComponent <em>Bridge Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getByteArrayToHexStringTransformer <em>Byte Array To Hex String Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getByteArrayToObjectTransformer <em>Byte Array To Object Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getByteArrayToSerializableTransformer <em>Byte Array To Serializable Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getByteArrayToStringTransformer <em>Byte Array To String Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCallableEntryPointResolver <em>Callable Entry Point Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getChainingRouter <em>Chaining Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getComponentThreadingProfile <em>Component Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCorrelationPropertyExtractor <em>Correlation Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCorrelationResequencerRouter <em>Correlation Resequencer Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomAsyncReplyRouter <em>Custom Async Reply Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomCatchAllStrategy <em>Custom Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomConnectionStrategy <em>Custom Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomConnector <em>Custom Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomContainer <em>Custom Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomCorrelationAggregatorRouter <em>Custom Correlation Aggregator Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomEntryPointResolver <em>Custom Entry Point Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomEntryPointResolverSet <em>Custom Entry Point Resolver Set</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomExceptionStrategy <em>Custom Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomFilter <em>Custom Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomForwardingCatchAllStrategy <em>Custom Forwarding Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomInboundRouter <em>Custom Inbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomOutboundRouter <em>Custom Outbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomPropertyExtractor <em>Custom Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomTransaction <em>Custom Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomTransactionManager <em>Custom Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomTransformer <em>Custom Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getDecryptTransformer <em>Decrypt Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getDefaultConnectorExceptionStrategy <em>Default Connector Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getDefaultServiceExceptionStrategy <em>Default Service Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getDisableNotification <em>Disable Notification</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getEchoComponent <em>Echo Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getEjbContainer <em>Ejb Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getEncryptionSecurityFilter <em>Encryption Security Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getEncryptTransformer <em>Encrypt Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getEndpointSelectorRouter <em>Endpoint Selector Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getEntryPointResolverSet <em>Entry Point Resolver Set</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getExceptionBasedRouter <em>Exception Based Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getExceptionTypeFilter <em>Exception Type Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getFilteringRouter <em>Filtering Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getForwardingCatchAllStrategy <em>Forwarding Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getForwardingRouter <em>Forwarding Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getGzipCompressTransformer <em>Gzip Compress Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getGzipUncompressTransformer <em>Gzip Uncompress Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getHexStringToByteArrayTransformer <em>Hex String To Byte Array Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getHivemindContainer <em>Hivemind Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getIdempotentReceiverRouter <em>Idempotent Receiver Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getIdempotentSecureHashReceiverRouter <em>Idempotent Secure Hash Receiver Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getInboundEndpoint <em>Inbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getInboundPassThroughRouter <em>Inbound Pass Through Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getIncludeEntryPoint <em>Include Entry Point</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getJbossTransactionManager <em>Jboss Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getJndiContainer <em>Jndi Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getJndiTransactionManager <em>Jndi Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getJrunTransactionManager <em>Jrun Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getLegacyEntryPointResolverSet <em>Legacy Entry Point Resolver Set</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getListMessageSplitterRouter <em>List Message Splitter Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getLogComponent <em>Log Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getLoggingCatchAllStrategy <em>Logging Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMapPropertyExtractor <em>Map Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMessageChunkingAggregatorRouter <em>Message Chunking Aggregator Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMessageChunkingRouter <em>Message Chunking Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMessagePropertiesTransformer <em>Message Properties Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMessagePropertyExtractor <em>Message Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMessagePropertyFilter <em>Message Property Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMethodEntryPointResolver <em>Method Entry Point Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMule <em>Mule</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMuleUnsafe <em>Mule Unsafe</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMulticastingRouter <em>Multicasting Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getNoActionTransformer <em>No Action Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getNoArgumentsEntryPointResolver <em>No Arguments Entry Point Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getNotFilter <em>Not Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getNotification <em>Notification</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getNullComponent <em>Null Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getObjectToByteArrayTransformer <em>Object To Byte Array Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getObjectToStringTransformer <em>Object To String Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getOrFilter <em>Or Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getOutboundEndpoint <em>Outbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getOutboundPassThroughRouter <em>Outbound Pass Through Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getPassThroughComponent <em>Pass Through Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getPayloadPropertyExtractor <em>Payload Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getPayloadTypeFilter <em>Payload Type Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getPicoContainer <em>Pico Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getPlexusContainer <em>Plexus Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getPooledObject <em>Pooled Object</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getPoolingProfile <em>Pooling Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getPropertiesContainer <em>Properties Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getPropertyEntryPointResolver <em>Property Entry Point Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getPrototypeObject <em>Prototype Object</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getQueueProfile <em>Queue Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getReflectionEntryPointResolver <em>Reflection Entry Point Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getRegexFilter <em>Regex Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getResinTransactionManager <em>Resin Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getRetryConnectionStrategy <em>Retry Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getRmiContainer <em>Rmi Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getSecurityManager <em>Security Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getSedaModel <em>Seda Model</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getSelectiveConsumerRouter <em>Selective Consumer Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getSerializableToByteArrayTransformer <em>Serializable To Byte Array Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getSingleAsyncReplyRouter <em>Single Async Reply Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getSingletonObject <em>Singleton Object</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getSpringObject <em>Spring Object</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getStaticRecipientListRouter <em>Static Recipient List Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getStringToByteArrayTransformer <em>String To Byte Array Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTemplateEndpointRouter <em>Template Endpoint Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getUcDecoderTransformer <em>Uc Decoder Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getUcEncoderTransformer <em>Uc Encoder Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getUuDecoderTransformer <em>Uu Decoder Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getUuEncoderTransformer <em>Uu Encoder Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getWeblogicTransactionManager <em>Weblogic Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getWebsphereTransactionManager <em>Websphere Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getWildcardFilter <em>Wildcard Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getWireTapRouter <em>Wire Tap Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getXmlEntityDecoderTransformer <em>Xml Entity Decoder Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getXmlEntityEncoderTransformer <em>Xml Entity Encoder Transformer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CorePackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAsyncReplyRouterType getAbstractAsyncReplyRouter() {
		return (AbstractAsyncReplyRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractAsyncReplyRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractAsyncReplyRouter(AbstractAsyncReplyRouterType newAbstractAsyncReplyRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractAsyncReplyRouter(), newAbstractAsyncReplyRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBindingType getAbstractBinding() {
		return (AbstractBindingType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractBinding(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractBinding(AbstractBindingType newAbstractBinding, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractBinding(), newAbstractBinding, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCatchAllStrategyType getAbstractCatchAllStrategy() {
		return (AbstractCatchAllStrategyType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractCatchAllStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractCatchAllStrategy(AbstractCatchAllStrategyType newAbstractCatchAllStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractCatchAllStrategy(), newAbstractCatchAllStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractComponentType getAbstractComponent() {
		return (AbstractComponentType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractComponent(AbstractComponentType newAbstractComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractComponent(), newAbstractComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractComponentThreadingProfileType getAbstractComponentThreadingProfile() {
		return (AbstractComponentThreadingProfileType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractComponentThreadingProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractComponentThreadingProfile(AbstractComponentThreadingProfileType newAbstractComponentThreadingProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractComponentThreadingProfile(), newAbstractComponentThreadingProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionStrategyType getAbstractConnectionStrategy() {
		return (AbstractConnectionStrategyType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractConnectionStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractConnectionStrategy(AbstractConnectionStrategyType newAbstractConnectionStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractConnectionStrategy(), newAbstractConnectionStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectorType getAbstractConnector() {
		return (AbstractConnectorType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractConnector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractConnector(AbstractConnectorType newAbstractConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractConnector(), newAbstractConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractDefineNotificationType getAbstractDefineNotification() {
		return (AbstractDefineNotificationType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractDefineNotification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractDefineNotification(AbstractDefineNotificationType newAbstractDefineNotification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractDefineNotification(), newAbstractDefineNotification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractDisableNotificationType getAbstractDisableNotification() {
		return (AbstractDisableNotificationType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractDisableNotification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractDisableNotification(AbstractDisableNotificationType newAbstractDisableNotification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractDisableNotification(), newAbstractDisableNotification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEntryPointResolverType getAbstractEntryPointResolver() {
		return (AbstractEntryPointResolverType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractEntryPointResolver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractEntryPointResolver(AbstractEntryPointResolverType newAbstractEntryPointResolver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractEntryPointResolver(), newAbstractEntryPointResolver, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEntryPointResolverSetType getAbstractEntryPointResolverSet() {
		return (AbstractEntryPointResolverSetType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractEntryPointResolverSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractEntryPointResolverSet(AbstractEntryPointResolverSetType newAbstractEntryPointResolverSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractEntryPointResolverSet(), newAbstractEntryPointResolverSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExceptionStrategyType getAbstractExceptionStrategy() {
		return (AbstractExceptionStrategyType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractExceptionStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractExceptionStrategy(AbstractExceptionStrategyType newAbstractExceptionStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractExceptionStrategy(), newAbstractExceptionStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExtensionType getAbstractExtension() {
		return (AbstractExtensionType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractExtension(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractExtension(AbstractExtensionType newAbstractExtension, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractExtension(), newAbstractExtension, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFilterType getAbstractFilter() {
		return (AbstractFilterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractFilter(AbstractFilterType newAbstractFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractFilter(), newAbstractFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGlobalEndpointType getAbstractGlobalEndpoint() {
		return (AbstractGlobalEndpointType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractGlobalEndpoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractGlobalEndpoint(AbstractGlobalEndpointType newAbstractGlobalEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractGlobalEndpoint(), newAbstractGlobalEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInboundEndpointType getAbstractInboundEndpoint() {
		return (AbstractInboundEndpointType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractInboundEndpoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractInboundEndpoint(AbstractInboundEndpointType newAbstractInboundEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractInboundEndpoint(), newAbstractInboundEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInboundRouterType getAbstractInboundRouter() {
		return (AbstractInboundRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractInboundRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractInboundRouter(AbstractInboundRouterType newAbstractInboundRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractInboundRouter(), newAbstractInboundRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractModelType getAbstractModel() {
		return (AbstractModelType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractModel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractModel(AbstractModelType newAbstractModel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractModel(), newAbstractModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractObjectFactoryType getAbstractObjectFactory() {
		return (AbstractObjectFactoryType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractObjectFactory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractObjectFactory(AbstractObjectFactoryType newAbstractObjectFactory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractObjectFactory(), newAbstractObjectFactory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractOutboundEndpointType getAbstractOutboundEndpoint() {
		return (AbstractOutboundEndpointType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractOutboundEndpoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractOutboundEndpoint(AbstractOutboundEndpointType newAbstractOutboundEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractOutboundEndpoint(), newAbstractOutboundEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractOutboundRouterType getAbstractOutboundRouter() {
		return (AbstractOutboundRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractOutboundRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractOutboundRouter(AbstractOutboundRouterType newAbstractOutboundRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractOutboundRouter(), newAbstractOutboundRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPoolingProfileType getAbstractPoolingProfile() {
		return (AbstractPoolingProfileType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractPoolingProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractPoolingProfile(AbstractPoolingProfileType newAbstractPoolingProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractPoolingProfile(), newAbstractPoolingProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPropertyExtractorType getAbstractPropertyExtractor() {
		return (AbstractPropertyExtractorType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractPropertyExtractor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractPropertyExtractor(AbstractPropertyExtractorType newAbstractPropertyExtractor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractPropertyExtractor(), newAbstractPropertyExtractor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractQueueProfileType getAbstractQueueProfile() {
		return (AbstractQueueProfileType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractQueueProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractQueueProfile(AbstractQueueProfileType newAbstractQueueProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractQueueProfile(), newAbstractQueueProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSecurityFilterType getAbstractSecurityFilter() {
		return (AbstractSecurityFilterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractSecurityFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractSecurityFilter(AbstractSecurityFilterType newAbstractSecurityFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractSecurityFilter(), newAbstractSecurityFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSecurityManagerType getAbstractSecurityManager() {
		return (AbstractSecurityManagerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractSecurityManager(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractSecurityManager(AbstractSecurityManagerType newAbstractSecurityManager, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractSecurityManager(), newAbstractSecurityManager, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractServiceType getAbstractService() {
		return (AbstractServiceType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractService(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractService(AbstractServiceType newAbstractService, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractService(), newAbstractService, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStorageType getAbstractStorage() {
		return (AbstractStorageType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractStorage(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractStorage(AbstractStorageType newAbstractStorage, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractStorage(), newAbstractStorage, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransactionType getAbstractTransaction() {
		return (AbstractTransactionType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractTransaction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTransaction(AbstractTransactionType newAbstractTransaction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractTransaction(), newAbstractTransaction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransactionManagerType getAbstractTransactionManager() {
		return (AbstractTransactionManagerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractTransactionManager(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTransactionManager(AbstractTransactionManagerType newAbstractTransactionManager, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractTransactionManager(), newAbstractTransactionManager, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getAbstractTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTransformer(AbstractTransformerType newAbstractTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractTransformer(), newAbstractTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionFilterType getAndFilter() {
		return (CollectionFilterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AndFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAndFilter(CollectionFilterType newAndFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AndFilter(), newAndFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAndFilter(CollectionFilterType newAndFilter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_AndFilter(), newAndFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppendStringTransformerType getAppendStringTransformer() {
		return (AppendStringTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AppendStringTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppendStringTransformer(AppendStringTransformerType newAppendStringTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AppendStringTransformer(), newAppendStringTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppendStringTransformer(AppendStringTransformerType newAppendStringTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_AppendStringTransformer(), newAppendStringTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexEntryPointResolverType getArrayEntryPointResolver() {
		return (ComplexEntryPointResolverType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ArrayEntryPointResolver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrayEntryPointResolver(ComplexEntryPointResolverType newArrayEntryPointResolver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ArrayEntryPointResolver(), newArrayEntryPointResolver, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrayEntryPointResolver(ComplexEntryPointResolverType newArrayEntryPointResolver) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ArrayEntryPointResolver(), newArrayEntryPointResolver);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getBase64DecoderTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_Base64DecoderTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase64DecoderTransformer(AbstractTransformerType newBase64DecoderTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_Base64DecoderTransformer(), newBase64DecoderTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase64DecoderTransformer(AbstractTransformerType newBase64DecoderTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_Base64DecoderTransformer(), newBase64DecoderTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getBase64EncoderTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_Base64EncoderTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase64EncoderTransformer(AbstractTransformerType newBase64EncoderTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_Base64EncoderTransformer(), newBase64EncoderTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase64EncoderTransformer(AbstractTransformerType newBase64EncoderTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_Base64EncoderTransformer(), newBase64EncoderTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPropertyExtractorType getBeanPropertyExtractor() {
		return (AbstractPropertyExtractorType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_BeanPropertyExtractor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBeanPropertyExtractor(AbstractPropertyExtractorType newBeanPropertyExtractor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_BeanPropertyExtractor(), newBeanPropertyExtractor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBeanPropertyExtractor(AbstractPropertyExtractorType newBeanPropertyExtractor) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_BeanPropertyExtractor(), newBeanPropertyExtractor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultComponentType getBridgeComponent() {
		return (DefaultComponentType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_BridgeComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBridgeComponent(DefaultComponentType newBridgeComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_BridgeComponent(), newBridgeComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBridgeComponent(DefaultComponentType newBridgeComponent) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_BridgeComponent(), newBridgeComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getByteArrayToHexStringTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToHexStringTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetByteArrayToHexStringTransformer(AbstractTransformerType newByteArrayToHexStringTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToHexStringTransformer(), newByteArrayToHexStringTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteArrayToHexStringTransformer(AbstractTransformerType newByteArrayToHexStringTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToHexStringTransformer(), newByteArrayToHexStringTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getByteArrayToObjectTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToObjectTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetByteArrayToObjectTransformer(AbstractTransformerType newByteArrayToObjectTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToObjectTransformer(), newByteArrayToObjectTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteArrayToObjectTransformer(AbstractTransformerType newByteArrayToObjectTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToObjectTransformer(), newByteArrayToObjectTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getByteArrayToSerializableTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToSerializableTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetByteArrayToSerializableTransformer(AbstractTransformerType newByteArrayToSerializableTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToSerializableTransformer(), newByteArrayToSerializableTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteArrayToSerializableTransformer(AbstractTransformerType newByteArrayToSerializableTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToSerializableTransformer(), newByteArrayToSerializableTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getByteArrayToStringTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToStringTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetByteArrayToStringTransformer(AbstractTransformerType newByteArrayToStringTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToStringTransformer(), newByteArrayToStringTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteArrayToStringTransformer(AbstractTransformerType newByteArrayToStringTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToStringTransformer(), newByteArrayToStringTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEntryPointResolverType getCallableEntryPointResolver() {
		return (AbstractEntryPointResolverType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallableEntryPointResolver(AbstractEntryPointResolverType newCallableEntryPointResolver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(), newCallableEntryPointResolver, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallableEntryPointResolver(AbstractEntryPointResolverType newCallableEntryPointResolver) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(), newCallableEntryPointResolver);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteringOutboundRouterType getChainingRouter() {
		return (FilteringOutboundRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChainingRouter(FilteringOutboundRouterType newChainingRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter(), newChainingRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChainingRouter(FilteringOutboundRouterType newChainingRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter(), newChainingRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PojoComponentType getComponent() {
		return (PojoComponentType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_Component(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponent(PojoComponentType newComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_Component(), newComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponent(PojoComponentType newComponent) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_Component(), newComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadingProfileType getComponentThreadingProfile() {
		return (ThreadingProfileType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ComponentThreadingProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentThreadingProfile(ThreadingProfileType newComponentThreadingProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ComponentThreadingProfile(), newComponentThreadingProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentThreadingProfile(ThreadingProfileType newComponentThreadingProfile) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ComponentThreadingProfile(), newComponentThreadingProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPropertyExtractorType getCorrelationPropertyExtractor() {
		return (AbstractPropertyExtractorType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CorrelationPropertyExtractor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationPropertyExtractor(AbstractPropertyExtractorType newCorrelationPropertyExtractor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CorrelationPropertyExtractor(), newCorrelationPropertyExtractor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationPropertyExtractor(AbstractPropertyExtractorType newCorrelationPropertyExtractor) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CorrelationPropertyExtractor(), newCorrelationPropertyExtractor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectiveConsumerRouterType getCorrelationResequencerRouter() {
		return (SelectiveConsumerRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CorrelationResequencerRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationResequencerRouter(SelectiveConsumerRouterType newCorrelationResequencerRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CorrelationResequencerRouter(), newCorrelationResequencerRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationResequencerRouter(SelectiveConsumerRouterType newCorrelationResequencerRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CorrelationResequencerRouter(), newCorrelationResequencerRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomAsyncReplyRouterType getCustomAsyncReplyRouter() {
		return (CustomAsyncReplyRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomAsyncReplyRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomAsyncReplyRouter(CustomAsyncReplyRouterType newCustomAsyncReplyRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomAsyncReplyRouter(), newCustomAsyncReplyRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomAsyncReplyRouter(CustomAsyncReplyRouterType newCustomAsyncReplyRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomAsyncReplyRouter(), newCustomAsyncReplyRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomCatchAllStrategyType getCustomCatchAllStrategy() {
		return (CustomCatchAllStrategyType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomCatchAllStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomCatchAllStrategy(CustomCatchAllStrategyType newCustomCatchAllStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomCatchAllStrategy(), newCustomCatchAllStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomCatchAllStrategy(CustomCatchAllStrategyType newCustomCatchAllStrategy) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomCatchAllStrategy(), newCustomCatchAllStrategy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomConnectionStrategyType getCustomConnectionStrategy() {
		return (CustomConnectionStrategyType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomConnectionStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomConnectionStrategy(CustomConnectionStrategyType newCustomConnectionStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomConnectionStrategy(), newCustomConnectionStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomConnectionStrategy(CustomConnectionStrategyType newCustomConnectionStrategy) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomConnectionStrategy(), newCustomConnectionStrategy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomConnectorType getCustomConnector() {
		return (CustomConnectorType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomConnector(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomConnector(CustomConnectorType newCustomConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomConnector(), newCustomConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomConnector(CustomConnectorType newCustomConnector) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomConnector(), newCustomConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomContainerContextType getCustomContainer() {
		return (CustomContainerContextType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomContainer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomContainer(CustomContainerContextType newCustomContainer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomContainer(), newCustomContainer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomContainer(CustomContainerContextType newCustomContainer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomContainer(), newCustomContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomCorrelationAggregatorRouterType getCustomCorrelationAggregatorRouter() {
		return (CustomCorrelationAggregatorRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomCorrelationAggregatorRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomCorrelationAggregatorRouter(CustomCorrelationAggregatorRouterType newCustomCorrelationAggregatorRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomCorrelationAggregatorRouter(), newCustomCorrelationAggregatorRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomCorrelationAggregatorRouter(CustomCorrelationAggregatorRouterType newCustomCorrelationAggregatorRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomCorrelationAggregatorRouter(), newCustomCorrelationAggregatorRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEntryPointResolverType getCustomEntryPointResolver() {
		return (CustomEntryPointResolverType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomEntryPointResolver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomEntryPointResolver(CustomEntryPointResolverType newCustomEntryPointResolver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomEntryPointResolver(), newCustomEntryPointResolver, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomEntryPointResolver(CustomEntryPointResolverType newCustomEntryPointResolver) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomEntryPointResolver(), newCustomEntryPointResolver);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEntryPointResolverSetType getCustomEntryPointResolverSet() {
		return (CustomEntryPointResolverSetType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomEntryPointResolverSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomEntryPointResolverSet(CustomEntryPointResolverSetType newCustomEntryPointResolverSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomEntryPointResolverSet(), newCustomEntryPointResolverSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomEntryPointResolverSet(CustomEntryPointResolverSetType newCustomEntryPointResolverSet) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomEntryPointResolverSet(), newCustomEntryPointResolverSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomExceptionStrategyType getCustomExceptionStrategy() {
		return (CustomExceptionStrategyType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomExceptionStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomExceptionStrategy(CustomExceptionStrategyType newCustomExceptionStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomExceptionStrategy(), newCustomExceptionStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomExceptionStrategy(CustomExceptionStrategyType newCustomExceptionStrategy) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomExceptionStrategy(), newCustomExceptionStrategy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomFilterType getCustomFilter() {
		return (CustomFilterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomFilter(CustomFilterType newCustomFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomFilter(), newCustomFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomFilter(CustomFilterType newCustomFilter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomFilter(), newCustomFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomForwardingCatchAllStrategyType getCustomForwardingCatchAllStrategy() {
		return (CustomForwardingCatchAllStrategyType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomForwardingCatchAllStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomForwardingCatchAllStrategy(CustomForwardingCatchAllStrategyType newCustomForwardingCatchAllStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomForwardingCatchAllStrategy(), newCustomForwardingCatchAllStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomForwardingCatchAllStrategy(CustomForwardingCatchAllStrategyType newCustomForwardingCatchAllStrategy) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomForwardingCatchAllStrategy(), newCustomForwardingCatchAllStrategy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomInboundRouterType getCustomInboundRouter() {
		return (CustomInboundRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomInboundRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomInboundRouter(CustomInboundRouterType newCustomInboundRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomInboundRouter(), newCustomInboundRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomInboundRouter(CustomInboundRouterType newCustomInboundRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomInboundRouter(), newCustomInboundRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomOutboundRouterType getCustomOutboundRouter() {
		return (CustomOutboundRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomOutboundRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomOutboundRouter(CustomOutboundRouterType newCustomOutboundRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomOutboundRouter(), newCustomOutboundRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomOutboundRouter(CustomOutboundRouterType newCustomOutboundRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomOutboundRouter(), newCustomOutboundRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomPropertyExtractorType getCustomPropertyExtractor() {
		return (CustomPropertyExtractorType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomPropertyExtractor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomPropertyExtractor(CustomPropertyExtractorType newCustomPropertyExtractor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomPropertyExtractor(), newCustomPropertyExtractor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomPropertyExtractor(CustomPropertyExtractorType newCustomPropertyExtractor) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomPropertyExtractor(), newCustomPropertyExtractor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTransactionType getCustomTransaction() {
		return (CustomTransactionType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomTransaction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomTransaction(CustomTransactionType newCustomTransaction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomTransaction(), newCustomTransaction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomTransaction(CustomTransactionType newCustomTransaction) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomTransaction(), newCustomTransaction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTransactionManagerType getCustomTransactionManager() {
		return (CustomTransactionManagerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomTransactionManager(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomTransactionManager(CustomTransactionManagerType newCustomTransactionManager, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomTransactionManager(), newCustomTransactionManager, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomTransactionManager(CustomTransactionManagerType newCustomTransactionManager) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomTransactionManager(), newCustomTransactionManager);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTransformerType getCustomTransformer() {
		return (CustomTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomTransformer(CustomTransformerType newCustomTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomTransformer(), newCustomTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomTransformer(CustomTransformerType newCustomTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomTransformer(), newCustomTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getDecryptTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_DecryptTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecryptTransformer(AbstractTransformerType newDecryptTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_DecryptTransformer(), newDecryptTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecryptTransformer(AbstractTransformerType newDecryptTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_DecryptTransformer(), newDecryptTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionStrategyType getDefaultConnectorExceptionStrategy() {
		return (ExceptionStrategyType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_DefaultConnectorExceptionStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultConnectorExceptionStrategy(ExceptionStrategyType newDefaultConnectorExceptionStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_DefaultConnectorExceptionStrategy(), newDefaultConnectorExceptionStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultConnectorExceptionStrategy(ExceptionStrategyType newDefaultConnectorExceptionStrategy) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_DefaultConnectorExceptionStrategy(), newDefaultConnectorExceptionStrategy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionStrategyType getDefaultServiceExceptionStrategy() {
		return (ExceptionStrategyType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_DefaultServiceExceptionStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultServiceExceptionStrategy(ExceptionStrategyType newDefaultServiceExceptionStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_DefaultServiceExceptionStrategy(), newDefaultServiceExceptionStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultServiceExceptionStrategy(ExceptionStrategyType newDefaultServiceExceptionStrategy) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_DefaultServiceExceptionStrategy(), newDefaultServiceExceptionStrategy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType getDescription() {
		return (DescriptionType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_Description(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(DescriptionType newDescription, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_Description(), newDescription, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(DescriptionType newDescription) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_Description(), newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableNotificationType getDisableNotification() {
		return (DisableNotificationType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_DisableNotification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisableNotification(DisableNotificationType newDisableNotification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_DisableNotification(), newDisableNotification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisableNotification(DisableNotificationType newDisableNotification) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_DisableNotification(), newDisableNotification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultComponentType getEchoComponent() {
		return (DefaultComponentType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_EchoComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEchoComponent(DefaultComponentType newEchoComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_EchoComponent(), newEchoComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEchoComponent(DefaultComponentType newEchoComponent) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_EchoComponent(), newEchoComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RmiContainerContextType getEjbContainer() {
		return (RmiContainerContextType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_EjbContainer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEjbContainer(RmiContainerContextType newEjbContainer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_EjbContainer(), newEjbContainer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEjbContainer(RmiContainerContextType newEjbContainer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_EjbContainer(), newEjbContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncryptionSecurityFilterType getEncryptionSecurityFilter() {
		return (EncryptionSecurityFilterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_EncryptionSecurityFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncryptionSecurityFilter(EncryptionSecurityFilterType newEncryptionSecurityFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_EncryptionSecurityFilter(), newEncryptionSecurityFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncryptionSecurityFilter(EncryptionSecurityFilterType newEncryptionSecurityFilter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_EncryptionSecurityFilter(), newEncryptionSecurityFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getEncryptTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_EncryptTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncryptTransformer(AbstractTransformerType newEncryptTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_EncryptTransformer(), newEncryptTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncryptTransformer(AbstractTransformerType newEncryptTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_EncryptTransformer(), newEncryptTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalEndpointType getEndpoint() {
		return (GlobalEndpointType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_Endpoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoint(GlobalEndpointType newEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_Endpoint(), newEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(GlobalEndpointType newEndpoint) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_Endpoint(), newEndpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointSelectorRouterType getEndpointSelectorRouter() {
		return (EndpointSelectorRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_EndpointSelectorRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpointSelectorRouter(EndpointSelectorRouterType newEndpointSelectorRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_EndpointSelectorRouter(), newEndpointSelectorRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointSelectorRouter(EndpointSelectorRouterType newEndpointSelectorRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_EndpointSelectorRouter(), newEndpointSelectorRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensibleEntryPointResolverSet getEntryPointResolverSet() {
		return (ExtensibleEntryPointResolverSet)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_EntryPointResolverSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEntryPointResolverSet(ExtensibleEntryPointResolverSet newEntryPointResolverSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_EntryPointResolverSet(), newEntryPointResolverSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntryPointResolverSet(ExtensibleEntryPointResolverSet newEntryPointResolverSet) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_EntryPointResolverSet(), newEntryPointResolverSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteringOutboundRouterType getExceptionBasedRouter() {
		return (FilteringOutboundRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionBasedRouter(FilteringOutboundRouterType newExceptionBasedRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter(), newExceptionBasedRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionBasedRouter(FilteringOutboundRouterType newExceptionBasedRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter(), newExceptionBasedRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFilterType getExceptionTypeFilter() {
		return (TypeFilterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ExceptionTypeFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionTypeFilter(TypeFilterType newExceptionTypeFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ExceptionTypeFilter(), newExceptionTypeFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionTypeFilter(TypeFilterType newExceptionTypeFilter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ExceptionTypeFilter(), newExceptionTypeFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefFilterType getFilter() {
		return (RefFilterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_Filter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(RefFilterType newFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_Filter(), newFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(RefFilterType newFilter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_Filter(), newFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteringOutboundRouterType getFilteringRouter() {
		return (FilteringOutboundRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilteringRouter(FilteringOutboundRouterType newFilteringRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter(), newFilteringRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilteringRouter(FilteringOutboundRouterType newFilteringRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter(), newFilteringRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForwardingCatchAllStrategyType getForwardingCatchAllStrategy() {
		return (ForwardingCatchAllStrategyType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ForwardingCatchAllStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForwardingCatchAllStrategy(ForwardingCatchAllStrategyType newForwardingCatchAllStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ForwardingCatchAllStrategy(), newForwardingCatchAllStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForwardingCatchAllStrategy(ForwardingCatchAllStrategyType newForwardingCatchAllStrategy) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ForwardingCatchAllStrategy(), newForwardingCatchAllStrategy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForwardingRouterType getForwardingRouter() {
		return (ForwardingRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ForwardingRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetForwardingRouter(ForwardingRouterType newForwardingRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ForwardingRouter(), newForwardingRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForwardingRouter(ForwardingRouterType newForwardingRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ForwardingRouter(), newForwardingRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getGzipCompressTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_GzipCompressTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGzipCompressTransformer(AbstractTransformerType newGzipCompressTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_GzipCompressTransformer(), newGzipCompressTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGzipCompressTransformer(AbstractTransformerType newGzipCompressTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_GzipCompressTransformer(), newGzipCompressTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getGzipUncompressTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_GzipUncompressTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGzipUncompressTransformer(AbstractTransformerType newGzipUncompressTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_GzipUncompressTransformer(), newGzipUncompressTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGzipUncompressTransformer(AbstractTransformerType newGzipUncompressTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_GzipUncompressTransformer(), newGzipUncompressTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getHexStringToByteArrayTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_HexStringToByteArrayTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHexStringToByteArrayTransformer(AbstractTransformerType newHexStringToByteArrayTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_HexStringToByteArrayTransformer(), newHexStringToByteArrayTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHexStringToByteArrayTransformer(AbstractTransformerType newHexStringToByteArrayTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_HexStringToByteArrayTransformer(), newHexStringToByteArrayTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocContainerContextType getHivemindContainer() {
		return (IocContainerContextType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_HivemindContainer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHivemindContainer(IocContainerContextType newHivemindContainer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_HivemindContainer(), newHivemindContainer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHivemindContainer(IocContainerContextType newHivemindContainer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_HivemindContainer(), newHivemindContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdempotentReceiverRouterType getIdempotentReceiverRouter() {
		return (IdempotentReceiverRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_IdempotentReceiverRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdempotentReceiverRouter(IdempotentReceiverRouterType newIdempotentReceiverRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_IdempotentReceiverRouter(), newIdempotentReceiverRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdempotentReceiverRouter(IdempotentReceiverRouterType newIdempotentReceiverRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_IdempotentReceiverRouter(), newIdempotentReceiverRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteredInboundRouterType getIdempotentSecureHashReceiverRouter() {
		return (FilteredInboundRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdempotentSecureHashReceiverRouter(FilteredInboundRouterType newIdempotentSecureHashReceiverRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(), newIdempotentSecureHashReceiverRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdempotentSecureHashReceiverRouter(FilteredInboundRouterType newIdempotentSecureHashReceiverRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(), newIdempotentSecureHashReceiverRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundEndpointType getInboundEndpoint() {
		return (InboundEndpointType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_InboundEndpoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInboundEndpoint(InboundEndpointType newInboundEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_InboundEndpoint(), newInboundEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInboundEndpoint(InboundEndpointType newInboundEndpoint) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_InboundEndpoint(), newInboundEndpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteredInboundRouterType getInboundPassThroughRouter() {
		return (FilteredInboundRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInboundPassThroughRouter(FilteredInboundRouterType newInboundPassThroughRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(), newInboundPassThroughRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInboundPassThroughRouter(FilteredInboundRouterType newInboundPassThroughRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(), newInboundPassThroughRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodType getIncludeEntryPoint() {
		return (MethodType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_IncludeEntryPoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludeEntryPoint(MethodType newIncludeEntryPoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_IncludeEntryPoint(), newIncludeEntryPoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeEntryPoint(MethodType newIncludeEntryPoint) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_IncludeEntryPoint(), newIncludeEntryPoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionManagerType getJbossTransactionManager() {
		return (TransactionManagerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_JbossTransactionManager(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJbossTransactionManager(TransactionManagerType newJbossTransactionManager, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_JbossTransactionManager(), newJbossTransactionManager, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJbossTransactionManager(TransactionManagerType newJbossTransactionManager) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_JbossTransactionManager(), newJbossTransactionManager);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseContainerContextType getJndiContainer() {
		return (BaseContainerContextType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_JndiContainer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJndiContainer(BaseContainerContextType newJndiContainer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_JndiContainer(), newJndiContainer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJndiContainer(BaseContainerContextType newJndiContainer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_JndiContainer(), newJndiContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionManagerType getJndiTransactionManager() {
		return (TransactionManagerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_JndiTransactionManager(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJndiTransactionManager(TransactionManagerType newJndiTransactionManager, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_JndiTransactionManager(), newJndiTransactionManager, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJndiTransactionManager(TransactionManagerType newJndiTransactionManager) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_JndiTransactionManager(), newJndiTransactionManager);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionManagerType getJrunTransactionManager() {
		return (TransactionManagerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_JrunTransactionManager(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJrunTransactionManager(TransactionManagerType newJrunTransactionManager, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_JrunTransactionManager(), newJrunTransactionManager, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJrunTransactionManager(TransactionManagerType newJrunTransactionManager) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_JrunTransactionManager(), newJrunTransactionManager);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensibleEntryPointResolverSet getLegacyEntryPointResolverSet() {
		return (ExtensibleEntryPointResolverSet)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_LegacyEntryPointResolverSet(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegacyEntryPointResolverSet(ExtensibleEntryPointResolverSet newLegacyEntryPointResolverSet, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_LegacyEntryPointResolverSet(), newLegacyEntryPointResolverSet, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegacyEntryPointResolverSet(ExtensibleEntryPointResolverSet newLegacyEntryPointResolverSet) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_LegacyEntryPointResolverSet(), newLegacyEntryPointResolverSet);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSplitterOutboundRouterType getListMessageSplitterRouter() {
		return (MessageSplitterOutboundRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ListMessageSplitterRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListMessageSplitterRouter(MessageSplitterOutboundRouterType newListMessageSplitterRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ListMessageSplitterRouter(), newListMessageSplitterRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListMessageSplitterRouter(MessageSplitterOutboundRouterType newListMessageSplitterRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ListMessageSplitterRouter(), newListMessageSplitterRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultComponentType getLogComponent() {
		return (DefaultComponentType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_LogComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLogComponent(DefaultComponentType newLogComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_LogComponent(), newLogComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogComponent(DefaultComponentType newLogComponent) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_LogComponent(), newLogComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggingCatchAllStrategyType getLoggingCatchAllStrategy() {
		return (LoggingCatchAllStrategyType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_LoggingCatchAllStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoggingCatchAllStrategy(LoggingCatchAllStrategyType newLoggingCatchAllStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_LoggingCatchAllStrategy(), newLoggingCatchAllStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoggingCatchAllStrategy(LoggingCatchAllStrategyType newLoggingCatchAllStrategy) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_LoggingCatchAllStrategy(), newLoggingCatchAllStrategy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPropertyExtractorType getMapPropertyExtractor() {
		return (AbstractPropertyExtractorType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_MapPropertyExtractor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapPropertyExtractor(AbstractPropertyExtractorType newMapPropertyExtractor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_MapPropertyExtractor(), newMapPropertyExtractor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapPropertyExtractor(AbstractPropertyExtractorType newMapPropertyExtractor) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_MapPropertyExtractor(), newMapPropertyExtractor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageChunkingAggregatorRouterType getMessageChunkingAggregatorRouter() {
		return (MessageChunkingAggregatorRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingAggregatorRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageChunkingAggregatorRouter(MessageChunkingAggregatorRouterType newMessageChunkingAggregatorRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingAggregatorRouter(), newMessageChunkingAggregatorRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageChunkingAggregatorRouter(MessageChunkingAggregatorRouterType newMessageChunkingAggregatorRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingAggregatorRouter(), newMessageChunkingAggregatorRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkingRouterType getMessageChunkingRouter() {
		return (ChunkingRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageChunkingRouter(ChunkingRouterType newMessageChunkingRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingRouter(), newMessageChunkingRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageChunkingRouter(ChunkingRouterType newMessageChunkingRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingRouter(), newMessageChunkingRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagePropertiesTransformerType getMessagePropertiesTransformer() {
		return (MessagePropertiesTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertiesTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessagePropertiesTransformer(MessagePropertiesTransformerType newMessagePropertiesTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertiesTransformer(), newMessagePropertiesTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessagePropertiesTransformer(MessagePropertiesTransformerType newMessagePropertiesTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertiesTransformer(), newMessagePropertiesTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPropertyExtractorType getMessagePropertyExtractor() {
		return (AbstractPropertyExtractorType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyExtractor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessagePropertyExtractor(AbstractPropertyExtractorType newMessagePropertyExtractor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyExtractor(), newMessagePropertyExtractor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessagePropertyExtractor(AbstractPropertyExtractorType newMessagePropertyExtractor) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyExtractor(), newMessagePropertyExtractor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternFilterType getMessagePropertyFilter() {
		return (PatternFilterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessagePropertyFilter(PatternFilterType newMessagePropertyFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyFilter(), newMessagePropertyFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessagePropertyFilter(PatternFilterType newMessagePropertyFilter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyFilter(), newMessagePropertyFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodEntryPointResolverType getMethodEntryPointResolver() {
		return (MethodEntryPointResolverType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_MethodEntryPointResolver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMethodEntryPointResolver(MethodEntryPointResolverType newMethodEntryPointResolver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_MethodEntryPointResolver(), newMethodEntryPointResolver, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethodEntryPointResolver(MethodEntryPointResolverType newMethodEntryPointResolver) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_MethodEntryPointResolver(), newMethodEntryPointResolver);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultModelType getModel() {
		return (DefaultModelType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_Model(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModel(DefaultModelType newModel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_Model(), newModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(DefaultModelType newModel) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_Model(), newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MuleType getMule() {
		return (MuleType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_Mule(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMule(MuleType newMule, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_Mule(), newMule, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMule(MuleType newMule) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_Mule(), newMule);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MuleUnsafeType getMuleUnsafe() {
		return (MuleUnsafeType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_MuleUnsafe(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMuleUnsafe(MuleUnsafeType newMuleUnsafe, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_MuleUnsafe(), newMuleUnsafe, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMuleUnsafe(MuleUnsafeType newMuleUnsafe) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_MuleUnsafe(), newMuleUnsafe);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteringOutboundRouterType getMulticastingRouter() {
		return (FilteringOutboundRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMulticastingRouter(FilteringOutboundRouterType newMulticastingRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter(), newMulticastingRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMulticastingRouter(FilteringOutboundRouterType newMulticastingRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter(), newMulticastingRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getNoActionTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_NoActionTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoActionTransformer(AbstractTransformerType newNoActionTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_NoActionTransformer(), newNoActionTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoActionTransformer(AbstractTransformerType newNoActionTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_NoActionTransformer(), newNoActionTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplexEntryPointResolverType getNoArgumentsEntryPointResolver() {
		return (ComplexEntryPointResolverType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_NoArgumentsEntryPointResolver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoArgumentsEntryPointResolver(ComplexEntryPointResolverType newNoArgumentsEntryPointResolver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_NoArgumentsEntryPointResolver(), newNoArgumentsEntryPointResolver, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoArgumentsEntryPointResolver(ComplexEntryPointResolverType newNoArgumentsEntryPointResolver) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_NoArgumentsEntryPointResolver(), newNoArgumentsEntryPointResolver);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitaryFilterType getNotFilter() {
		return (UnitaryFilterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_NotFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotFilter(UnitaryFilterType newNotFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_NotFilter(), newNotFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotFilter(UnitaryFilterType newNotFilter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_NotFilter(), newNotFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefineNotificationType getNotification() {
		return (DefineNotificationType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_Notification(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotification(DefineNotificationType newNotification, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_Notification(), newNotification, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotification(DefineNotificationType newNotification) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_Notification(), newNotification);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultComponentType getNullComponent() {
		return (DefaultComponentType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_NullComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNullComponent(DefaultComponentType newNullComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_NullComponent(), newNullComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullComponent(DefaultComponentType newNullComponent) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_NullComponent(), newNullComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getObjectToByteArrayTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ObjectToByteArrayTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectToByteArrayTransformer(AbstractTransformerType newObjectToByteArrayTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ObjectToByteArrayTransformer(), newObjectToByteArrayTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectToByteArrayTransformer(AbstractTransformerType newObjectToByteArrayTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ObjectToByteArrayTransformer(), newObjectToByteArrayTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getObjectToStringTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ObjectToStringTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectToStringTransformer(AbstractTransformerType newObjectToStringTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ObjectToStringTransformer(), newObjectToStringTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectToStringTransformer(AbstractTransformerType newObjectToStringTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ObjectToStringTransformer(), newObjectToStringTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionFilterType getOrFilter() {
		return (CollectionFilterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_OrFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrFilter(CollectionFilterType newOrFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_OrFilter(), newOrFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrFilter(CollectionFilterType newOrFilter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_OrFilter(), newOrFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundEndpointType getOutboundEndpoint() {
		return (OutboundEndpointType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_OutboundEndpoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutboundEndpoint(OutboundEndpointType newOutboundEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_OutboundEndpoint(), newOutboundEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutboundEndpoint(OutboundEndpointType newOutboundEndpoint) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_OutboundEndpoint(), newOutboundEndpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundRouterType getOutboundPassThroughRouter() {
		return (OutboundRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutboundPassThroughRouter(OutboundRouterType newOutboundPassThroughRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter(), newOutboundPassThroughRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutboundPassThroughRouter(OutboundRouterType newOutboundPassThroughRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter(), newOutboundPassThroughRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultComponentType getPassThroughComponent() {
		return (DefaultComponentType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_PassThroughComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPassThroughComponent(DefaultComponentType newPassThroughComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_PassThroughComponent(), newPassThroughComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassThroughComponent(DefaultComponentType newPassThroughComponent) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_PassThroughComponent(), newPassThroughComponent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPropertyExtractorType getPayloadPropertyExtractor() {
		return (AbstractPropertyExtractorType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_PayloadPropertyExtractor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayloadPropertyExtractor(AbstractPropertyExtractorType newPayloadPropertyExtractor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_PayloadPropertyExtractor(), newPayloadPropertyExtractor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayloadPropertyExtractor(AbstractPropertyExtractorType newPayloadPropertyExtractor) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_PayloadPropertyExtractor(), newPayloadPropertyExtractor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFilterType getPayloadTypeFilter() {
		return (TypeFilterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_PayloadTypeFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPayloadTypeFilter(TypeFilterType newPayloadTypeFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_PayloadTypeFilter(), newPayloadTypeFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPayloadTypeFilter(TypeFilterType newPayloadTypeFilter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_PayloadTypeFilter(), newPayloadTypeFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocContainerContextType getPicoContainer() {
		return (IocContainerContextType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_PicoContainer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPicoContainer(IocContainerContextType newPicoContainer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_PicoContainer(), newPicoContainer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPicoContainer(IocContainerContextType newPicoContainer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_PicoContainer(), newPicoContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocContainerContextType getPlexusContainer() {
		return (IocContainerContextType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_PlexusContainer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlexusContainer(IocContainerContextType newPlexusContainer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_PlexusContainer(), newPlexusContainer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlexusContainer(IocContainerContextType newPlexusContainer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_PlexusContainer(), newPlexusContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PooledObjectFactoryType getPooledObject() {
		return (PooledObjectFactoryType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_PooledObject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPooledObject(PooledObjectFactoryType newPooledObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_PooledObject(), newPooledObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPooledObject(PooledObjectFactoryType newPooledObject) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_PooledObject(), newPooledObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolingProfileType getPoolingProfile() {
		return (PoolingProfileType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_PoolingProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPoolingProfile(PoolingProfileType newPoolingProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_PoolingProfile(), newPoolingProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoolingProfile(PoolingProfileType newPoolingProfile) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_PoolingProfile(), newPoolingProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType getProperties() {
		return (MapType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_Properties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(MapType newProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_Properties(), newProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(MapType newProperties) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_Properties(), newProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesContainerContextType getPropertiesContainer() {
		return (PropertiesContainerContextType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_PropertiesContainer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertiesContainer(PropertiesContainerContextType newPropertiesContainer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_PropertiesContainer(), newPropertiesContainer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertiesContainer(PropertiesContainerContextType newPropertiesContainer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_PropertiesContainer(), newPropertiesContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyEntryPointResolverType getPropertyEntryPointResolver() {
		return (PropertyEntryPointResolverType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_PropertyEntryPointResolver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPropertyEntryPointResolver(PropertyEntryPointResolverType newPropertyEntryPointResolver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_PropertyEntryPointResolver(), newPropertyEntryPointResolver, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyEntryPointResolver(PropertyEntryPointResolverType newPropertyEntryPointResolver) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_PropertyEntryPointResolver(), newPropertyEntryPointResolver);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrototypeObjectFactoryType getPrototypeObject() {
		return (PrototypeObjectFactoryType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_PrototypeObject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrototypeObject(PrototypeObjectFactoryType newPrototypeObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_PrototypeObject(), newPrototypeObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrototypeObject(PrototypeObjectFactoryType newPrototypeObject) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_PrototypeObject(), newPrototypeObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueueProfileType getQueueProfile() {
		return (QueueProfileType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_QueueProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueueProfile(QueueProfileType newQueueProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_QueueProfile(), newQueueProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueueProfile(QueueProfileType newQueueProfile) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_QueueProfile(), newQueueProfile);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflectionEntryPointResolverType getReflectionEntryPointResolver() {
		return (ReflectionEntryPointResolverType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ReflectionEntryPointResolver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReflectionEntryPointResolver(ReflectionEntryPointResolverType newReflectionEntryPointResolver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ReflectionEntryPointResolver(), newReflectionEntryPointResolver, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReflectionEntryPointResolver(ReflectionEntryPointResolverType newReflectionEntryPointResolver) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ReflectionEntryPointResolver(), newReflectionEntryPointResolver);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternFilterType getRegexFilter() {
		return (PatternFilterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_RegexFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegexFilter(PatternFilterType newRegexFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_RegexFilter(), newRegexFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegexFilter(PatternFilterType newRegexFilter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_RegexFilter(), newRegexFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionManagerType getResinTransactionManager() {
		return (TransactionManagerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ResinTransactionManager(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResinTransactionManager(TransactionManagerType newResinTransactionManager, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ResinTransactionManager(), newResinTransactionManager, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResinTransactionManager(TransactionManagerType newResinTransactionManager) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ResinTransactionManager(), newResinTransactionManager);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetryConnectionStrategyType getRetryConnectionStrategy() {
		return (RetryConnectionStrategyType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_RetryConnectionStrategy(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetryConnectionStrategy(RetryConnectionStrategyType newRetryConnectionStrategy, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_RetryConnectionStrategy(), newRetryConnectionStrategy, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetryConnectionStrategy(RetryConnectionStrategyType newRetryConnectionStrategy) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_RetryConnectionStrategy(), newRetryConnectionStrategy);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RmiContainerContextType getRmiContainer() {
		return (RmiContainerContextType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_RmiContainer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRmiContainer(RmiContainerContextType newRmiContainer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_RmiContainer(), newRmiContainer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRmiContainer(RmiContainerContextType newRmiContainer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_RmiContainer(), newRmiContainer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityManagerType getSecurityManager() {
		return (SecurityManagerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_SecurityManager(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityManager(SecurityManagerType newSecurityManager, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_SecurityManager(), newSecurityManager, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityManager(SecurityManagerType newSecurityManager) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_SecurityManager(), newSecurityManager);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SedaModelType getSedaModel() {
		return (SedaModelType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_SedaModel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSedaModel(SedaModelType newSedaModel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_SedaModel(), newSedaModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSedaModel(SedaModelType newSedaModel) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_SedaModel(), newSedaModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectiveConsumerRouterType getSelectiveConsumerRouter() {
		return (SelectiveConsumerRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_SelectiveConsumerRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelectiveConsumerRouter(SelectiveConsumerRouterType newSelectiveConsumerRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_SelectiveConsumerRouter(), newSelectiveConsumerRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectiveConsumerRouter(SelectiveConsumerRouterType newSelectiveConsumerRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_SelectiveConsumerRouter(), newSelectiveConsumerRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getSerializableToByteArrayTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_SerializableToByteArrayTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSerializableToByteArrayTransformer(AbstractTransformerType newSerializableToByteArrayTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_SerializableToByteArrayTransformer(), newSerializableToByteArrayTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerializableToByteArrayTransformer(AbstractTransformerType newSerializableToByteArrayTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_SerializableToByteArrayTransformer(), newSerializableToByteArrayTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SedaServiceType getService() {
		return (SedaServiceType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_Service(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(SedaServiceType newService, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_Service(), newService, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(SedaServiceType newService) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_Service(), newService);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsyncReplyRouterType getSingleAsyncReplyRouter() {
		return (AsyncReplyRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_SingleAsyncReplyRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleAsyncReplyRouter(AsyncReplyRouterType newSingleAsyncReplyRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_SingleAsyncReplyRouter(), newSingleAsyncReplyRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleAsyncReplyRouter(AsyncReplyRouterType newSingleAsyncReplyRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_SingleAsyncReplyRouter(), newSingleAsyncReplyRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonObjectFactoryType getSingletonObject() {
		return (SingletonObjectFactoryType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_SingletonObject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingletonObject(SingletonObjectFactoryType newSingletonObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_SingletonObject(), newSingletonObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingletonObject(SingletonObjectFactoryType newSingletonObject) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_SingletonObject(), newSingletonObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpringBeanLookupType getSpringObject() {
		return (SpringBeanLookupType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_SpringObject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpringObject(SpringBeanLookupType newSpringObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_SpringObject(), newSpringObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpringObject(SpringBeanLookupType newSpringObject) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_SpringObject(), newSpringObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticRecipientListRouterType getStaticRecipientListRouter() {
		return (StaticRecipientListRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_StaticRecipientListRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticRecipientListRouter(StaticRecipientListRouterType newStaticRecipientListRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_StaticRecipientListRouter(), newStaticRecipientListRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticRecipientListRouter(StaticRecipientListRouterType newStaticRecipientListRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_StaticRecipientListRouter(), newStaticRecipientListRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getStringToByteArrayTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_StringToByteArrayTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStringToByteArrayTransformer(AbstractTransformerType newStringToByteArrayTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_StringToByteArrayTransformer(), newStringToByteArrayTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringToByteArrayTransformer(AbstractTransformerType newStringToByteArrayTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_StringToByteArrayTransformer(), newStringToByteArrayTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteringOutboundRouterType getTemplateEndpointRouter() {
		return (FilteringOutboundRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateEndpointRouter(FilteringOutboundRouterType newTemplateEndpointRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter(), newTemplateEndpointRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateEndpointRouter(FilteringOutboundRouterType newTemplateEndpointRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter(), newTemplateEndpointRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefTransformerType getTransformer() {
		return (RefTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_Transformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformer(RefTransformerType newTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_Transformer(), newTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformer(RefTransformerType newTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_Transformer(), newTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getUcDecoderTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_UcDecoderTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUcDecoderTransformer(AbstractTransformerType newUcDecoderTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_UcDecoderTransformer(), newUcDecoderTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUcDecoderTransformer(AbstractTransformerType newUcDecoderTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_UcDecoderTransformer(), newUcDecoderTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getUcEncoderTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_UcEncoderTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUcEncoderTransformer(AbstractTransformerType newUcEncoderTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_UcEncoderTransformer(), newUcEncoderTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUcEncoderTransformer(AbstractTransformerType newUcEncoderTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_UcEncoderTransformer(), newUcEncoderTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getUuDecoderTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_UuDecoderTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUuDecoderTransformer(AbstractTransformerType newUuDecoderTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_UuDecoderTransformer(), newUuDecoderTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuDecoderTransformer(AbstractTransformerType newUuDecoderTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_UuDecoderTransformer(), newUuDecoderTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getUuEncoderTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_UuEncoderTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUuEncoderTransformer(AbstractTransformerType newUuEncoderTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_UuEncoderTransformer(), newUuEncoderTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUuEncoderTransformer(AbstractTransformerType newUuEncoderTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_UuEncoderTransformer(), newUuEncoderTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JndiTransactionManagerType getWeblogicTransactionManager() {
		return (JndiTransactionManagerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_WeblogicTransactionManager(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWeblogicTransactionManager(JndiTransactionManagerType newWeblogicTransactionManager, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_WeblogicTransactionManager(), newWeblogicTransactionManager, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeblogicTransactionManager(JndiTransactionManagerType newWeblogicTransactionManager) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_WeblogicTransactionManager(), newWeblogicTransactionManager);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionManagerType getWebsphereTransactionManager() {
		return (TransactionManagerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_WebsphereTransactionManager(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWebsphereTransactionManager(TransactionManagerType newWebsphereTransactionManager, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_WebsphereTransactionManager(), newWebsphereTransactionManager, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWebsphereTransactionManager(TransactionManagerType newWebsphereTransactionManager) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_WebsphereTransactionManager(), newWebsphereTransactionManager);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WildcardFilterType getWildcardFilter() {
		return (WildcardFilterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_WildcardFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWildcardFilter(WildcardFilterType newWildcardFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_WildcardFilter(), newWildcardFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWildcardFilter(WildcardFilterType newWildcardFilter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_WildcardFilter(), newWildcardFilter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireTapRouterType getWireTapRouter() {
		return (WireTapRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_WireTapRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWireTapRouter(WireTapRouterType newWireTapRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_WireTapRouter(), newWireTapRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWireTapRouter(WireTapRouterType newWireTapRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_WireTapRouter(), newWireTapRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getXmlEntityDecoderTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityDecoderTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlEntityDecoderTransformer(AbstractTransformerType newXmlEntityDecoderTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityDecoderTransformer(), newXmlEntityDecoderTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlEntityDecoderTransformer(AbstractTransformerType newXmlEntityDecoderTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityDecoderTransformer(), newXmlEntityDecoderTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getXmlEntityEncoderTransformer() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityEncoderTransformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlEntityEncoderTransformer(AbstractTransformerType newXmlEntityEncoderTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityEncoderTransformer(), newXmlEntityEncoderTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmlEntityEncoderTransformer(AbstractTransformerType newXmlEntityEncoderTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityEncoderTransformer(), newXmlEntityEncoderTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_ASYNC_REPLY_ROUTER:
				return basicSetAbstractAsyncReplyRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_BINDING:
				return basicSetAbstractBinding(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_CATCH_ALL_STRATEGY:
				return basicSetAbstractCatchAllStrategy(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_COMPONENT:
				return basicSetAbstractComponent(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_COMPONENT_THREADING_PROFILE:
				return basicSetAbstractComponentThreadingProfile(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_CONNECTION_STRATEGY:
				return basicSetAbstractConnectionStrategy(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_CONNECTOR:
				return basicSetAbstractConnector(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_DEFINE_NOTIFICATION:
				return basicSetAbstractDefineNotification(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_DISABLE_NOTIFICATION:
				return basicSetAbstractDisableNotification(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_ENTRY_POINT_RESOLVER:
				return basicSetAbstractEntryPointResolver(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_ENTRY_POINT_RESOLVER_SET:
				return basicSetAbstractEntryPointResolverSet(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_EXCEPTION_STRATEGY:
				return basicSetAbstractExceptionStrategy(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_EXTENSION:
				return basicSetAbstractExtension(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_FILTER:
				return basicSetAbstractFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_GLOBAL_ENDPOINT:
				return basicSetAbstractGlobalEndpoint(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_INBOUND_ENDPOINT:
				return basicSetAbstractInboundEndpoint(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_INBOUND_ROUTER:
				return basicSetAbstractInboundRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_MODEL:
				return basicSetAbstractModel(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_OBJECT_FACTORY:
				return basicSetAbstractObjectFactory(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_OUTBOUND_ENDPOINT:
				return basicSetAbstractOutboundEndpoint(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_OUTBOUND_ROUTER:
				return basicSetAbstractOutboundRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_POOLING_PROFILE:
				return basicSetAbstractPoolingProfile(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_PROPERTY_EXTRACTOR:
				return basicSetAbstractPropertyExtractor(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_QUEUE_PROFILE:
				return basicSetAbstractQueueProfile(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_SECURITY_FILTER:
				return basicSetAbstractSecurityFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_SECURITY_MANAGER:
				return basicSetAbstractSecurityManager(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_SERVICE:
				return basicSetAbstractService(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_STORAGE:
				return basicSetAbstractStorage(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION:
				return basicSetAbstractTransaction(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION_MANAGER:
				return basicSetAbstractTransactionManager(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSFORMER:
				return basicSetAbstractTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__AND_FILTER:
				return basicSetAndFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__APPEND_STRING_TRANSFORMER:
				return basicSetAppendStringTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ARRAY_ENTRY_POINT_RESOLVER:
				return basicSetArrayEntryPointResolver(null, msgs);
			case CorePackage.DOCUMENT_ROOT__BASE64_DECODER_TRANSFORMER:
				return basicSetBase64DecoderTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__BASE64_ENCODER_TRANSFORMER:
				return basicSetBase64EncoderTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__BEAN_PROPERTY_EXTRACTOR:
				return basicSetBeanPropertyExtractor(null, msgs);
			case CorePackage.DOCUMENT_ROOT__BRIDGE_COMPONENT:
				return basicSetBridgeComponent(null, msgs);
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_HEX_STRING_TRANSFORMER:
				return basicSetByteArrayToHexStringTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_OBJECT_TRANSFORMER:
				return basicSetByteArrayToObjectTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_SERIALIZABLE_TRANSFORMER:
				return basicSetByteArrayToSerializableTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_STRING_TRANSFORMER:
				return basicSetByteArrayToStringTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CALLABLE_ENTRY_POINT_RESOLVER:
				return basicSetCallableEntryPointResolver(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CHAINING_ROUTER:
				return basicSetChainingRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__COMPONENT:
				return basicSetComponent(null, msgs);
			case CorePackage.DOCUMENT_ROOT__COMPONENT_THREADING_PROFILE:
				return basicSetComponentThreadingProfile(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_EXTRACTOR:
				return basicSetCorrelationPropertyExtractor(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CORRELATION_RESEQUENCER_ROUTER:
				return basicSetCorrelationResequencerRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ASYNC_REPLY_ROUTER:
				return basicSetCustomAsyncReplyRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CATCH_ALL_STRATEGY:
				return basicSetCustomCatchAllStrategy(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTION_STRATEGY:
				return basicSetCustomConnectionStrategy(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTOR:
				return basicSetCustomConnector(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONTAINER:
				return basicSetCustomContainer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CORRELATION_AGGREGATOR_ROUTER:
				return basicSetCustomCorrelationAggregatorRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ENTRY_POINT_RESOLVER:
				return basicSetCustomEntryPointResolver(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ENTRY_POINT_RESOLVER_SET:
				return basicSetCustomEntryPointResolverSet(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_EXCEPTION_STRATEGY:
				return basicSetCustomExceptionStrategy(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_FILTER:
				return basicSetCustomFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_FORWARDING_CATCH_ALL_STRATEGY:
				return basicSetCustomForwardingCatchAllStrategy(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_INBOUND_ROUTER:
				return basicSetCustomInboundRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_OUTBOUND_ROUTER:
				return basicSetCustomOutboundRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_PROPERTY_EXTRACTOR:
				return basicSetCustomPropertyExtractor(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION:
				return basicSetCustomTransaction(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION_MANAGER:
				return basicSetCustomTransactionManager(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSFORMER:
				return basicSetCustomTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__DECRYPT_TRANSFORMER:
				return basicSetDecryptTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__DEFAULT_CONNECTOR_EXCEPTION_STRATEGY:
				return basicSetDefaultConnectorExceptionStrategy(null, msgs);
			case CorePackage.DOCUMENT_ROOT__DEFAULT_SERVICE_EXCEPTION_STRATEGY:
				return basicSetDefaultServiceExceptionStrategy(null, msgs);
			case CorePackage.DOCUMENT_ROOT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case CorePackage.DOCUMENT_ROOT__DISABLE_NOTIFICATION:
				return basicSetDisableNotification(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ECHO_COMPONENT:
				return basicSetEchoComponent(null, msgs);
			case CorePackage.DOCUMENT_ROOT__EJB_CONTAINER:
				return basicSetEjbContainer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ENCRYPTION_SECURITY_FILTER:
				return basicSetEncryptionSecurityFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ENCRYPT_TRANSFORMER:
				return basicSetEncryptTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ENDPOINT:
				return basicSetEndpoint(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ENDPOINT_SELECTOR_ROUTER:
				return basicSetEndpointSelectorRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ENTRY_POINT_RESOLVER_SET:
				return basicSetEntryPointResolverSet(null, msgs);
			case CorePackage.DOCUMENT_ROOT__EXCEPTION_BASED_ROUTER:
				return basicSetExceptionBasedRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__EXCEPTION_TYPE_FILTER:
				return basicSetExceptionTypeFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__FILTER:
				return basicSetFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__FILTERING_ROUTER:
				return basicSetFilteringRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__FORWARDING_CATCH_ALL_STRATEGY:
				return basicSetForwardingCatchAllStrategy(null, msgs);
			case CorePackage.DOCUMENT_ROOT__FORWARDING_ROUTER:
				return basicSetForwardingRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__GZIP_COMPRESS_TRANSFORMER:
				return basicSetGzipCompressTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__GZIP_UNCOMPRESS_TRANSFORMER:
				return basicSetGzipUncompressTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__HEX_STRING_TO_BYTE_ARRAY_TRANSFORMER:
				return basicSetHexStringToByteArrayTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__HIVEMIND_CONTAINER:
				return basicSetHivemindContainer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__IDEMPOTENT_RECEIVER_ROUTER:
				return basicSetIdempotentReceiverRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__IDEMPOTENT_SECURE_HASH_RECEIVER_ROUTER:
				return basicSetIdempotentSecureHashReceiverRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__INBOUND_ENDPOINT:
				return basicSetInboundEndpoint(null, msgs);
			case CorePackage.DOCUMENT_ROOT__INBOUND_PASS_THROUGH_ROUTER:
				return basicSetInboundPassThroughRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__INCLUDE_ENTRY_POINT:
				return basicSetIncludeEntryPoint(null, msgs);
			case CorePackage.DOCUMENT_ROOT__JBOSS_TRANSACTION_MANAGER:
				return basicSetJbossTransactionManager(null, msgs);
			case CorePackage.DOCUMENT_ROOT__JNDI_CONTAINER:
				return basicSetJndiContainer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__JNDI_TRANSACTION_MANAGER:
				return basicSetJndiTransactionManager(null, msgs);
			case CorePackage.DOCUMENT_ROOT__JRUN_TRANSACTION_MANAGER:
				return basicSetJrunTransactionManager(null, msgs);
			case CorePackage.DOCUMENT_ROOT__LEGACY_ENTRY_POINT_RESOLVER_SET:
				return basicSetLegacyEntryPointResolverSet(null, msgs);
			case CorePackage.DOCUMENT_ROOT__LIST_MESSAGE_SPLITTER_ROUTER:
				return basicSetListMessageSplitterRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__LOG_COMPONENT:
				return basicSetLogComponent(null, msgs);
			case CorePackage.DOCUMENT_ROOT__LOGGING_CATCH_ALL_STRATEGY:
				return basicSetLoggingCatchAllStrategy(null, msgs);
			case CorePackage.DOCUMENT_ROOT__MAP_PROPERTY_EXTRACTOR:
				return basicSetMapPropertyExtractor(null, msgs);
			case CorePackage.DOCUMENT_ROOT__MESSAGE_CHUNKING_AGGREGATOR_ROUTER:
				return basicSetMessageChunkingAggregatorRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__MESSAGE_CHUNKING_ROUTER:
				return basicSetMessageChunkingRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTIES_TRANSFORMER:
				return basicSetMessagePropertiesTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_EXTRACTOR:
				return basicSetMessagePropertyExtractor(null, msgs);
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_FILTER:
				return basicSetMessagePropertyFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__METHOD_ENTRY_POINT_RESOLVER:
				return basicSetMethodEntryPointResolver(null, msgs);
			case CorePackage.DOCUMENT_ROOT__MODEL:
				return basicSetModel(null, msgs);
			case CorePackage.DOCUMENT_ROOT__MULE:
				return basicSetMule(null, msgs);
			case CorePackage.DOCUMENT_ROOT__MULE_UNSAFE:
				return basicSetMuleUnsafe(null, msgs);
			case CorePackage.DOCUMENT_ROOT__MULTICASTING_ROUTER:
				return basicSetMulticastingRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__NO_ACTION_TRANSFORMER:
				return basicSetNoActionTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__NO_ARGUMENTS_ENTRY_POINT_RESOLVER:
				return basicSetNoArgumentsEntryPointResolver(null, msgs);
			case CorePackage.DOCUMENT_ROOT__NOT_FILTER:
				return basicSetNotFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__NOTIFICATION:
				return basicSetNotification(null, msgs);
			case CorePackage.DOCUMENT_ROOT__NULL_COMPONENT:
				return basicSetNullComponent(null, msgs);
			case CorePackage.DOCUMENT_ROOT__OBJECT_TO_BYTE_ARRAY_TRANSFORMER:
				return basicSetObjectToByteArrayTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__OBJECT_TO_STRING_TRANSFORMER:
				return basicSetObjectToStringTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__OR_FILTER:
				return basicSetOrFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__OUTBOUND_ENDPOINT:
				return basicSetOutboundEndpoint(null, msgs);
			case CorePackage.DOCUMENT_ROOT__OUTBOUND_PASS_THROUGH_ROUTER:
				return basicSetOutboundPassThroughRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__PASS_THROUGH_COMPONENT:
				return basicSetPassThroughComponent(null, msgs);
			case CorePackage.DOCUMENT_ROOT__PAYLOAD_PROPERTY_EXTRACTOR:
				return basicSetPayloadPropertyExtractor(null, msgs);
			case CorePackage.DOCUMENT_ROOT__PAYLOAD_TYPE_FILTER:
				return basicSetPayloadTypeFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__PICO_CONTAINER:
				return basicSetPicoContainer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__PLEXUS_CONTAINER:
				return basicSetPlexusContainer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__POOLED_OBJECT:
				return basicSetPooledObject(null, msgs);
			case CorePackage.DOCUMENT_ROOT__POOLING_PROFILE:
				return basicSetPoolingProfile(null, msgs);
			case CorePackage.DOCUMENT_ROOT__PROPERTIES:
				return basicSetProperties(null, msgs);
			case CorePackage.DOCUMENT_ROOT__PROPERTIES_CONTAINER:
				return basicSetPropertiesContainer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__PROPERTY_ENTRY_POINT_RESOLVER:
				return basicSetPropertyEntryPointResolver(null, msgs);
			case CorePackage.DOCUMENT_ROOT__PROTOTYPE_OBJECT:
				return basicSetPrototypeObject(null, msgs);
			case CorePackage.DOCUMENT_ROOT__QUEUE_PROFILE:
				return basicSetQueueProfile(null, msgs);
			case CorePackage.DOCUMENT_ROOT__REFLECTION_ENTRY_POINT_RESOLVER:
				return basicSetReflectionEntryPointResolver(null, msgs);
			case CorePackage.DOCUMENT_ROOT__REGEX_FILTER:
				return basicSetRegexFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__RESIN_TRANSACTION_MANAGER:
				return basicSetResinTransactionManager(null, msgs);
			case CorePackage.DOCUMENT_ROOT__RETRY_CONNECTION_STRATEGY:
				return basicSetRetryConnectionStrategy(null, msgs);
			case CorePackage.DOCUMENT_ROOT__RMI_CONTAINER:
				return basicSetRmiContainer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__SECURITY_MANAGER:
				return basicSetSecurityManager(null, msgs);
			case CorePackage.DOCUMENT_ROOT__SEDA_MODEL:
				return basicSetSedaModel(null, msgs);
			case CorePackage.DOCUMENT_ROOT__SELECTIVE_CONSUMER_ROUTER:
				return basicSetSelectiveConsumerRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__SERIALIZABLE_TO_BYTE_ARRAY_TRANSFORMER:
				return basicSetSerializableToByteArrayTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__SERVICE:
				return basicSetService(null, msgs);
			case CorePackage.DOCUMENT_ROOT__SINGLE_ASYNC_REPLY_ROUTER:
				return basicSetSingleAsyncReplyRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__SINGLETON_OBJECT:
				return basicSetSingletonObject(null, msgs);
			case CorePackage.DOCUMENT_ROOT__SPRING_OBJECT:
				return basicSetSpringObject(null, msgs);
			case CorePackage.DOCUMENT_ROOT__STATIC_RECIPIENT_LIST_ROUTER:
				return basicSetStaticRecipientListRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__STRING_TO_BYTE_ARRAY_TRANSFORMER:
				return basicSetStringToByteArrayTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TEMPLATE_ENDPOINT_ROUTER:
				return basicSetTemplateEndpointRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER:
				return basicSetTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__UC_DECODER_TRANSFORMER:
				return basicSetUcDecoderTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__UC_ENCODER_TRANSFORMER:
				return basicSetUcEncoderTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__UU_DECODER_TRANSFORMER:
				return basicSetUuDecoderTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__UU_ENCODER_TRANSFORMER:
				return basicSetUuEncoderTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__WEBLOGIC_TRANSACTION_MANAGER:
				return basicSetWeblogicTransactionManager(null, msgs);
			case CorePackage.DOCUMENT_ROOT__WEBSPHERE_TRANSACTION_MANAGER:
				return basicSetWebsphereTransactionManager(null, msgs);
			case CorePackage.DOCUMENT_ROOT__WILDCARD_FILTER:
				return basicSetWildcardFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__WIRE_TAP_ROUTER:
				return basicSetWireTapRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__XML_ENTITY_DECODER_TRANSFORMER:
				return basicSetXmlEntityDecoderTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__XML_ENTITY_ENCODER_TRANSFORMER:
				return basicSetXmlEntityEncoderTransformer(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_ASYNC_REPLY_ROUTER:
				return getAbstractAsyncReplyRouter();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_BINDING:
				return getAbstractBinding();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_CATCH_ALL_STRATEGY:
				return getAbstractCatchAllStrategy();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_COMPONENT:
				return getAbstractComponent();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_COMPONENT_THREADING_PROFILE:
				return getAbstractComponentThreadingProfile();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_CONNECTION_STRATEGY:
				return getAbstractConnectionStrategy();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_CONNECTOR:
				return getAbstractConnector();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_DEFINE_NOTIFICATION:
				return getAbstractDefineNotification();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_DISABLE_NOTIFICATION:
				return getAbstractDisableNotification();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_ENTRY_POINT_RESOLVER:
				return getAbstractEntryPointResolver();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_ENTRY_POINT_RESOLVER_SET:
				return getAbstractEntryPointResolverSet();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_EXCEPTION_STRATEGY:
				return getAbstractExceptionStrategy();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_EXTENSION:
				return getAbstractExtension();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_FILTER:
				return getAbstractFilter();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_GLOBAL_ENDPOINT:
				return getAbstractGlobalEndpoint();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_INBOUND_ENDPOINT:
				return getAbstractInboundEndpoint();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_INBOUND_ROUTER:
				return getAbstractInboundRouter();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_MODEL:
				return getAbstractModel();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_OBJECT_FACTORY:
				return getAbstractObjectFactory();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_OUTBOUND_ENDPOINT:
				return getAbstractOutboundEndpoint();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_OUTBOUND_ROUTER:
				return getAbstractOutboundRouter();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_POOLING_PROFILE:
				return getAbstractPoolingProfile();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_PROPERTY_EXTRACTOR:
				return getAbstractPropertyExtractor();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_QUEUE_PROFILE:
				return getAbstractQueueProfile();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_SECURITY_FILTER:
				return getAbstractSecurityFilter();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_SECURITY_MANAGER:
				return getAbstractSecurityManager();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_SERVICE:
				return getAbstractService();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_STORAGE:
				return getAbstractStorage();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION:
				return getAbstractTransaction();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION_MANAGER:
				return getAbstractTransactionManager();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSFORMER:
				return getAbstractTransformer();
			case CorePackage.DOCUMENT_ROOT__AND_FILTER:
				return getAndFilter();
			case CorePackage.DOCUMENT_ROOT__APPEND_STRING_TRANSFORMER:
				return getAppendStringTransformer();
			case CorePackage.DOCUMENT_ROOT__ARRAY_ENTRY_POINT_RESOLVER:
				return getArrayEntryPointResolver();
			case CorePackage.DOCUMENT_ROOT__BASE64_DECODER_TRANSFORMER:
				return getBase64DecoderTransformer();
			case CorePackage.DOCUMENT_ROOT__BASE64_ENCODER_TRANSFORMER:
				return getBase64EncoderTransformer();
			case CorePackage.DOCUMENT_ROOT__BEAN_PROPERTY_EXTRACTOR:
				return getBeanPropertyExtractor();
			case CorePackage.DOCUMENT_ROOT__BRIDGE_COMPONENT:
				return getBridgeComponent();
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_HEX_STRING_TRANSFORMER:
				return getByteArrayToHexStringTransformer();
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_OBJECT_TRANSFORMER:
				return getByteArrayToObjectTransformer();
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_SERIALIZABLE_TRANSFORMER:
				return getByteArrayToSerializableTransformer();
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_STRING_TRANSFORMER:
				return getByteArrayToStringTransformer();
			case CorePackage.DOCUMENT_ROOT__CALLABLE_ENTRY_POINT_RESOLVER:
				return getCallableEntryPointResolver();
			case CorePackage.DOCUMENT_ROOT__CHAINING_ROUTER:
				return getChainingRouter();
			case CorePackage.DOCUMENT_ROOT__COMPONENT:
				return getComponent();
			case CorePackage.DOCUMENT_ROOT__COMPONENT_THREADING_PROFILE:
				return getComponentThreadingProfile();
			case CorePackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_EXTRACTOR:
				return getCorrelationPropertyExtractor();
			case CorePackage.DOCUMENT_ROOT__CORRELATION_RESEQUENCER_ROUTER:
				return getCorrelationResequencerRouter();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ASYNC_REPLY_ROUTER:
				return getCustomAsyncReplyRouter();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CATCH_ALL_STRATEGY:
				return getCustomCatchAllStrategy();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTION_STRATEGY:
				return getCustomConnectionStrategy();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTOR:
				return getCustomConnector();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONTAINER:
				return getCustomContainer();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CORRELATION_AGGREGATOR_ROUTER:
				return getCustomCorrelationAggregatorRouter();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ENTRY_POINT_RESOLVER:
				return getCustomEntryPointResolver();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ENTRY_POINT_RESOLVER_SET:
				return getCustomEntryPointResolverSet();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_EXCEPTION_STRATEGY:
				return getCustomExceptionStrategy();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_FILTER:
				return getCustomFilter();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_FORWARDING_CATCH_ALL_STRATEGY:
				return getCustomForwardingCatchAllStrategy();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_INBOUND_ROUTER:
				return getCustomInboundRouter();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_OUTBOUND_ROUTER:
				return getCustomOutboundRouter();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_PROPERTY_EXTRACTOR:
				return getCustomPropertyExtractor();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION:
				return getCustomTransaction();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION_MANAGER:
				return getCustomTransactionManager();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSFORMER:
				return getCustomTransformer();
			case CorePackage.DOCUMENT_ROOT__DECRYPT_TRANSFORMER:
				return getDecryptTransformer();
			case CorePackage.DOCUMENT_ROOT__DEFAULT_CONNECTOR_EXCEPTION_STRATEGY:
				return getDefaultConnectorExceptionStrategy();
			case CorePackage.DOCUMENT_ROOT__DEFAULT_SERVICE_EXCEPTION_STRATEGY:
				return getDefaultServiceExceptionStrategy();
			case CorePackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case CorePackage.DOCUMENT_ROOT__DISABLE_NOTIFICATION:
				return getDisableNotification();
			case CorePackage.DOCUMENT_ROOT__ECHO_COMPONENT:
				return getEchoComponent();
			case CorePackage.DOCUMENT_ROOT__EJB_CONTAINER:
				return getEjbContainer();
			case CorePackage.DOCUMENT_ROOT__ENCRYPTION_SECURITY_FILTER:
				return getEncryptionSecurityFilter();
			case CorePackage.DOCUMENT_ROOT__ENCRYPT_TRANSFORMER:
				return getEncryptTransformer();
			case CorePackage.DOCUMENT_ROOT__ENDPOINT:
				return getEndpoint();
			case CorePackage.DOCUMENT_ROOT__ENDPOINT_SELECTOR_ROUTER:
				return getEndpointSelectorRouter();
			case CorePackage.DOCUMENT_ROOT__ENTRY_POINT_RESOLVER_SET:
				return getEntryPointResolverSet();
			case CorePackage.DOCUMENT_ROOT__EXCEPTION_BASED_ROUTER:
				return getExceptionBasedRouter();
			case CorePackage.DOCUMENT_ROOT__EXCEPTION_TYPE_FILTER:
				return getExceptionTypeFilter();
			case CorePackage.DOCUMENT_ROOT__FILTER:
				return getFilter();
			case CorePackage.DOCUMENT_ROOT__FILTERING_ROUTER:
				return getFilteringRouter();
			case CorePackage.DOCUMENT_ROOT__FORWARDING_CATCH_ALL_STRATEGY:
				return getForwardingCatchAllStrategy();
			case CorePackage.DOCUMENT_ROOT__FORWARDING_ROUTER:
				return getForwardingRouter();
			case CorePackage.DOCUMENT_ROOT__GZIP_COMPRESS_TRANSFORMER:
				return getGzipCompressTransformer();
			case CorePackage.DOCUMENT_ROOT__GZIP_UNCOMPRESS_TRANSFORMER:
				return getGzipUncompressTransformer();
			case CorePackage.DOCUMENT_ROOT__HEX_STRING_TO_BYTE_ARRAY_TRANSFORMER:
				return getHexStringToByteArrayTransformer();
			case CorePackage.DOCUMENT_ROOT__HIVEMIND_CONTAINER:
				return getHivemindContainer();
			case CorePackage.DOCUMENT_ROOT__IDEMPOTENT_RECEIVER_ROUTER:
				return getIdempotentReceiverRouter();
			case CorePackage.DOCUMENT_ROOT__IDEMPOTENT_SECURE_HASH_RECEIVER_ROUTER:
				return getIdempotentSecureHashReceiverRouter();
			case CorePackage.DOCUMENT_ROOT__INBOUND_ENDPOINT:
				return getInboundEndpoint();
			case CorePackage.DOCUMENT_ROOT__INBOUND_PASS_THROUGH_ROUTER:
				return getInboundPassThroughRouter();
			case CorePackage.DOCUMENT_ROOT__INCLUDE_ENTRY_POINT:
				return getIncludeEntryPoint();
			case CorePackage.DOCUMENT_ROOT__JBOSS_TRANSACTION_MANAGER:
				return getJbossTransactionManager();
			case CorePackage.DOCUMENT_ROOT__JNDI_CONTAINER:
				return getJndiContainer();
			case CorePackage.DOCUMENT_ROOT__JNDI_TRANSACTION_MANAGER:
				return getJndiTransactionManager();
			case CorePackage.DOCUMENT_ROOT__JRUN_TRANSACTION_MANAGER:
				return getJrunTransactionManager();
			case CorePackage.DOCUMENT_ROOT__LEGACY_ENTRY_POINT_RESOLVER_SET:
				return getLegacyEntryPointResolverSet();
			case CorePackage.DOCUMENT_ROOT__LIST_MESSAGE_SPLITTER_ROUTER:
				return getListMessageSplitterRouter();
			case CorePackage.DOCUMENT_ROOT__LOG_COMPONENT:
				return getLogComponent();
			case CorePackage.DOCUMENT_ROOT__LOGGING_CATCH_ALL_STRATEGY:
				return getLoggingCatchAllStrategy();
			case CorePackage.DOCUMENT_ROOT__MAP_PROPERTY_EXTRACTOR:
				return getMapPropertyExtractor();
			case CorePackage.DOCUMENT_ROOT__MESSAGE_CHUNKING_AGGREGATOR_ROUTER:
				return getMessageChunkingAggregatorRouter();
			case CorePackage.DOCUMENT_ROOT__MESSAGE_CHUNKING_ROUTER:
				return getMessageChunkingRouter();
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTIES_TRANSFORMER:
				return getMessagePropertiesTransformer();
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_EXTRACTOR:
				return getMessagePropertyExtractor();
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_FILTER:
				return getMessagePropertyFilter();
			case CorePackage.DOCUMENT_ROOT__METHOD_ENTRY_POINT_RESOLVER:
				return getMethodEntryPointResolver();
			case CorePackage.DOCUMENT_ROOT__MODEL:
				return getModel();
			case CorePackage.DOCUMENT_ROOT__MULE:
				return getMule();
			case CorePackage.DOCUMENT_ROOT__MULE_UNSAFE:
				return getMuleUnsafe();
			case CorePackage.DOCUMENT_ROOT__MULTICASTING_ROUTER:
				return getMulticastingRouter();
			case CorePackage.DOCUMENT_ROOT__NO_ACTION_TRANSFORMER:
				return getNoActionTransformer();
			case CorePackage.DOCUMENT_ROOT__NO_ARGUMENTS_ENTRY_POINT_RESOLVER:
				return getNoArgumentsEntryPointResolver();
			case CorePackage.DOCUMENT_ROOT__NOT_FILTER:
				return getNotFilter();
			case CorePackage.DOCUMENT_ROOT__NOTIFICATION:
				return getNotification();
			case CorePackage.DOCUMENT_ROOT__NULL_COMPONENT:
				return getNullComponent();
			case CorePackage.DOCUMENT_ROOT__OBJECT_TO_BYTE_ARRAY_TRANSFORMER:
				return getObjectToByteArrayTransformer();
			case CorePackage.DOCUMENT_ROOT__OBJECT_TO_STRING_TRANSFORMER:
				return getObjectToStringTransformer();
			case CorePackage.DOCUMENT_ROOT__OR_FILTER:
				return getOrFilter();
			case CorePackage.DOCUMENT_ROOT__OUTBOUND_ENDPOINT:
				return getOutboundEndpoint();
			case CorePackage.DOCUMENT_ROOT__OUTBOUND_PASS_THROUGH_ROUTER:
				return getOutboundPassThroughRouter();
			case CorePackage.DOCUMENT_ROOT__PASS_THROUGH_COMPONENT:
				return getPassThroughComponent();
			case CorePackage.DOCUMENT_ROOT__PAYLOAD_PROPERTY_EXTRACTOR:
				return getPayloadPropertyExtractor();
			case CorePackage.DOCUMENT_ROOT__PAYLOAD_TYPE_FILTER:
				return getPayloadTypeFilter();
			case CorePackage.DOCUMENT_ROOT__PICO_CONTAINER:
				return getPicoContainer();
			case CorePackage.DOCUMENT_ROOT__PLEXUS_CONTAINER:
				return getPlexusContainer();
			case CorePackage.DOCUMENT_ROOT__POOLED_OBJECT:
				return getPooledObject();
			case CorePackage.DOCUMENT_ROOT__POOLING_PROFILE:
				return getPoolingProfile();
			case CorePackage.DOCUMENT_ROOT__PROPERTIES:
				return getProperties();
			case CorePackage.DOCUMENT_ROOT__PROPERTIES_CONTAINER:
				return getPropertiesContainer();
			case CorePackage.DOCUMENT_ROOT__PROPERTY_ENTRY_POINT_RESOLVER:
				return getPropertyEntryPointResolver();
			case CorePackage.DOCUMENT_ROOT__PROTOTYPE_OBJECT:
				return getPrototypeObject();
			case CorePackage.DOCUMENT_ROOT__QUEUE_PROFILE:
				return getQueueProfile();
			case CorePackage.DOCUMENT_ROOT__REFLECTION_ENTRY_POINT_RESOLVER:
				return getReflectionEntryPointResolver();
			case CorePackage.DOCUMENT_ROOT__REGEX_FILTER:
				return getRegexFilter();
			case CorePackage.DOCUMENT_ROOT__RESIN_TRANSACTION_MANAGER:
				return getResinTransactionManager();
			case CorePackage.DOCUMENT_ROOT__RETRY_CONNECTION_STRATEGY:
				return getRetryConnectionStrategy();
			case CorePackage.DOCUMENT_ROOT__RMI_CONTAINER:
				return getRmiContainer();
			case CorePackage.DOCUMENT_ROOT__SECURITY_MANAGER:
				return getSecurityManager();
			case CorePackage.DOCUMENT_ROOT__SEDA_MODEL:
				return getSedaModel();
			case CorePackage.DOCUMENT_ROOT__SELECTIVE_CONSUMER_ROUTER:
				return getSelectiveConsumerRouter();
			case CorePackage.DOCUMENT_ROOT__SERIALIZABLE_TO_BYTE_ARRAY_TRANSFORMER:
				return getSerializableToByteArrayTransformer();
			case CorePackage.DOCUMENT_ROOT__SERVICE:
				return getService();
			case CorePackage.DOCUMENT_ROOT__SINGLE_ASYNC_REPLY_ROUTER:
				return getSingleAsyncReplyRouter();
			case CorePackage.DOCUMENT_ROOT__SINGLETON_OBJECT:
				return getSingletonObject();
			case CorePackage.DOCUMENT_ROOT__SPRING_OBJECT:
				return getSpringObject();
			case CorePackage.DOCUMENT_ROOT__STATIC_RECIPIENT_LIST_ROUTER:
				return getStaticRecipientListRouter();
			case CorePackage.DOCUMENT_ROOT__STRING_TO_BYTE_ARRAY_TRANSFORMER:
				return getStringToByteArrayTransformer();
			case CorePackage.DOCUMENT_ROOT__TEMPLATE_ENDPOINT_ROUTER:
				return getTemplateEndpointRouter();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER:
				return getTransformer();
			case CorePackage.DOCUMENT_ROOT__UC_DECODER_TRANSFORMER:
				return getUcDecoderTransformer();
			case CorePackage.DOCUMENT_ROOT__UC_ENCODER_TRANSFORMER:
				return getUcEncoderTransformer();
			case CorePackage.DOCUMENT_ROOT__UU_DECODER_TRANSFORMER:
				return getUuDecoderTransformer();
			case CorePackage.DOCUMENT_ROOT__UU_ENCODER_TRANSFORMER:
				return getUuEncoderTransformer();
			case CorePackage.DOCUMENT_ROOT__WEBLOGIC_TRANSACTION_MANAGER:
				return getWeblogicTransactionManager();
			case CorePackage.DOCUMENT_ROOT__WEBSPHERE_TRANSACTION_MANAGER:
				return getWebsphereTransactionManager();
			case CorePackage.DOCUMENT_ROOT__WILDCARD_FILTER:
				return getWildcardFilter();
			case CorePackage.DOCUMENT_ROOT__WIRE_TAP_ROUTER:
				return getWireTapRouter();
			case CorePackage.DOCUMENT_ROOT__XML_ENTITY_DECODER_TRANSFORMER:
				return getXmlEntityDecoderTransformer();
			case CorePackage.DOCUMENT_ROOT__XML_ENTITY_ENCODER_TRANSFORMER:
				return getXmlEntityEncoderTransformer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__AND_FILTER:
				setAndFilter((CollectionFilterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__APPEND_STRING_TRANSFORMER:
				setAppendStringTransformer((AppendStringTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__ARRAY_ENTRY_POINT_RESOLVER:
				setArrayEntryPointResolver((ComplexEntryPointResolverType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__BASE64_DECODER_TRANSFORMER:
				setBase64DecoderTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__BASE64_ENCODER_TRANSFORMER:
				setBase64EncoderTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__BEAN_PROPERTY_EXTRACTOR:
				setBeanPropertyExtractor((AbstractPropertyExtractorType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__BRIDGE_COMPONENT:
				setBridgeComponent((DefaultComponentType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_HEX_STRING_TRANSFORMER:
				setByteArrayToHexStringTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_OBJECT_TRANSFORMER:
				setByteArrayToObjectTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_SERIALIZABLE_TRANSFORMER:
				setByteArrayToSerializableTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_STRING_TRANSFORMER:
				setByteArrayToStringTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CALLABLE_ENTRY_POINT_RESOLVER:
				setCallableEntryPointResolver((AbstractEntryPointResolverType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CHAINING_ROUTER:
				setChainingRouter((FilteringOutboundRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__COMPONENT:
				setComponent((PojoComponentType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__COMPONENT_THREADING_PROFILE:
				setComponentThreadingProfile((ThreadingProfileType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_EXTRACTOR:
				setCorrelationPropertyExtractor((AbstractPropertyExtractorType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CORRELATION_RESEQUENCER_ROUTER:
				setCorrelationResequencerRouter((SelectiveConsumerRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ASYNC_REPLY_ROUTER:
				setCustomAsyncReplyRouter((CustomAsyncReplyRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CATCH_ALL_STRATEGY:
				setCustomCatchAllStrategy((CustomCatchAllStrategyType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTION_STRATEGY:
				setCustomConnectionStrategy((CustomConnectionStrategyType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTOR:
				setCustomConnector((CustomConnectorType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONTAINER:
				setCustomContainer((CustomContainerContextType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CORRELATION_AGGREGATOR_ROUTER:
				setCustomCorrelationAggregatorRouter((CustomCorrelationAggregatorRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ENTRY_POINT_RESOLVER:
				setCustomEntryPointResolver((CustomEntryPointResolverType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ENTRY_POINT_RESOLVER_SET:
				setCustomEntryPointResolverSet((CustomEntryPointResolverSetType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_EXCEPTION_STRATEGY:
				setCustomExceptionStrategy((CustomExceptionStrategyType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_FILTER:
				setCustomFilter((CustomFilterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_FORWARDING_CATCH_ALL_STRATEGY:
				setCustomForwardingCatchAllStrategy((CustomForwardingCatchAllStrategyType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_INBOUND_ROUTER:
				setCustomInboundRouter((CustomInboundRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_OUTBOUND_ROUTER:
				setCustomOutboundRouter((CustomOutboundRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_PROPERTY_EXTRACTOR:
				setCustomPropertyExtractor((CustomPropertyExtractorType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION:
				setCustomTransaction((CustomTransactionType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION_MANAGER:
				setCustomTransactionManager((CustomTransactionManagerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSFORMER:
				setCustomTransformer((CustomTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__DECRYPT_TRANSFORMER:
				setDecryptTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__DEFAULT_CONNECTOR_EXCEPTION_STRATEGY:
				setDefaultConnectorExceptionStrategy((ExceptionStrategyType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__DEFAULT_SERVICE_EXCEPTION_STRATEGY:
				setDefaultServiceExceptionStrategy((ExceptionStrategyType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((DescriptionType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__DISABLE_NOTIFICATION:
				setDisableNotification((DisableNotificationType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__ECHO_COMPONENT:
				setEchoComponent((DefaultComponentType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__EJB_CONTAINER:
				setEjbContainer((RmiContainerContextType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__ENCRYPTION_SECURITY_FILTER:
				setEncryptionSecurityFilter((EncryptionSecurityFilterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__ENCRYPT_TRANSFORMER:
				setEncryptTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__ENDPOINT:
				setEndpoint((GlobalEndpointType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__ENDPOINT_SELECTOR_ROUTER:
				setEndpointSelectorRouter((EndpointSelectorRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__ENTRY_POINT_RESOLVER_SET:
				setEntryPointResolverSet((ExtensibleEntryPointResolverSet)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__EXCEPTION_BASED_ROUTER:
				setExceptionBasedRouter((FilteringOutboundRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__EXCEPTION_TYPE_FILTER:
				setExceptionTypeFilter((TypeFilterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__FILTER:
				setFilter((RefFilterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__FILTERING_ROUTER:
				setFilteringRouter((FilteringOutboundRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__FORWARDING_CATCH_ALL_STRATEGY:
				setForwardingCatchAllStrategy((ForwardingCatchAllStrategyType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__FORWARDING_ROUTER:
				setForwardingRouter((ForwardingRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__GZIP_COMPRESS_TRANSFORMER:
				setGzipCompressTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__GZIP_UNCOMPRESS_TRANSFORMER:
				setGzipUncompressTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__HEX_STRING_TO_BYTE_ARRAY_TRANSFORMER:
				setHexStringToByteArrayTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__HIVEMIND_CONTAINER:
				setHivemindContainer((IocContainerContextType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__IDEMPOTENT_RECEIVER_ROUTER:
				setIdempotentReceiverRouter((IdempotentReceiverRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__IDEMPOTENT_SECURE_HASH_RECEIVER_ROUTER:
				setIdempotentSecureHashReceiverRouter((FilteredInboundRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__INBOUND_ENDPOINT:
				setInboundEndpoint((InboundEndpointType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__INBOUND_PASS_THROUGH_ROUTER:
				setInboundPassThroughRouter((FilteredInboundRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__INCLUDE_ENTRY_POINT:
				setIncludeEntryPoint((MethodType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__JBOSS_TRANSACTION_MANAGER:
				setJbossTransactionManager((TransactionManagerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__JNDI_CONTAINER:
				setJndiContainer((BaseContainerContextType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__JNDI_TRANSACTION_MANAGER:
				setJndiTransactionManager((TransactionManagerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__JRUN_TRANSACTION_MANAGER:
				setJrunTransactionManager((TransactionManagerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__LEGACY_ENTRY_POINT_RESOLVER_SET:
				setLegacyEntryPointResolverSet((ExtensibleEntryPointResolverSet)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__LIST_MESSAGE_SPLITTER_ROUTER:
				setListMessageSplitterRouter((MessageSplitterOutboundRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__LOG_COMPONENT:
				setLogComponent((DefaultComponentType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__LOGGING_CATCH_ALL_STRATEGY:
				setLoggingCatchAllStrategy((LoggingCatchAllStrategyType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__MAP_PROPERTY_EXTRACTOR:
				setMapPropertyExtractor((AbstractPropertyExtractorType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_CHUNKING_AGGREGATOR_ROUTER:
				setMessageChunkingAggregatorRouter((MessageChunkingAggregatorRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_CHUNKING_ROUTER:
				setMessageChunkingRouter((ChunkingRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTIES_TRANSFORMER:
				setMessagePropertiesTransformer((MessagePropertiesTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_EXTRACTOR:
				setMessagePropertyExtractor((AbstractPropertyExtractorType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_FILTER:
				setMessagePropertyFilter((PatternFilterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__METHOD_ENTRY_POINT_RESOLVER:
				setMethodEntryPointResolver((MethodEntryPointResolverType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__MODEL:
				setModel((DefaultModelType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__MULE:
				setMule((MuleType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__MULE_UNSAFE:
				setMuleUnsafe((MuleUnsafeType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__MULTICASTING_ROUTER:
				setMulticastingRouter((FilteringOutboundRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__NO_ACTION_TRANSFORMER:
				setNoActionTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__NO_ARGUMENTS_ENTRY_POINT_RESOLVER:
				setNoArgumentsEntryPointResolver((ComplexEntryPointResolverType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__NOT_FILTER:
				setNotFilter((UnitaryFilterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__NOTIFICATION:
				setNotification((DefineNotificationType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__NULL_COMPONENT:
				setNullComponent((DefaultComponentType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__OBJECT_TO_BYTE_ARRAY_TRANSFORMER:
				setObjectToByteArrayTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__OBJECT_TO_STRING_TRANSFORMER:
				setObjectToStringTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__OR_FILTER:
				setOrFilter((CollectionFilterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__OUTBOUND_ENDPOINT:
				setOutboundEndpoint((OutboundEndpointType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__OUTBOUND_PASS_THROUGH_ROUTER:
				setOutboundPassThroughRouter((OutboundRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__PASS_THROUGH_COMPONENT:
				setPassThroughComponent((DefaultComponentType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__PAYLOAD_PROPERTY_EXTRACTOR:
				setPayloadPropertyExtractor((AbstractPropertyExtractorType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__PAYLOAD_TYPE_FILTER:
				setPayloadTypeFilter((TypeFilterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__PICO_CONTAINER:
				setPicoContainer((IocContainerContextType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__PLEXUS_CONTAINER:
				setPlexusContainer((IocContainerContextType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__POOLED_OBJECT:
				setPooledObject((PooledObjectFactoryType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__POOLING_PROFILE:
				setPoolingProfile((PoolingProfileType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__PROPERTIES:
				setProperties((MapType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__PROPERTIES_CONTAINER:
				setPropertiesContainer((PropertiesContainerContextType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__PROPERTY_ENTRY_POINT_RESOLVER:
				setPropertyEntryPointResolver((PropertyEntryPointResolverType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__PROTOTYPE_OBJECT:
				setPrototypeObject((PrototypeObjectFactoryType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__QUEUE_PROFILE:
				setQueueProfile((QueueProfileType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__REFLECTION_ENTRY_POINT_RESOLVER:
				setReflectionEntryPointResolver((ReflectionEntryPointResolverType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__REGEX_FILTER:
				setRegexFilter((PatternFilterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__RESIN_TRANSACTION_MANAGER:
				setResinTransactionManager((TransactionManagerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__RETRY_CONNECTION_STRATEGY:
				setRetryConnectionStrategy((RetryConnectionStrategyType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__RMI_CONTAINER:
				setRmiContainer((RmiContainerContextType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__SECURITY_MANAGER:
				setSecurityManager((SecurityManagerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__SEDA_MODEL:
				setSedaModel((SedaModelType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__SELECTIVE_CONSUMER_ROUTER:
				setSelectiveConsumerRouter((SelectiveConsumerRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__SERIALIZABLE_TO_BYTE_ARRAY_TRANSFORMER:
				setSerializableToByteArrayTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__SERVICE:
				setService((SedaServiceType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__SINGLE_ASYNC_REPLY_ROUTER:
				setSingleAsyncReplyRouter((AsyncReplyRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__SINGLETON_OBJECT:
				setSingletonObject((SingletonObjectFactoryType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__SPRING_OBJECT:
				setSpringObject((SpringBeanLookupType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__STATIC_RECIPIENT_LIST_ROUTER:
				setStaticRecipientListRouter((StaticRecipientListRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__STRING_TO_BYTE_ARRAY_TRANSFORMER:
				setStringToByteArrayTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TEMPLATE_ENDPOINT_ROUTER:
				setTemplateEndpointRouter((FilteringOutboundRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER:
				setTransformer((RefTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__UC_DECODER_TRANSFORMER:
				setUcDecoderTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__UC_ENCODER_TRANSFORMER:
				setUcEncoderTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__UU_DECODER_TRANSFORMER:
				setUuDecoderTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__UU_ENCODER_TRANSFORMER:
				setUuEncoderTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__WEBLOGIC_TRANSACTION_MANAGER:
				setWeblogicTransactionManager((JndiTransactionManagerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__WEBSPHERE_TRANSACTION_MANAGER:
				setWebsphereTransactionManager((TransactionManagerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__WILDCARD_FILTER:
				setWildcardFilter((WildcardFilterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__WIRE_TAP_ROUTER:
				setWireTapRouter((WireTapRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__XML_ENTITY_DECODER_TRANSFORMER:
				setXmlEntityDecoderTransformer((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__XML_ENTITY_ENCODER_TRANSFORMER:
				setXmlEntityEncoderTransformer((AbstractTransformerType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case CorePackage.DOCUMENT_ROOT__AND_FILTER:
				setAndFilter((CollectionFilterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__APPEND_STRING_TRANSFORMER:
				setAppendStringTransformer((AppendStringTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__ARRAY_ENTRY_POINT_RESOLVER:
				setArrayEntryPointResolver((ComplexEntryPointResolverType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__BASE64_DECODER_TRANSFORMER:
				setBase64DecoderTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__BASE64_ENCODER_TRANSFORMER:
				setBase64EncoderTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__BEAN_PROPERTY_EXTRACTOR:
				setBeanPropertyExtractor((AbstractPropertyExtractorType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__BRIDGE_COMPONENT:
				setBridgeComponent((DefaultComponentType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_HEX_STRING_TRANSFORMER:
				setByteArrayToHexStringTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_OBJECT_TRANSFORMER:
				setByteArrayToObjectTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_SERIALIZABLE_TRANSFORMER:
				setByteArrayToSerializableTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_STRING_TRANSFORMER:
				setByteArrayToStringTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CALLABLE_ENTRY_POINT_RESOLVER:
				setCallableEntryPointResolver((AbstractEntryPointResolverType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CHAINING_ROUTER:
				setChainingRouter((FilteringOutboundRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__COMPONENT:
				setComponent((PojoComponentType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__COMPONENT_THREADING_PROFILE:
				setComponentThreadingProfile((ThreadingProfileType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_EXTRACTOR:
				setCorrelationPropertyExtractor((AbstractPropertyExtractorType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CORRELATION_RESEQUENCER_ROUTER:
				setCorrelationResequencerRouter((SelectiveConsumerRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ASYNC_REPLY_ROUTER:
				setCustomAsyncReplyRouter((CustomAsyncReplyRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CATCH_ALL_STRATEGY:
				setCustomCatchAllStrategy((CustomCatchAllStrategyType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTION_STRATEGY:
				setCustomConnectionStrategy((CustomConnectionStrategyType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTOR:
				setCustomConnector((CustomConnectorType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONTAINER:
				setCustomContainer((CustomContainerContextType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CORRELATION_AGGREGATOR_ROUTER:
				setCustomCorrelationAggregatorRouter((CustomCorrelationAggregatorRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ENTRY_POINT_RESOLVER:
				setCustomEntryPointResolver((CustomEntryPointResolverType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ENTRY_POINT_RESOLVER_SET:
				setCustomEntryPointResolverSet((CustomEntryPointResolverSetType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_EXCEPTION_STRATEGY:
				setCustomExceptionStrategy((CustomExceptionStrategyType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_FILTER:
				setCustomFilter((CustomFilterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_FORWARDING_CATCH_ALL_STRATEGY:
				setCustomForwardingCatchAllStrategy((CustomForwardingCatchAllStrategyType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_INBOUND_ROUTER:
				setCustomInboundRouter((CustomInboundRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_OUTBOUND_ROUTER:
				setCustomOutboundRouter((CustomOutboundRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_PROPERTY_EXTRACTOR:
				setCustomPropertyExtractor((CustomPropertyExtractorType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION:
				setCustomTransaction((CustomTransactionType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION_MANAGER:
				setCustomTransactionManager((CustomTransactionManagerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSFORMER:
				setCustomTransformer((CustomTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__DECRYPT_TRANSFORMER:
				setDecryptTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__DEFAULT_CONNECTOR_EXCEPTION_STRATEGY:
				setDefaultConnectorExceptionStrategy((ExceptionStrategyType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__DEFAULT_SERVICE_EXCEPTION_STRATEGY:
				setDefaultServiceExceptionStrategy((ExceptionStrategyType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__DESCRIPTION:
				setDescription((DescriptionType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__DISABLE_NOTIFICATION:
				setDisableNotification((DisableNotificationType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__ECHO_COMPONENT:
				setEchoComponent((DefaultComponentType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__EJB_CONTAINER:
				setEjbContainer((RmiContainerContextType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__ENCRYPTION_SECURITY_FILTER:
				setEncryptionSecurityFilter((EncryptionSecurityFilterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__ENCRYPT_TRANSFORMER:
				setEncryptTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__ENDPOINT:
				setEndpoint((GlobalEndpointType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__ENDPOINT_SELECTOR_ROUTER:
				setEndpointSelectorRouter((EndpointSelectorRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__ENTRY_POINT_RESOLVER_SET:
				setEntryPointResolverSet((ExtensibleEntryPointResolverSet)null);
				return;
			case CorePackage.DOCUMENT_ROOT__EXCEPTION_BASED_ROUTER:
				setExceptionBasedRouter((FilteringOutboundRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__EXCEPTION_TYPE_FILTER:
				setExceptionTypeFilter((TypeFilterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__FILTER:
				setFilter((RefFilterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__FILTERING_ROUTER:
				setFilteringRouter((FilteringOutboundRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__FORWARDING_CATCH_ALL_STRATEGY:
				setForwardingCatchAllStrategy((ForwardingCatchAllStrategyType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__FORWARDING_ROUTER:
				setForwardingRouter((ForwardingRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__GZIP_COMPRESS_TRANSFORMER:
				setGzipCompressTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__GZIP_UNCOMPRESS_TRANSFORMER:
				setGzipUncompressTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__HEX_STRING_TO_BYTE_ARRAY_TRANSFORMER:
				setHexStringToByteArrayTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__HIVEMIND_CONTAINER:
				setHivemindContainer((IocContainerContextType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__IDEMPOTENT_RECEIVER_ROUTER:
				setIdempotentReceiverRouter((IdempotentReceiverRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__IDEMPOTENT_SECURE_HASH_RECEIVER_ROUTER:
				setIdempotentSecureHashReceiverRouter((FilteredInboundRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__INBOUND_ENDPOINT:
				setInboundEndpoint((InboundEndpointType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__INBOUND_PASS_THROUGH_ROUTER:
				setInboundPassThroughRouter((FilteredInboundRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__INCLUDE_ENTRY_POINT:
				setIncludeEntryPoint((MethodType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__JBOSS_TRANSACTION_MANAGER:
				setJbossTransactionManager((TransactionManagerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__JNDI_CONTAINER:
				setJndiContainer((BaseContainerContextType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__JNDI_TRANSACTION_MANAGER:
				setJndiTransactionManager((TransactionManagerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__JRUN_TRANSACTION_MANAGER:
				setJrunTransactionManager((TransactionManagerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__LEGACY_ENTRY_POINT_RESOLVER_SET:
				setLegacyEntryPointResolverSet((ExtensibleEntryPointResolverSet)null);
				return;
			case CorePackage.DOCUMENT_ROOT__LIST_MESSAGE_SPLITTER_ROUTER:
				setListMessageSplitterRouter((MessageSplitterOutboundRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__LOG_COMPONENT:
				setLogComponent((DefaultComponentType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__LOGGING_CATCH_ALL_STRATEGY:
				setLoggingCatchAllStrategy((LoggingCatchAllStrategyType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__MAP_PROPERTY_EXTRACTOR:
				setMapPropertyExtractor((AbstractPropertyExtractorType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_CHUNKING_AGGREGATOR_ROUTER:
				setMessageChunkingAggregatorRouter((MessageChunkingAggregatorRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_CHUNKING_ROUTER:
				setMessageChunkingRouter((ChunkingRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTIES_TRANSFORMER:
				setMessagePropertiesTransformer((MessagePropertiesTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_EXTRACTOR:
				setMessagePropertyExtractor((AbstractPropertyExtractorType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_FILTER:
				setMessagePropertyFilter((PatternFilterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__METHOD_ENTRY_POINT_RESOLVER:
				setMethodEntryPointResolver((MethodEntryPointResolverType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__MODEL:
				setModel((DefaultModelType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__MULE:
				setMule((MuleType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__MULE_UNSAFE:
				setMuleUnsafe((MuleUnsafeType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__MULTICASTING_ROUTER:
				setMulticastingRouter((FilteringOutboundRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__NO_ACTION_TRANSFORMER:
				setNoActionTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__NO_ARGUMENTS_ENTRY_POINT_RESOLVER:
				setNoArgumentsEntryPointResolver((ComplexEntryPointResolverType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__NOT_FILTER:
				setNotFilter((UnitaryFilterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__NOTIFICATION:
				setNotification((DefineNotificationType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__NULL_COMPONENT:
				setNullComponent((DefaultComponentType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__OBJECT_TO_BYTE_ARRAY_TRANSFORMER:
				setObjectToByteArrayTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__OBJECT_TO_STRING_TRANSFORMER:
				setObjectToStringTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__OR_FILTER:
				setOrFilter((CollectionFilterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__OUTBOUND_ENDPOINT:
				setOutboundEndpoint((OutboundEndpointType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__OUTBOUND_PASS_THROUGH_ROUTER:
				setOutboundPassThroughRouter((OutboundRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__PASS_THROUGH_COMPONENT:
				setPassThroughComponent((DefaultComponentType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__PAYLOAD_PROPERTY_EXTRACTOR:
				setPayloadPropertyExtractor((AbstractPropertyExtractorType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__PAYLOAD_TYPE_FILTER:
				setPayloadTypeFilter((TypeFilterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__PICO_CONTAINER:
				setPicoContainer((IocContainerContextType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__PLEXUS_CONTAINER:
				setPlexusContainer((IocContainerContextType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__POOLED_OBJECT:
				setPooledObject((PooledObjectFactoryType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__POOLING_PROFILE:
				setPoolingProfile((PoolingProfileType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__PROPERTIES:
				setProperties((MapType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__PROPERTIES_CONTAINER:
				setPropertiesContainer((PropertiesContainerContextType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__PROPERTY_ENTRY_POINT_RESOLVER:
				setPropertyEntryPointResolver((PropertyEntryPointResolverType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__PROTOTYPE_OBJECT:
				setPrototypeObject((PrototypeObjectFactoryType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__QUEUE_PROFILE:
				setQueueProfile((QueueProfileType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__REFLECTION_ENTRY_POINT_RESOLVER:
				setReflectionEntryPointResolver((ReflectionEntryPointResolverType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__REGEX_FILTER:
				setRegexFilter((PatternFilterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__RESIN_TRANSACTION_MANAGER:
				setResinTransactionManager((TransactionManagerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__RETRY_CONNECTION_STRATEGY:
				setRetryConnectionStrategy((RetryConnectionStrategyType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__RMI_CONTAINER:
				setRmiContainer((RmiContainerContextType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__SECURITY_MANAGER:
				setSecurityManager((SecurityManagerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__SEDA_MODEL:
				setSedaModel((SedaModelType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__SELECTIVE_CONSUMER_ROUTER:
				setSelectiveConsumerRouter((SelectiveConsumerRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__SERIALIZABLE_TO_BYTE_ARRAY_TRANSFORMER:
				setSerializableToByteArrayTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__SERVICE:
				setService((SedaServiceType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__SINGLE_ASYNC_REPLY_ROUTER:
				setSingleAsyncReplyRouter((AsyncReplyRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__SINGLETON_OBJECT:
				setSingletonObject((SingletonObjectFactoryType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__SPRING_OBJECT:
				setSpringObject((SpringBeanLookupType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__STATIC_RECIPIENT_LIST_ROUTER:
				setStaticRecipientListRouter((StaticRecipientListRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__STRING_TO_BYTE_ARRAY_TRANSFORMER:
				setStringToByteArrayTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TEMPLATE_ENDPOINT_ROUTER:
				setTemplateEndpointRouter((FilteringOutboundRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER:
				setTransformer((RefTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__UC_DECODER_TRANSFORMER:
				setUcDecoderTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__UC_ENCODER_TRANSFORMER:
				setUcEncoderTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__UU_DECODER_TRANSFORMER:
				setUuDecoderTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__UU_ENCODER_TRANSFORMER:
				setUuEncoderTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__WEBLOGIC_TRANSACTION_MANAGER:
				setWeblogicTransactionManager((JndiTransactionManagerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__WEBSPHERE_TRANSACTION_MANAGER:
				setWebsphereTransactionManager((TransactionManagerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__WILDCARD_FILTER:
				setWildcardFilter((WildcardFilterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__WIRE_TAP_ROUTER:
				setWireTapRouter((WireTapRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__XML_ENTITY_DECODER_TRANSFORMER:
				setXmlEntityDecoderTransformer((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__XML_ENTITY_ENCODER_TRANSFORMER:
				setXmlEntityEncoderTransformer((AbstractTransformerType)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_ASYNC_REPLY_ROUTER:
				return getAbstractAsyncReplyRouter() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_BINDING:
				return getAbstractBinding() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_CATCH_ALL_STRATEGY:
				return getAbstractCatchAllStrategy() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_COMPONENT:
				return getAbstractComponent() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_COMPONENT_THREADING_PROFILE:
				return getAbstractComponentThreadingProfile() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_CONNECTION_STRATEGY:
				return getAbstractConnectionStrategy() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_CONNECTOR:
				return getAbstractConnector() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_DEFINE_NOTIFICATION:
				return getAbstractDefineNotification() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_DISABLE_NOTIFICATION:
				return getAbstractDisableNotification() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_ENTRY_POINT_RESOLVER:
				return getAbstractEntryPointResolver() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_ENTRY_POINT_RESOLVER_SET:
				return getAbstractEntryPointResolverSet() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_EXCEPTION_STRATEGY:
				return getAbstractExceptionStrategy() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_EXTENSION:
				return getAbstractExtension() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_FILTER:
				return getAbstractFilter() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_GLOBAL_ENDPOINT:
				return getAbstractGlobalEndpoint() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_INBOUND_ENDPOINT:
				return getAbstractInboundEndpoint() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_INBOUND_ROUTER:
				return getAbstractInboundRouter() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_MODEL:
				return getAbstractModel() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_OBJECT_FACTORY:
				return getAbstractObjectFactory() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_OUTBOUND_ENDPOINT:
				return getAbstractOutboundEndpoint() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_OUTBOUND_ROUTER:
				return getAbstractOutboundRouter() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_POOLING_PROFILE:
				return getAbstractPoolingProfile() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_PROPERTY_EXTRACTOR:
				return getAbstractPropertyExtractor() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_QUEUE_PROFILE:
				return getAbstractQueueProfile() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_SECURITY_FILTER:
				return getAbstractSecurityFilter() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_SECURITY_MANAGER:
				return getAbstractSecurityManager() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_SERVICE:
				return getAbstractService() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_STORAGE:
				return getAbstractStorage() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION:
				return getAbstractTransaction() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION_MANAGER:
				return getAbstractTransactionManager() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSFORMER:
				return getAbstractTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__AND_FILTER:
				return getAndFilter() != null;
			case CorePackage.DOCUMENT_ROOT__APPEND_STRING_TRANSFORMER:
				return getAppendStringTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__ARRAY_ENTRY_POINT_RESOLVER:
				return getArrayEntryPointResolver() != null;
			case CorePackage.DOCUMENT_ROOT__BASE64_DECODER_TRANSFORMER:
				return getBase64DecoderTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__BASE64_ENCODER_TRANSFORMER:
				return getBase64EncoderTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__BEAN_PROPERTY_EXTRACTOR:
				return getBeanPropertyExtractor() != null;
			case CorePackage.DOCUMENT_ROOT__BRIDGE_COMPONENT:
				return getBridgeComponent() != null;
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_HEX_STRING_TRANSFORMER:
				return getByteArrayToHexStringTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_OBJECT_TRANSFORMER:
				return getByteArrayToObjectTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_SERIALIZABLE_TRANSFORMER:
				return getByteArrayToSerializableTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_STRING_TRANSFORMER:
				return getByteArrayToStringTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__CALLABLE_ENTRY_POINT_RESOLVER:
				return getCallableEntryPointResolver() != null;
			case CorePackage.DOCUMENT_ROOT__CHAINING_ROUTER:
				return getChainingRouter() != null;
			case CorePackage.DOCUMENT_ROOT__COMPONENT:
				return getComponent() != null;
			case CorePackage.DOCUMENT_ROOT__COMPONENT_THREADING_PROFILE:
				return getComponentThreadingProfile() != null;
			case CorePackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_EXTRACTOR:
				return getCorrelationPropertyExtractor() != null;
			case CorePackage.DOCUMENT_ROOT__CORRELATION_RESEQUENCER_ROUTER:
				return getCorrelationResequencerRouter() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ASYNC_REPLY_ROUTER:
				return getCustomAsyncReplyRouter() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CATCH_ALL_STRATEGY:
				return getCustomCatchAllStrategy() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTION_STRATEGY:
				return getCustomConnectionStrategy() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTOR:
				return getCustomConnector() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONTAINER:
				return getCustomContainer() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CORRELATION_AGGREGATOR_ROUTER:
				return getCustomCorrelationAggregatorRouter() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ENTRY_POINT_RESOLVER:
				return getCustomEntryPointResolver() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ENTRY_POINT_RESOLVER_SET:
				return getCustomEntryPointResolverSet() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_EXCEPTION_STRATEGY:
				return getCustomExceptionStrategy() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_FILTER:
				return getCustomFilter() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_FORWARDING_CATCH_ALL_STRATEGY:
				return getCustomForwardingCatchAllStrategy() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_INBOUND_ROUTER:
				return getCustomInboundRouter() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_OUTBOUND_ROUTER:
				return getCustomOutboundRouter() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_PROPERTY_EXTRACTOR:
				return getCustomPropertyExtractor() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION:
				return getCustomTransaction() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION_MANAGER:
				return getCustomTransactionManager() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSFORMER:
				return getCustomTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__DECRYPT_TRANSFORMER:
				return getDecryptTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__DEFAULT_CONNECTOR_EXCEPTION_STRATEGY:
				return getDefaultConnectorExceptionStrategy() != null;
			case CorePackage.DOCUMENT_ROOT__DEFAULT_SERVICE_EXCEPTION_STRATEGY:
				return getDefaultServiceExceptionStrategy() != null;
			case CorePackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription() != null;
			case CorePackage.DOCUMENT_ROOT__DISABLE_NOTIFICATION:
				return getDisableNotification() != null;
			case CorePackage.DOCUMENT_ROOT__ECHO_COMPONENT:
				return getEchoComponent() != null;
			case CorePackage.DOCUMENT_ROOT__EJB_CONTAINER:
				return getEjbContainer() != null;
			case CorePackage.DOCUMENT_ROOT__ENCRYPTION_SECURITY_FILTER:
				return getEncryptionSecurityFilter() != null;
			case CorePackage.DOCUMENT_ROOT__ENCRYPT_TRANSFORMER:
				return getEncryptTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__ENDPOINT:
				return getEndpoint() != null;
			case CorePackage.DOCUMENT_ROOT__ENDPOINT_SELECTOR_ROUTER:
				return getEndpointSelectorRouter() != null;
			case CorePackage.DOCUMENT_ROOT__ENTRY_POINT_RESOLVER_SET:
				return getEntryPointResolverSet() != null;
			case CorePackage.DOCUMENT_ROOT__EXCEPTION_BASED_ROUTER:
				return getExceptionBasedRouter() != null;
			case CorePackage.DOCUMENT_ROOT__EXCEPTION_TYPE_FILTER:
				return getExceptionTypeFilter() != null;
			case CorePackage.DOCUMENT_ROOT__FILTER:
				return getFilter() != null;
			case CorePackage.DOCUMENT_ROOT__FILTERING_ROUTER:
				return getFilteringRouter() != null;
			case CorePackage.DOCUMENT_ROOT__FORWARDING_CATCH_ALL_STRATEGY:
				return getForwardingCatchAllStrategy() != null;
			case CorePackage.DOCUMENT_ROOT__FORWARDING_ROUTER:
				return getForwardingRouter() != null;
			case CorePackage.DOCUMENT_ROOT__GZIP_COMPRESS_TRANSFORMER:
				return getGzipCompressTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__GZIP_UNCOMPRESS_TRANSFORMER:
				return getGzipUncompressTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__HEX_STRING_TO_BYTE_ARRAY_TRANSFORMER:
				return getHexStringToByteArrayTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__HIVEMIND_CONTAINER:
				return getHivemindContainer() != null;
			case CorePackage.DOCUMENT_ROOT__IDEMPOTENT_RECEIVER_ROUTER:
				return getIdempotentReceiverRouter() != null;
			case CorePackage.DOCUMENT_ROOT__IDEMPOTENT_SECURE_HASH_RECEIVER_ROUTER:
				return getIdempotentSecureHashReceiverRouter() != null;
			case CorePackage.DOCUMENT_ROOT__INBOUND_ENDPOINT:
				return getInboundEndpoint() != null;
			case CorePackage.DOCUMENT_ROOT__INBOUND_PASS_THROUGH_ROUTER:
				return getInboundPassThroughRouter() != null;
			case CorePackage.DOCUMENT_ROOT__INCLUDE_ENTRY_POINT:
				return getIncludeEntryPoint() != null;
			case CorePackage.DOCUMENT_ROOT__JBOSS_TRANSACTION_MANAGER:
				return getJbossTransactionManager() != null;
			case CorePackage.DOCUMENT_ROOT__JNDI_CONTAINER:
				return getJndiContainer() != null;
			case CorePackage.DOCUMENT_ROOT__JNDI_TRANSACTION_MANAGER:
				return getJndiTransactionManager() != null;
			case CorePackage.DOCUMENT_ROOT__JRUN_TRANSACTION_MANAGER:
				return getJrunTransactionManager() != null;
			case CorePackage.DOCUMENT_ROOT__LEGACY_ENTRY_POINT_RESOLVER_SET:
				return getLegacyEntryPointResolverSet() != null;
			case CorePackage.DOCUMENT_ROOT__LIST_MESSAGE_SPLITTER_ROUTER:
				return getListMessageSplitterRouter() != null;
			case CorePackage.DOCUMENT_ROOT__LOG_COMPONENT:
				return getLogComponent() != null;
			case CorePackage.DOCUMENT_ROOT__LOGGING_CATCH_ALL_STRATEGY:
				return getLoggingCatchAllStrategy() != null;
			case CorePackage.DOCUMENT_ROOT__MAP_PROPERTY_EXTRACTOR:
				return getMapPropertyExtractor() != null;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_CHUNKING_AGGREGATOR_ROUTER:
				return getMessageChunkingAggregatorRouter() != null;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_CHUNKING_ROUTER:
				return getMessageChunkingRouter() != null;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTIES_TRANSFORMER:
				return getMessagePropertiesTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_EXTRACTOR:
				return getMessagePropertyExtractor() != null;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_FILTER:
				return getMessagePropertyFilter() != null;
			case CorePackage.DOCUMENT_ROOT__METHOD_ENTRY_POINT_RESOLVER:
				return getMethodEntryPointResolver() != null;
			case CorePackage.DOCUMENT_ROOT__MODEL:
				return getModel() != null;
			case CorePackage.DOCUMENT_ROOT__MULE:
				return getMule() != null;
			case CorePackage.DOCUMENT_ROOT__MULE_UNSAFE:
				return getMuleUnsafe() != null;
			case CorePackage.DOCUMENT_ROOT__MULTICASTING_ROUTER:
				return getMulticastingRouter() != null;
			case CorePackage.DOCUMENT_ROOT__NO_ACTION_TRANSFORMER:
				return getNoActionTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__NO_ARGUMENTS_ENTRY_POINT_RESOLVER:
				return getNoArgumentsEntryPointResolver() != null;
			case CorePackage.DOCUMENT_ROOT__NOT_FILTER:
				return getNotFilter() != null;
			case CorePackage.DOCUMENT_ROOT__NOTIFICATION:
				return getNotification() != null;
			case CorePackage.DOCUMENT_ROOT__NULL_COMPONENT:
				return getNullComponent() != null;
			case CorePackage.DOCUMENT_ROOT__OBJECT_TO_BYTE_ARRAY_TRANSFORMER:
				return getObjectToByteArrayTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__OBJECT_TO_STRING_TRANSFORMER:
				return getObjectToStringTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__OR_FILTER:
				return getOrFilter() != null;
			case CorePackage.DOCUMENT_ROOT__OUTBOUND_ENDPOINT:
				return getOutboundEndpoint() != null;
			case CorePackage.DOCUMENT_ROOT__OUTBOUND_PASS_THROUGH_ROUTER:
				return getOutboundPassThroughRouter() != null;
			case CorePackage.DOCUMENT_ROOT__PASS_THROUGH_COMPONENT:
				return getPassThroughComponent() != null;
			case CorePackage.DOCUMENT_ROOT__PAYLOAD_PROPERTY_EXTRACTOR:
				return getPayloadPropertyExtractor() != null;
			case CorePackage.DOCUMENT_ROOT__PAYLOAD_TYPE_FILTER:
				return getPayloadTypeFilter() != null;
			case CorePackage.DOCUMENT_ROOT__PICO_CONTAINER:
				return getPicoContainer() != null;
			case CorePackage.DOCUMENT_ROOT__PLEXUS_CONTAINER:
				return getPlexusContainer() != null;
			case CorePackage.DOCUMENT_ROOT__POOLED_OBJECT:
				return getPooledObject() != null;
			case CorePackage.DOCUMENT_ROOT__POOLING_PROFILE:
				return getPoolingProfile() != null;
			case CorePackage.DOCUMENT_ROOT__PROPERTIES:
				return getProperties() != null;
			case CorePackage.DOCUMENT_ROOT__PROPERTIES_CONTAINER:
				return getPropertiesContainer() != null;
			case CorePackage.DOCUMENT_ROOT__PROPERTY_ENTRY_POINT_RESOLVER:
				return getPropertyEntryPointResolver() != null;
			case CorePackage.DOCUMENT_ROOT__PROTOTYPE_OBJECT:
				return getPrototypeObject() != null;
			case CorePackage.DOCUMENT_ROOT__QUEUE_PROFILE:
				return getQueueProfile() != null;
			case CorePackage.DOCUMENT_ROOT__REFLECTION_ENTRY_POINT_RESOLVER:
				return getReflectionEntryPointResolver() != null;
			case CorePackage.DOCUMENT_ROOT__REGEX_FILTER:
				return getRegexFilter() != null;
			case CorePackage.DOCUMENT_ROOT__RESIN_TRANSACTION_MANAGER:
				return getResinTransactionManager() != null;
			case CorePackage.DOCUMENT_ROOT__RETRY_CONNECTION_STRATEGY:
				return getRetryConnectionStrategy() != null;
			case CorePackage.DOCUMENT_ROOT__RMI_CONTAINER:
				return getRmiContainer() != null;
			case CorePackage.DOCUMENT_ROOT__SECURITY_MANAGER:
				return getSecurityManager() != null;
			case CorePackage.DOCUMENT_ROOT__SEDA_MODEL:
				return getSedaModel() != null;
			case CorePackage.DOCUMENT_ROOT__SELECTIVE_CONSUMER_ROUTER:
				return getSelectiveConsumerRouter() != null;
			case CorePackage.DOCUMENT_ROOT__SERIALIZABLE_TO_BYTE_ARRAY_TRANSFORMER:
				return getSerializableToByteArrayTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__SERVICE:
				return getService() != null;
			case CorePackage.DOCUMENT_ROOT__SINGLE_ASYNC_REPLY_ROUTER:
				return getSingleAsyncReplyRouter() != null;
			case CorePackage.DOCUMENT_ROOT__SINGLETON_OBJECT:
				return getSingletonObject() != null;
			case CorePackage.DOCUMENT_ROOT__SPRING_OBJECT:
				return getSpringObject() != null;
			case CorePackage.DOCUMENT_ROOT__STATIC_RECIPIENT_LIST_ROUTER:
				return getStaticRecipientListRouter() != null;
			case CorePackage.DOCUMENT_ROOT__STRING_TO_BYTE_ARRAY_TRANSFORMER:
				return getStringToByteArrayTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__TEMPLATE_ENDPOINT_ROUTER:
				return getTemplateEndpointRouter() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER:
				return getTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__UC_DECODER_TRANSFORMER:
				return getUcDecoderTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__UC_ENCODER_TRANSFORMER:
				return getUcEncoderTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__UU_DECODER_TRANSFORMER:
				return getUuDecoderTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__UU_ENCODER_TRANSFORMER:
				return getUuEncoderTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__WEBLOGIC_TRANSACTION_MANAGER:
				return getWeblogicTransactionManager() != null;
			case CorePackage.DOCUMENT_ROOT__WEBSPHERE_TRANSACTION_MANAGER:
				return getWebsphereTransactionManager() != null;
			case CorePackage.DOCUMENT_ROOT__WILDCARD_FILTER:
				return getWildcardFilter() != null;
			case CorePackage.DOCUMENT_ROOT__WIRE_TAP_ROUTER:
				return getWireTapRouter() != null;
			case CorePackage.DOCUMENT_ROOT__XML_ENTITY_DECODER_TRANSFORMER:
				return getXmlEntityDecoderTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__XML_ENTITY_ENCODER_TRANSFORMER:
				return getXmlEntityEncoderTransformer() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
