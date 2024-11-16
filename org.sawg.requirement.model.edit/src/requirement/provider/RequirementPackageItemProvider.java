/**
 */
package requirement.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import requirement.RequirementPackage;
import requirement.Requirement_Factory;
import requirement.Requirement_Package;

/**
 * This is the item provider adapter for a {@link requirement.RequirementPackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RequirementPackageItemProvider extends RequirementAssetItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementPackageItemProvider(AdapterFactory adapterFactory) {
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

			addInterfacesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Interfaces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInterfacesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RequirementPackage_interfaces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RequirementPackage_interfaces_feature", "_UI_RequirementPackage_type"),
				 Requirement_Package.Literals.REQUIREMENT_PACKAGE__INTERFACES,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(Requirement_Package.Literals.REQUIREMENT_PACKAGE__REQUIREMENT_ASSET);
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
	 * This returns RequirementPackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RequirementPackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((RequirementPackage)object).getGid();
		return label == null || label.length() == 0 ?
			getString("_UI_RequirementPackage_type") :
			getString("_UI_RequirementPackage_type") + " " + label;
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

		switch (notification.getFeatureID(RequirementPackage.class)) {
			case Requirement_Package.REQUIREMENT_PACKAGE__REQUIREMENT_ASSET:
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
				(Requirement_Package.Literals.REQUIREMENT_PACKAGE__REQUIREMENT_ASSET,
				 Requirement_Factory.eINSTANCE.createRequirementPackage()));

		newChildDescriptors.add
			(createChildParameter
				(Requirement_Package.Literals.REQUIREMENT_PACKAGE__REQUIREMENT_ASSET,
				 Requirement_Factory.eINSTANCE.createRequirementPackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Requirement_Package.Literals.REQUIREMENT_PACKAGE__REQUIREMENT_ASSET,
				 Requirement_Factory.eINSTANCE.createCategory()));

		newChildDescriptors.add
			(createChildParameter
				(Requirement_Package.Literals.REQUIREMENT_PACKAGE__REQUIREMENT_ASSET,
				 Requirement_Factory.eINSTANCE.createStakeholder()));

		newChildDescriptors.add
			(createChildParameter
				(Requirement_Package.Literals.REQUIREMENT_PACKAGE__REQUIREMENT_ASSET,
				 Requirement_Factory.eINSTANCE.createGlossary()));

		newChildDescriptors.add
			(createChildParameter
				(Requirement_Package.Literals.REQUIREMENT_PACKAGE__REQUIREMENT_ASSET,
				 Requirement_Factory.eINSTANCE.createGlossaryEntry()));

		newChildDescriptors.add
			(createChildParameter
				(Requirement_Package.Literals.REQUIREMENT_PACKAGE__REQUIREMENT_ASSET,
				 Requirement_Factory.eINSTANCE.createUserRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(Requirement_Package.Literals.REQUIREMENT_PACKAGE__REQUIREMENT_ASSET,
				 Requirement_Factory.eINSTANCE.createFunctionalRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(Requirement_Package.Literals.REQUIREMENT_PACKAGE__REQUIREMENT_ASSET,
				 Requirement_Factory.eINSTANCE.createNonFunctionalRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(Requirement_Package.Literals.REQUIREMENT_PACKAGE__REQUIREMENT_ASSET,
				 Requirement_Factory.eINSTANCE.createSecondaryRequirementType()));
	}

}
