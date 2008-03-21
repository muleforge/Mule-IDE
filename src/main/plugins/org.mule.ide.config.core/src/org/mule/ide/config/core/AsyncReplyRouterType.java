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
 *   <li>{@link org.mule.ide.config.core.AsyncReplyRouterType#getAbstractPropertyExtractorGroup <em>Abstract Property Extractor Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AsyncReplyRouterType#getAbstractPropertyExtractor <em>Abstract Property Extractor</em>}</li>
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
	 * Returns the value of the '<em><b>Abstract Property Extractor Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Property Extractor Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Property Extractor Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getAsyncReplyRouterType_AbstractPropertyExtractorGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-property-extractor:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractPropertyExtractorGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Property Extractor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Property Extractor</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getAsyncReplyRouterType_AbstractPropertyExtractor()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-property-extractor' namespace='##targetNamespace' group='abstract-property-extractor:group'"
	 * @generated
	 */
	AbstractPropertyExtractorType getAbstractPropertyExtractor();

} // AsyncReplyRouterType
