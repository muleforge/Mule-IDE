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
import org.mule.ide.config.core.OutboundRouterCollectionType;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.OutboundRouterCollectionType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OutboundRouterCollectionTypeItemProvider
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
	public OutboundRouterCollectionTypeItemProvider(AdapterFactory adapterFactory) {
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
				 getString("_UI_OutboundRouterCollectionType_matchAll_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OutboundRouterCollectionType_matchAll_feature", "_UI_OutboundRouterCollectionType_type"),
				 CorePackage.eINSTANCE.getOutboundRouterCollectionType_MatchAll(),
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
			childrenFeatures.add(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractCatchAllStrategyGroup());
			childrenFeatures.add(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup());
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
	 * This returns OutboundRouterCollectionType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OutboundRouterCollectionType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		OutboundRouterCollectionType outboundRouterCollectionType = (OutboundRouterCollectionType)object;
		return getString("_UI_OutboundRouterCollectionType_type") + " " + outboundRouterCollectionType.isMatchAll();
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

		switch (notification.getFeatureID(OutboundRouterCollectionType.class)) {
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__MATCH_ALL:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_CATCH_ALL_STRATEGY_GROUP:
			case CorePackage.OUTBOUND_ROUTER_COLLECTION_TYPE__ABSTRACT_OUTBOUND_ROUTER_GROUP:
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
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractCatchAllStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomCatchAllStrategy(),
					 CoreFactory.eINSTANCE.createCustomCatchAllStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractCatchAllStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomForwardingCatchAllStrategy(),
					 CoreFactory.eINSTANCE.createCustomForwardingCatchAllStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractCatchAllStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ForwardingCatchAllStrategy(),
					 CoreFactory.eINSTANCE.createForwardingCatchAllStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractCatchAllStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ForwardingCatchAllStrategy(),
					 CoreFactory.eINSTANCE.createCustomForwardingCatchAllStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractCatchAllStrategyGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_LoggingCatchAllStrategy(),
					 CoreFactory.eINSTANCE.createLoggingCatchAllStrategyType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter(),
					 CoreFactory.eINSTANCE.createFilteringOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter(),
					 CoreFactory.eINSTANCE.createChunkingRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter(),
					 CoreFactory.eINSTANCE.createCustomOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter(),
					 CoreFactory.eINSTANCE.createEndpointSelectorRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter(),
					 CoreFactory.eINSTANCE.createMessageSplitterOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter(),
					 CoreFactory.eINSTANCE.createStaticRecipientListRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CustomOutboundRouter(),
					 CoreFactory.eINSTANCE.createCustomOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_EndpointSelectorRouter(),
					 CoreFactory.eINSTANCE.createEndpointSelectorRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter(),
					 CoreFactory.eINSTANCE.createFilteringOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter(),
					 CoreFactory.eINSTANCE.createChunkingRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter(),
					 CoreFactory.eINSTANCE.createCustomOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter(),
					 CoreFactory.eINSTANCE.createEndpointSelectorRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter(),
					 CoreFactory.eINSTANCE.createMessageSplitterOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter(),
					 CoreFactory.eINSTANCE.createStaticRecipientListRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter(),
					 CoreFactory.eINSTANCE.createFilteringOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter(),
					 CoreFactory.eINSTANCE.createChunkingRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter(),
					 CoreFactory.eINSTANCE.createCustomOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter(),
					 CoreFactory.eINSTANCE.createEndpointSelectorRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter(),
					 CoreFactory.eINSTANCE.createMessageSplitterOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter(),
					 CoreFactory.eINSTANCE.createStaticRecipientListRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ListMessageSplitterRouter(),
					 CoreFactory.eINSTANCE.createMessageSplitterOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingRouter(),
					 CoreFactory.eINSTANCE.createChunkingRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter(),
					 CoreFactory.eINSTANCE.createFilteringOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter(),
					 CoreFactory.eINSTANCE.createChunkingRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter(),
					 CoreFactory.eINSTANCE.createCustomOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter(),
					 CoreFactory.eINSTANCE.createEndpointSelectorRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter(),
					 CoreFactory.eINSTANCE.createMessageSplitterOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter(),
					 CoreFactory.eINSTANCE.createStaticRecipientListRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter(),
					 CoreFactory.eINSTANCE.createOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter(),
					 CoreFactory.eINSTANCE.createFilteringOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter(),
					 CoreFactory.eINSTANCE.createChunkingRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter(),
					 CoreFactory.eINSTANCE.createCustomOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter(),
					 CoreFactory.eINSTANCE.createEndpointSelectorRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter(),
					 CoreFactory.eINSTANCE.createMessageSplitterOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter(),
					 CoreFactory.eINSTANCE.createStaticRecipientListRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_StaticRecipientListRouter(),
					 CoreFactory.eINSTANCE.createStaticRecipientListRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter(),
					 CoreFactory.eINSTANCE.createFilteringOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter(),
					 CoreFactory.eINSTANCE.createChunkingRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter(),
					 CoreFactory.eINSTANCE.createCustomOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter(),
					 CoreFactory.eINSTANCE.createEndpointSelectorRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter(),
					 CoreFactory.eINSTANCE.createMessageSplitterOutboundRouterType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getOutboundRouterCollectionType_AbstractOutboundRouterGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter(),
					 CoreFactory.eINSTANCE.createStaticRecipientListRouterType())));
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
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ChainingRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ExceptionBasedRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_FilteringRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MulticastingRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_OutboundPassThroughRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_TemplateEndpointRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MessageChunkingRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomOutboundRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_EndpointSelectorRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ListMessageSplitterRouter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_StaticRecipientListRouter();

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
