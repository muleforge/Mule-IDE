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
 * A representation of the model object '<em><b>Pooled Object Factory Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.PooledObjectFactoryType#getAbstractPoolingProfileGroup <em>Abstract Pooling Profile Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.PooledObjectFactoryType#getAbstractPoolingProfile <em>Abstract Pooling Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.PooledObjectFactoryType#getClass_ <em>Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getPooledObjectFactoryType()
 * @model extendedMetaData="name='pooledObjectFactoryType' kind='elementOnly'"
 * @generated
 */
public interface PooledObjectFactoryType extends AbstractObjectFactoryType {
	/**
	 * Returns the value of the '<em><b>Abstract Pooling Profile Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pooling profile to use if scope="pooled"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Pooling Profile Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getPooledObjectFactoryType_AbstractPoolingProfileGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-pooling-profile:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractPoolingProfileGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Pooling Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pooling profile to use if scope="pooled"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Pooling Profile</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getPooledObjectFactoryType_AbstractPoolingProfile()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-pooling-profile' namespace='##targetNamespace' group='abstract-pooling-profile:group'"
	 * @generated
	 */
	AbstractPoolingProfileType getAbstractPoolingProfile();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Class name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(String)
	 * @see org.mule.ide.config.core.CorePackage#getPooledObjectFactoryType_Class()
	 * @model dataType="org.mule.ide.config.core.SubstitutableClass"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	String getClass_();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.PooledObjectFactoryType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(String value);

} // PooledObjectFactoryType
