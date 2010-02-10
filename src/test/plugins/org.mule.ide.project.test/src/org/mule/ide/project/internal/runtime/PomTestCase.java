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
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Test;

public class PomTestCase extends ResourceTestCase
{
    @Test
    public void groupIdFromParentDeclaration() throws Exception
    {
        loadPomAndAssertGroupId("pom-with-groupId-in-parent.xml");
    }

    @Test
    public void groupIdFromPomFile() throws Exception
    {
        loadPomAndAssertGroupId("pom-with-groupId.xml");
    }

    @Test
    public void groupIdFromPomAndParentHasGroupId() throws Exception
    {
        loadPomAndAssertGroupId("pom-with-parent-and-groupId.xml");
    }

    @Test
    public void loadFromJarWherePomIsInMetaInfDir()
    {
        File jarFile = getTestResource("jar-with-pom-in-META-INF.jar");

        Pom pom = Pom.loadFromJar(jarFile);
        assertNotNull(pom);
    }

    @Test
    public void loadFromJarWherePomIsNotInMetaInfDir()
    {
        File jarFile = getTestResource("jar-with-pom.jar");
        Pom result = Pom.loadFromJar(jarFile);
        assertNull(result);
    }

    @Test
    public void parsePomWithoutNameElement() throws Exception
    {
        Pom pom = loadPom("pom-without-name.xml");
        assertNull(pom.getName());
    }

    private void loadPomAndAssertGroupId(String fileName) throws Exception
    {
        Pom pom = loadPom(fileName);
        String groupId = pom.getGroupId();
        assertNotNull(groupId);
        assertEquals("the.group.id", groupId);
    }

    private Pom loadPom(String filename) throws FileNotFoundException
    {
        File pomFile = getTestResource(filename);

        InputStream pomInputStream = new FileInputStream(pomFile);
        return Pom.loadFromStream(pomInputStream);
    }
}
