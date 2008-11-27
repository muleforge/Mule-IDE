/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.jms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Acknowledgement Mode Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.jms.JMSPackage#getAcknowledgementModeType()
 * @model extendedMetaData="name='acknowledgementMode_._type'"
 * @generated
 */
public enum AcknowledgementModeType implements Enumerator {
	/**
	 * The '<em><b>AUTOACKNOWLEDGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTOACKNOWLEDGE_VALUE
	 * @generated
	 * @ordered
	 */
	AUTOACKNOWLEDGE(0, "AUTOACKNOWLEDGE", "AUTO_ACKNOWLEDGE"),

	/**
	 * The '<em><b>CLIENTACKNOWLEDGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENTACKNOWLEDGE_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENTACKNOWLEDGE(1, "CLIENTACKNOWLEDGE", "CLIENT_ACKNOWLEDGE"),

	/**
	 * The '<em><b>DUPSOKACKNOWLEDGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUPSOKACKNOWLEDGE_VALUE
	 * @generated
	 * @ordered
	 */
	DUPSOKACKNOWLEDGE(2, "DUPSOKACKNOWLEDGE", "DUPS_OK_ACKNOWLEDGE");

	/**
	 * The '<em><b>AUTOACKNOWLEDGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTOACKNOWLEDGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTOACKNOWLEDGE
	 * @model literal="AUTO_ACKNOWLEDGE"
	 * @generated
	 * @ordered
	 */
	public static final int AUTOACKNOWLEDGE_VALUE = 0;

	/**
	 * The '<em><b>CLIENTACKNOWLEDGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLIENTACKNOWLEDGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLIENTACKNOWLEDGE
	 * @model literal="CLIENT_ACKNOWLEDGE"
	 * @generated
	 * @ordered
	 */
	public static final int CLIENTACKNOWLEDGE_VALUE = 1;

	/**
	 * The '<em><b>DUPSOKACKNOWLEDGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DUPSOKACKNOWLEDGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DUPSOKACKNOWLEDGE
	 * @model literal="DUPS_OK_ACKNOWLEDGE"
	 * @generated
	 * @ordered
	 */
	public static final int DUPSOKACKNOWLEDGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Acknowledgement Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AcknowledgementModeType[] VALUES_ARRAY =
		new AcknowledgementModeType[] {
			AUTOACKNOWLEDGE,
			CLIENTACKNOWLEDGE,
			DUPSOKACKNOWLEDGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Acknowledgement Mode Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AcknowledgementModeType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Acknowledgement Mode Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AcknowledgementModeType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AcknowledgementModeType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Acknowledgement Mode Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AcknowledgementModeType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AcknowledgementModeType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Acknowledgement Mode Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AcknowledgementModeType get(int value) {
		switch (value) {
			case AUTOACKNOWLEDGE_VALUE: return AUTOACKNOWLEDGE;
			case CLIENTACKNOWLEDGE_VALUE: return CLIENTACKNOWLEDGE;
			case DUPSOKACKNOWLEDGE_VALUE: return DUPSOKACKNOWLEDGE;
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
	private AcknowledgementModeType(int value, String name, String literal) {
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
	
} //AcknowledgementModeType
