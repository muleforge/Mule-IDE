/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threading Profile Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.ThreadingProfileType#isDoThreading <em>Do Threading</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ThreadingProfileType#getMaxBufferSize <em>Max Buffer Size</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ThreadingProfileType#getMaxThreadsActive <em>Max Threads Active</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ThreadingProfileType#getMaxThreadsIdle <em>Max Threads Idle</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ThreadingProfileType#getPoolExhaustedAction <em>Pool Exhausted Action</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ThreadingProfileType#getThreadTTL <em>Thread TTL</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ThreadingProfileType#getThreadWaitTimeout <em>Thread Wait Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getThreadingProfileType()
 * @model extendedMetaData="name='threadingProfileType' kind='empty'"
 * @generated
 */
public interface ThreadingProfileType extends AbstractComponentThreadingProfileType {
	/**
	 * Returns the value of the '<em><b>Do Threading</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Do Threading</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Whether threading should be used at all (default is true).
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Do Threading</em>' attribute.
	 * @see #isSetDoThreading()
	 * @see #unsetDoThreading()
	 * @see #setDoThreading(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getThreadingProfileType_DoThreading()
	 * @model default="true" unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='doThreading'"
	 * @generated
	 */
	boolean isDoThreading();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#isDoThreading <em>Do Threading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Do Threading</em>' attribute.
	 * @see #isSetDoThreading()
	 * @see #unsetDoThreading()
	 * @see #isDoThreading()
	 * @generated
	 */
	void setDoThreading(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#isDoThreading <em>Do Threading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDoThreading()
	 * @see #isDoThreading()
	 * @see #setDoThreading(boolean)
	 * @generated
	 */
	void unsetDoThreading();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#isDoThreading <em>Do Threading</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Do Threading</em>' attribute is set.
	 * @see #unsetDoThreading()
	 * @see #isDoThreading()
	 * @see #setDoThreading(boolean)
	 * @generated
	 */
	boolean isSetDoThreading();

	/**
	 * Returns the value of the '<em><b>Max Buffer Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Buffer Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The size of the queue used (when the pool exhausted action is WAIT).
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Buffer Size</em>' attribute.
	 * @see #isSetMaxBufferSize()
	 * @see #unsetMaxBufferSize()
	 * @see #setMaxBufferSize(int)
	 * @see org.mule.ide.config.core.CorePackage#getThreadingProfileType_MaxBufferSize()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableInt"
	 *        extendedMetaData="kind='attribute' name='maxBufferSize'"
	 * @generated
	 */
	int getMaxBufferSize();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getMaxBufferSize <em>Max Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Buffer Size</em>' attribute.
	 * @see #isSetMaxBufferSize()
	 * @see #unsetMaxBufferSize()
	 * @see #getMaxBufferSize()
	 * @generated
	 */
	void setMaxBufferSize(int value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getMaxBufferSize <em>Max Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxBufferSize()
	 * @see #getMaxBufferSize()
	 * @see #setMaxBufferSize(int)
	 * @generated
	 */
	void unsetMaxBufferSize();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getMaxBufferSize <em>Max Buffer Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Buffer Size</em>' attribute is set.
	 * @see #unsetMaxBufferSize()
	 * @see #getMaxBufferSize()
	 * @see #setMaxBufferSize(int)
	 * @generated
	 */
	boolean isSetMaxBufferSize();

	/**
	 * Returns the value of the '<em><b>Max Threads Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Threads Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The maximum number of threads that will be used.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Threads Active</em>' attribute.
	 * @see #isSetMaxThreadsActive()
	 * @see #unsetMaxThreadsActive()
	 * @see #setMaxThreadsActive(int)
	 * @see org.mule.ide.config.core.CorePackage#getThreadingProfileType_MaxThreadsActive()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableInt"
	 *        extendedMetaData="kind='attribute' name='maxThreadsActive'"
	 * @generated
	 */
	int getMaxThreadsActive();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getMaxThreadsActive <em>Max Threads Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Threads Active</em>' attribute.
	 * @see #isSetMaxThreadsActive()
	 * @see #unsetMaxThreadsActive()
	 * @see #getMaxThreadsActive()
	 * @generated
	 */
	void setMaxThreadsActive(int value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getMaxThreadsActive <em>Max Threads Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxThreadsActive()
	 * @see #getMaxThreadsActive()
	 * @see #setMaxThreadsActive(int)
	 * @generated
	 */
	void unsetMaxThreadsActive();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getMaxThreadsActive <em>Max Threads Active</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Threads Active</em>' attribute is set.
	 * @see #unsetMaxThreadsActive()
	 * @see #getMaxThreadsActive()
	 * @see #setMaxThreadsActive(int)
	 * @generated
	 */
	boolean isSetMaxThreadsActive();

	/**
	 * Returns the value of the '<em><b>Max Threads Idle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Threads Idle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The maximum number of idle threads stored in the pool.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Threads Idle</em>' attribute.
	 * @see #isSetMaxThreadsIdle()
	 * @see #unsetMaxThreadsIdle()
	 * @see #setMaxThreadsIdle(int)
	 * @see org.mule.ide.config.core.CorePackage#getThreadingProfileType_MaxThreadsIdle()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableInt"
	 *        extendedMetaData="kind='attribute' name='maxThreadsIdle'"
	 * @generated
	 */
	int getMaxThreadsIdle();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getMaxThreadsIdle <em>Max Threads Idle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Threads Idle</em>' attribute.
	 * @see #isSetMaxThreadsIdle()
	 * @see #unsetMaxThreadsIdle()
	 * @see #getMaxThreadsIdle()
	 * @generated
	 */
	void setMaxThreadsIdle(int value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getMaxThreadsIdle <em>Max Threads Idle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMaxThreadsIdle()
	 * @see #getMaxThreadsIdle()
	 * @see #setMaxThreadsIdle(int)
	 * @generated
	 */
	void unsetMaxThreadsIdle();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getMaxThreadsIdle <em>Max Threads Idle</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Max Threads Idle</em>' attribute is set.
	 * @see #unsetMaxThreadsIdle()
	 * @see #getMaxThreadsIdle()
	 * @see #setMaxThreadsIdle(int)
	 * @generated
	 */
	boolean isSetMaxThreadsIdle();

	/**
	 * Returns the value of the '<em><b>Pool Exhausted Action</b></em>' attribute.
	 * The default value is <code>"WAIT"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.core.PoolExhaustedActionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pool Exhausted Action</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             How tasks should be handled when no more threads are available.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pool Exhausted Action</em>' attribute.
	 * @see org.mule.ide.config.core.PoolExhaustedActionType
	 * @see #isSetPoolExhaustedAction()
	 * @see #unsetPoolExhaustedAction()
	 * @see #setPoolExhaustedAction(PoolExhaustedActionType)
	 * @see org.mule.ide.config.core.CorePackage#getThreadingProfileType_PoolExhaustedAction()
	 * @model default="WAIT" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='poolExhaustedAction'"
	 * @generated
	 */
	PoolExhaustedActionType getPoolExhaustedAction();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getPoolExhaustedAction <em>Pool Exhausted Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pool Exhausted Action</em>' attribute.
	 * @see org.mule.ide.config.core.PoolExhaustedActionType
	 * @see #isSetPoolExhaustedAction()
	 * @see #unsetPoolExhaustedAction()
	 * @see #getPoolExhaustedAction()
	 * @generated
	 */
	void setPoolExhaustedAction(PoolExhaustedActionType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getPoolExhaustedAction <em>Pool Exhausted Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPoolExhaustedAction()
	 * @see #getPoolExhaustedAction()
	 * @see #setPoolExhaustedAction(PoolExhaustedActionType)
	 * @generated
	 */
	void unsetPoolExhaustedAction();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getPoolExhaustedAction <em>Pool Exhausted Action</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Pool Exhausted Action</em>' attribute is set.
	 * @see #unsetPoolExhaustedAction()
	 * @see #getPoolExhaustedAction()
	 * @see #setPoolExhaustedAction(PoolExhaustedActionType)
	 * @generated
	 */
	boolean isSetPoolExhaustedAction();

	/**
	 * Returns the value of the '<em><b>Thread TTL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread TTL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The time excess threads in the pool live before being discarded.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thread TTL</em>' attribute.
	 * @see #isSetThreadTTL()
	 * @see #unsetThreadTTL()
	 * @see #setThreadTTL(int)
	 * @see org.mule.ide.config.core.CorePackage#getThreadingProfileType_ThreadTTL()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableInt"
	 *        extendedMetaData="kind='attribute' name='threadTTL'"
	 * @generated
	 */
	int getThreadTTL();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getThreadTTL <em>Thread TTL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread TTL</em>' attribute.
	 * @see #isSetThreadTTL()
	 * @see #unsetThreadTTL()
	 * @see #getThreadTTL()
	 * @generated
	 */
	void setThreadTTL(int value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getThreadTTL <em>Thread TTL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThreadTTL()
	 * @see #getThreadTTL()
	 * @see #setThreadTTL(int)
	 * @generated
	 */
	void unsetThreadTTL();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getThreadTTL <em>Thread TTL</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thread TTL</em>' attribute is set.
	 * @see #unsetThreadTTL()
	 * @see #getThreadTTL()
	 * @see #setThreadTTL(int)
	 * @generated
	 */
	boolean isSetThreadTTL();

	/**
	 * Returns the value of the '<em><b>Thread Wait Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Wait Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             How long to wait (when the pool exhausted action is WAIT).
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thread Wait Timeout</em>' attribute.
	 * @see #isSetThreadWaitTimeout()
	 * @see #unsetThreadWaitTimeout()
	 * @see #setThreadWaitTimeout(int)
	 * @see org.mule.ide.config.core.CorePackage#getThreadingProfileType_ThreadWaitTimeout()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableInt"
	 *        extendedMetaData="kind='attribute' name='threadWaitTimeout'"
	 * @generated
	 */
	int getThreadWaitTimeout();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getThreadWaitTimeout <em>Thread Wait Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Wait Timeout</em>' attribute.
	 * @see #isSetThreadWaitTimeout()
	 * @see #unsetThreadWaitTimeout()
	 * @see #getThreadWaitTimeout()
	 * @generated
	 */
	void setThreadWaitTimeout(int value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getThreadWaitTimeout <em>Thread Wait Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThreadWaitTimeout()
	 * @see #getThreadWaitTimeout()
	 * @see #setThreadWaitTimeout(int)
	 * @generated
	 */
	void unsetThreadWaitTimeout();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getThreadWaitTimeout <em>Thread Wait Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Thread Wait Timeout</em>' attribute is set.
	 * @see #unsetThreadWaitTimeout()
	 * @see #getThreadWaitTimeout()
	 * @see #setThreadWaitTimeout(int)
	 * @generated
	 */
	boolean isSetThreadWaitTimeout();

} // ThreadingProfileType
