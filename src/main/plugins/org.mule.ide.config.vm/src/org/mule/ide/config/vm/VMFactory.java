/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.vm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.vm.VMPackage
 * @generated
 */
public interface VMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VMFactory eINSTANCE = org.mule.ide.config.vm.impl.VMFactoryImpl.init();

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
	 * Returns a new object of class '<em>Outbound Endpoint Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Outbound Endpoint Type</em>'.
	 * @generated
	 */
	OutboundEndpointType createOutboundEndpointType();

	/**
	 * Returns a new object of class '<em>Vm Connector Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vm Connector Type</em>'.
	 * @generated
	 */
	VmConnectorType createVmConnectorType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VMPackage getVMPackage();

} //VMFactory
