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
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterOutboundEndpointTypeEditPart;
import org.mule.ide.config.editor.services.part.CoreDiagramUpdater;
import org.mule.ide.config.editor.services.part.CoreNodeDescriptor;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;

/**
 * @generated
 */
public class ChunkingRouterTypeENDPOINTSCanonicalEditPolicy extends
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
				.getChunkingRouterTypeENDPOINTS_5022SemanticChildren(viewObject)
				.iterator(); it.hasNext();) {
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
		case OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID:
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
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(CorePackage.eINSTANCE
					.getOutboundRouterType_AbstractOutboundEndpoint());
		}
		return myFeaturesToSynchronize;
	}

}
