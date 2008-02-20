/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.tests.park;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.tests.park.ParkPackage
 * @generated
 */
public interface ParkFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ParkFactory eINSTANCE = org.mule.ide.config.tests.park.impl.ParkFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Decal Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Decal Type</em>'.
	 * @generated
	 */
	DecalType createDecalType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	ParkType createParkType();

	/**
	 * Returns a new object of class '<em>Vehicle Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vehicle Type</em>'.
	 * @generated
	 */
	VehicleType createVehicleType();

	/**
	 * Returns a new object of class '<em>Insurance Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insurance Type</em>'.
	 * @generated
	 */
	InsuranceType createInsuranceType();

	/**
	 * Returns a new object of class '<em>Person Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Person Type</em>'.
	 * @generated
	 */
	PersonType createPersonType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ParkPackage getParkPackage();

} //ParkFactory
