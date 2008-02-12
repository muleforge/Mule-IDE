package org.mule.ide.config.editor.services.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

public class EndpointParser extends MessageFormatParser {
	
	public EndpointParser(EAttribute[] features) {
		super(features);
	}
	
	public String getPrintString(IAdaptable adapter, int flags) {
		EObject element = (EObject) adapter.getAdapter(EObject.class);
		Object[] values = getValues(element);
		// Display the first non-empty value
		for (Object value : values) {
			if (value instanceof String && ((String) value).length() > 0) {
				return (String) value;
			}
		}
		return "<endpoint>";
	}
}
