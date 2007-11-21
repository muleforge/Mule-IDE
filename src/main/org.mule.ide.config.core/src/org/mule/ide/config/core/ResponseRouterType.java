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
 * A representation of the model object '<em><b>Response Router Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.ResponseRouterType#getAbstractResponseEndpointGroup <em>Abstract Response Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ResponseRouterType#getAbstractResponseEndpoint <em>Abstract Response Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ResponseRouterType#getAbstractPropertyExtractorGroup <em>Abstract Property Extractor Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ResponseRouterType#getAbstractPropertyExtractor <em>Abstract Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ResponseRouterType#getCustomPropertyExtractor <em>Custom Property Extractor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getResponseRouterType()
 * @model extendedMetaData="name='responseRouterType' kind='elementOnly'"
 * @generated
 */
public interface ResponseRouterType extends AbstractResponseRouterType {
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
	 * @see org.mule.ide.config.core.CorePackage#getResponseRouterType_AbstractResponseEndpointGroup()
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
	 * @see org.mule.ide.config.core.CorePackage#getResponseRouterType_AbstractResponseEndpoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-response-endpoint' namespace='##targetNamespace' group='abstract-response-endpoint:group'"
	 * @generated
	 */
	EList<AbstractResponseEndpointType> getAbstractResponseEndpoint();

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
	 * @see org.mule.ide.config.core.CorePackage#getResponseRouterType_AbstractPropertyExtractorGroup()
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
	 * @see org.mule.ide.config.core.CorePackage#getResponseRouterType_AbstractPropertyExtractor()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-property-extractor' namespace='##targetNamespace' group='abstract-property-extractor:group'"
	 * @generated
	 */
	AbstractPropertyExtractorType getAbstractPropertyExtractor();

	/**
	 * Returns the value of the '<em><b>Custom Property Extractor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Custom Property Extractor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Property Extractor</em>' containment reference.
	 * @see #setCustomPropertyExtractor(EObject)
	 * @see org.mule.ide.config.core.CorePackage#getResponseRouterType_CustomPropertyExtractor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='custom-property-extractor' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getCustomPropertyExtractor();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ResponseRouterType#getCustomPropertyExtractor <em>Custom Property Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Property Extractor</em>' containment reference.
	 * @see #getCustomPropertyExtractor()
	 * @generated
	 */
	void setCustomPropertyExtractor(EObject value);

} // ResponseRouterType
