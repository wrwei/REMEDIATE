/**
 */
package base.provider;


import base.Base_Factory;
import base.Base_Package;
import base.ExternalReference;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link base.ExternalReference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalReferenceItemProvider extends UtilityElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReferenceItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Base_Package.Literals.EXTERNAL_REFERENCE__LOCATION);
			childrenFeatures.add(Base_Package.Literals.EXTERNAL_REFERENCE__TYPE);
			childrenFeatures.add(Base_Package.Literals.EXTERNAL_REFERENCE__METADATA);
			childrenFeatures.add(Base_Package.Literals.EXTERNAL_REFERENCE__VERSION);
			childrenFeatures.add(Base_Package.Literals.EXTERNAL_REFERENCE__IMPLEMENTATION_CONSTRAINT);
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
	 * This returns ExternalReference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ExternalReference"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ExternalReference)object).getGid();
		return label == null || label.length() == 0 ?
			getString("_UI_ExternalReference_type") :
			getString("_UI_ExternalReference_type") + " " + label;
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

		switch (notification.getFeatureID(ExternalReference.class)) {
			case Base_Package.EXTERNAL_REFERENCE__LOCATION:
			case Base_Package.EXTERNAL_REFERENCE__TYPE:
			case Base_Package.EXTERNAL_REFERENCE__METADATA:
			case Base_Package.EXTERNAL_REFERENCE__VERSION:
			case Base_Package.EXTERNAL_REFERENCE__IMPLEMENTATION_CONSTRAINT:
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
				(Base_Package.Literals.EXTERNAL_REFERENCE__LOCATION,
				 Base_Factory.eINSTANCE.createLangString()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXTERNAL_REFERENCE__TYPE,
				 Base_Factory.eINSTANCE.createLangString()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXTERNAL_REFERENCE__METADATA,
				 Base_Factory.eINSTANCE.createLangString()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXTERNAL_REFERENCE__VERSION,
				 Base_Factory.eINSTANCE.createLangString()));

		newChildDescriptors.add
			(createChildParameter
				(Base_Package.Literals.EXTERNAL_REFERENCE__IMPLEMENTATION_CONSTRAINT,
				 Base_Factory.eINSTANCE.createImplementationConstraint()));
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
			childFeature == Base_Package.Literals.MODEL_ELEMENT__NAME ||
			childFeature == Base_Package.Literals.EXTERNAL_REFERENCE__LOCATION ||
			childFeature == Base_Package.Literals.EXTERNAL_REFERENCE__TYPE ||
			childFeature == Base_Package.Literals.EXTERNAL_REFERENCE__METADATA ||
			childFeature == Base_Package.Literals.EXTERNAL_REFERENCE__VERSION ||
			childFeature == Base_Package.Literals.MODEL_ELEMENT__CONSTRAINT ||
			childFeature == Base_Package.Literals.EXTERNAL_REFERENCE__IMPLEMENTATION_CONSTRAINT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
