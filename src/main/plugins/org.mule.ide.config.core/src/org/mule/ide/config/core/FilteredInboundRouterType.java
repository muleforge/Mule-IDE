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
 * A representation of the model object '<em><b>Filtered Inbound Router Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.FilteredInboundRouterType#getAbstractFilterGroup <em>Abstract Filter Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.FilteredInboundRouterType#getAbstractFilter <em>Abstract Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.FilteredInboundRouterType#getAbstractPropertyExtractorGroup <em>Abstract Property Extractor Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.FilteredInboundRouterType#getAbstractPropertyExtractor <em>Abstract Property Extractor</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getFilteredInboundRouterType()
 * @model extendedMetaData="name='filteredInboundRouterType' kind='elementOnly'"
 * @generated
 */
public interface FilteredInboundRouterType extends AbstractInboundRouterType {
	/**
	 * Returns the value of the '<em><b>Abstract Filter Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Filter Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for filter elements.
	 *                 Filters are used to make decisions within the Mule framework.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Filter Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getFilteredInboundRouterType_AbstractFilterGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-filter:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractFilterGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for filter elements.
	 *                 Filters are used to make decisions within the Mule framework.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Filter</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getFilteredInboundRouterType_AbstractFilter()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-filter' namespace='##targetNamespace' group='abstract-filter:group'"
	 * @generated
	 */
	AbstractFilterType getAbstractFilter();

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
	 * @see org.mule.ide.config.core.CorePackage#getFilteredInboundRouterType_AbstractPropertyExtractorGroup()
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
	 * @see org.mule.ide.config.core.CorePackage#getFilteredInboundRouterType_AbstractPropertyExtractor()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-property-extractor' namespace='##targetNamespace' group='abstract-property-extractor:group'"
	 * @generated
	 */
	AbstractPropertyExtractorType getAbstractPropertyExtractor();

} // FilteredInboundRouterType
