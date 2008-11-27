/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Password Encryption Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.PasswordEncryptionStrategyType#getIterationCount <em>Iteration Count</em>}</li>
 *   <li>{@link org.mule.ide.config.core.PasswordEncryptionStrategyType#getPassword <em>Password</em>}</li>
 *   <li>{@link org.mule.ide.config.core.PasswordEncryptionStrategyType#getSalt <em>Salt</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getPasswordEncryptionStrategyType()
 * @model extendedMetaData="name='passwordEncryptionStrategyType' kind='empty'"
 * @generated
 */
public interface PasswordEncryptionStrategyType extends EncryptionStrategyType {
	/**
	 * Returns the value of the '<em><b>Iteration Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Iteration Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The number of itreations to use.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Iteration Count</em>' attribute.
	 * @see #isSetIterationCount()
	 * @see #unsetIterationCount()
	 * @see #setIterationCount(int)
	 * @see org.mule.ide.config.core.CorePackage#getPasswordEncryptionStrategyType_IterationCount()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableInt"
	 *        extendedMetaData="kind='attribute' name='iterationCount'"
	 * @generated
	 */
	int getIterationCount();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.PasswordEncryptionStrategyType#getIterationCount <em>Iteration Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iteration Count</em>' attribute.
	 * @see #isSetIterationCount()
	 * @see #unsetIterationCount()
	 * @see #getIterationCount()
	 * @generated
	 */
	void setIterationCount(int value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.PasswordEncryptionStrategyType#getIterationCount <em>Iteration Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIterationCount()
	 * @see #getIterationCount()
	 * @see #setIterationCount(int)
	 * @generated
	 */
	void unsetIterationCount();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.PasswordEncryptionStrategyType#getIterationCount <em>Iteration Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Iteration Count</em>' attribute is set.
	 * @see #unsetIterationCount()
	 * @see #getIterationCount()
	 * @see #setIterationCount(int)
	 * @generated
	 */
	boolean isSetIterationCount();

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The password to use.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.mule.ide.config.core.CorePackage#getPasswordEncryptionStrategyType_Password()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='password'"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.PasswordEncryptionStrategyType#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Salt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salt</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The salt to use (this helps prevent dictionary attacks).
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Salt</em>' attribute.
	 * @see #setSalt(String)
	 * @see org.mule.ide.config.core.CorePackage#getPasswordEncryptionStrategyType_Salt()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='salt'"
	 * @generated
	 */
	String getSalt();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.PasswordEncryptionStrategyType#getSalt <em>Salt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salt</em>' attribute.
	 * @see #getSalt()
	 * @generated
	 */
	void setSalt(String value);

} // PasswordEncryptionStrategyType
