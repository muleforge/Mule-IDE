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
			case CorePackage.ABSTRACT_ASYNC_REPLY_ROUTER_TYPE: return createAbstractAsyncReplyRouterType();
			case CorePackage.ABSTRACT_BINDING_TYPE: return createAbstractBindingType();
			case CorePackage.ABSTRACT_CATCH_ALL_STRATEGY_TYPE: return createAbstractCatchAllStrategyType();
			case CorePackage.ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE: return createAbstractComponentThreadingProfileType();
			case CorePackage.ABSTRACT_COMPONENT_TYPE: return createAbstractComponentType();
			case CorePackage.ABSTRACT_CONNECTION_STRATEGY_TYPE: return createAbstractConnectionStrategyType();
			case CorePackage.ABSTRACT_CONNECTOR_TYPE: return createAbstractConnectorType();
			case CorePackage.ABSTRACT_DEFINE_NOTIFICATION_TYPE: return createAbstractDefineNotificationType();
			case CorePackage.ABSTRACT_DISABLE_NOTIFICATION_TYPE: return createAbstractDisableNotificationType();
			case CorePackage.ABSTRACT_ENTRY_POINT_RESOLVER_SET_TYPE: return createAbstractEntryPointResolverSetType();
			case CorePackage.ABSTRACT_ENTRY_POINT_RESOLVER_TYPE: return createAbstractEntryPointResolverType();
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
			case CorePackage.ABSTRACT_SECURITY_FILTER_TYPE: return createAbstractSecurityFilterType();
			case CorePackage.ABSTRACT_SECURITY_MANAGER_TYPE: return createAbstractSecurityManagerType();
			case CorePackage.ABSTRACT_SERVICE_TYPE: return createAbstractServiceType();
			case CorePackage.ABSTRACT_STORAGE_TYPE: return createAbstractStorageType();
			case CorePackage.ABSTRACT_TRANSACTION_MANAGER_TYPE: return createAbstractTransactionManagerType();
			case CorePackage.ABSTRACT_TRANSACTION_TYPE: return createAbstractTransactionType();
			case CorePackage.ABSTRACT_TRANSFORMER_TYPE: return createAbstractTransformerType();
			case CorePackage.APPEND_STRING_TRANSFORMER_TYPE: return createAppendStringTransformerType();
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE: return createAsyncReplyCollectionType();
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE: return createAsyncReplyRouterType();
			case CorePackage.BASE_CONTAINER_CONTEXT_TYPE: return createBaseContainerContextType();
			case CorePackage.BASE_ENTRY_POINT_RESOLVER_TYPE: return createBaseEntryPointResolverType();
			case CorePackage.BASE_SERVICE_TYPE: return createBaseServiceType();
			case CorePackage.CHUNKING_ROUTER_TYPE: return createChunkingRouterType();
			case CorePackage.COLLECTION_FILTER_TYPE: return createCollectionFilterType();
			case CorePackage.COMPLEX_ENTRY_POINT_RESOLVER_TYPE: return createComplexEntryPointResolverType();
			case CorePackage.CONNECTION_STRATEGY_TYPE: return createConnectionStrategyType();
			case CorePackage.CONNECTOR_TYPE: return createConnectorType();
			case CorePackage.CUSTOM_ASYNC_REPLY_ROUTER_TYPE: return createCustomAsyncReplyRouterType();
			case CorePackage.CUSTOM_CATCH_ALL_STRATEGY_TYPE: return createCustomCatchAllStrategyType();
			case CorePackage.CUSTOM_CONNECTION_STRATEGY_TYPE: return createCustomConnectionStrategyType();
			case CorePackage.CUSTOM_CONNECTOR_TYPE: return createCustomConnectorType();
			case CorePackage.CUSTOM_CONTAINER_CONTEXT_TYPE: return createCustomContainerContextType();
			case CorePackage.CUSTOM_CORRELATION_AGGREGATOR_ROUTER_TYPE: return createCustomCorrelationAggregatorRouterType();
			case CorePackage.CUSTOM_ENCRYPTION_STRATEGY_TYPE: return createCustomEncryptionStrategyType();
			case CorePackage.CUSTOM_ENTRY_POINT_RESOLVER_SET_TYPE: return createCustomEntryPointResolverSetType();
			case CorePackage.CUSTOM_ENTRY_POINT_RESOLVER_TYPE: return createCustomEntryPointResolverType();
			case CorePackage.CUSTOM_EXCEPTION_STRATEGY_TYPE: return createCustomExceptionStrategyType();
			case CorePackage.CUSTOM_FILTER_TYPE: return createCustomFilterType();
			case CorePackage.CUSTOM_FORWARDING_CATCH_ALL_STRATEGY_TYPE: return createCustomForwardingCatchAllStrategyType();
			case CorePackage.CUSTOM_INBOUND_ROUTER_TYPE: return createCustomInboundRouterType();
			case CorePackage.CUSTOM_OUTBOUND_ROUTER_TYPE: return createCustomOutboundRouterType();
			case CorePackage.CUSTOM_PROPERTY_EXTRACTOR_TYPE: return createCustomPropertyExtractorType();
			case CorePackage.CUSTOM_SECURITY_PROVIDER_TYPE: return createCustomSecurityProviderType();
			case CorePackage.CUSTOM_TRANSACTION_MANAGER_TYPE: return createCustomTransactionManagerType();
			case CorePackage.CUSTOM_TRANSACTION_TYPE: return createCustomTransactionType();
			case CorePackage.CUSTOM_TRANSFORMER_TYPE: return createCustomTransformerType();
			case CorePackage.DEFAULT_COMPONENT_TYPE: return createDefaultComponentType();
			case CorePackage.DEFAULT_MODEL_TYPE: return createDefaultModelType();
			case CorePackage.DEFAULT_SERVICE_TYPE: return createDefaultServiceType();
			case CorePackage.DEFINE_NOTIFICATION_TYPE: return createDefineNotificationType();
			case CorePackage.DESCRIPTION_TYPE: return createDescriptionType();
			case CorePackage.DISABLE_NOTIFICATION_TYPE: return createDisableNotificationType();
			case CorePackage.DOCUMENT_ROOT: return createDocumentRoot();
			case CorePackage.ENCRYPTION_SECURITY_FILTER_TYPE: return createEncryptionSecurityFilterType();
			case CorePackage.ENCRYPTION_STRATEGY_TYPE: return createEncryptionStrategyType();
			case CorePackage.ENDPOINT_SELECTOR_ROUTER_TYPE: return createEndpointSelectorRouterType();
			case CorePackage.ENVIRONMENT_PROPERTY_TYPE: return createEnvironmentPropertyType();
			case CorePackage.EXCEPTION_STRATEGY_TYPE: return createExceptionStrategyType();
			case CorePackage.EXTENSIBLE_ENTRY_POINT_RESOLVER_SET: return createExtensibleEntryPointResolverSet();
			case CorePackage.FILTERED_INBOUND_ROUTER_TYPE: return createFilteredInboundRouterType();
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE: return createFilteringOutboundRouterType();
			case CorePackage.FORWARDING_CATCH_ALL_STRATEGY_TYPE: return createForwardingCatchAllStrategyType();
			case CorePackage.FORWARDING_ROUTER_TYPE: return createForwardingRouterType();
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE: return createGenericObjectFactoryType();
			case CorePackage.GLOBAL_ENDPOINT_TYPE: return createGlobalEndpointType();
			case CorePackage.IDEMPOTENT_RECEIVER_ROUTER_TYPE: return createIdempotentReceiverRouterType();
			case CorePackage.INBOUND_COLLECTION_TYPE: return createInboundCollectionType();
			case CorePackage.INBOUND_ENDPOINT_TYPE: return createInboundEndpointType();
			case CorePackage.IOC_CONTAINER_CONTEXT_TYPE: return createIocContainerContextType();
			case CorePackage.JNDI_CONNECTOR_TYPE: return createJndiConnectorType();
			case CorePackage.JNDI_TRANSACTION_MANAGER_TYPE: return createJndiTransactionManagerType();
			case CorePackage.KEY_TYPE: return createKeyType();
			case CorePackage.KEY_VALUE_TYPE: return createKeyValueType();
			case CorePackage.LIST_OR_SET_TYPE: return createListOrSetType();
			case CorePackage.LOGGING_CATCH_ALL_STRATEGY_TYPE: return createLoggingCatchAllStrategyType();
			case CorePackage.MANAGEMENT_CONTEXT_TYPE: return createManagementContextType();
			case CorePackage.MAP_TYPE: return createMapType();
			case CorePackage.MESSAGE_CHUNKING_AGGREGATOR_ROUTER_TYPE: return createMessageChunkingAggregatorRouterType();
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE: return createMessagePropertiesTransformerType();
			case CorePackage.MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE: return createMessageSplitterOutboundRouterType();
			case CorePackage.METHOD_ENTRY_POINT_RESOLVER_TYPE: return createMethodEntryPointResolverType();
			case CorePackage.METHOD_TYPE: return createMethodType();
			case CorePackage.MULE_TYPE: return createMuleType();
			case CorePackage.NOTIFICATION_LISTENER_TYPE: return createNotificationListenerType();
			case CorePackage.NOTIFICATION_MANAGER_TYPE: return createNotificationManagerType();
			case CorePackage.OUTBOUND_COLLECTION_TYPE: return createOutboundCollectionType();
			case CorePackage.OUTBOUND_ENDPOINT_TYPE: return createOutboundEndpointType();
			case CorePackage.OUTBOUND_ROUTER_TYPE: return createOutboundRouterType();
			case CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE: return createPasswordEncryptionStrategyType();
			case CorePackage.PATTERN_FILTER_TYPE: return createPatternFilterType();
			case CorePackage.POJO_BINDING_TYPE: return createPojoBindingType();
			case CorePackage.POJO_COMPONENT_TYPE: return createPojoComponentType();
			case CorePackage.POOLED_OBJECT_FACTORY_TYPE: return createPooledObjectFactoryType();
			case CorePackage.POOLING_PROFILE_TYPE: return createPoolingProfileType();
			case CorePackage.PROPERTIES_CONTAINER_CONTEXT_TYPE: return createPropertiesContainerContextType();
			case CorePackage.PROPERTY_ENTRY_POINT_RESOLVER_TYPE: return createPropertyEntryPointResolverType();
			case CorePackage.PROTOTYPE_OBJECT_FACTORY_TYPE: return createPrototypeObjectFactoryType();
			case CorePackage.QUEUE_PROFILE_TYPE: return createQueueProfileType();
			case CorePackage.REFERENCE_TYPE: return createReferenceType();
			case CorePackage.REF_FILTER_TYPE: return createRefFilterType();
			case CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE: return createReflectionEntryPointResolverType();
			case CorePackage.REF_TRANSFORMER_TYPE: return createRefTransformerType();
			case CorePackage.REPLY_TO_TYPE: return createReplyToType();
			case CorePackage.RESPONSE_TRANSFORMERS_TYPE: return createResponseTransformersType();
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
			case CorePackage.SPRING_BEAN_LOOKUP_TYPE: return createSpringBeanLookupType();
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE: return createStaticRecipientListRouterType();
			case CorePackage.THREADING_PROFILE_TYPE: return createThreadingProfileType();
			case CorePackage.TLS_CLIENT_KEY_STORE_TYPE: return createTlsClientKeyStoreType();
			case CorePackage.TLS_KEY_STORE_TYPE: return createTlsKeyStoreType();
			case CorePackage.TLS_PROTOCOL_HANDLER: return createTlsProtocolHandler();
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE: return createTlsServerTrustStoreType();
			case CorePackage.TLS_TRUST_STORE_TYPE: return createTlsTrustStoreType();
			case CorePackage.TRANSACTION_MANAGER_TYPE: return createTransactionManagerType();
			case CorePackage.TRANSFORMERS_TYPE: return createTransformersType();
			case CorePackage.TYPE_FILTER_TYPE: return createTypeFilterType();
			case CorePackage.UNITARY_FILTER_TYPE: return createUnitaryFilterType();
			case CorePackage.VALUE_TYPE: return createValueType();
			case CorePackage.WILDCARD_FILTER_TYPE: return createWildcardFilterType();
			case CorePackage.WIRE_TAP_ROUTER_TYPE: return createWireTapRouterType();
			case CorePackage.CONNECTION: return createConnection();
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
			case CorePackage.ENABLE_CORRELATION_TYPE:
				return createEnableCorrelationTypeFromString(eDataType, initialValue);
			case CorePackage.EVENT_TYPE:
				return createEventTypeFromString(eDataType, initialValue);
			case CorePackage.EVENT_TYPE1:
				return createEventType1FromString(eDataType, initialValue);
			case CorePackage.EXHAUSTED_ACTION_TYPE:
				return createExhaustedActionTypeFromString(eDataType, initialValue);
			case CorePackage.INITIALISATION_POLICY_TYPE:
				return createInitialisationPolicyTypeFromString(eDataType, initialValue);
			case CorePackage.INITIAL_STATE_TYPE:
				return createInitialStateTypeFromString(eDataType, initialValue);
			case CorePackage.INTERFACE_TYPE:
				return createInterfaceTypeFromString(eDataType, initialValue);
			case CorePackage.INTERFACE_TYPE1:
				return createInterfaceType1FromString(eDataType, initialValue);
			case CorePackage.POOL_EXHAUSTED_ACTION_TYPE:
				return createPoolExhaustedActionTypeFromString(eDataType, initialValue);
			case CorePackage.ACTION_TYPE_OBJECT:
				return createActionTypeObjectFromString(eDataType, initialValue);
			case CorePackage.ENABLE_CORRELATION_TYPE_OBJECT:
				return createEnableCorrelationTypeObjectFromString(eDataType, initialValue);
			case CorePackage.EVENT_TYPE_OBJECT:
				return createEventTypeObjectFromString(eDataType, initialValue);
			case CorePackage.EVENT_TYPE_OBJECT1:
				return createEventTypeObject1FromString(eDataType, initialValue);
			case CorePackage.EXHAUSTED_ACTION_TYPE_OBJECT:
				return createExhaustedActionTypeObjectFromString(eDataType, initialValue);
			case CorePackage.INITIALISATION_POLICY_TYPE_OBJECT:
				return createInitialisationPolicyTypeObjectFromString(eDataType, initialValue);
			case CorePackage.INITIAL_STATE_TYPE_OBJECT:
				return createInitialStateTypeObjectFromString(eDataType, initialValue);
			case CorePackage.INTERFACE_TYPE_OBJECT:
				return createInterfaceTypeObjectFromString(eDataType, initialValue);
			case CorePackage.INTERFACE_TYPE_OBJECT1:
				return createInterfaceTypeObject1FromString(eDataType, initialValue);
			case CorePackage.NON_BLANK_STRING:
				return createNonBlankStringFromString(eDataType, initialValue);
			case CorePackage.NON_BLANK_STRING_MEMBER0:
				return createNonBlankStringMember0FromString(eDataType, initialValue);
			case CorePackage.POOL_EXHAUSTED_ACTION_TYPE_OBJECT:
				return createPoolExhaustedActionTypeObjectFromString(eDataType, initialValue);
			case CorePackage.PROPERTY_PLACEHOLDER_TYPE:
				return createPropertyPlaceholderTypeFromString(eDataType, initialValue);
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
			case CorePackage.SUBSTITUTABLE_NAME:
				return createSubstitutableNameFromString(eDataType, initialValue);
			case CorePackage.SUBSTITUTABLE_NAME_MEMBER0:
				return createSubstitutableNameMember0FromString(eDataType, initialValue);
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
			case CorePackage.ENABLE_CORRELATION_TYPE:
				return convertEnableCorrelationTypeToString(eDataType, instanceValue);
			case CorePackage.EVENT_TYPE:
				return convertEventTypeToString(eDataType, instanceValue);
			case CorePackage.EVENT_TYPE1:
				return convertEventType1ToString(eDataType, instanceValue);
			case CorePackage.EXHAUSTED_ACTION_TYPE:
				return convertExhaustedActionTypeToString(eDataType, instanceValue);
			case CorePackage.INITIALISATION_POLICY_TYPE:
				return convertInitialisationPolicyTypeToString(eDataType, instanceValue);
			case CorePackage.INITIAL_STATE_TYPE:
				return convertInitialStateTypeToString(eDataType, instanceValue);
			case CorePackage.INTERFACE_TYPE:
				return convertInterfaceTypeToString(eDataType, instanceValue);
			case CorePackage.INTERFACE_TYPE1:
				return convertInterfaceType1ToString(eDataType, instanceValue);
			case CorePackage.POOL_EXHAUSTED_ACTION_TYPE:
				return convertPoolExhaustedActionTypeToString(eDataType, instanceValue);
			case CorePackage.ACTION_TYPE_OBJECT:
				return convertActionTypeObjectToString(eDataType, instanceValue);
			case CorePackage.ENABLE_CORRELATION_TYPE_OBJECT:
				return convertEnableCorrelationTypeObjectToString(eDataType, instanceValue);
			case CorePackage.EVENT_TYPE_OBJECT:
				return convertEventTypeObjectToString(eDataType, instanceValue);
			case CorePackage.EVENT_TYPE_OBJECT1:
				return convertEventTypeObject1ToString(eDataType, instanceValue);
			case CorePackage.EXHAUSTED_ACTION_TYPE_OBJECT:
				return convertExhaustedActionTypeObjectToString(eDataType, instanceValue);
			case CorePackage.INITIALISATION_POLICY_TYPE_OBJECT:
				return convertInitialisationPolicyTypeObjectToString(eDataType, instanceValue);
			case CorePackage.INITIAL_STATE_TYPE_OBJECT:
				return convertInitialStateTypeObjectToString(eDataType, instanceValue);
			case CorePackage.INTERFACE_TYPE_OBJECT:
				return convertInterfaceTypeObjectToString(eDataType, instanceValue);
			case CorePackage.INTERFACE_TYPE_OBJECT1:
				return convertInterfaceTypeObject1ToString(eDataType, instanceValue);
			case CorePackage.NON_BLANK_STRING:
				return convertNonBlankStringToString(eDataType, instanceValue);
			case CorePackage.NON_BLANK_STRING_MEMBER0:
				return convertNonBlankStringMember0ToString(eDataType, instanceValue);
			case CorePackage.POOL_EXHAUSTED_ACTION_TYPE_OBJECT:
				return convertPoolExhaustedActionTypeObjectToString(eDataType, instanceValue);
			case CorePackage.PROPERTY_PLACEHOLDER_TYPE:
				return convertPropertyPlaceholderTypeToString(eDataType, instanceValue);
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
			case CorePackage.SUBSTITUTABLE_NAME:
				return convertSubstitutableNameToString(eDataType, instanceValue);
			case CorePackage.SUBSTITUTABLE_NAME_MEMBER0:
				return convertSubstitutableNameMember0ToString(eDataType, instanceValue);
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
	public AbstractAsyncReplyRouterType createAbstractAsyncReplyRouterType() {
		AbstractAsyncReplyRouterTypeImpl abstractAsyncReplyRouterType = new AbstractAsyncReplyRouterTypeImpl();
		return abstractAsyncReplyRouterType;
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
	public AbstractComponentType createAbstractComponentType() {
		AbstractComponentTypeImpl abstractComponentType = new AbstractComponentTypeImpl();
		return abstractComponentType;
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
	public AbstractDefineNotificationType createAbstractDefineNotificationType() {
		AbstractDefineNotificationTypeImpl abstractDefineNotificationType = new AbstractDefineNotificationTypeImpl();
		return abstractDefineNotificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractDisableNotificationType createAbstractDisableNotificationType() {
		AbstractDisableNotificationTypeImpl abstractDisableNotificationType = new AbstractDisableNotificationTypeImpl();
		return abstractDisableNotificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEntryPointResolverSetType createAbstractEntryPointResolverSetType() {
		AbstractEntryPointResolverSetTypeImpl abstractEntryPointResolverSetType = new AbstractEntryPointResolverSetTypeImpl();
		return abstractEntryPointResolverSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractEntryPointResolverType createAbstractEntryPointResolverType() {
		AbstractEntryPointResolverTypeImpl abstractEntryPointResolverType = new AbstractEntryPointResolverTypeImpl();
		return abstractEntryPointResolverType;
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
	public AppendStringTransformerType createAppendStringTransformerType() {
		AppendStringTransformerTypeImpl appendStringTransformerType = new AppendStringTransformerTypeImpl();
		return appendStringTransformerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsyncReplyCollectionType createAsyncReplyCollectionType() {
		AsyncReplyCollectionTypeImpl asyncReplyCollectionType = new AsyncReplyCollectionTypeImpl();
		return asyncReplyCollectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsyncReplyRouterType createAsyncReplyRouterType() {
		AsyncReplyRouterTypeImpl asyncReplyRouterType = new AsyncReplyRouterTypeImpl();
		return asyncReplyRouterType;
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
	public BaseEntryPointResolverType createBaseEntryPointResolverType() {
		BaseEntryPointResolverTypeImpl baseEntryPointResolverType = new BaseEntryPointResolverTypeImpl();
		return baseEntryPointResolverType;
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
	public ComplexEntryPointResolverType createComplexEntryPointResolverType() {
		ComplexEntryPointResolverTypeImpl complexEntryPointResolverType = new ComplexEntryPointResolverTypeImpl();
		return complexEntryPointResolverType;
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
	public CustomAsyncReplyRouterType createCustomAsyncReplyRouterType() {
		CustomAsyncReplyRouterTypeImpl customAsyncReplyRouterType = new CustomAsyncReplyRouterTypeImpl();
		return customAsyncReplyRouterType;
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
	public CustomCorrelationAggregatorRouterType createCustomCorrelationAggregatorRouterType() {
		CustomCorrelationAggregatorRouterTypeImpl customCorrelationAggregatorRouterType = new CustomCorrelationAggregatorRouterTypeImpl();
		return customCorrelationAggregatorRouterType;
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
	public CustomEntryPointResolverSetType createCustomEntryPointResolverSetType() {
		CustomEntryPointResolverSetTypeImpl customEntryPointResolverSetType = new CustomEntryPointResolverSetTypeImpl();
		return customEntryPointResolverSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEntryPointResolverType createCustomEntryPointResolverType() {
		CustomEntryPointResolverTypeImpl customEntryPointResolverType = new CustomEntryPointResolverTypeImpl();
		return customEntryPointResolverType;
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
	public CustomSecurityProviderType createCustomSecurityProviderType() {
		CustomSecurityProviderTypeImpl customSecurityProviderType = new CustomSecurityProviderTypeImpl();
		return customSecurityProviderType;
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
	public CustomTransactionType createCustomTransactionType() {
		CustomTransactionTypeImpl customTransactionType = new CustomTransactionTypeImpl();
		return customTransactionType;
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
	public DefineNotificationType createDefineNotificationType() {
		DefineNotificationTypeImpl defineNotificationType = new DefineNotificationTypeImpl();
		return defineNotificationType;
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
	public DisableNotificationType createDisableNotificationType() {
		DisableNotificationTypeImpl disableNotificationType = new DisableNotificationTypeImpl();
		return disableNotificationType;
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
	public ExtensibleEntryPointResolverSet createExtensibleEntryPointResolverSet() {
		ExtensibleEntryPointResolverSetImpl extensibleEntryPointResolverSet = new ExtensibleEntryPointResolverSetImpl();
		return extensibleEntryPointResolverSet;
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
	public IdempotentReceiverRouterType createIdempotentReceiverRouterType() {
		IdempotentReceiverRouterTypeImpl idempotentReceiverRouterType = new IdempotentReceiverRouterTypeImpl();
		return idempotentReceiverRouterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundCollectionType createInboundCollectionType() {
		InboundCollectionTypeImpl inboundCollectionType = new InboundCollectionTypeImpl();
		return inboundCollectionType;
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
	public KeyType createKeyType() {
		KeyTypeImpl keyType = new KeyTypeImpl();
		return keyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeyValueType createKeyValueType() {
		KeyValueTypeImpl keyValueType = new KeyValueTypeImpl();
		return keyValueType;
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
	public ManagementContextType createManagementContextType() {
		ManagementContextTypeImpl managementContextType = new ManagementContextTypeImpl();
		return managementContextType;
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
	public MessageChunkingAggregatorRouterType createMessageChunkingAggregatorRouterType() {
		MessageChunkingAggregatorRouterTypeImpl messageChunkingAggregatorRouterType = new MessageChunkingAggregatorRouterTypeImpl();
		return messageChunkingAggregatorRouterType;
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
	public MethodEntryPointResolverType createMethodEntryPointResolverType() {
		MethodEntryPointResolverTypeImpl methodEntryPointResolverType = new MethodEntryPointResolverTypeImpl();
		return methodEntryPointResolverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodType createMethodType() {
		MethodTypeImpl methodType = new MethodTypeImpl();
		return methodType;
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
	public NotificationListenerType createNotificationListenerType() {
		NotificationListenerTypeImpl notificationListenerType = new NotificationListenerTypeImpl();
		return notificationListenerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationManagerType createNotificationManagerType() {
		NotificationManagerTypeImpl notificationManagerType = new NotificationManagerTypeImpl();
		return notificationManagerType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundCollectionType createOutboundCollectionType() {
		OutboundCollectionTypeImpl outboundCollectionType = new OutboundCollectionTypeImpl();
		return outboundCollectionType;
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
	public PojoBindingType createPojoBindingType() {
		PojoBindingTypeImpl pojoBindingType = new PojoBindingTypeImpl();
		return pojoBindingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PojoComponentType createPojoComponentType() {
		PojoComponentTypeImpl pojoComponentType = new PojoComponentTypeImpl();
		return pojoComponentType;
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
	public PropertyEntryPointResolverType createPropertyEntryPointResolverType() {
		PropertyEntryPointResolverTypeImpl propertyEntryPointResolverType = new PropertyEntryPointResolverTypeImpl();
		return propertyEntryPointResolverType;
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
	public RefFilterType createRefFilterType() {
		RefFilterTypeImpl refFilterType = new RefFilterTypeImpl();
		return refFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflectionEntryPointResolverType createReflectionEntryPointResolverType() {
		ReflectionEntryPointResolverTypeImpl reflectionEntryPointResolverType = new ReflectionEntryPointResolverTypeImpl();
		return reflectionEntryPointResolverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefTransformerType createRefTransformerType() {
		RefTransformerTypeImpl refTransformerType = new RefTransformerTypeImpl();
		return refTransformerType;
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
	public ResponseTransformersType createResponseTransformersType() {
		ResponseTransformersTypeImpl responseTransformersType = new ResponseTransformersTypeImpl();
		return responseTransformersType;
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
	public SpringBeanLookupType createSpringBeanLookupType() {
		SpringBeanLookupTypeImpl springBeanLookupType = new SpringBeanLookupTypeImpl();
		return springBeanLookupType;
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
	public TransformersType createTransformersType() {
		TransformersTypeImpl transformersType = new TransformersTypeImpl();
		return transformersType;
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
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
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
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
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
	public EventType createEventTypeFromString(EDataType eDataType, String initialValue) {
		EventType result = EventType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType1 createEventType1FromString(EDataType eDataType, String initialValue) {
		EventType1 result = EventType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventType1ToString(EDataType eDataType, Object instanceValue) {
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
	public InterfaceType createInterfaceTypeFromString(EDataType eDataType, String initialValue) {
		InterfaceType result = InterfaceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceType1 createInterfaceType1FromString(EDataType eDataType, String initialValue) {
		InterfaceType1 result = InterfaceType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceType1ToString(EDataType eDataType, Object instanceValue) {
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
	public EventType createEventTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createEventTypeFromString(CorePackage.eINSTANCE.getEventType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEventTypeToString(CorePackage.eINSTANCE.getEventType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventType1 createEventTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createEventType1FromString(CorePackage.eINSTANCE.getEventType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEventTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertEventType1ToString(CorePackage.eINSTANCE.getEventType1(), instanceValue);
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
	public InterfaceType createInterfaceTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInterfaceTypeFromString(CorePackage.eINSTANCE.getInterfaceType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInterfaceTypeToString(CorePackage.eINSTANCE.getInterfaceType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceType1 createInterfaceTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createInterfaceType1FromString(CorePackage.eINSTANCE.getInterfaceType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterfaceTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertInterfaceType1ToString(CorePackage.eINSTANCE.getInterfaceType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNonBlankStringFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createNonBlankStringMember0FromString(CorePackage.eINSTANCE.getNonBlankStringMember0(), initialValue);
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
	public String convertNonBlankStringToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (CorePackage.eINSTANCE.getNonBlankStringMember0().isInstance(instanceValue)) {
			try {
				String value = convertNonBlankStringMember0ToString(CorePackage.eINSTANCE.getNonBlankStringMember0(), instanceValue);
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
	public String createNonBlankStringMember0FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonBlankStringMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
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
	public String createSubstitutableNameFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createSubstitutableNameMember0FromString(CorePackage.eINSTANCE.getSubstitutableNameMember0(), initialValue);
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
	public String convertSubstitutableNameToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (CorePackage.eINSTANCE.getSubstitutableNameMember0().isInstance(instanceValue)) {
			try {
				String value = convertSubstitutableNameMember0ToString(CorePackage.eINSTANCE.getSubstitutableNameMember0(), instanceValue);
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
	public String createSubstitutableNameMember0FromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKEN, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubstitutableNameMember0ToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKEN, instanceValue);
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
