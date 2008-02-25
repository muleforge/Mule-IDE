package org.mule.ide.config.vm.editor.services.part;

import org.eclipse.core.expressions.PropertyTester;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.mule.ide.config.vm.VMPackage;

/**
 * @generated
 */
public class VMDomainModelElementTester extends PropertyTester {

	/**
	 * @generated
	 */
	public boolean test(Object receiver, String method, Object[] args,
			Object expectedValue) {
		if (false == receiver instanceof EObject) {
			return false;
		}
		EObject eObject = (EObject) receiver;
		EClass eClass = eObject.eClass();
		if (eClass == VMPackage.eINSTANCE.getDocumentRoot()) {
			return true;
		}
		if (eClass == VMPackage.eINSTANCE.getGlobalEndpointType()) {
			return true;
		}
		if (eClass == VMPackage.eINSTANCE.getInboundEndpointType()) {
			return true;
		}
		if (eClass == VMPackage.eINSTANCE.getOutboundEndpointType()) {
			return true;
		}
		if (eClass == VMPackage.eINSTANCE.getVmConnectorType()) {
			return true;
		}
		return false;
	}

}
