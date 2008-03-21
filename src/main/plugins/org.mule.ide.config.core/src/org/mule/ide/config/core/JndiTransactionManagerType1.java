/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jndi Transaction Manager Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.JndiTransactionManagerType1#getEnvironment <em>Environment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getJndiTransactionManagerType1()
 * @model extendedMetaData="name='jndiTransactionManagerType' kind='elementOnly'"
 * @generated
 */
public interface JndiTransactionManagerType1 extends AbstractTransactionManagerType {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 The JNDI environment.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(MapType)
	 * @see org.mule.ide.config.core.CorePackage#getJndiTransactionManagerType1_Environment()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='environment' namespace='##targetNamespace'"
	 * @generated
	 */
	MapType getEnvironment();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.JndiTransactionManagerType1#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(MapType value);

} // JndiTransactionManagerType1
