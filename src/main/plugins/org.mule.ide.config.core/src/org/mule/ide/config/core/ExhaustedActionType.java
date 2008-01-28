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
 * A representation of the literals of the enumeration '<em><b>Exhausted Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.core.CorePackage#getExhaustedActionType()
 * @model extendedMetaData="name='exhaustedAction_._type'"
 * @generated
 */
public enum ExhaustedActionType implements Enumerator {
	/**
	 * The '<em><b>WHENEXHAUSTEDGROW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHENEXHAUSTEDGROW_VALUE
	 * @generated
	 * @ordered
	 */
	WHENEXHAUSTEDGROW(0, "WHENEXHAUSTEDGROW", "WHEN_EXHAUSTED_GROW"),

	/**
	 * The '<em><b>WHENEXHAUSTEDWAIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHENEXHAUSTEDWAIT_VALUE
	 * @generated
	 * @ordered
	 */
	WHENEXHAUSTEDWAIT(1, "WHENEXHAUSTEDWAIT", "WHEN_EXHAUSTED_WAIT"),

	/**
	 * The '<em><b>WHENEXHAUSTEDFAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHENEXHAUSTEDFAIL_VALUE
	 * @generated
	 * @ordered
	 */
	WHENEXHAUSTEDFAIL(2, "WHENEXHAUSTEDFAIL", "WHEN_EXHAUSTED_FAIL");

	/**
	 * The '<em><b>WHENEXHAUSTEDGROW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHENEXHAUSTEDGROW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHENEXHAUSTEDGROW
	 * @model literal="WHEN_EXHAUSTED_GROW"
	 * @generated
	 * @ordered
	 */
	public static final int WHENEXHAUSTEDGROW_VALUE = 0;

	/**
	 * The '<em><b>WHENEXHAUSTEDWAIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHENEXHAUSTEDWAIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHENEXHAUSTEDWAIT
	 * @model literal="WHEN_EXHAUSTED_WAIT"
	 * @generated
	 * @ordered
	 */
	public static final int WHENEXHAUSTEDWAIT_VALUE = 1;

	/**
	 * The '<em><b>WHENEXHAUSTEDFAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHENEXHAUSTEDFAIL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHENEXHAUSTEDFAIL
	 * @model literal="WHEN_EXHAUSTED_FAIL"
	 * @generated
	 * @ordered
	 */
	public static final int WHENEXHAUSTEDFAIL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Exhausted Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExhaustedActionType[] VALUES_ARRAY =
		new ExhaustedActionType[] {
			WHENEXHAUSTEDGROW,
			WHENEXHAUSTEDWAIT,
			WHENEXHAUSTEDFAIL,
		};

	/**
	 * A public read-only list of all the '<em><b>Exhausted Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExhaustedActionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Exhausted Action Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExhaustedActionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExhaustedActionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exhausted Action Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExhaustedActionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExhaustedActionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Exhausted Action Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExhaustedActionType get(int value) {
		switch (value) {
			case WHENEXHAUSTEDGROW_VALUE: return WHENEXHAUSTEDGROW;
			case WHENEXHAUSTEDWAIT_VALUE: return WHENEXHAUSTEDWAIT;
			case WHENEXHAUSTEDFAIL_VALUE: return WHENEXHAUSTEDFAIL;
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
	private ExhaustedActionType(int value, String name, String literal) {
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
	
} //ExhaustedActionType
