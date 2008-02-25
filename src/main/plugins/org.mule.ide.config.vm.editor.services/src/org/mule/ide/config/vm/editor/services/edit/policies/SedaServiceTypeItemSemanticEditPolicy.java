package org.mule.ide.config.vm.editor.services.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.vm.editor.services.edit.commands.InboundCollectionTypeCreateCommand;
import org.mule.ide.config.vm.editor.services.edit.commands.OutboundCollectionTypeCreateCommand;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundCollectionTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.OutboundCollectionTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.SedaServiceTypeCOMPONENTEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.SedaServiceTypeEXCEPTIONEditPart;
import org.mule.ide.config.vm.editor.services.part.VMVisualIDRegistry;
import org.mule.ide.config.vm.editor.services.providers.VMElementTypes;

/**
 * @generated
 */
public class SedaServiceTypeItemSemanticEditPolicy extends
		VMBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (VMElementTypes.InboundCollectionType_2001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_Inbound());
			}
			return getGEFWrapper(new InboundCollectionTypeCreateCommand(req));
		}
		if (VMElementTypes.OutboundCollectionType_2003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_Outbound());
			}
			return getGEFWrapper(new OutboundCollectionTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyChildNodesCommand(cc);
		addDestroyShortcutsCommand(cc);
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			req.setElementToDestroy(view);
		}
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected void addDestroyChildNodesCommand(CompoundCommand cmd) {
		View view = (View) getHost().getModel();
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation != null) {
			return;
		}
		for (Iterator it = view.getChildren().iterator(); it.hasNext();) {
			Node node = (Node) it.next();
			switch (VMVisualIDRegistry.getVisualID(node)) {
			case InboundCollectionTypeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case OutboundCollectionTypeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case SedaServiceTypeCOMPONENTEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (VMVisualIDRegistry.getVisualID(cnode)) {
					}
				}
				break;
			case SedaServiceTypeEXCEPTIONEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (VMVisualIDRegistry.getVisualID(cnode)) {
					}
				}
				break;
			}
		}
	}

}
