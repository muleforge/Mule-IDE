/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring.provider;


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

import org.mule.ide.config.spring.EntryType;
import org.mule.ide.config.spring.SpringFactory;
import org.mule.ide.config.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.spring.EntryType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EntryTypeItemProvider
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
	public EntryTypeItemProvider(AdapterFactory adapterFactory) {
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

			addKey1PropertyDescriptor(object);
			addKeyRefPropertyDescriptor(object);
			addValue1PropertyDescriptor(object);
			addValueRefPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Key1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKey1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntryType_key1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntryType_key1_feature", "_UI_EntryType_type"),
				 SpringPackage.Literals.ENTRY_TYPE__KEY1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Key Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntryType_keyRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntryType_keyRef_feature", "_UI_EntryType_type"),
				 SpringPackage.Literals.ENTRY_TYPE__KEY_REF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValue1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntryType_value1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntryType_value1_feature", "_UI_EntryType_type"),
				 SpringPackage.Literals.ENTRY_TYPE__VALUE1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValueRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_EntryType_valueRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_EntryType_valueRef_feature", "_UI_EntryType_type"),
				 SpringPackage.Literals.ENTRY_TYPE__VALUE_REF,
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
			childrenFeatures.add(SpringPackage.Literals.ENTRY_TYPE__KEY);
			childrenFeatures.add(SpringPackage.Literals.ENTRY_TYPE__GROUP);
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
	 * This returns EntryType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/EntryType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((EntryType)object).getKey1();
		return label == null || label.length() == 0 ?
			getString("_UI_EntryType_type") :
			getString("_UI_EntryType_type") + " " + label;
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

		switch (notification.getFeatureID(EntryType.class)) {
			case SpringPackage.ENTRY_TYPE__KEY1:
			case SpringPackage.ENTRY_TYPE__KEY_REF:
			case SpringPackage.ENTRY_TYPE__VALUE1:
			case SpringPackage.ENTRY_TYPE__VALUE_REF:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpringPackage.ENTRY_TYPE__KEY:
			case SpringPackage.ENTRY_TYPE__GROUP:
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
				(SpringPackage.Literals.ENTRY_TYPE__KEY,
				 SpringFactory.eINSTANCE.createKeyType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.ENTRY_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.ENTRY_TYPE__BEAN,
					 SpringFactory.eINSTANCE.createBeanType())));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.ENTRY_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.ENTRY_TYPE__REF,
					 SpringFactory.eINSTANCE.createRefType())));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.ENTRY_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.ENTRY_TYPE__IDREF,
					 SpringFactory.eINSTANCE.createIdrefType())));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.ENTRY_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.ENTRY_TYPE__VALUE,
					 SpringFactory.eINSTANCE.createValueType())));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.ENTRY_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.ENTRY_TYPE__NULL,
					 SpringFactory.eINSTANCE.createNullType())));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.ENTRY_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.ENTRY_TYPE__LIST,
					 SpringFactory.eINSTANCE.createListOrSetType())));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.ENTRY_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.ENTRY_TYPE__SET,
					 SpringFactory.eINSTANCE.createListOrSetType())));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.ENTRY_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.ENTRY_TYPE__MAP,
					 SpringFactory.eINSTANCE.createMapType())));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.ENTRY_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.ENTRY_TYPE__PROPS,
					 SpringFactory.eINSTANCE.createPropsType())));
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
			childFeature == SpringPackage.Literals.ENTRY_TYPE__LIST ||
			childFeature == SpringPackage.Literals.ENTRY_TYPE__SET;

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
		return Springbeans2EditPlugin.INSTANCE;
	}

}
