/*
 * $Id: StringToNameString.java 8726 2007-10-01 11:12:14Z dirk.olmes $
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
 * <code>StringToNameString</code> converts from a String to a NameString object
 * 
 * @author <a href="mailto:ross.mason@symphonysoft.com">Ross Mason</a>
 * @version $Revision: 8726 $
 */
public class StringToNameString extends AbstractTransformer
{
    /**
     * Serial version
     */
    private static final long serialVersionUID = -408128452488674866L;

    public StringToNameString()
    {
        super();
        this.registerSourceType(String.class);
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.mule.transformers.AbstractTransformer#doTransform(java.lang.Object)
     */
    public Object doTransform(Object src, String encoding) throws TransformerException
    {
        String name = (String)src;
        int i = name.indexOf("\r");
        if (i > -1)
        {
            name = name.substring(0, i);
        }
        return new NameString(name);
    }

}
