/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Async Reply Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.AsyncReplyCollectionType#getAbstractInboundEndpointGroup <em>Abstract Inbound Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AsyncReplyCollectionType#getAbstractInboundEndpoint <em>Abstract Inbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AsyncReplyCollectionType#getAbstractAsyncReplyRouterGroup <em>Abstract Async Reply Router Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AsyncReplyCollectionType#getAbstractAsyncReplyRouter <em>Abstract Async Reply Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AsyncReplyCollectionType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AsyncReplyCollectionType#getAbstractTransformer <em>Abstract Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AsyncReplyCollectionType#isFailOnTimeout <em>Fail On Timeout</em>}</li>
 *   <li>{@link org.mule.ide.config.core.AsyncReplyCollectionType#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getAsyncReplyCollectionType()
 * @model extendedMetaData="name='asyncReplyCollectionType' kind='elementOnly'"
 * @generated
 */
public interface AsyncReplyCollectionType extends EObject, PlaceholderSupport {
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
	 * @see org.mule.ide.config.core.CorePackage#getAsyncReplyCollectionType_AbstractInboundEndpointGroup()
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
	 * @see org.mule.ide.config.core.CorePackage#getAsyncReplyCollectionType_AbstractInboundEndpoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-inbound-endpoint' namespace='##targetNamespace' group='abstract-inbound-endpoint:group'"
	 * @generated
	 */
	EList<AbstractInboundEndpointType> getAbstractInboundEndpoint();

	/**
	 * Returns the value of the '<em><b>Abstract Async Reply Router Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Async Reply Router Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for an async reply router element.
	 *                 Asynchronous replies are handled via this router.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Async Reply Router Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getAsyncReplyCollectionType_AbstractAsyncReplyRouterGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='abstract-async-reply-router:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractAsyncReplyRouterGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Async Reply Router</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractAsyncReplyRouterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Async Reply Router</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for an async reply router element.
	 *                 Asynchronous replies are handled via this router.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Async Reply Router</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getAsyncReplyCollectionType_AbstractAsyncReplyRouter()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-async-reply-router' namespace='##targetNamespace' group='abstract-async-reply-router:group'"
	 * @generated
	 */
	EList<AbstractAsyncReplyRouterType> getAbstractAsyncReplyRouter();

	/**
	 * Returns the value of the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transformer Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for transformer elements.
	 *                 Transformers convert message payloads.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Transformer Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getAsyncReplyCollectionType_AbstractTransformerGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='abstract-transformer:group' namespace='##targetNamespace'"
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
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for transformer elements.
	 *                 Transformers convert message payloads.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Transformer</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getAsyncReplyCollectionType_AbstractTransformer()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-transformer' namespace='##targetNamespace' group='abstract-transformer:group'"
	 * @generated
	 */
	EList<AbstractTransformerType> getAbstractTransformer();

	/**
	 * Returns the value of the '<em><b>Fail On Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     If the router times out before all expected events have been received should an exception be thrown
	 *                     or should the current events be returned for processing. The default is false.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fail On Timeout</em>' attribute.
	 * @see #isSetFailOnTimeout()
	 * @see #unsetFailOnTimeout()
	 * @see #setFailOnTimeout(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getAsyncReplyCollectionType_FailOnTimeout()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='failOnTimeout'"
	 * @generated
	 */
	boolean isFailOnTimeout();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.AsyncReplyCollectionType#isFailOnTimeout <em>Fail On Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail On Timeout</em>' attribute.
	 * @see #isSetFailOnTimeout()
	 * @see #unsetFailOnTimeout()
	 * @see #isFailOnTimeout()
	 * @generated
	 */
	void setFailOnTimeout(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.AsyncReplyCollectionType#isFailOnTimeout <em>Fail On Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFailOnTimeout()
	 * @see #isFailOnTimeout()
	 * @see #setFailOnTimeout(boolean)
	 * @generated
	 */
	void unsetFailOnTimeout();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.AsyncReplyCollectionType#isFailOnTimeout <em>Fail On Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Fail On Timeout</em>' attribute is set.
	 * @see #unsetFailOnTimeout()
	 * @see #isFailOnTimeout()
	 * @see #setFailOnTimeout(boolean)
	 * @generated
	 */
	boolean isSetFailOnTimeout();

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The timeout (ms) to wait for a reply.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #isSetTimeout()
	 * @see #unsetTimeout()
	 * @see #setTimeout(int)
	 * @see org.mule.ide.config.core.CorePackage#getAsyncReplyCollectionType_Timeout()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableInt"
	 *        extendedMetaData="kind='attribute' name='timeout'"
	 * @generated
	 */
	int getTimeout();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.AsyncReplyCollectionType#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #isSetTimeout()
	 * @see #unsetTimeout()
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(int value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.AsyncReplyCollectionType#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTimeout()
	 * @see #getTimeout()
	 * @see #setTimeout(int)
	 * @generated
	 */
	void unsetTimeout();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.AsyncReplyCollectionType#getTimeout <em>Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Timeout</em>' attribute is set.
	 * @see #unsetTimeout()
	 * @see #getTimeout()
	 * @see #setTimeout(int)
	 * @generated
	 */
	boolean isSetTimeout();

} // AsyncReplyCollectionType
