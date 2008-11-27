/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Case Sensitive Pattern Filter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.CaseSensitivePatternFilterType#isCaseSensitive <em>Case Sensitive</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getCaseSensitivePatternFilterType()
 * @model extendedMetaData="name='caseSensitivePatternFilterType' kind='empty'"
 * @generated
 */
public interface CaseSensitivePatternFilterType extends PatternFilterType {
	/**
	 * Returns the value of the '<em><b>Case Sensitive</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             If false, the comparison ignores case.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Case Sensitive</em>' attribute.
	 * @see #isSetCaseSensitive()
	 * @see #unsetCaseSensitive()
	 * @see #setCaseSensitive(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getCaseSensitivePatternFilterType_CaseSensitive()
	 * @model default="true" unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='caseSensitive'"
	 * @generated
	 */
	boolean isCaseSensitive();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.CaseSensitivePatternFilterType#isCaseSensitive <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Sensitive</em>' attribute.
	 * @see #isSetCaseSensitive()
	 * @see #unsetCaseSensitive()
	 * @see #isCaseSensitive()
	 * @generated
	 */
	void setCaseSensitive(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.CaseSensitivePatternFilterType#isCaseSensitive <em>Case Sensitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCaseSensitive()
	 * @see #isCaseSensitive()
	 * @see #setCaseSensitive(boolean)
	 * @generated
	 */
	void unsetCaseSensitive();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.CaseSensitivePatternFilterType#isCaseSensitive <em>Case Sensitive</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Case Sensitive</em>' attribute is set.
	 * @see #unsetCaseSensitive()
	 * @see #isCaseSensitive()
	 * @see #setCaseSensitive(boolean)
	 * @generated
	 */
	boolean isSetCaseSensitive();

} // CaseSensitivePatternFilterType
