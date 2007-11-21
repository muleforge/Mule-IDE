/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jndi Transaction Manager Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.JndiTransactionManagerType#getEnvironment <em>Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getJndiTransactionManagerType()
 * @model extendedMetaData="name='jndiTransactionManagerType' kind='elementOnly'"
 * @generated
 */
public interface JndiTransactionManagerType extends AbstractTransactionManagerType {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Properties to be set on the created object
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(MapType)
	 * @see org.mule.ide.config.core.CorePackage#getJndiTransactionManagerType_Environment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='environment' namespace='##targetNamespace'"
	 * @generated
	 */
	MapType getEnvironment();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.JndiTransactionManagerType#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(MapType value);

} // JndiTransactionManagerType
