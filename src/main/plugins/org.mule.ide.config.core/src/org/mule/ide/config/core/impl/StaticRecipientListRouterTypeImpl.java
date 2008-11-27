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
import org.mule.ide.config.core.ListOrSetType;
import org.mule.ide.config.core.StaticRecipientListRouterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Recipient List Router Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.StaticRecipientListRouterTypeImpl#getRecipients <em>Recipients</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.StaticRecipientListRouterTypeImpl#getRecipientsDelimiter <em>Recipients Delimiter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.StaticRecipientListRouterTypeImpl#getRecipientsProperty <em>Recipients Property</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.StaticRecipientListRouterTypeImpl#isSynchronous <em>Synchronous</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticRecipientListRouterTypeImpl extends FilteringOutboundRouterTypeImpl implements StaticRecipientListRouterType {
	/**
	 * The cached value of the '{@link #getRecipients() <em>Recipients</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipients()
	 * @generated
	 * @ordered
	 */
	protected ListOrSetType recipients;

	/**
	 * The default value of the '{@link #getRecipientsDelimiter() <em>Recipients Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientsDelimiter()
	 * @generated
	 * @ordered
	 */
	protected static final String RECIPIENTS_DELIMITER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecipientsDelimiter() <em>Recipients Delimiter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientsDelimiter()
	 * @generated
	 * @ordered
	 */
	protected String recipientsDelimiter = RECIPIENTS_DELIMITER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRecipientsProperty() <em>Recipients Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientsProperty()
	 * @generated
	 * @ordered
	 */
	protected static final String RECIPIENTS_PROPERTY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecipientsProperty() <em>Recipients Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecipientsProperty()
	 * @generated
	 * @ordered
	 */
	protected String recipientsProperty = RECIPIENTS_PROPERTY_EDEFAULT;

	/**
	 * The default value of the '{@link #isSynchronous() <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSynchronous() <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronous()
	 * @generated
	 * @ordered
	 */
	protected boolean synchronous = SYNCHRONOUS_EDEFAULT;

	/**
	 * This is true if the Synchronous attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean synchronousESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticRecipientListRouterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getStaticRecipientListRouterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListOrSetType getRecipients() {
		return recipients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRecipients(ListOrSetType newRecipients, NotificationChain msgs) {
		ListOrSetType oldRecipients = recipients;
		recipients = newRecipients;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS, oldRecipients, newRecipients);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipients(ListOrSetType newRecipients) {
		if (newRecipients != recipients) {
			NotificationChain msgs = null;
			if (recipients != null)
				msgs = ((InternalEObject)recipients).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS, null, msgs);
			if (newRecipients != null)
				msgs = ((InternalEObject)newRecipients).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS, null, msgs);
			msgs = basicSetRecipients(newRecipients, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS, newRecipients, newRecipients));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecipientsDelimiter() {
		return recipientsDelimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipientsDelimiter(String newRecipientsDelimiter) {
		String oldRecipientsDelimiter = recipientsDelimiter;
		recipientsDelimiter = newRecipientsDelimiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_DELIMITER, oldRecipientsDelimiter, recipientsDelimiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRecipientsProperty() {
		return recipientsProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRecipientsProperty(String newRecipientsProperty) {
		String oldRecipientsProperty = recipientsProperty;
		recipientsProperty = newRecipientsProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_PROPERTY, oldRecipientsProperty, recipientsProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynchronous() {
		return synchronous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronous(boolean newSynchronous) {
		boolean oldSynchronous = synchronous;
		synchronous = newSynchronous;
		boolean oldSynchronousESet = synchronousESet;
		synchronousESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__SYNCHRONOUS, oldSynchronous, synchronous, !oldSynchronousESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSynchronous() {
		boolean oldSynchronous = synchronous;
		boolean oldSynchronousESet = synchronousESet;
		synchronous = SYNCHRONOUS_EDEFAULT;
		synchronousESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__SYNCHRONOUS, oldSynchronous, SYNCHRONOUS_EDEFAULT, oldSynchronousESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSynchronous() {
		return synchronousESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS:
				return basicSetRecipients(null, msgs);
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
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS:
				return getRecipients();
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_DELIMITER:
				return getRecipientsDelimiter();
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_PROPERTY:
				return getRecipientsProperty();
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__SYNCHRONOUS:
				return isSynchronous() ? Boolean.TRUE : Boolean.FALSE;
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
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS:
				setRecipients((ListOrSetType)newValue);
				return;
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_DELIMITER:
				setRecipientsDelimiter((String)newValue);
				return;
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_PROPERTY:
				setRecipientsProperty((String)newValue);
				return;
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__SYNCHRONOUS:
				setSynchronous(((Boolean)newValue).booleanValue());
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
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS:
				setRecipients((ListOrSetType)null);
				return;
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_DELIMITER:
				setRecipientsDelimiter(RECIPIENTS_DELIMITER_EDEFAULT);
				return;
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_PROPERTY:
				setRecipientsProperty(RECIPIENTS_PROPERTY_EDEFAULT);
				return;
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__SYNCHRONOUS:
				unsetSynchronous();
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
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS:
				return recipients != null;
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_DELIMITER:
				return RECIPIENTS_DELIMITER_EDEFAULT == null ? recipientsDelimiter != null : !RECIPIENTS_DELIMITER_EDEFAULT.equals(recipientsDelimiter);
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_PROPERTY:
				return RECIPIENTS_PROPERTY_EDEFAULT == null ? recipientsProperty != null : !RECIPIENTS_PROPERTY_EDEFAULT.equals(recipientsProperty);
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__SYNCHRONOUS:
				return isSetSynchronous();
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
		result.append(" (recipientsDelimiter: ");
		result.append(recipientsDelimiter);
		result.append(", recipientsProperty: ");
		result.append(recipientsProperty);
		result.append(", synchronous: ");
		if (synchronousESet) result.append(synchronous); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //StaticRecipientListRouterTypeImpl
