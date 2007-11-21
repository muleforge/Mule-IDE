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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.InboundRouterCollectionType;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.InboundRouterCollectionType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InboundRouterCollectionTypeItemProvider
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
	public InboundRouterCollectionTypeItemProvider(AdapterFactory adapterFactory) {
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

			addMatchAllPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Match All feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMatchAllPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InboundRouterCollectionType_matchAll_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InboundRouterCollectionType_matchAll_feature", "_UI_InboundRouterCollectionType_type"),
				 CorePackage.eINSTANCE.getInboundRouterCollectionType_MatchAll(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractCatchAllStrategyGroup());
			childrenFeatures.add(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundEndpointGroup());
			childrenFeatures.add(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup());
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
	 * This returns InboundRouterCollectionType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/InboundRouterCollectionType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		InboundRouterCollectionType inboundRouterCollectionType = (InboundRouterCollectionType)object;
		return getString("_UI_InboundRouterCollectionType_type") + " " + inboundRouterCollectionType.isMatchAll();
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

		switch (notification.getFeatureID(InboundRouterCollectionType.class)) {
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__MATCH_ALL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP:
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
			case CorePackage.INBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_INBOUND_ROUTER_GROUP:
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
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractCatchAllStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomCatchAllStrategy(),
					 CoreFactory.eINSTANCE.createCustomCatchAllStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractCatchAllStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomForwardingCatchAllStrategy(),
					 CoreFactory.eINSTANCE.createCustomForwardingCatchAllStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractCatchAllStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ForwardingCatchAllStrategy(),
					 CoreFactory.eINSTANCE.createForwardingCatchAllStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractCatchAllStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ForwardingCatchAllStrategy(),
					 CoreFactory.eINSTANCE.createCustomForwardingCatchAllStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractCatchAllStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_LoggingCatchAllStrategy(),
					 CoreFactory.eINSTANCE.createLoggingCatchAllStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundEndpointGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_InboundEndpoint(),
					 CoreFactory.eINSTANCE.createInboundEndpointType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CorrelationAggregatorRouter(),
					 CoreFactory.eINSTANCE.createCorrelationAggregatorRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CorrelationResequencerRouter(),
					 CoreFactory.eINSTANCE.createCorrelationRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CorrelationResequencerRouter(),
					 CoreFactory.eINSTANCE.createCorrelationAggregatorRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomInboundRouter(),
					 CoreFactory.eINSTANCE.createCustomInboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ForwardingRouter(),
					 CoreFactory.eINSTANCE.createForwardingRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_IdempotentReceiverRouter(),
					 CoreFactory.eINSTANCE.createIdempotentReceiverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
					 CoreFactory.eINSTANCE.createFilteredInboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
					 CoreFactory.eINSTANCE.createCorrelationRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
					 CoreFactory.eINSTANCE.createCorrelationAggregatorRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
					 CoreFactory.eINSTANCE.createCustomInboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
					 CoreFactory.eINSTANCE.createForwardingRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
					 CoreFactory.eINSTANCE.createIdempotentReceiverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
					 CoreFactory.eINSTANCE.createSelectiveConsumerRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter(),
					 CoreFactory.eINSTANCE.createWireTapRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(),
					 CoreFactory.eINSTANCE.createFilteredInboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(),
					 CoreFactory.eINSTANCE.createCorrelationRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(),
					 CoreFactory.eINSTANCE.createCorrelationAggregatorRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(),
					 CoreFactory.eINSTANCE.createCustomInboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(),
					 CoreFactory.eINSTANCE.createForwardingRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(),
					 CoreFactory.eINSTANCE.createIdempotentReceiverType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(),
					 CoreFactory.eINSTANCE.createSelectiveConsumerRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter(),
					 CoreFactory.eINSTANCE.createWireTapRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingAggregatorRouter(),
					 CoreFactory.eINSTANCE.createCorrelationRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingAggregatorRouter(),
					 CoreFactory.eINSTANCE.createCorrelationAggregatorRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_SelectiveConsumerRouter(),
					 CoreFactory.eINSTANCE.createSelectiveConsumerRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getInboundRouterCollectionType_AbstractInboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_WireTapRouter(),
					 CoreFactory.eINSTANCE.createWireTapRouterType())));
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
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomForwardingCatchAllStrategy() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ForwardingCatchAllStrategy() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CorrelationAggregatorRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CorrelationResequencerRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_IdempotentSecureHashReceiverRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_InboundPassThroughRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingAggregatorRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomInboundRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ForwardingRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_IdempotentReceiverRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_SelectiveConsumerRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_WireTapRouter();

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
