/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.mule.ide.config.tests.park.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.mule.ide.config.tests.park.ParkFactory;
import org.mule.ide.config.tests.park.ParkPackage;
import org.mule.ide.config.tests.park.VehicleType;

/**
 * This is the item provider adapter for a {@link org.mule.ide.config.tests.park.VehicleType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class VehicleTypeItemProvider
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
	public VehicleTypeItemProvider(AdapterFactory adapterFactory) {
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

			addMakePropertyDescriptor(object);
			addModelPropertyDescriptor(object);
			addPaintPropertyDescriptor(object);
			addLicensePlatePropertyDescriptor(object);
			addNicknamesPropertyDescriptor(object);
			addIdPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Make feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMakePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VehicleType_make_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VehicleType_make_feature", "_UI_VehicleType_type"),
				 ParkPackage.Literals.VEHICLE_TYPE__MAKE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Model feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addModelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VehicleType_model_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VehicleType_model_feature", "_UI_VehicleType_type"),
				 ParkPackage.Literals.VEHICLE_TYPE__MODEL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Paint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VehicleType_paint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VehicleType_paint_feature", "_UI_VehicleType_type"),
				 ParkPackage.Literals.VEHICLE_TYPE__PAINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the License Plate feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLicensePlatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VehicleType_licensePlate_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VehicleType_licensePlate_feature", "_UI_VehicleType_type"),
				 ParkPackage.Literals.VEHICLE_TYPE__LICENSE_PLATE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Nicknames feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNicknamesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VehicleType_nicknames_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VehicleType_nicknames_feature", "_UI_VehicleType_type"),
				 ParkPackage.Literals.VEHICLE_TYPE__NICKNAMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_VehicleType_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_VehicleType_id_feature", "_UI_VehicleType_type"),
				 ParkPackage.Literals.VEHICLE_TYPE__ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(ParkPackage.Literals.VEHICLE_TYPE__GROUP);
			childrenFeatures.add(ParkPackage.Literals.VEHICLE_TYPE__CURRENT_INSURANCE);
			childrenFeatures.add(ParkPackage.Literals.VEHICLE_TYPE__POLICY_HISTORY);
			childrenFeatures.add(ParkPackage.Literals.VEHICLE_TYPE__CURRENT_OWNER);
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
	 * This returns VehicleType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/VehicleType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((VehicleType)object).getId();
		return label == null || label.length() == 0 ?
			getString("_UI_VehicleType_type") :
			getString("_UI_VehicleType_type") + " " + label;
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

		switch (notification.getFeatureID(VehicleType.class)) {
			case ParkPackage.VEHICLE_TYPE__MAKE:
			case ParkPackage.VEHICLE_TYPE__MODEL:
			case ParkPackage.VEHICLE_TYPE__PAINT:
			case ParkPackage.VEHICLE_TYPE__LICENSE_PLATE:
			case ParkPackage.VEHICLE_TYPE__NICKNAMES:
			case ParkPackage.VEHICLE_TYPE__ID:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ParkPackage.VEHICLE_TYPE__GROUP:
			case ParkPackage.VEHICLE_TYPE__CURRENT_INSURANCE:
			case ParkPackage.VEHICLE_TYPE__POLICY_HISTORY:
			case ParkPackage.VEHICLE_TYPE__CURRENT_OWNER:
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
				(ParkPackage.Literals.VEHICLE_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(ParkPackage.Literals.VEHICLE_TYPE__DECAL,
					 ParkFactory.eINSTANCE.createDecalType())));

		newChildDescriptors.add
			(createChildParameter
				(ParkPackage.Literals.VEHICLE_TYPE__GROUP,
				 FeatureMapUtil.createEntry
					(ParkPackage.Literals.VEHICLE_TYPE__PAINT,
					 "")));

		newChildDescriptors.add
			(createChildParameter
				(ParkPackage.Literals.VEHICLE_TYPE__CURRENT_INSURANCE,
				 ParkFactory.eINSTANCE.createInsuranceType()));

		newChildDescriptors.add
			(createChildParameter
				(ParkPackage.Literals.VEHICLE_TYPE__POLICY_HISTORY,
				 ParkFactory.eINSTANCE.createInsuranceType()));

		newChildDescriptors.add
			(createChildParameter
				(ParkPackage.Literals.VEHICLE_TYPE__CURRENT_OWNER,
				 ParkFactory.eINSTANCE.createPersonType()));
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

		if (childFeature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)childFeature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)childObject;
			childFeature = entry.getEStructuralFeature();
			childObject = entry.getValue();
		}

		boolean qualify =
			childFeature == ParkPackage.Literals.VEHICLE_TYPE__CURRENT_INSURANCE ||
			childFeature == ParkPackage.Literals.VEHICLE_TYPE__POLICY_HISTORY;

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
		return VehicleParkEditPlugin.INSTANCE;
	}

}
