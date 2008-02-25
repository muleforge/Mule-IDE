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
import org.mule.ide.config.vm.editor.services.edit.parts.InboundEndpointServiceItemEndpointNameEditPart;
import org.mule.ide.config.vm.editor.services.edit.parts.SedaServiceTypeNameEditPart;
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
	private IParser sedaServiceTypeName_4003Parser;

	/**
	 * @generated
	 */
	private IParser getSedaServiceTypeName_4003Parser() {
		if (sedaServiceTypeName_4003Parser == null) {
			sedaServiceTypeName_4003Parser = createSedaServiceTypeName_4003Parser();
		}
		return sedaServiceTypeName_4003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSedaServiceTypeName_4003Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getAbstractServiceType_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser inboundEndpointTypeNameRefConnectorRefAddress_4002Parser;

	/**
	 * @generated
	 */
	private IParser getInboundEndpointTypeNameRefConnectorRefAddress_4002Parser() {
		if (inboundEndpointTypeNameRefConnectorRefAddress_4002Parser == null) {
			inboundEndpointTypeNameRefConnectorRefAddress_4002Parser = createInboundEndpointTypeNameRefConnectorRefAddress_4002Parser();
		}
		return inboundEndpointTypeNameRefConnectorRefAddress_4002Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createInboundEndpointTypeNameRefConnectorRefAddress_4002Parser() {
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
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SedaServiceTypeNameEditPart.VISUAL_ID:
			return getSedaServiceTypeName_4003Parser();
		case InboundEndpointServiceItemEndpointNameEditPart.VISUAL_ID:
			return getInboundEndpointTypeNameRefConnectorRefAddress_4002Parser();
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
