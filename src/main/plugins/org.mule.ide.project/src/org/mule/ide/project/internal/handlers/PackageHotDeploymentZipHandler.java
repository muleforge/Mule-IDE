package org.mule.ide.project.internal.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.mule.ide.project.MuleIdeProject;
import org.mule.ide.project.MuleProjectPlugin;
import org.mule.ide.project.internal.util.MuleZipPackager;

public class PackageHotDeploymentZipHandler extends AbstractHandler
{
    private static final String ACTION_NAME = "Package as deployment zip";

    public Object execute(ExecutionEvent event) throws ExecutionException
    {
        MuleIdeProject project = findProject(event);
        Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();

        IResource configFile = project.getPreferences().getConfigFile();
        if (configFile == null)
        {
            MessageDialog.openError(shell, ACTION_NAME, "Please configure a configuration file in the project's preferences");
            return null;
        }

        String defaultFileName = calculateDefaultZipFileName(project);
        IPath zipFile = promptForDestinationFile(defaultFileName, shell);
        if (zipFile == null)
        {
            // user cancelled the file dialog
            return null;
        }

        try
        {
            MuleZipPackager packager = new MuleZipPackager(project, shell);
            packager.exportToFileRunningInUiThread(zipFile);
        }
        catch (CoreException ce)
        {
            throw new ExecutionException("Exception while packaging as deployment zip", ce);
        }

        return null;
    }

    protected MuleIdeProject findProject(ExecutionEvent event) throws ExecutionException
    {
        ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
        return MuleProjectPlugin.getInstance().getProjectFactory().create(selection);
    }

    private String calculateDefaultZipFileName(MuleIdeProject project)
    {
        String hotDeploymentName = project.getPreferences().getHotDeploymentName();
        return hotDeploymentName + ".zip";
    }

    private IPath promptForDestinationFile(String defaultFileName, Shell shell)
    {
        IPath zipFilePath = null;

        FileDialog dialog = new FileDialog(shell, SWT.SAVE);
        dialog.setText(ACTION_NAME);
        dialog.setFileName(defaultFileName);
        dialog.setFilterNames(new String[] { "Zip Files (*.zip)" });
        dialog.setFilterExtensions(new String[] { "*.zip" });
        String result = dialog.open();

        if (result != null)
        {
            zipFilePath = new Path(result);
        }

        return zipFilePath;
    }
}
