/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.CustomEncryptionStrategyType;
import org.mule.ide.config.core.CustomSecurityProviderType;
import org.mule.ide.config.core.PasswordEncryptionStrategyType;
import org.mule.ide.config.core.SecretKeyEncryptionStrategyType;
import org.mule.ide.config.core.SecurityManagerType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Manager Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.SecurityManagerTypeImpl#getCustomSecurityProvider <em>Custom Security Provider</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.SecurityManagerTypeImpl#getCustomEncryptionStrategy <em>Custom Encryption Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.SecurityManagerTypeImpl#getSecretKeyEncryptionStrategy <em>Secret Key Encryption Strategy</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.SecurityManagerTypeImpl#getPasswordEncryptionStrategy <em>Password Encryption Strategy</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SecurityManagerTypeImpl extends AbstractSecurityManagerTypeImpl implements SecurityManagerType {
	/**
	 * The cached value of the '{@link #getCustomSecurityProvider() <em>Custom Security Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomSecurityProvider()
	 * @generated
	 * @ordered
	 */
	protected CustomSecurityProviderType customSecurityProvider;

	/**
	 * The cached value of the '{@link #getCustomEncryptionStrategy() <em>Custom Encryption Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomEncryptionStrategy()
	 * @generated
	 * @ordered
	 */
	protected CustomEncryptionStrategyType customEncryptionStrategy;

	/**
	 * The cached value of the '{@link #getSecretKeyEncryptionStrategy() <em>Secret Key Encryption Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecretKeyEncryptionStrategy()
	 * @generated
	 * @ordered
	 */
	protected SecretKeyEncryptionStrategyType secretKeyEncryptionStrategy;

	/**
	 * The cached value of the '{@link #getPasswordEncryptionStrategy() <em>Password Encryption Strategy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPasswordEncryptionStrategy()
	 * @generated
	 * @ordered
	 */
	protected PasswordEncryptionStrategyType passwordEncryptionStrategy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityManagerTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getSecurityManagerType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomSecurityProviderType getCustomSecurityProvider() {
		return customSecurityProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomSecurityProvider(CustomSecurityProviderType newCustomSecurityProvider, NotificationChain msgs) {
		CustomSecurityProviderType oldCustomSecurityProvider = customSecurityProvider;
		customSecurityProvider = newCustomSecurityProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_MANAGER_TYPE__CUSTOM_SECURITY_PROVIDER, oldCustomSecurityProvider, newCustomSecurityProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomSecurityProvider(CustomSecurityProviderType newCustomSecurityProvider) {
		if (newCustomSecurityProvider != customSecurityProvider) {
			NotificationChain msgs = null;
			if (customSecurityProvider != null)
				msgs = ((InternalEObject)customSecurityProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SECURITY_MANAGER_TYPE__CUSTOM_SECURITY_PROVIDER, null, msgs);
			if (newCustomSecurityProvider != null)
				msgs = ((InternalEObject)newCustomSecurityProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SECURITY_MANAGER_TYPE__CUSTOM_SECURITY_PROVIDER, null, msgs);
			msgs = basicSetCustomSecurityProvider(newCustomSecurityProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_MANAGER_TYPE__CUSTOM_SECURITY_PROVIDER, newCustomSecurityProvider, newCustomSecurityProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomEncryptionStrategyType getCustomEncryptionStrategy() {
		return customEncryptionStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCustomEncryptionStrategy(CustomEncryptionStrategyType newCustomEncryptionStrategy, NotificationChain msgs) {
		CustomEncryptionStrategyType oldCustomEncryptionStrategy = customEncryptionStrategy;
		customEncryptionStrategy = newCustomEncryptionStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_MANAGER_TYPE__CUSTOM_ENCRYPTION_STRATEGY, oldCustomEncryptionStrategy, newCustomEncryptionStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomEncryptionStrategy(CustomEncryptionStrategyType newCustomEncryptionStrategy) {
		if (newCustomEncryptionStrategy != customEncryptionStrategy) {
			NotificationChain msgs = null;
			if (customEncryptionStrategy != null)
				msgs = ((InternalEObject)customEncryptionStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SECURITY_MANAGER_TYPE__CUSTOM_ENCRYPTION_STRATEGY, null, msgs);
			if (newCustomEncryptionStrategy != null)
				msgs = ((InternalEObject)newCustomEncryptionStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SECURITY_MANAGER_TYPE__CUSTOM_ENCRYPTION_STRATEGY, null, msgs);
			msgs = basicSetCustomEncryptionStrategy(newCustomEncryptionStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_MANAGER_TYPE__CUSTOM_ENCRYPTION_STRATEGY, newCustomEncryptionStrategy, newCustomEncryptionStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecretKeyEncryptionStrategyType getSecretKeyEncryptionStrategy() {
		return secretKeyEncryptionStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecretKeyEncryptionStrategy(SecretKeyEncryptionStrategyType newSecretKeyEncryptionStrategy, NotificationChain msgs) {
		SecretKeyEncryptionStrategyType oldSecretKeyEncryptionStrategy = secretKeyEncryptionStrategy;
		secretKeyEncryptionStrategy = newSecretKeyEncryptionStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_MANAGER_TYPE__SECRET_KEY_ENCRYPTION_STRATEGY, oldSecretKeyEncryptionStrategy, newSecretKeyEncryptionStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecretKeyEncryptionStrategy(SecretKeyEncryptionStrategyType newSecretKeyEncryptionStrategy) {
		if (newSecretKeyEncryptionStrategy != secretKeyEncryptionStrategy) {
			NotificationChain msgs = null;
			if (secretKeyEncryptionStrategy != null)
				msgs = ((InternalEObject)secretKeyEncryptionStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SECURITY_MANAGER_TYPE__SECRET_KEY_ENCRYPTION_STRATEGY, null, msgs);
			if (newSecretKeyEncryptionStrategy != null)
				msgs = ((InternalEObject)newSecretKeyEncryptionStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SECURITY_MANAGER_TYPE__SECRET_KEY_ENCRYPTION_STRATEGY, null, msgs);
			msgs = basicSetSecretKeyEncryptionStrategy(newSecretKeyEncryptionStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_MANAGER_TYPE__SECRET_KEY_ENCRYPTION_STRATEGY, newSecretKeyEncryptionStrategy, newSecretKeyEncryptionStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PasswordEncryptionStrategyType getPasswordEncryptionStrategy() {
		return passwordEncryptionStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPasswordEncryptionStrategy(PasswordEncryptionStrategyType newPasswordEncryptionStrategy, NotificationChain msgs) {
		PasswordEncryptionStrategyType oldPasswordEncryptionStrategy = passwordEncryptionStrategy;
		passwordEncryptionStrategy = newPasswordEncryptionStrategy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_MANAGER_TYPE__PASSWORD_ENCRYPTION_STRATEGY, oldPasswordEncryptionStrategy, newPasswordEncryptionStrategy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPasswordEncryptionStrategy(PasswordEncryptionStrategyType newPasswordEncryptionStrategy) {
		if (newPasswordEncryptionStrategy != passwordEncryptionStrategy) {
			NotificationChain msgs = null;
			if (passwordEncryptionStrategy != null)
				msgs = ((InternalEObject)passwordEncryptionStrategy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SECURITY_MANAGER_TYPE__PASSWORD_ENCRYPTION_STRATEGY, null, msgs);
			if (newPasswordEncryptionStrategy != null)
				msgs = ((InternalEObject)newPasswordEncryptionStrategy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SECURITY_MANAGER_TYPE__PASSWORD_ENCRYPTION_STRATEGY, null, msgs);
			msgs = basicSetPasswordEncryptionStrategy(newPasswordEncryptionStrategy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SECURITY_MANAGER_TYPE__PASSWORD_ENCRYPTION_STRATEGY, newPasswordEncryptionStrategy, newPasswordEncryptionStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SECURITY_MANAGER_TYPE__CUSTOM_SECURITY_PROVIDER:
				return basicSetCustomSecurityProvider(null, msgs);
			case CorePackage.SECURITY_MANAGER_TYPE__CUSTOM_ENCRYPTION_STRATEGY:
				return basicSetCustomEncryptionStrategy(null, msgs);
			case CorePackage.SECURITY_MANAGER_TYPE__SECRET_KEY_ENCRYPTION_STRATEGY:
				return basicSetSecretKeyEncryptionStrategy(null, msgs);
			case CorePackage.SECURITY_MANAGER_TYPE__PASSWORD_ENCRYPTION_STRATEGY:
				return basicSetPasswordEncryptionStrategy(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.SECURITY_MANAGER_TYPE__CUSTOM_SECURITY_PROVIDER:
				return getCustomSecurityProvider();
			case CorePackage.SECURITY_MANAGER_TYPE__CUSTOM_ENCRYPTION_STRATEGY:
				return getCustomEncryptionStrategy();
			case CorePackage.SECURITY_MANAGER_TYPE__SECRET_KEY_ENCRYPTION_STRATEGY:
				return getSecretKeyEncryptionStrategy();
			case CorePackage.SECURITY_MANAGER_TYPE__PASSWORD_ENCRYPTION_STRATEGY:
				return getPasswordEncryptionStrategy();
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
			case CorePackage.SECURITY_MANAGER_TYPE__CUSTOM_SECURITY_PROVIDER:
				setCustomSecurityProvider((CustomSecurityProviderType)newValue);
				return;
			case CorePackage.SECURITY_MANAGER_TYPE__CUSTOM_ENCRYPTION_STRATEGY:
				setCustomEncryptionStrategy((CustomEncryptionStrategyType)newValue);
				return;
			case CorePackage.SECURITY_MANAGER_TYPE__SECRET_KEY_ENCRYPTION_STRATEGY:
				setSecretKeyEncryptionStrategy((SecretKeyEncryptionStrategyType)newValue);
				return;
			case CorePackage.SECURITY_MANAGER_TYPE__PASSWORD_ENCRYPTION_STRATEGY:
				setPasswordEncryptionStrategy((PasswordEncryptionStrategyType)newValue);
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
			case CorePackage.SECURITY_MANAGER_TYPE__CUSTOM_SECURITY_PROVIDER:
				setCustomSecurityProvider((CustomSecurityProviderType)null);
				return;
			case CorePackage.SECURITY_MANAGER_TYPE__CUSTOM_ENCRYPTION_STRATEGY:
				setCustomEncryptionStrategy((CustomEncryptionStrategyType)null);
				return;
			case CorePackage.SECURITY_MANAGER_TYPE__SECRET_KEY_ENCRYPTION_STRATEGY:
				setSecretKeyEncryptionStrategy((SecretKeyEncryptionStrategyType)null);
				return;
			case CorePackage.SECURITY_MANAGER_TYPE__PASSWORD_ENCRYPTION_STRATEGY:
				setPasswordEncryptionStrategy((PasswordEncryptionStrategyType)null);
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
			case CorePackage.SECURITY_MANAGER_TYPE__CUSTOM_SECURITY_PROVIDER:
				return customSecurityProvider != null;
			case CorePackage.SECURITY_MANAGER_TYPE__CUSTOM_ENCRYPTION_STRATEGY:
				return customEncryptionStrategy != null;
			case CorePackage.SECURITY_MANAGER_TYPE__SECRET_KEY_ENCRYPTION_STRATEGY:
				return secretKeyEncryptionStrategy != null;
			case CorePackage.SECURITY_MANAGER_TYPE__PASSWORD_ENCRYPTION_STRATEGY:
				return passwordEncryptionStrategy != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityManagerTypeImpl
