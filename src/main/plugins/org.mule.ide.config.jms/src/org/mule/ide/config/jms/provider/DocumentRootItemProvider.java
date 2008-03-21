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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mule.ide.config.core.CoreFactory;

import org.mule.ide.config.jms.DocumentRoot;
import org.mule.ide.config.jms.JMSFactory;
import org.mule.ide.config.jms.JMSPackage;
import org.mule.ide.config.jms.JMSPlugin;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.jms.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
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
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(JMSPackage.Literals.DOCUMENT_ROOT__ACTIVEMQ_CONNECTOR);
			childrenFeatures.add(JMSPackage.Literals.DOCUMENT_ROOT__ACTIVEMQ_XA_CONNECTOR);
			childrenFeatures.add(JMSPackage.Literals.DOCUMENT_ROOT__CLIENT_ACK_TRANSACTION);
			childrenFeatures.add(JMSPackage.Literals.DOCUMENT_ROOT__CONNECTOR);
			childrenFeatures.add(JMSPackage.Literals.DOCUMENT_ROOT__CUSTOM_CONNECTOR);
			childrenFeatures.add(JMSPackage.Literals.DOCUMENT_ROOT__ENDPOINT);
			childrenFeatures.add(JMSPackage.Literals.DOCUMENT_ROOT__INBOUND_ENDPOINT);
			childrenFeatures.add(JMSPackage.Literals.DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER);
			childrenFeatures.add(JMSPackage.Literals.DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER);
			childrenFeatures.add(JMSPackage.Literals.DOCUMENT_ROOT__OUTBOUND_ENDPOINT);
			childrenFeatures.add(JMSPackage.Literals.DOCUMENT_ROOT__PROPERTY_FILTER);
			childrenFeatures.add(JMSPackage.Literals.DOCUMENT_ROOT__TRANSACTION);
			childrenFeatures.add(JMSPackage.Literals.DOCUMENT_ROOT__WEBLOGIC_CONNECTOR);
			childrenFeatures.add(JMSPackage.Literals.DOCUMENT_ROOT__WEBSPHERE_CONNECTOR);
			childrenFeatures.add(JMSPackage.Literals.DOCUMENT_ROOT__XA_TRANSACTION);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type");
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

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case JMSPackage.DOCUMENT_ROOT__ACTIVEMQ_CONNECTOR:
			case JMSPackage.DOCUMENT_ROOT__ACTIVEMQ_XA_CONNECTOR:
			case JMSPackage.DOCUMENT_ROOT__CLIENT_ACK_TRANSACTION:
			case JMSPackage.DOCUMENT_ROOT__CONNECTOR:
			case JMSPackage.DOCUMENT_ROOT__CUSTOM_CONNECTOR:
			case JMSPackage.DOCUMENT_ROOT__ENDPOINT:
			case JMSPackage.DOCUMENT_ROOT__INBOUND_ENDPOINT:
			case JMSPackage.DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER:
			case JMSPackage.DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER:
			case JMSPackage.DOCUMENT_ROOT__OUTBOUND_ENDPOINT:
			case JMSPackage.DOCUMENT_ROOT__PROPERTY_FILTER:
			case JMSPackage.DOCUMENT_ROOT__TRANSACTION:
			case JMSPackage.DOCUMENT_ROOT__WEBLOGIC_CONNECTOR:
			case JMSPackage.DOCUMENT_ROOT__WEBSPHERE_CONNECTOR:
			case JMSPackage.DOCUMENT_ROOT__XA_TRANSACTION:
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
				(JMSPackage.Literals.DOCUMENT_ROOT__ACTIVEMQ_CONNECTOR,
				 JMSFactory.eINSTANCE.createActiveMqConnectorType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__ACTIVEMQ_XA_CONNECTOR,
				 JMSFactory.eINSTANCE.createActiveMqConnectorType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__CLIENT_ACK_TRANSACTION,
				 CoreFactory.eINSTANCE.createBaseTransactionType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__CLIENT_ACK_TRANSACTION,
				 CoreFactory.eINSTANCE.createCustomTransactionType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__CONNECTOR,
				 JMSFactory.eINSTANCE.createGenericConnectorType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__CUSTOM_CONNECTOR,
				 JMSFactory.eINSTANCE.createCustomConnectorType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__ENDPOINT,
				 JMSFactory.eINSTANCE.createGlobalEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__INBOUND_ENDPOINT,
				 JMSFactory.eINSTANCE.createInboundEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER,
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER,
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER,
				 CoreFactory.eINSTANCE.createEncryptionTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER,
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER,
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER,
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER,
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER,
				 CoreFactory.eINSTANCE.createEncryptionTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER,
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER,
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__OUTBOUND_ENDPOINT,
				 JMSFactory.eINSTANCE.createOutboundEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__PROPERTY_FILTER,
				 JMSFactory.eINSTANCE.createPropertyFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__TRANSACTION,
				 CoreFactory.eINSTANCE.createBaseTransactionType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__TRANSACTION,
				 CoreFactory.eINSTANCE.createCustomTransactionType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__WEBLOGIC_CONNECTOR,
				 JMSFactory.eINSTANCE.createVendorJmsConnectorType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__WEBLOGIC_CONNECTOR,
				 JMSFactory.eINSTANCE.createActiveMqConnectorType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__WEBSPHERE_CONNECTOR,
				 JMSFactory.eINSTANCE.createVendorJmsConnectorType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__WEBSPHERE_CONNECTOR,
				 JMSFactory.eINSTANCE.createActiveMqConnectorType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__XA_TRANSACTION,
				 CoreFactory.eINSTANCE.createBaseTransactionType()));

		newChildDescriptors.add
			(createChildParameter
				(JMSPackage.Literals.DOCUMENT_ROOT__XA_TRANSACTION,
				 CoreFactory.eINSTANCE.createCustomTransactionType()));
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

		boolean qualify =
			childFeature == JMSPackage.Literals.DOCUMENT_ROOT__ACTIVEMQ_CONNECTOR ||
			childFeature == JMSPackage.Literals.DOCUMENT_ROOT__ACTIVEMQ_XA_CONNECTOR ||
			childFeature == JMSPackage.Literals.DOCUMENT_ROOT__WEBLOGIC_CONNECTOR ||
			childFeature == JMSPackage.Literals.DOCUMENT_ROOT__WEBSPHERE_CONNECTOR ||
			childFeature == JMSPackage.Literals.DOCUMENT_ROOT__CLIENT_ACK_TRANSACTION ||
			childFeature == JMSPackage.Literals.DOCUMENT_ROOT__TRANSACTION ||
			childFeature == JMSPackage.Literals.DOCUMENT_ROOT__XA_TRANSACTION ||
			childFeature == JMSPackage.Literals.DOCUMENT_ROOT__JMSMESSAGE_TO_OBJECT_TRANSFORMER ||
			childFeature == JMSPackage.Literals.DOCUMENT_ROOT__OBJECT_TO_JMSMESSAGE_TRANSFORMER;

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
