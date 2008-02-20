/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.jms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active Mq Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.jms.ActiveMqConnectorType#getBrokerURL <em>Broker URL</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.jms.JMSPackage#getActiveMqConnectorType()
 * @model extendedMetaData="name='activeMqConnectorType' kind='elementOnly'"
 * @generated
 */
public interface ActiveMqConnectorType extends VendorJmsConnectorType {
	/**
	 * Returns the value of the '<em><b>Broker URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Broker URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Broker URL</em>' attribute.
	 * @see #setBrokerURL(String)
	 * @see org.mule.ide.config.jms.JMSPackage#getActiveMqConnectorType_BrokerURL()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='brokerURL'"
	 * @generated
	 */
	String getBrokerURL();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.jms.ActiveMqConnectorType#getBrokerURL <em>Broker URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Broker URL</em>' attribute.
	 * @see #getBrokerURL()
	 * @generated
	 */
	void setBrokerURL(String value);

} // ActiveMqConnectorType
