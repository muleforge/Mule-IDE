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

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.OutboundEndpointType;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.OutboundEndpointType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OutboundEndpointTypeItemProvider
	extends AbstractOutboundEndpointTypeItemProvider
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
	public OutboundEndpointTypeItemProvider(AdapterFactory adapterFactory) {
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

			addAddressPropertyDescriptor(object);
			addConnectorRefPropertyDescriptor(object);
			addCreateConnectorPropertyDescriptor(object);
			addEncodingPropertyDescriptor(object);
			addRefPropertyDescriptor(object);
			addRemoteSyncPropertyDescriptor(object);
			addRemoteSyncTimeoutPropertyDescriptor(object);
			addResponseTransformerRefsPropertyDescriptor(object);
			addSynchronousPropertyDescriptor(object);
			addTransformerRefsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Address feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddressPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutboundEndpointType_address_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutboundEndpointType_address_feature", "_UI_OutboundEndpointType_type"),
				 CorePackage.eINSTANCE.getOutboundEndpointType_Address(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Connector Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectorRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutboundEndpointType_connectorRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutboundEndpointType_connectorRef_feature", "_UI_OutboundEndpointType_type"),
				 CorePackage.eINSTANCE.getOutboundEndpointType_ConnectorRef(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Create Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutboundEndpointType_createConnector_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutboundEndpointType_createConnector_feature", "_UI_OutboundEndpointType_type"),
				 CorePackage.eINSTANCE.getOutboundEndpointType_CreateConnector(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Encoding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEncodingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutboundEndpointType_encoding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutboundEndpointType_encoding_feature", "_UI_OutboundEndpointType_type"),
				 CorePackage.eINSTANCE.getOutboundEndpointType_Encoding(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutboundEndpointType_ref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutboundEndpointType_ref_feature", "_UI_OutboundEndpointType_type"),
				 CorePackage.eINSTANCE.getOutboundEndpointType_Ref(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remote Sync feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemoteSyncPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutboundEndpointType_remoteSync_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutboundEndpointType_remoteSync_feature", "_UI_OutboundEndpointType_type"),
				 CorePackage.eINSTANCE.getOutboundEndpointType_RemoteSync(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Remote Sync Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRemoteSyncTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutboundEndpointType_remoteSyncTimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutboundEndpointType_remoteSyncTimeout_feature", "_UI_OutboundEndpointType_type"),
				 CorePackage.eINSTANCE.getOutboundEndpointType_RemoteSyncTimeout(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Response Transformer Refs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addResponseTransformerRefsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutboundEndpointType_responseTransformerRefs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutboundEndpointType_responseTransformerRefs_feature", "_UI_OutboundEndpointType_type"),
				 CorePackage.eINSTANCE.getOutboundEndpointType_ResponseTransformerRefs(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Synchronous feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSynchronousPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutboundEndpointType_synchronous_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutboundEndpointType_synchronous_feature", "_UI_OutboundEndpointType_type"),
				 CorePackage.eINSTANCE.getOutboundEndpointType_Synchronous(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transformer Refs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransformerRefsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutboundEndpointType_transformerRefs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutboundEndpointType_transformerRefs_feature", "_UI_OutboundEndpointType_type"),
				 CorePackage.eINSTANCE.getOutboundEndpointType_TransformerRefs(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(CorePackage.eINSTANCE.getOutboundEndpointType_Group());
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
	 * This returns OutboundEndpointType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OutboundEndpointType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OutboundEndpointType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OutboundEndpointType_type") :
			getString("_UI_OutboundEndpointType_type") + " " + label;
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

		switch (notification.getFeatureID(OutboundEndpointType.class)) {
			case CorePackage.OUTBOUND_ENDPOINT_TYPE__ADDRESS:
			case CorePackage.OUTBOUND_ENDPOINT_TYPE__CONNECTOR_REF:
			case CorePackage.OUTBOUND_ENDPOINT_TYPE__CREATE_CONNECTOR:
			case CorePackage.OUTBOUND_ENDPOINT_TYPE__ENCODING:
			case CorePackage.OUTBOUND_ENDPOINT_TYPE__REF:
			case CorePackage.OUTBOUND_ENDPOINT_TYPE__REMOTE_SYNC:
			case CorePackage.OUTBOUND_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT:
			case CorePackage.OUTBOUND_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS:
			case CorePackage.OUTBOUND_ENDPOINT_TYPE__SYNCHRONOUS:
			case CorePackage.OUTBOUND_ENDPOINT_TYPE__TRANSFORMER_REFS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.OUTBOUND_ENDPOINT_TYPE__GROUP:
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
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Transformer(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerAppendString(),
					 CoreFactory.eINSTANCE.createTransformerAppendStringType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerMessageProperties(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Transaction(),
					 CoreFactory.eINSTANCE.createTransactionType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_AndFilter(),
					 CoreFactory.eINSTANCE.createCollectionFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomFilter(),
					 CoreFactory.eINSTANCE.createCustomFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ExceptionTypeFilter(),
					 CoreFactory.eINSTANCE.createTypeFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Filter(),
					 CoreFactory.eINSTANCE.createFilterRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyFilter(),
					 CoreFactory.eINSTANCE.createPatternFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyFilter(),
					 CoreFactory.eINSTANCE.createWildcardFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_NotFilter(),
					 CoreFactory.eINSTANCE.createUnitaryFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_OrFilter(),
					 CoreFactory.eINSTANCE.createCollectionFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_PayloadTypeFilter(),
					 CoreFactory.eINSTANCE.createTypeFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_RegexFilter(),
					 CoreFactory.eINSTANCE.createPatternFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_RegexFilter(),
					 CoreFactory.eINSTANCE.createWildcardFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_WildcardFilter(),
					 CoreFactory.eINSTANCE.createWildcardFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_EncryptionSecurityFilter(),
					 CoreFactory.eINSTANCE.createEncryptionSecurityFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomConnectionStrategy(),
					 CoreFactory.eINSTANCE.createCustomConnectionStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_RetryConnectionStrategy(),
					 CoreFactory.eINSTANCE.createRetryConnectionStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getOutboundEndpointType_Properties(),
					 CoreFactory.eINSTANCE.createMapType())));
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

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
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
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_Transformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerMessageProperties() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_AndFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_OrFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ExceptionTypeFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_PayloadTypeFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_RegexFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_WildcardFilter();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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
