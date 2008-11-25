/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.common.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.concurrent.Executor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.wst.sse.core.StructuredModelManager;
import org.eclipse.wst.sse.core.internal.provisional.IModelManager;
import org.eclipse.wst.sse.core.internal.provisional.INodeNotifier;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMModel;
import org.mule.ide.config.common.SyncAdapter;
import org.mule.ide.config.common.SyncResource;
import org.mule.ide.config.common.SyncXMLHelper;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

/**
 * <!-- begin-user-doc --> A resource type which relies on using a SSE XML model
 * to save and load it's XML data. <!-- end-user-doc -->
 * 
 * @generated NOT
 */
public class SyncResourceImpl extends XMLResourceImpl implements SyncResource {

	private Document sseDocument;
	private IDOMModel xmlModel;
	private IModelManager modelManager;
	private boolean deliver = false;

	private SyncXMLLoadImpl xmlLoad;
	private SyncXMLSaveImpl xmlSave;
	private SyncXMLHelperImpl xmlHelper;
	
    private final static Executor defaultExecutor = new Executor() {
	    // DirectExecutor using caller thread
	    public void execute(Runnable r) {
		r.run();
	    }
	}; 

	protected Executor executor = defaultExecutor;

	/**
	 * Creates an instance of the resource. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param uri
	 *            the URI of the new resource.
	 * @generated
	 */
	public SyncResourceImpl(URI uri) {
		super(uri);
	}

	@Override
	public void load(Map<?, ?> options) throws IOException {

		String localPath = getURI().toPlatformString(true);
		IPath path = Path.fromPortableString(localPath);
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		if (file.exists()) {
			setUpdateEnabled(false);
			IDOMModel model = initializeXMLModel(file, false);
			super.load(model.getDocument(), options);
			enableUpdates();
		} else {
			throw new FileNotFoundException(file.toString());
		}
	}

	private void enableUpdates() {
		deliver = true;
	}

	@Override
	public void save(Map<?, ?> options) throws IOException {
		
		if (options != null && options.containsKey(SAVE_OPTION_SUPRESS_TEXT_SAVE)) {		
			super.save(options);
		} else {
			try {
				getXMLModel().save();
			} catch (CoreException e) {
				IOException iox = new IOException("Unable to save SSE model");
				iox.initCause(e);
				throw iox;
			}
		}
	}

	private IDOMModel initializeXMLModel(IFile file, boolean forWrite)
			throws UnsupportedEncodingException, IOException {
		if (file == null || !file.exists())
			throw new FileNotFoundException(
					(file == null) ? "null" : file.getFullPath().toOSString()); //$NON-NLS-1$
		try {
			IModelManager manager = getModelManager();
			String id = manager.calculateId(file);

			if (forWrite) {
				IDOMModel mod = (IDOMModel) manager.getExistingModelForEdit(id);
				if (mod == null)
					setXMLModel((IDOMModel) manager.getModelForEdit(file));
				else {
					setXMLModel(mod);
				}
			} else {
				IDOMModel mod = (IDOMModel) manager.getExistingModelForRead(id);
				if (mod == null)
					setXMLModel((IDOMModel) manager.getModelForRead(file));
				else {
					setXMLModel(mod);
				}
			}
		} catch (CoreException e) {
			// TODO - report this! Logger.logException(e);
			return null;
		}
		String id = getXMLModel().getId();
		// syncReferenceCounts(id, forWrite);

		return xmlModel;
	}

	@Override
	protected XMLLoad createXMLLoad() {
		if (xmlLoad == null) xmlLoad = new SyncXMLLoadImpl(createXMLHelper());
		return xmlLoad;
	}

	@Override
	protected XMLSave createXMLSave() {
		XMLHelper xmlHelper = createXMLHelper();
		if (xmlSave == null) {
			xmlSave = new SyncXMLSaveImpl(xmlHelper);
		} else {
			((SyncXMLSaveImpl)xmlSave).setHelper((SyncXMLHelper)xmlHelper);
		}
		return xmlSave;
	}

	@Override
	protected XMLHelper createXMLHelper() {
		if (xmlHelper == null) xmlHelper = new SyncXMLHelperImpl(this);
		return xmlHelper;
	}

	public Document getDocument() {
		return sseDocument;
	}

	public void doUnload() {
		super.doUnload();
		this.xmlModel.releaseFromEdit();
		xmlHelper = null;
		xmlSave = null;
		xmlLoad = null;
	};

	protected IModelManager getModelManager() {
		if (modelManager == null)
			modelManager = StructuredModelManager.getModelManager();
		return modelManager;
	}

	protected IDOMModel getXMLModel() {
		return xmlModel;
	}

	protected void setXMLModel(IDOMModel model) {
		xmlModel = model;
		sseDocument = model.getDocument();
	}

	public boolean isUpdateEnabled() {
		return this.deliver;
	}

