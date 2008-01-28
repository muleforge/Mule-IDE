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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractTransactionFactoryType;
import org.mule.ide.config.core.ActionType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.TransactionRefFactoryType;
import org.mule.ide.config.core.TransactionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.TransactionTypeImpl#getAbstractTransactionFactoryGroup <em>Abstract Transaction Factory Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TransactionTypeImpl#getAbstractTransactionFactory <em>Abstract Transaction Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TransactionTypeImpl#getTransactionFactory <em>Transaction Factory</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TransactionTypeImpl#getAction <em>Action</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.TransactionTypeImpl#getTimeout <em>Timeout</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransactionTypeImpl extends AbstractTransactionTypeImpl implements TransactionType {
	/**
	 * The cached value of the '{@link #getAbstractTransactionFactoryGroup() <em>Abstract Transaction Factory Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractTransactionFactoryGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractTransactionFactoryGroup;

	/**
	 * The cached value of the '{@link #getTransactionFactory() <em>Transaction Factory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionFactory()
	 * @generated
	 * @ordered
	 */
	protected TransactionRefFactoryType transactionFactory;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final ActionType ACTION_EDEFAULT = ActionType.NONE;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected ActionType action = ACTION_EDEFAULT;

	/**
	 * This is true if the Action attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean actionESet;

	/**
	 * The default value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final String TIMEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeout() <em>Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout()
	 * @generated
	 * @ordered
	 */
	protected String timeout = TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getTransactionType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractTransactionFactoryGroup() {
		if (abstractTransactionFactoryGroup == null) {
			abstractTransactionFactoryGroup = new BasicFeatureMap(this, CorePackage.TRANSACTION_TYPE__ABSTRACT_TRANSACTION_FACTORY_GROUP);
		}
		return abstractTransactionFactoryGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTransactionFactoryType getAbstractTransactionFactory() {
		return (AbstractTransactionFactoryType)getAbstractTransactionFactoryGroup().get(CorePackage.eINSTANCE.getTransactionType_AbstractTransactionFactory(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractTransactionFactory(AbstractTransactionFactoryType newAbstractTransactionFactory, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractTransactionFactoryGroup()).basicAdd(CorePackage.eINSTANCE.getTransactionType_AbstractTransactionFactory(), newAbstractTransactionFactory, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionRefFactoryType getTransactionFactory() {
		return transactionFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionFactory(TransactionRefFactoryType newTransactionFactory, NotificationChain msgs) {
		TransactionRefFactoryType oldTransactionFactory = transactionFactory;
		transactionFactory = newTransactionFactory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.TRANSACTION_TYPE__TRANSACTION_FACTORY, oldTransactionFactory, newTransactionFactory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionFactory(TransactionRefFactoryType newTransactionFactory) {
		if (newTransactionFactory != transactionFactory) {
			NotificationChain msgs = null;
			if (transactionFactory != null)
				msgs = ((InternalEObject)transactionFactory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.TRANSACTION_TYPE__TRANSACTION_FACTORY, null, msgs);
			if (newTransactionFactory != null)
				msgs = ((InternalEObject)newTransactionFactory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.TRANSACTION_TYPE__TRANSACTION_FACTORY, null, msgs);
			msgs = basicSetTransactionFactory(newTransactionFactory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRANSACTION_TYPE__TRANSACTION_FACTORY, newTransactionFactory, newTransactionFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionType getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(ActionType newAction) {
		ActionType oldAction = action;
		action = newAction == null ? ACTION_EDEFAULT : newAction;
		boolean oldActionESet = actionESet;
		actionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRANSACTION_TYPE__ACTION, oldAction, action, !oldActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAction() {
		ActionType oldAction = action;
		boolean oldActionESet = actionESet;
		action = ACTION_EDEFAULT;
		actionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.TRANSACTION_TYPE__ACTION, oldAction, ACTION_EDEFAULT, oldActionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAction() {
		return actionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTimeout() {
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeout(String newTimeout) {
		String oldTimeout = timeout;
		timeout = newTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.TRANSACTION_TYPE__TIMEOUT, oldTimeout, timeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.TRANSACTION_TYPE__ABSTRACT_TRANSACTION_FACTORY_GROUP:
				return ((InternalEList<?>)getAbstractTransactionFactoryGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.TRANSACTION_TYPE__ABSTRACT_TRANSACTION_FACTORY:
				return basicSetAbstractTransactionFactory(null, msgs);
			case CorePackage.TRANSACTION_TYPE__TRANSACTION_FACTORY:
				return basicSetTransactionFactory(null, msgs);
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
			case CorePackage.TRANSACTION_TYPE__ABSTRACT_TRANSACTION_FACTORY_GROUP:
				if (coreType) return getAbstractTransactionFactoryGroup();
				return ((FeatureMap.Internal)getAbstractTransactionFactoryGroup()).getWrapper();
			case CorePackage.TRANSACTION_TYPE__ABSTRACT_TRANSACTION_FACTORY:
				return getAbstractTransactionFactory();
			case CorePackage.TRANSACTION_TYPE__TRANSACTION_FACTORY:
				return getTransactionFactory();
			case CorePackage.TRANSACTION_TYPE__ACTION:
				return getAction();
			case CorePackage.TRANSACTION_TYPE__TIMEOUT:
				return getTimeout();
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
			case CorePackage.TRANSACTION_TYPE__ABSTRACT_TRANSACTION_FACTORY_GROUP:
				((FeatureMap.Internal)getAbstractTransactionFactoryGroup()).set(newValue);
				return;
			case CorePackage.TRANSACTION_TYPE__TRANSACTION_FACTORY:
				setTransactionFactory((TransactionRefFactoryType)newValue);
				return;
			case CorePackage.TRANSACTION_TYPE__ACTION:
				setAction((ActionType)newValue);
				return;
			case CorePackage.TRANSACTION_TYPE__TIMEOUT:
				setTimeout((String)newValue);
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
			case CorePackage.TRANSACTION_TYPE__ABSTRACT_TRANSACTION_FACTORY_GROUP:
				getAbstractTransactionFactoryGroup().clear();
				return;
			case CorePackage.TRANSACTION_TYPE__TRANSACTION_FACTORY:
				setTransactionFactory((TransactionRefFactoryType)null);
				return;
			case CorePackage.TRANSACTION_TYPE__ACTION:
				unsetAction();
				return;
			case CorePackage.TRANSACTION_TYPE__TIMEOUT:
				setTimeout(TIMEOUT_EDEFAULT);
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
			case CorePackage.TRANSACTION_TYPE__ABSTRACT_TRANSACTION_FACTORY_GROUP:
				return abstractTransactionFactoryGroup != null && !abstractTransactionFactoryGroup.isEmpty();
			case CorePackage.TRANSACTION_TYPE__ABSTRACT_TRANSACTION_FACTORY:
				return getAbstractTransactionFactory() != null;
			case CorePackage.TRANSACTION_TYPE__TRANSACTION_FACTORY:
				return transactionFactory != null;
			case CorePackage.TRANSACTION_TYPE__ACTION:
				return isSetAction();
			case CorePackage.TRANSACTION_TYPE__TIMEOUT:
				return TIMEOUT_EDEFAULT == null ? timeout != null : !TIMEOUT_EDEFAULT.equals(timeout);
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
		result.append(" (abstractTransactionFactoryGroup: ");
		result.append(abstractTransactionFactoryGroup);
		result.append(", action: ");
		if (actionESet) result.append(action); else result.append("<unset>");
		result.append(", timeout: ");
		result.append(timeout);
		result.append(')');
		return result.toString();
	}

} //TransactionTypeImpl
