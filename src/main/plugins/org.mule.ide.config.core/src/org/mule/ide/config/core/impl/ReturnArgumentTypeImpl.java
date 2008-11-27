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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.EvaluatorType;
import org.mule.ide.config.core.ReturnArgumentType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Argument Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.ReturnArgumentTypeImpl#getCustomEvaluator <em>Custom Evaluator</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ReturnArgumentTypeImpl#getEvaluator <em>Evaluator</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ReturnArgumentTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ReturnArgumentTypeImpl#isOptional <em>Optional</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReturnArgumentTypeImpl extends EObjectImpl implements ReturnArgumentType {
	/**
	 * The default value of the '{@link #getCustomEvaluator() <em>Custom Evaluator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomEvaluator()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOM_EVALUATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomEvaluator() <em>Custom Evaluator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomEvaluator()
	 * @generated
	 * @ordered
	 */
	protected String customEvaluator = CUSTOM_EVALUATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvaluator() <em>Evaluator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluator()
	 * @generated
	 * @ordered
	 */
	protected static final EvaluatorType EVALUATOR_EDEFAULT = EvaluatorType.GROOVY;

	/**
	 * The cached value of the '{@link #getEvaluator() <em>Evaluator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluator()
	 * @generated
	 * @ordered
	 */
	protected EvaluatorType evaluator = EVALUATOR_EDEFAULT;

	/**
	 * This is true if the Evaluator attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean evaluatorESet;

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
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * This is true if the Optional attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean optionalESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnArgumentTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getReturnArgumentType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomEvaluator() {
		return customEvaluator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomEvaluator(String newCustomEvaluator) {
		String oldCustomEvaluator = customEvaluator;
		customEvaluator = newCustomEvaluator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RETURN_ARGUMENT_TYPE__CUSTOM_EVALUATOR, oldCustomEvaluator, customEvaluator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluatorType getEvaluator() {
		return evaluator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluator(EvaluatorType newEvaluator) {
		EvaluatorType oldEvaluator = evaluator;
		evaluator = newEvaluator == null ? EVALUATOR_EDEFAULT : newEvaluator;
		boolean oldEvaluatorESet = evaluatorESet;
		evaluatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RETURN_ARGUMENT_TYPE__EVALUATOR, oldEvaluator, evaluator, !oldEvaluatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEvaluator() {
		EvaluatorType oldEvaluator = evaluator;
		boolean oldEvaluatorESet = evaluatorESet;
		evaluator = EVALUATOR_EDEFAULT;
		evaluatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.RETURN_ARGUMENT_TYPE__EVALUATOR, oldEvaluator, EVALUATOR_EDEFAULT, oldEvaluatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEvaluator() {
		return evaluatorESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RETURN_ARGUMENT_TYPE__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		boolean oldOptionalESet = optionalESet;
		optionalESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.RETURN_ARGUMENT_TYPE__OPTIONAL, oldOptional, optional, !oldOptionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOptional() {
		boolean oldOptional = optional;
		boolean oldOptionalESet = optionalESet;
		optional = OPTIONAL_EDEFAULT;
		optionalESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.RETURN_ARGUMENT_TYPE__OPTIONAL, oldOptional, OPTIONAL_EDEFAULT, oldOptionalESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOptional() {
		return optionalESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.RETURN_ARGUMENT_TYPE__CUSTOM_EVALUATOR:
				return getCustomEvaluator();
			case CorePackage.RETURN_ARGUMENT_TYPE__EVALUATOR:
				return getEvaluator();
			case CorePackage.RETURN_ARGUMENT_TYPE__EXPRESSION:
				return getExpression();
			case CorePackage.RETURN_ARGUMENT_TYPE__OPTIONAL:
				return isOptional() ? Boolean.TRUE : Boolean.FALSE;
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
			case CorePackage.RETURN_ARGUMENT_TYPE__CUSTOM_EVALUATOR:
				setCustomEvaluator((String)newValue);
				return;
			case CorePackage.RETURN_ARGUMENT_TYPE__EVALUATOR:
				setEvaluator((EvaluatorType)newValue);
				return;
			case CorePackage.RETURN_ARGUMENT_TYPE__EXPRESSION:
				setExpression((String)newValue);
				return;
			case CorePackage.RETURN_ARGUMENT_TYPE__OPTIONAL:
				setOptional(((Boolean)newValue).booleanValue());
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
			case CorePackage.RETURN_ARGUMENT_TYPE__CUSTOM_EVALUATOR:
				setCustomEvaluator(CUSTOM_EVALUATOR_EDEFAULT);
				return;
			case CorePackage.RETURN_ARGUMENT_TYPE__EVALUATOR:
				unsetEvaluator();
				return;
			case CorePackage.RETURN_ARGUMENT_TYPE__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case CorePackage.RETURN_ARGUMENT_TYPE__OPTIONAL:
				unsetOptional();
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
			case CorePackage.RETURN_ARGUMENT_TYPE__CUSTOM_EVALUATOR:
				return CUSTOM_EVALUATOR_EDEFAULT == null ? customEvaluator != null : !CUSTOM_EVALUATOR_EDEFAULT.equals(customEvaluator);
			case CorePackage.RETURN_ARGUMENT_TYPE__EVALUATOR:
				return isSetEvaluator();
			case CorePackage.RETURN_ARGUMENT_TYPE__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case CorePackage.RETURN_ARGUMENT_TYPE__OPTIONAL:
				return isSetOptional();
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
		result.append(" (customEvaluator: ");
		result.append(customEvaluator);
		result.append(", evaluator: ");
		if (evaluatorESet) result.append(evaluator); else result.append("<unset>");
		result.append(", expression: ");
		result.append(expression);
		result.append(", optional: ");
		if (optionalESet) result.append(optional); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ReturnArgumentTypeImpl
