package org.mule.ide.config.editor.services.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;

public class EndpointParser extends MessageFormatParser {
	
	public EndpointParser(EAttribute[] features) {
		super(features);
	}
	
	public String getPrintString(IAdaptable adapter, int flags) {
		String result = super.getPrintString(adapter, flags);
		if (result.isEmpty()) {
			return "<endpoint>";
		}
		return result;
	}
}
