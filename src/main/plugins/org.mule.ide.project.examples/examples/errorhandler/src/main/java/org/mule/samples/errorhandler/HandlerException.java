/*
 * $Id: HandlerException.java 10489 2008-01-23 17:53:38Z dfeist $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.samples.errorhandler;

import org.mule.api.MuleException;
import org.mule.config.i18n.MessageFactory;

public class HandlerException extends MuleException
{

    /**
     * Serial version
     */
    private static final long serialVersionUID = -1446892313657626797L;

    public HandlerException(String message)
    {
        super(MessageFactory.createStaticMessage(message));
    }

    public HandlerException(String message, Throwable cause)
    {
        super(MessageFactory.createStaticMessage(message), cause);
    }

}
