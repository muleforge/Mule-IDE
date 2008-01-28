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
 * A representation of the model object '<em><b>Idempotent Receiver Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.IdempotentReceiverType#getAbstractStorageGroup <em>Abstract Storage Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.IdempotentReceiverType#getAbstractStorage <em>Abstract Storage</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getIdempotentReceiverType()
 * @model extendedMetaData="name='idempotentReceiverType' kind='elementOnly'"
 * @generated
 */
public interface IdempotentReceiverType extends FilteredInboundRouterType {
	/**
	 * Returns the value of the '<em><b>Abstract Storage Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Storage Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Storage Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getIdempotentReceiverType_AbstractStorageGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-storage:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractStorageGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Storage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Storage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Storage</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getIdempotentReceiverType_AbstractStorage()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-storage' namespace='##targetNamespace' group='abstract-storage:group'"
	 * @generated
	 */
	AbstractStorageType getAbstractStorage();

} // IdempotentReceiverType
