package org.mule.ide.config.core.util;

import java.util.SortedMap;
import java.util.TreeMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.mule.ide.config.core.DocumentRoot;

/**
 * Adapter on the Core document root used to get the "mule" namespaces
 * currently defined for the document.
 */
public class MuleNamespacesAdapter extends AdapterImpl {
	
	public static final String MULE_URI_PREFIX = "http://www.mulesource.org/schema/";
	public static final String MULE_CORE_URI_PREFIX = "http://www.mulesource.org/schema/mule/core/";
	public static final String MULE_SPRING_BEANS_URI_PREFIX = "http://www.springframework.org/schema/beans";
	
	private DocumentRoot documentRoot;
	private EditingDomain editingDomain;
	private SortedMap<String, String> mapPrefixToURI;
	
	public MuleNamespacesAdapter(DocumentRoot documentRoot, EditingDomain editingDomain) {
		documentRoot.eAdapters().add(this);
        this.documentRoot = documentRoot;		
        this.editingDomain = editingDomain;		
	}
	
	public boolean isAdapterForType(Object type)
	{
		return (type == MuleNamespacesAdapter.class);
	}
	  
	public void initialize() {
    	documentRoot.eAdapters().add(this);
		mapPrefixToURI = new TreeMap<String, String>();
		EMap<String,String> prefixMap = documentRoot.getXMLNSPrefixMap();
		for (String prefix : prefixMap.keySet()) {
			String uri = prefixMap.get(prefix);
			// TODO Need extension point for defining "mule" namespaces.
			//      For now, just use URI prefixes.
			if (prefix == null || prefix.length() == 0) {
				if (uri.startsWith(MULE_URI_PREFIX)) {
					prefix = "core";
				} else if (uri.startsWith(MULE_SPRING_BEANS_URI_PREFIX)) {
					prefix = "spring";
				}
			}
			mapPrefixToURI.put(prefix, uri);
		}
	}

	public SortedMap<String, String> getNamespaceMap() {
		return mapPrefixToURI;
	}
	
    @Override
    public void notifyChanged(Notification n) {
    	
    }
}
