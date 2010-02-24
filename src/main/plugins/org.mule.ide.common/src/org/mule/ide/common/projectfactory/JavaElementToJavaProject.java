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

import org.eclipse.jdt.core.IJavaElement;

public class JavaElementToJavaProject implements ProjectFactoryConverter {

    public Object convert(Object source) {
        IJavaElement javaElement = (IJavaElement)source;
        return javaElement.getJavaProject();
    }
}
