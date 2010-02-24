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

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;


public class SelectionConverter implements ProjectFactoryConverter {
    
    public Object convert(Object source) {
        ISelection selection = (ISelection)source;
        
        if (selection.isEmpty()) {
            return null;
        }
        
        if (selection instanceof IStructuredSelection) {
            IStructuredSelection structuredSelection = (IStructuredSelection)selection;
            return structuredSelection.getFirstElement();
        }
        
        return null;
    }
}
