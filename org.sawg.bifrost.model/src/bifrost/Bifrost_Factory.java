/**
 */
package bifrost;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bifrost.Bifrost_Package
 * @generated
 */
public interface Bifrost_Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Bifrost_Factory eINSTANCE = bifrost.impl.Bifrost_FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Trace Package</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace Package</em>'.
	 * @generated
	 */
	TracePackage createTracePackage();

	/**
	 * Returns a new object of class '<em>Trace Package Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace Package Interface</em>'.
	 * @generated
	 */
	TracePackageInterface createTracePackageInterface();

	/**
	 * Returns a new object of class '<em>Trace</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trace</em>'.
	 * @generated
	 */
	Trace createTrace();

	/**
	 * Returns a new object of class '<em>External Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Reference</em>'.
	 * @generated
	 */
	ExternalReference createExternalReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Bifrost_Package getBifrost_Package();

} //Bifrost_Factory
