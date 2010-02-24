/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.common.projectfactory;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.JavaCore;
import org.mule.ide.common.IdeProject;

/**
 * This converter ensures that non-Java projects do not accidentially get converted to an
 * {@link IdeProject}, which will fail anyway.
 */
public class NonJavaProjectConverter implements ProjectFactoryConverter {

    public Object convert(Object source) {
        IProject project = (IProject)source;
        
        if (checkJavaNature(project) == false) {
            return null;
        }
        
        return source;
    }

    private boolean checkJavaNature(IProject project) {
        try {
            return project.hasNature(JavaCore.NATURE_ID);
        }
        catch (CoreException e) {
            return false;
        }
    }
}
