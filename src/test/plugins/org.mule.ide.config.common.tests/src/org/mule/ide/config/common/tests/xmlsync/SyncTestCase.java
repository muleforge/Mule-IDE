package org.mule.ide.config.common.tests.xmlsync;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import javax.xml.namespace.NamespaceContext;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import junit.framework.TestCase;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.mule.ide.config.common.SyncResource;
import org.mule.ide.config.common.tests.util.WorkspaceHelper;
import org.mule.ide.config.tests.cars.CarsPackage;
import org.mule.ide.config.tests.park.DocumentRoot;
import org.mule.ide.config.tests.park.ParkPackage;
import org.mule.ide.config.tests.park.util.ParkResourceFactoryImpl;
import org.w3c.dom.Node;

public abstract class SyncTestCase extends TestCase {

	protected static final class ECoreNamespaceContext implements NamespaceContext {
			private EPackage[] namespaces;
	
			public ECoreNamespaceContext(EPackage... namespaces) {
				this.namespaces = namespaces;
			}
	
			@Override
			public String getNamespaceURI(String prefix) {
				for (int i = 0; i < namespaces.length; ++i) {
					if (namespaces[i].getNsPrefix().equals(prefix))
						return namespaces[i].getNsURI();
				}
				return null;
			}
	
			@Override
			public String getPrefix(String namespaceURI) {
				for (int i = 0; i < namespaces.length; ++i) {
					if (namespaces[i].getNsURI().equals(namespaceURI))
						return namespaces[i].getNsPrefix();
				}
				return null;
			}
	
			@Override
			public Iterator<?> getPrefixes(String namespaceURI) {
				Collection<String> prefixes = new LinkedList<String>(); 
				for (int i = 0; i < namespaces.length; ++i) {
					if (namespaces[i].getNsURI().equals(namespaceURI))
						prefixes.add(namespaces[i].getNsPrefix());
				}
				return prefixes.iterator();
	
			}
		}

	private WorkspaceHelper helper;
	private IProject project;
	private IPath xmlFile;
	protected DocumentRoot documentRoot;
	protected SyncResource resource;

	public SyncTestCase() {
		super();
	}

	public SyncTestCase(String name) {
		super(name);
	}

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		helper = new WorkspaceHelper();
		project = helper.createProject("XMLSync" + (int)(Math.random()*1000000));
		xmlFile = helper.addFileFromResource(project.getFullPath(), "park.xml", "/org/mule/ide/config/common/tests/xmlsync/park.xml");
	
		resource = (SyncResource) new ParkResourceFactoryImpl().createResource(URI.createPlatformResourceURI(xmlFile.toPortableString(), true));
		resource.load(Collections.emptyMap());
		documentRoot = (DocumentRoot) resource.getContents().get(0);
	}

	protected String xpath(String expr) {
		try {
			XPath newXPath = XPathFactory.newInstance().newXPath();
			
			NamespaceContext namespaceContext =
				new ECoreNamespaceContext(ParkPackage.eINSTANCE, CarsPackage.eINSTANCE);
	
			newXPath.setNamespaceContext(namespaceContext);
			return newXPath.evaluate(expr, resource.getDocument());
		} catch (XPathExpressionException e) {
			fail("Cannot evaluate xpath '" + expr + "' :" + e.getMessage());
			return null;
		}
	}

	protected Node xpathNode(String expr) {
		try {
			XPath newXPath = XPathFactory.newInstance().newXPath();
			
			NamespaceContext namespaceContext =
				new ECoreNamespaceContext(ParkPackage.eINSTANCE, CarsPackage.eINSTANCE);
	
			newXPath.setNamespaceContext(namespaceContext);
			return (Node)newXPath.evaluate(expr, resource.getDocument(), XPathConstants.NODE);
		} catch (XPathExpressionException e) {
			fail("Cannot evaluate xpath '" + expr + "' :" + e.getMessage());
			return null;
		}
	}

	@Override
	protected void tearDown() throws Exception {
		helper.dispose();
		super.tearDown();
	}

	protected void verifySaveLoadEquivalence() throws IOException {
		// For tracking - save both the SSE text and the correct EMF XML
		this.resource.save(new HashMap<Object, Object>());
		
		IPath newPath = xmlFile.removeFileExtension().addFileExtension("saved.xml");
		IFile newFile = project.getParent().getFile(newPath);
		IPath rawLocation = newFile.getRawLocation();
		Map<Object, Object> emfSaveDefaults = resource.getDefaultSaveOptions();
		emfSaveDefaults.put(SyncResource.SAVE_OPTION_SUPRESS_TEXT_SAVE, Boolean.TRUE);
		OutputStream ost = new FileOutputStream(new File(rawLocation.toOSString()));
		resource.save(ost, emfSaveDefaults);
		ost.close();
		try {
			newFile.refreshLocal(1, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	
		XMLResource xmlCloneFile = (XMLResource) new XMLResourceFactoryImpl().createResource(URI.createPlatformResourceURI(xmlFile.toPortableString(), true));
		Map<Object, Object> defaults = xmlCloneFile.getDefaultLoadOptions();
		defaults.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
	
		xmlCloneFile.load(defaults);
	
		DocumentRoot cloneRoot = (DocumentRoot)xmlCloneFile.getContents().get(0);
		assertTrue("EMF model doesn't survive save and reload", EcoreUtil.equals(documentRoot.getPark(), cloneRoot.getPark()));
	}

}