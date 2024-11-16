package utility;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.common.parse.EpsilonTreeAdaptor;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.EmfUtil;
import org.eclipse.epsilon.emc.emf.tools.EmfTool;
import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.exceptions.EolRuntimeException;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;
import org.eclipse.epsilon.eol.parse.EolLexer;
import org.eclipse.epsilon.eol.parse.EolParser;

public class Utility {

	public static void main(String[] args) throws Exception {
		EmfTool tool = new EmfTool();

		System.out.println(EPackage.Registry.INSTANCE.values());
		EPackage epackage = tool.getEPackage("http://www.sawg.org/requirement");
		System.out.println(epackage);
		EolModule eolModule = new EolModule();
//		eolModule.parse("var a = new Sequence;");
//		System.out.println(eolModule.getMain());
		
		String code = "var a = new Sequence;\n var b = new Set;";
		
		try (Scanner s = new java.util.Scanner(new ByteArrayInputStream(code.getBytes()))) {
			// Replace tabs with spaces to get consistent column numbers in ASTs
			s.useDelimiter("\\A");
		    String contents = s.hasNext() ? s.next() : "";
		    ByteArrayInputStream noTabsStream = new ByteArrayInputStream(contents.replaceAll("\t", " ").getBytes());
		    
		    final Lexer lexer = new EolLexer(new ANTLRInputStream(noTabsStream));
			final CommonTokenStream stream = new CommonTokenStream(lexer);
			List<CommonToken> comments = Utility.extractComments(stream);
			final EpsilonTreeAdaptor adaptor = new EpsilonTreeAdaptor(eolModule.getSourceUri(), eolModule);

			EolParser parser = new EolParser(stream);
			parser.setDeepTreeAdaptor(adaptor);
			
			System.out.println(stream);
			System.out.println(comments);
		}
		catch (Exception ex) {
		}
	}
	public static List<CommonToken> extractComments(CommonTokenStream stream) {
		
		List<CommonToken> comments = new ArrayList<>();
		
		// stream is automatically filled in 3.2 but not in 3.5.2
		// We'd like to be able to call stream.fill() to ensure it's
		// filled before we start processing tokens, but fill()
		// doesn't exist in 3.2. To support a wider range of ANTLR
		// versions than just 3.5.2 we're calling toString() instead
		// which has no effect in 3.2 but calls fill() in 3.5.2
		if (stream.size() == 0) stream.toString();
		
		for (Object t : stream.getTokens()) {
			CommonToken token = (CommonToken) t;
			int type = token.getType();
			if (type == EolLexer.COMMENT || type == EolParser.LINE_COMMENT) {
				comments.add(token);
			}
		}
		
		return comments;
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
	
	public static String runStringEOLQueryOnEMFModel(IModel model, String query) throws Exception {
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
	
}
