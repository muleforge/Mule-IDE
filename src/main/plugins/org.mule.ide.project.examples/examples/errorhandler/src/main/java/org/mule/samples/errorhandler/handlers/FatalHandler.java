/*
 * $Id: FatalHandler.java 10489 2008-01-23 17:53:38Z dfeist $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.samples.errorhandler.handlers;

import org.mule.api.lifecycle.FatalException;
import org.mule.samples.errorhandler.ErrorMessage;
import org.mule.samples.errorhandler.HandlerException;
import org.mule.samples.errorhandler.LocaleMessage;
import org.mule.util.StringMessageUtils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * <code>FatalBehaviour</code> TODO (document class)
 */
public class FatalHandler extends DefaultHandler
{
    /** logger used by this class */
    private static final Log logger = LogFactory.getLog(FatalHandler.class);

    public FatalHandler()
    {
        super();
        registerException(FatalException.class);
    }

    public void processException(ErrorMessage message, Throwable t) throws HandlerException
    {
        String msg = LocaleMessage.fatalHandlerMessage();
        System.out.println(StringMessageUtils.getBoilerPlate(msg));
        logger.fatal(LocaleMessage.fatalHandlerException(t), t);
    }
}
