/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.runtime;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.ClasspathContainerInitializer;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.mule.ide.project.MulePreferences;
import org.mule.ide.project.runtime.IMuleBundle;
import org.mule.ide.project.runtime.IMuleRuntime;

public class MuleClasspathInitializer extends ClasspathContainerInitializer {

	
	/**
	 * This algorithm matches the one in the UI - 
	 * 
	 * @param hint
	 * @return
	 */
	public static String pathify(String hint) {
		return hint.replace('\\', '_').replace(':', '_').replace('/', '_');
	}
	
	// Generate a classpath container id string for a jar file
	// TODO this will move into JarBundle
	public static String pathify(File f) {
		StringBuffer buf = new StringBuffer(f.getParentFile().getName());
		buf.append('_');
		buf.append(f.getName());
		return buf.toString();		
	}

	public void initialize(final IPath path, final IJavaProject project) throws CoreException {
		// Get the project and the required libs, find the Mule distro, add the libs
		
		IMuleRuntime runtime = null;
		
		// Now, see if the supplied classpath has specified the distribution (as "pathified" hint)
		if (path.segmentCount() > 2) {
			String hint = path.segment(2);
			if (hint != null) {
				hint = pathify(hint);
				runtime = MulePreferences.getMuleRuntime(hint);
			}
			// Should we error if there is an invalid hint?
		}
		
		if (runtime == null) {
			runtime = MulePreferences.getDefaultMuleRuntime();
		}
		
		// We should have a candidate either way.
		if (runtime == null) {
			return; // Silently fail as expected
		}
				
		Set<String> included = null;
		if (path != null && path.segmentCount() > 1) {
			included = commaStringToSet(path.segment(1));
		}
		/*
		List bundles = new LinkedList();
		bundles.add(distrib.getCoreModule());
		IMuleBundle modules[] = distrib.getMuleModules();
		for (int i=0; i < modules.length; ++i) {
			if (included == null || included.contains(modules[i].getName())) bundles.add(modules[i]);
		}
		IMuleBundle transports[] = distrib.getMuleTransports();
		for (int i=0; i < transports.length; ++i) {
			if (included == null || included.contains(transports[i].getName())) bundles.add(transports[i]);
		}
		IMuleBundle[] allRequiredBundles = distrib.getTransitiveMuleDependencies((IMuleBundle[])bundles.toArray(new IMuleBundle[bundles.size()]));
		*/
		
		IClasspathEntry muleEntries[] = getMuleClasspathEntries(runtime, included);	                                       
		IClasspathContainer container = new MuleClasspathContainer(path, runtime, muleEntries);
		JavaCore.setClasspathContainer(path, new IJavaProject[] { project }, new IClasspathContainer[] { container }, null);
	}

	public IClasspathEntry[] getMuleClasspathEntries(IMuleRuntime runtime, Set<String> selectedBundles) {
		if (selectedBundles == null) {
			return new IClasspathEntry[] {};
		}
		
		ArrayList<IClasspathEntry> entries = new ArrayList<IClasspathEntry>(selectedBundles.size());
		for (String name : selectedBundles) {
			IMuleBundle bundle = runtime.getLibrary(name);
			if (bundle != null) {
			    IPath libraryPath = new Path(bundle.getFile().getAbsolutePath());
				IPath sourcePath = bundle.getSourcePath();
				entries.add(JavaCore.newLibraryEntry(libraryPath, sourcePath, null));				
			}
		}
		return entries.toArray(new IClasspathEntry[entries.size()]);	
	}

	private static Set<String> commaStringToSet(String bundleSelectString2) {
		Set<String> selection = new HashSet<String>();
		StringTokenizer st = new StringTokenizer(bundleSelectString2, ",");
		while (st.hasMoreTokens()) {
			selection.add(st.nextToken());
		}
		return selection;
	}
}
