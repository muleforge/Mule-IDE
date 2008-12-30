/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.config.simple.wizards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.ContainerSelectionDialog;
import org.mule.ide.project.MulePreferences;
import org.mule.ide.project.MuleProjectPlugin;
import org.mule.ide.project.runtime.IMuleBundle;
import org.mule.ide.project.runtime.IMuleRuntime;

public class MuleConfigWizardPage extends WizardPage {
	private Text folderText;
	private Text fileText;
	private ISelection selection;
	private Table muleArtifactTable;
	private Set<IMuleBundle> selectedMuleArtifacts;
	private int lastEventTime = -1;

	public MuleConfigWizardPage(ISelection selection) {
		super("wizardPage");
		setTitle("Mule Configuration File");
		setDescription("This wizard creates a new Mule configuration file with the selected namespaces.");
		this.selection = selection;
	}

	public void createControl(Composite parent) {
		Composite parentContainer = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		parentContainer.setLayout(layout);
		layout.numColumns = 1;
		layout.verticalSpacing = 9;
		
		createNewFileGroup(parentContainer);
		createMuleArtifactSelector(parentContainer);

		initialize();
		dialogChanged();
		setControl(parentContainer);
	}
	
	private void createNewFileGroup(Composite parent) {
		Group group = new Group(parent, SWT.NONE);
		group.setText("Mule &Configuration");
		
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		layout.verticalSpacing = 9;
		group.setLayout(layout);
		
		GridData gridData = new GridData();
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		group.setLayoutData(gridData);		
		
		Label label = new Label(group, SWT.NULL);
		label.setText("&Folder:");

		folderText = new Text(group, SWT.BORDER | SWT.SINGLE);
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		folderText.setLayoutData(gd);
		folderText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				folderTextChanged();
			}
		});

		Button button = new Button(group, SWT.PUSH);
		button.setText("Browse...");
		button.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				handleBrowse();
			}
		});
		
		label = new Label(group, SWT.NULL);
		label.setText("F&ile name:");

		fileText = new Text(group, SWT.BORDER | SWT.SINGLE);
		gd = new GridData(GridData.FILL_HORIZONTAL);
		fileText.setLayoutData(gd);
		fileText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				dialogChanged();
			}
		});
	}

	private void createMuleArtifactSelector(Composite parent) {
		Group group = new Group(parent, SWT.NONE);
		group.setText("Mule &Modules / Transports:");

		GridLayout gridLayout = new GridLayout();
		gridLayout.numColumns = 2;
		group.setLayout(gridLayout);

		GridData gridData = new GridData();
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.grabExcessHorizontalSpace = true;
		group.setLayoutData(gridData);

		muleArtifactTable = new Table(group, SWT.CHECK | SWT.BORDER);
		muleArtifactTable.setHeaderVisible(false);
		muleArtifactTable.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent event) {				
				// when clicking a checkbox at least on linux we recevie two events here, the 
				// first one is the one we want and the other one, bearing the same timestamp,
				// actually reverts the operation
				if (event.time == lastEventTime) {
					return;
				}	

				// even worse than the above is the effect that the SWT.CHECK event always comes
				// first, even when unchecking an artifact. So the state of the event is totally
				// useless and we have to implement the trigger semantics manually :-(
				muleArtifactSelected((IMuleBundle)event.item.getData());

				lastEventTime = event.time;
			}
		});

		gridData = new GridData();
		gridData.verticalSpan = 3;
		gridData.grabExcessVerticalSpace = true;
		gridData.grabExcessHorizontalSpace = true;
		gridData.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
		gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
		muleArtifactTable.setLayoutData(gridData);
		muleArtifactTable.setLinesVisible(false);
	}
	
	private void populateMuleArtifactTable(IMuleRuntime runtime) {
		if (runtime == null) {
			return;
		}
		
		muleArtifactTable.clearAll();
		
		// filter out examples etc.
		Collection<IMuleBundle> muleLibs = runtime.getMuleLibraries();
		List<IMuleBundle> modulesAndTransports = new ArrayList<IMuleBundle>();
		for (IMuleBundle bundle : muleLibs) {
			String fileName = bundle.getFile().getName();
			if (fileName.startsWith(IMuleBundle.MULE_MODULE_PREFIX) ||
				fileName.startsWith(IMuleBundle.MULE_TRANSPORT_PREFIX)) {
				modulesAndTransports.add(bundle);
			}
		}
		
		// sort by display name
		Collections.sort(modulesAndTransports, IMuleBundle.CompareByDisplayName);
		
		for (IMuleBundle bundle : modulesAndTransports) {
			TableItem ti = new TableItem(muleArtifactTable, SWT.CHECK);
			ti.setChecked(false);
			ti.setText(bundle.getDisplayName());
			ti.setData(bundle);
		}		
	}

	private void muleArtifactSelected(IMuleBundle bundle) {
		boolean bundleAlreadyInSelection = selectedMuleArtifacts.contains(bundle);
		if (bundleAlreadyInSelection) {
			selectedMuleArtifacts.remove(bundle);
		}
		else {
			selectedMuleArtifacts.add(bundle);
		}
	}

	/**
	 * Tests if the current workbench selection is a suitable folder to use.
	 */
	private void initialize() {		
		selectedMuleArtifacts = new HashSet<IMuleBundle>();

		if (selection != null && selection.isEmpty() == false && selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			if (ssel.size() > 1) {
				return;
			}
			
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				IContainer container;
				if (obj instanceof IContainer) {
					container = (IContainer) obj;
				}
				else {
					container = ((IResource) obj).getParent();
				}
				
				folderText.setText(container.getFullPath().toString());
			}
		}
		
		fileText.setText("mule-config.xml");
	}

	/**
	 * Uses the standard container selection dialog to choose the new value for
	 * the folder field.
	 */
	private void handleBrowse() {
		ContainerSelectionDialog dialog = new ContainerSelectionDialog(
				getShell(), ResourcesPlugin.getWorkspace().getRoot(), false,
				"Select folder");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				folderText.setText(((Path) result[0]).toString());
			}
		}
	}

	private void folderTextChanged() {
		IPath path = new Path(this.getFolderName());
		IResource container = ResourcesPlugin.getWorkspace().getRoot().findMember(path);

		// find the selected project
		IProject project = null;
		while (container != null) {
			container = container.getParent();
			if (container instanceof IProject) {
				project = (IProject)container;
				break;
			}
		}
		
		if (project != null) {
			// find the respective JavaProject
			IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
			IJavaProject javaProject = JavaCore.create(workspaceRoot).getJavaProject(project.getName());
			try {
				IClasspathEntry[] classpath = javaProject.getRawClasspath();
				for (IClasspathEntry entry : classpath) {
					if (entry.getEntryKind() == IClasspathEntry.CPE_CONTAINER) {
						IPath entryPath = entry.getPath();
						IPath muleRuntimeIdentifier = new Path(MuleProjectPlugin.ID_MULE_CLASSPATH_CONTAINER);
						if (entryPath.matchingFirstSegments(muleRuntimeIdentifier) == 1) {
							// this is the Mule library, extract the version from it
							String muleRuntimePath = entryPath.lastSegment();
							IMuleRuntime runtime = MulePreferences.getMuleRuntime(muleRuntimePath);
							this.populateMuleArtifactTable(runtime);
						}
					}
				}
			} catch (JavaModelException e) {
				MuleProjectPlugin.getInstance().logError("error determining classpath", e);
			}
		}
	}
	
	/**
	 * Ensures that both text fields are set.
	 */
	private void dialogChanged() {
		IResource container = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(getFolderName()));
		String fileName = getFileName();

