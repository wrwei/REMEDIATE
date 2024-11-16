/**
 */
package base;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.Element#getGid <em>Gid</em>}</li>
 *   <li>{@link base.Element#isIsCitation <em>Is Citation</em>}</li>
 *   <li>{@link base.Element#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link base.Element#getCitedElement <em>Cited Element</em>}</li>
 * </ul>
 *
 * @see base.Base_Package#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends EObject {
	/**
	 * Returns the value of the '<em><b>Gid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gid</em>' attribute.
	 * @see #setGid(String)
	 * @see base.Base_Package#getElement_Gid()
	 * @model
	 * @generated
	 */
	String getGid();

	/**
	 * Sets the value of the '{@link base.Element#getGid <em>Gid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gid</em>' attribute.
	 * @see #getGid()
	 * @generated
	 */
	void setGid(String value);

	/**
	 * Returns the value of the '<em><b>Is Citation</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Citation</em>' attribute.
	 * @see #setIsCitation(boolean)
	 * @see base.Base_Package#getElement_IsCitation()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsCitation();

	/**
	 * Sets the value of the '{@link base.Element#isIsCitation <em>Is Citation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Citation</em>' attribute.
	 * @see #isIsCitation()
	 * @generated
	 */
	void setIsCitation(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Abstract</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Abstract</em>' attribute.
	 * @see #setIsAbstract(boolean)
	 * @see base.Base_Package#getElement_IsAbstract()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsAbstract();

	/**
	 * Sets the value of the '{@link base.Element#isIsAbstract <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Abstract</em>' attribute.
	 * @see #isIsAbstract()
	 * @generated
	 */
	void setIsAbstract(boolean value);

	/**
	 * Returns the value of the '<em><b>Cited Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cited Element</em>' reference.
	 * @see #setCitedElement(Element)
	 * @see base.Base_Package#getElement_CitedElement()
	 * @model
	 * @generated
	 */
	Element getCitedElement();

	/**
	 * Sets the value of the '{@link base.Element#getCitedElement <em>Cited Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cited Element</em>' reference.
	 * @see #getCitedElement()
	 * @generated
	 */
	void setCitedElement(Element value);

} // Element
