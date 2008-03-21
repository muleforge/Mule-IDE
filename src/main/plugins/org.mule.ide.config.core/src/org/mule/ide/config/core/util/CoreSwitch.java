/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.mule.ide.config.core.*;

import org.mule.ide.config.spring.BaseCollectionType;
import org.mule.ide.config.spring.TypedCollectionType;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.core.CorePackage
 * @generated
 */
public class CoreSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CorePackage.ABSTRACT_AGENT_TYPE: {
				AbstractAgentType abstractAgentType = (AbstractAgentType)theEObject;
				T result = caseAbstractAgentType(abstractAgentType);
				if (result == null) result = caseAbstractExtensionType(abstractAgentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_ASYNC_REPLY_ROUTER_TYPE: {
				AbstractAsyncReplyRouterType abstractAsyncReplyRouterType = (AbstractAsyncReplyRouterType)theEObject;
				T result = caseAbstractAsyncReplyRouterType(abstractAsyncReplyRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_CATCH_ALL_STRATEGY_TYPE: {
				AbstractCatchAllStrategyType abstractCatchAllStrategyType = (AbstractCatchAllStrategyType)theEObject;
				T result = caseAbstractCatchAllStrategyType(abstractCatchAllStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE: {
				AbstractComponentThreadingProfileType abstractComponentThreadingProfileType = (AbstractComponentThreadingProfileType)theEObject;
				T result = caseAbstractComponentThreadingProfileType(abstractComponentThreadingProfileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_COMPONENT_TYPE: {
				AbstractComponentType abstractComponentType = (AbstractComponentType)theEObject;
				T result = caseAbstractComponentType(abstractComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_CONNECTION_STRATEGY_TYPE: {
				AbstractConnectionStrategyType abstractConnectionStrategyType = (AbstractConnectionStrategyType)theEObject;
				T result = caseAbstractConnectionStrategyType(abstractConnectionStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_CONNECTOR_TYPE: {
				AbstractConnectorType abstractConnectorType = (AbstractConnectorType)theEObject;
				T result = caseAbstractConnectorType(abstractConnectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_ENTRY_POINT_RESOLVER_SET_TYPE: {
				AbstractEntryPointResolverSetType abstractEntryPointResolverSetType = (AbstractEntryPointResolverSetType)theEObject;
				T result = caseAbstractEntryPointResolverSetType(abstractEntryPointResolverSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_ENTRY_POINT_RESOLVER_TYPE: {
				AbstractEntryPointResolverType abstractEntryPointResolverType = (AbstractEntryPointResolverType)theEObject;
				T result = caseAbstractEntryPointResolverType(abstractEntryPointResolverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE: {
				AbstractExceptionStrategyType abstractExceptionStrategyType = (AbstractExceptionStrategyType)theEObject;
				T result = caseAbstractExceptionStrategyType(abstractExceptionStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_EXTENSION_TYPE: {
				AbstractExtensionType abstractExtensionType = (AbstractExtensionType)theEObject;
				T result = caseAbstractExtensionType(abstractExtensionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_FILTER_TYPE: {
				AbstractFilterType abstractFilterType = (AbstractFilterType)theEObject;
				T result = caseAbstractFilterType(abstractFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE: {
				AbstractGlobalEndpointType abstractGlobalEndpointType = (AbstractGlobalEndpointType)theEObject;
				T result = caseAbstractGlobalEndpointType(abstractGlobalEndpointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE: {
				AbstractInboundEndpointType abstractInboundEndpointType = (AbstractInboundEndpointType)theEObject;
				T result = caseAbstractInboundEndpointType(abstractInboundEndpointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_INBOUND_ROUTER_TYPE: {
				AbstractInboundRouterType abstractInboundRouterType = (AbstractInboundRouterType)theEObject;
				T result = caseAbstractInboundRouterType(abstractInboundRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_LIFECYCLE_ADAPTER_FACTORY: {
				AbstractLifecycleAdapterFactory abstractLifecycleAdapterFactory = (AbstractLifecycleAdapterFactory)theEObject;
				T result = caseAbstractLifecycleAdapterFactory(abstractLifecycleAdapterFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_MODEL_TYPE: {
				AbstractModelType abstractModelType = (AbstractModelType)theEObject;
				T result = caseAbstractModelType(abstractModelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_OBJECT_FACTORY_TYPE: {
				AbstractObjectFactoryType abstractObjectFactoryType = (AbstractObjectFactoryType)theEObject;
				T result = caseAbstractObjectFactoryType(abstractObjectFactoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE: {
				AbstractOutboundEndpointType abstractOutboundEndpointType = (AbstractOutboundEndpointType)theEObject;
				T result = caseAbstractOutboundEndpointType(abstractOutboundEndpointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_OUTBOUND_ROUTER_TYPE: {
				AbstractOutboundRouterType abstractOutboundRouterType = (AbstractOutboundRouterType)theEObject;
				T result = caseAbstractOutboundRouterType(abstractOutboundRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_POOLING_PROFILE_TYPE: {
				AbstractPoolingProfileType abstractPoolingProfileType = (AbstractPoolingProfileType)theEObject;
				T result = caseAbstractPoolingProfileType(abstractPoolingProfileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_PROPERTY_EXTRACTOR_TYPE: {
				AbstractPropertyExtractorType abstractPropertyExtractorType = (AbstractPropertyExtractorType)theEObject;
				T result = caseAbstractPropertyExtractorType(abstractPropertyExtractorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_QUEUE_PROFILE_TYPE: {
				AbstractQueueProfileType abstractQueueProfileType = (AbstractQueueProfileType)theEObject;
				T result = caseAbstractQueueProfileType(abstractQueueProfileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_SECURITY_FILTER_TYPE: {
				AbstractSecurityFilterType abstractSecurityFilterType = (AbstractSecurityFilterType)theEObject;
				T result = caseAbstractSecurityFilterType(abstractSecurityFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_SECURITY_MANAGER_TYPE: {
				AbstractSecurityManagerType abstractSecurityManagerType = (AbstractSecurityManagerType)theEObject;
				T result = caseAbstractSecurityManagerType(abstractSecurityManagerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_SERVICE_TYPE: {
				AbstractServiceType abstractServiceType = (AbstractServiceType)theEObject;
				T result = caseAbstractServiceType(abstractServiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_TRANSACTION_MANAGER_TYPE: {
				AbstractTransactionManagerType abstractTransactionManagerType = (AbstractTransactionManagerType)theEObject;
				T result = caseAbstractTransactionManagerType(abstractTransactionManagerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_TRANSACTION_TYPE: {
				AbstractTransactionType abstractTransactionType = (AbstractTransactionType)theEObject;
				T result = caseAbstractTransactionType(abstractTransactionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_TRANSFORMER_TYPE: {
				AbstractTransformerType abstractTransformerType = (AbstractTransformerType)theEObject;
				T result = caseAbstractTransformerType(abstractTransformerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.APPEND_STRING_TRANSFORMER_TYPE: {
				AppendStringTransformerType appendStringTransformerType = (AppendStringTransformerType)theEObject;
				T result = caseAppendStringTransformerType(appendStringTransformerType);
				if (result == null) result = caseAbstractTransformerType(appendStringTransformerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE: {
				AsyncReplyCollectionType asyncReplyCollectionType = (AsyncReplyCollectionType)theEObject;
				T result = caseAsyncReplyCollectionType(asyncReplyCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE: {
				AsyncReplyRouterType asyncReplyRouterType = (AsyncReplyRouterType)theEObject;
				T result = caseAsyncReplyRouterType(asyncReplyRouterType);
				if (result == null) result = caseAbstractAsyncReplyRouterType(asyncReplyRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BASE_ENTRY_POINT_RESOLVER_TYPE: {
				BaseEntryPointResolverType baseEntryPointResolverType = (BaseEntryPointResolverType)theEObject;
				T result = caseBaseEntryPointResolverType(baseEntryPointResolverType);
				if (result == null) result = caseAbstractEntryPointResolverType(baseEntryPointResolverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BASE_SERVICE_TYPE: {
				BaseServiceType baseServiceType = (BaseServiceType)theEObject;
				T result = caseBaseServiceType(baseServiceType);
				if (result == null) result = caseAbstractServiceType(baseServiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.BASE_TRANSACTION_TYPE: {
				BaseTransactionType baseTransactionType = (BaseTransactionType)theEObject;
				T result = caseBaseTransactionType(baseTransactionType);
				if (result == null) result = caseAbstractTransactionType(baseTransactionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CASE_SENSITIVE_PATTERN_FILTER_TYPE: {
				CaseSensitivePatternFilterType caseSensitivePatternFilterType = (CaseSensitivePatternFilterType)theEObject;
				T result = caseCaseSensitivePatternFilterType(caseSensitivePatternFilterType);
				if (result == null) result = casePatternFilterType(caseSensitivePatternFilterType);
				if (result == null) result = caseAbstractFilterType(caseSensitivePatternFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CHUNKING_ROUTER_TYPE: {
				ChunkingRouterType chunkingRouterType = (ChunkingRouterType)theEObject;
				T result = caseChunkingRouterType(chunkingRouterType);
				if (result == null) result = caseFilteringOutboundRouterType(chunkingRouterType);
				if (result == null) result = caseOutboundRouterType(chunkingRouterType);
				if (result == null) result = caseAbstractOutboundRouterType(chunkingRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.COLLECTION_FILTER_TYPE: {
				CollectionFilterType collectionFilterType = (CollectionFilterType)theEObject;
				T result = caseCollectionFilterType(collectionFilterType);
				if (result == null) result = caseAbstractFilterType(collectionFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.COMPLEX_ENTRY_POINT_RESOLVER_TYPE: {
				ComplexEntryPointResolverType complexEntryPointResolverType = (ComplexEntryPointResolverType)theEObject;
				T result = caseComplexEntryPointResolverType(complexEntryPointResolverType);
				if (result == null) result = caseReflectionEntryPointResolverType(complexEntryPointResolverType);
				if (result == null) result = caseBaseEntryPointResolverType(complexEntryPointResolverType);
				if (result == null) result = caseAbstractEntryPointResolverType(complexEntryPointResolverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONFIGURATION_TYPE: {
				ConfigurationType configurationType = (ConfigurationType)theEObject;
				T result = caseConfigurationType(configurationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONNECTION_STRATEGY_TYPE: {
				ConnectionStrategyType connectionStrategyType = (ConnectionStrategyType)theEObject;
				T result = caseConnectionStrategyType(connectionStrategyType);
				if (result == null) result = caseAbstractConnectionStrategyType(connectionStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONNECTOR_TYPE: {
				ConnectorType connectorType = (ConnectorType)theEObject;
				T result = caseConnectorType(connectorType);
				if (result == null) result = caseAbstractConnectorType(connectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_ASYNC_REPLY_ROUTER_TYPE: {
				CustomAsyncReplyRouterType customAsyncReplyRouterType = (CustomAsyncReplyRouterType)theEObject;
				T result = caseCustomAsyncReplyRouterType(customAsyncReplyRouterType);
				if (result == null) result = caseAsyncReplyRouterType(customAsyncReplyRouterType);
				if (result == null) result = caseAbstractAsyncReplyRouterType(customAsyncReplyRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_CATCH_ALL_STRATEGY_TYPE: {
				CustomCatchAllStrategyType customCatchAllStrategyType = (CustomCatchAllStrategyType)theEObject;
				T result = caseCustomCatchAllStrategyType(customCatchAllStrategyType);
				if (result == null) result = caseAbstractCatchAllStrategyType(customCatchAllStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_CONNECTION_STRATEGY_TYPE: {
				CustomConnectionStrategyType customConnectionStrategyType = (CustomConnectionStrategyType)theEObject;
				T result = caseCustomConnectionStrategyType(customConnectionStrategyType);
				if (result == null) result = caseConnectionStrategyType(customConnectionStrategyType);
				if (result == null) result = caseAbstractConnectionStrategyType(customConnectionStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_CONNECTOR_TYPE: {
				CustomConnectorType customConnectorType = (CustomConnectorType)theEObject;
				T result = caseCustomConnectorType(customConnectorType);
				if (result == null) result = caseConnectorType(customConnectorType);
				if (result == null) result = caseAbstractConnectorType(customConnectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_CORRELATION_AGGREGATOR_ROUTER_TYPE: {
				CustomCorrelationAggregatorRouterType customCorrelationAggregatorRouterType = (CustomCorrelationAggregatorRouterType)theEObject;
				T result = caseCustomCorrelationAggregatorRouterType(customCorrelationAggregatorRouterType);
				if (result == null) result = caseMessageChunkingAggregatorRouterType(customCorrelationAggregatorRouterType);
				if (result == null) result = caseFilteredInboundRouterType(customCorrelationAggregatorRouterType);
				if (result == null) result = caseAbstractInboundRouterType(customCorrelationAggregatorRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_ENCRYPTION_STRATEGY_TYPE: {
				CustomEncryptionStrategyType customEncryptionStrategyType = (CustomEncryptionStrategyType)theEObject;
				T result = caseCustomEncryptionStrategyType(customEncryptionStrategyType);
				if (result == null) result = caseEncryptionStrategyType(customEncryptionStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_ENTRY_POINT_RESOLVER_SET_TYPE: {
				CustomEntryPointResolverSetType customEntryPointResolverSetType = (CustomEntryPointResolverSetType)theEObject;
				T result = caseCustomEntryPointResolverSetType(customEntryPointResolverSetType);
				if (result == null) result = caseAbstractEntryPointResolverSetType(customEntryPointResolverSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_ENTRY_POINT_RESOLVER_TYPE: {
				CustomEntryPointResolverType customEntryPointResolverType = (CustomEntryPointResolverType)theEObject;
				T result = caseCustomEntryPointResolverType(customEntryPointResolverType);
				if (result == null) result = caseAbstractEntryPointResolverType(customEntryPointResolverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_EXCEPTION_STRATEGY_TYPE: {
				CustomExceptionStrategyType customExceptionStrategyType = (CustomExceptionStrategyType)theEObject;
				T result = caseCustomExceptionStrategyType(customExceptionStrategyType);
				if (result == null) result = caseEndpointExceptionStrategyType(customExceptionStrategyType);
				if (result == null) result = caseAbstractExceptionStrategyType(customExceptionStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_FILTER_TYPE: {
				CustomFilterType customFilterType = (CustomFilterType)theEObject;
				T result = caseCustomFilterType(customFilterType);
				if (result == null) result = caseAbstractFilterType(customFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_FORWARDING_CATCH_ALL_STRATEGY_TYPE: {
				CustomForwardingCatchAllStrategyType customForwardingCatchAllStrategyType = (CustomForwardingCatchAllStrategyType)theEObject;
				T result = caseCustomForwardingCatchAllStrategyType(customForwardingCatchAllStrategyType);
				if (result == null) result = caseForwardingCatchAllStrategyType(customForwardingCatchAllStrategyType);
				if (result == null) result = caseAbstractCatchAllStrategyType(customForwardingCatchAllStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_INBOUND_ROUTER_TYPE: {
				CustomInboundRouterType customInboundRouterType = (CustomInboundRouterType)theEObject;
				T result = caseCustomInboundRouterType(customInboundRouterType);
				if (result == null) result = caseFilteredInboundRouterType(customInboundRouterType);
				if (result == null) result = caseAbstractInboundRouterType(customInboundRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_LIFECYCLE_ADAPTER_FACTORY: {
				CustomLifecycleAdapterFactory customLifecycleAdapterFactory = (CustomLifecycleAdapterFactory)theEObject;
				T result = caseCustomLifecycleAdapterFactory(customLifecycleAdapterFactory);
				if (result == null) result = caseAbstractLifecycleAdapterFactory(customLifecycleAdapterFactory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_OUTBOUND_ROUTER_TYPE: {
				CustomOutboundRouterType customOutboundRouterType = (CustomOutboundRouterType)theEObject;
				T result = caseCustomOutboundRouterType(customOutboundRouterType);
				if (result == null) result = caseFilteringOutboundRouterType(customOutboundRouterType);
				if (result == null) result = caseOutboundRouterType(customOutboundRouterType);
				if (result == null) result = caseAbstractOutboundRouterType(customOutboundRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_PROPERTY_EXTRACTOR_TYPE: {
				CustomPropertyExtractorType customPropertyExtractorType = (CustomPropertyExtractorType)theEObject;
				T result = caseCustomPropertyExtractorType(customPropertyExtractorType);
				if (result == null) result = caseAbstractPropertyExtractorType(customPropertyExtractorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_SECURITY_PROVIDER_TYPE: {
				CustomSecurityProviderType customSecurityProviderType = (CustomSecurityProviderType)theEObject;
				T result = caseCustomSecurityProviderType(customSecurityProviderType);
				if (result == null) result = caseSecurityProviderType(customSecurityProviderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_SERVICE_TYPE: {
				CustomServiceType customServiceType = (CustomServiceType)theEObject;
				T result = caseCustomServiceType(customServiceType);
				if (result == null) result = caseBaseServiceType(customServiceType);
				if (result == null) result = caseAbstractServiceType(customServiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_TRANSACTION_MANAGER_TYPE: {
				CustomTransactionManagerType customTransactionManagerType = (CustomTransactionManagerType)theEObject;
				T result = caseCustomTransactionManagerType(customTransactionManagerType);
				if (result == null) result = caseJndiTransactionManagerType1(customTransactionManagerType);
				if (result == null) result = caseAbstractTransactionManagerType(customTransactionManagerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_TRANSACTION_TYPE: {
				CustomTransactionType customTransactionType = (CustomTransactionType)theEObject;
				T result = caseCustomTransactionType(customTransactionType);
				if (result == null) result = caseBaseTransactionType(customTransactionType);
				if (result == null) result = caseAbstractTransactionType(customTransactionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_TRANSFORMER_TYPE: {
				CustomTransformerType customTransformerType = (CustomTransformerType)theEObject;
				T result = caseCustomTransformerType(customTransformerType);
				if (result == null) result = caseAbstractTransformerType(customTransformerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DEFAULT_COMPONENT_TYPE: {
				DefaultComponentType defaultComponentType = (DefaultComponentType)theEObject;
				T result = caseDefaultComponentType(defaultComponentType);
				if (result == null) result = caseAbstractComponentType(defaultComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE: {
				DefaultJavaComponentType defaultJavaComponentType = (DefaultJavaComponentType)theEObject;
				T result = caseDefaultJavaComponentType(defaultJavaComponentType);
				if (result == null) result = caseAbstractComponentType(defaultJavaComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DEFAULT_MODEL_TYPE: {
				DefaultModelType defaultModelType = (DefaultModelType)theEObject;
				T result = caseDefaultModelType(defaultModelType);
				if (result == null) result = caseSedaModelType(defaultModelType);
				if (result == null) result = caseAbstractModelType(defaultModelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DEFINE_NOTIFICATION_TYPE: {
				DefineNotificationType defineNotificationType = (DefineNotificationType)theEObject;
				T result = caseDefineNotificationType(defineNotificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DESCRIPTION_TYPE: {
				DescriptionType descriptionType = (DescriptionType)theEObject;
				T result = caseDescriptionType(descriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DISABLE_NOTIFICATION_TYPE: {
				DisableNotificationType disableNotificationType = (DisableNotificationType)theEObject;
				T result = caseDisableNotificationType(disableNotificationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ENCRYPTION_SECURITY_FILTER_TYPE: {
				EncryptionSecurityFilterType encryptionSecurityFilterType = (EncryptionSecurityFilterType)theEObject;
				T result = caseEncryptionSecurityFilterType(encryptionSecurityFilterType);
				if (result == null) result = caseAbstractSecurityFilterType(encryptionSecurityFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ENCRYPTION_STRATEGY_TYPE: {
				EncryptionStrategyType encryptionStrategyType = (EncryptionStrategyType)theEObject;
				T result = caseEncryptionStrategyType(encryptionStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ENCRYPTION_TRANSFORMER_TYPE: {
				EncryptionTransformerType encryptionTransformerType = (EncryptionTransformerType)theEObject;
				T result = caseEncryptionTransformerType(encryptionTransformerType);
				if (result == null) result = caseAbstractTransformerType(encryptionTransformerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ENDPOINT_EXCEPTION_STRATEGY_TYPE: {
				EndpointExceptionStrategyType endpointExceptionStrategyType = (EndpointExceptionStrategyType)theEObject;
				T result = caseEndpointExceptionStrategyType(endpointExceptionStrategyType);
				if (result == null) result = caseAbstractExceptionStrategyType(endpointExceptionStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ENDPOINT_SELECTOR_ROUTER_TYPE: {
				EndpointSelectorRouterType endpointSelectorRouterType = (EndpointSelectorRouterType)theEObject;
				T result = caseEndpointSelectorRouterType(endpointSelectorRouterType);
				if (result == null) result = caseFilteringOutboundRouterType(endpointSelectorRouterType);
				if (result == null) result = caseOutboundRouterType(endpointSelectorRouterType);
				if (result == null) result = caseAbstractOutboundRouterType(endpointSelectorRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ENVIRONMENT_PROPERTY_TYPE: {
				EnvironmentPropertyType environmentPropertyType = (EnvironmentPropertyType)theEObject;
				T result = caseEnvironmentPropertyType(environmentPropertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXPRESSION_TRANSFORMER_TYPE: {
				ExpressionTransformerType expressionTransformerType = (ExpressionTransformerType)theEObject;
				T result = caseExpressionTransformerType(expressionTransformerType);
				if (result == null) result = caseAbstractTransformerType(expressionTransformerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXTENSIBLE_ENTRY_POINT_RESOLVER_SET: {
				ExtensibleEntryPointResolverSet extensibleEntryPointResolverSet = (ExtensibleEntryPointResolverSet)theEObject;
				T result = caseExtensibleEntryPointResolverSet(extensibleEntryPointResolverSet);
				if (result == null) result = caseAbstractEntryPointResolverSetType(extensibleEntryPointResolverSet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FILTERED_INBOUND_ROUTER_TYPE: {
				FilteredInboundRouterType filteredInboundRouterType = (FilteredInboundRouterType)theEObject;
				T result = caseFilteredInboundRouterType(filteredInboundRouterType);
				if (result == null) result = caseAbstractInboundRouterType(filteredInboundRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE: {
				FilteringOutboundRouterType filteringOutboundRouterType = (FilteringOutboundRouterType)theEObject;
				T result = caseFilteringOutboundRouterType(filteringOutboundRouterType);
				if (result == null) result = caseOutboundRouterType(filteringOutboundRouterType);
				if (result == null) result = caseAbstractOutboundRouterType(filteringOutboundRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.FORWARDING_CATCH_ALL_STRATEGY_TYPE: {
				ForwardingCatchAllStrategyType forwardingCatchAllStrategyType = (ForwardingCatchAllStrategyType)theEObject;
				T result = caseForwardingCatchAllStrategyType(forwardingCatchAllStrategyType);
				if (result == null) result = caseAbstractCatchAllStrategyType(forwardingCatchAllStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE: {
				GenericObjectFactoryType genericObjectFactoryType = (GenericObjectFactoryType)theEObject;
				T result = caseGenericObjectFactoryType(genericObjectFactoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GLOBAL_ENDPOINT_TYPE: {
				GlobalEndpointType globalEndpointType = (GlobalEndpointType)theEObject;
				T result = caseGlobalEndpointType(globalEndpointType);
				if (result == null) result = caseAbstractGlobalEndpointType(globalEndpointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INBOUND_COLLECTION_TYPE: {
				InboundCollectionType inboundCollectionType = (InboundCollectionType)theEObject;
				T result = caseInboundCollectionType(inboundCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INBOUND_ENDPOINT_TYPE: {
				InboundEndpointType inboundEndpointType = (InboundEndpointType)theEObject;
				T result = caseInboundEndpointType(inboundEndpointType);
				if (result == null) result = caseAbstractInboundEndpointType(inboundEndpointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.JNDI_CONNECTOR_TYPE: {
				JndiConnectorType jndiConnectorType = (JndiConnectorType)theEObject;
				T result = caseJndiConnectorType(jndiConnectorType);
				if (result == null) result = caseConnectorType(jndiConnectorType);
				if (result == null) result = caseAbstractConnectorType(jndiConnectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.JNDI_TRANSACTION_MANAGER_TYPE: {
				JndiTransactionManagerType jndiTransactionManagerType = (JndiTransactionManagerType)theEObject;
				T result = caseJndiTransactionManagerType(jndiTransactionManagerType);
				if (result == null) result = caseJndiTransactionManagerType1(jndiTransactionManagerType);
				if (result == null) result = caseAbstractTransactionManagerType(jndiTransactionManagerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.JNDI_TRANSACTION_MANAGER_TYPE1: {
				JndiTransactionManagerType1 jndiTransactionManagerType1 = (JndiTransactionManagerType1)theEObject;
				T result = caseJndiTransactionManagerType1(jndiTransactionManagerType1);
				if (result == null) result = caseAbstractTransactionManagerType(jndiTransactionManagerType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.KEY_TYPE: {
				KeyType keyType = (KeyType)theEObject;
				T result = caseKeyType(keyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.KEY_VALUE_TYPE: {
				KeyValueType keyValueType = (KeyValueType)theEObject;
				T result = caseKeyValueType(keyValueType);
				if (result == null) result = caseKeyType(keyValueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.LIST_OR_SET_TYPE: {
				ListOrSetType listOrSetType = (ListOrSetType)theEObject;
				T result = caseListOrSetType(listOrSetType);
				if (result == null) result = caseListOrSetType_1(listOrSetType);
				if (result == null) result = caseTypedCollectionType(listOrSetType);
				if (result == null) result = caseBaseCollectionType(listOrSetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.LOGGING_CATCH_ALL_STRATEGY_TYPE: {
				LoggingCatchAllStrategyType loggingCatchAllStrategyType = (LoggingCatchAllStrategyType)theEObject;
				T result = caseLoggingCatchAllStrategyType(loggingCatchAllStrategyType);
				if (result == null) result = caseAbstractCatchAllStrategyType(loggingCatchAllStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MAP_TYPE: {
				MapType mapType = (MapType)theEObject;
				T result = caseMapType(mapType);
				if (result == null) result = caseMapType_1(mapType);
				if (result == null) result = caseTypedCollectionType(mapType);
				if (result == null) result = caseBaseCollectionType(mapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MESSAGE_CHUNKING_AGGREGATOR_ROUTER_TYPE: {
				MessageChunkingAggregatorRouterType messageChunkingAggregatorRouterType = (MessageChunkingAggregatorRouterType)theEObject;
				T result = caseMessageChunkingAggregatorRouterType(messageChunkingAggregatorRouterType);
				if (result == null) result = caseFilteredInboundRouterType(messageChunkingAggregatorRouterType);
				if (result == null) result = caseAbstractInboundRouterType(messageChunkingAggregatorRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE: {
				MessagePropertiesTransformerType messagePropertiesTransformerType = (MessagePropertiesTransformerType)theEObject;
				T result = caseMessagePropertiesTransformerType(messagePropertiesTransformerType);
				if (result == null) result = caseAbstractTransformerType(messagePropertiesTransformerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE: {
				MessageSplitterOutboundRouterType messageSplitterOutboundRouterType = (MessageSplitterOutboundRouterType)theEObject;
				T result = caseMessageSplitterOutboundRouterType(messageSplitterOutboundRouterType);
				if (result == null) result = caseFilteringOutboundRouterType(messageSplitterOutboundRouterType);
				if (result == null) result = caseOutboundRouterType(messageSplitterOutboundRouterType);
				if (result == null) result = caseAbstractOutboundRouterType(messageSplitterOutboundRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.METHOD_ENTRY_POINT_RESOLVER_TYPE: {
				MethodEntryPointResolverType methodEntryPointResolverType = (MethodEntryPointResolverType)theEObject;
				T result = caseMethodEntryPointResolverType(methodEntryPointResolverType);
				if (result == null) result = caseBaseEntryPointResolverType(methodEntryPointResolverType);
				if (result == null) result = caseAbstractEntryPointResolverType(methodEntryPointResolverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.METHOD_TYPE: {
				MethodType methodType = (MethodType)theEObject;
				T result = caseMethodType(methodType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MULE_TYPE: {
				MuleType muleType = (MuleType)theEObject;
				T result = caseMuleType(muleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NOTIFICATION_LISTENER_TYPE: {
				NotificationListenerType notificationListenerType = (NotificationListenerType)theEObject;
				T result = caseNotificationListenerType(notificationListenerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NOTIFICATION_MANAGER_TYPE: {
				NotificationManagerType notificationManagerType = (NotificationManagerType)theEObject;
				T result = caseNotificationManagerType(notificationManagerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OUTBOUND_COLLECTION_TYPE: {
				OutboundCollectionType outboundCollectionType = (OutboundCollectionType)theEObject;
				T result = caseOutboundCollectionType(outboundCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OUTBOUND_ENDPOINT_TYPE: {
				OutboundEndpointType outboundEndpointType = (OutboundEndpointType)theEObject;
				T result = caseOutboundEndpointType(outboundEndpointType);
				if (result == null) result = caseAbstractOutboundEndpointType(outboundEndpointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OUTBOUND_ROUTER_TYPE: {
				OutboundRouterType outboundRouterType = (OutboundRouterType)theEObject;
				T result = caseOutboundRouterType(outboundRouterType);
				if (result == null) result = caseAbstractOutboundRouterType(outboundRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE: {
				PasswordEncryptionStrategyType passwordEncryptionStrategyType = (PasswordEncryptionStrategyType)theEObject;
				T result = casePasswordEncryptionStrategyType(passwordEncryptionStrategyType);
				if (result == null) result = caseEncryptionStrategyType(passwordEncryptionStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PATTERN_FILTER_TYPE: {
				PatternFilterType patternFilterType = (PatternFilterType)theEObject;
				T result = casePatternFilterType(patternFilterType);
				if (result == null) result = caseAbstractFilterType(patternFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.POJO_BINDING_TYPE: {
				PojoBindingType pojoBindingType = (PojoBindingType)theEObject;
				T result = casePojoBindingType(pojoBindingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.POOLED_JAVA_COMPONENT_TYPE: {
				PooledJavaComponentType pooledJavaComponentType = (PooledJavaComponentType)theEObject;
				T result = casePooledJavaComponentType(pooledJavaComponentType);
				if (result == null) result = caseDefaultJavaComponentType(pooledJavaComponentType);
				if (result == null) result = caseAbstractComponentType(pooledJavaComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.POOLING_PROFILE_TYPE: {
				PoolingProfileType poolingProfileType = (PoolingProfileType)theEObject;
				T result = casePoolingProfileType(poolingProfileType);
				if (result == null) result = caseAbstractPoolingProfileType(poolingProfileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PROPERTY_ENTRY_POINT_RESOLVER_TYPE: {
				PropertyEntryPointResolverType propertyEntryPointResolverType = (PropertyEntryPointResolverType)theEObject;
				T result = casePropertyEntryPointResolverType(propertyEntryPointResolverType);
				if (result == null) result = caseBaseEntryPointResolverType(propertyEntryPointResolverType);
				if (result == null) result = caseAbstractEntryPointResolverType(propertyEntryPointResolverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PROTOTYPE_OBJECT_FACTORY_TYPE: {
				PrototypeObjectFactoryType prototypeObjectFactoryType = (PrototypeObjectFactoryType)theEObject;
				T result = casePrototypeObjectFactoryType(prototypeObjectFactoryType);
				if (result == null) result = caseAbstractObjectFactoryType(prototypeObjectFactoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.QUEUE_PROFILE_TYPE: {
				QueueProfileType queueProfileType = (QueueProfileType)theEObject;
				T result = caseQueueProfileType(queueProfileType);
				if (result == null) result = caseAbstractQueueProfileType(queueProfileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REFERENCE_TYPE: {
				ReferenceType referenceType = (ReferenceType)theEObject;
				T result = caseReferenceType(referenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REF_FILTER_TYPE: {
				RefFilterType refFilterType = (RefFilterType)theEObject;
				T result = caseRefFilterType(refFilterType);
				if (result == null) result = caseAbstractFilterType(refFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE: {
				ReflectionEntryPointResolverType reflectionEntryPointResolverType = (ReflectionEntryPointResolverType)theEObject;
				T result = caseReflectionEntryPointResolverType(reflectionEntryPointResolverType);
				if (result == null) result = caseBaseEntryPointResolverType(reflectionEntryPointResolverType);
				if (result == null) result = caseAbstractEntryPointResolverType(reflectionEntryPointResolverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REF_TRANSFORMER_TYPE: {
				RefTransformerType refTransformerType = (RefTransformerType)theEObject;
				T result = caseRefTransformerType(refTransformerType);
				if (result == null) result = caseAbstractTransformerType(refTransformerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.REPLY_TO_TYPE: {
				ReplyToType replyToType = (ReplyToType)theEObject;
				T result = caseReplyToType(replyToType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RESPONSE_TRANSFORMERS_TYPE: {
				ResponseTransformersType responseTransformersType = (ResponseTransformersType)theEObject;
				T result = caseResponseTransformersType(responseTransformersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RETRY_CONNECTION_STRATEGY_TYPE: {
				RetryConnectionStrategyType retryConnectionStrategyType = (RetryConnectionStrategyType)theEObject;
				T result = caseRetryConnectionStrategyType(retryConnectionStrategyType);
				if (result == null) result = caseConnectionStrategyType(retryConnectionStrategyType);
				if (result == null) result = caseAbstractConnectionStrategyType(retryConnectionStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RETURN_ARGUMENT_TYPE: {
				ReturnArgumentType returnArgumentType = (ReturnArgumentType)theEObject;
				T result = caseReturnArgumentType(returnArgumentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SECRET_KEY_ENCRYPTION_STRATEGY_TYPE: {
				SecretKeyEncryptionStrategyType secretKeyEncryptionStrategyType = (SecretKeyEncryptionStrategyType)theEObject;
				T result = caseSecretKeyEncryptionStrategyType(secretKeyEncryptionStrategyType);
				if (result == null) result = caseEncryptionStrategyType(secretKeyEncryptionStrategyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SECURITY_MANAGER_TYPE: {
				SecurityManagerType securityManagerType = (SecurityManagerType)theEObject;
				T result = caseSecurityManagerType(securityManagerType);
				if (result == null) result = caseAbstractSecurityManagerType(securityManagerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SECURITY_PROVIDER_TYPE: {
				SecurityProviderType securityProviderType = (SecurityProviderType)theEObject;
				T result = caseSecurityProviderType(securityProviderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SEDA_MODEL_TYPE: {
				SedaModelType sedaModelType = (SedaModelType)theEObject;
				T result = caseSedaModelType(sedaModelType);
				if (result == null) result = caseAbstractModelType(sedaModelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SEDA_SERVICE_TYPE: {
				SedaServiceType sedaServiceType = (SedaServiceType)theEObject;
				T result = caseSedaServiceType(sedaServiceType);
				if (result == null) result = caseBaseServiceType(sedaServiceType);
				if (result == null) result = caseAbstractServiceType(sedaServiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE: {
				SelectiveConsumerRouterType selectiveConsumerRouterType = (SelectiveConsumerRouterType)theEObject;
				T result = caseSelectiveConsumerRouterType(selectiveConsumerRouterType);
				if (result == null) result = caseFilteredInboundRouterType(selectiveConsumerRouterType);
				if (result == null) result = caseAbstractInboundRouterType(selectiveConsumerRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SERVICE_OVERRIDES_TYPE: {
				ServiceOverridesType serviceOverridesType = (ServiceOverridesType)theEObject;
				T result = caseServiceOverridesType(serviceOverridesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SINGLETON_OBJECT_FACTORY_TYPE: {
				SingletonObjectFactoryType singletonObjectFactoryType = (SingletonObjectFactoryType)theEObject;
				T result = caseSingletonObjectFactoryType(singletonObjectFactoryType);
				if (result == null) result = caseAbstractObjectFactoryType(singletonObjectFactoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SPRING_BEAN_LOOKUP_TYPE: {
				SpringBeanLookupType springBeanLookupType = (SpringBeanLookupType)theEObject;
				T result = caseSpringBeanLookupType(springBeanLookupType);
				if (result == null) result = caseAbstractObjectFactoryType(springBeanLookupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE: {
				StaticRecipientListRouterType staticRecipientListRouterType = (StaticRecipientListRouterType)theEObject;
				T result = caseStaticRecipientListRouterType(staticRecipientListRouterType);
				if (result == null) result = caseFilteringOutboundRouterType(staticRecipientListRouterType);
				if (result == null) result = caseOutboundRouterType(staticRecipientListRouterType);
				if (result == null) result = caseAbstractOutboundRouterType(staticRecipientListRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.THREADING_PROFILE_TYPE: {
				ThreadingProfileType threadingProfileType = (ThreadingProfileType)theEObject;
				T result = caseThreadingProfileType(threadingProfileType);
				if (result == null) result = caseAbstractComponentThreadingProfileType(threadingProfileType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TLS_CLIENT_KEY_STORE_TYPE: {
				TlsClientKeyStoreType tlsClientKeyStoreType = (TlsClientKeyStoreType)theEObject;
				T result = caseTlsClientKeyStoreType(tlsClientKeyStoreType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TLS_KEY_STORE_TYPE: {
				TlsKeyStoreType tlsKeyStoreType = (TlsKeyStoreType)theEObject;
				T result = caseTlsKeyStoreType(tlsKeyStoreType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TLS_PROTOCOL_HANDLER: {
				TlsProtocolHandler tlsProtocolHandler = (TlsProtocolHandler)theEObject;
				T result = caseTlsProtocolHandler(tlsProtocolHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE: {
				TlsServerTrustStoreType tlsServerTrustStoreType = (TlsServerTrustStoreType)theEObject;
				T result = caseTlsServerTrustStoreType(tlsServerTrustStoreType);
				if (result == null) result = caseTlsTrustStoreType(tlsServerTrustStoreType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TLS_TRUST_STORE_TYPE: {
				TlsTrustStoreType tlsTrustStoreType = (TlsTrustStoreType)theEObject;
				T result = caseTlsTrustStoreType(tlsTrustStoreType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRANSACTION_MANAGER_TYPE: {
				TransactionManagerType transactionManagerType = (TransactionManagerType)theEObject;
				T result = caseTransactionManagerType(transactionManagerType);
				if (result == null) result = caseAbstractTransactionManagerType(transactionManagerType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRANSFORMERS_TYPE: {
				TransformersType transformersType = (TransformersType)theEObject;
				T result = caseTransformersType(transformersType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TYPE_FILTER_TYPE: {
				TypeFilterType typeFilterType = (TypeFilterType)theEObject;
				T result = caseTypeFilterType(typeFilterType);
				if (result == null) result = caseAbstractFilterType(typeFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.UNITARY_FILTER_TYPE: {
				UnitaryFilterType unitaryFilterType = (UnitaryFilterType)theEObject;
				T result = caseUnitaryFilterType(unitaryFilterType);
				if (result == null) result = caseAbstractFilterType(unitaryFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.VALUE_TYPE: {
				ValueType valueType = (ValueType)theEObject;
				T result = caseValueType(valueType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.WILDCARD_FILTER_TYPE: {
				WildcardFilterType wildcardFilterType = (WildcardFilterType)theEObject;
				T result = caseWildcardFilterType(wildcardFilterType);
				if (result == null) result = casePatternFilterType(wildcardFilterType);
				if (result == null) result = caseAbstractFilterType(wildcardFilterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.WIRE_TAP_ROUTER_TYPE: {
				WireTapRouterType wireTapRouterType = (WireTapRouterType)theEObject;
				T result = caseWireTapRouterType(wireTapRouterType);
				if (result == null) result = caseFilteredInboundRouterType(wireTapRouterType);
				if (result == null) result = caseAbstractInboundRouterType(wireTapRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Agent Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Agent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAgentType(AbstractAgentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Async Reply Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Async Reply Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractAsyncReplyRouterType(AbstractAsyncReplyRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Catch All Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Catch All Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractCatchAllStrategyType(AbstractCatchAllStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Component Threading Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Component Threading Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComponentThreadingProfileType(AbstractComponentThreadingProfileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComponentType(AbstractComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Connection Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Connection Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractConnectionStrategyType(AbstractConnectionStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Connector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractConnectorType(AbstractConnectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Entry Point Resolver Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Entry Point Resolver Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEntryPointResolverSetType(AbstractEntryPointResolverSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Entry Point Resolver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Entry Point Resolver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEntryPointResolverType(AbstractEntryPointResolverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Exception Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Exception Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractExceptionStrategyType(AbstractExceptionStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Extension Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Extension Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractExtensionType(AbstractExtensionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractFilterType(AbstractFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Global Endpoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Global Endpoint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractGlobalEndpointType(AbstractGlobalEndpointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Inbound Endpoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Inbound Endpoint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInboundEndpointType(AbstractInboundEndpointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Inbound Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Inbound Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractInboundRouterType(AbstractInboundRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Lifecycle Adapter Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Lifecycle Adapter Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractLifecycleAdapterFactory(AbstractLifecycleAdapterFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractModelType(AbstractModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Object Factory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Object Factory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractObjectFactoryType(AbstractObjectFactoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Outbound Endpoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Outbound Endpoint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractOutboundEndpointType(AbstractOutboundEndpointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Outbound Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Outbound Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractOutboundRouterType(AbstractOutboundRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Pooling Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Pooling Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPoolingProfileType(AbstractPoolingProfileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Property Extractor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Property Extractor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPropertyExtractorType(AbstractPropertyExtractorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Queue Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Queue Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractQueueProfileType(AbstractQueueProfileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Security Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Security Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSecurityFilterType(AbstractSecurityFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Security Manager Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Security Manager Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractSecurityManagerType(AbstractSecurityManagerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractServiceType(AbstractServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Transaction Manager Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Transaction Manager Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTransactionManagerType(AbstractTransactionManagerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Transaction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Transaction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTransactionType(AbstractTransactionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Transformer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Transformer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTransformerType(AbstractTransformerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Append String Transformer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Append String Transformer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppendStringTransformerType(AppendStringTransformerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Async Reply Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Async Reply Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsyncReplyCollectionType(AsyncReplyCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Async Reply Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Async Reply Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsyncReplyRouterType(AsyncReplyRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Entry Point Resolver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Entry Point Resolver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseEntryPointResolverType(BaseEntryPointResolverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseServiceType(BaseServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Transaction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Transaction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseTransactionType(BaseTransactionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case Sensitive Pattern Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case Sensitive Pattern Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaseSensitivePatternFilterType(CaseSensitivePatternFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chunking Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chunking Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChunkingRouterType(ChunkingRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collection Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collection Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollectionFilterType(CollectionFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Complex Entry Point Resolver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Complex Entry Point Resolver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComplexEntryPointResolverType(ComplexEntryPointResolverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfigurationType(ConfigurationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionStrategyType(ConnectionStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectorType(ConnectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Async Reply Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Async Reply Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomAsyncReplyRouterType(CustomAsyncReplyRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Catch All Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Catch All Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomCatchAllStrategyType(CustomCatchAllStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Connection Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Connection Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomConnectionStrategyType(CustomConnectionStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Connector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomConnectorType(CustomConnectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Correlation Aggregator Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Correlation Aggregator Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomCorrelationAggregatorRouterType(CustomCorrelationAggregatorRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Encryption Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Encryption Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomEncryptionStrategyType(CustomEncryptionStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Entry Point Resolver Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Entry Point Resolver Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomEntryPointResolverSetType(CustomEntryPointResolverSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Entry Point Resolver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Entry Point Resolver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomEntryPointResolverType(CustomEntryPointResolverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Exception Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Exception Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomExceptionStrategyType(CustomExceptionStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomFilterType(CustomFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Forwarding Catch All Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Forwarding Catch All Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomForwardingCatchAllStrategyType(CustomForwardingCatchAllStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Inbound Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Inbound Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomInboundRouterType(CustomInboundRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Lifecycle Adapter Factory</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Lifecycle Adapter Factory</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomLifecycleAdapterFactory(CustomLifecycleAdapterFactory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Outbound Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Outbound Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomOutboundRouterType(CustomOutboundRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Property Extractor Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Property Extractor Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomPropertyExtractorType(CustomPropertyExtractorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Security Provider Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Security Provider Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomSecurityProviderType(CustomSecurityProviderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomServiceType(CustomServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Transaction Manager Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Transaction Manager Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomTransactionManagerType(CustomTransactionManagerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Transaction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Transaction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomTransactionType(CustomTransactionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Transformer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Transformer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomTransformerType(CustomTransformerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultComponentType(DefaultComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Java Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Java Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultJavaComponentType(DefaultJavaComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultModelType(DefaultModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Define Notification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Define Notification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefineNotificationType(DefineNotificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Description Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptionType(DescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disable Notification Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disable Notification Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisableNotificationType(DisableNotificationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encryption Security Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encryption Security Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncryptionSecurityFilterType(EncryptionSecurityFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encryption Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encryption Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncryptionStrategyType(EncryptionStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encryption Transformer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encryption Transformer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncryptionTransformerType(EncryptionTransformerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Exception Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Exception Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointExceptionStrategyType(EndpointExceptionStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Endpoint Selector Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Endpoint Selector Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEndpointSelectorRouterType(EndpointSelectorRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Environment Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Environment Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvironmentPropertyType(EnvironmentPropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Transformer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Transformer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionTransformerType(ExpressionTransformerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extensible Entry Point Resolver Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extensible Entry Point Resolver Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtensibleEntryPointResolverSet(ExtensibleEntryPointResolverSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filtered Inbound Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtered Inbound Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilteredInboundRouterType(FilteredInboundRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filtering Outbound Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filtering Outbound Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilteringOutboundRouterType(FilteringOutboundRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forwarding Catch All Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forwarding Catch All Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForwardingCatchAllStrategyType(ForwardingCatchAllStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic Object Factory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic Object Factory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericObjectFactoryType(GenericObjectFactoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Global Endpoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Global Endpoint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlobalEndpointType(GlobalEndpointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inbound Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inbound Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInboundCollectionType(InboundCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inbound Endpoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inbound Endpoint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInboundEndpointType(InboundEndpointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jndi Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jndi Connector Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJndiConnectorType(JndiConnectorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jndi Transaction Manager Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jndi Transaction Manager Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJndiTransactionManagerType(JndiTransactionManagerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Jndi Transaction Manager Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Jndi Transaction Manager Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJndiTransactionManagerType1(JndiTransactionManagerType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyType(KeyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeyValueType(KeyValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Or Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Or Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOrSetType(ListOrSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logging Catch All Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logging Catch All Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoggingCatchAllStrategyType(LoggingCatchAllStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapType(MapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Chunking Aggregator Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Chunking Aggregator Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageChunkingAggregatorRouterType(MessageChunkingAggregatorRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Properties Transformer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Properties Transformer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessagePropertiesTransformerType(MessagePropertiesTransformerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message Splitter Outbound Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Splitter Outbound Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessageSplitterOutboundRouterType(MessageSplitterOutboundRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Entry Point Resolver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Entry Point Resolver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodEntryPointResolverType(MethodEntryPointResolverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Method Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMethodType(MethodType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mule Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mule Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMuleType(MuleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification Listener Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification Listener Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotificationListenerType(NotificationListenerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Notification Manager Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Notification Manager Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotificationManagerType(NotificationManagerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outbound Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outbound Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutboundCollectionType(OutboundCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outbound Endpoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outbound Endpoint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutboundEndpointType(OutboundEndpointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Outbound Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outbound Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutboundRouterType(OutboundRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Password Encryption Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Password Encryption Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePasswordEncryptionStrategyType(PasswordEncryptionStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatternFilterType(PatternFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pojo Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pojo Binding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePojoBindingType(PojoBindingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pooled Java Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pooled Java Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePooledJavaComponentType(PooledJavaComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pooling Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pooling Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePoolingProfileType(PoolingProfileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Entry Point Resolver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Entry Point Resolver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyEntryPointResolverType(PropertyEntryPointResolverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prototype Object Factory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prototype Object Factory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrototypeObjectFactoryType(PrototypeObjectFactoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueueProfileType(QueueProfileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType(ReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefFilterType(RefFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reflection Entry Point Resolver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reflection Entry Point Resolver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReflectionEntryPointResolverType(ReflectionEntryPointResolverType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Transformer Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Transformer Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefTransformerType(RefTransformerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reply To Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reply To Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplyToType(ReplyToType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Transformers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Transformers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseTransformersType(ResponseTransformersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Retry Connection Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Retry Connection Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRetryConnectionStrategyType(RetryConnectionStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Return Argument Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Return Argument Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReturnArgumentType(ReturnArgumentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secret Key Encryption Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secret Key Encryption Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecretKeyEncryptionStrategyType(SecretKeyEncryptionStrategyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Manager Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Manager Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityManagerType(SecurityManagerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Provider Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Provider Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityProviderType(SecurityProviderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seda Model Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seda Model Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSedaModelType(SedaModelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seda Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seda Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSedaServiceType(SedaServiceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Selective Consumer Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Selective Consumer Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectiveConsumerRouterType(SelectiveConsumerRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Service Overrides Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service Overrides Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseServiceOverridesType(ServiceOverridesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Singleton Object Factory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Singleton Object Factory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingletonObjectFactoryType(SingletonObjectFactoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spring Bean Lookup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spring Bean Lookup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpringBeanLookupType(SpringBeanLookupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Recipient List Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Recipient List Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticRecipientListRouterType(StaticRecipientListRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Threading Profile Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Threading Profile Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThreadingProfileType(ThreadingProfileType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tls Client Key Store Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tls Client Key Store Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTlsClientKeyStoreType(TlsClientKeyStoreType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tls Key Store Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tls Key Store Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTlsKeyStoreType(TlsKeyStoreType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tls Protocol Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tls Protocol Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTlsProtocolHandler(TlsProtocolHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tls Server Trust Store Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tls Server Trust Store Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTlsServerTrustStoreType(TlsServerTrustStoreType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tls Trust Store Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tls Trust Store Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTlsTrustStoreType(TlsTrustStoreType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Manager Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Manager Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionManagerType(TransactionManagerType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformers Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformers Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformersType(TransformersType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Type Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Type Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypeFilterType(TypeFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unitary Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unitary Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnitaryFilterType(UnitaryFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValueType(ValueType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wildcard Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wildcard Filter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWildcardFilterType(WildcardFilterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wire Tap Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wire Tap Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWireTapRouterType(WireTapRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseCollectionType(BaseCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Typed Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Typed Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTypedCollectionType(TypedCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>List Or Set Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>List Or Set Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListOrSetType_1(org.mule.ide.config.spring.ListOrSetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapType_1(org.mule.ide.config.spring.MapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //CoreSwitch
