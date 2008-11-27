package org.mule.ide.config.vm.editor.services.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyCollectionTypeASYNCREPLYROUTERSEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundCollectionTypeINBOUNDROUTERSEditPart;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;
import org.mule.ide.config.vm.VMPackage;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundEndpointServiceItemEndpointNameEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundEndpointServiceItemTypeLabelEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.OutboundEndpointTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.OutboundEndpointTypeNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * customization
 */
public class VMVisualIDRegistry {

	public final static String MODEL_ID = "VM"; //$NON-NLS-1$
	
	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = VMDiagramEditorPlugin.getInstance()
			.getBundle().getSymbolicName()
			+ "/debug/visualID"; //$NON-NLS-1$

	/**
	 * customization
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			return -1;
		}
		return getVisualID(view.getType());
	}

	/**
	 * customization
	 */
	public static String getModelID(View view) {
		EObject element = view.getElement();
		if (element != null) {
			if (element.eClass().getEPackage() instanceof VMPackage) {
				return MODEL_ID;
			}
		}
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				VMDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * If the containerView can contain a domain element of this type
	 * return the visual ID of the EditPart that will be used to 
	 * display the element.  Otherwise return false.
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		int containerVisualID;
		String containerModelID = getModelID(containerView);
		// Currently assuming the only container EditParts in the editor come from the
		// core plugin.  Eventually, there will need to be a general
		// registry for looking up containment.
		if (CoreVisualIDRegistry.MODEL_ID.equals(containerModelID)) {
			// Handle domainElement EditParts contained in a Core EditPart.
			containerVisualID = CoreVisualIDRegistry.getVisualID(containerView);
			switch (containerVisualID) {
			case InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID:
			case AsyncReplyCollectionTypeASYNCREPLYROUTERSEditPart.VISUAL_ID:
				// "Service Item" EditPart that goes in a specific top-level section EditPart.
				if (VMPackage.eINSTANCE.getInboundEndpointType().isSuperTypeOf(
						domainElement.eClass())) {
					return InboundEndpointServiceItemTypeEditPart.VISUAL_ID;
				}
				break;
			default:
				// EditPart that goes in any container that can contain them.
				if (CoreVisualIDRegistry.canContain(containerView, domainElement
						.eClass())) {
					if (VMPackage.eINSTANCE.getOutboundEndpointType().isSuperTypeOf(
							domainElement.eClass())) {
						return OutboundEndpointTypeEditPart.VISUAL_ID;
					}
				}
			}
		} else {
			// Handle domainElement EditParts contained in an EditPart from this plugin.
		}
		return -1;
	}

	/**
	 * If an EditPart of the given visual ID can be added to the given
	 * containerView, return true.  Otherwise false.
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		if (nodeVisualID == -1) {
			return false;
		}
		int containerVisualID;
		String containerModelID = getModelID(containerView);
		if (CoreVisualIDRegistry.MODEL_ID.equals(containerModelID)) {
			// Handle EditParts contained in a Core EditPart.
			containerVisualID = CoreVisualIDRegistry.getVisualID(containerView);
			switch (nodeVisualID) {
			case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
				// "Service Item" EditPart that goes in a specific top-level section EditPart.
				switch (containerVisualID) {
				case InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID:
				case AsyncReplyCollectionTypeASYNCREPLYROUTERSEditPart.VISUAL_ID:
					return true;
				}
				break;
			case OutboundEndpointTypeEditPart.VISUAL_ID:
				// EditPart that goes in any EditPart that can contain them.
				if (CoreVisualIDRegistry.canContain(containerView,
						CorePackage.eINSTANCE.getAbstractOutboundEndpointType())) {
					return true;
				}
				break;
			}
		} else {
			// Handle EditParts contained in an EditPart from this plugin.
			containerVisualID = getVisualID(containerView);
			switch (nodeVisualID) {
			case InboundEndpointServiceItemTypeLabelEditPart.VISUAL_ID:
				if (containerVisualID == InboundEndpointServiceItemTypeEditPart.VISUAL_ID) {
					return true;
				}
				break;
			case InboundEndpointServiceItemEndpointNameEditPart.VISUAL_ID:
				if (containerVisualID == InboundEndpointServiceItemTypeEditPart.VISUAL_ID) {
					return true;
				}
				break;
			case OutboundEndpointTypeNameEditPart.VISUAL_ID:
				if (containerVisualID == OutboundEndpointTypeEditPart.VISUAL_ID) {
					return true;
				}
				break;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

}
