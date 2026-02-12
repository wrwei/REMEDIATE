package org.sawg.malcomj;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.json.JsonModel;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.evl.EvlModule;

/**
 * Standalone runner for Epsilon EOL/EVL/EGL transformations.
 *
 * <p>Usage:
 * <pre>
 *   java TransformationRunner --script path/to/script.eol
 *       --emf Name=model.xmi;metamodel1.ecore,metamodel2.ecore[;options]
 *       --json Name=data.json
 * </pre>
 *
 * <p>EMF options (semicolon-separated after metamodels):
 * <ul>
 *   <li>{@code readOnLoad=false} — do not read model file on load (for new models)</li>
 *   <li>{@code storeOnDisposal=true} — persist model on disposal</li>
 *   <li>{@code meta:uri} — use a registered metamodel URI instead of a file</li>
 * </ul>
 */
public class TransformationRunner {

    private static final String[] CUSTOM_EXTENSIONS = {
        "model", "requirement", "terminology", "bifrost", "bridge", "ecore"
    };

    public static void main(String[] args) throws Exception {
        registerResourceFactories();

        String scriptPath = null;
        List<String> emfSpecs = new ArrayList<>();
        List<String> jsonSpecs = new ArrayList<>();

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "--script":
                    scriptPath = args[++i];
                    break;
                case "--emf":
                    emfSpecs.add(args[++i]);
                    break;
                case "--json":
                    jsonSpecs.add(args[++i]);
                    break;
                default:
                    System.err.println("Unknown argument: " + args[i]);
                    System.exit(1);
            }
        }

        if (scriptPath == null) {
            System.err.println("Usage: --script <path> [--emf <spec>...] [--json <spec>...]");
            System.exit(1);
        }

        File scriptFile = new File(scriptPath);
        IEolModule module = createModule(scriptFile);
        module.parse(scriptFile);

        if (!module.getParseProblems().isEmpty()) {
            System.err.println("Parse errors in " + scriptPath + ":");
            module.getParseProblems().forEach(p -> System.err.println("  " + p));
            System.exit(1);
        }

        List<IModel> models = new ArrayList<>();
        try {
            for (String spec : emfSpecs) {
                models.add(loadEmfModel(spec));
            }
            for (String spec : jsonSpecs) {
                models.add(loadJsonModel(spec));
            }

            for (IModel model : models) {
                module.getContext().getModelRepository().addModel(model);
            }

            Object result = module.execute();

            if (module instanceof EglTemplateFactoryModuleAdapter) {
                System.out.println(result);
            }
            if (module instanceof EvlModule) {
                var unsatisfied = ((EvlModule) module).getContext()
                    .getUnsatisfiedConstraints();
                if (!unsatisfied.isEmpty()) {
                    System.out.println("Unsatisfied constraints:");
                    unsatisfied.forEach(uc -> System.out.println("  " + uc));
                }
            }
        } finally {
            module.getContext().getModelRepository().dispose();
        }
    }

    private static void registerResourceFactories() {
        var factoryMap = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap();
        XMIResourceFactoryImpl xmiFactory = new XMIResourceFactoryImpl();
        for (String ext : CUSTOM_EXTENSIONS) {
            factoryMap.put(ext, xmiFactory);
        }
        factoryMap.put("*", xmiFactory);
    }

    private static IEolModule createModule(File scriptFile) {
        String name = scriptFile.getName().toLowerCase();
        if (name.endsWith(".evl")) {
            return new EvlModule();
        } else if (name.endsWith(".egl")) {
            return new EglTemplateFactoryModuleAdapter(new EglTemplateFactory());
        } else {
            return new EolModule();
        }
    }

    /**
     * Parse an EMF model spec: {@code Name=modelFile;metamodel1,metamodel2[;key=val,...]}
     *
     * <p>Special metamodel prefix {@code meta:} uses a registered URI instead of a file path.
     */
    private static EmfModel loadEmfModel(String spec) throws Exception {
        // Split: Name=rest
        int eq = spec.indexOf('=');
        String name = spec.substring(0, eq);
        String rest = spec.substring(eq + 1);

        // Split by semicolons: modelFile ; metamodels ; options
        String[] parts = rest.split(";");
        String modelFile = parts[0];
        String metamodelPart = parts.length > 1 ? parts[1] : "";
        String optionsPart = parts.length > 2 ? parts[2] : "";

        boolean readOnLoad = true;
        boolean storeOnDisposal = false;

        if (!optionsPart.isEmpty()) {
            for (String opt : optionsPart.split(",")) {
                String[] kv = opt.split("=", 2);
                if (kv.length == 2) {
                    switch (kv[0].trim()) {
                        case "readOnLoad": readOnLoad = Boolean.parseBoolean(kv[1].trim()); break;
                        case "storeOnDisposal": storeOnDisposal = Boolean.parseBoolean(kv[1].trim()); break;
                    }
                }
            }
        }

        EmfModel model = new EmfModel();
        model.setName(name);
        model.setReadOnLoad(readOnLoad);
        model.setStoredOnDisposal(storeOnDisposal);

        if (metamodelPart.startsWith("meta:")) {
            // Use a registered metamodel URI (e.g. Ecore itself)
            String uri = metamodelPart.substring("meta:".length());
            model.setMetamodelUri(uri);
        } else if (!metamodelPart.isEmpty()) {
            // Load metamodel(s) from file(s), register their EPackages, collect URIs
            List<String> metamodelFiles = List.of(metamodelPart.split(","));
            List<String> allUris = new ArrayList<>();
            for (String mmFile : metamodelFiles) {
                allUris.addAll(registerEcorePackage(mmFile.trim()));
            }
            // Set all metamodel URIs so Epsilon resolves types from all packages
            model.setMetamodelUris(allUris);
        }

        model.setModelFile(new File(modelFile).getAbsolutePath());
        model.load();

        System.out.println("Loaded EMF model: " + name + " (" + modelFile + ")");
        return model;
    }

    /**
     * Parse a JSON model spec: {@code Name=jsonFile}
     */
    private static JsonModel loadJsonModel(String spec) throws Exception {
        int eq = spec.indexOf('=');
        String name = spec.substring(0, eq);
        String filePath = spec.substring(eq + 1);

        JsonModel model = new JsonModel();
        model.setName(name);
        model.setFile(new File(filePath).getAbsoluteFile());
        model.setReadOnLoad(true);
        model.setStoredOnDisposal(false);
        model.load();

        System.out.println("Loaded JSON model: " + name + " (" + filePath + ")");
        return model;
    }

    /**
     * Load an .ecore file and register its root EPackage(s) in the global registry.
     * Returns the namespace URIs of all registered packages.
     */
    private static List<String> registerEcorePackage(String ecorePath) {
        List<String> uris = new ArrayList<>();
        File file = new File(ecorePath);
        URI uri = URI.createFileURI(file.getAbsolutePath());

        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put("ecore", new XMIResourceFactoryImpl());

        Resource resource = resourceSet.getResource(uri, true);
        for (var content : resource.getContents()) {
            if (content instanceof EPackage) {
                EPackage pkg = (EPackage) content;
                uris.add(pkg.getNsURI());
                if (EPackage.Registry.INSTANCE.getEPackage(pkg.getNsURI()) == null) {
                    EPackage.Registry.INSTANCE.put(pkg.getNsURI(), pkg);
                    System.out.println("Registered EPackage: " + pkg.getNsURI());
                }
            }
        }
        return uris;
    }
}
