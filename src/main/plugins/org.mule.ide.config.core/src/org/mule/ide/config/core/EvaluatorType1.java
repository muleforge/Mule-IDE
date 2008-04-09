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
 * A representation of the literals of the enumeration '<em><b>Evaluator Type1</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.core.CorePackage#getEvaluatorType1()
 * @model extendedMetaData="name='evaluator_._1_._type'"
 * @generated
 */
public enum EvaluatorType1 implements Enumerator {
	/**
	 * The '<em><b>Header</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADER_VALUE
	 * @generated
	 * @ordered
	 */
	HEADER(0, "header", "header"),

	/**
	 * The '<em><b>Payload Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYLOAD_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	PAYLOAD_TYPE(1, "payloadType", "payload-type"),

	/**
	 * The '<em><b>Exception Type</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCEPTION_TYPE_VALUE
	 * @generated
	 * @ordered
	 */
	EXCEPTION_TYPE(2, "exceptionType", "exception-type"),

	/**
	 * The '<em><b>Wildcard</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WILDCARD_VALUE
	 * @generated
	 * @ordered
	 */
	WILDCARD(3, "wildcard", "wildcard"),

	/**
	 * The '<em><b>Regex</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGEX_VALUE
	 * @generated
	 * @ordered
	 */
	REGEX(4, "regex", "regex"),

	/**
	 * The '<em><b>Ognl</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OGNL_VALUE
	 * @generated
	 * @ordered
	 */
	OGNL(5, "ognl", "ognl"),

	/**
	 * The '<em><b>Xpath</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XPATH_VALUE
	 * @generated
	 * @ordered
	 */
	XPATH(6, "xpath", "xpath"),

	/**
	 * The '<em><b>Jxpath</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JXPATH_VALUE
	 * @generated
	 * @ordered
	 */
	JXPATH(7, "jxpath", "jxpath"),

	/**
	 * The '<em><b>Bean</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEAN_VALUE
	 * @generated
	 * @ordered
	 */
	BEAN(8, "bean", "bean"),

	/**
	 * The '<em><b>Custom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM(9, "custom", "custom");

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
	public static final int HEADER_VALUE = 0;

	/**
	 * The '<em><b>Payload Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Payload Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAYLOAD_TYPE
	 * @model name="payloadType" literal="payload-type"
	 * @generated
	 * @ordered
	 */
	public static final int PAYLOAD_TYPE_VALUE = 1;

	/**
	 * The '<em><b>Exception Type</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Exception Type</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCEPTION_TYPE
	 * @model name="exceptionType" literal="exception-type"
	 * @generated
	 * @ordered
	 */
	public static final int EXCEPTION_TYPE_VALUE = 2;

	/**
	 * The '<em><b>Wildcard</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wildcard</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WILDCARD
	 * @model name="wildcard"
	 * @generated
	 * @ordered
	 */
	public static final int WILDCARD_VALUE = 3;

	/**
	 * The '<em><b>Regex</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Regex</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGEX
	 * @model name="regex"
	 * @generated
	 * @ordered
	 */
	public static final int REGEX_VALUE = 4;

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
	public static final int OGNL_VALUE = 5;

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
	public static final int XPATH_VALUE = 6;

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
	public static final int JXPATH_VALUE = 7;

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
	public static final int BEAN_VALUE = 8;

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
	public static final int CUSTOM_VALUE = 9;

	/**
	 * An array of all the '<em><b>Evaluator Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EvaluatorType1[] VALUES_ARRAY =
		new EvaluatorType1[] {
			HEADER,
			PAYLOAD_TYPE,
			EXCEPTION_TYPE,
			WILDCARD,
			REGEX,
			OGNL,
			XPATH,
			JXPATH,
			BEAN,
			CUSTOM,
		};

	/**
	 * A public read-only list of all the '<em><b>Evaluator Type1</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EvaluatorType1> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Evaluator Type1</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvaluatorType1 get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaluatorType1 result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evaluator Type1</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvaluatorType1 getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EvaluatorType1 result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Evaluator Type1</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EvaluatorType1 get(int value) {
		switch (value) {
			case HEADER_VALUE: return HEADER;
			case PAYLOAD_TYPE_VALUE: return PAYLOAD_TYPE;
			case EXCEPTION_TYPE_VALUE: return EXCEPTION_TYPE;
			case WILDCARD_VALUE: return WILDCARD;
			case REGEX_VALUE: return REGEX;
			case OGNL_VALUE: return OGNL;
			case XPATH_VALUE: return XPATH;
			case JXPATH_VALUE: return JXPATH;
			case BEAN_VALUE: return BEAN;
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
	private EvaluatorType1(int value, String name, String literal) {
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
	
} //EvaluatorType1
