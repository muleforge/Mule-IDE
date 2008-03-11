package org.mule.ide.config.vm.editor.services.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.vm.editor.services.edit.parts.OutboundEndpointTypeEditPart;
import org.mule.ide.config.vm.editor.services.part.VMDiagramUpdater;
import org.mule.ide.config.vm.editor.services.part.VMNodeDescriptor;
import org.mule.ide.config.vm.editor.services.part.VMVisualIDRegistry;

/**
 * @generated
 */
public class ExceptionStrategyTypeENDPOINTSCanonicalEditPolicy extends
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
		for (Iterator it = VMDiagramUpdater
				.getExceptionStrategyTypeENDPOINTS_5004SemanticChildren(
						viewObject).iterator(); it.hasNext();) {
			result.add(((VMNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = VMVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case OutboundEndpointTypeEditPart.VISUAL_ID:
			return !semanticChildren.contains(view.getElement())
					|| visualID != VMVisualIDRegistry.getNodeVisualID(
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
					.getExceptionStrategyType_AbstractOutboundEndpoint());
		}
		return myFeaturesToSynchronize;
	}

}
