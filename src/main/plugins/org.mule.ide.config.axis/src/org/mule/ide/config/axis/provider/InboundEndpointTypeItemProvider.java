/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.axis.provider;


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

import org.mule.ide.config.axis.AxisFactory;
import org.mule.ide.config.axis.AxisPackage;
import org.mule.ide.config.axis.AxisPlugin;
import org.mule.ide.config.axis.InboundEndpointType;

import org.mule.ide.config.core.CoreFactory;
import org.mule.ide.config.core.CorePackage;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.axis.InboundEndpointType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class InboundEndpointTypeItemProvider
	extends org.mule.ide.config.core.provider.InboundEndpointTypeItemProvider
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
	public InboundEndpointTypeItemProvider(AdapterFactory adapterFactory) {
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

			addClientConfigPropertyDescriptor(object);
			addServiceNamespacePropertyDescriptor(object);
			addSoapActionPropertyDescriptor(object);
			addSOAPAction1PropertyDescriptor(object);
			addStylePropertyDescriptor(object);
			addUsePropertyDescriptor(object);
			addWsdlFilePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Client Config feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClientConfigPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InboundEndpointType_clientConfig_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InboundEndpointType_clientConfig_feature", "_UI_InboundEndpointType_type"),
				 AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__CLIENT_CONFIG,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Service Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InboundEndpointType_serviceNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InboundEndpointType_serviceNamespace_feature", "_UI_InboundEndpointType_type"),
				 AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__SERVICE_NAMESPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Soap Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSoapActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InboundEndpointType_soapAction_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InboundEndpointType_soapAction_feature", "_UI_InboundEndpointType_type"),
				 AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__SOAP_ACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the SOAP Action1 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSOAPAction1PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InboundEndpointType_sOAPAction1_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InboundEndpointType_sOAPAction1_feature", "_UI_InboundEndpointType_type"),
				 AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__SOAP_ACTION1,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Style feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStylePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InboundEndpointType_style_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InboundEndpointType_style_feature", "_UI_InboundEndpointType_type"),
				 AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__STYLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Use feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InboundEndpointType_use_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InboundEndpointType_use_feature", "_UI_InboundEndpointType_type"),
				 AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__USE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wsdl File feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWsdlFilePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_InboundEndpointType_wsdlFile_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_InboundEndpointType_wsdlFile_feature", "_UI_InboundEndpointType_type"),
				 AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__WSDL_FILE,
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
			childrenFeatures.add(AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__OPTIONS);
			childrenFeatures.add(AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__BEAN_TYPE);
			childrenFeatures.add(AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__SOAP_SERVICE);
			childrenFeatures.add(AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__SOAP_METHOD);
			childrenFeatures.add(AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__PROPERTY1);
			childrenFeatures.add(AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__PROPERTIES1);
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
		String label = ((InboundEndpointType)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_InboundEndpointType_type") :
			getString("_UI_InboundEndpointType_type") + " " + label;
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

		switch (notification.getFeatureID(InboundEndpointType.class)) {
			case AxisPackage.INBOUND_ENDPOINT_TYPE__CLIENT_CONFIG:
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SERVICE_NAMESPACE:
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_ACTION:
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_ACTION1:
			case AxisPackage.INBOUND_ENDPOINT_TYPE__STYLE:
			case AxisPackage.INBOUND_ENDPOINT_TYPE__USE:
			case AxisPackage.INBOUND_ENDPOINT_TYPE__WSDL_FILE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case AxisPackage.INBOUND_ENDPOINT_TYPE__OPTIONS:
			case AxisPackage.INBOUND_ENDPOINT_TYPE__BEAN_TYPE:
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_SERVICE:
			case AxisPackage.INBOUND_ENDPOINT_TYPE__SOAP_METHOD:
			case AxisPackage.INBOUND_ENDPOINT_TYPE__PROPERTY1:
			case AxisPackage.INBOUND_ENDPOINT_TYPE__PROPERTIES1:
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
				(AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__OPTIONS,
				 AxisFactory.eINSTANCE.createOptionsType()));

		newChildDescriptors.add
			(createChildParameter
				(AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__BEAN_TYPE,
				 AxisFactory.eINSTANCE.createBeanTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__SOAP_SERVICE,
				 AxisFactory.eINSTANCE.createSoapServiceType()));

		newChildDescriptors.add
			(createChildParameter
				(AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__SOAP_METHOD,
				 AxisFactory.eINSTANCE.createSoapMethodType()));

		newChildDescriptors.add
			(createChildParameter
				(AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__PROPERTY1,
				 CoreFactory.eINSTANCE.createKeyValueType()));

		newChildDescriptors.add
			(createChildParameter
				(AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__PROPERTIES1,
				 CoreFactory.eINSTANCE.createMapType()));
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
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_Base64DecoderTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_Base64EncoderTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToHexStringTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToObjectTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToSerializableTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ByteArrayToStringTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_GzipCompressTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_GzipUncompressTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_HexStringToByteArrayTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_NoActionTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ObjectToByteArrayTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ObjectToStringTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_SerializableToByteArrayTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_StringToByteArrayTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_XmlEntityDecoderTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_XmlEntityEncoderTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_CustomTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_DecryptTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_EncryptTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MessagePropertiesTransformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_Transformer() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_AndFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_OrFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_ExceptionTypeFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_PayloadTypeFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_MessagePropertyFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_RegexFilter() ||
			childFeature == CorePackage.eINSTANCE.getDocumentRoot_WildcardFilter() ||
			childFeature == CorePackage.eINSTANCE.getInboundEndpointType_Property() ||
			childFeature == AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__PROPERTY1 ||
			childFeature == CorePackage.eINSTANCE.getInboundEndpointType_Properties() ||
			childFeature == AxisPackage.Literals.INBOUND_ENDPOINT_TYPE__PROPERTIES1;

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
				AxisPlugin.INSTANCE.log(e);
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
		return AxisPlugin.INSTANCE;
	}

}
