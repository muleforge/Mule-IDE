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
 * A representation of the literals of the enumeration '<em><b>Create Connector Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.core.CorePackage#getCreateConnectorType()
 * @model extendedMetaData="name='createConnector_._type'"
 * @generated
 */
public enum CreateConnectorType implements Enumerator {
	/**
	 * The '<em><b>FINDORCREATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FINDORCREATE_VALUE
	 * @generated
	 * @ordered
	 */
	FINDORCREATE(0, "FINDORCREATE", "FIND_OR_CREATE"),

	/**
	 * The '<em><b>ALWAYSCREATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYSCREATE_VALUE
	 * @generated
	 * @ordered
	 */
	ALWAYSCREATE(1, "ALWAYSCREATE", "ALWAYS_CREATE"),

	/**
	 * The '<em><b>NEVERCREATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEVERCREATE_VALUE
	 * @generated
	 * @ordered
	 */
	NEVERCREATE(2, "NEVERCREATE", "NEVER_CREATE");

	/**
	 * The '<em><b>FINDORCREATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FINDORCREATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FINDORCREATE
	 * @model literal="FIND_OR_CREATE"
	 * @generated
	 * @ordered
	 */
	public static final int FINDORCREATE_VALUE = 0;

	/**
	 * The '<em><b>ALWAYSCREATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALWAYSCREATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALWAYSCREATE
	 * @model literal="ALWAYS_CREATE"
	 * @generated
	 * @ordered
	 */
	public static final int ALWAYSCREATE_VALUE = 1;

	/**
	 * The '<em><b>NEVERCREATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEVERCREATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEVERCREATE
	 * @model literal="NEVER_CREATE"
	 * @generated
	 * @ordered
	 */
	public static final int NEVERCREATE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Create Connector Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CreateConnectorType[] VALUES_ARRAY =
		new CreateConnectorType[] {
			FINDORCREATE,
			ALWAYSCREATE,
			NEVERCREATE,
		};

	/**
	 * A public read-only list of all the '<em><b>Create Connector Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CreateConnectorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Create Connector Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CreateConnectorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CreateConnectorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Create Connector Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CreateConnectorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CreateConnectorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Create Connector Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CreateConnectorType get(int value) {
		switch (value) {
			case FINDORCREATE_VALUE: return FINDORCREATE;
			case ALWAYSCREATE_VALUE: return ALWAYSCREATE;
			case NEVERCREATE_VALUE: return NEVERCREATE;
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
	private CreateConnectorType(int value, String name, String literal) {
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
	
} //CreateConnectorType
