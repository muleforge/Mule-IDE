/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Endpoint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractTransformer <em>Abstract Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractTransactionGroup <em>Abstract Transaction Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractTransaction <em>Abstract Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractFilterGroup <em>Abstract Filter Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractFilter <em>Abstract Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractSecurityFilterGroup <em>Abstract Security Filter Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractSecurityFilter <em>Abstract Security Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractConnectionStrategyGroup <em>Abstract Connection Strategy Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getAbstractConnectionStrategy <em>Abstract Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getConnectorRef <em>Connector Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getCreateConnector <em>Create Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getRef <em>Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#isRemoteSync <em>Remote Sync</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getRemoteSyncTimeout <em>Remote Sync Timeout</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getResponseTransformerRefs <em>Response Transformer Refs</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#isSynchronous <em>Synchronous</em>}</li>
 *   <li>{@link org.mule.ide.config.core.GlobalEndpointType#getTransformerRefs <em>Transformer Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType()
 * @model extendedMetaData="name='globalEndpointType' kind='elementOnly'"
 * @generated
 */
public interface GlobalEndpointType extends AbstractGlobalEndpointType {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transformer Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transformer Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_AbstractTransformerGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-transformer:group' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	FeatureMap getAbstractTransformerGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Transformer</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractTransformerType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transformer</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transformer</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_AbstractTransformer()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-transformer' namespace='##targetNamespace' group='abstract-transformer:group'"
	 * @generated
	 */
	EList<AbstractTransformerType> getAbstractTransformer();

	/**
	 * Returns the value of the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transaction Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transaction Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_AbstractTransactionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-transaction:group' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	FeatureMap getAbstractTransactionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Transaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractTransactionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transaction</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_AbstractTransaction()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-transaction' namespace='##targetNamespace' group='abstract-transaction:group'"
	 * @generated
	 */
	EList<AbstractTransactionType> getAbstractTransaction();

	/**
	 * Returns the value of the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Filter Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Filter Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_AbstractFilterGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-filter:group' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	FeatureMap getAbstractFilterGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractFilterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Filter</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_AbstractFilter()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-filter' namespace='##targetNamespace' group='abstract-filter:group'"
	 * @generated
	 */
	EList<AbstractFilterType> getAbstractFilter();

	/**
	 * Returns the value of the '<em><b>Abstract Security Filter Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Security Filter Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Security Filter Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_AbstractSecurityFilterGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-security-filter:group' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	FeatureMap getAbstractSecurityFilterGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Security Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractSecurityFilterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Security Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Security Filter</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_AbstractSecurityFilter()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-security-filter' namespace='##targetNamespace' group='abstract-security-filter:group'"
	 * @generated
	 */
	EList<AbstractSecurityFilterType> getAbstractSecurityFilter();

	/**
	 * Returns the value of the '<em><b>Abstract Connection Strategy Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Connection Strategy Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Connection Strategy Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_AbstractConnectionStrategyGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-connection-strategy:group' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	FeatureMap getAbstractConnectionStrategyGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Connection Strategy</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractConnectionStrategyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Connection Strategy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Connection Strategy</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_AbstractConnectionStrategy()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-connection-strategy' namespace='##targetNamespace' group='abstract-connection-strategy:group'"
	 * @generated
	 */
	EList<AbstractConnectionStrategyType> getAbstractConnectionStrategy();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.MapType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_Properties()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<MapType> getProperties();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_Address()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='address'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.GlobalEndpointType#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Connector Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector Ref</em>' attribute.
	 * @see #setConnectorRef(String)
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_ConnectorRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='connector-ref'"
	 * @generated
	 */
	String getConnectorRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.GlobalEndpointType#getConnectorRef <em>Connector Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Ref</em>' attribute.
	 * @see #getConnectorRef()
	 * @generated
	 */
	void setConnectorRef(String value);

	/**
	 * Returns the value of the '<em><b>Create Connector</b></em>' attribute.
	 * The default value is <code>"FIND_OR_CREATE"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.core.CreateConnectorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Connector</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Connector</em>' attribute.
	 * @see org.mule.ide.config.core.CreateConnectorType
	 * @see #isSetCreateConnector()
	 * @see #unsetCreateConnector()
	 * @see #setCreateConnector(CreateConnectorType)
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_CreateConnector()
	 * @model default="FIND_OR_CREATE" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='createConnector'"
	 * @generated
	 */
	CreateConnectorType getCreateConnector();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.GlobalEndpointType#getCreateConnector <em>Create Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Connector</em>' attribute.
	 * @see org.mule.ide.config.core.CreateConnectorType
	 * @see #isSetCreateConnector()
	 * @see #unsetCreateConnector()
	 * @see #getCreateConnector()
	 * @generated
	 */
	void setCreateConnector(CreateConnectorType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.GlobalEndpointType#getCreateConnector <em>Create Connector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCreateConnector()
	 * @see #getCreateConnector()
	 * @see #setCreateConnector(CreateConnectorType)
	 * @generated
	 */
	void unsetCreateConnector();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.GlobalEndpointType#getCreateConnector <em>Create Connector</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Create Connector</em>' attribute is set.
	 * @see #unsetCreateConnector()
	 * @see #getCreateConnector()
	 * @see #setCreateConnector(CreateConnectorType)
	 * @generated
	 */
	boolean isSetCreateConnector();

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_Encoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.GlobalEndpointType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='ref'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.GlobalEndpointType#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Remote Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Sync</em>' attribute.
	 * @see #isSetRemoteSync()
	 * @see #unsetRemoteSync()
	 * @see #setRemoteSync(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_RemoteSync()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='remoteSync'"
	 * @generated
	 */
	boolean isRemoteSync();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.GlobalEndpointType#isRemoteSync <em>Remote Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Sync</em>' attribute.
	 * @see #isSetRemoteSync()
	 * @see #unsetRemoteSync()
	 * @see #isRemoteSync()
	 * @generated
	 */
	void setRemoteSync(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.GlobalEndpointType#isRemoteSync <em>Remote Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemoteSync()
	 * @see #isRemoteSync()
	 * @see #setRemoteSync(boolean)
	 * @generated
	 */
	void unsetRemoteSync();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.GlobalEndpointType#isRemoteSync <em>Remote Sync</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remote Sync</em>' attribute is set.
	 * @see #unsetRemoteSync()
	 * @see #isRemoteSync()
	 * @see #setRemoteSync(boolean)
	 * @generated
	 */
	boolean isSetRemoteSync();

	/**
	 * Returns the value of the '<em><b>Remote Sync Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Sync Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote Sync Timeout</em>' attribute.
	 * @see #setRemoteSyncTimeout(String)
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_RemoteSyncTimeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='remoteSyncTimeout'"
	 * @generated
	 */
	String getRemoteSyncTimeout();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.GlobalEndpointType#getRemoteSyncTimeout <em>Remote Sync Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Sync Timeout</em>' attribute.
	 * @see #getRemoteSyncTimeout()
	 * @generated
	 */
	void setRemoteSyncTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Response Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Transformer Refs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Transformer Refs</em>' attribute.
	 * @see #setResponseTransformerRefs(List)
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_ResponseTransformerRefs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='responseTransformer-refs'"
	 * @generated
	 */
	List<String> getResponseTransformerRefs();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.GlobalEndpointType#getResponseTransformerRefs <em>Response Transformer Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Transformer Refs</em>' attribute.
	 * @see #getResponseTransformerRefs()
	 * @generated
	 */
	void setResponseTransformerRefs(List<String> value);

	/**
	 * Returns the value of the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronous</em>' attribute.
	 * @see #isSetSynchronous()
	 * @see #unsetSynchronous()
	 * @see #setSynchronous(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_Synchronous()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='synchronous'"
	 * @generated
	 */
	boolean isSynchronous();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.GlobalEndpointType#isSynchronous <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronous</em>' attribute.
	 * @see #isSetSynchronous()
	 * @see #unsetSynchronous()
	 * @see #isSynchronous()
	 * @generated
	 */
	void setSynchronous(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.GlobalEndpointType#isSynchronous <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSynchronous()
	 * @see #isSynchronous()
	 * @see #setSynchronous(boolean)
	 * @generated
	 */
	void unsetSynchronous();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.GlobalEndpointType#isSynchronous <em>Synchronous</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Synchronous</em>' attribute is set.
	 * @see #unsetSynchronous()
	 * @see #isSynchronous()
	 * @see #setSynchronous(boolean)
	 * @generated
	 */
	boolean isSetSynchronous();

	/**
	 * Returns the value of the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Refs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Refs</em>' attribute.
	 * @see #setTransformerRefs(List)
	 * @see org.mule.ide.config.core.CorePackage#getGlobalEndpointType_TransformerRefs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='transformer-refs'"
	 * @generated
	 */
	List<String> getTransformerRefs();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.GlobalEndpointType#getTransformerRefs <em>Transformer Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Refs</em>' attribute.
	 * @see #getTransformerRefs()
	 * @generated
	 */
	void setTransformerRefs(List<String> value);

} // GlobalEndpointType