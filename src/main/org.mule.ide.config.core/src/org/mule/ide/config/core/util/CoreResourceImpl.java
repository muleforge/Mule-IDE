/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.core.util;

import java.util.Map;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.xmi.XMLOptions;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.mule.ide.config.common.impl.SyncResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see org.mule.ide.config.core.util.CoreResourceFactoryImpl
 * @generated
 */
public class CoreResourceImpl extends SyncResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated
	 */
	public CoreResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	public Map<Object, Object> getDefaultLoadOptions() {
		Map<Object, Object> defaults = super.getDefaultLoadOptions();
		defaults.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
		return defaults;
	}
	
} //CoreResourceImpl
