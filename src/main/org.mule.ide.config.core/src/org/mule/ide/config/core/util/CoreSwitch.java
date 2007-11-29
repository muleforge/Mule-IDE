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
			case CorePackage.ABSTRACT_BINDING_TYPE: {
				AbstractBindingType abstractBindingType = (AbstractBindingType)theEObject;
				T result = caseAbstractBindingType(abstractBindingType);
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
			case CorePackage.ABSTRACT_ENTRYPOINT_RESOLVER_TYPE: {
				AbstractEntrypointResolverType abstractEntrypointResolverType = (AbstractEntrypointResolverType)theEObject;
				T result = caseAbstractEntrypointResolverType(abstractEntrypointResolverType);
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
			case CorePackage.ABSTRACT_RESPONSE_ENDPOINT_TYPE: {
				AbstractResponseEndpointType abstractResponseEndpointType = (AbstractResponseEndpointType)theEObject;
				T result = caseAbstractResponseEndpointType(abstractResponseEndpointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_RESPONSE_ROUTER_TYPE: {
				AbstractResponseRouterType abstractResponseRouterType = (AbstractResponseRouterType)theEObject;
				T result = caseAbstractResponseRouterType(abstractResponseRouterType);
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
			case CorePackage.ABSTRACT_STORAGE_TYPE: {
				AbstractStorageType abstractStorageType = (AbstractStorageType)theEObject;
				T result = caseAbstractStorageType(abstractStorageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ABSTRACT_TRANSACTION_FACTORY_TYPE: {
				AbstractTransactionFactoryType abstractTransactionFactoryType = (AbstractTransactionFactoryType)theEObject;
				T result = caseAbstractTransactionFactoryType(abstractTransactionFactoryType);
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
			case CorePackage.BASE_CONTAINER_CONTEXT_TYPE: {
				BaseContainerContextType baseContainerContextType = (BaseContainerContextType)theEObject;
				T result = caseBaseContainerContextType(baseContainerContextType);
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
			case CorePackage.CALLABLE_ENTRYPOINT_RESOLVER_TYPE: {
				CallableEntrypointResolverType callableEntrypointResolverType = (CallableEntrypointResolverType)theEObject;
				T result = caseCallableEntrypointResolverType(callableEntrypointResolverType);
				if (result == null) result = caseAbstractEntrypointResolverType(callableEntrypointResolverType);
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
			case CorePackage.CONTAINER_CONTEXT_TYPE: {
				ContainerContextType containerContextType = (ContainerContextType)theEObject;
				T result = caseContainerContextType(containerContextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORRELATION_AGGREGATOR_ROUTER_TYPE: {
				CorrelationAggregatorRouterType correlationAggregatorRouterType = (CorrelationAggregatorRouterType)theEObject;
				T result = caseCorrelationAggregatorRouterType(correlationAggregatorRouterType);
				if (result == null) result = caseCorrelationRouterType(correlationAggregatorRouterType);
				if (result == null) result = caseFilteredInboundRouterType(correlationAggregatorRouterType);
				if (result == null) result = caseAbstractInboundRouterType(correlationAggregatorRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CORRELATION_ROUTER_TYPE: {
				CorrelationRouterType correlationRouterType = (CorrelationRouterType)theEObject;
				T result = caseCorrelationRouterType(correlationRouterType);
				if (result == null) result = caseFilteredInboundRouterType(correlationRouterType);
				if (result == null) result = caseAbstractInboundRouterType(correlationRouterType);
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
				if (result == null) result = caseAbstractConnectorType(customConnectorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_CONTAINER_CONTEXT_TYPE: {
				CustomContainerContextType customContainerContextType = (CustomContainerContextType)theEObject;
				T result = caseCustomContainerContextType(customContainerContextType);
				if (result == null) result = caseBaseContainerContextType(customContainerContextType);
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
			case CorePackage.CUSTOM_ENTRYPOINT_RESOLVER_TYPE: {
				CustomEntrypointResolverType customEntrypointResolverType = (CustomEntrypointResolverType)theEObject;
				T result = caseCustomEntrypointResolverType(customEntrypointResolverType);
				if (result == null) result = caseAbstractEntrypointResolverType(customEntrypointResolverType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_EXCEPTION_STRATEGY_TYPE: {
				CustomExceptionStrategyType customExceptionStrategyType = (CustomExceptionStrategyType)theEObject;
				T result = caseCustomExceptionStrategyType(customExceptionStrategyType);
				if (result == null) result = caseExceptionStrategyType(customExceptionStrategyType);
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
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_RESPONSE_ROUTER_TYPE: {
				CustomResponseRouterType customResponseRouterType = (CustomResponseRouterType)theEObject;
				T result = caseCustomResponseRouterType(customResponseRouterType);
				if (result == null) result = caseResponseRouterType(customResponseRouterType);
				if (result == null) result = caseAbstractResponseRouterType(customResponseRouterType);
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
			case CorePackage.CUSTOM_TRANSACTION_FACTORY_TYPE: {
				CustomTransactionFactoryType customTransactionFactoryType = (CustomTransactionFactoryType)theEObject;
				T result = caseCustomTransactionFactoryType(customTransactionFactoryType);
				if (result == null) result = caseAbstractTransactionFactoryType(customTransactionFactoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CUSTOM_TRANSACTION_MANAGER_TYPE: {
				CustomTransactionManagerType customTransactionManagerType = (CustomTransactionManagerType)theEObject;
				T result = caseCustomTransactionManagerType(customTransactionManagerType);
				if (result == null) result = caseJndiTransactionManagerType(customTransactionManagerType);
				if (result == null) result = caseAbstractTransactionManagerType(customTransactionManagerType);
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
			case CorePackage.DEFAULT_MODEL_TYPE: {
				DefaultModelType defaultModelType = (DefaultModelType)theEObject;
				T result = caseDefaultModelType(defaultModelType);
				if (result == null) result = caseSedaModelType(defaultModelType);
				if (result == null) result = caseAbstractModelType(defaultModelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DEFAULT_SERVICE_TYPE: {
				DefaultServiceType defaultServiceType = (DefaultServiceType)theEObject;
				T result = caseDefaultServiceType(defaultServiceType);
				if (result == null) result = caseSedaServiceType(defaultServiceType);
				if (result == null) result = caseBaseServiceType(defaultServiceType);
				if (result == null) result = caseAbstractServiceType(defaultServiceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.DESCRIPTION_TYPE: {
				DescriptionType descriptionType = (DescriptionType)theEObject;
				T result = caseDescriptionType(descriptionType);
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
			case CorePackage.EXCEPTION_STRATEGY_TYPE: {
				ExceptionStrategyType exceptionStrategyType = (ExceptionStrategyType)theEObject;
				T result = caseExceptionStrategyType(exceptionStrategyType);
				if (result == null) result = caseAbstractExceptionStrategyType(exceptionStrategyType);
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
			case CorePackage.FILTER_REF_TYPE: {
				FilterRefType filterRefType = (FilterRefType)theEObject;
				T result = caseFilterRefType(filterRefType);
				if (result == null) result = caseAbstractFilterType(filterRefType);
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
			case CorePackage.FORWARDING_ROUTER_TYPE: {
				ForwardingRouterType forwardingRouterType = (ForwardingRouterType)theEObject;
				T result = caseForwardingRouterType(forwardingRouterType);
				if (result == null) result = caseFilteredInboundRouterType(forwardingRouterType);
				if (result == null) result = caseAbstractInboundRouterType(forwardingRouterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE: {
				GenericObjectFactoryType genericObjectFactoryType = (GenericObjectFactoryType)theEObject;
				T result = caseGenericObjectFactoryType(genericObjectFactoryType);
				if (result == null) result = caseAbstractObjectFactoryType(genericObjectFactoryType);
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
			case CorePackage.IDEMPOTENT_RECEIVER_TYPE: {
				IdempotentReceiverType idempotentReceiverType = (IdempotentReceiverType)theEObject;
				T result = caseIdempotentReceiverType(idempotentReceiverType);
				if (result == null) result = caseFilteredInboundRouterType(idempotentReceiverType);
				if (result == null) result = caseAbstractInboundRouterType(idempotentReceiverType);
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
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE: {
				InboundRouterCollectionType inboundRouterCollectionType = (InboundRouterCollectionType)theEObject;
				T result = caseInboundRouterCollectionType(inboundRouterCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.IOC_CONTAINER_CONTEXT_TYPE: {
				IocContainerContextType iocContainerContextType = (IocContainerContextType)theEObject;
				T result = caseIocContainerContextType(iocContainerContextType);
				if (result == null) result = caseBaseContainerContextType(iocContainerContextType);
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
				if (result == null) result = caseAbstractTransactionManagerType(jndiTransactionManagerType);
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
			case CorePackage.MULE_ADMIN_AGENT_TYPE: {
				MuleAdminAgentType muleAdminAgentType = (MuleAdminAgentType)theEObject;
				T result = caseMuleAdminAgentType(muleAdminAgentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE: {
				MuleManagementContextType muleManagementContextType = (MuleManagementContextType)theEObject;
				T result = caseMuleManagementContextType(muleManagementContextType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MULE_TYPE: {
				MuleType muleType = (MuleType)theEObject;
				T result = caseMuleType(muleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.MULE_UNSAFE_TYPE: {
				MuleUnsafeType muleUnsafeType = (MuleUnsafeType)theEObject;
				T result = caseMuleUnsafeType(muleUnsafeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NO_ARGS_CALL_DELEGATE_CLASS_TYPE: {
				NoArgsCallDelegateClassType noArgsCallDelegateClassType = (NoArgsCallDelegateClassType)theEObject;
				T result = caseNoArgsCallDelegateClassType(noArgsCallDelegateClassType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NO_ARGS_CALL_DELEGATE_INSTANCE_TYPE: {
				NoArgsCallDelegateInstanceType noArgsCallDelegateInstanceType = (NoArgsCallDelegateInstanceType)theEObject;
				T result = caseNoArgsCallDelegateInstanceType(noArgsCallDelegateInstanceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.NO_ARGS_CALL_WRAPPER_TYPE: {
				NoArgsCallWrapperType noArgsCallWrapperType = (NoArgsCallWrapperType)theEObject;
				T result = caseNoArgsCallWrapperType(noArgsCallWrapperType);
				if (result == null) result = caseDefaultComponentType(noArgsCallWrapperType);
				if (result == null) result = caseAbstractComponentType(noArgsCallWrapperType);
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
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE: {
				OutboundRouterCollectionType outboundRouterCollectionType = (OutboundRouterCollectionType)theEObject;
				T result = caseOutboundRouterCollectionType(outboundRouterCollectionType);
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
				if (result == null) result = caseAbstractBindingType(pojoBindingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.POJO_COMPONENT_TYPE: {
				PojoComponentType pojoComponentType = (PojoComponentType)theEObject;
				T result = casePojoComponentType(pojoComponentType);
				if (result == null) result = caseAbstractComponentType(pojoComponentType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.POOLED_OBJECT_FACTORY_TYPE: {
				PooledObjectFactoryType pooledObjectFactoryType = (PooledObjectFactoryType)theEObject;
				T result = casePooledObjectFactoryType(pooledObjectFactoryType);
				if (result == null) result = caseAbstractObjectFactoryType(pooledObjectFactoryType);
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
			case CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE: {
				PropertiesContainerContextType propertiesContainerContextType = (PropertiesContainerContextType)theEObject;
				T result = casePropertiesContainerContextType(propertiesContainerContextType);
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
			case CorePackage.REPLY_TO_TYPE: {
				ReplyToType replyToType = (ReplyToType)theEObject;
				T result = caseReplyToType(replyToType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RESPONSE_ENDPOINT_TYPE: {
				ResponseEndpointType responseEndpointType = (ResponseEndpointType)theEObject;
				T result = caseResponseEndpointType(responseEndpointType);
				if (result == null) result = caseAbstractResponseEndpointType(responseEndpointType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE: {
				ResponseRouterCollectionType responseRouterCollectionType = (ResponseRouterCollectionType)theEObject;
				T result = caseResponseRouterCollectionType(responseRouterCollectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RESPONSE_ROUTER_TYPE: {
				ResponseRouterType responseRouterType = (ResponseRouterType)theEObject;
				T result = caseResponseRouterType(responseRouterType);
				if (result == null) result = caseAbstractResponseRouterType(responseRouterType);
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
			case CorePackage.RMI_CONTAINER_CONTEXT_TYPE: {
				RmiContainerContextType rmiContainerContextType = (RmiContainerContextType)theEObject;
				T result = caseRmiContainerContextType(rmiContainerContextType);
				if (result == null) result = caseBaseContainerContextType(rmiContainerContextType);
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
			case CorePackage.TRANSACTION_REF_FACTORY_TYPE: {
				TransactionRefFactoryType transactionRefFactoryType = (TransactionRefFactoryType)theEObject;
				T result = caseTransactionRefFactoryType(transactionRefFactoryType);
				if (result == null) result = caseAbstractTransactionFactoryType(transactionRefFactoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRANSACTION_TYPE: {
				TransactionType transactionType = (TransactionType)theEObject;
				T result = caseTransactionType(transactionType);
				if (result == null) result = caseAbstractTransactionType(transactionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRANSFORMER_APPEND_STRING_TYPE: {
				TransformerAppendStringType transformerAppendStringType = (TransformerAppendStringType)theEObject;
				T result = caseTransformerAppendStringType(transformerAppendStringType);
				if (result == null) result = caseAbstractTransformerType(transformerAppendStringType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TRANSFORMER_REF_TYPE: {
				TransformerRefType transformerRefType = (TransformerRefType)theEObject;
				T result = caseTransformerRefType(transformerRefType);
				if (result == null) result = caseAbstractTransformerType(transformerRefType);
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Binding Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Binding Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractBindingType(AbstractBindingType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Entrypoint Resolver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Entrypoint Resolver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractEntrypointResolverType(AbstractEntrypointResolverType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Response Endpoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Response Endpoint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractResponseEndpointType(AbstractResponseEndpointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Response Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Response Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractResponseRouterType(AbstractResponseRouterType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Storage Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Storage Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractStorageType(AbstractStorageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Transaction Factory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Transaction Factory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractTransactionFactoryType(AbstractTransactionFactoryType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Base Container Context Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Container Context Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseContainerContextType(BaseContainerContextType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Callable Entrypoint Resolver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Callable Entrypoint Resolver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallableEntrypointResolverType(CallableEntrypointResolverType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Container Context Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Context Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainerContextType(ContainerContextType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correlation Aggregator Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlation Aggregator Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrelationAggregatorRouterType(CorrelationAggregatorRouterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correlation Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correlation Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrelationRouterType(CorrelationRouterType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Custom Container Context Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Container Context Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomContainerContextType(CustomContainerContextType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Custom Entrypoint Resolver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Entrypoint Resolver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomEntrypointResolverType(CustomEntrypointResolverType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Custom Response Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Response Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomResponseRouterType(CustomResponseRouterType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Custom Transaction Factory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Transaction Factory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomTransactionFactoryType(CustomTransactionFactoryType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Default Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Service Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultServiceType(DefaultServiceType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Exception Strategy Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exception Strategy Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExceptionStrategyType(ExceptionStrategyType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Filter Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFilterRefType(FilterRefType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Forwarding Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forwarding Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForwardingRouterType(ForwardingRouterType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Idempotent Receiver Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Idempotent Receiver Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdempotentReceiverType(IdempotentReceiverType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Inbound Router Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inbound Router Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInboundRouterCollectionType(InboundRouterCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ioc Container Context Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ioc Container Context Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIocContainerContextType(IocContainerContextType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Mule Admin Agent Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mule Admin Agent Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMuleAdminAgentType(MuleAdminAgentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mule Management Context Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mule Management Context Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMuleManagementContextType(MuleManagementContextType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Mule Unsafe Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mule Unsafe Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMuleUnsafeType(MuleUnsafeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Args Call Delegate Class Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Args Call Delegate Class Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoArgsCallDelegateClassType(NoArgsCallDelegateClassType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Args Call Delegate Instance Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Args Call Delegate Instance Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoArgsCallDelegateInstanceType(NoArgsCallDelegateInstanceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>No Args Call Wrapper Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>No Args Call Wrapper Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoArgsCallWrapperType(NoArgsCallWrapperType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Outbound Router Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Outbound Router Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutboundRouterCollectionType(OutboundRouterCollectionType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Pojo Component Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pojo Component Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePojoComponentType(PojoComponentType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pooled Object Factory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pooled Object Factory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePooledObjectFactoryType(PooledObjectFactoryType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Properties Container Context Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Container Context Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertiesContainerContextType(PropertiesContainerContextType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Response Endpoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Endpoint Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseEndpointType(ResponseEndpointType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Router Collection Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Router Collection Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseRouterCollectionType(ResponseRouterCollectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Router Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Router Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseRouterType(ResponseRouterType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Rmi Container Context Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rmi Container Context Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRmiContainerContextType(RmiContainerContextType object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Ref Factory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Ref Factory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionRefFactoryType(TransactionRefFactoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionType(TransactionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformer Append String Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformer Append String Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformerAppendStringType(TransformerAppendStringType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transformer Ref Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transformer Ref Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransformerRefType(TransformerRefType object) {
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
