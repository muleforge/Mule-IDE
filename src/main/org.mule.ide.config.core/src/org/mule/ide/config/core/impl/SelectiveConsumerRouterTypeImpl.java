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

import org.mule.ide.config.core.AbstractTransformerType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.SelectiveConsumerRouterType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Selective Consumer Router Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.SelectiveConsumerRouterTypeImpl#getAbstractTransformerGroup <em>Abstract Transformer Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.SelectiveConsumerRouterTypeImpl#getAbstractTransformer <em>Abstract Transformer</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.SelectiveConsumerRouterTypeImpl#getTransformerRefs <em>Transformer Refs</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.SelectiveConsumerRouterTypeImpl#isTransformFirst <em>Transform First</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SelectiveConsumerRouterTypeImpl extends FilteredInboundRouterTypeImpl implements SelectiveConsumerRouterType {
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
	 * The default value of the '{@link #isTransformFirst() <em>Transform First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransformFirst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSFORM_FIRST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransformFirst() <em>Transform First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransformFirst()
	 * @generated
	 * @ordered
	 */
	protected boolean transformFirst = TRANSFORM_FIRST_EDEFAULT;

	/**
	 * This is true if the Transform First attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transformFirstESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelectiveConsumerRouterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getSelectiveConsumerRouterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractTransformerGroup() {
		if (abstractTransformerGroup == null) {
			abstractTransformerGroup = new BasicFeatureMap(this, CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP);
		}
		return abstractTransformerGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractTransformerType> getAbstractTransformer() {
		return getAbstractTransformerGroup().list(CorePackage.eINSTANCE.getSelectiveConsumerRouterType_AbstractTransformer());
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__TRANSFORMER_REFS, oldTransformerRefs, transformerRefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransformFirst() {
		return transformFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransformFirst(boolean newTransformFirst) {
		boolean oldTransformFirst = transformFirst;
		transformFirst = newTransformFirst;
		boolean oldTransformFirstESet = transformFirstESet;
		transformFirstESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__TRANSFORM_FIRST, oldTransformFirst, transformFirst, !oldTransformFirstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransformFirst() {
		boolean oldTransformFirst = transformFirst;
		boolean oldTransformFirstESet = transformFirstESet;
		transformFirst = TRANSFORM_FIRST_EDEFAULT;
		transformFirstESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__TRANSFORM_FIRST, oldTransformFirst, TRANSFORM_FIRST_EDEFAULT, oldTransformFirstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransformFirst() {
		return transformFirstESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				return ((InternalEList<?>)getAbstractTransformerGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__ABSTRACT_TRANSFORMER:
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
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				if (coreType) return getAbstractTransformerGroup();
				return ((FeatureMap.Internal)getAbstractTransformerGroup()).getWrapper();
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__ABSTRACT_TRANSFORMER:
				return getAbstractTransformer();
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__TRANSFORMER_REFS:
				return getTransformerRefs();
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__TRANSFORM_FIRST:
				return isTransformFirst() ? Boolean.TRUE : Boolean.FALSE;
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
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				((FeatureMap.Internal)getAbstractTransformerGroup()).set(newValue);
				return;
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__TRANSFORMER_REFS:
				setTransformerRefs((List<String>)newValue);
				return;
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__TRANSFORM_FIRST:
				setTransformFirst(((Boolean)newValue).booleanValue());
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
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				getAbstractTransformerGroup().clear();
				return;
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__TRANSFORMER_REFS:
				setTransformerRefs(TRANSFORMER_REFS_EDEFAULT);
				return;
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__TRANSFORM_FIRST:
				unsetTransformFirst();
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
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__ABSTRACT_TRANSFORMER_GROUP:
				return abstractTransformerGroup != null && !abstractTransformerGroup.isEmpty();
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__ABSTRACT_TRANSFORMER:
				return !getAbstractTransformer().isEmpty();
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__TRANSFORMER_REFS:
				return TRANSFORMER_REFS_EDEFAULT == null ? transformerRefs != null : !TRANSFORMER_REFS_EDEFAULT.equals(transformerRefs);
			case CorePackage.SELECTIVE_CONSUMER_ROUTER_TYPE__TRANSFORM_FIRST:
				return isSetTransformFirst();
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
		result.append(" (abstractTransformerGroup: ");
		result.append(abstractTransformerGroup);
		result.append(", transformerRefs: ");
		result.append(transformerRefs);
		result.append(", transformFirst: ");
		if (transformFirstESet) result.append(transformFirst); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SelectiveConsumerRouterTypeImpl
