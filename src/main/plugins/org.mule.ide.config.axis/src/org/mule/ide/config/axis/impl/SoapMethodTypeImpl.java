/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.axis.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mule.ide.config.axis.AxisPackage;
import org.mule.ide.config.axis.SoapMethodType;
import org.mule.ide.config.axis.SoapParameterType;
import org.mule.ide.config.axis.SoapReturnType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Soap Method Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.axis.impl.SoapMethodTypeImpl#getSoapParameter <em>Soap Parameter</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.SoapMethodTypeImpl#getSoapReturn <em>Soap Return</em>}</li>
 *   <li>{@link org.mule.ide.config.axis.impl.SoapMethodTypeImpl#getMethod <em>Method</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SoapMethodTypeImpl extends EObjectImpl implements SoapMethodType {
	/**
	 * The cached value of the '{@link #getSoapParameter() <em>Soap Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoapParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<SoapParameterType> soapParameter;

	/**
	 * The cached value of the '{@link #getSoapReturn() <em>Soap Return</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoapReturn()
	 * @generated
	 * @ordered
	 */
	protected SoapReturnType soapReturn;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected String method = METHOD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SoapMethodTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AxisPackage.Literals.SOAP_METHOD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SoapParameterType> getSoapParameter() {
		if (soapParameter == null) {
			soapParameter = new EObjectContainmentEList<SoapParameterType>(SoapParameterType.class, this, AxisPackage.SOAP_METHOD_TYPE__SOAP_PARAMETER);
		}
		return soapParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SoapReturnType getSoapReturn() {
		return soapReturn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoapReturn(SoapReturnType newSoapReturn, NotificationChain msgs) {
		SoapReturnType oldSoapReturn = soapReturn;
		soapReturn = newSoapReturn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AxisPackage.SOAP_METHOD_TYPE__SOAP_RETURN, oldSoapReturn, newSoapReturn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoapReturn(SoapReturnType newSoapReturn) {
		if (newSoapReturn != soapReturn) {
			NotificationChain msgs = null;
			if (soapReturn != null)
				msgs = ((InternalEObject)soapReturn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AxisPackage.SOAP_METHOD_TYPE__SOAP_RETURN, null, msgs);
			if (newSoapReturn != null)
				msgs = ((InternalEObject)newSoapReturn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AxisPackage.SOAP_METHOD_TYPE__SOAP_RETURN, null, msgs);
			msgs = basicSetSoapReturn(newSoapReturn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.SOAP_METHOD_TYPE__SOAP_RETURN, newSoapReturn, newSoapReturn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMethod(String newMethod) {
		String oldMethod = method;
		method = newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AxisPackage.SOAP_METHOD_TYPE__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AxisPackage.SOAP_METHOD_TYPE__SOAP_PARAMETER:
				return ((InternalEList<?>)getSoapParameter()).basicRemove(otherEnd, msgs);
			case AxisPackage.SOAP_METHOD_TYPE__SOAP_RETURN:
				return basicSetSoapReturn(null, msgs);
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
			case AxisPackage.SOAP_METHOD_TYPE__SOAP_PARAMETER:
				return getSoapParameter();
			case AxisPackage.SOAP_METHOD_TYPE__SOAP_RETURN:
				return getSoapReturn();
			case AxisPackage.SOAP_METHOD_TYPE__METHOD:
				return getMethod();
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
			case AxisPackage.SOAP_METHOD_TYPE__SOAP_PARAMETER:
				getSoapParameter().clear();
				getSoapParameter().addAll((Collection<? extends SoapParameterType>)newValue);
				return;
			case AxisPackage.SOAP_METHOD_TYPE__SOAP_RETURN:
				setSoapReturn((SoapReturnType)newValue);
				return;
			case AxisPackage.SOAP_METHOD_TYPE__METHOD:
				setMethod((String)newValue);
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
			case AxisPackage.SOAP_METHOD_TYPE__SOAP_PARAMETER:
				getSoapParameter().clear();
				return;
			case AxisPackage.SOAP_METHOD_TYPE__SOAP_RETURN:
				setSoapReturn((SoapReturnType)null);
				return;
			case AxisPackage.SOAP_METHOD_TYPE__METHOD:
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
			case AxisPackage.SOAP_METHOD_TYPE__SOAP_PARAMETER:
				return soapParameter != null && !soapParameter.isEmpty();
			case AxisPackage.SOAP_METHOD_TYPE__SOAP_RETURN:
				return soapReturn != null;
			case AxisPackage.SOAP_METHOD_TYPE__METHOD:
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
		result.append(" (method: ");
		result.append(method);
		result.append(')');
		return result.toString();
	}

} //SoapMethodTypeImpl
