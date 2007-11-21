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
import org.mule.ide.config.core.StaticRecipientListRouterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Recipient List Router Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.StaticRecipientListRouterTypeImpl#getRecipientsDelimiter <em>Recipients Delimiter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.StaticRecipientListRouterTypeImpl#getRecipientsProperty <em>Recipients Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticRecipientListRouterTypeImpl extends FilteringOutboundRouterTypeImpl implements StaticRecipientListRouterType {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_DELIMITER:
				return getRecipientsDelimiter();
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_PROPERTY:
				return getRecipientsProperty();
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
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_DELIMITER:
				setRecipientsDelimiter((String)newValue);
				return;
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_PROPERTY:
				setRecipientsProperty((String)newValue);
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
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_DELIMITER:
				setRecipientsDelimiter(RECIPIENTS_DELIMITER_EDEFAULT);
				return;
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_PROPERTY:
				setRecipientsProperty(RECIPIENTS_PROPERTY_EDEFAULT);
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
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_DELIMITER:
				return RECIPIENTS_DELIMITER_EDEFAULT == null ? recipientsDelimiter != null : !RECIPIENTS_DELIMITER_EDEFAULT.equals(recipientsDelimiter);
			case CorePackage.STATIC_RECIPIENT_LIST_ROUTER_TYPE__RECIPIENTS_PROPERTY:
				return RECIPIENTS_PROPERTY_EDEFAULT == null ? recipientsProperty != null : !RECIPIENTS_PROPERTY_EDEFAULT.equals(recipientsProperty);
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
		result.append(')');
		return result.toString();
	}

} //StaticRecipientListRouterTypeImpl
