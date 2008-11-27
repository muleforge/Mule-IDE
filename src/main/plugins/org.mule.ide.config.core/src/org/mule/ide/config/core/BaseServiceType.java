/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Base Service Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Base support for a model-based wrapper around the POJO service (SEDA, Streaming, etc.)
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.BaseServiceType#getInbound <em>Inbound</em>}</li>
 *   <li>{@link org.mule.ide.config.core.BaseServiceType#getAbstractComponentGroup <em>Abstract Component Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.BaseServiceType#getAbstractComponent <em>Abstract Component</em>}</li>
 *   <li>{@link org.mule.ide.config.core.BaseServiceType#getOutbound <em>Outbound</em>}</li>
 *   <li>{@link org.mule.ide.config.core.BaseServiceType#getAsyncReply <em>Async Reply</em>}</li>
 *   <li>{@link org.mule.ide.config.core.BaseServiceType#getAbstractExceptionStrategyGroup <em>Abstract Exception Strategy Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.BaseServiceType#getAbstractExceptionStrategy <em>Abstract Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.BaseServiceType#getInitialState <em>Initial State</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getBaseServiceType()
 * @model extendedMetaData="name='baseServiceType' kind='elementOnly'"
 * @generated
 */
public interface BaseServiceType extends AbstractServiceType {
	/**
	 * Returns the value of the '<em><b>Inbound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 The elements within "inbound" describe how messages enter the service.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inbound</em>' containment reference.
	 * @see #setInbound(InboundCollectionType)
	 * @see org.mule.ide.config.core.CorePackage#getBaseServiceType_Inbound()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inbound' namespace='##targetNamespace'"
	 * @generated
	 */
	InboundCollectionType getInbound();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.BaseServiceType#getInbound <em>Inbound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inbound</em>' containment reference.
	 * @see #getInbound()
	 * @generated
	 */
	void setInbound(InboundCollectionType value);

	/**
	 * Returns the value of the '<em><b>Abstract Component Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Component Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for component element.
	 *                 A component processes data. Typically it is a Java object.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Component Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getBaseServiceType_AbstractComponentGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-component:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractComponentGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Component</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for component element.
	 *                 A component processes data. Typically it is a Java object.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Component</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getBaseServiceType_AbstractComponent()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-component' namespace='##targetNamespace' group='abstract-component:group'"
	 * @generated
	 */
	AbstractComponentType getAbstractComponent();

	/**
	 * Returns the value of the '<em><b>Outbound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 The elements within "outbound" describe how messages leave the service.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Outbound</em>' containment reference.
	 * @see #setOutbound(OutboundCollectionType)
	 * @see org.mule.ide.config.core.CorePackage#getBaseServiceType_Outbound()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outbound' namespace='##targetNamespace'"
	 * @generated
	 */
	OutboundCollectionType getOutbound();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.BaseServiceType#getOutbound <em>Outbound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outbound</em>' containment reference.
	 * @see #getOutbound()
	 * @generated
	 */
	void setOutbound(OutboundCollectionType value);

	/**
	 * Returns the value of the '<em><b>Async Reply</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Async Reply</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                                 The elements within "async-reply" describe how asynchronous replies are handled.
	 *                             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Async Reply</em>' containment reference.
	 * @see #setAsyncReply(AsyncReplyCollectionType)
	 * @see org.mule.ide.config.core.CorePackage#getBaseServiceType_AsyncReply()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='async-reply' namespace='##targetNamespace'"
	 * @generated
	 */
	AsyncReplyCollectionType getAsyncReply();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.BaseServiceType#getAsyncReply <em>Async Reply</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Async Reply</em>' containment reference.
	 * @see #getAsyncReply()
	 * @generated
	 */
	void setAsyncReply(AsyncReplyCollectionType value);

	/**
	 * Returns the value of the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Exception Strategy Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for an exception strategy element.
	 *                 Exception strategies define how Mule should react to errors.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Exception Strategy Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getBaseServiceType_AbstractExceptionStrategyGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-exception-strategy:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractExceptionStrategyGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Exception Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Exception Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for an exception strategy element.
	 *                 Exception strategies define how Mule should react to errors.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Exception Strategy</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getBaseServiceType_AbstractExceptionStrategy()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-exception-strategy' namespace='##targetNamespace' group='abstract-exception-strategy:group'"
	 * @generated
	 */
	AbstractExceptionStrategyType getAbstractExceptionStrategy();

	/**
	 * Returns the value of the '<em><b>Initial State</b></em>' attribute.
	 * The default value is <code>"started"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.core.InitialStateType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The initial state of the service.
	 *                             Usually a service is started automatically, but this attribute can block any
	 *                             initial startup ("stopped") or stop the service immediately after initial
	 *                             startup ("paused").
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initial State</em>' attribute.
	 * @see org.mule.ide.config.core.InitialStateType
	 * @see #isSetInitialState()
	 * @see #unsetInitialState()
	 * @see #setInitialState(InitialStateType)
	 * @see org.mule.ide.config.core.CorePackage#getBaseServiceType_InitialState()
	 * @model default="started" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='initialState'"
	 * @generated
	 */
	InitialStateType getInitialState();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.BaseServiceType#getInitialState <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' attribute.
	 * @see org.mule.ide.config.core.InitialStateType
	 * @see #isSetInitialState()
	 * @see #unsetInitialState()
	 * @see #getInitialState()
	 * @generated
	 */
	void setInitialState(InitialStateType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.BaseServiceType#getInitialState <em>Initial State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInitialState()
	 * @see #getInitialState()
	 * @see #setInitialState(InitialStateType)
	 * @generated
	 */
	void unsetInitialState();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.BaseServiceType#getInitialState <em>Initial State</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Initial State</em>' attribute is set.
	 * @see #unsetInitialState()
	 * @see #getInitialState()
	 * @see #setInitialState(InitialStateType)
	 * @generated
	 */
	boolean isSetInitialState();

} // BaseServiceType
