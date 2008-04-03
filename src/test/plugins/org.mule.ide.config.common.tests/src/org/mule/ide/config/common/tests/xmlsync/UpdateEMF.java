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
import org.w3c.dom.Text;

public class UpdateEMF extends SyncTestCase {

	public UpdateEMF(String name) {
		super(name);
	}
	
	public void testAddAttribute() throws IOException {
		ParkType p = documentRoot.getPark();

		DecalType blackDecal = p.getAbstractVehicle().get(0).getDecal().get(0);
		assertEquals("black", blackDecal.getColor());
		assertEquals(null, blackDecal.getStyle());
		Element decalE = (Element)xpathNode("//park:Park/park:Vehicle[1]/park:Decal[1]");
		decalE.setAttribute("style", "ripple");
		assertEquals("ripple", blackDecal.getStyle());

		verifySaveLoadEquivalence();
}

	public void testUpdateAttribute() throws IOException {
		ParkType p = documentRoot.getPark();
		DecalType whiteDecal = p.getAbstractVehicle().get(0).getDecal().get(1);
		Element decalE = (Element)xpathNode("//park:Park/park:Vehicle[1]/park:Decal[2]");
		decalE.setAttribute("color", "red");
		assertEquals("red", whiteDecal.getColor());
		
		verifySaveLoadEquivalence();
	}
	
	public void testRemoveAttribute() throws IOException {
		ParkType p = documentRoot.getPark();
		DecalType whiteDecal = p.getAbstractVehicle().get(0).getDecal().get(1);
		Element decalE = (Element)xpathNode("//park:Park/park:Vehicle[1]/park:Decal[2]");
		decalE.removeAttribute("color");
		assertEquals(null, whiteDecal.getColor());

		verifySaveLoadEquivalence();
	}

	public void testChangeSimple() throws IOException {

		assertEquals("32", xpath("//park:Park/park:Vehicle[1]/park:Decal[4]/text()"));

		// Change 32 to something else (2145)
		Text numberText = (Text)xpathNode("//park:Park/park:Vehicle[1]/park:Decal[4]/text()");
		numberText.setData("2145");
	
		ParkType p = documentRoot.getPark();
		assertEquals(new BigInteger("2145"), p.getAbstractVehicle().get(0).getDecal().get(3).getValue());

		verifySaveLoadEquivalence();
	}
	
	public void testAddSingleElement() throws IOException {
		verifySaveLoadEquivalence();

		Element original = (Element)xpathNode("//park:Park/park:Vehicle[1]/park:Decal[4]");
		ParkType p = documentRoot.getPark();
		assertEquals(4, p.getAbstractVehicle().get(0).getDecal().size());

		Element clone = (Element)original.cloneNode(true);
		original.getParentNode().insertBefore(clone, original.getNextSibling());
				
		verifySaveLoadEquivalence();
		assertEquals(5, p.getAbstractVehicle().get(0).getDecal().size());
	}

	public void testChangeAddedElement() throws IOException {
		verifySaveLoadEquivalence();
	}

	public void testExistingElementUpdate() throws IOException {
		verifySaveLoadEquivalence();
	}

	public void testRemoveSingleElement() throws IOException {
		verifySaveLoadEquivalence();
	}

	public void testAddContainedElements() throws IOException {
		verifySaveLoadEquivalence();
	}

	public void testRemoveContainedElements() throws IOException {
		verifySaveLoadEquivalence();
	}
	
	public void testAddToFeatureMap() throws IOException {
		verifySaveLoadEquivalence();
	}
	
	public void testSimpleFeatureMapUpdate() throws IOException {
		verifySaveLoadEquivalence();		
	}

	public void testNSPrefixMap() throws IOException {
		EMap<String, String> nsMap = documentRoot.getXMLNSPrefixMap();
		
		Element documentElement = resource.getDocument().getDocumentElement();
		assertEquals("expect vp prefix through DOM", "urn:vehiclePark", documentElement.getAttribute("xmlns:vp"));
		
		assertEquals("expect prefix known to EMF", "urn:vehiclePark", nsMap.get("vp"));

		documentElement.setAttribute("xmlns:vip", "urn:klip");
		assertEquals("expect vip prefix through EMF model", "urn:klip", nsMap.get("vip"));

		documentElement.removeAttribute("xmlns:vip");
		nsMap.remove("xmlns:vip");
		assertEquals("expect vip gone (through DOM)", false, nsMap.contains("vip"));

		verifySaveLoadEquivalence();		
	}
}