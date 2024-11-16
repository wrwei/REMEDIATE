/**
 */
package terminology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Terminology Asset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terminology.TerminologyAsset#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see terminology.Terminology_Package#getTerminologyAsset()
 * @model abstract="true"
 * @generated
 */
public interface TerminologyAsset extends TerminologyElement {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see terminology.Terminology_Package#getTerminologyAsset_Value()
	 * @model required="true"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link terminology.TerminologyAsset#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // TerminologyAsset
