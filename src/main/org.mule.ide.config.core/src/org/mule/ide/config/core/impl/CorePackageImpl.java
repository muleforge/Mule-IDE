/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.namespace.XMLNamespacePackage;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;

import org.mule.ide.config.core.util.CoreValidator;

import org.mule.ide.config.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CorePackageImpl extends EPackageImpl implements CorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "core.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractAgentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractBindingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractCatchAllStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractComponentThreadingProfileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConnectionStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractConnectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEntrypointResolverTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractExceptionStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractExtensionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGlobalEndpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractInboundEndpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractInboundRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractObjectFactoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractOutboundEndpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractOutboundRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPoolingProfileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPropertyExtractorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractQueueProfileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractResponseEndpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractResponseRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSecurityFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractSecurityManagerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractServiceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractStorageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTransactionFactoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTransactionManagerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTransactionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTransformerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseContainerContextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseServiceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callableEntrypointResolverTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chunkingRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collectionFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerContextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correlationAggregatorRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correlationRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customCatchAllStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customConnectionStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customConnectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customContainerContextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customEncryptionStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customEntrypointResolverTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customExceptionStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customForwardingCatchAllStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customInboundRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customOutboundRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customPropertyExtractorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customResponseRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customSecurityProviderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customTransactionFactoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customTransactionManagerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customTransformerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultComponentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultServiceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass descriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encryptionSecurityFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encryptionStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endpointSelectorRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentPropertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exceptionStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filteredInboundRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filteringOutboundRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forwardingCatchAllStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forwardingRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass genericObjectFactoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalEndpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idempotentReceiverTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inboundEndpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inboundRouterCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iocContainerContextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jndiConnectorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jndiTransactionManagerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listOrSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loggingCatchAllStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mapTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messagePropertiesTransformerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageSplitterOutboundRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass muleAdminAgentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass muleManagementContextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass muleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass muleUnsafeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedBindingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nestedRouterCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noArgsCallDelegateClassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noArgsCallDelegateInstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noArgsCallWrapperTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outboundEndpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outboundRouterCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outboundRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass passwordEncryptionStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patternFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pooledObjectFactoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poolingProfileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertiesContainerContextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prototypeObjectFactoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queueProfileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replyToTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseEndpointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseRouterCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retryConnectionStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rmiContainerContextTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secretKeyEncryptionStrategyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityManagerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityProviderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sedaModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sedaServiceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selectiveConsumerRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceOverridesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singletonObjectFactoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticRecipientListRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass threadingProfileTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlsClientKeyStoreTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlsKeyStoreTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlsProtocolHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlsServerTrustStoreTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tlsTrustStoreTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionManagerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionRefFactoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerAppendStringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformerRefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unitaryFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wildcardFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wireTapRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum createConnectorTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enableCorrelationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum exhaustedActionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum initialisationPolicyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum initialStateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum poolExhaustedActionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scopeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType actionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType createConnectorTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enableCorrelationTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exhaustedActionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType initialisationPolicyTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType initialStateTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType poolExhaustedActionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType propertyPlaceholderTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType scopeTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutableBooleanEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutableBooleanMember0EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutableBooleanMember0ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutableBooleanObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutableClassEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutableClassMember0EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutableIntEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutableIntMember0EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutableIntMember0ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutableIntObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutableLongEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutableLongMember0EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutableLongMember0ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutableLongObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutablePortNumberEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutablePortNumberMember0EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutablePortNumberMember0ObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutablePortNumberObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.mule.ide.config.core.CorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CorePackageImpl() {
		super(eNS_URI, CoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static CorePackage init() {
		if (isInited) return (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);

		// Obtain or create and register package
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new CorePackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SpringPackage.eINSTANCE.eClass();
		XMLNamespacePackage.eINSTANCE.eClass();
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		theCorePackage.loadPackage();

		// Fix loaded packages
		theCorePackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCorePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CoreValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCorePackage.freeze();

		return theCorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractAgentType() {
		if (abstractAgentTypeEClass == null) {
			abstractAgentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(0);
		}
		return abstractAgentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractAgentType_Name() {
        return (EAttribute)getAbstractAgentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractBindingType() {
		if (abstractBindingTypeEClass == null) {
			abstractBindingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(1);
		}
		return abstractBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractCatchAllStrategyType() {
		if (abstractCatchAllStrategyTypeEClass == null) {
			abstractCatchAllStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(2);
		}
		return abstractCatchAllStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractComponentThreadingProfileType() {
		if (abstractComponentThreadingProfileTypeEClass == null) {
			abstractComponentThreadingProfileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(3);
		}
		return abstractComponentThreadingProfileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConnectionStrategyType() {
		if (abstractConnectionStrategyTypeEClass == null) {
			abstractConnectionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(4);
		}
		return abstractConnectionStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConnectorType() {
		if (abstractConnectorTypeEClass == null) {
			abstractConnectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(5);
		}
		return abstractConnectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEntrypointResolverType() {
		if (abstractEntrypointResolverTypeEClass == null) {
			abstractEntrypointResolverTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(6);
		}
		return abstractEntrypointResolverTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractExceptionStrategyType() {
		if (abstractExceptionStrategyTypeEClass == null) {
			abstractExceptionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(7);
		}
		return abstractExceptionStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractExtensionType() {
		if (abstractExtensionTypeEClass == null) {
			abstractExtensionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(8);
		}
		return abstractExtensionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractFilterType() {
		if (abstractFilterTypeEClass == null) {
			abstractFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(9);
		}
		return abstractFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFilterType_Name() {
        return (EAttribute)getAbstractFilterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractFilterType_Not() {
        return (EAttribute)getAbstractFilterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractGlobalEndpointType() {
		if (abstractGlobalEndpointTypeEClass == null) {
			abstractGlobalEndpointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(10);
		}
		return abstractGlobalEndpointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractGlobalEndpointType_Name() {
        return (EAttribute)getAbstractGlobalEndpointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractInboundEndpointType() {
		if (abstractInboundEndpointTypeEClass == null) {
			abstractInboundEndpointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(11);
		}
		return abstractInboundEndpointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractInboundEndpointType_Name() {
        return (EAttribute)getAbstractInboundEndpointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractInboundRouterType() {
		if (abstractInboundRouterTypeEClass == null) {
			abstractInboundRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(12);
		}
		return abstractInboundRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractModelType() {
		if (abstractModelTypeEClass == null) {
			abstractModelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(13);
		}
		return abstractModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractModelType_AbstractExceptionStrategyGroup() {
        return (EAttribute)getAbstractModelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractModelType_AbstractExceptionStrategy() {
        return (EReference)getAbstractModelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractModelType_AbstractEntrypointResolverGroup() {
        return (EAttribute)getAbstractModelType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractModelType_AbstractEntrypointResolver() {
        return (EReference)getAbstractModelType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractModelType_AbstractServiceGroup() {
        return (EAttribute)getAbstractModelType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractModelType_AbstractService() {
        return (EReference)getAbstractModelType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractModelType_Class() {
        return (EAttribute)getAbstractModelType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractModelType_Name() {
        return (EAttribute)getAbstractModelType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractObjectFactoryType() {
		if (abstractObjectFactoryTypeEClass == null) {
			abstractObjectFactoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(14);
		}
		return abstractObjectFactoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractObjectFactoryType_Properties() {
        return (EReference)getAbstractObjectFactoryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractOutboundEndpointType() {
		if (abstractOutboundEndpointTypeEClass == null) {
			abstractOutboundEndpointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(15);
		}
		return abstractOutboundEndpointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractOutboundEndpointType_Name() {
        return (EAttribute)getAbstractOutboundEndpointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractOutboundRouterType() {
		if (abstractOutboundRouterTypeEClass == null) {
			abstractOutboundRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(16);
		}
		return abstractOutboundRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPoolingProfileType() {
		if (abstractPoolingProfileTypeEClass == null) {
			abstractPoolingProfileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(17);
		}
		return abstractPoolingProfileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractPropertyExtractorType() {
		if (abstractPropertyExtractorTypeEClass == null) {
			abstractPropertyExtractorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(18);
		}
		return abstractPropertyExtractorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractQueueProfileType() {
		if (abstractQueueProfileTypeEClass == null) {
			abstractQueueProfileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(19);
		}
		return abstractQueueProfileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractResponseEndpointType() {
		if (abstractResponseEndpointTypeEClass == null) {
			abstractResponseEndpointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(20);
		}
		return abstractResponseEndpointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractResponseEndpointType_Name() {
        return (EAttribute)getAbstractResponseEndpointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractResponseRouterType() {
		if (abstractResponseRouterTypeEClass == null) {
			abstractResponseRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(21);
		}
		return abstractResponseRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSecurityFilterType() {
		if (abstractSecurityFilterTypeEClass == null) {
			abstractSecurityFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(22);
		}
		return abstractSecurityFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSecurityManagerType() {
		if (abstractSecurityManagerTypeEClass == null) {
			abstractSecurityManagerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(23);
		}
		return abstractSecurityManagerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSecurityManagerType_Id() {
        return (EAttribute)getAbstractSecurityManagerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractSecurityManagerType_Name() {
        return (EAttribute)getAbstractSecurityManagerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractServiceType() {
		if (abstractServiceTypeEClass == null) {
			abstractServiceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(24);
		}
		return abstractServiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractServiceType_Name() {
        return (EAttribute)getAbstractServiceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractStorageType() {
		if (abstractStorageTypeEClass == null) {
			abstractStorageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(25);
		}
		return abstractStorageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTransactionFactoryType() {
		if (abstractTransactionFactoryTypeEClass == null) {
			abstractTransactionFactoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(26);
		}
		return abstractTransactionFactoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTransactionFactoryType_Name() {
        return (EAttribute)getAbstractTransactionFactoryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTransactionManagerType() {
		if (abstractTransactionManagerTypeEClass == null) {
			abstractTransactionManagerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(27);
		}
		return abstractTransactionManagerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTransactionType() {
		if (abstractTransactionTypeEClass == null) {
			abstractTransactionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(28);
		}
		return abstractTransactionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTransformerType() {
		if (abstractTransformerTypeEClass == null) {
			abstractTransformerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(29);
		}
		return abstractTransformerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTransformerType_IgnoreBadInput() {
        return (EAttribute)getAbstractTransformerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTransformerType_Name() {
        return (EAttribute)getAbstractTransformerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTransformerType_ReturnClass() {
        return (EAttribute)getAbstractTransformerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseContainerContextType() {
		if (baseContainerContextTypeEClass == null) {
			baseContainerContextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(32);
		}
		return baseContainerContextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseContainerContextType_Any() {
        return (EAttribute)getBaseContainerContextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseServiceType() {
		if (baseServiceTypeEClass == null) {
			baseServiceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(33);
		}
		return baseServiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseServiceType_AbstractObjectFactoryGroup() {
        return (EAttribute)getBaseServiceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseServiceType_AbstractObjectFactory() {
        return (EReference)getBaseServiceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseServiceType_Properties() {
        return (EReference)getBaseServiceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseServiceType_InboundRouter() {
        return (EReference)getBaseServiceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseServiceType_NestedRouter() {
        return (EReference)getBaseServiceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseServiceType_OutboundRouter() {
        return (EReference)getBaseServiceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseServiceType_ResponseRouter() {
        return (EReference)getBaseServiceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseServiceType_AbstractExceptionStrategyGroup() {
        return (EAttribute)getBaseServiceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseServiceType_AbstractExceptionStrategy() {
        return (EReference)getBaseServiceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseServiceType_Class() {
        return (EAttribute)getBaseServiceType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseServiceType_InitialState() {
        return (EAttribute)getBaseServiceType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallableEntrypointResolverType() {
		if (callableEntrypointResolverTypeEClass == null) {
			callableEntrypointResolverTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(34);
		}
		return callableEntrypointResolverTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunkingRouterType() {
		if (chunkingRouterTypeEClass == null) {
			chunkingRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(35);
		}
		return chunkingRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkingRouterType_MessageSize() {
        return (EAttribute)getChunkingRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChunkingRouterType_NumberOfMessages() {
        return (EAttribute)getChunkingRouterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCollectionFilterType() {
		if (collectionFilterTypeEClass == null) {
			collectionFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(36);
		}
		return collectionFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCollectionFilterType_AbstractFilterGroup() {
        return (EAttribute)getCollectionFilterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCollectionFilterType_AbstractFilter() {
        return (EReference)getCollectionFilterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionStrategyType() {
		if (connectionStrategyTypeEClass == null) {
			connectionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(37);
		}
		return connectionStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectorType() {
		if (connectorTypeEClass == null) {
			connectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(38);
		}
		return connectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_Property() {
        return (EReference)getConnectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_ReceiverThreadingProfile() {
        return (EReference)getConnectorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_DispatcherThreadingProfile() {
        return (EReference)getConnectorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_AbstractExceptionStrategyGroup() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_AbstractExceptionStrategy() {
        return (EReference)getConnectorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnectorType_ServiceOverrides() {
        return (EReference)getConnectorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_CreateDispatcherPerRequest() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_CreateMultipleTransactedReceivers() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_Name() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerContextType() {
		if (containerContextTypeEClass == null) {
			containerContextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(39);
		}
		return containerContextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerContextType_Any() {
        return (EAttribute)getContainerContextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerContextType_Class() {
        return (EAttribute)getContainerContextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerContextType_Name() {
        return (EAttribute)getContainerContextType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrelationAggregatorRouterType() {
		if (correlationAggregatorRouterTypeEClass == null) {
			correlationAggregatorRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(40);
		}
		return correlationAggregatorRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCorrelationAggregatorRouterType_Class() {
        return (EAttribute)getCorrelationAggregatorRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrelationRouterType() {
		if (correlationRouterTypeEClass == null) {
			correlationRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(41);
		}
		return correlationRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCorrelationRouterType_CorrelationExpression() {
        return (EAttribute)getCorrelationRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomCatchAllStrategyType() {
		if (customCatchAllStrategyTypeEClass == null) {
			customCatchAllStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(44);
		}
		return customCatchAllStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomCatchAllStrategyType_Property() {
        return (EReference)getCustomCatchAllStrategyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomCatchAllStrategyType_Class() {
        return (EAttribute)getCustomCatchAllStrategyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomConnectionStrategyType() {
		if (customConnectionStrategyTypeEClass == null) {
			customConnectionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(45);
		}
		return customConnectionStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomConnectionStrategyType_Property() {
        return (EReference)getCustomConnectionStrategyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectionStrategyType_Class() {
        return (EAttribute)getCustomConnectionStrategyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomConnectorType() {
		if (customConnectorTypeEClass == null) {
			customConnectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(46);
		}
		return customConnectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomConnectorType_Property() {
        return (EReference)getCustomConnectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomConnectorType_ReceiverThreadingProfile() {
        return (EReference)getCustomConnectorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomConnectorType_DispatcherThreadingProfile() {
        return (EReference)getCustomConnectorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_AbstractExceptionStrategyGroup() {
        return (EAttribute)getCustomConnectorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomConnectorType_AbstractExceptionStrategy() {
        return (EReference)getCustomConnectorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomConnectorType_ServiceOverrides() {
        return (EReference)getCustomConnectorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_Class() {
        return (EAttribute)getCustomConnectorType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_CreateDispatcherPerRequest() {
        return (EAttribute)getCustomConnectorType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_CreateMultipleTransactedReceivers() {
        return (EAttribute)getCustomConnectorType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_Name() {
        return (EAttribute)getCustomConnectorType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomContainerContextType() {
		if (customContainerContextTypeEClass == null) {
			customContainerContextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(47);
		}
		return customContainerContextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomContainerContextType_Class() {
        return (EAttribute)getCustomContainerContextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomContainerContextType_Name() {
        return (EAttribute)getCustomContainerContextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomEncryptionStrategyType() {
		if (customEncryptionStrategyTypeEClass == null) {
			customEncryptionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(48);
		}
		return customEncryptionStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomEncryptionStrategyType_Property() {
        return (EReference)getCustomEncryptionStrategyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomEncryptionStrategyType_StrategyRef() {
        return (EAttribute)getCustomEncryptionStrategyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomEntrypointResolverType() {
		if (customEntrypointResolverTypeEClass == null) {
			customEntrypointResolverTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(49);
		}
		return customEntrypointResolverTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomEntrypointResolverType_Property() {
        return (EReference)getCustomEntrypointResolverType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomEntrypointResolverType_Class() {
        return (EAttribute)getCustomEntrypointResolverType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomExceptionStrategyType() {
		if (customExceptionStrategyTypeEClass == null) {
			customExceptionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(50);
		}
		return customExceptionStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomExceptionStrategyType_Property() {
        return (EReference)getCustomExceptionStrategyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomExceptionStrategyType_Class() {
        return (EAttribute)getCustomExceptionStrategyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomFilterType() {
		if (customFilterTypeEClass == null) {
			customFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(51);
		}
		return customFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomFilterType_Property() {
        return (EReference)getCustomFilterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomFilterType_Class() {
        return (EAttribute)getCustomFilterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomForwardingCatchAllStrategyType() {
		if (customForwardingCatchAllStrategyTypeEClass == null) {
			customForwardingCatchAllStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(52);
		}
		return customForwardingCatchAllStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomForwardingCatchAllStrategyType_Property() {
        return (EReference)getCustomForwardingCatchAllStrategyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomForwardingCatchAllStrategyType_Class() {
        return (EAttribute)getCustomForwardingCatchAllStrategyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomInboundRouterType() {
		if (customInboundRouterTypeEClass == null) {
			customInboundRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(53);
		}
		return customInboundRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomInboundRouterType_Property() {
        return (EReference)getCustomInboundRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomInboundRouterType_AbstractInboundEndpointGroup() {
        return (EAttribute)getCustomInboundRouterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomInboundRouterType_AbstractInboundEndpoint() {
        return (EReference)getCustomInboundRouterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomInboundRouterType_Class() {
        return (EAttribute)getCustomInboundRouterType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomOutboundRouterType() {
		if (customOutboundRouterTypeEClass == null) {
			customOutboundRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(54);
		}
		return customOutboundRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomOutboundRouterType_Property() {
        return (EReference)getCustomOutboundRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomOutboundRouterType_Class() {
        return (EAttribute)getCustomOutboundRouterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomPropertyExtractorType() {
		if (customPropertyExtractorTypeEClass == null) {
			customPropertyExtractorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(55);
		}
		return customPropertyExtractorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomPropertyExtractorType_Property() {
        return (EReference)getCustomPropertyExtractorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomPropertyExtractorType_Class() {
        return (EAttribute)getCustomPropertyExtractorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomResponseRouterType() {
		if (customResponseRouterTypeEClass == null) {
			customResponseRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(56);
		}
		return customResponseRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomResponseRouterType_Property() {
        return (EReference)getCustomResponseRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomResponseRouterType_Class() {
        return (EAttribute)getCustomResponseRouterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomSecurityProviderType() {
		if (customSecurityProviderTypeEClass == null) {
			customSecurityProviderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(57);
		}
		return customSecurityProviderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomSecurityProviderType_Property() {
        return (EReference)getCustomSecurityProviderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomSecurityProviderType_ProviderRef() {
        return (EAttribute)getCustomSecurityProviderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomTransactionFactoryType() {
		if (customTransactionFactoryTypeEClass == null) {
			customTransactionFactoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(58);
		}
		return customTransactionFactoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomTransactionFactoryType_Property() {
        return (EReference)getCustomTransactionFactoryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomTransactionFactoryType_Class() {
        return (EAttribute)getCustomTransactionFactoryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomTransactionManagerType() {
		if (customTransactionManagerTypeEClass == null) {
			customTransactionManagerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(59);
		}
		return customTransactionManagerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomTransactionManagerType_Property() {
        return (EReference)getCustomTransactionManagerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomTransactionManagerType_Class() {
        return (EAttribute)getCustomTransactionManagerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomTransformerType() {
		if (customTransformerTypeEClass == null) {
			customTransformerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(60);
		}
		return customTransformerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomTransformerType_Property() {
        return (EReference)getCustomTransformerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomTransformerType_Class() {
        return (EAttribute)getCustomTransformerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultComponentType() {
		if (defaultComponentTypeEClass == null) {
			defaultComponentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(61);
		}
		return defaultComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultModelType() {
		if (defaultModelTypeEClass == null) {
			defaultModelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(62);
		}
		return defaultModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultServiceType() {
		if (defaultServiceTypeEClass == null) {
			defaultServiceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(63);
		}
		return defaultServiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionType() {
		if (descriptionTypeEClass == null) {
			descriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(64);
		}
		return descriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDescriptionType_Mixed() {
        return (EAttribute)getDescriptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(65);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractBinding() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractCatchAllStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractComponentThreadingProfile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractConnectionStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractConnector() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractEntrypointResolver() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractExceptionStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractExtension() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractGlobalEndpoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractInboundEndpoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractInboundRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractModel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractObjectFactory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractOutboundEndpoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractOutboundRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractPoolingProfile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractPropertyExtractor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractQueueProfile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractResponseEndpoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractResponseRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractSecurityFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractSecurityManager() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractService() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractStorage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractTransaction() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractTransactionFactory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractTransactionManager() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AndFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BeanPropertyExtractor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Binding() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BridgeComponent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CallableEntrypointResolver() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChainingRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Component() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ComponentThreadingProfile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CorrelationAggregatorRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CorrelationPropertyExtractor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CorrelationResequencerRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomCatchAllStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomConnectionStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomConnector() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomContainer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomEntrypointResolver() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomExceptionStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomForwardingCatchAllStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomInboundRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomOutboundRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomPropertyExtractor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomResponseRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomTransactionFactory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomTransactionManager() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DefaultConnectorExceptionStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DefaultServiceExceptionStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Description() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EchoComponent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EjbContainer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EncryptionSecurityFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Endpoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EndpointSelectorRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExceptionBasedRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExceptionTypeFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Filter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FilteringRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ForwardingCatchAllStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ForwardingRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HivemindContainer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdempotentReceiverRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdempotentSecureHashReceiverRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InboundEndpoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InboundPassThroughRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JndiContainer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListMessageSplitterRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LogComponent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LoggingCatchAllStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MapPropertyExtractor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageChunkingAggregatorRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageChunkingRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessagePropertyExtractor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessagePropertyFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Model() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Mule() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MuleUnsafe() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MulticastingRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NoArgsCallComponent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NotFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NullComponent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OutboundEndpoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OutboundPassThroughRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PassThroughComponent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PayloadPropertyExtractor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PayloadTypeFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PicoContainer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PlexusContainer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PooledObject() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PoolingProfile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Properties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PropertiesContainer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PrototypeObject() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_QueueProfile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegexFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ResponseEndpoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RetryConnectionStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RmiContainer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SecurityManager() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SedaModel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SelectiveConsumerRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Service() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SingleResponseRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SingletonObject() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StaticRecipientListRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TemplateEndpointRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Transaction() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransactionFactory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransactionManagerJboss() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransactionManagerJndi() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransactionManagerJrun() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransactionManagerResin() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransactionManagerWeblogic() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransactionManagerWebsphere() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Transformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerAppendString() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerBase64Decoder() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerBase64Encoder() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerByteArrayToHexString() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerByteArrayToObject() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerByteArrayToSerializable() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerByteArrayToString() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerDecrypt() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerEncrypt() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerGzipCompress() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerGzipUncompress() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerHexStingToByteArray() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerMessageProperties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerNoAction() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerObjectToByteArray() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerObjectToString() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerSerializableToByteArray() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerStringToByteArray() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerUcDecoder() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerUcEncoder() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerUuDecoder() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerUuEncoder() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerXmlEntityDecoder() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TransformerXmlEntityEncoder() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WildcardFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WireTapRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncryptionSecurityFilterType() {
		if (encryptionSecurityFilterTypeEClass == null) {
			encryptionSecurityFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(68);
		}
		return encryptionSecurityFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncryptionSecurityFilterType_StrategyRef() {
        return (EAttribute)getEncryptionSecurityFilterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncryptionStrategyType() {
		if (encryptionStrategyTypeEClass == null) {
			encryptionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(69);
		}
		return encryptionStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEncryptionStrategyType_Name() {
        return (EAttribute)getEncryptionStrategyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndpointSelectorRouterType() {
		if (endpointSelectorRouterTypeEClass == null) {
			endpointSelectorRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(70);
		}
		return endpointSelectorRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndpointSelectorRouterType_SelectorProperty() {
        return (EAttribute)getEndpointSelectorRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvironmentPropertyType() {
		if (environmentPropertyTypeEClass == null) {
			environmentPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(71);
		}
		return environmentPropertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentPropertyType_Name() {
        return (EAttribute)getEnvironmentPropertyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvironmentPropertyType_Value() {
        return (EAttribute)getEnvironmentPropertyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExceptionStrategyType() {
		if (exceptionStrategyTypeEClass == null) {
			exceptionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(72);
		}
		return exceptionStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExceptionStrategyType_AbstractOutboundEndpointGroup() {
        return (EAttribute)getExceptionStrategyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExceptionStrategyType_AbstractOutboundEndpoint() {
        return (EReference)getExceptionStrategyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilteredInboundRouterType() {
		if (filteredInboundRouterTypeEClass == null) {
			filteredInboundRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(75);
		}
		return filteredInboundRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilteredInboundRouterType_AbstractFilterGroup() {
        return (EAttribute)getFilteredInboundRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilteredInboundRouterType_AbstractFilter() {
        return (EReference)getFilteredInboundRouterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilteredInboundRouterType_AbstractPropertyExtractorGroup() {
        return (EAttribute)getFilteredInboundRouterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilteredInboundRouterType_AbstractPropertyExtractor() {
        return (EReference)getFilteredInboundRouterType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilteredInboundRouterType_CustomPropertyExtractor() {
        return (EReference)getFilteredInboundRouterType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilteringOutboundRouterType() {
		if (filteringOutboundRouterTypeEClass == null) {
			filteringOutboundRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(76);
		}
		return filteringOutboundRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilteringOutboundRouterType_AbstractFilterGroup() {
        return (EAttribute)getFilteringOutboundRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilteringOutboundRouterType_AbstractFilter() {
        return (EReference)getFilteringOutboundRouterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilteringOutboundRouterType_AbstractTransformerGroup() {
        return (EAttribute)getFilteringOutboundRouterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFilteringOutboundRouterType_AbstractTransformer() {
        return (EReference)getFilteringOutboundRouterType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilteringOutboundRouterType_TransformerRefs() {
        return (EAttribute)getFilteringOutboundRouterType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilterRefType() {
		if (filterRefTypeEClass == null) {
			filterRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(77);
		}
		return filterRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFilterRefType_Ref() {
        return (EAttribute)getFilterRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForwardingCatchAllStrategyType() {
		if (forwardingCatchAllStrategyTypeEClass == null) {
			forwardingCatchAllStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(78);
		}
		return forwardingCatchAllStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForwardingCatchAllStrategyType_AbstractOutboundEndpointGroup() {
        return (EAttribute)getForwardingCatchAllStrategyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForwardingCatchAllStrategyType_AbstractOutboundEndpoint() {
        return (EReference)getForwardingCatchAllStrategyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForwardingRouterType() {
		if (forwardingRouterTypeEClass == null) {
			forwardingRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(79);
		}
		return forwardingRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getForwardingRouterType_AbstractInboundEndpointGroup() {
        return (EAttribute)getForwardingRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForwardingRouterType_AbstractInboundEndpoint() {
        return (EReference)getForwardingRouterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGenericObjectFactoryType() {
		if (genericObjectFactoryTypeEClass == null) {
			genericObjectFactoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(80);
		}
		return genericObjectFactoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericObjectFactoryType_AbstractPoolingProfileGroup() {
        return (EAttribute)getGenericObjectFactoryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericObjectFactoryType_AbstractPoolingProfile() {
        return (EReference)getGenericObjectFactoryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericObjectFactoryType_Class() {
        return (EAttribute)getGenericObjectFactoryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericObjectFactoryType_FactoryRef() {
        return (EAttribute)getGenericObjectFactoryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericObjectFactoryType_InstanceRef() {
        return (EAttribute)getGenericObjectFactoryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericObjectFactoryType_Scope() {
        return (EAttribute)getGenericObjectFactoryType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalEndpointType() {
		if (globalEndpointTypeEClass == null) {
			globalEndpointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(81);
		}
		return globalEndpointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_Group() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_AbstractTransformerGroup() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_AbstractTransformer() {
        return (EReference)getGlobalEndpointType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_AbstractTransactionGroup() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_AbstractTransaction() {
        return (EReference)getGlobalEndpointType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_AbstractFilterGroup() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_AbstractFilter() {
        return (EReference)getGlobalEndpointType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_AbstractSecurityFilterGroup() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_AbstractSecurityFilter() {
        return (EReference)getGlobalEndpointType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_AbstractConnectionStrategyGroup() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_AbstractConnectionStrategy() {
        return (EReference)getGlobalEndpointType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_Properties() {
        return (EReference)getGlobalEndpointType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_Address() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_ConnectorRef() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_CreateConnector() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_Encoding() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_Ref() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_RemoteSync() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_RemoteSyncTimeout() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_ResponseTransformerRefs() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_Synchronous() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_TransformerRefs() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdempotentReceiverType() {
		if (idempotentReceiverTypeEClass == null) {
			idempotentReceiverTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(82);
		}
		return idempotentReceiverTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdempotentReceiverType_AbstractStorageGroup() {
        return (EAttribute)getIdempotentReceiverType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdempotentReceiverType_AbstractStorage() {
        return (EReference)getIdempotentReceiverType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInboundEndpointType() {
		if (inboundEndpointTypeEClass == null) {
			inboundEndpointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(83);
		}
		return inboundEndpointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_Group() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_AbstractTransformerGroup() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_AbstractTransformer() {
        return (EReference)getInboundEndpointType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_AbstractTransactionGroup() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_AbstractTransaction() {
        return (EReference)getInboundEndpointType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_AbstractFilterGroup() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_AbstractFilter() {
        return (EReference)getInboundEndpointType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_AbstractSecurityFilterGroup() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_AbstractSecurityFilter() {
        return (EReference)getInboundEndpointType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_AbstractConnectionStrategyGroup() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_AbstractConnectionStrategy() {
        return (EReference)getInboundEndpointType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_Properties() {
        return (EReference)getInboundEndpointType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_Address() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_ConnectorRef() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_CreateConnector() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_Encoding() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_Ref() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_RemoteSync() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_RemoteSyncTimeout() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_ResponseTransformerRefs() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_Synchronous() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_TransformerRefs() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInboundRouterCollectionType() {
		if (inboundRouterCollectionTypeEClass == null) {
			inboundRouterCollectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(84);
		}
		return inboundRouterCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundRouterCollectionType_AbstractCatchAllStrategyGroup() {
        return (EAttribute)getInboundRouterCollectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundRouterCollectionType_AbstractCatchAllStrategy() {
        return (EReference)getInboundRouterCollectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundRouterCollectionType_AbstractInboundEndpointGroup() {
        return (EAttribute)getInboundRouterCollectionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundRouterCollectionType_AbstractInboundEndpoint() {
        return (EReference)getInboundRouterCollectionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundRouterCollectionType_AbstractInboundRouterGroup() {
        return (EAttribute)getInboundRouterCollectionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundRouterCollectionType_AbstractInboundRouter() {
        return (EReference)getInboundRouterCollectionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundRouterCollectionType_MatchAll() {
        return (EAttribute)getInboundRouterCollectionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocContainerContextType() {
		if (iocContainerContextTypeEClass == null) {
			iocContainerContextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(89);
		}
		return iocContainerContextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIocContainerContextType_ConfigLocation() {
        return (EAttribute)getIocContainerContextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIocContainerContextType_ConfigurationText() {
        return (EAttribute)getIocContainerContextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJndiConnectorType() {
		if (jndiConnectorTypeEClass == null) {
			jndiConnectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(90);
		}
		return jndiConnectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJndiConnectorType_JndiProviderProperties() {
        return (EReference)getJndiConnectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJndiConnectorType_JndiContextRef() {
        return (EAttribute)getJndiConnectorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJndiConnectorType_JndiInitialFactory() {
        return (EAttribute)getJndiConnectorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJndiConnectorType_JndiProviderUrl() {
        return (EAttribute)getJndiConnectorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJndiConnectorType_JndiUrlPkgPrefixes() {
        return (EAttribute)getJndiConnectorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJndiTransactionManagerType() {
		if (jndiTransactionManagerTypeEClass == null) {
			jndiTransactionManagerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(91);
		}
		return jndiTransactionManagerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJndiTransactionManagerType_Environment() {
        return (EReference)getJndiTransactionManagerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOrSetType() {
		if (listOrSetTypeEClass == null) {
			listOrSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(92);
		}
		return listOrSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoggingCatchAllStrategyType() {
		if (loggingCatchAllStrategyTypeEClass == null) {
			loggingCatchAllStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(93);
		}
		return loggingCatchAllStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapType() {
		if (mapTypeEClass == null) {
			mapTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(94);
		}
		return mapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessagePropertiesTransformerType() {
		if (messagePropertiesTransformerTypeEClass == null) {
			messagePropertiesTransformerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(95);
		}
		return messagePropertiesTransformerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessagePropertiesTransformerType_DeleteProperties() {
        return (EReference)getMessagePropertiesTransformerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessagePropertiesTransformerType_AddProperties() {
        return (EReference)getMessagePropertiesTransformerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessagePropertiesTransformerType_Overwrite() {
        return (EAttribute)getMessagePropertiesTransformerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageSplitterOutboundRouterType() {
		if (messageSplitterOutboundRouterTypeEClass == null) {
			messageSplitterOutboundRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(96);
		}
		return messageSplitterOutboundRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageSplitterOutboundRouterType_HonorSynchronicity() {
        return (EAttribute)getMessageSplitterOutboundRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMuleAdminAgentType() {
		if (muleAdminAgentTypeEClass == null) {
			muleAdminAgentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(97);
		}
		return muleAdminAgentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleAdminAgentType_Property() {
        return (EReference)getMuleAdminAgentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleAdminAgentType_ServerUri() {
        return (EAttribute)getMuleAdminAgentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMuleManagementContextType() {
		if (muleManagementContextTypeEClass == null) {
			muleManagementContextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(98);
		}
		return muleManagementContextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleManagementContextType_DefaultThreadingProfile() {
        return (EReference)getMuleManagementContextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleManagementContextType_DefaultDispatcherThreadingProfile() {
        return (EReference)getMuleManagementContextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleManagementContextType_DefaultReceiverThreadingProfile() {
        return (EReference)getMuleManagementContextType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleManagementContextType_DefaultComponentThreadingProfile() {
        return (EReference)getMuleManagementContextType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleManagementContextType_AbstractStorageGroup() {
        return (EAttribute)getMuleManagementContextType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleManagementContextType_AbstractStorage() {
        return (EReference)getMuleManagementContextType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleManagementContextType_DefaultConnectionStrategy() {
        return (EReference)getMuleManagementContextType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleManagementContextType_ClusterId() {
        return (EAttribute)getMuleManagementContextType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleManagementContextType_DefaultEncoding() {
        return (EAttribute)getMuleManagementContextType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleManagementContextType_DefaultRemoteSync() {
        return (EAttribute)getMuleManagementContextType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleManagementContextType_DefaultSynchronousEndpoints() {
        return (EAttribute)getMuleManagementContextType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleManagementContextType_DefaultSynchronousEventTimeout() {
        return (EAttribute)getMuleManagementContextType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleManagementContextType_DefaultTransactionTimeout() {
        return (EAttribute)getMuleManagementContextType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleManagementContextType_DomainId() {
        return (EAttribute)getMuleManagementContextType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleManagementContextType_ServerId() {
        return (EAttribute)getMuleManagementContextType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleManagementContextType_WorkingDirectory() {
        return (EAttribute)getMuleManagementContextType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMuleType() {
		if (muleTypeEClass == null) {
			muleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(99);
		}
		return muleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_Group() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_EnvironmentProperty() {
        return (EReference)getMuleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_AdminAgent() {
        return (EReference)getMuleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_Configuration() {
        return (EReference)getMuleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_Description() {
        return (EReference)getMuleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_AbstractExtensionGroup() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_AbstractExtension() {
        return (EReference)getMuleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_AbstractSecurityManagerGroup() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_AbstractSecurityManager() {
        return (EReference)getMuleType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_AbstractTransactionManagerGroup() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_AbstractTransactionManager() {
        return (EReference)getMuleType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_AbstractTransactionFactoryGroup() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_AbstractTransactionFactory() {
        return (EReference)getMuleType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_AbstractConnectorGroup() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_AbstractConnector() {
        return (EReference)getMuleType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_AbstractGlobalEndpointGroup() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_AbstractGlobalEndpoint() {
        return (EReference)getMuleType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_AbstractTransformerGroup() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_AbstractTransformer() {
        return (EReference)getMuleType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_AbstractFilterGroup() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_AbstractFilter() {
        return (EReference)getMuleType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_AbstractModelGroup() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_AbstractModel() {
        return (EReference)getMuleType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_Beans() {
        return (EReference)getMuleType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_Bean() {
        return (EReference)getMuleType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_Name() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMuleUnsafeType() {
		if (muleUnsafeTypeEClass == null) {
			muleUnsafeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(100);
		}
		return muleUnsafeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_Group() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_EnvironmentProperty() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_AdminAgent() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_Configuration() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_Description() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_AbstractExtensionGroup() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_AbstractExtension() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_AbstractSecurityManagerGroup() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_AbstractSecurityManager() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_AbstractTransactionManagerGroup() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_AbstractTransactionManager() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_AbstractTransactionFactoryGroup() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_AbstractTransactionFactory() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_AbstractConnectorGroup() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_AbstractConnector() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_AbstractGlobalEndpointGroup() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_AbstractGlobalEndpoint() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_AbstractTransformerGroup() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_AbstractTransformer() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_AbstractFilterGroup() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_AbstractFilter() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_AbstractModelGroup() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_AbstractModel() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_Any() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_Name() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedBindingType() {
		if (nestedBindingTypeEClass == null) {
			nestedBindingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(101);
		}
		return nestedBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNestedBindingType_AbstractOutboundEndpointGroup() {
        return (EAttribute)getNestedBindingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedBindingType_AbstractOutboundEndpoint() {
        return (EReference)getNestedBindingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNestedBindingType_Interface() {
        return (EAttribute)getNestedBindingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNestedBindingType_Method() {
        return (EAttribute)getNestedBindingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNestedRouterCollectionType() {
		if (nestedRouterCollectionTypeEClass == null) {
			nestedRouterCollectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(102);
		}
		return nestedRouterCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNestedRouterCollectionType_AbstractBindingGroup() {
        return (EAttribute)getNestedRouterCollectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNestedRouterCollectionType_AbstractBinding() {
        return (EReference)getNestedRouterCollectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoArgsCallDelegateClassType() {
		if (noArgsCallDelegateClassTypeEClass == null) {
			noArgsCallDelegateClassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(103);
		}
		return noArgsCallDelegateClassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoArgsCallDelegateClassType_DelegateClass() {
        return (EAttribute)getNoArgsCallDelegateClassType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoArgsCallDelegateClassType_DelegateMethod() {
        return (EAttribute)getNoArgsCallDelegateClassType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoArgsCallDelegateInstanceType() {
		if (noArgsCallDelegateInstanceTypeEClass == null) {
			noArgsCallDelegateInstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(104);
		}
		return noArgsCallDelegateInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoArgsCallDelegateInstanceType_DelegateInstanceRef() {
        return (EAttribute)getNoArgsCallDelegateInstanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoArgsCallDelegateInstanceType_DelegateMethod() {
        return (EAttribute)getNoArgsCallDelegateInstanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoArgsCallWrapperType() {
		if (noArgsCallWrapperTypeEClass == null) {
			noArgsCallWrapperTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(105);
		}
		return noArgsCallWrapperTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoArgsCallWrapperType_DelegateClass() {
        return (EReference)getNoArgsCallWrapperType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoArgsCallWrapperType_DelegateInstance() {
        return (EReference)getNoArgsCallWrapperType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutboundEndpointType() {
		if (outboundEndpointTypeEClass == null) {
			outboundEndpointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(106);
		}
		return outboundEndpointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_Group() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_AbstractTransformerGroup() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_AbstractTransformer() {
        return (EReference)getOutboundEndpointType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_AbstractTransactionGroup() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_AbstractTransaction() {
        return (EReference)getOutboundEndpointType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_AbstractFilterGroup() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_AbstractFilter() {
        return (EReference)getOutboundEndpointType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_AbstractSecurityFilterGroup() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_AbstractSecurityFilter() {
        return (EReference)getOutboundEndpointType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_AbstractConnectionStrategyGroup() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_AbstractConnectionStrategy() {
        return (EReference)getOutboundEndpointType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_Properties() {
        return (EReference)getOutboundEndpointType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_Address() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_ConnectorRef() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_CreateConnector() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_Encoding() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_Ref() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_RemoteSync() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_RemoteSyncTimeout() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_ResponseTransformerRefs() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_Synchronous() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_TransformerRefs() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutboundRouterCollectionType() {
		if (outboundRouterCollectionTypeEClass == null) {
			outboundRouterCollectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(107);
		}
		return outboundRouterCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundRouterCollectionType_AbstractCatchAllStrategyGroup() {
        return (EAttribute)getOutboundRouterCollectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundRouterCollectionType_AbstractCatchAllStrategy() {
        return (EReference)getOutboundRouterCollectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundRouterCollectionType_AbstractOutboundRouterGroup() {
        return (EAttribute)getOutboundRouterCollectionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundRouterCollectionType_AbstractOutboundRouter() {
        return (EReference)getOutboundRouterCollectionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundRouterCollectionType_MatchAll() {
        return (EAttribute)getOutboundRouterCollectionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutboundRouterType() {
		if (outboundRouterTypeEClass == null) {
			outboundRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(108);
		}
		return outboundRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundRouterType_AbstractOutboundEndpointGroup() {
        return (EAttribute)getOutboundRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundRouterType_AbstractOutboundEndpoint() {
        return (EReference)getOutboundRouterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundRouterType_ReplyTo() {
        return (EReference)getOutboundRouterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundRouterType_AbstractTransactionGroup() {
        return (EAttribute)getOutboundRouterType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundRouterType_AbstractTransaction() {
        return (EReference)getOutboundRouterType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundRouterType_AbstractPropertyExtractorGroup() {
        return (EAttribute)getOutboundRouterType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundRouterType_AbstractPropertyExtractor() {
        return (EReference)getOutboundRouterType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundRouterType_CustomPropertyExtractor() {
        return (EReference)getOutboundRouterType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundRouterType_EnableCorrelation() {
        return (EAttribute)getOutboundRouterType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPasswordEncryptionStrategyType() {
		if (passwordEncryptionStrategyTypeEClass == null) {
			passwordEncryptionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(109);
		}
		return passwordEncryptionStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPasswordEncryptionStrategyType_IterationCount() {
        return (EAttribute)getPasswordEncryptionStrategyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPasswordEncryptionStrategyType_Password() {
        return (EAttribute)getPasswordEncryptionStrategyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPasswordEncryptionStrategyType_Salt() {
        return (EAttribute)getPasswordEncryptionStrategyType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatternFilterType() {
		if (patternFilterTypeEClass == null) {
			patternFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(110);
		}
		return patternFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatternFilterType_Pattern() {
        return (EAttribute)getPatternFilterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPooledObjectFactoryType() {
		if (pooledObjectFactoryTypeEClass == null) {
			pooledObjectFactoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(111);
		}
		return pooledObjectFactoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPooledObjectFactoryType_AbstractPoolingProfileGroup() {
        return (EAttribute)getPooledObjectFactoryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPooledObjectFactoryType_AbstractPoolingProfile() {
        return (EReference)getPooledObjectFactoryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPooledObjectFactoryType_Class() {
        return (EAttribute)getPooledObjectFactoryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPoolingProfileType() {
		if (poolingProfileTypeEClass == null) {
			poolingProfileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(114);
		}
		return poolingProfileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolingProfileType_ExhaustedAction() {
        return (EAttribute)getPoolingProfileType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolingProfileType_InitialisationPolicy() {
        return (EAttribute)getPoolingProfileType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolingProfileType_MaxActive() {
        return (EAttribute)getPoolingProfileType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolingProfileType_MaxIdle() {
        return (EAttribute)getPoolingProfileType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPoolingProfileType_MaxWait() {
        return (EAttribute)getPoolingProfileType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertiesContainerContextType() {
		if (propertiesContainerContextTypeEClass == null) {
			propertiesContainerContextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(115);
		}
		return propertiesContainerContextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesContainerContextType_Any() {
        return (EAttribute)getPropertiesContainerContextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesContainerContextType_EnableTemplates() {
        return (EAttribute)getPropertiesContainerContextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesContainerContextType_IncludeSystemProperties() {
        return (EAttribute)getPropertiesContainerContextType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertiesContainerContextType_Name() {
        return (EAttribute)getPropertiesContainerContextType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrototypeObjectFactoryType() {
		if (prototypeObjectFactoryTypeEClass == null) {
			prototypeObjectFactoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(117);
		}
		return prototypeObjectFactoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrototypeObjectFactoryType_Class() {
        return (EAttribute)getPrototypeObjectFactoryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueueProfileType() {
		if (queueProfileTypeEClass == null) {
			queueProfileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(118);
		}
		return queueProfileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueueProfileType_MaxOutstandingMessages() {
        return (EAttribute)getQueueProfileType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueueProfileType_Persistent() {
        return (EAttribute)getQueueProfileType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceType() {
		if (referenceTypeEClass == null) {
			referenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(119);
		}
		return referenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_Ref() {
        return (EAttribute)getReferenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplyToType() {
		if (replyToTypeEClass == null) {
			replyToTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(120);
		}
		return replyToTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplyToType_Address() {
        return (EAttribute)getReplyToType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseEndpointType() {
		if (responseEndpointTypeEClass == null) {
			responseEndpointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(121);
		}
		return responseEndpointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseEndpointType_Group() {
        return (EAttribute)getResponseEndpointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseEndpointType_AbstractTransformerGroup() {
        return (EAttribute)getResponseEndpointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseEndpointType_AbstractTransformer() {
        return (EReference)getResponseEndpointType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseEndpointType_AbstractTransactionGroup() {
        return (EAttribute)getResponseEndpointType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseEndpointType_AbstractTransaction() {
        return (EReference)getResponseEndpointType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseEndpointType_AbstractFilterGroup() {
        return (EAttribute)getResponseEndpointType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseEndpointType_AbstractFilter() {
        return (EReference)getResponseEndpointType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseEndpointType_AbstractSecurityFilterGroup() {
        return (EAttribute)getResponseEndpointType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseEndpointType_AbstractSecurityFilter() {
        return (EReference)getResponseEndpointType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseEndpointType_AbstractConnectionStrategyGroup() {
        return (EAttribute)getResponseEndpointType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseEndpointType_AbstractConnectionStrategy() {
        return (EReference)getResponseEndpointType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseEndpointType_Properties() {
        return (EReference)getResponseEndpointType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseEndpointType_Address() {
        return (EAttribute)getResponseEndpointType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseEndpointType_ConnectorRef() {
        return (EAttribute)getResponseEndpointType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseEndpointType_CreateConnector() {
        return (EAttribute)getResponseEndpointType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseEndpointType_Encoding() {
        return (EAttribute)getResponseEndpointType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseEndpointType_Ref() {
        return (EAttribute)getResponseEndpointType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseEndpointType_RemoteSync() {
        return (EAttribute)getResponseEndpointType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseEndpointType_RemoteSyncTimeout() {
        return (EAttribute)getResponseEndpointType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseEndpointType_ResponseTransformerRefs() {
        return (EAttribute)getResponseEndpointType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseEndpointType_Synchronous() {
        return (EAttribute)getResponseEndpointType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseEndpointType_TransformerRefs() {
        return (EAttribute)getResponseEndpointType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseRouterCollectionType() {
		if (responseRouterCollectionTypeEClass == null) {
			responseRouterCollectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(122);
		}
		return responseRouterCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseRouterCollectionType_AbstractResponseEndpointGroup() {
        return (EAttribute)getResponseRouterCollectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseRouterCollectionType_AbstractResponseEndpoint() {
        return (EReference)getResponseRouterCollectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseRouterCollectionType_AbstractResponseRouterGroup() {
        return (EAttribute)getResponseRouterCollectionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseRouterCollectionType_AbstractResponseRouter() {
        return (EReference)getResponseRouterCollectionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseRouterCollectionType_AbstractTransformerGroup() {
        return (EAttribute)getResponseRouterCollectionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseRouterCollectionType_AbstractTransformer() {
        return (EReference)getResponseRouterCollectionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseRouterCollectionType_Timeout() {
        return (EAttribute)getResponseRouterCollectionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseRouterCollectionType_TransformerRef() {
        return (EAttribute)getResponseRouterCollectionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseRouterType() {
		if (responseRouterTypeEClass == null) {
			responseRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(123);
		}
		return responseRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseRouterType_AbstractResponseEndpointGroup() {
        return (EAttribute)getResponseRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseRouterType_AbstractResponseEndpoint() {
        return (EReference)getResponseRouterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseRouterType_AbstractPropertyExtractorGroup() {
        return (EAttribute)getResponseRouterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseRouterType_AbstractPropertyExtractor() {
        return (EReference)getResponseRouterType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseRouterType_CustomPropertyExtractor() {
        return (EReference)getResponseRouterType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRetryConnectionStrategyType() {
		if (retryConnectionStrategyTypeEClass == null) {
			retryConnectionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(124);
		}
		return retryConnectionStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetryConnectionStrategyType_RetryCount() {
        return (EAttribute)getRetryConnectionStrategyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetryConnectionStrategyType_RetryFrequency() {
        return (EAttribute)getRetryConnectionStrategyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRmiContainerContextType() {
		if (rmiContainerContextTypeEClass == null) {
			rmiContainerContextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(125);
		}
		return rmiContainerContextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRmiContainerContextType_Name() {
        return (EAttribute)getRmiContainerContextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRmiContainerContextType_SecurityManager() {
        return (EAttribute)getRmiContainerContextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRmiContainerContextType_SecurityPolicy() {
        return (EAttribute)getRmiContainerContextType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecretKeyEncryptionStrategyType() {
		if (secretKeyEncryptionStrategyTypeEClass == null) {
			secretKeyEncryptionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(128);
		}
		return secretKeyEncryptionStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecretKeyEncryptionStrategyType_Key() {
        return (EAttribute)getSecretKeyEncryptionStrategyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecretKeyEncryptionStrategyType_KeyFactoryRef() {
        return (EAttribute)getSecretKeyEncryptionStrategyType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityManagerType() {
		if (securityManagerTypeEClass == null) {
			securityManagerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(129);
		}
		return securityManagerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityManagerType_CustomSecurityProvider() {
        return (EReference)getSecurityManagerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityManagerType_CustomEncryptionStrategy() {
        return (EReference)getSecurityManagerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityManagerType_SecretKeyEncryptionStrategy() {
        return (EReference)getSecurityManagerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSecurityManagerType_PasswordEncryptionStrategy() {
        return (EReference)getSecurityManagerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityProviderType() {
		if (securityProviderTypeEClass == null) {
			securityProviderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(130);
		}
		return securityProviderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityProviderType_Name() {
        return (EAttribute)getSecurityProviderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSedaModelType() {
		if (sedaModelTypeEClass == null) {
			sedaModelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(131);
		}
		return sedaModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSedaModelType_AbstractQueueProfileGroup() {
        return (EAttribute)getSedaModelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSedaModelType_AbstractQueueProfile() {
        return (EReference)getSedaModelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSedaModelType_Inherit() {
        return (EAttribute)getSedaModelType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSedaServiceType() {
		if (sedaServiceTypeEClass == null) {
			sedaServiceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(132);
		}
		return sedaServiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSedaServiceType_AbstractComponentThreadingProfileGroup() {
        return (EAttribute)getSedaServiceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSedaServiceType_AbstractComponentThreadingProfile() {
        return (EReference)getSedaServiceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSedaServiceType_AbstractQueueProfileGroup() {
        return (EAttribute)getSedaServiceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSedaServiceType_AbstractQueueProfile() {
        return (EReference)getSedaServiceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSedaServiceType_QueueTimeout() {
        return (EAttribute)getSedaServiceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelectiveConsumerRouterType() {
		if (selectiveConsumerRouterTypeEClass == null) {
			selectiveConsumerRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(133);
		}
		return selectiveConsumerRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectiveConsumerRouterType_AbstractTransformerGroup() {
        return (EAttribute)getSelectiveConsumerRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelectiveConsumerRouterType_AbstractTransformer() {
        return (EReference)getSelectiveConsumerRouterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectiveConsumerRouterType_TransformerFirst() {
        return (EAttribute)getSelectiveConsumerRouterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectiveConsumerRouterType_TransformerRefs() {
        return (EAttribute)getSelectiveConsumerRouterType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceOverridesType() {
		if (serviceOverridesTypeEClass == null) {
			serviceOverridesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(134);
		}
		return serviceOverridesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceOverridesType_DispatcherFactory() {
        return (EAttribute)getServiceOverridesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceOverridesType_EndpointBuilder() {
        return (EAttribute)getServiceOverridesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceOverridesType_InboundTransformer() {
        return (EAttribute)getServiceOverridesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceOverridesType_MessageAdapter() {
        return (EAttribute)getServiceOverridesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceOverridesType_MessageReceiver() {
        return (EAttribute)getServiceOverridesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceOverridesType_OutboundTransformer() {
        return (EAttribute)getServiceOverridesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceOverridesType_ResponseTransformer() {
        return (EAttribute)getServiceOverridesType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceOverridesType_ServiceFinder() {
        return (EAttribute)getServiceOverridesType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceOverridesType_StreamMessageAdapter() {
        return (EAttribute)getServiceOverridesType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceOverridesType_TransactedMessageReceiver() {
        return (EAttribute)getServiceOverridesType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingletonObjectFactoryType() {
		if (singletonObjectFactoryTypeEClass == null) {
			singletonObjectFactoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(135);
		}
		return singletonObjectFactoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingletonObjectFactoryType_Class() {
        return (EAttribute)getSingletonObjectFactoryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSingletonObjectFactoryType_InstanceRef() {
        return (EAttribute)getSingletonObjectFactoryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticRecipientListRouterType() {
		if (staticRecipientListRouterTypeEClass == null) {
			staticRecipientListRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(136);
		}
		return staticRecipientListRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticRecipientListRouterType_RecipientsDelimiter() {
        return (EAttribute)getStaticRecipientListRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticRecipientListRouterType_RecipientsProperty() {
        return (EAttribute)getStaticRecipientListRouterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreadingProfileType() {
		if (threadingProfileTypeEClass == null) {
			threadingProfileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(155);
		}
		return threadingProfileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadingProfileType_DoThreading() {
        return (EAttribute)getThreadingProfileType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadingProfileType_MaxBufferSize() {
        return (EAttribute)getThreadingProfileType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadingProfileType_MaxThreadsActive() {
        return (EAttribute)getThreadingProfileType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadingProfileType_MaxThreadsIdle() {
        return (EAttribute)getThreadingProfileType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadingProfileType_Name() {
        return (EAttribute)getThreadingProfileType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadingProfileType_PoolExhaustedAction() {
        return (EAttribute)getThreadingProfileType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadingProfileType_ThreadTTL() {
        return (EAttribute)getThreadingProfileType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreadingProfileType_ThreadWaitTimeout() {
        return (EAttribute)getThreadingProfileType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTlsClientKeyStoreType() {
		if (tlsClientKeyStoreTypeEClass == null) {
			tlsClientKeyStoreTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(156);
		}
		return tlsClientKeyStoreTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTlsClientKeyStoreType_ClientKeyStore() {
        return (EAttribute)getTlsClientKeyStoreType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTlsClientKeyStoreType_ClientKeyStorePassword() {
        return (EAttribute)getTlsClientKeyStoreType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTlsClientKeyStoreType_ClientKeyStoreType() {
        return (EAttribute)getTlsClientKeyStoreType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTlsKeyStoreType() {
		if (tlsKeyStoreTypeEClass == null) {
			tlsKeyStoreTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(157);
		}
		return tlsKeyStoreTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTlsKeyStoreType_KeyManagerAlgorithm() {
        return (EAttribute)getTlsKeyStoreType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTlsKeyStoreType_KeyPassword() {
        return (EAttribute)getTlsKeyStoreType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTlsKeyStoreType_KeyStore() {
        return (EAttribute)getTlsKeyStoreType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTlsKeyStoreType_KeyStorePassword() {
        return (EAttribute)getTlsKeyStoreType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTlsKeyStoreType_KeyStoreType() {
        return (EAttribute)getTlsKeyStoreType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTlsProtocolHandler() {
		if (tlsProtocolHandlerEClass == null) {
			tlsProtocolHandlerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(158);
		}
		return tlsProtocolHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTlsProtocolHandler_ProtocolHandler() {
        return (EAttribute)getTlsProtocolHandler().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTlsServerTrustStoreType() {
		if (tlsServerTrustStoreTypeEClass == null) {
			tlsServerTrustStoreTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(159);
		}
		return tlsServerTrustStoreTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTlsServerTrustStoreType_ExplicitTrustStoreOnly() {
        return (EAttribute)getTlsServerTrustStoreType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTlsServerTrustStoreType_RequireClientAuthentication() {
        return (EAttribute)getTlsServerTrustStoreType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTlsServerTrustStoreType_TrustManagerAlgorithm() {
        return (EAttribute)getTlsServerTrustStoreType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTlsServerTrustStoreType_TrustManagerFactory() {
        return (EAttribute)getTlsServerTrustStoreType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTlsServerTrustStoreType_TrustStoreType() {
        return (EAttribute)getTlsServerTrustStoreType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTlsTrustStoreType() {
		if (tlsTrustStoreTypeEClass == null) {
			tlsTrustStoreTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(160);
		}
		return tlsTrustStoreTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTlsTrustStoreType_TrustStore() {
        return (EAttribute)getTlsTrustStoreType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTlsTrustStoreType_TrustStorePassword() {
        return (EAttribute)getTlsTrustStoreType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactionManagerType() {
		if (transactionManagerTypeEClass == null) {
			transactionManagerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(161);
		}
		return transactionManagerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionManagerType_Name() {
        return (EAttribute)getTransactionManagerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactionRefFactoryType() {
		if (transactionRefFactoryTypeEClass == null) {
			transactionRefFactoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(162);
		}
		return transactionRefFactoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionRefFactoryType_Ref() {
        return (EAttribute)getTransactionRefFactoryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactionType() {
		if (transactionTypeEClass == null) {
			transactionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(163);
		}
		return transactionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_AbstractTransactionFactoryGroup() {
        return (EAttribute)getTransactionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionType_AbstractTransactionFactory() {
        return (EReference)getTransactionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionType_TransactionFactory() {
        return (EReference)getTransactionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_Action() {
        return (EAttribute)getTransactionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransactionType_Timeout() {
        return (EAttribute)getTransactionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformerAppendStringType() {
		if (transformerAppendStringTypeEClass == null) {
			transformerAppendStringTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(164);
		}
		return transformerAppendStringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerAppendStringType_Message() {
        return (EAttribute)getTransformerAppendStringType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransformerRefType() {
		if (transformerRefTypeEClass == null) {
			transformerRefTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(165);
		}
		return transformerRefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformerRefType_Ref() {
        return (EAttribute)getTransformerRefType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeFilterType() {
		if (typeFilterTypeEClass == null) {
			typeFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(166);
		}
		return typeFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeFilterType_ExpectedType() {
        return (EAttribute)getTypeFilterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnitaryFilterType() {
		if (unitaryFilterTypeEClass == null) {
			unitaryFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(167);
		}
		return unitaryFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnitaryFilterType_AbstractFilterGroup() {
        return (EAttribute)getUnitaryFilterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnitaryFilterType_AbstractFilter() {
        return (EReference)getUnitaryFilterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWildcardFilterType() {
		if (wildcardFilterTypeEClass == null) {
			wildcardFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(168);
		}
		return wildcardFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWireTapRouterType() {
		if (wireTapRouterTypeEClass == null) {
			wireTapRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(169);
		}
		return wireTapRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWireTapRouterType_AbstractOutboundEndpointGroup() {
        return (EAttribute)getWireTapRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWireTapRouterType_AbstractOutboundEndpoint() {
        return (EReference)getWireTapRouterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionType() {
		if (actionTypeEEnum == null) {
			actionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(30);
		}
		return actionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCreateConnectorType() {
		if (createConnectorTypeEEnum == null) {
			createConnectorTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(42);
		}
		return createConnectorTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnableCorrelationType() {
		if (enableCorrelationTypeEEnum == null) {
			enableCorrelationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(66);
		}
		return enableCorrelationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExhaustedActionType() {
		if (exhaustedActionTypeEEnum == null) {
			exhaustedActionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(73);
		}
		return exhaustedActionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInitialisationPolicyType() {
		if (initialisationPolicyTypeEEnum == null) {
			initialisationPolicyTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(85);
		}
		return initialisationPolicyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInitialStateType() {
		if (initialStateTypeEEnum == null) {
			initialStateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(87);
		}
		return initialStateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPoolExhaustedActionType() {
		if (poolExhaustedActionTypeEEnum == null) {
			poolExhaustedActionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(112);
		}
		return poolExhaustedActionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScopeType() {
		if (scopeTypeEEnum == null) {
			scopeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(126);
		}
		return scopeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getActionTypeObject() {
		if (actionTypeObjectEDataType == null) {
			actionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(31);
		}
		return actionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCreateConnectorTypeObject() {
		if (createConnectorTypeObjectEDataType == null) {
			createConnectorTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(43);
		}
		return createConnectorTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEnableCorrelationTypeObject() {
		if (enableCorrelationTypeObjectEDataType == null) {
			enableCorrelationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(67);
		}
		return enableCorrelationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExhaustedActionTypeObject() {
		if (exhaustedActionTypeObjectEDataType == null) {
			exhaustedActionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(74);
		}
		return exhaustedActionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInitialisationPolicyTypeObject() {
		if (initialisationPolicyTypeObjectEDataType == null) {
			initialisationPolicyTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(86);
		}
		return initialisationPolicyTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInitialStateTypeObject() {
		if (initialStateTypeObjectEDataType == null) {
			initialStateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(88);
		}
		return initialStateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoolExhaustedActionTypeObject() {
		if (poolExhaustedActionTypeObjectEDataType == null) {
			poolExhaustedActionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(113);
		}
		return poolExhaustedActionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPropertyPlaceholderType() {
		if (propertyPlaceholderTypeEDataType == null) {
			propertyPlaceholderTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(116);
		}
		return propertyPlaceholderTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getScopeTypeObject() {
		if (scopeTypeObjectEDataType == null) {
			scopeTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(127);
		}
		return scopeTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutableBoolean() {
		if (substitutableBooleanEDataType == null) {
			substitutableBooleanEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(137);
		}
		return substitutableBooleanEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutableBooleanMember0() {
		if (substitutableBooleanMember0EDataType == null) {
			substitutableBooleanMember0EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(138);
		}
		return substitutableBooleanMember0EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutableBooleanMember0Object() {
		if (substitutableBooleanMember0ObjectEDataType == null) {
			substitutableBooleanMember0ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(139);
		}
		return substitutableBooleanMember0ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutableBooleanObject() {
		if (substitutableBooleanObjectEDataType == null) {
			substitutableBooleanObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(140);
		}
		return substitutableBooleanObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutableClass() {
		if (substitutableClassEDataType == null) {
			substitutableClassEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(141);
		}
		return substitutableClassEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutableClassMember0() {
		if (substitutableClassMember0EDataType == null) {
			substitutableClassMember0EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(142);
		}
		return substitutableClassMember0EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutableInt() {
		if (substitutableIntEDataType == null) {
			substitutableIntEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(143);
		}
		return substitutableIntEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutableIntMember0() {
		if (substitutableIntMember0EDataType == null) {
			substitutableIntMember0EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(144);
		}
		return substitutableIntMember0EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutableIntMember0Object() {
		if (substitutableIntMember0ObjectEDataType == null) {
			substitutableIntMember0ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(145);
		}
		return substitutableIntMember0ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutableIntObject() {
		if (substitutableIntObjectEDataType == null) {
			substitutableIntObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(146);
		}
		return substitutableIntObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutableLong() {
		if (substitutableLongEDataType == null) {
			substitutableLongEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(147);
		}
		return substitutableLongEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutableLongMember0() {
		if (substitutableLongMember0EDataType == null) {
			substitutableLongMember0EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(148);
		}
		return substitutableLongMember0EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutableLongMember0Object() {
		if (substitutableLongMember0ObjectEDataType == null) {
			substitutableLongMember0ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(149);
		}
		return substitutableLongMember0ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutableLongObject() {
		if (substitutableLongObjectEDataType == null) {
			substitutableLongObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(150);
		}
		return substitutableLongObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutablePortNumber() {
		if (substitutablePortNumberEDataType == null) {
			substitutablePortNumberEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(151);
		}
		return substitutablePortNumberEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutablePortNumberMember0() {
		if (substitutablePortNumberMember0EDataType == null) {
			substitutablePortNumberMember0EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(152);
		}
		return substitutablePortNumberMember0EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutablePortNumberMember0Object() {
		if (substitutablePortNumberMember0ObjectEDataType == null) {
			substitutablePortNumberMember0ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(153);
		}
		return substitutablePortNumberMember0ObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutablePortNumberObject() {
		if (substitutablePortNumberObjectEDataType == null) {
			substitutablePortNumberObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(154);
		}
		return substitutablePortNumberObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactory getCoreFactory() {
		return (CoreFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.mule.ide.config.core." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //CorePackageImpl
