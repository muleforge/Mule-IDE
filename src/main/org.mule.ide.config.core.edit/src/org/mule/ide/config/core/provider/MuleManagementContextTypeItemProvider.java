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

import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.MuleManagementContextType;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.MuleManagementContextType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MuleManagementContextTypeItemProvider
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
	public MuleManagementContextTypeItemProvider(AdapterFactory adapterFactory) {
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

			addClusterIdPropertyDescriptor(object);
			addDefaultEncodingPropertyDescriptor(object);
			addDefaultRemoteSyncPropertyDescriptor(object);
			addDefaultSynchronousEndpointsPropertyDescriptor(object);
			addDefaultSynchronousEventTimeoutPropertyDescriptor(object);
			addDefaultTransactionTimeoutPropertyDescriptor(object);
			addDomainIdPropertyDescriptor(object);
			addServerIdPropertyDescriptor(object);
			addWorkingDirectoryPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Cluster Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClusterIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MuleManagementContextType_clusterId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MuleManagementContextType_clusterId_feature", "_UI_MuleManagementContextType_type"),
				 CorePackage.eINSTANCE.getMuleManagementContextType_ClusterId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Encoding feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultEncodingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MuleManagementContextType_defaultEncoding_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MuleManagementContextType_defaultEncoding_feature", "_UI_MuleManagementContextType_type"),
				 CorePackage.eINSTANCE.getMuleManagementContextType_DefaultEncoding(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Remote Sync feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultRemoteSyncPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MuleManagementContextType_defaultRemoteSync_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MuleManagementContextType_defaultRemoteSync_feature", "_UI_MuleManagementContextType_type"),
				 CorePackage.eINSTANCE.getMuleManagementContextType_DefaultRemoteSync(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Synchronous Endpoints feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSynchronousEndpointsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MuleManagementContextType_defaultSynchronousEndpoints_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MuleManagementContextType_defaultSynchronousEndpoints_feature", "_UI_MuleManagementContextType_type"),
				 CorePackage.eINSTANCE.getMuleManagementContextType_DefaultSynchronousEndpoints(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Synchronous Event Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultSynchronousEventTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MuleManagementContextType_defaultSynchronousEventTimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MuleManagementContextType_defaultSynchronousEventTimeout_feature", "_UI_MuleManagementContextType_type"),
				 CorePackage.eINSTANCE.getMuleManagementContextType_DefaultSynchronousEventTimeout(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Default Transaction Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultTransactionTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MuleManagementContextType_defaultTransactionTimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MuleManagementContextType_defaultTransactionTimeout_feature", "_UI_MuleManagementContextType_type"),
				 CorePackage.eINSTANCE.getMuleManagementContextType_DefaultTransactionTimeout(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Domain Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDomainIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MuleManagementContextType_domainId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MuleManagementContextType_domainId_feature", "_UI_MuleManagementContextType_type"),
				 CorePackage.eINSTANCE.getMuleManagementContextType_DomainId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Server Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MuleManagementContextType_serverId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MuleManagementContextType_serverId_feature", "_UI_MuleManagementContextType_type"),
				 CorePackage.eINSTANCE.getMuleManagementContextType_ServerId(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Working Directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkingDirectoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_MuleManagementContextType_workingDirectory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_MuleManagementContextType_workingDirectory_feature", "_UI_MuleManagementContextType_type"),
				 CorePackage.eINSTANCE.getMuleManagementContextType_WorkingDirectory(),
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
			childrenFeatures.add(CorePackage.eINSTANCE.getMuleManagementContextType_DefaultThreadingProfile());
			childrenFeatures.add(CorePackage.eINSTANCE.getMuleManagementContextType_DefaultDispatcherThreadingProfile());
			childrenFeatures.add(CorePackage.eINSTANCE.getMuleManagementContextType_DefaultReceiverThreadingProfile());
			childrenFeatures.add(CorePackage.eINSTANCE.getMuleManagementContextType_DefaultComponentThreadingProfile());
			childrenFeatures.add(CorePackage.eINSTANCE.getMuleManagementContextType_AbstractStorageGroup());
			childrenFeatures.add(CorePackage.eINSTANCE.getMuleManagementContextType_DefaultConnectionStrategy());
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
	 * This returns MuleManagementContextType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/MuleManagementContextType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((MuleManagementContextType)object).getClusterId();
		return label == null || label.length() == 0 ?
			getString("_UI_MuleManagementContextType_type") :
			getString("_UI_MuleManagementContextType_type") + " " + label;
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

		switch (notification.getFeatureID(MuleManagementContextType.class)) {
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__CLUSTER_ID:
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_ENCODING:
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_REMOTE_SYNC:
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_SYNCHRONOUS_ENDPOINTS:
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_SYNCHRONOUS_EVENT_TIMEOUT:
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_TRANSACTION_TIMEOUT:
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DOMAIN_ID:
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__SERVER_ID:
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__WORKING_DIRECTORY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_THREADING_PROFILE:
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_DISPATCHER_THREADING_PROFILE:
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_RECEIVER_THREADING_PROFILE:
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_COMPONENT_THREADING_PROFILE:
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__ABSTRACT_STORAGE_GROUP:
			case CorePackage.MULE_MANAGEMENT_CONTEXT_TYPE__DEFAULT_CONNECTION_STRATEGY:
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
				(CorePackage.eINSTANCE.getMuleManagementContextType_DefaultThreadingProfile(),
				 CoreFactory.eINSTANCE.createThreadingProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleManagementContextType_DefaultDispatcherThreadingProfile(),
				 CoreFactory.eINSTANCE.createThreadingProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleManagementContextType_DefaultReceiverThreadingProfile(),
				 CoreFactory.eINSTANCE.createThreadingProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleManagementContextType_DefaultComponentThreadingProfile(),
				 CoreFactory.eINSTANCE.createThreadingProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleManagementContextType_DefaultConnectionStrategy(),
				 CoreFactory.eINSTANCE.createConnectionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleManagementContextType_DefaultConnectionStrategy(),
				 CoreFactory.eINSTANCE.createCustomConnectionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getMuleManagementContextType_DefaultConnectionStrategy(),
				 CoreFactory.eINSTANCE.createRetryConnectionStrategyType()));
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
			childFeature == CorePackage.eINSTANCE.getMuleManagementContextType_DefaultThreadingProfile() ||
			childFeature == CorePackage.eINSTANCE.getMuleManagementContextType_DefaultDispatcherThreadingProfile() ||
			childFeature == CorePackage.eINSTANCE.getMuleManagementContextType_DefaultReceiverThreadingProfile() ||
			childFeature == CorePackage.eINSTANCE.getMuleManagementContextType_DefaultComponentThreadingProfile();

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
