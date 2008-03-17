/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.stdio.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mule.ide.config.core.impl.ConnectorTypeImpl;

import org.mule.ide.config.stdio.StdioConnectorType;
import org.mule.ide.config.stdio.StdioPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.stdio.impl.StdioConnectorTypeImpl#getMessageDelayTime <em>Message Delay Time</em>}</li>
 *   <li>{@link org.mule.ide.config.stdio.impl.StdioConnectorTypeImpl#getOutputMessage <em>Output Message</em>}</li>
 *   <li>{@link org.mule.ide.config.stdio.impl.StdioConnectorTypeImpl#getOutputMessageCode <em>Output Message Code</em>}</li>
 *   <li>{@link org.mule.ide.config.stdio.impl.StdioConnectorTypeImpl#getPromptMessage <em>Prompt Message</em>}</li>
 *   <li>{@link org.mule.ide.config.stdio.impl.StdioConnectorTypeImpl#getPromptMessageCode <em>Prompt Message Code</em>}</li>
 *   <li>{@link org.mule.ide.config.stdio.impl.StdioConnectorTypeImpl#getResourceBundle <em>Resource Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StdioConnectorTypeImpl extends ConnectorTypeImpl implements StdioConnectorType {
	/**
	 * The default value of the '{@link #getMessageDelayTime() <em>Message Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDelayTime()
	 * @generated
	 * @ordered
	 */
	protected static final long MESSAGE_DELAY_TIME_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMessageDelayTime() <em>Message Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageDelayTime()
	 * @generated
	 * @ordered
	 */
	protected long messageDelayTime = MESSAGE_DELAY_TIME_EDEFAULT;

	/**
	 * This is true if the Message Delay Time attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean messageDelayTimeESet;

	/**
	 * The default value of the '{@link #getOutputMessage() <em>Output Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputMessage() <em>Output Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMessage()
	 * @generated
	 * @ordered
	 */
	protected String outputMessage = OUTPUT_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputMessageCode() <em>Output Message Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMessageCode()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_MESSAGE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputMessageCode() <em>Output Message Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputMessageCode()
	 * @generated
	 * @ordered
	 */
	protected String outputMessageCode = OUTPUT_MESSAGE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPromptMessage() <em>Prompt Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromptMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String PROMPT_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPromptMessage() <em>Prompt Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromptMessage()
	 * @generated
	 * @ordered
	 */
	protected String promptMessage = PROMPT_MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPromptMessageCode() <em>Prompt Message Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromptMessageCode()
	 * @generated
	 * @ordered
	 */
	protected static final String PROMPT_MESSAGE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPromptMessageCode() <em>Prompt Message Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPromptMessageCode()
	 * @generated
	 * @ordered
	 */
	protected String promptMessageCode = PROMPT_MESSAGE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceBundle() <em>Resource Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceBundle()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_BUNDLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceBundle() <em>Resource Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceBundle()
	 * @generated
	 * @ordered
	 */
	protected String resourceBundle = RESOURCE_BUNDLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StdioConnectorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StdioPackage.Literals.STDIO_CONNECTOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMessageDelayTime() {
		return messageDelayTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageDelayTime(long newMessageDelayTime) {
		long oldMessageDelayTime = messageDelayTime;
		messageDelayTime = newMessageDelayTime;
		boolean oldMessageDelayTimeESet = messageDelayTimeESet;
		messageDelayTimeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StdioPackage.STDIO_CONNECTOR_TYPE__MESSAGE_DELAY_TIME, oldMessageDelayTime, messageDelayTime, !oldMessageDelayTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMessageDelayTime() {
		long oldMessageDelayTime = messageDelayTime;
		boolean oldMessageDelayTimeESet = messageDelayTimeESet;
		messageDelayTime = MESSAGE_DELAY_TIME_EDEFAULT;
		messageDelayTimeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, StdioPackage.STDIO_CONNECTOR_TYPE__MESSAGE_DELAY_TIME, oldMessageDelayTime, MESSAGE_DELAY_TIME_EDEFAULT, oldMessageDelayTimeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMessageDelayTime() {
		return messageDelayTimeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputMessage() {
		return outputMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputMessage(String newOutputMessage) {
		String oldOutputMessage = outputMessage;
		outputMessage = newOutputMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StdioPackage.STDIO_CONNECTOR_TYPE__OUTPUT_MESSAGE, oldOutputMessage, outputMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputMessageCode() {
		return outputMessageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputMessageCode(String newOutputMessageCode) {
		String oldOutputMessageCode = outputMessageCode;
		outputMessageCode = newOutputMessageCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StdioPackage.STDIO_CONNECTOR_TYPE__OUTPUT_MESSAGE_CODE, oldOutputMessageCode, outputMessageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPromptMessage() {
		return promptMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPromptMessage(String newPromptMessage) {
		String oldPromptMessage = promptMessage;
		promptMessage = newPromptMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StdioPackage.STDIO_CONNECTOR_TYPE__PROMPT_MESSAGE, oldPromptMessage, promptMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPromptMessageCode() {
		return promptMessageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPromptMessageCode(String newPromptMessageCode) {
		String oldPromptMessageCode = promptMessageCode;
		promptMessageCode = newPromptMessageCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StdioPackage.STDIO_CONNECTOR_TYPE__PROMPT_MESSAGE_CODE, oldPromptMessageCode, promptMessageCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceBundle() {
		return resourceBundle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceBundle(String newResourceBundle) {
		String oldResourceBundle = resourceBundle;
		resourceBundle = newResourceBundle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StdioPackage.STDIO_CONNECTOR_TYPE__RESOURCE_BUNDLE, oldResourceBundle, resourceBundle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StdioPackage.STDIO_CONNECTOR_TYPE__MESSAGE_DELAY_TIME:
				return new Long(getMessageDelayTime());
			case StdioPackage.STDIO_CONNECTOR_TYPE__OUTPUT_MESSAGE:
				return getOutputMessage();
			case StdioPackage.STDIO_CONNECTOR_TYPE__OUTPUT_MESSAGE_CODE:
				return getOutputMessageCode();
			case StdioPackage.STDIO_CONNECTOR_TYPE__PROMPT_MESSAGE:
				return getPromptMessage();
			case StdioPackage.STDIO_CONNECTOR_TYPE__PROMPT_MESSAGE_CODE:
				return getPromptMessageCode();
			case StdioPackage.STDIO_CONNECTOR_TYPE__RESOURCE_BUNDLE:
				return getResourceBundle();
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
			case StdioPackage.STDIO_CONNECTOR_TYPE__MESSAGE_DELAY_TIME:
				setMessageDelayTime(((Long)newValue).longValue());
				return;
			case StdioPackage.STDIO_CONNECTOR_TYPE__OUTPUT_MESSAGE:
				setOutputMessage((String)newValue);
				return;
			case StdioPackage.STDIO_CONNECTOR_TYPE__OUTPUT_MESSAGE_CODE:
				setOutputMessageCode((String)newValue);
				return;
			case StdioPackage.STDIO_CONNECTOR_TYPE__PROMPT_MESSAGE:
				setPromptMessage((String)newValue);
				return;
			case StdioPackage.STDIO_CONNECTOR_TYPE__PROMPT_MESSAGE_CODE:
				setPromptMessageCode((String)newValue);
				return;
			case StdioPackage.STDIO_CONNECTOR_TYPE__RESOURCE_BUNDLE:
				setResourceBundle((String)newValue);
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
			case StdioPackage.STDIO_CONNECTOR_TYPE__MESSAGE_DELAY_TIME:
				unsetMessageDelayTime();
				return;
			case StdioPackage.STDIO_CONNECTOR_TYPE__OUTPUT_MESSAGE:
				setOutputMessage(OUTPUT_MESSAGE_EDEFAULT);
				return;
			case StdioPackage.STDIO_CONNECTOR_TYPE__OUTPUT_MESSAGE_CODE:
				setOutputMessageCode(OUTPUT_MESSAGE_CODE_EDEFAULT);
				return;
			case StdioPackage.STDIO_CONNECTOR_TYPE__PROMPT_MESSAGE:
				setPromptMessage(PROMPT_MESSAGE_EDEFAULT);
				return;
			case StdioPackage.STDIO_CONNECTOR_TYPE__PROMPT_MESSAGE_CODE:
				setPromptMessageCode(PROMPT_MESSAGE_CODE_EDEFAULT);
				return;
			case StdioPackage.STDIO_CONNECTOR_TYPE__RESOURCE_BUNDLE:
				setResourceBundle(RESOURCE_BUNDLE_EDEFAULT);
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
			case StdioPackage.STDIO_CONNECTOR_TYPE__MESSAGE_DELAY_TIME:
				return isSetMessageDelayTime();
			case StdioPackage.STDIO_CONNECTOR_TYPE__OUTPUT_MESSAGE:
				return OUTPUT_MESSAGE_EDEFAULT == null ? outputMessage != null : !OUTPUT_MESSAGE_EDEFAULT.equals(outputMessage);
			case StdioPackage.STDIO_CONNECTOR_TYPE__OUTPUT_MESSAGE_CODE:
				return OUTPUT_MESSAGE_CODE_EDEFAULT == null ? outputMessageCode != null : !OUTPUT_MESSAGE_CODE_EDEFAULT.equals(outputMessageCode);
			case StdioPackage.STDIO_CONNECTOR_TYPE__PROMPT_MESSAGE:
				return PROMPT_MESSAGE_EDEFAULT == null ? promptMessage != null : !PROMPT_MESSAGE_EDEFAULT.equals(promptMessage);
			case StdioPackage.STDIO_CONNECTOR_TYPE__PROMPT_MESSAGE_CODE:
				return PROMPT_MESSAGE_CODE_EDEFAULT == null ? promptMessageCode != null : !PROMPT_MESSAGE_CODE_EDEFAULT.equals(promptMessageCode);
			case StdioPackage.STDIO_CONNECTOR_TYPE__RESOURCE_BUNDLE:
				return RESOURCE_BUNDLE_EDEFAULT == null ? resourceBundle != null : !RESOURCE_BUNDLE_EDEFAULT.equals(resourceBundle);
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
		result.append(" (messageDelayTime: ");
		if (messageDelayTimeESet) result.append(messageDelayTime); else result.append("<unset>");
		result.append(", outputMessage: ");
		result.append(outputMessage);
		result.append(", outputMessageCode: ");
		result.append(outputMessageCode);
		result.append(", promptMessage: ");
		result.append(promptMessage);
		result.append(", promptMessageCode: ");
		result.append(promptMessageCode);
		result.append(", resourceBundle: ");
		result.append(resourceBundle);
		result.append(')');
		return result.toString();
	}

} //StdioConnectorTypeImpl
