/**
 */
package bifrost.impl;

import bifrost.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Bifrost_FactoryImpl extends EFactoryImpl implements Bifrost_Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Bifrost_Factory init() {
		try {
			Bifrost_Factory theBifrost_Factory = (Bifrost_Factory)EPackage.Registry.INSTANCE.getEFactory(Bifrost_Package.eNS_URI);
			if (theBifrost_Factory != null) {
				return theBifrost_Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Bifrost_FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bifrost_FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Bifrost_Package.TRACE_PACKAGE: return createTracePackage();
			case Bifrost_Package.TRACE_PACKAGE_INTERFACE: return createTracePackageInterface();
			case Bifrost_Package.TRACE: return createTrace();
			case Bifrost_Package.EXTERNAL_REFERENCE: return createExternalReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracePackage createTracePackage() {
		TracePackageImpl tracePackage = new TracePackageImpl();
		return tracePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TracePackageInterface createTracePackageInterface() {
		TracePackageInterfaceImpl tracePackageInterface = new TracePackageInterfaceImpl();
		return tracePackageInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalReference createExternalReference() {
		ExternalReferenceImpl externalReference = new ExternalReferenceImpl();
		return externalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bifrost_Package getBifrost_Package() {
		return (Bifrost_Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Bifrost_Package getPackage() {
		return Bifrost_Package.eINSTANCE;
	}

} //Bifrost_FactoryImpl
