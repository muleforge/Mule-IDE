/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.stdio;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Outbound Endpoint Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.stdio.OutboundEndpointType#getSystem <em>System</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.stdio.StdioPackage#getOutboundEndpointType()
 * @model extendedMetaData="name='outboundEndpointType' kind='elementOnly'"
 * @generated
 */
public interface OutboundEndpointType extends org.mule.ide.config.core.OutboundEndpointType {
	/**
	 * Returns the value of the '<em><b>System</b></em>' attribute.
	 * The default value is <code>"IN"</code>.
	 * The literals are from the enumeration {@link org.mule.ide.config.stdio.SystemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System</em>' attribute.
	 * @see org.mule.ide.config.stdio.SystemType
	 * @see #isSetSystem()
	 * @see #unsetSystem()
	 * @see #setSystem(SystemType)
	 * @see org.mule.ide.config.stdio.StdioPackage#getOutboundEndpointType_System()
	 * @model default="IN" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='system'"
	 * @generated
	 */
	SystemType getSystem();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.stdio.OutboundEndpointType#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' attribute.
	 * @see org.mule.ide.config.stdio.SystemType
	 * @see #isSetSystem()
	 * @see #unsetSystem()
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(SystemType value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.stdio.OutboundEndpointType#getSystem <em>System</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSystem()
	 * @see #getSystem()
	 * @see #setSystem(SystemType)
	 * @generated
	 */
	void unsetSystem();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.stdio.OutboundEndpointType#getSystem <em>System</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>System</em>' attribute is set.
	 * @see #unsetSystem()
	 * @see #getSystem()
	 * @see #setSystem(SystemType)
	 * @generated
	 */
	boolean isSetSystem();

} // OutboundEndpointType
