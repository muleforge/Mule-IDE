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
 * A representation of the literals of the enumeration '<em><b>Initialisation Policy Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.core.CorePackage#getInitialisationPolicyType()
 * @model extendedMetaData="name='initialisationPolicy_._type'"
 * @generated
 */
public enum InitialisationPolicyType implements Enumerator {
	/**
	 * The '<em><b>INITIALISENONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALISENONE_VALUE
	 * @generated
	 * @ordered
	 */
	INITIALISENONE(0, "INITIALISENONE", "INITIALISE_NONE"),

	/**
	 * The '<em><b>INITIALISEONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALISEONE_VALUE
	 * @generated
	 * @ordered
	 */
	INITIALISEONE(1, "INITIALISEONE", "INITIALISE_ONE"),

	/**
	 * The '<em><b>INITIALISEALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INITIALISEALL_VALUE
	 * @generated
	 * @ordered
	 */
	INITIALISEALL(2, "INITIALISEALL", "INITIALISE_ALL");

	/**
	 * The '<em><b>INITIALISENONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INITIALISENONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIALISENONE
	 * @model literal="INITIALISE_NONE"
	 * @generated
	 * @ordered
	 */
	public static final int INITIALISENONE_VALUE = 0;

	/**
	 * The '<em><b>INITIALISEONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INITIALISEONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIALISEONE
	 * @model literal="INITIALISE_ONE"
	 * @generated
	 * @ordered
	 */
	public static final int INITIALISEONE_VALUE = 1;

	/**
	 * The '<em><b>INITIALISEALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INITIALISEALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INITIALISEALL
	 * @model literal="INITIALISE_ALL"
	 * @generated
	 * @ordered
	 */
	public static final int INITIALISEALL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Initialisation Policy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InitialisationPolicyType[] VALUES_ARRAY =
		new InitialisationPolicyType[] {
			INITIALISENONE,
			INITIALISEONE,
			INITIALISEALL,
		};

	/**
	 * A public read-only list of all the '<em><b>Initialisation Policy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InitialisationPolicyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Initialisation Policy Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitialisationPolicyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InitialisationPolicyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Initialisation Policy Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitialisationPolicyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InitialisationPolicyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Initialisation Policy Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InitialisationPolicyType get(int value) {
		switch (value) {
			case INITIALISENONE_VALUE: return INITIALISENONE;
			case INITIALISEONE_VALUE: return INITIALISEONE;
			case INITIALISEALL_VALUE: return INITIALISEALL;
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
	private InitialisationPolicyType(int value, String name, String literal) {
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
	
} //InitialisationPolicyType
