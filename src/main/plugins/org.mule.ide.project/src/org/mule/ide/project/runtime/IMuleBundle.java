/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.runtime;

import java.io.File;
import java.util.Set;

public interface IMuleBundle {
	String MULE_MODULE_PREFIX = IMuleRuntime.MULE_BUNDLE_PREFIX + "module-";
	String MULE_TRANSPORT_PREFIX = IMuleRuntime.MULE_BUNDLE_PREFIX + "transport-";
	
	File getFile();
	String getPathifiedName();
	Set<IMuleBundle> getDependencies();
	File getSourcePath();
	String getVersion();
	String getDisplayName();
}
