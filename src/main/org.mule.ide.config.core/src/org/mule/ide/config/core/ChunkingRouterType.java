/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunking Router Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.ChunkingRouterType#getMessageSize <em>Message Size</em>}</li>
 *   <li>{@link org.mule.ide.config.core.ChunkingRouterType#getNumberOfMessages <em>Number Of Messages</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getChunkingRouterType()
 * @model extendedMetaData="name='chunkingRouterType' kind='elementOnly'"
 * @generated
 */
public interface ChunkingRouterType extends FilteringOutboundRouterType {
	/**
	 * Returns the value of the '<em><b>Message Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Size</em>' attribute.
	 * @see #isSetMessageSize()
	 * @see #unsetMessageSize()
	 * @see #setMessageSize(int)
	 * @see org.mule.ide.config.core.CorePackage#getChunkingRouterType_MessageSize()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableInt"
	 *        extendedMetaData="kind='attribute' name='messageSize'"
	 * @generated
	 */
	int getMessageSize();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ChunkingRouterType#getMessageSize <em>Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Size</em>' attribute.
	 * @see #isSetMessageSize()
	 * @see #unsetMessageSize()
	 * @see #getMessageSize()
	 * @generated
	 */
	void setMessageSize(int value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ChunkingRouterType#getMessageSize <em>Message Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessageSize()
	 * @see #getMessageSize()
	 * @see #setMessageSize(int)
	 * @generated
	 */
	void unsetMessageSize();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ChunkingRouterType#getMessageSize <em>Message Size</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Message Size</em>' attribute is set.
	 * @see #unsetMessageSize()
	 * @see #getMessageSize()
	 * @see #setMessageSize(int)
	 * @generated
	 */
	boolean isSetMessageSize();

	/**
	 * Returns the value of the '<em><b>Number Of Messages</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Messages</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Messages</em>' attribute.
	 * @see #isSetNumberOfMessages()
	 * @see #unsetNumberOfMessages()
	 * @see #setNumberOfMessages(int)
	 * @see org.mule.ide.config.core.CorePackage#getChunkingRouterType_NumberOfMessages()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableInt"
	 *        extendedMetaData="kind='attribute' name='numberOfMessages'"
	 * @generated
	 */
	int getNumberOfMessages();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.ChunkingRouterType#getNumberOfMessages <em>Number Of Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Messages</em>' attribute.
	 * @see #isSetNumberOfMessages()
	 * @see #unsetNumberOfMessages()
	 * @see #getNumberOfMessages()
	 * @generated
	 */
	void setNumberOfMessages(int value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.ChunkingRouterType#getNumberOfMessages <em>Number Of Messages</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNumberOfMessages()
	 * @see #getNumberOfMessages()
	 * @see #setNumberOfMessages(int)
	 * @generated
	 */
	void unsetNumberOfMessages();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.ChunkingRouterType#getNumberOfMessages <em>Number Of Messages</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Number Of Messages</em>' attribute is set.
	 * @see #unsetNumberOfMessages()
	 * @see #getNumberOfMessages()
	 * @see #setNumberOfMessages(int)
	 * @generated
	 */
	boolean isSetNumberOfMessages();

} // ChunkingRouterType
