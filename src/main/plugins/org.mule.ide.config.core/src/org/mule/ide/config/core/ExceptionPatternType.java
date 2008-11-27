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
 * A representation of the model object '<em><b>Exception Pattern Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.ExceptionPatternType#getExceptionPattern <em>Exception Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getExceptionPatternType()
 * @model extendedMetaData="name='exceptionPatternType' kind='empty'"
 * @generated
 */
public interface ExceptionPatternType extends EObject {
	/**
	 * Returns the value of the '<em><b>Exception Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A comma-separate list of wildcard expressions that will be matched against the
	 *                     fully qualified cassname of the current exception received by the ExceptionStrategy.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exception Pattern</em>' attribute.
	 * @see #setExceptionPattern(String)
	 * @see org.mule.ide.config.core.CorePackage#getExceptionPatternType_ExceptionPattern()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='exception-pattern'"
	 * @generated
	 */
	String getExceptionPattern();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ExceptionPatternType#getExceptionPattern <em>Exception Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception Pattern</em>' attribute.
	 * @see #getExceptionPattern()
	 * @generated
	 */
	void setExceptionPattern(String value);

} // ExceptionPatternType
