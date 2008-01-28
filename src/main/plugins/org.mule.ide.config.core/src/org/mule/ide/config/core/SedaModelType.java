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
 * A representation of the model object '<em><b>Seda Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.SedaModelType#getAbstractQueueProfileGroup <em>Abstract Queue Profile Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.SedaModelType#getAbstractQueueProfile <em>Abstract Queue Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.SedaModelType#isInherit <em>Inherit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getSedaModelType()
 * @model extendedMetaData="name='sedaModelType' kind='elementOnly'"
 * @generated
 */
public interface SedaModelType extends AbstractModelType {
	/**
	 * Returns the value of the '<em><b>Abstract Queue Profile Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Queue Profile Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Queue Profile Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getSedaModelType_AbstractQueueProfileGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-queue-profile:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractQueueProfileGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Queue Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Queue Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract Queue Profile</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getSedaModelType_AbstractQueueProfile()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-queue-profile' namespace='##targetNamespace' group='abstract-queue-profile:group'"
	 * @generated
	 */
	AbstractQueueProfileType getAbstractQueueProfile();

	/**
	 * Returns the value of the '<em><b>Inherit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inherit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inherit</em>' attribute.
	 * @see #isSetInherit()
	 * @see #unsetInherit()
	 * @see #setInherit(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getSedaModelType_Inherit()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='inherit'"
	 * @generated
	 */
	boolean isInherit();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.SedaModelType#isInherit <em>Inherit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inherit</em>' attribute.
	 * @see #isSetInherit()
	 * @see #unsetInherit()
	 * @see #isInherit()
	 * @generated
	 */
	void setInherit(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.SedaModelType#isInherit <em>Inherit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInherit()
	 * @see #isInherit()
	 * @see #setInherit(boolean)
	 * @generated
	 */
	void unsetInherit();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.SedaModelType#isInherit <em>Inherit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Inherit</em>' attribute is set.
	 * @see #unsetInherit()
	 * @see #isInherit()
	 * @see #setInherit(boolean)
	 * @generated
	 */
	boolean isSetInherit();

} // SedaModelType
