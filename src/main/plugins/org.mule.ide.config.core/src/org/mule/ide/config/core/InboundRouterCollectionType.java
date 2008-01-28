/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inbound Router Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.InboundRouterCollectionType#getAbstractCatchAllStrategyGroup <em>Abstract Catch All Strategy Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundRouterCollectionType#getAbstractCatchAllStrategy <em>Abstract Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundRouterCollectionType#getAbstractInboundEndpointGroup <em>Abstract Inbound Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundRouterCollectionType#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundRouterCollectionType#getAbstractInboundRouterGroup <em>Abstract Inbound Router Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundRouterCollectionType#getAbstractInboundRouter <em>Abstract Inbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundRouterCollectionType#isMatchAll <em>Match All</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getInboundRouterCollectionType()
 * @model extendedMetaData="name='inboundRouterCollectionType' kind='elementOnly'"
 * @generated
 */
public interface InboundRouterCollectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstract Catch All Strategy Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Catch All Strategy Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Catch All Strategy Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getInboundRouterCollectionType_AbstractCatchAllStrategyGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-catch-all-strategy:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractCatchAllStrategyGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Catch All Strategy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Catch All Strategy</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Catch All Strategy</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getInboundRouterCollectionType_AbstractCatchAllStrategy()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-catch-all-strategy' namespace='##targetNamespace' group='abstract-catch-all-strategy:group'"
	 * @generated
	 */
	AbstractCatchAllStrategyType getAbstractCatchAllStrategy();

	/**
	 * Returns the value of the '<em><b>Abstract Inbound Endpoint Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Inbound Endpoint Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Inbound Endpoint Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getInboundRouterCollectionType_AbstractInboundEndpointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='abstract-inbound-endpoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractInboundEndpointGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Inbound Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractInboundEndpointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Inbound Endpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Inbound Endpoint</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getInboundRouterCollectionType_AbstractInboundEndpoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-inbound-endpoint' namespace='##targetNamespace' group='abstract-inbound-endpoint:group'"
	 * @generated
	 */
	EList<AbstractInboundEndpointType> getAbstractInboundEndpoint();

	/**
	 * Returns the value of the '<em><b>Abstract Inbound Router Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Inbound Router Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Inbound Router Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getInboundRouterCollectionType_AbstractInboundRouterGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='abstract-inbound-router:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractInboundRouterGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Inbound Router</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractInboundRouterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Inbound Router</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Inbound Router</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getInboundRouterCollectionType_AbstractInboundRouter()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-inbound-router' namespace='##targetNamespace' group='abstract-inbound-router:group'"
	 * @generated
	 */
	EList<AbstractInboundRouterType> getAbstractInboundRouter();

	/**
	 * Returns the value of the '<em><b>Match All</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Match All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match All</em>' attribute.
	 * @see #isSetMatchAll()
	 * @see #unsetMatchAll()
	 * @see #setMatchAll(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getInboundRouterCollectionType_MatchAll()
	 * @model default="false" unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='matchAll'"
	 * @generated
	 */
	boolean isMatchAll();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.InboundRouterCollectionType#isMatchAll <em>Match All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match All</em>' attribute.
	 * @see #isSetMatchAll()
	 * @see #unsetMatchAll()
	 * @see #isMatchAll()
	 * @generated
	 */
	void setMatchAll(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.InboundRouterCollectionType#isMatchAll <em>Match All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMatchAll()
	 * @see #isMatchAll()
	 * @see #setMatchAll(boolean)
	 * @generated
	 */
	void unsetMatchAll();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.InboundRouterCollectionType#isMatchAll <em>Match All</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Match All</em>' attribute is set.
	 * @see #unsetMatchAll()
	 * @see #isMatchAll()
	 * @see #setMatchAll(boolean)
	 * @generated
	 */
	boolean isSetMatchAll();

} // InboundRouterCollectionType
