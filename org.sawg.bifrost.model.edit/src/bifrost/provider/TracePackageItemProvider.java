/**
 */
package bifrost.provider;


import bifrost.Bifrost_Factory;
import bifrost.Bifrost_Package;
import bifrost.TracePackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link bifrost.TracePackage} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TracePackageItemProvider extends NamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracePackageItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(Bifrost_Package.Literals.TRACE_PACKAGE__TRACE_ELEMENT);
			childrenFeatures.add(Bifrost_Package.Literals.TRACE_PACKAGE__TRACE_PACKAGE);
			childrenFeatures.add(Bifrost_Package.Literals.TRACE_PACKAGE__INTERFACES);
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
	 * This returns TracePackage.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/TracePackage"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((TracePackage)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_TracePackage_type") :
			getString("_UI_TracePackage_type") + " " + label;
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

		switch (notification.getFeatureID(TracePackage.class)) {
			case Bifrost_Package.TRACE_PACKAGE__TRACE_ELEMENT:
			case Bifrost_Package.TRACE_PACKAGE__TRACE_PACKAGE:
			case Bifrost_Package.TRACE_PACKAGE__INTERFACES:
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
				(Bifrost_Package.Literals.TRACE_PACKAGE__TRACE_ELEMENT,
				 Bifrost_Factory.eINSTANCE.createTrace()));

		newChildDescriptors.add
			(createChildParameter
				(Bifrost_Package.Literals.TRACE_PACKAGE__TRACE_ELEMENT,
				 Bifrost_Factory.eINSTANCE.createExternalReference()));

		newChildDescriptors.add
			(createChildParameter
				(Bifrost_Package.Literals.TRACE_PACKAGE__TRACE_PACKAGE,
				 Bifrost_Factory.eINSTANCE.createTracePackage()));

		newChildDescriptors.add
			(createChildParameter
				(Bifrost_Package.Literals.TRACE_PACKAGE__TRACE_PACKAGE,
				 Bifrost_Factory.eINSTANCE.createTracePackageInterface()));

		newChildDescriptors.add
			(createChildParameter
				(Bifrost_Package.Literals.TRACE_PACKAGE__INTERFACES,
				 Bifrost_Factory.eINSTANCE.createTracePackageInterface()));
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
			childFeature == Bifrost_Package.Literals.TRACE_PACKAGE__TRACE_PACKAGE ||
			childFeature == Bifrost_Package.Literals.TRACE_PACKAGE__INTERFACES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
