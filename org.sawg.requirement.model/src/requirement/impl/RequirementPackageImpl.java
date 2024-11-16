/**
 */
package requirement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import requirement.RequirementAsset;
import requirement.RequirementPackage;
import requirement.RequirementPackageInterface;
import requirement.Requirement_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirement.impl.RequirementPackageImpl#getRequirementAsset <em>Requirement Asset</em>}</li>
 *   <li>{@link requirement.impl.RequirementPackageImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementPackageImpl extends RequirementAssetImpl implements RequirementPackage {
	/**
	 * The cached value of the '{@link #getRequirementAsset() <em>Requirement Asset</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementAsset()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementAsset> requirementAsset;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementPackageInterface> interfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Requirement_Package.Literals.REQUIREMENT_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementAsset> getRequirementAsset() {
		if (requirementAsset == null) {
			requirementAsset = new EObjectContainmentEList<RequirementAsset>(RequirementAsset.class, this, Requirement_Package.REQUIREMENT_PACKAGE__REQUIREMENT_ASSET);
		}
		return requirementAsset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementPackageInterface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectResolvingEList<RequirementPackageInterface>(RequirementPackageInterface.class, this, Requirement_Package.REQUIREMENT_PACKAGE__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Requirement_Package.REQUIREMENT_PACKAGE__REQUIREMENT_ASSET:
				return ((InternalEList<?>)getRequirementAsset()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Requirement_Package.REQUIREMENT_PACKAGE__REQUIREMENT_ASSET:
				return getRequirementAsset();
			case Requirement_Package.REQUIREMENT_PACKAGE__INTERFACES:
				return getInterfaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Requirement_Package.REQUIREMENT_PACKAGE__REQUIREMENT_ASSET:
				getRequirementAsset().clear();
				getRequirementAsset().addAll((Collection<? extends RequirementAsset>)newValue);
				return;
			case Requirement_Package.REQUIREMENT_PACKAGE__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends RequirementPackageInterface>)newValue);
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
			case Requirement_Package.REQUIREMENT_PACKAGE__REQUIREMENT_ASSET:
				getRequirementAsset().clear();
				return;
			case Requirement_Package.REQUIREMENT_PACKAGE__INTERFACES:
				getInterfaces().clear();
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
			case Requirement_Package.REQUIREMENT_PACKAGE__REQUIREMENT_ASSET:
				return requirementAsset != null && !requirementAsset.isEmpty();
			case Requirement_Package.REQUIREMENT_PACKAGE__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementPackageImpl
