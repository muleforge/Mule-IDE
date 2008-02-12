package org.mule.ide.config.editor.services.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyCollectionTypeASYNCREPLYROUTERSEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyCollectionTypeINBOUNDENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyInboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.BridgeComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChainingOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChainingOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.ChunkingRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ConnectionEditPart;
import org.mule.ide.config.editor.services.edit.parts.CorrelationResequencerRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomAsyncReplyRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomCorrelationAggregatorRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultModelTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultServiceExceptionStrategyTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultServiceExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.EchoComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.EndpointSelectorRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.EndpointSelectorRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ExceptionOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.ExceptionOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.FilteringOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.FilteringOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.ForwardingRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentReceiverRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.IdempotentSecureRecieverRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundCollectionTypeINBOUNDENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundCollectionTypeINBOUNDROUTERSEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.LogComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.MessageSplitterOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.MessageSplitterOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.MulticastingOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.MulticastingOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.NullComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundCollectionTypeOUTBOUNDROUTERSEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundEndpointTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterOutboundEndpointTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughInboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.PassThroughOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeASYNCREPLYEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeCOMPONENTEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEXCEPTIONEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeINBOUNDEditPart;
import org.mule.ide.config.editor.services.edit.parts.SelectiveConsumerRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.StaticRecipientListRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.StaticRecipientListRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.TemplateEndpointOutboundRouterTypeENDPOINTSEditPart;
import org.mule.ide.config.editor.services.edit.parts.TemplateEndpointOutboundRouterTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.WireTapRouterTypeEditPart;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;
import org.mule.ide.config.editor.services.part.Messages;

/**
 * @generated
 */
