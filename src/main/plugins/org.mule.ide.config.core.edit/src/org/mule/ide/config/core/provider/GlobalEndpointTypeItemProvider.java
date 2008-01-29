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
import org.mule.ide.config.core.GlobalEndpointType;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.GlobalEndpointType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GlobalEndpointTypeItemProvider
	extends AbstractGlobalEndpointTypeItemProvider
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
	public GlobalEndpointTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_GlobalEndpointType_address_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalEndpointType_address_feature", "_UI_GlobalEndpointType_type"),
				 CorePackage.eINSTANCE.getGlobalEndpointType_Address(),
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
				 getString("_UI_GlobalEndpointType_connectorRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalEndpointType_connectorRef_feature", "_UI_GlobalEndpointType_type"),
				 CorePackage.eINSTANCE.getGlobalEndpointType_ConnectorRef(),
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
				 getString("_UI_GlobalEndpointType_encoding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalEndpointType_encoding_feature", "_UI_GlobalEndpointType_type"),
				 CorePackage.eINSTANCE.getGlobalEndpointType_Encoding(),
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
				 getString("_UI_GlobalEndpointType_ref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalEndpointType_ref_feature", "_UI_GlobalEndpointType_type"),
				 CorePackage.eINSTANCE.getGlobalEndpointType_Ref(),
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
				 getString("_UI_GlobalEndpointType_remoteSync_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalEndpointType_remoteSync_feature", "_UI_GlobalEndpointType_type"),
				 CorePackage.eINSTANCE.getGlobalEndpointType_RemoteSync(),
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
				 getString("_UI_GlobalEndpointType_remoteSyncTimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalEndpointType_remoteSyncTimeout_feature", "_UI_GlobalEndpointType_type"),
				 CorePackage.eINSTANCE.getGlobalEndpointType_RemoteSyncTimeout(),
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
				 getString("_UI_GlobalEndpointType_responseTransformerRefs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalEndpointType_responseTransformerRefs_feature", "_UI_GlobalEndpointType_type"),
				 CorePackage.eINSTANCE.getGlobalEndpointType_ResponseTransformerRefs(),
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
				 getString("_UI_GlobalEndpointType_synchronous_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalEndpointType_synchronous_feature", "_UI_GlobalEndpointType_type"),
				 CorePackage.eINSTANCE.getGlobalEndpointType_Synchronous(),
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
				 getString("_UI_GlobalEndpointType_transformerRefs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GlobalEndpointType_transformerRefs_feature", "_UI_GlobalEndpointType_type"),
				 CorePackage.eINSTANCE.getGlobalEndpointType_TransformerRefs(),
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
			childrenFeatures.add(CorePackage.eINSTANCE.getGlobalEndpointType_Group());
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
	 * This returns GlobalEndpointType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GlobalEndpointType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GlobalEndpointType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GlobalEndpointType_type") :
			getString("_UI_GlobalEndpointType_type") + " " + label;
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

		switch (notification.getFeatureID(GlobalEndpointType.class)) {
			case CorePackage.GLOBAL_ENDPOINT_TYPE__ADDRESS:
			case CorePackage.GLOBAL_ENDPOINT_TYPE__CONNECTOR_REF:
			case CorePackage.GLOBAL_ENDPOINT_TYPE__ENCODING:
			case CorePackage.GLOBAL_ENDPOINT_TYPE__REF:
			case CorePackage.GLOBAL_ENDPOINT_TYPE__REMOTE_SYNC:
			case CorePackage.GLOBAL_ENDPOINT_TYPE__REMOTE_SYNC_TIMEOUT:
			case CorePackage.GLOBAL_ENDPOINT_TYPE__RESPONSE_TRANSFORMER_REFS:
			case CorePackage.GLOBAL_ENDPOINT_TYPE__SYNCHRONOUS:
			case CorePackage.GLOBAL_ENDPOINT_TYPE__TRANSFORMER_REFS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.GLOBAL_ENDPOINT_TYPE__GROUP:
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
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_AppendStringTransformer(),
					 CoreFactory.eINSTANCE.createAppendStringTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Base64DecoderTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Base64DecoderTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Base64DecoderTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Base64DecoderTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Base64EncoderTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Base64EncoderTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Base64EncoderTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Base64EncoderTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToHexStringTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToHexStringTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToHexStringTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToHexStringTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToObjectTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToObjectTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToObjectTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToObjectTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToSerializableTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToSerializableTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToSerializableTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToSerializableTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToStringTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToStringTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToStringTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToStringTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_DecryptTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_DecryptTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_DecryptTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_DecryptTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_EncryptTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_EncryptTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_EncryptTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_EncryptTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_GzipCompressTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_GzipCompressTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_GzipCompressTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_GzipCompressTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_GzipUncompressTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_GzipUncompressTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_GzipUncompressTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_GzipUncompressTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_HexStringToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_HexStringToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_HexStringToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_HexStringToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertiesTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_NoActionTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_NoActionTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_NoActionTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_NoActionTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ObjectToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ObjectToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ObjectToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ObjectToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ObjectToStringTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ObjectToStringTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ObjectToStringTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ObjectToStringTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_SerializableToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_SerializableToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_SerializableToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_SerializableToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_StringToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_StringToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_StringToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_StringToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Transformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UcDecoderTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UcDecoderTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UcDecoderTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UcDecoderTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UcEncoderTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UcEncoderTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UcEncoderTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UcEncoderTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UuDecoderTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UuDecoderTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UuDecoderTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UuDecoderTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UuEncoderTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UuEncoderTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UuEncoderTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UuEncoderTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityDecoderTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityDecoderTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityDecoderTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityDecoderTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityEncoderTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityEncoderTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityEncoderTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityEncoderTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getGlobalEndpointType_Transformers(),
					 CoreFactory.eINSTANCE.createTransformersType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getGlobalEndpointType_ResponseTransformers(),
					 CoreFactory.eINSTANCE.createResponseTransformersType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomTransaction(),
					 CoreFactory.eINSTANCE.createCustomTransactionType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_AndFilter(),
					 CoreFactory.eINSTANCE.createCollectionFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomFilter(),
					 CoreFactory.eINSTANCE.createCustomFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ExceptionTypeFilter(),
					 CoreFactory.eINSTANCE.createTypeFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Filter(),
					 CoreFactory.eINSTANCE.createRefFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyFilter(),
					 CoreFactory.eINSTANCE.createPatternFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyFilter(),
					 CoreFactory.eINSTANCE.createWildcardFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_NotFilter(),
					 CoreFactory.eINSTANCE.createUnitaryFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_OrFilter(),
					 CoreFactory.eINSTANCE.createCollectionFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_PayloadTypeFilter(),
					 CoreFactory.eINSTANCE.createTypeFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_RegexFilter(),
					 CoreFactory.eINSTANCE.createPatternFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_RegexFilter(),
					 CoreFactory.eINSTANCE.createWildcardFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_WildcardFilter(),
					 CoreFactory.eINSTANCE.createWildcardFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_EncryptionSecurityFilter(),
					 CoreFactory.eINSTANCE.createEncryptionSecurityFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomConnectionStrategy(),
					 CoreFactory.eINSTANCE.createCustomConnectionStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_RetryConnectionStrategy(),
					 CoreFactory.eINSTANCE.createRetryConnectionStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getGlobalEndpointType_Property(),
					 CoreFactory.eINSTANCE.createKeyValueType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getGlobalEndpointType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getGlobalEndpointType_Properties(),
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
