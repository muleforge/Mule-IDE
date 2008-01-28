/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.mule.ide.config.spring.RefType;
import org.mule.ide.config.spring.SpringPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.spring.impl.RefTypeImpl#getBean <em>Bean</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.RefTypeImpl#getLocal <em>Local</em>}</li>
 *   <li>{@link org.mule.ide.config.spring.impl.RefTypeImpl#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefTypeImpl extends EObjectImpl implements RefType {
	/**
	 * The default value of the '{@link #getBean() <em>Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBean()
	 * @generated
	 * @ordered
	 */
	protected static final String BEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBean() <em>Bean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBean()
	 * @generated
	 * @ordered
	 */
	protected String bean = BEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocal() <em>Local</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocal()
	 * @generated
	 * @ordered
	 */
	protected String local = LOCAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected String parent = PARENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SpringPackage.Literals.REF_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBean() {
		return bean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBean(String newBean) {
		String oldBean = bean;
		bean = newBean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.REF_TYPE__BEAN, oldBean, bean));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocal() {
		return local;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocal(String newLocal) {
		String oldLocal = local;
		local = newLocal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.REF_TYPE__LOCAL, oldLocal, local));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(String newParent) {
		String oldParent = parent;
		parent = newParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SpringPackage.REF_TYPE__PARENT, oldParent, parent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SpringPackage.REF_TYPE__BEAN:
				return getBean();
			case SpringPackage.REF_TYPE__LOCAL:
				return getLocal();
			case SpringPackage.REF_TYPE__PARENT:
				return getParent();
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
			case SpringPackage.REF_TYPE__BEAN:
				setBean((String)newValue);
				return;
			case SpringPackage.REF_TYPE__LOCAL:
				setLocal((String)newValue);
				return;
			case SpringPackage.REF_TYPE__PARENT:
				setParent((String)newValue);
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
			case SpringPackage.REF_TYPE__BEAN:
				setBean(BEAN_EDEFAULT);
				return;
			case SpringPackage.REF_TYPE__LOCAL:
				setLocal(LOCAL_EDEFAULT);
				return;
			case SpringPackage.REF_TYPE__PARENT:
				setParent(PARENT_EDEFAULT);
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
			case SpringPackage.REF_TYPE__BEAN:
				return BEAN_EDEFAULT == null ? bean != null : !BEAN_EDEFAULT.equals(bean);
			case SpringPackage.REF_TYPE__LOCAL:
				return LOCAL_EDEFAULT == null ? local != null : !LOCAL_EDEFAULT.equals(local);
			case SpringPackage.REF_TYPE__PARENT:
				return PARENT_EDEFAULT == null ? parent != null : !PARENT_EDEFAULT.equals(parent);
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
		result.append(" (bean: ");
		result.append(bean);
		result.append(", local: ");
		result.append(local);
		result.append(", parent: ");
		result.append(parent);
		result.append(')');
		return result.toString();
	}

} //RefTypeImpl
