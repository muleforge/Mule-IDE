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
import org.mule.ide.config.core.CorePlugin;
import org.mule.ide.config.core.ThreadingProfileType;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.ThreadingProfileType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ThreadingProfileTypeItemProvider
	extends AbstractComponentThreadingProfileTypeItemProvider
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
	public ThreadingProfileTypeItemProvider(AdapterFactory adapterFactory) {
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

			addDoThreadingPropertyDescriptor(object);
			addMaxBufferSizePropertyDescriptor(object);
			addMaxThreadsActivePropertyDescriptor(object);
			addMaxThreadsIdlePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addPoolExhaustedActionPropertyDescriptor(object);
			addThreadTTLPropertyDescriptor(object);
			addThreadWaitTimeoutPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Do Threading feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDoThreadingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThreadingProfileType_doThreading_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThreadingProfileType_doThreading_feature", "_UI_ThreadingProfileType_type"),
				 CorePackage.eINSTANCE.getThreadingProfileType_DoThreading(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Buffer Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxBufferSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThreadingProfileType_maxBufferSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThreadingProfileType_maxBufferSize_feature", "_UI_ThreadingProfileType_type"),
				 CorePackage.eINSTANCE.getThreadingProfileType_MaxBufferSize(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Threads Active feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxThreadsActivePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThreadingProfileType_maxThreadsActive_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThreadingProfileType_maxThreadsActive_feature", "_UI_ThreadingProfileType_type"),
				 CorePackage.eINSTANCE.getThreadingProfileType_MaxThreadsActive(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Threads Idle feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxThreadsIdlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThreadingProfileType_maxThreadsIdle_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThreadingProfileType_maxThreadsIdle_feature", "_UI_ThreadingProfileType_type"),
				 CorePackage.eINSTANCE.getThreadingProfileType_MaxThreadsIdle(),
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
				 getString("_UI_ThreadingProfileType_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThreadingProfileType_name_feature", "_UI_ThreadingProfileType_type"),
				 CorePackage.eINSTANCE.getThreadingProfileType_Name(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pool Exhausted Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPoolExhaustedActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThreadingProfileType_poolExhaustedAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThreadingProfileType_poolExhaustedAction_feature", "_UI_ThreadingProfileType_type"),
				 CorePackage.eINSTANCE.getThreadingProfileType_PoolExhaustedAction(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thread TTL feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThreadTTLPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThreadingProfileType_threadTTL_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThreadingProfileType_threadTTL_feature", "_UI_ThreadingProfileType_type"),
				 CorePackage.eINSTANCE.getThreadingProfileType_ThreadTTL(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Thread Wait Timeout feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThreadWaitTimeoutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ThreadingProfileType_threadWaitTimeout_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ThreadingProfileType_threadWaitTimeout_feature", "_UI_ThreadingProfileType_type"),
				 CorePackage.eINSTANCE.getThreadingProfileType_ThreadWaitTimeout(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ThreadingProfileType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ThreadingProfileType_type") :
			getString("_UI_ThreadingProfileType_type") + " " + label;
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

		switch (notification.getFeatureID(ThreadingProfileType.class)) {
			case CorePackage.THREADING_PROFILE_TYPE__DO_THREADING:
			case CorePackage.THREADING_PROFILE_TYPE__MAX_BUFFER_SIZE:
			case CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_ACTIVE:
			case CorePackage.THREADING_PROFILE_TYPE__MAX_THREADS_IDLE:
			case CorePackage.THREADING_PROFILE_TYPE__NAME:
			case CorePackage.THREADING_PROFILE_TYPE__POOL_EXHAUSTED_ACTION:
			case CorePackage.THREADING_PROFILE_TYPE__THREAD_TTL:
			case CorePackage.THREADING_PROFILE_TYPE__THREAD_WAIT_TIMEOUT:
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
		return CorePlugin.INSTANCE;
	}

}
