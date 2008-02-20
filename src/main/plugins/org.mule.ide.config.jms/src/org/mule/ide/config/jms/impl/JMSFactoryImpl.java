/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.jms.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mule.ide.config.jms.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JMSFactoryImpl extends EFactoryImpl implements JMSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JMSFactory init() {
		try {
			JMSFactory theJMSFactory = (JMSFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mulesource.org/schema/mule/jms/2.0"); 
			if (theJMSFactory != null) {
				return theJMSFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JMSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JMSFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JMSPackage.ACTIVE_MQ_CONNECTOR_TYPE: return createActiveMqConnectorType();
			case JMSPackage.CUSTOM_CONNECTOR_TYPE: return createCustomConnectorType();
			case JMSPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case JMSPackage.GENERIC_CONNECTOR_TYPE: return createGenericConnectorType();
			case JMSPackage.GLOBAL_ENDPOINT_TYPE: return createGlobalEndpointType();
			case JMSPackage.INBOUND_ENDPOINT_TYPE: return createInboundEndpointType();
			case JMSPackage.JMS_SELECTOR_FILTER: return createJmsSelectorFilter();
			case JMSPackage.JMS_TRANSACTION_TYPE: return createJmsTransactionType();
			case JMSPackage.OUTBOUND_ENDPOINT_TYPE: return createOutboundEndpointType();
			case JMSPackage.PROPERTY_FILTER_TYPE: return createPropertyFilterType();
			case JMSPackage.VENDOR_JMS_CONNECTOR_TYPE: return createVendorJmsConnectorType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case JMSPackage.ACKNOWLEDGEMENT_MODE_TYPE:
				return createAcknowledgementModeTypeFromString(eDataType, initialValue);
			case JMSPackage.SPECIFICATION_TYPE:
				return createSpecificationTypeFromString(eDataType, initialValue);
			case JMSPackage.ACKNOWLEDGEMENT_MODE_TYPE_OBJECT:
				return createAcknowledgementModeTypeObjectFromString(eDataType, initialValue);
			case JMSPackage.SPECIFICATION_TYPE_OBJECT:
				return createSpecificationTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case JMSPackage.ACKNOWLEDGEMENT_MODE_TYPE:
				return convertAcknowledgementModeTypeToString(eDataType, instanceValue);
			case JMSPackage.SPECIFICATION_TYPE:
				return convertSpecificationTypeToString(eDataType, instanceValue);
			case JMSPackage.ACKNOWLEDGEMENT_MODE_TYPE_OBJECT:
				return convertAcknowledgementModeTypeObjectToString(eDataType, instanceValue);
			case JMSPackage.SPECIFICATION_TYPE_OBJECT:
				return convertSpecificationTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActiveMqConnectorType createActiveMqConnectorType() {
		ActiveMqConnectorTypeImpl activeMqConnectorType = new ActiveMqConnectorTypeImpl();
		return activeMqConnectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomConnectorType createCustomConnectorType() {
		CustomConnectorTypeImpl customConnectorType = new CustomConnectorTypeImpl();
		return customConnectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericConnectorType createGenericConnectorType() {
		GenericConnectorTypeImpl genericConnectorType = new GenericConnectorTypeImpl();
		return genericConnectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalEndpointType createGlobalEndpointType() {
		GlobalEndpointTypeImpl globalEndpointType = new GlobalEndpointTypeImpl();
		return globalEndpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundEndpointType createInboundEndpointType() {
		InboundEndpointTypeImpl inboundEndpointType = new InboundEndpointTypeImpl();
		return inboundEndpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JmsSelectorFilter createJmsSelectorFilter() {
		JmsSelectorFilterImpl jmsSelectorFilter = new JmsSelectorFilterImpl();
		return jmsSelectorFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JmsTransactionType createJmsTransactionType() {
		JmsTransactionTypeImpl jmsTransactionType = new JmsTransactionTypeImpl();
		return jmsTransactionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundEndpointType createOutboundEndpointType() {
		OutboundEndpointTypeImpl outboundEndpointType = new OutboundEndpointTypeImpl();
		return outboundEndpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyFilterType createPropertyFilterType() {
		PropertyFilterTypeImpl propertyFilterType = new PropertyFilterTypeImpl();
		return propertyFilterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VendorJmsConnectorType createVendorJmsConnectorType() {
		VendorJmsConnectorTypeImpl vendorJmsConnectorType = new VendorJmsConnectorTypeImpl();
		return vendorJmsConnectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcknowledgementModeType createAcknowledgementModeTypeFromString(EDataType eDataType, String initialValue) {
		AcknowledgementModeType result = AcknowledgementModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAcknowledgementModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationType createSpecificationTypeFromString(EDataType eDataType, String initialValue) {
		SpecificationType result = SpecificationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecificationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcknowledgementModeType createAcknowledgementModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAcknowledgementModeTypeFromString(JMSPackage.Literals.ACKNOWLEDGEMENT_MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAcknowledgementModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAcknowledgementModeTypeToString(JMSPackage.Literals.ACKNOWLEDGEMENT_MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecificationType createSpecificationTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSpecificationTypeFromString(JMSPackage.Literals.SPECIFICATION_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecificationTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSpecificationTypeToString(JMSPackage.Literals.SPECIFICATION_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JMSPackage getJMSPackage() {
		return (JMSPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JMSPackage getPackage() {
		return JMSPackage.eINSTANCE;
	}

} //JMSFactoryImpl
