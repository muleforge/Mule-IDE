/**
 * 
 */
package org.mule.ide.config.common.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;
import org.eclipse.wst.sse.core.internal.provisional.INodeNotifier;
import org.mule.ide.config.common.SyncAdapter;
import org.mule.ide.config.common.SyncXMLHelper;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

final class SyncXMLHelperImpl extends XMLHelperImpl implements SyncXMLHelper {
	private static final boolean DEBUG = false;
	
	private Element currentElement;
	private boolean reloading;

	protected class ReloaderContext {
		protected boolean didReuseObject = false;
		protected EStructuralFeature currentFeature = null;
		protected int currentIndex = 0;
		protected Set<EStructuralFeature> affectedFeatures = new HashSet<EStructuralFeature>();
		protected EObject contextObject = null;
		
		public ReloaderContext(EObject theObject) {
			contextObject = theObject;
		}
		
		/**
		 * This is called whenever we are about to change a feature. If we
		 * have been working with a different feature within this object,
		 * we could need to clear out the remaining data from it (if it is
		 * is a "many" feature).
		 * 
		 * @param newFeature The new feature to work with.
		 */
		public void setActiveFeature(EStructuralFeature newFeature) {
			if (currentFeature == newFeature) return;
			
			if (currentFeature != null) {
				flushFeature();
			}
			currentFeature = newFeature;
			
			affectedFeatures.add(newFeature);
			currentIndex = 0;
		}

		private void flushFeature() {
			if (currentFeature == null) return;
			if  ( ! currentFeature.isMany() || currentFeature.isTransient()) {
				currentFeature = null;
				return; // Done early!
			}
			
			// Get the collection and remove all the unused 
			EList<Object> collection = (EList<Object>)contextObject.eGet(currentFeature);

			// EMF lists are nice!
			List<Object> subList = collection.subList(currentIndex, collection.size());
			if (subList.size() > 0) {
				if (DEBUG) System.out.println("Removing " + subList.size() + " values from collection that are no longer used");
				subList.clear();
			}
			currentFeature = null;
		}

		public int getNextIndex() {
			int nextIndex = currentIndex++;
			if (DEBUG) System.out.println("next index for " + currentFeature.getName() + " = " + nextIndex);
			return nextIndex;
		}

		public void flushObject() {
			flushFeature();
			EList<EStructuralFeature> allFeatures = contextObject.eClass().getEAllStructuralFeatures();
			for (EStructuralFeature f : allFeatures) {
				if (f.isTransient()) continue;
//				if (f.getName().equals("mixed")) continue;
				if (affectedFeatures.contains(f)) {
					if (DEBUG) System.out.println("Feature " + f.getName() + " was reloaded (keeping)");
				} else {
					if (f.isMany()) {
						EList<?> coll = (EList<?>)contextObject.eGet(f);
						if (! coll.isEmpty()) {
							if (DEBUG) System.out.println("Feature " + f.getName() + "[] unset");
							coll.clear();
						}
					} else {
						if (contextObject.eIsSet(f)) {
							contextObject.eUnset(f);
							if (DEBUG) System.out.println("Feature " + f.getName() + " unset");
						}
					}
				}
			}
		}
		
		@Override
		public String toString() {
			return "Context[" + contextObject.getClass().getName() + "]";
		}
	}
	
	protected Map<EObject, ReloaderContext> contextMap;
	
	public SyncXMLHelperImpl(XMLResource resource) {
		super(resource);
	}

	public void setCurrentElement(Element e) {
		this.currentElement = e;
	}

