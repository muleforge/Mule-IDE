/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retry Connection Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.RetryConnectionStrategyType#getRetryCount <em>Retry Count</em>}</li>
 *   <li>{@link org.mule.ide.config.core.RetryConnectionStrategyType#getRetryFrequency <em>Retry Frequency</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getRetryConnectionStrategyType()
 * @model extendedMetaData="name='retryConnectionStrategyType' kind='empty'"
 * @generated
 */
public interface RetryConnectionStrategyType extends ConnectionStrategyType {
	/**
	 * Returns the value of the '<em><b>Retry Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Maximum number of retries.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retry Count</em>' attribute.
	 * @see #isSetRetryCount()
	 * @see #unsetRetryCount()
	 * @see #setRetryCount(int)
	 * @see org.mule.ide.config.core.CorePackage#getRetryConnectionStrategyType_RetryCount()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableInt"
	 *        extendedMetaData="kind='attribute' name='retryCount'"
	 * @generated
	 */
	int getRetryCount();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.RetryConnectionStrategyType#getRetryCount <em>Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Count</em>' attribute.
	 * @see #isSetRetryCount()
	 * @see #unsetRetryCount()
	 * @see #getRetryCount()
	 * @generated
	 */
	void setRetryCount(int value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.RetryConnectionStrategyType#getRetryCount <em>Retry Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRetryCount()
	 * @see #getRetryCount()
	 * @see #setRetryCount(int)
	 * @generated
	 */
	void unsetRetryCount();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.RetryConnectionStrategyType#getRetryCount <em>Retry Count</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Retry Count</em>' attribute is set.
	 * @see #unsetRetryCount()
	 * @see #getRetryCount()
	 * @see #setRetryCount(int)
	 * @generated
	 */
	boolean isSetRetryCount();

	/**
	 * Returns the value of the '<em><b>Retry Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retry Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             How often to retry (pause time in ms).
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Retry Frequency</em>' attribute.
	 * @see #isSetRetryFrequency()
	 * @see #unsetRetryFrequency()
	 * @see #setRetryFrequency(long)
	 * @see org.mule.ide.config.core.CorePackage#getRetryConnectionStrategyType_RetryFrequency()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableLong"
	 *        extendedMetaData="kind='attribute' name='retryFrequency'"
	 * @generated
	 */
	long getRetryFrequency();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.RetryConnectionStrategyType#getRetryFrequency <em>Retry Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retry Frequency</em>' attribute.
	 * @see #isSetRetryFrequency()
	 * @see #unsetRetryFrequency()
	 * @see #getRetryFrequency()
	 * @generated
	 */
	void setRetryFrequency(long value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.RetryConnectionStrategyType#getRetryFrequency <em>Retry Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRetryFrequency()
	 * @see #getRetryFrequency()
	 * @see #setRetryFrequency(long)
	 * @generated
	 */
	void unsetRetryFrequency();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.RetryConnectionStrategyType#getRetryFrequency <em>Retry Frequency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Retry Frequency</em>' attribute is set.
	 * @see #unsetRetryFrequency()
	 * @see #getRetryFrequency()
	 * @see #setRetryFrequency(long)
	 * @generated
	 */
	boolean isSetRetryFrequency();

} // RetryConnectionStrategyType
