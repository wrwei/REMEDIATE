/**
 */
package requirement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Glossary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirement.Glossary#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see requirement.Requirement_Package#getGlossary()
 * @model
 * @generated
 */
public interface Glossary extends RequirementUtilityAsset {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link requirement.GlossaryEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see requirement.Requirement_Package#getGlossary_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<GlossaryEntry> getEntries();

} // Glossary
