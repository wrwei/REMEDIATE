/**
 */
package requirement;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link requirement.FunctionalRequirement#getFunction <em>Function</em>}</li>
 *   <li>{@link requirement.FunctionalRequirement#getInputs <em>Inputs</em>}</li>
 *   <li>{@link requirement.FunctionalRequirement#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link requirement.FunctionalRequirement#getSource <em>Source</em>}</li>
 *   <li>{@link requirement.FunctionalRequirement#getDestination <em>Destination</em>}</li>
 *   <li>{@link requirement.FunctionalRequirement#getAction <em>Action</em>}</li>
 *   <li>{@link requirement.FunctionalRequirement#getRequires <em>Requires</em>}</li>
 *   <li>{@link requirement.FunctionalRequirement#getPre_condition <em>Pre condition</em>}</li>
 *   <li>{@link requirement.FunctionalRequirement#getPost_condition <em>Post condition</em>}</li>
 *   <li>{@link requirement.FunctionalRequirement#getSide_effects <em>Side effects</em>}</li>
 * </ul>
 *
 * @see requirement.Requirement_Package#getFunctionalRequirement()
 * @model
 * @generated
 */
public interface FunctionalRequirement extends SystemRequirement {
	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute.
	 * @see #setFunction(String)
	 * @see requirement.Requirement_Package#getFunctionalRequirement_Function()
	 * @model
	 * @generated
	 */
	String getFunction();

	/**
	 * Sets the value of the '{@link requirement.FunctionalRequirement#getFunction <em>Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Function</em>' attribute.
	 * @see #getFunction()
	 * @generated
	 */
	void setFunction(String value);

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' attribute.
	 * @see #setInputs(String)
	 * @see requirement.Requirement_Package#getFunctionalRequirement_Inputs()
	 * @model
	 * @generated
	 */
	String getInputs();

	/**
	 * Sets the value of the '{@link requirement.FunctionalRequirement#getInputs <em>Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inputs</em>' attribute.
	 * @see #getInputs()
	 * @generated
	 */
	void setInputs(String value);

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' attribute.
	 * @see #setOutputs(String)
	 * @see requirement.Requirement_Package#getFunctionalRequirement_Outputs()
	 * @model
	 * @generated
	 */
	String getOutputs();

	/**
	 * Sets the value of the '{@link requirement.FunctionalRequirement#getOutputs <em>Outputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Outputs</em>' attribute.
	 * @see #getOutputs()
	 * @generated
	 */
	void setOutputs(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see #setSource(String)
	 * @see requirement.Requirement_Package#getFunctionalRequirement_Source()
	 * @model
	 * @generated
	 */
	String getSource();

	/**
	 * Sets the value of the '{@link requirement.FunctionalRequirement#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(String)
	 * @see requirement.Requirement_Package#getFunctionalRequirement_Destination()
	 * @model
	 * @generated
	 */
	String getDestination();

	/**
	 * Sets the value of the '{@link requirement.FunctionalRequirement#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see requirement.Requirement_Package#getFunctionalRequirement_Action()
	 * @model
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link requirement.FunctionalRequirement#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Requires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires</em>' attribute.
	 * @see #setRequires(String)
	 * @see requirement.Requirement_Package#getFunctionalRequirement_Requires()
	 * @model
	 * @generated
	 */
	String getRequires();

	/**
	 * Sets the value of the '{@link requirement.FunctionalRequirement#getRequires <em>Requires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires</em>' attribute.
	 * @see #getRequires()
	 * @generated
	 */
	void setRequires(String value);

	/**
	 * Returns the value of the '<em><b>Pre condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre condition</em>' attribute.
	 * @see #setPre_condition(String)
	 * @see requirement.Requirement_Package#getFunctionalRequirement_Pre_condition()
	 * @model
	 * @generated
	 */
	String getPre_condition();

	/**
	 * Sets the value of the '{@link requirement.FunctionalRequirement#getPre_condition <em>Pre condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre condition</em>' attribute.
	 * @see #getPre_condition()
	 * @generated
	 */
	void setPre_condition(String value);

	/**
	 * Returns the value of the '<em><b>Post condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post condition</em>' attribute.
	 * @see #setPost_condition(String)
	 * @see requirement.Requirement_Package#getFunctionalRequirement_Post_condition()
	 * @model
	 * @generated
	 */
	String getPost_condition();

	/**
	 * Sets the value of the '{@link requirement.FunctionalRequirement#getPost_condition <em>Post condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post condition</em>' attribute.
	 * @see #getPost_condition()
	 * @generated
	 */
	void setPost_condition(String value);

	/**
	 * Returns the value of the '<em><b>Side effects</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side effects</em>' attribute.
	 * @see #setSide_effects(String)
	 * @see requirement.Requirement_Package#getFunctionalRequirement_Side_effects()
	 * @model
	 * @generated
	 */
	String getSide_effects();

	/**
	 * Sets the value of the '{@link requirement.FunctionalRequirement#getSide_effects <em>Side effects</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side effects</em>' attribute.
	 * @see #getSide_effects()
	 * @generated
	 */
	void setSide_effects(String value);

} // FunctionalRequirement
