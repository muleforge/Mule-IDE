/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Encryption Transformer Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.EncryptionTransformerType#getStrategyRef <em>Strategy Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getEncryptionTransformerType()
 * @model extendedMetaData="name='encryptionTransformerType' kind='empty'"
 * @generated
 */
public interface EncryptionTransformerType extends AbstractTransformerType {
	/**
	 * Returns the value of the '<em><b>Strategy Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The name of the encryption strategy to use.
	 *                             This should be configured using the password-encryption-strategy element,
	 *                             inside a security-manager element at the top level.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Ref</em>' attribute.
	 * @see #setStrategyRef(String)
	 * @see org.mule.ide.config.core.CorePackage#getEncryptionTransformerType_StrategyRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='strategy-ref'"
	 * @generated
	 */
	String getStrategyRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.EncryptionTransformerType#getStrategyRef <em>Strategy Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Ref</em>' attribute.
	 * @see #getStrategyRef()
	 * @generated
	 */
	void setStrategyRef(String value);

} // EncryptionTransformerType
