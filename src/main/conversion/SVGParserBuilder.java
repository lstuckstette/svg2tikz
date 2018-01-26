package main.conversion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.Charset;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.output.ByteArrayOutputStream;

import main.antlr4.SVGLexer;
import main.antlr4.SVGParser;
import main.antlr4.SVGParser.SvgRootContext;

public class SVGParserBuilder {

	private SVGParser svgParser;

	ByteArrayOutputStream tikzOutput;
	
	public SVGParserBuilder(File sourceFile) {
		tikzOutput = new ByteArrayOutputStream();
		new PrintStream(tikzOutput).println("% generated TikZ/PGF image:"); //leadin / watermark
		
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
		SVGParseListener parseListener = new SVGParseListener(tikzOutput);
		
		SvgRootContext svgRootCtx = svgParser.svgRoot();
		
		
		ParseTreeWalker walker = new ParseTreeWalker();
		
		walker.walk(parseListener, svgRootCtx);
		
		
		
	}
	
	public void generateLatex(File targetDirectory,String filename) {
		LatexBuilder lb = new LatexBuilder();
		String tikzCode = tikzOutput.toString(Charset.defaultCharset());
		System.out.println("TikZ-Size: "+tikzCode.length());
		lb.processTikZStringBuilder(tikzCode);
		lb.writeToFile(targetDirectory, filename);
	}

}
