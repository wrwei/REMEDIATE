/**
 */
package requirement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirement.RequirementPackage#getRequirementAsset <em>Requirement Asset</em>}</li>
 *   <li>{@link requirement.RequirementPackage#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see requirement.Requirement_Package#getRequirementPackage()
 * @model
 * @generated
 */
public interface RequirementPackage extends RequirementAsset {
	/**
	 * Returns the value of the '<em><b>Requirement Asset</b></em>' containment reference list.
	 * The list contents are of type {@link requirement.RequirementAsset}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Asset</em>' containment reference list.
	 * @see requirement.Requirement_Package#getRequirementPackage_RequirementAsset()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementAsset> getRequirementAsset();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' reference list.
	 * The list contents are of type {@link requirement.RequirementPackageInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' reference list.
	 * @see requirement.Requirement_Package#getRequirementPackage_Interfaces()
	 * @model
	 * @generated
	 */
	EList<RequirementPackageInterface> getInterfaces();

} // RequirementPackage
