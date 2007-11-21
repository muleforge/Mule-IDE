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
 * A representation of the model object '<em><b>Abstract Transformer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.AbstractTransformerType#isIgnoreBadInput <em>Ignore Bad Input</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractTransformerType#getName <em>Name</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AbstractTransformerType#getReturnClass <em>Return Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getAbstractTransformerType()
 * @model extendedMetaData="name='abstractTransformerType' kind='empty'"
 * @generated
 */
public interface AbstractTransformerType extends EObject {
	/**
	 * Returns the value of the '<em><b>Ignore Bad Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Bad Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Bad Input</em>' attribute.
	 * @see #isSetIgnoreBadInput()
	 * @see #unsetIgnoreBadInput()
	 * @see #setIgnoreBadInput(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getAbstractTransformerType_IgnoreBadInput()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='ignoreBadInput'"
	 * @generated
	 */
	boolean isIgnoreBadInput();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.AbstractTransformerType#isIgnoreBadInput <em>Ignore Bad Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Bad Input</em>' attribute.
	 * @see #isSetIgnoreBadInput()
	 * @see #unsetIgnoreBadInput()
	 * @see #isIgnoreBadInput()
	 * @generated
	 */
	void setIgnoreBadInput(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.AbstractTransformerType#isIgnoreBadInput <em>Ignore Bad Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIgnoreBadInput()
	 * @see #isIgnoreBadInput()
	 * @see #setIgnoreBadInput(boolean)
	 * @generated
	 */
	void unsetIgnoreBadInput();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.AbstractTransformerType#isIgnoreBadInput <em>Ignore Bad Input</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ignore Bad Input</em>' attribute is set.
	 * @see #unsetIgnoreBadInput()
	 * @see #isIgnoreBadInput()
	 * @see #setIgnoreBadInput(boolean)
	 * @generated
	 */
	boolean isSetIgnoreBadInput();

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
	 * @see org.mule.ide.config.core.CorePackage#getAbstractTransformerType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.AbstractTransformerType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Return Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Class</em>' attribute.
	 * @see #setReturnClass(String)
	 * @see org.mule.ide.config.core.CorePackage#getAbstractTransformerType_ReturnClass()
	 * @model dataType="org.mule.ide.config.core.SubstitutableClass"
	 *        extendedMetaData="kind='attribute' name='returnClass'"
	 * @generated
	 */
	String getReturnClass();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.AbstractTransformerType#getReturnClass <em>Return Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Class</em>' attribute.
	 * @see #getReturnClass()
	 * @generated
	 */
	void setReturnClass(String value);

} // AbstractTransformerType
