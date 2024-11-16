/**
 */
package requirement.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import requirement.FunctionalRequirement;
import requirement.Requirement_Package;

/**
 * This is the item provider adapter for a {@link requirement.FunctionalRequirement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FunctionalRequirementItemProvider extends SystemRequirementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalRequirementItemProvider(AdapterFactory adapterFactory) {
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

			addFunctionPropertyDescriptor(object);
			addInputsPropertyDescriptor(object);
			addOutputsPropertyDescriptor(object);
			addSourcePropertyDescriptor(object);
			addDestinationPropertyDescriptor(object);
			addActionPropertyDescriptor(object);
			addRequiresPropertyDescriptor(object);
			addPre_conditionPropertyDescriptor(object);
			addPost_conditionPropertyDescriptor(object);
			addSide_effectsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Function feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFunctionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionalRequirement_function_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionalRequirement_function_feature", "_UI_FunctionalRequirement_type"),
				 Requirement_Package.Literals.FUNCTIONAL_REQUIREMENT__FUNCTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inputs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionalRequirement_inputs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionalRequirement_inputs_feature", "_UI_FunctionalRequirement_type"),
				 Requirement_Package.Literals.FUNCTIONAL_REQUIREMENT__INPUTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outputs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionalRequirement_outputs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionalRequirement_outputs_feature", "_UI_FunctionalRequirement_type"),
				 Requirement_Package.Literals.FUNCTIONAL_REQUIREMENT__OUTPUTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionalRequirement_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionalRequirement_source_feature", "_UI_FunctionalRequirement_type"),
				 Requirement_Package.Literals.FUNCTIONAL_REQUIREMENT__SOURCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Destination feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDestinationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionalRequirement_destination_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionalRequirement_destination_feature", "_UI_FunctionalRequirement_type"),
				 Requirement_Package.Literals.FUNCTIONAL_REQUIREMENT__DESTINATION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Action feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionalRequirement_action_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionalRequirement_action_feature", "_UI_FunctionalRequirement_type"),
				 Requirement_Package.Literals.FUNCTIONAL_REQUIREMENT__ACTION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Requires feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiresPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionalRequirement_requires_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionalRequirement_requires_feature", "_UI_FunctionalRequirement_type"),
				 Requirement_Package.Literals.FUNCTIONAL_REQUIREMENT__REQUIRES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pre condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPre_conditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionalRequirement_pre_condition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionalRequirement_pre_condition_feature", "_UI_FunctionalRequirement_type"),
				 Requirement_Package.Literals.FUNCTIONAL_REQUIREMENT__PRE_CONDITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Post condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPost_conditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionalRequirement_post_condition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionalRequirement_post_condition_feature", "_UI_FunctionalRequirement_type"),
				 Requirement_Package.Literals.FUNCTIONAL_REQUIREMENT__POST_CONDITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Side effects feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSide_effectsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FunctionalRequirement_side_effects_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FunctionalRequirement_side_effects_feature", "_UI_FunctionalRequirement_type"),
				 Requirement_Package.Literals.FUNCTIONAL_REQUIREMENT__SIDE_EFFECTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns FunctionalRequirement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FunctionalRequirement"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FunctionalRequirement)object).getGid();
		return label == null || label.length() == 0 ?
			getString("_UI_FunctionalRequirement_type") :
			getString("_UI_FunctionalRequirement_type") + " " + label;
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

		switch (notification.getFeatureID(FunctionalRequirement.class)) {
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__FUNCTION:
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__INPUTS:
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__OUTPUTS:
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__SOURCE:
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__DESTINATION:
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__ACTION:
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__REQUIRES:
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__PRE_CONDITION:
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__POST_CONDITION:
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__SIDE_EFFECTS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
