package org.mule.ide.common.adapter;

import org.eclipse.core.runtime.IAdapterFactory;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.mule.ide.common.IdeProject;

public class JavaElementToIdeProject implements IAdapterFactory {

    @SuppressWarnings("unchecked")
    public Object getAdapter(Object adaptableObject, Class adapterType) {
        if ((adaptableObject instanceof IJavaElement) && (adapterType == IdeProject.class)) {
            IJavaElement javaElement = (IJavaElement)adaptableObject;
            return adaptJavaElementToProject(javaElement);
        }
        return null;
    }

    private Object adaptJavaElementToProject(IJavaElement javaElement) {
        IJavaProject javaProject = javaElement.getJavaProject();
        return new IdeProject(javaProject);
    }

    public Class<?>[] getAdapterList() {
        return new Class[] { IdeProject.class };
    }
}
