package org.mule.ide.config.vm.editor.services.providers;

import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.CreateEditPoliciesOperation;
import org.eclipse.gmf.runtime.diagram.ui.services.editpolicy.IEditPolicyProvider;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.editor.services.edit.parts.DefaultModelTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.policies.InboundCollectionTypeINBOUNDROUTERSCanonicalEditPolicy;
import org.mule.ide.config.vm.editor.services.edit.policies.InboundCollectionTypeINBOUNDROUTERSItemSemanticEditPolicy;

public class VMEditPolicyProvider extends AbstractProvider implements
		IEditPolicyProvider {

	public void createEditPolicies(EditPart editPart) {
		if(editPart.getClass().getName().endsWith("InboundCollectionTypeINBOUNDROUTERSEditPart")) {
			org.mule.ide.config.editor.services.edit.policies.InboundCollectionTypeINBOUNDROUTERSItemSemanticEditPolicy policy = 
				(org.mule.ide.config.editor.services.edit.policies.InboundCollectionTypeINBOUNDROUTERSItemSemanticEditPolicy) editPart.getEditPolicy(EditPolicyRoles.SEMANTIC_ROLE);
			policy.addExtension(new InboundCollectionTypeINBOUNDROUTERSItemSemanticEditPolicy());

			//editPart.installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
			//			new InboundCollectionTypeINBOUNDROUTERSCanonicalEditPolicy());
		}
	}

	public boolean provides(IOperation operation) {
		if(operation instanceof CreateEditPoliciesOperation){
			EditPart editPart = ((CreateEditPoliciesOperation) operation).getEditPart();
			View view = (View) editPart.getModel();
			String modelID = view.getDiagram().getType();
			return DefaultModelTypeEditPart.MODEL_ID.equals(modelID);
		}
		return false;
	}

}
