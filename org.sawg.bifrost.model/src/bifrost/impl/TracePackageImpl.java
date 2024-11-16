/**
 */
package bifrost.impl;

import bifrost.Bifrost_Package;
import bifrost.TraceElement;
import bifrost.TracePackage;
import bifrost.TracePackageInterface;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bifrost.impl.TracePackageImpl#getTraceElement <em>Trace Element</em>}</li>
 *   <li>{@link bifrost.impl.TracePackageImpl#getTracePackage <em>Trace Package</em>}</li>
 *   <li>{@link bifrost.impl.TracePackageImpl#getInterfaces <em>Interfaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TracePackageImpl extends NamedElementImpl implements TracePackage {
	/**
	 * The cached value of the '{@link #getTraceElement() <em>Trace Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceElement()
	 * @generated
	 * @ordered
	 */
	protected EList<TraceElement> traceElement;

	/**
	 * The cached value of the '{@link #getTracePackage() <em>Trace Package</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracePackage()
	 * @generated
	 * @ordered
	 */
	protected EList<TracePackage> tracePackage;

	/**
	 * The cached value of the '{@link #getInterfaces() <em>Interfaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaces()
	 * @generated
	 * @ordered
	 */
	protected EList<TracePackageInterface> interfaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TracePackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Bifrost_Package.Literals.TRACE_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TraceElement> getTraceElement() {
		if (traceElement == null) {
			traceElement = new EObjectContainmentEList<TraceElement>(TraceElement.class, this, Bifrost_Package.TRACE_PACKAGE__TRACE_ELEMENT);
		}
		return traceElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracePackage> getTracePackage() {
		if (tracePackage == null) {
			tracePackage = new EObjectContainmentEList<TracePackage>(TracePackage.class, this, Bifrost_Package.TRACE_PACKAGE__TRACE_PACKAGE);
		}
		return tracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TracePackageInterface> getInterfaces() {
		if (interfaces == null) {
			interfaces = new EObjectContainmentEList<TracePackageInterface>(TracePackageInterface.class, this, Bifrost_Package.TRACE_PACKAGE__INTERFACES);
		}
		return interfaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Bifrost_Package.TRACE_PACKAGE__TRACE_ELEMENT:
				return ((InternalEList<?>)getTraceElement()).basicRemove(otherEnd, msgs);
			case Bifrost_Package.TRACE_PACKAGE__TRACE_PACKAGE:
				return ((InternalEList<?>)getTracePackage()).basicRemove(otherEnd, msgs);
			case Bifrost_Package.TRACE_PACKAGE__INTERFACES:
				return ((InternalEList<?>)getInterfaces()).basicRemove(otherEnd, msgs);
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
			case Bifrost_Package.TRACE_PACKAGE__TRACE_ELEMENT:
				return getTraceElement();
			case Bifrost_Package.TRACE_PACKAGE__TRACE_PACKAGE:
				return getTracePackage();
			case Bifrost_Package.TRACE_PACKAGE__INTERFACES:
				return getInterfaces();
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
			case Bifrost_Package.TRACE_PACKAGE__TRACE_ELEMENT:
				getTraceElement().clear();
				getTraceElement().addAll((Collection<? extends TraceElement>)newValue);
				return;
			case Bifrost_Package.TRACE_PACKAGE__TRACE_PACKAGE:
				getTracePackage().clear();
				getTracePackage().addAll((Collection<? extends TracePackage>)newValue);
				return;
			case Bifrost_Package.TRACE_PACKAGE__INTERFACES:
				getInterfaces().clear();
				getInterfaces().addAll((Collection<? extends TracePackageInterface>)newValue);
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
			case Bifrost_Package.TRACE_PACKAGE__TRACE_ELEMENT:
				getTraceElement().clear();
				return;
			case Bifrost_Package.TRACE_PACKAGE__TRACE_PACKAGE:
				getTracePackage().clear();
				return;
			case Bifrost_Package.TRACE_PACKAGE__INTERFACES:
				getInterfaces().clear();
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
			case Bifrost_Package.TRACE_PACKAGE__TRACE_ELEMENT:
				return traceElement != null && !traceElement.isEmpty();
			case Bifrost_Package.TRACE_PACKAGE__TRACE_PACKAGE:
				return tracePackage != null && !tracePackage.isEmpty();
			case Bifrost_Package.TRACE_PACKAGE__INTERFACES:
				return interfaces != null && !interfaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TracePackageImpl
