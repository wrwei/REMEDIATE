/**
 */
package requirement.util;

import base.ArtifactElement;
import base.Element;
import base.ModelElement;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import requirement.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see requirement.Requirement_Package
 * @generated
 */
public class Requirement_AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Requirement_Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Requirement_Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Requirement_Switch<Adapter> modelSwitch =
		new Requirement_Switch<Adapter>() {
			@Override
			public Adapter caseRequirementAsset(RequirementAsset object) {
				return createRequirementAssetAdapter();
			}
			@Override
			public Adapter caseRequirementPackage(RequirementPackage object) {
				return createRequirementPackageAdapter();
			}
			@Override
			public Adapter caseRequirementPackageInterface(RequirementPackageInterface object) {
				return createRequirementPackageInterfaceAdapter();
			}
			@Override
			public Adapter caseRequirementUtilityAsset(RequirementUtilityAsset object) {
				return createRequirementUtilityAssetAdapter();
			}
			@Override
			public Adapter caseCategory(Category object) {
				return createCategoryAdapter();
			}
			@Override
			public Adapter caseStakeholder(Stakeholder object) {
				return createStakeholderAdapter();
			}
			@Override
			public Adapter caseGlossary(Glossary object) {
				return createGlossaryAdapter();
			}
			@Override
			public Adapter caseGlossaryEntry(GlossaryEntry object) {
				return createGlossaryEntryAdapter();
			}
			@Override
			public Adapter caseRequirement(Requirement object) {
				return createRequirementAdapter();
			}
			@Override
			public Adapter caseUserRequirement(UserRequirement object) {
				return createUserRequirementAdapter();
			}
			@Override
			public Adapter caseSystemRequirement(SystemRequirement object) {
				return createSystemRequirementAdapter();
			}
			@Override
			public Adapter caseFunctionalRequirement(FunctionalRequirement object) {
				return createFunctionalRequirementAdapter();
			}
			@Override
			public Adapter caseNonFunctionalRequirement(NonFunctionalRequirement object) {
				return createNonFunctionalRequirementAdapter();
			}
			@Override
			public Adapter caseSecondaryRequirementType(SecondaryRequirementType object) {
				return createSecondaryRequirementTypeAdapter();
			}
			@Override
			public Adapter caseElement(Element object) {
				return createElementAdapter();
			}
			@Override
			public Adapter caseModelElement(ModelElement object) {
				return createModelElementAdapter();
			}
			@Override
			public Adapter caseArtifactElement(ArtifactElement object) {
				return createArtifactElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link requirement.RequirementAsset <em>Requirement Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirement.RequirementAsset
	 * @generated
	 */
	public Adapter createRequirementAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirement.RequirementPackage <em>Requirement Package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirement.RequirementPackage
	 * @generated
	 */
	public Adapter createRequirementPackageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirement.RequirementPackageInterface <em>Requirement Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirement.RequirementPackageInterface
	 * @generated
	 */
	public Adapter createRequirementPackageInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirement.RequirementUtilityAsset <em>Requirement Utility Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirement.RequirementUtilityAsset
	 * @generated
	 */
	public Adapter createRequirementUtilityAssetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirement.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirement.Category
	 * @generated
	 */
	public Adapter createCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirement.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirement.Stakeholder
	 * @generated
	 */
	public Adapter createStakeholderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirement.Glossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirement.Glossary
	 * @generated
	 */
	public Adapter createGlossaryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirement.GlossaryEntry <em>Glossary Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirement.GlossaryEntry
	 * @generated
	 */
	public Adapter createGlossaryEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirement.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirement.Requirement
	 * @generated
	 */
	public Adapter createRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirement.UserRequirement <em>User Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirement.UserRequirement
	 * @generated
	 */
	public Adapter createUserRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirement.SystemRequirement <em>System Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirement.SystemRequirement
	 * @generated
	 */
	public Adapter createSystemRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirement.FunctionalRequirement <em>Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirement.FunctionalRequirement
	 * @generated
	 */
	public Adapter createFunctionalRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirement.NonFunctionalRequirement <em>Non Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirement.NonFunctionalRequirement
	 * @generated
	 */
	public Adapter createNonFunctionalRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link requirement.SecondaryRequirementType <em>Secondary Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see requirement.SecondaryRequirementType
	 * @generated
	 */
	public Adapter createSecondaryRequirementTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.Element
	 * @generated
	 */
	public Adapter createElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.ModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.ModelElement
	 * @generated
	 */
	public Adapter createModelElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link base.ArtifactElement <em>Artifact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see base.ArtifactElement
	 * @generated
	 */
	public Adapter createArtifactElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Requirement_AdapterFactory
