package org.mule.ide.project.internal.runtime;

import java.io.File;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;

public class WebappSampleProject extends MuleSampleProject {

	public WebappSampleProject(MuleRuntime runtime, String name, String description, File dir) {
		super(runtime, name, description, dir);
	}

	@Override
	public void copyIntoProject(IJavaProject project) throws CoreException {
		super.copyIntoProject(project);
		
		// copy the test-data directory
//		File testDataDir = new File(root, "src/main/webapp");
//		copyIntoProject(testDataDir, project.getProject());
	}

	@Override
	protected List<File> getSourceDirectories() {
		List<File> sourceDirs = super.getSourceDirectories();
		
		File webappSource = new File(root, "src/main/webapp");
		sourceDirs.add(webappSource);
	
		return sourceDirs;
	}
}
