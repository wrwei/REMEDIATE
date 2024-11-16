/**
 */
package terminology.impl;

import base.Base_Package;

import base.impl.Base_PackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import terminology.Concept;
import terminology.Instance;
import terminology.TerminologyAsset;
import terminology.TerminologyElement;
import terminology.TerminologyPackage;
import terminology.TerminologyPackageInterface;
import terminology.Terminology_Factory;
import terminology.Terminology_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Terminology_PackageImpl extends EPackageImpl implements Terminology_Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyPackageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyPackageInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminologyAssetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conceptEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instanceEClass = null;

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
	 * @see terminology.Terminology_Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Terminology_PackageImpl() {
		super(eNS_URI, Terminology_Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Terminology_Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Terminology_Package init() {
		if (isInited) return (Terminology_Package)EPackage.Registry.INSTANCE.getEPackage(Terminology_Package.eNS_URI);

		// Obtain or create and register package
		Object registeredTerminology_Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Terminology_PackageImpl theTerminology_Package = registeredTerminology_Package instanceof Terminology_PackageImpl ? (Terminology_PackageImpl)registeredTerminology_Package : new Terminology_PackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Base_Package.eNS_URI);
		Base_PackageImpl theBase_Package = (Base_PackageImpl)(registeredPackage instanceof Base_PackageImpl ? registeredPackage : Base_Package.eINSTANCE);

		// Create package meta-data objects
		theTerminology_Package.createPackageContents();
		theBase_Package.createPackageContents();

		// Initialize created meta-data
		theTerminology_Package.initializePackageContents();
		theBase_Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTerminology_Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Terminology_Package.eNS_URI, theTerminology_Package);
		return theTerminology_Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyElement() {
		return terminologyElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyPackage() {
		return terminologyPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyPackage_TerminologyElement() {
		return (EReference)terminologyPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyPackageInterface() {
		return terminologyPackageInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminologyPackageInterface_Implements() {
		return (EReference)terminologyPackageInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminologyAsset() {
		return terminologyAssetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTerminologyAsset_Value() {
		return (EAttribute)terminologyAssetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcept() {
		return conceptEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConcept_Concept() {
		return (EReference)conceptEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstance() {
		return instanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInstance_Concept() {
		return (EReference)instanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Terminology_Factory getTerminology_Factory() {
		return (Terminology_Factory)getEFactoryInstance();
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
		terminologyElementEClass = createEClass(TERMINOLOGY_ELEMENT);

		terminologyPackageEClass = createEClass(TERMINOLOGY_PACKAGE);
		createEReference(terminologyPackageEClass, TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT);

		terminologyPackageInterfaceEClass = createEClass(TERMINOLOGY_PACKAGE_INTERFACE);
		createEReference(terminologyPackageInterfaceEClass, TERMINOLOGY_PACKAGE_INTERFACE__IMPLEMENTS);

		terminologyAssetEClass = createEClass(TERMINOLOGY_ASSET);
		createEAttribute(terminologyAssetEClass, TERMINOLOGY_ASSET__VALUE);

		conceptEClass = createEClass(CONCEPT);
		createEReference(conceptEClass, CONCEPT__CONCEPT);

		instanceEClass = createEClass(INSTANCE);
		createEReference(instanceEClass, INSTANCE__CONCEPT);
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
		terminologyElementEClass.getESuperTypes().add(theBase_Package.getArtifactElement());
		terminologyPackageEClass.getESuperTypes().add(this.getTerminologyElement());
		terminologyPackageInterfaceEClass.getESuperTypes().add(this.getTerminologyPackage());
		terminologyAssetEClass.getESuperTypes().add(this.getTerminologyElement());
		conceptEClass.getESuperTypes().add(this.getTerminologyAsset());
		instanceEClass.getESuperTypes().add(this.getTerminologyAsset());

		// Initialize classes, features, and operations; add parameters
		initEClass(terminologyElementEClass, TerminologyElement.class, "TerminologyElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(terminologyPackageEClass, TerminologyPackage.class, "TerminologyPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminologyPackage_TerminologyElement(), this.getTerminologyElement(), null, "terminologyElement", null, 0, -1, TerminologyPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminologyPackageInterfaceEClass, TerminologyPackageInterface.class, "TerminologyPackageInterface", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTerminologyPackageInterface_Implements(), this.getTerminologyPackage(), null, "implements", null, 1, 1, TerminologyPackageInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(terminologyAssetEClass, TerminologyAsset.class, "TerminologyAsset", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTerminologyAsset_Value(), ecorePackage.getEString(), "value", null, 1, 1, TerminologyAsset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conceptEClass, Concept.class, "Concept", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConcept_Concept(), this.getConcept(), null, "concept", null, 0, -1, Concept.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instanceEClass, Instance.class, "Instance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInstance_Concept(), this.getConcept(), null, "concept", null, 0, 1, Instance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Terminology_PackageImpl
