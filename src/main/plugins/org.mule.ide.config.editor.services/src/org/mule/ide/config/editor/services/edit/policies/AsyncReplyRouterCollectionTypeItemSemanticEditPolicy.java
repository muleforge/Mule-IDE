package org.mule.ide.config.editor.services.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyInboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyRouterCollectionTypeASYNCREPLYROUTERSEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyRouterCollectionTypeINBOUNDENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomAsyncReplyRouterTypeEditPart;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;

/**
 * @generated
 */
public class AsyncReplyRouterCollectionTypeItemSemanticEditPolicy extends
		CoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyChildNodesCommand(cc);
		addDestroyShortcutsCommand(cc);
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
			switch (CoreVisualIDRegistry.getVisualID(node)) {
			case AsyncReplyRouterCollectionTypeINBOUNDENDPOINTSEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (CoreVisualIDRegistry.getVisualID(cnode)) {
					case AsyncReplyInboundEndpointServiceItemTypeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			case AsyncReplyRouterCollectionTypeASYNCREPLYROUTERSEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (CoreVisualIDRegistry.getVisualID(cnode)) {
					case AsyncReplyRouterTypeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case CustomAsyncReplyRouterTypeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			}
		}
	}

}