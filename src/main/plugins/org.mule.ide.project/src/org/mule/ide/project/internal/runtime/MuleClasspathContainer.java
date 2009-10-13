/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

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