//		if (getFolderName().length() == 0) {
//			updateStatus("File container must be specified");
//			return;
//		}
		
		if (container == null
				|| (container.getType() & (IResource.PROJECT | IResource.FOLDER)) == 0) {
			updateStatus("File container must exist");
			return;
		}
		if (!container.isAccessible()) {
			updateStatus("Project must be writable");
			return;
		}
		if (fileName.length() == 0) {
			updateStatus("File name must be specified");
			return;
		}
		if (fileName.replace('\\', '/').indexOf('/', 1) > 0) {
			updateStatus("File name must be valid");
			return;
		}
		int dotLoc = fileName.lastIndexOf('.');
		if (dotLoc != -1) {
			String ext = fileName.substring(dotLoc + 1);
			if (ext.equalsIgnoreCase("xml") == false) {
				updateStatus("File extension must be \"xml\"");
				return;
			}
		}
		updateStatus(null);
	}

	private void updateStatus(String message) {
		setErrorMessage(message);
		setPageComplete(message == null);
	}

	public String getFolderName() {
		return folderText.getText();
	}

	public String getFileName() {
		return fileText.getText();
	}
	
	public List<IMuleBundle> getSelectedMuleArtifacts() {
		List<IMuleBundle> selected = new ArrayList<IMuleBundle>(selectedMuleArtifacts);
		Collections.sort(selected, IMuleBundle.CompareByDisplayName);
		return selected;
	}
}