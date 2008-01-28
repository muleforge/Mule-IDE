/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tls Server Trust Store Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.TlsServerTrustStoreType#isExplicitTrustStoreOnly <em>Explicit Trust Store Only</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsServerTrustStoreType#isRequireClientAuthentication <em>Require Client Authentication</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsServerTrustStoreType#getTrustManagerAlgorithm <em>Trust Manager Algorithm</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsServerTrustStoreType#getTrustManagerFactory <em>Trust Manager Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsServerTrustStoreType#getTrustStoreType <em>Trust Store Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getTlsServerTrustStoreType()
 * @model extendedMetaData="name='tlsServerTrustStoreType' kind='empty'"
 * @generated
 */
public interface TlsServerTrustStoreType extends TlsTrustStoreType {
	/**
	 * Returns the value of the '<em><b>Explicit Trust Store Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explicit Trust Store Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit Trust Store Only</em>' attribute.
	 * @see #isSetExplicitTrustStoreOnly()
	 * @see #unsetExplicitTrustStoreOnly()
	 * @see #setExplicitTrustStoreOnly(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getTlsServerTrustStoreType_ExplicitTrustStoreOnly()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='explicitTrustStoreOnly'"
	 * @generated
	 */
	boolean isExplicitTrustStoreOnly();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsServerTrustStoreType#isExplicitTrustStoreOnly <em>Explicit Trust Store Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit Trust Store Only</em>' attribute.
	 * @see #isSetExplicitTrustStoreOnly()
	 * @see #unsetExplicitTrustStoreOnly()
	 * @see #isExplicitTrustStoreOnly()
	 * @generated
	 */
	void setExplicitTrustStoreOnly(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.TlsServerTrustStoreType#isExplicitTrustStoreOnly <em>Explicit Trust Store Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExplicitTrustStoreOnly()
	 * @see #isExplicitTrustStoreOnly()
	 * @see #setExplicitTrustStoreOnly(boolean)
	 * @generated
	 */
	void unsetExplicitTrustStoreOnly();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.TlsServerTrustStoreType#isExplicitTrustStoreOnly <em>Explicit Trust Store Only</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Explicit Trust Store Only</em>' attribute is set.
	 * @see #unsetExplicitTrustStoreOnly()
	 * @see #isExplicitTrustStoreOnly()
	 * @see #setExplicitTrustStoreOnly(boolean)
	 * @generated
	 */
	boolean isSetExplicitTrustStoreOnly();

	/**
	 * Returns the value of the '<em><b>Require Client Authentication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Client Authentication</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Client Authentication</em>' attribute.
	 * @see #isSetRequireClientAuthentication()
	 * @see #unsetRequireClientAuthentication()
	 * @see #setRequireClientAuthentication(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getTlsServerTrustStoreType_RequireClientAuthentication()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='requireClientAuthentication'"
	 * @generated
	 */
	boolean isRequireClientAuthentication();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsServerTrustStoreType#isRequireClientAuthentication <em>Require Client Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Client Authentication</em>' attribute.
	 * @see #isSetRequireClientAuthentication()
	 * @see #unsetRequireClientAuthentication()
	 * @see #isRequireClientAuthentication()
	 * @generated
	 */
	void setRequireClientAuthentication(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.TlsServerTrustStoreType#isRequireClientAuthentication <em>Require Client Authentication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRequireClientAuthentication()
	 * @see #isRequireClientAuthentication()
	 * @see #setRequireClientAuthentication(boolean)
	 * @generated
	 */
	void unsetRequireClientAuthentication();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.TlsServerTrustStoreType#isRequireClientAuthentication <em>Require Client Authentication</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Require Client Authentication</em>' attribute is set.
	 * @see #unsetRequireClientAuthentication()
	 * @see #isRequireClientAuthentication()
	 * @see #setRequireClientAuthentication(boolean)
	 * @generated
	 */
	boolean isSetRequireClientAuthentication();

	/**
	 * Returns the value of the '<em><b>Trust Manager Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trust Manager Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trust Manager Algorithm</em>' attribute.
	 * @see #setTrustManagerAlgorithm(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsServerTrustStoreType_TrustManagerAlgorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='trustManagerAlgorithm'"
	 * @generated
	 */
	String getTrustManagerAlgorithm();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsServerTrustStoreType#getTrustManagerAlgorithm <em>Trust Manager Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trust Manager Algorithm</em>' attribute.
	 * @see #getTrustManagerAlgorithm()
	 * @generated
	 */
	void setTrustManagerAlgorithm(String value);

	/**
	 * Returns the value of the '<em><b>Trust Manager Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trust Manager Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trust Manager Factory</em>' attribute.
	 * @see #setTrustManagerFactory(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsServerTrustStoreType_TrustManagerFactory()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='trustManagerFactory'"
	 * @generated
	 */
	String getTrustManagerFactory();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsServerTrustStoreType#getTrustManagerFactory <em>Trust Manager Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trust Manager Factory</em>' attribute.
	 * @see #getTrustManagerFactory()
	 * @generated
	 */
	void setTrustManagerFactory(String value);

	/**
	 * Returns the value of the '<em><b>Trust Store Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trust Store Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trust Store Type</em>' attribute.
	 * @see #setTrustStoreType(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsServerTrustStoreType_TrustStoreType()
	 * @model dataType="org.mule.ide.config.core.SubstitutableClass"
	 *        extendedMetaData="kind='attribute' name='trustStoreType'"
	 * @generated
	 */
	String getTrustStoreType();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsServerTrustStoreType#getTrustStoreType <em>Trust Store Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trust Store Type</em>' attribute.
	 * @see #getTrustStoreType()
	 * @generated
	 */
	void setTrustStoreType(String value);

} // TlsServerTrustStoreType
