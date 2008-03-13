/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.CorePlugin;
import org.mule.ide.config.core.DocumentRoot;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractAsyncReplyRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractBinding());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractCatchAllStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractComponent());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractComponentThreadingProfile());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractConnectionStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractConnector());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractDefineNotification());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractDisableNotification());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractEntryPointResolver());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractEntryPointResolverSet());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractExceptionStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractExtension());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractGlobalEndpoint());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractInboundEndpoint());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractInboundRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractModel());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractObjectFactory());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractOutboundEndpoint());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractOutboundRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractPoolingProfile());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractPropertyExtractor());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractQueueProfile());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractSecurityFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractSecurityManager());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractService());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractStorage());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractTransaction());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractTransactionManager());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AndFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AppendStringTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ArrayEntryPointResolver());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Base64DecoderTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Base64EncoderTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_BeanPropertyExtractor());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_BridgeComponent());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToHexStringTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToObjectTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToSerializableTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToStringTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Component());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ComponentThreadingProfile());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CorrelationPropertyExtractor());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CorrelationResequencerRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomAsyncReplyRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomCatchAllStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomConnectionStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomConnector());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomContainer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomCorrelationAggregatorRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomEntryPointResolver());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomEntryPointResolverSet());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomExceptionStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomForwardingCatchAllStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomInboundRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomOutboundRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomPropertyExtractor());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomTransaction());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomTransactionManager());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_DecryptTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_DefaultConnectorExceptionStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_DefaultServiceExceptionStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Description());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_DisableNotification());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_EchoComponent());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_EjbContainer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_EncryptionSecurityFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_EncryptTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Endpoint());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_EndpointSelectorRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_EntryPointResolverSet());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ExceptionTypeFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Filter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ForwardingCatchAllStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ForwardingRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_GzipCompressTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_GzipUncompressTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_HexStringToByteArrayTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_HivemindContainer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_IdempotentReceiverRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_InboundEndpoint());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_IncludeEntryPoint());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_JbossTransactionManager());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_JndiContainer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_JndiTransactionManager());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_JrunTransactionManager());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_LegacyEntryPointResolverSet());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ListMessageSplitterRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_LogComponent());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_LoggingCatchAllStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_MapPropertyExtractor());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingAggregatorRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertiesTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyExtractor());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_MethodEntryPointResolver());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Model());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Mule());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_NoActionTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_NoArgumentsEntryPointResolver());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_NotFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Notification());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_NullComponent());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ObjectToByteArrayTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ObjectToStringTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_OrFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_OutboundEndpoint());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_PassThroughComponent());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_PayloadPropertyExtractor());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_PayloadTypeFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_PicoContainer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_PlexusContainer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_PooledObject());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_PoolingProfile());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Properties());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_PropertiesContainer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_PropertyEntryPointResolver());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_PrototypeObject());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_QueueProfile());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ReflectionEntryPointResolver());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_RegexFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ResinTransactionManager());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_RetryConnectionStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_RmiContainer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_SecurityManager());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_SedaModel());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_SelectiveConsumerRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_SerializableToByteArrayTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Service());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_SingleAsyncReplyRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_SingletonObject());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_SpringObject());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_StaticRecipientListRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_StringToByteArrayTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Transformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_UcDecoderTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_UcEncoderTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_UuDecoderTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_UuEncoderTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_WeblogicTransactionManager());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_WebsphereTransactionManager());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_WildcardFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_WireTapRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityDecoderTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityEncoderTransformer());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_ASYNC_REPLY_ROUTER:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_BINDING:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_CATCH_ALL_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_COMPONENT:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_COMPONENT_THREADING_PROFILE:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_CONNECTION_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_CONNECTOR:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_DEFINE_NOTIFICATION:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_DISABLE_NOTIFICATION:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_ENTRY_POINT_RESOLVER:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_ENTRY_POINT_RESOLVER_SET:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_EXCEPTION_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_EXTENSION:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_FILTER:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_GLOBAL_ENDPOINT:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_INBOUND_ENDPOINT:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_INBOUND_ROUTER:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_MODEL:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_OBJECT_FACTORY:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_OUTBOUND_ENDPOINT:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_OUTBOUND_ROUTER:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_POOLING_PROFILE:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_PROPERTY_EXTRACTOR:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_QUEUE_PROFILE:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_SECURITY_FILTER:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_SECURITY_MANAGER:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_SERVICE:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_STORAGE:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION_MANAGER:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__AND_FILTER:
			case CorePackage.DOCUMENT_ROOT__APPEND_STRING_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__ARRAY_ENTRY_POINT_RESOLVER:
			case CorePackage.DOCUMENT_ROOT__BASE64_DECODER_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__BASE64_ENCODER_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__BEAN_PROPERTY_EXTRACTOR:
			case CorePackage.DOCUMENT_ROOT__BRIDGE_COMPONENT:
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_HEX_STRING_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_OBJECT_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_SERIALIZABLE_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__BYTE_ARRAY_TO_STRING_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__CALLABLE_ENTRY_POINT_RESOLVER:
			case CorePackage.DOCUMENT_ROOT__CHAINING_ROUTER:
			case CorePackage.DOCUMENT_ROOT__COMPONENT:
			case CorePackage.DOCUMENT_ROOT__COMPONENT_THREADING_PROFILE:
			case CorePackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_EXTRACTOR:
			case CorePackage.DOCUMENT_ROOT__CORRELATION_RESEQUENCER_ROUTER:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ASYNC_REPLY_ROUTER:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CATCH_ALL_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTION_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTOR:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONTAINER:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CORRELATION_AGGREGATOR_ROUTER:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ENTRY_POINT_RESOLVER:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ENTRY_POINT_RESOLVER_SET:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_EXCEPTION_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_FILTER:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_FORWARDING_CATCH_ALL_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_INBOUND_ROUTER:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_OUTBOUND_ROUTER:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_PROPERTY_EXTRACTOR:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION_MANAGER:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__DECRYPT_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__DEFAULT_CONNECTOR_EXCEPTION_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__DEFAULT_SERVICE_EXCEPTION_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__DESCRIPTION:
			case CorePackage.DOCUMENT_ROOT__DISABLE_NOTIFICATION:
			case CorePackage.DOCUMENT_ROOT__ECHO_COMPONENT:
			case CorePackage.DOCUMENT_ROOT__EJB_CONTAINER:
			case CorePackage.DOCUMENT_ROOT__ENCRYPTION_SECURITY_FILTER:
			case CorePackage.DOCUMENT_ROOT__ENCRYPT_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__ENDPOINT:
			case CorePackage.DOCUMENT_ROOT__ENDPOINT_SELECTOR_ROUTER:
			case CorePackage.DOCUMENT_ROOT__ENTRY_POINT_RESOLVER_SET:
			case CorePackage.DOCUMENT_ROOT__EXCEPTION_BASED_ROUTER:
			case CorePackage.DOCUMENT_ROOT__EXCEPTION_TYPE_FILTER:
			case CorePackage.DOCUMENT_ROOT__FILTER:
			case CorePackage.DOCUMENT_ROOT__FILTERING_ROUTER:
			case CorePackage.DOCUMENT_ROOT__FORWARDING_CATCH_ALL_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__FORWARDING_ROUTER:
			case CorePackage.DOCUMENT_ROOT__GZIP_COMPRESS_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__GZIP_UNCOMPRESS_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__HEX_STRING_TO_BYTE_ARRAY_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__HIVEMIND_CONTAINER:
			case CorePackage.DOCUMENT_ROOT__IDEMPOTENT_RECEIVER_ROUTER:
			case CorePackage.DOCUMENT_ROOT__IDEMPOTENT_SECURE_HASH_RECEIVER_ROUTER:
			case CorePackage.DOCUMENT_ROOT__INBOUND_ENDPOINT:
			case CorePackage.DOCUMENT_ROOT__INBOUND_PASS_THROUGH_ROUTER:
			case CorePackage.DOCUMENT_ROOT__INCLUDE_ENTRY_POINT:
			case CorePackage.DOCUMENT_ROOT__JBOSS_TRANSACTION_MANAGER:
			case CorePackage.DOCUMENT_ROOT__JNDI_CONTAINER:
			case CorePackage.DOCUMENT_ROOT__JNDI_TRANSACTION_MANAGER:
			case CorePackage.DOCUMENT_ROOT__JRUN_TRANSACTION_MANAGER:
			case CorePackage.DOCUMENT_ROOT__LEGACY_ENTRY_POINT_RESOLVER_SET:
			case CorePackage.DOCUMENT_ROOT__LIST_MESSAGE_SPLITTER_ROUTER:
			case CorePackage.DOCUMENT_ROOT__LOG_COMPONENT:
			case CorePackage.DOCUMENT_ROOT__LOGGING_CATCH_ALL_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__MAP_PROPERTY_EXTRACTOR:
			case CorePackage.DOCUMENT_ROOT__MESSAGE_CHUNKING_AGGREGATOR_ROUTER:
			case CorePackage.DOCUMENT_ROOT__MESSAGE_CHUNKING_ROUTER:
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTIES_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_EXTRACTOR:
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_FILTER:
			case CorePackage.DOCUMENT_ROOT__METHOD_ENTRY_POINT_RESOLVER:
			case CorePackage.DOCUMENT_ROOT__MODEL:
			case CorePackage.DOCUMENT_ROOT__MULE:
			case CorePackage.DOCUMENT_ROOT__MULTICASTING_ROUTER:
			case CorePackage.DOCUMENT_ROOT__NO_ACTION_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__NO_ARGUMENTS_ENTRY_POINT_RESOLVER:
			case CorePackage.DOCUMENT_ROOT__NOT_FILTER:
			case CorePackage.DOCUMENT_ROOT__NOTIFICATION:
			case CorePackage.DOCUMENT_ROOT__NULL_COMPONENT:
			case CorePackage.DOCUMENT_ROOT__OBJECT_TO_BYTE_ARRAY_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__OBJECT_TO_STRING_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__OR_FILTER:
			case CorePackage.DOCUMENT_ROOT__OUTBOUND_ENDPOINT:
			case CorePackage.DOCUMENT_ROOT__OUTBOUND_PASS_THROUGH_ROUTER:
			case CorePackage.DOCUMENT_ROOT__PASS_THROUGH_COMPONENT:
			case CorePackage.DOCUMENT_ROOT__PAYLOAD_PROPERTY_EXTRACTOR:
			case CorePackage.DOCUMENT_ROOT__PAYLOAD_TYPE_FILTER:
			case CorePackage.DOCUMENT_ROOT__PICO_CONTAINER:
			case CorePackage.DOCUMENT_ROOT__PLEXUS_CONTAINER:
			case CorePackage.DOCUMENT_ROOT__POOLED_OBJECT:
			case CorePackage.DOCUMENT_ROOT__POOLING_PROFILE:
			case CorePackage.DOCUMENT_ROOT__PROPERTIES:
			case CorePackage.DOCUMENT_ROOT__PROPERTIES_CONTAINER:
			case CorePackage.DOCUMENT_ROOT__PROPERTY_ENTRY_POINT_RESOLVER:
			case CorePackage.DOCUMENT_ROOT__PROTOTYPE_OBJECT:
			case CorePackage.DOCUMENT_ROOT__QUEUE_PROFILE:
			case CorePackage.DOCUMENT_ROOT__REFLECTION_ENTRY_POINT_RESOLVER:
			case CorePackage.DOCUMENT_ROOT__REGEX_FILTER:
			case CorePackage.DOCUMENT_ROOT__RESIN_TRANSACTION_MANAGER:
			case CorePackage.DOCUMENT_ROOT__RETRY_CONNECTION_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__RMI_CONTAINER:
			case CorePackage.DOCUMENT_ROOT__SECURITY_MANAGER:
			case CorePackage.DOCUMENT_ROOT__SEDA_MODEL:
			case CorePackage.DOCUMENT_ROOT__SELECTIVE_CONSUMER_ROUTER:
			case CorePackage.DOCUMENT_ROOT__SERIALIZABLE_TO_BYTE_ARRAY_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__SERVICE:
			case CorePackage.DOCUMENT_ROOT__SINGLE_ASYNC_REPLY_ROUTER:
			case CorePackage.DOCUMENT_ROOT__SINGLETON_OBJECT:
			case CorePackage.DOCUMENT_ROOT__SPRING_OBJECT:
			case CorePackage.DOCUMENT_ROOT__STATIC_RECIPIENT_LIST_ROUTER:
			case CorePackage.DOCUMENT_ROOT__STRING_TO_BYTE_ARRAY_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__TEMPLATE_ENDPOINT_ROUTER:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__UC_DECODER_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__UC_ENCODER_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__UU_DECODER_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__UU_ENCODER_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__WEBLOGIC_TRANSACTION_MANAGER:
			case CorePackage.DOCUMENT_ROOT__WEBSPHERE_TRANSACTION_MANAGER:
			case CorePackage.DOCUMENT_ROOT__WILDCARD_FILTER:
			case CorePackage.DOCUMENT_ROOT__WIRE_TAP_ROUTER:
			case CorePackage.DOCUMENT_ROOT__XML_ENTITY_DECODER_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__XML_ENTITY_ENCODER_TRANSFORMER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_AndFilter(),
				 CoreFactory.eINSTANCE.createCollectionFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_AppendStringTransformer(),
				 CoreFactory.eINSTANCE.createAppendStringTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ArrayEntryPointResolver(),
				 CoreFactory.eINSTANCE.createComplexEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Base64DecoderTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Base64DecoderTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Base64DecoderTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Base64DecoderTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Base64EncoderTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Base64EncoderTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Base64EncoderTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Base64EncoderTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_BeanPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_BridgeComponent(),
				 CoreFactory.eINSTANCE.createDefaultComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToHexStringTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToHexStringTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToHexStringTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToHexStringTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToObjectTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToObjectTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToObjectTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToObjectTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToSerializableTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToSerializableTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToSerializableTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToSerializableTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToStringTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToStringTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToStringTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToStringTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
				 CoreFactory.eINSTANCE.createAbstractEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
				 CoreFactory.eINSTANCE.createBaseEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
				 CoreFactory.eINSTANCE.createReflectionEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
				 CoreFactory.eINSTANCE.createComplexEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
				 CoreFactory.eINSTANCE.createCustomEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
				 CoreFactory.eINSTANCE.createMethodEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
				 CoreFactory.eINSTANCE.createPropertyEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter(),
				 CoreFactory.eINSTANCE.createFilteringOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter(),
				 CoreFactory.eINSTANCE.createChunkingRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter(),
				 CoreFactory.eINSTANCE.createCustomOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter(),
				 CoreFactory.eINSTANCE.createEndpointSelectorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter(),
				 CoreFactory.eINSTANCE.createMessageSplitterOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter(),
				 CoreFactory.eINSTANCE.createStaticRecipientListRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Component(),
				 CoreFactory.eINSTANCE.createPojoComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ComponentThreadingProfile(),
				 CoreFactory.eINSTANCE.createThreadingProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CorrelationPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CorrelationResequencerRouter(),
				 CoreFactory.eINSTANCE.createSelectiveConsumerRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CustomAsyncReplyRouter(),
				 CoreFactory.eINSTANCE.createCustomAsyncReplyRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CustomCatchAllStrategy(),
				 CoreFactory.eINSTANCE.createCustomCatchAllStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CustomConnectionStrategy(),
				 CoreFactory.eINSTANCE.createCustomConnectionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CustomConnector(),
				 CoreFactory.eINSTANCE.createCustomConnectorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CustomContainer(),
				 CoreFactory.eINSTANCE.createCustomContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CustomCorrelationAggregatorRouter(),
				 CoreFactory.eINSTANCE.createCustomCorrelationAggregatorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CustomEntryPointResolver(),
				 CoreFactory.eINSTANCE.createCustomEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CustomEntryPointResolverSet(),
				 CoreFactory.eINSTANCE.createCustomEntryPointResolverSetType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CustomExceptionStrategy(),
				 CoreFactory.eINSTANCE.createCustomExceptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CustomFilter(),
				 CoreFactory.eINSTANCE.createCustomFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CustomForwardingCatchAllStrategy(),
				 CoreFactory.eINSTANCE.createCustomForwardingCatchAllStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CustomInboundRouter(),
				 CoreFactory.eINSTANCE.createCustomInboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CustomOutboundRouter(),
				 CoreFactory.eINSTANCE.createCustomOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomPropertyExtractorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CustomTransaction(),
				 CoreFactory.eINSTANCE.createCustomTransactionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CustomTransactionManager(),
				 CoreFactory.eINSTANCE.createCustomTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CustomTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_DecryptTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_DecryptTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_DecryptTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_DecryptTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_DefaultConnectorExceptionStrategy(),
				 CoreFactory.eINSTANCE.createExceptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_DefaultConnectorExceptionStrategy(),
				 CoreFactory.eINSTANCE.createCustomExceptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_DefaultServiceExceptionStrategy(),
				 CoreFactory.eINSTANCE.createExceptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_DefaultServiceExceptionStrategy(),
				 CoreFactory.eINSTANCE.createCustomExceptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Description(),
				 CoreFactory.eINSTANCE.createDescriptionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_DisableNotification(),
				 CoreFactory.eINSTANCE.createDisableNotificationType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_EchoComponent(),
				 CoreFactory.eINSTANCE.createDefaultComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_EjbContainer(),
				 CoreFactory.eINSTANCE.createRmiContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_EncryptionSecurityFilter(),
				 CoreFactory.eINSTANCE.createEncryptionSecurityFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_EncryptTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_EncryptTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_EncryptTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_EncryptTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Endpoint(),
				 CoreFactory.eINSTANCE.createGlobalEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_EndpointSelectorRouter(),
				 CoreFactory.eINSTANCE.createEndpointSelectorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_EntryPointResolverSet(),
				 CoreFactory.eINSTANCE.createExtensibleEntryPointResolverSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter(),
				 CoreFactory.eINSTANCE.createFilteringOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter(),
				 CoreFactory.eINSTANCE.createChunkingRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter(),
				 CoreFactory.eINSTANCE.createCustomOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter(),
				 CoreFactory.eINSTANCE.createEndpointSelectorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter(),
				 CoreFactory.eINSTANCE.createMessageSplitterOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter(),
				 CoreFactory.eINSTANCE.createStaticRecipientListRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ExceptionTypeFilter(),
				 CoreFactory.eINSTANCE.createTypeFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Filter(),
				 CoreFactory.eINSTANCE.createRefFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter(),
				 CoreFactory.eINSTANCE.createFilteringOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter(),
				 CoreFactory.eINSTANCE.createChunkingRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter(),
				 CoreFactory.eINSTANCE.createCustomOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter(),
				 CoreFactory.eINSTANCE.createEndpointSelectorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter(),
				 CoreFactory.eINSTANCE.createMessageSplitterOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter(),
				 CoreFactory.eINSTANCE.createStaticRecipientListRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ForwardingCatchAllStrategy(),
				 CoreFactory.eINSTANCE.createForwardingCatchAllStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ForwardingCatchAllStrategy(),
				 CoreFactory.eINSTANCE.createCustomForwardingCatchAllStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ForwardingRouter(),
				 CoreFactory.eINSTANCE.createForwardingRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_GzipCompressTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_GzipCompressTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_GzipCompressTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_GzipCompressTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_GzipUncompressTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_GzipUncompressTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_GzipUncompressTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_GzipUncompressTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_HexStringToByteArrayTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_HexStringToByteArrayTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_HexStringToByteArrayTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_HexStringToByteArrayTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_HivemindContainer(),
				 CoreFactory.eINSTANCE.createIocContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_IdempotentReceiverRouter(),
				 CoreFactory.eINSTANCE.createIdempotentReceiverRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
				 CoreFactory.eINSTANCE.createFilteredInboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
				 CoreFactory.eINSTANCE.createMessageChunkingAggregatorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
				 CoreFactory.eINSTANCE.createCustomCorrelationAggregatorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
				 CoreFactory.eINSTANCE.createCustomInboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
				 CoreFactory.eINSTANCE.createForwardingRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
				 CoreFactory.eINSTANCE.createIdempotentReceiverRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
				 CoreFactory.eINSTANCE.createSelectiveConsumerRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
				 CoreFactory.eINSTANCE.createWireTapRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_InboundEndpoint(),
				 CoreFactory.eINSTANCE.createInboundEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(),
				 CoreFactory.eINSTANCE.createFilteredInboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(),
				 CoreFactory.eINSTANCE.createMessageChunkingAggregatorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(),
				 CoreFactory.eINSTANCE.createCustomCorrelationAggregatorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(),
				 CoreFactory.eINSTANCE.createCustomInboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(),
				 CoreFactory.eINSTANCE.createForwardingRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(),
				 CoreFactory.eINSTANCE.createIdempotentReceiverRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(),
				 CoreFactory.eINSTANCE.createSelectiveConsumerRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(),
				 CoreFactory.eINSTANCE.createWireTapRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_IncludeEntryPoint(),
				 CoreFactory.eINSTANCE.createMethodType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_JbossTransactionManager(),
				 CoreFactory.eINSTANCE.createTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_JndiContainer(),
				 CoreFactory.eINSTANCE.createBaseContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_JndiContainer(),
				 CoreFactory.eINSTANCE.createCustomContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_JndiContainer(),
				 CoreFactory.eINSTANCE.createIocContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_JndiContainer(),
				 CoreFactory.eINSTANCE.createPropertiesContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_JndiContainer(),
				 CoreFactory.eINSTANCE.createRmiContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_JndiTransactionManager(),
				 CoreFactory.eINSTANCE.createTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_JrunTransactionManager(),
				 CoreFactory.eINSTANCE.createTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_LegacyEntryPointResolverSet(),
				 CoreFactory.eINSTANCE.createExtensibleEntryPointResolverSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ListMessageSplitterRouter(),
				 CoreFactory.eINSTANCE.createMessageSplitterOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_LogComponent(),
				 CoreFactory.eINSTANCE.createDefaultComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_LoggingCatchAllStrategy(),
				 CoreFactory.eINSTANCE.createLoggingCatchAllStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_MapPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingAggregatorRouter(),
				 CoreFactory.eINSTANCE.createMessageChunkingAggregatorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingAggregatorRouter(),
				 CoreFactory.eINSTANCE.createCustomCorrelationAggregatorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingRouter(),
				 CoreFactory.eINSTANCE.createChunkingRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertiesTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyFilter(),
				 CoreFactory.eINSTANCE.createPatternFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyFilter(),
				 CoreFactory.eINSTANCE.createWildcardFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_MethodEntryPointResolver(),
				 CoreFactory.eINSTANCE.createMethodEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Model(),
				 CoreFactory.eINSTANCE.createDefaultModelType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Mule(),
				 CoreFactory.eINSTANCE.createMuleType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter(),
				 CoreFactory.eINSTANCE.createFilteringOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter(),
				 CoreFactory.eINSTANCE.createChunkingRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter(),
				 CoreFactory.eINSTANCE.createCustomOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter(),
				 CoreFactory.eINSTANCE.createEndpointSelectorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter(),
				 CoreFactory.eINSTANCE.createMessageSplitterOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter(),
				 CoreFactory.eINSTANCE.createStaticRecipientListRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_NoActionTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_NoActionTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_NoActionTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_NoActionTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_NoArgumentsEntryPointResolver(),
				 CoreFactory.eINSTANCE.createComplexEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_NotFilter(),
				 CoreFactory.eINSTANCE.createUnitaryFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Notification(),
				 CoreFactory.eINSTANCE.createDefineNotificationType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_NullComponent(),
				 CoreFactory.eINSTANCE.createDefaultComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ObjectToByteArrayTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ObjectToByteArrayTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ObjectToByteArrayTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ObjectToByteArrayTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ObjectToStringTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ObjectToStringTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ObjectToStringTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ObjectToStringTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_OrFilter(),
				 CoreFactory.eINSTANCE.createCollectionFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_OutboundEndpoint(),
				 CoreFactory.eINSTANCE.createOutboundEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter(),
				 CoreFactory.eINSTANCE.createOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter(),
				 CoreFactory.eINSTANCE.createFilteringOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter(),
				 CoreFactory.eINSTANCE.createChunkingRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter(),
				 CoreFactory.eINSTANCE.createCustomOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter(),
				 CoreFactory.eINSTANCE.createEndpointSelectorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter(),
				 CoreFactory.eINSTANCE.createMessageSplitterOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter(),
				 CoreFactory.eINSTANCE.createStaticRecipientListRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_PassThroughComponent(),
				 CoreFactory.eINSTANCE.createDefaultComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_PayloadPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_PayloadTypeFilter(),
				 CoreFactory.eINSTANCE.createTypeFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_PicoContainer(),
				 CoreFactory.eINSTANCE.createIocContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_PlexusContainer(),
				 CoreFactory.eINSTANCE.createIocContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_PooledObject(),
				 CoreFactory.eINSTANCE.createPooledObjectFactoryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_PoolingProfile(),
				 CoreFactory.eINSTANCE.createPoolingProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Properties(),
				 CoreFactory.eINSTANCE.createMapType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_PropertiesContainer(),
				 CoreFactory.eINSTANCE.createPropertiesContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_PropertyEntryPointResolver(),
				 CoreFactory.eINSTANCE.createPropertyEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_PrototypeObject(),
				 CoreFactory.eINSTANCE.createPrototypeObjectFactoryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_QueueProfile(),
				 CoreFactory.eINSTANCE.createQueueProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ReflectionEntryPointResolver(),
				 CoreFactory.eINSTANCE.createReflectionEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ReflectionEntryPointResolver(),
				 CoreFactory.eINSTANCE.createComplexEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_RegexFilter(),
				 CoreFactory.eINSTANCE.createPatternFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_RegexFilter(),
				 CoreFactory.eINSTANCE.createWildcardFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_ResinTransactionManager(),
				 CoreFactory.eINSTANCE.createTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_RetryConnectionStrategy(),
				 CoreFactory.eINSTANCE.createRetryConnectionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_RmiContainer(),
				 CoreFactory.eINSTANCE.createRmiContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_SecurityManager(),
				 CoreFactory.eINSTANCE.createSecurityManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_SedaModel(),
				 CoreFactory.eINSTANCE.createSedaModelType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_SedaModel(),
				 CoreFactory.eINSTANCE.createDefaultModelType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_SelectiveConsumerRouter(),
				 CoreFactory.eINSTANCE.createSelectiveConsumerRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_SerializableToByteArrayTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_SerializableToByteArrayTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_SerializableToByteArrayTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_SerializableToByteArrayTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Service(),
				 CoreFactory.eINSTANCE.createSedaServiceType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Service(),
				 CoreFactory.eINSTANCE.createDefaultServiceType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_SingleAsyncReplyRouter(),
				 CoreFactory.eINSTANCE.createAsyncReplyRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_SingleAsyncReplyRouter(),
				 CoreFactory.eINSTANCE.createCustomAsyncReplyRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_SingletonObject(),
				 CoreFactory.eINSTANCE.createSingletonObjectFactoryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_SpringObject(),
				 CoreFactory.eINSTANCE.createSpringBeanLookupType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_StaticRecipientListRouter(),
				 CoreFactory.eINSTANCE.createStaticRecipientListRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_StringToByteArrayTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_StringToByteArrayTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_StringToByteArrayTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_StringToByteArrayTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter(),
				 CoreFactory.eINSTANCE.createFilteringOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter(),
				 CoreFactory.eINSTANCE.createChunkingRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter(),
				 CoreFactory.eINSTANCE.createCustomOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter(),
				 CoreFactory.eINSTANCE.createEndpointSelectorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter(),
				 CoreFactory.eINSTANCE.createMessageSplitterOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter(),
				 CoreFactory.eINSTANCE.createStaticRecipientListRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Transformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_UcDecoderTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_UcDecoderTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_UcDecoderTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_UcDecoderTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_UcEncoderTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_UcEncoderTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_UcEncoderTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_UcEncoderTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_UuDecoderTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_UuDecoderTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_UuDecoderTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_UuDecoderTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_UuEncoderTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_UuEncoderTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_UuEncoderTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_UuEncoderTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_WeblogicTransactionManager(),
				 CoreFactory.eINSTANCE.createJndiTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_WeblogicTransactionManager(),
				 CoreFactory.eINSTANCE.createCustomTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_WebsphereTransactionManager(),
				 CoreFactory.eINSTANCE.createTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_WildcardFilter(),
				 CoreFactory.eINSTANCE.createWildcardFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_WireTapRouter(),
				 CoreFactory.eINSTANCE.createWireTapRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityDecoderTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityDecoderTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityDecoderTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityDecoderTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityEncoderTransformer(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityEncoderTransformer(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityEncoderTransformer(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityEncoderTransformer(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_AndFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_OrFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ArrayEntryPointResolver() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_NoArgumentsEntryPointResolver() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ReflectionEntryPointResolver() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_Base64DecoderTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_Base64EncoderTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToHexStringTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToObjectTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToSerializableTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToStringTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_DecryptTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_EncryptTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_GzipCompressTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_GzipUncompressTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_HexStringToByteArrayTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_NoActionTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ObjectToByteArrayTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ObjectToStringTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_SerializableToByteArrayTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_StringToByteArrayTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_UcDecoderTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_UcEncoderTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_UuDecoderTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_UuEncoderTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_XmlEntityDecoderTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_XmlEntityEncoderTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MessagePropertiesTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_Transformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_BeanPropertyExtractor() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CorrelationPropertyExtractor() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MapPropertyExtractor() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyExtractor() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_PayloadPropertyExtractor() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_BridgeComponent() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_EchoComponent() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_LogComponent() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_NullComponent() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_PassThroughComponent() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomEntryPointResolver() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MethodEntryPointResolver() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_PropertyEntryPointResolver() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomOutboundRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_EndpointSelectorRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ListMessageSplitterRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_StaticRecipientListRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CorrelationResequencerRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_SelectiveConsumerRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomAsyncReplyRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_SingleAsyncReplyRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomContainer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_JndiContainer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomCorrelationAggregatorRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingAggregatorRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomExceptionStrategy() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_DefaultConnectorExceptionStrategy() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_DefaultServiceExceptionStrategy() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomForwardingCatchAllStrategy() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ForwardingCatchAllStrategy() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomInboundRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomTransactionManager() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_WeblogicTransactionManager() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_EjbContainer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_RmiContainer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_EntryPointResolverSet() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_LegacyEntryPointResolverSet() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ExceptionTypeFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_PayloadTypeFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ForwardingRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_HivemindContainer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_PicoContainer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_PlexusContainer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_IdempotentReceiverRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_WireTapRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_JbossTransactionManager() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_JndiTransactionManager() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_JrunTransactionManager() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ResinTransactionManager() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_WebsphereTransactionManager() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_PropertiesContainer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_RegexFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_WildcardFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_Model() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_SedaModel();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * This returns the icon image for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getCreateChildImage(Object owner, Object feature, Object child, Collection<?> selection) {
		if (feature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)feature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)child;
			feature = entry.getEStructuralFeature();
			child = entry.getValue();        
		}

		if (feature instanceof EReference && child instanceof EObject) {
			String name = "full/obj16/" + ((EObject)child).eClass().getName();

			try {
				return getResourceLocator().getImage(name);
			}
			catch (Exception e) {
				CorePlugin.INSTANCE.log(e);
			}
		}

		return super.getCreateChildImage(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return CorePlugin.INSTANCE;
	}

}
