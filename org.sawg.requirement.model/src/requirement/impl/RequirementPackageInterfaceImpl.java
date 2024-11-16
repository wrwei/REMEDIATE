/**
 */
package requirement.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import requirement.RequirementPackage;
import requirement.RequirementPackageInterface;
import requirement.Requirement_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Package Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirement.impl.RequirementPackageInterfaceImpl#getInterfaceOf <em>Interface Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementPackageInterfaceImpl extends RequirementPackageImpl implements RequirementPackageInterface {
	/**
	 * The cached value of the '{@link #getInterfaceOf() <em>Interface Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceOf()
	 * @generated
	 * @ordered
	 */
	protected RequirementPackage interfaceOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementPackageInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Requirement_Package.Literals.REQUIREMENT_PACKAGE_INTERFACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementPackage getInterfaceOf() {
		if (interfaceOf != null && interfaceOf.eIsProxy()) {
			InternalEObject oldInterfaceOf = (InternalEObject)interfaceOf;
			interfaceOf = (RequirementPackage)eResolveProxy(oldInterfaceOf);
			if (interfaceOf != oldInterfaceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Requirement_Package.REQUIREMENT_PACKAGE_INTERFACE__INTERFACE_OF, oldInterfaceOf, interfaceOf));
			}
		}
		return interfaceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementPackage basicGetInterfaceOf() {
		return interfaceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceOf(RequirementPackage newInterfaceOf) {
		RequirementPackage oldInterfaceOf = interfaceOf;
		interfaceOf = newInterfaceOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.REQUIREMENT_PACKAGE_INTERFACE__INTERFACE_OF, oldInterfaceOf, interfaceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Requirement_Package.REQUIREMENT_PACKAGE_INTERFACE__INTERFACE_OF:
				if (resolve) return getInterfaceOf();
				return basicGetInterfaceOf();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Requirement_Package.REQUIREMENT_PACKAGE_INTERFACE__INTERFACE_OF:
				setInterfaceOf((RequirementPackage)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Requirement_Package.REQUIREMENT_PACKAGE_INTERFACE__INTERFACE_OF:
				setInterfaceOf((RequirementPackage)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Requirement_Package.REQUIREMENT_PACKAGE_INTERFACE__INTERFACE_OF:
				return interfaceOf != null;
		}
		return super.eIsSet(featureID);
	}

} //RequirementPackageInterfaceImpl
