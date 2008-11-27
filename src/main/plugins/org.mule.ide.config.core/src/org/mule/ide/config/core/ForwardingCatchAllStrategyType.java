/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Forwarding Catch All Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.ForwardingCatchAllStrategyType#getAbstractOutboundEndpointGroup <em>Abstract Outbound Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ForwardingCatchAllStrategyType#getAbstractOutboundEndpoint <em>Abstract Outbound Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getForwardingCatchAllStrategyType()
 * @model extendedMetaData="name='forwardingCatchAllStrategyType' kind='elementOnly'"
 * @generated
 */
public interface ForwardingCatchAllStrategyType extends AbstractCatchAllStrategyType {
	/**
	 * Returns the value of the '<em><b>Abstract Outbound Endpoint Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Outbound Endpoint Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for outbound endpoint elements.
	 *                 Outbound endpoints dispatch messages to the underlying transport.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Outbound Endpoint Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getForwardingCatchAllStrategyType_AbstractOutboundEndpointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='abstract-outbound-endpoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractOutboundEndpointGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractOutboundEndpointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Outbound Endpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for outbound endpoint elements.
	 *                 Outbound endpoints dispatch messages to the underlying transport.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Outbound Endpoint</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getForwardingCatchAllStrategyType_AbstractOutboundEndpoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-outbound-endpoint' namespace='##targetNamespace' group='abstract-outbound-endpoint:group'"
	 * @generated
	 */
	EList<AbstractOutboundEndpointType> getAbstractOutboundEndpoint();

} // ForwardingCatchAllStrategyType
