package org.mule.ide.config.editor.services.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.parts.ChainingOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.EndpointSelectorRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ExceptionOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.FilteringOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.MessageSplitterOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.MulticastingOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.StaticRecipientListRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.TemplateEndpointOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.part.CoreDiagramUpdater;
import org.mule.ide.config.editor.services.part.CoreNodeDescriptor;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;

/**
 * @generated
 */
public class OutboundCollectionTypeOUTBOUNDROUTERSCanonicalEditPolicy extends
		CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = CoreDiagramUpdater
				.getOutboundCollectionTypeOUTBOUNDROUTERS_5008SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
			result.add(((CoreNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = CoreVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case PassThroughOutboundRouterTypeEditPart.VISUAL_ID:
		case FilteringOutboundRouterTypeEditPart.VISUAL_ID:
		case ChainingOutboundRouterTypeEditPart.VISUAL_ID:
		case ExceptionOutboundRouterTypeEditPart.VISUAL_ID:
		case MulticastingOutboundRouterTypeEditPart.VISUAL_ID:
		case TemplateEndpointOutboundRouterTypeEditPart.VISUAL_ID:
		case EndpointSelectorRouterTypeEditPart.VISUAL_ID:
		case MessageSplitterOutboundRouterTypeEditPart.VISUAL_ID:
		case ChunkingRouterTypeEditPart.VISUAL_ID:
		case StaticRecipientListRouterTypeEditPart.VISUAL_ID:
		case CustomOutboundRouterTypeEditPart.VISUAL_ID:
			return !semanticChildren.contains(view.getElement())
					|| visualID != CoreVisualIDRegistry.getNodeVisualID(
							(View) getHost().getModel(), view.getElement());
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * customization
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(CorePackage.eINSTANCE
					.getOutboundCollectionType_AbstractOutboundRouter());
			myFeaturesToSynchronize.add(CorePackage.eINSTANCE
					.getOutboundCollectionType_AbstractOutboundRouterGroup());
		}
		return myFeaturesToSynchronize;
	}

}
