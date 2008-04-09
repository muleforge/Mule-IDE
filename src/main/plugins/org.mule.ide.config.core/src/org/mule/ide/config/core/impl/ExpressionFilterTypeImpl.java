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
import org.mule.ide.config.core.EvaluatorType1;
import org.mule.ide.config.core.ExpressionFilterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Filter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.ExpressionFilterTypeImpl#getCustomEvaluator <em>Custom Evaluator</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ExpressionFilterTypeImpl#getEvaluator <em>Evaluator</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ExpressionFilterTypeImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ExpressionFilterTypeImpl#isNullReturnsTrue <em>Null Returns True</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionFilterTypeImpl extends AbstractFilterTypeImpl implements ExpressionFilterType {
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
	protected static final EvaluatorType1 EVALUATOR_EDEFAULT = EvaluatorType1.HEADER;

	/**
	 * The cached value of the '{@link #getEvaluator() <em>Evaluator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluator()
	 * @generated
	 * @ordered
	 */
	protected EvaluatorType1 evaluator = EVALUATOR_EDEFAULT;

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
	 * The default value of the '{@link #isNullReturnsTrue() <em>Null Returns True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullReturnsTrue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NULL_RETURNS_TRUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNullReturnsTrue() <em>Null Returns True</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNullReturnsTrue()
	 * @generated
	 * @ordered
	 */
	protected boolean nullReturnsTrue = NULL_RETURNS_TRUE_EDEFAULT;

	/**
	 * This is true if the Null Returns True attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nullReturnsTrueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionFilterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getExpressionFilterType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXPRESSION_FILTER_TYPE__CUSTOM_EVALUATOR, oldCustomEvaluator, customEvaluator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvaluatorType1 getEvaluator() {
		return evaluator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluator(EvaluatorType1 newEvaluator) {
		EvaluatorType1 oldEvaluator = evaluator;
		evaluator = newEvaluator == null ? EVALUATOR_EDEFAULT : newEvaluator;
		boolean oldEvaluatorESet = evaluatorESet;
		evaluatorESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXPRESSION_FILTER_TYPE__EVALUATOR, oldEvaluator, evaluator, !oldEvaluatorESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEvaluator() {
		EvaluatorType1 oldEvaluator = evaluator;
		boolean oldEvaluatorESet = evaluatorESet;
		evaluator = EVALUATOR_EDEFAULT;
		evaluatorESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.EXPRESSION_FILTER_TYPE__EVALUATOR, oldEvaluator, EVALUATOR_EDEFAULT, oldEvaluatorESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXPRESSION_FILTER_TYPE__EXPRESSION, oldExpression, expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNullReturnsTrue() {
		return nullReturnsTrue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNullReturnsTrue(boolean newNullReturnsTrue) {
		boolean oldNullReturnsTrue = nullReturnsTrue;
		nullReturnsTrue = newNullReturnsTrue;
		boolean oldNullReturnsTrueESet = nullReturnsTrueESet;
		nullReturnsTrueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXPRESSION_FILTER_TYPE__NULL_RETURNS_TRUE, oldNullReturnsTrue, nullReturnsTrue, !oldNullReturnsTrueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNullReturnsTrue() {
		boolean oldNullReturnsTrue = nullReturnsTrue;
		boolean oldNullReturnsTrueESet = nullReturnsTrueESet;
		nullReturnsTrue = NULL_RETURNS_TRUE_EDEFAULT;
		nullReturnsTrueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.EXPRESSION_FILTER_TYPE__NULL_RETURNS_TRUE, oldNullReturnsTrue, NULL_RETURNS_TRUE_EDEFAULT, oldNullReturnsTrueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNullReturnsTrue() {
		return nullReturnsTrueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.EXPRESSION_FILTER_TYPE__CUSTOM_EVALUATOR:
				return getCustomEvaluator();
			case CorePackage.EXPRESSION_FILTER_TYPE__EVALUATOR:
				return getEvaluator();
			case CorePackage.EXPRESSION_FILTER_TYPE__EXPRESSION:
				return getExpression();
			case CorePackage.EXPRESSION_FILTER_TYPE__NULL_RETURNS_TRUE:
				return isNullReturnsTrue() ? Boolean.TRUE : Boolean.FALSE;
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
			case CorePackage.EXPRESSION_FILTER_TYPE__CUSTOM_EVALUATOR:
				setCustomEvaluator((String)newValue);
				return;
			case CorePackage.EXPRESSION_FILTER_TYPE__EVALUATOR:
				setEvaluator((EvaluatorType1)newValue);
				return;
			case CorePackage.EXPRESSION_FILTER_TYPE__EXPRESSION:
				setExpression((String)newValue);
				return;
			case CorePackage.EXPRESSION_FILTER_TYPE__NULL_RETURNS_TRUE:
				setNullReturnsTrue(((Boolean)newValue).booleanValue());
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
			case CorePackage.EXPRESSION_FILTER_TYPE__CUSTOM_EVALUATOR:
				setCustomEvaluator(CUSTOM_EVALUATOR_EDEFAULT);
				return;
			case CorePackage.EXPRESSION_FILTER_TYPE__EVALUATOR:
				unsetEvaluator();
				return;
			case CorePackage.EXPRESSION_FILTER_TYPE__EXPRESSION:
				setExpression(EXPRESSION_EDEFAULT);
				return;
			case CorePackage.EXPRESSION_FILTER_TYPE__NULL_RETURNS_TRUE:
				unsetNullReturnsTrue();
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
			case CorePackage.EXPRESSION_FILTER_TYPE__CUSTOM_EVALUATOR:
				return CUSTOM_EVALUATOR_EDEFAULT == null ? customEvaluator != null : !CUSTOM_EVALUATOR_EDEFAULT.equals(customEvaluator);
			case CorePackage.EXPRESSION_FILTER_TYPE__EVALUATOR:
				return isSetEvaluator();
			case CorePackage.EXPRESSION_FILTER_TYPE__EXPRESSION:
				return EXPRESSION_EDEFAULT == null ? expression != null : !EXPRESSION_EDEFAULT.equals(expression);
			case CorePackage.EXPRESSION_FILTER_TYPE__NULL_RETURNS_TRUE:
				return isSetNullReturnsTrue();
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
		result.append(", nullReturnsTrue: ");
		if (nullReturnsTrueESet) result.append(nullReturnsTrue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ExpressionFilterTypeImpl
