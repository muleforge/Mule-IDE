package org.mule.ide.config.vm.editor.services.providers;

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
import org.mule.ide.config.editor.services.parsers.EndpointParser;
import org.mule.ide.config.vm.editor.services.edit.parts.InboundEndpointServiceItemEndpointNameEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.OutboundEndpointTypeNameEditPart;
import org.mule.ide.config.vm.editor.services.parsers.MessageFormatParser;
import org.mule.ide.config.vm.editor.services.part.VMVisualIDRegistry;

/**
 * @generated
 */
public class VMParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser sedaServiceTypeName_4004Parser;

	/**
	 * @generated
	 */
	private IParser getSedaServiceTypeName_4004Parser() {
		if (sedaServiceTypeName_4004Parser == null) {
			sedaServiceTypeName_4004Parser = createSedaServiceTypeName_4004Parser();
		}
		return sedaServiceTypeName_4004Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSedaServiceTypeName_4004Parser() {
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
		IParser parser = new EndpointParser(features);
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
		IParser parser = new EndpointParser(features);
		return parser;
	}

	/**
	 * customization
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case InboundEndpointServiceItemEndpointNameEditPart.VISUAL_ID:
			return getInboundEndpointTypeName_Parser();
		case OutboundEndpointTypeNameEditPart.VISUAL_ID:
			return getOutboundEndpointTypeName_Parser();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(VMVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(VMVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (VMElementTypes.getElement(hint) == null) {
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
