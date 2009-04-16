package org.mule.ide.project.internal.runtime;

import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathContainer;
import org.eclipse.jdt.core.IClasspathEntry;
import org.mule.ide.project.runtime.IMuleRuntime;

public class MuleClasspathContainer implements IClasspathContainer {
	private IPath path;
	private IMuleRuntime runtime;
	private IClasspathEntry[] classpathEntries;

	public MuleClasspathContainer(IPath path, IMuleRuntime runtime, IClasspathEntry[] entries) {
		super();
		this.path = path;
		this.runtime = runtime;
		this.classpathEntries = entries;
	}
	
	public IClasspathEntry[] getClasspathEntries() {
		return classpathEntries;
	}

	public String getDescription() {
		return "Mule Libraries [" + runtime.getDirectory().getName() + "]";
	}

	public int getKind() {
		return K_APPLICATION; 
	}

	public IPath getPath() {
		return path;
	}

	@Override
	public String toString() {
		return this.getDescription();
	}
}
