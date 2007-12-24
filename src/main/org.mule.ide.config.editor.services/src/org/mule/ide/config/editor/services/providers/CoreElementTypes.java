package org.mule.ide.config.editor.services.providers;

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
import org.mule.ide.config.editor.services.part.CoreDiagramEditorPlugin;
import org.mule.ide.config.editor.services.part.ServicesEditorPlugin;

/**
 * @generated
 */
public class CoreElementTypes extends ElementInitializers {

	/**
	 * @generated
	 */
	private CoreElementTypes() {
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
	public static final IElementType DefaultModelType_79 = getElementType("org.mule.ide.config.editor.services.DefaultModelType_79"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SedaServiceType_1001 = getElementType("org.mule.ide.config.editor.services.SedaServiceType_1001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InboundRouterCollectionType_2001 = getElementType("org.mule.ide.config.editor.services.InboundRouterCollectionType_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InboundEndpointType_2002 = getElementType("org.mule.ide.config.editor.services.InboundEndpointType_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType WireTapRouterType_2003 = getElementType("org.mule.ide.config.editor.services.WireTapRouterType_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ResponseRouterCollectionType_2004 = getElementType("org.mule.ide.config.editor.services.ResponseRouterCollectionType_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutboundRouterCollectionType_2005 = getElementType("org.mule.ide.config.editor.services.OutboundRouterCollectionType_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PojoComponentType_2006 = getElementType("org.mule.ide.config.editor.services.PojoComponentType_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NoArgsCallWrapperType_2007 = getElementType("org.mule.ide.config.editor.services.NoArgsCallWrapperType_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DefaultComponentType_2008 = getElementType("org.mule.ide.config.editor.services.DefaultComponentType_2008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DefaultComponentType_2009 = getElementType("org.mule.ide.config.editor.services.DefaultComponentType_2009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DefaultComponentType_2010 = getElementType("org.mule.ide.config.editor.services.DefaultComponentType_2010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DefaultComponentType_2011 = getElementType("org.mule.ide.config.editor.services.DefaultComponentType_2011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DefaultComponentType_2012 = getElementType("org.mule.ide.config.editor.services.DefaultComponentType_2012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DefaultComponentType_2013 = getElementType("org.mule.ide.config.editor.services.DefaultComponentType_2013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExceptionStrategyType_2014 = getElementType("org.mule.ide.config.editor.services.ExceptionStrategyType_2014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutboundEndpointType_2015 = getElementType("org.mule.ide.config.editor.services.OutboundEndpointType_2015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExceptionStrategyType_2016 = getElementType("org.mule.ide.config.editor.services.ExceptionStrategyType_2016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CustomExceptionStrategyType_2017 = getElementType("org.mule.ide.config.editor.services.CustomExceptionStrategyType_2017"); //$NON-NLS-1$

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
				return ServicesEditorPlugin.getInstance()
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

			elements.put(InboundRouterCollectionType_2001,
					CorePackage.eINSTANCE.getInboundRouterCollectionType());

			elements.put(InboundEndpointType_2002, CorePackage.eINSTANCE
					.getInboundEndpointType());

			elements.put(WireTapRouterType_2003, CorePackage.eINSTANCE
					.getWireTapRouterType());

			elements.put(ResponseRouterCollectionType_2004,
					CorePackage.eINSTANCE.getResponseRouterCollectionType());

			elements.put(OutboundRouterCollectionType_2005,
					CorePackage.eINSTANCE.getOutboundRouterCollectionType());

			elements.put(PojoComponentType_2006, CorePackage.eINSTANCE
					.getPojoComponentType());

			elements.put(NoArgsCallWrapperType_2007, CorePackage.eINSTANCE
					.getNoArgsCallWrapperType());

			elements.put(DefaultComponentType_2008, CorePackage.eINSTANCE
					.getDefaultComponentType());

			elements.put(DefaultComponentType_2009, CorePackage.eINSTANCE
					.getDefaultComponentType());

			elements.put(DefaultComponentType_2010, CorePackage.eINSTANCE
					.getDefaultComponentType());

			elements.put(DefaultComponentType_2011, CorePackage.eINSTANCE
					.getDefaultComponentType());

			elements.put(DefaultComponentType_2012, CorePackage.eINSTANCE
					.getDefaultComponentType());

			elements.put(DefaultComponentType_2013, CorePackage.eINSTANCE
					.getDefaultComponentType());

			elements.put(ExceptionStrategyType_2014, CorePackage.eINSTANCE
					.getExceptionStrategyType());

			elements.put(OutboundEndpointType_2015, CorePackage.eINSTANCE
					.getOutboundEndpointType());

			elements.put(ExceptionStrategyType_2016, CorePackage.eINSTANCE
					.getExceptionStrategyType());

			elements.put(CustomExceptionStrategyType_2017,
					CorePackage.eINSTANCE.getCustomExceptionStrategyType());
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
			KNOWN_ELEMENT_TYPES.add(InboundRouterCollectionType_2001);
			KNOWN_ELEMENT_TYPES.add(InboundEndpointType_2002);
			KNOWN_ELEMENT_TYPES.add(WireTapRouterType_2003);
			KNOWN_ELEMENT_TYPES.add(ResponseRouterCollectionType_2004);
			KNOWN_ELEMENT_TYPES.add(OutboundRouterCollectionType_2005);
			KNOWN_ELEMENT_TYPES.add(PojoComponentType_2006);
			KNOWN_ELEMENT_TYPES.add(NoArgsCallWrapperType_2007);
			KNOWN_ELEMENT_TYPES.add(DefaultComponentType_2008);
			KNOWN_ELEMENT_TYPES.add(DefaultComponentType_2009);
			KNOWN_ELEMENT_TYPES.add(DefaultComponentType_2010);
			KNOWN_ELEMENT_TYPES.add(DefaultComponentType_2011);
			KNOWN_ELEMENT_TYPES.add(DefaultComponentType_2012);
			KNOWN_ELEMENT_TYPES.add(DefaultComponentType_2013);
			KNOWN_ELEMENT_TYPES.add(ExceptionStrategyType_2014);
			KNOWN_ELEMENT_TYPES.add(OutboundEndpointType_2015);
			KNOWN_ELEMENT_TYPES.add(ExceptionStrategyType_2016);
			KNOWN_ELEMENT_TYPES.add(CustomExceptionStrategyType_2017);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
