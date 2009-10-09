package org.mule.ide.project.internal.runtime;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;
import static org.mule.ide.project.util.Assert.assertExists;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.Test;

public class PomTestCase {
    @Test
    public void groupIdFromParentDeclaration() throws Exception {
    	loadPomAndAssertGroupId("pom-with-groupId-in-parent.xml");
    }
    
    @Test
    public void groupIdFromPomFile() throws Exception {
        loadPomAndAssertGroupId("pom-with-groupId.xml");
    }
    
    @Test
    public void loadFromJarWherePomIsInMetaInfDir() {
    	File jarFile = getTestResource("jar-with-pom-in-META-INF.jar");
    	
    	Pom pom = Pom.loadFromJar(jarFile);
    	assertNotNull(pom);
    }
    
    @Test(expected = IllegalStateException.class)
    public void loadFromJarWherePomIsNotInMetaInfDir() {
    	File jarFile = getTestResource("jar-with-pom.jar");
    	Pom.loadFromJar(jarFile);
    	fail();
    }
    
    private void loadPomAndAssertGroupId(String fileName) throws Exception {
        Pom pom = loadPom(fileName);
        String groupId = pom.getGroupId();
        assertNotNull(groupId);
        assertEquals("the.group.id", groupId);
    }
    
    private Pom loadPom(String filename) throws FileNotFoundException {
        File pomFile = getTestResource(filename);
        
        InputStream pomInputStream = new FileInputStream(pomFile);
        return Pom.loadFromStream(pomInputStream);
    }
    
    private File getTestResource(String filename) {
    	File testResource = new File("test-resources", filename);
    	assertExists(testResource);
    	return testResource;
    }
}
