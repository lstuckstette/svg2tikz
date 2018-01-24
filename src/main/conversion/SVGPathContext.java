package main.conversion;

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
		/*
		 * TODO: implement generation!
		 */
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
		this.fillColor = fillColor;
	}

	public void setStrokeColor(String strokeColor) {
		this.strokeColor = strokeColor;
	}

	public void setStrokeWidth(String strokeWidth) {
		this.strokeWidth = strokeWidth;
	}

	public void setStyleContainer(String styleContainer) {
		this.styleContainer = styleContainer;
	}

	public void setTransformation(String transformation) {
		this.transformation = transformation;
	}

}
