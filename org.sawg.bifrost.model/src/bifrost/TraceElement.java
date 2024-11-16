/**
 */
package bifrost;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bifrost.TraceElement#getDescription <em>Description</em>}</li>
 *   <li>{@link bifrost.TraceElement#getNote <em>Note</em>}</li>
 * </ul>
 *
 * @see bifrost.Bifrost_Package#getTraceElement()
 * @model abstract="true"
 * @generated
 */
public interface TraceElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see bifrost.Bifrost_Package#getTraceElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link bifrost.TraceElement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Note</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Note</em>' attribute list.
	 * @see bifrost.Bifrost_Package#getTraceElement_Note()
	 * @model
	 * @generated
	 */
	EList<String> getNote();

} // TraceElement
