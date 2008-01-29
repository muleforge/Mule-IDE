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
 *   <li>{@link org.mule.ide.config.core.ThreadingProfileType#getName <em>Name</em>}</li>
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
	 * @return the value of the '<em>Max Buffer Size</em>' attribute.
	 * @see #setMaxBufferSize(String)
	 * @see org.mule.ide.config.core.CorePackage#getThreadingProfileType_MaxBufferSize()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maxBufferSize'"
	 * @generated
	 */
	String getMaxBufferSize();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getMaxBufferSize <em>Max Buffer Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Buffer Size</em>' attribute.
	 * @see #getMaxBufferSize()
	 * @generated
	 */
	void setMaxBufferSize(String value);

	/**
	 * Returns the value of the '<em><b>Max Threads Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Threads Active</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Threads Active</em>' attribute.
	 * @see #setMaxThreadsActive(String)
	 * @see org.mule.ide.config.core.CorePackage#getThreadingProfileType_MaxThreadsActive()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maxThreadsActive'"
	 * @generated
	 */
	String getMaxThreadsActive();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getMaxThreadsActive <em>Max Threads Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Threads Active</em>' attribute.
	 * @see #getMaxThreadsActive()
	 * @generated
	 */
	void setMaxThreadsActive(String value);

	/**
	 * Returns the value of the '<em><b>Max Threads Idle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Threads Idle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Threads Idle</em>' attribute.
	 * @see #setMaxThreadsIdle(String)
	 * @see org.mule.ide.config.core.CorePackage#getThreadingProfileType_MaxThreadsIdle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='maxThreadsIdle'"
	 * @generated
	 */
	String getMaxThreadsIdle();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getMaxThreadsIdle <em>Max Threads Idle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Threads Idle</em>' attribute.
	 * @see #getMaxThreadsIdle()
	 * @generated
	 */
	void setMaxThreadsIdle(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mule.ide.config.core.CorePackage#getThreadingProfileType_Name()
	 * @model dataType="org.mule.ide.config.core.SubstitutableName"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @return the value of the '<em>Thread TTL</em>' attribute.
	 * @see #setThreadTTL(String)
	 * @see org.mule.ide.config.core.CorePackage#getThreadingProfileType_ThreadTTL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='threadTTL'"
	 * @generated
	 */
	String getThreadTTL();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getThreadTTL <em>Thread TTL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread TTL</em>' attribute.
	 * @see #getThreadTTL()
	 * @generated
	 */
	void setThreadTTL(String value);

	/**
	 * Returns the value of the '<em><b>Thread Wait Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thread Wait Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thread Wait Timeout</em>' attribute.
	 * @see #setThreadWaitTimeout(String)
	 * @see org.mule.ide.config.core.CorePackage#getThreadingProfileType_ThreadWaitTimeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='threadWaitTimeout'"
	 * @generated
	 */
	String getThreadWaitTimeout();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ThreadingProfileType#getThreadWaitTimeout <em>Thread Wait Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thread Wait Timeout</em>' attribute.
	 * @see #getThreadWaitTimeout()
	 * @generated
	 */
	void setThreadWaitTimeout(String value);

} // ThreadingProfileType
