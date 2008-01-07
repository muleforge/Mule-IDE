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
 * A representation of the model object '<em><b>Tls Key Store Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Configure key stores.
 *                 TLS/SSL connections are made on behalf of an entity, which can be anonymous or identified by a
 *                 certificate - this interface specifies how a keystore can be used to provide the certificates
 *                 (and associated private keys) necessary for identification.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.TlsKeyStoreType#getKeyManagerAlgorithm <em>Key Manager Algorithm</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsKeyStoreType#getKeyPassword <em>Key Password</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsKeyStoreType#getKeyStore <em>Key Store</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsKeyStoreType#getKeyStorePassword <em>Key Store Password</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsKeyStoreType#getKeyStoreType <em>Key Store Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getTlsKeyStoreType()
 * @model extendedMetaData="name='tlsKeyStoreType' kind='empty'"
 * @generated
 */
public interface TlsKeyStoreType extends EObject {
	/**
	 * Returns the value of the '<em><b>Key Manager Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The algorithm used by the key store.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Manager Algorithm</em>' attribute.
	 * @see #setKeyManagerAlgorithm(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsKeyStoreType_KeyManagerAlgorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='keyManagerAlgorithm'"
	 * @generated
	 */
	String getKeyManagerAlgorithm();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsKeyStoreType#getKeyManagerAlgorithm <em>Key Manager Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Manager Algorithm</em>' attribute.
	 * @see #getKeyManagerAlgorithm()
	 * @generated
	 */
	void setKeyManagerAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Key Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The password used to protect the private key.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Password</em>' attribute.
	 * @see #setKeyPassword(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsKeyStoreType_KeyPassword()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='keyPassword'"
	 * @generated
	 */
	String getKeyPassword();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsKeyStoreType#getKeyPassword <em>Key Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Password</em>' attribute.
	 * @see #getKeyPassword()
	 * @generated
	 */
	void setKeyPassword(String value);

	/**
	 * Returns the value of the '<em><b>Key Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The location (which will be resolved relative to the current classpath and file system, if
	 *                     possible) of the keystore that contains public certificates and private keys for identification.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Store</em>' attribute.
	 * @see #setKeyStore(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsKeyStoreType_KeyStore()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='keyStore'"
	 * @generated
	 */
	String getKeyStore();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsKeyStoreType#getKeyStore <em>Key Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Store</em>' attribute.
	 * @see #getKeyStore()
	 * @generated
	 */
	void setKeyStore(String value);

	/**
	 * Returns the value of the '<em><b>Key Store Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The password used to protect the keystore.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Store Password</em>' attribute.
	 * @see #setKeyStorePassword(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsKeyStoreType_KeyStorePassword()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='keyStorePassword'"
	 * @generated
	 */
	String getKeyStorePassword();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsKeyStoreType#getKeyStorePassword <em>Key Store Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Store Password</em>' attribute.
	 * @see #getKeyStorePassword()
	 * @generated
	 */
	void setKeyStorePassword(String value);

	/**
	 * Returns the value of the '<em><b>Key Store Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The type of keystore used (a Java class name).
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Key Store Type</em>' attribute.
	 * @see #setKeyStoreType(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsKeyStoreType_KeyStoreType()
	 * @model dataType="org.mule.ide.config.core.SubstitutableClass"
	 *        extendedMetaData="kind='attribute' name='keyStoreType'"
	 * @generated
	 */
	String getKeyStoreType();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsKeyStoreType#getKeyStoreType <em>Key Store Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Store Type</em>' attribute.
	 * @see #getKeyStoreType()
	 * @generated
	 */
	void setKeyStoreType(String value);

} // TlsKeyStoreType
