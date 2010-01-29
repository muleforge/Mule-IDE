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

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;

import org.mule.ide.project.runtime.Namespace;

/**
 * Helper class to load namespace information from the <code>spring.handlers</code> and
 * <code>spring.schemas</code> files inside a Jar.
 */
class NamespaceLoader {

    private static final HashSet<String> RESERVED_WORDS;
    
    private JarFile jarFile;
    private Properties springSchemas;
    private Properties springHandlers;
    
    static {
        RESERVED_WORDS = new HashSet<String>();
        RESERVED_WORDS.add("xml");
        RESERVED_WORDS.add("xmlns");
    }

    public Namespace[] load(File file) throws IOException {
        jarFile = new JarFile(file);

        try {
            loadSpringSchemas();
            if (springSchemas == null) {
                return new Namespace[0];
            }
            
            loadSpringHandlers();
            return assembleNamespaces();
        }
        catch (IOException iox) {
            return new Namespace[0];
        }
    }

    private void loadSpringSchemas() throws IOException {
        springSchemas = loadProperties("META-INF/spring.schemas");
    }

    private void loadSpringHandlers() throws IOException {
        springHandlers = loadProperties("META-INF/spring.handlers");
    }

    private Properties loadProperties(String resourceName) throws IOException {
        ZipEntry entry = jarFile.getEntry(resourceName);
        if (entry == null) {
            return null;
        }
        
        InputStream in = jarFile.getInputStream(entry);
        Properties props = new Properties();
        props.load(in);
        in.close();
        
        return props;
    }

    private Namespace[] assembleNamespaces() {
        List<Namespace> namespaces = new ArrayList<Namespace>();
        
        for (Object key : springHandlers.keySet()) {
            String uri = key.toString();
            String location = lookupLocationInSpringSchemas(uri);
            String prefix = createPrefix(location);
            
            namespaces.add(new Namespace(prefix, uri, location));
        }
        
        return namespaces.toArray(new Namespace[0]);
    }
    
    private String lookupLocationInSpringSchemas(String uri) {
        for (Object key : springSchemas.keySet()) {
            String location = key.toString();
            if (location.startsWith(uri)) {
                // some transports come in a normal and a secure format, e.g. smtp and smtps
                // take care here that we choose the correct location
                String remainder = location.replace(uri, "");
                if (remainder.startsWith("/")) {
                    return location.replace("\\:", ":");
                }
            }
        }
        
        // this may actually never happen, otherwise the spring.handlers and spring.schemas files
        // would be inconsistent. I doubt that Spring can handle this case.
        return null;
    }
    
    private String createPrefix(String location) {
        String[] locationParts = location.split("/");
        if (locationParts.length < 3) {
            return "Internal error: cannot determine prefix from location";
        }
        
        // the typical URL is something like
        // http://www.mulesource.org/schema/mule/email/2.2/mule-email.xsd
        // ignore the third last part should make a good schema prefix
        int prefixIndex = locationParts.length - 3;
        String prefix = locationParts[prefixIndex];
        
        // check if the detected prefix clashes with the xml namespace spec
        if (RESERVED_WORDS.contains(prefix) || prefix.startsWith("xml")) {
            prefix = "mule-" + prefix;
        }
        
        return prefix;
    }
}
