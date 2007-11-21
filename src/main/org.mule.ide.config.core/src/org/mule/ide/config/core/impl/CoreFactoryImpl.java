/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.mule.ide.config.core.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mulesource.org/schema/mule/core/2.0"); 
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CorePackage.ABSTRACT_AGENT_TYPE: return createAbstractAgentType();
			case CorePackage.ABSTRACT_BINDING_TYPE: return createAbstractBindingType();
			case CorePackage.ABSTRACT_CATCH_ALL_STRATEGY_TYPE: return createAbstractCatchAllStrategyType();
			case CorePackage.ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE: return createAbstractComponentThreadingProfileType();
			case CorePackage.ABSTRACT_CONNECTION_STRATEGY_TYPE: return createAbstractConnectionStrategyType();
			case CorePackage.ABSTRACT_CONNECTOR_TYPE: return createAbstractConnectorType();
			case CorePackage.ABSTRACT_ENTRYPOINT_RESOLVER_TYPE: return createAbstractEntrypointResolverType();
			case CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE: return createAbstractExceptionStrategyType();
			case CorePackage.ABSTRACT_EXTENSION_TYPE: return createAbstractExtensionType();
			case CorePackage.ABSTRACT_FILTER_TYPE: return createAbstractFilterType();
			case CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE: return createAbstractGlobalEndpointType();
			case CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE: return createAbstractInboundEndpointType();
			case CorePackage.ABSTRACT_INBOUND_ROUTER_TYPE: return createAbstractInboundRouterType();
			case CorePackage.ABSTRACT_MODEL_TYPE: return createAbstractModelType();
			case CorePackage.ABSTRACT_OBJECT_FACTORY_TYPE: return createAbstractObjectFactoryType();
			case CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE: return createAbstractOutboundEndpointType();
			case CorePackage.ABSTRACT_OUTBOUND_ROUTER_TYPE: return createAbstractOutboundRouterType();
			case CorePackage.ABSTRACT_POOLING_PROFILE_TYPE: return createAbstractPoolingProfileType();
			case CorePackage.ABSTRACT_PROPERTY_EXTRACTOR_TYPE: return createAbstractPropertyExtractorType();
			case CorePackage.ABSTRACT_QUEUE_PROFILE_TYPE: return createAbstractQueueProfileType();
			case CorePackage.ABSTRACT_RESPONSE_ENDPOINT_TYPE: return createAbstractResponseEndpointType();
			case CorePackage.ABSTRACT_RESPONSE_ROUTER_TYPE: return createAbstractResponseRouterType();
			case CorePackage.ABSTRACT_SECURITY_FILTER_TYPE: return createAbstractSecurityFilterType();
			case CorePackage.ABSTRACT_SECURITY_MANAGER_TYPE: return createAbstractSecurityManagerType();
			case CorePackage.ABSTRACT_SERVICE_TYPE: return createAbstractServiceType();
			case CorePackage.ABSTRACT_STORAGE_TYPE: return createAbstractStorageType();
			case CorePackage.ABSTRACT_TRANSACTION_FACTORY_TYPE: return createAbstractTransactionFactoryType();
			case CorePackage.ABSTRACT_TRANSACTION_MANAGER_TYPE: return createAbstractTransactionManagerType();
			case CorePackage.ABSTRACT_TRANSACTION_TYPE: return createAbstractTransactionType();
			case CorePackage.ABSTRACT_TRANSFORMER_TYPE: return createAbstractTransformerType();
			case CorePackage.BASE_CONTAINER_CONTEXT_TYPE: return createBaseContainerContextType();
			case CorePackage.BASE_SERVICE_TYPE: return createBaseServiceType();
			case CorePackage.CALLABLE_ENTRYPOINT_RESOLVER_TYPE: return createCallableEntrypointResolverType();
			case CorePackage.CHUNKING_ROUTER_TYPE: return createChunkingRouterType();
			case CorePackage.COLLECTION_FILTER_TYPE: return createCollectionFilterType();
			case CorePackage.CONNECTION_STRATEGY_TYPE: return createConnectionStrategyType();
			case CorePackage.CONNECTOR_TYPE: return createConnectorType();
			case CorePackage.CONTAINER_CONTEXT_TYPE: return createContainerContextType();
			case CorePackage.CORRELATION_AGGREGATOR_ROUTER_TYPE: return createCorrelationAggregatorRouterType();
			case CorePackage.CORRELATION_ROUTER_TYPE: return createCorrelationRouterType();
			case CorePackage.CUSTOM_CATCH_ALL_STRATEGY_TYPE: return createCustomCatchAllStrategyType();
			case CorePackage.CUSTOM_CONNECTION_STRATEGY_TYPE: return createCustomConnectionStrategyType();
			case CorePackage.CUSTOM_CONNECTOR_TYPE: return createCustomConnectorType();
			case CorePackage.CUSTOM_CONTAINER_CONTEXT_TYPE: return createCustomContainerContextType();
			case CorePackage.CUSTOM_ENCRYPTION_STRATEGY_TYPE: return createCustomEncryptionStrategyType();
			case CorePackage.CUSTOM_ENTRYPOINT_RESOLVER_TYPE: return createCustomEntrypointResolverType();
			case CorePackage.CUSTOM_EXCEPTION_STRATEGY_TYPE: return createCustomExceptionStrategyType();
			case CorePackage.CUSTOM_FILTER_TYPE: return createCustomFilterType();
			case CorePackage.CUSTOM_FORWARDING_CATCH_ALL_STRATEGY_TYPE: return createCustomForwardingCatchAllStrategyType();
			case CorePackage.CUSTOM_INBOUND_ROUTER_TYPE: return createCustomInboundRouterType();
			case CorePackage.CUSTOM_OUTBOUND_ROUTER_TYPE: return createCustomOutboundRouterType();
			case CorePackage.CUSTOM_PROPERTY_EXTRACTOR_TYPE: return createCustomPropertyExtractorType();
			case CorePackage.CUSTOM_RESPONSE_ROUTER_TYPE: return createCustomResponseRouterType();
			case CorePackage.CUSTOM_SECURITY_PROVIDER_TYPE: return createCustomSecurityProviderType();
			case CorePackage.CUSTOM_TRANSACTION_FACTORY_TYPE: return createCustomTransactionFactoryType();
			case CorePackage.CUSTOM_TRANSACTION_MANAGER_TYPE: return createCustomTransactionManagerType();
			case CorePackage.CUSTOM_TRANSFORMER_TYPE: return createCustomTransformerType();
			case CorePackage.DEFAULT_COMPONENT_TYPE: return createDefaultComponentType();
			case CorePackage.DEFAULT_MODEL_TYPE: return createDefaultModelType();
			case CorePackage.DEFAULT_SERVICE_TYPE: return createDefaultServiceType();
			case CorePackage.DESCRIPTION_TYPE: return createDescriptionType();
			case CorePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case CorePackage.ENCRYPTION_SECURITY_FILTER_TYPE: return createEncryptionSecurityFilterType();
			case CorePackage.ENCRYPTION_STRATEGY_TYPE: return createEncryptionStrategyType();
			case CorePackage.ENDPOINT_SELECTOR_ROUTER_TYPE: return createEndpointSelectorRouterType();
			case CorePackage.ENVIRONMENT_PROPERTY_TYPE: return createEnvironmentPropertyType();
			case CorePackage.EXCEPTION_STRATEGY_TYPE: return createExceptionStrategyType();
			case CorePackage.FILTERED_INBOUND_ROUTER_TYPE: return createFilteredInboundRouterType();
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE: return createFilteringOutboundRouterType();
			case CorePackage.FILTER_REF_TYPE: return createFilterRefType();
			case CorePackage.FORWARDING_CATCH_ALL_STRATEGY_TYPE: return createForwardingCatchAllStrategyType();
			case CorePackage.FORWARDING_ROUTER_TYPE: return createForwardingRouterType();
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE: return createGenericObjectFactoryType();
			case CorePackage.GLOBAL_ENDPOINT_TYPE: return createGlobalEndpointType();
			case CorePackage.IDEMPOTENT_RECEIVER_TYPE: return createIdempotentReceiverType();
			case CorePackage.INBOUND_ENDPOINT_TYPE: return createInboundEndpointType();
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE: return createInboundRouterCollectionType();
			case CorePackage.IOC_CONTAINER_CONTEXT_TYPE: return createIocContainerContextType();
			case CorePackage.JNDI_CONNECTOR_TYPE: return createJndiConnectorType();
			case CorePackage.JNDI_TRANSACTION_MANAGER_TYPE: return createJndiTransactionManagerType();
			case CorePackage.LIST_OR_SET_TYPE: return createListOrSetType();
			case CorePackage.LOGGING_CATCH_ALL_STRATEGY_TYPE: return createLoggingCatchAllStrategyType();
			case CorePackage.MAP_TYPE: return createMapType();
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE: return createMessagePropertiesTransformerType();
			case CorePackage.MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE: return createMessageSplitterOutboundRouterType();
			case CorePackage.MULE_ADMIN_AGENT_TYPE: return createMuleAdminAgentType();
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE: return createMuleManagementContextType();
			case CorePackage.MULE_TYPE: return createMuleType();
			case CorePackage.MULE_UNSAFE_TYPE: return createMuleUnsafeType();
			case CorePackage.NESTED_BINDING_TYPE: return createNestedBindingType();
			case CorePackage.NESTED_ROUTER_COLLECTION_TYPE: return createNestedRouterCollectionType();
			case CorePackage.NO_ARGS_CALL_DELEGATE_CLASS_TYPE: return createNoArgsCallDelegateClassType();
			case CorePackage.NO_ARGS_CALL_DELEGATE_INSTANCE_TYPE: return createNoArgsCallDelegateInstanceType();
			case CorePackage.NO_ARGS_CALL_WRAPPER_TYPE: return createNoArgsCallWrapperType();
			case CorePackage.OUTBOUND_ENDPOINT_TYPE: return createOutboundEndpointType();
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE: return createOutboundRouterCollectionType();
			case CorePackage.OUTBOUND_ROUTER_TYPE: return createOutboundRouterType();
			case CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE: return createPasswordEncryptionStrategyType();
			case CorePackage.PATTERN_FILTER_TYPE: return createPatternFilterType();
			case CorePackage.POOLED_OBJECT_FACTORY_TYPE: return createPooledObjectFactoryType();
			case CorePackage.POOLING_PROFILE_TYPE: return createPoolingProfileType();
			case CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE: return createPropertiesContainerContextType();
			case CorePackage.PROTOTYPE_OBJECT_FACTORY_TYPE: return createPrototypeObjectFactoryType();
			case CorePackage.QUEUE_PROFILE_TYPE: return createQueueProfileType();
			case CorePackage.REFERENCE_TYPE: return createReferenceType();
			case CorePackage.REPLY_TO_TYPE: return createReplyToType();
			case CorePackage.RESPONSE_ENDPOINT_TYPE: return createResponseEndpointType();
			case CorePackage.RESPONSE_ROUTER_COLLECTION_TYPE: return createResponseRouterCollectionType();
			case CorePackage.RESPONSE_ROUTER_TYPE: return createResponseRouterType();
			case CorePackage.RETRY_CONNECTION_STRATEGY_TYPE: return createRetryConnectionStrategyType();
			case CorePackage.RMI_CONTAINER_CONTEXT_TYPE: return createRmiContainerContextType();
			case CorePackage.SECRET_KEY_ENCRYPTION_STRATEGY_TYPE: return createSecretKeyEncryptionStrategyType();
			case CorePackage.SECURITY_MANAGER_TYPE: return createSecurityManagerType();
			case CorePackage.SECURITY_PROVIDER_TYPE: return createSecurityProviderType();
			case CorePackage.SEDA_MODEL_TYPE: return createSedaModelType();
			case CorePackage.SEDA_SERVICE_TYPE: return createSedaServiceType();
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE: return createSelectiveConsumerRouterType();
			case CorePackage.SERVICE_OVERRIDES_TYPE: return createServiceOverridesType();
			case CorePackage.SINGLETON_OBJECT_FACTORY_TYPE: return createSingletonObjectFactoryType();
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE: return createStaticRecipientListRouterType();
			case CorePackage.THREADING_PROFILE_TYPE: return createThreadingProfileType();
			case CorePackage.TLS_CLIENT_KEY_STORE_TYPE: return createTlsClientKeyStoreType();
			case CorePackage.TLS_KEY_STORE_TYPE: return createTlsKeyStoreType();
			case CorePackage.TLS_PROTOCOL_HANDLER: return createTlsProtocolHandler();
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE: return createTlsServerTrustStoreType();
			case CorePackage.TLS_TRUST_STORE_TYPE: return createTlsTrustStoreType();
			case CorePackage.TRANSACTION_MANAGER_TYPE: return createTransactionManagerType();
			case CorePackage.TRANSACTION_REF_FACTORY_TYPE: return createTransactionRefFactoryType();
			case CorePackage.TRANSACTION_TYPE: return createTransactionType();
			case CorePackage.TRANSFORMER_APPEND_STRING_TYPE: return createTransformerAppendStringType();
			case CorePackage.TRANSFORMER_REF_TYPE: return createTransformerRefType();
			case CorePackage.TYPE_FILTER_TYPE: return createTypeFilterType();
			case CorePackage.UNITARY_FILTER_TYPE: return createUnitaryFilterType();
			case CorePackage.WILDCARD_FILTER_TYPE: return createWildcardFilterType();
			case CorePackage.WIRE_TAP_ROUTER_TYPE: return createWireTapRouterType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case CorePackage.ACTION_TYPE:
				return createActionTypeFromString(eDataType, initialValue);
			case CorePackage.CREATE_CONNECTOR_TYPE:
				return createCreateConnectorTypeFromString(eDataType, initialValue);
			case CorePackage.ENABLE_CORRELATION_TYPE:
				return createEnableCorrelationTypeFromString(eDataType, initialValue);
			case CorePackage.EXHAUSTED_ACTION_TYPE:
				return createExhaustedActionTypeFromString(eDataType, initialValue);
			case CorePackage.INITIALISATION_POLICY_TYPE:
				return createInitialisationPolicyTypeFromString(eDataType, initialValue);
			case CorePackage.INITIAL_STATE_TYPE:
				return createInitialStateTypeFromString(eDataType, initialValue);
			case CorePackage.POOL_EXHAUSTED_ACTION_TYPE:
				return createPoolExhaustedActionTypeFromString(eDataType, initialValue);
			case CorePackage.SCOPE_TYPE:
				return createScopeTypeFromString(eDataType, initialValue);
			case CorePackage.ACTION_TYPE_OBJECT:
				return createActionTypeObjectFromString(eDataType, initialValue);
			case CorePackage.CREATE_CONNECTOR_TYPE_OBJECT:
				return createCreateConnectorTypeObjectFromString(eDataType, initialValue);
			case CorePackage.ENABLE_CORRELATION_TYPE_OBJECT:
				return createEnableCorrelationTypeObjectFromString(eDataType, initialValue);
			case CorePackage.EXHAUSTED_ACTION_TYPE_OBJECT:
				return createExhaustedActionTypeObjectFromString(eDataType, initialValue);
			case CorePackage.INITIALISATION_POLICY_TYPE_OBJECT:
				return createInitialisationPolicyTypeObjectFromString(eDataType, initialValue);
			case CorePackage.INITIAL_STATE_TYPE_OBJECT:
				return createInitialStateTypeObjectFromString(eDataType, initialValue);
			case CorePackage.POOL_EXHAUSTED_ACTION_TYPE_OBJECT:
				return createPoolExhaustedActionTypeObjectFromString(eDataType, initialValue);
			case CorePackage.PROPERTY_PLACEHOLDER_TYPE:
				return createPropertyPlaceholderTypeFromString(eDataType, initialValue);
			case CorePackage.SCOPE_TYPE_OBJECT:
				return createScopeTypeObjectFromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_BOOLEAN:
				return createSubstitutableBooleanFromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_BOOLEAN_MEMBER0:
				return createSubstitutableBooleanMember0FromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_BOOLEAN_MEMBER0_OBJECT:
				return createSubstitutableBooleanMember0ObjectFromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_BOOLEAN_OBJECT:
				return createSubstitutableBooleanObjectFromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_CLASS:
				return createSubstitutableClassFromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_CLASS_MEMBER0:
				return createSubstitutableClassMember0FromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_INT:
				return createSubstitutableIntFromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_INT_MEMBER0:
				return createSubstitutableIntMember0FromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_INT_MEMBER0_OBJECT:
				return createSubstitutableIntMember0ObjectFromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_INT_OBJECT:
				return createSubstitutableIntObjectFromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_LONG:
				return createSubstitutableLongFromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_LONG_MEMBER0:
				return createSubstitutableLongMember0FromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_LONG_MEMBER0_OBJECT:
				return createSubstitutableLongMember0ObjectFromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_LONG_OBJECT:
				return createSubstitutableLongObjectFromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_PORT_NUMBER:
				return createSubstitutablePortNumberFromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_PORT_NUMBER_MEMBER0:
				return createSubstitutablePortNumberMember0FromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_PORT_NUMBER_MEMBER0_OBJECT:
				return createSubstitutablePortNumberMember0ObjectFromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_PORT_NUMBER_OBJECT:
				return createSubstitutablePortNumberObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case CorePackage.ACTION_TYPE:
				return convertActionTypeToString(eDataType, instanceValue);
			case CorePackage.CREATE_CONNECTOR_TYPE:
				return convertCreateConnectorTypeToString(eDataType, instanceValue);
			case CorePackage.ENABLE_CORRELATION_TYPE:
				return convertEnableCorrelationTypeToString(eDataType, instanceValue);
			case CorePackage.EXHAUSTED_ACTION_TYPE:
				return convertExhaustedActionTypeToString(eDataType, instanceValue);
			case CorePackage.INITIALISATION_POLICY_TYPE:
				return convertInitialisationPolicyTypeToString(eDataType, instanceValue);
			case CorePackage.INITIAL_STATE_TYPE:
				return convertInitialStateTypeToString(eDataType, instanceValue);
			case CorePackage.POOL_EXHAUSTED_ACTION_TYPE:
				return convertPoolExhaustedActionTypeToString(eDataType, instanceValue);
			case CorePackage.SCOPE_TYPE:
				return convertScopeTypeToString(eDataType, instanceValue);
			case CorePackage.ACTION_TYPE_OBJECT:
				return convertActionTypeObjectToString(eDataType, instanceValue);
			case CorePackage.CREATE_CONNECTOR_TYPE_OBJECT:
				return convertCreateConnectorTypeObjectToString(eDataType, instanceValue);
			case CorePackage.ENABLE_CORRELATION_TYPE_OBJECT:
				return convertEnableCorrelationTypeObjectToString(eDataType, instanceValue);
			case CorePackage.EXHAUSTED_ACTION_TYPE_OBJECT:
				return convertExhaustedActionTypeObjectToString(eDataType, instanceValue);
			case CorePackage.INITIALISATION_POLICY_TYPE_OBJECT:
				return convertInitialisationPolicyTypeObjectToString(eDataType, instanceValue);
			case CorePackage.INITIAL_STATE_TYPE_OBJECT:
				return convertInitialStateTypeObjectToString(eDataType, instanceValue);
			case CorePackage.POOL_EXHAUSTED_ACTION_TYPE_OBJECT:
				return convertPoolExhaustedActionTypeObjectToString(eDataType, instanceValue);
			case CorePackage.PROPERTY_PLACEHOLDER_TYPE:
				return convertPropertyPlaceholderTypeToString(eDataType, instanceValue);
			case CorePackage.SCOPE_TYPE_OBJECT:
				return convertScopeTypeObjectToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_BOOLEAN:
				return convertSubstitutableBooleanToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_BOOLEAN_MEMBER0:
				return convertSubstitutableBooleanMember0ToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_BOOLEAN_MEMBER0_OBJECT:
				return convertSubstitutableBooleanMember0ObjectToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_BOOLEAN_OBJECT:
				return convertSubstitutableBooleanObjectToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_CLASS:
				return convertSubstitutableClassToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_CLASS_MEMBER0:
				return convertSubstitutableClassMember0ToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_INT:
				return convertSubstitutableIntToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_INT_MEMBER0:
				return convertSubstitutableIntMember0ToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_INT_MEMBER0_OBJECT:
				return convertSubstitutableIntMember0ObjectToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_INT_OBJECT:
				return convertSubstitutableIntObjectToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_LONG:
				return convertSubstitutableLongToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_LONG_MEMBER0:
				return convertSubstitutableLongMember0ToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_LONG_MEMBER0_OBJECT:
				return convertSubstitutableLongMember0ObjectToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_LONG_OBJECT:
				return convertSubstitutableLongObjectToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_PORT_NUMBER:
				return convertSubstitutablePortNumberToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_PORT_NUMBER_MEMBER0:
				return convertSubstitutablePortNumberMember0ToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_PORT_NUMBER_MEMBER0_OBJECT:
				return convertSubstitutablePortNumberMember0ObjectToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_PORT_NUMBER_OBJECT:
				return convertSubstitutablePortNumberObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractAgentType createAbstractAgentType() {
		AbstractAgentTypeImpl abstractAgentType = new AbstractAgentTypeImpl();
		return abstractAgentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractBindingType createAbstractBindingType() {
		AbstractBindingTypeImpl abstractBindingType = new AbstractBindingTypeImpl();
		return abstractBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractCatchAllStrategyType createAbstractCatchAllStrategyType() {
		AbstractCatchAllStrategyTypeImpl abstractCatchAllStrategyType = new AbstractCatchAllStrategyTypeImpl();
		return abstractCatchAllStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractComponentThreadingProfileType createAbstractComponentThreadingProfileType() {
		AbstractComponentThreadingProfileTypeImpl abstractComponentThreadingProfileType = new AbstractComponentThreadingProfileTypeImpl();
		return abstractComponentThreadingProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectionStrategyType createAbstractConnectionStrategyType() {
		AbstractConnectionStrategyTypeImpl abstractConnectionStrategyType = new AbstractConnectionStrategyTypeImpl();
		return abstractConnectionStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConnectorType createAbstractConnectorType() {
		AbstractConnectorTypeImpl abstractConnectorType = new AbstractConnectorTypeImpl();
		return abstractConnectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEntrypointResolverType createAbstractEntrypointResolverType() {
		AbstractEntrypointResolverTypeImpl abstractEntrypointResolverType = new AbstractEntrypointResolverTypeImpl();
		return abstractEntrypointResolverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExceptionStrategyType createAbstractExceptionStrategyType() {
		AbstractExceptionStrategyTypeImpl abstractExceptionStrategyType = new AbstractExceptionStrategyTypeImpl();
		return abstractExceptionStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractExtensionType createAbstractExtensionType() {
		AbstractExtensionTypeImpl abstractExtensionType = new AbstractExtensionTypeImpl();
		return abstractExtensionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFilterType createAbstractFilterType() {
		AbstractFilterTypeImpl abstractFilterType = new AbstractFilterTypeImpl();
		return abstractFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractGlobalEndpointType createAbstractGlobalEndpointType() {
		AbstractGlobalEndpointTypeImpl abstractGlobalEndpointType = new AbstractGlobalEndpointTypeImpl();
		return abstractGlobalEndpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInboundEndpointType createAbstractInboundEndpointType() {
		AbstractInboundEndpointTypeImpl abstractInboundEndpointType = new AbstractInboundEndpointTypeImpl();
		return abstractInboundEndpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractInboundRouterType createAbstractInboundRouterType() {
		AbstractInboundRouterTypeImpl abstractInboundRouterType = new AbstractInboundRouterTypeImpl();
		return abstractInboundRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractModelType createAbstractModelType() {
		AbstractModelTypeImpl abstractModelType = new AbstractModelTypeImpl();
		return abstractModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractObjectFactoryType createAbstractObjectFactoryType() {
		AbstractObjectFactoryTypeImpl abstractObjectFactoryType = new AbstractObjectFactoryTypeImpl();
		return abstractObjectFactoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractOutboundEndpointType createAbstractOutboundEndpointType() {
		AbstractOutboundEndpointTypeImpl abstractOutboundEndpointType = new AbstractOutboundEndpointTypeImpl();
		return abstractOutboundEndpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractOutboundRouterType createAbstractOutboundRouterType() {
		AbstractOutboundRouterTypeImpl abstractOutboundRouterType = new AbstractOutboundRouterTypeImpl();
		return abstractOutboundRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPoolingProfileType createAbstractPoolingProfileType() {
		AbstractPoolingProfileTypeImpl abstractPoolingProfileType = new AbstractPoolingProfileTypeImpl();
		return abstractPoolingProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractPropertyExtractorType createAbstractPropertyExtractorType() {
		AbstractPropertyExtractorTypeImpl abstractPropertyExtractorType = new AbstractPropertyExtractorTypeImpl();
		return abstractPropertyExtractorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractQueueProfileType createAbstractQueueProfileType() {
		AbstractQueueProfileTypeImpl abstractQueueProfileType = new AbstractQueueProfileTypeImpl();
		return abstractQueueProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractResponseEndpointType createAbstractResponseEndpointType() {
		AbstractResponseEndpointTypeImpl abstractResponseEndpointType = new AbstractResponseEndpointTypeImpl();
		return abstractResponseEndpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractResponseRouterType createAbstractResponseRouterType() {
		AbstractResponseRouterTypeImpl abstractResponseRouterType = new AbstractResponseRouterTypeImpl();
		return abstractResponseRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSecurityFilterType createAbstractSecurityFilterType() {
		AbstractSecurityFilterTypeImpl abstractSecurityFilterType = new AbstractSecurityFilterTypeImpl();
		return abstractSecurityFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractSecurityManagerType createAbstractSecurityManagerType() {
		AbstractSecurityManagerTypeImpl abstractSecurityManagerType = new AbstractSecurityManagerTypeImpl();
		return abstractSecurityManagerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractServiceType createAbstractServiceType() {
		AbstractServiceTypeImpl abstractServiceType = new AbstractServiceTypeImpl();
		return abstractServiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStorageType createAbstractStorageType() {
		AbstractStorageTypeImpl abstractStorageType = new AbstractStorageTypeImpl();
		return abstractStorageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransactionFactoryType createAbstractTransactionFactoryType() {
		AbstractTransactionFactoryTypeImpl abstractTransactionFactoryType = new AbstractTransactionFactoryTypeImpl();
		return abstractTransactionFactoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransactionManagerType createAbstractTransactionManagerType() {
		AbstractTransactionManagerTypeImpl abstractTransactionManagerType = new AbstractTransactionManagerTypeImpl();
		return abstractTransactionManagerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransactionType createAbstractTransactionType() {
		AbstractTransactionTypeImpl abstractTransactionType = new AbstractTransactionTypeImpl();
		return abstractTransactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransformerType createAbstractTransformerType() {
		AbstractTransformerTypeImpl abstractTransformerType = new AbstractTransformerTypeImpl();
		return abstractTransformerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseContainerContextType createBaseContainerContextType() {
		BaseContainerContextTypeImpl baseContainerContextType = new BaseContainerContextTypeImpl();
		return baseContainerContextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseServiceType createBaseServiceType() {
		BaseServiceTypeImpl baseServiceType = new BaseServiceTypeImpl();
		return baseServiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallableEntrypointResolverType createCallableEntrypointResolverType() {
		CallableEntrypointResolverTypeImpl callableEntrypointResolverType = new CallableEntrypointResolverTypeImpl();
		return callableEntrypointResolverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChunkingRouterType createChunkingRouterType() {
		ChunkingRouterTypeImpl chunkingRouterType = new ChunkingRouterTypeImpl();
		return chunkingRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionFilterType createCollectionFilterType() {
		CollectionFilterTypeImpl collectionFilterType = new CollectionFilterTypeImpl();
		return collectionFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionStrategyType createConnectionStrategyType() {
		ConnectionStrategyTypeImpl connectionStrategyType = new ConnectionStrategyTypeImpl();
		return connectionStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectorType createConnectorType() {
		ConnectorTypeImpl connectorType = new ConnectorTypeImpl();
		return connectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerContextType createContainerContextType() {
		ContainerContextTypeImpl containerContextType = new ContainerContextTypeImpl();
		return containerContextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationAggregatorRouterType createCorrelationAggregatorRouterType() {
		CorrelationAggregatorRouterTypeImpl correlationAggregatorRouterType = new CorrelationAggregatorRouterTypeImpl();
		return correlationAggregatorRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorrelationRouterType createCorrelationRouterType() {
		CorrelationRouterTypeImpl correlationRouterType = new CorrelationRouterTypeImpl();
		return correlationRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomCatchAllStrategyType createCustomCatchAllStrategyType() {
		CustomCatchAllStrategyTypeImpl customCatchAllStrategyType = new CustomCatchAllStrategyTypeImpl();
		return customCatchAllStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomConnectionStrategyType createCustomConnectionStrategyType() {
		CustomConnectionStrategyTypeImpl customConnectionStrategyType = new CustomConnectionStrategyTypeImpl();
		return customConnectionStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomConnectorType createCustomConnectorType() {
		CustomConnectorTypeImpl customConnectorType = new CustomConnectorTypeImpl();
		return customConnectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomContainerContextType createCustomContainerContextType() {
		CustomContainerContextTypeImpl customContainerContextType = new CustomContainerContextTypeImpl();
		return customContainerContextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEncryptionStrategyType createCustomEncryptionStrategyType() {
		CustomEncryptionStrategyTypeImpl customEncryptionStrategyType = new CustomEncryptionStrategyTypeImpl();
		return customEncryptionStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEntrypointResolverType createCustomEntrypointResolverType() {
		CustomEntrypointResolverTypeImpl customEntrypointResolverType = new CustomEntrypointResolverTypeImpl();
		return customEntrypointResolverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomExceptionStrategyType createCustomExceptionStrategyType() {
		CustomExceptionStrategyTypeImpl customExceptionStrategyType = new CustomExceptionStrategyTypeImpl();
		return customExceptionStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomFilterType createCustomFilterType() {
		CustomFilterTypeImpl customFilterType = new CustomFilterTypeImpl();
		return customFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomForwardingCatchAllStrategyType createCustomForwardingCatchAllStrategyType() {
		CustomForwardingCatchAllStrategyTypeImpl customForwardingCatchAllStrategyType = new CustomForwardingCatchAllStrategyTypeImpl();
		return customForwardingCatchAllStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomInboundRouterType createCustomInboundRouterType() {
		CustomInboundRouterTypeImpl customInboundRouterType = new CustomInboundRouterTypeImpl();
		return customInboundRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomOutboundRouterType createCustomOutboundRouterType() {
		CustomOutboundRouterTypeImpl customOutboundRouterType = new CustomOutboundRouterTypeImpl();
		return customOutboundRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomPropertyExtractorType createCustomPropertyExtractorType() {
		CustomPropertyExtractorTypeImpl customPropertyExtractorType = new CustomPropertyExtractorTypeImpl();
		return customPropertyExtractorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomResponseRouterType createCustomResponseRouterType() {
		CustomResponseRouterTypeImpl customResponseRouterType = new CustomResponseRouterTypeImpl();
		return customResponseRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomSecurityProviderType createCustomSecurityProviderType() {
		CustomSecurityProviderTypeImpl customSecurityProviderType = new CustomSecurityProviderTypeImpl();
		return customSecurityProviderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTransactionFactoryType createCustomTransactionFactoryType() {
		CustomTransactionFactoryTypeImpl customTransactionFactoryType = new CustomTransactionFactoryTypeImpl();
		return customTransactionFactoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTransactionManagerType createCustomTransactionManagerType() {
		CustomTransactionManagerTypeImpl customTransactionManagerType = new CustomTransactionManagerTypeImpl();
		return customTransactionManagerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomTransformerType createCustomTransformerType() {
		CustomTransformerTypeImpl customTransformerType = new CustomTransformerTypeImpl();
		return customTransformerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultComponentType createDefaultComponentType() {
		DefaultComponentTypeImpl defaultComponentType = new DefaultComponentTypeImpl();
		return defaultComponentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultModelType createDefaultModelType() {
		DefaultModelTypeImpl defaultModelType = new DefaultModelTypeImpl();
		return defaultModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultServiceType createDefaultServiceType() {
		DefaultServiceTypeImpl defaultServiceType = new DefaultServiceTypeImpl();
		return defaultServiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DescriptionType createDescriptionType() {
		DescriptionTypeImpl descriptionType = new DescriptionTypeImpl();
		return descriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncryptionSecurityFilterType createEncryptionSecurityFilterType() {
		EncryptionSecurityFilterTypeImpl encryptionSecurityFilterType = new EncryptionSecurityFilterTypeImpl();
		return encryptionSecurityFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncryptionStrategyType createEncryptionStrategyType() {
		EncryptionStrategyTypeImpl encryptionStrategyType = new EncryptionStrategyTypeImpl();
		return encryptionStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointSelectorRouterType createEndpointSelectorRouterType() {
		EndpointSelectorRouterTypeImpl endpointSelectorRouterType = new EndpointSelectorRouterTypeImpl();
		return endpointSelectorRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentPropertyType createEnvironmentPropertyType() {
		EnvironmentPropertyTypeImpl environmentPropertyType = new EnvironmentPropertyTypeImpl();
		return environmentPropertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExceptionStrategyType createExceptionStrategyType() {
		ExceptionStrategyTypeImpl exceptionStrategyType = new ExceptionStrategyTypeImpl();
		return exceptionStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteredInboundRouterType createFilteredInboundRouterType() {
		FilteredInboundRouterTypeImpl filteredInboundRouterType = new FilteredInboundRouterTypeImpl();
		return filteredInboundRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteringOutboundRouterType createFilteringOutboundRouterType() {
		FilteringOutboundRouterTypeImpl filteringOutboundRouterType = new FilteringOutboundRouterTypeImpl();
		return filteringOutboundRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilterRefType createFilterRefType() {
		FilterRefTypeImpl filterRefType = new FilterRefTypeImpl();
		return filterRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForwardingCatchAllStrategyType createForwardingCatchAllStrategyType() {
		ForwardingCatchAllStrategyTypeImpl forwardingCatchAllStrategyType = new ForwardingCatchAllStrategyTypeImpl();
		return forwardingCatchAllStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForwardingRouterType createForwardingRouterType() {
		ForwardingRouterTypeImpl forwardingRouterType = new ForwardingRouterTypeImpl();
		return forwardingRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericObjectFactoryType createGenericObjectFactoryType() {
		GenericObjectFactoryTypeImpl genericObjectFactoryType = new GenericObjectFactoryTypeImpl();
		return genericObjectFactoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalEndpointType createGlobalEndpointType() {
		GlobalEndpointTypeImpl globalEndpointType = new GlobalEndpointTypeImpl();
		return globalEndpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdempotentReceiverType createIdempotentReceiverType() {
		IdempotentReceiverTypeImpl idempotentReceiverType = new IdempotentReceiverTypeImpl();
		return idempotentReceiverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundEndpointType createInboundEndpointType() {
		InboundEndpointTypeImpl inboundEndpointType = new InboundEndpointTypeImpl();
		return inboundEndpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundRouterCollectionType createInboundRouterCollectionType() {
		InboundRouterCollectionTypeImpl inboundRouterCollectionType = new InboundRouterCollectionTypeImpl();
		return inboundRouterCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IocContainerContextType createIocContainerContextType() {
		IocContainerContextTypeImpl iocContainerContextType = new IocContainerContextTypeImpl();
		return iocContainerContextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JndiConnectorType createJndiConnectorType() {
		JndiConnectorTypeImpl jndiConnectorType = new JndiConnectorTypeImpl();
		return jndiConnectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JndiTransactionManagerType createJndiTransactionManagerType() {
		JndiTransactionManagerTypeImpl jndiTransactionManagerType = new JndiTransactionManagerTypeImpl();
		return jndiTransactionManagerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOrSetType createListOrSetType() {
		ListOrSetTypeImpl listOrSetType = new ListOrSetTypeImpl();
		return listOrSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoggingCatchAllStrategyType createLoggingCatchAllStrategyType() {
		LoggingCatchAllStrategyTypeImpl loggingCatchAllStrategyType = new LoggingCatchAllStrategyTypeImpl();
		return loggingCatchAllStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType createMapType() {
		MapTypeImpl mapType = new MapTypeImpl();
		return mapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessagePropertiesTransformerType createMessagePropertiesTransformerType() {
		MessagePropertiesTransformerTypeImpl messagePropertiesTransformerType = new MessagePropertiesTransformerTypeImpl();
		return messagePropertiesTransformerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageSplitterOutboundRouterType createMessageSplitterOutboundRouterType() {
		MessageSplitterOutboundRouterTypeImpl messageSplitterOutboundRouterType = new MessageSplitterOutboundRouterTypeImpl();
		return messageSplitterOutboundRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MuleAdminAgentType createMuleAdminAgentType() {
		MuleAdminAgentTypeImpl muleAdminAgentType = new MuleAdminAgentTypeImpl();
		return muleAdminAgentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MuleManagementContextType createMuleManagementContextType() {
		MuleManagementContextTypeImpl muleManagementContextType = new MuleManagementContextTypeImpl();
		return muleManagementContextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MuleType createMuleType() {
		MuleTypeImpl muleType = new MuleTypeImpl();
		return muleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MuleUnsafeType createMuleUnsafeType() {
		MuleUnsafeTypeImpl muleUnsafeType = new MuleUnsafeTypeImpl();
		return muleUnsafeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedBindingType createNestedBindingType() {
		NestedBindingTypeImpl nestedBindingType = new NestedBindingTypeImpl();
		return nestedBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NestedRouterCollectionType createNestedRouterCollectionType() {
		NestedRouterCollectionTypeImpl nestedRouterCollectionType = new NestedRouterCollectionTypeImpl();
		return nestedRouterCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoArgsCallDelegateClassType createNoArgsCallDelegateClassType() {
		NoArgsCallDelegateClassTypeImpl noArgsCallDelegateClassType = new NoArgsCallDelegateClassTypeImpl();
		return noArgsCallDelegateClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoArgsCallDelegateInstanceType createNoArgsCallDelegateInstanceType() {
		NoArgsCallDelegateInstanceTypeImpl noArgsCallDelegateInstanceType = new NoArgsCallDelegateInstanceTypeImpl();
		return noArgsCallDelegateInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoArgsCallWrapperType createNoArgsCallWrapperType() {
		NoArgsCallWrapperTypeImpl noArgsCallWrapperType = new NoArgsCallWrapperTypeImpl();
		return noArgsCallWrapperType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundEndpointType createOutboundEndpointType() {
		OutboundEndpointTypeImpl outboundEndpointType = new OutboundEndpointTypeImpl();
		return outboundEndpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundRouterCollectionType createOutboundRouterCollectionType() {
		OutboundRouterCollectionTypeImpl outboundRouterCollectionType = new OutboundRouterCollectionTypeImpl();
		return outboundRouterCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundRouterType createOutboundRouterType() {
		OutboundRouterTypeImpl outboundRouterType = new OutboundRouterTypeImpl();
		return outboundRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasswordEncryptionStrategyType createPasswordEncryptionStrategyType() {
		PasswordEncryptionStrategyTypeImpl passwordEncryptionStrategyType = new PasswordEncryptionStrategyTypeImpl();
		return passwordEncryptionStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatternFilterType createPatternFilterType() {
		PatternFilterTypeImpl patternFilterType = new PatternFilterTypeImpl();
		return patternFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PooledObjectFactoryType createPooledObjectFactoryType() {
		PooledObjectFactoryTypeImpl pooledObjectFactoryType = new PooledObjectFactoryTypeImpl();
		return pooledObjectFactoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolingProfileType createPoolingProfileType() {
		PoolingProfileTypeImpl poolingProfileType = new PoolingProfileTypeImpl();
		return poolingProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertiesContainerContextType createPropertiesContainerContextType() {
		PropertiesContainerContextTypeImpl propertiesContainerContextType = new PropertiesContainerContextTypeImpl();
		return propertiesContainerContextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrototypeObjectFactoryType createPrototypeObjectFactoryType() {
		PrototypeObjectFactoryTypeImpl prototypeObjectFactoryType = new PrototypeObjectFactoryTypeImpl();
		return prototypeObjectFactoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueueProfileType createQueueProfileType() {
		QueueProfileTypeImpl queueProfileType = new QueueProfileTypeImpl();
		return queueProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplyToType createReplyToType() {
		ReplyToTypeImpl replyToType = new ReplyToTypeImpl();
		return replyToType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseEndpointType createResponseEndpointType() {
		ResponseEndpointTypeImpl responseEndpointType = new ResponseEndpointTypeImpl();
		return responseEndpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseRouterCollectionType createResponseRouterCollectionType() {
		ResponseRouterCollectionTypeImpl responseRouterCollectionType = new ResponseRouterCollectionTypeImpl();
		return responseRouterCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseRouterType createResponseRouterType() {
		ResponseRouterTypeImpl responseRouterType = new ResponseRouterTypeImpl();
		return responseRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetryConnectionStrategyType createRetryConnectionStrategyType() {
		RetryConnectionStrategyTypeImpl retryConnectionStrategyType = new RetryConnectionStrategyTypeImpl();
		return retryConnectionStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RmiContainerContextType createRmiContainerContextType() {
		RmiContainerContextTypeImpl rmiContainerContextType = new RmiContainerContextTypeImpl();
		return rmiContainerContextType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretKeyEncryptionStrategyType createSecretKeyEncryptionStrategyType() {
		SecretKeyEncryptionStrategyTypeImpl secretKeyEncryptionStrategyType = new SecretKeyEncryptionStrategyTypeImpl();
		return secretKeyEncryptionStrategyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityManagerType createSecurityManagerType() {
		SecurityManagerTypeImpl securityManagerType = new SecurityManagerTypeImpl();
		return securityManagerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityProviderType createSecurityProviderType() {
		SecurityProviderTypeImpl securityProviderType = new SecurityProviderTypeImpl();
		return securityProviderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SedaModelType createSedaModelType() {
		SedaModelTypeImpl sedaModelType = new SedaModelTypeImpl();
		return sedaModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SedaServiceType createSedaServiceType() {
		SedaServiceTypeImpl sedaServiceType = new SedaServiceTypeImpl();
		return sedaServiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectiveConsumerRouterType createSelectiveConsumerRouterType() {
		SelectiveConsumerRouterTypeImpl selectiveConsumerRouterType = new SelectiveConsumerRouterTypeImpl();
		return selectiveConsumerRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceOverridesType createServiceOverridesType() {
		ServiceOverridesTypeImpl serviceOverridesType = new ServiceOverridesTypeImpl();
		return serviceOverridesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingletonObjectFactoryType createSingletonObjectFactoryType() {
		SingletonObjectFactoryTypeImpl singletonObjectFactoryType = new SingletonObjectFactoryTypeImpl();
		return singletonObjectFactoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticRecipientListRouterType createStaticRecipientListRouterType() {
		StaticRecipientListRouterTypeImpl staticRecipientListRouterType = new StaticRecipientListRouterTypeImpl();
		return staticRecipientListRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThreadingProfileType createThreadingProfileType() {
		ThreadingProfileTypeImpl threadingProfileType = new ThreadingProfileTypeImpl();
		return threadingProfileType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TlsClientKeyStoreType createTlsClientKeyStoreType() {
		TlsClientKeyStoreTypeImpl tlsClientKeyStoreType = new TlsClientKeyStoreTypeImpl();
		return tlsClientKeyStoreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TlsKeyStoreType createTlsKeyStoreType() {
		TlsKeyStoreTypeImpl tlsKeyStoreType = new TlsKeyStoreTypeImpl();
		return tlsKeyStoreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TlsProtocolHandler createTlsProtocolHandler() {
		TlsProtocolHandlerImpl tlsProtocolHandler = new TlsProtocolHandlerImpl();
		return tlsProtocolHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TlsServerTrustStoreType createTlsServerTrustStoreType() {
		TlsServerTrustStoreTypeImpl tlsServerTrustStoreType = new TlsServerTrustStoreTypeImpl();
		return tlsServerTrustStoreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TlsTrustStoreType createTlsTrustStoreType() {
		TlsTrustStoreTypeImpl tlsTrustStoreType = new TlsTrustStoreTypeImpl();
		return tlsTrustStoreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionManagerType createTransactionManagerType() {
		TransactionManagerTypeImpl transactionManagerType = new TransactionManagerTypeImpl();
		return transactionManagerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionRefFactoryType createTransactionRefFactoryType() {
		TransactionRefFactoryTypeImpl transactionRefFactoryType = new TransactionRefFactoryTypeImpl();
		return transactionRefFactoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionType createTransactionType() {
		TransactionTypeImpl transactionType = new TransactionTypeImpl();
		return transactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerAppendStringType createTransformerAppendStringType() {
		TransformerAppendStringTypeImpl transformerAppendStringType = new TransformerAppendStringTypeImpl();
		return transformerAppendStringType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransformerRefType createTransformerRefType() {
		TransformerRefTypeImpl transformerRefType = new TransformerRefTypeImpl();
		return transformerRefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeFilterType createTypeFilterType() {
		TypeFilterTypeImpl typeFilterType = new TypeFilterTypeImpl();
		return typeFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitaryFilterType createUnitaryFilterType() {
		UnitaryFilterTypeImpl unitaryFilterType = new UnitaryFilterTypeImpl();
		return unitaryFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WildcardFilterType createWildcardFilterType() {
		WildcardFilterTypeImpl wildcardFilterType = new WildcardFilterTypeImpl();
		return wildcardFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WireTapRouterType createWireTapRouterType() {
		WireTapRouterTypeImpl wireTapRouterType = new WireTapRouterTypeImpl();
		return wireTapRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeFromString(EDataType eDataType, String initialValue) {
		ActionType result = ActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateConnectorType createCreateConnectorTypeFromString(EDataType eDataType, String initialValue) {
		CreateConnectorType result = CreateConnectorType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCreateConnectorTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableCorrelationType createEnableCorrelationTypeFromString(EDataType eDataType, String initialValue) {
		EnableCorrelationType result = EnableCorrelationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnableCorrelationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExhaustedActionType createExhaustedActionTypeFromString(EDataType eDataType, String initialValue) {
		ExhaustedActionType result = ExhaustedActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExhaustedActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialisationPolicyType createInitialisationPolicyTypeFromString(EDataType eDataType, String initialValue) {
		InitialisationPolicyType result = InitialisationPolicyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitialisationPolicyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialStateType createInitialStateTypeFromString(EDataType eDataType, String initialValue) {
		InitialStateType result = InitialStateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitialStateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolExhaustedActionType createPoolExhaustedActionTypeFromString(EDataType eDataType, String initialValue) {
		PoolExhaustedActionType result = PoolExhaustedActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPoolExhaustedActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType createScopeTypeFromString(EDataType eDataType, String initialValue) {
		ScopeType result = ScopeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType createActionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createActionTypeFromString(CorePackage.eINSTANCE.getActionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertActionTypeToString(CorePackage.eINSTANCE.getActionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateConnectorType createCreateConnectorTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCreateConnectorTypeFromString(CorePackage.eINSTANCE.getCreateConnectorType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCreateConnectorTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCreateConnectorTypeToString(CorePackage.eINSTANCE.getCreateConnectorType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableCorrelationType createEnableCorrelationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEnableCorrelationTypeFromString(CorePackage.eINSTANCE.getEnableCorrelationType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEnableCorrelationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEnableCorrelationTypeToString(CorePackage.eINSTANCE.getEnableCorrelationType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExhaustedActionType createExhaustedActionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createExhaustedActionTypeFromString(CorePackage.eINSTANCE.getExhaustedActionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExhaustedActionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertExhaustedActionTypeToString(CorePackage.eINSTANCE.getExhaustedActionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialisationPolicyType createInitialisationPolicyTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInitialisationPolicyTypeFromString(CorePackage.eINSTANCE.getInitialisationPolicyType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitialisationPolicyTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInitialisationPolicyTypeToString(CorePackage.eINSTANCE.getInitialisationPolicyType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialStateType createInitialStateTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInitialStateTypeFromString(CorePackage.eINSTANCE.getInitialStateType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInitialStateTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInitialStateTypeToString(CorePackage.eINSTANCE.getInitialStateType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoolExhaustedActionType createPoolExhaustedActionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createPoolExhaustedActionTypeFromString(CorePackage.eINSTANCE.getPoolExhaustedActionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPoolExhaustedActionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPoolExhaustedActionTypeToString(CorePackage.eINSTANCE.getPoolExhaustedActionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPropertyPlaceholderTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPropertyPlaceholderTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeType createScopeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createScopeTypeFromString(CorePackage.eINSTANCE.getScopeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScopeTypeToString(CorePackage.eINSTANCE.getScopeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createSubstitutableBooleanFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Boolean result = null;
		RuntimeException exception = null;
		try {
			result = createSubstitutableBooleanMember0FromString(CorePackage.eINSTANCE.getSubstitutableBooleanMember0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutableBooleanToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (CorePackage.eINSTANCE.getSubstitutableBooleanMember0().isInstance(instanceValue)) {
			try {
				String value = convertSubstitutableBooleanMember0ToString(CorePackage.eINSTANCE.getSubstitutableBooleanMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createSubstitutableBooleanMember0FromString(EDataType eDataType, String initialValue) {
		return (Boolean)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.BOOLEAN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutableBooleanMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.BOOLEAN, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createSubstitutableBooleanMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createSubstitutableBooleanMember0FromString(CorePackage.eINSTANCE.getSubstitutableBooleanMember0(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutableBooleanMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubstitutableBooleanMember0ToString(CorePackage.eINSTANCE.getSubstitutableBooleanMember0(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createSubstitutableBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return createSubstitutableBooleanFromString(CorePackage.eINSTANCE.getSubstitutableBoolean(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutableBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubstitutableBooleanToString(CorePackage.eINSTANCE.getSubstitutableBoolean(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSubstitutableClassFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createSubstitutableClassMember0FromString(CorePackage.eINSTANCE.getSubstitutableClassMember0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutableClassToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (CorePackage.eINSTANCE.getSubstitutableClassMember0().isInstance(instanceValue)) {
			try {
				String value = convertSubstitutableClassMember0ToString(CorePackage.eINSTANCE.getSubstitutableClassMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createSubstitutableClassMember0FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutableClassMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createSubstitutableIntFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Integer result = null;
		RuntimeException exception = null;
		try {
			result = createSubstitutableIntMember0FromString(CorePackage.eINSTANCE.getSubstitutableIntMember0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutableIntToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (CorePackage.eINSTANCE.getSubstitutableIntMember0().isInstance(instanceValue)) {
			try {
				String value = convertSubstitutableIntMember0ToString(CorePackage.eINSTANCE.getSubstitutableIntMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createSubstitutableIntMember0FromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutableIntMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createSubstitutableIntMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createSubstitutableIntMember0FromString(CorePackage.eINSTANCE.getSubstitutableIntMember0(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutableIntMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubstitutableIntMember0ToString(CorePackage.eINSTANCE.getSubstitutableIntMember0(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createSubstitutableIntObjectFromString(EDataType eDataType, String initialValue) {
		return createSubstitutableIntFromString(CorePackage.eINSTANCE.getSubstitutableInt(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutableIntObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubstitutableIntToString(CorePackage.eINSTANCE.getSubstitutableInt(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createSubstitutableLongFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Long result = null;
		RuntimeException exception = null;
		try {
			result = createSubstitutableLongMember0FromString(CorePackage.eINSTANCE.getSubstitutableLongMember0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutableLongToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (CorePackage.eINSTANCE.getSubstitutableLongMember0().isInstance(instanceValue)) {
			try {
				String value = convertSubstitutableLongMember0ToString(CorePackage.eINSTANCE.getSubstitutableLongMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createSubstitutableLongMember0FromString(EDataType eDataType, String initialValue) {
		return (Long)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LONG, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutableLongMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LONG, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createSubstitutableLongMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createSubstitutableLongMember0FromString(CorePackage.eINSTANCE.getSubstitutableLongMember0(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutableLongMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubstitutableLongMember0ToString(CorePackage.eINSTANCE.getSubstitutableLongMember0(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createSubstitutableLongObjectFromString(EDataType eDataType, String initialValue) {
		return createSubstitutableLongFromString(CorePackage.eINSTANCE.getSubstitutableLong(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutableLongObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubstitutableLongToString(CorePackage.eINSTANCE.getSubstitutableLong(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createSubstitutablePortNumberFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Integer result = null;
		RuntimeException exception = null;
		try {
			result = createSubstitutablePortNumberMember0FromString(CorePackage.eINSTANCE.getSubstitutablePortNumberMember0(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutablePortNumberToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (CorePackage.eINSTANCE.getSubstitutablePortNumberMember0().isInstance(instanceValue)) {
			try {
				String value = convertSubstitutablePortNumberMember0ToString(CorePackage.eINSTANCE.getSubstitutablePortNumberMember0(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createSubstitutablePortNumberMember0FromString(EDataType eDataType, String initialValue) {
		return (Integer)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.INT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutablePortNumberMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.INT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createSubstitutablePortNumberMember0ObjectFromString(EDataType eDataType, String initialValue) {
		return createSubstitutablePortNumberMember0FromString(CorePackage.eINSTANCE.getSubstitutablePortNumberMember0(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutablePortNumberMember0ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubstitutablePortNumberMember0ToString(CorePackage.eINSTANCE.getSubstitutablePortNumberMember0(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createSubstitutablePortNumberObjectFromString(EDataType eDataType, String initialValue) {
		return createSubstitutablePortNumberFromString(CorePackage.eINSTANCE.getSubstitutablePortNumber(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutablePortNumberObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSubstitutablePortNumberToString(CorePackage.eINSTANCE.getSubstitutablePortNumber(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl
