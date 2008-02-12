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
 * A representation of the model object '<em><b>Outbound Router Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.OutboundRouterType#getAbstractOutboundEndpointGroup <em>Abstract Outbound Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.OutboundRouterType#getAbstractOutboundEndpoint <em>Abstract Outbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.OutboundRouterType#getReplyTo <em>Reply To</em>}</li>
 *   <li>{@link org.mule.ide.config.core.OutboundRouterType#getAbstractTransactionGroup <em>Abstract Transaction Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.OutboundRouterType#getAbstractTransaction <em>Abstract Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.core.OutboundRouterType#getAbstractPropertyExtractorGroup <em>Abstract Property Extractor Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.OutboundRouterType#getAbstractPropertyExtractor <em>Abstract Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.OutboundRouterType#getCustomPropertyExtractor <em>Custom Property Extractor</em>}</li>
 *   <li>{@link org.mule.ide.config.core.OutboundRouterType#getEnableCorrelation <em>Enable Correlation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getOutboundRouterType()
 * @model extendedMetaData="name='outboundRouterType' kind='elementOnly'"
 * @generated
 */
public interface OutboundRouterType extends AbstractOutboundRouterType {
	/**
	 * Returns the value of the '<em><b>Abstract Outbound Endpoint Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Outbound Endpoint Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Outbound Endpoint Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getOutboundRouterType_AbstractOutboundEndpointGroup()
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
	 * @return the value of the '<em>Abstract Outbound Endpoint</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getOutboundRouterType_AbstractOutboundEndpoint()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-outbound-endpoint' namespace='##targetNamespace' group='abstract-outbound-endpoint:group'"
	 * @generated
	 */
	EList<AbstractOutboundEndpointType> getAbstractOutboundEndpoint();

	/**
	 * Returns the value of the '<em><b>Reply To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reply To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reply To</em>' containment reference.
	 * @see #setReplyTo(ReplyToType)
	 * @see org.mule.ide.config.core.CorePackage#getOutboundRouterType_ReplyTo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reply-to' namespace='##targetNamespace'"
	 * @generated
	 */
	ReplyToType getReplyTo();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.OutboundRouterType#getReplyTo <em>Reply To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reply To</em>' containment reference.
	 * @see #getReplyTo()
	 * @generated
	 */
	void setReplyTo(ReplyToType value);

	/**
	 * Returns the value of the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transaction Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transaction Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getOutboundRouterType_AbstractTransactionGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-transaction:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractTransactionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Transaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Transaction</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getOutboundRouterType_AbstractTransaction()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-transaction' namespace='##targetNamespace' group='abstract-transaction:group'"
	 * @generated
	 */
	AbstractTransactionType getAbstractTransaction();

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
	 * @see org.mule.ide.config.core.CorePackage#getOutboundRouterType_AbstractPropertyExtractorGroup()
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
	 * @see org.mule.ide.config.core.CorePackage#getOutboundRouterType_AbstractPropertyExtractor()
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
	 * @see #setCustomPropertyExtractor(CustomPropertyExtractorType)
	 * @see org.mule.ide.config.core.CorePackage#getOutboundRouterType_CustomPropertyExtractor()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='custom-property-extractor' namespace='##targetNamespace'"
	 * @generated
	 */
	CustomPropertyExtractorType getCustomPropertyExtractor();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.OutboundRouterType#getCustomPropertyExtractor <em>Custom Property Extractor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Property Extractor</em>' containment reference.
	 * @see #getCustomPropertyExtractor()
	 * @generated
	 */
	void setCustomPropertyExtractor(CustomPropertyExtractorType value);

	/**
	 * Returns the value of the '<em><b>Enable Correlation</b></em>' attribute.
	 * The default value is <code>"IF_NOT_SET"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.core.EnableCorrelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Correlation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Correlation</em>' attribute.
	 * @see org.mule.ide.config.core.EnableCorrelationType
	 * @see #isSetEnableCorrelation()
	 * @see #unsetEnableCorrelation()
	 * @see #setEnableCorrelation(EnableCorrelationType)
	 * @see org.mule.ide.config.core.CorePackage#getOutboundRouterType_EnableCorrelation()
	 * @model default="IF_NOT_SET" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='enableCorrelation'"
	 * @generated
	 */
	EnableCorrelationType getEnableCorrelation();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.OutboundRouterType#getEnableCorrelation <em>Enable Correlation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Correlation</em>' attribute.
	 * @see org.mule.ide.config.core.EnableCorrelationType
	 * @see #isSetEnableCorrelation()
	 * @see #unsetEnableCorrelation()
	 * @see #getEnableCorrelation()
	 * @generated
	 */
	void setEnableCorrelation(EnableCorrelationType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.OutboundRouterType#getEnableCorrelation <em>Enable Correlation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEnableCorrelation()
	 * @see #getEnableCorrelation()
	 * @see #setEnableCorrelation(EnableCorrelationType)
	 * @generated
	 */
	void unsetEnableCorrelation();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.OutboundRouterType#getEnableCorrelation <em>Enable Correlation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Enable Correlation</em>' attribute is set.
	 * @see #unsetEnableCorrelation()
	 * @see #getEnableCorrelation()
	 * @see #setEnableCorrelation(EnableCorrelationType)
	 * @generated
	 */
	boolean isSetEnableCorrelation();

} // OutboundRouterType
