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
 * A representation of the model object '<em><b>Selective Consumer Router Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.SelectiveConsumerRouterType#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.SelectiveConsumerRouterType#getAbstractTransformer <em>Abstract Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.SelectiveConsumerRouterType#getTransformerRefs <em>Transformer Refs</em>}</li>
 *   <li>{@link org.mule.ide.config.core.SelectiveConsumerRouterType#isTransformFirst <em>Transform First</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getSelectiveConsumerRouterType()
 * @model extendedMetaData="name='selectiveConsumerRouterType' kind='elementOnly'"
 * @generated
 */
public interface SelectiveConsumerRouterType extends FilteredInboundRouterType {
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
	 * @see org.mule.ide.config.core.CorePackage#getSelectiveConsumerRouterType_AbstractTransformerGroup()
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
	 * @see org.mule.ide.config.core.CorePackage#getSelectiveConsumerRouterType_AbstractTransformer()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-transformer' namespace='##targetNamespace' group='abstract-transformer:group'"
	 * @generated
	 */
	EList<AbstractTransformerType> getAbstractTransformer();

	/**
	 * Returns the value of the '<em><b>Transformer Refs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformer Refs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformer Refs</em>' attribute.
	 * @see #setTransformerRefs(List)
	 * @see org.mule.ide.config.core.CorePackage#getSelectiveConsumerRouterType_TransformerRefs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='transformer-refs'"
	 * @generated
	 */
	List<String> getTransformerRefs();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.SelectiveConsumerRouterType#getTransformerRefs <em>Transformer Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformer Refs</em>' attribute.
	 * @see #getTransformerRefs()
	 * @generated
	 */
	void setTransformerRefs(List<String> value);

	/**
	 * Returns the value of the '<em><b>Transform First</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform First</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform First</em>' attribute.
	 * @see #isSetTransformFirst()
	 * @see #unsetTransformFirst()
	 * @see #setTransformFirst(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getSelectiveConsumerRouterType_TransformFirst()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='transformFirst'"
	 * @generated
	 */
	boolean isTransformFirst();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.SelectiveConsumerRouterType#isTransformFirst <em>Transform First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform First</em>' attribute.
	 * @see #isSetTransformFirst()
	 * @see #unsetTransformFirst()
	 * @see #isTransformFirst()
	 * @generated
	 */
	void setTransformFirst(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.SelectiveConsumerRouterType#isTransformFirst <em>Transform First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTransformFirst()
	 * @see #isTransformFirst()
	 * @see #setTransformFirst(boolean)
	 * @generated
	 */
	void unsetTransformFirst();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.SelectiveConsumerRouterType#isTransformFirst <em>Transform First</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Transform First</em>' attribute is set.
	 * @see #unsetTransformFirst()
	 * @see #isTransformFirst()
	 * @see #setTransformFirst(boolean)
	 * @generated
	 */
	boolean isSetTransformFirst();

} // SelectiveConsumerRouterType
