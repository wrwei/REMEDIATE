/**
 */
package base.impl;

import base.Base_Package;
import base.Description;
import base.ExternalReference;
import base.ImplementationConstraint;
import base.LangString;
import base.ModelElement;
import base.Note;
import base.TaggedValue;

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
 * An implementation of the model object '<em><b>Model Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link base.impl.ModelElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link base.impl.ModelElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link base.impl.ModelElementImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link base.impl.ModelElementImpl#getNote <em>Note</em>}</li>
 *   <li>{@link base.impl.ModelElementImpl#getTaggedValue <em>Tagged Value</em>}</li>
 *   <li>{@link base.impl.ModelElementImpl#getExternalReference <em>External Reference</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ModelElementImpl extends ElementImpl implements ModelElement {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected LangString name;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected Description description;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<ImplementationConstraint> constraint;

	/**
	 * The cached value of the '{@link #getNote() <em>Note</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNote()
	 * @generated
	 * @ordered
	 */
	protected EList<Note> note;

	/**
	 * The cached value of the '{@link #getTaggedValue() <em>Tagged Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaggedValue()
	 * @generated
	 * @ordered
	 */
	protected EList<TaggedValue> taggedValue;

	/**
	 * The cached value of the '{@link #getExternalReference() <em>External Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalReference()
	 * @generated
	 * @ordered
	 */
	protected EList<ExternalReference> externalReference;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Base_Package.Literals.MODEL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LangString getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(LangString newName, NotificationChain msgs) {
		LangString oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Base_Package.MODEL_ELEMENT__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(LangString newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Base_Package.MODEL_ELEMENT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Base_Package.MODEL_ELEMENT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Base_Package.MODEL_ELEMENT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Description getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(Description newDescription, NotificationChain msgs) {
		Description oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Base_Package.MODEL_ELEMENT__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(Description newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Base_Package.MODEL_ELEMENT__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Base_Package.MODEL_ELEMENT__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Base_Package.MODEL_ELEMENT__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImplementationConstraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<ImplementationConstraint>(ImplementationConstraint.class, this, Base_Package.MODEL_ELEMENT__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Note> getNote() {
		if (note == null) {
			note = new EObjectContainmentEList<Note>(Note.class, this, Base_Package.MODEL_ELEMENT__NOTE);
		}
		return note;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaggedValue> getTaggedValue() {
		if (taggedValue == null) {
			taggedValue = new EObjectContainmentEList<TaggedValue>(TaggedValue.class, this, Base_Package.MODEL_ELEMENT__TAGGED_VALUE);
		}
		return taggedValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExternalReference> getExternalReference() {
		if (externalReference == null) {
			externalReference = new EObjectContainmentEList<ExternalReference>(ExternalReference.class, this, Base_Package.MODEL_ELEMENT__EXTERNAL_REFERENCE);
		}
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Base_Package.MODEL_ELEMENT__NAME:
				return basicSetName(null, msgs);
			case Base_Package.MODEL_ELEMENT__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case Base_Package.MODEL_ELEMENT__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case Base_Package.MODEL_ELEMENT__NOTE:
				return ((InternalEList<?>)getNote()).basicRemove(otherEnd, msgs);
			case Base_Package.MODEL_ELEMENT__TAGGED_VALUE:
				return ((InternalEList<?>)getTaggedValue()).basicRemove(otherEnd, msgs);
			case Base_Package.MODEL_ELEMENT__EXTERNAL_REFERENCE:
				return ((InternalEList<?>)getExternalReference()).basicRemove(otherEnd, msgs);
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
			case Base_Package.MODEL_ELEMENT__NAME:
				return getName();
			case Base_Package.MODEL_ELEMENT__DESCRIPTION:
				return getDescription();
			case Base_Package.MODEL_ELEMENT__CONSTRAINT:
				return getConstraint();
			case Base_Package.MODEL_ELEMENT__NOTE:
				return getNote();
			case Base_Package.MODEL_ELEMENT__TAGGED_VALUE:
				return getTaggedValue();
			case Base_Package.MODEL_ELEMENT__EXTERNAL_REFERENCE:
				return getExternalReference();
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
			case Base_Package.MODEL_ELEMENT__NAME:
				setName((LangString)newValue);
				return;
			case Base_Package.MODEL_ELEMENT__DESCRIPTION:
				setDescription((Description)newValue);
				return;
			case Base_Package.MODEL_ELEMENT__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends ImplementationConstraint>)newValue);
				return;
			case Base_Package.MODEL_ELEMENT__NOTE:
				getNote().clear();
				getNote().addAll((Collection<? extends Note>)newValue);
				return;
			case Base_Package.MODEL_ELEMENT__TAGGED_VALUE:
				getTaggedValue().clear();
				getTaggedValue().addAll((Collection<? extends TaggedValue>)newValue);
				return;
			case Base_Package.MODEL_ELEMENT__EXTERNAL_REFERENCE:
				getExternalReference().clear();
				getExternalReference().addAll((Collection<? extends ExternalReference>)newValue);
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
			case Base_Package.MODEL_ELEMENT__NAME:
				setName((LangString)null);
				return;
			case Base_Package.MODEL_ELEMENT__DESCRIPTION:
				setDescription((Description)null);
				return;
			case Base_Package.MODEL_ELEMENT__CONSTRAINT:
				getConstraint().clear();
				return;
			case Base_Package.MODEL_ELEMENT__NOTE:
				getNote().clear();
				return;
			case Base_Package.MODEL_ELEMENT__TAGGED_VALUE:
				getTaggedValue().clear();
				return;
			case Base_Package.MODEL_ELEMENT__EXTERNAL_REFERENCE:
				getExternalReference().clear();
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
			case Base_Package.MODEL_ELEMENT__NAME:
				return name != null;
			case Base_Package.MODEL_ELEMENT__DESCRIPTION:
				return description != null;
			case Base_Package.MODEL_ELEMENT__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case Base_Package.MODEL_ELEMENT__NOTE:
				return note != null && !note.isEmpty();
			case Base_Package.MODEL_ELEMENT__TAGGED_VALUE:
				return taggedValue != null && !taggedValue.isEmpty();
			case Base_Package.MODEL_ELEMENT__EXTERNAL_REFERENCE:
				return externalReference != null && !externalReference.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelElementImpl
