/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractOutboundEndpointType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.PojoBindingType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pojo Binding Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.PojoBindingTypeImpl#getAbstractOutboundEndpointGroup <em>Abstract Outbound Endpoint Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.PojoBindingTypeImpl#getAbstractOutboundEndpoint <em>Abstract Outbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.PojoBindingTypeImpl#getInterface <em>Interface</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.PojoBindingTypeImpl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PojoBindingTypeImpl extends EObjectImpl implements PojoBindingType {
	/**
	 * The cached value of the '{@link #getAbstractOutboundEndpointGroup() <em>Abstract Outbound Endpoint Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractOutboundEndpointGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractOutboundEndpointGroup;

	/**
	 * The default value of the '{@link #getInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERFACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected String interface_ = INTERFACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final Object METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected Object method = METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PojoBindingTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getPojoBindingType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractOutboundEndpointGroup() {
		if (abstractOutboundEndpointGroup == null) {
			abstractOutboundEndpointGroup = new BasicFeatureMap(this, CorePackage.POJO_BINDING_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP);
		}
		return abstractOutboundEndpointGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractOutboundEndpointType> getAbstractOutboundEndpoint() {
		return getAbstractOutboundEndpointGroup().list(CorePackage.eINSTANCE.getPojoBindingType_AbstractOutboundEndpoint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInterface() {
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(String newInterface) {
		String oldInterface = interface_;
		interface_ = newInterface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.POJO_BINDING_TYPE__INTERFACE, oldInterface, interface_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(Object newMethod) {
		Object oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.POJO_BINDING_TYPE__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.POJO_BINDING_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
				return ((InternalEList<?>)getAbstractOutboundEndpointGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.POJO_BINDING_TYPE__ABSTRACT_OUTBOUND_ENDPOINT:
				return ((InternalEList<?>)getAbstractOutboundEndpoint()).basicRemove(otherEnd, msgs);
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
			case CorePackage.POJO_BINDING_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
				if (coreType) return getAbstractOutboundEndpointGroup();
				return ((FeatureMap.Internal)getAbstractOutboundEndpointGroup()).getWrapper();
			case CorePackage.POJO_BINDING_TYPE__ABSTRACT_OUTBOUND_ENDPOINT:
				return getAbstractOutboundEndpoint();
			case CorePackage.POJO_BINDING_TYPE__INTERFACE:
				return getInterface();
			case CorePackage.POJO_BINDING_TYPE__METHOD:
				return getMethod();
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
			case CorePackage.POJO_BINDING_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
				((FeatureMap.Internal)getAbstractOutboundEndpointGroup()).set(newValue);
				return;
			case CorePackage.POJO_BINDING_TYPE__INTERFACE:
				setInterface((String)newValue);
				return;
			case CorePackage.POJO_BINDING_TYPE__METHOD:
				setMethod(newValue);
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
			case CorePackage.POJO_BINDING_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
				getAbstractOutboundEndpointGroup().clear();
				return;
			case CorePackage.POJO_BINDING_TYPE__INTERFACE:
				setInterface(INTERFACE_EDEFAULT);
				return;
			case CorePackage.POJO_BINDING_TYPE__METHOD:
				setMethod(METHOD_EDEFAULT);
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
			case CorePackage.POJO_BINDING_TYPE__ABSTRACT_OUTBOUND_ENDPOINT_GROUP:
				return abstractOutboundEndpointGroup != null && !abstractOutboundEndpointGroup.isEmpty();
			case CorePackage.POJO_BINDING_TYPE__ABSTRACT_OUTBOUND_ENDPOINT:
				return !getAbstractOutboundEndpoint().isEmpty();
			case CorePackage.POJO_BINDING_TYPE__INTERFACE:
				return INTERFACE_EDEFAULT == null ? interface_ != null : !INTERFACE_EDEFAULT.equals(interface_);
			case CorePackage.POJO_BINDING_TYPE__METHOD:
				return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
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
		result.append(" (abstractOutboundEndpointGroup: ");
		result.append(abstractOutboundEndpointGroup);
		result.append(", interface: ");
		result.append(interface_);
		result.append(", method: ");
		result.append(method);
		result.append(')');
		return result.toString();
	}

} //PojoBindingTypeImpl
