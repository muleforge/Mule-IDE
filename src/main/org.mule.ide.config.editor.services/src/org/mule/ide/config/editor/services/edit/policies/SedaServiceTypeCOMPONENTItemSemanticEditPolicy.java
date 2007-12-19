package org.mule.ide.config.editor.services.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.commands.BridgeComponentTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.DefaultComponentTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.DefaultConnectorExceptionStrategyTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.EchoComponentTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.LogComponentTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.NoArgsCallWrapperTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.NullComponentTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.PassThroughComponentTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.PojoComponentTypeCreateCommand;
import org.mule.ide.config.editor.services.providers.CoreElementTypes;

/**
 * @generated
 */
public class SedaServiceTypeCOMPONENTItemSemanticEditPolicy extends
		CoreBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (CoreElementTypes.PojoComponentType_2005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractComponent());
			}
			return getGEFWrapper(new PojoComponentTypeCreateCommand(req));
		}
		if (CoreElementTypes.NoArgsCallWrapperType_2006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractComponent());
			}
			return getGEFWrapper(new NoArgsCallWrapperTypeCreateCommand(req));
		}
		if (CoreElementTypes.DefaultComponentType_2007 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractComponent());
			}
			return getGEFWrapper(new DefaultComponentTypeCreateCommand(req));
		}
		if (CoreElementTypes.DefaultComponentType_2008 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractComponent());
			}
			return getGEFWrapper(new BridgeComponentTypeCreateCommand(req));
		}
		if (CoreElementTypes.DefaultComponentType_2009 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractComponent());
			}
			return getGEFWrapper(new EchoComponentTypeCreateCommand(req));
		}
		if (CoreElementTypes.DefaultComponentType_2010 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractComponent());
			}
			return getGEFWrapper(new LogComponentTypeCreateCommand(req));
		}
		if (CoreElementTypes.DefaultComponentType_2011 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractComponent());
			}
			return getGEFWrapper(new NullComponentTypeCreateCommand(req));
		}
		if (CoreElementTypes.DefaultComponentType_2012 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractComponent());
			}
			return getGEFWrapper(new PassThroughComponentTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
