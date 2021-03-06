/**
 */
package NEsysml.Aadl;

import org.eclipse.uml2.uml.State;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Mode</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.NormalMode#getBase_State <em>Base State</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getNormalMode()
 * @model
 * @generated
 */
public interface NormalMode extends Mode {
	/**
	 * Returns the value of the '<em><b>Base State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base State</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base State</em>' reference.
	 * @see #setBase_State(State)
	 * @see NEsysml.Aadl.AadlPackage#getNormalMode_Base_State()
	 * @model ordered="false"
	 * @generated
	 */
	State getBase_State();

	/**
	 * Sets the value of the '{@link NEsysml.Aadl.NormalMode#getBase_State <em>Base State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base State</em>' reference.
	 * @see #getBase_State()
	 * @generated
	 */
	void setBase_State(State value);

} // NormalMode
