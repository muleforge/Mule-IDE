/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.common.impl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.wst.sse.core.StructuredModelManager;
import org.eclipse.wst.sse.core.internal.provisional.IModelManager;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMModel;
import org.mule.ide.config.common.SyncResource;
import org.w3c.dom.Document;

/**
 * <!-- begin-user-doc -->
 * A resource type which relies on using a SSE XML model to save and load it's XML data.
 * <!-- end-user-doc -->
 * 
 * @generated NOT
 */
public class SyncResourceImpl extends XMLResourceImpl implements SyncResource {
	
	private Document sseDocument;
	private IModelManager modelManager;
	private IDOMModel xmlModel;

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
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
			IDOMModel model = initializeXMLModel(file, false);
			super.load(model.getDocument(), options);
		} else {
			throw new FileNotFoundException(file.toString());
		}
	}
	
	@Override
	public void save(Map<?, ?> options) throws IOException {
		super.save(options);
		
//		try {
//			getXMLModel().save();
//		} catch (CoreException e) {
//			throw new IOException("Unable to save SSE model", e);
//		}
	}
	
	private IDOMModel initializeXMLModel(IFile file, boolean forWrite) throws UnsupportedEncodingException, IOException {
		if (file == null || !file.exists())
			throw new FileNotFoundException((file == null) ? "null" : file.getFullPath().toOSString()); //$NON-NLS-1$
		try {
			IModelManager manager = getModelManager();
			String id = manager.calculateId(file);

			if (forWrite) {
				IDOMModel mod = (IDOMModel)manager.getExistingModelForEdit(id);
				if (mod == null)
					setXMLModel((IDOMModel) manager.getModelForEdit(file));
				else {
					setXMLModel(mod);
				}
			}
			else {
				IDOMModel mod = (IDOMModel)manager.getExistingModelForRead(id);
				if (mod == null)
					setXMLModel((IDOMModel) manager.getModelForRead(file));
				else {
					setXMLModel(mod);
				}
			}
		}
		catch (CoreException e) {
			// TODO - report this! Logger.logException(e);
			return null;
		}
		String id = getXMLModel().getId();
		// syncReferenceCounts(id, forWrite);

		return xmlModel;
	}

	
	@Override
	protected XMLLoad createXMLLoad() {
		return new SyncXMLLoadImpl(createXMLHelper());
	}
	
	@Override
	protected XMLSave createXMLSave() {
		return new SyncXMLSaveImpl(createXMLHelper());
	}
	
	@Override
	protected XMLHelper createXMLHelper() {
		return new SyncXMLHelperImpl(this);

	}
	
	public Document getDocument() {
		return sseDocument;
	}
	
	public void doUnload() {
		super.doUnload();
		// TODO: Release from IModelManager
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
	}

}
