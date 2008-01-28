/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the MuleSource MPL
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

/**
 * 
 */
package org.mule.ide.core.builder;

import org.xml.sax.SAXException;

class WrongRootException extends SAXException {

    private static final long serialVersionUID = 3L;

    WrongRootException(String messageText) {
        super(messageText);
    }

}