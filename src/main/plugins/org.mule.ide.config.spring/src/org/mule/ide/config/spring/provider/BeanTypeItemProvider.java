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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mule.ide.config.spring.BeanType;
import org.mule.ide.config.spring.SpringPlugin;
import org.mule.ide.config.spring.SpringFactory;
import org.mule.ide.config.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.spring.BeanType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BeanTypeItemProvider
	extends IdentifiedTypeItemProvider
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
	public BeanTypeItemProvider(AdapterFactory adapterFactory) {
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

			addAbstractPropertyDescriptor(object);
			addAutowirePropertyDescriptor(object);
			addAutowireCandidatePropertyDescriptor(object);
			addClassPropertyDescriptor(object);
			addDependencyCheckPropertyDescriptor(object);
			addDependsOnPropertyDescriptor(object);
			addDestroyMethodPropertyDescriptor(object);
			addFactoryBeanPropertyDescriptor(object);
			addFactoryMethodPropertyDescriptor(object);
			addInitMethodPropertyDescriptor(object);
			addLazyInitPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addParentPropertyDescriptor(object);
			addScopePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeanType_abstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeanType_abstract_feature", "_UI_BeanType_type"),
				 SpringPackage.Literals.BEAN_TYPE__ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Autowire feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutowirePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeanType_autowire_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeanType_autowire_feature", "_UI_BeanType_type"),
				 SpringPackage.Literals.BEAN_TYPE__AUTOWIRE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Autowire Candidate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAutowireCandidatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeanType_autowireCandidate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeanType_autowireCandidate_feature", "_UI_BeanType_type"),
				 SpringPackage.Literals.BEAN_TYPE__AUTOWIRE_CANDIDATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Class feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeanType_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeanType_class_feature", "_UI_BeanType_type"),
				 SpringPackage.Literals.BEAN_TYPE__CLASS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dependency Check feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependencyCheckPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeanType_dependencyCheck_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeanType_dependencyCheck_feature", "_UI_BeanType_type"),
				 SpringPackage.Literals.BEAN_TYPE__DEPENDENCY_CHECK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Depends On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependsOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeanType_dependsOn_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeanType_dependsOn_feature", "_UI_BeanType_type"),
				 SpringPackage.Literals.BEAN_TYPE__DEPENDS_ON,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Destroy Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDestroyMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeanType_destroyMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeanType_destroyMethod_feature", "_UI_BeanType_type"),
				 SpringPackage.Literals.BEAN_TYPE__DESTROY_METHOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Factory Bean feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFactoryBeanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeanType_factoryBean_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeanType_factoryBean_feature", "_UI_BeanType_type"),
				 SpringPackage.Literals.BEAN_TYPE__FACTORY_BEAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Factory Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFactoryMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeanType_factoryMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeanType_factoryMethod_feature", "_UI_BeanType_type"),
				 SpringPackage.Literals.BEAN_TYPE__FACTORY_METHOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Init Method feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInitMethodPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeanType_initMethod_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeanType_initMethod_feature", "_UI_BeanType_type"),
				 SpringPackage.Literals.BEAN_TYPE__INIT_METHOD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Lazy Init feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLazyInitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeanType_lazyInit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeanType_lazyInit_feature", "_UI_BeanType_type"),
				 SpringPackage.Literals.BEAN_TYPE__LAZY_INIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
				 getString("_UI_BeanType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeanType_name_feature", "_UI_BeanType_type"),
				 SpringPackage.Literals.BEAN_TYPE__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeanType_parent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeanType_parent_feature", "_UI_BeanType_type"),
				 SpringPackage.Literals.BEAN_TYPE__PARENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Scope feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addScopePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_BeanType_scope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_BeanType_scope_feature", "_UI_BeanType_type"),
				 SpringPackage.Literals.BEAN_TYPE__SCOPE,
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
			childrenFeatures.add(SpringPackage.Literals.BEAN_TYPE__DESCRIPTION);
			childrenFeatures.add(SpringPackage.Literals.BEAN_TYPE__GROUP);
			childrenFeatures.add(SpringPackage.Literals.BEAN_TYPE__ANY_ATTRIBUTE);
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
	 * This returns BeanType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/BeanType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((BeanType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_BeanType_type") :
			getString("_UI_BeanType_type") + " " + label;
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

		switch (notification.getFeatureID(BeanType.class)) {
			case SpringPackage.BEAN_TYPE__ABSTRACT:
			case SpringPackage.BEAN_TYPE__AUTOWIRE:
			case SpringPackage.BEAN_TYPE__AUTOWIRE_CANDIDATE:
			case SpringPackage.BEAN_TYPE__CLASS:
			case SpringPackage.BEAN_TYPE__DEPENDENCY_CHECK:
			case SpringPackage.BEAN_TYPE__DEPENDS_ON:
			case SpringPackage.BEAN_TYPE__DESTROY_METHOD:
			case SpringPackage.BEAN_TYPE__FACTORY_BEAN:
			case SpringPackage.BEAN_TYPE__FACTORY_METHOD:
			case SpringPackage.BEAN_TYPE__INIT_METHOD:
			case SpringPackage.BEAN_TYPE__LAZY_INIT:
			case SpringPackage.BEAN_TYPE__NAME:
			case SpringPackage.BEAN_TYPE__PARENT:
			case SpringPackage.BEAN_TYPE__SCOPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SpringPackage.BEAN_TYPE__DESCRIPTION:
			case SpringPackage.BEAN_TYPE__GROUP:
			case SpringPackage.BEAN_TYPE__ANY_ATTRIBUTE:
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
				(SpringPackage.Literals.BEAN_TYPE__DESCRIPTION,
				 SpringFactory.eINSTANCE.createDescriptionType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.BEAN_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.BEAN_TYPE__META,
					 SpringFactory.eINSTANCE.createMetaType())));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.BEAN_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.BEAN_TYPE__CONSTRUCTOR_ARG,
					 SpringFactory.eINSTANCE.createConstructorArgType())));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.BEAN_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.BEAN_TYPE__PROPERTY,
					 SpringFactory.eINSTANCE.createPropertyType())));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.BEAN_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.BEAN_TYPE__LOOKUP_METHOD,
					 SpringFactory.eINSTANCE.createLookupMethodType())));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.BEAN_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(SpringPackage.Literals.BEAN_TYPE__REPLACED_METHOD,
					 SpringFactory.eINSTANCE.createReplacedMethodType())));
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
