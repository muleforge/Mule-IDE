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

import org.mule.ide.config.spring.ConstructorArgType;
import org.mule.ide.config.spring.SpringPlugin;
import org.mule.ide.config.spring.SpringFactory;
import org.mule.ide.config.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.spring.ConstructorArgType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConstructorArgTypeItemProvider
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
	public ConstructorArgTypeItemProvider(AdapterFactory adapterFactory) {
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

			addIndexPropertyDescriptor(object);
			addRef1PropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addValue1PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Index feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIndexPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConstructorArgType_index_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstructorArgType_index_feature", "_UI_ConstructorArgType_type"),
				 SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__INDEX,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ref1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRef1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConstructorArgType_ref1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstructorArgType_ref1_feature", "_UI_ConstructorArgType_type"),
				 SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__REF1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ConstructorArgType_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstructorArgType_type_feature", "_UI_ConstructorArgType_type"),
				 SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__TYPE,
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
				 getString("_UI_ConstructorArgType_value1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ConstructorArgType_value1_feature", "_UI_ConstructorArgType_type"),
				 SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__VALUE1,
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
			childrenFeatures.add(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__DESCRIPTION);
			childrenFeatures.add(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__BEAN);
			childrenFeatures.add(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__REF);
			childrenFeatures.add(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__IDREF);
			childrenFeatures.add(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__VALUE);
			childrenFeatures.add(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__NULL);
			childrenFeatures.add(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__LIST);
			childrenFeatures.add(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__SET);
			childrenFeatures.add(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__MAP);
			childrenFeatures.add(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__PROPS);
			childrenFeatures.add(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__ANY);
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
		String label = ((ConstructorArgType)object).getIndex();
		return label == null || label.length() == 0 ?
			getString("_UI_ConstructorArgType_type") :
			getString("_UI_ConstructorArgType_type") + " " + label;
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

		switch (notification.getFeatureID(ConstructorArgType.class)) {
			case SpringPackage.CONSTRUCTOR_ARG_TYPE__INDEX:
			case SpringPackage.CONSTRUCTOR_ARG_TYPE__REF1:
			case SpringPackage.CONSTRUCTOR_ARG_TYPE__TYPE:
			case SpringPackage.CONSTRUCTOR_ARG_TYPE__VALUE1:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpringPackage.CONSTRUCTOR_ARG_TYPE__DESCRIPTION:
			case SpringPackage.CONSTRUCTOR_ARG_TYPE__BEAN:
			case SpringPackage.CONSTRUCTOR_ARG_TYPE__REF:
			case SpringPackage.CONSTRUCTOR_ARG_TYPE__IDREF:
			case SpringPackage.CONSTRUCTOR_ARG_TYPE__VALUE:
			case SpringPackage.CONSTRUCTOR_ARG_TYPE__NULL:
			case SpringPackage.CONSTRUCTOR_ARG_TYPE__LIST:
			case SpringPackage.CONSTRUCTOR_ARG_TYPE__SET:
			case SpringPackage.CONSTRUCTOR_ARG_TYPE__MAP:
			case SpringPackage.CONSTRUCTOR_ARG_TYPE__PROPS:
			case SpringPackage.CONSTRUCTOR_ARG_TYPE__ANY:
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
				(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__DESCRIPTION,
				 SpringFactory.eINSTANCE.createDescriptionType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__BEAN,
				 SpringFactory.eINSTANCE.createBeanType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__REF,
				 SpringFactory.eINSTANCE.createRefType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__IDREF,
				 SpringFactory.eINSTANCE.createIdrefType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__VALUE,
				 SpringFactory.eINSTANCE.createValueType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__NULL,
				 SpringFactory.eINSTANCE.createNullType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__LIST,
				 SpringFactory.eINSTANCE.createListOrSetType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__SET,
				 SpringFactory.eINSTANCE.createListOrSetType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__MAP,
				 SpringFactory.eINSTANCE.createMapType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__PROPS,
				 SpringFactory.eINSTANCE.createPropsType()));
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
			childFeature == SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__LIST ||
			childFeature == SpringPackage.Literals.CONSTRUCTOR_ARG_TYPE__SET;

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
				SpringPlugin.INSTANCE.log(e);
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
		return SpringPlugin.INSTANCE;
	}

}
