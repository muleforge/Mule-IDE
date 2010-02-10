/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.debug.ui.launching;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.emf.common.ui.dialogs.WorkspaceResourceDialog;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaModel;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.internal.debug.ui.launcher.AbstractJavaMainTab;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.mule.ide.debug.DebugMessages;
import org.mule.ide.debug.launching.MuleLaunchDelegate;
import org.mule.ide.debug.ui.DebugUIMessages;
import org.mule.ide.debug.ui.DebugUIPlugin;
import org.mule.ide.project.MuleProjectPlugin;
import org.mule.ide.project.runtime.ui.MuleRuntimeChooserPanel;

public class MuleMainTab extends AbstractJavaMainTab
{
    private Table tableConfigFiles = null;
    private Button buttonAddConfigFile = null;
    private Button buttonRemoveConfigFile = null;
    private Composite parent;

    private IProject project;
    private List<IFile> configList = new ArrayList<IFile>(); // @jve:decl-index=0:
    MuleRuntimeChooserPanel runtimeChooser;

    public void createControl(Composite parent)
    {
        this.parent = parent;

        Composite projComp = createComposite(parent, parent.getFont(), 1, 1, GridData.FILL_BOTH);
        ((GridLayout) projComp.getLayout()).verticalSpacing = 0;

        createProjectEditor(projComp);
        fProjText.addModifyListener(new ModifyListener()
        {
            public void modifyText(ModifyEvent e)
            {
                // TODO Auto-generated method stub

            }
        });

        createVerticalSpacer(projComp, 1);
        createConfigFilesGroup(projComp);
        createVerticalSpacer(projComp, 1);
        createRuntimeGroup(projComp);

        setControl(projComp);
    }

    public String getName()
    {
        return DebugUIMessages.MuleLaunch_MainTab_name;
    }

    public Image getImage()
    {
        return DebugUIPlugin.getDefault().getBundledImage("icons/config-file.gif");
    }

