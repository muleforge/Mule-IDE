package org.mule.ide.config.editor.services.part;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteSeparator;
import org.eclipse.gmf.runtime.diagram.ui.services.palette.IPaletteProvider;
import org.eclipse.gmf.runtime.diagram.ui.services.palette.PaletteService;
import org.mule.ide.config.core.CorePackage;
import org.mule.ide.config.core.DocumentRoot;
import org.mule.ide.config.editor.services.providers.IServicesPaletteProvider;

public class ServicesPaletteManager {

	private static final String MULE_URI_PREFIX = "http://www.mulesource.org/schema/";
	
	private boolean stale;
	private PaletteRoot paletteRoot;
	private DocumentRoot documentRoot;
	private Map<String, IServicesPaletteProvider> paletteProviders;
	// Map URI to a List length NUM_PROVIDER_GROUPS of List of PaletteEntries
	private Map<String, List<List<PaletteEntry>>> paletteEntryCache;
		
	public ServicesPaletteManager(DocumentRoot documentRoot) {
		this.documentRoot = documentRoot;
		this.paletteProviders = new HashMap<String, IServicesPaletteProvider>();
		this.paletteEntryCache = new HashMap<String, List<List<PaletteEntry>>>();
		documentRoot.eAdapters().add(new AdapterImpl () {
		    public void notifyChanged(Notification n) {
				Object feature = n.getFeature();
				if (feature != null && feature == CorePackage.eINSTANCE.getDocumentRoot_XMLNSPrefixMap()) {
					stale = true;
				}		    	
		    }
		});
	}
	
	public void setPaletteRoot(PaletteRoot paletteRoot) {
		this.paletteRoot = paletteRoot;
		this.stale = true;
	}
	
	public void registerPaletteProvider(IServicesPaletteProvider provider) {
		paletteProviders.put(provider.getNSURI(), provider);
	}
	
	public void updatePalette() {
		if (! stale ) return;
		if (documentRoot == null || paletteRoot == null) return;
		
		PaletteContainer group = null;
		Iterator itr = paletteRoot.getChildren().iterator();
		while (itr.hasNext()) {
			PaletteContainer next = (PaletteContainer) itr.next();
			if ("org.mule.ide.config.editor.services.Services".equals(next.getId())) {
				group = next;
				break;
			}
		}
		if (group == null) return; // or assert?
		
		List<String> uris = getURIs();
		for (int groupIndex=0; groupIndex<IServicesPaletteProvider.NUM_GROUPS; groupIndex++) {
			List<PaletteEntry> newChildren = new ArrayList<PaletteEntry>();
			
			addChildren(uris, groupIndex, newChildren);
			
			if (groupIndex == 3 || groupIndex == 6) {
				newChildren.add(new PaletteSeparator());
				groupIndex++;
				addChildren(uris, groupIndex, newChildren);
			}
			
			group.setChildren(newChildren);
			
			if (itr.hasNext()) {
				group = (PaletteContainer) itr.next();
			}
		}
		stale = false;
	}
	
	private void addChildren(List<String> uris, int groupIndex, List<PaletteEntry> result) {
		for (String uri : uris) {
			List<PaletteEntry> uriChildren = getChildren(uri, groupIndex);
			result.addAll(uriChildren);
		}
	}
	
	private List<PaletteEntry> getChildren(String uri, int groupIndex) {
		List<List<PaletteEntry>> uriCache = paletteEntryCache.get(uri);
		if (uriCache == null) {
			uriCache = indexPaletteEntries(uri);
		}
		return uriCache.get(groupIndex);
	}
	
	private List<List<PaletteEntry>> indexPaletteEntries(String uri) {
		IServicesPaletteProvider provider = paletteProviders.get(uri);
		PaletteRoot tempRoot = new PaletteRoot();
		provider.getPaletteContributions(tempRoot);
		ArrayList<List<PaletteEntry>> result = new ArrayList<List<PaletteEntry>>(IServicesPaletteProvider.NUM_GROUPS);
		List<PaletteContainer> groups = (List<PaletteContainer>) tempRoot.getChildren();
		assert(groups.size() == IServicesPaletteProvider.NUM_GROUPS);
		for(PaletteContainer group : groups) {
			result.add((List<PaletteEntry>) group.getChildren());
		}
		paletteEntryCache.put(uri, result);
		return result;
	}
	
	private List<String> getURIs() {
		TreeMap<String, String> temp = new TreeMap<String, String>();
		EMap<String,String> prefixMap = documentRoot.getXMLNSPrefixMap();
		for (Map.Entry<String, String> entry : prefixMap) {
			String uri = entry.getValue();
			if (! uri.equals(CorePackage.eNS_URI) && uri.startsWith(MULE_URI_PREFIX)) {
				if (paletteProviders.get(uri) != null) {
					temp.put(entry.getValue(), uri);
				}
			}
		}
		ArrayList<String> result = new ArrayList<String>(temp.size()+1);
		result.add(CorePackage.eNS_URI);
		result.addAll(temp.values());
		return result;
	}
	
}
