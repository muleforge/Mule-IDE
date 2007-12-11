package org.mule.ide.config.editor.services.parsers;

import java.text.FieldPosition;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.NoArgsCallDelegateClassType;
import org.mule.ide.config.core.NoArgsCallDelegateInstanceType;
import org.mule.ide.config.core.NoArgsCallWrapperType;

public class NoArgsComponentParser extends MessageFormatParser {
	
	private EClass eClass;

	public NoArgsComponentParser(EClass eClass) {
		super(new EAttribute[] { });
		this.eClass = eClass;
	}

	public String getPrintString(IAdaptable adapter, int flags) {
		NoArgsCallWrapperType element = (NoArgsCallWrapperType) adapter.getAdapter(NoArgsCallWrapperType.class);
		NoArgsCallDelegateClassType delegateClass = element.getDelegateClass();
		if (delegateClass != null) {
			return parseName(delegateClass.getDelegateClass());
		} else {
			NoArgsCallDelegateInstanceType delegateInstance = element.getDelegateInstance();
			if (delegateInstance != null) {
				return parseName(delegateInstance.getDelegateInstanceRef());
			}
		}
		return parseName(null);
	}
	
	private String parseName(String classname) {
		if (classname == null || classname.length() == 0) {
			return "<undefined>";
		}
		String[] parts = classname.split("\\.");
		return parts[parts.length-1];
	}
}
