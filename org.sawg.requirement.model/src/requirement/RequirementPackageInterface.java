/**
 */
package requirement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Package Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirement.RequirementPackageInterface#getInterfaceOf <em>Interface Of</em>}</li>
 * </ul>
 *
 * @see requirement.Requirement_Package#getRequirementPackageInterface()
 * @model
 * @generated
 */
public interface RequirementPackageInterface extends RequirementPackage {
	/**
	 * Returns the value of the '<em><b>Interface Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Of</em>' reference.
	 * @see #setInterfaceOf(RequirementPackage)
	 * @see requirement.Requirement_Package#getRequirementPackageInterface_InterfaceOf()
	 * @model required="true"
	 * @generated
	 */
	RequirementPackage getInterfaceOf();

	/**
	 * Sets the value of the '{@link requirement.RequirementPackageInterface#getInterfaceOf <em>Interface Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Of</em>' reference.
	 * @see #getInterfaceOf()
	 * @generated
	 */
	void setInterfaceOf(RequirementPackage value);

} // RequirementPackageInterface
