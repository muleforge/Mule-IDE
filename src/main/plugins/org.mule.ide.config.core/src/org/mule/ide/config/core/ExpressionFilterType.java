/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Filter Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.ExpressionFilterType#getCustomEvaluator <em>Custom Evaluator</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ExpressionFilterType#getEvaluator <em>Evaluator</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ExpressionFilterType#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ExpressionFilterType#isNullReturnsTrue <em>Null Returns True</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getExpressionFilterType()
 * @model extendedMetaData="name='expressionFilterType' kind='empty'"
 * @generated
 */
public interface ExpressionFilterType extends AbstractFilterType {
	/**
	 * Returns the value of the '<em><b>Custom Evaluator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Must be set if the evaluator is set to 'custom'. Also the custom evaluator
	 *                             must be registered with the ExpressionEvaluatorManager if it is to be used here.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Evaluator</em>' attribute.
	 * @see #setCustomEvaluator(String)
	 * @see org.mule.ide.config.core.CorePackage#getExpressionFilterType_CustomEvaluator()
	 * @model dataType="org.mule.ide.config.core.SubstitutableName"
	 *        extendedMetaData="kind='attribute' name='customEvaluator'"
	 * @generated
	 */
	String getCustomEvaluator();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ExpressionFilterType#getCustomEvaluator <em>Custom Evaluator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Evaluator</em>' attribute.
	 * @see #getCustomEvaluator()
	 * @generated
	 */
	void setCustomEvaluator(String value);

	/**
	 * Returns the value of the '<em><b>Evaluator</b></em>' attribute.
	 * The default value is <code>"header"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.core.EvaluatorType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expression evaluator to use. The expression filter supports some types
	 *                             such as header, payload, exception, wildcard and regex, that are in-built filters not
	 *                             registered with the ExpressionEvaluatorManager. All others are registered with the
	 *                             ExpressionEvaluatorManager. Where XPath, bean and ongl are used, the expression should be a
	 *                             boolean expression.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Evaluator</em>' attribute.
	 * @see org.mule.ide.config.core.EvaluatorType1
	 * @see #isSetEvaluator()
	 * @see #unsetEvaluator()
	 * @see #setEvaluator(EvaluatorType1)
	 * @see org.mule.ide.config.core.CorePackage#getExpressionFilterType_Evaluator()
	 * @model default="header" unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='evaluator'"
	 * @generated
	 */
	EvaluatorType1 getEvaluator();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ExpressionFilterType#getEvaluator <em>Evaluator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluator</em>' attribute.
	 * @see org.mule.ide.config.core.EvaluatorType1
	 * @see #isSetEvaluator()
	 * @see #unsetEvaluator()
	 * @see #getEvaluator()
	 * @generated
	 */
	void setEvaluator(EvaluatorType1 value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ExpressionFilterType#getEvaluator <em>Evaluator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEvaluator()
	 * @see #getEvaluator()
	 * @see #setEvaluator(EvaluatorType1)
	 * @generated
	 */
	void unsetEvaluator();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ExpressionFilterType#getEvaluator <em>Evaluator</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Evaluator</em>' attribute is set.
	 * @see #unsetEvaluator()
	 * @see #getEvaluator()
	 * @see #setEvaluator(EvaluatorType1)
	 * @generated
	 */
	boolean isSetEvaluator();

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The expression that will be evaluated. This should always be a boolean
	 *                             expression.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expression</em>' attribute.
	 * @see #setExpression(String)
	 * @see org.mule.ide.config.core.CorePackage#getExpressionFilterType_Expression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='expression'"
	 * @generated
	 */
	String getExpression();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ExpressionFilterType#getExpression <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' attribute.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(String value);

	/**
	 * Returns the value of the '<em><b>Null Returns True</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the specified expression returns null should the filter return true or
	 *                             false.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Null Returns True</em>' attribute.
	 * @see #isSetNullReturnsTrue()
	 * @see #unsetNullReturnsTrue()
	 * @see #setNullReturnsTrue(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getExpressionFilterType_NullReturnsTrue()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='nullReturnsTrue'"
	 * @generated
	 */
	boolean isNullReturnsTrue();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ExpressionFilterType#isNullReturnsTrue <em>Null Returns True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Null Returns True</em>' attribute.
	 * @see #isSetNullReturnsTrue()
	 * @see #unsetNullReturnsTrue()
	 * @see #isNullReturnsTrue()
	 * @generated
	 */
	void setNullReturnsTrue(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ExpressionFilterType#isNullReturnsTrue <em>Null Returns True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNullReturnsTrue()
	 * @see #isNullReturnsTrue()
	 * @see #setNullReturnsTrue(boolean)
	 * @generated
	 */
	void unsetNullReturnsTrue();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ExpressionFilterType#isNullReturnsTrue <em>Null Returns True</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Null Returns True</em>' attribute is set.
	 * @see #unsetNullReturnsTrue()
	 * @see #isNullReturnsTrue()
	 * @see #setNullReturnsTrue(boolean)
	 * @generated
	 */
	boolean isSetNullReturnsTrue();

} // ExpressionFilterType
