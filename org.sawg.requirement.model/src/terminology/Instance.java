/**
 */
package terminology;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terminology.Instance#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @see terminology.Terminology_Package#getInstance()
 * @model
 * @generated
 */
public interface Instance extends TerminologyAsset {
	/**
	 * Returns the value of the '<em><b>Concept</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' reference.
	 * @see #setConcept(Concept)
	 * @see terminology.Terminology_Package#getInstance_Concept()
	 * @model
	 * @generated
	 */
	Concept getConcept();

	/**
	 * Sets the value of the '{@link terminology.Instance#getConcept <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concept</em>' reference.
	 * @see #getConcept()
	 * @generated
	 */
	void setConcept(Concept value);

} // Instance
