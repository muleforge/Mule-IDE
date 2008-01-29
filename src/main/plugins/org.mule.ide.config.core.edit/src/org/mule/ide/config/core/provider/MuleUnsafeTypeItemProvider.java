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

import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.MuleUnsafeType;

import org.mule.ide.config.spring.SpringFactory;
import org.mule.ide.config.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.MuleUnsafeType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MuleUnsafeTypeItemProvider
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
	public MuleUnsafeTypeItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MuleUnsafeType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MuleUnsafeType_name_feature", "_UI_MuleUnsafeType_type"),
				 CorePackage.eINSTANCE.getMuleUnsafeType_Name(),
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
			childrenFeatures.add(CorePackage.eINSTANCE.getMuleUnsafeType_Group());
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
	 * This returns MuleUnsafeType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MuleUnsafeType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MuleUnsafeType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_MuleUnsafeType_type") :
			getString("_UI_MuleUnsafeType_type") + " " + label;
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

		switch (notification.getFeatureID(MuleUnsafeType.class)) {
			case CorePackage.MULE_UNSAFE_TYPE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.MULE_UNSAFE_TYPE__GROUP:
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
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getMuleUnsafeType_EnvironmentProperty(),
					 CoreFactory.eINSTANCE.createEnvironmentPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getMuleUnsafeType_AdminAgent(),
					 CoreFactory.eINSTANCE.createAdminAgentType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getMuleUnsafeType_Configuration(),
					 CoreFactory.eINSTANCE.createManagementContextType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getMuleUnsafeType_Notifications(),
					 CoreFactory.eINSTANCE.createNotificationManagerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getMuleUnsafeType_Description(),
					 CoreFactory.eINSTANCE.createDescriptionType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_SecurityManager(),
					 CoreFactory.eINSTANCE.createSecurityManagerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomTransactionManager(),
					 CoreFactory.eINSTANCE.createCustomTransactionManagerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_JbossTransactionManager(),
					 CoreFactory.eINSTANCE.createTransactionManagerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_JndiTransactionManager(),
					 CoreFactory.eINSTANCE.createTransactionManagerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_JrunTransactionManager(),
					 CoreFactory.eINSTANCE.createTransactionManagerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ResinTransactionManager(),
					 CoreFactory.eINSTANCE.createTransactionManagerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_WeblogicTransactionManager(),
					 CoreFactory.eINSTANCE.createJndiTransactionManagerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_WeblogicTransactionManager(),
					 CoreFactory.eINSTANCE.createCustomTransactionManagerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_WebsphereTransactionManager(),
					 CoreFactory.eINSTANCE.createTransactionManagerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomConnector(),
					 CoreFactory.eINSTANCE.createCustomConnectorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Endpoint(),
					 CoreFactory.eINSTANCE.createGlobalEndpointType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_AppendStringTransformer(),
					 CoreFactory.eINSTANCE.createAppendStringTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Base64DecoderTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Base64DecoderTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Base64DecoderTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Base64DecoderTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Base64EncoderTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Base64EncoderTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Base64EncoderTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Base64EncoderTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToHexStringTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToHexStringTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToHexStringTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToHexStringTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToObjectTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToObjectTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToObjectTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToObjectTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToSerializableTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToSerializableTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToSerializableTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToSerializableTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToStringTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToStringTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToStringTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToStringTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_DecryptTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_DecryptTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_DecryptTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_DecryptTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_EncryptTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_EncryptTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_EncryptTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_EncryptTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_GzipCompressTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_GzipCompressTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_GzipCompressTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_GzipCompressTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_GzipUncompressTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_GzipUncompressTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_GzipUncompressTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_GzipUncompressTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_HexStringToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_HexStringToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_HexStringToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_HexStringToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertiesTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_NoActionTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_NoActionTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_NoActionTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_NoActionTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ObjectToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ObjectToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ObjectToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ObjectToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ObjectToStringTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ObjectToStringTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ObjectToStringTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ObjectToStringTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_SerializableToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_SerializableToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_SerializableToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_SerializableToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_StringToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_StringToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_StringToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_StringToByteArrayTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Transformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UcDecoderTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UcDecoderTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UcDecoderTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UcDecoderTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UcEncoderTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UcEncoderTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UcEncoderTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UcEncoderTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UuDecoderTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UuDecoderTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UuDecoderTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UuDecoderTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UuEncoderTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UuEncoderTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UuEncoderTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_UuEncoderTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityDecoderTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityDecoderTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityDecoderTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityDecoderTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityEncoderTransformer(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityEncoderTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityEncoderTransformer(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_XmlEntityEncoderTransformer(),
					 CoreFactory.eINSTANCE.createRefTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_AndFilter(),
					 CoreFactory.eINSTANCE.createCollectionFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomFilter(),
					 CoreFactory.eINSTANCE.createCustomFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ExceptionTypeFilter(),
					 CoreFactory.eINSTANCE.createTypeFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Filter(),
					 CoreFactory.eINSTANCE.createRefFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyFilter(),
					 CoreFactory.eINSTANCE.createPatternFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyFilter(),
					 CoreFactory.eINSTANCE.createWildcardFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_NotFilter(),
					 CoreFactory.eINSTANCE.createUnitaryFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_OrFilter(),
					 CoreFactory.eINSTANCE.createCollectionFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_PayloadTypeFilter(),
					 CoreFactory.eINSTANCE.createTypeFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_RegexFilter(),
					 CoreFactory.eINSTANCE.createPatternFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_RegexFilter(),
					 CoreFactory.eINSTANCE.createWildcardFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_WildcardFilter(),
					 CoreFactory.eINSTANCE.createWildcardFilterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Model(),
					 CoreFactory.eINSTANCE.createDefaultModelType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_SedaModel(),
					 CoreFactory.eINSTANCE.createSedaModelType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_SedaModel(),
					 CoreFactory.eINSTANCE.createDefaultModelType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__ALIAS,
					 SpringFactory.eINSTANCE.createAliasType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__ARG_TYPE,
					 SpringFactory.eINSTANCE.createArgTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__BEAN,
					 SpringFactory.eINSTANCE.createBeanType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__BEANS,
					 SpringFactory.eINSTANCE.createBeansType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__CONSTRUCTOR_ARG,
					 SpringFactory.eINSTANCE.createConstructorArgType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__DESCRIPTION,
					 SpringFactory.eINSTANCE.createDescriptionType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__ENTRY,
					 SpringFactory.eINSTANCE.createEntryType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__IDREF,
					 SpringFactory.eINSTANCE.createIdrefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__IMPORT,
					 SpringFactory.eINSTANCE.createImportType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__KEY,
					 SpringFactory.eINSTANCE.createKeyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__LIST,
					 CoreFactory.eINSTANCE.createListOrSetType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__LIST,
					 SpringFactory.eINSTANCE.createListOrSetType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__LOOKUP_METHOD,
					 SpringFactory.eINSTANCE.createLookupMethodType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__MAP,
					 CoreFactory.eINSTANCE.createMapType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__MAP,
					 SpringFactory.eINSTANCE.createMapType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__META,
					 SpringFactory.eINSTANCE.createMetaType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__NULL,
					 SpringFactory.eINSTANCE.createNullType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__PROP,
					 SpringFactory.eINSTANCE.createPropType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__PROPERTY,
					 SpringFactory.eINSTANCE.createPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__PROPS,
					 SpringFactory.eINSTANCE.createPropsType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__REF,
					 SpringFactory.eINSTANCE.createRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__REPLACED_METHOD,
					 SpringFactory.eINSTANCE.createReplacedMethodType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__SET,
					 CoreFactory.eINSTANCE.createListOrSetType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__SET,
					 SpringFactory.eINSTANCE.createListOrSetType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__VALUE,
					 SpringFactory.eINSTANCE.createValueType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__ALIAS,
					 SpringFactory.eINSTANCE.createAliasType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__ARG_TYPE,
					 SpringFactory.eINSTANCE.createArgTypeType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__BEAN,
					 SpringFactory.eINSTANCE.createBeanType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__BEANS,
					 SpringFactory.eINSTANCE.createBeansType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__CONSTRUCTOR_ARG,
					 SpringFactory.eINSTANCE.createConstructorArgType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__DESCRIPTION,
					 SpringFactory.eINSTANCE.createDescriptionType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__ENTRY,
					 SpringFactory.eINSTANCE.createEntryType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__IDREF,
					 SpringFactory.eINSTANCE.createIdrefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__IMPORT,
					 SpringFactory.eINSTANCE.createImportType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__KEY,
					 SpringFactory.eINSTANCE.createKeyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__LIST,
					 CoreFactory.eINSTANCE.createListOrSetType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__LIST,
					 SpringFactory.eINSTANCE.createListOrSetType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__LOOKUP_METHOD,
					 SpringFactory.eINSTANCE.createLookupMethodType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__MAP,
					 CoreFactory.eINSTANCE.createMapType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__MAP,
					 SpringFactory.eINSTANCE.createMapType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__META,
					 SpringFactory.eINSTANCE.createMetaType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__NULL,
					 SpringFactory.eINSTANCE.createNullType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__PROP,
					 SpringFactory.eINSTANCE.createPropType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__PROPERTY,
					 SpringFactory.eINSTANCE.createPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__PROPS,
					 SpringFactory.eINSTANCE.createPropsType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__REF,
					 SpringFactory.eINSTANCE.createRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__REPLACED_METHOD,
					 SpringFactory.eINSTANCE.createReplacedMethodType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__SET,
					 CoreFactory.eINSTANCE.createListOrSetType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__SET,
					 SpringFactory.eINSTANCE.createListOrSetType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.DOCUMENT_ROOT__VALUE,
					 SpringFactory.eINSTANCE.createValueType())));
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
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomTransactionManager() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_WeblogicTransactionManager() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_JbossTransactionManager() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_JndiTransactionManager() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_JrunTransactionManager() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ResinTransactionManager() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_WebsphereTransactionManager() ||
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
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_WildcardFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_Model() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_SedaModel() ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__ALIAS ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__ARG_TYPE ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__BEAN ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__BEANS ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__CONSTRUCTOR_ARG ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__DESCRIPTION ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__ENTRY ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__IDREF ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__IMPORT ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__KEY ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__LIST ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__SET ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__LOOKUP_METHOD ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__MAP ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__META ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__NULL ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__PROP ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__PROPERTY ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__PROPS ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__REF ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__REPLACED_METHOD ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__VALUE;

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
