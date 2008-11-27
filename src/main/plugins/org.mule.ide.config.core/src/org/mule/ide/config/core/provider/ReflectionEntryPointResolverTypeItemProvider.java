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
import org.mule.ide.config.core.CorePlugin;
import org.mule.ide.config.core.ReflectionEntryPointResolverType;

import org.mule.ide.config.spring.SpringFactory;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.core.ReflectionEntryPointResolverType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReflectionEntryPointResolverTypeItemProvider
	extends BaseEntryPointResolverTypeItemProvider
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
	public ReflectionEntryPointResolverTypeItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods());
			childrenFeatures.add(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeEntryPoint());
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
		ReflectionEntryPointResolverType reflectionEntryPointResolverType = (ReflectionEntryPointResolverType)object;
		return getString("_UI_ReflectionEntryPointResolverType_type") + " " + reflectionEntryPointResolverType.isAcceptVoidMethods();
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

		switch (notification.getFeatureID(ReflectionEntryPointResolverType.class)) {
			case CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_OBJECT_METHODS:
			case CorePackage.REFLECTION_ENTRY_POINT_RESOLVER_TYPE__EXCLUDE_ENTRY_POINT:
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
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractExtensionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractAgentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractAsyncReplyRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractCatchAllStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractComponentThreadingProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractConnectorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractEntryPointResolverSetType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractExceptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractGlobalEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractInboundEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractInboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractLifecycleAdapterFactory()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractMessageInfoMappingType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractModelType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractObjectFactoryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractOutboundEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractPoolingProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractQueueProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractSecurityFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractSecurityManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractServiceType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractTransactionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAbstractTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAsyncReplyCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createAsyncReplyRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createBaseEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createBaseServiceType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createBaseTransactionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createPatternFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCaseSensitivePatternFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createFilteringOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createChunkingRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCollectionFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createReflectionEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createComplexEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createConfigurationType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createConnectorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomAsyncReplyRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomCatchAllStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomConnectorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createFilteredInboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createMessageChunkingAggregatorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomCorrelationAggregatorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createEncryptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomEncryptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomEntryPointResolverSetType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createEndpointExceptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomExceptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createForwardingCatchAllStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomForwardingCatchAllStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomInboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomLifecycleAdapterFactory()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomMessageInfoMappingType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createSecurityProviderType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomSecurityProviderType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomServiceType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createJndiTransactionManagerType1()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomTransactionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createCustomTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createDefaultComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createDefaultJavaComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createSedaModelType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createDefaultModelType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createDefineNotificationType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createDescriptionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createDisableNotificationType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createEncryptionSecurityFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createEncryptionTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createEndpointSelectorRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createExceptionPatternType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createExpressionFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createExpressionMessageInfoMappingType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createExtensibleEntryPointResolverSet()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createGenericObjectFactoryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createGlobalEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createGlobalPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createInboundCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createInboundEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createJndiConnectorType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createKeyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createKeyValueType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createListOrSetType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createLoggingCatchAllStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createMapType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createMessagePropertiesTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createMessageSplitterOutboundRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createMethodEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createMethodType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createMuleType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createNotificationManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createOutboundCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createOutboundEndpointType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createPasswordEncryptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createPojoBindingType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createPooledJavaComponentType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createPoolingProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createPropertyEntryPointResolverType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createPrototypeObjectFactoryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createQueueProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createReferenceType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createRefFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createRefTransformerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createReplyToType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createSecretKeyEncryptionStrategyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createSecurityManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createSedaServiceType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createSelectiveConsumerRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createServiceOverridesType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createSingletonObjectFactoryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createSpringBeanLookupType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createStaticRecipientListRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createThreadingProfileType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createTlsClientKeyStoreType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createTlsKeyStoreType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createTlsProtocolHandler()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createTlsTrustStoreType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createTlsServerTrustStoreType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createTransactionManagerType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createTypeFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createUnitaryFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createValueType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createWildcardFilterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createWireTapRouterType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 CoreFactory.eINSTANCE.createConnection()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 SpringFactory.eINSTANCE.createBaseCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 SpringFactory.eINSTANCE.createEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 SpringFactory.eINSTANCE.createTypedCollectionType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 SpringFactory.eINSTANCE.createListOrSetType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 SpringFactory.eINSTANCE.createMapType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 SpringFactory.eINSTANCE.createMetaType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 SpringFactory.eINSTANCE.createPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 SpringFactory.eINSTANCE.createPropsType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods(),
				 XMLTypeFactory.eINSTANCE.createAnyType()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeEntryPoint(),
				 CoreFactory.eINSTANCE.createMethodType()));
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
			childFeature == CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeObjectMethods() ||
			childFeature == CorePackage.eINSTANCE.getReflectionEntryPointResolverType_ExcludeEntryPoint();

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
		return CorePlugin.INSTANCE;
	}

}
