package org.mule.ide.config.editor.services.edit.policies;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalConnectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyInboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.BridgeComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChainingOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ConnectionEditPart;
import org.mule.ide.config.editor.services.edit.parts.CorrelationResequencerRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomAsyncReplyRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomCorrelationAggregatorRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultModelTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultServiceExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.EchoComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.EndpointSelectorRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ExceptionOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.FilteringOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ForwardingRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentReceiverRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentSecureRecieverRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.JavaComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.LogComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.MessageSplitterOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.MulticastingOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NullComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundEndpointTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterOutboundEndpointTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PooledJavaComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SelectiveConsumerRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.StaticRecipientListRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.TemplateEndpointOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.WireTapRouterTypeEditPart;
import org.mule.ide.config.editor.services.part.CoreDiagramUpdater;
import org.mule.ide.config.editor.services.part.CoreLinkDescriptor;
import org.mule.ide.config.editor.services.part.CoreNodeDescriptor;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;

/**
 * @generated
 */
public class DefaultModelTypeCanonicalEditPolicy extends
		CanonicalConnectionEditPolicy {

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
				.getDefaultModelType_79SemanticChildren(viewObject).iterator(); it
				.hasNext();) {
			result.add(((CoreNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean shouldDeleteView(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = CoreVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case SedaServiceTypeEditPart.VISUAL_ID:
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
	 *   - watch for model change notifications for connections
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(CorePackage.eINSTANCE
					.getAbstractModelType_AbstractService());
			myFeaturesToSynchronize.add(CorePackage.eINSTANCE
					.getAbstractModelType_AbstractServiceGroup());
			myFeaturesToSynchronize.add(CorePackage.eINSTANCE
					.getSedaModelType_Connections());
		}
		return myFeaturesToSynchronize;
	}

	/**
	 * @generated
	 */
	protected List getSemanticConnectionsList() {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	protected EObject getSourceElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	protected EObject getTargetElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	protected boolean shouldIncludeConnection(Edge connector,
			Collection children) {
		return false;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		List createdViews = new LinkedList();
		createdViews.addAll(refreshSemanticChildren());
		List createdConnectionViews = new LinkedList();
		createdConnectionViews.addAll(refreshSemanticConnections());
		createdConnectionViews.addAll(refreshConnections());

		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host()
					.getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		createdViews.addAll(createdConnectionViews);
		makeViewsImmutable(createdViews);
	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}

	/**
	 * @generated
	 */
	private Collection refreshConnections() {
		Map domain2NotationMap = new HashMap();
		Collection linkDescriptors = collectAllLinks(getDiagram(),
				domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for (Iterator linksIterator = existingLinks.iterator(); linksIterator
				.hasNext();) {
			Edge nextDiagramLink = (Edge) linksIterator.next();
			EObject diagramLinkObject = nextDiagramLink.getElement();
			EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
			EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
			int diagramLinkVisualID = CoreVisualIDRegistry
					.getVisualID(nextDiagramLink);
			for (Iterator LinkDescriptorsIterator = linkDescriptors.iterator(); LinkDescriptorsIterator
					.hasNext();) {
				CoreLinkDescriptor nextLinkDescriptor = (CoreLinkDescriptor) LinkDescriptorsIterator
						.next();
				if (diagramLinkObject == nextLinkDescriptor.getModelElement()
						&& diagramLinkSrc == nextLinkDescriptor.getSource()
						&& diagramLinkDst == nextLinkDescriptor
								.getDestination()
						&& diagramLinkVisualID == nextLinkDescriptor
								.getVisualID()) {
					linksIterator.remove();
					LinkDescriptorsIterator.remove();
				}
			}
		}
		deleteViews(existingLinks.iterator());
		return createConnections(linkDescriptors, domain2NotationMap);
	}

	/**
	 * @generated
	 */
	private Collection collectAllLinks(View view, Map domain2NotationMap) {
		if (!DefaultModelTypeEditPart.MODEL_ID.equals(CoreVisualIDRegistry
				.getModelID(view))) {
			return Collections.EMPTY_LIST;
		}
		Collection result = new LinkedList();
		switch (CoreVisualIDRegistry.getVisualID(view)) {
		case DefaultModelTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getDefaultModelType_79ContainedLinks(view));
			break;
		}
		case SedaServiceTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getSedaServiceType_1001ContainedLinks(view));
			break;
		}
		case JavaComponentTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getDefaultJavaComponentType_2001ContainedLinks(view));
			break;
		}
		case DefaultComponentTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getDefaultComponentType_2002ContainedLinks(view));
			break;
		}
		case BridgeComponentTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getDefaultComponentType_2003ContainedLinks(view));
			break;
		}
		case EchoComponentTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getDefaultComponentType_2004ContainedLinks(view));
			break;
		}
		case LogComponentTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getDefaultComponentType_2005ContainedLinks(view));
			break;
		}
		case NullComponentTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getDefaultComponentType_2006ContainedLinks(view));
			break;
		}
		case PooledJavaComponentTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getPooledJavaComponentType_2007ContainedLinks(view));
			break;
		}
		case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getEndpointExceptionStrategyType_2008ContainedLinks(view));
			break;
		}
		case OutboundEndpointTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getOutboundEndpointType_2009ContainedLinks(view));
			break;
		}
		case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getEndpointExceptionStrategyType_2010ContainedLinks(view));
			break;
		}
		case CustomExceptionStrategyTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getCustomExceptionStrategyType_2011ContainedLinks(view));
			break;
		}
		case InboundCollectionTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getInboundCollectionType_2012ContainedLinks(view));
			break;
		}
		case InboundEndpointServiceItemTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getInboundEndpointType_2013ContainedLinks(view));
			break;
		}
		case ForwardingRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getSelectiveConsumerRouterType_2014ContainedLinks(view));
			break;
		}
		case IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getFilteredInboundRouterType_2015ContainedLinks(view));
			break;
		}
		case PassThroughInboundRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getFilteredInboundRouterType_2016ContainedLinks(view));
			break;
		}
		case IdempotentReceiverRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getFilteredInboundRouterType_2017ContainedLinks(view));
			break;
		}
		case WireTapRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getWireTapRouterType_2018ContainedLinks(view));
			break;
		}
		case SelectiveConsumerRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getSelectiveConsumerRouterType_2019ContainedLinks(view));
			break;
		}
		case ChunkingInboundRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(CoreDiagramUpdater
							.getMessageChunkingAggregatorRouterType_2020ContainedLinks(view));
			break;
		}
		case CorrelationResequencerRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getSelectiveConsumerRouterType_2021ContainedLinks(view));
			break;
		}
		case CustomCorrelationAggregatorRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(CoreDiagramUpdater
							.getCustomCorrelationAggregatorRouterType_2022ContainedLinks(view));
			break;
		}
		case CustomInboundRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getCustomInboundRouterType_2023ContainedLinks(view));
			break;
		}
		case AsyncReplyCollectionTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getAsyncReplyCollectionType_2024ContainedLinks(view));
			break;
		}
		case AsyncReplyInboundEndpointServiceItemTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getInboundEndpointType_2025ContainedLinks(view));
			break;
		}
		case AsyncReplyRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getAsyncReplyRouterType_2026ContainedLinks(view));
			break;
		}
		case CustomAsyncReplyRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getCustomAsyncReplyRouterType_2027ContainedLinks(view));
			break;
		}
		case OutboundCollectionTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getOutboundCollectionType_2028ContainedLinks(view));
			break;
		}
		case PassThroughOutboundRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getOutboundRouterType_2029ContainedLinks(view));
			break;
		}
		case OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getOutboundEndpointType_2030ContainedLinks(view));
			break;
		}
		case FilteringOutboundRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getFilteringOutboundRouterType_2031ContainedLinks(view));
			break;
		}
		case ChainingOutboundRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getFilteringOutboundRouterType_2032ContainedLinks(view));
			break;
		}
		case ExceptionOutboundRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getFilteringOutboundRouterType_2033ContainedLinks(view));
			break;
		}
		case MulticastingOutboundRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getFilteringOutboundRouterType_2034ContainedLinks(view));
			break;
		}
		case TemplateEndpointOutboundRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getFilteringOutboundRouterType_2035ContainedLinks(view));
			break;
		}
		case EndpointSelectorRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getEndpointSelectorRouterType_2036ContainedLinks(view));
			break;
		}
		case MessageSplitterOutboundRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result
					.addAll(CoreDiagramUpdater
							.getMessageSplitterOutboundRouterType_2037ContainedLinks(view));
			break;
		}
		case ChunkingRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getChunkingRouterType_2038ContainedLinks(view));
			break;
		}
		case StaticRecipientListRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getStaticRecipientListRouterType_2039ContainedLinks(view));
			break;
		}
		case CustomOutboundRouterTypeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getCustomOutboundRouterType_2040ContainedLinks(view));
			break;
		}
		case ConnectionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(CoreDiagramUpdater
					.getConnection_3001ContainedLinks(view));
			break;
		}
		}
		for (Iterator children = view.getChildren().iterator(); children
				.hasNext();) {
			result.addAll(collectAllLinks((View) children.next(),
					domain2NotationMap));
		}
		for (Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
			result.addAll(collectAllLinks((View) edges.next(),
					domain2NotationMap));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection createConnections(Collection linkDescriptors,
			Map domain2NotationMap) {
		List adapters = new LinkedList();
		for (Iterator linkDescriptorsIterator = linkDescriptors.iterator(); linkDescriptorsIterator
				.hasNext();) {
			final CoreLinkDescriptor nextLinkDescriptor = (CoreLinkDescriptor) linkDescriptorsIterator
					.next();
			EditPart sourceEditPart = getEditPart(nextLinkDescriptor
					.getSource(), domain2NotationMap);
			EditPart targetEditPart = getEditPart(nextLinkDescriptor
					.getDestination(), domain2NotationMap);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(
					nextLinkDescriptor.getSemanticAdapter(), null,
					ViewUtil.APPEND, false, ((IGraphicalEditPart) getHost())
							.getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(
					descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	 * @generated
	 */
	private EditPart getEditPart(EObject domainModelElement,
			Map domain2NotationMap) {
		View view = (View) domain2NotationMap.get(domainModelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(
					view);
		}
		return null;
	}

}
