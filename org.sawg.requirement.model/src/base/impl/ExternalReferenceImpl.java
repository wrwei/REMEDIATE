/**
 */
package base.impl;

import base.Base_Package;
import base.ExternalReference;
import base.ImplementationConstraint;
import base.LangString;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link base.impl.ExternalReferenceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link base.impl.ExternalReferenceImpl#getType <em>Type</em>}</li>
 *   <li>{@link base.impl.ExternalReferenceImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link base.impl.ExternalReferenceImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link base.impl.ExternalReferenceImpl#getImplementationConstraint <em>Implementation Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExternalReferenceImpl extends UtilityElementImpl implements ExternalReference {
	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected LangString location;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected LangString type;

	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected LangString metadata;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected LangString version;

	/**
	 * The cached value of the '{@link #getImplementationConstraint() <em>Implementation Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationConstraint> implementationConstraint;

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
		return Base_Package.Literals.EXTERNAL_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangString getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(LangString newLocation, NotificationChain msgs) {
		LangString oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Base_Package.EXTERNAL_REFERENCE__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(LangString newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Base_Package.EXTERNAL_REFERENCE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Base_Package.EXTERNAL_REFERENCE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Base_Package.EXTERNAL_REFERENCE__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangString getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(LangString newType, NotificationChain msgs) {
		LangString oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Base_Package.EXTERNAL_REFERENCE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(LangString newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Base_Package.EXTERNAL_REFERENCE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Base_Package.EXTERNAL_REFERENCE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Base_Package.EXTERNAL_REFERENCE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangString getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(LangString newMetadata, NotificationChain msgs) {
		LangString oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Base_Package.EXTERNAL_REFERENCE__METADATA, oldMetadata, newMetadata);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetadata(LangString newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Base_Package.EXTERNAL_REFERENCE__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Base_Package.EXTERNAL_REFERENCE__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Base_Package.EXTERNAL_REFERENCE__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangString getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(LangString newVersion, NotificationChain msgs) {
		LangString oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Base_Package.EXTERNAL_REFERENCE__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(LangString newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Base_Package.EXTERNAL_REFERENCE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Base_Package.EXTERNAL_REFERENCE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Base_Package.EXTERNAL_REFERENCE__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationConstraint> getImplementationConstraint() {
		if (implementationConstraint == null) {
			implementationConstraint = new EObjectContainmentEList<ImplementationConstraint>(ImplementationConstraint.class, this, Base_Package.EXTERNAL_REFERENCE__IMPLEMENTATION_CONSTRAINT);
		}
		return implementationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Base_Package.EXTERNAL_REFERENCE__LOCATION:
				return basicSetLocation(null, msgs);
			case Base_Package.EXTERNAL_REFERENCE__TYPE:
				return basicSetType(null, msgs);
			case Base_Package.EXTERNAL_REFERENCE__METADATA:
				return basicSetMetadata(null, msgs);
			case Base_Package.EXTERNAL_REFERENCE__VERSION:
				return basicSetVersion(null, msgs);
			case Base_Package.EXTERNAL_REFERENCE__IMPLEMENTATION_CONSTRAINT:
				return ((InternalEList<?>)getImplementationConstraint()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Base_Package.EXTERNAL_REFERENCE__LOCATION:
				return getLocation();
			case Base_Package.EXTERNAL_REFERENCE__TYPE:
				return getType();
			case Base_Package.EXTERNAL_REFERENCE__METADATA:
				return getMetadata();
			case Base_Package.EXTERNAL_REFERENCE__VERSION:
				return getVersion();
			case Base_Package.EXTERNAL_REFERENCE__IMPLEMENTATION_CONSTRAINT:
				return getImplementationConstraint();
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
			case Base_Package.EXTERNAL_REFERENCE__LOCATION:
				setLocation((LangString)newValue);
				return;
			case Base_Package.EXTERNAL_REFERENCE__TYPE:
				setType((LangString)newValue);
				return;
			case Base_Package.EXTERNAL_REFERENCE__METADATA:
				setMetadata((LangString)newValue);
				return;
			case Base_Package.EXTERNAL_REFERENCE__VERSION:
				setVersion((LangString)newValue);
				return;
			case Base_Package.EXTERNAL_REFERENCE__IMPLEMENTATION_CONSTRAINT:
				getImplementationConstraint().clear();
				getImplementationConstraint().addAll((Collection<? extends ImplementationConstraint>)newValue);
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
			case Base_Package.EXTERNAL_REFERENCE__LOCATION:
				setLocation((LangString)null);
				return;
			case Base_Package.EXTERNAL_REFERENCE__TYPE:
				setType((LangString)null);
				return;
			case Base_Package.EXTERNAL_REFERENCE__METADATA:
				setMetadata((LangString)null);
				return;
			case Base_Package.EXTERNAL_REFERENCE__VERSION:
				setVersion((LangString)null);
				return;
			case Base_Package.EXTERNAL_REFERENCE__IMPLEMENTATION_CONSTRAINT:
				getImplementationConstraint().clear();
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
			case Base_Package.EXTERNAL_REFERENCE__LOCATION:
				return location != null;
			case Base_Package.EXTERNAL_REFERENCE__TYPE:
				return type != null;
			case Base_Package.EXTERNAL_REFERENCE__METADATA:
				return metadata != null;
			case Base_Package.EXTERNAL_REFERENCE__VERSION:
				return version != null;
			case Base_Package.EXTERNAL_REFERENCE__IMPLEMENTATION_CONSTRAINT:
				return implementationConstraint != null && !implementationConstraint.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ExternalReferenceImpl
