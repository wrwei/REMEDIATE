/**
 */
package terminology;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link terminology.Concept#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @see terminology.Terminology_Package#getConcept()
 * @model
 * @generated
 */
public interface Concept extends TerminologyAsset {
	/**
	 * Returns the value of the '<em><b>Concept</b></em>' containment reference list.
	 * The list contents are of type {@link terminology.Concept}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concept</em>' containment reference list.
	 * @see terminology.Terminology_Package#getConcept_Concept()
	 * @model containment="true"
	 * @generated
	 */
	EList<Concept> getConcept();

} // Concept
