/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.tests.park;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.tests.park.PersonType#getId <em>Id</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.PersonType#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.tests.park.ParkPackage#getPersonType()
 * @model extendedMetaData="name='Person_._type' kind='elementOnly'"
 * @generated
 */
public interface PersonType extends EObject {
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
	 * @see org.mule.ide.config.tests.park.ParkPackage#getPersonType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.tests.park.PersonType#getId <em>Id</em>}' attribute.
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
	 * @see org.mule.ide.config.tests.park.ParkPackage#getPersonType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.tests.park.PersonType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PersonType
