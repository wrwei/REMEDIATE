/**
 */
package bifrost;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bifrost.TracePackage#getTraceElement <em>Trace Element</em>}</li>
 *   <li>{@link bifrost.TracePackage#getTracePackage <em>Trace Package</em>}</li>
 *   <li>{@link bifrost.TracePackage#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @see bifrost.Bifrost_Package#getTracePackage()
 * @model
 * @generated
 */
public interface TracePackage extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Trace Element</b></em>' containment reference list.
	 * The list contents are of type {@link bifrost.TraceElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Element</em>' containment reference list.
	 * @see bifrost.Bifrost_Package#getTracePackage_TraceElement()
	 * @model containment="true"
	 * @generated
	 */
	EList<TraceElement> getTraceElement();

	/**
	 * Returns the value of the '<em><b>Trace Package</b></em>' containment reference list.
	 * The list contents are of type {@link bifrost.TracePackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trace Package</em>' containment reference list.
	 * @see bifrost.Bifrost_Package#getTracePackage_TracePackage()
	 * @model containment="true"
	 * @generated
	 */
	EList<TracePackage> getTracePackage();

	/**
	 * Returns the value of the '<em><b>Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link bifrost.TracePackageInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interfaces</em>' containment reference list.
	 * @see bifrost.Bifrost_Package#getTracePackage_Interfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<TracePackageInterface> getInterfaces();

} // TracePackage
