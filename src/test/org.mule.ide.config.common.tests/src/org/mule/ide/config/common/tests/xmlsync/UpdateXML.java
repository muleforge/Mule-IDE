package org.mule.ide.config.common.tests.xmlsync;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import javax.xml.namespace.NamespaceContext;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import junit.framework.TestCase;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.mule.ide.config.common.SyncResource;
import org.mule.ide.config.common.tests.util.WorkspaceHelper;
import org.mule.ide.config.tests.cars.CarsPackage;
import org.mule.ide.config.tests.park.DecalType;
import org.mule.ide.config.tests.park.DocumentRoot;
import org.mule.ide.config.tests.park.ParkFactory;
import org.mule.ide.config.tests.park.ParkPackage;
import org.mule.ide.config.tests.park.ParkType;
import org.mule.ide.config.tests.park.VehicleType;
import org.mule.ide.config.tests.park.util.ParkResourceFactoryImpl;

import sun.swing.plaf.synth.Paint9Painter.PaintType;

public class UpdateXML extends TestCase {

	private static final class ECoreNamespaceContext implements NamespaceContext {
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
	
	private DocumentRoot documentRoot;
	private SyncResource resource;

	public UpdateXML(String name) {
		super(name);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		helper = new WorkspaceHelper();
		project = helper.createProject("XMLSync");
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
	
	@Override
	protected void tearDown() throws Exception {
		helper.dispose();
		super.tearDown();
	}

	public void testAddAttribute() throws IOException {
		ParkType p = documentRoot.getPark();

		DecalType blackDecal = p.getAbstractVehicle().get(0).getDecal().get(0);
		assertEquals("black", blackDecal.getColor());
		assertEquals("0", xpath("count(//park:Park/park:Vehicle[1]/park:Decal[1]/@style)"));
		blackDecal.setStyle("ripple");
		assertEquals("1", xpath("count(//park:Park/park:Vehicle[1]/park:Decal[1]/@style)"));
	}

	public void testUpdateAttribute() throws IOException {
		ParkType p = documentRoot.getPark();
		assertEquals("white", xpath("//park:Park/park:Vehicle[1]/park:Decal[2]/@color"));
		DecalType whiteDecal = p.getAbstractVehicle().get(0).getDecal().get(1);
		whiteDecal.setColor("red");
		assertEquals("red", xpath("//park:Park/park:Vehicle[1]/park:Decal[2]/@color"));
	}
	
	public void testRemoveAttribute() throws IOException {
		ParkType p = documentRoot.getPark();
		assertEquals("1", xpath("count(//park:Park/park:Vehicle[1]/park:Decal[2]/@color)"));
		DecalType whiteDecal = p.getAbstractVehicle().get(0).getDecal().get(1);
		whiteDecal.setColor(null);
		assertEquals("0", xpath("count(//park:Park/park:Vehicle[1]/park:Decal[2]/@color)"));
	}

	public void testChangeSimple() throws IOException {
		ParkType p = documentRoot.getPark();
		assertEquals("32", xpath("//park:Park/park:Vehicle[1]/park:Decal[4]/text()"));
		p.getAbstractVehicle().get(0).getDecal().get(3).setValue(BigInteger.valueOf(2145));
		assertEquals("2145", xpath("//park:Park/park:Vehicle[1]/park:Decal[4]/text()"));
	}

	
	public void testAddElement() throws IOException {
		ParkType p = documentRoot.getPark();
		assertEquals("expect two vehicles", 2, p.getAbstractVehicle().size());
		
		VehicleType vehicle = ParkFactory.eINSTANCE.createVehicleType();
		p.getAbstractVehicleGroup().add(ParkPackage.eINSTANCE.getDocumentRoot_Vehicle(), vehicle);
		assertEquals("1", xpath("count(//park:Park/park:Vehicle[2])"));
		vehicle.setMake("Toyota");
		assertEquals("Toyota", xpath("count(//park:Park/park:Vehicle[2]/park:Make)"));

		vehicle.setModel("Verso");
		assertEquals("Verso", xpath("count(//park:Park/park:Vehicle[2]/park:Model" +
				")"));
		vehicle.getPaint().add("Red");
	}
	
	public void testSimpleUpdate() throws IOException {
		ParkType p = documentRoot.getPark();
		assertEquals("expect two vehicles", 2, p.getAbstractVehicle().size());
		
		VehicleType vehicle = ParkFactory.eINSTANCE.createVehicleType();
		p.getAbstractVehicleGroup().add(ParkPackage.eINSTANCE.getDocumentRoot_Vehicle(), vehicle);
		assertEquals("1", xpath("count(//park:Park/park:Vehicle[2])"));
		vehicle.setMake("Toyota");
		assertEquals("Toyota", xpath("count(//park:Park/park:Vehicle[2]/park:Make)"));

		vehicle.setModel("Verso");
		assertEquals("Verso", xpath("count(//park:Park/park:Vehicle[2]/park:Model" +
				")"));
		vehicle.getPaint().add("Red");
		
		
	}
	
}
