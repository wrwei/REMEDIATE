/**
 */
package requirement;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see requirement.Requirement_Package
 * @generated
 */
public interface Requirement_Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Requirement_Factory eINSTANCE = requirement.impl.Requirement_FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Requirement Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Package</em>'.
	 * @generated
	 */
	RequirementPackage createRequirementPackage();

	/**
	 * Returns a new object of class '<em>Requirement Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Requirement Package Interface</em>'.
	 * @generated
	 */
	RequirementPackageInterface createRequirementPackageInterface();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Stakeholder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stakeholder</em>'.
	 * @generated
	 */
	Stakeholder createStakeholder();

	/**
	 * Returns a new object of class '<em>Glossary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glossary</em>'.
	 * @generated
	 */
	Glossary createGlossary();

	/**
	 * Returns a new object of class '<em>Glossary Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Glossary Entry</em>'.
	 * @generated
	 */
	GlossaryEntry createGlossaryEntry();

	/**
	 * Returns a new object of class '<em>User Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Requirement</em>'.
	 * @generated
	 */
	UserRequirement createUserRequirement();

	/**
	 * Returns a new object of class '<em>Functional Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Functional Requirement</em>'.
	 * @generated
	 */
	FunctionalRequirement createFunctionalRequirement();

	/**
	 * Returns a new object of class '<em>Non Functional Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Functional Requirement</em>'.
	 * @generated
	 */
	NonFunctionalRequirement createNonFunctionalRequirement();

	/**
	 * Returns a new object of class '<em>Secondary Requirement Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Secondary Requirement Type</em>'.
	 * @generated
	 */
	SecondaryRequirementType createSecondaryRequirementType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Requirement_Package getRequirement_Package();

} //Requirement_Factory
