package org.mule.ide.project;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.mule.ide.project.runtime.IMuleRuntime;

public class MuleProjectNature implements IProjectNature
{
    public static final String NATURE_ID = "nature";
    public static final String FULL_NATURE_ID = MuleProjectPlugin.PLUGIN_ID + "." + NATURE_ID;

    private IProject project;

    public void configure() throws CoreException
    {
        MuleIdeProject muleProject = getMuleIdeProject();
        IMuleRuntime runtime = muleProject.getMuleRuntime();
        if (runtime.getVersion().startsWith("3"))
        {
            registerHotDeploymentBuilder(muleProject);
        }
    }

    public void deconfigure() throws CoreException
    {
        // TODO Auto-generated method stub
    }

    private void registerHotDeploymentBuilder(MuleIdeProject muleProject)
    {
        
    }

    public IProject getProject()
    {
        return project;
    }

    public void setProject(IProject project)
    {
        this.project = project;
    }
    
    private MuleIdeProject getMuleIdeProject()
    {
        IJavaProject javaProject = JavaCore.create(project);
        return new MuleIdeProject(javaProject);
    }
}
