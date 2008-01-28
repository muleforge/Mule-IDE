package org.mule.ide.config.common.tests.xmlsync;

import java.io.IOException;
import java.util.Collections;

import junit.framework.TestCase;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.mule.ide.config.common.tests.util.WorkspaceHelper;
import org.mule.ide.config.tests.park.DocumentRoot;
import org.mule.ide.config.tests.park.ParkType;
import org.mule.ide.config.tests.park.util.ParkResourceFactoryImpl;

public class Loading extends TestCase {

	private WorkspaceHelper helper;
	private IProject project;
	private IPath xmlFile;

	public Loading(String name) {
		super(name);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		helper = new WorkspaceHelper();
		project = helper.createProject("XMLSync");
		xmlFile = helper.addFileFromResource(project.getFullPath(), "park.xml", "/org/mule/ide/config/common/tests/xmlsync/park.xml");
	}
	
	@Override
	protected void tearDown() throws Exception {
		helper.dispose();
		super.tearDown();
	}
	
	public void testLoad() throws IOException {
		Resource resource = new ParkResourceFactoryImpl().createResource(URI.createPlatformResourceURI(xmlFile.toPortableString(), true));
		resource.load(Collections.emptyMap());
		DocumentRoot documentRoot = (DocumentRoot) resource.getContents().get(0);

		ParkType p = documentRoot.getPark();
		assertEquals("expect two vehicles", 2, p.getAbstractVehicle().size());
		
	}
	
}
