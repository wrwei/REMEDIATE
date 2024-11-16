/**
 */
package requirement.util;

import base.ArtifactElement;
import base.Element;
import base.ModelElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import requirement.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see requirement.Requirement_Package
 * @generated
 */
public class Requirement_Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Requirement_Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_Switch() {
		if (modelPackage == null) {
			modelPackage = Requirement_Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Requirement_Package.REQUIREMENT_ASSET: {
				RequirementAsset requirementAsset = (RequirementAsset)theEObject;
				T result = caseRequirementAsset(requirementAsset);
				if (result == null) result = caseArtifactElement(requirementAsset);
				if (result == null) result = caseModelElement(requirementAsset);
				if (result == null) result = caseElement(requirementAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Requirement_Package.REQUIREMENT_PACKAGE: {
				RequirementPackage requirementPackage = (RequirementPackage)theEObject;
				T result = caseRequirementPackage(requirementPackage);
				if (result == null) result = caseRequirementAsset(requirementPackage);
				if (result == null) result = caseArtifactElement(requirementPackage);
				if (result == null) result = caseModelElement(requirementPackage);
				if (result == null) result = caseElement(requirementPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Requirement_Package.REQUIREMENT_PACKAGE_INTERFACE: {
				RequirementPackageInterface requirementPackageInterface = (RequirementPackageInterface)theEObject;
				T result = caseRequirementPackageInterface(requirementPackageInterface);
				if (result == null) result = caseRequirementPackage(requirementPackageInterface);
				if (result == null) result = caseRequirementAsset(requirementPackageInterface);
				if (result == null) result = caseArtifactElement(requirementPackageInterface);
				if (result == null) result = caseModelElement(requirementPackageInterface);
				if (result == null) result = caseElement(requirementPackageInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Requirement_Package.REQUIREMENT_UTILITY_ASSET: {
				RequirementUtilityAsset requirementUtilityAsset = (RequirementUtilityAsset)theEObject;
				T result = caseRequirementUtilityAsset(requirementUtilityAsset);
				if (result == null) result = caseRequirementAsset(requirementUtilityAsset);
				if (result == null) result = caseArtifactElement(requirementUtilityAsset);
				if (result == null) result = caseModelElement(requirementUtilityAsset);
				if (result == null) result = caseElement(requirementUtilityAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Requirement_Package.CATEGORY: {
				Category category = (Category)theEObject;
				T result = caseCategory(category);
				if (result == null) result = caseRequirementUtilityAsset(category);
				if (result == null) result = caseRequirementAsset(category);
				if (result == null) result = caseArtifactElement(category);
				if (result == null) result = caseModelElement(category);
				if (result == null) result = caseElement(category);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Requirement_Package.STAKEHOLDER: {
				Stakeholder stakeholder = (Stakeholder)theEObject;
				T result = caseStakeholder(stakeholder);
				if (result == null) result = caseRequirementUtilityAsset(stakeholder);
				if (result == null) result = caseRequirementAsset(stakeholder);
				if (result == null) result = caseArtifactElement(stakeholder);
				if (result == null) result = caseModelElement(stakeholder);
				if (result == null) result = caseElement(stakeholder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Requirement_Package.GLOSSARY: {
				Glossary glossary = (Glossary)theEObject;
				T result = caseGlossary(glossary);
				if (result == null) result = caseRequirementUtilityAsset(glossary);
				if (result == null) result = caseRequirementAsset(glossary);
				if (result == null) result = caseArtifactElement(glossary);
				if (result == null) result = caseModelElement(glossary);
				if (result == null) result = caseElement(glossary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Requirement_Package.GLOSSARY_ENTRY: {
				GlossaryEntry glossaryEntry = (GlossaryEntry)theEObject;
				T result = caseGlossaryEntry(glossaryEntry);
				if (result == null) result = caseRequirementUtilityAsset(glossaryEntry);
				if (result == null) result = caseRequirementAsset(glossaryEntry);
				if (result == null) result = caseArtifactElement(glossaryEntry);
				if (result == null) result = caseModelElement(glossaryEntry);
				if (result == null) result = caseElement(glossaryEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Requirement_Package.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseRequirementAsset(requirement);
				if (result == null) result = caseArtifactElement(requirement);
				if (result == null) result = caseModelElement(requirement);
				if (result == null) result = caseElement(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Requirement_Package.USER_REQUIREMENT: {
				UserRequirement userRequirement = (UserRequirement)theEObject;
				T result = caseUserRequirement(userRequirement);
				if (result == null) result = caseRequirement(userRequirement);
				if (result == null) result = caseRequirementAsset(userRequirement);
				if (result == null) result = caseArtifactElement(userRequirement);
				if (result == null) result = caseModelElement(userRequirement);
				if (result == null) result = caseElement(userRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Requirement_Package.SYSTEM_REQUIREMENT: {
				SystemRequirement systemRequirement = (SystemRequirement)theEObject;
				T result = caseSystemRequirement(systemRequirement);
				if (result == null) result = caseRequirement(systemRequirement);
				if (result == null) result = caseRequirementAsset(systemRequirement);
				if (result == null) result = caseArtifactElement(systemRequirement);
				if (result == null) result = caseModelElement(systemRequirement);
				if (result == null) result = caseElement(systemRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Requirement_Package.FUNCTIONAL_REQUIREMENT: {
				FunctionalRequirement functionalRequirement = (FunctionalRequirement)theEObject;
				T result = caseFunctionalRequirement(functionalRequirement);
				if (result == null) result = caseSystemRequirement(functionalRequirement);
				if (result == null) result = caseRequirement(functionalRequirement);
				if (result == null) result = caseRequirementAsset(functionalRequirement);
				if (result == null) result = caseArtifactElement(functionalRequirement);
				if (result == null) result = caseModelElement(functionalRequirement);
				if (result == null) result = caseElement(functionalRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Requirement_Package.NON_FUNCTIONAL_REQUIREMENT: {
				NonFunctionalRequirement nonFunctionalRequirement = (NonFunctionalRequirement)theEObject;
				T result = caseNonFunctionalRequirement(nonFunctionalRequirement);
				if (result == null) result = caseSystemRequirement(nonFunctionalRequirement);
				if (result == null) result = caseRequirement(nonFunctionalRequirement);
				if (result == null) result = caseRequirementAsset(nonFunctionalRequirement);
				if (result == null) result = caseArtifactElement(nonFunctionalRequirement);
				if (result == null) result = caseModelElement(nonFunctionalRequirement);
				if (result == null) result = caseElement(nonFunctionalRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE: {
				SecondaryRequirementType secondaryRequirementType = (SecondaryRequirementType)theEObject;
				T result = caseSecondaryRequirementType(secondaryRequirementType);
				if (result == null) result = caseRequirementAsset(secondaryRequirementType);
				if (result == null) result = caseArtifactElement(secondaryRequirementType);
				if (result == null) result = caseModelElement(secondaryRequirementType);
				if (result == null) result = caseElement(secondaryRequirementType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementAsset(RequirementAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementPackage(RequirementPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Package Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementPackageInterface(RequirementPackageInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement Utility Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement Utility Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirementUtilityAsset(RequirementUtilityAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCategory(Category object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStakeholder(Stakeholder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glossary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glossary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlossary(Glossary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Glossary Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Glossary Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGlossaryEntry(GlossaryEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserRequirement(UserRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemRequirement(SystemRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Functional Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Functional Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionalRequirement(FunctionalRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Functional Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Functional Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNonFunctionalRequirement(NonFunctionalRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Secondary Requirement Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Secondary Requirement Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecondaryRequirementType(SecondaryRequirementType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElement(Element object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelElement(ModelElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArtifactElement(ArtifactElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Requirement_Switch
