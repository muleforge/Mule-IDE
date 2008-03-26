/*
 * $Id: IMuleSample.java 1 2007-08-16 16:30:25Z quoc $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.runtime;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.eclipse.jdt.core.IJavaProject;

public interface IMuleSampleProject {
	String getName();
	String getDescription();
	File getDirectory();
	//List<File> getSourceDirectories();
	//List<File> getConfigFiles();
	//List<IMuleBundle> getMuleLibraryDependencies();
	//List<File> getOtherLibraryDependencies();
	void copyIntoProject(IJavaProject project);
}
