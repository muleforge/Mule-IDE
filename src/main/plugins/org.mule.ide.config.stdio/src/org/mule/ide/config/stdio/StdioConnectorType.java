/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.stdio;

import org.mule.ide.config.core.ConnectorType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.mule.ide.config.stdio.StdioConnectorType#getMessageDelayTime <em>Message Delay Time</em>}</li>
 *   <li>{@link org.mule.ide.config.stdio.StdioConnectorType#getOutputMessage <em>Output Message</em>}</li>
 *   <li>{@link org.mule.ide.config.stdio.StdioConnectorType#getOutputMessageCode <em>Output Message Code</em>}</li>
 *   <li>{@link org.mule.ide.config.stdio.StdioConnectorType#getPromptMessage <em>Prompt Message</em>}</li>
 *   <li>{@link org.mule.ide.config.stdio.StdioConnectorType#getPromptMessageCode <em>Prompt Message Code</em>}</li>
 *   <li>{@link org.mule.ide.config.stdio.StdioConnectorType#getResourceBundle <em>Resource Bundle</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.mule.ide.config.stdio.StdioPackage#getStdioConnectorType()
 * @model extendedMetaData="name='stdioConnectorType' kind='elementOnly'"
 * @generated
 */
public interface StdioConnectorType extends ConnectorType {
	/**
	 * Returns the value of the '<em><b>Message Delay Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Delay (ms) before printing prompt to stdout.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Message Delay Time</em>' attribute.
	 * @see #isSetMessageDelayTime()
	 * @see #unsetMessageDelayTime()
	 * @see #setMessageDelayTime(long)
	 * @see org.mule.ide.config.stdio.StdioPackage#getStdioConnectorType_MessageDelayTime()
	 * @model unsettable="true" dataType="org.mule.ide.config.core.SubstitutableLong"
	 *        extendedMetaData="kind='attribute' name='messageDelayTime'"
	 * @generated
	 */
	long getMessageDelayTime();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.stdio.StdioConnectorType#getMessageDelayTime <em>Message Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Delay Time</em>' attribute.
	 * @see #isSetMessageDelayTime()
	 * @see #unsetMessageDelayTime()
	 * @see #getMessageDelayTime()
	 * @generated
	 */
	void setMessageDelayTime(long value);

	/**
	 * Unsets the value of the '{@link org.mule.ide.config.stdio.StdioConnectorType#getMessageDelayTime <em>Message Delay Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMessageDelayTime()
	 * @see #getMessageDelayTime()
	 * @see #setMessageDelayTime(long)
	 * @generated
	 */
	void unsetMessageDelayTime();

	/**
	 * Returns whether the value of the '{@link org.mule.ide.config.stdio.StdioConnectorType#getMessageDelayTime <em>Message Delay Time</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Message Delay Time</em>' attribute is set.
	 * @see #unsetMessageDelayTime()
	 * @see #getMessageDelayTime()
	 * @see #setMessageDelayTime(long)
	 * @generated
	 */
	boolean isSetMessageDelayTime();

	/**
	 * Returns the value of the '<em><b>Output Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Text printed to stdout when a message is sent.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Message</em>' attribute.
	 * @see #setOutputMessage(String)
	 * @see org.mule.ide.config.stdio.StdioPackage#getStdioConnectorType_OutputMessage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='outputMessage'"
	 * @generated
	 */
	String getOutputMessage();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.stdio.StdioConnectorType#getOutputMessage <em>Output Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Message</em>' attribute.
	 * @see #getOutputMessage()
	 * @generated
	 */
	void setOutputMessage(String value);

	/**
	 * Returns the value of the '<em><b>Output Message Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Code used to retrieve output message from resource bundle.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Output Message Code</em>' attribute.
	 * @see #setOutputMessageCode(String)
	 * @see org.mule.ide.config.stdio.StdioPackage#getStdioConnectorType_OutputMessageCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='outputMessageCode'"
	 * @generated
	 */
	String getOutputMessageCode();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.stdio.StdioConnectorType#getOutputMessageCode <em>Output Message Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Message Code</em>' attribute.
	 * @see #getOutputMessageCode()
	 * @generated
	 */
	void setOutputMessageCode(String value);

	/**
	 * Returns the value of the '<em><b>Prompt Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Text printed to stdout when waiting for input.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prompt Message</em>' attribute.
	 * @see #setPromptMessage(String)
	 * @see org.mule.ide.config.stdio.StdioPackage#getStdioConnectorType_PromptMessage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='promptMessage'"
	 * @generated
	 */
	String getPromptMessage();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.stdio.StdioConnectorType#getPromptMessage <em>Prompt Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt Message</em>' attribute.
	 * @see #getPromptMessage()
	 * @generated
	 */
	void setPromptMessage(String value);

	/**
	 * Returns the value of the '<em><b>Prompt Message Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Code used to retrieve prompt message from resource bundle.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prompt Message Code</em>' attribute.
	 * @see #setPromptMessageCode(String)
	 * @see org.mule.ide.config.stdio.StdioPackage#getStdioConnectorType_PromptMessageCode()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='promptMessageCode'"
	 * @generated
	 */
	String getPromptMessageCode();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.stdio.StdioConnectorType#getPromptMessageCode <em>Prompt Message Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prompt Message Code</em>' attribute.
	 * @see #getPromptMessageCode()
	 * @generated
	 */
	void setPromptMessageCode(String value);

	/**
	 * Returns the value of the '<em><b>Resource Bundle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *                             Resource bundle to provide prompt, with promptMessageCode.
	 *                         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Bundle</em>' attribute.
	 * @see #setResourceBundle(String)
	 * @see org.mule.ide.config.stdio.StdioPackage#getStdioConnectorType_ResourceBundle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='resourceBundle'"
	 * @generated
	 */
	String getResourceBundle();

	/**
	 * Sets the value of the '{@link org.mule.ide.config.stdio.StdioConnectorType#getResourceBundle <em>Resource Bundle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Bundle</em>' attribute.
	 * @see #getResourceBundle()
	 * @generated
	 */
	void setResourceBundle(String value);

} // StdioConnectorType
