package org.mule.ide.config.editor.services.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
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
import org.mule.ide.config.editor.services.edit.parts.ConnectionEndpointEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomAsyncReplyRouterTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomCorrelationAggregatorRouterTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomInboundRouterTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.CustomOutboundRouterTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.InboundEndpointServiceItemEndpointNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.JavaComponentTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundEndpointTypeNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundRouterOutboundEndpointTypeNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.PooledJavaComponentTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.PooledJavaComponentTypeEditPart;
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
	private IParser sedaServiceTypeName_4047Parser;

	/**
	 * @generated
	 */
	private IParser getSedaServiceTypeName_4047Parser() {
		if (sedaServiceTypeName_4047Parser == null) {
			sedaServiceTypeName_4047Parser = createSedaServiceTypeName_4047Parser();
		}
		return sedaServiceTypeName_4047Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSedaServiceTypeName_4047Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getAbstractServiceType_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * 
	 */
	private IParser defaultJavaComponentTypeClass_Parser;

	/**
	 * 
	 */
	private IParser getDefaultJavaComponentTypeClass_Parser() {
		if (defaultJavaComponentTypeClass_Parser == null) {
			defaultJavaComponentTypeClass_Parser = createDefaultJavaComponentTypeClass_Parser();
		}
		return defaultJavaComponentTypeClass_Parser;
	}

	/**
	 * 
	 */
	protected IParser createDefaultJavaComponentTypeClass_Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getDefaultJavaComponentType_Class(), };
		MessageFormatParser parser = new ClassNameParser(features);
		return parser;
	}

	/**
	 * 
	 */
	private IParser pooledJavaComponentTypeClass_Parser;

	/**
	 * 
	 */
	private IParser getPooledJavaComponentTypeClass_Parser() {
		if (pooledJavaComponentTypeClass_Parser == null) {
			pooledJavaComponentTypeClass_Parser = createPooledJavaComponentTypeClass_Parser();
		}
		return pooledJavaComponentTypeClass_Parser;
	}

	/**
	 * 
	 */
	protected IParser createPooledJavaComponentTypeClass_Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getDefaultJavaComponentType_Class(), };
		MessageFormatParser parser = new ClassNameParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser outboundEndpointTypeNameRefConnectorRefAddress_4010Parser;

	/**
	 * @generated
	 */
	private IParser getOutboundEndpointTypeNameRefConnectorRefAddress_4010Parser() {
		if (outboundEndpointTypeNameRefConnectorRefAddress_4010Parser == null) {
			outboundEndpointTypeNameRefConnectorRefAddress_4010Parser = createOutboundEndpointTypeNameRefConnectorRefAddress_4010Parser();
		}
		return outboundEndpointTypeNameRefConnectorRefAddress_4010Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOutboundEndpointTypeNameRefConnectorRefAddress_4010Parser() {
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
	private IParser customExceptionStrategyTypeClass_4014Parser;

	/**
	 * @generated
	 */
	private IParser getCustomExceptionStrategyTypeClass_4014Parser() {
		if (customExceptionStrategyTypeClass_4014Parser == null) {
			customExceptionStrategyTypeClass_4014Parser = createCustomExceptionStrategyTypeClass_4014Parser();
		}
		return customExceptionStrategyTypeClass_4014Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCustomExceptionStrategyTypeClass_4014Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getCustomExceptionStrategyType_Class(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser inboundEndpointTypeNameRefConnectorRefAddress_4016Parser;

	/**
	 * @generated
	 */
	private IParser getInboundEndpointTypeNameRefConnectorRefAddress_4016Parser() {
		if (inboundEndpointTypeNameRefConnectorRefAddress_4016Parser == null) {
			inboundEndpointTypeNameRefConnectorRefAddress_4016Parser = createInboundEndpointTypeNameRefConnectorRefAddress_4016Parser();
		}
		return inboundEndpointTypeNameRefConnectorRefAddress_4016Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInboundEndpointTypeNameRefConnectorRefAddress_4016Parser() {
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
	private IParser customCorrelationAggregatorRouterTypeClass_4026Parser;

	/**
	 * @generated
	 */
	private IParser getCustomCorrelationAggregatorRouterTypeClass_4026Parser() {
		if (customCorrelationAggregatorRouterTypeClass_4026Parser == null) {
			customCorrelationAggregatorRouterTypeClass_4026Parser = createCustomCorrelationAggregatorRouterTypeClass_4026Parser();
		}
		return customCorrelationAggregatorRouterTypeClass_4026Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCustomCorrelationAggregatorRouterTypeClass_4026Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getCustomCorrelationAggregatorRouterType_Class(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser customInboundRouterTypeClass_4028Parser;

	/**
	 * @generated
	 */
	private IParser getCustomInboundRouterTypeClass_4028Parser() {
		if (customInboundRouterTypeClass_4028Parser == null) {
			customInboundRouterTypeClass_4028Parser = createCustomInboundRouterTypeClass_4028Parser();
		}
		return customInboundRouterTypeClass_4028Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCustomInboundRouterTypeClass_4028Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getCustomInboundRouterType_Class(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser inboundEndpointTypeNameRefConnectorRefAddress_4030Parser;

	/**
	 * @generated
	 */
	private IParser getInboundEndpointTypeNameRefConnectorRefAddress_4030Parser() {
		if (inboundEndpointTypeNameRefConnectorRefAddress_4030Parser == null) {
			inboundEndpointTypeNameRefConnectorRefAddress_4030Parser = createInboundEndpointTypeNameRefConnectorRefAddress_4030Parser();
		}
		return inboundEndpointTypeNameRefConnectorRefAddress_4030Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInboundEndpointTypeNameRefConnectorRefAddress_4030Parser() {
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
	private IParser customAsyncReplyRouterTypeClass_4033Parser;

	/**
	 * @generated
	 */
	private IParser getCustomAsyncReplyRouterTypeClass_4033Parser() {
		if (customAsyncReplyRouterTypeClass_4033Parser == null) {
			customAsyncReplyRouterTypeClass_4033Parser = createCustomAsyncReplyRouterTypeClass_4033Parser();
		}
		return customAsyncReplyRouterTypeClass_4033Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCustomAsyncReplyRouterTypeClass_4033Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getCustomAsyncReplyRouterType_Class(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser outboundEndpointTypeNameRefConnectorRefAddress_4034Parser;

	/**
	 * @generated
	 */
	private IParser getOutboundEndpointTypeNameRefConnectorRefAddress_4034Parser() {
		if (outboundEndpointTypeNameRefConnectorRefAddress_4034Parser == null) {
			outboundEndpointTypeNameRefConnectorRefAddress_4034Parser = createOutboundEndpointTypeNameRefConnectorRefAddress_4034Parser();
		}
		return outboundEndpointTypeNameRefConnectorRefAddress_4034Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOutboundEndpointTypeNameRefConnectorRefAddress_4034Parser() {
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
	private IParser customOutboundRouterTypeClass_4046Parser;

	/**
	 * @generated
	 */
	private IParser getCustomOutboundRouterTypeClass_4046Parser() {
		if (customOutboundRouterTypeClass_4046Parser == null) {
			customOutboundRouterTypeClass_4046Parser = createCustomOutboundRouterTypeClass_4046Parser();
		}
		return customOutboundRouterTypeClass_4046Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createCustomOutboundRouterTypeClass_4046Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getCustomOutboundRouterType_Class(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser connectionEndpoint_4048Parser;

	/**
	 * @generated
	 */
	private IParser getConnectionEndpoint_4048Parser() {
		if (connectionEndpoint_4048Parser == null) {
			connectionEndpoint_4048Parser = createConnectionEndpoint_4048Parser();
		}
		return connectionEndpoint_4048Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createConnectionEndpoint_4048Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getConnection_Endpoint(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 *
	 */
	private IParser connectionEndpoint_Parser;

	/**
	 *
	 */
	private IParser getConnectionEndpoint_Parser() {
		if (connectionEndpoint_Parser == null) {
			connectionEndpoint_Parser = createConnectionEndpoint_Parser();
		}
		return connectionEndpoint_Parser;
	}

	/**
	 *
	 */
	protected IParser createConnectionEndpoint_Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getConnection_Endpoint(), };
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
		case JavaComponentTypeClassEditPart.VISUAL_ID:
			return getDefaultJavaComponentTypeClass_Parser();
		case PooledJavaComponentTypeClassEditPart.VISUAL_ID:
			return getPooledJavaComponentTypeClass_Parser();
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
		case ConnectionEndpointEditPart.VISUAL_ID:
			return getConnectionEndpoint_Parser();
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
