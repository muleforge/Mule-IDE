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

import java.io.File;

import org.mule.ide.project.runtime.IMuleRuntime;

public class SpringConfigMuleBundle extends JarBundle {
    
    public SpringConfigMuleBundle(IMuleRuntime runtime, File jar)
    {
        super(runtime, jar);
    }

    @Override
    public boolean isSpringConfigBundle() {
        return true;
    }
}