	public void notify(Notification msg, EObject object, Node node, SyncAdapter adapter) {

		try {
			getXMLModel().disableUndoManagement();
			switch (msg.getEventType()) {
			case Notification.ADD:
				addedToList(msg, object, node, adapter);
				break;
			case Notification.REMOVE:
				removedFromList(msg, object, node, adapter);
				break;
			case Notification.ADD_MANY:
				addedToList(msg, object, node, adapter);
				break;
			case Notification.REMOVE_MANY:
				removedFromList(msg, object, node, adapter);
				break;
			case Notification.SET:
				setOrReplaceSingle(msg, object, node, adapter);
				break;
			case Notification.UNSET:
				notifyUnsetSingle(msg, object, node, adapter);
				break;
			}
		} finally {
			getXMLModel().enableUndoManagement();
		}
	}

	public void xmlNotify(final Node notifier, int eventType, final Object changedFeature, Object oldValue, final Object newValue, int pos, final SyncAdapter adapter) {
		    
		if (eventType == INodeNotifier.CHANGE && changedFeature instanceof Attr) {
			final String attrName = ((Attr)changedFeature).getName();
			executor.execute(new Runnable() {
				
				@SuppressWarnings("unchecked")
				public void run() {

					SyncSAXXMLHandler handler = new SyncSAXXMLHandler(SyncResourceImpl.this, createXMLHelper(), getDefaultLoadOptions());
					// Update just the attribute that changed.
					
					ExtendedMetaData extendedMetaData = 
			            resourceSet == null ?
			              ExtendedMetaData.INSTANCE :
			              new BasicExtendedMetaData(resourceSet.getPackageRegistry());
					
					if (attrName.startsWith(XML_NS) && extendedMetaData != null) {
						EObject root = getContents().isEmpty() ? null : getContents().get(0);

						// Special fix for XML Namespace prefix map (marked transient, but specifically serialized)
						EReference xmlnsPrefixMapFeature = (root != null) ? extendedMetaData.getXMLNSPrefixMapFeature(root.eClass()) : null;
						if (xmlnsPrefixMapFeature != null)
						{
							String prefix = attrName.equals(XML_NS) ? "" : attrName.substring(XML_NS.length() + 1);

							EMap<String, String> nsMap = (EMap<String, String>)root.eGet(xmlnsPrefixMapFeature);
							
							// System.out.println("Attribute change " + attrName);
							if (newValue != null) {
								nsMap.put(prefix, newValue.toString());
							}
							else
							{
								nsMap.remove(prefix);
							}
							return;
						}

					} else if (adapter.getTarget() != null) {
						
						// System.out.println("Attribute change " + attrName);
						if (newValue != null) {
							handler.updateAttribute((EObject)adapter.getTarget(), ((Attr)changedFeature).getName(), newValue.toString());
						}
						else
						{
							handler.removeAttribute((EObject)adapter.getTarget(), ((Attr)changedFeature).getName());
						}
					}
				}
			}
			);
		} else {
//		} else if (eventType != INodeNotifier.STRUCTURE_CHANGED){
			// Attempt a full reparse...
			if (adapter.getTarget() != null) executor.execute(new Runnable() {
				public void run() {

					XMLLoad loader = createXMLLoad();
					((SyncXMLLoadImpl)loader).reload(adapter.getNode(), (EObject)adapter.getTarget(), (SyncXMLHelperImpl)createXMLHelper());
				}
			});
		}
	}

	protected void notifyUnsetSingle(Notification msg, EObject object, Node node, SyncAdapter adapter) {
		getXMLSave(node).notifyUnSetSingle(msg, object, node, adapter);
	}

	protected void setOrReplaceSingle(Notification msg, EObject object,
			Node node, SyncAdapter adapter) {
		getXMLSave(node).notifySetOrReplaceSingle(msg, object, node, adapter);
	}

	protected void removedFromList(Notification msg, EObject object,
			Node node, SyncAdapter adapter) {
		getXMLSave(node).notifyRemovedFromList(msg, object, node, adapter);
	}

	protected void addedToList(Notification msg, EObject object, Node node, SyncAdapter adapter) {
		getXMLSave(node).notifyAddedToList(msg, object, node, adapter);
	}

	private SyncXMLSaveImpl cachedSave = null;

	protected SyncXMLSaveImpl getXMLSave(Node n) {
		if (cachedSave == null) {
			cachedSave = (SyncXMLSaveImpl) createXMLSave();
		}
		cachedSave.setContext(SyncResourceImpl.this, n);
		return cachedSave;
	}

	public void setUpdateEnabled(boolean enabled) {
		this.deliver = enabled;		
	}
	
	public void setModelUpdateExecutor(Executor executor) {
		this.executor = executor;
	}
	
	@Override
	public void doLoad(Node node, Map<?, ?> options) throws IOException {
		super.doLoad(node, options);
	}
	
	@Override
	public void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		super.doSave(outputStream, options);
	}
	
	@Override
	public EObject getEObject(String uriFragment) {
		return super.getEObject(uriFragment != null ? uriFragment : "");
	}
}
