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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mule.ide.config.core.AbstractComponentType;
import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.CorePlugin;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.AbstractComponentType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractComponentTypeItemProvider
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
	public AbstractComponentTypeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverSetGroup());
			childrenFeatures.add(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverGroup());
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
	 * This returns AbstractComponentType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AbstractComponentType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_AbstractComponentType_type");
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

		switch (notification.getFeatureID(AbstractComponentType.class)) {
			case CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_SET_GROUP:
			case CorePackage.ABSTRACT_COMPONENT_TYPE__ABSTRACT_ENTRY_POINT_RESOLVER_GROUP:
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
				(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverSetGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomEntryPointResolverSet(),
					 CoreFactory.eINSTANCE.createCustomEntryPointResolverSetType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverSetGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_EntryPointResolverSet(),
					 CoreFactory.eINSTANCE.createExtensibleEntryPointResolverSet())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverSetGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_LegacyEntryPointResolverSet(),
					 CoreFactory.eINSTANCE.createExtensibleEntryPointResolverSet())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ArrayEntryPointResolver(),
					 CoreFactory.eINSTANCE.createComplexEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
					 CoreFactory.eINSTANCE.createAbstractEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
					 CoreFactory.eINSTANCE.createBaseEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
					 CoreFactory.eINSTANCE.createReflectionEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
					 CoreFactory.eINSTANCE.createComplexEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
					 CoreFactory.eINSTANCE.createCustomEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
					 CoreFactory.eINSTANCE.createMethodEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CallableEntryPointResolver(),
					 CoreFactory.eINSTANCE.createPropertyEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomEntryPointResolver(),
					 CoreFactory.eINSTANCE.createCustomEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MethodEntryPointResolver(),
					 CoreFactory.eINSTANCE.createMethodEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_NoArgumentsEntryPointResolver(),
					 CoreFactory.eINSTANCE.createComplexEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_PropertyEntryPointResolver(),
					 CoreFactory.eINSTANCE.createPropertyEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ReflectionEntryPointResolver(),
					 CoreFactory.eINSTANCE.createReflectionEntryPointResolverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAbstractComponentType_AbstractEntryPointResolverGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ReflectionEntryPointResolver(),
					 CoreFactory.eINSTANCE.createComplexEntryPointResolverType())));
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
				CorePlugin.INSTANCE.log(e);
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
		return CorePlugin.INSTANCE;
	}

}
