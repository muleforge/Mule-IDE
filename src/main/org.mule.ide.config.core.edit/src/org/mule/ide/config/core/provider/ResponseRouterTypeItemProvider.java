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

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.ResponseRouterType;

import org.mule.ide.config.spring.SpringFactory;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.ResponseRouterType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ResponseRouterTypeItemProvider
	extends AbstractResponseRouterTypeItemProvider
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
	public ResponseRouterTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CorePackage.eINSTANCE.getResponseRouterType_AbstractResponseEndpointGroup());
			childrenFeatures.add(CorePackage.eINSTANCE.getResponseRouterType_AbstractPropertyExtractorGroup());
			childrenFeatures.add(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor());
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
	 * This returns ResponseRouterType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ResponseRouterType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ResponseRouterType_type");
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

		switch (notification.getFeatureID(ResponseRouterType.class)) {
			case CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_RESPONSE_ENDPOINT_GROUP:
			case CorePackage.RESPONSE_ROUTER_TYPE__ABSTRACT_PROPERTY_EXTRACTOR_GROUP:
			case CorePackage.RESPONSE_ROUTER_TYPE__CUSTOM_PROPERTY_EXTRACTOR:
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
				(CorePackage.eINSTANCE.getResponseRouterType_AbstractResponseEndpointGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_ResponseEndpoint(),
					 CoreFactory.eINSTANCE.createResponseEndpointType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_AbstractPropertyExtractorGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_BeanPropertyExtractor(),
					 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_AbstractPropertyExtractorGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_CorrelationPropertyExtractor(),
					 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_AbstractPropertyExtractorGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MapPropertyExtractor(),
					 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_AbstractPropertyExtractorGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyExtractor(),
					 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_AbstractPropertyExtractorGroup(),
				 FeatureMapUtil.createEntry
					(CorePackage.eINSTANCE.getDocumentRoot_PayloadPropertyExtractor(),
					 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType())));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractExtensionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractAgentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractBindingType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractCatchAllStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractComponentThreadingProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractConnectionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractConnectorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractEntrypointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractExceptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractGlobalEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractInboundEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractInboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractModelType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractObjectFactoryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractOutboundEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractPoolingProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractPropertyExtractorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractQueueProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractResponseEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractResponseRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractSecurityFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractSecurityManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractServiceType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractStorageType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractTransactionFactoryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractTransactionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createBaseContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createBaseServiceType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCallableEntrypointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createFilteringOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createChunkingRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCollectionFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createConnectionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createConnectorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createFilteredInboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCorrelationRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCorrelationAggregatorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomCatchAllStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomConnectionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomConnectorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createEncryptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomEncryptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomEntrypointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createExceptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomExceptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createForwardingCatchAllStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomForwardingCatchAllStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomInboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomPropertyExtractorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createResponseRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomResponseRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createSecurityProviderType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomSecurityProviderType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomTransactionFactoryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createJndiTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createDefaultComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createSedaModelType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createDefaultModelType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createSedaServiceType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createDefaultServiceType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createDescriptionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createEncryptionSecurityFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createEndpointSelectorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createEnvironmentPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createFilterRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createForwardingRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createGenericObjectFactoryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createGlobalEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createIdempotentReceiverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createInboundEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createInboundRouterCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createIocContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createJndiConnectorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createListOrSetType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createLoggingCatchAllStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createMapType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createMessageSplitterOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createMuleAdminAgentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createMuleManagementContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createMuleType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createMuleUnsafeType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createNoArgsCallDelegateClassType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createNoArgsCallDelegateInstanceType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createNoArgsCallWrapperType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createOutboundEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createOutboundRouterCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createPasswordEncryptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createPatternFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createPojoBindingType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createPojoComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createPooledObjectFactoryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createPoolingProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createPropertiesContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createPrototypeObjectFactoryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createQueueProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createReferenceType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createReplyToType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createResponseEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createResponseRouterCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createRetryConnectionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createRmiContainerContextType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createSecretKeyEncryptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createSecurityManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createSelectiveConsumerRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createServiceOverridesType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createSingletonObjectFactoryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createStaticRecipientListRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createThreadingProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createTlsClientKeyStoreType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createTlsKeyStoreType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createTlsProtocolHandler()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createTlsTrustStoreType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createTlsServerTrustStoreType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createTransactionRefFactoryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createTransactionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createTransformerRefType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createTypeFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createUnitaryFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createWildcardFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 CoreFactory.eINSTANCE.createWireTapRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 SpringFactory.eINSTANCE.createBaseCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 SpringFactory.eINSTANCE.createEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 SpringFactory.eINSTANCE.createTypedCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 SpringFactory.eINSTANCE.createListOrSetType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 SpringFactory.eINSTANCE.createMapType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 SpringFactory.eINSTANCE.createMetaType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 SpringFactory.eINSTANCE.createPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 SpringFactory.eINSTANCE.createPropsType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));
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
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ResponseEndpoint() ||
			childFeature == CorePackage.eINSTANCE.getResponseRouterType_CustomPropertyExtractor() ||
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
