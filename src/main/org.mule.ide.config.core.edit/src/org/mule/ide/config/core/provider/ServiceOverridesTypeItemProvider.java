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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.ServiceOverridesType;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.ServiceOverridesType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ServiceOverridesTypeItemProvider
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
	public ServiceOverridesTypeItemProvider(AdapterFactory adapterFactory) {
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

			addDispatcherFactoryPropertyDescriptor(object);
			addEndpointBuilderPropertyDescriptor(object);
			addInboundTransformerPropertyDescriptor(object);
			addMessageAdapterPropertyDescriptor(object);
			addMessageReceiverPropertyDescriptor(object);
			addOutboundTransformerPropertyDescriptor(object);
			addResponseTransformerPropertyDescriptor(object);
			addServiceFinderPropertyDescriptor(object);
			addStreamMessageAdapterPropertyDescriptor(object);
			addTransactedMessageReceiverPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Dispatcher Factory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDispatcherFactoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceOverridesType_dispatcherFactory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceOverridesType_dispatcherFactory_feature", "_UI_ServiceOverridesType_type"),
				 CorePackage.eINSTANCE.getServiceOverridesType_DispatcherFactory(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Endpoint Builder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndpointBuilderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceOverridesType_endpointBuilder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceOverridesType_endpointBuilder_feature", "_UI_ServiceOverridesType_type"),
				 CorePackage.eINSTANCE.getServiceOverridesType_EndpointBuilder(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inbound Transformer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInboundTransformerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceOverridesType_inboundTransformer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceOverridesType_inboundTransformer_feature", "_UI_ServiceOverridesType_type"),
				 CorePackage.eINSTANCE.getServiceOverridesType_InboundTransformer(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Message Adapter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageAdapterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceOverridesType_messageAdapter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceOverridesType_messageAdapter_feature", "_UI_ServiceOverridesType_type"),
				 CorePackage.eINSTANCE.getServiceOverridesType_MessageAdapter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Message Receiver feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMessageReceiverPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceOverridesType_messageReceiver_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceOverridesType_messageReceiver_feature", "_UI_ServiceOverridesType_type"),
				 CorePackage.eINSTANCE.getServiceOverridesType_MessageReceiver(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outbound Transformer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutboundTransformerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceOverridesType_outboundTransformer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceOverridesType_outboundTransformer_feature", "_UI_ServiceOverridesType_type"),
				 CorePackage.eINSTANCE.getServiceOverridesType_OutboundTransformer(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Response Transformer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponseTransformerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceOverridesType_responseTransformer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceOverridesType_responseTransformer_feature", "_UI_ServiceOverridesType_type"),
				 CorePackage.eINSTANCE.getServiceOverridesType_ResponseTransformer(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Finder feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceFinderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceOverridesType_serviceFinder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceOverridesType_serviceFinder_feature", "_UI_ServiceOverridesType_type"),
				 CorePackage.eINSTANCE.getServiceOverridesType_ServiceFinder(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Stream Message Adapter feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStreamMessageAdapterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceOverridesType_streamMessageAdapter_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceOverridesType_streamMessageAdapter_feature", "_UI_ServiceOverridesType_type"),
				 CorePackage.eINSTANCE.getServiceOverridesType_StreamMessageAdapter(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transacted Message Receiver feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransactedMessageReceiverPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ServiceOverridesType_transactedMessageReceiver_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ServiceOverridesType_transactedMessageReceiver_feature", "_UI_ServiceOverridesType_type"),
				 CorePackage.eINSTANCE.getServiceOverridesType_TransactedMessageReceiver(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ServiceOverridesType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ServiceOverridesType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ServiceOverridesType)object).getDispatcherFactory();
		return label == null || label.length() == 0 ?
			getString("_UI_ServiceOverridesType_type") :
			getString("_UI_ServiceOverridesType_type") + " " + label;
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

		switch (notification.getFeatureID(ServiceOverridesType.class)) {
			case CorePackage.SERVICE_OVERRIDES_TYPE__DISPATCHER_FACTORY:
			case CorePackage.SERVICE_OVERRIDES_TYPE__ENDPOINT_BUILDER:
			case CorePackage.SERVICE_OVERRIDES_TYPE__INBOUND_TRANSFORMER:
			case CorePackage.SERVICE_OVERRIDES_TYPE__MESSAGE_ADAPTER:
			case CorePackage.SERVICE_OVERRIDES_TYPE__MESSAGE_RECEIVER:
			case CorePackage.SERVICE_OVERRIDES_TYPE__OUTBOUND_TRANSFORMER:
			case CorePackage.SERVICE_OVERRIDES_TYPE__RESPONSE_TRANSFORMER:
			case CorePackage.SERVICE_OVERRIDES_TYPE__SERVICE_FINDER:
			case CorePackage.SERVICE_OVERRIDES_TYPE__STREAM_MESSAGE_ADAPTER:
			case CorePackage.SERVICE_OVERRIDES_TYPE__TRANSACTED_MESSAGE_RECEIVER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
