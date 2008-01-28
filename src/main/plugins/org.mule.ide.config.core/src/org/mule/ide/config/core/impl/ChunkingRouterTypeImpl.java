/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mule.ide.config.core.ChunkingRouterType;
import org.mule.ide.config.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunking Router Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.impl.ChunkingRouterTypeImpl#getMessageSize <em>Message Size</em>}</li>
 *   <li>{@link org.mule.ide.config.core.impl.ChunkingRouterTypeImpl#getNumberOfMessages <em>Number Of Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChunkingRouterTypeImpl extends FilteringOutboundRouterTypeImpl implements ChunkingRouterType {
	/**
	 * The default value of the '{@link #getMessageSize() <em>Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSize()
	 * @generated
	 * @ordered
	 */
	protected static final int MESSAGE_SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMessageSize() <em>Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSize()
	 * @generated
	 * @ordered
	 */
	protected int messageSize = MESSAGE_SIZE_EDEFAULT;

	/**
	 * This is true if the Message Size attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean messageSizeESet;

	/**
	 * The default value of the '{@link #getNumberOfMessages() <em>Number Of Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfMessages()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_MESSAGES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfMessages() <em>Number Of Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfMessages()
	 * @generated
	 * @ordered
	 */
	protected int numberOfMessages = NUMBER_OF_MESSAGES_EDEFAULT;

	/**
	 * This is true if the Number Of Messages attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean numberOfMessagesESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChunkingRouterTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.eINSTANCE.getChunkingRouterType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMessageSize() {
		return messageSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageSize(int newMessageSize) {
		int oldMessageSize = messageSize;
		messageSize = newMessageSize;
		boolean oldMessageSizeESet = messageSizeESet;
		messageSizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CHUNKING_ROUTER_TYPE__MESSAGE_SIZE, oldMessageSize, messageSize, !oldMessageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMessageSize() {
		int oldMessageSize = messageSize;
		boolean oldMessageSizeESet = messageSizeESet;
		messageSize = MESSAGE_SIZE_EDEFAULT;
		messageSizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.CHUNKING_ROUTER_TYPE__MESSAGE_SIZE, oldMessageSize, MESSAGE_SIZE_EDEFAULT, oldMessageSizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMessageSize() {
		return messageSizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfMessages() {
		return numberOfMessages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfMessages(int newNumberOfMessages) {
		int oldNumberOfMessages = numberOfMessages;
		numberOfMessages = newNumberOfMessages;
		boolean oldNumberOfMessagesESet = numberOfMessagesESet;
		numberOfMessagesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CHUNKING_ROUTER_TYPE__NUMBER_OF_MESSAGES, oldNumberOfMessages, numberOfMessages, !oldNumberOfMessagesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNumberOfMessages() {
		int oldNumberOfMessages = numberOfMessages;
		boolean oldNumberOfMessagesESet = numberOfMessagesESet;
		numberOfMessages = NUMBER_OF_MESSAGES_EDEFAULT;
		numberOfMessagesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CorePackage.CHUNKING_ROUTER_TYPE__NUMBER_OF_MESSAGES, oldNumberOfMessages, NUMBER_OF_MESSAGES_EDEFAULT, oldNumberOfMessagesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNumberOfMessages() {
		return numberOfMessagesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.CHUNKING_ROUTER_TYPE__MESSAGE_SIZE:
				return new Integer(getMessageSize());
			case CorePackage.CHUNKING_ROUTER_TYPE__NUMBER_OF_MESSAGES:
				return new Integer(getNumberOfMessages());
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
			case CorePackage.CHUNKING_ROUTER_TYPE__MESSAGE_SIZE:
				setMessageSize(((Integer)newValue).intValue());
				return;
			case CorePackage.CHUNKING_ROUTER_TYPE__NUMBER_OF_MESSAGES:
				setNumberOfMessages(((Integer)newValue).intValue());
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
			case CorePackage.CHUNKING_ROUTER_TYPE__MESSAGE_SIZE:
				unsetMessageSize();
				return;
			case CorePackage.CHUNKING_ROUTER_TYPE__NUMBER_OF_MESSAGES:
				unsetNumberOfMessages();
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
			case CorePackage.CHUNKING_ROUTER_TYPE__MESSAGE_SIZE:
				return isSetMessageSize();
			case CorePackage.CHUNKING_ROUTER_TYPE__NUMBER_OF_MESSAGES:
				return isSetNumberOfMessages();
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
		result.append(" (messageSize: ");
		if (messageSizeESet) result.append(messageSize); else result.append("<unset>");
		result.append(", numberOfMessages: ");
		if (numberOfMessagesESet) result.append(numberOfMessages); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ChunkingRouterTypeImpl
