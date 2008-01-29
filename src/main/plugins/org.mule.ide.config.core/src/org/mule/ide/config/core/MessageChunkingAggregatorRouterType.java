/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Chunking Aggregator Router Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.MessageChunkingAggregatorRouterType#getCorrelationExpression <em>Correlation Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getMessageChunkingAggregatorRouterType()
 * @model extendedMetaData="name='messageChunkingAggregatorRouterType' kind='elementOnly'"
 * @generated
 */
public interface MessageChunkingAggregatorRouterType extends FilteredInboundRouterType {
	/**
	 * Returns the value of the '<em><b>Correlation Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correlation Expression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correlation Expression</em>' attribute.
	 * @see #setCorrelationExpression(String)
	 * @see org.mule.ide.config.core.CorePackage#getMessageChunkingAggregatorRouterType_CorrelationExpression()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='correlationExpression'"
	 * @generated
	 */
	String getCorrelationExpression();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MessageChunkingAggregatorRouterType#getCorrelationExpression <em>Correlation Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correlation Expression</em>' attribute.
	 * @see #getCorrelationExpression()
	 * @generated
	 */
	void setCorrelationExpression(String value);

} // MessageChunkingAggregatorRouterType
