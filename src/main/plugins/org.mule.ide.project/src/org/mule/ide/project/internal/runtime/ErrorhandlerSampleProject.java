package org.mule.ide.project.internal.runtime;

import java.io.File;

import org.eclipse.jdt.core.IJavaProject;
import org.mule.ide.project.runtime.IMuleRuntime;

public class ErrorhandlerSampleProject extends MuleSampleProject {

	public ErrorhandlerSampleProject(IMuleRuntime runtime, String name, String description, File root) {
		super(runtime, name, description, root);
	}

	@Override
	public void copyIntoProject(IJavaProject project) {
		super.copyIntoProject(project);
		
		// copy the test-data directory
		File testDataDir = new File(root, "test-data");
		copyIntoProject(testDataDir, project.getProject());
	}
}
