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
 * A representation of the literals of the enumeration '<em><b>Interface Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.core.CorePackage#getInterfaceType()
 * @model extendedMetaData="name='interface_._type'"
 * @generated
 */
public enum InterfaceType implements Enumerator {
	/**
	 * The '<em><b>MANAGER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	MANAGER(0, "MANAGER", "MANAGER"),

	/**
	 * The '<em><b>MODEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODEL_VALUE
	 * @generated
	 * @ordered
	 */
	MODEL(1, "MODEL", "MODEL"),

	/**
	 * The '<em><b>COMPONENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPONENT_VALUE
	 * @generated
	 * @ordered
	 */
	COMPONENT(2, "COMPONENT", "COMPONENT"),

	/**
	 * The '<em><b>SECURITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	SECURITY(3, "SECURITY", "SECURITY"),

	/**
	 * The '<em><b>MANAGEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	MANAGEMENT(4, "MANAGEMENT", "MANAGEMENT"),

	/**
	 * The '<em><b>ADMIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMIN_VALUE
	 * @generated
	 * @ordered
	 */
	ADMIN(5, "ADMIN", "ADMIN"),

	/**
	 * The '<em><b>CONNECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONNECTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONNECTION(6, "CONNECTION", "CONNECTION"),

	/**
	 * The '<em><b>REGISTRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTRY_VALUE
	 * @generated
	 * @ordered
	 */
	REGISTRY(7, "REGISTRY", "REGISTRY"),

	/**
	 * The '<em><b>CUSTOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOM(8, "CUSTOM", "CUSTOM"),

	/**
	 * The '<em><b>MESSAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MESSAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MESSAGE(9, "MESSAGE", "MESSAGE"),

	/**
	 * The '<em><b>EXCEPTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXCEPTION_VALUE
	 * @generated
	 * @ordered
	 */
	EXCEPTION(10, "EXCEPTION", "EXCEPTION"),

	/**
	 * The '<em><b>TRANSACTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION(11, "TRANSACTION", "TRANSACTION");

	/**
	 * The '<em><b>MANAGER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANAGER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANAGER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANAGER_VALUE = 0;

	/**
	 * The '<em><b>MODEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODEL_VALUE = 1;

	/**
	 * The '<em><b>COMPONENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPONENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPONENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPONENT_VALUE = 2;

	/**
	 * The '<em><b>SECURITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SECURITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SECURITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SECURITY_VALUE = 3;

	/**
	 * The '<em><b>MANAGEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANAGEMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANAGEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MANAGEMENT_VALUE = 4;

	/**
	 * The '<em><b>ADMIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADMIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADMIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ADMIN_VALUE = 5;

	/**
	 * The '<em><b>CONNECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONNECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONNECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONNECTION_VALUE = 6;

	/**
	 * The '<em><b>REGISTRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REGISTRY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REGISTRY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REGISTRY_VALUE = 7;

	/**
	 * The '<em><b>CUSTOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CUSTOM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOM_VALUE = 8;

	/**
	 * The '<em><b>MESSAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MESSAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MESSAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MESSAGE_VALUE = 9;

	/**
	 * The '<em><b>EXCEPTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EXCEPTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXCEPTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EXCEPTION_VALUE = 10;

	/**
	 * The '<em><b>TRANSACTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSACTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_VALUE = 11;

	/**
	 * An array of all the '<em><b>Interface Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InterfaceType[] VALUES_ARRAY =
		new InterfaceType[] {
			MANAGER,
			MODEL,
			COMPONENT,
			SECURITY,
			MANAGEMENT,
			ADMIN,
			CONNECTION,
			REGISTRY,
			CUSTOM,
			MESSAGE,
			EXCEPTION,
			TRANSACTION,
		};

	/**
	 * A public read-only list of all the '<em><b>Interface Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InterfaceType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Interface Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterfaceType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterfaceType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interface Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterfaceType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InterfaceType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Interface Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InterfaceType get(int value) {
		switch (value) {
			case MANAGER_VALUE: return MANAGER;
			case MODEL_VALUE: return MODEL;
			case COMPONENT_VALUE: return COMPONENT;
			case SECURITY_VALUE: return SECURITY;
			case MANAGEMENT_VALUE: return MANAGEMENT;
			case ADMIN_VALUE: return ADMIN;
			case CONNECTION_VALUE: return CONNECTION;
			case REGISTRY_VALUE: return REGISTRY;
			case CUSTOM_VALUE: return CUSTOM;
			case MESSAGE_VALUE: return MESSAGE;
			case EXCEPTION_VALUE: return EXCEPTION;
			case TRANSACTION_VALUE: return TRANSACTION;
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
	private InterfaceType(int value, String name, String literal) {
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
	
} //InterfaceType