/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Filter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.TypeFilterType#getExpectedType <em>Expected Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getTypeFilterType()
 * @model extendedMetaData="name='typeFilterType' kind='empty'"
 * @generated
 */
public interface TypeFilterType extends AbstractFilterType {
	/**
	 * Returns the value of the '<em><b>Expected Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expected Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The expected class used in the comparison.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expected Type</em>' attribute.
	 * @see #setExpectedType(String)
	 * @see org.mule.ide.config.core.CorePackage#getTypeFilterType_ExpectedType()
	 * @model dataType="org.mule.ide.config.core.SubstitutableClass" required="true"
	 *        extendedMetaData="kind='attribute' name='expectedType'"
	 * @generated
	 */
	String getExpectedType();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TypeFilterType#getExpectedType <em>Expected Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expected Type</em>' attribute.
	 * @see #getExpectedType()
	 * @generated
	 */
	void setExpectedType(String value);

} // TypeFilterType
