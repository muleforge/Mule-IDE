package org.mule.ide.config.editor.services.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.mule.ide.config.core.CorePackage;

/**
 * @generated
 */
public class CoreDomainModelElementTester extends PropertyTester {

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String method, Object[] args,
			Object expectedValue) {
		if (false == receiver instanceof EObject) {
			return false;
		}
		EObject eObject = (EObject) receiver;
		EClass eClass = eObject.eClass();
		if (eClass == CorePackage.eINSTANCE.getAbstractAgentType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractBindingType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractCatchAllStrategyType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE
				.getAbstractComponentThreadingProfileType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractComponentType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractConnectionStrategyType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractConnectorType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractEntrypointResolverType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractExceptionStrategyType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractExtensionType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractFilterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractGlobalEndpointType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractInboundEndpointType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractInboundRouterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractModelType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractObjectFactoryType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractOutboundEndpointType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractOutboundRouterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractPoolingProfileType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractPropertyExtractorType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractQueueProfileType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractResponseEndpointType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractResponseRouterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractSecurityFilterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractSecurityManagerType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractServiceType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractStorageType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractTransactionFactoryType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractTransactionManagerType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractTransactionType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getAbstractTransformerType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getBaseContainerContextType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getBaseServiceType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCallableEntrypointResolverType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getChunkingRouterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCollectionFilterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getConnectionStrategyType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getConnectorType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getContainerContextType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE
				.getCorrelationAggregatorRouterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCorrelationRouterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCustomCatchAllStrategyType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCustomConnectionStrategyType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCustomConnectorType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCustomContainerContextType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCustomEncryptionStrategyType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCustomEntrypointResolverType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCustomExceptionStrategyType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCustomFilterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE
				.getCustomForwardingCatchAllStrategyType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCustomInboundRouterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCustomOutboundRouterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCustomPropertyExtractorType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCustomResponseRouterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCustomSecurityProviderType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCustomTransactionFactoryType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCustomTransactionManagerType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getCustomTransformerType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getDefaultComponentType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getDefaultModelType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getDefaultServiceType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getDescriptionType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getDocumentRoot()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getEncryptionSecurityFilterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getEncryptionStrategyType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getEndpointSelectorRouterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getEnvironmentPropertyType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getExceptionStrategyType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getFilteredInboundRouterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getFilteringOutboundRouterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getFilterRefType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getForwardingCatchAllStrategyType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getForwardingRouterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getGenericObjectFactoryType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getGlobalEndpointType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getIdempotentReceiverType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getInboundEndpointType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getInboundRouterCollectionType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getIocContainerContextType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getJndiConnectorType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getJndiTransactionManagerType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getListOrSetType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getLoggingCatchAllStrategyType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getMapType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE
				.getMessagePropertiesTransformerType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE
				.getMessageSplitterOutboundRouterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getMuleAdminAgentType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getMuleManagementContextType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getMuleType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getMuleUnsafeType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getNoArgsCallDelegateClassType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getNoArgsCallDelegateInstanceType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getNoArgsCallWrapperType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getOutboundEndpointType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getOutboundRouterCollectionType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getOutboundRouterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getPasswordEncryptionStrategyType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getPatternFilterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getPojoBindingType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getPojoComponentType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getPooledObjectFactoryType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getPoolingProfileType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getPropertiesContainerContextType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getPrototypeObjectFactoryType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getQueueProfileType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getReferenceType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getReplyToType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getResponseEndpointType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getResponseRouterCollectionType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getResponseRouterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getResponseTransformersType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getRetryConnectionStrategyType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getRmiContainerContextType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE
				.getSecretKeyEncryptionStrategyType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getSecurityManagerType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getSecurityProviderType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getSedaModelType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getSedaServiceType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getSelectiveConsumerRouterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getServiceOverridesType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getSingletonObjectFactoryType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getStaticRecipientListRouterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getThreadingProfileType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getTlsClientKeyStoreType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getTlsKeyStoreType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getTlsProtocolHandler()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getTlsServerTrustStoreType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getTlsTrustStoreType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getTransactionManagerType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getTransactionRefFactoryType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getTransactionType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getTransformerAppendStringType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getTransformerRefType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getTransformersType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getTypeFilterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getUnitaryFilterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getWildcardFilterType()) {
			return true;
		}
		if (eClass == CorePackage.eINSTANCE.getWireTapRouterType()) {
			return true;
		}
		return false;
	}

}
