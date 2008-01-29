/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.ComplexEntryPointResolverType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.MethodType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complex Entry Point Resolver Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.ComplexEntryPointResolverTypeImpl#getIncludeEntryPoint <em>Include Entry Point</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ComplexEntryPointResolverTypeImpl#isEnableDiscovery <em>Enable Discovery</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComplexEntryPointResolverTypeImpl extends ReflectionEntryPointResolverTypeImpl implements ComplexEntryPointResolverType {
	/**
	 * The cached value of the '{@link #getIncludeEntryPoint() <em>Include Entry Point</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected EList<MethodType> includeEntryPoint;

	/**
	 * The default value of the '{@link #isEnableDiscovery() <em>Enable Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableDiscovery()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_DISCOVERY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnableDiscovery() <em>Enable Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableDiscovery()
	 * @generated
	 * @ordered
	 */
	protected boolean enableDiscovery = ENABLE_DISCOVERY_EDEFAULT;

	/**
	 * This is true if the Enable Discovery attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enableDiscoveryESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplexEntryPointResolverTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getComplexEntryPointResolverType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MethodType> getIncludeEntryPoint() {
		if (includeEntryPoint == null) {
			includeEntryPoint = new EObjectContainmentEList<MethodType>(MethodType.class, this, CorePackage.COMPLEX_ENTRY_POINT_RESOLVER_TYPE__INCLUDE_ENTRY_POINT);
		}
		return includeEntryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableDiscovery() {
		return enableDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableDiscovery(boolean newEnableDiscovery) {
		boolean oldEnableDiscovery = enableDiscovery;
		enableDiscovery = newEnableDiscovery;
		boolean oldEnableDiscoveryESet = enableDiscoveryESet;
		enableDiscoveryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.COMPLEX_ENTRY_POINT_RESOLVER_TYPE__ENABLE_DISCOVERY, oldEnableDiscovery, enableDiscovery, !oldEnableDiscoveryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnableDiscovery() {
		boolean oldEnableDiscovery = enableDiscovery;
		boolean oldEnableDiscoveryESet = enableDiscoveryESet;
		enableDiscovery = ENABLE_DISCOVERY_EDEFAULT;
		enableDiscoveryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.COMPLEX_ENTRY_POINT_RESOLVER_TYPE__ENABLE_DISCOVERY, oldEnableDiscovery, ENABLE_DISCOVERY_EDEFAULT, oldEnableDiscoveryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnableDiscovery() {
		return enableDiscoveryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.COMPLEX_ENTRY_POINT_RESOLVER_TYPE__INCLUDE_ENTRY_POINT:
				return ((InternalEList<?>)getIncludeEntryPoint()).basicRemove(otherEnd, msgs);
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
			case CorePackage.COMPLEX_ENTRY_POINT_RESOLVER_TYPE__INCLUDE_ENTRY_POINT:
				return getIncludeEntryPoint();
			case CorePackage.COMPLEX_ENTRY_POINT_RESOLVER_TYPE__ENABLE_DISCOVERY:
				return isEnableDiscovery() ? Boolean.TRUE : Boolean.FALSE;
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.COMPLEX_ENTRY_POINT_RESOLVER_TYPE__INCLUDE_ENTRY_POINT:
				getIncludeEntryPoint().clear();
				getIncludeEntryPoint().addAll((Collection<? extends MethodType>)newValue);
				return;
			case CorePackage.COMPLEX_ENTRY_POINT_RESOLVER_TYPE__ENABLE_DISCOVERY:
				setEnableDiscovery(((Boolean)newValue).booleanValue());
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
			case CorePackage.COMPLEX_ENTRY_POINT_RESOLVER_TYPE__INCLUDE_ENTRY_POINT:
				getIncludeEntryPoint().clear();
				return;
			case CorePackage.COMPLEX_ENTRY_POINT_RESOLVER_TYPE__ENABLE_DISCOVERY:
				unsetEnableDiscovery();
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
			case CorePackage.COMPLEX_ENTRY_POINT_RESOLVER_TYPE__INCLUDE_ENTRY_POINT:
				return includeEntryPoint != null && !includeEntryPoint.isEmpty();
			case CorePackage.COMPLEX_ENTRY_POINT_RESOLVER_TYPE__ENABLE_DISCOVERY:
				return isSetEnableDiscovery();
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
		result.append(" (enableDiscovery: ");
		if (enableDiscoveryESet) result.append(enableDiscovery); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ComplexEntryPointResolverTypeImpl
