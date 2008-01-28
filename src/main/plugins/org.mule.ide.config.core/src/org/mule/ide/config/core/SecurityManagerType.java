/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Manager Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 The default security manager (type mule:defaultSecurityManagerType) provides
 *                 basic support for security functions. Other modules (eg Acegi, JAAS, PGP)
 *                 provide more advanced functionality.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.SecurityManagerType#getCustomSecurityProvider <em>Custom Security Provider</em>}</li>
 *   <li>{@link org.mule.ide.config.core.SecurityManagerType#getCustomEncryptionStrategy <em>Custom Encryption Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.SecurityManagerType#getSecretKeyEncryptionStrategy <em>Secret Key Encryption Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.SecurityManagerType#getPasswordEncryptionStrategy <em>Password Encryption Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getSecurityManagerType()
 * @model extendedMetaData="name='securityManagerType' kind='elementOnly'"
 * @generated
 */
public interface SecurityManagerType extends AbstractSecurityManagerType {
	/**
	 * Returns the value of the '<em><b>Custom Security Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Security Provider</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Security Provider</em>' containment reference.
	 * @see #setCustomSecurityProvider(CustomSecurityProviderType)
	 * @see org.mule.ide.config.core.CorePackage#getSecurityManagerType_CustomSecurityProvider()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='custom-security-provider' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomSecurityProviderType getCustomSecurityProvider();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.SecurityManagerType#getCustomSecurityProvider <em>Custom Security Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Security Provider</em>' containment reference.
	 * @see #getCustomSecurityProvider()
	 * @generated
	 */
	void setCustomSecurityProvider(CustomSecurityProviderType value);

	/**
	 * Returns the value of the '<em><b>Custom Encryption Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Encryption Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Encryption Strategy</em>' containment reference.
	 * @see #setCustomEncryptionStrategy(CustomEncryptionStrategyType)
	 * @see org.mule.ide.config.core.CorePackage#getSecurityManagerType_CustomEncryptionStrategy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='custom-encryption-strategy' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomEncryptionStrategyType getCustomEncryptionStrategy();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.SecurityManagerType#getCustomEncryptionStrategy <em>Custom Encryption Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Encryption Strategy</em>' containment reference.
	 * @see #getCustomEncryptionStrategy()
	 * @generated
	 */
	void setCustomEncryptionStrategy(CustomEncryptionStrategyType value);

	/**
	 * Returns the value of the '<em><b>Secret Key Encryption Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Secret Key Encryption Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Secret Key Encryption Strategy</em>' containment reference.
	 * @see #setSecretKeyEncryptionStrategy(SecretKeyEncryptionStrategyType)
	 * @see org.mule.ide.config.core.CorePackage#getSecurityManagerType_SecretKeyEncryptionStrategy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='secret-key-encryption-strategy' namespace='##targetNamespace'"
	 * @generated
	 */
	SecretKeyEncryptionStrategyType getSecretKeyEncryptionStrategy();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.SecurityManagerType#getSecretKeyEncryptionStrategy <em>Secret Key Encryption Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Secret Key Encryption Strategy</em>' containment reference.
	 * @see #getSecretKeyEncryptionStrategy()
	 * @generated
	 */
	void setSecretKeyEncryptionStrategy(SecretKeyEncryptionStrategyType value);

	/**
	 * Returns the value of the '<em><b>Password Encryption Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password Encryption Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password Encryption Strategy</em>' containment reference.
	 * @see #setPasswordEncryptionStrategy(PasswordEncryptionStrategyType)
	 * @see org.mule.ide.config.core.CorePackage#getSecurityManagerType_PasswordEncryptionStrategy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='password-encryption-strategy' namespace='##targetNamespace'"
	 * @generated
	 */
	PasswordEncryptionStrategyType getPasswordEncryptionStrategy();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.SecurityManagerType#getPasswordEncryptionStrategy <em>Password Encryption Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password Encryption Strategy</em>' containment reference.
	 * @see #getPasswordEncryptionStrategy()
	 * @generated
	 */
	void setPasswordEncryptionStrategy(PasswordEncryptionStrategyType value);

} // SecurityManagerType
