/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.axis.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

import org.mule.ide.config.axis.AxisPackage;
import org.mule.ide.config.axis.OptionsType;

import org.mule.ide.config.core.CoreFactory;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.axis.OptionsType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OptionsTypeItemProvider
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
	public OptionsTypeItemProvider(AdapterFactory adapterFactory) {
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

			addAllowedMethodsPropertyDescriptor(object);
			addExtraClassesPropertyDescriptor(object);
			addScopePropertyDescriptor(object);
			addWsdlInputSchemaPropertyDescriptor(object);
			addWsdlPortTypePropertyDescriptor(object);
			addWsdlServiceElementPropertyDescriptor(object);
			addWsdlServicePortPropertyDescriptor(object);
			addWsdlSoapActionModePropertyDescriptor(object);
			addWsdlTargetNamespacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Allowed Methods feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAllowedMethodsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OptionsType_allowedMethods_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OptionsType_allowedMethods_feature", "_UI_OptionsType_type"),
				 AxisPackage.Literals.OPTIONS_TYPE__ALLOWED_METHODS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Extra Classes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtraClassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OptionsType_extraClasses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OptionsType_extraClasses_feature", "_UI_OptionsType_type"),
				 AxisPackage.Literals.OPTIONS_TYPE__EXTRA_CLASSES,
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
				 getString("_UI_OptionsType_scope_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OptionsType_scope_feature", "_UI_OptionsType_type"),
				 AxisPackage.Literals.OPTIONS_TYPE__SCOPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wsdl Input Schema feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWsdlInputSchemaPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OptionsType_wsdlInputSchema_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OptionsType_wsdlInputSchema_feature", "_UI_OptionsType_type"),
				 AxisPackage.Literals.OPTIONS_TYPE__WSDL_INPUT_SCHEMA,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wsdl Port Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWsdlPortTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OptionsType_wsdlPortType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OptionsType_wsdlPortType_feature", "_UI_OptionsType_type"),
				 AxisPackage.Literals.OPTIONS_TYPE__WSDL_PORT_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wsdl Service Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWsdlServiceElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OptionsType_wsdlServiceElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OptionsType_wsdlServiceElement_feature", "_UI_OptionsType_type"),
				 AxisPackage.Literals.OPTIONS_TYPE__WSDL_SERVICE_ELEMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wsdl Service Port feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWsdlServicePortPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OptionsType_wsdlServicePort_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OptionsType_wsdlServicePort_feature", "_UI_OptionsType_type"),
				 AxisPackage.Literals.OPTIONS_TYPE__WSDL_SERVICE_PORT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wsdl Soap Action Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWsdlSoapActionModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OptionsType_wsdlSoapActionMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OptionsType_wsdlSoapActionMode_feature", "_UI_OptionsType_type"),
				 AxisPackage.Literals.OPTIONS_TYPE__WSDL_SOAP_ACTION_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wsdl Target Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWsdlTargetNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OptionsType_wsdlTargetNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OptionsType_wsdlTargetNamespace_feature", "_UI_OptionsType_type"),
				 AxisPackage.Literals.OPTIONS_TYPE__WSDL_TARGET_NAMESPACE,
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
			childrenFeatures.add(AxisPackage.Literals.OPTIONS_TYPE__OPTION);
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
	 * This returns OptionsType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OptionsType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OptionsType)object).getWsdlTargetNamespace();
		return label == null || label.length() == 0 ?
			getString("_UI_OptionsType_type") :
			getString("_UI_OptionsType_type") + " " + label;
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

		switch (notification.getFeatureID(OptionsType.class)) {
			case AxisPackage.OPTIONS_TYPE__ALLOWED_METHODS:
			case AxisPackage.OPTIONS_TYPE__EXTRA_CLASSES:
			case AxisPackage.OPTIONS_TYPE__SCOPE:
			case AxisPackage.OPTIONS_TYPE__WSDL_INPUT_SCHEMA:
			case AxisPackage.OPTIONS_TYPE__WSDL_PORT_TYPE:
			case AxisPackage.OPTIONS_TYPE__WSDL_SERVICE_ELEMENT:
			case AxisPackage.OPTIONS_TYPE__WSDL_SERVICE_PORT:
			case AxisPackage.OPTIONS_TYPE__WSDL_SOAP_ACTION_MODE:
			case AxisPackage.OPTIONS_TYPE__WSDL_TARGET_NAMESPACE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AxisPackage.OPTIONS_TYPE__OPTION:
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
				(AxisPackage.Literals.OPTIONS_TYPE__OPTION,
				 CoreFactory.eINSTANCE.createKeyValueType()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MuleaxisEditPlugin.INSTANCE;
	}

}
