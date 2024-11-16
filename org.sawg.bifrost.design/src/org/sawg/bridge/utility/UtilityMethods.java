/*******************************************************************************
 * Copyright (c) Systems Assurance Group - All Rights Reserved
 * Unauthorised copying of this file, via any medium is strictly prohibited
 * Confidential
 * 
 * Contributors:
 *     Ran Wei - initial API and implementation
 ******************************************************************************/
package org.sawg.bridge.utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.epsilon.common.dt.util.LogUtil;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfUtil;
import org.eclipse.epsilon.emf.dt.EmfRegistryManager;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;


public class UtilityMethods {

	private static List<Object> metamodels = new ArrayList<Object>();

	public UtilityMethods() {
	}

	public static Object executeQueryObject(String modelPath, ArrayList<String> metamodelPaths, String query) throws Exception {
		
		List<EPackage> ePackages = new ArrayList<EPackage>(); 
		for(String p: metamodelPaths) {
			ePackages.addAll(registerMetamodel(p));
		}
		if (ePackages.size() > 0) {
			for (EPackage ePkg : ePackages) {
				final URI uri = URI.createURI(ePkg.getNsURI());
				if (!metamodels.contains(uri)) {
					metamodels.add(uri);
				}
			}
		}
		String metamodelsString = "";
		for (Object mm : metamodels) {
			metamodelsString = metamodelsString + mm.toString() + ", ";
		}
		metamodelsString = metamodelsString.substring(0, metamodelsString.length() - 2);
		System.out.println(metamodelsString);
		
		String absolute_model_path = resolveAbsolutePath(modelPath);
		EmfModel theReferencedEMFModel = createAndLoadAnEmfModel(metamodelsString, absolute_model_path, "M", "true",
				"false");
		Object result = runStringEOLQueryOnOneModel(theReferencedEMFModel, query);
		
		return result;
	}
	
	public static String executeQuery(String modelPath, ArrayList<String> metamodelPaths, String query) throws Exception {
		
		List<EPackage> ePackages = new ArrayList<EPackage>(); 
		for(String p: metamodelPaths) {
			ePackages.addAll(registerMetamodel(p));
		}
		if (ePackages.size() > 0) {
			for (EPackage ePkg : ePackages) {
				final URI uri = URI.createURI(ePkg.getNsURI());
				if (!metamodels.contains(uri)) {
					metamodels.add(uri);
				}
			}
		}
		String metamodelsString = "";
		for (Object mm : metamodels) {
			metamodelsString = metamodelsString + mm.toString() + ", ";
		}
		metamodelsString = metamodelsString.substring(0, metamodelsString.length() - 2);
		System.out.println(metamodelsString);
		
		String absolute_model_path = resolveAbsolutePath(modelPath);
		EmfModel theReferencedEMFModel = createAndLoadAnEmfModel(metamodelsString, absolute_model_path, "M", "true",
				"false");
		String result = runStringEOLQueryOnOneModel(theReferencedEMFModel, query).toString();
		System.out.println("Result: " + result);
		return result;
	}
	
	public static String executeQuery(String modelPath, String metamodelPath, String query) throws Exception {
		ArrayList<String> mm = new ArrayList<String>();
		mm.add(metamodelPath);
		return executeQuery(modelPath, mm, query);
	}
	
	
	public static String getAbsoluteProjectPath() {
		String projectlocation = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

		if (window == null) {
			IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
			if (windows.length > 0) {
				window = windows[0];
			}
		}
		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		if (activeEditor != null) {
			IEditorInput input = activeEditor.getEditorInput();

			IProject project = input.getAdapter(IProject.class);
			if (project == null) {
				IResource resource = input.getAdapter(IResource.class);
				if (resource != null) {
					project = resource.getProject();
					//this returns the absolute path of the project in the OS
					projectlocation = project.getLocation().toOSString();
				}
			}
			else {
				projectlocation = project.getLocation().toOSString();
			}
		}
		return projectlocation;
	}

	public static EmfModel createAndLoadAnEmfModel(String metamodelURI, String modelFile, String modelName,
			String readOnLoad, String storeOnDisposal) throws EolModelLoadingException {
		EmfModel theModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_METAMODEL_URI, metamodelURI);
		properties.put(EmfModel.PROPERTY_MODEL_FILE, modelFile);
		properties.put(EmfModel.PROPERTY_NAME, modelName);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad);
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal);
		theModel.load(properties, (IRelativePathResolver) null);
		return theModel;
	}

	public static String runStringEOLQueryOnOneModel(IModel model, String query) throws Exception {
		Object result = null;
		EolModule eolModule = new EolModule();
		eolModule.getContext().getModelRepository().addModel(model);
		try {
			eolModule.parse(query);
		} catch (Exception e) {
			throw new IllegalStateException("Pattern expression cannot be parsed.", e);
		}
		
		try {
			result = eolModule.execute();
		} catch (EolRuntimeException e) {
			throw new IllegalStateException(String.format("The query <%s> could not be evaluated.", query), e);
		}
		eolModule.getContext().getModelRepository().dispose();
		if (result != null) {
			return result.toString();
		}
		else {
			return "null";
		}
		
	}

    private static String resolveAbsolutePath(String relative) {
    	String ret = null;
    	String proj_path = UtilityMethods.getAbsoluteProjectPath();
    	ret = proj_path.concat(relative);
    	Path p = new Path(ret);
    	ret = p.toOSString();
    	return ret;
    }
    
    private static String getProjectName() {
    	String projectlocation = null;
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

		if (window == null) {
			IWorkbenchWindow[] windows = PlatformUI.getWorkbench().getWorkbenchWindows();
			if (windows.length > 0) {
				window = windows[0];
			}
		}
		IWorkbenchPage activePage = window.getActivePage();

		IEditorPart activeEditor = activePage.getActiveEditor();

		IProject project = null;
		
		if (activeEditor != null) {
			IEditorInput input = activeEditor.getEditorInput();

			project = input.getAdapter(IProject.class);
			if (project == null) {
				IResource resource = input.getAdapter(IResource.class);
				if (resource != null) {
					project = resource.getProject();
				}
			}
		}
		return project.getName();
    }
    
    private static List<EPackage> registerMetamodel(String path) {
		List<EPackage> ePackages = null;

		String project_name = UtilityMethods.getProjectName();
		String resolved_path = project_name + path;
//    	String resolved_path = resolveAbsolutePath(path);
    	try {
			EmfRegistryManager.getInstance().addMetamodel(resolved_path);
			LogUtil.logInfo(path + " registered successfully");
			ePackages = EmfUtil.register(URI.createPlatformResourceURI(resolved_path, true),
					EPackage.Registry.INSTANCE);
		} catch (Exception ex) {
			LogUtil.log(path + " could not be registered", ex);
		}
    	return ePackages;
    }
    
    public static String getTimeStamp() {
    	// Get the current date and time
    	LocalDateTime now = LocalDateTime.now();
    	// Define the format
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    	// Format the current date and time
    	String formattedNow = now.format(formatter);
    	return formattedNow;
    }

}