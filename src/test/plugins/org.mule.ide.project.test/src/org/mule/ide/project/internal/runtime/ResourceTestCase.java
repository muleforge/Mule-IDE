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

import static org.mule.ide.project.util.Assert.assertExists;

import java.io.File;

public class ResourceTestCase
{
    protected static File getTestResource(String filename)
    {
        File testResource = new File("test-resources", filename);
        assertExists(filename, testResource);
        return testResource;
    }
}
