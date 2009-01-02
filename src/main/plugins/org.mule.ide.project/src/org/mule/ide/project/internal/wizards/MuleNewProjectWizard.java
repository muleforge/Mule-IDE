/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.wizards;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.wizards.NewJavaProjectWizardPage;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.mule.ide.project.MuleProjectPlugin;
import org.mule.ide.project.internal.util.MuleClasspathUtils;
import org.mule.ide.project.runtime.IMuleBundle;
import org.mule.ide.project.runtime.IMuleRuntime;
import org.mule.ide.project.runtime.IMuleSampleProject;

/**
 * Wizard for creating a new Mule project.
 */
public class MuleNewProjectWizard extends Wizard implements INewWizard {

//	private static final String MULE_MODULE_BUILDER_NAME = "module-builder";
//	private static final String MULE_TRANSPORT_TCP_NAME = "transport-tcp";

	/** The workbench handle */
	private IWorkbench workbench;

	/** Page for creating a new project */
	private MuleNewProjectPage projectPage;

	/** Page for setting up java project capabilities */
	private NewJavaProjectWizardPage javaPage;

	public void addPages() {
		setWindowTitle("New Mule Project");
		//setDefaultPageImageDescriptor(ExamplesPlugin.getDefault().getImageRegistry().getDescriptor(
		//		IMuleImages.KEY_MULE_WIZARD_BANNER));
		projectPage = new MuleNewProjectPage();
		addPage(projectPage);
		javaPage = new NewJavaProjectWizardPage(ResourcesPlugin.getWorkspace().getRoot(), projectPage);
		addPage(javaPage);
	}

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
						IMuleSampleProject sample = projectPage.getSelectedSample();
						IMuleRuntime runtime = projectPage.getRuntime();
						
						addMuleLibraries(javaProject, runtime, sample);
						monitor.worked(25);

						// Create a conf directory in all mule projects.
						IPath relative = new Path("conf");
						IFolder folder = javaProject.getProject().getFolder(relative);
						if (! folder.exists()) {
							try {
								folder.create(true, true, new NullProgressMonitor());
							} catch (CoreException ex) {
								MuleProjectPlugin.getInstance().logError("Error creating conf directory.", ex);									
							}
						}							

						if (sample != null) {
							sample.copyIntoProject(javaProject);
						}
						
						monitor.worked(25);
					} finally {
				    	monitor.done();
					}
				}});
		} catch (InvocationTargetException e) {
			MuleProjectPlugin.getInstance().logError("Unable to create project.", e);
		} catch (InterruptedException e) {
			if (getWorkbench().getActiveWorkbenchWindow() != null) {
				MessageDialog.openInformation(getWorkbench().getActiveWorkbenchWindow().getShell(), "Interrupted", "Project creation interrupted");
			}
		}
		// Even if there was a problem, we return true, otherwise the user will be stuck in the wizard
		return true;
	}
	
	/**
	 * Add the Mule libraries to the project classpath.
	 * 
	 * @param muleProject the mule project
	 * @throws JavaModelException
	 */
	private void addMuleLibraries(IJavaProject muleProject, IMuleRuntime runtime, IMuleSampleProject sample) {
		try {
			IClasspathEntry[] initial = muleProject.getRawClasspath();
			
			/*
			HashSet moduleNames = new HashSet();
			try {
				IMuleBundle[] bundles;
				bundles = sample.getMuleDependencies();
				for (int i=0; i<bundles.length; ++i)
					moduleNames.add(bundles[i].getName()); // skip MULE prefix
	
				// Add mandatory modules (we can't launch without these)
				moduleNames.add(MULE_TRANSPORT_TCP_NAME);
				moduleNames.add(MULE_MODULE_BUILDER_NAME);
			} catch (IOException e) {
				e.printStackTrace();
			}
			*/
			Collection<IMuleBundle> selectedLibraries = null;
			if (sample != null) {
				selectedLibraries = runtime.getSampleProjectDependencies(sample);
			}
			if (selectedLibraries == null || selectedLibraries.isEmpty()) {
				selectedLibraries = runtime.getDefaultLibraries();
			}
			IClasspathEntry[] entries = 
				new IClasspathEntry[] { MuleClasspathUtils.createMuleClasspathContainer(projectPage.getRuntimeHint(), selectedLibraries)};
			
			IClasspathEntry[] result = new IClasspathEntry[initial.length + entries.length];
			System.arraycopy(initial, 0, result, 0, initial.length);
			System.arraycopy(entries, 0, result, initial.length, entries.length);
			muleProject.setRawClasspath(result, new NullProgressMonitor());
		} catch (JavaModelException ex) {
			MuleProjectPlugin.getInstance().logError("Error creating Mule classpath container", ex);
		}
	}

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