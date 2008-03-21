/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.util;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.mule.ide.config.core.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.core.CorePackage
 * @generated
 */
public class CoreValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CoreValidator INSTANCE = new CoreValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.mule.ide.config.core";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CorePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CorePackage.ABSTRACT_AGENT_TYPE:
				return validateAbstractAgentType((AbstractAgentType)value, diagnostics, context);
			case CorePackage.ABSTRACT_ASYNC_REPLY_ROUTER_TYPE:
				return validateAbstractAsyncReplyRouterType((AbstractAsyncReplyRouterType)value, diagnostics, context);
			case CorePackage.ABSTRACT_CATCH_ALL_STRATEGY_TYPE:
				return validateAbstractCatchAllStrategyType((AbstractCatchAllStrategyType)value, diagnostics, context);
			case CorePackage.ABSTRACT_COMPONENT_THREADING_PROFILE_TYPE:
				return validateAbstractComponentThreadingProfileType((AbstractComponentThreadingProfileType)value, diagnostics, context);
			case CorePackage.ABSTRACT_COMPONENT_TYPE:
				return validateAbstractComponentType((AbstractComponentType)value, diagnostics, context);
			case CorePackage.ABSTRACT_CONNECTION_STRATEGY_TYPE:
				return validateAbstractConnectionStrategyType((AbstractConnectionStrategyType)value, diagnostics, context);
			case CorePackage.ABSTRACT_CONNECTOR_TYPE:
				return validateAbstractConnectorType((AbstractConnectorType)value, diagnostics, context);
			case CorePackage.ABSTRACT_ENTRY_POINT_RESOLVER_SET_TYPE:
				return validateAbstractEntryPointResolverSetType((AbstractEntryPointResolverSetType)value, diagnostics, context);
			case CorePackage.ABSTRACT_ENTRY_POINT_RESOLVER_TYPE:
				return validateAbstractEntryPointResolverType((AbstractEntryPointResolverType)value, diagnostics, context);
			case CorePackage.ABSTRACT_EXCEPTION_STRATEGY_TYPE:
				return validateAbstractExceptionStrategyType((AbstractExceptionStrategyType)value, diagnostics, context);
			case CorePackage.ABSTRACT_EXTENSION_TYPE:
				return validateAbstractExtensionType((AbstractExtensionType)value, diagnostics, context);
			case CorePackage.ABSTRACT_FILTER_TYPE:
				return validateAbstractFilterType((AbstractFilterType)value, diagnostics, context);
			case CorePackage.ABSTRACT_GLOBAL_ENDPOINT_TYPE:
				return validateAbstractGlobalEndpointType((AbstractGlobalEndpointType)value, diagnostics, context);
			case CorePackage.ABSTRACT_INBOUND_ENDPOINT_TYPE:
				return validateAbstractInboundEndpointType((AbstractInboundEndpointType)value, diagnostics, context);
			case CorePackage.ABSTRACT_INBOUND_ROUTER_TYPE:
				return validateAbstractInboundRouterType((AbstractInboundRouterType)value, diagnostics, context);
			case CorePackage.ABSTRACT_LIFECYCLE_ADAPTER_FACTORY:
				return validateAbstractLifecycleAdapterFactory((AbstractLifecycleAdapterFactory)value, diagnostics, context);
			case CorePackage.ABSTRACT_MODEL_TYPE:
				return validateAbstractModelType((AbstractModelType)value, diagnostics, context);
			case CorePackage.ABSTRACT_OBJECT_FACTORY_TYPE:
				return validateAbstractObjectFactoryType((AbstractObjectFactoryType)value, diagnostics, context);
			case CorePackage.ABSTRACT_OUTBOUND_ENDPOINT_TYPE:
				return validateAbstractOutboundEndpointType((AbstractOutboundEndpointType)value, diagnostics, context);
			case CorePackage.ABSTRACT_OUTBOUND_ROUTER_TYPE:
				return validateAbstractOutboundRouterType((AbstractOutboundRouterType)value, diagnostics, context);
			case CorePackage.ABSTRACT_POOLING_PROFILE_TYPE:
				return validateAbstractPoolingProfileType((AbstractPoolingProfileType)value, diagnostics, context);
			case CorePackage.ABSTRACT_PROPERTY_EXTRACTOR_TYPE:
				return validateAbstractPropertyExtractorType((AbstractPropertyExtractorType)value, diagnostics, context);
			case CorePackage.ABSTRACT_QUEUE_PROFILE_TYPE:
				return validateAbstractQueueProfileType((AbstractQueueProfileType)value, diagnostics, context);
			case CorePackage.ABSTRACT_SECURITY_FILTER_TYPE:
				return validateAbstractSecurityFilterType((AbstractSecurityFilterType)value, diagnostics, context);
			case CorePackage.ABSTRACT_SECURITY_MANAGER_TYPE:
				return validateAbstractSecurityManagerType((AbstractSecurityManagerType)value, diagnostics, context);
			case CorePackage.ABSTRACT_SERVICE_TYPE:
				return validateAbstractServiceType((AbstractServiceType)value, diagnostics, context);
			case CorePackage.ABSTRACT_TRANSACTION_MANAGER_TYPE:
				return validateAbstractTransactionManagerType((AbstractTransactionManagerType)value, diagnostics, context);
			case CorePackage.ABSTRACT_TRANSACTION_TYPE:
				return validateAbstractTransactionType((AbstractTransactionType)value, diagnostics, context);
			case CorePackage.ABSTRACT_TRANSFORMER_TYPE:
				return validateAbstractTransformerType((AbstractTransformerType)value, diagnostics, context);
			case CorePackage.APPEND_STRING_TRANSFORMER_TYPE:
				return validateAppendStringTransformerType((AppendStringTransformerType)value, diagnostics, context);
			case CorePackage.ASYNC_REPLY_COLLECTION_TYPE:
				return validateAsyncReplyCollectionType((AsyncReplyCollectionType)value, diagnostics, context);
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE:
				return validateAsyncReplyRouterType((AsyncReplyRouterType)value, diagnostics, context);
			case CorePackage.BASE_ENTRY_POINT_RESOLVER_TYPE:
				return validateBaseEntryPointResolverType((BaseEntryPointResolverType)value, diagnostics, context);
			case CorePackage.BASE_SERVICE_TYPE:
				return validateBaseServiceType((BaseServiceType)value, diagnostics, context);
			case CorePackage.BASE_TRANSACTION_TYPE:
				return validateBaseTransactionType((BaseTransactionType)value, diagnostics, context);
			case CorePackage.CASE_SENSITIVE_PATTERN_FILTER_TYPE:
				return validateCaseSensitivePatternFilterType((CaseSensitivePatternFilterType)value, diagnostics, context);
			case CorePackage.CHUNKING_ROUTER_TYPE:
				return validateChunkingRouterType((ChunkingRouterType)value, diagnostics, context);
			case CorePackage.COLLECTION_FILTER_TYPE:
				return validateCollectionFilterType((CollectionFilterType)value, diagnostics, context);
			case CorePackage.COMPLEX_ENTRY_POINT_RESOLVER_TYPE:
				return validateComplexEntryPointResolverType((ComplexEntryPointResolverType)value, diagnostics, context);
			case CorePackage.CONFIGURATION_TYPE:
				return validateConfigurationType((ConfigurationType)value, diagnostics, context);
			case CorePackage.CONNECTION_STRATEGY_TYPE:
				return validateConnectionStrategyType((ConnectionStrategyType)value, diagnostics, context);
			case CorePackage.CONNECTOR_TYPE:
				return validateConnectorType((ConnectorType)value, diagnostics, context);
			case CorePackage.CUSTOM_ASYNC_REPLY_ROUTER_TYPE:
				return validateCustomAsyncReplyRouterType((CustomAsyncReplyRouterType)value, diagnostics, context);
			case CorePackage.CUSTOM_CATCH_ALL_STRATEGY_TYPE:
				return validateCustomCatchAllStrategyType((CustomCatchAllStrategyType)value, diagnostics, context);
			case CorePackage.CUSTOM_CONNECTION_STRATEGY_TYPE:
				return validateCustomConnectionStrategyType((CustomConnectionStrategyType)value, diagnostics, context);
			case CorePackage.CUSTOM_CONNECTOR_TYPE:
				return validateCustomConnectorType((CustomConnectorType)value, diagnostics, context);
			case CorePackage.CUSTOM_CORRELATION_AGGREGATOR_ROUTER_TYPE:
				return validateCustomCorrelationAggregatorRouterType((CustomCorrelationAggregatorRouterType)value, diagnostics, context);
			case CorePackage.CUSTOM_ENCRYPTION_STRATEGY_TYPE:
				return validateCustomEncryptionStrategyType((CustomEncryptionStrategyType)value, diagnostics, context);
			case CorePackage.CUSTOM_ENTRY_POINT_RESOLVER_SET_TYPE:
				return validateCustomEntryPointResolverSetType((CustomEntryPointResolverSetType)value, diagnostics, context);
			case CorePackage.CUSTOM_ENTRY_POINT_RESOLVER_TYPE:
				return validateCustomEntryPointResolverType((CustomEntryPointResolverType)value, diagnostics, context);
			case CorePackage.CUSTOM_EXCEPTION_STRATEGY_TYPE:
				return validateCustomExceptionStrategyType((CustomExceptionStrategyType)value, diagnostics, context);
			case CorePackage.CUSTOM_FILTER_TYPE:
				return validateCustomFilterType((CustomFilterType)value, diagnostics, context);
			case CorePackage.CUSTOM_FORWARDING_CATCH_ALL_STRATEGY_TYPE:
				return validateCustomForwardingCatchAllStrategyType((CustomForwardingCatchAllStrategyType)value, diagnostics, context);
			case CorePackage.CUSTOM_INBOUND_ROUTER_TYPE:
				return validateCustomInboundRouterType((CustomInboundRouterType)value, diagnostics, context);
			case CorePackage.CUSTOM_LIFECYCLE_ADAPTER_FACTORY:
				return validateCustomLifecycleAdapterFactory((CustomLifecycleAdapterFactory)value, diagnostics, context);
			case CorePackage.CUSTOM_OUTBOUND_ROUTER_TYPE:
				return validateCustomOutboundRouterType((CustomOutboundRouterType)value, diagnostics, context);
			case CorePackage.CUSTOM_PROPERTY_EXTRACTOR_TYPE:
				return validateCustomPropertyExtractorType((CustomPropertyExtractorType)value, diagnostics, context);
			case CorePackage.CUSTOM_SECURITY_PROVIDER_TYPE:
				return validateCustomSecurityProviderType((CustomSecurityProviderType)value, diagnostics, context);
			case CorePackage.CUSTOM_SERVICE_TYPE:
				return validateCustomServiceType((CustomServiceType)value, diagnostics, context);
			case CorePackage.CUSTOM_TRANSACTION_MANAGER_TYPE:
				return validateCustomTransactionManagerType((CustomTransactionManagerType)value, diagnostics, context);
			case CorePackage.CUSTOM_TRANSACTION_TYPE:
				return validateCustomTransactionType((CustomTransactionType)value, diagnostics, context);
			case CorePackage.CUSTOM_TRANSFORMER_TYPE:
				return validateCustomTransformerType((CustomTransformerType)value, diagnostics, context);
			case CorePackage.DEFAULT_COMPONENT_TYPE:
				return validateDefaultComponentType((DefaultComponentType)value, diagnostics, context);
			case CorePackage.DEFAULT_JAVA_COMPONENT_TYPE:
				return validateDefaultJavaComponentType((DefaultJavaComponentType)value, diagnostics, context);
			case CorePackage.DEFAULT_MODEL_TYPE:
				return validateDefaultModelType((DefaultModelType)value, diagnostics, context);
			case CorePackage.DEFINE_NOTIFICATION_TYPE:
				return validateDefineNotificationType((DefineNotificationType)value, diagnostics, context);
			case CorePackage.DESCRIPTION_TYPE:
				return validateDescriptionType((DescriptionType)value, diagnostics, context);
			case CorePackage.DISABLE_NOTIFICATION_TYPE:
				return validateDisableNotificationType((DisableNotificationType)value, diagnostics, context);
			case CorePackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case CorePackage.ENCRYPTION_SECURITY_FILTER_TYPE:
				return validateEncryptionSecurityFilterType((EncryptionSecurityFilterType)value, diagnostics, context);
			case CorePackage.ENCRYPTION_STRATEGY_TYPE:
				return validateEncryptionStrategyType((EncryptionStrategyType)value, diagnostics, context);
			case CorePackage.ENCRYPTION_TRANSFORMER_TYPE:
				return validateEncryptionTransformerType((EncryptionTransformerType)value, diagnostics, context);
			case CorePackage.ENDPOINT_EXCEPTION_STRATEGY_TYPE:
				return validateEndpointExceptionStrategyType((EndpointExceptionStrategyType)value, diagnostics, context);
			case CorePackage.ENDPOINT_SELECTOR_ROUTER_TYPE:
				return validateEndpointSelectorRouterType((EndpointSelectorRouterType)value, diagnostics, context);
			case CorePackage.ENVIRONMENT_PROPERTY_TYPE:
				return validateEnvironmentPropertyType((EnvironmentPropertyType)value, diagnostics, context);
			case CorePackage.EXPRESSION_TRANSFORMER_TYPE:
				return validateExpressionTransformerType((ExpressionTransformerType)value, diagnostics, context);
			case CorePackage.EXTENSIBLE_ENTRY_POINT_RESOLVER_SET:
				return validateExtensibleEntryPointResolverSet((ExtensibleEntryPointResolverSet)value, diagnostics, context);
			case CorePackage.FILTERED_INBOUND_ROUTER_TYPE:
				return validateFilteredInboundRouterType((FilteredInboundRouterType)value, diagnostics, context);
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE:
				return validateFilteringOutboundRouterType((FilteringOutboundRouterType)value, diagnostics, context);
			case CorePackage.FORWARDING_CATCH_ALL_STRATEGY_TYPE:
				return validateForwardingCatchAllStrategyType((ForwardingCatchAllStrategyType)value, diagnostics, context);
			case CorePackage.GENERIC_OBJECT_FACTORY_TYPE:
				return validateGenericObjectFactoryType((GenericObjectFactoryType)value, diagnostics, context);
			case CorePackage.GLOBAL_ENDPOINT_TYPE:
				return validateGlobalEndpointType((GlobalEndpointType)value, diagnostics, context);
			case CorePackage.INBOUND_COLLECTION_TYPE:
				return validateInboundCollectionType((InboundCollectionType)value, diagnostics, context);
			case CorePackage.INBOUND_ENDPOINT_TYPE:
				return validateInboundEndpointType((InboundEndpointType)value, diagnostics, context);
			case CorePackage.JNDI_CONNECTOR_TYPE:
				return validateJndiConnectorType((JndiConnectorType)value, diagnostics, context);
			case CorePackage.JNDI_TRANSACTION_MANAGER_TYPE:
				return validateJndiTransactionManagerType((JndiTransactionManagerType)value, diagnostics, context);
			case CorePackage.JNDI_TRANSACTION_MANAGER_TYPE1:
				return validateJndiTransactionManagerType1((JndiTransactionManagerType1)value, diagnostics, context);
			case CorePackage.KEY_TYPE:
				return validateKeyType((KeyType)value, diagnostics, context);
			case CorePackage.KEY_VALUE_TYPE:
				return validateKeyValueType((KeyValueType)value, diagnostics, context);
			case CorePackage.LIST_OR_SET_TYPE:
				return validateListOrSetType((ListOrSetType)value, diagnostics, context);
			case CorePackage.LOGGING_CATCH_ALL_STRATEGY_TYPE:
				return validateLoggingCatchAllStrategyType((LoggingCatchAllStrategyType)value, diagnostics, context);
			case CorePackage.MAP_TYPE:
				return validateMapType((MapType)value, diagnostics, context);
			case CorePackage.MESSAGE_CHUNKING_AGGREGATOR_ROUTER_TYPE:
				return validateMessageChunkingAggregatorRouterType((MessageChunkingAggregatorRouterType)value, diagnostics, context);
			case CorePackage.MESSAGE_PROPERTIES_TRANSFORMER_TYPE:
				return validateMessagePropertiesTransformerType((MessagePropertiesTransformerType)value, diagnostics, context);
			case CorePackage.MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE:
				return validateMessageSplitterOutboundRouterType((MessageSplitterOutboundRouterType)value, diagnostics, context);
			case CorePackage.METHOD_ENTRY_POINT_RESOLVER_TYPE:
				return validateMethodEntryPointResolverType((MethodEntryPointResolverType)value, diagnostics, context);
			case CorePackage.METHOD_TYPE:
				return validateMethodType((MethodType)value, diagnostics, context);
			case CorePackage.MULE_TYPE:
				return validateMuleType((MuleType)value, diagnostics, context);
			case CorePackage.NOTIFICATION_LISTENER_TYPE:
				return validateNotificationListenerType((NotificationListenerType)value, diagnostics, context);
			case CorePackage.NOTIFICATION_MANAGER_TYPE:
				return validateNotificationManagerType((NotificationManagerType)value, diagnostics, context);
			case CorePackage.OUTBOUND_COLLECTION_TYPE:
				return validateOutboundCollectionType((OutboundCollectionType)value, diagnostics, context);
			case CorePackage.OUTBOUND_ENDPOINT_TYPE:
				return validateOutboundEndpointType((OutboundEndpointType)value, diagnostics, context);
			case CorePackage.OUTBOUND_ROUTER_TYPE:
				return validateOutboundRouterType((OutboundRouterType)value, diagnostics, context);
			case CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE:
				return validatePasswordEncryptionStrategyType((PasswordEncryptionStrategyType)value, diagnostics, context);
			case CorePackage.PATTERN_FILTER_TYPE:
				return validatePatternFilterType((PatternFilterType)value, diagnostics, context);
			case CorePackage.POJO_BINDING_TYPE:
				return validatePojoBindingType((PojoBindingType)value, diagnostics, context);
			case CorePackage.POOLED_JAVA_COMPONENT_TYPE:
				return validatePooledJavaComponentType((PooledJavaComponentType)value, diagnostics, context);
			case CorePackage.POOLING_PROFILE_TYPE:
				return validatePoolingProfileType((PoolingProfileType)value, diagnostics, context);
			case CorePackage.PROPERTY_ENTRY_POINT_RESOLVER_TYPE:
				return validatePropertyEntryPointResolverType((PropertyEntryPointResolverType)value, diagnostics, context);
			case CorePackage.PROTOTYPE_OBJECT_FACTORY_TYPE:
				return validatePrototypeObjectFactoryType((PrototypeObjectFactoryType)value, diagnostics, context);
			case CorePackage.QUEUE_PROFILE_TYPE:
				return validateQueueProfileType((QueueProfileType)value, diagnostics, context);
			case CorePackage.REFERENCE_TYPE:
				return validateReferenceType((ReferenceType)value, diagnostics, context);
			case CorePackage.REF_FILTER_TYPE:
				return validateRefFilterType((RefFilterType)value, diagnostics, context);
			case CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE:
				return validateReflectionEntryPointResolverType((ReflectionEntryPointResolverType)value, diagnostics, context);
			case CorePackage.REF_TRANSFORMER_TYPE:
				return validateRefTransformerType((RefTransformerType)value, diagnostics, context);
			case CorePackage.REPLY_TO_TYPE:
				return validateReplyToType((ReplyToType)value, diagnostics, context);
			case CorePackage.RESPONSE_TRANSFORMERS_TYPE:
				return validateResponseTransformersType((ResponseTransformersType)value, diagnostics, context);
			case CorePackage.RETRY_CONNECTION_STRATEGY_TYPE:
				return validateRetryConnectionStrategyType((RetryConnectionStrategyType)value, diagnostics, context);
			case CorePackage.RETURN_ARGUMENT_TYPE:
				return validateReturnArgumentType((ReturnArgumentType)value, diagnostics, context);
			case CorePackage.SECRET_KEY_ENCRYPTION_STRATEGY_TYPE:
				return validateSecretKeyEncryptionStrategyType((SecretKeyEncryptionStrategyType)value, diagnostics, context);
			case CorePackage.SECURITY_MANAGER_TYPE:
				return validateSecurityManagerType((SecurityManagerType)value, diagnostics, context);
			case CorePackage.SECURITY_PROVIDER_TYPE:
				return validateSecurityProviderType((SecurityProviderType)value, diagnostics, context);
			case CorePackage.SEDA_MODEL_TYPE:
				return validateSedaModelType((SedaModelType)value, diagnostics, context);
			case CorePackage.SEDA_SERVICE_TYPE:
				return validateSedaServiceType((SedaServiceType)value, diagnostics, context);
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE:
				return validateSelectiveConsumerRouterType((SelectiveConsumerRouterType)value, diagnostics, context);
			case CorePackage.SERVICE_OVERRIDES_TYPE:
				return validateServiceOverridesType((ServiceOverridesType)value, diagnostics, context);
			case CorePackage.SINGLETON_OBJECT_FACTORY_TYPE:
				return validateSingletonObjectFactoryType((SingletonObjectFactoryType)value, diagnostics, context);
			case CorePackage.SPRING_BEAN_LOOKUP_TYPE:
				return validateSpringBeanLookupType((SpringBeanLookupType)value, diagnostics, context);
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE:
				return validateStaticRecipientListRouterType((StaticRecipientListRouterType)value, diagnostics, context);
			case CorePackage.THREADING_PROFILE_TYPE:
				return validateThreadingProfileType((ThreadingProfileType)value, diagnostics, context);
			case CorePackage.TLS_CLIENT_KEY_STORE_TYPE:
				return validateTlsClientKeyStoreType((TlsClientKeyStoreType)value, diagnostics, context);
			case CorePackage.TLS_KEY_STORE_TYPE:
				return validateTlsKeyStoreType((TlsKeyStoreType)value, diagnostics, context);
			case CorePackage.TLS_PROTOCOL_HANDLER:
				return validateTlsProtocolHandler((TlsProtocolHandler)value, diagnostics, context);
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE:
				return validateTlsServerTrustStoreType((TlsServerTrustStoreType)value, diagnostics, context);
			case CorePackage.TLS_TRUST_STORE_TYPE:
				return validateTlsTrustStoreType((TlsTrustStoreType)value, diagnostics, context);
			case CorePackage.TRANSACTION_MANAGER_TYPE:
				return validateTransactionManagerType((TransactionManagerType)value, diagnostics, context);
			case CorePackage.TRANSFORMERS_TYPE:
				return validateTransformersType((TransformersType)value, diagnostics, context);
			case CorePackage.TYPE_FILTER_TYPE:
				return validateTypeFilterType((TypeFilterType)value, diagnostics, context);
			case CorePackage.UNITARY_FILTER_TYPE:
				return validateUnitaryFilterType((UnitaryFilterType)value, diagnostics, context);
			case CorePackage.VALUE_TYPE:
				return validateValueType((ValueType)value, diagnostics, context);
			case CorePackage.WILDCARD_FILTER_TYPE:
				return validateWildcardFilterType((WildcardFilterType)value, diagnostics, context);
			case CorePackage.WIRE_TAP_ROUTER_TYPE:
				return validateWireTapRouterType((WireTapRouterType)value, diagnostics, context);
			case CorePackage.CONNECTION:
				return validateConnection((Connection)value, diagnostics, context);
			case CorePackage.ACTION_TYPE:
				return validateActionType((ActionType)value, diagnostics, context);
			case CorePackage.ENABLE_CORRELATION_TYPE:
				return validateEnableCorrelationType((EnableCorrelationType)value, diagnostics, context);
			case CorePackage.EVALUATOR_TYPE:
				return validateEvaluatorType((EvaluatorType)value, diagnostics, context);
			case CorePackage.EVENT_TYPE:
				return validateEventType((EventType)value, diagnostics, context);
			case CorePackage.EVENT_TYPE1:
				return validateEventType1((EventType1)value, diagnostics, context);
			case CorePackage.EXHAUSTED_ACTION_TYPE:
				return validateExhaustedActionType((ExhaustedActionType)value, diagnostics, context);
			case CorePackage.INITIALISATION_POLICY_TYPE:
				return validateInitialisationPolicyType((InitialisationPolicyType)value, diagnostics, context);
			case CorePackage.INITIAL_STATE_TYPE:
				return validateInitialStateType((InitialStateType)value, diagnostics, context);
			case CorePackage.INTERFACE_TYPE:
				return validateInterfaceType((InterfaceType)value, diagnostics, context);
			case CorePackage.INTERFACE_TYPE1:
				return validateInterfaceType1((InterfaceType1)value, diagnostics, context);
			case CorePackage.POOL_EXHAUSTED_ACTION_TYPE:
				return validatePoolExhaustedActionType((PoolExhaustedActionType)value, diagnostics, context);
			case CorePackage.ACTION_TYPE_OBJECT:
				return validateActionTypeObject((ActionType)value, diagnostics, context);
			case CorePackage.ENABLE_CORRELATION_TYPE_OBJECT:
				return validateEnableCorrelationTypeObject((EnableCorrelationType)value, diagnostics, context);
			case CorePackage.EVALUATOR_TYPE_OBJECT:
				return validateEvaluatorTypeObject((EvaluatorType)value, diagnostics, context);
			case CorePackage.EVENT_TYPE_OBJECT:
				return validateEventTypeObject((EventType)value, diagnostics, context);
			case CorePackage.EVENT_TYPE_OBJECT1:
				return validateEventTypeObject1((EventType1)value, diagnostics, context);
			case CorePackage.EXHAUSTED_ACTION_TYPE_OBJECT:
				return validateExhaustedActionTypeObject((ExhaustedActionType)value, diagnostics, context);
			case CorePackage.INITIALISATION_POLICY_TYPE_OBJECT:
				return validateInitialisationPolicyTypeObject((InitialisationPolicyType)value, diagnostics, context);
			case CorePackage.INITIAL_STATE_TYPE_OBJECT:
				return validateInitialStateTypeObject((InitialStateType)value, diagnostics, context);
			case CorePackage.INTERFACE_TYPE_OBJECT:
				return validateInterfaceTypeObject((InterfaceType)value, diagnostics, context);
			case CorePackage.INTERFACE_TYPE_OBJECT1:
				return validateInterfaceTypeObject1((InterfaceType1)value, diagnostics, context);
			case CorePackage.NON_BLANK_STRING:
				return validateNonBlankString((String)value, diagnostics, context);
			case CorePackage.NON_BLANK_STRING_MEMBER0:
				return validateNonBlankStringMember0((String)value, diagnostics, context);
			case CorePackage.POOL_EXHAUSTED_ACTION_TYPE_OBJECT:
				return validatePoolExhaustedActionTypeObject((PoolExhaustedActionType)value, diagnostics, context);
			case CorePackage.PROPERTY_PLACEHOLDER_TYPE:
				return validatePropertyPlaceholderType((String)value, diagnostics, context);
			case CorePackage.SUBSTITUTABLE_BOOLEAN:
				return validateSubstitutableBoolean(((Boolean)value).booleanValue(), diagnostics, context);
			case CorePackage.SUBSTITUTABLE_BOOLEAN_MEMBER0:
				return validateSubstitutableBooleanMember0(((Boolean)value).booleanValue(), diagnostics, context);
			case CorePackage.SUBSTITUTABLE_BOOLEAN_MEMBER0_OBJECT:
				return validateSubstitutableBooleanMember0Object((Boolean)value, diagnostics, context);
			case CorePackage.SUBSTITUTABLE_BOOLEAN_OBJECT:
				return validateSubstitutableBooleanObject((Boolean)value, diagnostics, context);
			case CorePackage.SUBSTITUTABLE_CLASS:
				return validateSubstitutableClass((String)value, diagnostics, context);
			case CorePackage.SUBSTITUTABLE_CLASS_MEMBER0:
				return validateSubstitutableClassMember0((String)value, diagnostics, context);
			case CorePackage.SUBSTITUTABLE_INT:
				return validateSubstitutableInt(((Integer)value).intValue(), diagnostics, context);
			case CorePackage.SUBSTITUTABLE_INT_MEMBER0:
				return validateSubstitutableIntMember0(((Integer)value).intValue(), diagnostics, context);
			case CorePackage.SUBSTITUTABLE_INT_MEMBER0_OBJECT:
				return validateSubstitutableIntMember0Object((Integer)value, diagnostics, context);
			case CorePackage.SUBSTITUTABLE_INT_OBJECT:
				return validateSubstitutableIntObject((Integer)value, diagnostics, context);
			case CorePackage.SUBSTITUTABLE_LONG:
				return validateSubstitutableLong(((Long)value).longValue(), diagnostics, context);
			case CorePackage.SUBSTITUTABLE_LONG_MEMBER0:
				return validateSubstitutableLongMember0(((Long)value).longValue(), diagnostics, context);
			case CorePackage.SUBSTITUTABLE_LONG_MEMBER0_OBJECT:
				return validateSubstitutableLongMember0Object((Long)value, diagnostics, context);
			case CorePackage.SUBSTITUTABLE_LONG_OBJECT:
				return validateSubstitutableLongObject((Long)value, diagnostics, context);
			case CorePackage.SUBSTITUTABLE_NAME:
				return validateSubstitutableName((String)value, diagnostics, context);
			case CorePackage.SUBSTITUTABLE_NAME_MEMBER0:
				return validateSubstitutableNameMember0((String)value, diagnostics, context);
			case CorePackage.SUBSTITUTABLE_PORT_NUMBER:
				return validateSubstitutablePortNumber(((Integer)value).intValue(), diagnostics, context);
			case CorePackage.SUBSTITUTABLE_PORT_NUMBER_MEMBER0:
				return validateSubstitutablePortNumberMember0(((Integer)value).intValue(), diagnostics, context);
			case CorePackage.SUBSTITUTABLE_PORT_NUMBER_MEMBER0_OBJECT:
				return validateSubstitutablePortNumberMember0Object((Integer)value, diagnostics, context);
			case CorePackage.SUBSTITUTABLE_PORT_NUMBER_OBJECT:
				return validateSubstitutablePortNumberObject((Integer)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractAgentType(AbstractAgentType abstractAgentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractAgentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractAsyncReplyRouterType(AbstractAsyncReplyRouterType abstractAsyncReplyRouterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractAsyncReplyRouterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractCatchAllStrategyType(AbstractCatchAllStrategyType abstractCatchAllStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractCatchAllStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractComponentThreadingProfileType(AbstractComponentThreadingProfileType abstractComponentThreadingProfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractComponentThreadingProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractComponentType(AbstractComponentType abstractComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractComponentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractConnectionStrategyType(AbstractConnectionStrategyType abstractConnectionStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractConnectionStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractConnectorType(AbstractConnectorType abstractConnectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractConnectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractEntryPointResolverSetType(AbstractEntryPointResolverSetType abstractEntryPointResolverSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractEntryPointResolverSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractEntryPointResolverType(AbstractEntryPointResolverType abstractEntryPointResolverType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractEntryPointResolverType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractExceptionStrategyType(AbstractExceptionStrategyType abstractExceptionStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractExceptionStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractExtensionType(AbstractExtensionType abstractExtensionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractExtensionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractFilterType(AbstractFilterType abstractFilterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractFilterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractGlobalEndpointType(AbstractGlobalEndpointType abstractGlobalEndpointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractGlobalEndpointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractInboundEndpointType(AbstractInboundEndpointType abstractInboundEndpointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractInboundEndpointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractInboundRouterType(AbstractInboundRouterType abstractInboundRouterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractInboundRouterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractLifecycleAdapterFactory(AbstractLifecycleAdapterFactory abstractLifecycleAdapterFactory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractLifecycleAdapterFactory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractModelType(AbstractModelType abstractModelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractModelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractObjectFactoryType(AbstractObjectFactoryType abstractObjectFactoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractObjectFactoryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractOutboundEndpointType(AbstractOutboundEndpointType abstractOutboundEndpointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractOutboundEndpointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractOutboundRouterType(AbstractOutboundRouterType abstractOutboundRouterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractOutboundRouterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractPoolingProfileType(AbstractPoolingProfileType abstractPoolingProfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractPoolingProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractPropertyExtractorType(AbstractPropertyExtractorType abstractPropertyExtractorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractPropertyExtractorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractQueueProfileType(AbstractQueueProfileType abstractQueueProfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractQueueProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractSecurityFilterType(AbstractSecurityFilterType abstractSecurityFilterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractSecurityFilterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractSecurityManagerType(AbstractSecurityManagerType abstractSecurityManagerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractSecurityManagerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractServiceType(AbstractServiceType abstractServiceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractServiceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractTransactionManagerType(AbstractTransactionManagerType abstractTransactionManagerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractTransactionManagerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractTransactionType(AbstractTransactionType abstractTransactionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractTransactionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractTransformerType(AbstractTransformerType abstractTransformerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractTransformerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppendStringTransformerType(AppendStringTransformerType appendStringTransformerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appendStringTransformerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsyncReplyCollectionType(AsyncReplyCollectionType asyncReplyCollectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(asyncReplyCollectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsyncReplyRouterType(AsyncReplyRouterType asyncReplyRouterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(asyncReplyRouterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseEntryPointResolverType(BaseEntryPointResolverType baseEntryPointResolverType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseEntryPointResolverType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseServiceType(BaseServiceType baseServiceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseServiceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseTransactionType(BaseTransactionType baseTransactionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseTransactionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaseSensitivePatternFilterType(CaseSensitivePatternFilterType caseSensitivePatternFilterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(caseSensitivePatternFilterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateChunkingRouterType(ChunkingRouterType chunkingRouterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(chunkingRouterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionFilterType(CollectionFilterType collectionFilterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(collectionFilterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComplexEntryPointResolverType(ComplexEntryPointResolverType complexEntryPointResolverType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(complexEntryPointResolverType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfigurationType(ConfigurationType configurationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(configurationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectionStrategyType(ConnectionStrategyType connectionStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectionStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnectorType(ConnectorType connectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomAsyncReplyRouterType(CustomAsyncReplyRouterType customAsyncReplyRouterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customAsyncReplyRouterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomCatchAllStrategyType(CustomCatchAllStrategyType customCatchAllStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customCatchAllStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomConnectionStrategyType(CustomConnectionStrategyType customConnectionStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customConnectionStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomConnectorType(CustomConnectorType customConnectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customConnectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomCorrelationAggregatorRouterType(CustomCorrelationAggregatorRouterType customCorrelationAggregatorRouterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customCorrelationAggregatorRouterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomEncryptionStrategyType(CustomEncryptionStrategyType customEncryptionStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customEncryptionStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomEntryPointResolverSetType(CustomEntryPointResolverSetType customEntryPointResolverSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customEntryPointResolverSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomEntryPointResolverType(CustomEntryPointResolverType customEntryPointResolverType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customEntryPointResolverType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomExceptionStrategyType(CustomExceptionStrategyType customExceptionStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customExceptionStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomFilterType(CustomFilterType customFilterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customFilterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomForwardingCatchAllStrategyType(CustomForwardingCatchAllStrategyType customForwardingCatchAllStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customForwardingCatchAllStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomInboundRouterType(CustomInboundRouterType customInboundRouterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customInboundRouterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomLifecycleAdapterFactory(CustomLifecycleAdapterFactory customLifecycleAdapterFactory, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customLifecycleAdapterFactory, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomOutboundRouterType(CustomOutboundRouterType customOutboundRouterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customOutboundRouterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomPropertyExtractorType(CustomPropertyExtractorType customPropertyExtractorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customPropertyExtractorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomSecurityProviderType(CustomSecurityProviderType customSecurityProviderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customSecurityProviderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomServiceType(CustomServiceType customServiceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customServiceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomTransactionManagerType(CustomTransactionManagerType customTransactionManagerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customTransactionManagerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomTransactionType(CustomTransactionType customTransactionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customTransactionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustomTransformerType(CustomTransformerType customTransformerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(customTransformerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultComponentType(DefaultComponentType defaultComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(defaultComponentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultJavaComponentType(DefaultJavaComponentType defaultJavaComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(defaultJavaComponentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefaultModelType(DefaultModelType defaultModelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(defaultModelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDefineNotificationType(DefineNotificationType defineNotificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(defineNotificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDescriptionType(DescriptionType descriptionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(descriptionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisableNotificationType(DisableNotificationType disableNotificationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(disableNotificationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncryptionSecurityFilterType(EncryptionSecurityFilterType encryptionSecurityFilterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encryptionSecurityFilterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncryptionStrategyType(EncryptionStrategyType encryptionStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encryptionStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEncryptionTransformerType(EncryptionTransformerType encryptionTransformerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(encryptionTransformerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointExceptionStrategyType(EndpointExceptionStrategyType endpointExceptionStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpointExceptionStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndpointSelectorRouterType(EndpointSelectorRouterType endpointSelectorRouterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(endpointSelectorRouterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvironmentPropertyType(EnvironmentPropertyType environmentPropertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(environmentPropertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpressionTransformerType(ExpressionTransformerType expressionTransformerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expressionTransformerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExtensibleEntryPointResolverSet(ExtensibleEntryPointResolverSet extensibleEntryPointResolverSet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(extensibleEntryPointResolverSet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilteredInboundRouterType(FilteredInboundRouterType filteredInboundRouterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filteredInboundRouterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFilteringOutboundRouterType(FilteringOutboundRouterType filteringOutboundRouterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(filteringOutboundRouterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForwardingCatchAllStrategyType(ForwardingCatchAllStrategyType forwardingCatchAllStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(forwardingCatchAllStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGenericObjectFactoryType(GenericObjectFactoryType genericObjectFactoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(genericObjectFactoryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGlobalEndpointType(GlobalEndpointType globalEndpointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(globalEndpointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInboundCollectionType(InboundCollectionType inboundCollectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inboundCollectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInboundEndpointType(InboundEndpointType inboundEndpointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inboundEndpointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJndiConnectorType(JndiConnectorType jndiConnectorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jndiConnectorType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJndiTransactionManagerType(JndiTransactionManagerType jndiTransactionManagerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jndiTransactionManagerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJndiTransactionManagerType1(JndiTransactionManagerType1 jndiTransactionManagerType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jndiTransactionManagerType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyType(KeyType keyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeyValueType(KeyValueType keyValueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(keyValueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateListOrSetType(ListOrSetType listOrSetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(listOrSetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoggingCatchAllStrategyType(LoggingCatchAllStrategyType loggingCatchAllStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(loggingCatchAllStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapType(MapType mapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageChunkingAggregatorRouterType(MessageChunkingAggregatorRouterType messageChunkingAggregatorRouterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageChunkingAggregatorRouterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessagePropertiesTransformerType(MessagePropertiesTransformerType messagePropertiesTransformerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messagePropertiesTransformerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMessageSplitterOutboundRouterType(MessageSplitterOutboundRouterType messageSplitterOutboundRouterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(messageSplitterOutboundRouterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodEntryPointResolverType(MethodEntryPointResolverType methodEntryPointResolverType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(methodEntryPointResolverType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodType(MethodType methodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(methodType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMuleType(MuleType muleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(muleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotificationListenerType(NotificationListenerType notificationListenerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notificationListenerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNotificationManagerType(NotificationManagerType notificationManagerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(notificationManagerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutboundCollectionType(OutboundCollectionType outboundCollectionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outboundCollectionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutboundEndpointType(OutboundEndpointType outboundEndpointType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outboundEndpointType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOutboundRouterType(OutboundRouterType outboundRouterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(outboundRouterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePasswordEncryptionStrategyType(PasswordEncryptionStrategyType passwordEncryptionStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(passwordEncryptionStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatternFilterType(PatternFilterType patternFilterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patternFilterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePojoBindingType(PojoBindingType pojoBindingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pojoBindingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePooledJavaComponentType(PooledJavaComponentType pooledJavaComponentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pooledJavaComponentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoolingProfileType(PoolingProfileType poolingProfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(poolingProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyEntryPointResolverType(PropertyEntryPointResolverType propertyEntryPointResolverType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyEntryPointResolverType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrototypeObjectFactoryType(PrototypeObjectFactoryType prototypeObjectFactoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prototypeObjectFactoryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQueueProfileType(QueueProfileType queueProfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(queueProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReferenceType(ReferenceType referenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(referenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefFilterType(RefFilterType refFilterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(refFilterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReflectionEntryPointResolverType(ReflectionEntryPointResolverType reflectionEntryPointResolverType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reflectionEntryPointResolverType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRefTransformerType(RefTransformerType refTransformerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(refTransformerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReplyToType(ReplyToType replyToType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(replyToType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseTransformersType(ResponseTransformersType responseTransformersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responseTransformersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRetryConnectionStrategyType(RetryConnectionStrategyType retryConnectionStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(retryConnectionStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReturnArgumentType(ReturnArgumentType returnArgumentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(returnArgumentType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecretKeyEncryptionStrategyType(SecretKeyEncryptionStrategyType secretKeyEncryptionStrategyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(secretKeyEncryptionStrategyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityManagerType(SecurityManagerType securityManagerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityManagerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityProviderType(SecurityProviderType securityProviderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityProviderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSedaModelType(SedaModelType sedaModelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sedaModelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSedaServiceType(SedaServiceType sedaServiceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sedaServiceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectiveConsumerRouterType(SelectiveConsumerRouterType selectiveConsumerRouterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectiveConsumerRouterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceOverridesType(ServiceOverridesType serviceOverridesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(serviceOverridesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingletonObjectFactoryType(SingletonObjectFactoryType singletonObjectFactoryType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(singletonObjectFactoryType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpringBeanLookupType(SpringBeanLookupType springBeanLookupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(springBeanLookupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticRecipientListRouterType(StaticRecipientListRouterType staticRecipientListRouterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticRecipientListRouterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThreadingProfileType(ThreadingProfileType threadingProfileType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(threadingProfileType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTlsClientKeyStoreType(TlsClientKeyStoreType tlsClientKeyStoreType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tlsClientKeyStoreType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTlsKeyStoreType(TlsKeyStoreType tlsKeyStoreType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tlsKeyStoreType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTlsProtocolHandler(TlsProtocolHandler tlsProtocolHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tlsProtocolHandler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTlsServerTrustStoreType(TlsServerTrustStoreType tlsServerTrustStoreType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tlsServerTrustStoreType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTlsTrustStoreType(TlsTrustStoreType tlsTrustStoreType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tlsTrustStoreType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionManagerType(TransactionManagerType transactionManagerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transactionManagerType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransformersType(TransformersType transformersType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transformersType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeFilterType(TypeFilterType typeFilterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(typeFilterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUnitaryFilterType(UnitaryFilterType unitaryFilterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(unitaryFilterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValueType(ValueType valueType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(valueType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWildcardFilterType(WildcardFilterType wildcardFilterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wildcardFilterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWireTapRouterType(WireTapRouterType wireTapRouterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wireTapRouterType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConnection(Connection connection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(connection, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionType(ActionType actionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnableCorrelationType(EnableCorrelationType enableCorrelationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluatorType(EvaluatorType evaluatorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventType(EventType eventType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventType1(EventType1 eventType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExhaustedActionType(ExhaustedActionType exhaustedActionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialisationPolicyType(InitialisationPolicyType initialisationPolicyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialStateType(InitialStateType initialStateType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceType(InterfaceType interfaceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceType1(InterfaceType1 interfaceType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoolExhaustedActionType(PoolExhaustedActionType poolExhaustedActionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActionTypeObject(ActionType actionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnableCorrelationTypeObject(EnableCorrelationType enableCorrelationTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEvaluatorTypeObject(EvaluatorType evaluatorTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTypeObject(EventType eventTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEventTypeObject1(EventType1 eventTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExhaustedActionTypeObject(ExhaustedActionType exhaustedActionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialisationPolicyTypeObject(InitialisationPolicyType initialisationPolicyTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInitialStateTypeObject(InitialStateType initialStateTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceTypeObject(InterfaceType interfaceTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInterfaceTypeObject1(InterfaceType1 interfaceTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonBlankString(String nonBlankString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonBlankString_MemberTypes(nonBlankString, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Non Blank String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonBlankString_MemberTypes(String nonBlankString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (CorePackage.eINSTANCE.getNonBlankStringMember0().isInstance(nonBlankString)) {
				if (validateNonBlankStringMember0(nonBlankString, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (CorePackage.eINSTANCE.getNonBlankStringMember0().isInstance(nonBlankString)) {
				if (validateNonBlankStringMember0(nonBlankString, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonBlankStringMember0(String nonBlankStringMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNonBlankStringMember0_Pattern(nonBlankStringMember0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNonBlankStringMember0_Pattern
	 */
	public static final  PatternMatcher [][] NON_BLANK_STRING_MEMBER0__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".*[^ ]+.*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Non Blank String Member0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNonBlankStringMember0_Pattern(String nonBlankStringMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(CorePackage.eINSTANCE.getNonBlankStringMember0(), nonBlankStringMember0, NON_BLANK_STRING_MEMBER0__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePoolExhaustedActionTypeObject(PoolExhaustedActionType poolExhaustedActionTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyPlaceholderType(String propertyPlaceholderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validatePropertyPlaceholderType_Pattern(propertyPlaceholderType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validatePropertyPlaceholderType_Pattern
	 */
	public static final  PatternMatcher [][] PROPERTY_PLACEHOLDER_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("(\\$\\{[^\\}]+\\})")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Property Placeholder Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyPlaceholderType_Pattern(String propertyPlaceholderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(CorePackage.eINSTANCE.getPropertyPlaceholderType(), propertyPlaceholderType, PROPERTY_PLACEHOLDER_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableBoolean(boolean substitutableBoolean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSubstitutableBoolean_MemberTypes(substitutableBoolean, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Substitutable Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableBoolean_MemberTypes(boolean substitutableBoolean, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (validateSubstitutableBooleanMember0(substitutableBoolean, tempDiagnostics, context)) return true;
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (validateSubstitutableBooleanMember0(substitutableBoolean, null, context)) return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableBooleanMember0(boolean substitutableBooleanMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableBooleanMember0Object(Boolean substitutableBooleanMember0Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableBooleanObject(Boolean substitutableBooleanObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSubstitutableBoolean_MemberTypes(substitutableBooleanObject.booleanValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableClass(String substitutableClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSubstitutableClass_MemberTypes(substitutableClass, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Substitutable Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableClass_MemberTypes(String substitutableClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (CorePackage.eINSTANCE.getSubstitutableClassMember0().isInstance(substitutableClass)) {
				if (validateSubstitutableClassMember0(substitutableClass, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (CorePackage.eINSTANCE.getSubstitutableClassMember0().isInstance(substitutableClass)) {
				if (validateSubstitutableClassMember0(substitutableClass, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableClassMember0(String substitutableClassMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSubstitutableClassMember0_Pattern(substitutableClassMember0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSubstitutableClassMember0_Pattern
	 */
	public static final  PatternMatcher [][] SUBSTITUTABLE_CLASS_MEMBER0__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\[?[A-Za-z0-9_\\.$]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Substitutable Class Member0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableClassMember0_Pattern(String substitutableClassMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(CorePackage.eINSTANCE.getSubstitutableClassMember0(), substitutableClassMember0, SUBSTITUTABLE_CLASS_MEMBER0__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableInt(int substitutableInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSubstitutableInt_MemberTypes(substitutableInt, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Substitutable Int</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableInt_MemberTypes(int substitutableInt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (validateSubstitutableIntMember0(substitutableInt, tempDiagnostics, context)) return true;
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (validateSubstitutableIntMember0(substitutableInt, null, context)) return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableIntMember0(int substitutableIntMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableIntMember0Object(Integer substitutableIntMember0Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableIntObject(Integer substitutableIntObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSubstitutableInt_MemberTypes(substitutableIntObject.intValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableLong(long substitutableLong, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSubstitutableLong_MemberTypes(substitutableLong, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Substitutable Long</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableLong_MemberTypes(long substitutableLong, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (validateSubstitutableLongMember0(substitutableLong, tempDiagnostics, context)) return true;
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (validateSubstitutableLongMember0(substitutableLong, null, context)) return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableLongMember0(long substitutableLongMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableLongMember0Object(Long substitutableLongMember0Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableLongObject(Long substitutableLongObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSubstitutableLong_MemberTypes(substitutableLongObject.longValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableName(String substitutableName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSubstitutableName_MemberTypes(substitutableName, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Substitutable Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableName_MemberTypes(String substitutableName, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (CorePackage.eINSTANCE.getSubstitutableNameMember0().isInstance(substitutableName)) {
				if (validateSubstitutableNameMember0(substitutableName, tempDiagnostics, context)) return true;
			}
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (CorePackage.eINSTANCE.getSubstitutableNameMember0().isInstance(substitutableName)) {
				if (validateSubstitutableNameMember0(substitutableName, null, context)) return true;
			}
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutableNameMember0(String substitutableNameMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNMTOKEN_Pattern(substitutableNameMember0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutablePortNumber(int substitutablePortNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSubstitutablePortNumber_MemberTypes(substitutablePortNumber, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MemberTypes constraint of '<em>Substitutable Port Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutablePortNumber_MemberTypes(int substitutablePortNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (diagnostics != null) {
			BasicDiagnostic tempDiagnostics = new BasicDiagnostic();
			if (validateSubstitutablePortNumberMember0(substitutablePortNumber, tempDiagnostics, context)) return true;
			for (Diagnostic diagnostic : tempDiagnostics.getChildren()) {
				diagnostics.add(diagnostic);
			}
		}
		else {
			if (validateSubstitutablePortNumberMember0(substitutablePortNumber, null, context)) return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutablePortNumberMember0(int substitutablePortNumberMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSubstitutablePortNumberMember0_Min(substitutablePortNumberMember0, diagnostics, context);
		if (result || diagnostics != null) result &= validateSubstitutablePortNumberMember0_Max(substitutablePortNumberMember0, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSubstitutablePortNumberMember0_Min
	 */
	public static final int SUBSTITUTABLE_PORT_NUMBER_MEMBER0__MIN__VALUE = 0;

	/**
	 * Validates the Min constraint of '<em>Substitutable Port Number Member0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutablePortNumberMember0_Min(int substitutablePortNumberMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = substitutablePortNumberMember0 >= SUBSTITUTABLE_PORT_NUMBER_MEMBER0__MIN__VALUE;
		if (!result && diagnostics != null) 
			reportMinViolation(CorePackage.eINSTANCE.getSubstitutablePortNumberMember0(), new Integer(substitutablePortNumberMember0), new Integer(SUBSTITUTABLE_PORT_NUMBER_MEMBER0__MIN__VALUE), true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateSubstitutablePortNumberMember0_Max
	 */
	public static final int SUBSTITUTABLE_PORT_NUMBER_MEMBER0__MAX__VALUE = 65536;

	/**
	 * Validates the Max constraint of '<em>Substitutable Port Number Member0</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutablePortNumberMember0_Max(int substitutablePortNumberMember0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = substitutablePortNumberMember0 <= SUBSTITUTABLE_PORT_NUMBER_MEMBER0__MAX__VALUE;
		if (!result && diagnostics != null) 
			reportMaxViolation(CorePackage.eINSTANCE.getSubstitutablePortNumberMember0(), new Integer(substitutablePortNumberMember0), new Integer(SUBSTITUTABLE_PORT_NUMBER_MEMBER0__MAX__VALUE), true, diagnostics, context);
		return result; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutablePortNumberMember0Object(Integer substitutablePortNumberMember0Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSubstitutablePortNumberMember0_Min(substitutablePortNumberMember0Object.intValue(), diagnostics, context);
		if (result || diagnostics != null) result &= validateSubstitutablePortNumberMember0_Max(substitutablePortNumberMember0Object.intValue(), diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubstitutablePortNumberObject(Integer substitutablePortNumberObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateSubstitutablePortNumber_MemberTypes(substitutablePortNumberObject.intValue(), diagnostics, context);
		return result;
	}

} //CoreValidator
