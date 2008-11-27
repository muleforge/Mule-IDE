package org.mule.ide.config.editor.services.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.commands.BridgeComponentTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.DefaultComponentTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.EchoComponentTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.JavaComponentTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.LogComponentTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.NullComponentTypeCreateCommand;
import org.mule.ide.config.editor.services.edit.commands.PooledJavaComponentTypeCreateCommand;
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
		if (CoreElementTypes.DefaultJavaComponentType_2001 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractComponent());
			}
			return getGEFWrapper(new JavaComponentTypeCreateCommand(req));
		}
		if (CoreElementTypes.DefaultComponentType_2002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractComponent());
			}
			return getGEFWrapper(new DefaultComponentTypeCreateCommand(req));
		}
		if (CoreElementTypes.DefaultComponentType_2003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractComponent());
			}
			return getGEFWrapper(new BridgeComponentTypeCreateCommand(req));
		}
		if (CoreElementTypes.DefaultComponentType_2004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractComponent());
			}
			return getGEFWrapper(new EchoComponentTypeCreateCommand(req));
		}
		if (CoreElementTypes.DefaultComponentType_2005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractComponent());
			}
			return getGEFWrapper(new LogComponentTypeCreateCommand(req));
		}
		if (CoreElementTypes.DefaultComponentType_2006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractComponent());
			}
			return getGEFWrapper(new NullComponentTypeCreateCommand(req));
		}
		if (CoreElementTypes.PooledJavaComponentType_2007 == req
				.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(CorePackage.eINSTANCE
						.getBaseServiceType_AbstractComponent());
			}
			return getGEFWrapper(new PooledJavaComponentTypeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
