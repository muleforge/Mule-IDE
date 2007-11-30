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

import org.mule.ide.config.core.AbstractBindingType;
import org.mule.ide.config.core.AbstractCatchAllStrategyType;
import org.mule.ide.config.core.AbstractComponentThreadingProfileType;
import org.mule.ide.config.core.AbstractComponentType;
import org.mule.ide.config.core.AbstractConnectionStrategyType;
import org.mule.ide.config.core.AbstractConnectorType;
import org.mule.ide.config.core.AbstractEntrypointResolverType;
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
import org.mule.ide.config.core.AbstractResponseEndpointType;
import org.mule.ide.config.core.AbstractResponseRouterType;
import org.mule.ide.config.core.AbstractSecurityFilterType;
import org.mule.ide.config.core.AbstractSecurityManagerType;
import org.mule.ide.config.core.AbstractServiceType;
import org.mule.ide.config.core.AbstractStorageType;
import org.mule.ide.config.core.AbstractTransactionFactoryType;
import org.mule.ide.config.core.AbstractTransactionManagerType;
import org.mule.ide.config.core.AbstractTransactionType;
import org.mule.ide.config.core.AbstractTransformerType;
import org.mule.ide.config.core.BaseContainerContextType;
import org.mule.ide.config.core.CallableEntrypointResolverType;
import org.mule.ide.config.core.ChunkingRouterType;
import org.mule.ide.config.core.CollectionFilterType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.CorrelationAggregatorRouterType;
import org.mule.ide.config.core.CorrelationRouterType;
import org.mule.ide.config.core.CustomCatchAllStrategyType;
import org.mule.ide.config.core.CustomConnectionStrategyType;
import org.mule.ide.config.core.CustomConnectorType;
import org.mule.ide.config.core.CustomContainerContextType;
import org.mule.ide.config.core.CustomEntrypointResolverType;
import org.mule.ide.config.core.CustomExceptionStrategyType;
import org.mule.ide.config.core.CustomFilterType;
import org.mule.ide.config.core.CustomForwardingCatchAllStrategyType;
import org.mule.ide.config.core.CustomInboundRouterType;
import org.mule.ide.config.core.CustomOutboundRouterType;
import org.mule.ide.config.core.CustomResponseRouterType;
import org.mule.ide.config.core.CustomTransactionFactoryType;
import org.mule.ide.config.core.CustomTransactionManagerType;
import org.mule.ide.config.core.CustomTransformerType;
import org.mule.ide.config.core.DefaultComponentType;
import org.mule.ide.config.core.DefaultModelType;
import org.mule.ide.config.core.DefaultServiceType;
import org.mule.ide.config.core.DescriptionType;
import org.mule.ide.config.core.DocumentRoot;
import org.mule.ide.config.core.EncryptionSecurityFilterType;
import org.mule.ide.config.core.EndpointSelectorRouterType;
import org.mule.ide.config.core.ExceptionStrategyType;
import org.mule.ide.config.core.FilterRefType;
import org.mule.ide.config.core.FilteredInboundRouterType;
import org.mule.ide.config.core.FilteringOutboundRouterType;
import org.mule.ide.config.core.ForwardingCatchAllStrategyType;
import org.mule.ide.config.core.ForwardingRouterType;
import org.mule.ide.config.core.GlobalEndpointType;
import org.mule.ide.config.core.IdempotentReceiverType;
import org.mule.ide.config.core.InboundEndpointType;
import org.mule.ide.config.core.IocContainerContextType;
import org.mule.ide.config.core.JndiTransactionManagerType;
import org.mule.ide.config.core.LoggingCatchAllStrategyType;
import org.mule.ide.config.core.MapType;
import org.mule.ide.config.core.MessagePropertiesTransformerType;
import org.mule.ide.config.core.MessageSplitterOutboundRouterType;
import org.mule.ide.config.core.MuleType;
import org.mule.ide.config.core.MuleUnsafeType;
import org.mule.ide.config.core.NoArgsCallWrapperType;
import org.mule.ide.config.core.OutboundEndpointType;
import org.mule.ide.config.core.OutboundRouterType;
import org.mule.ide.config.core.PatternFilterType;
import org.mule.ide.config.core.PojoComponentType;
import org.mule.ide.config.core.PooledObjectFactoryType;
import org.mule.ide.config.core.PoolingProfileType;
import org.mule.ide.config.core.PropertiesContainerContextType;
import org.mule.ide.config.core.PrototypeObjectFactoryType;
import org.mule.ide.config.core.QueueProfileType;
import org.mule.ide.config.core.ResponseEndpointType;
import org.mule.ide.config.core.ResponseRouterType;
import org.mule.ide.config.core.RetryConnectionStrategyType;
import org.mule.ide.config.core.RmiContainerContextType;
import org.mule.ide.config.core.SecurityManagerType;
import org.mule.ide.config.core.SedaModelType;
import org.mule.ide.config.core.SedaServiceType;
import org.mule.ide.config.core.SelectiveConsumerRouterType;
import org.mule.ide.config.core.SingletonObjectFactoryType;
import org.mule.ide.config.core.StaticRecipientListRouterType;
import org.mule.ide.config.core.ThreadingProfileType;
import org.mule.ide.config.core.TransactionManagerType;
import org.mule.ide.config.core.TransactionRefFactoryType;
import org.mule.ide.config.core.TransactionType;
import org.mule.ide.config.core.TransformerAppendStringType;
import org.mule.ide.config.core.TransformerRefType;
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
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractBinding <em>Abstract Binding</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractCatchAllStrategy <em>Abstract Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractComponent <em>Abstract Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractComponentThreadingProfile <em>Abstract Component Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractConnectionStrategy <em>Abstract Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractConnector <em>Abstract Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractEntrypointResolver <em>Abstract Entrypoint Resolver</em>}</li>
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
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractResponseEndpoint <em>Abstract Response Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractResponseRouter <em>Abstract Response Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractSecurityFilter <em>Abstract Security Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractSecurityManager <em>Abstract Security Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractService <em>Abstract Service</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractStorage <em>Abstract Storage</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractTransaction <em>Abstract Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractTransactionFactory <em>Abstract Transaction Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractTransactionManager <em>Abstract Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAbstractTransformer <em>Abstract Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getAndFilter <em>And Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getBeanPropertyExtractor <em>Bean Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getBridgeComponent <em>Bridge Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCallableEntrypointResolver <em>Callable Entrypoint Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getChainingRouter <em>Chaining Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getComponentThreadingProfile <em>Component Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCorrelationAggregatorRouter <em>Correlation Aggregator Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCorrelationPropertyExtractor <em>Correlation Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCorrelationResequencerRouter <em>Correlation Resequencer Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomCatchAllStrategy <em>Custom Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomConnectionStrategy <em>Custom Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomConnector <em>Custom Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomContainer <em>Custom Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomEntrypointResolver <em>Custom Entrypoint Resolver</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomExceptionStrategy <em>Custom Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomFilter <em>Custom Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomForwardingCatchAllStrategy <em>Custom Forwarding Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomInboundRouter <em>Custom Inbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomOutboundRouter <em>Custom Outbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomPropertyExtractor <em>Custom Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomResponseRouter <em>Custom Response Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomTransactionFactory <em>Custom Transaction Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomTransactionManager <em>Custom Transaction Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getCustomTransformer <em>Custom Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getDefaultConnectorExceptionStrategy <em>Default Connector Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getDefaultServiceExceptionStrategy <em>Default Service Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getEchoComponent <em>Echo Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getEjbContainer <em>Ejb Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getEncryptionSecurityFilter <em>Encryption Security Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getEndpointSelectorRouter <em>Endpoint Selector Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getExceptionBasedRouter <em>Exception Based Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getExceptionTypeFilter <em>Exception Type Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getFilteringRouter <em>Filtering Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getForwardingCatchAllStrategy <em>Forwarding Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getForwardingRouter <em>Forwarding Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getHivemindContainer <em>Hivemind Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getIdempotentReceiverRouter <em>Idempotent Receiver Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getIdempotentSecureHashReceiverRouter <em>Idempotent Secure Hash Receiver Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getInboundEndpoint <em>Inbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getInboundPassThroughRouter <em>Inbound Pass Through Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getJndiContainer <em>Jndi Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getListMessageSplitterRouter <em>List Message Splitter Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getLogComponent <em>Log Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getLoggingCatchAllStrategy <em>Logging Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMapPropertyExtractor <em>Map Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMessageChunkingAggregatorRouter <em>Message Chunking Aggregator Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMessageChunkingRouter <em>Message Chunking Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMessagePropertyExtractor <em>Message Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMessagePropertyFilter <em>Message Property Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMule <em>Mule</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMuleUnsafe <em>Mule Unsafe</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getMulticastingRouter <em>Multicasting Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getNoArgsCallComponent <em>No Args Call Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getNotFilter <em>Not Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getNullComponent <em>Null Component</em>}</li>
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
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getPrototypeObject <em>Prototype Object</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getQueueProfile <em>Queue Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getRegexFilter <em>Regex Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getResponseEndpoint <em>Response Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getRetryConnectionStrategy <em>Retry Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getRmiContainer <em>Rmi Container</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getSecurityManager <em>Security Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getSedaModel <em>Seda Model</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getSelectiveConsumerRouter <em>Selective Consumer Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getService <em>Service</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getSingleResponseRouter <em>Single Response Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getSingletonObject <em>Singleton Object</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getStaticRecipientListRouter <em>Static Recipient List Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTemplateEndpointRouter <em>Template Endpoint Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransaction <em>Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransactionFactory <em>Transaction Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransactionManagerJboss <em>Transaction Manager Jboss</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransactionManagerJndi <em>Transaction Manager Jndi</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransactionManagerJrun <em>Transaction Manager Jrun</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransactionManagerResin <em>Transaction Manager Resin</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransactionManagerWeblogic <em>Transaction Manager Weblogic</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransactionManagerWebsphere <em>Transaction Manager Websphere</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformer <em>Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerAppendString <em>Transformer Append String</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerBase64Decoder <em>Transformer Base64 Decoder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerBase64Encoder <em>Transformer Base64 Encoder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerByteArrayToHexString <em>Transformer Byte Array To Hex String</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerByteArrayToObject <em>Transformer Byte Array To Object</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerByteArrayToSerializable <em>Transformer Byte Array To Serializable</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerByteArrayToString <em>Transformer Byte Array To String</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerDecrypt <em>Transformer Decrypt</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerEncrypt <em>Transformer Encrypt</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerGzipCompress <em>Transformer Gzip Compress</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerGzipUncompress <em>Transformer Gzip Uncompress</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerHexStingToByteArray <em>Transformer Hex Sting To Byte Array</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerMessageProperties <em>Transformer Message Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerNoAction <em>Transformer No Action</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerObjectToByteArray <em>Transformer Object To Byte Array</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerObjectToString <em>Transformer Object To String</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerSerializableToByteArray <em>Transformer Serializable To Byte Array</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerStringToByteArray <em>Transformer String To Byte Array</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerUcDecoder <em>Transformer Uc Decoder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerUcEncoder <em>Transformer Uc Encoder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerUuDecoder <em>Transformer Uu Decoder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerUuEncoder <em>Transformer Uu Encoder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerXmlEntityDecoder <em>Transformer Xml Entity Decoder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getTransformerXmlEntityEncoder <em>Transformer Xml Entity Encoder</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getWildcardFilter <em>Wildcard Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.DocumentRootImpl#getWireTapRouter <em>Wire Tap Router</em>}</li>
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
	public AbstractEntrypointResolverType getAbstractEntrypointResolver() {
		return (AbstractEntrypointResolverType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractEntrypointResolver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractEntrypointResolver(AbstractEntrypointResolverType newAbstractEntrypointResolver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractEntrypointResolver(), newAbstractEntrypointResolver, msgs);
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
	public AbstractResponseEndpointType getAbstractResponseEndpoint() {
		return (AbstractResponseEndpointType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractResponseEndpoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractResponseEndpoint(AbstractResponseEndpointType newAbstractResponseEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractResponseEndpoint(), newAbstractResponseEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractResponseRouterType getAbstractResponseRouter() {
		return (AbstractResponseRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractResponseRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractResponseRouter(AbstractResponseRouterType newAbstractResponseRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractResponseRouter(), newAbstractResponseRouter, msgs);
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
	public AbstractTransactionFactoryType getAbstractTransactionFactory() {
		return (AbstractTransactionFactoryType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_AbstractTransactionFactory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTransactionFactory(AbstractTransactionFactoryType newAbstractTransactionFactory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_AbstractTransactionFactory(), newAbstractTransactionFactory, msgs);
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
	public CallableEntrypointResolverType getCallableEntrypointResolver() {
		return (CallableEntrypointResolverType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CallableEntrypointResolver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCallableEntrypointResolver(CallableEntrypointResolverType newCallableEntrypointResolver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CallableEntrypointResolver(), newCallableEntrypointResolver, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCallableEntrypointResolver(CallableEntrypointResolverType newCallableEntrypointResolver) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CallableEntrypointResolver(), newCallableEntrypointResolver);
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
	public CorrelationAggregatorRouterType getCorrelationAggregatorRouter() {
		return (CorrelationAggregatorRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CorrelationAggregatorRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationAggregatorRouter(CorrelationAggregatorRouterType newCorrelationAggregatorRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CorrelationAggregatorRouter(), newCorrelationAggregatorRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationAggregatorRouter(CorrelationAggregatorRouterType newCorrelationAggregatorRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CorrelationAggregatorRouter(), newCorrelationAggregatorRouter);
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
	public CorrelationRouterType getCorrelationResequencerRouter() {
		return (CorrelationRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CorrelationResequencerRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCorrelationResequencerRouter(CorrelationRouterType newCorrelationResequencerRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CorrelationResequencerRouter(), newCorrelationResequencerRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationResequencerRouter(CorrelationRouterType newCorrelationResequencerRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CorrelationResequencerRouter(), newCorrelationResequencerRouter);
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
	public CustomEntrypointResolverType getCustomEntrypointResolver() {
		return (CustomEntrypointResolverType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomEntrypointResolver(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomEntrypointResolver(CustomEntrypointResolverType newCustomEntrypointResolver, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomEntrypointResolver(), newCustomEntrypointResolver, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomEntrypointResolver(CustomEntrypointResolverType newCustomEntrypointResolver) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomEntrypointResolver(), newCustomEntrypointResolver);
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
	public EObject getCustomPropertyExtractor() {
		return (EObject)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomPropertyExtractor(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomPropertyExtractor(EObject newCustomPropertyExtractor, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomPropertyExtractor(), newCustomPropertyExtractor, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomPropertyExtractor(EObject newCustomPropertyExtractor) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomPropertyExtractor(), newCustomPropertyExtractor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomResponseRouterType getCustomResponseRouter() {
		return (CustomResponseRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomResponseRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomResponseRouter(CustomResponseRouterType newCustomResponseRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomResponseRouter(), newCustomResponseRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomResponseRouter(CustomResponseRouterType newCustomResponseRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomResponseRouter(), newCustomResponseRouter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTransactionFactoryType getCustomTransactionFactory() {
		return (CustomTransactionFactoryType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_CustomTransactionFactory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomTransactionFactory(CustomTransactionFactoryType newCustomTransactionFactory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_CustomTransactionFactory(), newCustomTransactionFactory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomTransactionFactory(CustomTransactionFactoryType newCustomTransactionFactory) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_CustomTransactionFactory(), newCustomTransactionFactory);
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
	public FilterRefType getFilter() {
		return (FilterRefType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_Filter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilter(FilterRefType newFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_Filter(), newFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilter(FilterRefType newFilter) {
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
	public IdempotentReceiverType getIdempotentReceiverRouter() {
		return (IdempotentReceiverType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_IdempotentReceiverRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIdempotentReceiverRouter(IdempotentReceiverType newIdempotentReceiverRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_IdempotentReceiverRouter(), newIdempotentReceiverRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdempotentReceiverRouter(IdempotentReceiverType newIdempotentReceiverRouter) {
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
	public CorrelationRouterType getMessageChunkingAggregatorRouter() {
		return (CorrelationRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingAggregatorRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMessageChunkingAggregatorRouter(CorrelationRouterType newMessageChunkingAggregatorRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingAggregatorRouter(), newMessageChunkingAggregatorRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageChunkingAggregatorRouter(CorrelationRouterType newMessageChunkingAggregatorRouter) {
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
	public NoArgsCallWrapperType getNoArgsCallComponent() {
		return (NoArgsCallWrapperType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_NoArgsCallComponent(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNoArgsCallComponent(NoArgsCallWrapperType newNoArgsCallComponent, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_NoArgsCallComponent(), newNoArgsCallComponent, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoArgsCallComponent(NoArgsCallWrapperType newNoArgsCallComponent) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_NoArgsCallComponent(), newNoArgsCallComponent);
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
	public ResponseEndpointType getResponseEndpoint() {
		return (ResponseEndpointType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_ResponseEndpoint(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseEndpoint(ResponseEndpointType newResponseEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_ResponseEndpoint(), newResponseEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseEndpoint(ResponseEndpointType newResponseEndpoint) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_ResponseEndpoint(), newResponseEndpoint);
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
	public ResponseRouterType getSingleResponseRouter() {
		return (ResponseRouterType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_SingleResponseRouter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSingleResponseRouter(ResponseRouterType newSingleResponseRouter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_SingleResponseRouter(), newSingleResponseRouter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSingleResponseRouter(ResponseRouterType newSingleResponseRouter) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_SingleResponseRouter(), newSingleResponseRouter);
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
	public TransactionType getTransaction() {
		return (TransactionType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_Transaction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransaction(TransactionType newTransaction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_Transaction(), newTransaction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransaction(TransactionType newTransaction) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_Transaction(), newTransaction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionRefFactoryType getTransactionFactory() {
		return (TransactionRefFactoryType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransactionFactory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionFactory(TransactionRefFactoryType newTransactionFactory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransactionFactory(), newTransactionFactory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionFactory(TransactionRefFactoryType newTransactionFactory) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransactionFactory(), newTransactionFactory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionManagerType getTransactionManagerJboss() {
		return (TransactionManagerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJboss(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionManagerJboss(TransactionManagerType newTransactionManagerJboss, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJboss(), newTransactionManagerJboss, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionManagerJboss(TransactionManagerType newTransactionManagerJboss) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJboss(), newTransactionManagerJboss);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionManagerType getTransactionManagerJndi() {
		return (TransactionManagerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJndi(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionManagerJndi(TransactionManagerType newTransactionManagerJndi, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJndi(), newTransactionManagerJndi, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionManagerJndi(TransactionManagerType newTransactionManagerJndi) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJndi(), newTransactionManagerJndi);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionManagerType getTransactionManagerJrun() {
		return (TransactionManagerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJrun(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionManagerJrun(TransactionManagerType newTransactionManagerJrun, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJrun(), newTransactionManagerJrun, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionManagerJrun(TransactionManagerType newTransactionManagerJrun) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJrun(), newTransactionManagerJrun);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionManagerType getTransactionManagerResin() {
		return (TransactionManagerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerResin(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionManagerResin(TransactionManagerType newTransactionManagerResin, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerResin(), newTransactionManagerResin, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionManagerResin(TransactionManagerType newTransactionManagerResin) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerResin(), newTransactionManagerResin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JndiTransactionManagerType getTransactionManagerWeblogic() {
		return (JndiTransactionManagerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerWeblogic(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionManagerWeblogic(JndiTransactionManagerType newTransactionManagerWeblogic, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerWeblogic(), newTransactionManagerWeblogic, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionManagerWeblogic(JndiTransactionManagerType newTransactionManagerWeblogic) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerWeblogic(), newTransactionManagerWeblogic);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionManagerType getTransactionManagerWebsphere() {
		return (TransactionManagerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerWebsphere(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionManagerWebsphere(TransactionManagerType newTransactionManagerWebsphere, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerWebsphere(), newTransactionManagerWebsphere, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionManagerWebsphere(TransactionManagerType newTransactionManagerWebsphere) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerWebsphere(), newTransactionManagerWebsphere);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerRefType getTransformer() {
		return (TransformerRefType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_Transformer(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformer(TransformerRefType newTransformer, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_Transformer(), newTransformer, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformer(TransformerRefType newTransformer) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_Transformer(), newTransformer);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerAppendStringType getTransformerAppendString() {
		return (TransformerAppendStringType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerAppendString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerAppendString(TransformerAppendStringType newTransformerAppendString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerAppendString(), newTransformerAppendString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerAppendString(TransformerAppendStringType newTransformerAppendString) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerAppendString(), newTransformerAppendString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerBase64Decoder() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerBase64Decoder(AbstractTransformerType newTransformerBase64Decoder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(), newTransformerBase64Decoder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerBase64Decoder(AbstractTransformerType newTransformerBase64Decoder) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(), newTransformerBase64Decoder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerBase64Encoder() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerBase64Encoder(AbstractTransformerType newTransformerBase64Encoder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(), newTransformerBase64Encoder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerBase64Encoder(AbstractTransformerType newTransformerBase64Encoder) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(), newTransformerBase64Encoder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerByteArrayToHexString() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerByteArrayToHexString(AbstractTransformerType newTransformerByteArrayToHexString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(), newTransformerByteArrayToHexString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerByteArrayToHexString(AbstractTransformerType newTransformerByteArrayToHexString) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(), newTransformerByteArrayToHexString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerByteArrayToObject() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerByteArrayToObject(AbstractTransformerType newTransformerByteArrayToObject, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(), newTransformerByteArrayToObject, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerByteArrayToObject(AbstractTransformerType newTransformerByteArrayToObject) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(), newTransformerByteArrayToObject);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerByteArrayToSerializable() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerByteArrayToSerializable(AbstractTransformerType newTransformerByteArrayToSerializable, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(), newTransformerByteArrayToSerializable, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerByteArrayToSerializable(AbstractTransformerType newTransformerByteArrayToSerializable) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(), newTransformerByteArrayToSerializable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerByteArrayToString() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerByteArrayToString(AbstractTransformerType newTransformerByteArrayToString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(), newTransformerByteArrayToString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerByteArrayToString(AbstractTransformerType newTransformerByteArrayToString) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(), newTransformerByteArrayToString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerDecrypt() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerDecrypt(AbstractTransformerType newTransformerDecrypt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(), newTransformerDecrypt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerDecrypt(AbstractTransformerType newTransformerDecrypt) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(), newTransformerDecrypt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerEncrypt() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerEncrypt(AbstractTransformerType newTransformerEncrypt, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(), newTransformerEncrypt, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerEncrypt(AbstractTransformerType newTransformerEncrypt) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(), newTransformerEncrypt);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerGzipCompress() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerGzipCompress(AbstractTransformerType newTransformerGzipCompress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(), newTransformerGzipCompress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerGzipCompress(AbstractTransformerType newTransformerGzipCompress) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(), newTransformerGzipCompress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerGzipUncompress() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerGzipUncompress(AbstractTransformerType newTransformerGzipUncompress, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(), newTransformerGzipUncompress, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerGzipUncompress(AbstractTransformerType newTransformerGzipUncompress) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(), newTransformerGzipUncompress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerHexStingToByteArray() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerHexStingToByteArray(AbstractTransformerType newTransformerHexStingToByteArray, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(), newTransformerHexStingToByteArray, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerHexStingToByteArray(AbstractTransformerType newTransformerHexStingToByteArray) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(), newTransformerHexStingToByteArray);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagePropertiesTransformerType getTransformerMessageProperties() {
		return (MessagePropertiesTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerMessageProperties(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerMessageProperties(MessagePropertiesTransformerType newTransformerMessageProperties, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerMessageProperties(), newTransformerMessageProperties, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerMessageProperties(MessagePropertiesTransformerType newTransformerMessageProperties) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerMessageProperties(), newTransformerMessageProperties);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerNoAction() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerNoAction(AbstractTransformerType newTransformerNoAction, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(), newTransformerNoAction, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerNoAction(AbstractTransformerType newTransformerNoAction) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(), newTransformerNoAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerObjectToByteArray() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerObjectToByteArray(AbstractTransformerType newTransformerObjectToByteArray, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(), newTransformerObjectToByteArray, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerObjectToByteArray(AbstractTransformerType newTransformerObjectToByteArray) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(), newTransformerObjectToByteArray);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerObjectToString() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerObjectToString(AbstractTransformerType newTransformerObjectToString, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(), newTransformerObjectToString, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerObjectToString(AbstractTransformerType newTransformerObjectToString) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(), newTransformerObjectToString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerSerializableToByteArray() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerSerializableToByteArray(AbstractTransformerType newTransformerSerializableToByteArray, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(), newTransformerSerializableToByteArray, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerSerializableToByteArray(AbstractTransformerType newTransformerSerializableToByteArray) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(), newTransformerSerializableToByteArray);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerStringToByteArray() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerStringToByteArray(AbstractTransformerType newTransformerStringToByteArray, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(), newTransformerStringToByteArray, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerStringToByteArray(AbstractTransformerType newTransformerStringToByteArray) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(), newTransformerStringToByteArray);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerUcDecoder() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerUcDecoder(AbstractTransformerType newTransformerUcDecoder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(), newTransformerUcDecoder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerUcDecoder(AbstractTransformerType newTransformerUcDecoder) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(), newTransformerUcDecoder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerUcEncoder() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerUcEncoder(AbstractTransformerType newTransformerUcEncoder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(), newTransformerUcEncoder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerUcEncoder(AbstractTransformerType newTransformerUcEncoder) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(), newTransformerUcEncoder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerUuDecoder() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerUuDecoder(AbstractTransformerType newTransformerUuDecoder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(), newTransformerUuDecoder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerUuDecoder(AbstractTransformerType newTransformerUuDecoder) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(), newTransformerUuDecoder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerUuEncoder() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerUuEncoder(AbstractTransformerType newTransformerUuEncoder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(), newTransformerUuEncoder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerUuEncoder(AbstractTransformerType newTransformerUuEncoder) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(), newTransformerUuEncoder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerXmlEntityDecoder() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerXmlEntityDecoder(AbstractTransformerType newTransformerXmlEntityDecoder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(), newTransformerXmlEntityDecoder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerXmlEntityDecoder(AbstractTransformerType newTransformerXmlEntityDecoder) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(), newTransformerXmlEntityDecoder);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType getTransformerXmlEntityEncoder() {
		return (AbstractTransformerType)getMixed().get(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransformerXmlEntityEncoder(AbstractTransformerType newTransformerXmlEntityEncoder, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(), newTransformerXmlEntityEncoder, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerXmlEntityEncoder(AbstractTransformerType newTransformerXmlEntityEncoder) {
		((FeatureMap.Internal)getMixed()).set(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(), newTransformerXmlEntityEncoder);
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CorePackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case CorePackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
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
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_ENTRYPOINT_RESOLVER:
				return basicSetAbstractEntrypointResolver(null, msgs);
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
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_RESPONSE_ENDPOINT:
				return basicSetAbstractResponseEndpoint(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_RESPONSE_ROUTER:
				return basicSetAbstractResponseRouter(null, msgs);
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
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION_FACTORY:
				return basicSetAbstractTransactionFactory(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION_MANAGER:
				return basicSetAbstractTransactionManager(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSFORMER:
				return basicSetAbstractTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__AND_FILTER:
				return basicSetAndFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__BEAN_PROPERTY_EXTRACTOR:
				return basicSetBeanPropertyExtractor(null, msgs);
			case CorePackage.DOCUMENT_ROOT__BRIDGE_COMPONENT:
				return basicSetBridgeComponent(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CALLABLE_ENTRYPOINT_RESOLVER:
				return basicSetCallableEntrypointResolver(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CHAINING_ROUTER:
				return basicSetChainingRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__COMPONENT:
				return basicSetComponent(null, msgs);
			case CorePackage.DOCUMENT_ROOT__COMPONENT_THREADING_PROFILE:
				return basicSetComponentThreadingProfile(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CORRELATION_AGGREGATOR_ROUTER:
				return basicSetCorrelationAggregatorRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_EXTRACTOR:
				return basicSetCorrelationPropertyExtractor(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CORRELATION_RESEQUENCER_ROUTER:
				return basicSetCorrelationResequencerRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CATCH_ALL_STRATEGY:
				return basicSetCustomCatchAllStrategy(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTION_STRATEGY:
				return basicSetCustomConnectionStrategy(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTOR:
				return basicSetCustomConnector(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONTAINER:
				return basicSetCustomContainer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ENTRYPOINT_RESOLVER:
				return basicSetCustomEntrypointResolver(null, msgs);
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
			case CorePackage.DOCUMENT_ROOT__CUSTOM_RESPONSE_ROUTER:
				return basicSetCustomResponseRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION_FACTORY:
				return basicSetCustomTransactionFactory(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION_MANAGER:
				return basicSetCustomTransactionManager(null, msgs);
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSFORMER:
				return basicSetCustomTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__DEFAULT_CONNECTOR_EXCEPTION_STRATEGY:
				return basicSetDefaultConnectorExceptionStrategy(null, msgs);
			case CorePackage.DOCUMENT_ROOT__DEFAULT_SERVICE_EXCEPTION_STRATEGY:
				return basicSetDefaultServiceExceptionStrategy(null, msgs);
			case CorePackage.DOCUMENT_ROOT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ECHO_COMPONENT:
				return basicSetEchoComponent(null, msgs);
			case CorePackage.DOCUMENT_ROOT__EJB_CONTAINER:
				return basicSetEjbContainer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ENCRYPTION_SECURITY_FILTER:
				return basicSetEncryptionSecurityFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ENDPOINT:
				return basicSetEndpoint(null, msgs);
			case CorePackage.DOCUMENT_ROOT__ENDPOINT_SELECTOR_ROUTER:
				return basicSetEndpointSelectorRouter(null, msgs);
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
			case CorePackage.DOCUMENT_ROOT__JNDI_CONTAINER:
				return basicSetJndiContainer(null, msgs);
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
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_EXTRACTOR:
				return basicSetMessagePropertyExtractor(null, msgs);
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_FILTER:
				return basicSetMessagePropertyFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__MODEL:
				return basicSetModel(null, msgs);
			case CorePackage.DOCUMENT_ROOT__MULE:
				return basicSetMule(null, msgs);
			case CorePackage.DOCUMENT_ROOT__MULE_UNSAFE:
				return basicSetMuleUnsafe(null, msgs);
			case CorePackage.DOCUMENT_ROOT__MULTICASTING_ROUTER:
				return basicSetMulticastingRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__NO_ARGS_CALL_COMPONENT:
				return basicSetNoArgsCallComponent(null, msgs);
			case CorePackage.DOCUMENT_ROOT__NOT_FILTER:
				return basicSetNotFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__NULL_COMPONENT:
				return basicSetNullComponent(null, msgs);
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
			case CorePackage.DOCUMENT_ROOT__PROTOTYPE_OBJECT:
				return basicSetPrototypeObject(null, msgs);
			case CorePackage.DOCUMENT_ROOT__QUEUE_PROFILE:
				return basicSetQueueProfile(null, msgs);
			case CorePackage.DOCUMENT_ROOT__REGEX_FILTER:
				return basicSetRegexFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__RESPONSE_ENDPOINT:
				return basicSetResponseEndpoint(null, msgs);
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
			case CorePackage.DOCUMENT_ROOT__SERVICE:
				return basicSetService(null, msgs);
			case CorePackage.DOCUMENT_ROOT__SINGLE_RESPONSE_ROUTER:
				return basicSetSingleResponseRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__SINGLETON_OBJECT:
				return basicSetSingletonObject(null, msgs);
			case CorePackage.DOCUMENT_ROOT__STATIC_RECIPIENT_LIST_ROUTER:
				return basicSetStaticRecipientListRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TEMPLATE_ENDPOINT_ROUTER:
				return basicSetTemplateEndpointRouter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSACTION:
				return basicSetTransaction(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_FACTORY:
				return basicSetTransactionFactory(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_JBOSS:
				return basicSetTransactionManagerJboss(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_JNDI:
				return basicSetTransactionManagerJndi(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_JRUN:
				return basicSetTransactionManagerJrun(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_RESIN:
				return basicSetTransactionManagerResin(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_WEBLOGIC:
				return basicSetTransactionManagerWeblogic(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_WEBSPHERE:
				return basicSetTransactionManagerWebsphere(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER:
				return basicSetTransformer(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_APPEND_STRING:
				return basicSetTransformerAppendString(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BASE64_DECODER:
				return basicSetTransformerBase64Decoder(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BASE64_ENCODER:
				return basicSetTransformerBase64Encoder(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_HEX_STRING:
				return basicSetTransformerByteArrayToHexString(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_OBJECT:
				return basicSetTransformerByteArrayToObject(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_SERIALIZABLE:
				return basicSetTransformerByteArrayToSerializable(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_STRING:
				return basicSetTransformerByteArrayToString(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_DECRYPT:
				return basicSetTransformerDecrypt(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_ENCRYPT:
				return basicSetTransformerEncrypt(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_GZIP_COMPRESS:
				return basicSetTransformerGzipCompress(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_GZIP_UNCOMPRESS:
				return basicSetTransformerGzipUncompress(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_HEX_STING_TO_BYTE_ARRAY:
				return basicSetTransformerHexStingToByteArray(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_MESSAGE_PROPERTIES:
				return basicSetTransformerMessageProperties(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_NO_ACTION:
				return basicSetTransformerNoAction(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_OBJECT_TO_BYTE_ARRAY:
				return basicSetTransformerObjectToByteArray(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_OBJECT_TO_STRING:
				return basicSetTransformerObjectToString(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_SERIALIZABLE_TO_BYTE_ARRAY:
				return basicSetTransformerSerializableToByteArray(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_STRING_TO_BYTE_ARRAY:
				return basicSetTransformerStringToByteArray(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UC_DECODER:
				return basicSetTransformerUcDecoder(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UC_ENCODER:
				return basicSetTransformerUcEncoder(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UU_DECODER:
				return basicSetTransformerUuDecoder(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UU_ENCODER:
				return basicSetTransformerUuEncoder(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_XML_ENTITY_DECODER:
				return basicSetTransformerXmlEntityDecoder(null, msgs);
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_XML_ENTITY_ENCODER:
				return basicSetTransformerXmlEntityEncoder(null, msgs);
			case CorePackage.DOCUMENT_ROOT__WILDCARD_FILTER:
				return basicSetWildcardFilter(null, msgs);
			case CorePackage.DOCUMENT_ROOT__WIRE_TAP_ROUTER:
				return basicSetWireTapRouter(null, msgs);
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
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_ENTRYPOINT_RESOLVER:
				return getAbstractEntrypointResolver();
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
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_RESPONSE_ENDPOINT:
				return getAbstractResponseEndpoint();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_RESPONSE_ROUTER:
				return getAbstractResponseRouter();
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
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION_FACTORY:
				return getAbstractTransactionFactory();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION_MANAGER:
				return getAbstractTransactionManager();
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSFORMER:
				return getAbstractTransformer();
			case CorePackage.DOCUMENT_ROOT__AND_FILTER:
				return getAndFilter();
			case CorePackage.DOCUMENT_ROOT__BEAN_PROPERTY_EXTRACTOR:
				return getBeanPropertyExtractor();
			case CorePackage.DOCUMENT_ROOT__BRIDGE_COMPONENT:
				return getBridgeComponent();
			case CorePackage.DOCUMENT_ROOT__CALLABLE_ENTRYPOINT_RESOLVER:
				return getCallableEntrypointResolver();
			case CorePackage.DOCUMENT_ROOT__CHAINING_ROUTER:
				return getChainingRouter();
			case CorePackage.DOCUMENT_ROOT__COMPONENT:
				return getComponent();
			case CorePackage.DOCUMENT_ROOT__COMPONENT_THREADING_PROFILE:
				return getComponentThreadingProfile();
			case CorePackage.DOCUMENT_ROOT__CORRELATION_AGGREGATOR_ROUTER:
				return getCorrelationAggregatorRouter();
			case CorePackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_EXTRACTOR:
				return getCorrelationPropertyExtractor();
			case CorePackage.DOCUMENT_ROOT__CORRELATION_RESEQUENCER_ROUTER:
				return getCorrelationResequencerRouter();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CATCH_ALL_STRATEGY:
				return getCustomCatchAllStrategy();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTION_STRATEGY:
				return getCustomConnectionStrategy();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTOR:
				return getCustomConnector();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONTAINER:
				return getCustomContainer();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ENTRYPOINT_RESOLVER:
				return getCustomEntrypointResolver();
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
			case CorePackage.DOCUMENT_ROOT__CUSTOM_RESPONSE_ROUTER:
				return getCustomResponseRouter();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION_FACTORY:
				return getCustomTransactionFactory();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION_MANAGER:
				return getCustomTransactionManager();
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSFORMER:
				return getCustomTransformer();
			case CorePackage.DOCUMENT_ROOT__DEFAULT_CONNECTOR_EXCEPTION_STRATEGY:
				return getDefaultConnectorExceptionStrategy();
			case CorePackage.DOCUMENT_ROOT__DEFAULT_SERVICE_EXCEPTION_STRATEGY:
				return getDefaultServiceExceptionStrategy();
			case CorePackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription();
			case CorePackage.DOCUMENT_ROOT__ECHO_COMPONENT:
				return getEchoComponent();
			case CorePackage.DOCUMENT_ROOT__EJB_CONTAINER:
				return getEjbContainer();
			case CorePackage.DOCUMENT_ROOT__ENCRYPTION_SECURITY_FILTER:
				return getEncryptionSecurityFilter();
			case CorePackage.DOCUMENT_ROOT__ENDPOINT:
				return getEndpoint();
			case CorePackage.DOCUMENT_ROOT__ENDPOINT_SELECTOR_ROUTER:
				return getEndpointSelectorRouter();
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
			case CorePackage.DOCUMENT_ROOT__JNDI_CONTAINER:
				return getJndiContainer();
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
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_EXTRACTOR:
				return getMessagePropertyExtractor();
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_FILTER:
				return getMessagePropertyFilter();
			case CorePackage.DOCUMENT_ROOT__MODEL:
				return getModel();
			case CorePackage.DOCUMENT_ROOT__MULE:
				return getMule();
			case CorePackage.DOCUMENT_ROOT__MULE_UNSAFE:
				return getMuleUnsafe();
			case CorePackage.DOCUMENT_ROOT__MULTICASTING_ROUTER:
				return getMulticastingRouter();
			case CorePackage.DOCUMENT_ROOT__NO_ARGS_CALL_COMPONENT:
				return getNoArgsCallComponent();
			case CorePackage.DOCUMENT_ROOT__NOT_FILTER:
				return getNotFilter();
			case CorePackage.DOCUMENT_ROOT__NULL_COMPONENT:
				return getNullComponent();
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
			case CorePackage.DOCUMENT_ROOT__PROTOTYPE_OBJECT:
				return getPrototypeObject();
			case CorePackage.DOCUMENT_ROOT__QUEUE_PROFILE:
				return getQueueProfile();
			case CorePackage.DOCUMENT_ROOT__REGEX_FILTER:
				return getRegexFilter();
			case CorePackage.DOCUMENT_ROOT__RESPONSE_ENDPOINT:
				return getResponseEndpoint();
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
			case CorePackage.DOCUMENT_ROOT__SERVICE:
				return getService();
			case CorePackage.DOCUMENT_ROOT__SINGLE_RESPONSE_ROUTER:
				return getSingleResponseRouter();
			case CorePackage.DOCUMENT_ROOT__SINGLETON_OBJECT:
				return getSingletonObject();
			case CorePackage.DOCUMENT_ROOT__STATIC_RECIPIENT_LIST_ROUTER:
				return getStaticRecipientListRouter();
			case CorePackage.DOCUMENT_ROOT__TEMPLATE_ENDPOINT_ROUTER:
				return getTemplateEndpointRouter();
			case CorePackage.DOCUMENT_ROOT__TRANSACTION:
				return getTransaction();
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_FACTORY:
				return getTransactionFactory();
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_JBOSS:
				return getTransactionManagerJboss();
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_JNDI:
				return getTransactionManagerJndi();
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_JRUN:
				return getTransactionManagerJrun();
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_RESIN:
				return getTransactionManagerResin();
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_WEBLOGIC:
				return getTransactionManagerWeblogic();
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_WEBSPHERE:
				return getTransactionManagerWebsphere();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER:
				return getTransformer();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_APPEND_STRING:
				return getTransformerAppendString();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BASE64_DECODER:
				return getTransformerBase64Decoder();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BASE64_ENCODER:
				return getTransformerBase64Encoder();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_HEX_STRING:
				return getTransformerByteArrayToHexString();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_OBJECT:
				return getTransformerByteArrayToObject();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_SERIALIZABLE:
				return getTransformerByteArrayToSerializable();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_STRING:
				return getTransformerByteArrayToString();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_DECRYPT:
				return getTransformerDecrypt();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_ENCRYPT:
				return getTransformerEncrypt();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_GZIP_COMPRESS:
				return getTransformerGzipCompress();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_GZIP_UNCOMPRESS:
				return getTransformerGzipUncompress();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_HEX_STING_TO_BYTE_ARRAY:
				return getTransformerHexStingToByteArray();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_MESSAGE_PROPERTIES:
				return getTransformerMessageProperties();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_NO_ACTION:
				return getTransformerNoAction();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_OBJECT_TO_BYTE_ARRAY:
				return getTransformerObjectToByteArray();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_OBJECT_TO_STRING:
				return getTransformerObjectToString();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_SERIALIZABLE_TO_BYTE_ARRAY:
				return getTransformerSerializableToByteArray();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_STRING_TO_BYTE_ARRAY:
				return getTransformerStringToByteArray();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UC_DECODER:
				return getTransformerUcDecoder();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UC_ENCODER:
				return getTransformerUcEncoder();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UU_DECODER:
				return getTransformerUuDecoder();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UU_ENCODER:
				return getTransformerUuEncoder();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_XML_ENTITY_DECODER:
				return getTransformerXmlEntityDecoder();
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_XML_ENTITY_ENCODER:
				return getTransformerXmlEntityEncoder();
			case CorePackage.DOCUMENT_ROOT__WILDCARD_FILTER:
				return getWildcardFilter();
			case CorePackage.DOCUMENT_ROOT__WIRE_TAP_ROUTER:
				return getWireTapRouter();
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
			case CorePackage.DOCUMENT_ROOT__BEAN_PROPERTY_EXTRACTOR:
				setBeanPropertyExtractor((AbstractPropertyExtractorType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__BRIDGE_COMPONENT:
				setBridgeComponent((DefaultComponentType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CALLABLE_ENTRYPOINT_RESOLVER:
				setCallableEntrypointResolver((CallableEntrypointResolverType)newValue);
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
			case CorePackage.DOCUMENT_ROOT__CORRELATION_AGGREGATOR_ROUTER:
				setCorrelationAggregatorRouter((CorrelationAggregatorRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_EXTRACTOR:
				setCorrelationPropertyExtractor((AbstractPropertyExtractorType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CORRELATION_RESEQUENCER_ROUTER:
				setCorrelationResequencerRouter((CorrelationRouterType)newValue);
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
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ENTRYPOINT_RESOLVER:
				setCustomEntrypointResolver((CustomEntrypointResolverType)newValue);
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
				setCustomPropertyExtractor((EObject)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_RESPONSE_ROUTER:
				setCustomResponseRouter((CustomResponseRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION_FACTORY:
				setCustomTransactionFactory((CustomTransactionFactoryType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION_MANAGER:
				setCustomTransactionManager((CustomTransactionManagerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSFORMER:
				setCustomTransformer((CustomTransformerType)newValue);
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
			case CorePackage.DOCUMENT_ROOT__ECHO_COMPONENT:
				setEchoComponent((DefaultComponentType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__EJB_CONTAINER:
				setEjbContainer((RmiContainerContextType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__ENCRYPTION_SECURITY_FILTER:
				setEncryptionSecurityFilter((EncryptionSecurityFilterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__ENDPOINT:
				setEndpoint((GlobalEndpointType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__ENDPOINT_SELECTOR_ROUTER:
				setEndpointSelectorRouter((EndpointSelectorRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__EXCEPTION_BASED_ROUTER:
				setExceptionBasedRouter((FilteringOutboundRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__EXCEPTION_TYPE_FILTER:
				setExceptionTypeFilter((TypeFilterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__FILTER:
				setFilter((FilterRefType)newValue);
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
			case CorePackage.DOCUMENT_ROOT__HIVEMIND_CONTAINER:
				setHivemindContainer((IocContainerContextType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__IDEMPOTENT_RECEIVER_ROUTER:
				setIdempotentReceiverRouter((IdempotentReceiverType)newValue);
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
			case CorePackage.DOCUMENT_ROOT__JNDI_CONTAINER:
				setJndiContainer((BaseContainerContextType)newValue);
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
				setMessageChunkingAggregatorRouter((CorrelationRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_CHUNKING_ROUTER:
				setMessageChunkingRouter((ChunkingRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_EXTRACTOR:
				setMessagePropertyExtractor((AbstractPropertyExtractorType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_FILTER:
				setMessagePropertyFilter((PatternFilterType)newValue);
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
			case CorePackage.DOCUMENT_ROOT__NO_ARGS_CALL_COMPONENT:
				setNoArgsCallComponent((NoArgsCallWrapperType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__NOT_FILTER:
				setNotFilter((UnitaryFilterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__NULL_COMPONENT:
				setNullComponent((DefaultComponentType)newValue);
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
			case CorePackage.DOCUMENT_ROOT__PROTOTYPE_OBJECT:
				setPrototypeObject((PrototypeObjectFactoryType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__QUEUE_PROFILE:
				setQueueProfile((QueueProfileType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__REGEX_FILTER:
				setRegexFilter((PatternFilterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__RESPONSE_ENDPOINT:
				setResponseEndpoint((ResponseEndpointType)newValue);
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
			case CorePackage.DOCUMENT_ROOT__SERVICE:
				setService((SedaServiceType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__SINGLE_RESPONSE_ROUTER:
				setSingleResponseRouter((ResponseRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__SINGLETON_OBJECT:
				setSingletonObject((SingletonObjectFactoryType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__STATIC_RECIPIENT_LIST_ROUTER:
				setStaticRecipientListRouter((StaticRecipientListRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TEMPLATE_ENDPOINT_ROUTER:
				setTemplateEndpointRouter((FilteringOutboundRouterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION:
				setTransaction((TransactionType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_FACTORY:
				setTransactionFactory((TransactionRefFactoryType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_JBOSS:
				setTransactionManagerJboss((TransactionManagerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_JNDI:
				setTransactionManagerJndi((TransactionManagerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_JRUN:
				setTransactionManagerJrun((TransactionManagerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_RESIN:
				setTransactionManagerResin((TransactionManagerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_WEBLOGIC:
				setTransactionManagerWeblogic((JndiTransactionManagerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_WEBSPHERE:
				setTransactionManagerWebsphere((TransactionManagerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER:
				setTransformer((TransformerRefType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_APPEND_STRING:
				setTransformerAppendString((TransformerAppendStringType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BASE64_DECODER:
				setTransformerBase64Decoder((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BASE64_ENCODER:
				setTransformerBase64Encoder((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_HEX_STRING:
				setTransformerByteArrayToHexString((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_OBJECT:
				setTransformerByteArrayToObject((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_SERIALIZABLE:
				setTransformerByteArrayToSerializable((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_STRING:
				setTransformerByteArrayToString((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_DECRYPT:
				setTransformerDecrypt((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_ENCRYPT:
				setTransformerEncrypt((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_GZIP_COMPRESS:
				setTransformerGzipCompress((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_GZIP_UNCOMPRESS:
				setTransformerGzipUncompress((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_HEX_STING_TO_BYTE_ARRAY:
				setTransformerHexStingToByteArray((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_MESSAGE_PROPERTIES:
				setTransformerMessageProperties((MessagePropertiesTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_NO_ACTION:
				setTransformerNoAction((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_OBJECT_TO_BYTE_ARRAY:
				setTransformerObjectToByteArray((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_OBJECT_TO_STRING:
				setTransformerObjectToString((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_SERIALIZABLE_TO_BYTE_ARRAY:
				setTransformerSerializableToByteArray((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_STRING_TO_BYTE_ARRAY:
				setTransformerStringToByteArray((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UC_DECODER:
				setTransformerUcDecoder((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UC_ENCODER:
				setTransformerUcEncoder((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UU_DECODER:
				setTransformerUuDecoder((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UU_ENCODER:
				setTransformerUuEncoder((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_XML_ENTITY_DECODER:
				setTransformerXmlEntityDecoder((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_XML_ENTITY_ENCODER:
				setTransformerXmlEntityEncoder((AbstractTransformerType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__WILDCARD_FILTER:
				setWildcardFilter((WildcardFilterType)newValue);
				return;
			case CorePackage.DOCUMENT_ROOT__WIRE_TAP_ROUTER:
				setWireTapRouter((WireTapRouterType)newValue);
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
			case CorePackage.DOCUMENT_ROOT__BEAN_PROPERTY_EXTRACTOR:
				setBeanPropertyExtractor((AbstractPropertyExtractorType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__BRIDGE_COMPONENT:
				setBridgeComponent((DefaultComponentType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CALLABLE_ENTRYPOINT_RESOLVER:
				setCallableEntrypointResolver((CallableEntrypointResolverType)null);
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
			case CorePackage.DOCUMENT_ROOT__CORRELATION_AGGREGATOR_ROUTER:
				setCorrelationAggregatorRouter((CorrelationAggregatorRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_EXTRACTOR:
				setCorrelationPropertyExtractor((AbstractPropertyExtractorType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CORRELATION_RESEQUENCER_ROUTER:
				setCorrelationResequencerRouter((CorrelationRouterType)null);
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
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ENTRYPOINT_RESOLVER:
				setCustomEntrypointResolver((CustomEntrypointResolverType)null);
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
				setCustomPropertyExtractor((EObject)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_RESPONSE_ROUTER:
				setCustomResponseRouter((CustomResponseRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION_FACTORY:
				setCustomTransactionFactory((CustomTransactionFactoryType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION_MANAGER:
				setCustomTransactionManager((CustomTransactionManagerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSFORMER:
				setCustomTransformer((CustomTransformerType)null);
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
			case CorePackage.DOCUMENT_ROOT__ECHO_COMPONENT:
				setEchoComponent((DefaultComponentType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__EJB_CONTAINER:
				setEjbContainer((RmiContainerContextType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__ENCRYPTION_SECURITY_FILTER:
				setEncryptionSecurityFilter((EncryptionSecurityFilterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__ENDPOINT:
				setEndpoint((GlobalEndpointType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__ENDPOINT_SELECTOR_ROUTER:
				setEndpointSelectorRouter((EndpointSelectorRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__EXCEPTION_BASED_ROUTER:
				setExceptionBasedRouter((FilteringOutboundRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__EXCEPTION_TYPE_FILTER:
				setExceptionTypeFilter((TypeFilterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__FILTER:
				setFilter((FilterRefType)null);
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
			case CorePackage.DOCUMENT_ROOT__HIVEMIND_CONTAINER:
				setHivemindContainer((IocContainerContextType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__IDEMPOTENT_RECEIVER_ROUTER:
				setIdempotentReceiverRouter((IdempotentReceiverType)null);
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
			case CorePackage.DOCUMENT_ROOT__JNDI_CONTAINER:
				setJndiContainer((BaseContainerContextType)null);
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
				setMessageChunkingAggregatorRouter((CorrelationRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_CHUNKING_ROUTER:
				setMessageChunkingRouter((ChunkingRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_EXTRACTOR:
				setMessagePropertyExtractor((AbstractPropertyExtractorType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_FILTER:
				setMessagePropertyFilter((PatternFilterType)null);
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
			case CorePackage.DOCUMENT_ROOT__NO_ARGS_CALL_COMPONENT:
				setNoArgsCallComponent((NoArgsCallWrapperType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__NOT_FILTER:
				setNotFilter((UnitaryFilterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__NULL_COMPONENT:
				setNullComponent((DefaultComponentType)null);
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
			case CorePackage.DOCUMENT_ROOT__PROTOTYPE_OBJECT:
				setPrototypeObject((PrototypeObjectFactoryType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__QUEUE_PROFILE:
				setQueueProfile((QueueProfileType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__REGEX_FILTER:
				setRegexFilter((PatternFilterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__RESPONSE_ENDPOINT:
				setResponseEndpoint((ResponseEndpointType)null);
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
			case CorePackage.DOCUMENT_ROOT__SERVICE:
				setService((SedaServiceType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__SINGLE_RESPONSE_ROUTER:
				setSingleResponseRouter((ResponseRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__SINGLETON_OBJECT:
				setSingletonObject((SingletonObjectFactoryType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__STATIC_RECIPIENT_LIST_ROUTER:
				setStaticRecipientListRouter((StaticRecipientListRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TEMPLATE_ENDPOINT_ROUTER:
				setTemplateEndpointRouter((FilteringOutboundRouterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION:
				setTransaction((TransactionType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_FACTORY:
				setTransactionFactory((TransactionRefFactoryType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_JBOSS:
				setTransactionManagerJboss((TransactionManagerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_JNDI:
				setTransactionManagerJndi((TransactionManagerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_JRUN:
				setTransactionManagerJrun((TransactionManagerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_RESIN:
				setTransactionManagerResin((TransactionManagerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_WEBLOGIC:
				setTransactionManagerWeblogic((JndiTransactionManagerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_WEBSPHERE:
				setTransactionManagerWebsphere((TransactionManagerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER:
				setTransformer((TransformerRefType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_APPEND_STRING:
				setTransformerAppendString((TransformerAppendStringType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BASE64_DECODER:
				setTransformerBase64Decoder((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BASE64_ENCODER:
				setTransformerBase64Encoder((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_HEX_STRING:
				setTransformerByteArrayToHexString((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_OBJECT:
				setTransformerByteArrayToObject((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_SERIALIZABLE:
				setTransformerByteArrayToSerializable((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_STRING:
				setTransformerByteArrayToString((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_DECRYPT:
				setTransformerDecrypt((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_ENCRYPT:
				setTransformerEncrypt((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_GZIP_COMPRESS:
				setTransformerGzipCompress((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_GZIP_UNCOMPRESS:
				setTransformerGzipUncompress((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_HEX_STING_TO_BYTE_ARRAY:
				setTransformerHexStingToByteArray((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_MESSAGE_PROPERTIES:
				setTransformerMessageProperties((MessagePropertiesTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_NO_ACTION:
				setTransformerNoAction((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_OBJECT_TO_BYTE_ARRAY:
				setTransformerObjectToByteArray((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_OBJECT_TO_STRING:
				setTransformerObjectToString((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_SERIALIZABLE_TO_BYTE_ARRAY:
				setTransformerSerializableToByteArray((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_STRING_TO_BYTE_ARRAY:
				setTransformerStringToByteArray((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UC_DECODER:
				setTransformerUcDecoder((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UC_ENCODER:
				setTransformerUcEncoder((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UU_DECODER:
				setTransformerUuDecoder((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UU_ENCODER:
				setTransformerUuEncoder((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_XML_ENTITY_DECODER:
				setTransformerXmlEntityDecoder((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_XML_ENTITY_ENCODER:
				setTransformerXmlEntityEncoder((AbstractTransformerType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__WILDCARD_FILTER:
				setWildcardFilter((WildcardFilterType)null);
				return;
			case CorePackage.DOCUMENT_ROOT__WIRE_TAP_ROUTER:
				setWireTapRouter((WireTapRouterType)null);
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
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_ENTRYPOINT_RESOLVER:
				return getAbstractEntrypointResolver() != null;
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
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_RESPONSE_ENDPOINT:
				return getAbstractResponseEndpoint() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_RESPONSE_ROUTER:
				return getAbstractResponseRouter() != null;
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
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION_FACTORY:
				return getAbstractTransactionFactory() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION_MANAGER:
				return getAbstractTransactionManager() != null;
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSFORMER:
				return getAbstractTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__AND_FILTER:
				return getAndFilter() != null;
			case CorePackage.DOCUMENT_ROOT__BEAN_PROPERTY_EXTRACTOR:
				return getBeanPropertyExtractor() != null;
			case CorePackage.DOCUMENT_ROOT__BRIDGE_COMPONENT:
				return getBridgeComponent() != null;
			case CorePackage.DOCUMENT_ROOT__CALLABLE_ENTRYPOINT_RESOLVER:
				return getCallableEntrypointResolver() != null;
			case CorePackage.DOCUMENT_ROOT__CHAINING_ROUTER:
				return getChainingRouter() != null;
			case CorePackage.DOCUMENT_ROOT__COMPONENT:
				return getComponent() != null;
			case CorePackage.DOCUMENT_ROOT__COMPONENT_THREADING_PROFILE:
				return getComponentThreadingProfile() != null;
			case CorePackage.DOCUMENT_ROOT__CORRELATION_AGGREGATOR_ROUTER:
				return getCorrelationAggregatorRouter() != null;
			case CorePackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_EXTRACTOR:
				return getCorrelationPropertyExtractor() != null;
			case CorePackage.DOCUMENT_ROOT__CORRELATION_RESEQUENCER_ROUTER:
				return getCorrelationResequencerRouter() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CATCH_ALL_STRATEGY:
				return getCustomCatchAllStrategy() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTION_STRATEGY:
				return getCustomConnectionStrategy() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTOR:
				return getCustomConnector() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONTAINER:
				return getCustomContainer() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ENTRYPOINT_RESOLVER:
				return getCustomEntrypointResolver() != null;
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
			case CorePackage.DOCUMENT_ROOT__CUSTOM_RESPONSE_ROUTER:
				return getCustomResponseRouter() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION_FACTORY:
				return getCustomTransactionFactory() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION_MANAGER:
				return getCustomTransactionManager() != null;
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSFORMER:
				return getCustomTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__DEFAULT_CONNECTOR_EXCEPTION_STRATEGY:
				return getDefaultConnectorExceptionStrategy() != null;
			case CorePackage.DOCUMENT_ROOT__DEFAULT_SERVICE_EXCEPTION_STRATEGY:
				return getDefaultServiceExceptionStrategy() != null;
			case CorePackage.DOCUMENT_ROOT__DESCRIPTION:
				return getDescription() != null;
			case CorePackage.DOCUMENT_ROOT__ECHO_COMPONENT:
				return getEchoComponent() != null;
			case CorePackage.DOCUMENT_ROOT__EJB_CONTAINER:
				return getEjbContainer() != null;
			case CorePackage.DOCUMENT_ROOT__ENCRYPTION_SECURITY_FILTER:
				return getEncryptionSecurityFilter() != null;
			case CorePackage.DOCUMENT_ROOT__ENDPOINT:
				return getEndpoint() != null;
			case CorePackage.DOCUMENT_ROOT__ENDPOINT_SELECTOR_ROUTER:
				return getEndpointSelectorRouter() != null;
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
			case CorePackage.DOCUMENT_ROOT__JNDI_CONTAINER:
				return getJndiContainer() != null;
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
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_EXTRACTOR:
				return getMessagePropertyExtractor() != null;
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_FILTER:
				return getMessagePropertyFilter() != null;
			case CorePackage.DOCUMENT_ROOT__MODEL:
				return getModel() != null;
			case CorePackage.DOCUMENT_ROOT__MULE:
				return getMule() != null;
			case CorePackage.DOCUMENT_ROOT__MULE_UNSAFE:
				return getMuleUnsafe() != null;
			case CorePackage.DOCUMENT_ROOT__MULTICASTING_ROUTER:
				return getMulticastingRouter() != null;
			case CorePackage.DOCUMENT_ROOT__NO_ARGS_CALL_COMPONENT:
				return getNoArgsCallComponent() != null;
			case CorePackage.DOCUMENT_ROOT__NOT_FILTER:
				return getNotFilter() != null;
			case CorePackage.DOCUMENT_ROOT__NULL_COMPONENT:
				return getNullComponent() != null;
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
			case CorePackage.DOCUMENT_ROOT__PROTOTYPE_OBJECT:
				return getPrototypeObject() != null;
			case CorePackage.DOCUMENT_ROOT__QUEUE_PROFILE:
				return getQueueProfile() != null;
			case CorePackage.DOCUMENT_ROOT__REGEX_FILTER:
				return getRegexFilter() != null;
			case CorePackage.DOCUMENT_ROOT__RESPONSE_ENDPOINT:
				return getResponseEndpoint() != null;
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
			case CorePackage.DOCUMENT_ROOT__SERVICE:
				return getService() != null;
			case CorePackage.DOCUMENT_ROOT__SINGLE_RESPONSE_ROUTER:
				return getSingleResponseRouter() != null;
			case CorePackage.DOCUMENT_ROOT__SINGLETON_OBJECT:
				return getSingletonObject() != null;
			case CorePackage.DOCUMENT_ROOT__STATIC_RECIPIENT_LIST_ROUTER:
				return getStaticRecipientListRouter() != null;
			case CorePackage.DOCUMENT_ROOT__TEMPLATE_ENDPOINT_ROUTER:
				return getTemplateEndpointRouter() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION:
				return getTransaction() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_FACTORY:
				return getTransactionFactory() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_JBOSS:
				return getTransactionManagerJboss() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_JNDI:
				return getTransactionManagerJndi() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_JRUN:
				return getTransactionManagerJrun() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_RESIN:
				return getTransactionManagerResin() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_WEBLOGIC:
				return getTransactionManagerWeblogic() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_WEBSPHERE:
				return getTransactionManagerWebsphere() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER:
				return getTransformer() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_APPEND_STRING:
				return getTransformerAppendString() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BASE64_DECODER:
				return getTransformerBase64Decoder() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BASE64_ENCODER:
				return getTransformerBase64Encoder() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_HEX_STRING:
				return getTransformerByteArrayToHexString() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_OBJECT:
				return getTransformerByteArrayToObject() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_SERIALIZABLE:
				return getTransformerByteArrayToSerializable() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_STRING:
				return getTransformerByteArrayToString() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_DECRYPT:
				return getTransformerDecrypt() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_ENCRYPT:
				return getTransformerEncrypt() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_GZIP_COMPRESS:
				return getTransformerGzipCompress() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_GZIP_UNCOMPRESS:
				return getTransformerGzipUncompress() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_HEX_STING_TO_BYTE_ARRAY:
				return getTransformerHexStingToByteArray() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_MESSAGE_PROPERTIES:
				return getTransformerMessageProperties() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_NO_ACTION:
				return getTransformerNoAction() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_OBJECT_TO_BYTE_ARRAY:
				return getTransformerObjectToByteArray() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_OBJECT_TO_STRING:
				return getTransformerObjectToString() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_SERIALIZABLE_TO_BYTE_ARRAY:
				return getTransformerSerializableToByteArray() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_STRING_TO_BYTE_ARRAY:
				return getTransformerStringToByteArray() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UC_DECODER:
				return getTransformerUcDecoder() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UC_ENCODER:
				return getTransformerUcEncoder() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UU_DECODER:
				return getTransformerUuDecoder() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UU_ENCODER:
				return getTransformerUuEncoder() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_XML_ENTITY_DECODER:
				return getTransformerXmlEntityDecoder() != null;
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_XML_ENTITY_ENCODER:
				return getTransformerXmlEntityEncoder() != null;
			case CorePackage.DOCUMENT_ROOT__WILDCARD_FILTER:
				return getWildcardFilter() != null;
			case CorePackage.DOCUMENT_ROOT__WIRE_TAP_ROUTER:
				return getWireTapRouter() != null;
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
