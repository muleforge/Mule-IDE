package org.mule.ide.config.common.tests.xmlsync;

import java.io.IOException;
import java.math.BigInteger;



import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.mule.ide.config.tests.park.DecalType;
import org.mule.ide.config.tests.park.InsuranceType;
import org.mule.ide.config.tests.park.ParkFactory;
import org.mule.ide.config.tests.park.ParkPackage;
import org.mule.ide.config.tests.park.ParkType;
import org.mule.ide.config.tests.park.VehicleType;
import org.w3c.dom.Element;

public class UpdateXML extends SyncTestCase {

	public UpdateXML(String name) {
		super(name);
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
}