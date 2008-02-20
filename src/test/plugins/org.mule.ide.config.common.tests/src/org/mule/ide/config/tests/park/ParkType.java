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
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.tests.park.ParkType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.ParkType#getAbstractVehicleGroup <em>Abstract Vehicle Group</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.ParkType#getAbstractVehicle <em>Abstract Vehicle</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.ParkType#getPersonsGroup <em>Persons Group</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.ParkType#getPersons <em>Persons</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.tests.park.ParkPackage#getParkType()
 * @model extendedMetaData="name='Park_._type' kind='elementOnly'"
 * @generated
 */
public interface ParkType extends EObject {
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
	 * @see org.mule.ide.config.tests.park.ParkPackage#getParkType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Vehicle Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Vehicle Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Vehicle Group</em>' attribute list.
	 * @see org.mule.ide.config.tests.park.ParkPackage#getParkType_AbstractVehicleGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='AbstractVehicle:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getAbstractVehicleGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Vehicle</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.tests.park.VehicleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Vehicle</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Vehicle</em>' containment reference list.
	 * @see org.mule.ide.config.tests.park.ParkPackage#getParkType_AbstractVehicle()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractVehicle' namespace='##targetNamespace' group='AbstractVehicle:group'"
	 * @generated
	 */
	EList<VehicleType> getAbstractVehicle();

	/**
	 * Returns the value of the '<em><b>Persons Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons Group</em>' attribute list.
	 * @see org.mule.ide.config.tests.park.ParkPackage#getParkType_PersonsGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='Person:group' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	FeatureMap getPersonsGroup();

	/**
	 * Returns the value of the '<em><b>Persons</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.tests.park.PersonType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persons</em>' containment reference list.
	 * @see org.mule.ide.config.tests.park.ParkPackage#getParkType_Persons()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Person' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PersonType> getPersons();

} // ParkType
