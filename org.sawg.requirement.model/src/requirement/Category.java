/**
 */
package requirement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirement.Category#getSub_category <em>Sub category</em>}</li>
 * </ul>
 *
 * @see requirement.Requirement_Package#getCategory()
 * @model
 * @generated
 */
public interface Category extends RequirementUtilityAsset {
	/**
	 * Returns the value of the '<em><b>Sub category</b></em>' containment reference list.
	 * The list contents are of type {@link requirement.Category}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub category</em>' containment reference list.
	 * @see requirement.Requirement_Package#getCategory_Sub_category()
	 * @model containment="true"
	 * @generated
	 */
	EList<Category> getSub_category();

} // Category
