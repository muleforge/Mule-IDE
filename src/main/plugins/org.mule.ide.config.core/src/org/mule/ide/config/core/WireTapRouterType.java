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
 * A representation of the model object '<em><b>Wire Tap Router Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.WireTapRouterType#getAbstractOutboundEndpointGroup <em>Abstract Outbound Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.WireTapRouterType#getAbstractOutboundEndpoint <em>Abstract Outbound Endpoint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getWireTapRouterType()
 * @model extendedMetaData="name='wireTapRouterType' kind='elementOnly'"
 * @generated
 */
public interface WireTapRouterType extends FilteredInboundRouterType {
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
	 * @see org.mule.ide.config.core.CorePackage#getWireTapRouterType_AbstractOutboundEndpointGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" required="true" many="false"
	 *        extendedMetaData="kind='group' name='abstract-outbound-endpoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractOutboundEndpointGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Outbound Endpoint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Outbound Endpoint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for outbound endpoint elements.
	 *                 Outbound endpoints dispatch messages to the underlying transport.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Outbound Endpoint</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getWireTapRouterType_AbstractOutboundEndpoint()
	 * @model containment="true" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-outbound-endpoint' namespace='##targetNamespace' group='abstract-outbound-endpoint:group'"
	 * @generated
	 */
	AbstractOutboundEndpointType getAbstractOutboundEndpoint();

} // WireTapRouterType
