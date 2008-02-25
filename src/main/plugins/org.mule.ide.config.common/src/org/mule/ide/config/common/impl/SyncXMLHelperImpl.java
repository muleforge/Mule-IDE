/**
 * 
 */
package org.mule.ide.config.common.impl;

import java.util.StringTokenizer;

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
import org.mule.ide.config.common.SyncAdapter;
import org.mule.ide.config.common.SyncXMLHelper;
import org.w3c.dom.Element;

final class SyncXMLHelperImpl extends XMLHelperImpl implements SyncXMLHelper {
	private Element currentElement;

	SyncXMLHelperImpl(XMLResource resource) {
		super(resource);
	}

	public void setCurrentElement(Element e) {
		this.currentElement = e;
	}

	public void setValue(EObject object, EStructuralFeature feature,
			Object value, int position) {
		if (extendedMetaData != null) {
			EStructuralFeature targetFeature = extendedMetaData.getAffiliation(
					object.eClass(), feature);
			if (targetFeature != null && targetFeature != feature) {
				EStructuralFeature group = extendedMetaData
						.getGroup(targetFeature);
				if (group != null) {
					targetFeature = group;
					while (true) {
						EStructuralFeature realGroup = extendedMetaData
						.getGroup(group);
						if (realGroup == group || realGroup == null) break;
						targetFeature = group = realGroup;
					}
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
					featureMap.add(feature, value);
					SyncAdapter sa = (SyncAdapter) EcoreUtil
							.getExistingAdapter(object, SyncAdapter.class);
					if (sa != null) {
						if (sa.getFeatureElement(targetFeature) == null && ! targetFeature.isTransient())
							sa.setFeatureElement(targetFeature, currentElement);
					}
					return;
				} else {
					feature = targetFeature;
				}
			}
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
						list.addUnique(createFromString(eFactory, eDataType,
								token));
					}

					// Make sure that the list will appear to be set to be
					// empty.
					//
					if (list.isEmpty()) {
						list.clear();
					}
				} else if (value == null) {
					list.addUnique(null);
				} else {
					list.addUnique(createFromString(eFactory, eDataType,
							(String) value));
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
					list.addUnique(value);
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

	public void resetPrefixContext() {
		// TODO Auto-generated method stub
		
	}

	public void setPrefixContext(Element element) {
		// TODO Auto-generated method stub
		
	}

}