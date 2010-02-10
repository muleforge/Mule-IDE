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
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.IDebugModelPresentation;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jdt.launching.IJavaLaunchConfigurationConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.part.FileEditorInput;
import org.mule.ide.debug.launching.IMuleLaunchConstants;
import org.mule.ide.debug.launching.MuleLaunchDelegate;
import org.mule.ide.debug.ui.DebugUIMessages;
import org.mule.ide.debug.ui.DebugUIPlugin;

public class MuleLaunchShortcut implements ILaunchShortcut
{
    @SuppressWarnings("unchecked")
    public void launch(ISelection selection, String mode)
    {
        if (selection instanceof IStructuredSelection)
        {
            List selections = ((IStructuredSelection) selection).toList();
            List<IFile> files = new ArrayList<IFile>(selections.size());
            files.addAll(selections);
            launch(files, mode);
        }
    }

    public void launch(IEditorPart editor, String mode)
    {
        IEditorInput input = editor.getEditorInput();
        if (input instanceof FileEditorInput)
        {
            IFile file = ((FileEditorInput) input).getFile();
            List<IFile> files = new ArrayList<IFile>(1);
            files.add(file);
            launch(files, mode);
        }
    }

    protected void launch(List<IFile> files, String mode)
    {
        ILaunchConfiguration config = findLaunchConfiguration(files, getConfigurationType());
        if (config != null)
        {
            DebugUITools.launch(config, mode);
        }
    }

    /**
     * Locate a configuration to relaunch for the given type. If one cannot be found,
     * create one.
     * 
     * @return a re-usable config or <code>null</code> if none
     */
    protected ILaunchConfiguration findLaunchConfiguration(List<IFile> files,
                                                           ILaunchConfigurationType configType)
    {
        IProject project = null;
        // Validate that all files belong to the same project.
        for (IFile file : files)
        {
            IProject fileProject = file.getProject();
            if (fileProject == null)
            {
                reportError(DebugUIMessages.MuleLaunch_Shortcut_errorNoProject);
                return null;
            }
            if (project != null && fileProject != project)
            {
                reportError(DebugUIMessages.MuleLaunch_Shortcut_errorSameProject);
                return null;
            }
            project = fileProject;
        }

        List<ILaunchConfiguration> candidateConfigs = Collections.emptyList();
        try
        {
            ILaunchConfiguration[] configs = DebugPlugin.getDefault()
                .getLaunchManager()
                .getLaunchConfigurations(configType);
            candidateConfigs = new ArrayList<ILaunchConfiguration>(configs.length);
            for (int i = 0; i < configs.length; i++)
            {
                ILaunchConfiguration config = configs[i];
                if (config.getAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, "").equals(project.getName())) { //$NON-NLS-1$
                    List<IFile> configFiles = MuleLaunchDelegate.getConfigurationFiles(config);
                    if (configFiles.containsAll(files))
                    {
                        candidateConfigs.add(config);
                    }
                }
            }
        }
        catch (CoreException e)
        {
            reportError(e);
            return null;
        }

        // If there are no existing configs associated with the IType, create one.
        // If there is exactly one config associated with the IType, return it.
        // Otherwise, if there is more than one config associated with the IType,
        // prompt the
        // user to choose one.
        int candidateCount = candidateConfigs.size();
        if (candidateCount < 1)
        {
            return createConfiguration(project, files);
        }
        else if (candidateCount == 1)
        {
            return (ILaunchConfiguration) candidateConfigs.get(0);
        }
        else
        {
            // Prompt the user to choose a config. A null result means the user
            // canceled the dialog, in which case this method returns null,
            // since canceling the dialog should also cancel launching anything.
            ILaunchConfiguration config = chooseConfiguration(candidateConfigs);
            if (config != null)
            {
                return config;
            }
        }

        return null;
    }

    protected ILaunchConfiguration createConfiguration(IProject project, List<IFile> files)
    {
        ILaunchConfiguration config = null;
        ILaunchConfigurationWorkingCopy wc = null;
        try
        {
            ILaunchConfigurationType configType = getConfigurationType();
            wc = configType.newInstance(null, getLaunchManager().generateUniqueLaunchConfigurationNameFrom(
                project.getName()));
            wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_PROJECT_NAME, project.getName());
            MuleLaunchDelegate.setConfigurationFiles(wc, files);
            // Validate that there is a default runtime available here?
            // CONTEXTLAUNCHING
            wc.setMappedResources(files.toArray(new IFile[files.size()]));
            config = wc.doSave();
        }
        catch (CoreException exception)
        {
            reportError(exception);
        }
        return config;
    }

    /**
     * Show a selection dialog that allows the user to choose one of the specified
     * launch configurations. Return the chosen config, or <code>null</code> if the
     * user canceled the dialog.
     */
    protected ILaunchConfiguration chooseConfiguration(List<?> configList)
    {
        IDebugModelPresentation labelProvider = DebugUITools.newDebugModelPresentation();
        ElementListSelectionDialog dialog = new ElementListSelectionDialog(getShell(), labelProvider);
        dialog.setElements(configList.toArray());
        dialog.setTitle(DebugUIMessages.MuleLaunch_Shortcut_selectLaunchConfigTitle);
        dialog.setMessage(DebugUIMessages.MuleLaunch_Shortcut_selectLaunchConfigMsg);
        dialog.setMultipleSelection(false);
        int result = dialog.open();
        labelProvider.dispose();
        if (result == Window.OK)
        {
            return (ILaunchConfiguration) dialog.getFirstResult();
        }
        return null;
    }

    protected ILaunchConfigurationType getConfigurationType()
    {
        return getLaunchManager().getLaunchConfigurationType(IMuleLaunchConstants.ID_MULE_LOCAL_SERVER);
    }

    protected ILaunchManager getLaunchManager()
    {
        return DebugPlugin.getDefault().getLaunchManager();
    }

    /**
     * Opens an error dialog on the given exception.
     * 
     * @param exception
     */
    protected void reportError(CoreException exception)
    {
        reportError(exception.getStatus().getMessage());
        exception.printStackTrace(); // TODO log it
    }

    protected void reportError(String message)
    {
        MessageDialog.openError(getShell(), DebugUIMessages.MuleLaunch_Shortcut_errorTitle, message);
    }

    /**
     * Convenience method to get the window that owns this action's Shell.
     */
    protected Shell getShell()
    {
        IWorkbenchWindow window = DebugUIPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow();
        if (window != null)
        {
            return window.getShell();
        }
        return null;
    }
}