	public void setValue(EObject object, EStructuralFeature feature,
			Object value, int position) {
		if (reloading) {
			if (DEBUG) System.out.println("Setting feature " + feature.getName() + "[" + position + "]");
		}
		EStructuralFeature targetFeature = feature;
		
		if (extendedMetaData != null) {
			targetFeature = extendedMetaData.getAffiliation(
					object.eClass(), feature);

			if (targetFeature != null) {
				EStructuralFeature group = extendedMetaData
						.getGroup(targetFeature);
				if (group != null) {
					targetFeature = group;
				}
				
				if (targetFeature.getEType() == EcorePackage.eINSTANCE
						.getEFeatureMapEntry()) {
					FeatureMap featureMap = (FeatureMap) object
							.eGet(targetFeature);
					EClassifier eClassifier = feature.getEType();
					if (eClassifier instanceof EDataType) {
						EDataType eDataType = (EDataType) eClassifier;
						EFactory eFactory = eDataType.getEPackage()
								.getEFactoryInstance();
						value = createFromString(eFactory, eDataType,
								(String) value);
					}
					
					SyncAdapter sa = (SyncAdapter) EcoreUtil
					    .getExistingAdapter(object, SyncAdapter.class);
					if (reloading) {
						int nextIndex = findContext(object, targetFeature).getNextIndex();
						int oldIndex = -1;
						
						for (int i = nextIndex ; i < featureMap.size(); ++i) {
							if (featureMap.getEStructuralFeature(i) == feature && featureMap.getValue(i) == value) oldIndex = i;
						}
						if (oldIndex >= 0 && (oldIndex != nextIndex)) {
							featureMap.move(oldIndex, nextIndex);
						} else {
							featureMap.add(nextIndex, feature, value);
						}
					} else {
						featureMap.add(feature, value);
						if (sa != null && sa.getFeatureElement(targetFeature) == null && ! targetFeature.isTransient())
								sa.setFeatureElement(targetFeature, currentElement);
					}
					return;
				}
			}
		}
		if (targetFeature == null) targetFeature = feature;

		if (reloading) {
			setCurrentFeature(object, targetFeature);
		}
		
		int kind = getFeatureKind(feature);
		switch (kind) {
		case DATATYPE_SINGLE:
		case DATATYPE_IS_MANY: {
			EClassifier eClassifier = feature.getEType();
			EDataType eDataType = (EDataType) eClassifier;
			EFactory eFactory = eDataType.getEPackage().getEFactoryInstance();

			if (kind == DATATYPE_IS_MANY) {
				@SuppressWarnings("unchecked")
				InternalEList<Object> list = (InternalEList<Object>) object
						.eGet(feature);

				if (position == -2) {
					for (StringTokenizer stringTokenizer = new StringTokenizer(
							(String) value, " "); stringTokenizer
							.hasMoreTokens();) {
						String token = stringTokenizer.nextToken();
						Object createFromString = createFromString(eFactory, eDataType,
								token);
						insertGently(value, object, targetFeature, list);
					}

					// Make sure that the list will appear to be set to be
					// empty.
					//
					if (list.isEmpty()) {
						list.clear();
					}
				} else {
					if (value != null) value = createFromString(eFactory, eDataType,
							(String) value);
					insertGently(value, object, targetFeature, list);
				}
			} else if (value == null) {
				object.eSet(feature, null);
			} else {
				object.eSet(feature, createFromString(eFactory, eDataType,
						(String) value));
			}
			break;
		}
		case IS_MANY_ADD:
		case IS_MANY_MOVE: {
			@SuppressWarnings("unchecked")
			InternalEList<Object> list = (InternalEList<Object>) object
					.eGet(feature);

			if (position == -1) {
				if (object == value) {
					list.add(value);
				} else {
					insertGently(value, object, feature, list);
				}
			} else if (position == -2) {
				list.clear();
			} else if (checkForDuplicates || object == value) {
				int index = list.indexOf(value);
				if (index == -1) {
					list.addUnique(position, value);
				} else {
					list.move(position, index);
				}
			} else if (kind == IS_MANY_ADD) {
				list.addUnique(position, value);
			} else {
				list.move(position, value);
			}
			break;
		}
		default: {
			object.eSet(feature, value);
			break;
		}
		}
	}

	private void setCurrentFeature(EObject object,
			EStructuralFeature targetFeature) {
		findContext(object, targetFeature);		
	}

	private ReloaderContext findContext(EObject object,
			EStructuralFeature targetFeature) {
		ReloaderContext ctx = contextMap.get(object);
		if (ctx == null) {
			ctx = new ReloaderContext(object);
			contextMap.put(object, ctx);
		}
		ctx.setActiveFeature(targetFeature);
		return ctx;
	}

