package org.mule.ide.project.internal.runtime;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

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
import org.mule.ide.project.internal.util.XMLUtils;
import org.mule.ide.project.runtime.IMuleRuntime;
import org.mule.ide.project.runtime.IMuleSampleProject;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MuleSampleProject implements IMuleSampleProject {
	
	private IMuleRuntime runtime;
	private String name;
	private String description;
	private File root;

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

	private List<File> getSourceDirectories() {
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
		}

		// Copy resource files
		dirs = getResourceDirectories();
		for (File dir : dirs) {
			copyIntoProject(dir, project.getProject());
			IPath projectPath = project.getProject().getFullPath();
			IPath resourcePath = new Path(dir.getName());
			IClasspathEntry srcEntry = JavaCore.newSourceEntry(projectPath.append(resourcePath));
			try {
				IClasspathEntry[] entries = project.getRawClasspath();
				IClasspathEntry[] newEntries = new IClasspathEntry[entries.length+1];
				System.arraycopy(entries, 0, newEntries, 0, entries.length);
				newEntries[entries.length] = srcEntry;
				project.setRawClasspath(newEntries, null);
			} catch (JavaModelException e) {
				MuleProjectPlugin.getInstance().logError("Error making "+dir.getName()+" a Source Folder.", e);
			}
		}

	}

	/**
	 * Copy a file or directory from a URL into a file on the project.
	 * 
	 * @param input
	 * @param project
	 */
	private void copyIntoProject(File input, IContainer parent) {
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
}
