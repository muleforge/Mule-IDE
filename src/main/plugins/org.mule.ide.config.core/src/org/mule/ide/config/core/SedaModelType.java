/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.edit.domain.EditingDomain;

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
 *   <li>{@link org.mule.ide.config.core.SedaModelType#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getSedaModelType()
 * @model extendedMetaData="name='sedaModelType' kind='elementOnly'"
 * @generated
 */
public interface SedaModelType extends AbstractModelType {

	/**
	 * Initializes the Connections data model.
	 * Connection information is not serialized, therefore this
	 * method must be called to initialize the model and start change
	 * listening.
	 */
	public void initializeConnections(EditingDomain editingDomain);

	/**
	 * Returns the value of the '<em><b>Abstract Queue Profile Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Queue Profile Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for queue profile elements.
	 *                 A queue profile controls how messages are queued before being processed.
	 *             
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for queue profile elements.
	 *                 A queue profile controls how messages are queued before being processed.
	 *             
	 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * 
	 *                             If true then this model element is an extension of a previous model
	 *                             element with the same name.
	 *                         
	 * <!-- end-model-doc -->
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

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link org.mule.ide.config.core.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see org.mule.ide.config.core.CorePackage#getSedaModelType_Connections()
	 * @model containment="true" transient="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // SedaModelType
