package org.mule.ide.config.editor.services.parsers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.mule.ide.config.core.NoArgsCallDelegateClassType;
import org.mule.ide.config.core.NoArgsCallDelegateInstanceType;
import org.mule.ide.config.core.NoArgsCallComponentType;

public class NoArgsComponentParser extends ClassNameParser {
	
	private EClass eClass;

	public NoArgsComponentParser(EClass eClass) {
		super(new EAttribute[] { });
		this.eClass = eClass;
	}

	public String getPrintString(IAdaptable adapter, int flags) {
		NoArgsCallComponentType element = (NoArgsCallComponentType) adapter.getAdapter(NoArgsCallComponentType.class);
		NoArgsCallDelegateClassType delegateClass = element.getDelegateClass();
		if (delegateClass != null) {
			return parseName(delegateClass.getClass_());
		} else {
			NoArgsCallDelegateInstanceType delegateInstance = element.getDelegateInstance();
			if (delegateInstance != null) {
				return parseName(delegateInstance.getRef());
			}
		}
		return parseName(null);
	}
}
