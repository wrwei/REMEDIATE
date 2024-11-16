/**
 */
package bifrost.impl;

import bifrost.Bifrost_Package;
import bifrost.ExternalReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bifrost.impl.ExternalReferenceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link bifrost.impl.ExternalReferenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link bifrost.impl.ExternalReferenceImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link bifrost.impl.ExternalReferenceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link bifrost.impl.ExternalReferenceImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalReferenceImpl extends TraceElementImpl implements ExternalReference {
	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected EList<String> metadata;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<String> constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExternalReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bifrost_Package.Literals.EXTERNAL_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bifrost_Package.EXTERNAL_REFERENCE__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bifrost_Package.EXTERNAL_REFERENCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMetadata() {
		if (metadata == null) {
			metadata = new EDataTypeUniqueEList<String>(String.class, this, Bifrost_Package.EXTERNAL_REFERENCE__METADATA);
		}
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Bifrost_Package.EXTERNAL_REFERENCE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConstraints() {
		if (constraints == null) {
			constraints = new EDataTypeUniqueEList<String>(String.class, this, Bifrost_Package.EXTERNAL_REFERENCE__CONSTRAINTS);
		}
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Bifrost_Package.EXTERNAL_REFERENCE__LOCATION:
				return getLocation();
			case Bifrost_Package.EXTERNAL_REFERENCE__TYPE:
				return getType();
			case Bifrost_Package.EXTERNAL_REFERENCE__METADATA:
				return getMetadata();
			case Bifrost_Package.EXTERNAL_REFERENCE__VERSION:
				return getVersion();
			case Bifrost_Package.EXTERNAL_REFERENCE__CONSTRAINTS:
				return getConstraints();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Bifrost_Package.EXTERNAL_REFERENCE__LOCATION:
				setLocation((String)newValue);
				return;
			case Bifrost_Package.EXTERNAL_REFERENCE__TYPE:
				setType((String)newValue);
				return;
			case Bifrost_Package.EXTERNAL_REFERENCE__METADATA:
				getMetadata().clear();
				getMetadata().addAll((Collection<? extends String>)newValue);
				return;
			case Bifrost_Package.EXTERNAL_REFERENCE__VERSION:
				setVersion((String)newValue);
				return;
			case Bifrost_Package.EXTERNAL_REFERENCE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Bifrost_Package.EXTERNAL_REFERENCE__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case Bifrost_Package.EXTERNAL_REFERENCE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case Bifrost_Package.EXTERNAL_REFERENCE__METADATA:
				getMetadata().clear();
				return;
			case Bifrost_Package.EXTERNAL_REFERENCE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case Bifrost_Package.EXTERNAL_REFERENCE__CONSTRAINTS:
				getConstraints().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Bifrost_Package.EXTERNAL_REFERENCE__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case Bifrost_Package.EXTERNAL_REFERENCE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case Bifrost_Package.EXTERNAL_REFERENCE__METADATA:
				return metadata != null && !metadata.isEmpty();
			case Bifrost_Package.EXTERNAL_REFERENCE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case Bifrost_Package.EXTERNAL_REFERENCE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (location: ");
		result.append(location);
		result.append(", type: ");
		result.append(type);
		result.append(", metadata: ");
		result.append(metadata);
		result.append(", version: ");
		result.append(version);
		result.append(", constraints: ");
		result.append(constraints);
		result.append(')');
		return result.toString();
	}

} //ExternalReferenceImpl
