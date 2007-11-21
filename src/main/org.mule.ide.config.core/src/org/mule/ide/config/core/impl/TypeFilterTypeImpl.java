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
import org.mule.ide.config.core.TypeFilterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Filter Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.TypeFilterTypeImpl#getExpectedType <em>Expected Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeFilterTypeImpl extends AbstractFilterTypeImpl implements TypeFilterType {
	/**
	 * The default value of the '{@link #getExpectedType() <em>Expected Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedType()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPECTED_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpectedType() <em>Expected Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpectedType()
	 * @generated
	 * @ordered
	 */
	protected String expectedType = EXPECTED_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeFilterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getTypeFilterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpectedType() {
		return expectedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpectedType(String newExpectedType) {
		String oldExpectedType = expectedType;
		expectedType = newExpectedType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TYPE_FILTER_TYPE__EXPECTED_TYPE, oldExpectedType, expectedType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.TYPE_FILTER_TYPE__EXPECTED_TYPE:
				return getExpectedType();
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
			case CorePackage.TYPE_FILTER_TYPE__EXPECTED_TYPE:
				setExpectedType((String)newValue);
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
			case CorePackage.TYPE_FILTER_TYPE__EXPECTED_TYPE:
				setExpectedType(EXPECTED_TYPE_EDEFAULT);
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
			case CorePackage.TYPE_FILTER_TYPE__EXPECTED_TYPE:
				return EXPECTED_TYPE_EDEFAULT == null ? expectedType != null : !EXPECTED_TYPE_EDEFAULT.equals(expectedType);
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
		result.append(" (expectedType: ");
		result.append(expectedType);
		result.append(')');
		return result.toString();
	}

} //TypeFilterTypeImpl
