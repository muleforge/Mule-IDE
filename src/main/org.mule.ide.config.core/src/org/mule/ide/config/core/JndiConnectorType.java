/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jndi Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.JndiConnectorType#getJndiProviderProperties <em>Jndi Provider Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.core.JndiConnectorType#getJndiContextRef <em>Jndi Context Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.core.JndiConnectorType#getJndiInitialFactory <em>Jndi Initial Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.JndiConnectorType#getJndiProviderUrl <em>Jndi Provider Url</em>}</li>
 *   <li>{@link org.mule.ide.config.core.JndiConnectorType#getJndiUrlPkgPrefixes <em>Jndi Url Pkg Prefixes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getJndiConnectorType()
 * @model extendedMetaData="name='jndiConnectorType' kind='elementOnly'"
 * @generated
 */
public interface JndiConnectorType extends ConnectorType {
	/**
	 * Returns the value of the '<em><b>Jndi Provider Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 Direct setting of JNDI properties.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jndi Provider Properties</em>' containment reference.
	 * @see #setJndiProviderProperties(MapType)
	 * @see org.mule.ide.config.core.CorePackage#getJndiConnectorType_JndiProviderProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='jndi-provider-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	MapType getJndiProviderProperties();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.JndiConnectorType#getJndiProviderProperties <em>Jndi Provider Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi Provider Properties</em>' containment reference.
	 * @see #getJndiProviderProperties()
	 * @generated
	 */
	void setJndiProviderProperties(MapType value);

	/**
	 * Returns the value of the '<em><b>Jndi Context Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Set the complete context directly, via a bean reference.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jndi Context Ref</em>' attribute.
	 * @see #setJndiContextRef(String)
	 * @see org.mule.ide.config.core.CorePackage#getJndiConnectorType_JndiContextRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='jndiContext-ref'"
	 * @generated
	 */
	String getJndiContextRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.JndiConnectorType#getJndiContextRef <em>Jndi Context Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi Context Ref</em>' attribute.
	 * @see #getJndiContextRef()
	 * @generated
	 */
	void setJndiContextRef(String value);

	/**
	 * Returns the value of the '<em><b>Jndi Initial Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The initial context factory to use. The value
	 *                             of the property should be the fully qualified class name
	 *                             of the factory class that will create an initial context.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jndi Initial Factory</em>' attribute.
	 * @see #setJndiInitialFactory(String)
	 * @see org.mule.ide.config.core.CorePackage#getJndiConnectorType_JndiInitialFactory()
	 * @model dataType="org.mule.ide.config.core.SubstitutableClass"
	 *        extendedMetaData="kind='attribute' name='jndiInitialFactory'"
	 * @generated
	 */
	String getJndiInitialFactory();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.JndiConnectorType#getJndiInitialFactory <em>Jndi Initial Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi Initial Factory</em>' attribute.
	 * @see #getJndiInitialFactory()
	 * @generated
	 */
	void setJndiInitialFactory(String value);

	/**
	 * Returns the value of the '<em><b>Jndi Provider Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The service provider to use. The value of the property
	 *                             should contain a URL string (e.g. "ldap://somehost:389").
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jndi Provider Url</em>' attribute.
	 * @see #setJndiProviderUrl(String)
	 * @see org.mule.ide.config.core.CorePackage#getJndiConnectorType_JndiProviderUrl()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='jndiProviderUrl'"
	 * @generated
	 */
	String getJndiProviderUrl();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.JndiConnectorType#getJndiProviderUrl <em>Jndi Provider Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi Provider Url</em>' attribute.
	 * @see #getJndiProviderUrl()
	 * @generated
	 */
	void setJndiProviderUrl(String value);

	/**
	 * Returns the value of the '<em><b>Jndi Url Pkg Prefixes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The list of package prefixes to use when
	 *                             loading in URL context factories. The value
	 *                             of the property should be a colon-separated list of package
	 *                             prefixes for the class name of the factory class that will create
	 *                             a URL context factory.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Jndi Url Pkg Prefixes</em>' attribute.
	 * @see #setJndiUrlPkgPrefixes(String)
	 * @see org.mule.ide.config.core.CorePackage#getJndiConnectorType_JndiUrlPkgPrefixes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='jndiUrlPkgPrefixes'"
	 * @generated
	 */
	String getJndiUrlPkgPrefixes();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.JndiConnectorType#getJndiUrlPkgPrefixes <em>Jndi Url Pkg Prefixes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Jndi Url Pkg Prefixes</em>' attribute.
	 * @see #getJndiUrlPkgPrefixes()
	 * @generated
	 */
	void setJndiUrlPkgPrefixes(String value);

} // JndiConnectorType
