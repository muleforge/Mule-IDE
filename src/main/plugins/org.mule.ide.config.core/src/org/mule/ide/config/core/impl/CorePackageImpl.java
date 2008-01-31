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
	private EClass abstractAsyncReplyRouterTypeEClass = null;

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
	private EClass abstractComponentTypeEClass = null;

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
	private EClass abstractDefineNotificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDisableNotificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEntryPointResolverSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractEntryPointResolverTypeEClass = null;

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
	private EClass adminAgentTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appendStringTransformerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asyncReplyCollectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asyncReplyRouterTypeEClass = null;

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
	private EClass baseEntryPointResolverTypeEClass = null;

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
	private EClass complexEntryPointResolverTypeEClass = null;

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
	private EClass customAsyncReplyRouterTypeEClass = null;

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
	private EClass customCorrelationAggregatorRouterTypeEClass = null;

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
	private EClass customEntryPointResolverSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customEntryPointResolverTypeEClass = null;

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
	private EClass customSecurityProviderTypeEClass = null;

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
	private EClass customTransactionTypeEClass = null;

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
	private EClass defineNotificationTypeEClass = null;

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
	private EClass disableNotificationTypeEClass = null;

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
	private EClass extensibleEntryPointResolverSetEClass = null;

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
	private EClass idempotentReceiverRouterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inboundCollectionTypeEClass = null;

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
	private EClass keyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keyValueTypeEClass = null;

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
	private EClass managementContextTypeEClass = null;

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
	private EClass messageChunkingAggregatorRouterTypeEClass = null;

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
	private EClass methodEntryPointResolverTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodTypeEClass = null;

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
	private EClass notificationListenerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationManagerTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outboundCollectionTypeEClass = null;

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
	private EClass pojoBindingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pojoComponentTypeEClass = null;

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
	private EClass propertyEntryPointResolverTypeEClass = null;

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
	private EClass refFilterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflectionEntryPointResolverTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refTransformerTypeEClass = null;

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
	private EClass responseTransformersTypeEClass = null;

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
	private EClass springBeanLookupTypeEClass = null;

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
	private EClass transformersTypeEClass = null;

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
	private EClass valueTypeEClass = null;

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
	private EClass connectionEClass = null;

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
	private EEnum enableCorrelationTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventType1EEnum = null;

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
	private EEnum interfaceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interfaceType1EEnum = null;

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
	private EDataType actionTypeObjectEDataType = null;

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
	private EDataType eventTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType eventTypeObject1EDataType = null;

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
	private EDataType interfaceTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType interfaceTypeObject1EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonBlankStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonBlankStringMember0EDataType = null;

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
	private EDataType substitutableNameEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType substitutableNameMember0EDataType = null;

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
	public EClass getAbstractAsyncReplyRouterType() {
		if (abstractAsyncReplyRouterTypeEClass == null) {
			abstractAsyncReplyRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(1);
		}
		return abstractAsyncReplyRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractBindingType() {
		if (abstractBindingTypeEClass == null) {
			abstractBindingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(2);
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
			abstractCatchAllStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(3);
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
			abstractComponentThreadingProfileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(4);
		}
		return abstractComponentThreadingProfileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractComponentType() {
		if (abstractComponentTypeEClass == null) {
			abstractComponentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(5);
		}
		return abstractComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractComponentType_AbstractEntryPointResolverSetGroup() {
        return (EAttribute)getAbstractComponentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponentType_AbstractEntryPointResolverSet() {
        return (EReference)getAbstractComponentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractComponentType_AbstractEntryPointResolverGroup() {
        return (EAttribute)getAbstractComponentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractComponentType_AbstractEntryPointResolver() {
        return (EReference)getAbstractComponentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractConnectionStrategyType() {
		if (abstractConnectionStrategyTypeEClass == null) {
			abstractConnectionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(6);
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
			abstractConnectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(7);
		}
		return abstractConnectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractConnectorType_Name() {
        return (EAttribute)getAbstractConnectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDefineNotificationType() {
		if (abstractDefineNotificationTypeEClass == null) {
			abstractDefineNotificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(8);
		}
		return abstractDefineNotificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDisableNotificationType() {
		if (abstractDisableNotificationTypeEClass == null) {
			abstractDisableNotificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(9);
		}
		return abstractDisableNotificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEntryPointResolverSetType() {
		if (abstractEntryPointResolverSetTypeEClass == null) {
			abstractEntryPointResolverSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(10);
		}
		return abstractEntryPointResolverSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractEntryPointResolverType() {
		if (abstractEntryPointResolverTypeEClass == null) {
			abstractEntryPointResolverTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(11);
		}
		return abstractEntryPointResolverTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractExceptionStrategyType() {
		if (abstractExceptionStrategyTypeEClass == null) {
			abstractExceptionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(12);
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
			abstractExtensionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(13);
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
			abstractFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(14);
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
			abstractGlobalEndpointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(15);
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
			abstractInboundEndpointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(16);
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
			abstractInboundRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(17);
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
			abstractModelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(18);
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
	public EAttribute getAbstractModelType_AbstractEntryPointResolverSetGroup() {
        return (EAttribute)getAbstractModelType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractModelType_AbstractEntryPointResolverSet() {
        return (EReference)getAbstractModelType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractModelType_AbstractEntryPointResolverGroup() {
        return (EAttribute)getAbstractModelType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractModelType_AbstractEntryPointResolver() {
        return (EReference)getAbstractModelType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractModelType_AbstractServiceGroup() {
        return (EAttribute)getAbstractModelType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractModelType_AbstractService() {
        return (EReference)getAbstractModelType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractModelType_Class() {
        return (EAttribute)getAbstractModelType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractModelType_Name() {
        return (EAttribute)getAbstractModelType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractObjectFactoryType() {
		if (abstractObjectFactoryTypeEClass == null) {
			abstractObjectFactoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(19);
		}
		return abstractObjectFactoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractObjectFactoryType_Property() {
        return (EReference)getAbstractObjectFactoryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractObjectFactoryType_Properties() {
        return (EReference)getAbstractObjectFactoryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractOutboundEndpointType() {
		if (abstractOutboundEndpointTypeEClass == null) {
			abstractOutboundEndpointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(20);
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
			abstractOutboundRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(21);
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
			abstractPoolingProfileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(22);
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
			abstractPropertyExtractorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(23);
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
			abstractQueueProfileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(24);
		}
		return abstractQueueProfileTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractSecurityFilterType() {
		if (abstractSecurityFilterTypeEClass == null) {
			abstractSecurityFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(25);
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
			abstractSecurityManagerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(26);
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
			abstractServiceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(27);
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
			abstractStorageTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(28);
		}
		return abstractStorageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTransactionManagerType() {
		if (abstractTransactionManagerTypeEClass == null) {
			abstractTransactionManagerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(29);
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
			abstractTransactionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(30);
		}
		return abstractTransactionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTransactionType_Action() {
        return (EAttribute)getAbstractTransactionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractTransactionType_Timeout() {
        return (EAttribute)getAbstractTransactionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractTransformerType() {
		if (abstractTransformerTypeEClass == null) {
			abstractTransformerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(31);
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
	public EClass getAdminAgentType() {
		if (adminAgentTypeEClass == null) {
			adminAgentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(34);
		}
		return adminAgentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdminAgentType_Property() {
        return (EReference)getAdminAgentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdminAgentType_ServerUri() {
        return (EAttribute)getAdminAgentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppendStringTransformerType() {
		if (appendStringTransformerTypeEClass == null) {
			appendStringTransformerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(35);
		}
		return appendStringTransformerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppendStringTransformerType_Message() {
        return (EAttribute)getAppendStringTransformerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsyncReplyCollectionType() {
		if (asyncReplyCollectionTypeEClass == null) {
			asyncReplyCollectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(36);
		}
		return asyncReplyCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsyncReplyCollectionType_AbstractInboundEndpointGroup() {
        return (EAttribute)getAsyncReplyCollectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsyncReplyCollectionType_AbstractInboundEndpoint() {
        return (EReference)getAsyncReplyCollectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsyncReplyCollectionType_AbstractAsyncReplyRouterGroup() {
        return (EAttribute)getAsyncReplyCollectionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsyncReplyCollectionType_AbstractAsyncReplyRouter() {
        return (EReference)getAsyncReplyCollectionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsyncReplyCollectionType_AbstractTransformerGroup() {
        return (EAttribute)getAsyncReplyCollectionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsyncReplyCollectionType_AbstractTransformer() {
        return (EReference)getAsyncReplyCollectionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsyncReplyCollectionType_Timeout() {
        return (EAttribute)getAsyncReplyCollectionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsyncReplyCollectionType_TransformerRefs() {
        return (EAttribute)getAsyncReplyCollectionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsyncReplyRouterType() {
		if (asyncReplyRouterTypeEClass == null) {
			asyncReplyRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(37);
		}
		return asyncReplyRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsyncReplyRouterType_AbstractInboundEndpointGroup() {
        return (EAttribute)getAsyncReplyRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsyncReplyRouterType_AbstractInboundEndpoint() {
        return (EReference)getAsyncReplyRouterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsyncReplyRouterType_AbstractPropertyExtractorGroup() {
        return (EAttribute)getAsyncReplyRouterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsyncReplyRouterType_AbstractPropertyExtractor() {
        return (EReference)getAsyncReplyRouterType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAsyncReplyRouterType_CustomPropertyExtractor() {
        return (EReference)getAsyncReplyRouterType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseContainerContextType() {
		if (baseContainerContextTypeEClass == null) {
			baseContainerContextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(38);
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
	public EClass getBaseEntryPointResolverType() {
		if (baseEntryPointResolverTypeEClass == null) {
			baseEntryPointResolverTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(39);
		}
		return baseEntryPointResolverTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseEntryPointResolverType_AcceptVoidMethods() {
        return (EAttribute)getBaseEntryPointResolverType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseEntryPointResolverType_TransformFirst() {
        return (EAttribute)getBaseEntryPointResolverType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseServiceType() {
		if (baseServiceTypeEClass == null) {
			baseServiceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(40);
		}
		return baseServiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseServiceType_Inbound() {
        return (EReference)getBaseServiceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseServiceType_AbstractComponentGroup() {
        return (EAttribute)getBaseServiceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseServiceType_AbstractComponent() {
        return (EReference)getBaseServiceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseServiceType_Outbound() {
        return (EReference)getBaseServiceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseServiceType_AsyncReply() {
        return (EReference)getBaseServiceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseServiceType_AbstractExceptionStrategyGroup() {
        return (EAttribute)getBaseServiceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseServiceType_AbstractExceptionStrategy() {
        return (EReference)getBaseServiceType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseServiceType_Class() {
        return (EAttribute)getBaseServiceType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseServiceType_InitialState() {
        return (EAttribute)getBaseServiceType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChunkingRouterType() {
		if (chunkingRouterTypeEClass == null) {
			chunkingRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(41);
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
			collectionFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(42);
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
	public EClass getComplexEntryPointResolverType() {
		if (complexEntryPointResolverTypeEClass == null) {
			complexEntryPointResolverTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(43);
		}
		return complexEntryPointResolverTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexEntryPointResolverType_IncludeEntryPoint() {
        return (EReference)getComplexEntryPointResolverType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getComplexEntryPointResolverType_EnableDiscovery() {
        return (EAttribute)getComplexEntryPointResolverType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionStrategyType() {
		if (connectionStrategyTypeEClass == null) {
			connectionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(44);
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
			connectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(45);
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
	public EAttribute getConnectorType_DynamicNotification() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectorType_NumberOfConcurrentTransactedReceivers() {
        return (EAttribute)getConnectorType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerContextType() {
		if (containerContextTypeEClass == null) {
			containerContextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(46);
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
	public EClass getCustomAsyncReplyRouterType() {
		if (customAsyncReplyRouterTypeEClass == null) {
			customAsyncReplyRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(47);
		}
		return customAsyncReplyRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomAsyncReplyRouterType_Property() {
        return (EReference)getCustomAsyncReplyRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomAsyncReplyRouterType_Class() {
        return (EAttribute)getCustomAsyncReplyRouterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomCatchAllStrategyType() {
		if (customCatchAllStrategyTypeEClass == null) {
			customCatchAllStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(48);
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
			customConnectionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(49);
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
			customConnectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(50);
		}
		return customConnectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomConnectorType_Class() {
        return (EAttribute)getCustomConnectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomContainerContextType() {
		if (customContainerContextTypeEClass == null) {
			customContainerContextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(51);
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
	public EClass getCustomCorrelationAggregatorRouterType() {
		if (customCorrelationAggregatorRouterTypeEClass == null) {
			customCorrelationAggregatorRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(52);
		}
		return customCorrelationAggregatorRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomCorrelationAggregatorRouterType_Class() {
        return (EAttribute)getCustomCorrelationAggregatorRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomEncryptionStrategyType() {
		if (customEncryptionStrategyTypeEClass == null) {
			customEncryptionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(53);
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
	public EClass getCustomEntryPointResolverSetType() {
		if (customEntryPointResolverSetTypeEClass == null) {
			customEntryPointResolverSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(54);
		}
		return customEntryPointResolverSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomEntryPointResolverSetType_Property() {
        return (EReference)getCustomEntryPointResolverSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomEntryPointResolverSetType_Class() {
        return (EAttribute)getCustomEntryPointResolverSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomEntryPointResolverType() {
		if (customEntryPointResolverTypeEClass == null) {
			customEntryPointResolverTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(55);
		}
		return customEntryPointResolverTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomEntryPointResolverType_Property() {
        return (EReference)getCustomEntryPointResolverType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomEntryPointResolverType_Class() {
        return (EAttribute)getCustomEntryPointResolverType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomExceptionStrategyType() {
		if (customExceptionStrategyTypeEClass == null) {
			customExceptionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(56);
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
			customFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(57);
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
			customForwardingCatchAllStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(58);
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
			customInboundRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(59);
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
			customOutboundRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(60);
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
			customPropertyExtractorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(61);
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
	public EClass getCustomSecurityProviderType() {
		if (customSecurityProviderTypeEClass == null) {
			customSecurityProviderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(62);
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
	public EClass getCustomTransactionManagerType() {
		if (customTransactionManagerTypeEClass == null) {
			customTransactionManagerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(63);
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
	public EClass getCustomTransactionType() {
		if (customTransactionTypeEClass == null) {
			customTransactionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(64);
		}
		return customTransactionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomTransactionType_FactoryClass() {
        return (EAttribute)getCustomTransactionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomTransactionType_FactoryRef() {
        return (EAttribute)getCustomTransactionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomTransformerType() {
		if (customTransformerTypeEClass == null) {
			customTransformerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(65);
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
			defaultComponentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(66);
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
			defaultModelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(67);
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
			defaultServiceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(68);
		}
		return defaultServiceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefineNotificationType() {
		if (defineNotificationTypeEClass == null) {
			defineNotificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(69);
		}
		return defineNotificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefineNotificationType_Event() {
        return (EAttribute)getDefineNotificationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefineNotificationType_EventClass() {
        return (EAttribute)getDefineNotificationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefineNotificationType_Interface() {
        return (EAttribute)getDefineNotificationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefineNotificationType_InterfaceClass() {
        return (EAttribute)getDefineNotificationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDescriptionType() {
		if (descriptionTypeEClass == null) {
			descriptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(70);
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
	public EClass getDisableNotificationType() {
		if (disableNotificationTypeEClass == null) {
			disableNotificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(71);
		}
		return disableNotificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableNotificationType_Event() {
        return (EAttribute)getDisableNotificationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableNotificationType_EventClass() {
        return (EAttribute)getDisableNotificationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableNotificationType_Interface() {
        return (EAttribute)getDisableNotificationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableNotificationType_InterfaceClass() {
        return (EAttribute)getDisableNotificationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(72);
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
	public EReference getDocumentRoot_AbstractAsyncReplyRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractBinding() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractCatchAllStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractComponent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractComponentThreadingProfile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractConnectionStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractConnector() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractDefineNotification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractDisableNotification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractEntryPointResolver() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractEntryPointResolverSet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractExceptionStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractExtension() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractGlobalEndpoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractInboundEndpoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractInboundRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractModel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractObjectFactory() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractOutboundEndpoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractOutboundRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractPoolingProfile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractPropertyExtractor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractQueueProfile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractSecurityFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractSecurityManager() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractService() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractStorage() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractTransaction() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractTransactionManager() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AbstractTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AndFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AppendStringTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ArrayEntryPointResolver() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Base64DecoderTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Base64EncoderTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BeanPropertyExtractor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_BridgeComponent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ByteArrayToHexStringTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ByteArrayToObjectTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ByteArrayToSerializableTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ByteArrayToStringTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CallableEntryPointResolver() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ChainingRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Component() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ComponentThreadingProfile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CorrelationPropertyExtractor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CorrelationResequencerRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomAsyncReplyRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomCatchAllStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomConnectionStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomConnector() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomContainer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomCorrelationAggregatorRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomEntryPointResolver() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomEntryPointResolverSet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomExceptionStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomForwardingCatchAllStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomInboundRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomOutboundRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomPropertyExtractor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomTransaction() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomTransactionManager() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_CustomTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DecryptTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DefaultConnectorExceptionStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DefaultServiceExceptionStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Description() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_DisableNotification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EchoComponent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EjbContainer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EncryptionSecurityFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EncryptTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Endpoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EndpointSelectorRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_EntryPointResolverSet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExceptionBasedRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ExceptionTypeFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Filter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_FilteringRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ForwardingCatchAllStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ForwardingRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GzipCompressTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_GzipUncompressTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HexStringToByteArrayTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_HivemindContainer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdempotentReceiverRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IdempotentSecureHashReceiverRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InboundEndpoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InboundPassThroughRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_IncludeEntryPoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JbossTransactionManager() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JndiContainer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JndiTransactionManager() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_JrunTransactionManager() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LegacyEntryPointResolverSet() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ListMessageSplitterRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LogComponent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_LoggingCatchAllStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MapPropertyExtractor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageChunkingAggregatorRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessageChunkingRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessagePropertiesTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessagePropertyExtractor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MessagePropertyFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MethodEntryPointResolver() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Model() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Mule() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MuleUnsafe() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_MulticastingRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NoActionTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NoArgumentsEntryPointResolver() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NotFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Notification() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_NullComponent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectToByteArrayTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectToStringTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OrFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OutboundEndpoint() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_OutboundPassThroughRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PassThroughComponent() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PayloadPropertyExtractor() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PayloadTypeFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PicoContainer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PlexusContainer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PooledObject() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PoolingProfile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Properties() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PropertiesContainer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PropertyEntryPointResolver() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_PrototypeObject() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_QueueProfile() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ReflectionEntryPointResolver() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RegexFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ResinTransactionManager() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RetryConnectionStrategy() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_RmiContainer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SecurityManager() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SedaModel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SelectiveConsumerRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SerializableToByteArrayTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Service() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SingleAsyncReplyRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SingletonObject() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_SpringObject() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StaticRecipientListRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_StringToByteArrayTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_TemplateEndpointRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Transformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UcDecoderTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UcEncoderTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UuDecoderTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_UuEncoderTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WeblogicTransactionManager() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WebsphereTransactionManager() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WildcardFilter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_WireTapRouter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XmlEntityDecoderTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XmlEntityEncoderTransformer() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncryptionSecurityFilterType() {
		if (encryptionSecurityFilterTypeEClass == null) {
			encryptionSecurityFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(75);
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
			encryptionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(76);
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
			endpointSelectorRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(77);
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
			environmentPropertyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(78);
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
			exceptionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(83);
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
	public EClass getExtensibleEntryPointResolverSet() {
		if (extensibleEntryPointResolverSetEClass == null) {
			extensibleEntryPointResolverSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(86);
		}
		return extensibleEntryPointResolverSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensibleEntryPointResolverSet_AbstractEntryPointResolverGroup() {
        return (EAttribute)getExtensibleEntryPointResolverSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensibleEntryPointResolverSet_AbstractEntryPointResolver() {
        return (EReference)getExtensibleEntryPointResolverSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilteredInboundRouterType() {
		if (filteredInboundRouterTypeEClass == null) {
			filteredInboundRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(87);
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
			filteringOutboundRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(88);
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
	public EClass getForwardingCatchAllStrategyType() {
		if (forwardingCatchAllStrategyTypeEClass == null) {
			forwardingCatchAllStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(89);
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
			forwardingRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(90);
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
			genericObjectFactoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(91);
		}
		return genericObjectFactoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGenericObjectFactoryType_AbstractObjectFactoryGroup() {
        return (EAttribute)getGenericObjectFactoryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGenericObjectFactoryType_AbstractObjectFactory() {
        return (EReference)getGenericObjectFactoryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalEndpointType() {
		if (globalEndpointTypeEClass == null) {
			globalEndpointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(92);
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
	public EReference getGlobalEndpointType_Transformers() {
        return (EReference)getGlobalEndpointType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_ResponseTransformers() {
        return (EReference)getGlobalEndpointType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_AbstractTransactionGroup() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_AbstractTransaction() {
        return (EReference)getGlobalEndpointType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_AbstractFilterGroup() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_AbstractFilter() {
        return (EReference)getGlobalEndpointType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_AbstractSecurityFilterGroup() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_AbstractSecurityFilter() {
        return (EReference)getGlobalEndpointType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_AbstractConnectionStrategyGroup() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_AbstractConnectionStrategy() {
        return (EReference)getGlobalEndpointType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_Property() {
        return (EReference)getGlobalEndpointType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalEndpointType_Properties() {
        return (EReference)getGlobalEndpointType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_Address() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_ConnectorRef() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_Encoding() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_Ref() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_RemoteSync() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_RemoteSyncTimeout() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_ResponseTransformerRefs() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_Synchronous() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalEndpointType_TransformerRefs() {
        return (EAttribute)getGlobalEndpointType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdempotentReceiverRouterType() {
		if (idempotentReceiverRouterTypeEClass == null) {
			idempotentReceiverRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(93);
		}
		return idempotentReceiverRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdempotentReceiverRouterType_AbstractStorageGroup() {
        return (EAttribute)getIdempotentReceiverRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdempotentReceiverRouterType_AbstractStorage() {
        return (EReference)getIdempotentReceiverRouterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInboundCollectionType() {
		if (inboundCollectionTypeEClass == null) {
			inboundCollectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(94);
		}
		return inboundCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundCollectionType_AbstractCatchAllStrategyGroup() {
        return (EAttribute)getInboundCollectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundCollectionType_AbstractCatchAllStrategy() {
        return (EReference)getInboundCollectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundCollectionType_AbstractInboundEndpointGroup() {
        return (EAttribute)getInboundCollectionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundCollectionType_AbstractInboundEndpoint() {
        return (EReference)getInboundCollectionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundCollectionType_AbstractInboundRouterGroup() {
        return (EAttribute)getInboundCollectionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundCollectionType_AbstractInboundRouter() {
        return (EReference)getInboundCollectionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundCollectionType_MatchAll() {
        return (EAttribute)getInboundCollectionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInboundEndpointType() {
		if (inboundEndpointTypeEClass == null) {
			inboundEndpointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(95);
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
	public EReference getInboundEndpointType_Transformers() {
        return (EReference)getInboundEndpointType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_ResponseTransformers() {
        return (EReference)getInboundEndpointType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_AbstractTransactionGroup() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_AbstractTransaction() {
        return (EReference)getInboundEndpointType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_AbstractFilterGroup() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_AbstractFilter() {
        return (EReference)getInboundEndpointType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_AbstractSecurityFilterGroup() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_AbstractSecurityFilter() {
        return (EReference)getInboundEndpointType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_AbstractConnectionStrategyGroup() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_AbstractConnectionStrategy() {
        return (EReference)getInboundEndpointType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_Property() {
        return (EReference)getInboundEndpointType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInboundEndpointType_Properties() {
        return (EReference)getInboundEndpointType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_Address() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_ConnectorRef() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_Encoding() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_Ref() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_RemoteSync() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_RemoteSyncTimeout() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_ResponseTransformerRefs() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_Synchronous() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundEndpointType_TransformerRefs() {
        return (EAttribute)getInboundEndpointType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIocContainerContextType() {
		if (iocContainerContextTypeEClass == null) {
			iocContainerContextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(104);
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
			jndiConnectorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(105);
		}
		return jndiConnectorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJndiConnectorType_JndiProviderProperty() {
        return (EReference)getJndiConnectorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getJndiConnectorType_JndiProviderProperties() {
        return (EReference)getJndiConnectorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJndiConnectorType_JndiContextRef() {
        return (EAttribute)getJndiConnectorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJndiConnectorType_JndiInitialFactory() {
        return (EAttribute)getJndiConnectorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJndiConnectorType_JndiProviderUrl() {
        return (EAttribute)getJndiConnectorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJndiConnectorType_JndiUrlPkgPrefixes() {
        return (EAttribute)getJndiConnectorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJndiTransactionManagerType() {
		if (jndiTransactionManagerTypeEClass == null) {
			jndiTransactionManagerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(106);
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
	public EClass getKeyType() {
		if (keyTypeEClass == null) {
			keyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(107);
		}
		return keyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyType_Key() {
        return (EAttribute)getKeyType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeyValueType() {
		if (keyValueTypeEClass == null) {
			keyValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(108);
		}
		return keyValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValueType_Value() {
        return (EAttribute)getKeyValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeyValueType_ValueRef() {
        return (EAttribute)getKeyValueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListOrSetType() {
		if (listOrSetTypeEClass == null) {
			listOrSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(109);
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
			loggingCatchAllStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(110);
		}
		return loggingCatchAllStrategyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManagementContextType() {
		if (managementContextTypeEClass == null) {
			managementContextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(111);
		}
		return managementContextTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagementContextType_DefaultThreadingProfile() {
        return (EReference)getManagementContextType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagementContextType_DefaultDispatcherThreadingProfile() {
        return (EReference)getManagementContextType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagementContextType_DefaultReceiverThreadingProfile() {
        return (EReference)getManagementContextType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagementContextType_DefaultComponentThreadingProfile() {
        return (EReference)getManagementContextType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagementContextType_AbstractStorageGroup() {
        return (EAttribute)getManagementContextType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagementContextType_AbstractStorage() {
        return (EReference)getManagementContextType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManagementContextType_DefaultConnectionStrategy() {
        return (EReference)getManagementContextType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagementContextType_ClusterId() {
        return (EAttribute)getManagementContextType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagementContextType_DefaultEncoding() {
        return (EAttribute)getManagementContextType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagementContextType_DefaultRemoteSync() {
        return (EAttribute)getManagementContextType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagementContextType_DefaultSynchronousEndpoints() {
        return (EAttribute)getManagementContextType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagementContextType_DefaultSynchronousEventTimeout() {
        return (EAttribute)getManagementContextType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagementContextType_DefaultTransactionTimeout() {
        return (EAttribute)getManagementContextType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagementContextType_DomainId() {
        return (EAttribute)getManagementContextType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagementContextType_ServerId() {
        return (EAttribute)getManagementContextType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManagementContextType_WorkingDirectory() {
        return (EAttribute)getManagementContextType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMapType() {
		if (mapTypeEClass == null) {
			mapTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(112);
		}
		return mapTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageChunkingAggregatorRouterType() {
		if (messageChunkingAggregatorRouterTypeEClass == null) {
			messageChunkingAggregatorRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(113);
		}
		return messageChunkingAggregatorRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessageChunkingAggregatorRouterType_CorrelationExpression() {
        return (EAttribute)getMessageChunkingAggregatorRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessagePropertiesTransformerType() {
		if (messagePropertiesTransformerTypeEClass == null) {
			messagePropertiesTransformerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(114);
		}
		return messagePropertiesTransformerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessagePropertiesTransformerType_DeleteMessageProperty() {
        return (EReference)getMessagePropertiesTransformerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessagePropertiesTransformerType_AddMessageProperty() {
        return (EReference)getMessagePropertiesTransformerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessagePropertiesTransformerType_AddMessageProperties() {
        return (EReference)getMessagePropertiesTransformerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessagePropertiesTransformerType_Overwrite() {
        return (EAttribute)getMessagePropertiesTransformerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageSplitterOutboundRouterType() {
		if (messageSplitterOutboundRouterTypeEClass == null) {
			messageSplitterOutboundRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(115);
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
	public EClass getMethodEntryPointResolverType() {
		if (methodEntryPointResolverTypeEClass == null) {
			methodEntryPointResolverTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(116);
		}
		return methodEntryPointResolverTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMethodEntryPointResolverType_IncludeEntryPoint() {
        return (EReference)getMethodEntryPointResolverType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMethodType() {
		if (methodTypeEClass == null) {
			methodTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(117);
		}
		return methodTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMethodType_Method() {
        return (EAttribute)getMethodType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMuleType() {
		if (muleTypeEClass == null) {
			muleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(118);
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
	public EReference getMuleType_Notifications() {
        return (EReference)getMuleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_Description() {
        return (EReference)getMuleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_AbstractExtensionGroup() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_AbstractExtension() {
        return (EReference)getMuleType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_AbstractSecurityManagerGroup() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_AbstractSecurityManager() {
        return (EReference)getMuleType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_AbstractTransactionManagerGroup() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_AbstractTransactionManager() {
        return (EReference)getMuleType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_AbstractConnectorGroup() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_AbstractConnector() {
        return (EReference)getMuleType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_AbstractGlobalEndpointGroup() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_AbstractGlobalEndpoint() {
        return (EReference)getMuleType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_AbstractTransformerGroup() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_AbstractTransformer() {
        return (EReference)getMuleType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_AbstractFilterGroup() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_AbstractFilter() {
        return (EReference)getMuleType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_AbstractModelGroup() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_AbstractModel() {
        return (EReference)getMuleType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_Beans() {
        return (EReference)getMuleType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleType_Bean() {
        return (EReference)getMuleType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleType_Name() {
        return (EAttribute)getMuleType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMuleUnsafeType() {
		if (muleUnsafeTypeEClass == null) {
			muleUnsafeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(119);
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
	public EReference getMuleUnsafeType_Notifications() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_Description() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_AbstractExtensionGroup() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_AbstractExtension() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_AbstractSecurityManagerGroup() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_AbstractSecurityManager() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_AbstractTransactionManagerGroup() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_AbstractTransactionManager() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_AbstractConnectorGroup() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_AbstractConnector() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_AbstractGlobalEndpointGroup() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_AbstractGlobalEndpoint() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_AbstractTransformerGroup() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_AbstractTransformer() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_AbstractFilterGroup() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_AbstractFilter() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_AbstractModelGroup() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMuleUnsafeType_AbstractModel() {
        return (EReference)getMuleUnsafeType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_Any() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMuleUnsafeType_Name() {
        return (EAttribute)getMuleUnsafeType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotificationListenerType() {
		if (notificationListenerTypeEClass == null) {
			notificationListenerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(122);
		}
		return notificationListenerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationListenerType_Ref() {
        return (EAttribute)getNotificationListenerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationListenerType_Subscription() {
        return (EAttribute)getNotificationListenerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotificationManagerType() {
		if (notificationManagerTypeEClass == null) {
			notificationManagerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(123);
		}
		return notificationManagerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationManagerType_Group() {
        return (EAttribute)getNotificationManagerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationManagerType_AbstractDefineNotificationGroup() {
        return (EAttribute)getNotificationManagerType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationManagerType_AbstractDefineNotification() {
        return (EReference)getNotificationManagerType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationManagerType_Group1() {
        return (EAttribute)getNotificationManagerType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationManagerType_AbstractDisableNotificationGroup() {
        return (EAttribute)getNotificationManagerType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationManagerType_AbstractDisableNotification() {
        return (EReference)getNotificationManagerType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationManagerType_Group2() {
        return (EAttribute)getNotificationManagerType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotificationManagerType_NotificationListener() {
        return (EReference)getNotificationManagerType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotificationManagerType_Dynamic() {
        return (EAttribute)getNotificationManagerType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutboundCollectionType() {
		if (outboundCollectionTypeEClass == null) {
			outboundCollectionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(124);
		}
		return outboundCollectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundCollectionType_AbstractCatchAllStrategyGroup() {
        return (EAttribute)getOutboundCollectionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundCollectionType_AbstractCatchAllStrategy() {
        return (EReference)getOutboundCollectionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundCollectionType_AbstractOutboundRouterGroup() {
        return (EAttribute)getOutboundCollectionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundCollectionType_AbstractOutboundRouter() {
        return (EReference)getOutboundCollectionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundCollectionType_MatchAll() {
        return (EAttribute)getOutboundCollectionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutboundEndpointType() {
		if (outboundEndpointTypeEClass == null) {
			outboundEndpointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(125);
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
	public EReference getOutboundEndpointType_Transformers() {
        return (EReference)getOutboundEndpointType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_ResponseTransformers() {
        return (EReference)getOutboundEndpointType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_AbstractTransactionGroup() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_AbstractTransaction() {
        return (EReference)getOutboundEndpointType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_AbstractFilterGroup() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_AbstractFilter() {
        return (EReference)getOutboundEndpointType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_AbstractSecurityFilterGroup() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_AbstractSecurityFilter() {
        return (EReference)getOutboundEndpointType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_AbstractConnectionStrategyGroup() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_AbstractConnectionStrategy() {
        return (EReference)getOutboundEndpointType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_Property() {
        return (EReference)getOutboundEndpointType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutboundEndpointType_Properties() {
        return (EReference)getOutboundEndpointType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_Address() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_ConnectorRef() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_Encoding() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_Ref() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_RemoteSync() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_RemoteSyncTimeout() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_ResponseTransformerRefs() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_Synchronous() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutboundEndpointType_TransformerRefs() {
        return (EAttribute)getOutboundEndpointType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutboundRouterType() {
		if (outboundRouterTypeEClass == null) {
			outboundRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(126);
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
			passwordEncryptionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(127);
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
			patternFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(128);
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
	public EClass getPojoBindingType() {
		if (pojoBindingTypeEClass == null) {
			pojoBindingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(129);
		}
		return pojoBindingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPojoBindingType_AbstractOutboundEndpointGroup() {
        return (EAttribute)getPojoBindingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPojoBindingType_AbstractOutboundEndpoint() {
        return (EReference)getPojoBindingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPojoBindingType_Interface() {
        return (EAttribute)getPojoBindingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPojoBindingType_Method() {
        return (EAttribute)getPojoBindingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPojoComponentType() {
		if (pojoComponentTypeEClass == null) {
			pojoComponentTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(130);
		}
		return pojoComponentTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPojoComponentType_AbstractObjectFactoryGroup() {
        return (EAttribute)getPojoComponentType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPojoComponentType_AbstractObjectFactory() {
        return (EReference)getPojoComponentType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPojoComponentType_Binding() {
        return (EReference)getPojoComponentType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPojoComponentType_Class() {
        return (EAttribute)getPojoComponentType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPooledObjectFactoryType() {
		if (pooledObjectFactoryTypeEClass == null) {
			pooledObjectFactoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(131);
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
			poolingProfileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(134);
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
			propertiesContainerContextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(135);
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
	public EClass getPropertyEntryPointResolverType() {
		if (propertyEntryPointResolverTypeEClass == null) {
			propertyEntryPointResolverTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(136);
		}
		return propertyEntryPointResolverTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyEntryPointResolverType_Property() {
        return (EAttribute)getPropertyEntryPointResolverType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrototypeObjectFactoryType() {
		if (prototypeObjectFactoryTypeEClass == null) {
			prototypeObjectFactoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(138);
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
			queueProfileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(139);
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
			referenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(140);
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
	public EClass getRefFilterType() {
		if (refFilterTypeEClass == null) {
			refFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(141);
		}
		return refFilterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefFilterType_Ref() {
        return (EAttribute)getRefFilterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReflectionEntryPointResolverType() {
		if (reflectionEntryPointResolverTypeEClass == null) {
			reflectionEntryPointResolverTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(142);
		}
		return reflectionEntryPointResolverTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReflectionEntryPointResolverType_ExcludeObjectMethods() {
        return (EReference)getReflectionEntryPointResolverType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReflectionEntryPointResolverType_ExcludeEntryPoint() {
        return (EReference)getReflectionEntryPointResolverType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefTransformerType() {
		if (refTransformerTypeEClass == null) {
			refTransformerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(143);
		}
		return refTransformerTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefTransformerType_Ref() {
        return (EAttribute)getRefTransformerType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplyToType() {
		if (replyToTypeEClass == null) {
			replyToTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(144);
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
	public EClass getResponseTransformersType() {
		if (responseTransformersTypeEClass == null) {
			responseTransformersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(145);
		}
		return responseTransformersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseTransformersType_AbstractTransformerGroup() {
        return (EAttribute)getResponseTransformersType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseTransformersType_AbstractTransformer() {
        return (EReference)getResponseTransformersType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRetryConnectionStrategyType() {
		if (retryConnectionStrategyTypeEClass == null) {
			retryConnectionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(146);
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
			rmiContainerContextTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(147);
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
			secretKeyEncryptionStrategyTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(148);
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
			securityManagerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(149);
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
			securityProviderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(150);
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
			sedaModelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(151);
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
	public EReference getSedaModelType_Connections() {
        return (EReference)getSedaModelType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSedaServiceType() {
		if (sedaServiceTypeEClass == null) {
			sedaServiceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(152);
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
			selectiveConsumerRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(153);
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
	public EAttribute getSelectiveConsumerRouterType_TransformerRefs() {
        return (EAttribute)getSelectiveConsumerRouterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSelectiveConsumerRouterType_TransformFirst() {
        return (EAttribute)getSelectiveConsumerRouterType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceOverridesType() {
		if (serviceOverridesTypeEClass == null) {
			serviceOverridesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(154);
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
			singletonObjectFactoryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(155);
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
	public EClass getSpringBeanLookupType() {
		if (springBeanLookupTypeEClass == null) {
			springBeanLookupTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(156);
		}
		return springBeanLookupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpringBeanLookupType_Bean() {
        return (EAttribute)getSpringBeanLookupType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticRecipientListRouterType() {
		if (staticRecipientListRouterTypeEClass == null) {
			staticRecipientListRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(157);
		}
		return staticRecipientListRouterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticRecipientListRouterType_Recipients() {
        return (EReference)getStaticRecipientListRouterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticRecipientListRouterType_RecipientsDelimiter() {
        return (EAttribute)getStaticRecipientListRouterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticRecipientListRouterType_RecipientsProperty() {
        return (EAttribute)getStaticRecipientListRouterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreadingProfileType() {
		if (threadingProfileTypeEClass == null) {
			threadingProfileTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(178);
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
			tlsClientKeyStoreTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(179);
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
			tlsKeyStoreTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(180);
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
			tlsProtocolHandlerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(181);
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
			tlsServerTrustStoreTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(182);
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
			tlsTrustStoreTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(183);
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
			transactionManagerTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(184);
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
	public EClass getTransformersType() {
		if (transformersTypeEClass == null) {
			transformersTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(185);
		}
		return transformersTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransformersType_AbstractTransformerGroup() {
        return (EAttribute)getTransformersType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransformersType_AbstractTransformer() {
        return (EReference)getTransformersType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeFilterType() {
		if (typeFilterTypeEClass == null) {
			typeFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(186);
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
			unitaryFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(187);
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
	public EClass getValueType() {
		if (valueTypeEClass == null) {
			valueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(188);
		}
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Value() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_ValueRef() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWildcardFilterType() {
		if (wildcardFilterTypeEClass == null) {
			wildcardFilterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(189);
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
			wireTapRouterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(190);
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
	public EClass getConnection() {
		if (connectionEClass == null) {
			connectionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(191);
		}
		return connectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Endpoint() {
        return (EReference)getConnection().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Source() {
        return (EReference)getConnection().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConnection_Target() {
        return (EReference)getConnection().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionType() {
		if (actionTypeEEnum == null) {
			actionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(32);
		}
		return actionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEnableCorrelationType() {
		if (enableCorrelationTypeEEnum == null) {
			enableCorrelationTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(73);
		}
		return enableCorrelationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventType() {
		if (eventTypeEEnum == null) {
			eventTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(79);
		}
		return eventTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventType1() {
		if (eventType1EEnum == null) {
			eventType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(80);
		}
		return eventType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getExhaustedActionType() {
		if (exhaustedActionTypeEEnum == null) {
			exhaustedActionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(84);
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
			initialisationPolicyTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(96);
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
			initialStateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(98);
		}
		return initialStateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInterfaceType() {
		if (interfaceTypeEEnum == null) {
			interfaceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(100);
		}
		return interfaceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInterfaceType1() {
		if (interfaceType1EEnum == null) {
			interfaceType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(101);
		}
		return interfaceType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPoolExhaustedActionType() {
		if (poolExhaustedActionTypeEEnum == null) {
			poolExhaustedActionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(132);
		}
		return poolExhaustedActionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getActionTypeObject() {
		if (actionTypeObjectEDataType == null) {
			actionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(33);
		}
		return actionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEnableCorrelationTypeObject() {
		if (enableCorrelationTypeObjectEDataType == null) {
			enableCorrelationTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(74);
		}
		return enableCorrelationTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventTypeObject() {
		if (eventTypeObjectEDataType == null) {
			eventTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(81);
		}
		return eventTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEventTypeObject1() {
		if (eventTypeObject1EDataType == null) {
			eventTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(82);
		}
		return eventTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExhaustedActionTypeObject() {
		if (exhaustedActionTypeObjectEDataType == null) {
			exhaustedActionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(85);
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
			initialisationPolicyTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(97);
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
			initialStateTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(99);
		}
		return initialStateTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInterfaceTypeObject() {
		if (interfaceTypeObjectEDataType == null) {
			interfaceTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(102);
		}
		return interfaceTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getInterfaceTypeObject1() {
		if (interfaceTypeObject1EDataType == null) {
			interfaceTypeObject1EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(103);
		}
		return interfaceTypeObject1EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonBlankString() {
		if (nonBlankStringEDataType == null) {
			nonBlankStringEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(120);
		}
		return nonBlankStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonBlankStringMember0() {
		if (nonBlankStringMember0EDataType == null) {
			nonBlankStringMember0EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(121);
		}
		return nonBlankStringMember0EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPoolExhaustedActionTypeObject() {
		if (poolExhaustedActionTypeObjectEDataType == null) {
			poolExhaustedActionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(133);
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
			propertyPlaceholderTypeEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(137);
		}
		return propertyPlaceholderTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutableBoolean() {
		if (substitutableBooleanEDataType == null) {
			substitutableBooleanEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(158);
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
			substitutableBooleanMember0EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(159);
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
			substitutableBooleanMember0ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(160);
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
			substitutableBooleanObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(161);
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
			substitutableClassEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(162);
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
			substitutableClassMember0EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(163);
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
			substitutableIntEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(164);
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
			substitutableIntMember0EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(165);
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
			substitutableIntMember0ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(166);
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
			substitutableIntObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(167);
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
			substitutableLongEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(168);
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
			substitutableLongMember0EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(169);
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
			substitutableLongMember0ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(170);
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
			substitutableLongObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(171);
		}
		return substitutableLongObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutableName() {
		if (substitutableNameEDataType == null) {
			substitutableNameEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(172);
		}
		return substitutableNameEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutableNameMember0() {
		if (substitutableNameMember0EDataType == null) {
			substitutableNameMember0EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(173);
		}
		return substitutableNameMember0EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSubstitutablePortNumber() {
		if (substitutablePortNumberEDataType == null) {
			substitutablePortNumberEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(174);
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
			substitutablePortNumberMember0EDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(175);
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
			substitutablePortNumberMember0ObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(176);
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
			substitutablePortNumberObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI).getEClassifiers().get(177);
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
