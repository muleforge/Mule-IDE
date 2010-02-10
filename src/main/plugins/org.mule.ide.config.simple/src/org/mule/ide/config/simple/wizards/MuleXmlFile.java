/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.config.simple.wizards;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.mule.ide.project.runtime.IMuleBundle;
import org.mule.ide.project.runtime.Namespace;

public class MuleXmlFile
{
    private static final String LINE_SEP = System.getProperty("line.separator");

    public static InputStream generateXmlFile(List<IMuleBundle> muleArtifacts)
    {
        StringBuilder buf = new StringBuilder(128);
        buf.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        buf.append(LINE_SEP);

        appendCoreNamespace(buf, muleArtifacts);
        appendNamespaces(buf, muleArtifacts);
        appendSchemaLocations(buf, muleArtifacts);

        buf.append("</mule>");
        buf.append(LINE_SEP);

        return new ByteArrayInputStream(buf.toString().getBytes());
    }

    private static void appendCoreNamespace(StringBuilder buf, List<IMuleBundle> muleArtifacts)
    {
        IMuleBundle springConfigBundle = findSpringConfigBundle(muleArtifacts);

        // find mule-core.xsd and make it the default namespace for the document
        Namespace coreNamespace = findCoreNamespace(springConfigBundle.getNamespaces());
        buf.append("<mule xmlns=\"");
        buf.append(coreNamespace.location);
        buf.append("\"");
        buf.append(LINE_SEP);
    }

    private static Namespace findCoreNamespace(Namespace[] namespaces)
    {
        // find mule-core.xsd
        Namespace coreNamespace = null;
        for (Namespace namespace : namespaces)
        {
            if (namespace.location.endsWith("mule.xsd"))
            {
                coreNamespace = namespace;
                break;
            }
        }
        return coreNamespace;
    }

    private static void appendNamespaces(StringBuilder buf, List<IMuleBundle> muleArtifacts)
    {
        buf.append("      xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"");
        buf.append(LINE_SEP);

        for (IMuleBundle bundle : muleArtifacts)
        {
            // mule-module-spring-config contains the core namespace and is the
            // default namespace
            // of the generated xml file
            if (bundle.isSpringConfigBundle())
            {
                continue;
            }

            for (Namespace namespace : bundle.getNamespaces())
            {
                buf.append("      xmlns:");
                buf.append(namespace.prefix);
                buf.append("=\"");
                buf.append(namespace.uri);
                buf.append("\"");
                buf.append(LINE_SEP);
            }
        }
    }

    private static void appendSchemaLocations(StringBuilder buf, List<IMuleBundle> muleArtifacts)
    {
        buf.append("      xsi:schemaLocation=\"");

        for (IMuleBundle bundle : muleArtifacts)
        {
            // only include the core namespace from the spring-config bundle
            if (bundle.isSpringConfigBundle())
            {
                Namespace coreNamespace = findCoreNamespace(bundle.getNamespaces());
                appendSchemaLocation(buf, coreNamespace);
            }
            else
            {
                for (Namespace namespace : bundle.getNamespaces())
                {
                    appendSchemaLocation(buf, namespace);
                }
            }
        }

        buf.append("\">");
        buf.append(LINE_SEP);
        buf.append(LINE_SEP);
    }

    private static void appendSchemaLocation(StringBuilder buf, Namespace namespace)
    {
        buf.append(LINE_SEP);
        buf.append("          ");
        buf.append(namespace.uri);
        buf.append(" ");
        buf.append(namespace.location);
    }

    private static IMuleBundle findSpringConfigBundle(List<IMuleBundle> muleArtifacts)
    {
        for (IMuleBundle bundle : muleArtifacts)
        {
            if (bundle.isSpringConfigBundle())
            {
                return bundle;
            }
        }

        // this should not happen, the dialog using this class should make sure that
        // the
        // spring config plugin cannot be deselected
        return null;
    }
}
