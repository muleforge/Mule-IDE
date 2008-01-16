/*
 * $Id: ChatStringToString.java 8279 2007-09-07 18:25:02Z aperepel $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.samples.hello;

import org.mule.transformers.AbstractTransformer;
import org.mule.umo.transformer.TransformerException;

/**
 * <code>NameStringToChatString</code> is a dummy transformer used in the hello world
 * application to transform the ChatString object into a string.
 */
public class ChatStringToString extends AbstractTransformer
{

    public ChatStringToString()
    {
        super();
        this.registerSourceType(ChatString.class);
        this.setReturnClass(String.class);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.mule.transformers.AbstractTransformer#doTransform(java.lang.Object)
     */
    public Object doTransform(Object src, String encoding) throws TransformerException
    {
        ChatString chatString = (ChatString)src;
        return chatString.toString();
    }
}
