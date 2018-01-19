package main.gui;

import java.io.File;
import java.util.List;

import javax.swing.JTextArea;
import javax.swing.SwingWorker;

import main.conversion.LatexBuilder;
import main.conversion.SVGParserBuilder;
import main.conversion.TikzBuilder;

/**
 * Searches the text files under the given directory and counts the number of
 * instances a given word is found in these file.
 * 
 * @author
 */
public class ConversionWorker extends SwingWorker<Boolean, String> {

	/*
	private static void failIfInterrupted() throws InterruptedException {
		if (Thread.currentThread().isInterrupted()) {
			throw new InterruptedException("Interrupted while searching files");
		}
	}*/

	private final File sourceFile;

	private final File targetDirectory;

	/** The text area where messages are written. */
	private final JTextArea messagesTextArea;

	/**
	 * Creates an instance of the worker
	 * 
	 * @param sourceFile
	 *            The svg source File
	 * @param targetDirectory
	 *            The target Direcory, where the generated file(s) will be put
	 * @param messagesTextArea
	 *            The text area where messages are written
	 */
	public ConversionWorker(final File sourceFile, final File targetDirectory, final JTextArea messagesTextArea) {
		this.sourceFile = sourceFile;
		this.targetDirectory = targetDirectory;
		this.messagesTextArea = messagesTextArea;
	}

	@Override
	protected Boolean doInBackground() throws Exception {
		// boolean success = false;

		// parse File
		publish("Parsing SVG-file '" + sourceFile.getName() + "' with antlr4:");
		SVGParserBuilder parserBuilder = new SVGParserBuilder(sourceFile);
		parserBuilder.parseFile();
		//Thread.sleep(1000);
		publish("done!");
		setProgress(20);


		// writing output File
		publish("Building LateX-template containing TikZ-Code & Writing output file to "+targetDirectory.getAbsolutePath()+" :");
		String targetFileName = sourceFile.getName();
		targetFileName = targetFileName.replaceAll(".svg", ".tex");
		parserBuilder.generateLatex(targetDirectory,targetFileName);
		//Thread.sleep(1000);
		publish("done!");
		setProgress(100);

		return true;

	}

	@Override
	protected void process(final List<String> chunks) {
		// Updates the messages text area
		for (final String string : chunks) {
			messagesTextArea.append(string);
			messagesTextArea.append("\n");
		}
	}
}