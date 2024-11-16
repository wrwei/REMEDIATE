/**
 */
package terminology.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import terminology.Concept;
import terminology.Instance;
import terminology.Terminology_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link terminology.impl.InstanceImpl#getConcept <em>Concept</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstanceImpl extends TerminologyAssetImpl implements Instance {
	/**
	 * The cached value of the '{@link #getConcept() <em>Concept</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcept()
	 * @generated
	 * @ordered
	 */
	protected Concept concept;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Terminology_Package.Literals.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept getConcept() {
		if (concept != null && concept.eIsProxy()) {
			InternalEObject oldConcept = (InternalEObject)concept;
			concept = (Concept)eResolveProxy(oldConcept);
			if (concept != oldConcept) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Terminology_Package.INSTANCE__CONCEPT, oldConcept, concept));
			}
		}
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concept basicGetConcept() {
		return concept;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcept(Concept newConcept) {
		Concept oldConcept = concept;
		concept = newConcept;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Terminology_Package.INSTANCE__CONCEPT, oldConcept, concept));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Terminology_Package.INSTANCE__CONCEPT:
				if (resolve) return getConcept();
				return basicGetConcept();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Terminology_Package.INSTANCE__CONCEPT:
				setConcept((Concept)newValue);
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
			case Terminology_Package.INSTANCE__CONCEPT:
				setConcept((Concept)null);
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
			case Terminology_Package.INSTANCE__CONCEPT:
				return concept != null;
		}
		return super.eIsSet(featureID);
	}

} //InstanceImpl
