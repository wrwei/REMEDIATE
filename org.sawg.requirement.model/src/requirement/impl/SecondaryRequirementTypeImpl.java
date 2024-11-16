/**
 */
package requirement.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import requirement.Requirement_Package;
import requirement.SecondaryRequirementType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Secondary Requirement Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirement.impl.SecondaryRequirementTypeImpl#isArchitecture <em>Architecture</em>}</li>
 *   <li>{@link requirement.impl.SecondaryRequirementTypeImpl#isUsability <em>Usability</em>}</li>
 *   <li>{@link requirement.impl.SecondaryRequirementTypeImpl#isPerformance <em>Performance</em>}</li>
 *   <li>{@link requirement.impl.SecondaryRequirementTypeImpl#isSpace <em>Space</em>}</li>
 *   <li>{@link requirement.impl.SecondaryRequirementTypeImpl#isDependability <em>Dependability</em>}</li>
 *   <li>{@link requirement.impl.SecondaryRequirementTypeImpl#isSecurity <em>Security</em>}</li>
 *   <li>{@link requirement.impl.SecondaryRequirementTypeImpl#isEnvironmental <em>Environmental</em>}</li>
 *   <li>{@link requirement.impl.SecondaryRequirementTypeImpl#isOperational <em>Operational</em>}</li>
 *   <li>{@link requirement.impl.SecondaryRequirementTypeImpl#isDevelopment <em>Development</em>}</li>
 *   <li>{@link requirement.impl.SecondaryRequirementTypeImpl#isRegulatory <em>Regulatory</em>}</li>
 *   <li>{@link requirement.impl.SecondaryRequirementTypeImpl#isEthical <em>Ethical</em>}</li>
 *   <li>{@link requirement.impl.SecondaryRequirementTypeImpl#isSafety <em>Safety</em>}</li>
 *   <li>{@link requirement.impl.SecondaryRequirementTypeImpl#isAccounting <em>Accounting</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecondaryRequirementTypeImpl extends RequirementAssetImpl implements SecondaryRequirementType {
	/**
	 * The default value of the '{@link #isArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArchitecture()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARCHITECTURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArchitecture() <em>Architecture</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArchitecture()
	 * @generated
	 * @ordered
	 */
	protected boolean architecture = ARCHITECTURE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUsability() <em>Usability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsability()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USABILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUsability() <em>Usability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUsability()
	 * @generated
	 * @ordered
	 */
	protected boolean usability = USABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isPerformance() <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPerformance()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PERFORMANCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPerformance() <em>Performance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPerformance()
	 * @generated
	 * @ordered
	 */
	protected boolean performance = PERFORMANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSpace() <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SPACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSpace() <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSpace()
	 * @generated
	 * @ordered
	 */
	protected boolean space = SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDependability() <em>Dependability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDependability()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEPENDABILITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDependability() <em>Dependability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDependability()
	 * @generated
	 * @ordered
	 */
	protected boolean dependability = DEPENDABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSecurity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SECURITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSecurity() <em>Security</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSecurity()
	 * @generated
	 * @ordered
	 */
	protected boolean security = SECURITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isEnvironmental() <em>Environmental</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnvironmental()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENVIRONMENTAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnvironmental() <em>Environmental</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnvironmental()
	 * @generated
	 * @ordered
	 */
	protected boolean environmental = ENVIRONMENTAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isOperational() <em>Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperational()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPERATIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOperational() <em>Operational</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOperational()
	 * @generated
	 * @ordered
	 */
	protected boolean operational = OPERATIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isDevelopment() <em>Development</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDevelopment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEVELOPMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDevelopment() <em>Development</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDevelopment()
	 * @generated
	 * @ordered
	 */
	protected boolean development = DEVELOPMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isRegulatory() <em>Regulatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegulatory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REGULATORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRegulatory() <em>Regulatory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegulatory()
	 * @generated
	 * @ordered
	 */
	protected boolean regulatory = REGULATORY_EDEFAULT;

	/**
	 * The default value of the '{@link #isEthical() <em>Ethical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEthical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ETHICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEthical() <em>Ethical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEthical()
	 * @generated
	 * @ordered
	 */
	protected boolean ethical = ETHICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #isSafety() <em>Safety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafety()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SAFETY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSafety() <em>Safety</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSafety()
	 * @generated
	 * @ordered
	 */
	protected boolean safety = SAFETY_EDEFAULT;

	/**
	 * The default value of the '{@link #isAccounting() <em>Accounting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccounting()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACCOUNTING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAccounting() <em>Accounting</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAccounting()
	 * @generated
	 * @ordered
	 */
	protected boolean accounting = ACCOUNTING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecondaryRequirementTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Requirement_Package.Literals.SECONDARY_REQUIREMENT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArchitecture() {
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchitecture(boolean newArchitecture) {
		boolean oldArchitecture = architecture;
		architecture = newArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ARCHITECTURE, oldArchitecture, architecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUsability() {
		return usability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsability(boolean newUsability) {
		boolean oldUsability = usability;
		usability = newUsability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.SECONDARY_REQUIREMENT_TYPE__USABILITY, oldUsability, usability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPerformance() {
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformance(boolean newPerformance) {
		boolean oldPerformance = performance;
		performance = newPerformance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.SECONDARY_REQUIREMENT_TYPE__PERFORMANCE, oldPerformance, performance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSpace() {
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpace(boolean newSpace) {
		boolean oldSpace = space;
		space = newSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.SECONDARY_REQUIREMENT_TYPE__SPACE, oldSpace, space));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDependability() {
		return dependability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDependability(boolean newDependability) {
		boolean oldDependability = dependability;
		dependability = newDependability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.SECONDARY_REQUIREMENT_TYPE__DEPENDABILITY, oldDependability, dependability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSecurity() {
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurity(boolean newSecurity) {
		boolean oldSecurity = security;
		security = newSecurity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.SECONDARY_REQUIREMENT_TYPE__SECURITY, oldSecurity, security));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnvironmental() {
		return environmental;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironmental(boolean newEnvironmental) {
		boolean oldEnvironmental = environmental;
		environmental = newEnvironmental;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ENVIRONMENTAL, oldEnvironmental, environmental));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOperational() {
		return operational;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperational(boolean newOperational) {
		boolean oldOperational = operational;
		operational = newOperational;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.SECONDARY_REQUIREMENT_TYPE__OPERATIONAL, oldOperational, operational));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDevelopment() {
		return development;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevelopment(boolean newDevelopment) {
		boolean oldDevelopment = development;
		development = newDevelopment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.SECONDARY_REQUIREMENT_TYPE__DEVELOPMENT, oldDevelopment, development));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRegulatory() {
		return regulatory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegulatory(boolean newRegulatory) {
		boolean oldRegulatory = regulatory;
		regulatory = newRegulatory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.SECONDARY_REQUIREMENT_TYPE__REGULATORY, oldRegulatory, regulatory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEthical() {
		return ethical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEthical(boolean newEthical) {
		boolean oldEthical = ethical;
		ethical = newEthical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ETHICAL, oldEthical, ethical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSafety() {
		return safety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSafety(boolean newSafety) {
		boolean oldSafety = safety;
		safety = newSafety;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.SECONDARY_REQUIREMENT_TYPE__SAFETY, oldSafety, safety));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAccounting() {
		return accounting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccounting(boolean newAccounting) {
		boolean oldAccounting = accounting;
		accounting = newAccounting;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ACCOUNTING, oldAccounting, accounting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ARCHITECTURE:
				return isArchitecture();
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__USABILITY:
				return isUsability();
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__PERFORMANCE:
				return isPerformance();
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__SPACE:
				return isSpace();
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__DEPENDABILITY:
				return isDependability();
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__SECURITY:
				return isSecurity();
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ENVIRONMENTAL:
				return isEnvironmental();
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__OPERATIONAL:
				return isOperational();
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__DEVELOPMENT:
				return isDevelopment();
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__REGULATORY:
				return isRegulatory();
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ETHICAL:
				return isEthical();
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__SAFETY:
				return isSafety();
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ACCOUNTING:
				return isAccounting();
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
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ARCHITECTURE:
				setArchitecture((Boolean)newValue);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__USABILITY:
				setUsability((Boolean)newValue);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__PERFORMANCE:
				setPerformance((Boolean)newValue);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__SPACE:
				setSpace((Boolean)newValue);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__DEPENDABILITY:
				setDependability((Boolean)newValue);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__SECURITY:
				setSecurity((Boolean)newValue);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ENVIRONMENTAL:
				setEnvironmental((Boolean)newValue);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__OPERATIONAL:
				setOperational((Boolean)newValue);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__DEVELOPMENT:
				setDevelopment((Boolean)newValue);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__REGULATORY:
				setRegulatory((Boolean)newValue);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ETHICAL:
				setEthical((Boolean)newValue);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__SAFETY:
				setSafety((Boolean)newValue);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ACCOUNTING:
				setAccounting((Boolean)newValue);
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
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ARCHITECTURE:
				setArchitecture(ARCHITECTURE_EDEFAULT);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__USABILITY:
				setUsability(USABILITY_EDEFAULT);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__PERFORMANCE:
				setPerformance(PERFORMANCE_EDEFAULT);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__SPACE:
				setSpace(SPACE_EDEFAULT);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__DEPENDABILITY:
				setDependability(DEPENDABILITY_EDEFAULT);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__SECURITY:
				setSecurity(SECURITY_EDEFAULT);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ENVIRONMENTAL:
				setEnvironmental(ENVIRONMENTAL_EDEFAULT);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__OPERATIONAL:
				setOperational(OPERATIONAL_EDEFAULT);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__DEVELOPMENT:
				setDevelopment(DEVELOPMENT_EDEFAULT);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__REGULATORY:
				setRegulatory(REGULATORY_EDEFAULT);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ETHICAL:
				setEthical(ETHICAL_EDEFAULT);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__SAFETY:
				setSafety(SAFETY_EDEFAULT);
				return;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ACCOUNTING:
				setAccounting(ACCOUNTING_EDEFAULT);
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
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ARCHITECTURE:
				return architecture != ARCHITECTURE_EDEFAULT;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__USABILITY:
				return usability != USABILITY_EDEFAULT;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__PERFORMANCE:
				return performance != PERFORMANCE_EDEFAULT;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__SPACE:
				return space != SPACE_EDEFAULT;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__DEPENDABILITY:
				return dependability != DEPENDABILITY_EDEFAULT;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__SECURITY:
				return security != SECURITY_EDEFAULT;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ENVIRONMENTAL:
				return environmental != ENVIRONMENTAL_EDEFAULT;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__OPERATIONAL:
				return operational != OPERATIONAL_EDEFAULT;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__DEVELOPMENT:
				return development != DEVELOPMENT_EDEFAULT;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__REGULATORY:
				return regulatory != REGULATORY_EDEFAULT;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ETHICAL:
				return ethical != ETHICAL_EDEFAULT;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__SAFETY:
				return safety != SAFETY_EDEFAULT;
			case Requirement_Package.SECONDARY_REQUIREMENT_TYPE__ACCOUNTING:
				return accounting != ACCOUNTING_EDEFAULT;
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
		result.append(" (architecture: ");
		result.append(architecture);
		result.append(", usability: ");
		result.append(usability);
		result.append(", performance: ");
		result.append(performance);
		result.append(", space: ");
		result.append(space);
		result.append(", dependability: ");
		result.append(dependability);
		result.append(", security: ");
		result.append(security);
		result.append(", environmental: ");
		result.append(environmental);
		result.append(", operational: ");
		result.append(operational);
		result.append(", development: ");
		result.append(development);
		result.append(", regulatory: ");
		result.append(regulatory);
		result.append(", ethical: ");
		result.append(ethical);
		result.append(", safety: ");
		result.append(safety);
		result.append(", accounting: ");
		result.append(accounting);
		result.append(')');
		return result.toString();
	}

} //SecondaryRequirementTypeImpl
