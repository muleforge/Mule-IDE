/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.tests.park;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Insurance Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.tests.park.InsuranceType#getId <em>Id</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.InsuranceType#getName <em>Name</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.InsuranceType#getClient <em>Client</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.InsuranceType#getHistory <em>History</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.tests.park.ParkPackage#getInsuranceType()
 * @model extendedMetaData="name='InsurancePolicy_._type' kind='elementOnly'"
 * @generated
 */
public interface InsuranceType extends EObject {
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
	 * @see org.mule.ide.config.tests.park.ParkPackage#getInsuranceType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.tests.park.InsuranceType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mule.ide.config.tests.park.ParkPackage#getInsuranceType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.tests.park.InsuranceType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(PersonType)
	 * @see org.mule.ide.config.tests.park.ParkPackage#getInsuranceType_Client()
	 * @model extendedMetaData="kind='element' name='Client'"
	 * @generated
	 */
	PersonType getClient();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.tests.park.InsuranceType#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(PersonType value);

	/**
	 * Returns the value of the '<em><b>History</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>History</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>History</em>' attribute list.
	 * @see org.mule.ide.config.tests.park.ParkPackage#getInsuranceType_History()
	 * @model extendedMetaData="kind='element' name='HistoryEntry'"
	 * @generated
	 */
	EList<String> getHistory();

} // InsuranceType
