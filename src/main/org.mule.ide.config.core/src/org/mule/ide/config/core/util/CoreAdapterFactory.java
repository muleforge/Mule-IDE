/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.mule.ide.config.core.*;

import org.mule.ide.config.spring.BaseCollectionType;
import org.mule.ide.config.spring.TypedCollectionType;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch the delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreSwitch<Adapter> modelSwitch =
		new CoreSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractAgentType(AbstractAgentType object) {
				return createAbstractAgentTypeAdapter();
			}
			@Override
			public Adapter caseAbstractBindingType(AbstractBindingType object) {
				return createAbstractBindingTypeAdapter();
			}
			@Override
			public Adapter caseAbstractCatchAllStrategyType(AbstractCatchAllStrategyType object) {
				return createAbstractCatchAllStrategyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractComponentThreadingProfileType(AbstractComponentThreadingProfileType object) {
				return createAbstractComponentThreadingProfileTypeAdapter();
			}
			@Override
			public Adapter caseAbstractConnectionStrategyType(AbstractConnectionStrategyType object) {
				return createAbstractConnectionStrategyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractConnectorType(AbstractConnectorType object) {
				return createAbstractConnectorTypeAdapter();
			}
			@Override
			public Adapter caseAbstractEntrypointResolverType(AbstractEntrypointResolverType object) {
				return createAbstractEntrypointResolverTypeAdapter();
			}
			@Override
			public Adapter caseAbstractExceptionStrategyType(AbstractExceptionStrategyType object) {
				return createAbstractExceptionStrategyTypeAdapter();
			}
			@Override
			public Adapter caseAbstractExtensionType(AbstractExtensionType object) {
				return createAbstractExtensionTypeAdapter();
			}
			@Override
			public Adapter caseAbstractFilterType(AbstractFilterType object) {
				return createAbstractFilterTypeAdapter();
			}
			@Override
			public Adapter caseAbstractGlobalEndpointType(AbstractGlobalEndpointType object) {
				return createAbstractGlobalEndpointTypeAdapter();
			}
			@Override
			public Adapter caseAbstractInboundEndpointType(AbstractInboundEndpointType object) {
				return createAbstractInboundEndpointTypeAdapter();
			}
			@Override
			public Adapter caseAbstractInboundRouterType(AbstractInboundRouterType object) {
				return createAbstractInboundRouterTypeAdapter();
			}
			@Override
			public Adapter caseAbstractModelType(AbstractModelType object) {
				return createAbstractModelTypeAdapter();
			}
			@Override
			public Adapter caseAbstractObjectFactoryType(AbstractObjectFactoryType object) {
				return createAbstractObjectFactoryTypeAdapter();
			}
			@Override
			public Adapter caseAbstractOutboundEndpointType(AbstractOutboundEndpointType object) {
				return createAbstractOutboundEndpointTypeAdapter();
			}
			@Override
			public Adapter caseAbstractOutboundRouterType(AbstractOutboundRouterType object) {
				return createAbstractOutboundRouterTypeAdapter();
			}
			@Override
			public Adapter caseAbstractPoolingProfileType(AbstractPoolingProfileType object) {
				return createAbstractPoolingProfileTypeAdapter();
			}
			@Override
			public Adapter caseAbstractPropertyExtractorType(AbstractPropertyExtractorType object) {
				return createAbstractPropertyExtractorTypeAdapter();
			}
			@Override
			public Adapter caseAbstractQueueProfileType(AbstractQueueProfileType object) {
				return createAbstractQueueProfileTypeAdapter();
			}
			@Override
			public Adapter caseAbstractResponseEndpointType(AbstractResponseEndpointType object) {
				return createAbstractResponseEndpointTypeAdapter();
			}
			@Override
			public Adapter caseAbstractResponseRouterType(AbstractResponseRouterType object) {
				return createAbstractResponseRouterTypeAdapter();
			}
			@Override
			public Adapter caseAbstractSecurityFilterType(AbstractSecurityFilterType object) {
				return createAbstractSecurityFilterTypeAdapter();
			}
			@Override
			public Adapter caseAbstractSecurityManagerType(AbstractSecurityManagerType object) {
				return createAbstractSecurityManagerTypeAdapter();
			}
			@Override
			public Adapter caseAbstractServiceType(AbstractServiceType object) {
				return createAbstractServiceTypeAdapter();
			}
			@Override
			public Adapter caseAbstractStorageType(AbstractStorageType object) {
				return createAbstractStorageTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTransactionFactoryType(AbstractTransactionFactoryType object) {
				return createAbstractTransactionFactoryTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTransactionManagerType(AbstractTransactionManagerType object) {
				return createAbstractTransactionManagerTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTransactionType(AbstractTransactionType object) {
				return createAbstractTransactionTypeAdapter();
			}
			@Override
			public Adapter caseAbstractTransformerType(AbstractTransformerType object) {
				return createAbstractTransformerTypeAdapter();
			}
			@Override
			public Adapter caseBaseContainerContextType(BaseContainerContextType object) {
				return createBaseContainerContextTypeAdapter();
			}
			@Override
			public Adapter caseBaseServiceType(BaseServiceType object) {
				return createBaseServiceTypeAdapter();
			}
			@Override
			public Adapter caseCallableEntrypointResolverType(CallableEntrypointResolverType object) {
				return createCallableEntrypointResolverTypeAdapter();
			}
			@Override
			public Adapter caseChunkingRouterType(ChunkingRouterType object) {
				return createChunkingRouterTypeAdapter();
			}
			@Override
			public Adapter caseCollectionFilterType(CollectionFilterType object) {
				return createCollectionFilterTypeAdapter();
			}
			@Override
			public Adapter caseConnectionStrategyType(ConnectionStrategyType object) {
				return createConnectionStrategyTypeAdapter();
			}
			@Override
			public Adapter caseConnectorType(ConnectorType object) {
				return createConnectorTypeAdapter();
			}
			@Override
			public Adapter caseContainerContextType(ContainerContextType object) {
				return createContainerContextTypeAdapter();
			}
			@Override
			public Adapter caseCorrelationAggregatorRouterType(CorrelationAggregatorRouterType object) {
				return createCorrelationAggregatorRouterTypeAdapter();
			}
			@Override
			public Adapter caseCorrelationRouterType(CorrelationRouterType object) {
				return createCorrelationRouterTypeAdapter();
			}
			@Override
			public Adapter caseCustomCatchAllStrategyType(CustomCatchAllStrategyType object) {
				return createCustomCatchAllStrategyTypeAdapter();
			}
			@Override
			public Adapter caseCustomConnectionStrategyType(CustomConnectionStrategyType object) {
				return createCustomConnectionStrategyTypeAdapter();
			}
			@Override
			public Adapter caseCustomConnectorType(CustomConnectorType object) {
				return createCustomConnectorTypeAdapter();
			}
			@Override
			public Adapter caseCustomContainerContextType(CustomContainerContextType object) {
				return createCustomContainerContextTypeAdapter();
			}
			@Override
			public Adapter caseCustomEncryptionStrategyType(CustomEncryptionStrategyType object) {
				return createCustomEncryptionStrategyTypeAdapter();
			}
			@Override
			public Adapter caseCustomEntrypointResolverType(CustomEntrypointResolverType object) {
				return createCustomEntrypointResolverTypeAdapter();
			}
			@Override
			public Adapter caseCustomExceptionStrategyType(CustomExceptionStrategyType object) {
				return createCustomExceptionStrategyTypeAdapter();
			}
			@Override
			public Adapter caseCustomFilterType(CustomFilterType object) {
				return createCustomFilterTypeAdapter();
			}
			@Override
			public Adapter caseCustomForwardingCatchAllStrategyType(CustomForwardingCatchAllStrategyType object) {
				return createCustomForwardingCatchAllStrategyTypeAdapter();
			}
			@Override
			public Adapter caseCustomInboundRouterType(CustomInboundRouterType object) {
				return createCustomInboundRouterTypeAdapter();
			}
			@Override
			public Adapter caseCustomOutboundRouterType(CustomOutboundRouterType object) {
				return createCustomOutboundRouterTypeAdapter();
			}
			@Override
			public Adapter caseCustomPropertyExtractorType(CustomPropertyExtractorType object) {
				return createCustomPropertyExtractorTypeAdapter();
			}
			@Override
			public Adapter caseCustomResponseRouterType(CustomResponseRouterType object) {
				return createCustomResponseRouterTypeAdapter();
			}
			@Override
			public Adapter caseCustomSecurityProviderType(CustomSecurityProviderType object) {
				return createCustomSecurityProviderTypeAdapter();
			}
			@Override
			public Adapter caseCustomTransactionFactoryType(CustomTransactionFactoryType object) {
				return createCustomTransactionFactoryTypeAdapter();
			}
			@Override
			public Adapter caseCustomTransactionManagerType(CustomTransactionManagerType object) {
				return createCustomTransactionManagerTypeAdapter();
			}
			@Override
			public Adapter caseCustomTransformerType(CustomTransformerType object) {
				return createCustomTransformerTypeAdapter();
			}
			@Override
			public Adapter caseDefaultComponentType(DefaultComponentType object) {
				return createDefaultComponentTypeAdapter();
			}
			@Override
			public Adapter caseDefaultModelType(DefaultModelType object) {
				return createDefaultModelTypeAdapter();
			}
			@Override
			public Adapter caseDefaultServiceType(DefaultServiceType object) {
				return createDefaultServiceTypeAdapter();
			}
			@Override
			public Adapter caseDescriptionType(DescriptionType object) {
				return createDescriptionTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEncryptionSecurityFilterType(EncryptionSecurityFilterType object) {
				return createEncryptionSecurityFilterTypeAdapter();
			}
			@Override
			public Adapter caseEncryptionStrategyType(EncryptionStrategyType object) {
				return createEncryptionStrategyTypeAdapter();
			}
			@Override
			public Adapter caseEndpointSelectorRouterType(EndpointSelectorRouterType object) {
				return createEndpointSelectorRouterTypeAdapter();
			}
			@Override
			public Adapter caseEnvironmentPropertyType(EnvironmentPropertyType object) {
				return createEnvironmentPropertyTypeAdapter();
			}
			@Override
			public Adapter caseExceptionStrategyType(ExceptionStrategyType object) {
				return createExceptionStrategyTypeAdapter();
			}
			@Override
			public Adapter caseFilteredInboundRouterType(FilteredInboundRouterType object) {
				return createFilteredInboundRouterTypeAdapter();
			}
			@Override
			public Adapter caseFilteringOutboundRouterType(FilteringOutboundRouterType object) {
				return createFilteringOutboundRouterTypeAdapter();
			}
			@Override
			public Adapter caseFilterRefType(FilterRefType object) {
				return createFilterRefTypeAdapter();
			}
			@Override
			public Adapter caseForwardingCatchAllStrategyType(ForwardingCatchAllStrategyType object) {
				return createForwardingCatchAllStrategyTypeAdapter();
			}
			@Override
			public Adapter caseForwardingRouterType(ForwardingRouterType object) {
				return createForwardingRouterTypeAdapter();
			}
			@Override
			public Adapter caseGenericObjectFactoryType(GenericObjectFactoryType object) {
				return createGenericObjectFactoryTypeAdapter();
			}
			@Override
			public Adapter caseGlobalEndpointType(GlobalEndpointType object) {
				return createGlobalEndpointTypeAdapter();
			}
			@Override
			public Adapter caseIdempotentReceiverType(IdempotentReceiverType object) {
				return createIdempotentReceiverTypeAdapter();
			}
			@Override
			public Adapter caseInboundEndpointType(InboundEndpointType object) {
				return createInboundEndpointTypeAdapter();
			}
			@Override
			public Adapter caseInboundRouterCollectionType(InboundRouterCollectionType object) {
				return createInboundRouterCollectionTypeAdapter();
			}
			@Override
			public Adapter caseIocContainerContextType(IocContainerContextType object) {
				return createIocContainerContextTypeAdapter();
			}
			@Override
			public Adapter caseJndiConnectorType(JndiConnectorType object) {
				return createJndiConnectorTypeAdapter();
			}
			@Override
			public Adapter caseJndiTransactionManagerType(JndiTransactionManagerType object) {
				return createJndiTransactionManagerTypeAdapter();
			}
			@Override
			public Adapter caseListOrSetType(ListOrSetType object) {
				return createListOrSetTypeAdapter();
			}
			@Override
			public Adapter caseLoggingCatchAllStrategyType(LoggingCatchAllStrategyType object) {
				return createLoggingCatchAllStrategyTypeAdapter();
			}
			@Override
			public Adapter caseMapType(MapType object) {
				return createMapTypeAdapter();
			}
			@Override
			public Adapter caseMessagePropertiesTransformerType(MessagePropertiesTransformerType object) {
				return createMessagePropertiesTransformerTypeAdapter();
			}
			@Override
			public Adapter caseMessageSplitterOutboundRouterType(MessageSplitterOutboundRouterType object) {
				return createMessageSplitterOutboundRouterTypeAdapter();
			}
			@Override
			public Adapter caseMuleAdminAgentType(MuleAdminAgentType object) {
				return createMuleAdminAgentTypeAdapter();
			}
			@Override
			public Adapter caseMuleManagementContextType(MuleManagementContextType object) {
				return createMuleManagementContextTypeAdapter();
			}
			@Override
			public Adapter caseMuleType(MuleType object) {
				return createMuleTypeAdapter();
			}
			@Override
			public Adapter caseMuleUnsafeType(MuleUnsafeType object) {
				return createMuleUnsafeTypeAdapter();
			}
			@Override
			public Adapter caseNestedBindingType(NestedBindingType object) {
				return createNestedBindingTypeAdapter();
			}
			@Override
			public Adapter caseNestedRouterCollectionType(NestedRouterCollectionType object) {
				return createNestedRouterCollectionTypeAdapter();
			}
			@Override
			public Adapter caseNoArgsCallDelegateClassType(NoArgsCallDelegateClassType object) {
				return createNoArgsCallDelegateClassTypeAdapter();
			}
			@Override
			public Adapter caseNoArgsCallDelegateInstanceType(NoArgsCallDelegateInstanceType object) {
				return createNoArgsCallDelegateInstanceTypeAdapter();
			}
			@Override
			public Adapter caseNoArgsCallWrapperType(NoArgsCallWrapperType object) {
				return createNoArgsCallWrapperTypeAdapter();
			}
			@Override
			public Adapter caseOutboundEndpointType(OutboundEndpointType object) {
				return createOutboundEndpointTypeAdapter();
			}
			@Override
			public Adapter caseOutboundRouterCollectionType(OutboundRouterCollectionType object) {
				return createOutboundRouterCollectionTypeAdapter();
			}
			@Override
			public Adapter caseOutboundRouterType(OutboundRouterType object) {
				return createOutboundRouterTypeAdapter();
			}
			@Override
			public Adapter casePasswordEncryptionStrategyType(PasswordEncryptionStrategyType object) {
				return createPasswordEncryptionStrategyTypeAdapter();
			}
			@Override
			public Adapter casePatternFilterType(PatternFilterType object) {
				return createPatternFilterTypeAdapter();
			}
			@Override
			public Adapter casePooledObjectFactoryType(PooledObjectFactoryType object) {
				return createPooledObjectFactoryTypeAdapter();
			}
			@Override
			public Adapter casePoolingProfileType(PoolingProfileType object) {
				return createPoolingProfileTypeAdapter();
			}
			@Override
			public Adapter casePropertiesContainerContextType(PropertiesContainerContextType object) {
				return createPropertiesContainerContextTypeAdapter();
			}
			@Override
			public Adapter casePrototypeObjectFactoryType(PrototypeObjectFactoryType object) {
				return createPrototypeObjectFactoryTypeAdapter();
			}
			@Override
			public Adapter caseQueueProfileType(QueueProfileType object) {
				return createQueueProfileTypeAdapter();
			}
			@Override
			public Adapter caseReferenceType(ReferenceType object) {
				return createReferenceTypeAdapter();
			}
			@Override
			public Adapter caseReplyToType(ReplyToType object) {
				return createReplyToTypeAdapter();
			}
			@Override
			public Adapter caseResponseEndpointType(ResponseEndpointType object) {
				return createResponseEndpointTypeAdapter();
			}
			@Override
			public Adapter caseResponseRouterCollectionType(ResponseRouterCollectionType object) {
				return createResponseRouterCollectionTypeAdapter();
			}
			@Override
			public Adapter caseResponseRouterType(ResponseRouterType object) {
				return createResponseRouterTypeAdapter();
			}
			@Override
			public Adapter caseRetryConnectionStrategyType(RetryConnectionStrategyType object) {
				return createRetryConnectionStrategyTypeAdapter();
			}
			@Override
			public Adapter caseRmiContainerContextType(RmiContainerContextType object) {
				return createRmiContainerContextTypeAdapter();
			}
			@Override
			public Adapter caseSecretKeyEncryptionStrategyType(SecretKeyEncryptionStrategyType object) {
				return createSecretKeyEncryptionStrategyTypeAdapter();
			}
			@Override
			public Adapter caseSecurityManagerType(SecurityManagerType object) {
				return createSecurityManagerTypeAdapter();
			}
			@Override
			public Adapter caseSecurityProviderType(SecurityProviderType object) {
				return createSecurityProviderTypeAdapter();
			}
			@Override
			public Adapter caseSedaModelType(SedaModelType object) {
				return createSedaModelTypeAdapter();
			}
			@Override
			public Adapter caseSedaServiceType(SedaServiceType object) {
				return createSedaServiceTypeAdapter();
			}
			@Override
			public Adapter caseSelectiveConsumerRouterType(SelectiveConsumerRouterType object) {
				return createSelectiveConsumerRouterTypeAdapter();
			}
			@Override
			public Adapter caseServiceOverridesType(ServiceOverridesType object) {
				return createServiceOverridesTypeAdapter();
			}
			@Override
			public Adapter caseSingletonObjectFactoryType(SingletonObjectFactoryType object) {
				return createSingletonObjectFactoryTypeAdapter();
			}
			@Override
			public Adapter caseStaticRecipientListRouterType(StaticRecipientListRouterType object) {
				return createStaticRecipientListRouterTypeAdapter();
			}
			@Override
			public Adapter caseThreadingProfileType(ThreadingProfileType object) {
				return createThreadingProfileTypeAdapter();
			}
			@Override
			public Adapter caseTlsClientKeyStoreType(TlsClientKeyStoreType object) {
				return createTlsClientKeyStoreTypeAdapter();
			}
			@Override
			public Adapter caseTlsKeyStoreType(TlsKeyStoreType object) {
				return createTlsKeyStoreTypeAdapter();
			}
			@Override
			public Adapter caseTlsProtocolHandler(TlsProtocolHandler object) {
				return createTlsProtocolHandlerAdapter();
			}
			@Override
			public Adapter caseTlsServerTrustStoreType(TlsServerTrustStoreType object) {
				return createTlsServerTrustStoreTypeAdapter();
			}
			@Override
			public Adapter caseTlsTrustStoreType(TlsTrustStoreType object) {
				return createTlsTrustStoreTypeAdapter();
			}
			@Override
			public Adapter caseTransactionManagerType(TransactionManagerType object) {
				return createTransactionManagerTypeAdapter();
			}
			@Override
			public Adapter caseTransactionRefFactoryType(TransactionRefFactoryType object) {
				return createTransactionRefFactoryTypeAdapter();
			}
			@Override
			public Adapter caseTransactionType(TransactionType object) {
				return createTransactionTypeAdapter();
			}
			@Override
			public Adapter caseTransformerAppendStringType(TransformerAppendStringType object) {
				return createTransformerAppendStringTypeAdapter();
			}
			@Override
			public Adapter caseTransformerRefType(TransformerRefType object) {
				return createTransformerRefTypeAdapter();
			}
			@Override
			public Adapter caseTypeFilterType(TypeFilterType object) {
				return createTypeFilterTypeAdapter();
			}
			@Override
			public Adapter caseUnitaryFilterType(UnitaryFilterType object) {
				return createUnitaryFilterTypeAdapter();
			}
			@Override
			public Adapter caseWildcardFilterType(WildcardFilterType object) {
				return createWildcardFilterTypeAdapter();
			}
			@Override
			public Adapter caseWireTapRouterType(WireTapRouterType object) {
				return createWireTapRouterTypeAdapter();
			}
			@Override
			public Adapter caseBaseCollectionType(BaseCollectionType object) {
				return createBaseCollectionTypeAdapter();
			}
			@Override
			public Adapter caseTypedCollectionType(TypedCollectionType object) {
				return createTypedCollectionTypeAdapter();
			}
			@Override
			public Adapter caseListOrSetType_1(org.mule.ide.config.spring.ListOrSetType object) {
				return createListOrSetType_1Adapter();
			}
			@Override
			public Adapter caseMapType_1(org.mule.ide.config.spring.MapType object) {
				return createMapType_1Adapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractAgentType <em>Abstract Agent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractAgentType
	 * @generated
	 */
	public Adapter createAbstractAgentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractBindingType <em>Abstract Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractBindingType
	 * @generated
	 */
	public Adapter createAbstractBindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractCatchAllStrategyType <em>Abstract Catch All Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractCatchAllStrategyType
	 * @generated
	 */
	public Adapter createAbstractCatchAllStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractComponentThreadingProfileType <em>Abstract Component Threading Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractComponentThreadingProfileType
	 * @generated
	 */
	public Adapter createAbstractComponentThreadingProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractConnectionStrategyType <em>Abstract Connection Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractConnectionStrategyType
	 * @generated
	 */
	public Adapter createAbstractConnectionStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractConnectorType <em>Abstract Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractConnectorType
	 * @generated
	 */
	public Adapter createAbstractConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractEntrypointResolverType <em>Abstract Entrypoint Resolver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractEntrypointResolverType
	 * @generated
	 */
	public Adapter createAbstractEntrypointResolverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractExceptionStrategyType <em>Abstract Exception Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractExceptionStrategyType
	 * @generated
	 */
	public Adapter createAbstractExceptionStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractExtensionType <em>Abstract Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractExtensionType
	 * @generated
	 */
	public Adapter createAbstractExtensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractFilterType <em>Abstract Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractFilterType
	 * @generated
	 */
	public Adapter createAbstractFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractGlobalEndpointType <em>Abstract Global Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractGlobalEndpointType
	 * @generated
	 */
	public Adapter createAbstractGlobalEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractInboundEndpointType <em>Abstract Inbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractInboundEndpointType
	 * @generated
	 */
	public Adapter createAbstractInboundEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractInboundRouterType <em>Abstract Inbound Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractInboundRouterType
	 * @generated
	 */
	public Adapter createAbstractInboundRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractModelType <em>Abstract Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractModelType
	 * @generated
	 */
	public Adapter createAbstractModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractObjectFactoryType <em>Abstract Object Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractObjectFactoryType
	 * @generated
	 */
	public Adapter createAbstractObjectFactoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractOutboundEndpointType <em>Abstract Outbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractOutboundEndpointType
	 * @generated
	 */
	public Adapter createAbstractOutboundEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractOutboundRouterType <em>Abstract Outbound Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractOutboundRouterType
	 * @generated
	 */
	public Adapter createAbstractOutboundRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractPoolingProfileType <em>Abstract Pooling Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractPoolingProfileType
	 * @generated
	 */
	public Adapter createAbstractPoolingProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractPropertyExtractorType <em>Abstract Property Extractor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractPropertyExtractorType
	 * @generated
	 */
	public Adapter createAbstractPropertyExtractorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractQueueProfileType <em>Abstract Queue Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractQueueProfileType
	 * @generated
	 */
	public Adapter createAbstractQueueProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractResponseEndpointType <em>Abstract Response Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractResponseEndpointType
	 * @generated
	 */
	public Adapter createAbstractResponseEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractResponseRouterType <em>Abstract Response Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractResponseRouterType
	 * @generated
	 */
	public Adapter createAbstractResponseRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractSecurityFilterType <em>Abstract Security Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractSecurityFilterType
	 * @generated
	 */
	public Adapter createAbstractSecurityFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractSecurityManagerType <em>Abstract Security Manager Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractSecurityManagerType
	 * @generated
	 */
	public Adapter createAbstractSecurityManagerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractServiceType <em>Abstract Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractServiceType
	 * @generated
	 */
	public Adapter createAbstractServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractStorageType <em>Abstract Storage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractStorageType
	 * @generated
	 */
	public Adapter createAbstractStorageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractTransactionFactoryType <em>Abstract Transaction Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractTransactionFactoryType
	 * @generated
	 */
	public Adapter createAbstractTransactionFactoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractTransactionManagerType <em>Abstract Transaction Manager Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractTransactionManagerType
	 * @generated
	 */
	public Adapter createAbstractTransactionManagerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractTransactionType <em>Abstract Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractTransactionType
	 * @generated
	 */
	public Adapter createAbstractTransactionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.AbstractTransformerType <em>Abstract Transformer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.AbstractTransformerType
	 * @generated
	 */
	public Adapter createAbstractTransformerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.BaseContainerContextType <em>Base Container Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.BaseContainerContextType
	 * @generated
	 */
	public Adapter createBaseContainerContextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.BaseServiceType <em>Base Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.BaseServiceType
	 * @generated
	 */
	public Adapter createBaseServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CallableEntrypointResolverType <em>Callable Entrypoint Resolver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CallableEntrypointResolverType
	 * @generated
	 */
	public Adapter createCallableEntrypointResolverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.ChunkingRouterType <em>Chunking Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.ChunkingRouterType
	 * @generated
	 */
	public Adapter createChunkingRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CollectionFilterType <em>Collection Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CollectionFilterType
	 * @generated
	 */
	public Adapter createCollectionFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.ConnectionStrategyType <em>Connection Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.ConnectionStrategyType
	 * @generated
	 */
	public Adapter createConnectionStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.ConnectorType <em>Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.ConnectorType
	 * @generated
	 */
	public Adapter createConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.ContainerContextType <em>Container Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.ContainerContextType
	 * @generated
	 */
	public Adapter createContainerContextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CorrelationAggregatorRouterType <em>Correlation Aggregator Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CorrelationAggregatorRouterType
	 * @generated
	 */
	public Adapter createCorrelationAggregatorRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CorrelationRouterType <em>Correlation Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CorrelationRouterType
	 * @generated
	 */
	public Adapter createCorrelationRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CustomCatchAllStrategyType <em>Custom Catch All Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CustomCatchAllStrategyType
	 * @generated
	 */
	public Adapter createCustomCatchAllStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CustomConnectionStrategyType <em>Custom Connection Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CustomConnectionStrategyType
	 * @generated
	 */
	public Adapter createCustomConnectionStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CustomConnectorType <em>Custom Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CustomConnectorType
	 * @generated
	 */
	public Adapter createCustomConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CustomContainerContextType <em>Custom Container Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CustomContainerContextType
	 * @generated
	 */
	public Adapter createCustomContainerContextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CustomEncryptionStrategyType <em>Custom Encryption Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CustomEncryptionStrategyType
	 * @generated
	 */
	public Adapter createCustomEncryptionStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CustomEntrypointResolverType <em>Custom Entrypoint Resolver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CustomEntrypointResolverType
	 * @generated
	 */
	public Adapter createCustomEntrypointResolverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CustomExceptionStrategyType <em>Custom Exception Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CustomExceptionStrategyType
	 * @generated
	 */
	public Adapter createCustomExceptionStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CustomFilterType <em>Custom Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CustomFilterType
	 * @generated
	 */
	public Adapter createCustomFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CustomForwardingCatchAllStrategyType <em>Custom Forwarding Catch All Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CustomForwardingCatchAllStrategyType
	 * @generated
	 */
	public Adapter createCustomForwardingCatchAllStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CustomInboundRouterType <em>Custom Inbound Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CustomInboundRouterType
	 * @generated
	 */
	public Adapter createCustomInboundRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CustomOutboundRouterType <em>Custom Outbound Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CustomOutboundRouterType
	 * @generated
	 */
	public Adapter createCustomOutboundRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CustomPropertyExtractorType <em>Custom Property Extractor Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CustomPropertyExtractorType
	 * @generated
	 */
	public Adapter createCustomPropertyExtractorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CustomResponseRouterType <em>Custom Response Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CustomResponseRouterType
	 * @generated
	 */
	public Adapter createCustomResponseRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CustomSecurityProviderType <em>Custom Security Provider Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CustomSecurityProviderType
	 * @generated
	 */
	public Adapter createCustomSecurityProviderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CustomTransactionFactoryType <em>Custom Transaction Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CustomTransactionFactoryType
	 * @generated
	 */
	public Adapter createCustomTransactionFactoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CustomTransactionManagerType <em>Custom Transaction Manager Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CustomTransactionManagerType
	 * @generated
	 */
	public Adapter createCustomTransactionManagerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.CustomTransformerType <em>Custom Transformer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.CustomTransformerType
	 * @generated
	 */
	public Adapter createCustomTransformerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.DefaultComponentType <em>Default Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.DefaultComponentType
	 * @generated
	 */
	public Adapter createDefaultComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.DefaultModelType <em>Default Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.DefaultModelType
	 * @generated
	 */
	public Adapter createDefaultModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.DefaultServiceType <em>Default Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.DefaultServiceType
	 * @generated
	 */
	public Adapter createDefaultServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.DescriptionType
	 * @generated
	 */
	public Adapter createDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.EncryptionSecurityFilterType <em>Encryption Security Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.EncryptionSecurityFilterType
	 * @generated
	 */
	public Adapter createEncryptionSecurityFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.EncryptionStrategyType <em>Encryption Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.EncryptionStrategyType
	 * @generated
	 */
	public Adapter createEncryptionStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.EndpointSelectorRouterType <em>Endpoint Selector Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.EndpointSelectorRouterType
	 * @generated
	 */
	public Adapter createEndpointSelectorRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.EnvironmentPropertyType <em>Environment Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.EnvironmentPropertyType
	 * @generated
	 */
	public Adapter createEnvironmentPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.ExceptionStrategyType <em>Exception Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.ExceptionStrategyType
	 * @generated
	 */
	public Adapter createExceptionStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.FilteredInboundRouterType <em>Filtered Inbound Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.FilteredInboundRouterType
	 * @generated
	 */
	public Adapter createFilteredInboundRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.FilteringOutboundRouterType <em>Filtering Outbound Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.FilteringOutboundRouterType
	 * @generated
	 */
	public Adapter createFilteringOutboundRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.FilterRefType <em>Filter Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.FilterRefType
	 * @generated
	 */
	public Adapter createFilterRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.ForwardingCatchAllStrategyType <em>Forwarding Catch All Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.ForwardingCatchAllStrategyType
	 * @generated
	 */
	public Adapter createForwardingCatchAllStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.ForwardingRouterType <em>Forwarding Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.ForwardingRouterType
	 * @generated
	 */
	public Adapter createForwardingRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.GenericObjectFactoryType <em>Generic Object Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.GenericObjectFactoryType
	 * @generated
	 */
	public Adapter createGenericObjectFactoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.GlobalEndpointType <em>Global Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.GlobalEndpointType
	 * @generated
	 */
	public Adapter createGlobalEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.IdempotentReceiverType <em>Idempotent Receiver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.IdempotentReceiverType
	 * @generated
	 */
	public Adapter createIdempotentReceiverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.InboundEndpointType <em>Inbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.InboundEndpointType
	 * @generated
	 */
	public Adapter createInboundEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.InboundRouterCollectionType <em>Inbound Router Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.InboundRouterCollectionType
	 * @generated
	 */
	public Adapter createInboundRouterCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.IocContainerContextType <em>Ioc Container Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.IocContainerContextType
	 * @generated
	 */
	public Adapter createIocContainerContextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.JndiConnectorType <em>Jndi Connector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.JndiConnectorType
	 * @generated
	 */
	public Adapter createJndiConnectorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.JndiTransactionManagerType <em>Jndi Transaction Manager Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.JndiTransactionManagerType
	 * @generated
	 */
	public Adapter createJndiTransactionManagerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.ListOrSetType <em>List Or Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.ListOrSetType
	 * @generated
	 */
	public Adapter createListOrSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.LoggingCatchAllStrategyType <em>Logging Catch All Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.LoggingCatchAllStrategyType
	 * @generated
	 */
	public Adapter createLoggingCatchAllStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.MapType
	 * @generated
	 */
	public Adapter createMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.MessagePropertiesTransformerType <em>Message Properties Transformer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.MessagePropertiesTransformerType
	 * @generated
	 */
	public Adapter createMessagePropertiesTransformerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.MessageSplitterOutboundRouterType <em>Message Splitter Outbound Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.MessageSplitterOutboundRouterType
	 * @generated
	 */
	public Adapter createMessageSplitterOutboundRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.MuleAdminAgentType <em>Mule Admin Agent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.MuleAdminAgentType
	 * @generated
	 */
	public Adapter createMuleAdminAgentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.MuleManagementContextType <em>Mule Management Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.MuleManagementContextType
	 * @generated
	 */
	public Adapter createMuleManagementContextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.MuleType <em>Mule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.MuleType
	 * @generated
	 */
	public Adapter createMuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.MuleUnsafeType <em>Mule Unsafe Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.MuleUnsafeType
	 * @generated
	 */
	public Adapter createMuleUnsafeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.NestedBindingType <em>Nested Binding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.NestedBindingType
	 * @generated
	 */
	public Adapter createNestedBindingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.NestedRouterCollectionType <em>Nested Router Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.NestedRouterCollectionType
	 * @generated
	 */
	public Adapter createNestedRouterCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.NoArgsCallDelegateClassType <em>No Args Call Delegate Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.NoArgsCallDelegateClassType
	 * @generated
	 */
	public Adapter createNoArgsCallDelegateClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.NoArgsCallDelegateInstanceType <em>No Args Call Delegate Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.NoArgsCallDelegateInstanceType
	 * @generated
	 */
	public Adapter createNoArgsCallDelegateInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.NoArgsCallWrapperType <em>No Args Call Wrapper Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.NoArgsCallWrapperType
	 * @generated
	 */
	public Adapter createNoArgsCallWrapperTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.OutboundEndpointType <em>Outbound Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.OutboundEndpointType
	 * @generated
	 */
	public Adapter createOutboundEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.OutboundRouterCollectionType <em>Outbound Router Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.OutboundRouterCollectionType
	 * @generated
	 */
	public Adapter createOutboundRouterCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.OutboundRouterType <em>Outbound Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.OutboundRouterType
	 * @generated
	 */
	public Adapter createOutboundRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.PasswordEncryptionStrategyType <em>Password Encryption Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.PasswordEncryptionStrategyType
	 * @generated
	 */
	public Adapter createPasswordEncryptionStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.PatternFilterType <em>Pattern Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.PatternFilterType
	 * @generated
	 */
	public Adapter createPatternFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.PooledObjectFactoryType <em>Pooled Object Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.PooledObjectFactoryType
	 * @generated
	 */
	public Adapter createPooledObjectFactoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.PoolingProfileType <em>Pooling Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.PoolingProfileType
	 * @generated
	 */
	public Adapter createPoolingProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.PropertiesContainerContextType <em>Properties Container Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.PropertiesContainerContextType
	 * @generated
	 */
	public Adapter createPropertiesContainerContextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.PrototypeObjectFactoryType <em>Prototype Object Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.PrototypeObjectFactoryType
	 * @generated
	 */
	public Adapter createPrototypeObjectFactoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.QueueProfileType <em>Queue Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.QueueProfileType
	 * @generated
	 */
	public Adapter createQueueProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.ReferenceType
	 * @generated
	 */
	public Adapter createReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.ReplyToType <em>Reply To Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.ReplyToType
	 * @generated
	 */
	public Adapter createReplyToTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.ResponseEndpointType <em>Response Endpoint Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.ResponseEndpointType
	 * @generated
	 */
	public Adapter createResponseEndpointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.ResponseRouterCollectionType <em>Response Router Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.ResponseRouterCollectionType
	 * @generated
	 */
	public Adapter createResponseRouterCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.ResponseRouterType <em>Response Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.ResponseRouterType
	 * @generated
	 */
	public Adapter createResponseRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.RetryConnectionStrategyType <em>Retry Connection Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.RetryConnectionStrategyType
	 * @generated
	 */
	public Adapter createRetryConnectionStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.RmiContainerContextType <em>Rmi Container Context Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.RmiContainerContextType
	 * @generated
	 */
	public Adapter createRmiContainerContextTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.SecretKeyEncryptionStrategyType <em>Secret Key Encryption Strategy Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.SecretKeyEncryptionStrategyType
	 * @generated
	 */
	public Adapter createSecretKeyEncryptionStrategyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.SecurityManagerType <em>Security Manager Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.SecurityManagerType
	 * @generated
	 */
	public Adapter createSecurityManagerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.SecurityProviderType <em>Security Provider Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.SecurityProviderType
	 * @generated
	 */
	public Adapter createSecurityProviderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.SedaModelType <em>Seda Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.SedaModelType
	 * @generated
	 */
	public Adapter createSedaModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.SedaServiceType <em>Seda Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.SedaServiceType
	 * @generated
	 */
	public Adapter createSedaServiceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.SelectiveConsumerRouterType <em>Selective Consumer Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.SelectiveConsumerRouterType
	 * @generated
	 */
	public Adapter createSelectiveConsumerRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.ServiceOverridesType <em>Service Overrides Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.ServiceOverridesType
	 * @generated
	 */
	public Adapter createServiceOverridesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.SingletonObjectFactoryType <em>Singleton Object Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.SingletonObjectFactoryType
	 * @generated
	 */
	public Adapter createSingletonObjectFactoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.StaticRecipientListRouterType <em>Static Recipient List Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.StaticRecipientListRouterType
	 * @generated
	 */
	public Adapter createStaticRecipientListRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.ThreadingProfileType <em>Threading Profile Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.ThreadingProfileType
	 * @generated
	 */
	public Adapter createThreadingProfileTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.TlsClientKeyStoreType <em>Tls Client Key Store Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.TlsClientKeyStoreType
	 * @generated
	 */
	public Adapter createTlsClientKeyStoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.TlsKeyStoreType <em>Tls Key Store Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.TlsKeyStoreType
	 * @generated
	 */
	public Adapter createTlsKeyStoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.TlsProtocolHandler <em>Tls Protocol Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.TlsProtocolHandler
	 * @generated
	 */
	public Adapter createTlsProtocolHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.TlsServerTrustStoreType <em>Tls Server Trust Store Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.TlsServerTrustStoreType
	 * @generated
	 */
	public Adapter createTlsServerTrustStoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.TlsTrustStoreType <em>Tls Trust Store Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.TlsTrustStoreType
	 * @generated
	 */
	public Adapter createTlsTrustStoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.TransactionManagerType <em>Transaction Manager Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.TransactionManagerType
	 * @generated
	 */
	public Adapter createTransactionManagerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.TransactionRefFactoryType <em>Transaction Ref Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.TransactionRefFactoryType
	 * @generated
	 */
	public Adapter createTransactionRefFactoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.TransactionType <em>Transaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.TransactionType
	 * @generated
	 */
	public Adapter createTransactionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.TransformerAppendStringType <em>Transformer Append String Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.TransformerAppendStringType
	 * @generated
	 */
	public Adapter createTransformerAppendStringTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.TransformerRefType <em>Transformer Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.TransformerRefType
	 * @generated
	 */
	public Adapter createTransformerRefTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.TypeFilterType <em>Type Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.TypeFilterType
	 * @generated
	 */
	public Adapter createTypeFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.UnitaryFilterType <em>Unitary Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.UnitaryFilterType
	 * @generated
	 */
	public Adapter createUnitaryFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.WildcardFilterType <em>Wildcard Filter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.WildcardFilterType
	 * @generated
	 */
	public Adapter createWildcardFilterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.core.WireTapRouterType <em>Wire Tap Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.core.WireTapRouterType
	 * @generated
	 */
	public Adapter createWireTapRouterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.BaseCollectionType <em>Base Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.BaseCollectionType
	 * @generated
	 */
	public Adapter createBaseCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.TypedCollectionType <em>Typed Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.TypedCollectionType
	 * @generated
	 */
	public Adapter createTypedCollectionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.ListOrSetType <em>List Or Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.ListOrSetType
	 * @generated
	 */
	public Adapter createListOrSetType_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.mule.ide.config.spring.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.mule.ide.config.spring.MapType
	 * @generated
	 */
	public Adapter createMapType_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CoreAdapterFactory
