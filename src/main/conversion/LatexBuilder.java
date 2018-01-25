package main.conversion;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class LatexBuilder {

	private StringBuilder content;

	public LatexBuilder() {
		content = new StringBuilder();
		initLateX();
	}

	private void initLateX() {

		appendLine("\\documentclass{article}");
		appendLine("\\usepackage{tikz}");
		appendLine("\\begin{document}");

	}

	public void processTikZStringBuilder(String input) {

		/*
		 * TODO: embedd TikZ into latex document
		 */
		content.append(input);

		

	}

	private void finishLatex() {

		appendLine("\\end{document}");
	}

	public void writeToFile(File targetDirectory,String filename) {
		finishLatex();
		File outputFile = new File(targetDirectory.getAbsolutePath()+"\\"+filename);
		
		
		
		try {
			FileUtils.writeStringToFile(outputFile, content.toString(), Charset.forName("UTF-8"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void appendLine(String input) {
		content.append(input + "\n");
	}

}
