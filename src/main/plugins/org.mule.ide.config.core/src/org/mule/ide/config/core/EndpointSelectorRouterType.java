/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Endpoint Selector Router Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.core.EndpointSelectorRouterType#getSelectorProperty <em>Selector Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.core.CorePackage#getEndpointSelectorRouterType()
 * @model extendedMetaData="name='endpointSelectorRouterType' kind='elementOnly'"
 * @generated
 */
public interface EndpointSelectorRouterType extends FilteringOutboundRouterType {
	/**
	 * Returns the value of the '<em><b>Selector Property</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selector Property</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selector Property</em>' attribute.
	 * @see #setSelectorProperty(String)
	 * @see org.mule.ide.config.core.CorePackage#getEndpointSelectorRouterType_SelectorProperty()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='selectorProperty'"
	 * @generated
	 */
	String getSelectorProperty();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.core.EndpointSelectorRouterType#getSelectorProperty <em>Selector Property</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector Property</em>' attribute.
	 * @see #getSelectorProperty()
	 * @generated
	 */
	void setSelectorProperty(String value);

} // EndpointSelectorRouterType
