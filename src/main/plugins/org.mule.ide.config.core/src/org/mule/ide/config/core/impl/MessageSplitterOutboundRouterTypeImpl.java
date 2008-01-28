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
import org.mule.ide.config.core.MessageSplitterOutboundRouterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message Splitter Outbound Router Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.MessageSplitterOutboundRouterTypeImpl#isHonorSynchronicity <em>Honor Synchronicity</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MessageSplitterOutboundRouterTypeImpl extends FilteringOutboundRouterTypeImpl implements MessageSplitterOutboundRouterType {
	/**
	 * The default value of the '{@link #isHonorSynchronicity() <em>Honor Synchronicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHonorSynchronicity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HONOR_SYNCHRONICITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHonorSynchronicity() <em>Honor Synchronicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHonorSynchronicity()
	 * @generated
	 * @ordered
	 */
	protected boolean honorSynchronicity = HONOR_SYNCHRONICITY_EDEFAULT;

	/**
	 * This is true if the Honor Synchronicity attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean honorSynchronicityESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageSplitterOutboundRouterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getMessageSplitterOutboundRouterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHonorSynchronicity() {
		return honorSynchronicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHonorSynchronicity(boolean newHonorSynchronicity) {
		boolean oldHonorSynchronicity = honorSynchronicity;
		honorSynchronicity = newHonorSynchronicity;
		boolean oldHonorSynchronicityESet = honorSynchronicityESet;
		honorSynchronicityESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__HONOR_SYNCHRONICITY, oldHonorSynchronicity, honorSynchronicity, !oldHonorSynchronicityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHonorSynchronicity() {
		boolean oldHonorSynchronicity = honorSynchronicity;
		boolean oldHonorSynchronicityESet = honorSynchronicityESet;
		honorSynchronicity = HONOR_SYNCHRONICITY_EDEFAULT;
		honorSynchronicityESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__HONOR_SYNCHRONICITY, oldHonorSynchronicity, HONOR_SYNCHRONICITY_EDEFAULT, oldHonorSynchronicityESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHonorSynchronicity() {
		return honorSynchronicityESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__HONOR_SYNCHRONICITY:
				return isHonorSynchronicity() ? Boolean.TRUE : Boolean.FALSE;
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
			case CorePackage.MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__HONOR_SYNCHRONICITY:
				setHonorSynchronicity(((Boolean)newValue).booleanValue());
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
			case CorePackage.MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__HONOR_SYNCHRONICITY:
				unsetHonorSynchronicity();
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
			case CorePackage.MESSAGE_SPLITTER_OUTBOUND_ROUTER_TYPE__HONOR_SYNCHRONICITY:
				return isSetHonorSynchronicity();
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
		result.append(" (honorSynchronicity: ");
		if (honorSynchronicityESet) result.append(honorSynchronicity); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MessageSplitterOutboundRouterTypeImpl
