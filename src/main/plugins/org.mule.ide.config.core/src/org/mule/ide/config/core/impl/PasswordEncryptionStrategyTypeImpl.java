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
import org.mule.ide.config.core.PasswordEncryptionStrategyType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Password Encryption Strategy Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.PasswordEncryptionStrategyTypeImpl#getIterationCount <em>Iteration Count</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.PasswordEncryptionStrategyTypeImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.PasswordEncryptionStrategyTypeImpl#getSalt <em>Salt</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PasswordEncryptionStrategyTypeImpl extends EncryptionStrategyTypeImpl implements PasswordEncryptionStrategyType {
	/**
	 * The default value of the '{@link #getIterationCount() <em>Iteration Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterationCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ITERATION_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIterationCount() <em>Iteration Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIterationCount()
	 * @generated
	 * @ordered
	 */
	protected int iterationCount = ITERATION_COUNT_EDEFAULT;

	/**
	 * This is true if the Iteration Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iterationCountESet;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSalt() <em>Salt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalt()
	 * @generated
	 * @ordered
	 */
	protected static final String SALT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSalt() <em>Salt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalt()
	 * @generated
	 * @ordered
	 */
	protected String salt = SALT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PasswordEncryptionStrategyTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getPasswordEncryptionStrategyType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIterationCount() {
		return iterationCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIterationCount(int newIterationCount) {
		int oldIterationCount = iterationCount;
		iterationCount = newIterationCount;
		boolean oldIterationCountESet = iterationCountESet;
		iterationCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE__ITERATION_COUNT, oldIterationCount, iterationCount, !oldIterationCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIterationCount() {
		int oldIterationCount = iterationCount;
		boolean oldIterationCountESet = iterationCountESet;
		iterationCount = ITERATION_COUNT_EDEFAULT;
		iterationCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE__ITERATION_COUNT, oldIterationCount, ITERATION_COUNT_EDEFAULT, oldIterationCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIterationCount() {
		return iterationCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSalt() {
		return salt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalt(String newSalt) {
		String oldSalt = salt;
		salt = newSalt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE__SALT, oldSalt, salt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE__ITERATION_COUNT:
				return new Integer(getIterationCount());
			case CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE__PASSWORD:
				return getPassword();
			case CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE__SALT:
				return getSalt();
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
			case CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE__ITERATION_COUNT:
				setIterationCount(((Integer)newValue).intValue());
				return;
			case CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE__PASSWORD:
				setPassword((String)newValue);
				return;
			case CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE__SALT:
				setSalt((String)newValue);
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
			case CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE__ITERATION_COUNT:
				unsetIterationCount();
				return;
			case CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE__SALT:
				setSalt(SALT_EDEFAULT);
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
			case CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE__ITERATION_COUNT:
				return isSetIterationCount();
			case CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case CorePackage.PASSWORD_ENCRYPTION_STRATEGY_TYPE__SALT:
				return SALT_EDEFAULT == null ? salt != null : !SALT_EDEFAULT.equals(salt);
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
		result.append(" (iterationCount: ");
		if (iterationCountESet) result.append(iterationCount); else result.append("<unset>");
		result.append(", password: ");
		result.append(password);
		result.append(", salt: ");
		result.append(salt);
		result.append(')');
		return result.toString();
	}

} //PasswordEncryptionStrategyTypeImpl
