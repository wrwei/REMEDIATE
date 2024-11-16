/**
 */
package requirement.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import requirement.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Requirement_FactoryImpl extends EFactoryImpl implements Requirement_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Requirement_Factory init() {
		try {
			Requirement_Factory theRequirement_Factory = (Requirement_Factory)EPackage.Registry.INSTANCE.getEFactory(Requirement_Package.eNS_URI);
			if (theRequirement_Factory != null) {
				return theRequirement_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Requirement_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Requirement_Package.REQUIREMENT_PACKAGE: return createRequirementPackage();
			case Requirement_Package.REQUIREMENT_PACKAGE_INTERFACE: return createRequirementPackageInterface();
			case Requirement_Package.CATEGORY: return createCategory();
			case Requirement_Package.STAKEHOLDER: return createStakeholder();
			case Requirement_Package.GLOSSARY: return createGlossary();
			case Requirement_Package.GLOSSARY_ENTRY: return createGlossaryEntry();
			case Requirement_Package.USER_REQUIREMENT: return createUserRequirement();
			case Requirement_Package.FUNCTIONAL_REQUIREMENT: return createFunctionalRequirement();
			case Requirement_Package.NON_FUNCTIONAL_REQUIREMENT: return createNonFunctionalRequirement();
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE: return createSecondaryRequirementType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementPackage createRequirementPackage() {
		RequirementPackageImpl requirementPackage = new RequirementPackageImpl();
		return requirementPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementPackageInterface createRequirementPackageInterface() {
		RequirementPackageInterfaceImpl requirementPackageInterface = new RequirementPackageInterfaceImpl();
		return requirementPackageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category createCategory() {
		CategoryImpl category = new CategoryImpl();
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stakeholder createStakeholder() {
		StakeholderImpl stakeholder = new StakeholderImpl();
		return stakeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Glossary createGlossary() {
		GlossaryImpl glossary = new GlossaryImpl();
		return glossary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlossaryEntry createGlossaryEntry() {
		GlossaryEntryImpl glossaryEntry = new GlossaryEntryImpl();
		return glossaryEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserRequirement createUserRequirement() {
		UserRequirementImpl userRequirement = new UserRequirementImpl();
		return userRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalRequirement createFunctionalRequirement() {
		FunctionalRequirementImpl functionalRequirement = new FunctionalRequirementImpl();
		return functionalRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonFunctionalRequirement createNonFunctionalRequirement() {
		NonFunctionalRequirementImpl nonFunctionalRequirement = new NonFunctionalRequirementImpl();
		return nonFunctionalRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecondaryRequirementType createSecondaryRequirementType() {
		SecondaryRequirementTypeImpl secondaryRequirementType = new SecondaryRequirementTypeImpl();
		return secondaryRequirementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_Package getRequirement_Package() {
		return (Requirement_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Requirement_Package getPackage() {
		return Requirement_Package.eINSTANCE;
	}

} //Requirement_FactoryImpl
