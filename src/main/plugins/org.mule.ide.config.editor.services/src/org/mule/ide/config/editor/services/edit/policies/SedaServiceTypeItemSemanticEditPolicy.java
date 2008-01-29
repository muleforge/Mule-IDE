package org.mule.ide.config.editor.services.edit.policies;

import java.util.Iterator;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.BridgeComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultServiceExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.EchoComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.LogComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NoArgsCallComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NullComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeASYNCREPLYEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeCOMPONENTEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEXCEPTIONEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeINBOUNDEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeOUTBOUNDEditPart;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;

/**
 * @generated
 */
public class SedaServiceTypeItemSemanticEditPolicy extends
		CoreBaseItemSemanticEditPolicy {

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
			switch (CoreVisualIDRegistry.getVisualID(node)) {
			case SedaServiceTypeCOMPONENTEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (CoreVisualIDRegistry.getVisualID(cnode)) {
					case PojoComponentTypeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case NoArgsCallComponentTypeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case DefaultComponentTypeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case BridgeComponentTypeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case EchoComponentTypeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case LogComponentTypeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case NullComponentTypeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case PassThroughComponentTypeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			case SedaServiceTypeEXCEPTIONEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (CoreVisualIDRegistry.getVisualID(cnode)) {
					case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case CustomExceptionStrategyTypeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			case SedaServiceTypeINBOUNDEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (CoreVisualIDRegistry.getVisualID(cnode)) {
					case InboundCollectionTypeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			case SedaServiceTypeASYNCREPLYEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (CoreVisualIDRegistry.getVisualID(cnode)) {
					case AsyncReplyCollectionTypeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			case SedaServiceTypeOUTBOUNDEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit
						.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (CoreVisualIDRegistry.getVisualID(cnode)) {
					case OutboundCollectionTypeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			}
		}
	}

}
