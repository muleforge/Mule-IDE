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
import org.mule.ide.config.core.SelectiveConsumerRouterType;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.SelectiveConsumerRouterType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SelectiveConsumerRouterTypeItemProvider
	extends FilteredInboundRouterTypeItemProvider
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
	public SelectiveConsumerRouterTypeItemProvider(AdapterFactory adapterFactory) {
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

			addTransformerRefsPropertyDescriptor(object);
			addTransformFirstPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_SelectiveConsumerRouterType_transformerRefs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SelectiveConsumerRouterType_transformerRefs_feature", "_UI_SelectiveConsumerRouterType_type"),
				 CorePackage.eINSTANCE.getSelectiveConsumerRouterType_TransformerRefs(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Transform First feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTransformFirstPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SelectiveConsumerRouterType_transformFirst_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SelectiveConsumerRouterType_transformFirst_feature", "_UI_SelectiveConsumerRouterType_type"),
				 CorePackage.eINSTANCE.getSelectiveConsumerRouterType_TransformFirst(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup());
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
	 * This returns SelectiveConsumerRouterType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SelectiveConsumerRouterType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		List labelValue = ((SelectiveConsumerRouterType)object).getTransformerRefs();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_SelectiveConsumerRouterType_type") :
			getString("_UI_SelectiveConsumerRouterType_type") + " " + label;
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

		switch (notification.getFeatureID(SelectiveConsumerRouterType.class)) {
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__TRANSFORMER_REFS:
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__TRANSFORM_FIRST:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP:
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
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomTransformer(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Transformer(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerAppendString(),
					 CoreFactory.eINSTANCE.createTransformerAppendStringType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Decoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerBase64Encoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToHexString(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToObject(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToSerializable(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerByteArrayToString(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerDecrypt(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerEncrypt(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipCompress(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerGzipUncompress(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerHexStingToByteArray(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerMessageProperties(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerNoAction(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToByteArray(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerObjectToString(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerSerializableToByteArray(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerStringToByteArray(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcDecoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUcEncoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuDecoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerUuEncoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityDecoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(),
					 CoreFactory.eINSTANCE.createAbstractTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(),
					 CoreFactory.eINSTANCE.createCustomTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(),
					 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformerGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TransformerXmlEntityEncoder(),
					 CoreFactory.eINSTANCE.createTransformerRefType())));
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
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_AndFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_OrFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ExceptionTypeFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_PayloadTypeFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_RegexFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_WildcardFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_BeanPropertyExtractor() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CorrelationPropertyExtractor() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MapPropertyExtractor() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyExtractor() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_PayloadPropertyExtractor() ||
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
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TransformerMessageProperties();

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
