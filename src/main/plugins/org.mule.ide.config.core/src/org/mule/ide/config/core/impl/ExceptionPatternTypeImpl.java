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
import org.mule.ide.config.core.ExceptionPatternType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exception Pattern Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.ExceptionPatternTypeImpl#getExceptionPattern <em>Exception Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExceptionPatternTypeImpl extends EObjectImpl implements ExceptionPatternType {
	/**
	 * The default value of the '{@link #getExceptionPattern() <em>Exception Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPTION_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptionPattern() <em>Exception Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionPattern()
	 * @generated
	 * @ordered
	 */
	protected String exceptionPattern = EXCEPTION_PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExceptionPatternTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getExceptionPatternType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExceptionPattern() {
		return exceptionPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionPattern(String newExceptionPattern) {
		String oldExceptionPattern = exceptionPattern;
		exceptionPattern = newExceptionPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.EXCEPTION_PATTERN_TYPE__EXCEPTION_PATTERN, oldExceptionPattern, exceptionPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.EXCEPTION_PATTERN_TYPE__EXCEPTION_PATTERN:
				return getExceptionPattern();
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
			case CorePackage.EXCEPTION_PATTERN_TYPE__EXCEPTION_PATTERN:
				setExceptionPattern((String)newValue);
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
			case CorePackage.EXCEPTION_PATTERN_TYPE__EXCEPTION_PATTERN:
				setExceptionPattern(EXCEPTION_PATTERN_EDEFAULT);
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
			case CorePackage.EXCEPTION_PATTERN_TYPE__EXCEPTION_PATTERN:
				return EXCEPTION_PATTERN_EDEFAULT == null ? exceptionPattern != null : !EXCEPTION_PATTERN_EDEFAULT.equals(exceptionPattern);
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
		result.append(" (exceptionPattern: ");
		result.append(exceptionPattern);
		result.append(')');
		return result.toString();
	}

} //ExceptionPatternTypeImpl
