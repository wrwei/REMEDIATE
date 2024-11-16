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

import requirement.Requirement_Package;
import requirement.SecondaryRequirementType;

/**
 * This is the item provider adapter for a {@link requirement.SecondaryRequirementType} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SecondaryRequirementTypeItemProvider extends RequirementAssetItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondaryRequirementTypeItemProvider(AdapterFactory adapterFactory) {
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

			addArchitecturePropertyDescriptor(object);
			addUsabilityPropertyDescriptor(object);
			addPerformancePropertyDescriptor(object);
			addSpacePropertyDescriptor(object);
			addDependabilityPropertyDescriptor(object);
			addSecurityPropertyDescriptor(object);
			addEnvironmentalPropertyDescriptor(object);
			addOperationalPropertyDescriptor(object);
			addDevelopmentPropertyDescriptor(object);
			addRegulatoryPropertyDescriptor(object);
			addEthicalPropertyDescriptor(object);
			addSafetyPropertyDescriptor(object);
			addAccountingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Architecture feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addArchitecturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecondaryRequirementType_architecture_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecondaryRequirementType_architecture_feature", "_UI_SecondaryRequirementType_type"),
				 Requirement_Package.Literals.SECONDARY_REQUIREMENT_TYPE__ARCHITECTURE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Usability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecondaryRequirementType_usability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecondaryRequirementType_usability_feature", "_UI_SecondaryRequirementType_type"),
				 Requirement_Package.Literals.SECONDARY_REQUIREMENT_TYPE__USABILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Performance feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPerformancePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecondaryRequirementType_performance_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecondaryRequirementType_performance_feature", "_UI_SecondaryRequirementType_type"),
				 Requirement_Package.Literals.SECONDARY_REQUIREMENT_TYPE__PERFORMANCE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecondaryRequirementType_space_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecondaryRequirementType_space_feature", "_UI_SecondaryRequirementType_type"),
				 Requirement_Package.Literals.SECONDARY_REQUIREMENT_TYPE__SPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Dependability feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDependabilityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecondaryRequirementType_dependability_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecondaryRequirementType_dependability_feature", "_UI_SecondaryRequirementType_type"),
				 Requirement_Package.Literals.SECONDARY_REQUIREMENT_TYPE__DEPENDABILITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecondaryRequirementType_security_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecondaryRequirementType_security_feature", "_UI_SecondaryRequirementType_type"),
				 Requirement_Package.Literals.SECONDARY_REQUIREMENT_TYPE__SECURITY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Environmental feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnvironmentalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecondaryRequirementType_environmental_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecondaryRequirementType_environmental_feature", "_UI_SecondaryRequirementType_type"),
				 Requirement_Package.Literals.SECONDARY_REQUIREMENT_TYPE__ENVIRONMENTAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operational feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecondaryRequirementType_operational_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecondaryRequirementType_operational_feature", "_UI_SecondaryRequirementType_type"),
				 Requirement_Package.Literals.SECONDARY_REQUIREMENT_TYPE__OPERATIONAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Development feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDevelopmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecondaryRequirementType_development_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecondaryRequirementType_development_feature", "_UI_SecondaryRequirementType_type"),
				 Requirement_Package.Literals.SECONDARY_REQUIREMENT_TYPE__DEVELOPMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Regulatory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegulatoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecondaryRequirementType_regulatory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecondaryRequirementType_regulatory_feature", "_UI_SecondaryRequirementType_type"),
				 Requirement_Package.Literals.SECONDARY_REQUIREMENT_TYPE__REGULATORY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Ethical feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEthicalPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecondaryRequirementType_ethical_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecondaryRequirementType_ethical_feature", "_UI_SecondaryRequirementType_type"),
				 Requirement_Package.Literals.SECONDARY_REQUIREMENT_TYPE__ETHICAL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Safety feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSafetyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecondaryRequirementType_safety_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecondaryRequirementType_safety_feature", "_UI_SecondaryRequirementType_type"),
				 Requirement_Package.Literals.SECONDARY_REQUIREMENT_TYPE__SAFETY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Accounting feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAccountingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecondaryRequirementType_accounting_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecondaryRequirementType_accounting_feature", "_UI_SecondaryRequirementType_type"),
				 Requirement_Package.Literals.SECONDARY_REQUIREMENT_TYPE__ACCOUNTING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns SecondaryRequirementType.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SecondaryRequirementType"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SecondaryRequirementType)object).getGid();
		return label == null || label.length() == 0 ?
			getString("_UI_SecondaryRequirementType_type") :
			getString("_UI_SecondaryRequirementType_type") + " " + label;
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

		switch (notification.getFeatureID(SecondaryRequirementType.class)) {
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ARCHITECTURE:
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__USABILITY:
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__PERFORMANCE:
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__SPACE:
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__DEPENDABILITY:
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__SECURITY:
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ENVIRONMENTAL:
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__OPERATIONAL:
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__DEVELOPMENT:
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__REGULATORY:
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ETHICAL:
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__SAFETY:
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ACCOUNTING:
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
