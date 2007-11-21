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
 * Base support for a model-based wrapper around the POJO service (SEDA, Streaming, etc.)
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.BaseServiceType#getAbstractObjectFactoryGroup <em>Abstract Object Factory Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.BaseServiceType#getAbstractObjectFactory <em>Abstract Object Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.BaseServiceType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.core.BaseServiceType#getInboundRouter <em>Inbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.BaseServiceType#getNestedRouter <em>Nested Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.BaseServiceType#getOutboundRouter <em>Outbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.BaseServiceType#getResponseRouter <em>Response Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.BaseServiceType#getAbstractExceptionStrategyGroup <em>Abstract Exception Strategy Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.BaseServiceType#getAbstractExceptionStrategy <em>Abstract Exception Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.BaseServiceType#getClass_ <em>Class</em>}</li>
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
	 * Returns the value of the '<em><b>Abstract Object Factory Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Factory to create the user's POJO service
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Object Factory Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getBaseServiceType_AbstractObjectFactoryGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-object-factory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractObjectFactoryGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Object Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Factory to create the user's POJO service
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Object Factory</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getBaseServiceType_AbstractObjectFactory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-object-factory' namespace='##targetNamespace' group='abstract-object-factory:group'"
	 * @generated
	 */
	AbstractObjectFactoryType getAbstractObjectFactory();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(MapType)
	 * @see org.mule.ide.config.core.CorePackage#getBaseServiceType_Properties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace'"
	 * @generated
	 */
	MapType getProperties();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.BaseServiceType#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(MapType value);

	/**
	 * Returns the value of the '<em><b>Inbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound Router</em>' containment reference.
	 * @see #setInboundRouter(InboundRouterCollectionType)
	 * @see org.mule.ide.config.core.CorePackage#getBaseServiceType_InboundRouter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inbound-router' namespace='##targetNamespace'"
	 * @generated
	 */
	InboundRouterCollectionType getInboundRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.BaseServiceType#getInboundRouter <em>Inbound Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inbound Router</em>' containment reference.
	 * @see #getInboundRouter()
	 * @generated
	 */
	void setInboundRouter(InboundRouterCollectionType value);

	/**
	 * Returns the value of the '<em><b>Nested Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested Router</em>' containment reference.
	 * @see #setNestedRouter(NestedRouterCollectionType)
	 * @see org.mule.ide.config.core.CorePackage#getBaseServiceType_NestedRouter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nested-router' namespace='##targetNamespace'"
	 * @generated
	 */
	NestedRouterCollectionType getNestedRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.BaseServiceType#getNestedRouter <em>Nested Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested Router</em>' containment reference.
	 * @see #getNestedRouter()
	 * @generated
	 */
	void setNestedRouter(NestedRouterCollectionType value);

	/**
	 * Returns the value of the '<em><b>Outbound Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outbound Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outbound Router</em>' containment reference.
	 * @see #setOutboundRouter(OutboundRouterCollectionType)
	 * @see org.mule.ide.config.core.CorePackage#getBaseServiceType_OutboundRouter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='outbound-router' namespace='##targetNamespace'"
	 * @generated
	 */
	OutboundRouterCollectionType getOutboundRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.BaseServiceType#getOutboundRouter <em>Outbound Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outbound Router</em>' containment reference.
	 * @see #getOutboundRouter()
	 * @generated
	 */
	void setOutboundRouter(OutboundRouterCollectionType value);

	/**
	 * Returns the value of the '<em><b>Response Router</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Router</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Router</em>' containment reference.
	 * @see #setResponseRouter(ResponseRouterCollectionType)
	 * @see org.mule.ide.config.core.CorePackage#getBaseServiceType_ResponseRouter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='response-router' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseRouterCollectionType getResponseRouter();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.BaseServiceType#getResponseRouter <em>Response Router</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Router</em>' containment reference.
	 * @see #getResponseRouter()
	 * @generated
	 */
	void setResponseRouter(ResponseRouterCollectionType value);

	/**
	 * Returns the value of the '<em><b>Abstract Exception Strategy Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Exception Strategy Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
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
	 * @return the value of the '<em>Abstract Exception Strategy</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getBaseServiceType_AbstractExceptionStrategy()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-exception-strategy' namespace='##targetNamespace' group='abstract-exception-strategy:group'"
	 * @generated
	 */
	AbstractExceptionStrategyType getAbstractExceptionStrategy();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.mule.ide.config.core.CorePackage#getBaseServiceType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.BaseServiceType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

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
