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
import org.mule.ide.config.core.ExpressionMessageInfoMappingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Message Info Mapping Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.ExpressionMessageInfoMappingTypeImpl#getCorrelationIdExpression <em>Correlation Id Expression</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ExpressionMessageInfoMappingTypeImpl#getMessageIdExpression <em>Message Id Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionMessageInfoMappingTypeImpl extends AbstractMessageInfoMappingTypeImpl implements ExpressionMessageInfoMappingType {
	/**
	 * The default value of the '{@link #getCorrelationIdExpression() <em>Correlation Id Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationIdExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String CORRELATION_ID_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCorrelationIdExpression() <em>Correlation Id Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationIdExpression()
	 * @generated
	 * @ordered
	 */
	protected String correlationIdExpression = CORRELATION_ID_EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMessageIdExpression() <em>Message Id Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageIdExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_ID_EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessageIdExpression() <em>Message Id Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageIdExpression()
	 * @generated
	 * @ordered
	 */
	protected String messageIdExpression = MESSAGE_ID_EXPRESSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionMessageInfoMappingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getExpressionMessageInfoMappingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCorrelationIdExpression() {
		return correlationIdExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCorrelationIdExpression(String newCorrelationIdExpression) {
		String oldCorrelationIdExpression = correlationIdExpression;
		correlationIdExpression = newCorrelationIdExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXPRESSION_MESSAGE_INFO_MAPPING_TYPE__CORRELATION_ID_EXPRESSION, oldCorrelationIdExpression, correlationIdExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessageIdExpression() {
		return messageIdExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageIdExpression(String newMessageIdExpression) {
		String oldMessageIdExpression = messageIdExpression;
		messageIdExpression = newMessageIdExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXPRESSION_MESSAGE_INFO_MAPPING_TYPE__MESSAGE_ID_EXPRESSION, oldMessageIdExpression, messageIdExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.EXPRESSION_MESSAGE_INFO_MAPPING_TYPE__CORRELATION_ID_EXPRESSION:
				return getCorrelationIdExpression();
			case CorePackage.EXPRESSION_MESSAGE_INFO_MAPPING_TYPE__MESSAGE_ID_EXPRESSION:
				return getMessageIdExpression();
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
			case CorePackage.EXPRESSION_MESSAGE_INFO_MAPPING_TYPE__CORRELATION_ID_EXPRESSION:
				setCorrelationIdExpression((String)newValue);
				return;
			case CorePackage.EXPRESSION_MESSAGE_INFO_MAPPING_TYPE__MESSAGE_ID_EXPRESSION:
				setMessageIdExpression((String)newValue);
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
			case CorePackage.EXPRESSION_MESSAGE_INFO_MAPPING_TYPE__CORRELATION_ID_EXPRESSION:
				setCorrelationIdExpression(CORRELATION_ID_EXPRESSION_EDEFAULT);
				return;
			case CorePackage.EXPRESSION_MESSAGE_INFO_MAPPING_TYPE__MESSAGE_ID_EXPRESSION:
				setMessageIdExpression(MESSAGE_ID_EXPRESSION_EDEFAULT);
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
			case CorePackage.EXPRESSION_MESSAGE_INFO_MAPPING_TYPE__CORRELATION_ID_EXPRESSION:
				return CORRELATION_ID_EXPRESSION_EDEFAULT == null ? correlationIdExpression != null : !CORRELATION_ID_EXPRESSION_EDEFAULT.equals(correlationIdExpression);
			case CorePackage.EXPRESSION_MESSAGE_INFO_MAPPING_TYPE__MESSAGE_ID_EXPRESSION:
				return MESSAGE_ID_EXPRESSION_EDEFAULT == null ? messageIdExpression != null : !MESSAGE_ID_EXPRESSION_EDEFAULT.equals(messageIdExpression);
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
		result.append(" (correlationIdExpression: ");
		result.append(correlationIdExpression);
		result.append(", messageIdExpression: ");
		result.append(messageIdExpression);
		result.append(')');
		return result.toString();
	}

} //ExpressionMessageInfoMappingTypeImpl
