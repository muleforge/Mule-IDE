/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Filter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.AbstractFilterType#getName <em>Name</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractFilterType#isNot <em>Not</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getAbstractFilterType()
 * @model extendedMetaData="name='abstractFilterType' kind='empty'"
 * @generated
 */
public interface AbstractFilterType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     Identifies the filter so that other elements can reference it.
	 *                     Required if the filter is defined at the global level.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mule.ide.config.core.CorePackage#getAbstractFilterType_Name()
	 * @model dataType="org.mule.ide.config.core.SubstitutableName"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.AbstractFilterType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Not</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Not</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     Inverts the filter's condition.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Not</em>' attribute.
	 * @see #isSetNot()
	 * @see #unsetNot()
	 * @see #setNot(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getAbstractFilterType_Not()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='not'"
	 * @generated
	 */
	boolean isNot();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.AbstractFilterType#isNot <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Not</em>' attribute.
	 * @see #isSetNot()
	 * @see #unsetNot()
	 * @see #isNot()
	 * @generated
	 */
	void setNot(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.AbstractFilterType#isNot <em>Not</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNot()
	 * @see #isNot()
	 * @see #setNot(boolean)
	 * @generated
	 */
	void unsetNot();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.AbstractFilterType#isNot <em>Not</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Not</em>' attribute is set.
	 * @see #unsetNot()
	 * @see #isNot()
	 * @see #setNot(boolean)
	 * @generated
	 */
	boolean isSetNot();

} // AbstractFilterType
