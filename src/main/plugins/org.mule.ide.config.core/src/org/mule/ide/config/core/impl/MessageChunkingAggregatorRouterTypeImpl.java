/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.MessageChunkingAggregatorRouterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Chunking Aggregator Router Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.MessageChunkingAggregatorRouterTypeImpl#getCorrelationExpression <em>Correlation Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageChunkingAggregatorRouterTypeImpl extends FilteredInboundRouterTypeImpl implements MessageChunkingAggregatorRouterType {
	/**
	 * The default value of the '{@link #getCorrelationExpression() <em>Correlation Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String CORRELATION_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorrelationExpression() <em>Correlation Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationExpression()
	 * @generated
	 * @ordered
	 */
	protected String correlationExpression = CORRELATION_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageChunkingAggregatorRouterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getMessageChunkingAggregatorRouterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorrelationExpression() {
		return correlationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationExpression(String newCorrelationExpression) {
		String oldCorrelationExpression = correlationExpression;
		correlationExpression = newCorrelationExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MESSAGE_CHUNKING_AGGREGATOR_ROUTER_TYPE__CORRELATION_EXPRESSION, oldCorrelationExpression, correlationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.MESSAGE_CHUNKING_AGGREGATOR_ROUTER_TYPE__CORRELATION_EXPRESSION:
				return getCorrelationExpression();
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
			case CorePackage.MESSAGE_CHUNKING_AGGREGATOR_ROUTER_TYPE__CORRELATION_EXPRESSION:
				setCorrelationExpression((String)newValue);
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
			case CorePackage.MESSAGE_CHUNKING_AGGREGATOR_ROUTER_TYPE__CORRELATION_EXPRESSION:
				setCorrelationExpression(CORRELATION_EXPRESSION_EDEFAULT);
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
			case CorePackage.MESSAGE_CHUNKING_AGGREGATOR_ROUTER_TYPE__CORRELATION_EXPRESSION:
				return CORRELATION_EXPRESSION_EDEFAULT == null ? correlationExpression != null : !CORRELATION_EXPRESSION_EDEFAULT.equals(correlationExpression);
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
		result.append(" (correlationExpression: ");
		result.append(correlationExpression);
		result.append(')');
		return result.toString();
	}

} //MessageChunkingAggregatorRouterTypeImpl
