package org.mule.ide.project;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

public class MuleHotDeploymentBuilder extends IncrementalProjectBuilder
{
    public static final String BUILDER_ID = "org.mule.ide.project.MuleHotDeploymentBuilder";
    
    @Override
    protected IProject[] build(int kind, Map args, IProgressMonitor monitor) throws CoreException
    {
        MuleProjectPlugin.getInstance().logError("**** build!");
        
        return null;
    }
}
