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

} // VehicleType
