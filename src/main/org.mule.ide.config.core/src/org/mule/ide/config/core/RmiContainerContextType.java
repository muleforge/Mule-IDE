/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rmi Container Context Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.RmiContainerContextType#getName <em>Name</em>}</li>
 *   <li>{@link org.mule.ide.config.core.RmiContainerContextType#getSecurityManager <em>Security Manager</em>}</li>
 *   <li>{@link org.mule.ide.config.core.RmiContainerContextType#getSecurityPolicy <em>Security Policy</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getRmiContainerContextType()
 * @model extendedMetaData="name='rmiContainerContextType' kind='elementOnly'"
 * @generated
 */
public interface RmiContainerContextType extends BaseContainerContextType {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"rmi"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #setName(String)
	 * @see org.mule.ide.config.core.CorePackage#getRmiContainerContextType_Name()
	 * @model default="rmi" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.RmiContainerContextType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #isSetName()
	 * @see #unsetName()
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.RmiContainerContextType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	void unsetName();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.RmiContainerContextType#getName <em>Name</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Name</em>' attribute is set.
	 * @see #unsetName()
	 * @see #getName()
	 * @see #setName(String)
	 * @generated
	 */
	boolean isSetName();

	/**
	 * Returns the value of the '<em><b>Security Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Manager</em>' attribute.
	 * @see #setSecurityManager(String)
	 * @see org.mule.ide.config.core.CorePackage#getRmiContainerContextType_SecurityManager()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='securityManager'"
	 * @generated
	 */
	String getSecurityManager();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.RmiContainerContextType#getSecurityManager <em>Security Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Manager</em>' attribute.
	 * @see #getSecurityManager()
	 * @generated
	 */
	void setSecurityManager(String value);

	/**
	 * Returns the value of the '<em><b>Security Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Policy</em>' attribute.
	 * @see #setSecurityPolicy(String)
	 * @see org.mule.ide.config.core.CorePackage#getRmiContainerContextType_SecurityPolicy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='securityPolicy'"
	 * @generated
	 */
	String getSecurityPolicy();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.RmiContainerContextType#getSecurityPolicy <em>Security Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Policy</em>' attribute.
	 * @see #getSecurityPolicy()
	 * @generated
	 */
	void setSecurityPolicy(String value);

} // RmiContainerContextType
