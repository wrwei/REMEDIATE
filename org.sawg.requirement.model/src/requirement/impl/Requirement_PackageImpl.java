/**
 */
package requirement.impl;

import base.Base_Package;

import base.impl.Base_PackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import requirement.Category;
import requirement.FunctionalRequirement;
import requirement.Glossary;
import requirement.GlossaryEntry;
import requirement.NonFunctionalRequirement;
import requirement.Requirement;
import requirement.RequirementAsset;
import requirement.RequirementPackage;
import requirement.RequirementPackageInterface;
import requirement.RequirementUtilityAsset;
import requirement.Requirement_Factory;
import requirement.Requirement_Package;
import requirement.SecondaryRequirementType;
import requirement.Stakeholder;
import requirement.SystemRequirement;
import requirement.UserRequirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Requirement_PackageImpl extends EPackageImpl implements Requirement_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementPackageInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementUtilityAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stakeholderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glossaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glossaryEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonFunctionalRequirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass secondaryRequirementTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see requirement.Requirement_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Requirement_PackageImpl() {
		super(eNS_URI, Requirement_Factory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Requirement_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Requirement_Package init() {
		if (isInited) return (Requirement_Package)EPackage.Registry.INSTANCE.getEPackage(Requirement_Package.eNS_URI);

		// Obtain or create and register package
		Object registeredRequirement_Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Requirement_PackageImpl theRequirement_Package = registeredRequirement_Package instanceof Requirement_PackageImpl ? (Requirement_PackageImpl)registeredRequirement_Package : new Requirement_PackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);
		Base_PackageImpl theBase_Package = (Base_PackageImpl)(registeredPackage instanceof Base_PackageImpl ? registeredPackage : Base_Package.eINSTANCE);

		// Create package meta-data objects
		theRequirement_Package.createPackageContents();
		theBase_Package.createPackageContents();

		// Initialize created meta-data
		theRequirement_Package.initializePackageContents();
		theBase_Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequirement_Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Requirement_Package.eNS_URI, theRequirement_Package);
		return theRequirement_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementAsset() {
		return requirementAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementPackage() {
		return requirementPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementPackage_RequirementAsset() {
		return (EReference)requirementPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementPackage_Interfaces() {
		return (EReference)requirementPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementPackageInterface() {
		return requirementPackageInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementPackageInterface_InterfaceOf() {
		return (EReference)requirementPackageInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementUtilityAsset() {
		return requirementUtilityAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_Sub_category() {
		return (EReference)categoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStakeholder() {
		return stakeholderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlossary() {
		return glossaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlossary_Entries() {
		return (EReference)glossaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlossaryEntry() {
		return glossaryEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlossaryEntry_Term() {
		return (EAttribute)glossaryEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlossaryEntry_Pitch() {
		return (EAttribute)glossaryEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Satisfied() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Priority() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Category() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Stakeholders() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Sub_requirement() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Dependent_requirement() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserRequirement() {
		return userRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemRequirement() {
		return systemRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionalRequirement() {
		return functionalRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalRequirement_Function() {
		return (EAttribute)functionalRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalRequirement_Inputs() {
		return (EAttribute)functionalRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalRequirement_Outputs() {
		return (EAttribute)functionalRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalRequirement_Source() {
		return (EAttribute)functionalRequirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalRequirement_Destination() {
		return (EAttribute)functionalRequirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalRequirement_Action() {
		return (EAttribute)functionalRequirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalRequirement_Requires() {
		return (EAttribute)functionalRequirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalRequirement_Pre_condition() {
		return (EAttribute)functionalRequirementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalRequirement_Post_condition() {
		return (EAttribute)functionalRequirementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionalRequirement_Side_effects() {
		return (EAttribute)functionalRequirementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonFunctionalRequirement() {
		return nonFunctionalRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonFunctionalRequirement_Type() {
		return (EReference)nonFunctionalRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecondaryRequirementType() {
		return secondaryRequirementTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryRequirementType_Architecture() {
		return (EAttribute)secondaryRequirementTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryRequirementType_Usability() {
		return (EAttribute)secondaryRequirementTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryRequirementType_Performance() {
		return (EAttribute)secondaryRequirementTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryRequirementType_Space() {
		return (EAttribute)secondaryRequirementTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryRequirementType_Dependability() {
		return (EAttribute)secondaryRequirementTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryRequirementType_Security() {
		return (EAttribute)secondaryRequirementTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryRequirementType_Environmental() {
		return (EAttribute)secondaryRequirementTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryRequirementType_Operational() {
		return (EAttribute)secondaryRequirementTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryRequirementType_Development() {
		return (EAttribute)secondaryRequirementTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryRequirementType_Regulatory() {
		return (EAttribute)secondaryRequirementTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryRequirementType_Ethical() {
		return (EAttribute)secondaryRequirementTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryRequirementType_Safety() {
		return (EAttribute)secondaryRequirementTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecondaryRequirementType_Accounting() {
		return (EAttribute)secondaryRequirementTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement_Factory getRequirement_Factory() {
		return (Requirement_Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		requirementAssetEClass = createEClass(REQUIREMENT_ASSET);

		requirementPackageEClass = createEClass(REQUIREMENT_PACKAGE);
		createEReference(requirementPackageEClass, REQUIREMENT_PACKAGE__REQUIREMENT_ASSET);
		createEReference(requirementPackageEClass, REQUIREMENT_PACKAGE__INTERFACES);

		requirementPackageInterfaceEClass = createEClass(REQUIREMENT_PACKAGE_INTERFACE);
		createEReference(requirementPackageInterfaceEClass, REQUIREMENT_PACKAGE_INTERFACE__INTERFACE_OF);

		requirementUtilityAssetEClass = createEClass(REQUIREMENT_UTILITY_ASSET);

		categoryEClass = createEClass(CATEGORY);
		createEReference(categoryEClass, CATEGORY__SUB_CATEGORY);

		stakeholderEClass = createEClass(STAKEHOLDER);

		glossaryEClass = createEClass(GLOSSARY);
		createEReference(glossaryEClass, GLOSSARY__ENTRIES);

		glossaryEntryEClass = createEClass(GLOSSARY_ENTRY);
		createEAttribute(glossaryEntryEClass, GLOSSARY_ENTRY__TERM);
		createEAttribute(glossaryEntryEClass, GLOSSARY_ENTRY__PITCH);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__SATISFIED);
		createEAttribute(requirementEClass, REQUIREMENT__PRIORITY);
		createEReference(requirementEClass, REQUIREMENT__CATEGORY);
		createEReference(requirementEClass, REQUIREMENT__STAKEHOLDERS);
		createEReference(requirementEClass, REQUIREMENT__SUB_REQUIREMENT);
		createEReference(requirementEClass, REQUIREMENT__DEPENDENT_REQUIREMENT);

		userRequirementEClass = createEClass(USER_REQUIREMENT);

		systemRequirementEClass = createEClass(SYSTEM_REQUIREMENT);

		functionalRequirementEClass = createEClass(FUNCTIONAL_REQUIREMENT);
		createEAttribute(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__FUNCTION);
		createEAttribute(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__INPUTS);
		createEAttribute(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__OUTPUTS);
		createEAttribute(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__SOURCE);
		createEAttribute(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__DESTINATION);
		createEAttribute(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__ACTION);
		createEAttribute(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__REQUIRES);
		createEAttribute(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__PRE_CONDITION);
		createEAttribute(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__POST_CONDITION);
		createEAttribute(functionalRequirementEClass, FUNCTIONAL_REQUIREMENT__SIDE_EFFECTS);

		nonFunctionalRequirementEClass = createEClass(NON_FUNCTIONAL_REQUIREMENT);
		createEReference(nonFunctionalRequirementEClass, NON_FUNCTIONAL_REQUIREMENT__TYPE);

		secondaryRequirementTypeEClass = createEClass(SECONDARY_REQUIREMENT_TYPE);
		createEAttribute(secondaryRequirementTypeEClass, SECONDARY_REQUIREMENT_TYPE__ARCHITECTURE);
		createEAttribute(secondaryRequirementTypeEClass, SECONDARY_REQUIREMENT_TYPE__USABILITY);
		createEAttribute(secondaryRequirementTypeEClass, SECONDARY_REQUIREMENT_TYPE__PERFORMANCE);
		createEAttribute(secondaryRequirementTypeEClass, SECONDARY_REQUIREMENT_TYPE__SPACE);
		createEAttribute(secondaryRequirementTypeEClass, SECONDARY_REQUIREMENT_TYPE__DEPENDABILITY);
		createEAttribute(secondaryRequirementTypeEClass, SECONDARY_REQUIREMENT_TYPE__SECURITY);
		createEAttribute(secondaryRequirementTypeEClass, SECONDARY_REQUIREMENT_TYPE__ENVIRONMENTAL);
		createEAttribute(secondaryRequirementTypeEClass, SECONDARY_REQUIREMENT_TYPE__OPERATIONAL);
		createEAttribute(secondaryRequirementTypeEClass, SECONDARY_REQUIREMENT_TYPE__DEVELOPMENT);
		createEAttribute(secondaryRequirementTypeEClass, SECONDARY_REQUIREMENT_TYPE__REGULATORY);
		createEAttribute(secondaryRequirementTypeEClass, SECONDARY_REQUIREMENT_TYPE__ETHICAL);
		createEAttribute(secondaryRequirementTypeEClass, SECONDARY_REQUIREMENT_TYPE__SAFETY);
		createEAttribute(secondaryRequirementTypeEClass, SECONDARY_REQUIREMENT_TYPE__ACCOUNTING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Base_Package theBase_Package = (Base_Package)EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		requirementAssetEClass.getESuperTypes().add(theBase_Package.getArtifactElement());
		requirementPackageEClass.getESuperTypes().add(this.getRequirementAsset());
		requirementPackageInterfaceEClass.getESuperTypes().add(this.getRequirementPackage());
		requirementUtilityAssetEClass.getESuperTypes().add(this.getRequirementAsset());
		categoryEClass.getESuperTypes().add(this.getRequirementUtilityAsset());
		stakeholderEClass.getESuperTypes().add(this.getRequirementUtilityAsset());
		glossaryEClass.getESuperTypes().add(this.getRequirementUtilityAsset());
		glossaryEntryEClass.getESuperTypes().add(this.getRequirementUtilityAsset());
		requirementEClass.getESuperTypes().add(this.getRequirementAsset());
		userRequirementEClass.getESuperTypes().add(this.getRequirement());
		systemRequirementEClass.getESuperTypes().add(this.getRequirement());
		functionalRequirementEClass.getESuperTypes().add(this.getSystemRequirement());
		nonFunctionalRequirementEClass.getESuperTypes().add(this.getSystemRequirement());
		secondaryRequirementTypeEClass.getESuperTypes().add(this.getRequirementAsset());

		// Initialize classes, features, and operations; add parameters
		initEClass(requirementAssetEClass, RequirementAsset.class, "RequirementAsset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(requirementPackageEClass, RequirementPackage.class, "RequirementPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementPackage_RequirementAsset(), this.getRequirementAsset(), null, "requirementAsset", null, 0, -1, RequirementPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementPackage_Interfaces(), this.getRequirementPackageInterface(), null, "interfaces", null, 0, -1, RequirementPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementPackageInterfaceEClass, RequirementPackageInterface.class, "RequirementPackageInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementPackageInterface_InterfaceOf(), this.getRequirementPackage(), null, "interfaceOf", null, 1, 1, RequirementPackageInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementUtilityAssetEClass, RequirementUtilityAsset.class, "RequirementUtilityAsset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCategory_Sub_category(), this.getCategory(), null, "sub_category", null, 0, -1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stakeholderEClass, Stakeholder.class, "Stakeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(glossaryEClass, Glossary.class, "Glossary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlossary_Entries(), this.getGlossaryEntry(), null, "entries", null, 0, -1, Glossary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(glossaryEntryEClass, GlossaryEntry.class, "GlossaryEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGlossaryEntry_Term(), ecorePackage.getEString(), "term", null, 0, 1, GlossaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGlossaryEntry_Pitch(), ecorePackage.getEString(), "pitch", null, 0, 1, GlossaryEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_Satisfied(), ecorePackage.getEBoolean(), "satisfied", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Priority(), ecorePackage.getEInt(), "priority", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Category(), this.getCategory(), null, "category", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Stakeholders(), this.getStakeholder(), null, "stakeholders", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Sub_requirement(), this.getRequirement(), null, "sub_requirement", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Dependent_requirement(), this.getRequirement(), null, "dependent_requirement", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userRequirementEClass, UserRequirement.class, "UserRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemRequirementEClass, SystemRequirement.class, "SystemRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(functionalRequirementEClass, FunctionalRequirement.class, "FunctionalRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionalRequirement_Function(), ecorePackage.getEString(), "function", null, 0, 1, FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalRequirement_Inputs(), ecorePackage.getEString(), "inputs", null, 0, 1, FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalRequirement_Outputs(), ecorePackage.getEString(), "outputs", null, 0, 1, FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalRequirement_Source(), ecorePackage.getEString(), "source", null, 0, 1, FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalRequirement_Destination(), ecorePackage.getEString(), "destination", null, 0, 1, FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalRequirement_Action(), ecorePackage.getEString(), "action", null, 0, 1, FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalRequirement_Requires(), ecorePackage.getEString(), "requires", null, 0, 1, FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalRequirement_Pre_condition(), ecorePackage.getEString(), "pre_condition", null, 0, 1, FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalRequirement_Post_condition(), ecorePackage.getEString(), "post_condition", null, 0, 1, FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionalRequirement_Side_effects(), ecorePackage.getEString(), "side_effects", null, 0, 1, FunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonFunctionalRequirementEClass, NonFunctionalRequirement.class, "NonFunctionalRequirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonFunctionalRequirement_Type(), this.getSecondaryRequirementType(), null, "type", null, 1, 1, NonFunctionalRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(secondaryRequirementTypeEClass, SecondaryRequirementType.class, "SecondaryRequirementType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSecondaryRequirementType_Architecture(), ecorePackage.getEBoolean(), "architecture", null, 0, 1, SecondaryRequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryRequirementType_Usability(), ecorePackage.getEBoolean(), "usability", null, 0, 1, SecondaryRequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryRequirementType_Performance(), ecorePackage.getEBoolean(), "performance", null, 0, 1, SecondaryRequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryRequirementType_Space(), ecorePackage.getEBoolean(), "space", null, 0, 1, SecondaryRequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryRequirementType_Dependability(), ecorePackage.getEBoolean(), "dependability", null, 0, 1, SecondaryRequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryRequirementType_Security(), ecorePackage.getEBoolean(), "security", null, 0, 1, SecondaryRequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryRequirementType_Environmental(), ecorePackage.getEBoolean(), "environmental", null, 0, 1, SecondaryRequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryRequirementType_Operational(), ecorePackage.getEBoolean(), "operational", null, 0, 1, SecondaryRequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryRequirementType_Development(), ecorePackage.getEBoolean(), "development", null, 0, 1, SecondaryRequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryRequirementType_Regulatory(), ecorePackage.getEBoolean(), "regulatory", null, 0, 1, SecondaryRequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryRequirementType_Ethical(), ecorePackage.getEBoolean(), "ethical", null, 0, 1, SecondaryRequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryRequirementType_Safety(), ecorePackage.getEBoolean(), "safety", null, 0, 1, SecondaryRequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSecondaryRequirementType_Accounting(), ecorePackage.getEBoolean(), "accounting", null, 0, 1, SecondaryRequirementType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Requirement_PackageImpl
