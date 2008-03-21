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
 *   <li>{@link org.mule.ide.config.core.TlsKeyStoreType#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsKeyStoreType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsKeyStoreType#getKeyPassword <em>Key Password</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsKeyStoreType#getPath <em>Path</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsKeyStoreType#getStorePassword <em>Store Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getTlsKeyStoreType()
 * @model extendedMetaData="name='tlsKeyStoreType' kind='empty'"
 * @generated
 */
public interface TlsKeyStoreType extends EObject {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The algorithm used by the key store.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsKeyStoreType_Algorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='algorithm'"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsKeyStoreType#getAlgorithm <em>Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' attribute.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(String value);

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
	 * @see org.mule.ide.config.core.CorePackage#getTlsKeyStoreType_Class()
	 * @model dataType="org.mule.ide.config.core.SubstitutableClass"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsKeyStoreType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

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
	 * @see org.mule.ide.config.core.CorePackage#getTlsKeyStoreType_Path()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='path'"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsKeyStoreType#getPath <em>Path</em>}' attribute.
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
	 * @see org.mule.ide.config.core.CorePackage#getTlsKeyStoreType_StorePassword()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='storePassword'"
	 * @generated
	 */
	String getStorePassword();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsKeyStoreType#getStorePassword <em>Store Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store Password</em>' attribute.
	 * @see #getStorePassword()
	 * @generated
	 */
	void setStorePassword(String value);

} // TlsKeyStoreType
