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
import org.mule.ide.config.core.CustomConnectorType;

import org.mule.ide.config.spring.SpringFactory;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.CustomConnectorType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomConnectorTypeItemProvider
	extends AbstractConnectorTypeItemProvider
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
	public CustomConnectorTypeItemProvider(AdapterFactory adapterFactory) {
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

			addClassPropertyDescriptor(object);
			addCreateDispatcherPerRequestPropertyDescriptor(object);
			addCreateMultipleTransactedReceiversPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
				 getString("_UI_CustomConnectorType_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomConnectorType_class_feature", "_UI_CustomConnectorType_type"),
				 CorePackage.eINSTANCE.getCustomConnectorType_Class(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Create Dispatcher Per Request feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateDispatcherPerRequestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomConnectorType_createDispatcherPerRequest_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomConnectorType_createDispatcherPerRequest_feature", "_UI_CustomConnectorType_type"),
				 CorePackage.eINSTANCE.getCustomConnectorType_CreateDispatcherPerRequest(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Create Multiple Transacted Receivers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreateMultipleTransactedReceiversPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomConnectorType_createMultipleTransactedReceivers_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomConnectorType_createMultipleTransactedReceivers_feature", "_UI_CustomConnectorType_type"),
				 CorePackage.eINSTANCE.getCustomConnectorType_CreateMultipleTransactedReceivers(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
				 getString("_UI_CustomConnectorType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomConnectorType_name_feature", "_UI_CustomConnectorType_type"),
				 CorePackage.eINSTANCE.getCustomConnectorType_Name(),
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
			childrenFeatures.add(CorePackage.eINSTANCE.getCustomConnectorType_Property());
			childrenFeatures.add(CorePackage.eINSTANCE.getCustomConnectorType_ReceiverThreadingProfile());
			childrenFeatures.add(CorePackage.eINSTANCE.getCustomConnectorType_DispatcherThreadingProfile());
			childrenFeatures.add(CorePackage.eINSTANCE.getCustomConnectorType_AbstractExceptionStrategyGroup());
			childrenFeatures.add(CorePackage.eINSTANCE.getCustomConnectorType_ServiceOverrides());
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
	 * This returns CustomConnectorType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CustomConnectorType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * customization
	 */
	@Override
	public String getText(Object object) {
		String label = ((CustomConnectorType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CustomConnectorType_type") :
			label;
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

		switch (notification.getFeatureID(CustomConnectorType.class)) {
			case CorePackage.CUSTOM_CONNECTOR_TYPE__CLASS:
			case CorePackage.CUSTOM_CONNECTOR_TYPE__CREATE_DISPATCHER_PER_REQUEST:
			case CorePackage.CUSTOM_CONNECTOR_TYPE__CREATE_MULTIPLE_TRANSACTED_RECEIVERS:
			case CorePackage.CUSTOM_CONNECTOR_TYPE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.CUSTOM_CONNECTOR_TYPE__PROPERTY:
			case CorePackage.CUSTOM_CONNECTOR_TYPE__RECEIVER_THREADING_PROFILE:
			case CorePackage.CUSTOM_CONNECTOR_TYPE__DISPATCHER_THREADING_PROFILE:
			case CorePackage.CUSTOM_CONNECTOR_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
			case CorePackage.CUSTOM_CONNECTOR_TYPE__SERVICE_OVERRIDES:
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
				(CorePackage.eINSTANCE.getCustomConnectorType_Property(),
				 SpringFactory.eINSTANCE.createPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getCustomConnectorType_ReceiverThreadingProfile(),
				 CoreFactory.eINSTANCE.createThreadingProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getCustomConnectorType_DispatcherThreadingProfile(),
				 CoreFactory.eINSTANCE.createThreadingProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getCustomConnectorType_AbstractExceptionStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomExceptionStrategy(),
					 CoreFactory.eINSTANCE.createCustomExceptionStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getCustomConnectorType_AbstractExceptionStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_DefaultConnectorExceptionStrategy(),
					 CoreFactory.eINSTANCE.createExceptionStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getCustomConnectorType_AbstractExceptionStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_DefaultConnectorExceptionStrategy(),
					 CoreFactory.eINSTANCE.createCustomExceptionStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getCustomConnectorType_AbstractExceptionStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_DefaultServiceExceptionStrategy(),
					 CoreFactory.eINSTANCE.createExceptionStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getCustomConnectorType_AbstractExceptionStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_DefaultServiceExceptionStrategy(),
					 CoreFactory.eINSTANCE.createCustomExceptionStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getCustomConnectorType_ServiceOverrides(),
				 CoreFactory.eINSTANCE.createServiceOverridesType()));
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
			childFeature == CorePackage.eINSTANCE.getCustomConnectorType_ReceiverThreadingProfile() ||
			childFeature == CorePackage.eINSTANCE.getCustomConnectorType_DispatcherThreadingProfile() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomExceptionStrategy() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_DefaultConnectorExceptionStrategy() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_DefaultServiceExceptionStrategy();

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
