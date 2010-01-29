/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.runtime;


/**
 * This class aggregates the parts that identify a Mule XML namespace.
 */
public class Namespace {
    public final String prefix;
    public final String uri;
    public final String location;

    public Namespace(String prefix, String uri, String location) {
        super();
        this.prefix = prefix;
        this.uri = uri;
        this.location = location;
    }
}
