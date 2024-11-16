/**
 */
package bifrost;

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
 *   <li>{@link bifrost.ExternalReference#getLocation <em>Location</em>}</li>
 *   <li>{@link bifrost.ExternalReference#getType <em>Type</em>}</li>
 *   <li>{@link bifrost.ExternalReference#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link bifrost.ExternalReference#getVersion <em>Version</em>}</li>
 *   <li>{@link bifrost.ExternalReference#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see bifrost.Bifrost_Package#getExternalReference()
 * @model
 * @generated
 */
public interface ExternalReference extends TraceElement {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see bifrost.Bifrost_Package#getExternalReference_Location()
	 * @model
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link bifrost.ExternalReference#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see bifrost.Bifrost_Package#getExternalReference_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link bifrost.ExternalReference#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Metadata</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata</em>' attribute list.
	 * @see bifrost.Bifrost_Package#getExternalReference_Metadata()
	 * @model
	 * @generated
	 */
	EList<String> getMetadata();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see bifrost.Bifrost_Package#getExternalReference_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link bifrost.ExternalReference#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' attribute list.
	 * @see bifrost.Bifrost_Package#getExternalReference_Constraints()
	 * @model
	 * @generated
	 */
	EList<String> getConstraints();

} // ExternalReference
