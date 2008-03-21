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
 * A representation of the model object '<em><b>Pooled Java Component Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.PooledJavaComponentType#getAbstractPoolingProfileGroup <em>Abstract Pooling Profile Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.PooledJavaComponentType#getAbstractPoolingProfile <em>Abstract Pooling Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getPooledJavaComponentType()
 * @model extendedMetaData="name='pooledJavaComponentType' kind='elementOnly'"
 * @generated
 */
public interface PooledJavaComponentType extends DefaultJavaComponentType {
	/**
	 * Returns the value of the '<em><b>Abstract Pooling Profile Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Characteristics of the object pool
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Pooling Profile Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getPooledJavaComponentType_AbstractPoolingProfileGroup()
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
	 * Characteristics of the object pool
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Pooling Profile</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getPooledJavaComponentType_AbstractPoolingProfile()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-pooling-profile' namespace='##targetNamespace' group='abstract-pooling-profile:group'"
	 * @generated
	 */
	AbstractPoolingProfileType getAbstractPoolingProfile();

} // PooledJavaComponentType
