/**
 */
package requirement.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import requirement.GlossaryEntry;
import requirement.Requirement_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Glossary Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirement.impl.GlossaryEntryImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link requirement.impl.GlossaryEntryImpl#getPitch <em>Pitch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GlossaryEntryImpl extends RequirementUtilityAssetImpl implements GlossaryEntry {
	/**
	 * The default value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected static final String TERM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected String term = TERM_EDEFAULT;

	/**
	 * The default value of the '{@link #getPitch() <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitch()
	 * @generated
	 * @ordered
	 */
	protected static final String PITCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPitch() <em>Pitch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitch()
	 * @generated
	 * @ordered
	 */
	protected String pitch = PITCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlossaryEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Requirement_Package.Literals.GLOSSARY_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(String newTerm) {
		String oldTerm = term;
		term = newTerm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.GLOSSARY_ENTRY__TERM, oldTerm, term));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPitch() {
		return pitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitch(String newPitch) {
		String oldPitch = pitch;
		pitch = newPitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.GLOSSARY_ENTRY__PITCH, oldPitch, pitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Requirement_Package.GLOSSARY_ENTRY__TERM:
				return getTerm();
			case Requirement_Package.GLOSSARY_ENTRY__PITCH:
				return getPitch();
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
			case Requirement_Package.GLOSSARY_ENTRY__TERM:
				setTerm((String)newValue);
				return;
			case Requirement_Package.GLOSSARY_ENTRY__PITCH:
				setPitch((String)newValue);
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
			case Requirement_Package.GLOSSARY_ENTRY__TERM:
				setTerm(TERM_EDEFAULT);
				return;
			case Requirement_Package.GLOSSARY_ENTRY__PITCH:
				setPitch(PITCH_EDEFAULT);
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
			case Requirement_Package.GLOSSARY_ENTRY__TERM:
				return TERM_EDEFAULT == null ? term != null : !TERM_EDEFAULT.equals(term);
			case Requirement_Package.GLOSSARY_ENTRY__PITCH:
				return PITCH_EDEFAULT == null ? pitch != null : !PITCH_EDEFAULT.equals(pitch);
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
		result.append(" (term: ");
		result.append(term);
		result.append(", pitch: ");
		result.append(pitch);
		result.append(')');
		return result.toString();
	}

} //GlossaryEntryImpl
