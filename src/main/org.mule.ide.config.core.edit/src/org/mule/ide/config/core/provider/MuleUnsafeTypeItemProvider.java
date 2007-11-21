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
					 CoreFactory.eINSTANCE.createMuleAdminAgentType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getMuleUnsafeType_Configuration(),
					 CoreFactory.eINSTANCE.createMuleManagementContextType())));

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
					(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJboss(),
					 CoreFactory.eINSTANCE.createTransactionManagerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJndi(),
					 CoreFactory.eINSTANCE.createTransactionManagerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJrun(),
					 CoreFactory.eINSTANCE.createTransactionManagerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerResin(),
					 CoreFactory.eINSTANCE.createTransactionManagerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerWeblogic(),
					 CoreFactory.eINSTANCE.createJndiTransactionManagerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerWeblogic(),
					 CoreFactory.eINSTANCE.createCustomTransactionManagerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerWebsphere(),
					 CoreFactory.eINSTANCE.createTransactionManagerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomTransactionFactory(),
					 CoreFactory.eINSTANCE.createCustomTransactionFactoryType())));

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
					(CorePackage.eINSTANCE.getDocumentRoot_CustomTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Transformer(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerAppendString(),
					 CoreFactory.eINSTANCE.createTransformerAppendStringType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerMessageProperties(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleUnsafeType_Group(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

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
					 CoreFactory.eINSTANCE.createFilterRefType())));

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
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerWeblogic() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJboss() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJndi() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerJrun() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerResin() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransactionManagerWebsphere() ||
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
