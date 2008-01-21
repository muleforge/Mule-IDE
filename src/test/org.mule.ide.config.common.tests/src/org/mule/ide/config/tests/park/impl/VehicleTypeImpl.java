/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.tests.park.impl;

import java.util.Collection;

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

import org.mule.ide.config.tests.park.DecalType;
import org.mule.ide.config.tests.park.ParkPackage;
import org.mule.ide.config.tests.park.VehicleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.tests.park.impl.VehicleTypeImpl#getMake <em>Make</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.VehicleTypeImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.VehicleTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.VehicleTypeImpl#getDecal <em>Decal</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.VehicleTypeImpl#getPaint <em>Paint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VehicleTypeImpl extends EObjectImpl implements VehicleType {
	/**
	 * The default value of the '{@link #getMake() <em>Make</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMake()
	 * @generated
	 * @ordered
	 */
	protected static final String MAKE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMake() <em>Make</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMake()
	 * @generated
	 * @ordered
	 */
	protected String make = MAKE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected String model = MODEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParkPackage.Literals.VEHICLE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMake() {
		return make;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMake(String newMake) {
		String oldMake = make;
		make = newMake;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParkPackage.VEHICLE_TYPE__MAKE, oldMake, make));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		String oldModel = model;
		model = newModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ParkPackage.VEHICLE_TYPE__MODEL, oldModel, model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, ParkPackage.VEHICLE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecalType> getDecal() {
		return getGroup().list(ParkPackage.Literals.VEHICLE_TYPE__DECAL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPaint() {
		return getGroup().list(ParkPackage.Literals.VEHICLE_TYPE__PAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParkPackage.VEHICLE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case ParkPackage.VEHICLE_TYPE__DECAL:
				return ((InternalEList<?>)getDecal()).basicRemove(otherEnd, msgs);
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
			case ParkPackage.VEHICLE_TYPE__MAKE:
				return getMake();
			case ParkPackage.VEHICLE_TYPE__MODEL:
				return getModel();
			case ParkPackage.VEHICLE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case ParkPackage.VEHICLE_TYPE__DECAL:
				return getDecal();
			case ParkPackage.VEHICLE_TYPE__PAINT:
				return getPaint();
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
			case ParkPackage.VEHICLE_TYPE__MAKE:
				setMake((String)newValue);
				return;
			case ParkPackage.VEHICLE_TYPE__MODEL:
				setModel((String)newValue);
				return;
			case ParkPackage.VEHICLE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case ParkPackage.VEHICLE_TYPE__DECAL:
				getDecal().clear();
				getDecal().addAll((Collection<? extends DecalType>)newValue);
				return;
			case ParkPackage.VEHICLE_TYPE__PAINT:
				getPaint().clear();
				getPaint().addAll((Collection<? extends String>)newValue);
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
			case ParkPackage.VEHICLE_TYPE__MAKE:
				setMake(MAKE_EDEFAULT);
				return;
			case ParkPackage.VEHICLE_TYPE__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case ParkPackage.VEHICLE_TYPE__GROUP:
				getGroup().clear();
				return;
			case ParkPackage.VEHICLE_TYPE__DECAL:
				getDecal().clear();
				return;
			case ParkPackage.VEHICLE_TYPE__PAINT:
				getPaint().clear();
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
			case ParkPackage.VEHICLE_TYPE__MAKE:
				return MAKE_EDEFAULT == null ? make != null : !MAKE_EDEFAULT.equals(make);
			case ParkPackage.VEHICLE_TYPE__MODEL:
				return MODEL_EDEFAULT == null ? model != null : !MODEL_EDEFAULT.equals(model);
			case ParkPackage.VEHICLE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case ParkPackage.VEHICLE_TYPE__DECAL:
				return !getDecal().isEmpty();
			case ParkPackage.VEHICLE_TYPE__PAINT:
				return !getPaint().isEmpty();
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
		result.append(" (make: ");
		result.append(make);
		result.append(", model: ");
		result.append(model);
		result.append(", group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //VehicleTypeImpl
