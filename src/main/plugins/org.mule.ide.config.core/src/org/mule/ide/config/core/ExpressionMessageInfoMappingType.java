/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Message Info Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.ExpressionMessageInfoMappingType#getCorrelationIdExpression <em>Correlation Id Expression</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ExpressionMessageInfoMappingType#getMessageIdExpression <em>Message Id Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getExpressionMessageInfoMappingType()
 * @model extendedMetaData="name='expressionMessageInfoMappingType' kind='empty'"
 * @generated
 */
public interface ExpressionMessageInfoMappingType extends AbstractMessageInfoMappingType {
	/**
	 * Returns the value of the '<em><b>Correlation Id Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Id Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Id Expression</em>' attribute.
	 * @see #setCorrelationIdExpression(String)
	 * @see org.mule.ide.config.core.CorePackage#getExpressionMessageInfoMappingType_CorrelationIdExpression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='correlationIdExpression'"
	 * @generated
	 */
	String getCorrelationIdExpression();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ExpressionMessageInfoMappingType#getCorrelationIdExpression <em>Correlation Id Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Id Expression</em>' attribute.
	 * @see #getCorrelationIdExpression()
	 * @generated
	 */
	void setCorrelationIdExpression(String value);

	/**
	 * Returns the value of the '<em><b>Message Id Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Id Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Id Expression</em>' attribute.
	 * @see #setMessageIdExpression(String)
	 * @see org.mule.ide.config.core.CorePackage#getExpressionMessageInfoMappingType_MessageIdExpression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='messageIdExpression'"
	 * @generated
	 */
	String getMessageIdExpression();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ExpressionMessageInfoMappingType#getMessageIdExpression <em>Message Id Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Id Expression</em>' attribute.
	 * @see #getMessageIdExpression()
	 * @generated
	 */
	void setMessageIdExpression(String value);

} // ExpressionMessageInfoMappingType
