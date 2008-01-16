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
import org.mule.ide.config.core.JndiConnectorType;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.JndiConnectorType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JndiConnectorTypeItemProvider
	extends ConnectorTypeItemProvider
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
	public JndiConnectorTypeItemProvider(AdapterFactory adapterFactory) {
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

			addJndiContextRefPropertyDescriptor(object);
			addJndiInitialFactoryPropertyDescriptor(object);
			addJndiProviderUrlPropertyDescriptor(object);
			addJndiUrlPkgPrefixesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Jndi Context Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJndiContextRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JndiConnectorType_jndiContextRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JndiConnectorType_jndiContextRef_feature", "_UI_JndiConnectorType_type"),
				 CorePackage.eINSTANCE.getJndiConnectorType_JndiContextRef(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Jndi Initial Factory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJndiInitialFactoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JndiConnectorType_jndiInitialFactory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JndiConnectorType_jndiInitialFactory_feature", "_UI_JndiConnectorType_type"),
				 CorePackage.eINSTANCE.getJndiConnectorType_JndiInitialFactory(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Jndi Provider Url feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJndiProviderUrlPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JndiConnectorType_jndiProviderUrl_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JndiConnectorType_jndiProviderUrl_feature", "_UI_JndiConnectorType_type"),
				 CorePackage.eINSTANCE.getJndiConnectorType_JndiProviderUrl(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Jndi Url Pkg Prefixes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJndiUrlPkgPrefixesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JndiConnectorType_jndiUrlPkgPrefixes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JndiConnectorType_jndiUrlPkgPrefixes_feature", "_UI_JndiConnectorType_type"),
				 CorePackage.eINSTANCE.getJndiConnectorType_JndiUrlPkgPrefixes(),
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
			childrenFeatures.add(CorePackage.eINSTANCE.getJndiConnectorType_JndiProviderProperties());
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
	 * This returns JndiConnectorType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/JndiConnectorType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * customization
	 */
	@Override
	public String getText(Object object) {
		String label = ((JndiConnectorType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_JndiConnectorType_type") :
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

		switch (notification.getFeatureID(JndiConnectorType.class)) {
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_CONTEXT_REF:
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_INITIAL_FACTORY:
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_URL:
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_URL_PKG_PREFIXES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.JNDI_CONNECTOR_TYPE__JNDI_PROVIDER_PROPERTIES:
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
				(CorePackage.eINSTANCE.getJndiConnectorType_JndiProviderProperties(),
				 CoreFactory.eINSTANCE.createMapType()));
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
			childFeature == CorePackage.eINSTANCE.getConnectorType_ReceiverThreadingProfile() ||
			childFeature == CorePackage.eINSTANCE.getConnectorType_DispatcherThreadingProfile() ||
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
