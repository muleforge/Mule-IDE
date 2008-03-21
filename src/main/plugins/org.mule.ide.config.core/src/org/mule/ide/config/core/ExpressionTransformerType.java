/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Transformer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.ExpressionTransformerType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ExpressionTransformerType#getReturnArgument <em>Return Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getExpressionTransformerType()
 * @model extendedMetaData="name='expression-transformer_._type' kind='elementOnly'"
 * @generated
 */
public interface ExpressionTransformerType extends AbstractTransformerType {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getExpressionTransformerType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:3'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Return Argument</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.ReturnArgumentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Argument</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Argument</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getExpressionTransformerType_ReturnArgument()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='return-argument' namespace='##targetNamespace' group='#group:3'"
	 * @generated
	 */
	EList<ReturnArgumentType> getReturnArgument();

} // ExpressionTransformerType