	/**
	 * @param value
	 * @param list
	 */
	private void insertGently(Object value, EObject owner, EStructuralFeature feature, InternalEList<Object> list) {
		if (reloading) {
			boolean shouldAdd = true;
			int nextIdx = findContext(owner, feature).getNextIndex();					
			
			if (list.get(nextIdx) == value) {
				// Whoo-hoo, already there. This should be a common case
				shouldAdd = false;
			} else {
				int oldIdx = list.indexOf(value);
				if (oldIdx >= 0) {
					// It is sitting somewhere later in the collection, typically something was removed.
					list.move(nextIdx, oldIdx);
					shouldAdd = false;
				}
			}
			if (shouldAdd) list.add(nextIdx, value);
		} else {
			list.addUnique(value);
		}
	}

//	private void setCurrentFeature(EObject object, EStructuralFeature feature) {
//		int depth = -1, i=0;
//		ReloaderContext theContext = null;
//		for (ReloaderContext ctx : contextStack) {
//			if (ctx.contextObject == object) {
//				depth = contextStack.size() - i;
//				theContext = ctx;
//			}
//			++i;
//		}
//
//		if (theContext != null) {
//			while (depth > 2) {
//				ReloaderContext context = contextStack.pop();
//				context.flushObject();
//				if (DEBUG) System.out.println("<<<< " + context.toString() + " DONE");
//				depth--;
//			}
//		} else {
//			theContext = new ReloaderContext(object);
//			contextStack.push(theContext);
//			if (DEBUG) System.out.println(">>>> " + theContext.toString());
//		}
//		theContext.setActiveFeature(feature);
//	}
	
	
	public void initReload(Node node, EObject target) {
		this.currentElement = node.getNodeType() == Node.ELEMENT_NODE ? (Element)node : null;
		reloading = true;
		contextMap= new HashMap<EObject, ReloaderContext>();

		pushContext();
	}
	
	public void reloadDone() {
		flushReloaderContext();
		reloading = false;
		this.currentElement = null;
	}

	@Override
	public EObject createObject(EFactory factory, EClassifier classifier) {
		if (currentElement instanceof INodeNotifier && currentElement.getNodeType() == Node.ELEMENT_NODE) {
			INodeNotifier nn = (INodeNotifier)currentElement;
			SyncAdapter sa = (SyncAdapter)nn.getAdapterFor(SyncAdapter.class);
			if (sa != null) {
				EObject target = (EObject)sa.getTarget();
				if (target != null && classifier.isInstance(target)) {
					if (DEBUG) System.out.println("Reused object " + (target != null ? target.eClass().getName() : "<null>"));
					return target;
				}
			}
		}
		EObject temp = super.createObject(factory, classifier);
		if (DEBUG) System.out.println("Created object " + (temp != null ? temp.eClass().getName() : "<null>"));

		return temp;
	}
	
	@Override
	public EObject createObject(EFactory factory, String classXMIName) {
		return createObject(factory, getType(factory, classXMIName));
	}
	
	public void flushReloaderContext() {
		if (contextMap == null) return;
		for (ReloaderContext ctx : contextMap.values()) {
			ctx.flushObject();
		}
	}
	
	/**
	 * This is called whenever we are about to change a feature. If we
	 * have been working with a different feature within this object,
	 * we could need to clear out the remaining data from it (if it is
	 * is a "many" feature).
	 * 
	 * @param newFeature The new feature to work with.
	 */
//	protected void setCurrentFeature(EStructuralFeature newFeature) {
//	    EObject peekObject = objects.peekEObject();
//
//		if (isReloading && currentFeature != null && currentFeature.isMany()) {
//			// Get the collection and remove all the unused 
//			EList<Object> collection = (EList<Object>)peekObject.eGet(currentFeature);
//
//			// EMF lists are nice!
//			collection.subList(currentIndex, collection.size()).clear();
//		}
//		currentFeature = newFeature;
//		if (currentFeature != null) { 
//			if (affectedFeatures == null) {
//				affectedFeatures = new HashSet<EStructuralFeature>();
//			}
//			affectedFeatures.add(newFeature);
//		}
//		currentIndex = 0;
//	}
//	
//	protected void pushReloaderContext() {
//		if (! isReloading) return;
//	
//		ReloaderFrame newFrame = new ReloaderFrame();
//		newFrame.currentObject = objects.peekEObject();
//		newFrame.currentFeature = currentFeature;
//		newFrame.currentIndex = currentIndex;
//		newFrame.affectedFeatures = affectedFeatures;
//		frames.push(newFrame);
//
//		currentFeature = null;
//		currentIndex = 0;
//		affectedFeatures = null;
//	}
//
//	protected void popReloaderContext() {
//		if (! isReloading) return;
//
//		setCurrentFeature(null);
//		currentFeature = null;
//		currentIndex = 0;
//		
//		EObject peekObject = objects.peekEObject();
//		if (peekObject != null) {
//			EClass thisClass = peekObject.eClass();
//			EList<EStructuralFeature> features = thisClass.getEAllStructuralFeatures();
//			
//			// unset all which are not in affectedFeatures...
//		}
//
//		ReloaderFrame oldFrame = frames.pop();
//		currentFeature = oldFrame.currentFeature;
//		currentIndex = oldFrame.currentIndex;
//		affectedFeatures = oldFrame.affectedFeatures;
//	}
	
}