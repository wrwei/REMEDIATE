/**
 */
package terminology.util;

import base.ArtifactElement;
import base.Element;
import base.ModelElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import terminology.*;

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
 * @see terminology.Terminology_Package
 * @generated
 */
public class Terminology_Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Terminology_Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminology_Switch() {
		if (modelPackage == null) {
			modelPackage = Terminology_Package.eINSTANCE;
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
			case Terminology_Package.TERMINOLOGY_ELEMENT: {
				TerminologyElement terminologyElement = (TerminologyElement)theEObject;
				T result = caseTerminologyElement(terminologyElement);
				if (result == null) result = caseArtifactElement(terminologyElement);
				if (result == null) result = caseModelElement(terminologyElement);
				if (result == null) result = caseElement(terminologyElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Terminology_Package.TERMINOLOGY_PACKAGE: {
				TerminologyPackage terminologyPackage = (TerminologyPackage)theEObject;
				T result = caseTerminologyPackage(terminologyPackage);
				if (result == null) result = caseTerminologyElement(terminologyPackage);
				if (result == null) result = caseArtifactElement(terminologyPackage);
				if (result == null) result = caseModelElement(terminologyPackage);
				if (result == null) result = caseElement(terminologyPackage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Terminology_Package.TERMINOLOGY_PACKAGE_INTERFACE: {
				TerminologyPackageInterface terminologyPackageInterface = (TerminologyPackageInterface)theEObject;
				T result = caseTerminologyPackageInterface(terminologyPackageInterface);
				if (result == null) result = caseTerminologyPackage(terminologyPackageInterface);
				if (result == null) result = caseTerminologyElement(terminologyPackageInterface);
				if (result == null) result = caseArtifactElement(terminologyPackageInterface);
				if (result == null) result = caseModelElement(terminologyPackageInterface);
				if (result == null) result = caseElement(terminologyPackageInterface);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Terminology_Package.TERMINOLOGY_ASSET: {
				TerminologyAsset terminologyAsset = (TerminologyAsset)theEObject;
				T result = caseTerminologyAsset(terminologyAsset);
				if (result == null) result = caseTerminologyElement(terminologyAsset);
				if (result == null) result = caseArtifactElement(terminologyAsset);
				if (result == null) result = caseModelElement(terminologyAsset);
				if (result == null) result = caseElement(terminologyAsset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Terminology_Package.CONCEPT: {
				Concept concept = (Concept)theEObject;
				T result = caseConcept(concept);
				if (result == null) result = caseTerminologyAsset(concept);
				if (result == null) result = caseTerminologyElement(concept);
				if (result == null) result = caseArtifactElement(concept);
				if (result == null) result = caseModelElement(concept);
				if (result == null) result = caseElement(concept);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Terminology_Package.INSTANCE: {
				Instance instance = (Instance)theEObject;
				T result = caseInstance(instance);
				if (result == null) result = caseTerminologyAsset(instance);
				if (result == null) result = caseTerminologyElement(instance);
				if (result == null) result = caseArtifactElement(instance);
				if (result == null) result = caseModelElement(instance);
				if (result == null) result = caseElement(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyElement(TerminologyElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Package</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Package</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyPackage(TerminologyPackage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Package Interface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyPackageInterface(TerminologyPackageInterface object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Terminology Asset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Terminology Asset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTerminologyAsset(TerminologyAsset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concept</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcept(Concept object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstance(Instance object) {
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

} //Terminology_Switch
