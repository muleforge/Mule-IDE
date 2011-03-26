package org.mule.ide.project.internal.handlers;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.mule.ide.project.MuleIdeProject;
import org.mule.ide.project.MuleProjectPlugin;
import org.mule.ide.project.internal.util.zip.ExportProjectToZip;

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

        exportProjectToZipFile(project, zipFile);
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

    private void exportProjectToZipFile(MuleIdeProject project, IPath zipFile) throws ExecutionException
    {
        try
        {
            boolean fork = false;
            boolean cancelable = false;
            IRunnableWithProgress runnable = new ExportRunnable(project, zipFile);
            PlatformUI.getWorkbench().getProgressService().run(fork, cancelable, runnable);
        }
        catch (InvocationTargetException ite)
        {
            throw new ExecutionException("Exception while packaging as deployment zip", ite);
        }
        catch (InterruptedException ie)
        {
            throw new ExecutionException("Exception while packaging as deployment zip", ie);
        }
    }

    private static class ExportRunnable implements IRunnableWithProgress
    {
        private MuleIdeProject project;
        private IPath zipFile;

        public ExportRunnable(MuleIdeProject project, IPath zipFile)
        {
            super();
            this.project = project;
            this.zipFile = zipFile;
        }

        public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException
        {
            try
            {
                new ExportProjectToZip(project).run(zipFile, monitor);
            }
            catch (CoreException ce)
            {
                throw new InvocationTargetException(ce);
            }
        }
    }
}
