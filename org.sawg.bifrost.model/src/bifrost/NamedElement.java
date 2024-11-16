/**
 */
package bifrost;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Named Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bifrost.NamedElement#getGid <em>Gid</em>}</li>
 *   <li>{@link bifrost.NamedElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see bifrost.Bifrost_Package#getNamedElement()
 * @model abstract="true"
 * @generated
 */
public interface NamedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gid</em>' attribute.
	 * @see #setGid(String)
	 * @see bifrost.Bifrost_Package#getNamedElement_Gid()
	 * @model
	 * @generated
	 */
	String getGid();

	/**
	 * Sets the value of the '{@link bifrost.NamedElement#getGid <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gid</em>' attribute.
	 * @see #getGid()
	 * @generated
	 */
	void setGid(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bifrost.Bifrost_Package#getNamedElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bifrost.NamedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // NamedElement
