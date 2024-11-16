/**
 */
package requirement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Non Functional Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirement.NonFunctionalRequirement#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see requirement.Requirement_Package#getNonFunctionalRequirement()
 * @model
 * @generated
 */
public interface NonFunctionalRequirement extends SystemRequirement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(SecondaryRequirementType)
	 * @see requirement.Requirement_Package#getNonFunctionalRequirement_Type()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SecondaryRequirementType getType();

	/**
	 * Sets the value of the '{@link requirement.NonFunctionalRequirement#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SecondaryRequirementType value);

} // NonFunctionalRequirement
