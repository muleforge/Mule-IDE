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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.io.File;

import org.junit.Test;

public class JarBundleTestCase extends ResourceTestCase
{
    @Test
    public void jarBundleWithoutPom()
    {
        File jarFile = getTestResource("mule-module-without-pom.jar");
        JarBundle jarBundle = new JarBundle(null, jarFile);
        assertFalse(jarBundle.isModuleOrTransport());
    }

    @Test
    public void jarBundleWithPomThatHasNoNameElement()
    {
        File jarFile = getTestResource("jar-with-pom-no-name-element.jar");
        JarBundle jarBundle = new JarBundle(null, jarFile);
        assertEquals("Missing <name> element in pom.xml inside jar-with-pom-no-name-element.jar",
            jarBundle.getDisplayName());
    }

    @Test
    public void jarBundleWithPom() throws Exception
    {
        File jarFile = getTestResource("jar-with-pom-in-META-INF.jar");
        JarBundle jarBundle = new JarBundle(null, jarFile);
        assertEquals("Spring Config", jarBundle.getDisplayName());
    }
}
