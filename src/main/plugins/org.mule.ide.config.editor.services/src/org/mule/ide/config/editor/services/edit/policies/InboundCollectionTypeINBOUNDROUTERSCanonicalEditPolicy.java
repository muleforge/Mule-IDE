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
import org.mule.ide.config.editor.services.edit.parts.ChunkingInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CorrelationResequencerRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomCorrelationAggregatorRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ForwardingRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentReceiverRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentSecureRecieverRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SelectiveConsumerRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.WireTapRouterTypeEditPart;
import org.mule.ide.config.editor.services.part.CoreDiagramUpdater;
import org.mule.ide.config.editor.services.part.CoreNodeDescriptor;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;

/**
 * @generated
 */
public class InboundCollectionTypeINBOUNDROUTERSCanonicalEditPolicy extends
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
				.getInboundCollectionTypeINBOUNDROUTERS_5006SemanticChildren(
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
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
		case ForwardingRouterTypeEditPart.VISUAL_ID:
		case IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID:
		case PassThroughInboundRouterTypeEditPart.VISUAL_ID:
		case IdempotentReceiverRouterTypeEditPart.VISUAL_ID:
		case WireTapRouterTypeEditPart.VISUAL_ID:
		case SelectiveConsumerRouterTypeEditPart.VISUAL_ID:
		case ChunkingInboundRouterTypeEditPart.VISUAL_ID:
		case CorrelationResequencerRouterTypeEditPart.VISUAL_ID:
		case CustomCorrelationAggregatorRouterTypeEditPart.VISUAL_ID:
		case CustomInboundRouterTypeEditPart.VISUAL_ID:
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
					.getInboundCollectionType_AbstractInboundEndpoint());
			myFeaturesToSynchronize.add(CorePackage.eINSTANCE
					.getInboundCollectionType_AbstractInboundEndpointGroup());
			myFeaturesToSynchronize.add(CorePackage.eINSTANCE
					.getInboundCollectionType_AbstractInboundRouter());
			myFeaturesToSynchronize.add(CorePackage.eINSTANCE
					.getInboundCollectionType_AbstractInboundRouterGroup());
		}
		return myFeaturesToSynchronize;
	}

}
