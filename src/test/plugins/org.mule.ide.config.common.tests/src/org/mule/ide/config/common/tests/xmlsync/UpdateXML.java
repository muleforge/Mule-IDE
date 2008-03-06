package org.mule.ide.config.common.tests.xmlsync;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

import javax.xml.namespace.NamespaceContext;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import junit.framework.TestCase;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.mule.ide.config.common.SyncResource;
import org.mule.ide.config.common.tests.util.WorkspaceHelper;
import org.mule.ide.config.tests.cars.CarsPackage;
import org.mule.ide.config.tests.park.DecalType;
import org.mule.ide.config.tests.park.DocumentRoot;
import org.mule.ide.config.tests.park.InsuranceType;
import org.mule.ide.config.tests.park.ParkFactory;
import org.mule.ide.config.tests.park.ParkPackage;
import org.mule.ide.config.tests.park.ParkType;
import org.mule.ide.config.tests.park.VehicleType;
import org.mule.ide.config.tests.park.util.ParkResourceFactoryImpl;
import org.w3c.dom.Element;

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
		
		verifySaveLoadEquivalence();
	}
	
	public void testRemoveAttribute() throws IOException {
		ParkType p = documentRoot.getPark();
		assertEquals("1", xpath("count(//park:Park/park:Vehicle[1]/park:Decal[2]/@color)"));
		DecalType whiteDecal = p.getAbstractVehicle().get(0).getDecal().get(1);
		whiteDecal.setColor(null);
		assertEquals("0", xpath("count(//park:Park/park:Vehicle[1]/park:Decal[2]/@color)"));

		verifySaveLoadEquivalence();
	}

	public void testChangeSimple() throws IOException {
		ParkType p = documentRoot.getPark();
		assertEquals("32", xpath("//park:Park/park:Vehicle[1]/park:Decal[4]/text()"));
		p.getAbstractVehicle().get(0).getDecal().get(3).setValue(BigInteger.valueOf(2145));
		assertEquals("2145", xpath("//park:Park/park:Vehicle[1]/park:Decal[4]/text()"));
		p.getAbstractVehicle().get(0).getDecal().get(3).eUnset(ParkPackage.eINSTANCE.getDecalType_Value());
		assertEquals("0", xpath("count(//park:Park/park:Vehicle[1]/park:Decal[4]/text())"));
		p.getAbstractVehicle().get(0).getDecal().get(3).setValue(BigInteger.valueOf(2145));
		assertEquals("2145", xpath("//park:Park/park:Vehicle[1]/park:Decal[4]/text()"));
		
		verifySaveLoadEquivalence();
	}
	
	public void testAddSingleElement() throws IOException {
		ParkType p = documentRoot.getPark();
		assertEquals("expect two vehicles", 2, p.getAbstractVehicle().size());

		VehicleType vehicle = p.getAbstractVehicle().get(1);
		assertEquals("1", xpath("count(//park:Park/cars:Car[1])"));
		assertEquals("0", xpath("count(//park:Park/cars:Car[1]/park:LicensePlate)"));

		vehicle.setLicensePlate("12345");
		assertEquals("1", xpath("count(//park:Park/cars:Car[1]/park:LicensePlate)"));
		assertEquals("12345", xpath("//park:Park/cars:Car[1]/park:LicensePlate"));

		verifySaveLoadEquivalence();
	}

	public void testChangeAddedElement() throws IOException {
		ParkType p = documentRoot.getPark();
		assertEquals("expect two vehicles", 2, p.getAbstractVehicle().size());

		VehicleType vehicle = p.getAbstractVehicle().get(1);
		vehicle.setLicensePlate("12345");
		assertEquals("1", xpath("count(//park:Park/cars:Car[1]/park:LicensePlate)"));
		assertEquals("12345", xpath("//park:Park/cars:Car[1]/park:LicensePlate"));
		vehicle.setLicensePlate("");
		assertEquals("1", xpath("count(//park:Park/cars:Car[1]/park:LicensePlate)"));
		assertEquals("", xpath("//park:Park/cars:Car[1]/park:LicensePlate"));
		
		verifySaveLoadEquivalence();
	}

	public void testExistingElementUpdate() throws IOException {
		ParkType p = documentRoot.getPark();

		VehicleType vehicle = p.getAbstractVehicle().get(0);

		assertEquals("1", xpath("count(//park:Park/park:Vehicle[1]/park:LicensePlate)"));
		assertEquals("abc", xpath("//park:Park/park:Vehicle[1]/park:LicensePlate"));
		vehicle.setLicensePlate("7654321-ok");
		assertEquals("7654321-ok", xpath("//park:Park/park:Vehicle[1]/park:LicensePlate"));
		
		verifySaveLoadEquivalence();

	}

	public void testRemoveSingleElement() throws IOException {
		ParkType p = documentRoot.getPark();
		VehicleType vehicle = p.getAbstractVehicle().get(1);
		assertEquals("0", xpath("count(//park:Park/cars:Car[1]/park:LicensePlate)"));

		vehicle.setLicensePlate("12345");
		assertEquals("1", xpath("count(//park:Park/cars:Car[1]/park:LicensePlate)"));

		vehicle.setLicensePlate(null);
		assertEquals("0", xpath("count(//park:Park/cars:Car[1]/park:LicensePlate)"));

		verifySaveLoadEquivalence();
	}

	public void testAddContainedElements() throws IOException {
		ParkType p = documentRoot.getPark();
		assertEquals("expect two vehicles", 2, p.getAbstractVehicle().size());

		VehicleType vehicle = p.getAbstractVehicle().get(1);
		assertEquals("1", xpath("count(//park:Park/cars:Car[1])"));
		assertEquals("0", xpath("count(//park:Park/cars:Car[1]/park:InsurancePolicy)"));

		InsuranceType policy = ParkFactory.eINSTANCE.createInsuranceType();
		policy.setId("i" + (int)(Math.random()*20000));
//		policy.setName("The text");
		vehicle.setCurrentInsurance(policy);

		assertEquals("1", xpath("count(//park:Park/cars:Car[1]/park:InsurancePolicy)"));
//		assertEquals("The text", xpath("//park:Park/cars:Car[1]/park:InsurancePolicy/Name"));
		
		verifySaveLoadEquivalence();
		policy.setName("My new car insurance");
		verifySaveLoadEquivalence();
		
		assertEquals("My new car insurance", xpath("//park:Park/cars:Car[1]/park:InsurancePolicy/Name"));

		verifySaveLoadEquivalence();
	}

	public void testRemoveContainedElements() throws IOException {
		ParkType p = documentRoot.getPark();

		VehicleType vehicle = p.getAbstractVehicle().get(0);
		assertEquals("1", xpath("count(//park:Park/park:Vehicle[1]/park:InsurancePolicy)"));

		InsuranceType policy = vehicle.getCurrentInsurance();
		assertEquals("fisk", policy.getId());
		
		assertEquals("fisk", xpath("//park:Park/park:Vehicle[1]/park:InsurancePolicy/@id"));
		vehicle.setCurrentInsurance(null);
		assertEquals("0", xpath("count(//park:Park/park:Vehicle[1]/park:InsurancePolicy)"));
		
		verifySaveLoadEquivalence();
	}
	
	public void testAddToFeatureMap() throws IOException {
		ParkType p = documentRoot.getPark();
		assertEquals("expect two vehicles", 2, p.getAbstractVehicle().size());
		
		VehicleType vehicle = ParkFactory.eINSTANCE.createVehicleType();
		assertEquals("0", xpath("count(//park:Park/park:Vehicle[2])"));
		p.getAbstractVehicleGroup().add(ParkPackage.eINSTANCE.getDocumentRoot_Vehicle(), vehicle);
		assertEquals("1", xpath("count(//park:Park/park:Vehicle[2])"));
		vehicle.setMake("Toyota");
		assertEquals("Toyota", xpath("//park:Park/park:Vehicle[2]/park:Make"));

		vehicle.setModel("Verso");
		assertEquals("Verso", xpath("//park:Park/park:Vehicle[2]/park:Model"));
		vehicle.getPaint().add("Red");
		assertEquals("Red", xpath("//park:Park/park:Vehicle[2]/park:Paint"));
		
		verifySaveLoadEquivalence();
	}
	
	public void testSimpleFeatureMapUpdate() throws IOException {
		ParkType p = documentRoot.getPark();
		assertEquals("expect two vehicles", 2, p.getAbstractVehicle().size());
		
		VehicleType vehicle = ParkFactory.eINSTANCE.createVehicleType();
		FeatureMap abstractVehicleGroup = p.getAbstractVehicleGroup();
		abstractVehicleGroup.add(ParkPackage.eINSTANCE.getDocumentRoot_Vehicle(), vehicle);
		assertEquals("1", xpath("count(//park:Park/park:Vehicle[2])"));
		vehicle.setMake("Toyota");
		assertEquals("Toyota", xpath("//park:Park/park:Vehicle[2]/park:Make"));
	
		vehicle.setModel("Verso");
		assertEquals("Verso", xpath("//park:Park/park:Vehicle[2]/park:Model"));
		vehicle.getPaint().add("Red");
		
		verifySaveLoadEquivalence();		
	}

	public void testNSPrefixMap() throws IOException {
		EMap<String, String> nsMap = documentRoot.getXMLNSPrefixMap();
	
		
		Element documentElement = resource.getDocument().getDocumentElement();
		assertEquals("expect vp prefix through DOM", "urn:vehiclePark", documentElement.getAttribute("xmlns:vp"));
		
		assertEquals("expect prefix known to EMF", "urn:vehiclePark", nsMap.get("vp"));

		nsMap.put("vip", "urn:klip");
		assertEquals("expect vip prefix through DOM", "urn:klip", documentElement.getAttribute("xmlns:vip"));

		nsMap.remove("vip");
		assertEquals("expect vip gone (through DOM)", null, documentElement.getAttribute("xmlns:vip"));

		verifySaveLoadEquivalence();		
	}

	void verifySaveLoadEquivalence() throws IOException {
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