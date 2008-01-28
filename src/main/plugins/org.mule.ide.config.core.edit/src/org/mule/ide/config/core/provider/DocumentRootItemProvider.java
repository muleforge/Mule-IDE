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
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

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
import org.mule.ide.config.core.DocumentRoot;

import org.mule.ide.config.spring.SpringFactory;

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
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractEntrypointResolver());
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
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractTransactionFactory());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractTransactionManager());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AbstractTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_AndFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_BeanPropertyExtractor());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_BridgeComponent());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CallableEntrypointResolver());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Component());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ComponentThreadingProfile());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CorrelationAggregatorRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CorrelationPropertyExtractor());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CorrelationResequencerRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomAsyncReplyRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomCatchAllStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomConnectionStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomConnector());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomContainer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomEntrypointResolver());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomExceptionStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomForwardingCatchAllStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomInboundRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomOutboundRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomPropertyExtractor());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomTransactionFactory());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomTransactionManager());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_CustomTransformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_DefaultConnectorExceptionStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_DefaultServiceExceptionStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Description());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_DisableNotification());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_EchoComponent());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_EjbContainer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_EncryptionSecurityFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Endpoint());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_EndpointSelectorRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ExceptionTypeFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Filter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ForwardingCatchAllStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ForwardingRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_HivemindContainer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_IdempotentReceiverRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_InboundEndpoint());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_JndiContainer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_ListMessageSplitterRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_LogComponent());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_LoggingCatchAllStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_MapPropertyExtractor());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingAggregatorRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyExtractor());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Model());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Mule());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_MuleUnsafe());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_NoArgsCallComponent());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_NotFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Notification());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_NullComponent());
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
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_PrototypeObject());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_QueueProfile());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_RegexFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_RetryConnectionStrategy());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_RmiContainer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_SecurityManager());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_SedaModel());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_SelectiveConsumerRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Service());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_SingleAsyncReplyRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_SingletonObject());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_StaticRecipientListRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Transaction());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransactionFactory());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJboss());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJndi());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJrun());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerResin());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerWeblogic());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerWebsphere());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_Transformer());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerAppendString());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerMessageProperties());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_WildcardFilter());
			childrenFeatures.add(CorePackage.eINSTANCE.getDocumentRoot_WireTapRouter());
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
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
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
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_ENTRYPOINT_RESOLVER:
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
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION_FACTORY:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSACTION_MANAGER:
			case CorePackage.DOCUMENT_ROOT__ABSTRACT_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__AND_FILTER:
			case CorePackage.DOCUMENT_ROOT__BEAN_PROPERTY_EXTRACTOR:
			case CorePackage.DOCUMENT_ROOT__BRIDGE_COMPONENT:
			case CorePackage.DOCUMENT_ROOT__CALLABLE_ENTRYPOINT_RESOLVER:
			case CorePackage.DOCUMENT_ROOT__CHAINING_ROUTER:
			case CorePackage.DOCUMENT_ROOT__COMPONENT:
			case CorePackage.DOCUMENT_ROOT__COMPONENT_THREADING_PROFILE:
			case CorePackage.DOCUMENT_ROOT__CORRELATION_AGGREGATOR_ROUTER:
			case CorePackage.DOCUMENT_ROOT__CORRELATION_PROPERTY_EXTRACTOR:
			case CorePackage.DOCUMENT_ROOT__CORRELATION_RESEQUENCER_ROUTER:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ASYNC_REPLY_ROUTER:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CATCH_ALL_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTION_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONNECTOR:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_CONTAINER:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_ENTRYPOINT_RESOLVER:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_EXCEPTION_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_FILTER:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_FORWARDING_CATCH_ALL_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_INBOUND_ROUTER:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_OUTBOUND_ROUTER:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_PROPERTY_EXTRACTOR:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION_FACTORY:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSACTION_MANAGER:
			case CorePackage.DOCUMENT_ROOT__CUSTOM_TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__DEFAULT_CONNECTOR_EXCEPTION_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__DEFAULT_SERVICE_EXCEPTION_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__DESCRIPTION:
			case CorePackage.DOCUMENT_ROOT__DISABLE_NOTIFICATION:
			case CorePackage.DOCUMENT_ROOT__ECHO_COMPONENT:
			case CorePackage.DOCUMENT_ROOT__EJB_CONTAINER:
			case CorePackage.DOCUMENT_ROOT__ENCRYPTION_SECURITY_FILTER:
			case CorePackage.DOCUMENT_ROOT__ENDPOINT:
			case CorePackage.DOCUMENT_ROOT__ENDPOINT_SELECTOR_ROUTER:
			case CorePackage.DOCUMENT_ROOT__EXCEPTION_BASED_ROUTER:
			case CorePackage.DOCUMENT_ROOT__EXCEPTION_TYPE_FILTER:
			case CorePackage.DOCUMENT_ROOT__FILTER:
			case CorePackage.DOCUMENT_ROOT__FILTERING_ROUTER:
			case CorePackage.DOCUMENT_ROOT__FORWARDING_CATCH_ALL_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__FORWARDING_ROUTER:
			case CorePackage.DOCUMENT_ROOT__HIVEMIND_CONTAINER:
			case CorePackage.DOCUMENT_ROOT__IDEMPOTENT_RECEIVER_ROUTER:
			case CorePackage.DOCUMENT_ROOT__IDEMPOTENT_SECURE_HASH_RECEIVER_ROUTER:
			case CorePackage.DOCUMENT_ROOT__INBOUND_ENDPOINT:
			case CorePackage.DOCUMENT_ROOT__INBOUND_PASS_THROUGH_ROUTER:
			case CorePackage.DOCUMENT_ROOT__JNDI_CONTAINER:
			case CorePackage.DOCUMENT_ROOT__LIST_MESSAGE_SPLITTER_ROUTER:
			case CorePackage.DOCUMENT_ROOT__LOG_COMPONENT:
			case CorePackage.DOCUMENT_ROOT__LOGGING_CATCH_ALL_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__MAP_PROPERTY_EXTRACTOR:
			case CorePackage.DOCUMENT_ROOT__MESSAGE_CHUNKING_AGGREGATOR_ROUTER:
			case CorePackage.DOCUMENT_ROOT__MESSAGE_CHUNKING_ROUTER:
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_EXTRACTOR:
			case CorePackage.DOCUMENT_ROOT__MESSAGE_PROPERTY_FILTER:
			case CorePackage.DOCUMENT_ROOT__MODEL:
			case CorePackage.DOCUMENT_ROOT__MULE:
			case CorePackage.DOCUMENT_ROOT__MULE_UNSAFE:
			case CorePackage.DOCUMENT_ROOT__MULTICASTING_ROUTER:
			case CorePackage.DOCUMENT_ROOT__NO_ARGS_CALL_COMPONENT:
			case CorePackage.DOCUMENT_ROOT__NOT_FILTER:
			case CorePackage.DOCUMENT_ROOT__NOTIFICATION:
			case CorePackage.DOCUMENT_ROOT__NULL_COMPONENT:
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
			case CorePackage.DOCUMENT_ROOT__PROTOTYPE_OBJECT:
			case CorePackage.DOCUMENT_ROOT__QUEUE_PROFILE:
			case CorePackage.DOCUMENT_ROOT__REGEX_FILTER:
			case CorePackage.DOCUMENT_ROOT__RETRY_CONNECTION_STRATEGY:
			case CorePackage.DOCUMENT_ROOT__RMI_CONTAINER:
			case CorePackage.DOCUMENT_ROOT__SECURITY_MANAGER:
			case CorePackage.DOCUMENT_ROOT__SEDA_MODEL:
			case CorePackage.DOCUMENT_ROOT__SELECTIVE_CONSUMER_ROUTER:
			case CorePackage.DOCUMENT_ROOT__SERVICE:
			case CorePackage.DOCUMENT_ROOT__SINGLE_ASYNC_REPLY_ROUTER:
			case CorePackage.DOCUMENT_ROOT__SINGLETON_OBJECT:
			case CorePackage.DOCUMENT_ROOT__STATIC_RECIPIENT_LIST_ROUTER:
			case CorePackage.DOCUMENT_ROOT__TEMPLATE_ENDPOINT_ROUTER:
			case CorePackage.DOCUMENT_ROOT__TRANSACTION:
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_FACTORY:
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_JBOSS:
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_JNDI:
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_JRUN:
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_RESIN:
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_WEBLOGIC:
			case CorePackage.DOCUMENT_ROOT__TRANSACTION_MANAGER_WEBSPHERE:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_APPEND_STRING:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BASE64_DECODER:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BASE64_ENCODER:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_HEX_STRING:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_OBJECT:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_SERIALIZABLE:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_BYTE_ARRAY_TO_STRING:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_DECRYPT:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_ENCRYPT:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_GZIP_COMPRESS:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_GZIP_UNCOMPRESS:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_HEX_STING_TO_BYTE_ARRAY:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_MESSAGE_PROPERTIES:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_NO_ACTION:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_OBJECT_TO_BYTE_ARRAY:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_OBJECT_TO_STRING:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_SERIALIZABLE_TO_BYTE_ARRAY:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_STRING_TO_BYTE_ARRAY:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UC_DECODER:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UC_ENCODER:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UU_DECODER:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_UU_ENCODER:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_XML_ENTITY_DECODER:
			case CorePackage.DOCUMENT_ROOT__TRANSFORMER_XML_ENTITY_ENCODER:
			case CorePackage.DOCUMENT_ROOT__WILDCARD_FILTER:
			case CorePackage.DOCUMENT_ROOT__WIRE_TAP_ROUTER:
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
				(CorePackage.eINSTANCE.getDocumentRoot_BeanPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_BridgeComponent(),
				 CoreFactory.eINSTANCE.createDefaultComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_BridgeComponent(),
				 CoreFactory.eINSTANCE.createNoArgsCallComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CallableEntrypointResolver(),
				 CoreFactory.eINSTANCE.createCallableEntrypointResolverType()));

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
				(CorePackage.eINSTANCE.getDocumentRoot_CorrelationAggregatorRouter(),
				 CoreFactory.eINSTANCE.createCorrelationAggregatorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CorrelationPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CorrelationResequencerRouter(),
				 CoreFactory.eINSTANCE.createCorrelationRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_CorrelationResequencerRouter(),
				 CoreFactory.eINSTANCE.createCorrelationAggregatorRouterType()));

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
				(CorePackage.eINSTANCE.getDocumentRoot_CustomEntrypointResolver(),
				 CoreFactory.eINSTANCE.createCustomEntrypointResolverType()));

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
				(CorePackage.eINSTANCE.getDocumentRoot_CustomTransactionFactory(),
				 CoreFactory.eINSTANCE.createCustomTransactionFactoryType()));

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
				(CorePackage.eINSTANCE.getDocumentRoot_EchoComponent(),
				 CoreFactory.eINSTANCE.createNoArgsCallComponentType()));

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
				(CorePackage.eINSTANCE.getDocumentRoot_Endpoint(),
				 CoreFactory.eINSTANCE.createGlobalEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_EndpointSelectorRouter(),
				 CoreFactory.eINSTANCE.createEndpointSelectorRouterType()));

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
				 CoreFactory.eINSTANCE.createFilterRefType()));

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
				(CorePackage.eINSTANCE.getDocumentRoot_HivemindContainer(),
				 CoreFactory.eINSTANCE.createIocContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_IdempotentReceiverRouter(),
				 CoreFactory.eINSTANCE.createIdempotentReceiverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
				 CoreFactory.eINSTANCE.createFilteredInboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
				 CoreFactory.eINSTANCE.createCorrelationRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
				 CoreFactory.eINSTANCE.createCorrelationAggregatorRouterType()));

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
				 CoreFactory.eINSTANCE.createIdempotentReceiverType()));

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
				 CoreFactory.eINSTANCE.createCorrelationRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(),
				 CoreFactory.eINSTANCE.createCorrelationAggregatorRouterType()));

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
				 CoreFactory.eINSTANCE.createIdempotentReceiverType()));

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
				 CoreFactory.eINSTANCE.createRmiContainerContextType()));

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
				(CorePackage.eINSTANCE.getDocumentRoot_LogComponent(),
				 CoreFactory.eINSTANCE.createNoArgsCallComponentType()));

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
				 CoreFactory.eINSTANCE.createCorrelationRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingAggregatorRouter(),
				 CoreFactory.eINSTANCE.createCorrelationAggregatorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingRouter(),
				 CoreFactory.eINSTANCE.createChunkingRouterType()));

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
				(CorePackage.eINSTANCE.getDocumentRoot_Model(),
				 CoreFactory.eINSTANCE.createDefaultModelType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Mule(),
				 CoreFactory.eINSTANCE.createMuleType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_MuleUnsafe(),
				 CoreFactory.eINSTANCE.createMuleUnsafeType()));

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
				(CorePackage.eINSTANCE.getDocumentRoot_NoArgsCallComponent(),
				 CoreFactory.eINSTANCE.createNoArgsCallComponentType()));

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
				(CorePackage.eINSTANCE.getDocumentRoot_NullComponent(),
				 CoreFactory.eINSTANCE.createNoArgsCallComponentType()));

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
				(CorePackage.eINSTANCE.getDocumentRoot_PassThroughComponent(),
				 CoreFactory.eINSTANCE.createNoArgsCallComponentType()));

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
				(CorePackage.eINSTANCE.getDocumentRoot_PrototypeObject(),
				 CoreFactory.eINSTANCE.createPrototypeObjectFactoryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_QueueProfile(),
				 CoreFactory.eINSTANCE.createQueueProfileType()));

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
				(CorePackage.eINSTANCE.getDocumentRoot_StaticRecipientListRouter(),
				 CoreFactory.eINSTANCE.createStaticRecipientListRouterType()));

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
				(CorePackage.eINSTANCE.getDocumentRoot_Transaction(),
				 CoreFactory.eINSTANCE.createTransactionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransactionFactory(),
				 CoreFactory.eINSTANCE.createTransactionRefFactoryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJboss(),
				 CoreFactory.eINSTANCE.createTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJndi(),
				 CoreFactory.eINSTANCE.createTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJrun(),
				 CoreFactory.eINSTANCE.createTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerResin(),
				 CoreFactory.eINSTANCE.createTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerWeblogic(),
				 CoreFactory.eINSTANCE.createJndiTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerWeblogic(),
				 CoreFactory.eINSTANCE.createCustomTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerWebsphere(),
				 CoreFactory.eINSTANCE.createTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_Transformer(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerAppendString(),
				 CoreFactory.eINSTANCE.createTransformerAppendStringType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerMessageProperties(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_WildcardFilter(),
				 CoreFactory.eINSTANCE.createWildcardFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getDocumentRoot_WireTapRouter(),
				 CoreFactory.eINSTANCE.createWireTapRouterType()));
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
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_NoArgsCallComponent() ||
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
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CorrelationAggregatorRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CorrelationResequencerRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingAggregatorRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomAsyncReplyRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_SingleAsyncReplyRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomContainer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_JndiContainer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomExceptionStrategy() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_DefaultConnectorExceptionStrategy() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_DefaultServiceExceptionStrategy() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomForwardingCatchAllStrategy() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ForwardingCatchAllStrategy() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomInboundRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomTransactionManager() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerWeblogic() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_EjbContainer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_RmiContainer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ExceptionTypeFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_PayloadTypeFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ForwardingRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_HivemindContainer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_PicoContainer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_PlexusContainer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_IdempotentReceiverRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_SelectiveConsumerRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_WireTapRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_RegexFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_WildcardFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_Model() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_SedaModel() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJboss() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJndi() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJrun() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerResin() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerWebsphere() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_Transformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerMessageProperties();

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
				CoreEditPlugin.INSTANCE.log(e);
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
		return CoreEditPlugin.INSTANCE;
	}

}
