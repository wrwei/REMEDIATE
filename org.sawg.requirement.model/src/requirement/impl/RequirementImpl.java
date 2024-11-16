/**
 */
package requirement.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import requirement.Category;
import requirement.Requirement;
import requirement.Requirement_Package;
import requirement.Stakeholder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirement.impl.RequirementImpl#isSatisfied <em>Satisfied</em>}</li>
 *   <li>{@link requirement.impl.RequirementImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link requirement.impl.RequirementImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link requirement.impl.RequirementImpl#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link requirement.impl.RequirementImpl#getSub_requirement <em>Sub requirement</em>}</li>
 *   <li>{@link requirement.impl.RequirementImpl#getDependent_requirement <em>Dependent requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RequirementImpl extends RequirementAssetImpl implements Requirement {
	/**
	 * The default value of the '{@link #isSatisfied() <em>Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatisfied()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SATISFIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSatisfied() <em>Satisfied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSatisfied()
	 * @generated
	 * @ordered
	 */
	protected boolean satisfied = SATISFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected int priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected EList<Category> category;

	/**
	 * The cached value of the '{@link #getStakeholders() <em>Stakeholders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeholders()
	 * @generated
	 * @ordered
	 */
	protected EList<Stakeholder> stakeholders;

	/**
	 * The cached value of the '{@link #getSub_requirement() <em>Sub requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSub_requirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> sub_requirement;

	/**
	 * The cached value of the '{@link #getDependent_requirement() <em>Dependent requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependent_requirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> dependent_requirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Requirement_Package.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSatisfied() {
		return satisfied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfied(boolean newSatisfied) {
		boolean oldSatisfied = satisfied;
		satisfied = newSatisfied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.REQUIREMENT__SATISFIED, oldSatisfied, satisfied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(int newPriority) {
		int oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.REQUIREMENT__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Category> getCategory() {
		if (category == null) {
			category = new EObjectResolvingEList<Category>(Category.class, this, Requirement_Package.REQUIREMENT__CATEGORY);
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stakeholder> getStakeholders() {
		if (stakeholders == null) {
			stakeholders = new EObjectResolvingEList<Stakeholder>(Stakeholder.class, this, Requirement_Package.REQUIREMENT__STAKEHOLDERS);
		}
		return stakeholders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getSub_requirement() {
		if (sub_requirement == null) {
			sub_requirement = new EObjectContainmentEList<Requirement>(Requirement.class, this, Requirement_Package.REQUIREMENT__SUB_REQUIREMENT);
		}
		return sub_requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getDependent_requirement() {
		if (dependent_requirement == null) {
			dependent_requirement = new EObjectResolvingEList<Requirement>(Requirement.class, this, Requirement_Package.REQUIREMENT__DEPENDENT_REQUIREMENT);
		}
		return dependent_requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Requirement_Package.REQUIREMENT__SUB_REQUIREMENT:
				return ((InternalEList<?>)getSub_requirement()).basicRemove(otherEnd, msgs);
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
			case Requirement_Package.REQUIREMENT__SATISFIED:
				return isSatisfied();
			case Requirement_Package.REQUIREMENT__PRIORITY:
				return getPriority();
			case Requirement_Package.REQUIREMENT__CATEGORY:
				return getCategory();
			case Requirement_Package.REQUIREMENT__STAKEHOLDERS:
				return getStakeholders();
			case Requirement_Package.REQUIREMENT__SUB_REQUIREMENT:
				return getSub_requirement();
			case Requirement_Package.REQUIREMENT__DEPENDENT_REQUIREMENT:
				return getDependent_requirement();
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
			case Requirement_Package.REQUIREMENT__SATISFIED:
				setSatisfied((Boolean)newValue);
				return;
			case Requirement_Package.REQUIREMENT__PRIORITY:
				setPriority((Integer)newValue);
				return;
			case Requirement_Package.REQUIREMENT__CATEGORY:
				getCategory().clear();
				getCategory().addAll((Collection<? extends Category>)newValue);
				return;
			case Requirement_Package.REQUIREMENT__STAKEHOLDERS:
				getStakeholders().clear();
				getStakeholders().addAll((Collection<? extends Stakeholder>)newValue);
				return;
			case Requirement_Package.REQUIREMENT__SUB_REQUIREMENT:
				getSub_requirement().clear();
				getSub_requirement().addAll((Collection<? extends Requirement>)newValue);
				return;
			case Requirement_Package.REQUIREMENT__DEPENDENT_REQUIREMENT:
				getDependent_requirement().clear();
				getDependent_requirement().addAll((Collection<? extends Requirement>)newValue);
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
			case Requirement_Package.REQUIREMENT__SATISFIED:
				setSatisfied(SATISFIED_EDEFAULT);
				return;
			case Requirement_Package.REQUIREMENT__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case Requirement_Package.REQUIREMENT__CATEGORY:
				getCategory().clear();
				return;
			case Requirement_Package.REQUIREMENT__STAKEHOLDERS:
				getStakeholders().clear();
				return;
			case Requirement_Package.REQUIREMENT__SUB_REQUIREMENT:
				getSub_requirement().clear();
				return;
			case Requirement_Package.REQUIREMENT__DEPENDENT_REQUIREMENT:
				getDependent_requirement().clear();
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
			case Requirement_Package.REQUIREMENT__SATISFIED:
				return satisfied != SATISFIED_EDEFAULT;
			case Requirement_Package.REQUIREMENT__PRIORITY:
				return priority != PRIORITY_EDEFAULT;
			case Requirement_Package.REQUIREMENT__CATEGORY:
				return category != null && !category.isEmpty();
			case Requirement_Package.REQUIREMENT__STAKEHOLDERS:
				return stakeholders != null && !stakeholders.isEmpty();
			case Requirement_Package.REQUIREMENT__SUB_REQUIREMENT:
				return sub_requirement != null && !sub_requirement.isEmpty();
			case Requirement_Package.REQUIREMENT__DEPENDENT_REQUIREMENT:
				return dependent_requirement != null && !dependent_requirement.isEmpty();
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
		result.append(" (satisfied: ");
		result.append(satisfied);
		result.append(", priority: ");
		result.append(priority);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
