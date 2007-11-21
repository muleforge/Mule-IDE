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
 * A representation of the model object '<em><b>Response Router Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.ResponseRouterCollectionType#getAbstractResponseEndpointGroup <em>Abstract Response Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ResponseRouterCollectionType#getAbstractResponseEndpoint <em>Abstract Response Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ResponseRouterCollectionType#getAbstractResponseRouterGroup <em>Abstract Response Router Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ResponseRouterCollectionType#getAbstractResponseRouter <em>Abstract Response Router</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ResponseRouterCollectionType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ResponseRouterCollectionType#getAbstractTransformer <em>Abstract Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ResponseRouterCollectionType#getTimeout <em>Timeout</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ResponseRouterCollectionType#getTransformerRef <em>Transformer Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getResponseRouterCollectionType()
 * @model extendedMetaData="name='responseRouterCollectionType' kind='elementOnly'"
 * @generated
 */
public interface ResponseRouterCollectionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstract Response Endpoint Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Response Endpoint Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Response Endpoint Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getResponseRouterCollectionType_AbstractResponseEndpointGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='abstract-response-endpoint:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractResponseEndpointGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Response Endpoint</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractResponseEndpointType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Response Endpoint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Response Endpoint</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getResponseRouterCollectionType_AbstractResponseEndpoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-response-endpoint' namespace='##targetNamespace' group='abstract-response-endpoint:group'"
	 * @generated
	 */
	EList<AbstractResponseEndpointType> getAbstractResponseEndpoint();

	/**
	 * Returns the value of the '<em><b>Abstract Response Router Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Response Router Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Response Router Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getResponseRouterCollectionType_AbstractResponseRouterGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='abstract-response-router:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractResponseRouterGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Response Router</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractResponseRouterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Response Router</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Response Router</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getResponseRouterCollectionType_AbstractResponseRouter()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-response-router' namespace='##targetNamespace' group='abstract-response-router:group'"
	 * @generated
	 */
	EList<AbstractResponseRouterType> getAbstractResponseRouter();

	/**
	 * Returns the value of the '<em><b>Abstract Transformer Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transformer Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transformer Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getResponseRouterCollectionType_AbstractTransformerGroup()
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
	 * @return the value of the '<em>Abstract Transformer</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getResponseRouterCollectionType_AbstractTransformer()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-transformer' namespace='##targetNamespace' group='abstract-transformer:group'"
	 * @generated
	 */
	EList<AbstractTransformerType> getAbstractTransformer();

	/**
	 * Returns the value of the '<em><b>Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout</em>' attribute.
	 * @see #setTimeout(String)
	 * @see org.mule.ide.config.core.CorePackage#getResponseRouterCollectionType_Timeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='timeout'"
	 * @generated
	 */
	String getTimeout();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ResponseRouterCollectionType#getTimeout <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timeout</em>' attribute.
	 * @see #getTimeout()
	 * @generated
	 */
	void setTimeout(String value);

	/**
	 * Returns the value of the '<em><b>Transformer Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Ref</em>' attribute.
	 * @see #setTransformerRef(List)
	 * @see org.mule.ide.config.core.CorePackage#getResponseRouterCollectionType_TransformerRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='transformer-ref'"
	 * @generated
	 */
	List<String> getTransformerRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ResponseRouterCollectionType#getTransformerRef <em>Transformer Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Ref</em>' attribute.
	 * @see #getTransformerRef()
	 * @generated
	 */
	void setTransformerRef(List<String> value);

} // ResponseRouterCollectionType
