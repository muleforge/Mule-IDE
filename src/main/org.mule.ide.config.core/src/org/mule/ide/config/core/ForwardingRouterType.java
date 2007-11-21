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
 * A representation of the model object '<em><b>Forwarding Router Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.ForwardingRouterType#getAbstractInboundEndpointGroup <em>Abstract Inbound Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ForwardingRouterType#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getForwardingRouterType()
 * @model extendedMetaData="name='forwardingRouterType' kind='elementOnly'"
 * @generated
 */
public interface ForwardingRouterType extends FilteredInboundRouterType {
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
	 * @see org.mule.ide.config.core.CorePackage#getForwardingRouterType_AbstractInboundEndpointGroup()
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
	 * @see org.mule.ide.config.core.CorePackage#getForwardingRouterType_AbstractInboundEndpoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-inbound-endpoint' namespace='##targetNamespace' group='abstract-inbound-endpoint:group'"
	 * @generated
	 */
	EList<AbstractInboundEndpointType> getAbstractInboundEndpoint();

} // ForwardingRouterType
