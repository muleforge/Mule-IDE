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

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mule.ide.project.runtime.IMuleBundle;
import org.mule.ide.project.runtime.IMuleRuntime;
import org.mule.ide.project.util.FileUtils;
import org.mule.ide.project.util.Unzip;

public class CreateJarBundleTestCase extends ResourceTestCase
{
    private static File TempDir = null;

    @BeforeClass
    public static void unpackMuleTestDistribution() throws Exception
    {
        TempDir = FileUtils.createTempDirectory();

        File distributionFile = getTestResource("mule-test-distro.zip");
        new Unzip(distributionFile).unpack(TempDir);
    }

    @AfterClass
    public static void deleteMuleDistro() throws IOException
    {
        FileUtils.deleteRecursively(TempDir);
    }

    @Test
    public void regularMuleBundle()
    {
        IMuleBundle regularBundle = getMuleBundle("mule-module-xml");
        assertNotNull(regularBundle);
        assertFalse(regularBundle.isSpringConfigBundle());
    }

    @Test
    public void springConfigMuleBundle()
    {
        IMuleBundle springConfigBundle = getMuleBundle("mule-module-spring-config");
        assertNotNull(springConfigBundle);
        assertTrue(springConfigBundle.isSpringConfigBundle());
    }

    private IMuleBundle getMuleBundle(String name)
    {
        File distroDir = new File(TempDir, "mule");
        IMuleRuntime runtime = new MuleRuntime(distroDir);
        return runtime.getMuleLibrary(name);
    }
}
