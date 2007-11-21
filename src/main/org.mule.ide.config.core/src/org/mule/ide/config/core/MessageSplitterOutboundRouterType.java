/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Splitter Outbound Router Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.MessageSplitterOutboundRouterType#isHonorSynchronicity <em>Honor Synchronicity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getMessageSplitterOutboundRouterType()
 * @model extendedMetaData="name='messageSplitterOutboundRouterType' kind='elementOnly'"
 * @generated
 */
public interface MessageSplitterOutboundRouterType extends FilteringOutboundRouterType {
	/**
	 * Returns the value of the '<em><b>Honor Synchronicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Honor Synchronicity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Honor Synchronicity</em>' attribute.
	 * @see #isSetHonorSynchronicity()
	 * @see #unsetHonorSynchronicity()
	 * @see #setHonorSynchronicity(boolean)
	 * @see org.mule.ide.config.core.CorePackage#getMessageSplitterOutboundRouterType_HonorSynchronicity()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableBoolean"
	 *        extendedMetaData="kind='attribute' name='honorSynchronicity'"
	 * @generated
	 */
	boolean isHonorSynchronicity();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.MessageSplitterOutboundRouterType#isHonorSynchronicity <em>Honor Synchronicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Honor Synchronicity</em>' attribute.
	 * @see #isSetHonorSynchronicity()
	 * @see #unsetHonorSynchronicity()
	 * @see #isHonorSynchronicity()
	 * @generated
	 */
	void setHonorSynchronicity(boolean value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.core.MessageSplitterOutboundRouterType#isHonorSynchronicity <em>Honor Synchronicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHonorSynchronicity()
	 * @see #isHonorSynchronicity()
	 * @see #setHonorSynchronicity(boolean)
	 * @generated
	 */
	void unsetHonorSynchronicity();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.core.MessageSplitterOutboundRouterType#isHonorSynchronicity <em>Honor Synchronicity</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Honor Synchronicity</em>' attribute is set.
	 * @see #unsetHonorSynchronicity()
	 * @see #isHonorSynchronicity()
	 * @see #setHonorSynchronicity(boolean)
	 * @generated
	 */
	boolean isSetHonorSynchronicity();

} // MessageSplitterOutboundRouterType
