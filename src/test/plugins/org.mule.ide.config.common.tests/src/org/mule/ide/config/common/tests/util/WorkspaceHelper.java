package org.mule.ide.config.common.tests.util;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.jobs.Job;

public class WorkspaceHelper {

	public static final boolean DELETE_BEFORE_TESTS = true;

	private Map<String, IProject> ourProjects = new HashMap<String, IProject>(
			20);
	private IWorkspace theWorkspace;

	public WorkspaceHelper() throws CoreException {
		theWorkspace = ResourcesPlugin.getWorkspace();
		if (DELETE_BEFORE_TESTS) {
			theWorkspace.getRoot().delete(true, true, null);
		}
	}

	public IPath addFolder(IPath root, String name) throws CoreException {
		IPath path = root.append(name);
		createFolder(path);
		return path;
	}

	public void incrementalBuild() throws CoreException {
		getWorkspace().build(IncrementalProjectBuilder.INCREMENTAL_BUILD, null);
	}

	public void fullBuild() throws CoreException {
		getWorkspace().build(IncrementalProjectBuilder.FULL_BUILD, null);
	}

	public void waitForBuild() {
		boolean wasInterrupted = false;
		do {
			try {
				Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD,
						null);
				wasInterrupted = false;
			} catch (InterruptedException e) {
				wasInterrupted = true;
			}
		} while (wasInterrupted);
	}

	private IFolder createFolder(IPath path) throws CoreException {
		if (path.segmentCount() <= 1)
			return null;

		IFolder folder = theWorkspace.getRoot().getFolder(path);
		if (!folder.exists()) {
			folder.create(true, true, null);
		}
		return folder;
	}

	public IProject createProject(String name) throws CoreException {
		final IProject project = theWorkspace.getRoot().getProject(name);
		IWorkspaceRunnable create = new IWorkspaceRunnable() {

			public void run(IProgressMonitor monitor) throws CoreException {
				project.create(monitor);
				project.open(monitor);
			}
		};

		theWorkspace.run(create, null);
		ourProjects.put(name, project);

		return project;
	}

	public void dispose() throws CoreException {
		if (DELETE_BEFORE_TESTS)
			return;

		for (Iterator<IProject> it = ourProjects.values().iterator(); it
				.hasNext();) {
			IProject project = it.next();
			project.delete(true, null);
		}
	}

	public IPath addFile(IPath folder, String fileName, String contents)
			throws CoreException, UnsupportedEncodingException {
		IPath filePath = folder.append(fileName);
		createFile(filePath, contents.getBytes("UTF8"));
		return filePath;
	}

	public IPath addFileFromResource(IPath folder, String fileName, String path)
			throws CoreException {
		IPath filePath = folder.append(fileName);
		createFileFromResource(filePath, path);
		return filePath;
	}

	private IFile createFile(IPath filePath, byte[] contents)
			throws CoreException {
		IFile file = theWorkspace.getRoot().getFile(filePath);
		ByteArrayInputStream in = new ByteArrayInputStream(contents);
		if (file.exists())
			file.setContents(in, true, false, null);
		else
			file.create(in, true, null);
		return file;
	}

	private IFile createFileFromResource(IPath filePath, String fullPath)
			throws CoreException {
		IFile newFile = theWorkspace.getRoot().getFile(filePath);
		InputStream in = WorkspaceHelper.class.getClassLoader().getResourceAsStream(fullPath);
		if (! newFile.exists())
			newFile.create(in, true, null);
		else
			newFile.setContents(in, true, false, null);

		return newFile;
	}

	public IWorkspace getWorkspace() {
		return theWorkspace;
	}
}
