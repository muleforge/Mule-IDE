/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mule Management Context Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultThreadingProfile <em>Default Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultDispatcherThreadingProfile <em>Default Dispatcher Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultReceiverThreadingProfile <em>Default Receiver Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultComponentThreadingProfile <em>Default Component Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleManagementContextType#getAbstractStorageGroup <em>Abstract Storage Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleManagementContextType#getAbstractStorage <em>Abstract Storage</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultConnectionStrategy <em>Default Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleManagementContextType#getClusterId <em>Cluster Id</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultEncoding <em>Default Encoding</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleManagementContextType#isDefaultRemoteSync <em>Default Remote Sync</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleManagementContextType#isDefaultSynchronousEndpoints <em>Default Synchronous Endpoints</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultSynchronousEventTimeout <em>Default Synchronous Event Timeout</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultTransactionTimeout <em>Default Transaction Timeout</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleManagementContextType#getDomainId <em>Domain Id</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleManagementContextType#getServerId <em>Server Id</em>}</li>
 *   <li>{@link org.mule.ide.config.core.MuleManagementContextType#getWorkingDirectory <em>Working Directory</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getMuleManagementContextType()
 * @model extendedMetaData="name='muleManagementContextType' kind='elementOnly'"
 * @generated
 */
public interface MuleManagementContextType extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Threading Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Threading Profile</em>' containment reference.
	 * @see #setDefaultThreadingProfile(ThreadingProfileType)
	 * @see org.mule.ide.config.core.CorePackage#getMuleManagementContextType_DefaultThreadingProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='default-threading-profile' namespace='##targetNamespace'"
	 * @generated
	 */
	ThreadingProfileType getDefaultThreadingProfile();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultThreadingProfile <em>Default Threading Profile</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Default Dispatcher Threading Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Dispatcher Threading Profile</em>' containment reference.
	 * @see #setDefaultDispatcherThreadingProfile(ThreadingProfileType)
	 * @see org.mule.ide.config.core.CorePackage#getMuleManagementContextType_DefaultDispatcherThreadingProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='default-dispatcher-threading-profile' namespace='##targetNamespace'"
	 * @generated
	 */
	ThreadingProfileType getDefaultDispatcherThreadingProfile();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultDispatcherThreadingProfile <em>Default Dispatcher Threading Profile</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Default Receiver Threading Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Receiver Threading Profile</em>' containment reference.
	 * @see #setDefaultReceiverThreadingProfile(ThreadingProfileType)
	 * @see org.mule.ide.config.core.CorePackage#getMuleManagementContextType_DefaultReceiverThreadingProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='default-receiver-threading-profile' namespace='##targetNamespace'"
	 * @generated
	 */
	ThreadingProfileType getDefaultReceiverThreadingProfile();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultReceiverThreadingProfile <em>Default Receiver Threading Profile</em>}' containment reference.
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
	 * <p>
	 * If the meaning of the '<em>Default Component Threading Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Component Threading Profile</em>' containment reference.
	 * @see #setDefaultComponentThreadingProfile(ThreadingProfileType)
	 * @see org.mule.ide.config.core.CorePackage#getMuleManagementContextType_DefaultComponentThreadingProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='default-component-threading-profile' namespace='##targetNamespace'"
	 * @generated
	 */
	ThreadingProfileType getDefaultComponentThreadingProfile();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultComponentThreadingProfile <em>Default Component Threading Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Component Threading Profile</em>' containment reference.
	 * @see #getDefaultComponentThreadingProfile()
	 * @generated
	 */
	void setDefaultComponentThreadingProfile(ThreadingProfileType value);

	/**
	 * Returns the value of the '<em><b>Abstract Storage Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Storage Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Storage Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getMuleManagementContextType_AbstractStorageGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-storage:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractStorageGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Storage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Storage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Storage</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getMuleManagementContextType_AbstractStorage()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-storage' namespace='##targetNamespace' group='abstract-storage:group'"
	 * @generated
	 */
	AbstractStorageType getAbstractStorage();

	/**
	 * Returns the value of the '<em><b>Default Connection Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Connection Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Connection Strategy</em>' containment reference.
	 * @see #setDefaultConnectionStrategy(ConnectionStrategyType)
	 * @see org.mule.ide.config.core.CorePackage#getMuleManagementContextType_DefaultConnectionStrategy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='default-connection-strategy' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionStrategyType getDefaultConnectionStrategy();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultConnectionStrategy <em>Default Connection Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Connection Strategy</em>' containment reference.
	 * @see #getDefaultConnectionStrategy()
	 * @generated
	 */
	void setDefaultConnectionStrategy(ConnectionStrategyType value);

	/**
	 * Returns the value of the '<em><b>Cluster Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cluster Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster Id</em>' attribute.
	 * @see #setClusterId(String)
	 * @see org.mule.ide.config.core.CorePackage#getMuleManagementContextType_ClusterId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='clusterId'"
	 * @generated
	 */
	String getClusterId();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#getClusterId <em>Cluster Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster Id</em>' attribute.
	 * @see #getClusterId()
	 * @generated
	 */
	void setClusterId(String value);

	/**
	 * Returns the value of the '<em><b>Default Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Encoding</em>' attribute.
	 * @see #setDefaultEncoding(String)
	 * @see org.mule.ide.config.core.CorePackage#getMuleManagementContextType_DefaultEncoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultEncoding'"
	 * @generated
	 */
	String getDefaultEncoding();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultEncoding <em>Default Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Encoding</em>' attribute.
	 * @see #getDefaultEncoding()
	 * @generated
	 */
	void setDefaultEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Default Remote Sync</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Remote Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Remote Sync</em>' attribute.
	 * @see #isSetDefaultRemoteSync()
	 * @see #unsetDefaultRemoteSync()
	 * @see #setDefaultRemoteSync(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getMuleManagementContextType_DefaultRemoteSync()
	 * @model default="false" unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='defaultRemoteSync'"
	 * @generated
	 */
	boolean isDefaultRemoteSync();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#isDefaultRemoteSync <em>Default Remote Sync</em>}' attribute.
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
	 * Unsets the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#isDefaultRemoteSync <em>Default Remote Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultRemoteSync()
	 * @see #isDefaultRemoteSync()
	 * @see #setDefaultRemoteSync(boolean)
	 * @generated
	 */
	void unsetDefaultRemoteSync();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#isDefaultRemoteSync <em>Default Remote Sync</em>}' attribute is set.
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
	 * <p>
	 * If the meaning of the '<em>Default Synchronous Endpoints</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Synchronous Endpoints</em>' attribute.
	 * @see #isSetDefaultSynchronousEndpoints()
	 * @see #unsetDefaultSynchronousEndpoints()
	 * @see #setDefaultSynchronousEndpoints(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getMuleManagementContextType_DefaultSynchronousEndpoints()
	 * @model default="false" unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='defaultSynchronousEndpoints'"
	 * @generated
	 */
	boolean isDefaultSynchronousEndpoints();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#isDefaultSynchronousEndpoints <em>Default Synchronous Endpoints</em>}' attribute.
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
	 * Unsets the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#isDefaultSynchronousEndpoints <em>Default Synchronous Endpoints</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefaultSynchronousEndpoints()
	 * @see #isDefaultSynchronousEndpoints()
	 * @see #setDefaultSynchronousEndpoints(boolean)
	 * @generated
	 */
	void unsetDefaultSynchronousEndpoints();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#isDefaultSynchronousEndpoints <em>Default Synchronous Endpoints</em>}' attribute is set.
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
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Synchronous Event Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Synchronous Event Timeout</em>' attribute.
	 * @see #setDefaultSynchronousEventTimeout(String)
	 * @see org.mule.ide.config.core.CorePackage#getMuleManagementContextType_DefaultSynchronousEventTimeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultSynchronousEventTimeout'"
	 * @generated
	 */
	String getDefaultSynchronousEventTimeout();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultSynchronousEventTimeout <em>Default Synchronous Event Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Synchronous Event Timeout</em>' attribute.
	 * @see #getDefaultSynchronousEventTimeout()
	 * @generated
	 */
	void setDefaultSynchronousEventTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Default Transaction Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Transaction Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Transaction Timeout</em>' attribute.
	 * @see #setDefaultTransactionTimeout(String)
	 * @see org.mule.ide.config.core.CorePackage#getMuleManagementContextType_DefaultTransactionTimeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='defaultTransactionTimeout'"
	 * @generated
	 */
	String getDefaultTransactionTimeout();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#getDefaultTransactionTimeout <em>Default Transaction Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Transaction Timeout</em>' attribute.
	 * @see #getDefaultTransactionTimeout()
	 * @generated
	 */
	void setDefaultTransactionTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Domain Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Id</em>' attribute.
	 * @see #setDomainId(String)
	 * @see org.mule.ide.config.core.CorePackage#getMuleManagementContextType_DomainId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='domainId'"
	 * @generated
	 */
	String getDomainId();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#getDomainId <em>Domain Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Id</em>' attribute.
	 * @see #getDomainId()
	 * @generated
	 */
	void setDomainId(String value);

	/**
	 * Returns the value of the '<em><b>Server Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Server Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Server Id</em>' attribute.
	 * @see #setServerId(String)
	 * @see org.mule.ide.config.core.CorePackage#getMuleManagementContextType_ServerId()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='serverId'"
	 * @generated
	 */
	String getServerId();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#getServerId <em>Server Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Server Id</em>' attribute.
	 * @see #getServerId()
	 * @generated
	 */
	void setServerId(String value);

	/**
	 * Returns the value of the '<em><b>Working Directory</b></em>' attribute.
	 * The default value is <code>"./.mule"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Working Directory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working Directory</em>' attribute.
	 * @see #isSetWorkingDirectory()
	 * @see #unsetWorkingDirectory()
	 * @see #setWorkingDirectory(String)
	 * @see org.mule.ide.config.core.CorePackage#getMuleManagementContextType_WorkingDirectory()
	 * @model default="./.mule" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='workingDirectory'"
	 * @generated
	 */
	String getWorkingDirectory();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#getWorkingDirectory <em>Working Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working Directory</em>' attribute.
	 * @see #isSetWorkingDirectory()
	 * @see #unsetWorkingDirectory()
	 * @see #getWorkingDirectory()
	 * @generated
	 */
	void setWorkingDirectory(String value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#getWorkingDirectory <em>Working Directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorkingDirectory()
	 * @see #getWorkingDirectory()
	 * @see #setWorkingDirectory(String)
	 * @generated
	 */
	void unsetWorkingDirectory();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.MuleManagementContextType#getWorkingDirectory <em>Working Directory</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Working Directory</em>' attribute is set.
	 * @see #unsetWorkingDirectory()
	 * @see #getWorkingDirectory()
	 * @see #setWorkingDirectory(String)
	 * @generated
	 */
	boolean isSetWorkingDirectory();

} // MuleManagementContextType
