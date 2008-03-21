/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.vm;

import java.math.BigInteger;

import org.mule.ide.config.core.ConnectorType;
import org.mule.ide.config.core.QueueProfileType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vm Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.vm.VmConnectorType#getQueueProfile <em>Queue Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.vm.VmConnectorType#isQueueEvents <em>Queue Events</em>}</li>
 *   <li>{@link org.mule.ide.config.vm.VmConnectorType#getQueueTimeout <em>Queue Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.vm.VMPackage#getVmConnectorType()
 * @model extendedMetaData="name='vmConnectorType' kind='elementOnly'"
 * @generated
 */
public interface VmConnectorType extends ConnectorType {
	/**
	 * Returns the value of the '<em><b>Queue Profile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Profile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Profile</em>' containment reference.
	 * @see #setQueueProfile(QueueProfileType)
	 * @see org.mule.ide.config.vm.VMPackage#getVmConnectorType_QueueProfile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='queueProfile' namespace='##targetNamespace'"
	 * @generated
	 */
	QueueProfileType getQueueProfile();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.vm.VmConnectorType#getQueueProfile <em>Queue Profile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Profile</em>' containment reference.
	 * @see #getQueueProfile()
	 * @generated
	 */
	void setQueueProfile(QueueProfileType value);

	/**
	 * Returns the value of the '<em><b>Queue Events</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Events</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Determines if queues should be set up for listeners on the connector.
	 *                             If this is false the connector simply forwards events to components via the Mule server.
	 *                             If it is set then the queues are configured using the queuing profile.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Queue Events</em>' attribute.
	 * @see #isSetQueueEvents()
	 * @see #unsetQueueEvents()
	 * @see #setQueueEvents(boolean)
	 * @see org.mule.ide.config.vm.VMPackage#getVmConnectorType_QueueEvents()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='queueEvents'"
	 * @generated
	 */
	boolean isQueueEvents();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.vm.VmConnectorType#isQueueEvents <em>Queue Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Events</em>' attribute.
	 * @see #isSetQueueEvents()
	 * @see #unsetQueueEvents()
	 * @see #isQueueEvents()
	 * @generated
	 */
	void setQueueEvents(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.vm.VmConnectorType#isQueueEvents <em>Queue Events</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetQueueEvents()
	 * @see #isQueueEvents()
	 * @see #setQueueEvents(boolean)
	 * @generated
	 */
	void unsetQueueEvents();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.vm.VmConnectorType#isQueueEvents <em>Queue Events</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Queue Events</em>' attribute is set.
	 * @see #unsetQueueEvents()
	 * @see #isQueueEvents()
	 * @see #setQueueEvents(boolean)
	 * @generated
	 */
	boolean isSetQueueEvents();

	/**
	 * Returns the value of the '<em><b>Queue Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Timeout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Timeout</em>' attribute.
	 * @see #setQueueTimeout(BigInteger)
	 * @see org.mule.ide.config.vm.VMPackage#getVmConnectorType_QueueTimeout()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.PositiveInteger"
	 *        extendedMetaData="kind='attribute' name='queueTimeout'"
	 * @generated
	 */
	BigInteger getQueueTimeout();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.vm.VmConnectorType#getQueueTimeout <em>Queue Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Timeout</em>' attribute.
	 * @see #getQueueTimeout()
	 * @generated
	 */
	void setQueueTimeout(BigInteger value);

} // VmConnectorType
