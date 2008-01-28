/*
 * $Id: SoapStockQuoteFunctionalTestCase.java 10258 2008-01-08 18:17:45Z acooke $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.examples.stockquote;


public class SoapStockQuoteFunctionalTestCase extends AbstractStockQuoteFunctionalTestCase
{

    protected String getConfigResources()
    {
        return "stockquote-soap-config.xml";
    }
    
}
