package svg2tikz.conversion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.runtime.tree.CommonTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;

import svg2tikz.antlr4.XMLLexer;
import svg2tikz.antlr4.XMLParser;
import svg2tikz.antlr4.XMLParser.DocumentContext;

public class SVGParser {

	public SVGParser(File sourceFile) {
		//System.out.println("SVGParser HW!");
		
		try {
			//FileinputStream -> CharStream
			CharStream inputSteam = CharStreams.fromStream(new FileInputStream(sourceFile));
			//Build Lexer
			Lexer xmlLexer = new XMLLexer(inputSteam );
			//Get TokenStream from Lexer
			TokenStream tokenStream = new CommonTokenStream(xmlLexer);			
			//Build Parser using TokenStream
			XMLParser xmlParser = new XMLParser(tokenStream);
			//Get 'root' element (hopefully the 'svg' element)
			DocumentContext documentContext = xmlParser.document();
			
			
			//syso complete tree!
			
			
			System.out.println(documentContext.toStringTree(xmlParser));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
