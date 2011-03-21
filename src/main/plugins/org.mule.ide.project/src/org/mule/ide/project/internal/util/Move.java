package org.mule.ide.project.internal.util;

import java.io.File;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.IFileSystem;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * Move files using {@link EFS}
 */
public class Move
{
    private File source;
    private File destination;

    public Move(IPath source, IPath destination)
    {
        super();
        this.source = source.toFile();
        this.destination = destination.toFile();
    }
    
    public void execute(IProgressMonitor progressMonitor) throws CoreException
    {
        IFileSystem localFileSystem = EFS.getLocalFileSystem();
        
        IFileStore sourceFileStore = localFileSystem.getStore(source.toURI());
        IFileStore destFileStore = localFileSystem.getStore(destination.toURI());
        
        sourceFileStore.move(destFileStore, EFS.OVERWRITE, progressMonitor);        
    }
}
