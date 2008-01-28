/*
 * $Id: ScriptingExampleTestCase.java 10037 2007-12-07 18:20:44Z tcarlson $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.examples.scripting;

import org.mule.extras.client.MuleClient;
import org.mule.impl.MuleMessage;
import org.mule.tck.FunctionalTestCase;
import org.mule.umo.UMOMessage;

public class ScriptingExampleTestCase extends FunctionalTestCase
{    
    protected String getConfigResources()
    {
        return "scripting-config.xml";
    }

    public void testScriptingExample() throws Exception
    {
        MuleClient client = new MuleClient();
        UMOMessage reply = client.send("vm://scripting", new MuleMessage("mule"));
        
        assertNotNull(reply);
        assertNotNull(reply.getPayload());
        assertEquals("[Hello, :-)]", reply.getPayloadAsString()); 
    }
}


