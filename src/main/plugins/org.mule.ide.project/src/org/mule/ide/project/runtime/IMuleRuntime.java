/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.runtime;

import java.io.File;
import java.util.Collection;
import java.util.List;

/**
 * Interface for inquiring about a Mule distribution 
 */
public interface IMuleRuntime {

	String MULE_BUNDLE_PREFIX = "mule-";

	/**
	 * Returns the location of the Mule Distribution 
	 * 
	 * @return
	 */
	File getDirectory();

	/**
	 * Validates the Mule distribution
	 * 
	 * @return Whether or not the Mule distribution is valid 
	 */
	//boolean isValid();
	
	/**
	 * @return The Mule version number. 
	 */
	String getVersion();
	
	/**
	 * @return List containing all samples distributed with this Mule distribution.
	 * May be empty, but never null.
	 */
	List<IMuleSampleProject> getSampleProjects();
	
	Collection<IMuleBundle> getSampleProjectDependencies(IMuleSampleProject project);

	/**
	 * @return all libraries contained in this mule installation.
	 */
	Collection<IMuleBundle> getDefaultLibraries();
	
	/**
	 * @return all Mule libraries contained in this mule installation
	 */
	Collection<IMuleBundle> getMuleLibraries();

	IMuleBundle getMuleLibrary(String name);
	
	File getSourceZip();
	
	/**
	 * @return The bundle describing the core plugin. Is never null.
	 */
	//IMuleBundle getCoreModule();
	
	/**
	 * Returns all modules found in this Mule distribution.
	 * Modules may contain components, routers, transformers, etc.
	 * 
	 * @return Array containing all the modules. May be empty, but never null.
	 */
	//IMuleBundle[] getMuleModules();
	
	/**
	 * Returns all transports found in this Mule distribution.
	 * 
	 * @return Array containing all the transports. May be empty, but never null.
	 */
	//IMuleBundle[] getMuleTransports();

	/**
	 * @param desiredBundles Array of bundles to compute dependencies for
	 * @return Possibly longer array containing the transitive closure of Mule bundles
	 * needed to support the "desiredBundles".
	 */
	//IMuleBundle[] getTransitiveMuleDependencies(IMuleBundle[] desiredBundles);
	
	/**
	 * @param bundles The bundles to check for 3rd party dependencies
	 * @return Complete list of 3rd party files required on the classpath for supporting the
	 * array of Mule bundes passed in. 
	 */
	//File[] getLibrariesDependencies(IMuleBundle[] bundles);
	
	/**
	 * @param selectedBundles Bundles to compute a classpath for
	 * @return Classpath entries for the desired Mule bundles and their third party
	 * libraries 
	 */
	//public IClasspathEntry[] getClasspath(IMuleBundle[] selectedBundles);
}
