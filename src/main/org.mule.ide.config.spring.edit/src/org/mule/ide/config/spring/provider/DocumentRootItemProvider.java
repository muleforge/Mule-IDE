/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.spring.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mule.ide.config.spring.DocumentRoot;
import org.mule.ide.config.spring.SpringFactory;
import org.mule.ide.config.spring.SpringPackage;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.spring.DocumentRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class DocumentRootItemProvider
	extends ItemProviderAdapter
	implements	
		IEditingDomainItemProvider,	
		IStructuredItemContentProvider,	
		ITreeItemContentProvider,	
		IItemLabelProvider,	
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRootItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__ALIAS);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__ARG_TYPE);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__BEAN);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__BEANS);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__CONSTRUCTOR_ARG);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__DESCRIPTION);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__ENTRY);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__IDREF);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__IMPORT);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__KEY);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__LIST);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__LOOKUP_METHOD);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__MAP);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__META);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__NULL);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__PROP);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__PROPERTY);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__PROPS);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__REF);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__REPLACED_METHOD);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__SET);
			childrenFeatures.add(SpringPackage.Literals.DOCUMENT_ROOT__VALUE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns DocumentRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/DocumentRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_DocumentRoot_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(DocumentRoot.class)) {
			case SpringPackage.DOCUMENT_ROOT__ALIAS:
			case SpringPackage.DOCUMENT_ROOT__ARG_TYPE:
			case SpringPackage.DOCUMENT_ROOT__BEAN:
			case SpringPackage.DOCUMENT_ROOT__BEANS:
			case SpringPackage.DOCUMENT_ROOT__CONSTRUCTOR_ARG:
			case SpringPackage.DOCUMENT_ROOT__DESCRIPTION:
			case SpringPackage.DOCUMENT_ROOT__ENTRY:
			case SpringPackage.DOCUMENT_ROOT__IDREF:
			case SpringPackage.DOCUMENT_ROOT__IMPORT:
			case SpringPackage.DOCUMENT_ROOT__KEY:
			case SpringPackage.DOCUMENT_ROOT__LIST:
			case SpringPackage.DOCUMENT_ROOT__LOOKUP_METHOD:
			case SpringPackage.DOCUMENT_ROOT__MAP:
			case SpringPackage.DOCUMENT_ROOT__META:
			case SpringPackage.DOCUMENT_ROOT__NULL:
			case SpringPackage.DOCUMENT_ROOT__PROP:
			case SpringPackage.DOCUMENT_ROOT__PROPERTY:
			case SpringPackage.DOCUMENT_ROOT__PROPS:
			case SpringPackage.DOCUMENT_ROOT__REF:
			case SpringPackage.DOCUMENT_ROOT__REPLACED_METHOD:
			case SpringPackage.DOCUMENT_ROOT__SET:
			case SpringPackage.DOCUMENT_ROOT__VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__ALIAS,
				 SpringFactory.eINSTANCE.createAliasType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__ARG_TYPE,
				 SpringFactory.eINSTANCE.createArgTypeType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__BEAN,
				 SpringFactory.eINSTANCE.createBeanType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__BEANS,
				 SpringFactory.eINSTANCE.createBeansType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__CONSTRUCTOR_ARG,
				 SpringFactory.eINSTANCE.createConstructorArgType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__DESCRIPTION,
				 SpringFactory.eINSTANCE.createDescriptionType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__ENTRY,
				 SpringFactory.eINSTANCE.createEntryType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__IDREF,
				 SpringFactory.eINSTANCE.createIdrefType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__IMPORT,
				 SpringFactory.eINSTANCE.createImportType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__KEY,
				 SpringFactory.eINSTANCE.createKeyType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__LIST,
				 SpringFactory.eINSTANCE.createListOrSetType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__LOOKUP_METHOD,
				 SpringFactory.eINSTANCE.createLookupMethodType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__MAP,
				 SpringFactory.eINSTANCE.createMapType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__META,
				 SpringFactory.eINSTANCE.createMetaType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__NULL,
				 SpringFactory.eINSTANCE.createNullType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__PROP,
				 SpringFactory.eINSTANCE.createPropType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__PROPERTY,
				 SpringFactory.eINSTANCE.createPropertyType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__PROPS,
				 SpringFactory.eINSTANCE.createPropsType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__REF,
				 SpringFactory.eINSTANCE.createRefType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__REPLACED_METHOD,
				 SpringFactory.eINSTANCE.createReplacedMethodType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__SET,
				 SpringFactory.eINSTANCE.createListOrSetType()));

		newChildDescriptors.add
			(createChildParameter
				(SpringPackage.Literals.DOCUMENT_ROOT__VALUE,
				 SpringFactory.eINSTANCE.createValueType()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__LIST ||
			childFeature == SpringPackage.Literals.DOCUMENT_ROOT__SET;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Springbeans2EditPlugin.INSTANCE;
	}

}
