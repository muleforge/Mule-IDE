package org.mule.ide.project.internal.util;

import java.io.File;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.IFileSystem;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Copy files using {@link EFS}
 */
public class Copy
{
    private File source;
    private File destination;

    public Copy(File source, File destination)
    {
        super();
        this.source = source;
        this.destination = destination;
    }
    
    public void execute(IProgressMonitor progressMonitor) throws CoreException
    {
        IFileSystem localFileSystem = EFS.getLocalFileSystem();
        
        IFileStore sourceFileStore = localFileSystem.getStore(source.toURI());
        IFileStore destFileStore = localFileSystem.getStore(destination.toURI());
        
        sourceFileStore.copy(destFileStore, EFS.OVERWRITE, progressMonitor);        
    }
}
