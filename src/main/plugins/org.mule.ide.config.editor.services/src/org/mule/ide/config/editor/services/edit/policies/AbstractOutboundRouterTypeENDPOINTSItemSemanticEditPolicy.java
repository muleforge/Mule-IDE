package org.mule.ide.config.editor.services.edit.policies;

import java.util.HashMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.editor.services.edit.commands.OutboundEndpointTypeCreateCommand;
import org.mule.ide.config.editor.services.providers.CoreElementTypes;

/**
 * Provides for default handling extensible containment types
 */
public abstract class AbstractOutboundRouterTypeENDPOINTSItemSemanticEditPolicy extends
		CoreBaseItemSemanticEditPolicy {

	@Override
	protected void initExtensibleChildTypes(HashMap<EClass,EReference> map) {
		map.put(CorePackage.eINSTANCE.getAbstractOutboundEndpointType(), 
				CorePackage.eINSTANCE.getOutboundRouterType_AbstractOutboundEndpoint());
	}

}
