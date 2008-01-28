/*
 * $Id: ErrorMessageToExceptionBean.java 8077 2007-08-27 20:15:25Z aperepel $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.samples.errorhandler;

import org.mule.transformers.AbstractTransformer;
import org.mule.umo.transformer.TransformerException;

/**
 * The <code>ErrorMessageToExceptionBean</code> transformer returns 
 * the exception bean encapsulated by the ErrorMessage message payload.
 */
public class ErrorMessageToExceptionBean extends AbstractTransformer
{

    public ErrorMessageToExceptionBean()
    {
        registerSourceType(ErrorMessage.class);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.mule.transformers.AbstractTransformer#doTransform(java.lang.Object)
     */
    public Object doTransform(Object src, String encoding) throws TransformerException
    {
        return ((ErrorMessage)src).getException();
    }

}
