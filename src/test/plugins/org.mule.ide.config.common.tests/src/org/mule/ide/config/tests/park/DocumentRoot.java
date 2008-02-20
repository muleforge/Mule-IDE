/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.tests.park;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.tests.park.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.DocumentRoot#getAbstractVehicle <em>Abstract Vehicle</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.DocumentRoot#getPark <em>Park</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.DocumentRoot#getVehicle <em>Vehicle</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.tests.park.ParkPackage#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.mule.ide.config.tests.park.ParkPackage#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.mule.ide.config.tests.park.ParkPackage#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.mule.ide.config.tests.park.ParkPackage#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Abstract Vehicle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Vehicle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Vehicle</em>' containment reference.
	 * @see org.mule.ide.config.tests.park.ParkPackage#getDocumentRoot_AbstractVehicle()
	 * @model containment="true" upper="-2" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='AbstractVehicle' namespace='##targetNamespace'"
	 * @generated
	 */
	VehicleType getAbstractVehicle();

	/**
	 * Returns the value of the '<em><b>Park</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Park</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Park</em>' containment reference.
	 * @see #setPark(ParkType)
	 * @see org.mule.ide.config.tests.park.ParkPackage#getDocumentRoot_Park()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Park' namespace='##targetNamespace'"
	 * @generated
	 */
	ParkType getPark();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.tests.park.DocumentRoot#getPark <em>Park</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Park</em>' containment reference.
	 * @see #getPark()
	 * @generated
	 */
	void setPark(ParkType value);

	/**
	 * Returns the value of the '<em><b>Vehicle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vehicle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle</em>' containment reference.
	 * @see #setVehicle(VehicleType)
	 * @see org.mule.ide.config.tests.park.ParkPackage#getDocumentRoot_Vehicle()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Vehicle' namespace='##targetNamespace' affiliation='AbstractVehicle'"
	 * @generated
	 */
	VehicleType getVehicle();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.tests.park.DocumentRoot#getVehicle <em>Vehicle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle</em>' containment reference.
	 * @see #getVehicle()
	 * @generated
	 */
	void setVehicle(VehicleType value);

} // DocumentRoot
