/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.tests.park;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.tests.park.VehicleType#getMake <em>Make</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.VehicleType#getModel <em>Model</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.VehicleType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.VehicleType#getDecal <em>Decal</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.VehicleType#getPaint <em>Paint</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.VehicleType#getLicensePlate <em>License Plate</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.VehicleType#getNicknames <em>Nicknames</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.VehicleType#getCurrentInsurance <em>Current Insurance</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.VehicleType#getPolicyHistory <em>Policy History</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.VehicleType#getId <em>Id</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.VehicleType#getCurrentOwner <em>Current Owner</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.tests.park.ParkPackage#getVehicleType()
 * @model extendedMetaData="name='VehicleType' kind='elementOnly'"
 * @generated
 */
public interface VehicleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Make</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Make</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Make</em>' attribute.
	 * @see #setMake(String)
	 * @see org.mule.ide.config.tests.park.ParkPackage#getVehicleType_Make()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Make' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMake();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.tests.park.VehicleType#getMake <em>Make</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Make</em>' attribute.
	 * @see #getMake()
	 * @generated
	 */
	void setMake(String value);

	/**
	 * Returns the value of the '<em><b>Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Model</em>' attribute.
	 * @see #setModel(String)
	 * @see org.mule.ide.config.tests.park.ParkPackage#getVehicleType_Model()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Model' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModel();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.tests.park.VehicleType#getModel <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model</em>' attribute.
	 * @see #getModel()
	 * @generated
	 */
	void setModel(String value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.mule.ide.config.tests.park.ParkPackage#getVehicleType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:2'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Decal</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.tests.park.DecalType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decal</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decal</em>' containment reference list.
	 * @see org.mule.ide.config.tests.park.ParkPackage#getVehicleType_Decal()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Decal' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<DecalType> getDecal();

	/**
	 * Returns the value of the '<em><b>Paint</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paint</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paint</em>' attribute list.
	 * @see org.mule.ide.config.tests.park.ParkPackage#getVehicleType_Paint()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Paint' namespace='##targetNamespace' group='#group:2'"
	 * @generated
	 */
	EList<String> getPaint();

	/**
	 * Returns the value of the '<em><b>License Plate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>License Plate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>License Plate</em>' attribute.
	 * @see #setLicensePlate(String)
	 * @see org.mule.ide.config.tests.park.ParkPackage#getVehicleType_LicensePlate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='LicensePlate' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLicensePlate();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.tests.park.VehicleType#getLicensePlate <em>License Plate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>License Plate</em>' attribute.
	 * @see #getLicensePlate()
	 * @generated
	 */
	void setLicensePlate(String value);

	/**
	 * Returns the value of the '<em><b>Nicknames</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nicknames</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nicknames</em>' attribute list.
	 * @see org.mule.ide.config.tests.park.ParkPackage#getVehicleType_Nicknames()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='NickName' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getNicknames();

	/**
	 * Returns the value of the '<em><b>Current Insurance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Insurance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Insurance</em>' containment reference.
	 * @see #setCurrentInsurance(InsuranceType)
	 * @see org.mule.ide.config.tests.park.ParkPackage#getVehicleType_CurrentInsurance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InsurancePolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	InsuranceType getCurrentInsurance();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.tests.park.VehicleType#getCurrentInsurance <em>Current Insurance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Insurance</em>' containment reference.
	 * @see #getCurrentInsurance()
	 * @generated
	 */
	void setCurrentInsurance(InsuranceType value);

	/**
	 * Returns the value of the '<em><b>Policy History</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.tests.park.InsuranceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Policy History</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Policy History</em>' containment reference list.
	 * @see org.mule.ide.config.tests.park.ParkPackage#getVehicleType_PolicyHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='InactiveInsurancePolicy' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InsuranceType> getPolicyHistory();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.mule.ide.config.tests.park.ParkPackage#getVehicleType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.tests.park.VehicleType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Current Owner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Owner</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Owner</em>' containment reference.
	 * @see #isSetCurrentOwner()
	 * @see #unsetCurrentOwner()
	 * @see #setCurrentOwner(PersonType)
	 * @see org.mule.ide.config.tests.park.ParkPackage#getVehicleType_CurrentOwner()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="kind='element' name='Owner' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonType getCurrentOwner();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.tests.park.VehicleType#getCurrentOwner <em>Current Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Owner</em>' containment reference.
	 * @see #isSetCurrentOwner()
	 * @see #unsetCurrentOwner()
	 * @see #getCurrentOwner()
	 * @generated
	 */
	void setCurrentOwner(PersonType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.tests.park.VehicleType#getCurrentOwner <em>Current Owner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCurrentOwner()
	 * @see #getCurrentOwner()
	 * @see #setCurrentOwner(PersonType)
	 * @generated
	 */
	void unsetCurrentOwner();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.tests.park.VehicleType#getCurrentOwner <em>Current Owner</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Current Owner</em>' containment reference is set.
	 * @see #unsetCurrentOwner()
	 * @see #getCurrentOwner()
	 * @see #setCurrentOwner(PersonType)
	 * @generated
	 */
	boolean isSetCurrentOwner();

} // VehicleType
