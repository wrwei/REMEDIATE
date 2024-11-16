/**
 */
package terminology;

import base.Base_Package;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see terminology.Terminology_Factory
 * @model kind="package"
 * @generated
 */
public interface Terminology_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "terminology";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sawg.org/terminology";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "terminology_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Terminology_Package eINSTANCE = terminology.impl.Terminology_PackageImpl.init();

	/**
	 * The meta object id for the '{@link terminology.impl.TerminologyElementImpl <em>Terminology Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terminology.impl.TerminologyElementImpl
	 * @see terminology.impl.Terminology_PackageImpl#getTerminologyElement()
	 * @generated
	 */
	int TERMINOLOGY_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__GID = Base_Package.ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__IS_CITATION = Base_Package.ARTIFACT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__IS_ABSTRACT = Base_Package.ARTIFACT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__CITED_ELEMENT = Base_Package.ARTIFACT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__NAME = Base_Package.ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__DESCRIPTION = Base_Package.ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__CONSTRAINT = Base_Package.ARTIFACT_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__NOTE = Base_Package.ARTIFACT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__TAGGED_VALUE = Base_Package.ARTIFACT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT__EXTERNAL_REFERENCE = Base_Package.ARTIFACT_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The number of structural features of the '<em>Terminology Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT_FEATURE_COUNT = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Terminology Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ELEMENT_OPERATION_COUNT = Base_Package.ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link terminology.impl.TerminologyPackageImpl <em>Terminology Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terminology.impl.TerminologyPackageImpl
	 * @see terminology.impl.Terminology_PackageImpl#getTerminologyPackage()
	 * @generated
	 */
	int TERMINOLOGY_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__GID = TERMINOLOGY_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__IS_CITATION = TERMINOLOGY_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__IS_ABSTRACT = TERMINOLOGY_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__CITED_ELEMENT = TERMINOLOGY_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__NAME = TERMINOLOGY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__DESCRIPTION = TERMINOLOGY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__CONSTRAINT = TERMINOLOGY_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__NOTE = TERMINOLOGY_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__TAGGED_VALUE = TERMINOLOGY_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__EXTERNAL_REFERENCE = TERMINOLOGY_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Terminology Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT = TERMINOLOGY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminology Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_FEATURE_COUNT = TERMINOLOGY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Terminology Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_OPERATION_COUNT = TERMINOLOGY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link terminology.impl.TerminologyPackageInterfaceImpl <em>Terminology Package Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terminology.impl.TerminologyPackageInterfaceImpl
	 * @see terminology.impl.Terminology_PackageImpl#getTerminologyPackageInterface()
	 * @generated
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__GID = TERMINOLOGY_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__IS_CITATION = TERMINOLOGY_PACKAGE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__IS_ABSTRACT = TERMINOLOGY_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__CITED_ELEMENT = TERMINOLOGY_PACKAGE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__NAME = TERMINOLOGY_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__DESCRIPTION = TERMINOLOGY_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__CONSTRAINT = TERMINOLOGY_PACKAGE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__NOTE = TERMINOLOGY_PACKAGE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__TAGGED_VALUE = TERMINOLOGY_PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__EXTERNAL_REFERENCE = TERMINOLOGY_PACKAGE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Terminology Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__TERMINOLOGY_ELEMENT = TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE__IMPLEMENTS = TERMINOLOGY_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminology Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE_FEATURE_COUNT = TERMINOLOGY_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Terminology Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_PACKAGE_INTERFACE_OPERATION_COUNT = TERMINOLOGY_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link terminology.impl.TerminologyAssetImpl <em>Terminology Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terminology.impl.TerminologyAssetImpl
	 * @see terminology.impl.Terminology_PackageImpl#getTerminologyAsset()
	 * @generated
	 */
	int TERMINOLOGY_ASSET = 3;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__GID = TERMINOLOGY_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__IS_CITATION = TERMINOLOGY_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__IS_ABSTRACT = TERMINOLOGY_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__CITED_ELEMENT = TERMINOLOGY_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__NAME = TERMINOLOGY_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__DESCRIPTION = TERMINOLOGY_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__CONSTRAINT = TERMINOLOGY_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__NOTE = TERMINOLOGY_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__TAGGED_VALUE = TERMINOLOGY_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__EXTERNAL_REFERENCE = TERMINOLOGY_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET__VALUE = TERMINOLOGY_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Terminology Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET_FEATURE_COUNT = TERMINOLOGY_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Terminology Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERMINOLOGY_ASSET_OPERATION_COUNT = TERMINOLOGY_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link terminology.impl.ConceptImpl <em>Concept</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terminology.impl.ConceptImpl
	 * @see terminology.impl.Terminology_PackageImpl#getConcept()
	 * @generated
	 */
	int CONCEPT = 4;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__GID = TERMINOLOGY_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__IS_CITATION = TERMINOLOGY_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__IS_ABSTRACT = TERMINOLOGY_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__CITED_ELEMENT = TERMINOLOGY_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__NAME = TERMINOLOGY_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__DESCRIPTION = TERMINOLOGY_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__CONSTRAINT = TERMINOLOGY_ASSET__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__NOTE = TERMINOLOGY_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__TAGGED_VALUE = TERMINOLOGY_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__EXTERNAL_REFERENCE = TERMINOLOGY_ASSET__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__VALUE = TERMINOLOGY_ASSET__VALUE;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT__CONCEPT = TERMINOLOGY_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_FEATURE_COUNT = TERMINOLOGY_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Concept</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCEPT_OPERATION_COUNT = TERMINOLOGY_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link terminology.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see terminology.impl.InstanceImpl
	 * @see terminology.impl.Terminology_PackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 5;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__GID = TERMINOLOGY_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__IS_CITATION = TERMINOLOGY_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__IS_ABSTRACT = TERMINOLOGY_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__CITED_ELEMENT = TERMINOLOGY_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NAME = TERMINOLOGY_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__DESCRIPTION = TERMINOLOGY_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__CONSTRAINT = TERMINOLOGY_ASSET__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__NOTE = TERMINOLOGY_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__TAGGED_VALUE = TERMINOLOGY_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__EXTERNAL_REFERENCE = TERMINOLOGY_ASSET__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__VALUE = TERMINOLOGY_ASSET__VALUE;

	/**
	 * The feature id for the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE__CONCEPT = TERMINOLOGY_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = TERMINOLOGY_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OPERATION_COUNT = TERMINOLOGY_ASSET_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link terminology.TerminologyElement <em>Terminology Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Element</em>'.
	 * @see terminology.TerminologyElement
	 * @generated
	 */
	EClass getTerminologyElement();

	/**
	 * Returns the meta object for class '{@link terminology.TerminologyPackage <em>Terminology Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Package</em>'.
	 * @see terminology.TerminologyPackage
	 * @generated
	 */
	EClass getTerminologyPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link terminology.TerminologyPackage#getTerminologyElement <em>Terminology Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Terminology Element</em>'.
	 * @see terminology.TerminologyPackage#getTerminologyElement()
	 * @see #getTerminologyPackage()
	 * @generated
	 */
	EReference getTerminologyPackage_TerminologyElement();

	/**
	 * Returns the meta object for class '{@link terminology.TerminologyPackageInterface <em>Terminology Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Package Interface</em>'.
	 * @see terminology.TerminologyPackageInterface
	 * @generated
	 */
	EClass getTerminologyPackageInterface();

	/**
	 * Returns the meta object for the reference '{@link terminology.TerminologyPackageInterface#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Implements</em>'.
	 * @see terminology.TerminologyPackageInterface#getImplements()
	 * @see #getTerminologyPackageInterface()
	 * @generated
	 */
	EReference getTerminologyPackageInterface_Implements();

	/**
	 * Returns the meta object for class '{@link terminology.TerminologyAsset <em>Terminology Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Terminology Asset</em>'.
	 * @see terminology.TerminologyAsset
	 * @generated
	 */
	EClass getTerminologyAsset();

	/**
	 * Returns the meta object for the attribute '{@link terminology.TerminologyAsset#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see terminology.TerminologyAsset#getValue()
	 * @see #getTerminologyAsset()
	 * @generated
	 */
	EAttribute getTerminologyAsset_Value();

	/**
	 * Returns the meta object for class '{@link terminology.Concept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concept</em>'.
	 * @see terminology.Concept
	 * @generated
	 */
	EClass getConcept();

	/**
	 * Returns the meta object for the containment reference list '{@link terminology.Concept#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concept</em>'.
	 * @see terminology.Concept#getConcept()
	 * @see #getConcept()
	 * @generated
	 */
	EReference getConcept_Concept();

	/**
	 * Returns the meta object for class '{@link terminology.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see terminology.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the reference '{@link terminology.Instance#getConcept <em>Concept</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Concept</em>'.
	 * @see terminology.Instance#getConcept()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Concept();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Terminology_Factory getTerminology_Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link terminology.impl.TerminologyElementImpl <em>Terminology Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terminology.impl.TerminologyElementImpl
		 * @see terminology.impl.Terminology_PackageImpl#getTerminologyElement()
		 * @generated
		 */
		EClass TERMINOLOGY_ELEMENT = eINSTANCE.getTerminologyElement();

		/**
		 * The meta object literal for the '{@link terminology.impl.TerminologyPackageImpl <em>Terminology Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terminology.impl.TerminologyPackageImpl
		 * @see terminology.impl.Terminology_PackageImpl#getTerminologyPackage()
		 * @generated
		 */
		EClass TERMINOLOGY_PACKAGE = eINSTANCE.getTerminologyPackage();

		/**
		 * The meta object literal for the '<em><b>Terminology Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINOLOGY_PACKAGE__TERMINOLOGY_ELEMENT = eINSTANCE.getTerminologyPackage_TerminologyElement();

		/**
		 * The meta object literal for the '{@link terminology.impl.TerminologyPackageInterfaceImpl <em>Terminology Package Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terminology.impl.TerminologyPackageInterfaceImpl
		 * @see terminology.impl.Terminology_PackageImpl#getTerminologyPackageInterface()
		 * @generated
		 */
		EClass TERMINOLOGY_PACKAGE_INTERFACE = eINSTANCE.getTerminologyPackageInterface();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERMINOLOGY_PACKAGE_INTERFACE__IMPLEMENTS = eINSTANCE.getTerminologyPackageInterface_Implements();

		/**
		 * The meta object literal for the '{@link terminology.impl.TerminologyAssetImpl <em>Terminology Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terminology.impl.TerminologyAssetImpl
		 * @see terminology.impl.Terminology_PackageImpl#getTerminologyAsset()
		 * @generated
		 */
		EClass TERMINOLOGY_ASSET = eINSTANCE.getTerminologyAsset();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERMINOLOGY_ASSET__VALUE = eINSTANCE.getTerminologyAsset_Value();

		/**
		 * The meta object literal for the '{@link terminology.impl.ConceptImpl <em>Concept</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terminology.impl.ConceptImpl
		 * @see terminology.impl.Terminology_PackageImpl#getConcept()
		 * @generated
		 */
		EClass CONCEPT = eINSTANCE.getConcept();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONCEPT__CONCEPT = eINSTANCE.getConcept_Concept();

		/**
		 * The meta object literal for the '{@link terminology.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see terminology.impl.InstanceImpl
		 * @see terminology.impl.Terminology_PackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Concept</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE__CONCEPT = eINSTANCE.getInstance_Concept();

	}

} //Terminology_Package
