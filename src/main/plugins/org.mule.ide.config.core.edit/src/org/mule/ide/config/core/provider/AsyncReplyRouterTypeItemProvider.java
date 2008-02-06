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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mule.ide.config.core.AsyncReplyRouterType;
import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.AsyncReplyRouterType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AsyncReplyRouterTypeItemProvider
	extends AbstractAsyncReplyRouterTypeItemProvider
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
	public AsyncReplyRouterTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CorePackage.eINSTANCE.getAsyncReplyRouterType_AbstractInboundEndpointGroup());
			childrenFeatures.add(CorePackage.eINSTANCE.getAsyncReplyRouterType_AbstractPropertyExtractorGroup());
			childrenFeatures.add(CorePackage.eINSTANCE.getAsyncReplyRouterType_CustomPropertyExtractor());
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
		return getString("_UI_AsyncReplyRouterType_type");
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

		switch (notification.getFeatureID(AsyncReplyRouterType.class)) {
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_INBOUND_ENDPOINT_GROUP:
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP:
			case CorePackage.ASYNC_REPLY_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR:
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
				(CorePackage.eINSTANCE.getAsyncReplyRouterType_AbstractInboundEndpointGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_InboundEndpoint(),
					 CoreFactory.eINSTANCE.createInboundEndpointType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAsyncReplyRouterType_AbstractPropertyExtractorGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_BeanPropertyExtractor(),
					 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAsyncReplyRouterType_AbstractPropertyExtractorGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CorrelationPropertyExtractor(),
					 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAsyncReplyRouterType_AbstractPropertyExtractorGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MapPropertyExtractor(),
					 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAsyncReplyRouterType_AbstractPropertyExtractorGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyExtractor(),
					 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAsyncReplyRouterType_AbstractPropertyExtractorGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_PayloadPropertyExtractor(),
					 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getAsyncReplyRouterType_CustomPropertyExtractor(),
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
