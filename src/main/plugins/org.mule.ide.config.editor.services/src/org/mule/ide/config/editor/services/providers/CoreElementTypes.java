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
	public static final IElementType PojoComponentType_2001 = getElementType("org.mule.ide.config.editor.services.PojoComponentType_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType NoArgsCallComponentType_2002 = getElementType("org.mule.ide.config.editor.services.NoArgsCallComponentType_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DefaultComponentType_2003 = getElementType("org.mule.ide.config.editor.services.DefaultComponentType_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DefaultComponentType_2004 = getElementType("org.mule.ide.config.editor.services.DefaultComponentType_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DefaultComponentType_2005 = getElementType("org.mule.ide.config.editor.services.DefaultComponentType_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DefaultComponentType_2006 = getElementType("org.mule.ide.config.editor.services.DefaultComponentType_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DefaultComponentType_2007 = getElementType("org.mule.ide.config.editor.services.DefaultComponentType_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType DefaultComponentType_2008 = getElementType("org.mule.ide.config.editor.services.DefaultComponentType_2008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExceptionStrategyType_2009 = getElementType("org.mule.ide.config.editor.services.ExceptionStrategyType_2009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutboundEndpointType_2010 = getElementType("org.mule.ide.config.editor.services.OutboundEndpointType_2010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ExceptionStrategyType_2011 = getElementType("org.mule.ide.config.editor.services.ExceptionStrategyType_2011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CustomExceptionStrategyType_2012 = getElementType("org.mule.ide.config.editor.services.CustomExceptionStrategyType_2012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InboundRouterCollectionType_2013 = getElementType("org.mule.ide.config.editor.services.InboundRouterCollectionType_2013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InboundEndpointType_2014 = getElementType("org.mule.ide.config.editor.services.InboundEndpointType_2014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ForwardingRouterType_2015 = getElementType("org.mule.ide.config.editor.services.ForwardingRouterType_2015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilteredInboundRouterType_2016 = getElementType("org.mule.ide.config.editor.services.FilteredInboundRouterType_2016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilteredInboundRouterType_2017 = getElementType("org.mule.ide.config.editor.services.FilteredInboundRouterType_2017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType IdempotentReceiverType_2018 = getElementType("org.mule.ide.config.editor.services.IdempotentReceiverType_2018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType WireTapRouterType_2019 = getElementType("org.mule.ide.config.editor.services.WireTapRouterType_2019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SelectiveConsumerRouterType_2020 = getElementType("org.mule.ide.config.editor.services.SelectiveConsumerRouterType_2020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CorrelationRouterType_2021 = getElementType("org.mule.ide.config.editor.services.CorrelationRouterType_2021"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CorrelationRouterType_2022 = getElementType("org.mule.ide.config.editor.services.CorrelationRouterType_2022"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CorrelationAggregatorRouterType_2023 = getElementType("org.mule.ide.config.editor.services.CorrelationAggregatorRouterType_2023"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CustomInboundRouterType_2024 = getElementType("org.mule.ide.config.editor.services.CustomInboundRouterType_2024"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AsyncReplyRouterCollectionType_2025 = getElementType("org.mule.ide.config.editor.services.AsyncReplyRouterCollectionType_2025"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType InboundEndpointType_2026 = getElementType("org.mule.ide.config.editor.services.InboundEndpointType_2026"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType AsyncReplyRouterType_2027 = getElementType("org.mule.ide.config.editor.services.AsyncReplyRouterType_2027"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CustomAsyncReplyRouterType_2028 = getElementType("org.mule.ide.config.editor.services.CustomAsyncReplyRouterType_2028"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutboundRouterCollectionType_2029 = getElementType("org.mule.ide.config.editor.services.OutboundRouterCollectionType_2029"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutboundRouterType_2030 = getElementType("org.mule.ide.config.editor.services.OutboundRouterType_2030"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType OutboundEndpointType_2031 = getElementType("org.mule.ide.config.editor.services.OutboundEndpointType_2031"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilteringOutboundRouterType_2032 = getElementType("org.mule.ide.config.editor.services.FilteringOutboundRouterType_2032"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilteringOutboundRouterType_2033 = getElementType("org.mule.ide.config.editor.services.FilteringOutboundRouterType_2033"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilteringOutboundRouterType_2034 = getElementType("org.mule.ide.config.editor.services.FilteringOutboundRouterType_2034"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilteringOutboundRouterType_2035 = getElementType("org.mule.ide.config.editor.services.FilteringOutboundRouterType_2035"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType FilteringOutboundRouterType_2036 = getElementType("org.mule.ide.config.editor.services.FilteringOutboundRouterType_2036"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType EndpointSelectorRouterType_2037 = getElementType("org.mule.ide.config.editor.services.EndpointSelectorRouterType_2037"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType MessageSplitterOutboundRouterType_2038 = getElementType("org.mule.ide.config.editor.services.MessageSplitterOutboundRouterType_2038"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ChunkingRouterType_2039 = getElementType("org.mule.ide.config.editor.services.ChunkingRouterType_2039"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType StaticRecipientListRouterType_2040 = getElementType("org.mule.ide.config.editor.services.StaticRecipientListRouterType_2040"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CustomOutboundRouterType_2041 = getElementType("org.mule.ide.config.editor.services.CustomOutboundRouterType_2041"); //$NON-NLS-1$

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

			elements.put(PojoComponentType_2001, CorePackage.eINSTANCE
					.getPojoComponentType());

			elements.put(NoArgsCallComponentType_2002, CorePackage.eINSTANCE
					.getNoArgsCallComponentType());

			elements.put(DefaultComponentType_2003, CorePackage.eINSTANCE
					.getDefaultComponentType());

			elements.put(DefaultComponentType_2004, CorePackage.eINSTANCE
					.getDefaultComponentType());

			elements.put(DefaultComponentType_2005, CorePackage.eINSTANCE
					.getDefaultComponentType());

			elements.put(DefaultComponentType_2006, CorePackage.eINSTANCE
					.getDefaultComponentType());

			elements.put(DefaultComponentType_2007, CorePackage.eINSTANCE
					.getDefaultComponentType());

			elements.put(DefaultComponentType_2008, CorePackage.eINSTANCE
					.getDefaultComponentType());

			elements.put(ExceptionStrategyType_2009, CorePackage.eINSTANCE
					.getExceptionStrategyType());

			elements.put(OutboundEndpointType_2010, CorePackage.eINSTANCE
					.getOutboundEndpointType());

			elements.put(ExceptionStrategyType_2011, CorePackage.eINSTANCE
					.getExceptionStrategyType());

			elements.put(CustomExceptionStrategyType_2012,
					CorePackage.eINSTANCE.getCustomExceptionStrategyType());

			elements.put(InboundRouterCollectionType_2013,
					CorePackage.eINSTANCE.getInboundRouterCollectionType());

			elements.put(InboundEndpointType_2014, CorePackage.eINSTANCE
					.getInboundEndpointType());

			elements.put(ForwardingRouterType_2015, CorePackage.eINSTANCE
					.getForwardingRouterType());

			elements.put(FilteredInboundRouterType_2016, CorePackage.eINSTANCE
					.getFilteredInboundRouterType());

			elements.put(FilteredInboundRouterType_2017, CorePackage.eINSTANCE
					.getFilteredInboundRouterType());

			elements.put(IdempotentReceiverType_2018, CorePackage.eINSTANCE
					.getIdempotentReceiverType());

			elements.put(WireTapRouterType_2019, CorePackage.eINSTANCE
					.getWireTapRouterType());

			elements.put(SelectiveConsumerRouterType_2020,
					CorePackage.eINSTANCE.getSelectiveConsumerRouterType());

			elements.put(CorrelationRouterType_2021, CorePackage.eINSTANCE
					.getCorrelationRouterType());

			elements.put(CorrelationRouterType_2022, CorePackage.eINSTANCE
					.getCorrelationRouterType());

			elements.put(CorrelationAggregatorRouterType_2023,
					CorePackage.eINSTANCE.getCorrelationAggregatorRouterType());

			elements.put(CustomInboundRouterType_2024, CorePackage.eINSTANCE
					.getCustomInboundRouterType());

			elements.put(AsyncReplyRouterCollectionType_2025,
					CorePackage.eINSTANCE.getAsyncReplyRouterCollectionType());

			elements.put(InboundEndpointType_2026, CorePackage.eINSTANCE
					.getInboundEndpointType());

			elements.put(AsyncReplyRouterType_2027, CorePackage.eINSTANCE
					.getAsyncReplyRouterType());

			elements.put(CustomAsyncReplyRouterType_2028, CorePackage.eINSTANCE
					.getCustomAsyncReplyRouterType());

			elements.put(OutboundRouterCollectionType_2029,
					CorePackage.eINSTANCE.getOutboundRouterCollectionType());

			elements.put(OutboundRouterType_2030, CorePackage.eINSTANCE
					.getOutboundRouterType());

			elements.put(OutboundEndpointType_2031, CorePackage.eINSTANCE
					.getOutboundEndpointType());

			elements.put(FilteringOutboundRouterType_2032,
					CorePackage.eINSTANCE.getFilteringOutboundRouterType());

			elements.put(FilteringOutboundRouterType_2033,
					CorePackage.eINSTANCE.getFilteringOutboundRouterType());

			elements.put(FilteringOutboundRouterType_2034,
					CorePackage.eINSTANCE.getFilteringOutboundRouterType());

			elements.put(FilteringOutboundRouterType_2035,
					CorePackage.eINSTANCE.getFilteringOutboundRouterType());

			elements.put(FilteringOutboundRouterType_2036,
					CorePackage.eINSTANCE.getFilteringOutboundRouterType());

			elements.put(EndpointSelectorRouterType_2037, CorePackage.eINSTANCE
					.getEndpointSelectorRouterType());

			elements.put(MessageSplitterOutboundRouterType_2038,
					CorePackage.eINSTANCE
							.getMessageSplitterOutboundRouterType());

			elements.put(ChunkingRouterType_2039, CorePackage.eINSTANCE
					.getChunkingRouterType());

			elements.put(StaticRecipientListRouterType_2040,
					CorePackage.eINSTANCE.getStaticRecipientListRouterType());

			elements.put(CustomOutboundRouterType_2041, CorePackage.eINSTANCE
					.getCustomOutboundRouterType());
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
			KNOWN_ELEMENT_TYPES.add(PojoComponentType_2001);
			KNOWN_ELEMENT_TYPES.add(NoArgsCallComponentType_2002);
			KNOWN_ELEMENT_TYPES.add(DefaultComponentType_2003);
			KNOWN_ELEMENT_TYPES.add(DefaultComponentType_2004);
			KNOWN_ELEMENT_TYPES.add(DefaultComponentType_2005);
			KNOWN_ELEMENT_TYPES.add(DefaultComponentType_2006);
			KNOWN_ELEMENT_TYPES.add(DefaultComponentType_2007);
			KNOWN_ELEMENT_TYPES.add(DefaultComponentType_2008);
			KNOWN_ELEMENT_TYPES.add(ExceptionStrategyType_2009);
			KNOWN_ELEMENT_TYPES.add(OutboundEndpointType_2010);
			KNOWN_ELEMENT_TYPES.add(ExceptionStrategyType_2011);
			KNOWN_ELEMENT_TYPES.add(CustomExceptionStrategyType_2012);
			KNOWN_ELEMENT_TYPES.add(InboundRouterCollectionType_2013);
			KNOWN_ELEMENT_TYPES.add(InboundEndpointType_2014);
			KNOWN_ELEMENT_TYPES.add(ForwardingRouterType_2015);
			KNOWN_ELEMENT_TYPES.add(FilteredInboundRouterType_2016);
			KNOWN_ELEMENT_TYPES.add(FilteredInboundRouterType_2017);
			KNOWN_ELEMENT_TYPES.add(IdempotentReceiverType_2018);
			KNOWN_ELEMENT_TYPES.add(WireTapRouterType_2019);
			KNOWN_ELEMENT_TYPES.add(SelectiveConsumerRouterType_2020);
			KNOWN_ELEMENT_TYPES.add(CorrelationRouterType_2021);
			KNOWN_ELEMENT_TYPES.add(CorrelationRouterType_2022);
			KNOWN_ELEMENT_TYPES.add(CorrelationAggregatorRouterType_2023);
			KNOWN_ELEMENT_TYPES.add(CustomInboundRouterType_2024);
			KNOWN_ELEMENT_TYPES.add(AsyncReplyRouterCollectionType_2025);
			KNOWN_ELEMENT_TYPES.add(InboundEndpointType_2026);
			KNOWN_ELEMENT_TYPES.add(AsyncReplyRouterType_2027);
			KNOWN_ELEMENT_TYPES.add(CustomAsyncReplyRouterType_2028);
			KNOWN_ELEMENT_TYPES.add(OutboundRouterCollectionType_2029);
			KNOWN_ELEMENT_TYPES.add(OutboundRouterType_2030);
			KNOWN_ELEMENT_TYPES.add(OutboundEndpointType_2031);
			KNOWN_ELEMENT_TYPES.add(FilteringOutboundRouterType_2032);
			KNOWN_ELEMENT_TYPES.add(FilteringOutboundRouterType_2033);
			KNOWN_ELEMENT_TYPES.add(FilteringOutboundRouterType_2034);
			KNOWN_ELEMENT_TYPES.add(FilteringOutboundRouterType_2035);
			KNOWN_ELEMENT_TYPES.add(FilteringOutboundRouterType_2036);
			KNOWN_ELEMENT_TYPES.add(EndpointSelectorRouterType_2037);
			KNOWN_ELEMENT_TYPES.add(MessageSplitterOutboundRouterType_2038);
			KNOWN_ELEMENT_TYPES.add(ChunkingRouterType_2039);
			KNOWN_ELEMENT_TYPES.add(StaticRecipientListRouterType_2040);
			KNOWN_ELEMENT_TYPES.add(CustomOutboundRouterType_2041);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

}
