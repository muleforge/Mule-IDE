/*
 * $Id: MuleProjectWizard.java 18 2007-10-31 23:42:22Z ted.bashor $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.examples;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.wizards.NewJavaProjectWizardPage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;

/**
 * Wizard for creating a new Mule project.
 */
public class MuleExampleProjectWizard extends Wizard implements INewWizard {

	private static final String MULE_MODULE_BUILDER_NAME = "module-builder";

	private static final String MULE_TRANSPORT_TCP_NAME = "transport-tcp";

	/** The workbench handle */
	private IWorkbench workbench;

	/** Page for creating a new project */
	private MuleExampleProjectPage projectPage;

	/** Page for setting up java project capabilities */
	private NewJavaProjectWizardPage javaPage;

	/** Static constant for config folder name */
	private static final String CONFIG_FOLDER_NAME = "conf";

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.IWizard#addPages()
	 */
	public void addPages() {
		setWindowTitle("New Mule Project");
		//setDefaultPageImageDescriptor(ExamplesPlugin.getDefault().getImageRegistry().getDescriptor(
		//		IMuleImages.KEY_MULE_WIZARD_BANNER));
		projectPage = new MuleExampleProjectPage();
		addPage(projectPage);
		javaPage = new NewJavaProjectWizardPage(ResourcesPlugin.getWorkspace().getRoot(), projectPage);
		addPage(javaPage);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.jface.wizard.IWizard#performFinish()
	 */
	public boolean performFinish() {
		try {
			// Set up the Java project according to entries on Java page.
			getContainer().run(false, true, new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
					try {
						monitor.beginTask("Setting up Mule project", 100);
						
						// Run the Java project task in a sub-progress by itself 
						SubProgressMonitor subMonitor= new SubProgressMonitor(monitor, 50);
				        try {
				        	javaPage.getRunnable().run(subMonitor);
				        } finally {
			        	  subMonitor.done();
				        }
				        
				        // Add the Mule nature.
						//MuleCorePlugin.getDefault().setMuleNature(projectPage.getProjectHandle(), true);

						// Add the Mule classpath container.
						IProject project = projectPage.getProjectHandle();
						IJavaProject javaProject = JavaCore.create(project);
						String sample = projectPage.getSelectedSample();
						
						//addMuleLibraries(javaProject, sample);
						monitor.worked(25);

						addFromSample(sample, javaProject);
						monitor.worked(25);
					} finally {
				    	monitor.done();
					}
				}});
		} catch (InvocationTargetException e) {
			ExamplesPlugin.getDefault().logError("Unable to create project.", e);
		} catch (InterruptedException e) {
			if (getWorkbench().getActiveWorkbenchWindow() != null) {
				MessageDialog.openInformation(getWorkbench().getActiveWorkbenchWindow().getShell(), "Interrupted", "Project creation interrupted");
			}
		}
		// Even if there was a problem, we return true, otherwise the user will be stuck in the wizard
		return true;
	}
	/**
	 * Add the files from the sample project.
	 * 
	 * @param sample the sample
	 * @param project the Java project
	 */
	protected void addFromSample(String sample, IJavaProject project) {
		if (sample == null) return;
		// Copy source files.
		try {
			URL sourceURL = FileLocator.find(ExamplesPlugin.getDefault().getBundle(), new Path("examples/"+sample), null);
			sourceURL = FileLocator.resolve(sourceURL);
			if (sourceURL == null) {
				ExamplesPlugin.getDefault().logError("Unable to resolve sample directory URL: "+sourceURL.toString());
				return;
			}
			IContainer projectContainer = (IContainer) project.getResource();
			File sourceFile = new File(sourceURL.toURI());
			File[] children = sourceFile.listFiles();
			for (File child : children) {
				copyIntoProject(child, projectContainer);
			}
		} catch (IOException e) {
			ExamplesPlugin.getDefault().logError("Error copying sample files.", e);
		} catch (URISyntaxException e) {
			ExamplesPlugin.getDefault().logError("Error copying sample files.", e);
		}
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
			ExamplesPlugin.getDefault().logError("Unable to copy sample resource.", e);
		} catch (CoreException e) {
			ExamplesPlugin.getDefault().logError("Unable to create resource.", e);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.IWorkbenchWizard#init(org.eclipse.ui.IWorkbench,
	 * org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		setNeedsProgressMonitor(true);
	}

	/**
	 * Get the workbench that hosts the wizard.
	 * 
	 * @return the workbench
	 */
	protected IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * Set the workbench that hosts the wizard.
	 * 
	 * @param workbench the workbench
	 */
	protected void setWorkbench(IWorkbench workbench) {
		this.workbench = workbench;
	}
}