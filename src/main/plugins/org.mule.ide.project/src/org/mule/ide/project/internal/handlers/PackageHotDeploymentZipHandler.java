package org.mule.ide.project.internal.handlers;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.internal.ui.jarpackager.PlainJarBuilder;
import org.eclipse.jdt.ui.jarpackager.IJarExportRunnable;
import org.eclipse.jdt.ui.jarpackager.JarPackageData;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;
import org.mule.ide.project.MuleIdeProject;
import org.mule.ide.project.MuleProjectPlugin;

// TODO handle jar files that are stored in project
// TODO handle jar files that are referenced from project
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

        JarPackageData data = createJarPackageData(zipFile, project);
        exportZipFile(data, shell);

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

    private void exportZipFile(JarPackageData data, Shell shell) throws ExecutionException
    {
        IJarExportRunnable runnable = data.createJarExportRunnable(shell);

        try
        {
            boolean fork = false;
            boolean cancelable = false;
            PlatformUI.getWorkbench().getProgressService().run(fork, cancelable, runnable);
        }
        catch (InvocationTargetException e)
        {
            throw new ExecutionException("Exception while packaging the jar", e);
        }
        catch (InterruptedException e)
        {
            throw new ExecutionException("Exception while packaging the jar", e);
        }
    }

    private JarPackageData createJarPackageData(IPath zipFile, MuleIdeProject project) throws ExecutionException
    {
        JarPackageData data = new JarPackageData();

        data.setJarBuilder(new ClassesPrefixJarBuilder(project));

        data.setIncludeDirectoryEntries(true);
        data.setJarLocation(zipFile);
        data.setExportClassFiles(true);
        data.setExportJavaFiles(false);
        data.setOverwrite(false);
        data.setExportErrors(true);
        data.setExportWarnings(true);
        data.setBuildIfNeeded(true);
        data.setUsesManifest(false);

        Object[] filesToExport = getFilesToExport(project);
        data.setElements(filesToExport);

        return data;
    }

    private Object[] getFilesToExport(MuleIdeProject project) throws ExecutionException
    {
        try
        {
            ExportFilesCollector collector = new ExportFilesCollector(project);
            Set<Object> allFilesToExport = collector.allFilesToExport();
            return allFilesToExport.toArray();
        }
        catch (CoreException ce)
        {
            throw new ExecutionException("Exception while getting project's source paths", ce);
        }
    }

    private static class ClassesPrefixJarBuilder extends PlainJarBuilder
    {
        private IResource configFile;
        private MuleIdeProject project;

        public ClassesPrefixJarBuilder(MuleIdeProject project)
        {
            super();
            configFile = project.getPreferences().getConfigFile();
            this.project = project;
        }

        /**
         * Mule's deployment format mandates that all class files and resources reside in the
         * <em>classes</em> folder. Put all files there except for the mule-config.xml.
         */
        @Override
        public void writeFile(IFile file, IPath destinationPath) throws CoreException
        {
            if (shouldAddClassesPrefix(file))
            {
                destinationPath = new Path("classes").append(destinationPath);
            }

            super.writeFile(file, destinationPath);
        }

        private boolean shouldAddClassesPrefix(IFile file) throws CoreException
        {
            if (isConfigFile(file))
            {
                return false;
            }

            if (isClassFile(file))
            {
                return true;
            }

            if (isLocatedInProjectSourceFolder(file))
            {
                return true;
            }

            return false;
        }

        private boolean isConfigFile(IFile file)
        {
            return file.equals(configFile);
        }

        private boolean isClassFile(IFile file)
        {
            return file.getName().endsWith(".class");
        }

        private boolean isLocatedInProjectSourceFolder(IFile file) throws CoreException
        {
            IPath resourcePath = file.getFullPath();

            Set<IPath> sourceFolders = project.getSourceFolderPaths();
            for (IPath sourceFolderPath : sourceFolders)
            {
                if (sourceFolderPath.isPrefixOf(resourcePath))
                {
                    return true;
                }
            }

            return false;
        }
    }
}
