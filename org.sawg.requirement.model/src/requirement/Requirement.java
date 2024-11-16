/**
 */
package requirement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirement.Requirement#isSatisfied <em>Satisfied</em>}</li>
 *   <li>{@link requirement.Requirement#getPriority <em>Priority</em>}</li>
 *   <li>{@link requirement.Requirement#getCategory <em>Category</em>}</li>
 *   <li>{@link requirement.Requirement#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link requirement.Requirement#getSub_requirement <em>Sub requirement</em>}</li>
 *   <li>{@link requirement.Requirement#getDependent_requirement <em>Dependent requirement</em>}</li>
 * </ul>
 *
 * @see requirement.Requirement_Package#getRequirement()
 * @model abstract="true"
 * @generated
 */
public interface Requirement extends RequirementAsset {
	/**
	 * Returns the value of the '<em><b>Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satisfied</em>' attribute.
	 * @see #setSatisfied(boolean)
	 * @see requirement.Requirement_Package#getRequirement_Satisfied()
	 * @model
	 * @generated
	 */
	boolean isSatisfied();

	/**
	 * Sets the value of the '{@link requirement.Requirement#isSatisfied <em>Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satisfied</em>' attribute.
	 * @see #isSatisfied()
	 * @generated
	 */
	void setSatisfied(boolean value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' attribute.
	 * @see #setPriority(int)
	 * @see requirement.Requirement_Package#getRequirement_Priority()
	 * @model
	 * @generated
	 */
	int getPriority();

	/**
	 * Sets the value of the '{@link requirement.Requirement#getPriority <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' attribute.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(int value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference list.
	 * The list contents are of type {@link requirement.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference list.
	 * @see requirement.Requirement_Package#getRequirement_Category()
	 * @model
	 * @generated
	 */
	EList<Category> getCategory();

	/**
	 * Returns the value of the '<em><b>Stakeholders</b></em>' reference list.
	 * The list contents are of type {@link requirement.Stakeholder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stakeholders</em>' reference list.
	 * @see requirement.Requirement_Package#getRequirement_Stakeholders()
	 * @model
	 * @generated
	 */
	EList<Stakeholder> getStakeholders();

	/**
	 * Returns the value of the '<em><b>Sub requirement</b></em>' containment reference list.
	 * The list contents are of type {@link requirement.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub requirement</em>' containment reference list.
	 * @see requirement.Requirement_Package#getRequirement_Sub_requirement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getSub_requirement();

	/**
	 * Returns the value of the '<em><b>Dependent requirement</b></em>' reference list.
	 * The list contents are of type {@link requirement.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependent requirement</em>' reference list.
	 * @see requirement.Requirement_Package#getRequirement_Dependent_requirement()
	 * @model
	 * @generated
	 */
	EList<Requirement> getDependent_requirement();

} // Requirement
