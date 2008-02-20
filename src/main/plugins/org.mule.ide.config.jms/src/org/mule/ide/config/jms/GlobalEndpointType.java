/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.jms;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.mule.ide.config.core.AbstractConnectionStrategyType;
import org.mule.ide.config.core.AbstractFilterType;
import org.mule.ide.config.core.AbstractGlobalEndpointType;
import org.mule.ide.config.core.AbstractSecurityFilterType;
import org.mule.ide.config.core.AbstractTransactionType;
import org.mule.ide.config.core.AbstractTransformerType;
import org.mule.ide.config.core.MapType;
import org.mule.ide.config.core.ResponseTransformersType;
import org.mule.ide.config.core.TransformersType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Endpoint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getAbstractTransformer <em>Abstract Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getTransformers <em>Transformers</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getResponseTransformers <em>Response Transformers</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getAbstractTransactionGroup <em>Abstract Transaction Group</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getAbstractTransaction <em>Abstract Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getAbstractFilterGroup <em>Abstract Filter Group</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getAbstractFilter <em>Abstract Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getAbstractSecurityFilterGroup <em>Abstract Security Filter Group</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getAbstractSecurityFilter <em>Abstract Security Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getAbstractConnectionStrategyGroup <em>Abstract Connection Strategy Group</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getAbstractConnectionStrategy <em>Abstract Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getConnectorRef <em>Connector Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getQueue <em>Queue</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getRef <em>Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#isRemoteSync <em>Remote Sync</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getRemoteSyncTimeout <em>Remote Sync Timeout</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getResponseTransformerRefs <em>Response Transformer Refs</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#isSynchronous <em>Synchronous</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getTopic <em>Topic</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.GlobalEndpointType#getTransformerRefs <em>Transformer Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType()
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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_Group()
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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_AbstractTransformerGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-transformer:group' namespace='http://www.mulesource.org/schema/mule/core/2.0' group='#group:1'"
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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_AbstractTransformer()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-transformer' namespace='http://www.mulesource.org/schema/mule/core/2.0' group='http://www.mulesource.org/schema/mule/core/2.0#abstract-transformer:group'"
	 * @generated
	 */
	EList<AbstractTransformerType> getAbstractTransformer();

	/**
	 * Returns the value of the '<em><b>Transformers</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.TransformersType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformers</em>' containment reference list.
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_Transformers()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformers' namespace='http://www.mulesource.org/schema/mule/core/2.0' group='#group:1'"
	 * @generated
	 */
	EList<TransformersType> getTransformers();

	/**
	 * Returns the value of the '<em><b>Response Transformers</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.ResponseTransformersType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Transformers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Transformers</em>' containment reference list.
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_ResponseTransformers()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='responseTransformers' namespace='http://www.mulesource.org/schema/mule/core/2.0' group='#group:1'"
	 * @generated
	 */
	EList<ResponseTransformersType> getResponseTransformers();

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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_AbstractTransactionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-transaction:group' namespace='http://www.mulesource.org/schema/mule/core/2.0' group='#group:1'"
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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_AbstractTransaction()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-transaction' namespace='http://www.mulesource.org/schema/mule/core/2.0' group='http://www.mulesource.org/schema/mule/core/2.0#abstract-transaction:group'"
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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_AbstractFilterGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-filter:group' namespace='http://www.mulesource.org/schema/mule/core/2.0' group='#group:1'"
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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_AbstractFilter()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-filter' namespace='http://www.mulesource.org/schema/mule/core/2.0' group='http://www.mulesource.org/schema/mule/core/2.0#abstract-filter:group'"
	 * @generated
	 */
	EList<AbstractFilterType> getAbstractFilter();

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.jms.JmsSelectorFilter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector</em>' containment reference list.
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_Selector()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='selector' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<JmsSelectorFilter> getSelector();

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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_AbstractSecurityFilterGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-security-filter:group' namespace='http://www.mulesource.org/schema/mule/core/2.0' group='#group:1'"
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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_AbstractSecurityFilter()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-security-filter' namespace='http://www.mulesource.org/schema/mule/core/2.0' group='http://www.mulesource.org/schema/mule/core/2.0#abstract-security-filter:group'"
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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_AbstractConnectionStrategyGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-connection-strategy:group' namespace='http://www.mulesource.org/schema/mule/core/2.0' group='#group:1'"
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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_AbstractConnectionStrategy()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-connection-strategy' namespace='http://www.mulesource.org/schema/mule/core/2.0' group='http://www.mulesource.org/schema/mule/core/2.0#abstract-connection-strategy:group'"
	 * @generated
	 */
	EList<AbstractConnectionStrategyType> getAbstractConnectionStrategy();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.MapType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Set properties via Spring's entry attribute.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_Properties()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='http://www.mulesource.org/schema/mule/core/2.0' group='#group:1'"
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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_Address()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='address'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GlobalEndpointType#getAddress <em>Address</em>}' attribute.
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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_ConnectorRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='connector-ref'"
	 * @generated
	 */
	String getConnectorRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GlobalEndpointType#getConnectorRef <em>Connector Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Ref</em>' attribute.
	 * @see #getConnectorRef()
	 * @generated
	 */
	void setConnectorRef(String value);

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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_Encoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GlobalEndpointType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Queue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The queue name.
	 *                     This cannot be used with the topic attribute (the two are exclusive).
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queue</em>' attribute.
	 * @see #setQueue(String)
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_Queue()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='queue'"
	 * @generated
	 */
	String getQueue();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GlobalEndpointType#getQueue <em>Queue</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue</em>' attribute.
	 * @see #getQueue()
	 * @generated
	 */
	void setQueue(String value);

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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='ref'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GlobalEndpointType#getRef <em>Ref</em>}' attribute.
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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_RemoteSync()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='remoteSync'"
	 * @generated
	 */
	boolean isRemoteSync();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GlobalEndpointType#isRemoteSync <em>Remote Sync</em>}' attribute.
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
	 * Unsets the value of the '{@link org.mule.ide.config.jms.GlobalEndpointType#isRemoteSync <em>Remote Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemoteSync()
	 * @see #isRemoteSync()
	 * @see #setRemoteSync(boolean)
	 * @generated
	 */
	void unsetRemoteSync();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.jms.GlobalEndpointType#isRemoteSync <em>Remote Sync</em>}' attribute is set.
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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_RemoteSyncTimeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='remoteSyncTimeout'"
	 * @generated
	 */
	String getRemoteSyncTimeout();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GlobalEndpointType#getRemoteSyncTimeout <em>Remote Sync Timeout</em>}' attribute.
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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_ResponseTransformerRefs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='responseTransformer-refs'"
	 * @generated
	 */
	List<String> getResponseTransformerRefs();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GlobalEndpointType#getResponseTransformerRefs <em>Response Transformer Refs</em>}' attribute.
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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_Synchronous()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='synchronous'"
	 * @generated
	 */
	boolean isSynchronous();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GlobalEndpointType#isSynchronous <em>Synchronous</em>}' attribute.
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
	 * Unsets the value of the '{@link org.mule.ide.config.jms.GlobalEndpointType#isSynchronous <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSynchronous()
	 * @see #isSynchronous()
	 * @see #setSynchronous(boolean)
	 * @generated
	 */
	void unsetSynchronous();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.jms.GlobalEndpointType#isSynchronous <em>Synchronous</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Topic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The topic name.  The "topic:" prefix will be added automatically.
	 *                     This cannot be used with the queue attribute (the two are exclusive).
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topic</em>' attribute.
	 * @see #setTopic(String)
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_Topic()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='topic'"
	 * @generated
	 */
	String getTopic();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GlobalEndpointType#getTopic <em>Topic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topic</em>' attribute.
	 * @see #getTopic()
	 * @generated
	 */
	void setTopic(String value);

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
	 * @see org.mule.ide.config.jms.JMSPackage#getGlobalEndpointType_TransformerRefs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='transformer-refs'"
	 * @generated
	 */
	List<String> getTransformerRefs();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.GlobalEndpointType#getTransformerRefs <em>Transformer Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Refs</em>' attribute.
	 * @see #getTransformerRefs()
	 * @generated
	 */
	void setTransformerRefs(List<String> value);

} // GlobalEndpointType
