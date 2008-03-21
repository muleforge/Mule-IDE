/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Evaluator Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.core.CorePackage#getEvaluatorType()
 * @model extendedMetaData="name='evaluator_._type'"
 * @generated
 */
public enum EvaluatorType implements Enumerator {
	/**
	 * The '<em><b>Groovy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GROOVY_VALUE
	 * @generated
	 * @ordered
	 */
	GROOVY(0, "groovy", "groovy"),

	/**
	 * The '<em><b>Header</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADER_VALUE
	 * @generated
	 * @ordered
	 */
	HEADER(1, "header", "header"),

	/**
	 * The '<em><b>Headers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADERS_VALUE
	 * @generated
	 * @ordered
	 */
	HEADERS(2, "headers", "headers"),

	/**
	 * The '<em><b>Headers List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADERS_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	HEADERS_LIST(3, "headersList", "headers-list"),

	/**
	 * The '<em><b>Attachment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACHMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACHMENT(4, "attachment", "attachment"),

	/**
	 * The '<em><b>Attachments</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACHMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACHMENTS(5, "attachments", "attachments"),

	/**
	 * The '<em><b>Attachments List</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ATTACHMENTS_LIST_VALUE
	 * @generated
	 * @ordered
	 */
	ATTACHMENTS_LIST(6, "attachmentsList", "attachments-list"),

	/**
	 * The '<em><b>Payload</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYLOAD_VALUE
	 * @generated
	 * @ordered
	 */
	PAYLOAD(7, "payload", "payload"),

	/**
	 * The '<em><b>Xpath</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XPATH_VALUE
	 * @generated
	 * @ordered
	 */
	XPATH(8, "xpath", "xpath"),

	/**
	 * The '<em><b>Jxpath</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JXPATH_VALUE
	 * @generated
	 * @ordered
	 */
	JXPATH(9, "jxpath", "jxpath"),

	/**
	 * The '<em><b>Bean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BEAN(10, "bean", "bean"),

	/**
	 * The '<em><b>Ognl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OGNL_VALUE
	 * @generated
	 * @ordered
	 */
	OGNL(11, "ognl", "ognl"),

	/**
	 * The '<em><b>Function</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FUNCTION_VALUE
	 * @generated
	 * @ordered
	 */
	FUNCTION(12, "function", "function"),

	/**
	 * The '<em><b>Custom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM(13, "custom", "custom");

	/**
	 * The '<em><b>Groovy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Groovy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GROOVY
	 * @model name="groovy"
	 * @generated
	 * @ordered
	 */
	public static final int GROOVY_VALUE = 0;

	/**
	 * The '<em><b>Header</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Header</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEADER
	 * @model name="header"
	 * @generated
	 * @ordered
	 */
	public static final int HEADER_VALUE = 1;

	/**
	 * The '<em><b>Headers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Headers</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEADERS
	 * @model name="headers"
	 * @generated
	 * @ordered
	 */
	public static final int HEADERS_VALUE = 2;

	/**
	 * The '<em><b>Headers List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Headers List</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEADERS_LIST
	 * @model name="headersList" literal="headers-list"
	 * @generated
	 * @ordered
	 */
	public static final int HEADERS_LIST_VALUE = 3;

	/**
	 * The '<em><b>Attachment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Attachment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATTACHMENT
	 * @model name="attachment"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENT_VALUE = 4;

	/**
	 * The '<em><b>Attachments</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Attachments</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATTACHMENTS
	 * @model name="attachments"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENTS_VALUE = 5;

	/**
	 * The '<em><b>Attachments List</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Attachments List</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ATTACHMENTS_LIST
	 * @model name="attachmentsList" literal="attachments-list"
	 * @generated
	 * @ordered
	 */
	public static final int ATTACHMENTS_LIST_VALUE = 6;

	/**
	 * The '<em><b>Payload</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Payload</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAYLOAD
	 * @model name="payload"
	 * @generated
	 * @ordered
	 */
	public static final int PAYLOAD_VALUE = 7;

	/**
	 * The '<em><b>Xpath</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Xpath</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XPATH
	 * @model name="xpath"
	 * @generated
	 * @ordered
	 */
	public static final int XPATH_VALUE = 8;

	/**
	 * The '<em><b>Jxpath</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Jxpath</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JXPATH
	 * @model name="jxpath"
	 * @generated
	 * @ordered
	 */
	public static final int JXPATH_VALUE = 9;

	/**
	 * The '<em><b>Bean</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Bean</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEAN
	 * @model name="bean"
	 * @generated
	 * @ordered
	 */
	public static final int BEAN_VALUE = 10;

	/**
	 * The '<em><b>Ognl</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ognl</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OGNL
	 * @model name="ognl"
	 * @generated
	 * @ordered
	 */
	public static final int OGNL_VALUE = 11;

	/**
	 * The '<em><b>Function</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Function</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FUNCTION
	 * @model name="function"
	 * @generated
	 * @ordered
	 */
	public static final int FUNCTION_VALUE = 12;

	/**
	 * The '<em><b>Custom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Custom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM
	 * @model name="custom"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_VALUE = 13;

	/**
	 * An array of all the '<em><b>Evaluator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EvaluatorType[] VALUES_ARRAY =
		new EvaluatorType[] {
			GROOVY,
			HEADER,
			HEADERS,
			HEADERS_LIST,
			ATTACHMENT,
			ATTACHMENTS,
			ATTACHMENTS_LIST,
			PAYLOAD,
			XPATH,
			JXPATH,
			BEAN,
			OGNL,
			FUNCTION,
			CUSTOM,
		};

	/**
	 * A public read-only list of all the '<em><b>Evaluator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EvaluatorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Evaluator Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvaluatorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaluatorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evaluator Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvaluatorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaluatorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evaluator Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvaluatorType get(int value) {
		switch (value) {
			case GROOVY_VALUE: return GROOVY;
			case HEADER_VALUE: return HEADER;
			case HEADERS_VALUE: return HEADERS;
			case HEADERS_LIST_VALUE: return HEADERS_LIST;
			case ATTACHMENT_VALUE: return ATTACHMENT;
			case ATTACHMENTS_VALUE: return ATTACHMENTS;
			case ATTACHMENTS_LIST_VALUE: return ATTACHMENTS_LIST;
			case PAYLOAD_VALUE: return PAYLOAD;
			case XPATH_VALUE: return XPATH;
			case JXPATH_VALUE: return JXPATH;
			case BEAN_VALUE: return BEAN;
			case OGNL_VALUE: return OGNL;
			case FUNCTION_VALUE: return FUNCTION;
			case CUSTOM_VALUE: return CUSTOM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EvaluatorType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //EvaluatorType
