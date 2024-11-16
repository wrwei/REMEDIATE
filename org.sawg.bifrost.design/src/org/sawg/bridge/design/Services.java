package org.sawg.bridge.design;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.diagram.description.style.SquareDescription;
import org.eclipse.sirius.diagram.model.business.internal.spec.DNodeSpec;
import org.eclipse.sirius.tools.api.ui.color.EnvironmentSystemColorFactory;
import org.eclipse.sirius.viewpoint.Style;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.sirius.viewpoint.description.ColorDescription;
import org.eclipse.sirius.viewpoint.description.SystemColor;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.sawg.bridge.utility.UtilityMethods;

import bifrost.ExternalReference;
import bifrost.Trace;
import bifrost.TraceElement;
import bifrost.TracePackage;


/**
 * The services class used by VSM.
 */
public class Services {
    
	private static ArrayList<String> selected_metadata = new ArrayList<String>();
	
    /**
    * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
    */
    public EObject myService(EObject self, String arg) {
       // TODO Auto-generated code
      return self;
    }
    
    public List<String> getSupportedTypes(EObject self) {
    	ArrayList<String> ret = new ArrayList<String>();
    	ret.add("EMF");
    	ret.add("XML");
    	ret.add("Simulink");
    	return ret;
    }
    
    public void selectMetadata(EObject self, List<Object> selection) {
    	selected_metadata.clear();
    	for(Object o: selection) {
    		String s = o.toString();
    		selected_metadata.add(s);
    	}
    	System.out.println(selected_metadata);
    }
    
    public void initConstraints(EObject self) {
    	if(self instanceof ExternalReference) {
    		ExternalReference ref = (ExternalReference) self;
    		ref.getConstraints().add("Query");
    		ref.getConstraints().add("Result");
    	}
    }
    
    public void browseModel(EObject self) {
    	String path = selectFile();
    	if(path != null) {
    		if(self instanceof ExternalReference) {
    			ExternalReference ref = (ExternalReference) self;
    			ref.setLocation(path);
    		}
    	}
	}
    
    public void browseMetamodel(EObject self) {
    	String path = selectFile();
    	if(path != null) {
	    	if(self instanceof ExternalReference) {
				ExternalReference ref = (ExternalReference) self;
				if(!ref.getMetadata().contains(path)) {
					ref.getMetadata().add(path);	
				}
			}
    	}
	}
    
    public void deleteMetamodel(EObject self) {
    	if(self instanceof ExternalReference) {
			ExternalReference ref = (ExternalReference) self;
			for(String s: selected_metadata) {
				ref.getMetadata().remove(s);
			}
		}
	}
    
    public void setQuery(EObject self, String arg) {
    	if(self instanceof ExternalReference) {
			ExternalReference ref = (ExternalReference) self;
			ref.getConstraints().set(0, arg);
		}
    }
    
    public void clearQueryResults(EObject self) {
    	if(self instanceof ExternalReference) {
			ExternalReference ref = (ExternalReference) self;
			ref.getConstraints().set(1, "");
		}
    }
    
    public void setQueryResult(EObject self, String arg) {
    	if(self instanceof ExternalReference) {
			ExternalReference ref = (ExternalReference) self;
			ref.getConstraints().set(1, arg);
		}
    }
    
    public void changeImpact(EObject self) {
    	if(self instanceof TracePackage) {
    		TracePackage pack = (TracePackage) self;
    		for(TraceElement be: pack.getTraceElement()) {
    			if(be instanceof Trace) {
    				//get bridge
    				Trace b = (Trace) be;
    				
    				//get source ref
    				ExternalReference source_ref = b.getSource();
    				
    				//get location, metamodels and query
    				String model = source_ref.getLocation();
    				ArrayList<String> metamodels = new ArrayList<String>();
    				for(String s: source_ref.getMetadata()) {
    					metamodels.add(s);
    				}
    				String query = source_ref.getConstraints().get(0);
    				
    				//result needs to be an Object
    				Object result = null;
    				
    				//if location is default, means this Bridge instance is not initialised, algorithm can skip this
    				if(!model.equals("Location"))
    				{
    					try {
        					result = UtilityMethods.executeQuery(model, metamodels, query);
        				} catch (Exception e) {
        					// TODO Auto-generated catch block
        					e.printStackTrace();
        				}
    				}
    				
    				//get the version of the source ref (currently the hashcode of a String)
    				String version = source_ref.getVersion();
    				
    				//compare the hashcode with the result's hashcode, if different, then display different colour in the editor
    				if(version.equals(result.toString().hashCode()+"")) {
    					
    					//Get the graph node of the Bridge, this returns a collection nontheless
    					Collection<EObject> rev = new EObjectQuery(b).getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
    					for(EObject obj: rev) {
    						if(obj instanceof DNodeSpec) {
    							//get the DNodeSpec, which is the graphical node in Sirius
    							DNodeSpec spec = (DNodeSpec) obj;
    							
    							//get the style of the node
    							Style style = spec.getStyle();
    							
    							//the node currently is ia Square, so get the SquareDescription from the style
    							SquareDescription sd = (SquareDescription) style.getDescription();
    							
    							//get the label colour of the Square
    							ColorDescription label_color = sd.getLabelColor();

    							SystemColor sc = EnvironmentSystemColorFactory.getDefault().getSystemColorDescription("red");

    							try {
									ColorDescription red = ColorDescription.class.newInstance();
								} catch (InstantiationException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (IllegalAccessException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
    							//Needs to call this to set the colour of the label
    							sd.setLabelColor(sc);
//    							sd.setLabelColor(ColorDescription.class.newInstance());
    							
    							
//    							ColorDescription cd = sd.getBorderColor();
//    							SystemColor sc = (SystemColor) cd;
//    							sc.setRed(255);
//    							style.getCustomFeatures().add(DiagramPackage.Literals.BORDERED_STYLE__BORDER_COLOR.getName());
    						}
    						System.err.println(b.getName() + "Changed!");
    					}
    				}
    			}
    		}
    	}
    }
    
    public void invokeQuery(EObject self) {
    	if(self instanceof ExternalReference) {
			ExternalReference ref = (ExternalReference) self;
			String model = ref.getLocation();
			ArrayList<String> metamodels = new ArrayList<String>();
			for(String s: ref.getMetadata()) {
				metamodels.add(s);
			}
			String query = ref.getConstraints().get(0);
			Object result = null;
			try {
				result = UtilityMethods.executeQuery(model, metamodels, query);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ref.getConstraints().set(1, result.toString());
			System.out.println(EcoreUtil.generateUUID());
			ref.setVersion(result.hashCode()+"");
//			ref.setVersion(UtilityMethods.getTimeStamp());
		}
    }
    
    private String selectFile() {
    	Shell shell = PlatformUI.getWorkbench().getDisplay().getActiveShell();
		FileDialog fileDialog = new FileDialog(shell);
		fileDialog.setText("Locate Document");
		
//		String proj_path = getProjectPath();
		String proj_path = UtilityMethods.getAbsoluteProjectPath();
		fileDialog.setFilterPath(proj_path);

		String path = fileDialog.open();
		

		if (path != null) {
			File f = new File(path);
			Path p = new Path(f.getAbsolutePath());
//			path = p.toOSString();
			path = p.toOSString().substring(proj_path.length());
//			path = path.substring(proj_path.length());
//			System.out.println(path);
//			System.out.println(resolveAbsolutePath(path));
		}
		return path;
    }
}
