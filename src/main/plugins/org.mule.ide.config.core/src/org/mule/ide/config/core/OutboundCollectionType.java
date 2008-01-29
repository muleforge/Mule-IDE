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
 * A representation of the model object '<em><b>Outbound Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.OutboundCollectionType#getAbstractCatchAllStrategyGroup <em>Abstract Catch All Strategy Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.OutboundCollectionType#getAbstractCatchAllStrategy <em>Abstract Catch All Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.OutboundCollectionType#getAbstractOutboundRouterGroup <em>Abstract Outbound Router Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.OutboundCollectionType#getAbstractOutboundRouter <em>Abstract Outbound Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.OutboundCollectionType#isMatchAll <em>Match All</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getOutboundCollectionType()
 * @model extendedMetaData="name='outboundCollectionType' kind='elementOnly'"
 * @generated
 */
public interface OutboundCollectionType extends EObject {
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
	 * @see org.mule.ide.config.core.CorePackage#getOutboundCollectionType_AbstractCatchAllStrategyGroup()
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
	 * @see org.mule.ide.config.core.CorePackage#getOutboundCollectionType_AbstractCatchAllStrategy()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-catch-all-strategy' namespace='##targetNamespace' group='abstract-catch-all-strategy:group'"
	 * @generated
	 */
	AbstractCatchAllStrategyType getAbstractCatchAllStrategy();

	/**
	 * Returns the value of the '<em><b>Abstract Outbound Router Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Outbound Router Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Outbound Router Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getOutboundCollectionType_AbstractOutboundRouterGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="true"
	 *        extendedMetaData="kind='group' name='abstract-outbound-router:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractOutboundRouterGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Outbound Router</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractOutboundRouterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Outbound Router</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Outbound Router</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getOutboundCollectionType_AbstractOutboundRouter()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-outbound-router' namespace='##targetNamespace' group='abstract-outbound-router:group'"
	 * @generated
	 */
	EList<AbstractOutboundRouterType> getAbstractOutboundRouter();

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
	 * @see org.mule.ide.config.core.CorePackage#getOutboundCollectionType_MatchAll()
	 * @model default="false" unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='matchAll'"
	 * @generated
	 */
	boolean isMatchAll();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.OutboundCollectionType#isMatchAll <em>Match All</em>}' attribute.
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
	 * Unsets the value of the '{@link org.mule.ide.config.core.OutboundCollectionType#isMatchAll <em>Match All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMatchAll()
	 * @see #isMatchAll()
	 * @see #setMatchAll(boolean)
	 * @generated
	 */
	void unsetMatchAll();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.OutboundCollectionType#isMatchAll <em>Match All</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Match All</em>' attribute is set.
	 * @see #unsetMatchAll()
	 * @see #isMatchAll()
	 * @see #setMatchAll(boolean)
	 * @generated
	 */
	boolean isSetMatchAll();

} // OutboundCollectionType
