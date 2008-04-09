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
 * A representation of the model object '<em><b>Pojo Binding Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.PojoBindingType#getAbstractOutboundEndpointGroup <em>Abstract Outbound Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.PojoBindingType#getAbstractOutboundEndpoint <em>Abstract Outbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.PojoBindingType#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.mule.ide.config.core.PojoBindingType#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getPojoBindingType()
 * @model extendedMetaData="name='pojoBindingType' kind='elementOnly'"
 * @generated
 */
public interface PojoBindingType extends EObject {
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
	 * @see org.mule.ide.config.core.CorePackage#getPojoBindingType_AbstractOutboundEndpointGroup()
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
	 * @see org.mule.ide.config.core.CorePackage#getPojoBindingType_AbstractOutboundEndpoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-outbound-endpoint' namespace='##targetNamespace' group='abstract-outbound-endpoint:group'"
	 * @generated
	 */
	EList<AbstractOutboundEndpointType> getAbstractOutboundEndpoint();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The interface to be injected.
	 *                     A proxy will be created that implements this interface by calling out to the endpoint.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interface</em>' attribute.
	 * @see #setInterface(String)
	 * @see org.mule.ide.config.core.CorePackage#getPojoBindingType_Interface()
	 * @model dataType="org.mule.ide.config.core.SubstitutableClass" required="true"
	 *        extendedMetaData="kind='attribute' name='interface'"
	 * @generated
	 */
	String getInterface();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.PojoBindingType#getInterface <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface</em>' attribute.
	 * @see #getInterface()
	 * @generated
	 */
	void setInterface(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The method on the interface that should be used.
	 *                     This can be omitted if the interface has a single method.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(Object)
	 * @see org.mule.ide.config.core.CorePackage#getPojoBindingType_Method()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='method'"
	 * @generated
	 */
	Object getMethod();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.PojoBindingType#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(Object value);

} // PojoBindingType
