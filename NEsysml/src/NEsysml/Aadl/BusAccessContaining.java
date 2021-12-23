/**
 */
package NEsysml.Aadl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bus Access Containing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link NEsysml.Aadl.BusAccessContaining#getOwnedBusAccess <em>Owned Bus Access</em>}</li>
 * </ul>
 *
 * @see NEsysml.Aadl.AadlPackage#getBusAccessContaining()
 * @model abstract="true"
 * @generated
 */
public interface BusAccessContaining extends EObject {
	/**
	 * Returns the value of the '<em><b>Owned Bus Access</b></em>' reference list.
	 * The list contents are of type {@link NEsysml.Aadl.BusAccess}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Bus Access</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Bus Access</em>' reference list.
	 * @see NEsysml.Aadl.AadlPackage#getBusAccessContaining_OwnedBusAccess()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<BusAccess> getOwnedBusAccess();

} // BusAccessContaining
