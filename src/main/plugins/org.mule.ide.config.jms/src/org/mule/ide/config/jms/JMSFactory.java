/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.jms;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.jms.JMSPackage
 * @generated
 */
public interface JMSFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JMSFactory eINSTANCE = org.mule.ide.config.jms.impl.JMSFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Active Mq Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Active Mq Connector Type</em>'.
	 * @generated
	 */
	ActiveMqConnectorType createActiveMqConnectorType();

	/**
	 * Returns a new object of class '<em>Custom Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Connector Type</em>'.
	 * @generated
	 */
	CustomConnectorType createCustomConnectorType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Generic Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generic Connector Type</em>'.
	 * @generated
	 */
	GenericConnectorType createGenericConnectorType();

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
	 * Returns a new object of class '<em>Jms Selector Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jms Selector Filter</em>'.
	 * @generated
	 */
	JmsSelectorFilter createJmsSelectorFilter();

	/**
	 * Returns a new object of class '<em>Outbound Endpoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outbound Endpoint Type</em>'.
	 * @generated
	 */
	OutboundEndpointType createOutboundEndpointType();

	/**
	 * Returns a new object of class '<em>Property Filter Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property Filter Type</em>'.
	 * @generated
	 */
	PropertyFilterType createPropertyFilterType();

	/**
	 * Returns a new object of class '<em>Vendor Jms Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vendor Jms Connector Type</em>'.
	 * @generated
	 */
	VendorJmsConnectorType createVendorJmsConnectorType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JMSPackage getJMSPackage();

} //JMSFactory
