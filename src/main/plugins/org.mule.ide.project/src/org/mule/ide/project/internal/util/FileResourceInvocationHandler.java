/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.project.internal.util;

import java.io.File;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IResource;

public class FileResourceInvocationHandler implements InvocationHandler
{
    private File file;

    public static IResource createResourceProxy(File file)
    {
        Class[] interfaces = new Class[] { IResource.class };
        return (IResource)createProxy(file, interfaces);
    }

    private static IContainer createContainerProxy(File file)
    {
        Class[] interfaces = new Class[] { IContainer.class };
        return (IContainer)createProxy(file, interfaces);
    }

    private static Object createProxy(File file, Class[] interfaces)
    {
        ClassLoader classLoader = FileResourceInvocationHandler.class.getClassLoader();
        InvocationHandler handler = new FileResourceInvocationHandler(file);
        return Proxy.newProxyInstance(classLoader, interfaces,  handler);
    }

    public FileResourceInvocationHandler(File file)
    {
        super();
        this.file = file;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        String methodName = method.getName();
        if (methodName.equals("getParent"))
        {
            File parent = file.getParentFile();
            return createContainerProxy(parent);
        }
        return null;
    }
}
