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

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mule.ide.project.runtime.Namespace;

public class NamespaceLoaderTestCase extends ResourceTestCase
{
    private static Comparator<Namespace> CompareByPrefix = new Comparator<Namespace>()
    {
        public int compare(Namespace ns1, Namespace ns2)
        {
            return ns1.prefix.compareTo(ns2.prefix);
        }
    };

    private NamespaceLoader loader;

    @Before
    public void createNamespaceLoader()
    {
        loader = new NamespaceLoader();
    }

    @Test
    public void loadJarWithoutSpringPropertiesFiles() throws Exception
    {
        Namespace[] namespaces = loadNamespaces("mule-module-without-pom.jar");
        assertNotNull(namespaces);
        assertEquals(0, namespaces.length);
    }

    @Test
    public void loadJarWithMuleTwoFormat() throws Exception
    {
        Namespace[] namespaces = loadNamespaces("NamespaceLoader-Mule2.jar");
        assertEquals(7, namespaces.length);

        assertNamespacePrefixes(namespaces, "email", "imap", "imaps", "pop3", "pop3s", "smtp", "smtps");
        assertUri("http://www.mulesource.org/schema/mule/email/2.2", namespaces[0]);
        assertLocation("http://www.mulesource.org/schema/mule/email/2.2/mule-email.xsd", namespaces[0]);
    }

    @Test
    public void loadJarWithMuleThreeFormat() throws Exception
    {
        Namespace[] namespaces = loadNamespaces("NamespaceLoader-Mule3.jar");
        assertEquals(7, namespaces.length);

        assertNamespacePrefixes(namespaces, "email", "imap", "imaps", "pop3", "pop3s", "smtp", "smtps");
        assertUri("http://www.mulesoft.org/schema/mule/email", namespaces[0]);
        assertLocation("http://www.mulesoft.org/schema/mule/email/3.0/mule-email.xsd", namespaces[0]);
    }

    @Test
    public void escapeInvalidSchemaPrefix() throws Exception
    {
        Namespace[] namespaces = loadNamespaces("NamespaceLoader-InvalidPrefixes.jar");
        assertEquals(1, namespaces.length);
        assertEquals("mule-xml", namespaces[0].prefix);
    }

    private Namespace[] loadNamespaces(String jarName) throws Exception
    {
        File file = getTestResource(jarName);
        return loader.load(file);
    }

    private void assertNamespacePrefixes(Namespace[] namespaces, String... expectedPrefixes)
    {
        Arrays.sort(namespaces, CompareByPrefix);

        int i = 0;
        for (String prefix : expectedPrefixes)
        {
            Assert.assertEquals(prefix, namespaces[i].prefix);
            i++;
        }
    }

    private void assertLocation(String expected, Namespace namespace)
    {
        assertEquals(expected, namespace.location.toString());
    }

    private void assertUri(String expected, Namespace namespace)
    {
        assertEquals(expected, namespace.uri.toString());
    }
}
