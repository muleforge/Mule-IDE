package org.mule.ide.config.editor.services.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.parts.AsyncReplyInboundEndpointServiceItemEndpointNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomAsyncReplyRouterTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomCorrelationAggregatorRouterTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomInboundRouterTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomOutboundRouterTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundEndpointServiceItemEndpointNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundEndpointTypeNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterOutboundEndpointTypeNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeNameEditPart;
import org.mule.ide.config.editor.services.parsers.ClassNameParser;
import org.mule.ide.config.editor.services.parsers.EndpointParser;
import org.mule.ide.config.editor.services.parsers.MessageFormatParser;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;

/**
 * @generated
 */
public class CoreParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser sedaServiceTypeName_4046Parser;

	/**
	 * @generated
	 */
	private IParser getSedaServiceTypeName_4046Parser() {
		if (sedaServiceTypeName_4046Parser == null) {
			sedaServiceTypeName_4046Parser = createSedaServiceTypeName_4046Parser();
		}
		return sedaServiceTypeName_4046Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSedaServiceTypeName_4046Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getAbstractServiceType_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser pojoComponentTypeClass_4002Parser;

	/**
	 * @generated
	 */
	private IParser getPojoComponentTypeClass_4002Parser() {
		if (pojoComponentTypeClass_4002Parser == null) {
			pojoComponentTypeClass_4002Parser = createPojoComponentTypeClass_4002Parser();
		}
		return pojoComponentTypeClass_4002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createPojoComponentTypeClass_4002Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getPojoComponentType_Class(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser outboundEndpointTypeNameRefConnectorRefAddress_4009Parser;

	/**
	 * @generated
	 */
	private IParser getOutboundEndpointTypeNameRefConnectorRefAddress_4009Parser() {
		if (outboundEndpointTypeNameRefConnectorRefAddress_4009Parser == null) {
			outboundEndpointTypeNameRefConnectorRefAddress_4009Parser = createOutboundEndpointTypeNameRefConnectorRefAddress_4009Parser();
		}
		return outboundEndpointTypeNameRefConnectorRefAddress_4009Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOutboundEndpointTypeNameRefConnectorRefAddress_4009Parser() {
		EAttribute[] features = new EAttribute[] {
				CorePackage.eINSTANCE.getAbstractOutboundEndpointType_Name(),
				CorePackage.eINSTANCE.getOutboundEndpointType_Ref(),
				CorePackage.eINSTANCE.getOutboundEndpointType_ConnectorRef(),
				CorePackage.eINSTANCE.getOutboundEndpointType_Address(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser customExceptionStrategyTypeClass_4013Parser;

	/**
	 * @generated
	 */
	private IParser getCustomExceptionStrategyTypeClass_4013Parser() {
		if (customExceptionStrategyTypeClass_4013Parser == null) {
			customExceptionStrategyTypeClass_4013Parser = createCustomExceptionStrategyTypeClass_4013Parser();
		}
		return customExceptionStrategyTypeClass_4013Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCustomExceptionStrategyTypeClass_4013Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getCustomExceptionStrategyType_Class(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser inboundEndpointTypeNameRefConnectorRefAddress_4015Parser;

	/**
	 * @generated
	 */
	private IParser getInboundEndpointTypeNameRefConnectorRefAddress_4015Parser() {
		if (inboundEndpointTypeNameRefConnectorRefAddress_4015Parser == null) {
			inboundEndpointTypeNameRefConnectorRefAddress_4015Parser = createInboundEndpointTypeNameRefConnectorRefAddress_4015Parser();
		}
		return inboundEndpointTypeNameRefConnectorRefAddress_4015Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInboundEndpointTypeNameRefConnectorRefAddress_4015Parser() {
		EAttribute[] features = new EAttribute[] {
				CorePackage.eINSTANCE.getAbstractInboundEndpointType_Name(),
				CorePackage.eINSTANCE.getInboundEndpointType_Ref(),
				CorePackage.eINSTANCE.getInboundEndpointType_ConnectorRef(),
				CorePackage.eINSTANCE.getInboundEndpointType_Address(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser customCorrelationAggregatorRouterTypeClass_4025Parser;

	/**
	 * @generated
	 */
	private IParser getCustomCorrelationAggregatorRouterTypeClass_4025Parser() {
		if (customCorrelationAggregatorRouterTypeClass_4025Parser == null) {
			customCorrelationAggregatorRouterTypeClass_4025Parser = createCustomCorrelationAggregatorRouterTypeClass_4025Parser();
		}
		return customCorrelationAggregatorRouterTypeClass_4025Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCustomCorrelationAggregatorRouterTypeClass_4025Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getCustomCorrelationAggregatorRouterType_Class(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser customInboundRouterTypeClass_4027Parser;

	/**
	 * @generated
	 */
	private IParser getCustomInboundRouterTypeClass_4027Parser() {
		if (customInboundRouterTypeClass_4027Parser == null) {
			customInboundRouterTypeClass_4027Parser = createCustomInboundRouterTypeClass_4027Parser();
		}
		return customInboundRouterTypeClass_4027Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCustomInboundRouterTypeClass_4027Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getCustomInboundRouterType_Class(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser inboundEndpointTypeNameRefConnectorRefAddress_4029Parser;

	/**
	 * @generated
	 */
	private IParser getInboundEndpointTypeNameRefConnectorRefAddress_4029Parser() {
		if (inboundEndpointTypeNameRefConnectorRefAddress_4029Parser == null) {
			inboundEndpointTypeNameRefConnectorRefAddress_4029Parser = createInboundEndpointTypeNameRefConnectorRefAddress_4029Parser();
		}
		return inboundEndpointTypeNameRefConnectorRefAddress_4029Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInboundEndpointTypeNameRefConnectorRefAddress_4029Parser() {
		EAttribute[] features = new EAttribute[] {
				CorePackage.eINSTANCE.getAbstractInboundEndpointType_Name(),
				CorePackage.eINSTANCE.getInboundEndpointType_Ref(),
				CorePackage.eINSTANCE.getInboundEndpointType_ConnectorRef(),
				CorePackage.eINSTANCE.getInboundEndpointType_Address(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser customAsyncReplyRouterTypeClass_4032Parser;

	/**
	 * @generated
	 */
	private IParser getCustomAsyncReplyRouterTypeClass_4032Parser() {
		if (customAsyncReplyRouterTypeClass_4032Parser == null) {
			customAsyncReplyRouterTypeClass_4032Parser = createCustomAsyncReplyRouterTypeClass_4032Parser();
		}
		return customAsyncReplyRouterTypeClass_4032Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCustomAsyncReplyRouterTypeClass_4032Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getCustomAsyncReplyRouterType_Class(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser outboundEndpointTypeNameRefConnectorRefAddress_4033Parser;

	/**
	 * @generated
	 */
	private IParser getOutboundEndpointTypeNameRefConnectorRefAddress_4033Parser() {
		if (outboundEndpointTypeNameRefConnectorRefAddress_4033Parser == null) {
			outboundEndpointTypeNameRefConnectorRefAddress_4033Parser = createOutboundEndpointTypeNameRefConnectorRefAddress_4033Parser();
		}
		return outboundEndpointTypeNameRefConnectorRefAddress_4033Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOutboundEndpointTypeNameRefConnectorRefAddress_4033Parser() {
		EAttribute[] features = new EAttribute[] {
				CorePackage.eINSTANCE.getAbstractOutboundEndpointType_Name(),
				CorePackage.eINSTANCE.getOutboundEndpointType_Ref(),
				CorePackage.eINSTANCE.getOutboundEndpointType_ConnectorRef(),
				CorePackage.eINSTANCE.getOutboundEndpointType_Address(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser customOutboundRouterTypeClass_4045Parser;

	/**
	 * @generated
	 */
	private IParser getCustomOutboundRouterTypeClass_4045Parser() {
		if (customOutboundRouterTypeClass_4045Parser == null) {
			customOutboundRouterTypeClass_4045Parser = createCustomOutboundRouterTypeClass_4045Parser();
		}
		return customOutboundRouterTypeClass_4045Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCustomOutboundRouterTypeClass_4045Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getCustomOutboundRouterType_Class(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 *
	 */
	private IParser sedaServiceTypeName_Parser;

	/**
	 *
	 */
	private IParser getSedaServiceTypeName_Parser() {
		if (sedaServiceTypeName_Parser == null) {
			sedaServiceTypeName_Parser = createSedaServiceTypeName_Parser();
		}
		return sedaServiceTypeName_Parser;
	}

	/**
	 *
	 */
	protected IParser createSedaServiceTypeName_Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getAbstractServiceType_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 *
	 */
	private IParser pojoComponentTypeClass_Parser;

	/**
	 *
	 */
	private IParser getPojoComponentTypeClass_Parser() {
		if (pojoComponentTypeClass_Parser == null) {
			pojoComponentTypeClass_Parser = createPojoComponentTypeClass_Parser();
		}
		return pojoComponentTypeClass_Parser;
	}

	/**
	 *
	 */
	protected IParser createPojoComponentTypeClass_Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getPojoComponentType_Class(), };
		MessageFormatParser parser = new ClassNameParser(features);
		return parser;
	}

	/**
	 *
	 */
	private IParser inboundEndpointTypeName_Parser;

	/**
	 *
	 */
	private IParser getInboundEndpointTypeName_Parser() {
		if (inboundEndpointTypeName_Parser == null) {
			inboundEndpointTypeName_Parser = createInboundEndpointTypeName_Parser();
		}
		return inboundEndpointTypeName_Parser;
	}

	/**
	 *
	 */
	protected IParser createInboundEndpointTypeName_Parser() {
		EAttribute[] features = new EAttribute[] {
				CorePackage.eINSTANCE.getAbstractInboundEndpointType_Name(),
				CorePackage.eINSTANCE.getInboundEndpointType_Ref(),
				CorePackage.eINSTANCE.getInboundEndpointType_ConnectorRef(),
				CorePackage.eINSTANCE.getInboundEndpointType_Address(), };
		MessageFormatParser parser = new EndpointParser(features);
		return parser;
	}

	/**
	 *
	 */
	private IParser outboundEndpointTypeName_Parser;

	/**
	 *
	 */
	private IParser getOutboundEndpointTypeName_Parser() {
		if (outboundEndpointTypeName_Parser == null) {
			outboundEndpointTypeName_Parser = createOutboundEndpointTypeName_Parser();
		}
		return outboundEndpointTypeName_Parser;
	}

	/**
	 *
	 */
	protected IParser createOutboundEndpointTypeName_Parser() {
		EAttribute[] features = new EAttribute[] {
				CorePackage.eINSTANCE.getAbstractOutboundEndpointType_Name(),
				CorePackage.eINSTANCE.getOutboundEndpointType_Ref(),
				CorePackage.eINSTANCE.getOutboundEndpointType_ConnectorRef(),
				CorePackage.eINSTANCE.getOutboundEndpointType_Address(), };
		MessageFormatParser parser = new EndpointParser(features);
		return parser;
	}

	/**
	 *
	 */
	private IParser customExceptionStrategyTypeClass_Parser;

	/**
	 *
	 */
	private IParser getCustomExceptionStrategyTypeClass_Parser() {
		if (customExceptionStrategyTypeClass_Parser == null) {
			customExceptionStrategyTypeClass_Parser = createCustomExceptionStrategyTypeClass_Parser();
		}
		return customExceptionStrategyTypeClass_Parser;
	}

	/**
	 *
	 */
	protected IParser createCustomExceptionStrategyTypeClass_Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getCustomExceptionStrategyType_Class(), };
		MessageFormatParser parser = new ClassNameParser(features);
		return parser;
	}

	/**
	 *
	 */
	private IParser correlationAggregatorRouterTypeClass_Parser;

	/**
	 *
	 */
	private IParser getCustomCorrelationAggregatorRouterTypeClass_Parser() {
		if (correlationAggregatorRouterTypeClass_Parser == null) {
			correlationAggregatorRouterTypeClass_Parser = createCustomCorrelationAggregatorRouterTypeClass_Parser();
		}
		return correlationAggregatorRouterTypeClass_Parser;
	}

	/**
	 *
	 */
	protected IParser createCustomCorrelationAggregatorRouterTypeClass_Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getCustomCorrelationAggregatorRouterType_Class(), };
		MessageFormatParser parser = new ClassNameParser(features);
		return parser;
	}

	/**
	 *
	 */
	private IParser customInboundRouterTypeClass_Parser;

	/**
	 *
	 */
	private IParser getCustomInboundRouterTypeClass_Parser() {
		if (customInboundRouterTypeClass_Parser == null) {
			customInboundRouterTypeClass_Parser = createCustomInboundRouterTypeClass_Parser();
		}
		return customInboundRouterTypeClass_Parser;
	}

	/**
	 *
	 */
	protected IParser createCustomInboundRouterTypeClass_Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getCustomInboundRouterType_Class(), };
		MessageFormatParser parser = new ClassNameParser(features);
		return parser;
	}

	/**
	 *
	 */
	private IParser customAsyncReplyRouterTypeClass_Parser;

	/**
	 *
	 */
	private IParser getCustomAsyncReplyRouterTypeClass_Parser() {
		if (customAsyncReplyRouterTypeClass_Parser == null) {
			customAsyncReplyRouterTypeClass_Parser = createCustomAsyncReplyRouterTypeClass_Parser();
		}
		return customAsyncReplyRouterTypeClass_Parser;
	}

	/**
	 *
	 */
	protected IParser createCustomAsyncReplyRouterTypeClass_Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getCustomAsyncReplyRouterType_Class(), };
		MessageFormatParser parser = new ClassNameParser(features);
		return parser;
	}

	/**
	 *
	 */
	private IParser customOutboundRouterTypeClass_Parser;

	/**
	 *
	 */
	private IParser getCustomOutboundRouterTypeClass_Parser() {
		if (customOutboundRouterTypeClass_Parser == null) {
			customOutboundRouterTypeClass_Parser = createCustomOutboundRouterTypeClass_Parser();
		}
		return customOutboundRouterTypeClass_Parser;
	}

	/**
	 *
	 */
	protected IParser createCustomOutboundRouterTypeClass_Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getCustomOutboundRouterType_Class(), };
		MessageFormatParser parser = new ClassNameParser(features);
		return parser;
	}

	/**
	 * customization
	 *   - add custom parsers
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SedaServiceTypeNameEditPart.VISUAL_ID:
			return getSedaServiceTypeName_Parser();
		case PojoComponentTypeClassEditPart.VISUAL_ID:
			return getPojoComponentTypeClass_Parser();
		case InboundEndpointServiceItemEndpointNameEditPart.VISUAL_ID:
			return getInboundEndpointTypeName_Parser();
		case AsyncReplyInboundEndpointServiceItemEndpointNameEditPart.VISUAL_ID:
			return getInboundEndpointTypeName_Parser();
		case OutboundEndpointTypeNameEditPart.VISUAL_ID:
			return getOutboundEndpointTypeName_Parser();
		case OutboundRouterOutboundEndpointTypeNameEditPart.VISUAL_ID:
			return getOutboundEndpointTypeName_Parser();
		case CustomExceptionStrategyTypeClassEditPart.VISUAL_ID:
			return getCustomExceptionStrategyTypeClass_Parser();
		case CustomCorrelationAggregatorRouterTypeClassEditPart.VISUAL_ID:
			return getCustomCorrelationAggregatorRouterTypeClass_Parser();
		case CustomInboundRouterTypeClassEditPart.VISUAL_ID:
			return getCustomInboundRouterTypeClass_Parser();
		case CustomAsyncReplyRouterTypeClassEditPart.VISUAL_ID:
			return getCustomAsyncReplyRouterTypeClass_Parser();
		case CustomOutboundRouterTypeClassEditPart.VISUAL_ID:
			return getCustomOutboundRouterTypeClass_Parser();

		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(CoreVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(CoreVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (CoreElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
