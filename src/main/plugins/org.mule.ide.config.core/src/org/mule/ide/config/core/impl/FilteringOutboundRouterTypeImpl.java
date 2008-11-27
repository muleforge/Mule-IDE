/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractFilterType;
import org.mule.ide.config.core.AbstractTransformerType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.FilteringOutboundRouterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filtering Outbound Router Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.FilteringOutboundRouterTypeImpl#getAbstractFilterGroup <em>Abstract Filter Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.FilteringOutboundRouterTypeImpl#getAbstractFilter <em>Abstract Filter</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.FilteringOutboundRouterTypeImpl#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.FilteringOutboundRouterTypeImpl#getAbstractTransformer <em>Abstract Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.FilteringOutboundRouterTypeImpl#getTransformerRefs <em>Transformer Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilteringOutboundRouterTypeImpl extends OutboundRouterTypeImpl implements FilteringOutboundRouterType {
	/**
	 * The cached value of the '{@link #getAbstractFilterGroup() <em>Abstract Filter Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractFilterGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractFilterGroup;

	/**
	 * The cached value of the '{@link #getAbstractTransformerGroup() <em>Abstract Transformer Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractTransformerGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractTransformerGroup;

	/**
	 * The default value of the '{@link #getTransformerRefs() <em>Transformer Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerRefs()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> TRANSFORMER_REFS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTransformerRefs() <em>Transformer Refs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransformerRefs()
	 * @generated
	 * @ordered
	 */
	protected List<String> transformerRefs = TRANSFORMER_REFS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilteringOutboundRouterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getFilteringOutboundRouterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractFilterGroup() {
		if (abstractFilterGroup == null) {
			abstractFilterGroup = new BasicFeatureMap(this, CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP);
		}
		return abstractFilterGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFilterType getAbstractFilter() {
		return (AbstractFilterType)getAbstractFilterGroup().get(CorePackage.eINSTANCE.getFilteringOutboundRouterType_AbstractFilter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractFilter(AbstractFilterType newAbstractFilter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractFilterGroup()).basicAdd(CorePackage.eINSTANCE.getFilteringOutboundRouterType_AbstractFilter(), newAbstractFilter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractTransformerGroup() {
		if (abstractTransformerGroup == null) {
			abstractTransformerGroup = new BasicFeatureMap(this, CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP);
		}
		return abstractTransformerGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTransformerType> getAbstractTransformer() {
		return getAbstractTransformerGroup().list(CorePackage.eINSTANCE.getFilteringOutboundRouterType_AbstractTransformer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getTransformerRefs() {
		return transformerRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformerRefs(List<String> newTransformerRefs) {
		List<String> oldTransformerRefs = transformerRefs;
		transformerRefs = newTransformerRefs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__TRANSFORMER_REFS, oldTransformerRefs, transformerRefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP:
				return ((InternalEList<?>)getAbstractFilterGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER:
				return basicSetAbstractFilter(null, msgs);
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				return ((InternalEList<?>)getAbstractTransformerGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER:
				return ((InternalEList<?>)getAbstractTransformer()).basicRemove(otherEnd, msgs);
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
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP:
				if (coreType) return getAbstractFilterGroup();
				return ((FeatureMap.Internal)getAbstractFilterGroup()).getWrapper();
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER:
				return getAbstractFilter();
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				if (coreType) return getAbstractTransformerGroup();
				return ((FeatureMap.Internal)getAbstractTransformerGroup()).getWrapper();
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER:
				return getAbstractTransformer();
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__TRANSFORMER_REFS:
				return getTransformerRefs();
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
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP:
				((FeatureMap.Internal)getAbstractFilterGroup()).set(newValue);
				return;
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				((FeatureMap.Internal)getAbstractTransformerGroup()).set(newValue);
				return;
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__TRANSFORMER_REFS:
				setTransformerRefs((List<String>)newValue);
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
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP:
				getAbstractFilterGroup().clear();
				return;
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				getAbstractTransformerGroup().clear();
				return;
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__TRANSFORMER_REFS:
				setTransformerRefs(TRANSFORMER_REFS_EDEFAULT);
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
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER_GROUP:
				return abstractFilterGroup != null && !abstractFilterGroup.isEmpty();
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_FILTER:
				return getAbstractFilter() != null;
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				return abstractTransformerGroup != null && !abstractTransformerGroup.isEmpty();
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__ABSTRACT_TRANSFORMER:
				return !getAbstractTransformer().isEmpty();
			case CorePackage.FILTERING_OUTBOUND_ROUTER_TYPE__TRANSFORMER_REFS:
				return TRANSFORMER_REFS_EDEFAULT == null ? transformerRefs != null : !TRANSFORMER_REFS_EDEFAULT.equals(transformerRefs);
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
		result.append(" (abstractFilterGroup: ");
		result.append(abstractFilterGroup);
		result.append(", abstractTransformerGroup: ");
		result.append(abstractTransformerGroup);
		result.append(", transformerRefs: ");
		result.append(transformerRefs);
		result.append(')');
		return result.toString();
	}

} //FilteringOutboundRouterTypeImpl
