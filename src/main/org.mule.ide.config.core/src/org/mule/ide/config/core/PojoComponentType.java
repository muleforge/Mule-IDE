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
 * A representation of the model object '<em><b>Pojo Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Pojo component that will be invoked by mule.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.PojoComponentType#getAbstractObjectFactoryGroup <em>Abstract Object Factory Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.PojoComponentType#getAbstractObjectFactory <em>Abstract Object Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.PojoComponentType#getBinding <em>Binding</em>}</li>
 *   <li>{@link org.mule.ide.config.core.PojoComponentType#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getPojoComponentType()
 * @model extendedMetaData="name='pojoComponentType' kind='elementOnly'"
 * @generated
 */
public interface PojoComponentType extends AbstractComponentType {
	/**
	 * Returns the value of the '<em><b>Abstract Object Factory Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Object Factory Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Object Factory Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getPojoComponentType_AbstractObjectFactoryGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-object-factory:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractObjectFactoryGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Object Factory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Object Factory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Object Factory</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getPojoComponentType_AbstractObjectFactory()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-object-factory' namespace='##targetNamespace' group='abstract-object-factory:group'"
	 * @generated
	 */
	AbstractObjectFactoryType getAbstractObjectFactory();

	/**
	 * Returns the value of the '<em><b>Binding</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.PojoBindingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binding</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binding</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getPojoComponentType_Binding()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='binding' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PojoBindingType> getBinding();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.mule.ide.config.core.CorePackage#getPojoComponentType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.PojoComponentType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

} // PojoComponentType
