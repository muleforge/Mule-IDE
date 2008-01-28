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

import org.mule.ide.config.spring.BeansType;
import org.mule.ide.config.spring.DefaultAutowireType;
import org.mule.ide.config.spring.SpringFactory;
import org.mule.ide.config.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.spring.BeansType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BeansTypeItemProvider
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
	public BeansTypeItemProvider(AdapterFactory adapterFactory) {
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

			addDefaultAutowirePropertyDescriptor(object);
			addDefaultDependencyCheckPropertyDescriptor(object);
			addDefaultDestroyMethodPropertyDescriptor(object);
			addDefaultInitMethodPropertyDescriptor(object);
			addDefaultLazyInitPropertyDescriptor(object);
			addDefaultMergePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Default Autowire feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultAutowirePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeansType_defaultAutowire_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeansType_defaultAutowire_feature", "_UI_BeansType_type"),
				 SpringPackage.Literals.BEANS_TYPE__DEFAULT_AUTOWIRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Dependency Check feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultDependencyCheckPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeansType_defaultDependencyCheck_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeansType_defaultDependencyCheck_feature", "_UI_BeansType_type"),
				 SpringPackage.Literals.BEANS_TYPE__DEFAULT_DEPENDENCY_CHECK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Destroy Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultDestroyMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeansType_defaultDestroyMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeansType_defaultDestroyMethod_feature", "_UI_BeansType_type"),
				 SpringPackage.Literals.BEANS_TYPE__DEFAULT_DESTROY_METHOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Init Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultInitMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeansType_defaultInitMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeansType_defaultInitMethod_feature", "_UI_BeansType_type"),
				 SpringPackage.Literals.BEANS_TYPE__DEFAULT_INIT_METHOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Lazy Init feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultLazyInitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeansType_defaultLazyInit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeansType_defaultLazyInit_feature", "_UI_BeansType_type"),
				 SpringPackage.Literals.BEANS_TYPE__DEFAULT_LAZY_INIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Merge feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultMergePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeansType_defaultMerge_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeansType_defaultMerge_feature", "_UI_BeansType_type"),
				 SpringPackage.Literals.BEANS_TYPE__DEFAULT_MERGE,
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
			childrenFeatures.add(SpringPackage.Literals.BEANS_TYPE__DESCRIPTION);
			childrenFeatures.add(SpringPackage.Literals.BEANS_TYPE__GROUP);
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
	 * This returns BeansType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BeansType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		DefaultAutowireType labelValue = ((BeansType)object).getDefaultAutowire();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_BeansType_type") :
			getString("_UI_BeansType_type") + " " + label;
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

		switch (notification.getFeatureID(BeansType.class)) {
			case SpringPackage.BEANS_TYPE__DEFAULT_AUTOWIRE:
			case SpringPackage.BEANS_TYPE__DEFAULT_DEPENDENCY_CHECK:
			case SpringPackage.BEANS_TYPE__DEFAULT_DESTROY_METHOD:
			case SpringPackage.BEANS_TYPE__DEFAULT_INIT_METHOD:
			case SpringPackage.BEANS_TYPE__DEFAULT_LAZY_INIT:
			case SpringPackage.BEANS_TYPE__DEFAULT_MERGE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpringPackage.BEANS_TYPE__DESCRIPTION:
			case SpringPackage.BEANS_TYPE__GROUP:
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
				(SpringPackage.Literals.BEANS_TYPE__DESCRIPTION,
				 SpringFactory.eINSTANCE.createDescriptionType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.BEANS_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.BEANS_TYPE__IMPORT,
					 SpringFactory.eINSTANCE.createImportType())));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.BEANS_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.BEANS_TYPE__ALIAS,
					 SpringFactory.eINSTANCE.createAliasType())));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.BEANS_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.BEANS_TYPE__BEAN,
					 SpringFactory.eINSTANCE.createBeanType())));
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
