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

import org.eclipse.jdt.core.IJavaProject;

/**
 * Implementors of this interface provide implementation bits in the process of converting any
 * given object to an {@link IJavaProject}.
 */
public interface ProjectFactoryConverter {
    
    /**
     * Convert the given object into an {@link IJavaProject} or into something that the 
     * {@link IdeProjectFactory} can use for further processing. Returning <code>null</code> means
     * that the conversion failed and the {@link IdeProjectFactory} should the conversion.
     */
    Object convert(Object source);
}
