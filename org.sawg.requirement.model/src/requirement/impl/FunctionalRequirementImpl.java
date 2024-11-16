/**
 */
package requirement.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import requirement.FunctionalRequirement;
import requirement.Requirement_Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link requirement.impl.FunctionalRequirementImpl#getFunction <em>Function</em>}</li>
 *   <li>{@link requirement.impl.FunctionalRequirementImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link requirement.impl.FunctionalRequirementImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link requirement.impl.FunctionalRequirementImpl#getSource <em>Source</em>}</li>
 *   <li>{@link requirement.impl.FunctionalRequirementImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link requirement.impl.FunctionalRequirementImpl#getAction <em>Action</em>}</li>
 *   <li>{@link requirement.impl.FunctionalRequirementImpl#getRequires <em>Requires</em>}</li>
 *   <li>{@link requirement.impl.FunctionalRequirementImpl#getPre_condition <em>Pre condition</em>}</li>
 *   <li>{@link requirement.impl.FunctionalRequirementImpl#getPost_condition <em>Post condition</em>}</li>
 *   <li>{@link requirement.impl.FunctionalRequirementImpl#getSide_effects <em>Side effects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalRequirementImpl extends SystemRequirementImpl implements FunctionalRequirement {
	/**
	 * The default value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected static final String FUNCTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFunction() <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunction()
	 * @generated
	 * @ordered
	 */
	protected String function = FUNCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputs() <em>Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected String inputs = INPUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputs() <em>Outputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected String outputs = OUTPUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected String destination = DESTINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected String action = ACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequires() <em>Requires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequires() <em>Requires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequires()
	 * @generated
	 * @ordered
	 */
	protected String requires = REQUIRES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPre_condition() <em>Pre condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre_condition()
	 * @generated
	 * @ordered
	 */
	protected static final String PRE_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPre_condition() <em>Pre condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPre_condition()
	 * @generated
	 * @ordered
	 */
	protected String pre_condition = PRE_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPost_condition() <em>Post condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost_condition()
	 * @generated
	 * @ordered
	 */
	protected static final String POST_CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPost_condition() <em>Post condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost_condition()
	 * @generated
	 * @ordered
	 */
	protected String post_condition = POST_CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSide_effects() <em>Side effects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide_effects()
	 * @generated
	 * @ordered
	 */
	protected static final String SIDE_EFFECTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSide_effects() <em>Side effects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide_effects()
	 * @generated
	 * @ordered
	 */
	protected String side_effects = SIDE_EFFECTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Requirement_Package.Literals.FUNCTIONAL_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFunction() {
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(String newFunction) {
		String oldFunction = function;
		function = newFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.FUNCTIONAL_REQUIREMENT__FUNCTION, oldFunction, function));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputs() {
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputs(String newInputs) {
		String oldInputs = inputs;
		inputs = newInputs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.FUNCTIONAL_REQUIREMENT__INPUTS, oldInputs, inputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputs() {
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputs(String newOutputs) {
		String oldOutputs = outputs;
		outputs = newOutputs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.FUNCTIONAL_REQUIREMENT__OUTPUTS, oldOutputs, outputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.FUNCTIONAL_REQUIREMENT__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(String newDestination) {
		String oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.FUNCTIONAL_REQUIREMENT__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(String newAction) {
		String oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.FUNCTIONAL_REQUIREMENT__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequires() {
		return requires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequires(String newRequires) {
		String oldRequires = requires;
		requires = newRequires;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.FUNCTIONAL_REQUIREMENT__REQUIRES, oldRequires, requires));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPre_condition() {
		return pre_condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPre_condition(String newPre_condition) {
		String oldPre_condition = pre_condition;
		pre_condition = newPre_condition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.FUNCTIONAL_REQUIREMENT__PRE_CONDITION, oldPre_condition, pre_condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPost_condition() {
		return post_condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPost_condition(String newPost_condition) {
		String oldPost_condition = post_condition;
		post_condition = newPost_condition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.FUNCTIONAL_REQUIREMENT__POST_CONDITION, oldPost_condition, post_condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSide_effects() {
		return side_effects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSide_effects(String newSide_effects) {
		String oldSide_effects = side_effects;
		side_effects = newSide_effects;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Requirement_Package.FUNCTIONAL_REQUIREMENT__SIDE_EFFECTS, oldSide_effects, side_effects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__FUNCTION:
				return getFunction();
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__INPUTS:
				return getInputs();
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__OUTPUTS:
				return getOutputs();
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__SOURCE:
				return getSource();
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__DESTINATION:
				return getDestination();
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__ACTION:
				return getAction();
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__REQUIRES:
				return getRequires();
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__PRE_CONDITION:
				return getPre_condition();
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__POST_CONDITION:
				return getPost_condition();
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__SIDE_EFFECTS:
				return getSide_effects();
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
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__FUNCTION:
				setFunction((String)newValue);
				return;
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__INPUTS:
				setInputs((String)newValue);
				return;
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__OUTPUTS:
				setOutputs((String)newValue);
				return;
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__SOURCE:
				setSource((String)newValue);
				return;
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__DESTINATION:
				setDestination((String)newValue);
				return;
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__ACTION:
				setAction((String)newValue);
				return;
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__REQUIRES:
				setRequires((String)newValue);
				return;
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__PRE_CONDITION:
				setPre_condition((String)newValue);
				return;
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__POST_CONDITION:
				setPost_condition((String)newValue);
				return;
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__SIDE_EFFECTS:
				setSide_effects((String)newValue);
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
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__FUNCTION:
				setFunction(FUNCTION_EDEFAULT);
				return;
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__INPUTS:
				setInputs(INPUTS_EDEFAULT);
				return;
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__OUTPUTS:
				setOutputs(OUTPUTS_EDEFAULT);
				return;
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__DESTINATION:
				setDestination(DESTINATION_EDEFAULT);
				return;
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__ACTION:
				setAction(ACTION_EDEFAULT);
				return;
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__REQUIRES:
				setRequires(REQUIRES_EDEFAULT);
				return;
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__PRE_CONDITION:
				setPre_condition(PRE_CONDITION_EDEFAULT);
				return;
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__POST_CONDITION:
				setPost_condition(POST_CONDITION_EDEFAULT);
				return;
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__SIDE_EFFECTS:
				setSide_effects(SIDE_EFFECTS_EDEFAULT);
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
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__FUNCTION:
				return FUNCTION_EDEFAULT == null ? function != null : !FUNCTION_EDEFAULT.equals(function);
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__INPUTS:
				return INPUTS_EDEFAULT == null ? inputs != null : !INPUTS_EDEFAULT.equals(inputs);
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__OUTPUTS:
				return OUTPUTS_EDEFAULT == null ? outputs != null : !OUTPUTS_EDEFAULT.equals(outputs);
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__DESTINATION:
				return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__ACTION:
				return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__REQUIRES:
				return REQUIRES_EDEFAULT == null ? requires != null : !REQUIRES_EDEFAULT.equals(requires);
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__PRE_CONDITION:
				return PRE_CONDITION_EDEFAULT == null ? pre_condition != null : !PRE_CONDITION_EDEFAULT.equals(pre_condition);
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__POST_CONDITION:
				return POST_CONDITION_EDEFAULT == null ? post_condition != null : !POST_CONDITION_EDEFAULT.equals(post_condition);
			case Requirement_Package.FUNCTIONAL_REQUIREMENT__SIDE_EFFECTS:
				return SIDE_EFFECTS_EDEFAULT == null ? side_effects != null : !SIDE_EFFECTS_EDEFAULT.equals(side_effects);
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
		result.append(" (function: ");
		result.append(function);
		result.append(", inputs: ");
		result.append(inputs);
		result.append(", outputs: ");
		result.append(outputs);
		result.append(", source: ");
		result.append(source);
		result.append(", destination: ");
		result.append(destination);
		result.append(", action: ");
		result.append(action);
		result.append(", requires: ");
		result.append(requires);
		result.append(", pre_condition: ");
		result.append(pre_condition);
		result.append(", post_condition: ");
		result.append(post_condition);
		result.append(", side_effects: ");
		result.append(side_effects);
		result.append(')');
		return result.toString();
	}

} //FunctionalRequirementImpl
