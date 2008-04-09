/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.ConfigurationType#getDefaultThreadingProfile <em>Default Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ConfigurationType#getDefaultDispatcherThreadingProfile <em>Default Dispatcher Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ConfigurationType#getDefaultReceiverThreadingProfile <em>Default Receiver Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ConfigurationType#getDefaultComponentThreadingProfile <em>Default Component Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ConfigurationType#isDefaultRemoteSync <em>Default Remote Sync</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ConfigurationType#isDefaultSynchronousEndpoints <em>Default Synchronous Endpoints</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ConfigurationType#getDefaultSynchronousEventTimeout <em>Default Synchronous Event Timeout</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ConfigurationType#getDefaultTransactionTimeout <em>Default Transaction Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getConfigurationType()
 * @model extendedMetaData="name='configurationType' kind='elementOnly'"
 * @generated
 */
public interface ConfigurationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The default threading profile,
	 *                         used by components and by endpoints for dispatching and receiving
	 *                         if no more specific configuration is given.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Threading Profile</em>' containment reference.
	 * @see #setDefaultThreadingProfile(ThreadingProfileType)
	 * @see org.mule.ide.config.core.CorePackage#getConfigurationType_DefaultThreadingProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='default-threading-profile' namespace='##targetNamespace'"
	 * @generated
	 */
	ThreadingProfileType getDefaultThreadingProfile();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ConfigurationType#getDefaultThreadingProfile <em>Default Threading Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Threading Profile</em>' containment reference.
	 * @see #getDefaultThreadingProfile()
	 * @generated
	 */
	void setDefaultThreadingProfile(ThreadingProfileType value);

	/**
	 * Returns the value of the '<em><b>Default Dispatcher Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The default dispatching threading profile, modifies the default-threading-profile
	 *                         values and is used by endpoints for dispatching
	 *                         if no more specific configuration is given.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Dispatcher Threading Profile</em>' containment reference.
	 * @see #setDefaultDispatcherThreadingProfile(ThreadingProfileType)
	 * @see org.mule.ide.config.core.CorePackage#getConfigurationType_DefaultDispatcherThreadingProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='default-dispatcher-threading-profile' namespace='##targetNamespace'"
	 * @generated
	 */
	ThreadingProfileType getDefaultDispatcherThreadingProfile();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ConfigurationType#getDefaultDispatcherThreadingProfile <em>Default Dispatcher Threading Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Dispatcher Threading Profile</em>' containment reference.
	 * @see #getDefaultDispatcherThreadingProfile()
	 * @generated
	 */
	void setDefaultDispatcherThreadingProfile(ThreadingProfileType value);

	/**
	 * Returns the value of the '<em><b>Default Receiver Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The default receiving threading profile, modifies the default-threading-profile
	 *                         values and is used by endpoints for receiving
	 *                         if no more specific configuration is given.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Receiver Threading Profile</em>' containment reference.
	 * @see #setDefaultReceiverThreadingProfile(ThreadingProfileType)
	 * @see org.mule.ide.config.core.CorePackage#getConfigurationType_DefaultReceiverThreadingProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='default-receiver-threading-profile' namespace='##targetNamespace'"
	 * @generated
	 */
	ThreadingProfileType getDefaultReceiverThreadingProfile();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ConfigurationType#getDefaultReceiverThreadingProfile <em>Default Receiver Threading Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Receiver Threading Profile</em>' containment reference.
	 * @see #getDefaultReceiverThreadingProfile()
	 * @generated
	 */
	void setDefaultReceiverThreadingProfile(ThreadingProfileType value);

	/**
	 * Returns the value of the '<em><b>Default Component Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         The default component threading profile, modifies the default-threading-profile
	 *                         values and is used if no more specific configuration is given.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Component Threading Profile</em>' containment reference.
	 * @see #setDefaultComponentThreadingProfile(ThreadingProfileType)
	 * @see org.mule.ide.config.core.CorePackage#getConfigurationType_DefaultComponentThreadingProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='default-component-threading-profile' namespace='##targetNamespace'"
	 * @generated
	 */
	ThreadingProfileType getDefaultComponentThreadingProfile();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ConfigurationType#getDefaultComponentThreadingProfile <em>Default Component Threading Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Component Threading Profile</em>' containment reference.
	 * @see #getDefaultComponentThreadingProfile()
	 * @generated
	 */
	void setDefaultComponentThreadingProfile(ThreadingProfileType value);

	/**
	 * Returns the value of the '<em><b>Default Remote Sync</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     If true then connections to endpoints will wait for a response from the remote service.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Remote Sync</em>' attribute.
	 * @see #isSetDefaultRemoteSync()
	 * @see #unsetDefaultRemoteSync()
	 * @see #setDefaultRemoteSync(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getConfigurationType_DefaultRemoteSync()
	 * @model default="false" unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='defaultRemoteSync'"
	 * @generated
	 */
	boolean isDefaultRemoteSync();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ConfigurationType#isDefaultRemoteSync <em>Default Remote Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Remote Sync</em>' attribute.
	 * @see #isSetDefaultRemoteSync()
	 * @see #unsetDefaultRemoteSync()
	 * @see #isDefaultRemoteSync()
	 * @generated
	 */
	void setDefaultRemoteSync(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ConfigurationType#isDefaultRemoteSync <em>Default Remote Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultRemoteSync()
	 * @see #isDefaultRemoteSync()
	 * @see #setDefaultRemoteSync(boolean)
	 * @generated
	 */
	void unsetDefaultRemoteSync();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ConfigurationType#isDefaultRemoteSync <em>Default Remote Sync</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Remote Sync</em>' attribute is set.
	 * @see #unsetDefaultRemoteSync()
	 * @see #isDefaultRemoteSync()
	 * @see #setDefaultRemoteSync(boolean)
	 * @generated
	 */
	boolean isSetDefaultRemoteSync();

	/**
	 * Returns the value of the '<em><b>Default Synchronous Endpoints</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     If true then connections to endpoints will wait for a response.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Synchronous Endpoints</em>' attribute.
	 * @see #isSetDefaultSynchronousEndpoints()
	 * @see #unsetDefaultSynchronousEndpoints()
	 * @see #setDefaultSynchronousEndpoints(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getConfigurationType_DefaultSynchronousEndpoints()
	 * @model default="false" unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='defaultSynchronousEndpoints'"
	 * @generated
	 */
	boolean isDefaultSynchronousEndpoints();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ConfigurationType#isDefaultSynchronousEndpoints <em>Default Synchronous Endpoints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Synchronous Endpoints</em>' attribute.
	 * @see #isSetDefaultSynchronousEndpoints()
	 * @see #unsetDefaultSynchronousEndpoints()
	 * @see #isDefaultSynchronousEndpoints()
	 * @generated
	 */
	void setDefaultSynchronousEndpoints(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ConfigurationType#isDefaultSynchronousEndpoints <em>Default Synchronous Endpoints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultSynchronousEndpoints()
	 * @see #isDefaultSynchronousEndpoints()
	 * @see #setDefaultSynchronousEndpoints(boolean)
	 * @generated
	 */
	void unsetDefaultSynchronousEndpoints();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ConfigurationType#isDefaultSynchronousEndpoints <em>Default Synchronous Endpoints</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Synchronous Endpoints</em>' attribute is set.
	 * @see #unsetDefaultSynchronousEndpoints()
	 * @see #isDefaultSynchronousEndpoints()
	 * @see #setDefaultSynchronousEndpoints(boolean)
	 * @generated
	 */
	boolean isSetDefaultSynchronousEndpoints();

	/**
	 * Returns the value of the '<em><b>Default Synchronous Event Timeout</b></em>' attribute.
	 * The default value is <code>"3000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The default period (ms) to wait for a synchronous response.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Synchronous Event Timeout</em>' attribute.
	 * @see #isSetDefaultSynchronousEventTimeout()
	 * @see #unsetDefaultSynchronousEventTimeout()
	 * @see #setDefaultSynchronousEventTimeout(String)
	 * @see org.mule.ide.config.core.CorePackage#getConfigurationType_DefaultSynchronousEventTimeout()
	 * @model default="3000" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultSynchronousEventTimeout'"
	 * @generated
	 */
	String getDefaultSynchronousEventTimeout();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ConfigurationType#getDefaultSynchronousEventTimeout <em>Default Synchronous Event Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Synchronous Event Timeout</em>' attribute.
	 * @see #isSetDefaultSynchronousEventTimeout()
	 * @see #unsetDefaultSynchronousEventTimeout()
	 * @see #getDefaultSynchronousEventTimeout()
	 * @generated
	 */
	void setDefaultSynchronousEventTimeout(String value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ConfigurationType#getDefaultSynchronousEventTimeout <em>Default Synchronous Event Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultSynchronousEventTimeout()
	 * @see #getDefaultSynchronousEventTimeout()
	 * @see #setDefaultSynchronousEventTimeout(String)
	 * @generated
	 */
	void unsetDefaultSynchronousEventTimeout();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ConfigurationType#getDefaultSynchronousEventTimeout <em>Default Synchronous Event Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Synchronous Event Timeout</em>' attribute is set.
	 * @see #unsetDefaultSynchronousEventTimeout()
	 * @see #getDefaultSynchronousEventTimeout()
	 * @see #setDefaultSynchronousEventTimeout(String)
	 * @generated
	 */
	boolean isSetDefaultSynchronousEventTimeout();

	/**
	 * Returns the value of the '<em><b>Default Transaction Timeout</b></em>' attribute.
	 * The default value is <code>"5000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The default timeout for transactions,
	 *                     used if no more specific configuration is given.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Transaction Timeout</em>' attribute.
	 * @see #isSetDefaultTransactionTimeout()
	 * @see #unsetDefaultTransactionTimeout()
	 * @see #setDefaultTransactionTimeout(String)
	 * @see org.mule.ide.config.core.CorePackage#getConfigurationType_DefaultTransactionTimeout()
	 * @model default="5000" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultTransactionTimeout'"
	 * @generated
	 */
	String getDefaultTransactionTimeout();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ConfigurationType#getDefaultTransactionTimeout <em>Default Transaction Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Transaction Timeout</em>' attribute.
	 * @see #isSetDefaultTransactionTimeout()
	 * @see #unsetDefaultTransactionTimeout()
	 * @see #getDefaultTransactionTimeout()
	 * @generated
	 */
	void setDefaultTransactionTimeout(String value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ConfigurationType#getDefaultTransactionTimeout <em>Default Transaction Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultTransactionTimeout()
	 * @see #getDefaultTransactionTimeout()
	 * @see #setDefaultTransactionTimeout(String)
	 * @generated
	 */
	void unsetDefaultTransactionTimeout();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ConfigurationType#getDefaultTransactionTimeout <em>Default Transaction Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Default Transaction Timeout</em>' attribute is set.
	 * @see #unsetDefaultTransactionTimeout()
	 * @see #getDefaultTransactionTimeout()
	 * @see #setDefaultTransactionTimeout(String)
	 * @generated
	 */
	boolean isSetDefaultTransactionTimeout();

} // ConfigurationType
