package main.conversion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;

import main.antlr4.SVGLexer;
import main.antlr4.SVGParser;

public class SVGParserBuilder {

	private SVGParser svgParser;
	private TikzBuilder tikzBuilder;
	
	public SVGParserBuilder(File sourceFile) {
		tikzBuilder = new TikzBuilder();
		
		try {
			//FileinputStream -> CharStream
			CharStream inputSteam = CharStreams.fromStream(new FileInputStream(sourceFile));
			//Build Lexer
			Lexer svgLexer = new SVGLexer(inputSteam );
			//Get TokenStream from Lexer
			TokenStream tokenStream = new CommonTokenStream(svgLexer);			
			//Build Parser
			svgParser = new SVGParser(tokenStream);
			
			
			//syso complete tree!
			//System.out.println(svgCtx.toStringTree(svgParser));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void parseFile() {
		//Build new Parselistener
		SVGParseListener parseListener = new SVGParseListener(tikzBuilder);
		svgParser.addParseListener(parseListener);
		//Get 'root' element (hopefully the 'svg' element)
		//SvgRootContext svgCtx = svgParser.svgRoot();
		svgParser.svgRoot();
		
	}
	
	public void generateLatex(File targetDirectory,String filename) {
		LatexBuilder lb = new LatexBuilder();
		lb.processTikZStringBuilder(tikzBuilder.getStringBuilder());
		lb.writeToFile(targetDirectory, filename);
	}

}
