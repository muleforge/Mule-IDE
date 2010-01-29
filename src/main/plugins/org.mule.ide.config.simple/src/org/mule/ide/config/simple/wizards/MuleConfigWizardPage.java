/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.config.simple.wizards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaElement;
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
import org.mule.ide.project.runtime.IMuleBundle;
import org.mule.ide.project.runtime.IMuleRuntime;

public class MuleConfigWizardPage extends WizardPage {
	private Text folderText;
	private Text fileText;
	private IStructuredSelection selection;
	private Table muleArtifactTable;
	private Set<IMuleBundle> selectedMuleArtifacts;
	private int lastEventTime = -1;
    private MuleIdeProject project;

	public MuleConfigWizardPage(IStructuredSelection selection) {
		super("wizardPage");
		setTitle("Mule Configuration File");
		setDescription("This wizard creates a new Mule configuration file with the selected namespaces.");
		this.selection = selection;
		project = MuleIdeProject.from(selection);
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
		fileTextChanged();
		setControl(parentContainer);
	}
	
	private void checkProjectHasMuleClasspathContainer() {
	    if (project.isMuleProject()) {
	        updateStatus(null);
	    }
	    else {
	        if (project.isValid()) {
	            updateStatus(project.getName() + " does not have the Mule libraries attached");
	        }
	        else {
	            updateStatus("Could not determine project from selection");
	        }
	    }
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
				fileTextChanged();
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

		List<IMuleBundle> bundles = collectMuleBundles(runtime);
		for (IMuleBundle bundle : bundles) {
			TableItem ti = new TableItem(muleArtifactTable, SWT.CHECK);
			
			if (bundle.isSpringConfigBundle()) {
				ti.setChecked(true);
				
		        // the spring-config module must be selected in any case because it 
		        // contains the URL to the mule.xsd
				selectedMuleArtifacts.add(bundle);
			}
			else {
				ti.setChecked(false);
			}
			ti.setText(bundle.getDisplayName());
			ti.setData(bundle);
		}		
	}

    private List<IMuleBundle> collectMuleBundles(IMuleRuntime runtime) {
        List<IMuleBundle> modulesAndTransports = 
		    new ArrayList<IMuleBundle>(runtime.getMuleModulesAndTransports());
		
        // add mule-tests-functional.jar as it contains the test namespace
        IMuleBundle functionalTests = runtime.getLibraryByArtifactId("mule-tests-functional");
        modulesAndTransports.add(functionalTests);
        
		// sort by display name
		Collections.sort(modulesAndTransports, IMuleBundle.CompareByDisplayName);
        return modulesAndTransports;
    }

	private void muleArtifactSelected(IMuleBundle bundle) {
		// filter out events for mule-module-spring-config, we always need it because it contains
		// the core mule.xsd
		if (bundle.isSpringConfigBundle()) {
			return;
		}
		
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
	    fileText.setText("mule-config.xml");

	    checkProjectHasMuleClasspathContainer();
	    
	    IPath folderPath = folderFromSelection();
	    if (folderPath == null) {
	        updateStatus("Please select folder");
	    }
	    else {
	        folderText.setText(folderPath.toString());
	    }
	}

	private IPath folderFromSelection() {
        if ((selection != null) && (selection.isEmpty() == false)) {
            if (selection.size() > 1) {
                return null;
            }
            
            Object obj = selection.getFirstElement();
            if (obj instanceof IResource) {
                IResource resource = (IResource)obj;
                return folderFromResource(resource);
            }
            else if (obj instanceof IJavaElement) {
                IJavaElement javaElement = (IJavaElement)obj;
                return folderFromJavaElement(javaElement);
            }
        }
        return null;
    }

    private IPath folderFromResource(IResource resource) {
        IContainer container;
        if (resource instanceof IContainer) {
            container = (IContainer) resource;
        }
        else {
            container = ((IResource) resource).getParent();
        }
        return container.getFullPath();
    }

    private IPath folderFromJavaElement(IJavaElement javaElement) {
        int type = javaElement.getElementType();
        
        // The constants in IJavaElement are ordered ascending, more specific types have
        // higher values. Java elements that are more specific than a package fragment
        // (i.e. class files, classes etc.) need to determine their package's folder
        // on disk
        while (type > IJavaElement.PACKAGE_FRAGMENT) { 
            javaElement = javaElement.getParent();
            type = javaElement.getElementType();
        }
        return javaElement.getPath();
    }
    
    /**
	 * Uses the standard container selection dialog to choose the new value for
	 * the folder field.
	 */
	private void handleBrowse() {
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        ContainerSelectionDialog dialog = new ContainerSelectionDialog(getShell(), 
            workspaceRoot, false, "Select folder");
		if (dialog.open() == ContainerSelectionDialog.OK) {
			Object[] result = dialog.getResult();
			if (result.length == 1) {
				folderText.setText(((Path) result[0]).toString());
			}
		}
	}

	private void folderTextChanged() {
	    if (project.isMuleProject()) {
	        IMuleRuntime runtime = project.getMuleRuntime();
	        populateMuleArtifactTable(runtime);
	    }
	}
	
	/**
	 * Check prerequsites for creating the new config file
	 */
	private void fileTextChanged() {
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
        Path folder = new Path(getFolderName());
        IResource container = workspaceRoot.findMember(folder);
		String fileName = getFileName();
		
		if (container.exists() == false) {
			updateStatus("Folder must exist");
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
		
		IPath destinationFile = folder.append(fileName);
		if (workspaceRoot.exists(destinationFile)) {
		    updateStatus("File already exists");
		    return;
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