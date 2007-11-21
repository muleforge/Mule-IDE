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
 * A representation of the model object '<em><b>Tls Trust Store Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Configure a trust store.
 *                 TLS/SSL connections are made to trusted systems - the public certificates of trusted systems are store
 *                 in a keystore (called a trust store) and used to verify that the connection made to a remote system
 *                 "really is" the expected identity.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.TlsTrustStoreType#getTrustStore <em>Trust Store</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsTrustStoreType#getTrustStorePassword <em>Trust Store Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getTlsTrustStoreType()
 * @model extendedMetaData="name='tlsTrustStoreType' kind='empty'"
 * @generated
 */
public interface TlsTrustStoreType extends EObject {
	/**
	 * Returns the value of the '<em><b>Trust Store</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The location (which will be resolved relative to the current classpath and file system, if
	 *                     possible) of the keystore that contains public certificates of trusted servers.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trust Store</em>' attribute.
	 * @see #setTrustStore(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsTrustStoreType_TrustStore()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='trustStore'"
	 * @generated
	 */
	String getTrustStore();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsTrustStoreType#getTrustStore <em>Trust Store</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trust Store</em>' attribute.
	 * @see #getTrustStore()
	 * @generated
	 */
	void setTrustStore(String value);

	/**
	 * Returns the value of the '<em><b>Trust Store Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The password used to protected the trust store.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Trust Store Password</em>' attribute.
	 * @see #setTrustStorePassword(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsTrustStoreType_TrustStorePassword()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='trustStorePassword'"
	 * @generated
	 */
	String getTrustStorePassword();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsTrustStoreType#getTrustStorePassword <em>Trust Store Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trust Store Password</em>' attribute.
	 * @see #getTrustStorePassword()
	 * @generated
	 */
	void setTrustStorePassword(String value);

} // TlsTrustStoreType
