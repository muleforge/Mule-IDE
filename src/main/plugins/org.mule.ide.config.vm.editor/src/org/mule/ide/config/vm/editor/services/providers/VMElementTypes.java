package org.mule.ide.config.vm.editor.services.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.vm.VMPackage;
import org.mule.ide.config.vm.editor.services.part.VMDiagramEditorPlugin;

/**
 * @generated
 */
public class VMElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private VMElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType DefaultModelType_79 = getElementType("org.mule.ide.config.vm.editor.services.DefaultModelType_79"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SedaServiceType_1001 = getElementType("org.mule.ide.config.vm.editor.services.SedaServiceType_1001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InboundCollectionType_2001 = getElementType("org.mule.ide.config.vm.editor.services.InboundCollectionType_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InboundEndpointType_2002 = getElementType("org.mule.ide.config.vm.editor.services.InboundEndpointType_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ExceptionStrategyType_2003 = getElementType("org.mule.ide.config.vm.editor.services.ExceptionStrategyType_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutboundEndpointType_2004 = getElementType("org.mule.ide.config.vm.editor.services.OutboundEndpointType_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return VMDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap();

			elements.put(DefaultModelType_79, CorePackage.eINSTANCE
					.getDefaultModelType());

			elements.put(SedaServiceType_1001, CorePackage.eINSTANCE
					.getSedaServiceType());

			elements.put(InboundCollectionType_2001, CorePackage.eINSTANCE
					.getInboundCollectionType());

			elements.put(InboundEndpointType_2002, VMPackage.eINSTANCE
					.getInboundEndpointType());

			elements.put(ExceptionStrategyType_2003, CorePackage.eINSTANCE
					.getEndpointExceptionStrategyType());

			elements.put(OutboundEndpointType_2004, VMPackage.eINSTANCE
					.getOutboundEndpointType());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet();
			KNOWN_ELEMENT_TYPES.add(DefaultModelType_79);
			KNOWN_ELEMENT_TYPES.add(SedaServiceType_1001);
			KNOWN_ELEMENT_TYPES.add(InboundCollectionType_2001);
			KNOWN_ELEMENT_TYPES.add(InboundEndpointType_2002);
			KNOWN_ELEMENT_TYPES.add(ExceptionStrategyType_2003);
			KNOWN_ELEMENT_TYPES.add(OutboundEndpointType_2004);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
