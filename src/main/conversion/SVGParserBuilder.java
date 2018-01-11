package main.conversion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.text.html.HTMLDocument;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;

import main.antlr4.SVGLexer;
import main.antlr4.SVGParser;
import main.antlr4.SVGParser.HtmlDocumentContext;





public class SVGParserBuilder {

	public SVGParserBuilder(File sourceFile) {
		//System.out.println("SVGParser HW!");
		
		try {
			//FileinputStream -> CharStream
			CharStream inputSteam = CharStreams.fromStream(new FileInputStream(sourceFile));
			//Build Lexer
			Lexer svgLexer = new SVGLexer(inputSteam );
			//Get TokenStream from Lexer
			TokenStream tokenStream = new CommonTokenStream(svgLexer);			
			//Build Parser
			//SVGParser svgParser = new SVGParser(tokenStream);
			//Get 'root' element (hopefully the 'svg' element)
			//HtmlDocumentContext documentContext = svgParser.htmlDocument();
			
			
			//syso complete tree!
			//System.out.println(documentContext.toStringTree(svgParser));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
