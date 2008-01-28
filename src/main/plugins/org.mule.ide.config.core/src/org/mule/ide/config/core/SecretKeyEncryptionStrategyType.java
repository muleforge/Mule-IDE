/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Secret Key Encryption Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Provides secret key-based encryption using JCE.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.SecretKeyEncryptionStrategyType#getKey <em>Key</em>}</li>
 *   <li>{@link org.mule.ide.config.core.SecretKeyEncryptionStrategyType#getKeyFactoryRef <em>Key Factory Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getSecretKeyEncryptionStrategyType()
 * @model extendedMetaData="name='secretKeyEncryptionStrategyType' kind='empty'"
 * @generated
 */
public interface SecretKeyEncryptionStrategyType extends EncryptionStrategyType {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see org.mule.ide.config.core.CorePackage#getSecretKeyEncryptionStrategyType_Key()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='key'"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.SecretKeyEncryptionStrategyType#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Key Factory Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Factory Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Factory Ref</em>' attribute.
	 * @see #setKeyFactoryRef(String)
	 * @see org.mule.ide.config.core.CorePackage#getSecretKeyEncryptionStrategyType_KeyFactoryRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='keyFactory-ref'"
	 * @generated
	 */
	String getKeyFactoryRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.SecretKeyEncryptionStrategyType#getKeyFactoryRef <em>Key Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Factory Ref</em>' attribute.
	 * @see #getKeyFactoryRef()
	 * @generated
	 */
	void setKeyFactoryRef(String value);

} // SecretKeyEncryptionStrategyType
