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

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.TlsServerTrustStoreType;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.TlsServerTrustStoreType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TlsServerTrustStoreTypeItemProvider
	extends TlsTrustStoreTypeItemProvider
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
	public TlsServerTrustStoreTypeItemProvider(AdapterFactory adapterFactory) {
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

			addExplicitTrustStoreOnlyPropertyDescriptor(object);
			addRequireClientAuthenticationPropertyDescriptor(object);
			addTrustManagerAlgorithmPropertyDescriptor(object);
			addTrustManagerFactoryPropertyDescriptor(object);
			addTrustStoreTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Explicit Trust Store Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExplicitTrustStoreOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TlsServerTrustStoreType_explicitTrustStoreOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TlsServerTrustStoreType_explicitTrustStoreOnly_feature", "_UI_TlsServerTrustStoreType_type"),
				 CorePackage.eINSTANCE.getTlsServerTrustStoreType_ExplicitTrustStoreOnly(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Require Client Authentication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequireClientAuthenticationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TlsServerTrustStoreType_requireClientAuthentication_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TlsServerTrustStoreType_requireClientAuthentication_feature", "_UI_TlsServerTrustStoreType_type"),
				 CorePackage.eINSTANCE.getTlsServerTrustStoreType_RequireClientAuthentication(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trust Manager Algorithm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrustManagerAlgorithmPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TlsServerTrustStoreType_trustManagerAlgorithm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TlsServerTrustStoreType_trustManagerAlgorithm_feature", "_UI_TlsServerTrustStoreType_type"),
				 CorePackage.eINSTANCE.getTlsServerTrustStoreType_TrustManagerAlgorithm(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trust Manager Factory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrustManagerFactoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TlsServerTrustStoreType_trustManagerFactory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TlsServerTrustStoreType_trustManagerFactory_feature", "_UI_TlsServerTrustStoreType_type"),
				 CorePackage.eINSTANCE.getTlsServerTrustStoreType_TrustManagerFactory(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Trust Store Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTrustStoreTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_TlsServerTrustStoreType_trustStoreType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_TlsServerTrustStoreType_trustStoreType_feature", "_UI_TlsServerTrustStoreType_type"),
				 CorePackage.eINSTANCE.getTlsServerTrustStoreType_TrustStoreType(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns TlsServerTrustStoreType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TlsServerTrustStoreType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TlsServerTrustStoreType)object).getTrustStore();
		return label == null || label.length() == 0 ?
			getString("_UI_TlsServerTrustStoreType_type") :
			getString("_UI_TlsServerTrustStoreType_type") + " " + label;
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

		switch (notification.getFeatureID(TlsServerTrustStoreType.class)) {
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__EXPLICIT_TRUST_STORE_ONLY:
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__REQUIRE_CLIENT_AUTHENTICATION:
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__TRUST_MANAGER_ALGORITHM:
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__TRUST_MANAGER_FACTORY:
			case CorePackage.TLS_SERVER_TRUST_STORE_TYPE__TRUST_STORE_TYPE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