public class CoreNavigatorContentProvider implements ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	public CoreNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						for (Iterator it = myEditingDomain.getResourceSet()
								.getResources().iterator(); it.hasNext();) {
							Resource nextResource = (Resource) it.next();
							nextResource.unload();
						}
						if (myViewer != null) {
							myViewer.getControl().getDisplay().asyncExec(
									myViewerRefreshRunnable);
						}
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						for (Iterator it = myEditingDomain.getResourceSet()
								.getResources().iterator(); it.hasNext();) {
							Resource nextResource = (Resource) it.next();
							nextResource.unload();
						}
						if (myViewer != null) {
							myViewer.getControl().getDisplay().asyncExec(
									myViewerRefreshRunnable);
						}
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						for (Iterator it = myEditingDomain.getResourceSet()
								.getResources().iterator(); it.hasNext();) {
							Resource nextResource = (Resource) it.next();
							nextResource.unload();
						}
						if (myViewer != null) {
							myViewer.getControl().getDisplay().asyncExec(
									myViewerRefreshRunnable);
						}
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		for (Iterator it = myEditingDomain.getResourceSet().getResources()
				.iterator(); it.hasNext();) {
			Resource resource = (Resource) it.next();
			resource.unload();
		}
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			Collection result = new ArrayList();
			result.addAll(createNavigatorItems(selectViewsByType(resource
					.getContents(), DefaultModelTypeEditPart.MODEL_ID), file,
					false));
			return result.toArray();
		}

		if (parentElement instanceof CoreNavigatorGroup) {
			CoreNavigatorGroup group = (CoreNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof CoreNavigatorItem) {
			CoreNavigatorItem navigatorItem = (CoreNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (CoreVisualIDRegistry.getVisualID(view)) {

		case DefaultModelTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoreNavigatorGroup links = new CoreNavigatorGroup(
					Messages.NavigatorGroupName_DefaultModelType_79_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view), SedaServiceTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(view),
					ConnectionEditPart.VISUAL_ID);
			links
					.addChildren(createNavigatorItems(connectedViews, links,
							false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case SedaServiceTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoreNavigatorGroup incominglinks = new CoreNavigatorGroup(
					Messages.NavigatorGroupName_SedaServiceType_1001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoreNavigatorGroup outgoinglinks = new CoreNavigatorGroup(
					Messages.NavigatorGroupName_SedaServiceType_1001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view),
					SedaServiceTypeCOMPONENTEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					PojoComponentTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					SedaServiceTypeCOMPONENTEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					DefaultComponentTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					SedaServiceTypeCOMPONENTEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					BridgeComponentTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					SedaServiceTypeCOMPONENTEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					EchoComponentTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					SedaServiceTypeCOMPONENTEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					LogComponentTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					SedaServiceTypeCOMPONENTEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					NullComponentTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					SedaServiceTypeCOMPONENTEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					PassThroughComponentTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					SedaServiceTypeEXCEPTIONEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					SedaServiceTypeEXCEPTIONEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					SedaServiceTypeEXCEPTIONEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					CustomExceptionStrategyTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					SedaServiceTypeINBOUNDEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					InboundCollectionTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					SedaServiceTypeASYNCREPLYEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					AsyncReplyCollectionTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					OutboundCollectionTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(view), ConnectionEditPart.VISUAL_ID);
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(view), ConnectionEditPart.VISUAL_ID);
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case DefaultServiceExceptionStrategyTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					DefaultServiceExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					OutboundEndpointTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case DefaultConnectorExceptionStrategyTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					DefaultConnectorExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					OutboundEndpointTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CustomExceptionStrategyTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view),
					CustomExceptionStrategyTypeENDPOINTSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					OutboundEndpointTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case InboundCollectionTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view),
					InboundCollectionTypeINBOUNDENDPOINTSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					InboundEndpointServiceItemTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					ForwardingRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					IdempotentSecureRecieverRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					PassThroughInboundRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					IdempotentReceiverRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					WireTapRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					SelectiveConsumerRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					ChunkingInboundRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					CorrelationResequencerRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					CustomCorrelationAggregatorRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					CustomInboundRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case AsyncReplyCollectionTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view),
					AsyncReplyCollectionTypeINBOUNDENDPOINTSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					AsyncReplyInboundEndpointServiceItemTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					AsyncReplyCollectionTypeASYNCREPLYROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					AsyncReplyRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					AsyncReplyCollectionTypeASYNCREPLYROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					CustomAsyncReplyRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case OutboundCollectionTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view),
					OutboundCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					PassThroughOutboundRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					OutboundCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					FilteringOutboundRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					OutboundCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					ChainingOutboundRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					OutboundCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					ExceptionOutboundRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					OutboundCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					MulticastingOutboundRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					OutboundCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					TemplateEndpointOutboundRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					OutboundCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					EndpointSelectorRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					OutboundCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					MessageSplitterOutboundRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					OutboundCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					ChunkingRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					OutboundCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					StaticRecipientListRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(view),
					OutboundCollectionTypeOUTBOUNDROUTERSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					CustomOutboundRouterTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case PassThroughOutboundRouterTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view),
					PassThroughOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case FilteringOutboundRouterTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view),
					FilteringOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ChainingOutboundRouterTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view),
					ChainingOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ExceptionOutboundRouterTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view),
					ExceptionOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MulticastingOutboundRouterTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view),
					MulticastingOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case TemplateEndpointOutboundRouterTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					TemplateEndpointOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case EndpointSelectorRouterTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view),
					EndpointSelectorRouterTypeENDPOINTSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case MessageSplitterOutboundRouterTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(
					Collections.singleton(view),
					MessageSplitterOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ChunkingRouterTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view),
					ChunkingRouterTypeENDPOINTSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case StaticRecipientListRouterTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view),
					StaticRecipientListRouterTypeENDPOINTSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case CustomOutboundRouterTypeEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			Collection connectedViews = getChildrenByType(Collections
					.singleton(view),
					CustomOutboundRouterTypeENDPOINTSEditPart.VISUAL_ID);
			connectedViews = getChildrenByType(connectedViews,
					OutboundRouterOutboundEndpointTypeEditPart.VISUAL_ID);
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case ConnectionEditPart.VISUAL_ID: {
			Collection result = new ArrayList();
			CoreNavigatorGroup target = new CoreNavigatorGroup(
					Messages.NavigatorGroupName_Connection_3001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			CoreNavigatorGroup source = new CoreNavigatorGroup(
					Messages.NavigatorGroupName_Connection_3001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection connectedViews = getLinksTargetByType(Collections
					.singleton(view), SedaServiceTypeEditPart.VISUAL_ID);
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(view),
					SedaServiceTypeEditPart.VISUAL_ID);
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection getLinksSourceByType(Collection edges, int visualID) {
		Collection result = new ArrayList();
		String type = CoreVisualIDRegistry.getType(visualID);
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getLinksTargetByType(Collection edges, int visualID) {
		Collection result = new ArrayList();
		String type = CoreVisualIDRegistry.getType(visualID);
		for (Iterator it = edges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getOutgoingLinksByType(Collection nodes, int visualID) {
		Collection result = new ArrayList();
		String type = CoreVisualIDRegistry.getType(visualID);
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getIncomingLinksByType(Collection nodes, int visualID) {
		Collection result = new ArrayList();
		String type = CoreVisualIDRegistry.getType(visualID);
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getChildrenByType(Collection nodes, int visualID) {
		Collection result = new ArrayList();
		String type = CoreVisualIDRegistry.getType(visualID);
		for (Iterator it = nodes.iterator(); it.hasNext();) {
			View nextNode = (View) it.next();
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getDiagramLinksByType(Collection diagrams, int visualID) {
		Collection result = new ArrayList();
		String type = CoreVisualIDRegistry.getType(visualID);
		for (Iterator it = diagrams.iterator(); it.hasNext();) {
			Diagram nextDiagram = (Diagram) it.next();
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection selectViewsByType(Collection views, String type) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			View nextView = (View) it.next();
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return DefaultModelTypeEditPart.MODEL_ID.equals(CoreVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection createNavigatorItems(Collection views, Object parent,
			boolean isLeafs) {
		Collection result = new ArrayList();
		for (Iterator it = views.iterator(); it.hasNext();) {
			result
					.add(new CoreNavigatorItem((View) it.next(), parent,
							isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof CoreAbstractNavigatorItem) {
			CoreAbstractNavigatorItem abstractNavigatorItem = (CoreAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
