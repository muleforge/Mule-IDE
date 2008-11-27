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
 *   <li>{@link org.mule.ide.config.core.TlsServerTrustStoreType#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsServerTrustStoreType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsServerTrustStoreType#isExplicitOnly <em>Explicit Only</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsServerTrustStoreType#getFactoryRef <em>Factory Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.core.TlsServerTrustStoreType#isRequireClientAuthentication <em>Require Client Authentication</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getTlsServerTrustStoreType()
 * @model extendedMetaData="name='tlsServerTrustStoreType' kind='empty'"
 * @generated
 */
public interface TlsServerTrustStoreType extends TlsTrustStoreType {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Algorithm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' attribute.
	 * @see #setAlgorithm(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsServerTrustStoreType_Algorithm()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='algorithm'"
	 * @generated
	 */
	String getAlgorithm();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsServerTrustStoreType#getAlgorithm <em>Algorithm</em>}' attribute.
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
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsServerTrustStoreType_Class()
	 * @model dataType="org.mule.ide.config.core.SubstitutableClass"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsServerTrustStoreType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

	/**
	 * Returns the value of the '<em><b>Explicit Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explicit Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit Only</em>' attribute.
	 * @see #isSetExplicitOnly()
	 * @see #unsetExplicitOnly()
	 * @see #setExplicitOnly(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getTlsServerTrustStoreType_ExplicitOnly()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='explicitOnly'"
	 * @generated
	 */
	boolean isExplicitOnly();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsServerTrustStoreType#isExplicitOnly <em>Explicit Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit Only</em>' attribute.
	 * @see #isSetExplicitOnly()
	 * @see #unsetExplicitOnly()
	 * @see #isExplicitOnly()
	 * @generated
	 */
	void setExplicitOnly(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.TlsServerTrustStoreType#isExplicitOnly <em>Explicit Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetExplicitOnly()
	 * @see #isExplicitOnly()
	 * @see #setExplicitOnly(boolean)
	 * @generated
	 */
	void unsetExplicitOnly();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.TlsServerTrustStoreType#isExplicitOnly <em>Explicit Only</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Explicit Only</em>' attribute is set.
	 * @see #unsetExplicitOnly()
	 * @see #isExplicitOnly()
	 * @see #setExplicitOnly(boolean)
	 * @generated
	 */
	boolean isSetExplicitOnly();

	/**
	 * Returns the value of the '<em><b>Factory Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory Ref</em>' attribute.
	 * @see #setFactoryRef(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsServerTrustStoreType_FactoryRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='factory-ref'"
	 * @generated
	 */
	String getFactoryRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsServerTrustStoreType#getFactoryRef <em>Factory Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory Ref</em>' attribute.
	 * @see #getFactoryRef()
	 * @generated
	 */
	void setFactoryRef(String value);

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

} // TlsServerTrustStoreType
