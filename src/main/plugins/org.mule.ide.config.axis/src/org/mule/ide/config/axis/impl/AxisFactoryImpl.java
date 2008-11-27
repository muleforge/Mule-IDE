/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.axis.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mule.ide.config.axis.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AxisFactoryImpl extends EFactoryImpl implements AxisFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AxisFactory init() {
		try {
			AxisFactory theAxisFactory = (AxisFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mulesource.org/schema/mule/axis/2.0"); 
			if (theAxisFactory != null) {
				return theAxisFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AxisFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisFactoryImpl() {
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
			case AxisPackage.AXIS_CONNECTOR_TYPE: return createAxisConnectorType();
			case AxisPackage.BEAN_TYPE_TYPE: return createBeanTypeType();
			case AxisPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case AxisPackage.GLOBAL_ENDPOINT_TYPE: return createGlobalEndpointType();
			case AxisPackage.INBOUND_ENDPOINT_TYPE: return createInboundEndpointType();
			case AxisPackage.OPTIONS_TYPE: return createOptionsType();
			case AxisPackage.OUTBOUND_ENDPOINT_TYPE: return createOutboundEndpointType();
			case AxisPackage.SOAP_METHOD_TYPE: return createSoapMethodType();
			case AxisPackage.SOAP_PARAMETER_TYPE: return createSoapParameterType();
			case AxisPackage.SOAP_RETURN_TYPE: return createSoapReturnType();
			case AxisPackage.SOAP_SERVICE_TYPE: return createSoapServiceType();
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
			case AxisPackage.MODE_TYPE:
				return createModeTypeFromString(eDataType, initialValue);
			case AxisPackage.STYLE_TYPE:
				return createStyleTypeFromString(eDataType, initialValue);
			case AxisPackage.USE_TYPE:
				return createUseTypeFromString(eDataType, initialValue);
			case AxisPackage.MODE_TYPE_OBJECT:
				return createModeTypeObjectFromString(eDataType, initialValue);
			case AxisPackage.STYLE_TYPE_OBJECT:
				return createStyleTypeObjectFromString(eDataType, initialValue);
			case AxisPackage.USE_TYPE_OBJECT:
				return createUseTypeObjectFromString(eDataType, initialValue);
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
			case AxisPackage.MODE_TYPE:
				return convertModeTypeToString(eDataType, instanceValue);
			case AxisPackage.STYLE_TYPE:
				return convertStyleTypeToString(eDataType, instanceValue);
			case AxisPackage.USE_TYPE:
				return convertUseTypeToString(eDataType, instanceValue);
			case AxisPackage.MODE_TYPE_OBJECT:
				return convertModeTypeObjectToString(eDataType, instanceValue);
			case AxisPackage.STYLE_TYPE_OBJECT:
				return convertStyleTypeObjectToString(eDataType, instanceValue);
			case AxisPackage.USE_TYPE_OBJECT:
				return convertUseTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisConnectorType createAxisConnectorType() {
		AxisConnectorTypeImpl axisConnectorType = new AxisConnectorTypeImpl();
		return axisConnectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BeanTypeType createBeanTypeType() {
		BeanTypeTypeImpl beanTypeType = new BeanTypeTypeImpl();
		return beanTypeType;
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
	public OptionsType createOptionsType() {
		OptionsTypeImpl optionsType = new OptionsTypeImpl();
		return optionsType;
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
	public SoapMethodType createSoapMethodType() {
		SoapMethodTypeImpl soapMethodType = new SoapMethodTypeImpl();
		return soapMethodType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoapParameterType createSoapParameterType() {
		SoapParameterTypeImpl soapParameterType = new SoapParameterTypeImpl();
		return soapParameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoapReturnType createSoapReturnType() {
		SoapReturnTypeImpl soapReturnType = new SoapReturnTypeImpl();
		return soapReturnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoapServiceType createSoapServiceType() {
		SoapServiceTypeImpl soapServiceType = new SoapServiceTypeImpl();
		return soapServiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType createModeTypeFromString(EDataType eDataType, String initialValue) {
		ModeType result = ModeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType createStyleTypeFromString(EDataType eDataType, String initialValue) {
		StyleType result = StyleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseType createUseTypeFromString(EDataType eDataType, String initialValue) {
		UseType result = UseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModeType createModeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createModeTypeFromString(AxisPackage.Literals.MODE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertModeTypeToString(AxisPackage.Literals.MODE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType createStyleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createStyleTypeFromString(AxisPackage.Literals.STYLE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertStyleTypeToString(AxisPackage.Literals.STYLE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UseType createUseTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createUseTypeFromString(AxisPackage.Literals.USE_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUseTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUseTypeToString(AxisPackage.Literals.USE_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AxisPackage getAxisPackage() {
		return (AxisPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AxisPackage getPackage() {
		return AxisPackage.eINSTANCE;
	}

} //AxisFactoryImpl
