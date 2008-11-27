package org.mule.ide.config.vm.editor.services.providers;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.policies.CoreBaseItemSemanticEditPolicy;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;
import org.mule.ide.config.vm.editor.services.edit.policies.InboundEndpointContainerSemanticEditPolicy;
import org.mule.ide.config.vm.editor.services.edit.policies.OutboundEndpointContainerSemanticEditPolicy;
import org.mule.ide.config.vm.editor.services.part.VMVisualIDRegistry;

public class VMEditPolicyProvider extends AbstractProvider implements
		IEditPolicyProvider {

	/**
	 * Extend the semantic edit policies of core edit parts by
	 * registering policies for this package by type.
	 */
	public void createEditPolicies(EditPart editPart) {
		EditPolicy editPolicy = editPart.getEditPolicy(EditPolicyRoles.SEMANTIC_ROLE);
		if (editPolicy instanceof CoreBaseItemSemanticEditPolicy) {
			CoreBaseItemSemanticEditPolicy coreEditPolicy = 
				(CoreBaseItemSemanticEditPolicy) editPolicy;
			if (coreEditPolicy.canContain(CorePackage.eINSTANCE.getAbstractInboundEndpointType())) {
				coreEditPolicy.
					registerSemanticEditPolicy(CorePackage.eINSTANCE.getAbstractInboundEndpointType(), 
												new InboundEndpointContainerSemanticEditPolicy());
			}
			if (coreEditPolicy.canContain(CorePackage.eINSTANCE.getAbstractOutboundEndpointType())) {
				coreEditPolicy.
					registerSemanticEditPolicy(CorePackage.eINSTANCE.getAbstractOutboundEndpointType(), 
												new OutboundEndpointContainerSemanticEditPolicy());
			}	
		}
	}

	public boolean provides(IOperation operation) {
		if(operation instanceof CreateEditPoliciesOperation){
			EditPart editPart = ((CreateEditPoliciesOperation) operation).getEditPart();
			View view = (View) editPart.getModel();
			String modelID = view.getDiagram().getType();
			// Provider for a diagram with the Core model id.
			return CoreVisualIDRegistry.MODEL_ID.equals(modelID);
		}
		return false;
	}

}
