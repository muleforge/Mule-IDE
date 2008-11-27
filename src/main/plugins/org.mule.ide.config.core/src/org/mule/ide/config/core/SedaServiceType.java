/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import java.math.BigInteger;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Seda Service Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.SedaServiceType#getAbstractComponentThreadingProfileGroup <em>Abstract Component Threading Profile Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.SedaServiceType#getAbstractComponentThreadingProfile <em>Abstract Component Threading Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.SedaServiceType#getAbstractQueueProfileGroup <em>Abstract Queue Profile Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.SedaServiceType#getAbstractQueueProfile <em>Abstract Queue Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.SedaServiceType#getQueueTimeout <em>Queue Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getSedaServiceType()
 * @model extendedMetaData="name='sedaServiceType' kind='elementOnly'"
 * @generated
 */
public interface SedaServiceType extends BaseServiceType {
	/**
	 * Returns the value of the '<em><b>Abstract Component Threading Profile Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Component Threading Profile Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for component threading profile element.
	 *                 Threading profils define how thread pools interact with the component.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Component Threading Profile Group</em>' attribute list.
	 * @see org.mule.ide.config.core.CorePackage#getSedaServiceType_AbstractComponentThreadingProfileGroup()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='group' name='abstract-component-threading-profile:group' namespace='##targetNamespace'"
	 * @generated
	 */
	FeatureMap getAbstractComponentThreadingProfileGroup();

	/**
	 * Returns the value of the '<em><b>Abstract Component Threading Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract Component Threading Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                 A placeholder for component threading profile element.
	 *                 Threading profils define how thread pools interact with the component.
	 *             
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstract Component Threading Profile</em>' containment reference.
	 * @see org.mule.ide.config.core.CorePackage#getSedaServiceType_AbstractComponentThreadingProfile()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-component-threading-profile' namespace='##targetNamespace' group='abstract-component-threading-profile:group'"
	 * @generated
	 */
	AbstractComponentThreadingProfileType getAbstractComponentThreadingProfile();

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
	 * @see org.mule.ide.config.core.CorePackage#getSedaServiceType_AbstractQueueProfileGroup()
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
	 * @see org.mule.ide.config.core.CorePackage#getSedaServiceType_AbstractQueueProfile()
	 * @model containment="true" transient="true" changeable="false" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abstract-queue-profile' namespace='##targetNamespace' group='abstract-queue-profile:group'"
	 * @generated
	 */
	AbstractQueueProfileType getAbstractQueueProfile();

	/**
	 * Returns the value of the '<em><b>Queue Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             The timeout used when taking messages from the SEDA queue.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queue Timeout</em>' attribute.
	 * @see #isSetQueueTimeout()
	 * @see #unsetQueueTimeout()
	 * @see #setQueueTimeout(int)
	 * @see org.mule.ide.config.core.CorePackage#getSedaServiceType_QueueTimeout()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableInt"
	 *        extendedMetaData="kind='attribute' name='queueTimeout'"
	 * @generated
	 */
	int getQueueTimeout();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.SedaServiceType#getQueueTimeout <em>Queue Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Timeout</em>' attribute.
	 * @see #isSetQueueTimeout()
	 * @see #unsetQueueTimeout()
	 * @see #getQueueTimeout()
	 * @generated
	 */
	void setQueueTimeout(int value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.SedaServiceType#getQueueTimeout <em>Queue Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQueueTimeout()
	 * @see #getQueueTimeout()
	 * @see #setQueueTimeout(int)
	 * @generated
	 */
	void unsetQueueTimeout();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.SedaServiceType#getQueueTimeout <em>Queue Timeout</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Queue Timeout</em>' attribute is set.
	 * @see #unsetQueueTimeout()
	 * @see #getQueueTimeout()
	 * @see #setQueueTimeout(int)
	 * @generated
	 */
	boolean isSetQueueTimeout();

} // SedaServiceType
