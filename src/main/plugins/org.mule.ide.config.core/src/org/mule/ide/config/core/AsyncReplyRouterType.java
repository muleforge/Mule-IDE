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
 * A representation of the model object '<em><b>Async Reply Router Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.AsyncReplyRouterType#getAbstractInboundEndpointGroup <em>Abstract Inbound Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AsyncReplyRouterType#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AsyncReplyRouterType#getAbstractMessageInfoMappingGroup <em>Abstract Message Info Mapping Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AsyncReplyRouterType#getAbstractMessageInfoMapping <em>Abstract Message Info Mapping</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getAsyncReplyRouterType()
 * @model extendedMetaData="name='asyncReplyRouterType' kind='elementOnly'"
 * @generated
 */
public interface AsyncReplyRouterType extends AbstractAsyncReplyRouterType {
	/**
	 * Returns the value of the '<em><b>Abstract Inbound Endpoint Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Inbound Endpoint Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for inbound endpoint elements.
	 *                 Inbound endpoints receive messages from the underlying transport.
	 *                 The message payload is then delivered to the component for processing.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Inbound Endpoint Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getAsyncReplyRouterType_AbstractInboundEndpointGroup()
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
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for inbound endpoint elements.
	 *                 Inbound endpoints receive messages from the underlying transport.
	 *                 The message payload is then delivered to the component for processing.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Inbound Endpoint</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getAsyncReplyRouterType_AbstractInboundEndpoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-inbound-endpoint' namespace='##targetNamespace' group='abstract-inbound-endpoint:group'"
	 * @generated
	 */
	EList<AbstractInboundEndpointType> getAbstractInboundEndpoint();

	/**
	 * Returns the value of the '<em><b>Abstract Message Info Mapping Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Message Info Mapping Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Message Info Mapping Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getAsyncReplyRouterType_AbstractMessageInfoMappingGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-message-info-mapping:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractMessageInfoMappingGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Message Info Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Message Info Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Message Info Mapping</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getAsyncReplyRouterType_AbstractMessageInfoMapping()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-message-info-mapping' namespace='##targetNamespace' group='abstract-message-info-mapping:group'"
	 * @generated
	 */
	AbstractMessageInfoMappingType getAbstractMessageInfoMapping();

} // AsyncReplyRouterType
