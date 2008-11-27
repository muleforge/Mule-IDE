/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.stdio.impl;

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

import org.mule.ide.config.stdio.DocumentRoot;
import org.mule.ide.config.stdio.GlobalEndpointType;
import org.mule.ide.config.stdio.InboundEndpointType;
import org.mule.ide.config.stdio.OutboundEndpointType;
import org.mule.ide.config.stdio.StdioConnectorType;
import org.mule.ide.config.stdio.StdioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.stdio.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.mule.ide.config.stdio.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.mule.ide.config.stdio.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.mule.ide.config.stdio.impl.DocumentRootImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link org.mule.ide.config.stdio.impl.DocumentRootImpl#getEndpoint <em>Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.stdio.impl.DocumentRootImpl#getInboundEndpoint <em>Inbound Endpoint</em>}</li>
 *   <li>{@link org.mule.ide.config.stdio.impl.DocumentRootImpl#getOutboundEndpoint <em>Outbound Endpoint</em>}</li>
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
		return StdioPackage.Literals.DOCUMENT_ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, StdioPackage.DOCUMENT_ROOT__MIXED);
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
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, StdioPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
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
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, StdioPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StdioConnectorType getConnector() {
		return (StdioConnectorType)getMixed().get(StdioPackage.Literals.DOCUMENT_ROOT__CONNECTOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnector(StdioConnectorType newConnector, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StdioPackage.Literals.DOCUMENT_ROOT__CONNECTOR, newConnector, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(StdioConnectorType newConnector) {
		((FeatureMap.Internal)getMixed()).set(StdioPackage.Literals.DOCUMENT_ROOT__CONNECTOR, newConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlobalEndpointType getEndpoint() {
		return (GlobalEndpointType)getMixed().get(StdioPackage.Literals.DOCUMENT_ROOT__ENDPOINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoint(GlobalEndpointType newEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StdioPackage.Literals.DOCUMENT_ROOT__ENDPOINT, newEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoint(GlobalEndpointType newEndpoint) {
		((FeatureMap.Internal)getMixed()).set(StdioPackage.Literals.DOCUMENT_ROOT__ENDPOINT, newEndpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundEndpointType getInboundEndpoint() {
		return (InboundEndpointType)getMixed().get(StdioPackage.Literals.DOCUMENT_ROOT__INBOUND_ENDPOINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInboundEndpoint(InboundEndpointType newInboundEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StdioPackage.Literals.DOCUMENT_ROOT__INBOUND_ENDPOINT, newInboundEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInboundEndpoint(InboundEndpointType newInboundEndpoint) {
		((FeatureMap.Internal)getMixed()).set(StdioPackage.Literals.DOCUMENT_ROOT__INBOUND_ENDPOINT, newInboundEndpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutboundEndpointType getOutboundEndpoint() {
		return (OutboundEndpointType)getMixed().get(StdioPackage.Literals.DOCUMENT_ROOT__OUTBOUND_ENDPOINT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOutboundEndpoint(OutboundEndpointType newOutboundEndpoint, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(StdioPackage.Literals.DOCUMENT_ROOT__OUTBOUND_ENDPOINT, newOutboundEndpoint, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutboundEndpoint(OutboundEndpointType newOutboundEndpoint) {
		((FeatureMap.Internal)getMixed()).set(StdioPackage.Literals.DOCUMENT_ROOT__OUTBOUND_ENDPOINT, newOutboundEndpoint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StdioPackage.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case StdioPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case StdioPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case StdioPackage.DOCUMENT_ROOT__CONNECTOR:
				return basicSetConnector(null, msgs);
			case StdioPackage.DOCUMENT_ROOT__ENDPOINT:
				return basicSetEndpoint(null, msgs);
			case StdioPackage.DOCUMENT_ROOT__INBOUND_ENDPOINT:
				return basicSetInboundEndpoint(null, msgs);
			case StdioPackage.DOCUMENT_ROOT__OUTBOUND_ENDPOINT:
				return basicSetOutboundEndpoint(null, msgs);
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
			case StdioPackage.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case StdioPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case StdioPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case StdioPackage.DOCUMENT_ROOT__CONNECTOR:
				return getConnector();
			case StdioPackage.DOCUMENT_ROOT__ENDPOINT:
				return getEndpoint();
			case StdioPackage.DOCUMENT_ROOT__INBOUND_ENDPOINT:
				return getInboundEndpoint();
			case StdioPackage.DOCUMENT_ROOT__OUTBOUND_ENDPOINT:
				return getOutboundEndpoint();
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
			case StdioPackage.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case StdioPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case StdioPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case StdioPackage.DOCUMENT_ROOT__CONNECTOR:
				setConnector((StdioConnectorType)newValue);
				return;
			case StdioPackage.DOCUMENT_ROOT__ENDPOINT:
				setEndpoint((GlobalEndpointType)newValue);
				return;
			case StdioPackage.DOCUMENT_ROOT__INBOUND_ENDPOINT:
				setInboundEndpoint((InboundEndpointType)newValue);
				return;
			case StdioPackage.DOCUMENT_ROOT__OUTBOUND_ENDPOINT:
				setOutboundEndpoint((OutboundEndpointType)newValue);
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
			case StdioPackage.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case StdioPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case StdioPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case StdioPackage.DOCUMENT_ROOT__CONNECTOR:
				setConnector((StdioConnectorType)null);
				return;
			case StdioPackage.DOCUMENT_ROOT__ENDPOINT:
				setEndpoint((GlobalEndpointType)null);
				return;
			case StdioPackage.DOCUMENT_ROOT__INBOUND_ENDPOINT:
				setInboundEndpoint((InboundEndpointType)null);
				return;
			case StdioPackage.DOCUMENT_ROOT__OUTBOUND_ENDPOINT:
				setOutboundEndpoint((OutboundEndpointType)null);
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
			case StdioPackage.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case StdioPackage.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case StdioPackage.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case StdioPackage.DOCUMENT_ROOT__CONNECTOR:
				return getConnector() != null;
			case StdioPackage.DOCUMENT_ROOT__ENDPOINT:
				return getEndpoint() != null;
			case StdioPackage.DOCUMENT_ROOT__INBOUND_ENDPOINT:
				return getInboundEndpoint() != null;
			case StdioPackage.DOCUMENT_ROOT__OUTBOUND_ENDPOINT:
				return getOutboundEndpoint() != null;
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
