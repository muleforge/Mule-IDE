package org.mule.ide.project.internal.runtime;

import java.io.File;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.mule.ide.project.MuleProjectPlugin;
import org.mule.ide.project.runtime.IMuleRuntime;

/**
 * This class represents the unpacked Mule application
 */
public class MuleApplication
{
    private File applicationFolder;

    public MuleApplication(IMuleRuntime runtime, String name) throws CoreException
    {
        super();

        applicationFolder = new File(runtime.getApplicationDirectory(), name);
        assertFolderExists(applicationFolder);
    }

    /**
     * @return This applications's root folder which contains the mule-config.xml
     * and the classes, lib etc. subdirectories;
     */
    public File getFolder()
    {
        return applicationFolder;
    }

    public File getClassesFolder() throws CoreException
    {
        File classesFolder = new File(applicationFolder, "classes");
        assertFolderExists(classesFolder);
        return classesFolder;
    }

    private void assertFolderExists(File newFolder) throws CoreException
    {
        if (newFolder.exists() == false)
        {
            boolean success = newFolder.mkdirs();
            if (success == false)
            {
                IStatus status = new Status(IStatus.ERROR, MuleProjectPlugin.PLUGIN_ID,
                    "Cannot create directory " + newFolder.getAbsolutePath());
                throw new CoreException(status);
            }
        }
    }

    // TODO handle cases where we have a deployment descriptor. Do we need to touch that one instead of the config then?
    public void touchConfigFile()
    {
        File muleConfig = new File(applicationFolder, "mule-config.xml");
        if (muleConfig.exists())
        {
            muleConfig.setLastModified(System.currentTimeMillis());
        }
    }
}
