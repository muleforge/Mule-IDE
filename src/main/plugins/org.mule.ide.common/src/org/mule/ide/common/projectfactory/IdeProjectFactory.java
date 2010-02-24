/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.ide.common.projectfactory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.internal.ui.packageview.ClassPathContainer;
import org.eclipse.jface.viewers.ISelection;
import org.mule.ide.common.IdeProject;
import org.mule.ide.common.InvalidIdeProject;

/**
 * This is a factory for {@link IdeProject} instances from various sources.
 */
public class IdeProjectFactory<T extends IdeProject> {
    
    @SuppressWarnings("unchecked")
    private Class<T> projectClass = (Class<T>)IdeProject.class;
    @SuppressWarnings("unchecked")
    private Class<T> invalidprojectClass = (Class<T>)InvalidIdeProject.class;
    private Map<Class<?>, ProjectFactoryConverter> converters;
    
    public IdeProjectFactory() {
        super();
        initConverters();
    }
    
    public IdeProjectFactory(Class<T> classToInstantiate) {
        super();
        projectClass = classToInstantiate;
        initConverters();
    }
    
    private void initConverters() {
        converters = new LinkedHashMap<Class<?>, ProjectFactoryConverter>();
        
        converters.put(ISelection.class, new SelectionConverter());
        converters.put(IProject.class, new NonJavaProjectConverter());
        converters.put(IResource.class, new ResourceToJavaProject());
        converters.put(IJavaElement.class, new JavaElementToJavaProject());
        converters.put(ClassPathContainer.class, new ClassPathContainerToJavaProject());
    }
    
    public T create(Object source) {
        Class<?> sourceClass = source.getClass();
        
        for (Class<?> klass : converters.keySet()) {
            if (klass.isAssignableFrom(sourceClass)) {
                return applyConverter(converters.get(klass), source);
            }
        }
        
        return cannotCreateProject();
    }

    protected T applyConverter(ProjectFactoryConverter converter, Object source) {
        Object conversionStep = converter.convert(source);
        if (conversionStep == null) {
            return cannotCreateProject();
        }
        if (conversionStep instanceof IJavaProject) {
            return newInstance((IJavaProject)conversionStep);
        }
        else {
            return create(conversionStep);
        }
    }

    protected T newInstance(IJavaProject javaProject) {
        try {
            Constructor<T> constructor = projectClass.getConstructor(IJavaProject.class);
            return constructor.newInstance(javaProject);
        }
        catch (InvocationTargetException e) {
            String message = "Exception while creating an instance of " + projectClass.getName();
            throw new RuntimeException(message, e);
        }
        catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }

    protected T cannotCreateProject() {
        try {
            return invalidprojectClass.newInstance();
        }
        catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
    
    @SuppressWarnings("unchecked")
    public void setInvalidProjectClass(Class<? extends T> klass) {
        invalidprojectClass = (Class<T>)klass;
    }
}
