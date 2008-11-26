/**
 * $Id: IMuleBundle.java 1 2007-08-16 16:30:25Z quoc $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * MULE_LICENSE.txt file.
 */

package org.mule.ide.project.runtime;

import java.io.File;
import java.util.Set;

public interface IMuleBundle {
	File getFile();
	String getPathifiedName();
	Set<IMuleBundle> getDependencies();
	File getSourcePath();
	String getVersion();
}
