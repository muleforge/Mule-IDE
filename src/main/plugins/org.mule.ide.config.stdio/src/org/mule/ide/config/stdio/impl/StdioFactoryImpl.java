/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.stdio.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mule.ide.config.stdio.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StdioFactoryImpl extends EFactoryImpl implements StdioFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StdioFactory init() {
		try {
			StdioFactory theStdioFactory = (StdioFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.mulesource.org/schema/mule/stdio/2.0"); 
			if (theStdioFactory != null) {
				return theStdioFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StdioFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StdioFactoryImpl() {
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
			case StdioPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case StdioPackage.GLOBAL_ENDPOINT_TYPE: return createGlobalEndpointType();
			case StdioPackage.INBOUND_ENDPOINT_TYPE: return createInboundEndpointType();
			case StdioPackage.OUTBOUND_ENDPOINT_TYPE: return createOutboundEndpointType();
			case StdioPackage.STDIO_CONNECTOR_TYPE: return createStdioConnectorType();
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
			case StdioPackage.SYSTEM_TYPE:
				return createSystemTypeFromString(eDataType, initialValue);
			case StdioPackage.SYSTEM_TYPE_OBJECT:
				return createSystemTypeObjectFromString(eDataType, initialValue);
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
			case StdioPackage.SYSTEM_TYPE:
				return convertSystemTypeToString(eDataType, instanceValue);
			case StdioPackage.SYSTEM_TYPE_OBJECT:
				return convertSystemTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
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
	public OutboundEndpointType createOutboundEndpointType() {
		OutboundEndpointTypeImpl outboundEndpointType = new OutboundEndpointTypeImpl();
		return outboundEndpointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StdioConnectorType createStdioConnectorType() {
		StdioConnectorTypeImpl stdioConnectorType = new StdioConnectorTypeImpl();
		return stdioConnectorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemType createSystemTypeFromString(EDataType eDataType, String initialValue) {
		SystemType result = SystemType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemType createSystemTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSystemTypeFromString(StdioPackage.Literals.SYSTEM_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSystemTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSystemTypeToString(StdioPackage.Literals.SYSTEM_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StdioPackage getStdioPackage() {
		return (StdioPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StdioPackage getPackage() {
		return StdioPackage.eINSTANCE;
	}

} //StdioFactoryImpl
