/* 
 * $Id$
 * ------------------------------------------------------------------------------------------------------
 * 
 * Copyright (c) SymphonySoft Limited. All rights reserved.
 * http://www.symphonysoft.com
 * 
 * The software in this package is published under the terms of the BSD
 * style license a copy of which has been included with this distribution in
 * the LICENSE.txt file. 
 *
 */
 
package org.mule.samples.hello;

import java.io.Serializable;


/**
 *  <code>ChatString</code> TODO (document class)
 *
 * @author <a href="mailto:ross.mason@symphonysoft.com">Ross Mason</a>
 * @version $Revision$
 */
public class ChatString implements Serializable
{
    private StringBuffer string = new StringBuffer();

    /**
     * @param str
     * @return
     */
    public StringBuffer append(String str)
    {
        return string.append(str);
    }

    /**
     * @param sb
     * @return
     */
    public StringBuffer append(StringBuffer sb)
    {
        return string.append(sb);
    }

    /**
     * @param offset
     * @param str
     * @return
     */
    public StringBuffer insert(int offset, char[] str)
    {
        return string.insert(offset, str);
    }

    /**
     * @param index
     * @param str
     * @param offset
     * @param len
     * @return
     */
    public StringBuffer insert(int index, char[] str, int offset, int len)
    {
        return string.insert(index, str, offset, len);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    public String toString()
    {
        return string.toString();
    }
    
    public int getSize()
    {
        return string.length();
    }
}
