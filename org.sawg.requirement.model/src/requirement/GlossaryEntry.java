/**
 */
package requirement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glossary Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirement.GlossaryEntry#getTerm <em>Term</em>}</li>
 *   <li>{@link requirement.GlossaryEntry#getPitch <em>Pitch</em>}</li>
 * </ul>
 *
 * @see requirement.Requirement_Package#getGlossaryEntry()
 * @model
 * @generated
 */
public interface GlossaryEntry extends RequirementUtilityAsset {
	/**
	 * Returns the value of the '<em><b>Term</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' attribute.
	 * @see #setTerm(String)
	 * @see requirement.Requirement_Package#getGlossaryEntry_Term()
	 * @model
	 * @generated
	 */
	String getTerm();

	/**
	 * Sets the value of the '{@link requirement.GlossaryEntry#getTerm <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' attribute.
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(String value);

	/**
	 * Returns the value of the '<em><b>Pitch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pitch</em>' attribute.
	 * @see #setPitch(String)
	 * @see requirement.Requirement_Package#getGlossaryEntry_Pitch()
	 * @model
	 * @generated
	 */
	String getPitch();

	/**
	 * Sets the value of the '{@link requirement.GlossaryEntry#getPitch <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pitch</em>' attribute.
	 * @see #getPitch()
	 * @generated
	 */
	void setPitch(String value);

} // GlossaryEntry
