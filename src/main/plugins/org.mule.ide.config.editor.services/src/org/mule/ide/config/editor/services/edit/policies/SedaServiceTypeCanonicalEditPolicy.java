package org.mule.ide.config.editor.services.edit.policies;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.AsyncReplyCollectionType;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.InboundCollectionType;
import org.mule.ide.config.core.OutboundCollectionType;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundCollectionTypeEditPart;
import org.mule.ide.config.editor.services.part.CoreDiagramUpdater;
import org.mule.ide.config.editor.services.part.CoreNodeDescriptor;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;

/**
 * @generated
 */
public class SedaServiceTypeCanonicalEditPolicy extends CanonicalEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/*
	@Override
	public void activate() {
		super.activate();
		refresh();
	}
	*/
	
	/*
	protected boolean shouldHandleNotificationEvent(Notification event) {

		if(super.shouldHandleNotificationEvent(event))
			return true;

		Object element = event.getNotifier();
		return (element instanceof EObject
				&& !(element instanceof View)
				&& (NotificationUtil.isElementAddedToSlot(event)
						|| NotificationUtil.isElementRemovedFromSlot(event))
						|| NotificationUtil.isSlotModified(event));

	}
	*/

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = CoreDiagramUpdater
				.getSedaServiceType_1001SemanticChildren(viewObject).iterator(); it
				.hasNext();) {
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
		case InboundCollectionTypeEditPart.VISUAL_ID:
		case AsyncReplyCollectionTypeEditPart.VISUAL_ID:
		case OutboundCollectionTypeEditPart.VISUAL_ID:
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
					.getBaseServiceType_Inbound());
			myFeaturesToSynchronize.add(CorePackage.eINSTANCE
					.getBaseServiceType_AsyncReply());
			myFeaturesToSynchronize.add(CorePackage.eINSTANCE
					.getBaseServiceType_Outbound());
		}
		return myFeaturesToSynchronize;
	}

	/**
	 * Needed to override getViewDescriptor and getViewIndexFor in order
	 * to fix the position of the collection edit parts within a service node
	 * Otherwise when one is deleted and recreated as a result of
	 * source edits, it will be appear at the bottom of the service node
	 * due to the default append behavior.
	 */
	@Override
	protected CreateViewRequest.ViewDescriptor getViewDescriptor(
			IAdaptable elementAdapter,
			Class viewKind,
			String hint,
			int index) {

		return new CreateViewRequest.ViewDescriptor(
				elementAdapter,
				viewKind,
				hint,
				index, 
				index >= 0, 
				host().getDiagramPreferencesHint());
	}
	
	/**
	 * Note that I still haven't figured out how to position the
	 * Inbound as the first section in the service node.  
	 * There's some GMF bug such that the proper refresh is not
	 * taking place after inserting ahead of the Component and Exception
	 * sections.
	 */
	@Override
	protected int getViewIndexFor(EObject semanticChild) {
		if (semanticChild instanceof InboundCollectionType) {
			return 3;
		} else if (semanticChild instanceof AsyncReplyCollectionType) {
			return 4;
		} else if (semanticChild instanceof OutboundCollectionType) {
			return 5;
		}
		return super.getViewIndexFor(semanticChild);
	}

}
