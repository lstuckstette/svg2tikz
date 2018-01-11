package main;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import main.gui.Application;


/*
 * To generate Lexer/Parser, build against maven-goal 'antlr4:antlr4' 
 * and copy generated files from 'target/generated-sources/antlr4' 
 * to preferred destination
 * 
 * 
 */

public class Main {
	public static void main(final String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				final Application frame = new Application();
				frame.setTitle("SVG2TikZ Converter by L.Stuckstette & B. Schmidt ~");
				frame.setSize(800, 600);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				//Center Window:
				Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
				frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
				frame.setVisible(true);
			}
		});
	}
}