/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.jms.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mule.ide.config.jms.ActiveMqConnectorType;
import org.mule.ide.config.jms.JMSPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Active Mq Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.jms.impl.ActiveMqConnectorTypeImpl#getBrokerURL <em>Broker URL</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActiveMqConnectorTypeImpl extends VendorJmsConnectorTypeImpl implements ActiveMqConnectorType {
	/**
	 * The default value of the '{@link #getBrokerURL() <em>Broker URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokerURL()
	 * @generated
	 * @ordered
	 */
	protected static final String BROKER_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBrokerURL() <em>Broker URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBrokerURL()
	 * @generated
	 * @ordered
	 */
	protected String brokerURL = BROKER_URL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActiveMqConnectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JMSPackage.Literals.ACTIVE_MQ_CONNECTOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBrokerURL() {
		return brokerURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBrokerURL(String newBrokerURL) {
		String oldBrokerURL = brokerURL;
		brokerURL = newBrokerURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.ACTIVE_MQ_CONNECTOR_TYPE__BROKER_URL, oldBrokerURL, brokerURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JMSPackage.ACTIVE_MQ_CONNECTOR_TYPE__BROKER_URL:
				return getBrokerURL();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JMSPackage.ACTIVE_MQ_CONNECTOR_TYPE__BROKER_URL:
				setBrokerURL((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JMSPackage.ACTIVE_MQ_CONNECTOR_TYPE__BROKER_URL:
				setBrokerURL(BROKER_URL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JMSPackage.ACTIVE_MQ_CONNECTOR_TYPE__BROKER_URL:
				return BROKER_URL_EDEFAULT == null ? brokerURL != null : !BROKER_URL_EDEFAULT.equals(brokerURL);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (brokerURL: ");
		result.append(brokerURL);
		result.append(')');
		return result.toString();
	}

} //ActiveMqConnectorTypeImpl
