package org.mule.ide.project.internal.runtime;

import java.io.File;

import org.mule.ide.project.runtime.IMuleRuntime;

public class SpringConfigMuleBundle extends JarBundle {
    
    public SpringConfigMuleBundle(IMuleRuntime runtime, File jar)
    {
        super(runtime, jar);
    }

    @Override
    public boolean isSpringConfigBundle() {
        return true;
    }
}
