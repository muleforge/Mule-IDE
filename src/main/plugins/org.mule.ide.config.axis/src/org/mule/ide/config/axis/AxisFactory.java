/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.axis;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.axis.AxisPackage
 * @generated
 */
public interface AxisFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AxisFactory eINSTANCE = org.mule.ide.config.axis.impl.AxisFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Connector Type</em>'.
	 * @generated
	 */
	AxisConnectorType createAxisConnectorType();

	/**
	 * Returns a new object of class '<em>Bean Type Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bean Type Type</em>'.
	 * @generated
	 */
	BeanTypeType createBeanTypeType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Global Endpoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Global Endpoint Type</em>'.
	 * @generated
	 */
	GlobalEndpointType createGlobalEndpointType();

	/**
	 * Returns a new object of class '<em>Inbound Endpoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inbound Endpoint Type</em>'.
	 * @generated
	 */
	InboundEndpointType createInboundEndpointType();

	/**
	 * Returns a new object of class '<em>Options Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Options Type</em>'.
	 * @generated
	 */
	OptionsType createOptionsType();

	/**
	 * Returns a new object of class '<em>Outbound Endpoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outbound Endpoint Type</em>'.
	 * @generated
	 */
	OutboundEndpointType createOutboundEndpointType();

	/**
	 * Returns a new object of class '<em>Soap Method Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Soap Method Type</em>'.
	 * @generated
	 */
	SoapMethodType createSoapMethodType();

	/**
	 * Returns a new object of class '<em>Soap Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Soap Parameter Type</em>'.
	 * @generated
	 */
	SoapParameterType createSoapParameterType();

	/**
	 * Returns a new object of class '<em>Soap Return Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Soap Return Type</em>'.
	 * @generated
	 */
	SoapReturnType createSoapReturnType();

	/**
	 * Returns a new object of class '<em>Soap Service Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Soap Service Type</em>'.
	 * @generated
	 */
	SoapServiceType createSoapServiceType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AxisPackage getAxisPackage();

} //AxisFactory
