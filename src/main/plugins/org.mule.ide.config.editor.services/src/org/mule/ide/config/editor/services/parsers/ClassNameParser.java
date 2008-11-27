package org.mule.ide.config.editor.services.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

public class ClassNameParser extends MessageFormatParser {

	public ClassNameParser(EAttribute[] features) {
		super(features);
	}

	public String getPrintString(IAdaptable adapter, int flags) {
		EObject element = (EObject) adapter.getAdapter(EObject.class);
		Object[] values = getValues(element);
		if (values.length == 0) return ""; //$NON-NLS-1$
		return (parseName((String) values[0]));
		//String classname = (String) values[0];
		//String[] parts = classname.split("\\.");
		//if (parts.length == 0) return ""; //$NON-NLS-1$
		//return parts[parts.length-1];
	}
	
	protected String parseName(String classname) {
		if (classname == null || classname.length() == 0) {
			return "<class>";
		}
		String[] parts = classname.split("\\.");
		return parts[parts.length-1];
	}
	
}
