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

import org.mule.ide.config.core.AbstractModelType;
import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.AbstractModelType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractModelTypeItemProvider
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
	public AbstractModelTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_AbstractModelType_class_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractModelType_class_feature", "_UI_AbstractModelType_type"),
				 CorePackage.eINSTANCE.getAbstractModelType_Class(),
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
				 getString("_UI_AbstractModelType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractModelType_name_feature", "_UI_AbstractModelType_type"),
				 CorePackage.eINSTANCE.getAbstractModelType_Name(),
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
			childrenFeatures.add(CorePackage.eINSTANCE.getAbstractModelType_AbstractExceptionStrategyGroup());
			childrenFeatures.add(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverSetGroup());
			childrenFeatures.add(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverGroup());
			childrenFeatures.add(CorePackage.eINSTANCE.getAbstractModelType_AbstractServiceGroup());
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
	 * This returns AbstractModelType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AbstractModelType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractModelType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_AbstractModelType_type") :
			getString("_UI_AbstractModelType_type") + " " + label;
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

		switch (notification.getFeatureID(AbstractModelType.class)) {
			case CorePackage.ABSTRACT_MODEL_TYPE__CLASS:
			case CorePackage.ABSTRACT_MODEL_TYPE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_EXCEPTION_STRATEGY_GROUP:
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP:
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP:
			case CorePackage.ABSTRACT_MODEL_TYPE__ABSTRACT_SERVICE_GROUP:
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
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractExceptionStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomExceptionStrategy(),
					 CoreFactory.eINSTANCE.createCustomExceptionStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractExceptionStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_DefaultConnectorExceptionStrategy(),
					 CoreFactory.eINSTANCE.createExceptionStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractExceptionStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_DefaultConnectorExceptionStrategy(),
					 CoreFactory.eINSTANCE.createCustomExceptionStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractExceptionStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_DefaultServiceExceptionStrategy(),
					 CoreFactory.eINSTANCE.createExceptionStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractExceptionStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_DefaultServiceExceptionStrategy(),
					 CoreFactory.eINSTANCE.createCustomExceptionStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverSetGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomEntryPointResolverSet(),
					 CoreFactory.eINSTANCE.createCustomEntryPointResolverSetType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverSetGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_EntryPointResolverSet(),
					 CoreFactory.eINSTANCE.createExtensibleEntryPointResolverSet())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverSetGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_LegacyEntryPointResolverSet(),
					 CoreFactory.eINSTANCE.createExtensibleEntryPointResolverSet())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ArrayEntryPointResolver(),
					 CoreFactory.eINSTANCE.createComplexEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
					 CoreFactory.eINSTANCE.createAbstractEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
					 CoreFactory.eINSTANCE.createBaseEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
					 CoreFactory.eINSTANCE.createReflectionEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
					 CoreFactory.eINSTANCE.createComplexEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
					 CoreFactory.eINSTANCE.createCustomEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
					 CoreFactory.eINSTANCE.createMethodEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
					 CoreFactory.eINSTANCE.createPropertyEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomEntryPointResolver(),
					 CoreFactory.eINSTANCE.createCustomEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MethodEntryPointResolver(),
					 CoreFactory.eINSTANCE.createMethodEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_NoArgumentsEntryPointResolver(),
					 CoreFactory.eINSTANCE.createComplexEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_PropertyEntryPointResolver(),
					 CoreFactory.eINSTANCE.createPropertyEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ReflectionEntryPointResolver(),
					 CoreFactory.eINSTANCE.createReflectionEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ReflectionEntryPointResolver(),
					 CoreFactory.eINSTANCE.createComplexEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractServiceGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Service(),
					 CoreFactory.eINSTANCE.createSedaServiceType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractModelType_AbstractServiceGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_Service(),
					 CoreFactory.eINSTANCE.createDefaultServiceType())));
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
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomExceptionStrategy() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_DefaultConnectorExceptionStrategy() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_DefaultServiceExceptionStrategy() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_EntryPointResolverSet() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_LegacyEntryPointResolverSet() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ArrayEntryPointResolver() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_NoArgumentsEntryPointResolver() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ReflectionEntryPointResolver() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomEntryPointResolver() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MethodEntryPointResolver() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_PropertyEntryPointResolver();

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
