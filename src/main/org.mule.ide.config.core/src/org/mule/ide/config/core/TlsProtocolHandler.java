/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tls Protocol Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *                 Configure the global Java protocol handler.
 *                 WARNING - Untested.
 *             
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.TlsProtocolHandler#getProtocolHandler <em>Protocol Handler</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getTlsProtocolHandler()
 * @model extendedMetaData="name='tlsProtocolHandler' kind='empty'"
 * @generated
 */
public interface TlsProtocolHandler extends EObject {
	/**
	 * Returns the value of the '<em><b>Protocol Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                     Set the java.protocol.handler.pkgs system property.
	 *                 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Protocol Handler</em>' attribute.
	 * @see #setProtocolHandler(String)
	 * @see org.mule.ide.config.core.CorePackage#getTlsProtocolHandler_ProtocolHandler()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='protocolHandler'"
	 * @generated
	 */
	String getProtocolHandler();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.TlsProtocolHandler#getProtocolHandler <em>Protocol Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Handler</em>' attribute.
	 * @see #getProtocolHandler()
	 * @generated
	 */
	void setProtocolHandler(String value);

} // TlsProtocolHandler
