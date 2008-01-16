/*
 * $Id: ErrorHandlerTestDataGenerator.java 8077 2007-08-27 20:15:25Z aperepel $
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSource, Inc.  All rights reserved.  http://www.mulesource.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.samples.errorhandler;

import org.mule.MuleException;
import org.mule.config.i18n.MessageFactory;
import org.mule.samples.errorhandler.exceptions.BusinessException;
import org.mule.transformers.xml.ObjectToXml;
import org.mule.umo.lifecycle.FatalException;
import org.mule.umo.transformer.TransformerException;
import org.mule.util.FileUtils;

import java.io.IOException;

public class ErrorHandlerTestDataGenerator
{

    public static void generateTestData(String targetDir) throws IOException, TransformerException
    {
        if (!(targetDir.endsWith("/") || targetDir.endsWith("\\")))
        {
            targetDir += "/";
        }

        ObjectToXml trans = new ObjectToXml();
        MuleException exception = new MuleException(MessageFactory.createStaticMessage("Some default exception"));
        FatalException fatal = new FatalException(MessageFactory.createStaticMessage("Some fatal exception"),
            new IOException("Some IO exception"));
        BusinessException business = new BusinessException("Some business exception");

        ExceptionBean bean = new ExceptionBean(exception);
        String xml = (String)trans.transform(bean);
        FileUtils.stringToFile(targetDir + "MuleException.xml", xml);

        bean = new ExceptionBean(fatal);
        xml = (String)trans.transform(bean);
        FileUtils.stringToFile(targetDir + "FatalException.xml", xml);

        bean = new ExceptionBean(business);
        xml = (String)trans.transform(bean);
        FileUtils.stringToFile(targetDir + "BusinesException.xml", xml);
    }

    public static void main(String[] args)
    {

        if (args.length == 0)
        {
            System.out.println("You must specifiy a target directory for the output files");
            System.exit(1);
        }
        String path = args[0];
        try
        {
            generateTestData(path);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
