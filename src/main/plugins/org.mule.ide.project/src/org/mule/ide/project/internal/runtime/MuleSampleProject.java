/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.runtime;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.mule.ide.project.MuleProjectPlugin;
import org.mule.ide.project.runtime.IMuleBundle;
import org.mule.ide.project.runtime.IMuleRuntime;
import org.mule.ide.project.runtime.IMuleSampleProject;

public class MuleSampleProject implements IMuleSampleProject {
	
	protected IMuleRuntime runtime;
	private String name;
	private String description;
	protected File root;

	public static final Comparator<IMuleSampleProject> CompareByName = new Comparator<IMuleSampleProject>() {
		public int compare(IMuleSampleProject p1, IMuleSampleProject p2) {
			return p1.getName().compareTo(p2.getName());
		}
	};

	protected static void addSourceFolder(IJavaProject project, File sourceFolder) {
		IPath projectPath = project.getProject().getFullPath();
		IPath confPath = new Path(sourceFolder.getName());
		IClasspathEntry confEntry = JavaCore.newSourceEntry(projectPath.append(confPath));
		
		try {
			IClasspathEntry[] entries = project.getRawClasspath();
			IClasspathEntry[] newEntries = new IClasspathEntry[entries.length+1];
			System.arraycopy(entries, 0, newEntries, 0, entries.length);
			newEntries[entries.length] = confEntry;
			project.setRawClasspath(newEntries, null);
		} catch (JavaModelException e) {
			MuleProjectPlugin.getInstance().logError("Error making " + sourceFolder.getName() + " a Source Folder.", e);
		}
	}

	public MuleSampleProject(IMuleRuntime runtime, String name, String description, File root) {
		this.runtime = runtime;
		this.name = name;
		this.description = description;
		this.root = root;
	}
	
	public String getDescription() {
		return description;
	}

	public String getName() {
		return name;
	}

	public File getDirectory() {
		return root;
	}

	protected List<File> getSourceDirectories() {
		ArrayList<File> results = new ArrayList<File>();
		File srcJava = new File(root, "src/main/java");
		if (srcJava.exists()) {
			results.add(srcJava);
		}
		return results;
	}

	private List<File> getConfDirectories() {
		ArrayList<File> results = new ArrayList<File>();
		File srcResources = new File(root, "conf");
		if (srcResources.exists()) {
			results.add(srcResources);
		}
		return results;
	}
	
	private List<File> getResourceDirectories() {
		ArrayList<File> results = new ArrayList<File>();
		File srcResources = new File(root, "src/main/resources");
		if (srcResources.exists()) {
			results.add(srcResources);
		}
		return results;
	}
	
	public void copyIntoProject(IJavaProject project) {
		List<File> dirs;
		// Copy source files.
		try {
			// TODO Should create a separate source folders if
			// there are multiple source folders in the project.
			IContainer sourceContainer = getSourceContainer(project);
			dirs = getSourceDirectories();
			for (File dir : dirs) {
				File[] subs = dir.listFiles();
				for (int j = 0; j < subs.length; ++j ) {
					copyIntoProject(subs[j], sourceContainer);
				}
			}
		} catch (JavaModelException e) {
			MuleProjectPlugin.getInstance().logError("Unable to find a source folder.", e);
		}
		
		// Copy configuration files
		dirs = getConfDirectories();
		for (File dir : dirs) {
			copyIntoProject(dir, project.getProject());
			addSourceFolder(project, dir);
		}

		// Copy resource files
		dirs = getResourceDirectories();
		for (File dir : dirs) {
			copyIntoProject(dir, project.getProject());
			addSourceFolder(project, dir);
		}

		finishCopying();
	}
	
	/**
	 * Copy a file or directory from a URL into a file on the project.
	 * 
	 * @param input
	 * @param project
	 */
	protected void copyIntoProject(File input, IContainer parent) {
		try {
			IPath relative = new Path(input.getName());

			// Do not copy CVS entries.
			if (relative.toString().indexOf("CVS") != -1 || relative.toString().equals(".svn")) {
				return;
			}

			// Copy directories.
			if (input.isDirectory()) {
				IFolder folder = parent.getFolder(relative);
				if (! folder.exists()) {
					folder.create(true, true, new NullProgressMonitor());
				}
				
				File[] children = input.listFiles();
				for (int i=0; i < children.length; ++i) {
					copyIntoProject(children[i], folder);
				}
			} else if (input.isFile()) {
				// Copy files.
				IFile file = parent.getFile(relative);
				if (! file.exists()) {
					file.create(new FileInputStream(input), true, new NullProgressMonitor());
				}
			}
		} catch (IOException e) {
			MuleProjectPlugin.getInstance().logError("Unable to copy sample resource.", e);
		} catch (CoreException e) {
			MuleProjectPlugin.getInstance().logError("Unable to create resource.", e);
		}
	}

	/**
	 * Subclasses may override this method to perform custom steps to finish copying the project
	 * into the workspace
	 */
	protected void finishCopying() {
		// do nothing
	}

	/**
	 * Get the first source folder from the project.
	 * 
	 * @param project the Java project
	 * @return the folder
	 * @throws JavaModelException
	 */
	private IContainer getSourceContainer(IJavaProject project) throws JavaModelException {
		IPackageFragmentRoot[] roots = project.getPackageFragmentRoots();
		for (int i = 0; i < roots.length; i++) {
			if (roots[i].getKind() == IPackageFragmentRoot.K_SOURCE) {
				return (IContainer) roots[i].getResource();
			}
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder(64);
		buf.append("<MuleSampleProject@");
		buf.append(System.identityHashCode(this));
		buf.append(" ");
		buf.append(this.getName());
		buf.append(">");
		return buf.toString();
	}

	public Collection<IMuleBundle> getAdditionalLibraries() {
		return Collections.emptyList();
	}
}
