/**
 */
package bifrost;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bifrost.Trace#isUpdated <em>Updated</em>}</li>
 *   <li>{@link bifrost.Trace#getSource <em>Source</em>}</li>
 *   <li>{@link bifrost.Trace#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see bifrost.Bifrost_Package#getTrace()
 * @model
 * @generated
 */
public interface Trace extends TraceElement {
	/**
	 * Returns the value of the '<em><b>Updated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Updated</em>' attribute.
	 * @see #setUpdated(boolean)
	 * @see bifrost.Bifrost_Package#getTrace_Updated()
	 * @model
	 * @generated
	 */
	boolean isUpdated();

	/**
	 * Sets the value of the '{@link bifrost.Trace#isUpdated <em>Updated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updated</em>' attribute.
	 * @see #isUpdated()
	 * @generated
	 */
	void setUpdated(boolean value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(ExternalReference)
	 * @see bifrost.Bifrost_Package#getTrace_Source()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExternalReference getSource();

	/**
	 * Sets the value of the '{@link bifrost.Trace#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ExternalReference value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(ExternalReference)
	 * @see bifrost.Bifrost_Package#getTrace_Target()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ExternalReference getTarget();

	/**
	 * Sets the value of the '{@link bifrost.Trace#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ExternalReference value);

} // Trace
