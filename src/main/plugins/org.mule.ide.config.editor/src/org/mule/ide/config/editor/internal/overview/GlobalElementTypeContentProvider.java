package org.mule.ide.config.editor.internal.overview;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.DocumentRoot;
import org.mule.ide.config.core.IGlobalElementTypeProvider;
import org.mule.ide.config.editor.Activator;
import org.mule.ide.config.editor.internal.elements.DefaultContentProvider;

public abstract class GlobalElementTypeContentProvider extends
		DefaultContentProvider 
		implements IStructuredContentProvider {

	private DocumentRoot documentRoot;
	
	public GlobalElementTypeContentProvider(DocumentRoot docRoot) {
		this.documentRoot = docRoot;
	}
	
	public Object[] getElements(Object parent) {
		ArrayList<IGlobalElementTypeProvider.IGlobalElementType> result = 
			new ArrayList<IGlobalElementTypeProvider.IGlobalElementType>();
		EMap<String,String> prefixMap = documentRoot.getXMLNSPrefixMap();
		Map<String, EPackage> packageMap = Activator.getDefault().getMuleEcorePackageMap();
		for (Map.Entry<String,String> entry : prefixMap.entrySet()) {
			String prefix = entry.getKey();
			if (prefix == null || prefix.length() == 0) {
				if (CorePackage.eNS_URI.equals(entry.getValue())) {
					prefix = CorePackage.eNS_PREFIX;
				}
			}
			EPackage pack = packageMap.get(prefix);
			if (pack instanceof IGlobalElementTypeProvider) {
				result.addAll(getTypes((IGlobalElementTypeProvider) pack));
			}
		}
		return result.toArray();
	}
	
	protected abstract List<IGlobalElementTypeProvider.IGlobalElementType> getTypes(IGlobalElementTypeProvider provider);
}
