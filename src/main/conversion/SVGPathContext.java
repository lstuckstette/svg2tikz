package main.conversion;

import java.awt.Color;
import java.util.ArrayList;

public class SVGPathContext {

	private String fillColor;
	private String strokeColor;
	private String strokeWidth;
	private String styleContainer;
	private String transformation;
	private String currentX = "0";
	private String currentY = "0";
	private String startX = "0";
	private String startY = "0";

	private ArrayList<String> drawComponents;

	public SVGPathContext() {
		drawComponents = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}

	public String getTikZString() {
		StringBuilder builder = new StringBuilder();
		ArrayList<String> settings = new ArrayList<>();
		// Setup path enviroment:
		if (fillColor != null) {
			if (!fillColor.equals("none")) {
				Color fillC = Color.decode(fillColor);
				builder.append("\\definecolor{fillColor}{RGB}{" + fillC.getRed() + "," + fillC.getGreen() + ","
						+ fillC.getBlue() + "}");
				settings.add("fill=fillColor");
			}
		}
		if (strokeColor != null) {
			if (!strokeColor.equals("none")) {
				Color strokeC = Color.decode(strokeColor); // convert hex rgb to decimal rgb
				builder.append("\\definecolor{strokeColor}{RGB}{" + strokeC.getRed() + "," + strokeC.getGreen() + ","
						+ strokeC.getBlue() + "}");
				settings.add("draw=strokeColor");
			}
		}
		if (strokeWidth != null) {
			if (!strokeWidth.equals("none")) {

				settings.add("line width=" + strokeWidth);
			}
		}

		String settingsJoined = "";
		for (String s : settings) {
			settingsJoined += s + ",";			// join settings
		}
		settingsJoined = settingsJoined.substring(0, settingsJoined.length()-1); //crop last ','

		builder.append("\\path []");
		return null;
	}

	public String getCurrentX() {
		return currentX;
	}

	public void setCurrentX(String currentX) {
		this.currentX = currentX;
	}

	public String getCurrentY() {
		return currentY;
	}

	public String getStartX() {
		return startX;
	}

	public void setStartX(String startX) {
		this.startX = startX;
	}

	public String getStartY() {
		return startY;
	}

	public void setStartY(String startY) {
		this.startY = startY;
	}

	public void setCurrentY(String currentY) {
		this.currentY = currentY;
	}

	public void addComponent(String input) {
		drawComponents.add(input);
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor.replaceAll("\"", "");
	}

	public void setStrokeColor(String strokeColor) {
		this.strokeColor = strokeColor.replaceAll("\"", "");
	}

	public void setStrokeWidth(String strokeWidth) {
		this.strokeWidth = strokeWidth.replaceAll("\"", "");
	}

	public void setStyleContainer(String styleContainer) {
		this.styleContainer = styleContainer.replaceAll("\"", "");
	}

	public void setTransformation(String transformation) {
		this.transformation = transformation.replaceAll("\"", "");
	}

}
