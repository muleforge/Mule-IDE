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
 * A representation of the literals of the enumeration '<em><b>Pool Exhausted Action Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.core.CorePackage#getPoolExhaustedActionType()
 * @model extendedMetaData="name='poolExhaustedAction_._type'"
 * @generated
 */
public enum PoolExhaustedActionType implements Enumerator {
	/**
	 * The '<em><b>WAIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAIT_VALUE
	 * @generated
	 * @ordered
	 */
	WAIT(0, "WAIT", "WAIT"),

	/**
	 * The '<em><b>DISCARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCARD_VALUE
	 * @generated
	 * @ordered
	 */
	DISCARD(1, "DISCARD", "DISCARD"),

	/**
	 * The '<em><b>DISCARDOLDEST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCARDOLDEST_VALUE
	 * @generated
	 * @ordered
	 */
	DISCARDOLDEST(2, "DISCARDOLDEST", "DISCARD_OLDEST"),

	/**
	 * The '<em><b>ABORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORT_VALUE
	 * @generated
	 * @ordered
	 */
	ABORT(3, "ABORT", "ABORT"),

	/**
	 * The '<em><b>RUN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RUN_VALUE
	 * @generated
	 * @ordered
	 */
	RUN(4, "RUN", "RUN");

	/**
	 * The '<em><b>WAIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WAIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WAIT_VALUE = 0;

	/**
	 * The '<em><b>DISCARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISCARD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DISCARD_VALUE = 1;

	/**
	 * The '<em><b>DISCARDOLDEST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DISCARDOLDEST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCARDOLDEST
	 * @model literal="DISCARD_OLDEST"
	 * @generated
	 * @ordered
	 */
	public static final int DISCARDOLDEST_VALUE = 2;

	/**
	 * The '<em><b>ABORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABORT_VALUE = 3;

	/**
	 * The '<em><b>RUN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RUN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RUN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RUN_VALUE = 4;

	/**
	 * An array of all the '<em><b>Pool Exhausted Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PoolExhaustedActionType[] VALUES_ARRAY =
		new PoolExhaustedActionType[] {
			WAIT,
			DISCARD,
			DISCARDOLDEST,
			ABORT,
			RUN,
		};

	/**
	 * A public read-only list of all the '<em><b>Pool Exhausted Action Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PoolExhaustedActionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pool Exhausted Action Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PoolExhaustedActionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PoolExhaustedActionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pool Exhausted Action Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PoolExhaustedActionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PoolExhaustedActionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pool Exhausted Action Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PoolExhaustedActionType get(int value) {
		switch (value) {
			case WAIT_VALUE: return WAIT;
			case DISCARD_VALUE: return DISCARD;
			case DISCARDOLDEST_VALUE: return DISCARDOLDEST;
			case ABORT_VALUE: return ABORT;
			case RUN_VALUE: return RUN;
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
	private PoolExhaustedActionType(int value, String name, String literal) {
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
	
} //PoolExhaustedActionType
