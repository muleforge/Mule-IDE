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
 *   <li>{@link org.mule.ide.config.core.TlsClientKeyStoreType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsClientKeyStoreType#getPath <em>Path</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsClientKeyStoreType#getStorePassword <em>Store Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getTlsClientKeyStoreType()
 * @model extendedMetaData="name='tlsClientKeyStoreType' kind='empty'"
 * @generated
 */
public interface TlsClientKeyStoreType extends EObject {
	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The type of keystore used (a Java class name).
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsClientKeyStoreType_Class()
	 * @model dataType="org.mule.ide.config.core.SubstitutableClass"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsClientKeyStoreType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The location (which will be resolved relative to the current classpath and file system, if
	 *                     possible) of the keystore that contains public certificates and private keys for identification.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsClientKeyStoreType_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsClientKeyStoreType#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Store Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The password used to protect the keystore.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Store Password</em>' attribute.
	 * @see #setStorePassword(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsClientKeyStoreType_StorePassword()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='storePassword'"
	 * @generated
	 */
	String getStorePassword();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsClientKeyStoreType#getStorePassword <em>Store Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Password</em>' attribute.
	 * @see #getStorePassword()
	 * @generated
	 */
	void setStorePassword(String value);

} // TlsClientKeyStoreType
