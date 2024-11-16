/**
 */
package requirement;

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
 * @see requirement.Requirement_Factory
 * @model kind="package"
 * @generated
 */
public interface Requirement_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "requirement";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sawg.org/requirement";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "requirement_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Requirement_Package eINSTANCE = requirement.impl.Requirement_PackageImpl.init();

	/**
	 * The meta object id for the '{@link requirement.impl.RequirementAssetImpl <em>Requirement Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirement.impl.RequirementAssetImpl
	 * @see requirement.impl.Requirement_PackageImpl#getRequirementAsset()
	 * @generated
	 */
	int REQUIREMENT_ASSET = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ASSET__GID = Base_Package.ARTIFACT_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ASSET__IS_CITATION = Base_Package.ARTIFACT_ELEMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ASSET__IS_ABSTRACT = Base_Package.ARTIFACT_ELEMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ASSET__CITED_ELEMENT = Base_Package.ARTIFACT_ELEMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ASSET__NAME = Base_Package.ARTIFACT_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ASSET__DESCRIPTION = Base_Package.ARTIFACT_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ASSET__CONSTRAINT = Base_Package.ARTIFACT_ELEMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ASSET__NOTE = Base_Package.ARTIFACT_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ASSET__TAGGED_VALUE = Base_Package.ARTIFACT_ELEMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ASSET__EXTERNAL_REFERENCE = Base_Package.ARTIFACT_ELEMENT__EXTERNAL_REFERENCE;

	/**
	 * The number of structural features of the '<em>Requirement Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ASSET_FEATURE_COUNT = Base_Package.ARTIFACT_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Requirement Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_ASSET_OPERATION_COUNT = Base_Package.ARTIFACT_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirement.impl.RequirementPackageImpl <em>Requirement Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirement.impl.RequirementPackageImpl
	 * @see requirement.impl.Requirement_PackageImpl#getRequirementPackage()
	 * @generated
	 */
	int REQUIREMENT_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE__GID = REQUIREMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE__IS_CITATION = REQUIREMENT_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE__IS_ABSTRACT = REQUIREMENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE__CITED_ELEMENT = REQUIREMENT_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE__NAME = REQUIREMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE__DESCRIPTION = REQUIREMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE__CONSTRAINT = REQUIREMENT_ASSET__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE__NOTE = REQUIREMENT_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE__TAGGED_VALUE = REQUIREMENT_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE__EXTERNAL_REFERENCE = REQUIREMENT_ASSET__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Requirement Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE__REQUIREMENT_ASSET = REQUIREMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE__INTERFACES = REQUIREMENT_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Requirement Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_FEATURE_COUNT = REQUIREMENT_ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Requirement Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_OPERATION_COUNT = REQUIREMENT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirement.impl.RequirementPackageInterfaceImpl <em>Requirement Package Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirement.impl.RequirementPackageInterfaceImpl
	 * @see requirement.impl.Requirement_PackageImpl#getRequirementPackageInterface()
	 * @generated
	 */
	int REQUIREMENT_PACKAGE_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_INTERFACE__GID = REQUIREMENT_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_INTERFACE__IS_CITATION = REQUIREMENT_PACKAGE__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_INTERFACE__IS_ABSTRACT = REQUIREMENT_PACKAGE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_INTERFACE__CITED_ELEMENT = REQUIREMENT_PACKAGE__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_INTERFACE__NAME = REQUIREMENT_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_INTERFACE__DESCRIPTION = REQUIREMENT_PACKAGE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_INTERFACE__CONSTRAINT = REQUIREMENT_PACKAGE__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_INTERFACE__NOTE = REQUIREMENT_PACKAGE__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_INTERFACE__TAGGED_VALUE = REQUIREMENT_PACKAGE__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_INTERFACE__EXTERNAL_REFERENCE = REQUIREMENT_PACKAGE__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Requirement Asset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_INTERFACE__REQUIREMENT_ASSET = REQUIREMENT_PACKAGE__REQUIREMENT_ASSET;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_INTERFACE__INTERFACES = REQUIREMENT_PACKAGE__INTERFACES;

	/**
	 * The feature id for the '<em><b>Interface Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_INTERFACE__INTERFACE_OF = REQUIREMENT_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Requirement Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_INTERFACE_FEATURE_COUNT = REQUIREMENT_PACKAGE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Requirement Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_PACKAGE_INTERFACE_OPERATION_COUNT = REQUIREMENT_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirement.impl.RequirementUtilityAssetImpl <em>Requirement Utility Asset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirement.impl.RequirementUtilityAssetImpl
	 * @see requirement.impl.Requirement_PackageImpl#getRequirementUtilityAsset()
	 * @generated
	 */
	int REQUIREMENT_UTILITY_ASSET = 3;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_UTILITY_ASSET__GID = REQUIREMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_UTILITY_ASSET__IS_CITATION = REQUIREMENT_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_UTILITY_ASSET__IS_ABSTRACT = REQUIREMENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_UTILITY_ASSET__CITED_ELEMENT = REQUIREMENT_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_UTILITY_ASSET__NAME = REQUIREMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_UTILITY_ASSET__DESCRIPTION = REQUIREMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_UTILITY_ASSET__CONSTRAINT = REQUIREMENT_ASSET__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_UTILITY_ASSET__NOTE = REQUIREMENT_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_UTILITY_ASSET__TAGGED_VALUE = REQUIREMENT_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_UTILITY_ASSET__EXTERNAL_REFERENCE = REQUIREMENT_ASSET__EXTERNAL_REFERENCE;

	/**
	 * The number of structural features of the '<em>Requirement Utility Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_UTILITY_ASSET_FEATURE_COUNT = REQUIREMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Requirement Utility Asset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_UTILITY_ASSET_OPERATION_COUNT = REQUIREMENT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirement.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirement.impl.CategoryImpl
	 * @see requirement.impl.Requirement_PackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 4;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__GID = REQUIREMENT_UTILITY_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__IS_CITATION = REQUIREMENT_UTILITY_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__IS_ABSTRACT = REQUIREMENT_UTILITY_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CITED_ELEMENT = REQUIREMENT_UTILITY_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NAME = REQUIREMENT_UTILITY_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__DESCRIPTION = REQUIREMENT_UTILITY_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__CONSTRAINT = REQUIREMENT_UTILITY_ASSET__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__NOTE = REQUIREMENT_UTILITY_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__TAGGED_VALUE = REQUIREMENT_UTILITY_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__EXTERNAL_REFERENCE = REQUIREMENT_UTILITY_ASSET__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Sub category</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY__SUB_CATEGORY = REQUIREMENT_UTILITY_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = REQUIREMENT_UTILITY_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = REQUIREMENT_UTILITY_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirement.impl.StakeholderImpl <em>Stakeholder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirement.impl.StakeholderImpl
	 * @see requirement.impl.Requirement_PackageImpl#getStakeholder()
	 * @generated
	 */
	int STAKEHOLDER = 5;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__GID = REQUIREMENT_UTILITY_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__IS_CITATION = REQUIREMENT_UTILITY_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__IS_ABSTRACT = REQUIREMENT_UTILITY_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__CITED_ELEMENT = REQUIREMENT_UTILITY_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__NAME = REQUIREMENT_UTILITY_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__DESCRIPTION = REQUIREMENT_UTILITY_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__CONSTRAINT = REQUIREMENT_UTILITY_ASSET__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__NOTE = REQUIREMENT_UTILITY_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__TAGGED_VALUE = REQUIREMENT_UTILITY_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER__EXTERNAL_REFERENCE = REQUIREMENT_UTILITY_ASSET__EXTERNAL_REFERENCE;

	/**
	 * The number of structural features of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_FEATURE_COUNT = REQUIREMENT_UTILITY_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Stakeholder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAKEHOLDER_OPERATION_COUNT = REQUIREMENT_UTILITY_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirement.impl.GlossaryImpl <em>Glossary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirement.impl.GlossaryImpl
	 * @see requirement.impl.Requirement_PackageImpl#getGlossary()
	 * @generated
	 */
	int GLOSSARY = 6;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__GID = REQUIREMENT_UTILITY_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__IS_CITATION = REQUIREMENT_UTILITY_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__IS_ABSTRACT = REQUIREMENT_UTILITY_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__CITED_ELEMENT = REQUIREMENT_UTILITY_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__NAME = REQUIREMENT_UTILITY_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__DESCRIPTION = REQUIREMENT_UTILITY_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__CONSTRAINT = REQUIREMENT_UTILITY_ASSET__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__NOTE = REQUIREMENT_UTILITY_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__TAGGED_VALUE = REQUIREMENT_UTILITY_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__EXTERNAL_REFERENCE = REQUIREMENT_UTILITY_ASSET__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY__ENTRIES = REQUIREMENT_UTILITY_ASSET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Glossary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_FEATURE_COUNT = REQUIREMENT_UTILITY_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Glossary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_OPERATION_COUNT = REQUIREMENT_UTILITY_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirement.impl.GlossaryEntryImpl <em>Glossary Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirement.impl.GlossaryEntryImpl
	 * @see requirement.impl.Requirement_PackageImpl#getGlossaryEntry()
	 * @generated
	 */
	int GLOSSARY_ENTRY = 7;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__GID = REQUIREMENT_UTILITY_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__IS_CITATION = REQUIREMENT_UTILITY_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__IS_ABSTRACT = REQUIREMENT_UTILITY_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__CITED_ELEMENT = REQUIREMENT_UTILITY_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__NAME = REQUIREMENT_UTILITY_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__DESCRIPTION = REQUIREMENT_UTILITY_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__CONSTRAINT = REQUIREMENT_UTILITY_ASSET__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__NOTE = REQUIREMENT_UTILITY_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__TAGGED_VALUE = REQUIREMENT_UTILITY_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__EXTERNAL_REFERENCE = REQUIREMENT_UTILITY_ASSET__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__TERM = REQUIREMENT_UTILITY_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY__PITCH = REQUIREMENT_UTILITY_ASSET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Glossary Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY_FEATURE_COUNT = REQUIREMENT_UTILITY_ASSET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Glossary Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOSSARY_ENTRY_OPERATION_COUNT = REQUIREMENT_UTILITY_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirement.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirement.impl.RequirementImpl
	 * @see requirement.impl.Requirement_PackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 8;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__GID = REQUIREMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IS_CITATION = REQUIREMENT_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__IS_ABSTRACT = REQUIREMENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CITED_ELEMENT = REQUIREMENT_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NAME = REQUIREMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DESCRIPTION = REQUIREMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CONSTRAINT = REQUIREMENT_ASSET__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__NOTE = REQUIREMENT_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TAGGED_VALUE = REQUIREMENT_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__EXTERNAL_REFERENCE = REQUIREMENT_ASSET__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SATISFIED = REQUIREMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PRIORITY = REQUIREMENT_ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CATEGORY = REQUIREMENT_ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__STAKEHOLDERS = REQUIREMENT_ASSET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Sub requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SUB_REQUIREMENT = REQUIREMENT_ASSET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dependent requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DEPENDENT_REQUIREMENT = REQUIREMENT_ASSET_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = REQUIREMENT_ASSET_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = REQUIREMENT_ASSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirement.impl.UserRequirementImpl <em>User Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirement.impl.UserRequirementImpl
	 * @see requirement.impl.Requirement_PackageImpl#getUserRequirement()
	 * @generated
	 */
	int USER_REQUIREMENT = 9;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REQUIREMENT__GID = REQUIREMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REQUIREMENT__IS_CITATION = REQUIREMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REQUIREMENT__IS_ABSTRACT = REQUIREMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REQUIREMENT__CITED_ELEMENT = REQUIREMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REQUIREMENT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REQUIREMENT__CONSTRAINT = REQUIREMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REQUIREMENT__NOTE = REQUIREMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REQUIREMENT__TAGGED_VALUE = REQUIREMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REQUIREMENT__EXTERNAL_REFERENCE = REQUIREMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REQUIREMENT__SATISFIED = REQUIREMENT__SATISFIED;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REQUIREMENT__PRIORITY = REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REQUIREMENT__CATEGORY = REQUIREMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REQUIREMENT__STAKEHOLDERS = REQUIREMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Sub requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REQUIREMENT__SUB_REQUIREMENT = REQUIREMENT__SUB_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Dependent requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REQUIREMENT__DEPENDENT_REQUIREMENT = REQUIREMENT__DEPENDENT_REQUIREMENT;

	/**
	 * The number of structural features of the '<em>User Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirement.impl.SystemRequirementImpl <em>System Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirement.impl.SystemRequirementImpl
	 * @see requirement.impl.Requirement_PackageImpl#getSystemRequirement()
	 * @generated
	 */
	int SYSTEM_REQUIREMENT = 10;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__GID = REQUIREMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__IS_CITATION = REQUIREMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__IS_ABSTRACT = REQUIREMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__CITED_ELEMENT = REQUIREMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__NAME = REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__DESCRIPTION = REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__CONSTRAINT = REQUIREMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__NOTE = REQUIREMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__TAGGED_VALUE = REQUIREMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__EXTERNAL_REFERENCE = REQUIREMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__SATISFIED = REQUIREMENT__SATISFIED;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__PRIORITY = REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__CATEGORY = REQUIREMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__STAKEHOLDERS = REQUIREMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Sub requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__SUB_REQUIREMENT = REQUIREMENT__SUB_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Dependent requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT__DEPENDENT_REQUIREMENT = REQUIREMENT__DEPENDENT_REQUIREMENT;

	/**
	 * The number of structural features of the '<em>System Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT_FEATURE_COUNT = REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>System Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_REQUIREMENT_OPERATION_COUNT = REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirement.impl.FunctionalRequirementImpl <em>Functional Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirement.impl.FunctionalRequirementImpl
	 * @see requirement.impl.Requirement_PackageImpl#getFunctionalRequirement()
	 * @generated
	 */
	int FUNCTIONAL_REQUIREMENT = 11;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__GID = SYSTEM_REQUIREMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__IS_CITATION = SYSTEM_REQUIREMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__IS_ABSTRACT = SYSTEM_REQUIREMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__CITED_ELEMENT = SYSTEM_REQUIREMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__NAME = SYSTEM_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__DESCRIPTION = SYSTEM_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__CONSTRAINT = SYSTEM_REQUIREMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__NOTE = SYSTEM_REQUIREMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__TAGGED_VALUE = SYSTEM_REQUIREMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__EXTERNAL_REFERENCE = SYSTEM_REQUIREMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__SATISFIED = SYSTEM_REQUIREMENT__SATISFIED;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__PRIORITY = SYSTEM_REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__CATEGORY = SYSTEM_REQUIREMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__STAKEHOLDERS = SYSTEM_REQUIREMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Sub requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__SUB_REQUIREMENT = SYSTEM_REQUIREMENT__SUB_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Dependent requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__DEPENDENT_REQUIREMENT = SYSTEM_REQUIREMENT__DEPENDENT_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__FUNCTION = SYSTEM_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__INPUTS = SYSTEM_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__OUTPUTS = SYSTEM_REQUIREMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__SOURCE = SYSTEM_REQUIREMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__DESTINATION = SYSTEM_REQUIREMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__ACTION = SYSTEM_REQUIREMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__REQUIRES = SYSTEM_REQUIREMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pre condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__PRE_CONDITION = SYSTEM_REQUIREMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Post condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__POST_CONDITION = SYSTEM_REQUIREMENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Side effects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT__SIDE_EFFECTS = SYSTEM_REQUIREMENT_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>Functional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT_FEATURE_COUNT = SYSTEM_REQUIREMENT_FEATURE_COUNT + 10;

	/**
	 * The number of operations of the '<em>Functional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_REQUIREMENT_OPERATION_COUNT = SYSTEM_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirement.impl.NonFunctionalRequirementImpl <em>Non Functional Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirement.impl.NonFunctionalRequirementImpl
	 * @see requirement.impl.Requirement_PackageImpl#getNonFunctionalRequirement()
	 * @generated
	 */
	int NON_FUNCTIONAL_REQUIREMENT = 12;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__GID = SYSTEM_REQUIREMENT__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__IS_CITATION = SYSTEM_REQUIREMENT__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__IS_ABSTRACT = SYSTEM_REQUIREMENT__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__CITED_ELEMENT = SYSTEM_REQUIREMENT__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__NAME = SYSTEM_REQUIREMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__DESCRIPTION = SYSTEM_REQUIREMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__CONSTRAINT = SYSTEM_REQUIREMENT__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__NOTE = SYSTEM_REQUIREMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__TAGGED_VALUE = SYSTEM_REQUIREMENT__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__EXTERNAL_REFERENCE = SYSTEM_REQUIREMENT__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Satisfied</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__SATISFIED = SYSTEM_REQUIREMENT__SATISFIED;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__PRIORITY = SYSTEM_REQUIREMENT__PRIORITY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__CATEGORY = SYSTEM_REQUIREMENT__CATEGORY;

	/**
	 * The feature id for the '<em><b>Stakeholders</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__STAKEHOLDERS = SYSTEM_REQUIREMENT__STAKEHOLDERS;

	/**
	 * The feature id for the '<em><b>Sub requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__SUB_REQUIREMENT = SYSTEM_REQUIREMENT__SUB_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Dependent requirement</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__DEPENDENT_REQUIREMENT = SYSTEM_REQUIREMENT__DEPENDENT_REQUIREMENT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT__TYPE = SYSTEM_REQUIREMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Functional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT_FEATURE_COUNT = SYSTEM_REQUIREMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Non Functional Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_FUNCTIONAL_REQUIREMENT_OPERATION_COUNT = SYSTEM_REQUIREMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link requirement.impl.SecondaryRequirementTypeImpl <em>Secondary Requirement Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see requirement.impl.SecondaryRequirementTypeImpl
	 * @see requirement.impl.Requirement_PackageImpl#getSecondaryRequirementType()
	 * @generated
	 */
	int SECONDARY_REQUIREMENT_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__GID = REQUIREMENT_ASSET__GID;

	/**
	 * The feature id for the '<em><b>Is Citation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__IS_CITATION = REQUIREMENT_ASSET__IS_CITATION;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__IS_ABSTRACT = REQUIREMENT_ASSET__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__CITED_ELEMENT = REQUIREMENT_ASSET__CITED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__NAME = REQUIREMENT_ASSET__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__DESCRIPTION = REQUIREMENT_ASSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Constraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__CONSTRAINT = REQUIREMENT_ASSET__CONSTRAINT;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__NOTE = REQUIREMENT_ASSET__NOTE;

	/**
	 * The feature id for the '<em><b>Tagged Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__TAGGED_VALUE = REQUIREMENT_ASSET__TAGGED_VALUE;

	/**
	 * The feature id for the '<em><b>External Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__EXTERNAL_REFERENCE = REQUIREMENT_ASSET__EXTERNAL_REFERENCE;

	/**
	 * The feature id for the '<em><b>Architecture</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__ARCHITECTURE = REQUIREMENT_ASSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Usability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__USABILITY = REQUIREMENT_ASSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Performance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__PERFORMANCE = REQUIREMENT_ASSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__SPACE = REQUIREMENT_ASSET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Dependability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__DEPENDABILITY = REQUIREMENT_ASSET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__SECURITY = REQUIREMENT_ASSET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Environmental</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__ENVIRONMENTAL = REQUIREMENT_ASSET_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Operational</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__OPERATIONAL = REQUIREMENT_ASSET_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Development</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__DEVELOPMENT = REQUIREMENT_ASSET_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Regulatory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__REGULATORY = REQUIREMENT_ASSET_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Ethical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__ETHICAL = REQUIREMENT_ASSET_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Safety</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__SAFETY = REQUIREMENT_ASSET_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Accounting</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE__ACCOUNTING = REQUIREMENT_ASSET_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Secondary Requirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE_FEATURE_COUNT = REQUIREMENT_ASSET_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>Secondary Requirement Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECONDARY_REQUIREMENT_TYPE_OPERATION_COUNT = REQUIREMENT_ASSET_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link requirement.RequirementAsset <em>Requirement Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Asset</em>'.
	 * @see requirement.RequirementAsset
	 * @generated
	 */
	EClass getRequirementAsset();

	/**
	 * Returns the meta object for class '{@link requirement.RequirementPackage <em>Requirement Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Package</em>'.
	 * @see requirement.RequirementPackage
	 * @generated
	 */
	EClass getRequirementPackage();

	/**
	 * Returns the meta object for the containment reference list '{@link requirement.RequirementPackage#getRequirementAsset <em>Requirement Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Asset</em>'.
	 * @see requirement.RequirementPackage#getRequirementAsset()
	 * @see #getRequirementPackage()
	 * @generated
	 */
	EReference getRequirementPackage_RequirementAsset();

	/**
	 * Returns the meta object for the reference list '{@link requirement.RequirementPackage#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interfaces</em>'.
	 * @see requirement.RequirementPackage#getInterfaces()
	 * @see #getRequirementPackage()
	 * @generated
	 */
	EReference getRequirementPackage_Interfaces();

	/**
	 * Returns the meta object for class '{@link requirement.RequirementPackageInterface <em>Requirement Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Package Interface</em>'.
	 * @see requirement.RequirementPackageInterface
	 * @generated
	 */
	EClass getRequirementPackageInterface();

	/**
	 * Returns the meta object for the reference '{@link requirement.RequirementPackageInterface#getInterfaceOf <em>Interface Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interface Of</em>'.
	 * @see requirement.RequirementPackageInterface#getInterfaceOf()
	 * @see #getRequirementPackageInterface()
	 * @generated
	 */
	EReference getRequirementPackageInterface_InterfaceOf();

	/**
	 * Returns the meta object for class '{@link requirement.RequirementUtilityAsset <em>Requirement Utility Asset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Utility Asset</em>'.
	 * @see requirement.RequirementUtilityAsset
	 * @generated
	 */
	EClass getRequirementUtilityAsset();

	/**
	 * Returns the meta object for class '{@link requirement.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see requirement.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for the containment reference list '{@link requirement.Category#getSub_category <em>Sub category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub category</em>'.
	 * @see requirement.Category#getSub_category()
	 * @see #getCategory()
	 * @generated
	 */
	EReference getCategory_Sub_category();

	/**
	 * Returns the meta object for class '{@link requirement.Stakeholder <em>Stakeholder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stakeholder</em>'.
	 * @see requirement.Stakeholder
	 * @generated
	 */
	EClass getStakeholder();

	/**
	 * Returns the meta object for class '{@link requirement.Glossary <em>Glossary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glossary</em>'.
	 * @see requirement.Glossary
	 * @generated
	 */
	EClass getGlossary();

	/**
	 * Returns the meta object for the containment reference list '{@link requirement.Glossary#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see requirement.Glossary#getEntries()
	 * @see #getGlossary()
	 * @generated
	 */
	EReference getGlossary_Entries();

	/**
	 * Returns the meta object for class '{@link requirement.GlossaryEntry <em>Glossary Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Glossary Entry</em>'.
	 * @see requirement.GlossaryEntry
	 * @generated
	 */
	EClass getGlossaryEntry();

	/**
	 * Returns the meta object for the attribute '{@link requirement.GlossaryEntry#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Term</em>'.
	 * @see requirement.GlossaryEntry#getTerm()
	 * @see #getGlossaryEntry()
	 * @generated
	 */
	EAttribute getGlossaryEntry_Term();

	/**
	 * Returns the meta object for the attribute '{@link requirement.GlossaryEntry#getPitch <em>Pitch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pitch</em>'.
	 * @see requirement.GlossaryEntry#getPitch()
	 * @see #getGlossaryEntry()
	 * @generated
	 */
	EAttribute getGlossaryEntry_Pitch();

	/**
	 * Returns the meta object for class '{@link requirement.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see requirement.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link requirement.Requirement#isSatisfied <em>Satisfied</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Satisfied</em>'.
	 * @see requirement.Requirement#isSatisfied()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Satisfied();

	/**
	 * Returns the meta object for the attribute '{@link requirement.Requirement#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see requirement.Requirement#getPriority()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Priority();

	/**
	 * Returns the meta object for the reference list '{@link requirement.Requirement#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Category</em>'.
	 * @see requirement.Requirement#getCategory()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Category();

	/**
	 * Returns the meta object for the reference list '{@link requirement.Requirement#getStakeholders <em>Stakeholders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stakeholders</em>'.
	 * @see requirement.Requirement#getStakeholders()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Stakeholders();

	/**
	 * Returns the meta object for the containment reference list '{@link requirement.Requirement#getSub_requirement <em>Sub requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub requirement</em>'.
	 * @see requirement.Requirement#getSub_requirement()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Sub_requirement();

	/**
	 * Returns the meta object for the reference list '{@link requirement.Requirement#getDependent_requirement <em>Dependent requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dependent requirement</em>'.
	 * @see requirement.Requirement#getDependent_requirement()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Dependent_requirement();

	/**
	 * Returns the meta object for class '{@link requirement.UserRequirement <em>User Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Requirement</em>'.
	 * @see requirement.UserRequirement
	 * @generated
	 */
	EClass getUserRequirement();

	/**
	 * Returns the meta object for class '{@link requirement.SystemRequirement <em>System Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Requirement</em>'.
	 * @see requirement.SystemRequirement
	 * @generated
	 */
	EClass getSystemRequirement();

	/**
	 * Returns the meta object for class '{@link requirement.FunctionalRequirement <em>Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Requirement</em>'.
	 * @see requirement.FunctionalRequirement
	 * @generated
	 */
	EClass getFunctionalRequirement();

	/**
	 * Returns the meta object for the attribute '{@link requirement.FunctionalRequirement#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Function</em>'.
	 * @see requirement.FunctionalRequirement#getFunction()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EAttribute getFunctionalRequirement_Function();

	/**
	 * Returns the meta object for the attribute '{@link requirement.FunctionalRequirement#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inputs</em>'.
	 * @see requirement.FunctionalRequirement#getInputs()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EAttribute getFunctionalRequirement_Inputs();

	/**
	 * Returns the meta object for the attribute '{@link requirement.FunctionalRequirement#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Outputs</em>'.
	 * @see requirement.FunctionalRequirement#getOutputs()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EAttribute getFunctionalRequirement_Outputs();

	/**
	 * Returns the meta object for the attribute '{@link requirement.FunctionalRequirement#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see requirement.FunctionalRequirement#getSource()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EAttribute getFunctionalRequirement_Source();

	/**
	 * Returns the meta object for the attribute '{@link requirement.FunctionalRequirement#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see requirement.FunctionalRequirement#getDestination()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EAttribute getFunctionalRequirement_Destination();

	/**
	 * Returns the meta object for the attribute '{@link requirement.FunctionalRequirement#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see requirement.FunctionalRequirement#getAction()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EAttribute getFunctionalRequirement_Action();

	/**
	 * Returns the meta object for the attribute '{@link requirement.FunctionalRequirement#getRequires <em>Requires</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires</em>'.
	 * @see requirement.FunctionalRequirement#getRequires()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EAttribute getFunctionalRequirement_Requires();

	/**
	 * Returns the meta object for the attribute '{@link requirement.FunctionalRequirement#getPre_condition <em>Pre condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre condition</em>'.
	 * @see requirement.FunctionalRequirement#getPre_condition()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EAttribute getFunctionalRequirement_Pre_condition();

	/**
	 * Returns the meta object for the attribute '{@link requirement.FunctionalRequirement#getPost_condition <em>Post condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post condition</em>'.
	 * @see requirement.FunctionalRequirement#getPost_condition()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EAttribute getFunctionalRequirement_Post_condition();

	/**
	 * Returns the meta object for the attribute '{@link requirement.FunctionalRequirement#getSide_effects <em>Side effects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side effects</em>'.
	 * @see requirement.FunctionalRequirement#getSide_effects()
	 * @see #getFunctionalRequirement()
	 * @generated
	 */
	EAttribute getFunctionalRequirement_Side_effects();

	/**
	 * Returns the meta object for class '{@link requirement.NonFunctionalRequirement <em>Non Functional Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Functional Requirement</em>'.
	 * @see requirement.NonFunctionalRequirement
	 * @generated
	 */
	EClass getNonFunctionalRequirement();

	/**
	 * Returns the meta object for the containment reference '{@link requirement.NonFunctionalRequirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see requirement.NonFunctionalRequirement#getType()
	 * @see #getNonFunctionalRequirement()
	 * @generated
	 */
	EReference getNonFunctionalRequirement_Type();

	/**
	 * Returns the meta object for class '{@link requirement.SecondaryRequirementType <em>Secondary Requirement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Secondary Requirement Type</em>'.
	 * @see requirement.SecondaryRequirementType
	 * @generated
	 */
	EClass getSecondaryRequirementType();

	/**
	 * Returns the meta object for the attribute '{@link requirement.SecondaryRequirementType#isArchitecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Architecture</em>'.
	 * @see requirement.SecondaryRequirementType#isArchitecture()
	 * @see #getSecondaryRequirementType()
	 * @generated
	 */
	EAttribute getSecondaryRequirementType_Architecture();

	/**
	 * Returns the meta object for the attribute '{@link requirement.SecondaryRequirementType#isUsability <em>Usability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usability</em>'.
	 * @see requirement.SecondaryRequirementType#isUsability()
	 * @see #getSecondaryRequirementType()
	 * @generated
	 */
	EAttribute getSecondaryRequirementType_Usability();

	/**
	 * Returns the meta object for the attribute '{@link requirement.SecondaryRequirementType#isPerformance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performance</em>'.
	 * @see requirement.SecondaryRequirementType#isPerformance()
	 * @see #getSecondaryRequirementType()
	 * @generated
	 */
	EAttribute getSecondaryRequirementType_Performance();

	/**
	 * Returns the meta object for the attribute '{@link requirement.SecondaryRequirementType#isSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see requirement.SecondaryRequirementType#isSpace()
	 * @see #getSecondaryRequirementType()
	 * @generated
	 */
	EAttribute getSecondaryRequirementType_Space();

	/**
	 * Returns the meta object for the attribute '{@link requirement.SecondaryRequirementType#isDependability <em>Dependability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependability</em>'.
	 * @see requirement.SecondaryRequirementType#isDependability()
	 * @see #getSecondaryRequirementType()
	 * @generated
	 */
	EAttribute getSecondaryRequirementType_Dependability();

	/**
	 * Returns the meta object for the attribute '{@link requirement.SecondaryRequirementType#isSecurity <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Security</em>'.
	 * @see requirement.SecondaryRequirementType#isSecurity()
	 * @see #getSecondaryRequirementType()
	 * @generated
	 */
	EAttribute getSecondaryRequirementType_Security();

	/**
	 * Returns the meta object for the attribute '{@link requirement.SecondaryRequirementType#isEnvironmental <em>Environmental</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Environmental</em>'.
	 * @see requirement.SecondaryRequirementType#isEnvironmental()
	 * @see #getSecondaryRequirementType()
	 * @generated
	 */
	EAttribute getSecondaryRequirementType_Environmental();

	/**
	 * Returns the meta object for the attribute '{@link requirement.SecondaryRequirementType#isOperational <em>Operational</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operational</em>'.
	 * @see requirement.SecondaryRequirementType#isOperational()
	 * @see #getSecondaryRequirementType()
	 * @generated
	 */
	EAttribute getSecondaryRequirementType_Operational();

	/**
	 * Returns the meta object for the attribute '{@link requirement.SecondaryRequirementType#isDevelopment <em>Development</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Development</em>'.
	 * @see requirement.SecondaryRequirementType#isDevelopment()
	 * @see #getSecondaryRequirementType()
	 * @generated
	 */
	EAttribute getSecondaryRequirementType_Development();

	/**
	 * Returns the meta object for the attribute '{@link requirement.SecondaryRequirementType#isRegulatory <em>Regulatory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regulatory</em>'.
	 * @see requirement.SecondaryRequirementType#isRegulatory()
	 * @see #getSecondaryRequirementType()
	 * @generated
	 */
	EAttribute getSecondaryRequirementType_Regulatory();

	/**
	 * Returns the meta object for the attribute '{@link requirement.SecondaryRequirementType#isEthical <em>Ethical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ethical</em>'.
	 * @see requirement.SecondaryRequirementType#isEthical()
	 * @see #getSecondaryRequirementType()
	 * @generated
	 */
	EAttribute getSecondaryRequirementType_Ethical();

	/**
	 * Returns the meta object for the attribute '{@link requirement.SecondaryRequirementType#isSafety <em>Safety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Safety</em>'.
	 * @see requirement.SecondaryRequirementType#isSafety()
	 * @see #getSecondaryRequirementType()
	 * @generated
	 */
	EAttribute getSecondaryRequirementType_Safety();

	/**
	 * Returns the meta object for the attribute '{@link requirement.SecondaryRequirementType#isAccounting <em>Accounting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accounting</em>'.
	 * @see requirement.SecondaryRequirementType#isAccounting()
	 * @see #getSecondaryRequirementType()
	 * @generated
	 */
	EAttribute getSecondaryRequirementType_Accounting();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Requirement_Factory getRequirement_Factory();

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
		 * The meta object literal for the '{@link requirement.impl.RequirementAssetImpl <em>Requirement Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirement.impl.RequirementAssetImpl
		 * @see requirement.impl.Requirement_PackageImpl#getRequirementAsset()
		 * @generated
		 */
		EClass REQUIREMENT_ASSET = eINSTANCE.getRequirementAsset();

		/**
		 * The meta object literal for the '{@link requirement.impl.RequirementPackageImpl <em>Requirement Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirement.impl.RequirementPackageImpl
		 * @see requirement.impl.Requirement_PackageImpl#getRequirementPackage()
		 * @generated
		 */
		EClass REQUIREMENT_PACKAGE = eINSTANCE.getRequirementPackage();

		/**
		 * The meta object literal for the '<em><b>Requirement Asset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_PACKAGE__REQUIREMENT_ASSET = eINSTANCE.getRequirementPackage_RequirementAsset();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_PACKAGE__INTERFACES = eINSTANCE.getRequirementPackage_Interfaces();

		/**
		 * The meta object literal for the '{@link requirement.impl.RequirementPackageInterfaceImpl <em>Requirement Package Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirement.impl.RequirementPackageInterfaceImpl
		 * @see requirement.impl.Requirement_PackageImpl#getRequirementPackageInterface()
		 * @generated
		 */
		EClass REQUIREMENT_PACKAGE_INTERFACE = eINSTANCE.getRequirementPackageInterface();

		/**
		 * The meta object literal for the '<em><b>Interface Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_PACKAGE_INTERFACE__INTERFACE_OF = eINSTANCE.getRequirementPackageInterface_InterfaceOf();

		/**
		 * The meta object literal for the '{@link requirement.impl.RequirementUtilityAssetImpl <em>Requirement Utility Asset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirement.impl.RequirementUtilityAssetImpl
		 * @see requirement.impl.Requirement_PackageImpl#getRequirementUtilityAsset()
		 * @generated
		 */
		EClass REQUIREMENT_UTILITY_ASSET = eINSTANCE.getRequirementUtilityAsset();

		/**
		 * The meta object literal for the '{@link requirement.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirement.impl.CategoryImpl
		 * @see requirement.impl.Requirement_PackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();

		/**
		 * The meta object literal for the '<em><b>Sub category</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CATEGORY__SUB_CATEGORY = eINSTANCE.getCategory_Sub_category();

		/**
		 * The meta object literal for the '{@link requirement.impl.StakeholderImpl <em>Stakeholder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirement.impl.StakeholderImpl
		 * @see requirement.impl.Requirement_PackageImpl#getStakeholder()
		 * @generated
		 */
		EClass STAKEHOLDER = eINSTANCE.getStakeholder();

		/**
		 * The meta object literal for the '{@link requirement.impl.GlossaryImpl <em>Glossary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirement.impl.GlossaryImpl
		 * @see requirement.impl.Requirement_PackageImpl#getGlossary()
		 * @generated
		 */
		EClass GLOSSARY = eINSTANCE.getGlossary();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOSSARY__ENTRIES = eINSTANCE.getGlossary_Entries();

		/**
		 * The meta object literal for the '{@link requirement.impl.GlossaryEntryImpl <em>Glossary Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirement.impl.GlossaryEntryImpl
		 * @see requirement.impl.Requirement_PackageImpl#getGlossaryEntry()
		 * @generated
		 */
		EClass GLOSSARY_ENTRY = eINSTANCE.getGlossaryEntry();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOSSARY_ENTRY__TERM = eINSTANCE.getGlossaryEntry_Term();

		/**
		 * The meta object literal for the '<em><b>Pitch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GLOSSARY_ENTRY__PITCH = eINSTANCE.getGlossaryEntry_Pitch();

		/**
		 * The meta object literal for the '{@link requirement.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirement.impl.RequirementImpl
		 * @see requirement.impl.Requirement_PackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>Satisfied</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__SATISFIED = eINSTANCE.getRequirement_Satisfied();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__PRIORITY = eINSTANCE.getRequirement_Priority();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__CATEGORY = eINSTANCE.getRequirement_Category();

		/**
		 * The meta object literal for the '<em><b>Stakeholders</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__STAKEHOLDERS = eINSTANCE.getRequirement_Stakeholders();

		/**
		 * The meta object literal for the '<em><b>Sub requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__SUB_REQUIREMENT = eINSTANCE.getRequirement_Sub_requirement();

		/**
		 * The meta object literal for the '<em><b>Dependent requirement</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__DEPENDENT_REQUIREMENT = eINSTANCE.getRequirement_Dependent_requirement();

		/**
		 * The meta object literal for the '{@link requirement.impl.UserRequirementImpl <em>User Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirement.impl.UserRequirementImpl
		 * @see requirement.impl.Requirement_PackageImpl#getUserRequirement()
		 * @generated
		 */
		EClass USER_REQUIREMENT = eINSTANCE.getUserRequirement();

		/**
		 * The meta object literal for the '{@link requirement.impl.SystemRequirementImpl <em>System Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirement.impl.SystemRequirementImpl
		 * @see requirement.impl.Requirement_PackageImpl#getSystemRequirement()
		 * @generated
		 */
		EClass SYSTEM_REQUIREMENT = eINSTANCE.getSystemRequirement();

		/**
		 * The meta object literal for the '{@link requirement.impl.FunctionalRequirementImpl <em>Functional Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirement.impl.FunctionalRequirementImpl
		 * @see requirement.impl.Requirement_PackageImpl#getFunctionalRequirement()
		 * @generated
		 */
		EClass FUNCTIONAL_REQUIREMENT = eINSTANCE.getFunctionalRequirement();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQUIREMENT__FUNCTION = eINSTANCE.getFunctionalRequirement_Function();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQUIREMENT__INPUTS = eINSTANCE.getFunctionalRequirement_Inputs();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQUIREMENT__OUTPUTS = eINSTANCE.getFunctionalRequirement_Outputs();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQUIREMENT__SOURCE = eINSTANCE.getFunctionalRequirement_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQUIREMENT__DESTINATION = eINSTANCE.getFunctionalRequirement_Destination();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQUIREMENT__ACTION = eINSTANCE.getFunctionalRequirement_Action();

		/**
		 * The meta object literal for the '<em><b>Requires</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQUIREMENT__REQUIRES = eINSTANCE.getFunctionalRequirement_Requires();

		/**
		 * The meta object literal for the '<em><b>Pre condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQUIREMENT__PRE_CONDITION = eINSTANCE.getFunctionalRequirement_Pre_condition();

		/**
		 * The meta object literal for the '<em><b>Post condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQUIREMENT__POST_CONDITION = eINSTANCE.getFunctionalRequirement_Post_condition();

		/**
		 * The meta object literal for the '<em><b>Side effects</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTIONAL_REQUIREMENT__SIDE_EFFECTS = eINSTANCE.getFunctionalRequirement_Side_effects();

		/**
		 * The meta object literal for the '{@link requirement.impl.NonFunctionalRequirementImpl <em>Non Functional Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirement.impl.NonFunctionalRequirementImpl
		 * @see requirement.impl.Requirement_PackageImpl#getNonFunctionalRequirement()
		 * @generated
		 */
		EClass NON_FUNCTIONAL_REQUIREMENT = eINSTANCE.getNonFunctionalRequirement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NON_FUNCTIONAL_REQUIREMENT__TYPE = eINSTANCE.getNonFunctionalRequirement_Type();

		/**
		 * The meta object literal for the '{@link requirement.impl.SecondaryRequirementTypeImpl <em>Secondary Requirement Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see requirement.impl.SecondaryRequirementTypeImpl
		 * @see requirement.impl.Requirement_PackageImpl#getSecondaryRequirementType()
		 * @generated
		 */
		EClass SECONDARY_REQUIREMENT_TYPE = eINSTANCE.getSecondaryRequirementType();

		/**
		 * The meta object literal for the '<em><b>Architecture</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_REQUIREMENT_TYPE__ARCHITECTURE = eINSTANCE.getSecondaryRequirementType_Architecture();

		/**
		 * The meta object literal for the '<em><b>Usability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_REQUIREMENT_TYPE__USABILITY = eINSTANCE.getSecondaryRequirementType_Usability();

		/**
		 * The meta object literal for the '<em><b>Performance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_REQUIREMENT_TYPE__PERFORMANCE = eINSTANCE.getSecondaryRequirementType_Performance();

		/**
		 * The meta object literal for the '<em><b>Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_REQUIREMENT_TYPE__SPACE = eINSTANCE.getSecondaryRequirementType_Space();

		/**
		 * The meta object literal for the '<em><b>Dependability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_REQUIREMENT_TYPE__DEPENDABILITY = eINSTANCE.getSecondaryRequirementType_Dependability();

		/**
		 * The meta object literal for the '<em><b>Security</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_REQUIREMENT_TYPE__SECURITY = eINSTANCE.getSecondaryRequirementType_Security();

		/**
		 * The meta object literal for the '<em><b>Environmental</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_REQUIREMENT_TYPE__ENVIRONMENTAL = eINSTANCE.getSecondaryRequirementType_Environmental();

		/**
		 * The meta object literal for the '<em><b>Operational</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_REQUIREMENT_TYPE__OPERATIONAL = eINSTANCE.getSecondaryRequirementType_Operational();

		/**
		 * The meta object literal for the '<em><b>Development</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_REQUIREMENT_TYPE__DEVELOPMENT = eINSTANCE.getSecondaryRequirementType_Development();

		/**
		 * The meta object literal for the '<em><b>Regulatory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_REQUIREMENT_TYPE__REGULATORY = eINSTANCE.getSecondaryRequirementType_Regulatory();

		/**
		 * The meta object literal for the '<em><b>Ethical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_REQUIREMENT_TYPE__ETHICAL = eINSTANCE.getSecondaryRequirementType_Ethical();

		/**
		 * The meta object literal for the '<em><b>Safety</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_REQUIREMENT_TYPE__SAFETY = eINSTANCE.getSecondaryRequirementType_Safety();

		/**
		 * The meta object literal for the '<em><b>Accounting</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECONDARY_REQUIREMENT_TYPE__ACCOUNTING = eINSTANCE.getSecondaryRequirementType_Accounting();

	}

} //Requirement_Package
