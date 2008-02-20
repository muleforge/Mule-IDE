/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.tests.park.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.mule.ide.config.tests.park.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ParkFactoryImpl extends EFactoryImpl implements ParkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ParkFactory init() {
		try {
			ParkFactory theParkFactory = (ParkFactory)EPackage.Registry.INSTANCE.getEFactory("urn:vehiclePark"); 
			if (theParkFactory != null) {
				return theParkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ParkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParkFactoryImpl() {
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
			case ParkPackage.DECAL_TYPE: return createDecalType();
			case ParkPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case ParkPackage.PARK_TYPE: return createParkType();
			case ParkPackage.VEHICLE_TYPE: return createVehicleType();
			case ParkPackage.INSURANCE_TYPE: return createInsuranceType();
			case ParkPackage.PERSON_TYPE: return createPersonType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecalType createDecalType() {
		DecalTypeImpl decalType = new DecalTypeImpl();
		return decalType;
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
	public ParkType createParkType() {
		ParkTypeImpl parkType = new ParkTypeImpl();
		return parkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleType createVehicleType() {
		VehicleTypeImpl vehicleType = new VehicleTypeImpl();
		return vehicleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsuranceType createInsuranceType() {
		InsuranceTypeImpl insuranceType = new InsuranceTypeImpl();
		return insuranceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonType createPersonType() {
		PersonTypeImpl personType = new PersonTypeImpl();
		return personType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParkPackage getParkPackage() {
		return (ParkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ParkPackage getPackage() {
		return ParkPackage.eINSTANCE;
	}

} //ParkFactoryImpl
