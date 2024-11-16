/**
 */
package bifrost;

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
 * @see bifrost.Bifrost_Factory
 * @model kind="package"
 * @generated
 */
public interface Bifrost_Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bifrost";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.sawg.org/bifrost";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bifrost_";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bifrost_Package eINSTANCE = bifrost.impl.Bifrost_PackageImpl.init();

	/**
	 * The meta object id for the '{@link bifrost.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bifrost.impl.NamedElementImpl
	 * @see bifrost.impl.Bifrost_PackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__GID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 1;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bifrost.impl.TracePackageImpl <em>Trace Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bifrost.impl.TracePackageImpl
	 * @see bifrost.impl.Bifrost_PackageImpl#getTracePackage()
	 * @generated
	 */
	int TRACE_PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PACKAGE__GID = NAMED_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PACKAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Trace Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PACKAGE__TRACE_ELEMENT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Trace Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PACKAGE__TRACE_PACKAGE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PACKAGE__INTERFACES = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trace Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PACKAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Trace Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PACKAGE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bifrost.impl.TracePackageInterfaceImpl <em>Trace Package Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bifrost.impl.TracePackageInterfaceImpl
	 * @see bifrost.impl.Bifrost_PackageImpl#getTracePackageInterface()
	 * @generated
	 */
	int TRACE_PACKAGE_INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PACKAGE_INTERFACE__GID = TRACE_PACKAGE__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PACKAGE_INTERFACE__NAME = TRACE_PACKAGE__NAME;

	/**
	 * The feature id for the '<em><b>Trace Element</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PACKAGE_INTERFACE__TRACE_ELEMENT = TRACE_PACKAGE__TRACE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Trace Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PACKAGE_INTERFACE__TRACE_PACKAGE = TRACE_PACKAGE__TRACE_PACKAGE;

	/**
	 * The feature id for the '<em><b>Interfaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PACKAGE_INTERFACE__INTERFACES = TRACE_PACKAGE__INTERFACES;

	/**
	 * The number of structural features of the '<em>Trace Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PACKAGE_INTERFACE_FEATURE_COUNT = TRACE_PACKAGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trace Package Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_PACKAGE_INTERFACE_OPERATION_COUNT = TRACE_PACKAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bifrost.impl.TraceElementImpl <em>Trace Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bifrost.impl.TraceElementImpl
	 * @see bifrost.impl.Bifrost_PackageImpl#getTraceElement()
	 * @generated
	 */
	int TRACE_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ELEMENT__GID = NAMED_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ELEMENT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ELEMENT__NOTE = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trace Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trace Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_ELEMENT_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bifrost.impl.TraceImpl <em>Trace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bifrost.impl.TraceImpl
	 * @see bifrost.impl.Bifrost_PackageImpl#getTrace()
	 * @generated
	 */
	int TRACE = 4;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__GID = TRACE_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__NAME = TRACE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__DESCRIPTION = TRACE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__NOTE = TRACE_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__UPDATED = TRACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__SOURCE = TRACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE__TARGET = TRACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_FEATURE_COUNT = TRACE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Trace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACE_OPERATION_COUNT = TRACE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bifrost.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bifrost.impl.ExternalReferenceImpl
	 * @see bifrost.impl.Bifrost_PackageImpl#getExternalReference()
	 * @generated
	 */
	int EXTERNAL_REFERENCE = 5;

	/**
	 * The feature id for the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__GID = TRACE_ELEMENT__GID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__NAME = TRACE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__DESCRIPTION = TRACE_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Note</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__NOTE = TRACE_ELEMENT__NOTE;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__LOCATION = TRACE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__TYPE = TRACE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__METADATA = TRACE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__VERSION = TRACE_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE__CONSTRAINTS = TRACE_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_FEATURE_COUNT = TRACE_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>External Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_REFERENCE_OPERATION_COUNT = TRACE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link bifrost.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see bifrost.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link bifrost.NamedElement#getGid <em>Gid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gid</em>'.
	 * @see bifrost.NamedElement#getGid()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Gid();

	/**
	 * Returns the meta object for the attribute '{@link bifrost.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bifrost.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link bifrost.TracePackage <em>Trace Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Package</em>'.
	 * @see bifrost.TracePackage
	 * @generated
	 */
	EClass getTracePackage();

	/**
	 * Returns the meta object for the containment reference list '{@link bifrost.TracePackage#getTraceElement <em>Trace Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trace Element</em>'.
	 * @see bifrost.TracePackage#getTraceElement()
	 * @see #getTracePackage()
	 * @generated
	 */
	EReference getTracePackage_TraceElement();

	/**
	 * Returns the meta object for the containment reference list '{@link bifrost.TracePackage#getTracePackage <em>Trace Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trace Package</em>'.
	 * @see bifrost.TracePackage#getTracePackage()
	 * @see #getTracePackage()
	 * @generated
	 */
	EReference getTracePackage_TracePackage();

	/**
	 * Returns the meta object for the containment reference list '{@link bifrost.TracePackage#getInterfaces <em>Interfaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interfaces</em>'.
	 * @see bifrost.TracePackage#getInterfaces()
	 * @see #getTracePackage()
	 * @generated
	 */
	EReference getTracePackage_Interfaces();

	/**
	 * Returns the meta object for class '{@link bifrost.TracePackageInterface <em>Trace Package Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Package Interface</em>'.
	 * @see bifrost.TracePackageInterface
	 * @generated
	 */
	EClass getTracePackageInterface();

	/**
	 * Returns the meta object for class '{@link bifrost.TraceElement <em>Trace Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace Element</em>'.
	 * @see bifrost.TraceElement
	 * @generated
	 */
	EClass getTraceElement();

	/**
	 * Returns the meta object for the attribute '{@link bifrost.TraceElement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see bifrost.TraceElement#getDescription()
	 * @see #getTraceElement()
	 * @generated
	 */
	EAttribute getTraceElement_Description();

	/**
	 * Returns the meta object for the attribute list '{@link bifrost.TraceElement#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Note</em>'.
	 * @see bifrost.TraceElement#getNote()
	 * @see #getTraceElement()
	 * @generated
	 */
	EAttribute getTraceElement_Note();

	/**
	 * Returns the meta object for class '{@link bifrost.Trace <em>Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trace</em>'.
	 * @see bifrost.Trace
	 * @generated
	 */
	EClass getTrace();

	/**
	 * Returns the meta object for the attribute '{@link bifrost.Trace#isUpdated <em>Updated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Updated</em>'.
	 * @see bifrost.Trace#isUpdated()
	 * @see #getTrace()
	 * @generated
	 */
	EAttribute getTrace_Updated();

	/**
	 * Returns the meta object for the containment reference '{@link bifrost.Trace#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see bifrost.Trace#getSource()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Source();

	/**
	 * Returns the meta object for the containment reference '{@link bifrost.Trace#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see bifrost.Trace#getTarget()
	 * @see #getTrace()
	 * @generated
	 */
	EReference getTrace_Target();

	/**
	 * Returns the meta object for class '{@link bifrost.ExternalReference <em>External Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Reference</em>'.
	 * @see bifrost.ExternalReference
	 * @generated
	 */
	EClass getExternalReference();

	/**
	 * Returns the meta object for the attribute '{@link bifrost.ExternalReference#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see bifrost.ExternalReference#getLocation()
	 * @see #getExternalReference()
	 * @generated
	 */
	EAttribute getExternalReference_Location();

	/**
	 * Returns the meta object for the attribute '{@link bifrost.ExternalReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bifrost.ExternalReference#getType()
	 * @see #getExternalReference()
	 * @generated
	 */
	EAttribute getExternalReference_Type();

	/**
	 * Returns the meta object for the attribute list '{@link bifrost.ExternalReference#getMetadata <em>Metadata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Metadata</em>'.
	 * @see bifrost.ExternalReference#getMetadata()
	 * @see #getExternalReference()
	 * @generated
	 */
	EAttribute getExternalReference_Metadata();

	/**
	 * Returns the meta object for the attribute '{@link bifrost.ExternalReference#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see bifrost.ExternalReference#getVersion()
	 * @see #getExternalReference()
	 * @generated
	 */
	EAttribute getExternalReference_Version();

	/**
	 * Returns the meta object for the attribute list '{@link bifrost.ExternalReference#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Constraints</em>'.
	 * @see bifrost.ExternalReference#getConstraints()
	 * @see #getExternalReference()
	 * @generated
	 */
	EAttribute getExternalReference_Constraints();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Bifrost_Factory getBifrost_Factory();

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
		 * The meta object literal for the '{@link bifrost.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bifrost.impl.NamedElementImpl
		 * @see bifrost.impl.Bifrost_PackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Gid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__GID = eINSTANCE.getNamedElement_Gid();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link bifrost.impl.TracePackageImpl <em>Trace Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bifrost.impl.TracePackageImpl
		 * @see bifrost.impl.Bifrost_PackageImpl#getTracePackage()
		 * @generated
		 */
		EClass TRACE_PACKAGE = eINSTANCE.getTracePackage();

		/**
		 * The meta object literal for the '<em><b>Trace Element</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_PACKAGE__TRACE_ELEMENT = eINSTANCE.getTracePackage_TraceElement();

		/**
		 * The meta object literal for the '<em><b>Trace Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_PACKAGE__TRACE_PACKAGE = eINSTANCE.getTracePackage_TracePackage();

		/**
		 * The meta object literal for the '<em><b>Interfaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE_PACKAGE__INTERFACES = eINSTANCE.getTracePackage_Interfaces();

		/**
		 * The meta object literal for the '{@link bifrost.impl.TracePackageInterfaceImpl <em>Trace Package Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bifrost.impl.TracePackageInterfaceImpl
		 * @see bifrost.impl.Bifrost_PackageImpl#getTracePackageInterface()
		 * @generated
		 */
		EClass TRACE_PACKAGE_INTERFACE = eINSTANCE.getTracePackageInterface();

		/**
		 * The meta object literal for the '{@link bifrost.impl.TraceElementImpl <em>Trace Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bifrost.impl.TraceElementImpl
		 * @see bifrost.impl.Bifrost_PackageImpl#getTraceElement()
		 * @generated
		 */
		EClass TRACE_ELEMENT = eINSTANCE.getTraceElement();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_ELEMENT__DESCRIPTION = eINSTANCE.getTraceElement_Description();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE_ELEMENT__NOTE = eINSTANCE.getTraceElement_Note();

		/**
		 * The meta object literal for the '{@link bifrost.impl.TraceImpl <em>Trace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bifrost.impl.TraceImpl
		 * @see bifrost.impl.Bifrost_PackageImpl#getTrace()
		 * @generated
		 */
		EClass TRACE = eINSTANCE.getTrace();

		/**
		 * The meta object literal for the '<em><b>Updated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACE__UPDATED = eINSTANCE.getTrace_Updated();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__SOURCE = eINSTANCE.getTrace_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACE__TARGET = eINSTANCE.getTrace_Target();

		/**
		 * The meta object literal for the '{@link bifrost.impl.ExternalReferenceImpl <em>External Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bifrost.impl.ExternalReferenceImpl
		 * @see bifrost.impl.Bifrost_PackageImpl#getExternalReference()
		 * @generated
		 */
		EClass EXTERNAL_REFERENCE = eINSTANCE.getExternalReference();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE__LOCATION = eINSTANCE.getExternalReference_Location();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE__TYPE = eINSTANCE.getExternalReference_Type();

		/**
		 * The meta object literal for the '<em><b>Metadata</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE__METADATA = eINSTANCE.getExternalReference_Metadata();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE__VERSION = eINSTANCE.getExternalReference_Version();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_REFERENCE__CONSTRAINTS = eINSTANCE.getExternalReference_Constraints();

	}

} //Bifrost_Package
