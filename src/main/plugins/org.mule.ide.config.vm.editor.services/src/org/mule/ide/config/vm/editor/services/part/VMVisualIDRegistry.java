package org.mule.ide.config.vm.editor.services.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.DefaultModelType;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;
import org.mule.ide.config.vm.VMPackage;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundCollectionTypeINBOUNDROUTERSEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundEndpointServiceItemEndpointNameEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundEndpointServiceItemTypeEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundEndpointServiceItemTypeLabelEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * customization
 */
public class VMVisualIDRegistry {
	
	public final static String CORE_MODEL_ID = org.mule.ide.config.editor.services.edit.parts.DefaultModelTypeEditPart.MODEL_ID;
	public final static String VM_MODEL_ID = org.mule.ide.config.vm.editor.services.edit.parts.DefaultModelTypeEditPart.MODEL_ID;
	

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
		return org.mule.ide.config.vm.editor.services.part.VMVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * customization
	 */
	public static String getModelID(View view) {
		EObject element = view.getElement();
		if (element != null) {
			if (element.eClass().getEPackage() instanceof VMPackage) {
				return VM_MODEL_ID;
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
	 * customization
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		return -1;
	}

	/**
	 * customization
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		boolean isCoreContainer = false;
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.mule.ide.config.vm.editor.services.part.VMVisualIDRegistry
				.getModelID(containerView);
		if (CORE_MODEL_ID.equals(containerModelID)) {
			isCoreContainer = true;
		} else if (! VM_MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (isCoreContainer) {
			containerVisualID = CoreVisualIDRegistry.getVisualID(containerView);			
		} else {
			containerVisualID = VMVisualIDRegistry.getVisualID(containerView);			
		}
		if (isCoreContainer) {
			switch (containerVisualID) {
			case org.mule.ide.config.editor.services.edit.parts.InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID:
				if (VMPackage.eINSTANCE.getInboundEndpointType().isSuperTypeOf(
						domainElement.eClass())) {
					return InboundEndpointServiceItemTypeEditPart.VISUAL_ID;
				}
				break;
			}
			return -1;
		} else {
			switch (containerVisualID) {
			}
			return -1;			
		}
	}

	/**
	 * customization
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		boolean isCoreContainer = false;
		String containerModelID = org.mule.ide.config.vm.editor.services.part.VMVisualIDRegistry
				.getModelID(containerView);
		if (CORE_MODEL_ID.equals(containerModelID)) {
			isCoreContainer = true;
		} else if (! VM_MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (isCoreContainer) {
			containerVisualID = CoreVisualIDRegistry.getVisualID(containerView);			
		} else {
			containerVisualID = VMVisualIDRegistry.getVisualID(containerView);			
		}
		if (isCoreContainer) {
			switch (containerVisualID) {
			case org.mule.ide.config.editor.services.edit.parts.InboundCollectionTypeINBOUNDROUTERSEditPart.VISUAL_ID:
				if (InboundEndpointServiceItemTypeEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			}
			return false;
		} else {
			switch (containerVisualID) {
			case InboundEndpointServiceItemTypeEditPart.VISUAL_ID:
				if (InboundEndpointServiceItemTypeLabelEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				if (InboundEndpointServiceItemEndpointNameEditPart.VISUAL_ID == nodeVisualID) {
					return true;
				}
				break;
			}
			return false;			
		}
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

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * customization
	 */
	private static boolean isDiagram(DefaultModelType element) {
		return false;
	}

}
