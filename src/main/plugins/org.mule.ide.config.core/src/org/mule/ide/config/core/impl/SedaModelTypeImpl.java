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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.core.AbstractQueueProfileType;
import org.mule.ide.config.core.Connection;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.SedaModelType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seda Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.SedaModelTypeImpl#getAbstractQueueProfileGroup <em>Abstract Queue Profile Group</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.SedaModelTypeImpl#getAbstractQueueProfile <em>Abstract Queue Profile</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.SedaModelTypeImpl#isInherit <em>Inherit</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.SedaModelTypeImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SedaModelTypeImpl extends AbstractModelTypeImpl implements SedaModelType {
	/**
	 * The cached value of the '{@link #getAbstractQueueProfileGroup() <em>Abstract Queue Profile Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstractQueueProfileGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap abstractQueueProfileGroup;

	/**
	 * The default value of the '{@link #isInherit() <em>Inherit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInherit()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INHERIT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInherit() <em>Inherit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInherit()
	 * @generated
	 * @ordered
	 */
	protected boolean inherit = INHERIT_EDEFAULT;

	/**
	 * This is true if the Inherit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inheritESet;

	/**
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<Connection> connections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * customization
	 */
	protected SedaModelTypeImpl() {
		super();
		//new ConnectionsAdapter().observeModel(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getSedaModelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAbstractQueueProfileGroup() {
		if (abstractQueueProfileGroup == null) {
			abstractQueueProfileGroup = new BasicFeatureMap(this, CorePackage.SEDA_MODEL_TYPE__ABSTRACT_QUEUE_PROFILE_GROUP);
		}
		return abstractQueueProfileGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractQueueProfileType getAbstractQueueProfile() {
		return (AbstractQueueProfileType)getAbstractQueueProfileGroup().get(CorePackage.eINSTANCE.getSedaModelType_AbstractQueueProfile(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstractQueueProfile(AbstractQueueProfileType newAbstractQueueProfile, NotificationChain msgs) {
		return ((FeatureMap.Internal)getAbstractQueueProfileGroup()).basicAdd(CorePackage.eINSTANCE.getSedaModelType_AbstractQueueProfile(), newAbstractQueueProfile, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInherit() {
		return inherit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInherit(boolean newInherit) {
		boolean oldInherit = inherit;
		inherit = newInherit;
		boolean oldInheritESet = inheritESet;
		inheritESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SEDA_MODEL_TYPE__INHERIT, oldInherit, inherit, !oldInheritESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInherit() {
		boolean oldInherit = inherit;
		boolean oldInheritESet = inheritESet;
		inherit = INHERIT_EDEFAULT;
		inheritESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.SEDA_MODEL_TYPE__INHERIT, oldInherit, INHERIT_EDEFAULT, oldInheritESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInherit() {
		return inheritESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentEList<Connection>(Connection.class, this, CorePackage.SEDA_MODEL_TYPE__CONNECTIONS);
		}
		return connections;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SEDA_MODEL_TYPE__ABSTRACT_QUEUE_PROFILE_GROUP:
				return ((InternalEList<?>)getAbstractQueueProfileGroup()).basicRemove(otherEnd, msgs);
			case CorePackage.SEDA_MODEL_TYPE__ABSTRACT_QUEUE_PROFILE:
				return basicSetAbstractQueueProfile(null, msgs);
			case CorePackage.SEDA_MODEL_TYPE__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
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
			case CorePackage.SEDA_MODEL_TYPE__ABSTRACT_QUEUE_PROFILE_GROUP:
				if (coreType) return getAbstractQueueProfileGroup();
				return ((FeatureMap.Internal)getAbstractQueueProfileGroup()).getWrapper();
			case CorePackage.SEDA_MODEL_TYPE__ABSTRACT_QUEUE_PROFILE:
				return getAbstractQueueProfile();
			case CorePackage.SEDA_MODEL_TYPE__INHERIT:
				return isInherit() ? Boolean.TRUE : Boolean.FALSE;
			case CorePackage.SEDA_MODEL_TYPE__CONNECTIONS:
				return getConnections();
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
			case CorePackage.SEDA_MODEL_TYPE__ABSTRACT_QUEUE_PROFILE_GROUP:
				((FeatureMap.Internal)getAbstractQueueProfileGroup()).set(newValue);
				return;
			case CorePackage.SEDA_MODEL_TYPE__INHERIT:
				setInherit(((Boolean)newValue).booleanValue());
				return;
			case CorePackage.SEDA_MODEL_TYPE__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends Connection>)newValue);
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
			case CorePackage.SEDA_MODEL_TYPE__ABSTRACT_QUEUE_PROFILE_GROUP:
				getAbstractQueueProfileGroup().clear();
				return;
			case CorePackage.SEDA_MODEL_TYPE__INHERIT:
				unsetInherit();
				return;
			case CorePackage.SEDA_MODEL_TYPE__CONNECTIONS:
				getConnections().clear();
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
			case CorePackage.SEDA_MODEL_TYPE__ABSTRACT_QUEUE_PROFILE_GROUP:
				return abstractQueueProfileGroup != null && !abstractQueueProfileGroup.isEmpty();
			case CorePackage.SEDA_MODEL_TYPE__ABSTRACT_QUEUE_PROFILE:
				return getAbstractQueueProfile() != null;
			case CorePackage.SEDA_MODEL_TYPE__INHERIT:
				return isSetInherit();
			case CorePackage.SEDA_MODEL_TYPE__CONNECTIONS:
				return connections != null && !connections.isEmpty();
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
		result.append(" (abstractQueueProfileGroup: ");
		result.append(abstractQueueProfileGroup);
		result.append(", inherit: ");
		if (inheritESet) result.append(inherit); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //SedaModelTypeImpl
