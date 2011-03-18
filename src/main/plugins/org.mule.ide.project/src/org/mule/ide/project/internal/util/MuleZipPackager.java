package org.mule.ide.project.internal.util;

import java.lang.reflect.InvocationTargetException;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.ui.jarpackager.IJarExportRunnable;
import org.eclipse.jdt.ui.jarpackager.JarPackageData;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.mule.ide.project.MuleIdeProject;
import org.mule.ide.project.MuleProjectPlugin;

/**
 * Package an Eclipse project as Mule deployment zip.
 */
public class MuleZipPackager
{
    private MuleIdeProject project;
    private Shell shell;

    public MuleZipPackager(MuleIdeProject project, Shell shell)
    {
        super();
        this.project = project;
        this.shell = shell;
    }

    public void exportTo(IPath zipFile) throws CoreException
    {
        JarPackageData data = createJarPackageData(zipFile, project);
        exportZipFile(data, shell);
    }

    private JarPackageData createJarPackageData(IPath zipFile, MuleIdeProject project) throws CoreException
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

    private Object[] getFilesToExport(MuleIdeProject project) throws CoreException
    {
        ExportFilesCollector collector = new ExportFilesCollector(project);
        Set<Object> allFilesToExport = collector.allFilesToExport();
        return allFilesToExport.toArray();
    }
    
    private void exportZipFile(JarPackageData data, Shell shell) throws CoreException
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
            throwCoreException(e);
        }
        catch (InterruptedException e)
        {
            throwCoreException(e);
        }
    }

    private void throwCoreException(Exception e) throws CoreException
    {
        IStatus status = new Status(IStatus.ERROR, MuleProjectPlugin.PLUGIN_ID, 
            "Exception while packaging the mule deployment zip", e);
        throw new CoreException(status);
    }
}
