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
 * A representation of the model object '<em><b>Tls Client Key Store Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Configure client key stores.
 *                 TLS/SSL connections are made on behalf of an entity, which can be anonymous or identified by a
 *                 certificate - this interface specifies how a keystore can be used to provide the certificates
 *                 (and associated private keys) necessary for identification.
 *                 This is also used as the trust store if no other trust store is specified and the
 *                 explicitTrustStoreOnly parameter in the server trust store configuration is false.
 *                 WARNING - due to restrictions in library implementations the values specified here typically apply
 *                 to all connectors using this transport.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.TlsClientKeyStoreType#getClientKeyStore <em>Client Key Store</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsClientKeyStoreType#getClientKeyStorePassword <em>Client Key Store Password</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsClientKeyStoreType#getClientKeyStoreType <em>Client Key Store Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getTlsClientKeyStoreType()
 * @model extendedMetaData="name='tlsClientKeyStoreType' kind='empty'"
 * @generated
 */
public interface TlsClientKeyStoreType extends EObject {
	/**
	 * Returns the value of the '<em><b>Client Key Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The location (which will be resolved relative to the current classpath and file system, if
	 *                     possible) of the keystore that contains public certificates and private keys for identification.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Key Store</em>' attribute.
	 * @see #setClientKeyStore(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsClientKeyStoreType_ClientKeyStore()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientKeyStore'"
	 * @generated
	 */
	String getClientKeyStore();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsClientKeyStoreType#getClientKeyStore <em>Client Key Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Key Store</em>' attribute.
	 * @see #getClientKeyStore()
	 * @generated
	 */
	void setClientKeyStore(String value);

	/**
	 * Returns the value of the '<em><b>Client Key Store Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The password used to protect the keystore.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Key Store Password</em>' attribute.
	 * @see #setClientKeyStorePassword(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsClientKeyStoreType_ClientKeyStorePassword()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clientKeyStorePassword'"
	 * @generated
	 */
	String getClientKeyStorePassword();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsClientKeyStoreType#getClientKeyStorePassword <em>Client Key Store Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Key Store Password</em>' attribute.
	 * @see #getClientKeyStorePassword()
	 * @generated
	 */
	void setClientKeyStorePassword(String value);

	/**
	 * Returns the value of the '<em><b>Client Key Store Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The type of keystore used (a Java class name).
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Client Key Store Type</em>' attribute.
	 * @see #setClientKeyStoreType(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsClientKeyStoreType_ClientKeyStoreType()
	 * @model dataType="org.mule.ide.config.core.SubstitutableClass"
	 *        extendedMetaData="kind='attribute' name='clientKeyStoreType'"
	 * @generated
	 */
	String getClientKeyStoreType();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsClientKeyStoreType#getClientKeyStoreType <em>Client Key Store Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client Key Store Type</em>' attribute.
	 * @see #getClientKeyStoreType()
	 * @generated
	 */
	void setClientKeyStoreType(String value);

} // TlsClientKeyStoreType