    public void performApply(ILaunchConfigurationWorkingCopy configuration)
    {
        configuration.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, fProjText.getText()
            .trim());
        MuleLaunchDelegate.setConfigurationFiles(configuration, configList);
    }

    public void setDefaults(ILaunchConfigurationWorkingCopy configuration)
    {
        // nothing to do
    }

    public void initializeFrom(ILaunchConfiguration config)
    {
        super.initializeFrom(config);
        try
        {
            configList.clear();
            configList.addAll(MuleLaunchDelegate.getConfigurationFiles(config));
        }
        catch (CoreException ce)
        {
            setErrorMessage(ce.getStatus().getMessage());
        }
        tableConfigFiles.removeAll();
        for (IFile file : configList)
        {
            TableItem ti = new TableItem(tableConfigFiles, SWT.NONE);
            ti.setText(file.getProjectRelativePath().toString());
        }
    }

    public boolean isValid(ILaunchConfiguration launchConfig)
    {
        IProject currentProject = project;
        setErrorMessage(null);
        setMessage(null);
        String name = fProjText.getText().trim();
        if (name.length() == 0)
        {
            setErrorMessage(DebugMessages.MuleLaunchConfig_errorNoProject);
            buttonAddConfigFile.setEnabled(false);
            buttonRemoveConfigFile.setEnabled(false);
            configList.clear();
            project = null;
            if (currentProject != project)
            {
                initializeRuntime();
            }
            return false;
        }
        if (name.length() > 0)
        {
            project = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
            if (!project.exists())
            {
                setErrorMessage(DebugMessages.MuleLaunchConfig_errorProjectDoesNotExist);
                buttonAddConfigFile.setEnabled(false);
                buttonRemoveConfigFile.setEnabled(false);
                configList.clear();
                project = null;
                if (currentProject != project)
                {
                    initializeRuntime();
                }
                return false;
            }
        }
        if (configList.size() == 0)
        {
            setErrorMessage(DebugMessages.MuleLaunchConfig_errorEmptyConfigSet);
            buttonAddConfigFile.setEnabled(true);
            buttonRemoveConfigFile.setEnabled(false);
            if (currentProject != project)
            {
                initializeRuntime();
            }
            return false;
        }
        buttonAddConfigFile.setEnabled(true);
        buttonRemoveConfigFile.setEnabled(true);
        if (currentProject != project)
        {
            initializeRuntime();
        }
        return true;
    }

    private void createConfigFilesGroup(Composite parent)
    {
        Group group = createGroup(parent, DebugUIMessages.MuleLaunch_MainTab_ConfigGroup, 2, 1,
            GridData.FILL_HORIZONTAL);

        tableConfigFiles = new Table(group, SWT.BORDER);
        tableConfigFiles.setHeaderVisible(false);
        GridData gridData = new GridData();
        gridData.verticalSpan = 3;
        gridData.grabExcessVerticalSpace = true;
        gridData.grabExcessHorizontalSpace = true;
        gridData.verticalAlignment = org.eclipse.swt.layout.GridData.FILL;
        gridData.horizontalAlignment = org.eclipse.swt.layout.GridData.FILL;
        tableConfigFiles.setLayoutData(gridData);
        tableConfigFiles.setLinesVisible(false);

        buttonAddConfigFile = new Button(group, SWT.NONE);
        buttonAddConfigFile.setText("&Add...");
        gridData = new GridData(GridData.FILL, SWT.CENTER, false, false);
        buttonAddConfigFile.setLayoutData(gridData);
        buttonAddConfigFile.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter()
        {
            public void widgetSelected(org.eclipse.swt.events.SelectionEvent e)
            {
                handleAddButton();
            }
        });
        buttonRemoveConfigFile = new Button(group, SWT.NONE);
        buttonRemoveConfigFile.setText("&Remove");
        gridData = new GridData(GridData.FILL, SWT.CENTER, false, false);
        buttonRemoveConfigFile.setLayoutData(gridData);
        buttonRemoveConfigFile.addSelectionListener(new org.eclipse.swt.events.SelectionAdapter()
        {
            public void widgetSelected(org.eclipse.swt.events.SelectionEvent e)
            {
                handleRemoveButton();
            }
        });
    }

    private void handleAddButton()
    {
        List<ViewerFilter> filters = new ArrayList<ViewerFilter>(1);
        filters.add(new ConfigFileViewerFilter());
        IFile[] files = WorkspaceResourceDialog.openFileSelection(parent.getShell(),
            "Select Configuration File", "Some message", true, null, filters);
        // ResourceSelectionDialog dialog = new ResourceSelectionDialog(
        // parent.getShell(), project,
        // IDEWorkbenchMessages.WizardExportPage_selectResourcesTitle);
        // dialog.open();
        // IFile[] files = (IFile[]) dialog.getResult();

        for (IFile file : files)
        {
            TableItem ti = new TableItem(tableConfigFiles, SWT.NONE);
            ti.setText(file.getProjectRelativePath().toString());
            configList.add(file);
        }

        updateLaunchConfigurationDialog();
    }

    private void handleRemoveButton()
    {
        int idx = tableConfigFiles.getSelectionIndex();
        if (idx >= 0 && idx < configList.size())
        {
            tableConfigFiles.remove(idx);
            configList.remove(idx);
        }

        updateLaunchConfigurationDialog();
    }

    private void createRuntimeGroup(Composite parent)
    {
        int columns = 2;
        int hspan = 1;
        int fill = GridData.FILL_HORIZONTAL;

        runtimeChooser = new MuleRuntimeChooserPanel(parent, SWT.NONE, true);
        runtimeChooser.setLayout(new GridLayout(columns, false));
        runtimeChooser.setFont(parent.getFont());
        GridData gd = new GridData(fill);
        gd.horizontalSpan = hspan;
        runtimeChooser.setLayoutData(gd);
    }

    private void initializeRuntime()
    {
        IPath muleCPContainerPath = null;
        if (project != null)
        {
            IJavaModel javaModel = JavaCore.create(ResourcesPlugin.getWorkspace().getRoot());
            IJavaProject javaProject = javaModel.getJavaProject(project.getName());
            if (javaProject != null)
            {
                try
                {
                    IClasspathEntry[] entries = javaProject.getRawClasspath();
                    for (IClasspathEntry entry : entries)
                    {
                        IPath path = entry.getPath();
                        if (path != null && path.segmentCount() > 0)
                        {
                            if (MuleProjectPlugin.ID_MULE_CLASSPATH_CONTAINER.equals(path.segment(0)))
                            {
                                muleCPContainerPath = path;
                                break;
                            }
                        }
                    }
                }
                catch (JavaModelException ex)
                {
                    // TODO log it
                    ex.printStackTrace();
                }
            }
        }

        if (project == null)
        {
            runtimeChooser.initialize(null);
        }
        else
        {
            runtimeChooser.initialize(muleCPContainerPath);
            if (muleCPContainerPath != null)
            {
                runtimeChooser.setReadOnly(true);
            }
        }
    }

    /**
     * @see org.eclipse.debug.ui.AbstractLaunchConfigurationTab#getId()
     * @since 3.3
     */
    public String getId()
    {
        return "org.mule.ide.debug.ui.launching.muleMainTab"; //$NON-NLS-1$
    }

    public static Composite createComposite(Composite parent, Font font, int columns, int hspan, int fill)
    {
        Composite g = new Composite(parent, SWT.NONE);
        g.setLayout(new GridLayout(columns, false));
        g.setFont(font);
        GridData gd = new GridData(fill);
        gd.horizontalSpan = hspan;
        g.setLayoutData(gd);
        return g;
    }

    public static Group createGroup(Composite parent, String text, int columns, int hspan, int fill)
    {
        Group g = new Group(parent, SWT.NONE);
        g.setLayout(new GridLayout(columns, false));
        g.setText(text);
        g.setFont(parent.getFont());
        GridData gd = new GridData(fill);
        gd.horizontalSpan = hspan;
        g.setLayoutData(gd);
        return g;
    }

    private class ConfigFileViewerFilter extends ViewerFilter
    {
        @Override
        public boolean select(Viewer viewer, Object parentElement, Object element)
        {
            if (!((IResource) element).getProject().equals(project))
            {
                return false;
            }
            if (element instanceof IFile)
            {
                IFile file = (IFile) element;
                return ("xml".equals(file.getFileExtension()));
            }
            return true;
        }
    }
}
