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

import org.mule.ide.config.core.impl.AbstractFilterTypeImpl;

import org.mule.ide.config.jms.JMSPackage;
import org.mule.ide.config.jms.PropertyFilterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Filter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.jms.impl.PropertyFilterTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.PropertyFilterTypeImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.PropertyFilterTypeImpl#getPropertyClass <em>Property Class</em>}</li>
 *   <li>{@link org.mule.ide.config.jms.impl.PropertyFilterTypeImpl#getPropertyName <em>Property Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyFilterTypeImpl extends AbstractFilterTypeImpl implements PropertyFilterType {
	/**
	 * The default value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected String expression = EXPRESSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyClass() <em>Property Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyClass()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyClass() <em>Property Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyClass()
	 * @generated
	 * @ordered
	 */
	protected String propertyClass = PROPERTY_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String propertyName = PROPERTY_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyFilterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JMSPackage.Literals.PROPERTY_FILTER_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression() {
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression(String newExpression) {
		String oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.PROPERTY_FILTER_TYPE__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.PROPERTY_FILTER_TYPE__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyClass() {
		return propertyClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyClass(String newPropertyClass) {
		String oldPropertyClass = propertyClass;
		propertyClass = newPropertyClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.PROPERTY_FILTER_TYPE__PROPERTY_CLASS, oldPropertyClass, propertyClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyName(String newPropertyName) {
		String oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JMSPackage.PROPERTY_FILTER_TYPE__PROPERTY_NAME, oldPropertyName, propertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JMSPackage.PROPERTY_FILTER_TYPE__EXPRESSION:
				return getExpression();
			case JMSPackage.PROPERTY_FILTER_TYPE__PATTERN:
				return getPattern();
			case JMSPackage.PROPERTY_FILTER_TYPE__PROPERTY_CLASS:
				return getPropertyClass();
			case JMSPackage.PROPERTY_FILTER_TYPE__PROPERTY_NAME:
				return getPropertyName();
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
			case JMSPackage.PROPERTY_FILTER_TYPE__EXPRESSION:
				setExpression((String)newValue);
				return;
			case JMSPackage.PROPERTY_FILTER_TYPE__PATTERN:
				setPattern((String)newValue);
				return;
			case JMSPackage.PROPERTY_FILTER_TYPE__PROPERTY_CLASS:
				setPropertyClass((String)newValue);
				return;
			case JMSPackage.PROPERTY_FILTER_TYPE__PROPERTY_NAME:
				setPropertyName((String)newValue);
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
			case JMSPackage.PROPERTY_FILTER_TYPE__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case JMSPackage.PROPERTY_FILTER_TYPE__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case JMSPackage.PROPERTY_FILTER_TYPE__PROPERTY_CLASS:
				setPropertyClass(PROPERTY_CLASS_EDEFAULT);
				return;
			case JMSPackage.PROPERTY_FILTER_TYPE__PROPERTY_NAME:
				setPropertyName(PROPERTY_NAME_EDEFAULT);
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
			case JMSPackage.PROPERTY_FILTER_TYPE__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case JMSPackage.PROPERTY_FILTER_TYPE__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case JMSPackage.PROPERTY_FILTER_TYPE__PROPERTY_CLASS:
				return PROPERTY_CLASS_EDEFAULT == null ? propertyClass != null : !PROPERTY_CLASS_EDEFAULT.equals(propertyClass);
			case JMSPackage.PROPERTY_FILTER_TYPE__PROPERTY_NAME:
				return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
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
		result.append(" (expression: ");
		result.append(expression);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", propertyClass: ");
		result.append(propertyClass);
		result.append(", propertyName: ");
		result.append(propertyName);
		result.append(')');
		return result.toString();
	}

} //PropertyFilterTypeImpl
