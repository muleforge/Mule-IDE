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
 * A representation of the model object '<em><b>Return Argument Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.ReturnArgumentType#getCustomEvaluator <em>Custom Evaluator</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ReturnArgumentType#getEvaluator <em>Evaluator</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ReturnArgumentType#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ReturnArgumentType#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getReturnArgumentType()
 * @model extendedMetaData="name='return-argument_._type' kind='empty'"
 * @generated
 */
public interface ReturnArgumentType extends EObject {
	/**
	 * Returns the value of the '<em><b>Custom Evaluator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Evaluator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Evaluator</em>' attribute.
	 * @see #setCustomEvaluator(String)
	 * @see org.mule.ide.config.core.CorePackage#getReturnArgumentType_CustomEvaluator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='custom-evaluator'"
	 * @generated
	 */
	String getCustomEvaluator();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ReturnArgumentType#getCustomEvaluator <em>Custom Evaluator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Evaluator</em>' attribute.
	 * @see #getCustomEvaluator()
	 * @generated
	 */
	void setCustomEvaluator(String value);

	/**
	 * Returns the value of the '<em><b>Evaluator</b></em>' attribute.
	 * The default value is <code>"groovy"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.core.EvaluatorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluator</em>' attribute.
	 * @see org.mule.ide.config.core.EvaluatorType
	 * @see #isSetEvaluator()
	 * @see #unsetEvaluator()
	 * @see #setEvaluator(EvaluatorType)
	 * @see org.mule.ide.config.core.CorePackage#getReturnArgumentType_Evaluator()
	 * @model default="groovy" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='evaluator'"
	 * @generated
	 */
	EvaluatorType getEvaluator();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ReturnArgumentType#getEvaluator <em>Evaluator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluator</em>' attribute.
	 * @see org.mule.ide.config.core.EvaluatorType
	 * @see #isSetEvaluator()
	 * @see #unsetEvaluator()
	 * @see #getEvaluator()
	 * @generated
	 */
	void setEvaluator(EvaluatorType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ReturnArgumentType#getEvaluator <em>Evaluator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEvaluator()
	 * @see #getEvaluator()
	 * @see #setEvaluator(EvaluatorType)
	 * @generated
	 */
	void unsetEvaluator();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ReturnArgumentType#getEvaluator <em>Evaluator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Evaluator</em>' attribute is set.
	 * @see #unsetEvaluator()
	 * @see #getEvaluator()
	 * @see #setEvaluator(EvaluatorType)
	 * @generated
	 */
	boolean isSetEvaluator();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.mule.ide.config.core.CorePackage#getReturnArgumentType_Expression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='expression'"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ReturnArgumentType#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #isSetOptional()
	 * @see #unsetOptional()
	 * @see #setOptional(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getReturnArgumentType_Optional()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='optional'"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ReturnArgumentType#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isSetOptional()
	 * @see #unsetOptional()
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ReturnArgumentType#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOptional()
	 * @see #isOptional()
	 * @see #setOptional(boolean)
	 * @generated
	 */
	void unsetOptional();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ReturnArgumentType#isOptional <em>Optional</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Optional</em>' attribute is set.
	 * @see #unsetOptional()
	 * @see #isOptional()
	 * @see #setOptional(boolean)
	 * @generated
	 */
	boolean isSetOptional();

} // ReturnArgumentType