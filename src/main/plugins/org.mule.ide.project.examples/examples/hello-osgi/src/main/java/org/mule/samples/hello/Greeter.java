/*
 * $Id: Greeter.java 8726 2007-10-01 11:12:14Z dirk.olmes $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.samples.hello;

/**
 * <code>Greeter</code> TODO (document class)
 * 
 * @author <a href="mailto:ross.mason@symphonysoft.com">Ross Mason</a>
 * @version $Revision: 8726 $
 */
public class Greeter
{
    String greeting = "Hello ";

    public void greet(NameString person)
    {
        person.setGreeting(greeting);

    }
}
