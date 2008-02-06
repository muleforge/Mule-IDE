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

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;

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
import org.mule.ide.config.core.EnableCorrelationType;
import org.mule.ide.config.core.OutboundRouterType;

import org.mule.ide.config.spring.SpringFactory;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.OutboundRouterType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OutboundRouterTypeItemProvider
	extends AbstractOutboundRouterTypeItemProvider
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
	public OutboundRouterTypeItemProvider(AdapterFactory adapterFactory) {
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

			addEnableCorrelationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Enable Correlation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnableCorrelationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OutboundRouterType_enableCorrelation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutboundRouterType_enableCorrelation_feature", "_UI_OutboundRouterType_type"),
				 CorePackage.eINSTANCE.getOutboundRouterType_EnableCorrelation(),
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
			childrenFeatures.add(CorePackage.eINSTANCE.getOutboundRouterType_AbstractOutboundEndpointGroup());
			childrenFeatures.add(CorePackage.eINSTANCE.getOutboundRouterType_ReplyTo());
			childrenFeatures.add(CorePackage.eINSTANCE.getOutboundRouterType_AbstractTransactionGroup());
			childrenFeatures.add(CorePackage.eINSTANCE.getOutboundRouterType_AbstractPropertyExtractorGroup());
			childrenFeatures.add(CorePackage.eINSTANCE.getOutboundRouterType_CustomPropertyExtractor());
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
		EnableCorrelationType labelValue = ((OutboundRouterType)object).getEnableCorrelation();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_OutboundRouterType_type") :
			getString("_UI_OutboundRouterType_type") + " " + label;
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

		switch (notification.getFeatureID(OutboundRouterType.class)) {
			case CorePackage.OUTBOUND_ROUTER_TYPE__ENABLE_CORRELATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
			case CorePackage.OUTBOUND_ROUTER_TYPE__REPLY_TO:
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSACTION_GROUP:
			case CorePackage.OUTBOUND_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP:
			case CorePackage.OUTBOUND_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR:
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
				(CorePackage.eINSTANCE.getOutboundRouterType_AbstractOutboundEndpointGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_OutboundEndpoint(),
					 CoreFactory.eINSTANCE.createOutboundEndpointType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterType_ReplyTo(),
				 CoreFactory.eINSTANCE.createReplyToType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterType_AbstractTransactionGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomTransaction(),
					 CoreFactory.eINSTANCE.createCustomTransactionType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterType_AbstractPropertyExtractorGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_BeanPropertyExtractor(),
					 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterType_AbstractPropertyExtractorGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CorrelationPropertyExtractor(),
					 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterType_AbstractPropertyExtractorGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MapPropertyExtractor(),
					 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterType_AbstractPropertyExtractorGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyExtractor(),
					 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterType_AbstractPropertyExtractorGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_PayloadPropertyExtractor(),
					 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomPropertyExtractorType()));
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
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_BeanPropertyExtractor() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CorrelationPropertyExtractor() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MapPropertyExtractor() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyExtractor() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_PayloadPropertyExtractor();

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
