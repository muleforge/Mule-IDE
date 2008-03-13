/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.jms.provider;


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
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mule.ide.config.core.CorePackage;

import org.mule.ide.config.jms.CustomConnectorType;
import org.mule.ide.config.jms.JMSPackage;
import org.mule.ide.config.jms.JMSPlugin;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.jms.CustomConnectorType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomConnectorTypeItemProvider
	extends org.mule.ide.config.core.provider.CustomConnectorTypeItemProvider
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

			addAcknowledgementModePropertyDescriptor(object);
			addCacheJmsSessionsPropertyDescriptor(object);
			addClientIdPropertyDescriptor(object);
			addDurablePropertyDescriptor(object);
			addEagerConsumerPropertyDescriptor(object);
			addHonorQosHeadersPropertyDescriptor(object);
			addMaxRedeliveryPropertyDescriptor(object);
			addNoLocalPropertyDescriptor(object);
			addPasswordPropertyDescriptor(object);
			addPersistentDeliveryPropertyDescriptor(object);
			addRecoverJmsConnectionsPropertyDescriptor(object);
			addRedeliveryHandlerRefPropertyDescriptor(object);
			addSpecificationPropertyDescriptor(object);
			addUsernamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Acknowledgement Mode feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAcknowledgementModePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomConnectorType_acknowledgementMode_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomConnectorType_acknowledgementMode_feature", "_UI_CustomConnectorType_type"),
				 JMSPackage.Literals.CUSTOM_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Cache Jms Sessions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCacheJmsSessionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomConnectorType_cacheJmsSessions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomConnectorType_cacheJmsSessions_feature", "_UI_CustomConnectorType_type"),
				 JMSPackage.Literals.CUSTOM_CONNECTOR_TYPE__CACHE_JMS_SESSIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Client Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomConnectorType_clientId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomConnectorType_clientId_feature", "_UI_CustomConnectorType_type"),
				 JMSPackage.Literals.CUSTOM_CONNECTOR_TYPE__CLIENT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Durable feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDurablePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomConnectorType_durable_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomConnectorType_durable_feature", "_UI_CustomConnectorType_type"),
				 JMSPackage.Literals.CUSTOM_CONNECTOR_TYPE__DURABLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Eager Consumer feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEagerConsumerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomConnectorType_eagerConsumer_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomConnectorType_eagerConsumer_feature", "_UI_CustomConnectorType_type"),
				 JMSPackage.Literals.CUSTOM_CONNECTOR_TYPE__EAGER_CONSUMER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Honor Qos Headers feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHonorQosHeadersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomConnectorType_honorQosHeaders_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomConnectorType_honorQosHeaders_feature", "_UI_CustomConnectorType_type"),
				 JMSPackage.Literals.CUSTOM_CONNECTOR_TYPE__HONOR_QOS_HEADERS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Redelivery feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxRedeliveryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomConnectorType_maxRedelivery_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomConnectorType_maxRedelivery_feature", "_UI_CustomConnectorType_type"),
				 JMSPackage.Literals.CUSTOM_CONNECTOR_TYPE__MAX_REDELIVERY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the No Local feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNoLocalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomConnectorType_noLocal_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomConnectorType_noLocal_feature", "_UI_CustomConnectorType_type"),
				 JMSPackage.Literals.CUSTOM_CONNECTOR_TYPE__NO_LOCAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Password feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPasswordPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomConnectorType_password_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomConnectorType_password_feature", "_UI_CustomConnectorType_type"),
				 JMSPackage.Literals.CUSTOM_CONNECTOR_TYPE__PASSWORD,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Persistent Delivery feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPersistentDeliveryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomConnectorType_persistentDelivery_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomConnectorType_persistentDelivery_feature", "_UI_CustomConnectorType_type"),
				 JMSPackage.Literals.CUSTOM_CONNECTOR_TYPE__PERSISTENT_DELIVERY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Recover Jms Connections feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRecoverJmsConnectionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomConnectorType_recoverJmsConnections_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomConnectorType_recoverJmsConnections_feature", "_UI_CustomConnectorType_type"),
				 JMSPackage.Literals.CUSTOM_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Redelivery Handler Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRedeliveryHandlerRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomConnectorType_redeliveryHandlerRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomConnectorType_redeliveryHandlerRef_feature", "_UI_CustomConnectorType_type"),
				 JMSPackage.Literals.CUSTOM_CONNECTOR_TYPE__REDELIVERY_HANDLER_REF,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Specification feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpecificationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomConnectorType_specification_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomConnectorType_specification_feature", "_UI_CustomConnectorType_type"),
				 JMSPackage.Literals.CUSTOM_CONNECTOR_TYPE__SPECIFICATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Username feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsernamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CustomConnectorType_username_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CustomConnectorType_username_feature", "_UI_CustomConnectorType_type"),
				 JMSPackage.Literals.CUSTOM_CONNECTOR_TYPE__USERNAME,
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
		String label = ((CustomConnectorType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_CustomConnectorType_type") :
			getString("_UI_CustomConnectorType_type") + " " + label;
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
			case JMSPackage.CUSTOM_CONNECTOR_TYPE__ACKNOWLEDGEMENT_MODE:
			case JMSPackage.CUSTOM_CONNECTOR_TYPE__CACHE_JMS_SESSIONS:
			case JMSPackage.CUSTOM_CONNECTOR_TYPE__CLIENT_ID:
			case JMSPackage.CUSTOM_CONNECTOR_TYPE__DURABLE:
			case JMSPackage.CUSTOM_CONNECTOR_TYPE__EAGER_CONSUMER:
			case JMSPackage.CUSTOM_CONNECTOR_TYPE__HONOR_QOS_HEADERS:
			case JMSPackage.CUSTOM_CONNECTOR_TYPE__MAX_REDELIVERY:
			case JMSPackage.CUSTOM_CONNECTOR_TYPE__NO_LOCAL:
			case JMSPackage.CUSTOM_CONNECTOR_TYPE__PASSWORD:
			case JMSPackage.CUSTOM_CONNECTOR_TYPE__PERSISTENT_DELIVERY:
			case JMSPackage.CUSTOM_CONNECTOR_TYPE__RECOVER_JMS_CONNECTIONS:
			case JMSPackage.CUSTOM_CONNECTOR_TYPE__REDELIVERY_HANDLER_REF:
			case JMSPackage.CUSTOM_CONNECTOR_TYPE__SPECIFICATION:
			case JMSPackage.CUSTOM_CONNECTOR_TYPE__USERNAME:
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
				JMSPlugin.INSTANCE.log(e);
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
		return JMSPlugin.INSTANCE;
	}

}