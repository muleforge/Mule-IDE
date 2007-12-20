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
import org.mule.ide.config.editor.services.edit.parts.CustomExceptionStrategyTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.NoArgsCallWrapperTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.OutboundEndpointTypeNameEditPart;
import org.mule.ide.config.editor.services.edit.parts.PojoComponentTypeClassEditPart;
import org.mule.ide.config.editor.services.edit.parts.SedaServiceTypeNameEditPart;
import org.mule.ide.config.editor.services.parsers.ClassNameParser;
import org.mule.ide.config.editor.services.parsers.MessageFormatParser;
import org.mule.ide.config.editor.services.parsers.NoArgsComponentParser;
import org.mule.ide.config.editor.services.part.CoreVisualIDRegistry;

/**
 * @generated
 */
public class CoreParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser sedaServiceTypeName_4017Parser;

	/**
	 * @generated
	 */
	private IParser getSedaServiceTypeName_4017Parser() {
		if (sedaServiceTypeName_4017Parser == null) {
			sedaServiceTypeName_4017Parser = createSedaServiceTypeName_4017Parser();
		}
		return sedaServiceTypeName_4017Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createSedaServiceTypeName_4017Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getAbstractServiceType_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser pojoComponentTypeClass_4003Parser;

	/**
	 * @generated
	 */
	private IParser getPojoComponentTypeClass_4003Parser() {
		if (pojoComponentTypeClass_4003Parser == null) {
			pojoComponentTypeClass_4003Parser = createPojoComponentTypeClass_4003Parser();
		}
		return pojoComponentTypeClass_4003Parser;
	}

	/**
	 * customization
	 *   - use ClassNameParser
	 */
	protected IParser createPojoComponentTypeClass_4003Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getPojoComponentType_Class(), };
		MessageFormatParser parser = new ClassNameParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser outboundEndpointTypeName_4012Parser;

	/**
	 * @generated
	 */
	private IParser getOutboundEndpointTypeName_4012Parser() {
		if (outboundEndpointTypeName_4012Parser == null) {
			outboundEndpointTypeName_4012Parser = createOutboundEndpointTypeName_4012Parser();
		}
		return outboundEndpointTypeName_4012Parser;
	}

	/**
	 * @generated
	 */
	protected IParser createOutboundEndpointTypeName_4012Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getAbstractOutboundEndpointType_Name(), };
		MessageFormatParser parser = new MessageFormatParser(features);
		return parser;
	}

	/**
	 * @generated
	 */
	private IParser customExceptionStrategyTypeClass_4016Parser;

	/**
	 * @generated
	 */
	private IParser getCustomExceptionStrategyTypeClass_4016Parser() {
		if (customExceptionStrategyTypeClass_4016Parser == null) {
			customExceptionStrategyTypeClass_4016Parser = createCustomExceptionStrategyTypeClass_4016Parser();
		}
		return customExceptionStrategyTypeClass_4016Parser;
	}

	/**
	 * customization
	 *   - use ClassNameParser
	 */
	protected IParser createCustomExceptionStrategyTypeClass_4016Parser() {
		EAttribute[] features = new EAttribute[] { CorePackage.eINSTANCE
				.getCustomExceptionStrategyType_Class(), };
		MessageFormatParser parser = new ClassNameParser(features);
		return parser;
	}

	/**
	 * 
	 */
	private IParser noArgsCallWrapperTypeClass_4005Parser;

	/**
	 * 
	 */
	private IParser getNoArgsCallWrapperTypeClass_4005Parser() {
		if (noArgsCallWrapperTypeClass_4005Parser == null) {
			noArgsCallWrapperTypeClass_4005Parser = createNoArgsCallWrapperTypeClass_4005Parser();
		}
		return noArgsCallWrapperTypeClass_4005Parser;
	}

	/**
	 * 
	 */
	protected IParser createNoArgsCallWrapperTypeClass_4005Parser() {
		EClass eClass = CorePackage.eINSTANCE.getNoArgsCallDelegateClassType();
		NoArgsComponentParser parser = new NoArgsComponentParser(eClass);
		return parser;
	}

	/**
	 * customization
	 *   - add custom parsers
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SedaServiceTypeNameEditPart.VISUAL_ID:
			return getSedaServiceTypeName_4017Parser();
		case PojoComponentTypeClassEditPart.VISUAL_ID:
			return getPojoComponentTypeClass_4003Parser();
		case NoArgsCallWrapperTypeClassEditPart.VISUAL_ID:
			return getNoArgsCallWrapperTypeClass_4005Parser();
		case OutboundEndpointTypeNameEditPart.VISUAL_ID:
			return getOutboundEndpointTypeName_4012Parser();
		case CustomExceptionStrategyTypeClassEditPart.VISUAL_ID:
			return getCustomExceptionStrategyTypeClass_4016Parser();
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
