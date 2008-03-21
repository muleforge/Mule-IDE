/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inbound Endpoint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getAbstractTransformer <em>Abstract Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getTransformers <em>Transformers</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getResponseTransformers <em>Response Transformers</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getAbstractTransactionGroup <em>Abstract Transaction Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getAbstractTransaction <em>Abstract Transaction</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getAbstractFilterGroup <em>Abstract Filter Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getAbstractFilter <em>Abstract Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getAbstractSecurityFilterGroup <em>Abstract Security Filter Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getAbstractSecurityFilter <em>Abstract Security Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getAbstractConnectionStrategyGroup <em>Abstract Connection Strategy Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getAbstractConnectionStrategy <em>Abstract Connection Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getProperty <em>Property</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getAddress <em>Address</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getConnectorRef <em>Connector Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getRef <em>Ref</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#isRemoteSync <em>Remote Sync</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getRemoteSyncTimeout <em>Remote Sync Timeout</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getResponseTransformerRefs <em>Response Transformer Refs</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#isSynchronous <em>Synchronous</em>}</li>
 *   <li>{@link org.mule.ide.config.core.InboundEndpointType#getTransformerRefs <em>Transformer Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType()
 * @model extendedMetaData="name='inboundEndpointType' kind='elementOnly'"
 * @generated
 */
public interface InboundEndpointType extends AbstractInboundEndpointType {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

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
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_AbstractTransformerGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-transformer:group' namespace='##targetNamespace' group='#group:1'"
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
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_AbstractTransformer()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-transformer' namespace='##targetNamespace' group='abstract-transformer:group'"
	 * @generated
	 */
	EList<AbstractTransformerType> getAbstractTransformer();

	/**
	 * Returns the value of the '<em><b>Transformers</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.TransformersType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             A list of transformer elements that will be applied to the message
	 *                             before it is delivered to the component.
	 *                             Note that a list of transformers can also be specified directly
	 *                             (without the "transformers" element), but then it is not possible
	 *                             to also specify response transformers
	 *                             (using the "response-transformers" element).
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transformers</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_Transformers()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='transformers' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TransformersType> getTransformers();

	/**
	 * Returns the value of the '<em><b>Response Transformers</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.ResponseTransformersType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Transformers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             A list of transformer elements that will be applied to the response message
	 *                             returned from the component.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Transformers</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_ResponseTransformers()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='response-transformers' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ResponseTransformersType> getResponseTransformers();

	/**
	 * Returns the value of the '<em><b>Abstract Transaction Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transaction Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for transaction elements.
	 *                 Transactions allow a series of operations to be grouped together.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Transaction Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_AbstractTransactionGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-transaction:group' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	FeatureMap getAbstractTransactionGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Transaction</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractTransactionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Transaction</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for transaction elements.
	 *                 Transactions allow a series of operations to be grouped together.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Transaction</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_AbstractTransaction()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-transaction' namespace='##targetNamespace' group='abstract-transaction:group'"
	 * @generated
	 */
	EList<AbstractTransactionType> getAbstractTransaction();

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
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_AbstractFilterGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-filter:group' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	FeatureMap getAbstractFilterGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractFilterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for filter elements.
	 *                 Filters are used to make decisions within the Mule framework.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Filter</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_AbstractFilter()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-filter' namespace='##targetNamespace' group='abstract-filter:group'"
	 * @generated
	 */
	EList<AbstractFilterType> getAbstractFilter();

	/**
	 * Returns the value of the '<em><b>Abstract Security Filter Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Security Filter Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for security filter elements.
	 *                 Security filters can control access to the system, etc.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Security Filter Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_AbstractSecurityFilterGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-security-filter:group' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	FeatureMap getAbstractSecurityFilterGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Security Filter</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractSecurityFilterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Security Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for security filter elements.
	 *                 Security filters can control access to the system, etc.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Security Filter</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_AbstractSecurityFilter()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-security-filter' namespace='##targetNamespace' group='abstract-security-filter:group'"
	 * @generated
	 */
	EList<AbstractSecurityFilterType> getAbstractSecurityFilter();

	/**
	 * Returns the value of the '<em><b>Abstract Connection Strategy Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Connection Strategy Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for connection strategy elements.
	 *                 Connection strategies control how the underlying transport handles connection errors.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Connection Strategy Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_AbstractConnectionStrategyGroup()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='abstract-connection-strategy:group' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	FeatureMap getAbstractConnectionStrategyGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Connection Strategy</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.AbstractConnectionStrategyType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Connection Strategy</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for connection strategy elements.
	 *                 Connection strategies control how the underlying transport handles connection errors.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Connection Strategy</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_AbstractConnectionStrategy()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-connection-strategy' namespace='##targetNamespace' group='abstract-connection-strategy:group'"
	 * @generated
	 */
	EList<AbstractConnectionStrategyType> getAbstractConnectionStrategy();

	/**
	 * Returns the value of the '<em><b>Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.KeyValueType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Property</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                         Set a Mule property.
	 *                         This is a name/value pair that can be set on components, services, etc,
	 *                         and which provide a generic way of configuring the system.
	 *                         In Mule v2 you typically shouldn't need to use a generic property like
	 *                         this, since almost all functionality is exposed via dedicated elements.
	 *                         However, it can be useful in configuring obscure or overlooked options
	 *                         and in configuring transports from the generic endpoint elements.
	 *                     
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Property</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_Property()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='property' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<KeyValueType> getProperty();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.MapType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 Set Mule properties.
	 *                 These are name/value pairs that can be set on components, services, etc,
	 *                 and which provide a generic way of configuring the system.
	 *                 In Mule v2 you typically shouldn't need to use generic properties like
	 *                 this, since almost all functionality is exposed via dedicated elements.
	 *                 However, they can be useful in configuring obscure or overlooked options
	 *                 and in configuring transports from the generic endpoint elements.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_Properties()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='properties' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<MapType> getProperties();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The generic address for this endpoint.
	 *                     If this attribute is used then the protocol must be specified as part of the URI.
	 *                     Alternatively, most transports provide alternative attributes for specifying the address
	 *                     (path, host etc).
	 *                     Note that the address attribute cannot be combined with "ref" or with the transport-provided
	 *                     alternative attributes.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_Address()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='address'"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.InboundEndpointType#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

	/**
	 * Returns the value of the '<em><b>Connector Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The name of the connector associated with this endpoint.
	 *                     This must be specified if more than one connector is defined for this transport.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connector Ref</em>' attribute.
	 * @see #setConnectorRef(String)
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_ConnectorRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='connector-ref'"
	 * @generated
	 */
	String getConnectorRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.InboundEndpointType#getConnectorRef <em>Connector Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector Ref</em>' attribute.
	 * @see #getConnectorRef()
	 * @generated
	 */
	void setConnectorRef(String value);

	/**
	 * Returns the value of the '<em><b>Encoding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Encoding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     String encoding used for messages.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encoding</em>' attribute.
	 * @see #setEncoding(String)
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_Encoding()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='encoding'"
	 * @generated
	 */
	String getEncoding();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.InboundEndpointType#getEncoding <em>Encoding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding</em>' attribute.
	 * @see #getEncoding()
	 * @generated
	 */
	void setEncoding(String value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     A reference to a global endpoint.
	 *                     If this attribute is used then the endpoint is used as a template to construct this endpoint.
	 *                     A template fixes the address (protocol, path, host, etc), and may specify initial values for
	 *                     various properties, but further properties can be defined locally (as long as they don't
	 *                     change the address in any way).
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='ref'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.InboundEndpointType#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

	/**
	 * Returns the value of the '<em><b>Remote Sync</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Sync</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     If true the component will wait for a response to the outgoing message before
	 *                     replying to the incoming message.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote Sync</em>' attribute.
	 * @see #isSetRemoteSync()
	 * @see #unsetRemoteSync()
	 * @see #setRemoteSync(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_RemoteSync()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='remoteSync'"
	 * @generated
	 */
	boolean isRemoteSync();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.InboundEndpointType#isRemoteSync <em>Remote Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Sync</em>' attribute.
	 * @see #isSetRemoteSync()
	 * @see #unsetRemoteSync()
	 * @see #isRemoteSync()
	 * @generated
	 */
	void setRemoteSync(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.InboundEndpointType#isRemoteSync <em>Remote Sync</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemoteSync()
	 * @see #isRemoteSync()
	 * @see #setRemoteSync(boolean)
	 * @generated
	 */
	void unsetRemoteSync();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.InboundEndpointType#isRemoteSync <em>Remote Sync</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remote Sync</em>' attribute is set.
	 * @see #unsetRemoteSync()
	 * @see #isRemoteSync()
	 * @see #setRemoteSync(boolean)
	 * @generated
	 */
	boolean isSetRemoteSync();

	/**
	 * Returns the value of the '<em><b>Remote Sync Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote Sync Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     The timeout for the remoteSync wait (ms).
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remote Sync Timeout</em>' attribute.
	 * @see #isSetRemoteSyncTimeout()
	 * @see #unsetRemoteSyncTimeout()
	 * @see #setRemoteSyncTimeout(int)
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_RemoteSyncTimeout()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableInt"
	 *        extendedMetaData="kind='attribute' name='remoteSyncTimeout'"
	 * @generated
	 */
	int getRemoteSyncTimeout();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.InboundEndpointType#getRemoteSyncTimeout <em>Remote Sync Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote Sync Timeout</em>' attribute.
	 * @see #isSetRemoteSyncTimeout()
	 * @see #unsetRemoteSyncTimeout()
	 * @see #getRemoteSyncTimeout()
	 * @generated
	 */
	void setRemoteSyncTimeout(int value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.InboundEndpointType#getRemoteSyncTimeout <em>Remote Sync Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRemoteSyncTimeout()
	 * @see #getRemoteSyncTimeout()
	 * @see #setRemoteSyncTimeout(int)
	 * @generated
	 */
	void unsetRemoteSyncTimeout();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.InboundEndpointType#getRemoteSyncTimeout <em>Remote Sync Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Remote Sync Timeout</em>' attribute is set.
	 * @see #unsetRemoteSyncTimeout()
	 * @see #getRemoteSyncTimeout()
	 * @see #setRemoteSyncTimeout(int)
	 * @generated
	 */
	boolean isSetRemoteSyncTimeout();

	/**
	 * Returns the value of the '<em><b>Response Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Transformer Refs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     A list of transformers which will be applied in order to the synchronous response
	 *                     before it is returned via the transport.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Response Transformer Refs</em>' attribute.
	 * @see #setResponseTransformerRefs(List)
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_ResponseTransformerRefs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='responseTransformer-refs'"
	 * @generated
	 */
	List<String> getResponseTransformerRefs();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.InboundEndpointType#getResponseTransformerRefs <em>Response Transformer Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Transformer Refs</em>' attribute.
	 * @see #getResponseTransformerRefs()
	 * @generated
	 */
	void setResponseTransformerRefs(List<String> value);

	/**
	 * Returns the value of the '<em><b>Synchronous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     If true the result from the component processing the incoming message will be
	 *                     returned as a response.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synchronous</em>' attribute.
	 * @see #isSetSynchronous()
	 * @see #unsetSynchronous()
	 * @see #setSynchronous(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_Synchronous()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='synchronous'"
	 * @generated
	 */
	boolean isSynchronous();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.InboundEndpointType#isSynchronous <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronous</em>' attribute.
	 * @see #isSetSynchronous()
	 * @see #unsetSynchronous()
	 * @see #isSynchronous()
	 * @generated
	 */
	void setSynchronous(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.InboundEndpointType#isSynchronous <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSynchronous()
	 * @see #isSynchronous()
	 * @see #setSynchronous(boolean)
	 * @generated
	 */
	void unsetSynchronous();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.InboundEndpointType#isSynchronous <em>Synchronous</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Synchronous</em>' attribute is set.
	 * @see #unsetSynchronous()
	 * @see #isSynchronous()
	 * @see #setSynchronous(boolean)
	 * @generated
	 */
	boolean isSetSynchronous();

	/**
	 * Returns the value of the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Refs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     A list of transformers which will be applied in order to the message before it is
	 *                     delivered to the component.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transformer Refs</em>' attribute.
	 * @see #setTransformerRefs(List)
	 * @see org.mule.ide.config.core.CorePackage#getInboundEndpointType_TransformerRefs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='transformer-refs'"
	 * @generated
	 */
	List<String> getTransformerRefs();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.InboundEndpointType#getTransformerRefs <em>Transformer Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Refs</em>' attribute.
	 * @see #getTransformerRefs()
	 * @generated
	 */
	void setTransformerRefs(List<String> value);

} // InboundEndpointType
