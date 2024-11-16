/**
 */
package base;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link base.ExternalReference#getLocation <em>Location</em>}</li>
 *   <li>{@link base.ExternalReference#getType <em>Type</em>}</li>
 *   <li>{@link base.ExternalReference#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link base.ExternalReference#getVersion <em>Version</em>}</li>
 *   <li>{@link base.ExternalReference#getImplementationConstraint <em>Implementation Constraint</em>}</li>
 * </ul>
 *
 * @see base.Base_Package#getExternalReference()
 * @model
 * @generated
 */
public interface ExternalReference extends UtilityElement {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(LangString)
	 * @see base.Base_Package#getExternalReference_Location()
	 * @model containment="true"
	 * @generated
	 */
	LangString getLocation();

	/**
	 * Sets the value of the '{@link base.ExternalReference#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(LangString value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(LangString)
	 * @see base.Base_Package#getExternalReference_Type()
	 * @model containment="true"
	 * @generated
	 */
	LangString getType();

	/**
	 * Sets the value of the '{@link base.ExternalReference#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(LangString value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' containment reference.
	 * @see #setMetadata(LangString)
	 * @see base.Base_Package#getExternalReference_Metadata()
	 * @model containment="true"
	 * @generated
	 */
	LangString getMetadata();

	/**
	 * Sets the value of the '{@link base.ExternalReference#getMetadata <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metadata</em>' containment reference.
	 * @see #getMetadata()
	 * @generated
	 */
	void setMetadata(LangString value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(LangString)
	 * @see base.Base_Package#getExternalReference_Version()
	 * @model containment="true"
	 * @generated
	 */
	LangString getVersion();

	/**
	 * Sets the value of the '{@link base.ExternalReference#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(LangString value);

	/**
	 * Returns the value of the '<em><b>Implementation Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link base.ImplementationConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Implementation Constraint</em>' containment reference list.
	 * @see base.Base_Package#getExternalReference_ImplementationConstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<ImplementationConstraint> getImplementationConstraint();

} // ExternalReference
