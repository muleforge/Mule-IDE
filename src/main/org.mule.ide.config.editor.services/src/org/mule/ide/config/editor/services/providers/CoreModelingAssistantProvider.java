package org.mule.ide.config.editor.services.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultConnectorExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultModelTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.DefaultServiceExceptionStrategyTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterCollectionTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEXCEPTIONEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeINBOUNDEditPart;
import org.mule.ide.config.editor.services.part.CoreDiagramEditorPlugin;
import org.mule.ide.config.editor.services.part.Messages;
import org.mule.ide.config.editor.services.part.ServicesEditorPlugin;

/**
 * @generated
 */
public class CoreModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart instanceof SedaServiceTypeEditPart) {
			List types = new ArrayList();
			types.add(CoreElementTypes.PojoComponentType_2001);
			types.add(CoreElementTypes.NoArgsCallComponentType_2002);
			types.add(CoreElementTypes.DefaultComponentType_2003);
			types.add(CoreElementTypes.DefaultComponentType_2004);
			types.add(CoreElementTypes.DefaultComponentType_2005);
			types.add(CoreElementTypes.DefaultComponentType_2006);
			types.add(CoreElementTypes.DefaultComponentType_2007);
			types.add(CoreElementTypes.DefaultComponentType_2008);
			types.add(CoreElementTypes.ExceptionStrategyType_2009);
			types.add(CoreElementTypes.ExceptionStrategyType_2011);
			types.add(CoreElementTypes.CustomExceptionStrategyType_2012);
			types.add(CoreElementTypes.InboundRouterCollectionType_2013);
			types.add(CoreElementTypes.AsyncReplyRouterCollectionType_2025);
			types.add(CoreElementTypes.OutboundRouterCollectionType_2029);
			return types;
		}
		if (editPart instanceof DefaultServiceExceptionStrategyTypeEditPart) {
			List types = new ArrayList();
			types.add(CoreElementTypes.OutboundEndpointType_2010);
			return types;
		}
		if (editPart instanceof DefaultConnectorExceptionStrategyTypeEditPart) {
			List types = new ArrayList();
			types.add(CoreElementTypes.OutboundEndpointType_2010);
			return types;
		}
		if (editPart instanceof CustomExceptionStrategyTypeEditPart) {
			List types = new ArrayList();
			types.add(CoreElementTypes.OutboundEndpointType_2010);
			return types;
		}
		if (editPart instanceof InboundRouterCollectionTypeEditPart) {
			List types = new ArrayList();
			types.add(CoreElementTypes.InboundEndpointType_2014);
			types.add(CoreElementTypes.ForwardingRouterType_2015);
			types.add(CoreElementTypes.FilteredInboundRouterType_2016);
			types.add(CoreElementTypes.FilteredInboundRouterType_2017);
			types.add(CoreElementTypes.IdempotentReceiverType_2018);
			types.add(CoreElementTypes.WireTapRouterType_2019);
			types.add(CoreElementTypes.SelectiveConsumerRouterType_2020);
			types.add(CoreElementTypes.CorrelationRouterType_2021);
			types.add(CoreElementTypes.CorrelationRouterType_2022);
			types.add(CoreElementTypes.CorrelationAggregatorRouterType_2023);
			types.add(CoreElementTypes.CustomInboundRouterType_2024);
			return types;
		}
		if (editPart instanceof AsyncReplyRouterCollectionTypeEditPart) {
			List types = new ArrayList();
			types.add(CoreElementTypes.InboundEndpointType_2026);
			types.add(CoreElementTypes.AsyncReplyRouterType_2027);
			types.add(CoreElementTypes.CustomAsyncReplyRouterType_2028);
			return types;
		}
		if (editPart instanceof OutboundRouterCollectionTypeEditPart) {
			List types = new ArrayList();
			types.add(CoreElementTypes.OutboundRouterType_2030);
			types.add(CoreElementTypes.FilteringOutboundRouterType_2031);
			types.add(CoreElementTypes.FilteringOutboundRouterType_2032);
			types.add(CoreElementTypes.FilteringOutboundRouterType_2033);
			types.add(CoreElementTypes.FilteringOutboundRouterType_2034);
			types.add(CoreElementTypes.FilteringOutboundRouterType_2035);
			types.add(CoreElementTypes.EndpointSelectorRouterType_2036);
			types.add(CoreElementTypes.MessageSplitterOutboundRouterType_2037);
			types.add(CoreElementTypes.ChunkingRouterType_2038);
			types.add(CoreElementTypes.StaticRecipientListRouterType_2039);
			types.add(CoreElementTypes.CustomOutboundRouterType_2040);
			return types;
		}
		if (editPart instanceof DefaultModelTypeEditPart) {
			List types = new ArrayList();
			types.add(CoreElementTypes.SedaServiceType_1001);
			return types;
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source,
			IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target,
			IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source,
			IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source
				.getAdapter(IGraphicalEditPart.class);
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target,
			IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target,
				relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source,
			IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source,
				relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host
				.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements
				.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(
				element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(
				ServicesEditorPlugin.getInstance()
						.getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(
				shell, labelProvider);
		dialog.setMessage(Messages.CoreModelingAssistantProviderMessage);
		dialog.setTitle(Messages.CoreModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
