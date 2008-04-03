/*
 * $Id: MuleDistributionClasspathInitializer.java 6 2007-10-25 22:47:26Z ted.bashor $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.runtime;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
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
import org.mule.ide.project.MuleProjectPlugin;
import org.mule.ide.project.internal.preferences.MulePreferences;
import org.mule.ide.project.runtime.IMuleBundle;
import org.mule.ide.project.runtime.IMuleRuntime;

public class MuleClasspathInitializer extends ClasspathContainerInitializer {

	
	/**
	 * This algorithm matches the one in the UI - 
	 * 
	 * @param hint
	 * @return
	 */
	static public String pathify(String hint) {
		return hint.replace('\\', '_').replace(':', '_').replace('/', '_');
	}
	
	// Generate a classpath container id string for a jar file
	// TODO this will move into JarBundle
	static public String pathify(File f) {
		StringBuffer buf = new StringBuffer(f.getParentFile().getName());
		buf.append('_');
		buf.append(f.getName());
		return buf.toString();		
	}

	public void initialize(final IPath path, final IJavaProject project) throws CoreException {
		// Get the project and the required libs, find the Mule distro, add the libs
		
		IMuleRuntime temp = null;
		
		// Now, see if the supplied classpath has specified the distribution (as "pathified" hint)
		if (path.segmentCount() > 2) {
			String hint = path.segment(2);
			if (hint != null) {
				hint = pathify(hint);
				temp = MulePreferences.getMuleRuntime(hint);
			}
			// Should we error if there is an invalid hint?
		}
		
		if (temp == null) {
			temp = MulePreferences.getDefaultMuleRuntime();
		}
		
		// We should have a candidate either way.
		if (temp == null) return; // Silently fail as expected
		// TODO: Mark the Mule nature as having a bad path or missing prefs
				
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
		
		final IMuleRuntime runtime = temp;
		//final IClasspathEntry containerEntries[] = distrib.getClasspath(allRequiredBundles);
		final IClasspathEntry muleEntries[] = getMuleClasspathEntries(runtime, included);	                                       
		IClasspathContainer container = new IClasspathContainer() {
			public IClasspathEntry[] getClasspathEntries() {
				return muleEntries;
			}
			public String getDescription() {
				return "Mule Libraries ["+ runtime.getDirectory().getName()+"]";
			}
			public int getKind() {
				return K_APPLICATION; 
			}
			public IPath getPath() {
				return path;
			}
			public String toString() {
				return getDescription();
			}
		};
		JavaCore.setClasspathContainer(path, new IJavaProject[] { project }, new IClasspathContainer[] { container }, null);
	}

	public IClasspathEntry[] getMuleClasspathEntries(IMuleRuntime runtime, Set<String> selectedBundles) {
		if (selectedBundles == null) {
			return new IClasspathEntry[] {};
		}
		
		ArrayList<IClasspathEntry> entries = new ArrayList<IClasspathEntry>(selectedBundles.size());
		for (String name : selectedBundles) {
			IMuleBundle bundle = runtime.getMuleLibrary(name);
			if (bundle != null) {
				File f = bundle.getFile();
				// TODO source
				entries.add(JavaCore.newLibraryEntry(new Path(f.getAbsolutePath()), null, null));				
			}
		}
		return entries.toArray(new IClasspathEntry[entries.size()]);	
	}

	private static Set<String> commaStringToSet(String bundleSelectString2) {
		Set<String> selection = new HashSet<String>();
		StringTokenizer st = new StringTokenizer(bundleSelectString2, ",");
		while (st.hasMoreTokens()) selection.add(st.nextToken());
		return selection;
	}
	
	
	public boolean canUpdateClasspathContainer(IPath containerPath, IJavaProject project) {
		return super.canUpdateClasspathContainer(containerPath, project);
	}
	public void requestClasspathContainerUpdate(IPath containerPath, IJavaProject project, IClasspathContainer containerSuggestion) throws CoreException {
		super.requestClasspathContainerUpdate(containerPath, project,
				containerSuggestion);
	}
}