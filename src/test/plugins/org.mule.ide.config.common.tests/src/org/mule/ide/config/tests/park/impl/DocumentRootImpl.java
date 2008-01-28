/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.tests.park.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.tests.park.DecalType;
import org.mule.ide.config.tests.park.DocumentRoot;
import org.mule.ide.config.tests.park.ParkPackage;
import org.mule.ide.config.tests.park.ParkType;
import org.mule.ide.config.tests.park.VehicleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.tests.park.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.DocumentRootImpl#getAbstractVehicle <em>Abstract Vehicle</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.DocumentRootImpl#getDecal <em>Decal</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.DocumentRootImpl#getMake <em>Make</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.DocumentRootImpl#getModel <em>Model</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.DocumentRootImpl#getPaint <em>Paint</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.DocumentRootImpl#getPark <em>Park</em>}</li>
 *   <li>{@link org.mule.ide.config.tests.park.impl.DocumentRootImpl#getVehicle <em>Vehicle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentRootImpl extends EObjectImpl implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

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
	 * The default value of the '{@link #getModel() <em>Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModel()
	 * @generated
	 * @ordered
	 */
	protected static final String MODEL_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPaint() <em>Paint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaint()
	 * @generated
	 * @ordered
	 */
	protected static final String PAINT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ParkPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, ParkPackage.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ParkPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ParkPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleType getAbstractVehicle() {
		return (VehicleType)getMixed().get(ParkPackage.Literals.DOCUMENT_ROOT__ABSTRACT_VEHICLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractVehicle(VehicleType newAbstractVehicle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ParkPackage.Literals.DOCUMENT_ROOT__ABSTRACT_VEHICLE, newAbstractVehicle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecalType getDecal() {
		return (DecalType)getMixed().get(ParkPackage.Literals.DOCUMENT_ROOT__DECAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDecal(DecalType newDecal, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ParkPackage.Literals.DOCUMENT_ROOT__DECAL, newDecal, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecal(DecalType newDecal) {
		((FeatureMap.Internal)getMixed()).set(ParkPackage.Literals.DOCUMENT_ROOT__DECAL, newDecal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMake() {
		return (String)getMixed().get(ParkPackage.Literals.DOCUMENT_ROOT__MAKE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMake(String newMake) {
		((FeatureMap.Internal)getMixed()).set(ParkPackage.Literals.DOCUMENT_ROOT__MAKE, newMake);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModel() {
		return (String)getMixed().get(ParkPackage.Literals.DOCUMENT_ROOT__MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModel(String newModel) {
		((FeatureMap.Internal)getMixed()).set(ParkPackage.Literals.DOCUMENT_ROOT__MODEL, newModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaint() {
		return (String)getMixed().get(ParkPackage.Literals.DOCUMENT_ROOT__PAINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaint(String newPaint) {
		((FeatureMap.Internal)getMixed()).set(ParkPackage.Literals.DOCUMENT_ROOT__PAINT, newPaint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParkType getPark() {
		return (ParkType)getMixed().get(ParkPackage.Literals.DOCUMENT_ROOT__PARK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPark(ParkType newPark, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ParkPackage.Literals.DOCUMENT_ROOT__PARK, newPark, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPark(ParkType newPark) {
		((FeatureMap.Internal)getMixed()).set(ParkPackage.Literals.DOCUMENT_ROOT__PARK, newPark);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleType getVehicle() {
		return (VehicleType)getMixed().get(ParkPackage.Literals.DOCUMENT_ROOT__VEHICLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVehicle(VehicleType newVehicle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(ParkPackage.Literals.DOCUMENT_ROOT__VEHICLE, newVehicle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicle(VehicleType newVehicle) {
		((FeatureMap.Internal)getMixed()).set(ParkPackage.Literals.DOCUMENT_ROOT__VEHICLE, newVehicle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ParkPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case ParkPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case ParkPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case ParkPackage.DOCUMENT_ROOT__ABSTRACT_VEHICLE:
				return basicSetAbstractVehicle(null, msgs);
			case ParkPackage.DOCUMENT_ROOT__DECAL:
				return basicSetDecal(null, msgs);
			case ParkPackage.DOCUMENT_ROOT__PARK:
				return basicSetPark(null, msgs);
			case ParkPackage.DOCUMENT_ROOT__VEHICLE:
				return basicSetVehicle(null, msgs);
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
			case ParkPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case ParkPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case ParkPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case ParkPackage.DOCUMENT_ROOT__ABSTRACT_VEHICLE:
				return getAbstractVehicle();
			case ParkPackage.DOCUMENT_ROOT__DECAL:
				return getDecal();
			case ParkPackage.DOCUMENT_ROOT__MAKE:
				return getMake();
			case ParkPackage.DOCUMENT_ROOT__MODEL:
				return getModel();
			case ParkPackage.DOCUMENT_ROOT__PAINT:
				return getPaint();
			case ParkPackage.DOCUMENT_ROOT__PARK:
				return getPark();
			case ParkPackage.DOCUMENT_ROOT__VEHICLE:
				return getVehicle();
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
			case ParkPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case ParkPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case ParkPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case ParkPackage.DOCUMENT_ROOT__DECAL:
				setDecal((DecalType)newValue);
				return;
			case ParkPackage.DOCUMENT_ROOT__MAKE:
				setMake((String)newValue);
				return;
			case ParkPackage.DOCUMENT_ROOT__MODEL:
				setModel((String)newValue);
				return;
			case ParkPackage.DOCUMENT_ROOT__PAINT:
				setPaint((String)newValue);
				return;
			case ParkPackage.DOCUMENT_ROOT__PARK:
				setPark((ParkType)newValue);
				return;
			case ParkPackage.DOCUMENT_ROOT__VEHICLE:
				setVehicle((VehicleType)newValue);
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
			case ParkPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case ParkPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case ParkPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case ParkPackage.DOCUMENT_ROOT__DECAL:
				setDecal((DecalType)null);
				return;
			case ParkPackage.DOCUMENT_ROOT__MAKE:
				setMake(MAKE_EDEFAULT);
				return;
			case ParkPackage.DOCUMENT_ROOT__MODEL:
				setModel(MODEL_EDEFAULT);
				return;
			case ParkPackage.DOCUMENT_ROOT__PAINT:
				setPaint(PAINT_EDEFAULT);
				return;
			case ParkPackage.DOCUMENT_ROOT__PARK:
				setPark((ParkType)null);
				return;
			case ParkPackage.DOCUMENT_ROOT__VEHICLE:
				setVehicle((VehicleType)null);
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
			case ParkPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case ParkPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case ParkPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case ParkPackage.DOCUMENT_ROOT__ABSTRACT_VEHICLE:
				return getAbstractVehicle() != null;
			case ParkPackage.DOCUMENT_ROOT__DECAL:
				return getDecal() != null;
			case ParkPackage.DOCUMENT_ROOT__MAKE:
				return MAKE_EDEFAULT == null ? getMake() != null : !MAKE_EDEFAULT.equals(getMake());
			case ParkPackage.DOCUMENT_ROOT__MODEL:
				return MODEL_EDEFAULT == null ? getModel() != null : !MODEL_EDEFAULT.equals(getModel());
			case ParkPackage.DOCUMENT_ROOT__PAINT:
				return PAINT_EDEFAULT == null ? getPaint() != null : !PAINT_EDEFAULT.equals(getPaint());
			case ParkPackage.DOCUMENT_ROOT__PARK:
				return getPark() != null;
			case ParkPackage.DOCUMENT_ROOT__VEHICLE:
				return getVehicle() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
