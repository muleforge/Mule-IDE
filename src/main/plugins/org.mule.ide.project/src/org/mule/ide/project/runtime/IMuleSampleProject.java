/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.runtime;

import java.io.File;
import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;

public interface IMuleSampleProject {
	String getName();
	String getDescription();
	File getDirectory();
	//List<File> getSourceDirectories();
	//List<File> getConfigFiles();
	//List<IMuleBundle> getMuleLibraryDependencies();
	//List<File> getOtherLibraryDependencies();
	void copyIntoProject(IJavaProject project) throws CoreException;
	
	/**
	 * @return The additional libraries that are downloaded as part of creating this sample
	 * project. Always returns a {@link Collection}, never <code>null</code>.
	 */
	Collection<IMuleBundle> getAdditionalLibraries();
}
