package main.conversion;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import main.antlr4.SVGParser.AttributeContext;
import main.antlr4.SVGParser.CircleContext;
import main.antlr4.SVGParser.DefsContext;
import main.antlr4.SVGParser.EllipseContext;
import main.antlr4.SVGParser.FilterContext;
import main.antlr4.SVGParser.GContext;
import main.antlr4.SVGParser.LineContext;
import main.antlr4.SVGParser.LinearGradientContext;
import main.antlr4.SVGParser.PathContext;
import main.antlr4.SVGParser.Path_element_closeContext;
import main.antlr4.SVGParser.Path_element_cubiccurve_relContext;
import main.antlr4.SVGParser.Path_element_lineto_relContext;
import main.antlr4.SVGParser.Path_element_movetoContext;
import main.antlr4.SVGParser.Path_element_moveto_relContext;
import main.antlr4.SVGParser.PolygonContext;
import main.antlr4.SVGParser.PolylineContext;
import main.antlr4.SVGParser.RadialGradientContext;
import main.antlr4.SVGParser.RectContext;
import main.antlr4.SVGParser.StopContext;
import main.antlr4.SVGParser.SvgRootContext;
import main.antlr4.SVGParser.TextContext;
import main.antlr4.SVGParser.UnnamedElementContext;
import main.antlr4.SVGParser.UnnamedElement_SelfCloseContext;
import main.antlr4.SVGParserBaseListener;

public class SVGParseListener extends SVGParserBaseListener {

	private TikzBuilder tikzBuilder;
	private SVGPathContext currentPath;

	public SVGParseListener(TikzBuilder tikzBuilder) {
		this.tikzBuilder = tikzBuilder;
	}

	@Override
	public void exitSvgRoot(SvgRootContext ctx) {

	}

	@Override
	public void exitCircle(CircleContext ctx) {
		// TODO Auto-generated method stub
		super.exitCircle(ctx);

		List<AttributeContext> list = ctx.attribute();

		for (AttributeContext a : list) {
			// System.out.println("Attribute Name: "+a.NAME());
			// System.out.println("Attribute Value: "+a.STRING());

			String r = "0";
			String cx = "0";
			String cy = "0";

			if (a.NAME().toString() == "r") {
				r = a.STRING().toString();
			}

			if (a.NAME().toString() == "cx") {
				cx = a.STRING().toString();
			}

			if (a.NAME().toString() == "cy") {
				cy = a.STRING().toString();
			}

			String path = "\\draw (" + cx + "," + cy + ") circle (" + r + ");";

			tikzBuilder.appendString(path);
		}

	}

	@Override
	public void exitRect(RectContext ctx) {
		// TODO Auto-generated method stub
		super.exitRect(ctx);

		List<AttributeContext> list = ctx.attribute();

		for (AttributeContext a : list) {

			String x = "0";
			String y = "0";
			String width = "0";
			String height = "0";

			if (a.NAME().toString() == "x") {
				x = a.STRING().toString();
			}

			if (a.NAME().toString() == "y") {
				y = a.STRING().toString();
			}

			if (a.NAME().toString() == "width") {
				width = a.STRING().toString();
			}

			if (a.NAME().toString() == "height") {
				height = a.STRING().toString();
			}

			String path = "\\draw (" + x + "," + y + ") -- (" + height + "," + y + ") -- (" + height + "," + width
					+ ") -- (" + x + "," + width + ") -- (" + x + "," + y + ")";

			tikzBuilder.appendString(path);
		}
	}

	@Override
	public void exitEllipse(EllipseContext ctx) {
		// TODO Auto-generated method stub
		super.exitEllipse(ctx);

		List<AttributeContext> list = ctx.attribute();

		for (AttributeContext a : list) {

			String cx = "0";
			String cy = "0";
			String rx = "0";
			String ry = "0";

			if (a.NAME().toString() == "cx") {
				cx = a.STRING().toString();
			}

			if (a.NAME().toString() == "cy") {
				cy = a.STRING().toString();
			}

			if (a.NAME().toString() == "rx") {
				rx = a.STRING().toString();
			}

			if (a.NAME().toString() == "ry") {
				ry = a.STRING().toString();
			}

			String path = "\\draw (" + cx + "," + cy + ") ellipse (" + rx + " and " + ry + ");";

			tikzBuilder.appendString(path);
		}

	}

	@Override
	public void exitLine(LineContext ctx) {
		// TODO Auto-generated method stub
		super.exitLine(ctx);

		List<AttributeContext> list = ctx.attribute();

		for (AttributeContext a : list) {

			String x1 = "0";
			String y1 = "0";
			String x2 = "0";
			String y2 = "0";

			if (a.NAME().toString() == "x1") {
				x1 = a.STRING().toString();
			}

			if (a.NAME().toString() == "y1") {
				y1 = a.STRING().toString();
			}

			if (a.NAME().toString() == "x2") {
				x2 = a.STRING().toString();
			}

			if (a.NAME().toString() == "y2") {
				y2 = a.STRING().toString();
			}

			String path = "\\draw (" + x1 + "," + y1 + ") -- (" + x2 + "," + y2 + ");";

			tikzBuilder.appendString(path);
		}
	}

	@Override
	public void exitPolygon(PolygonContext ctx) {
		// TODO Auto-generated method stub
		super.exitPolygon(ctx);

		// ??????

		List<AttributeContext> list = ctx.attribute();

		for (AttributeContext a : list) {

			String points = "0,0 ";

			if (a.NAME().toString() == "points") {
				points = a.STRING().toString();
			}

			String[] point = points.split(" ");

			String coordinates = "";

			for (String coordinate : point) {
				coordinates = coordinates + " (" + coordinate + ")";
			}

			String path = "\\draw plot[smooth, tension=2] coordinates { " + coordinates + "};";

			tikzBuilder.appendString(path);
		}
	}

	@Override
	public void exitPolyline(PolylineContext ctx) {
		// TODO Auto-generated method stub
		super.exitPolyline(ctx);

		List<AttributeContext> list = ctx.attribute();

		for (AttributeContext a : list) {

			String points = "0,0 ";

			if (a.NAME().toString() == "points") {
				points = a.STRING().toString();
			}

			String[] point = points.split(" ");

			String coordinates = "";

			for (String coordinate : point) {
				coordinates = coordinates + " (" + coordinate + ")";
			}

			String path = "\\draw plot[smooth, tension=2] coordinates { " + coordinates + "};";

			tikzBuilder.appendString(path);
		}
	}

	@Override
	public void enterPath(PathContext ctx) {
		// create new SVGPathContext!
		currentPath = new SVGPathContext();
	}

	@Override
	public void exitPath(PathContext ctx) {
		/*
		 * gute quelle: https://en.wikibooks.org/wiki/LaTeX/PGF/TikZ
		 * 
		 */

		// Add style-info to current PathContext
		List<AttributeContext> list = ctx.attribute();
		for (AttributeContext a : list) {
			switch (a.NAME().toString()) {

			case "transform":
				// handle transformation:
				currentPath.setTransformation(a.STRING().toString());
				break;
			case "fill":
				// handle fill color:
				currentPath.setFillColor(a.STRING().toString());
				break;
			case "stroke":
				// handle line color:
				currentPath.setStrokeColor(a.STRING().toString());
				break;
			case "stroke-width":
				// handle line-width
				currentPath.setStrokeWidth(a.STRING().toString());
				break;

			}
		}
	}

	@Override
	public void exitPath_element_moveto(Path_element_movetoContext ctx) {
		List<TerminalNode> attributes = ctx.NUMBER();
		currentPath.setCurrentX(attributes.get(0).toString());
		currentPath.setCurrentY(attributes.get(1).toString());
	}

	@Override
	public void enterPath_element_moveto_rel(Path_element_moveto_relContext ctx) {

		List<TerminalNode> attributes = ctx.NUMBER();

		double abs_x = Double.parseDouble(currentPath.getCurrentX()) + Double.parseDouble(attributes.get(0).toString());
		double abs_y = Double.parseDouble(currentPath.getCurrentY()) + Double.parseDouble(attributes.get(1).toString());

		currentPath.setCurrentX(String.valueOf(abs_x));
		currentPath.setCurrentY(String.valueOf(abs_y));
	}

	@Override
	public void exitPath_element_cubiccurve_rel(Path_element_cubiccurve_relContext ctx) {

		List<TerminalNode> attributes = ctx.NUMBER();

		double abs_x1 = Double.parseDouble(currentPath.getCurrentX())
				+ Double.parseDouble(attributes.get(0).toString());
		double abs_y1 = Double.parseDouble(currentPath.getCurrentY())
				+ Double.parseDouble(attributes.get(1).toString());
		double abs_x2 = Double.parseDouble(currentPath.getCurrentX())
				+ Double.parseDouble(attributes.get(2).toString());
		double abs_y2 = Double.parseDouble(currentPath.getCurrentY())
				+ Double.parseDouble(attributes.get(3).toString());
		double abs_x = Double.parseDouble(currentPath.getCurrentX()) + Double.parseDouble(attributes.get(4).toString());
		double abs_y = Double.parseDouble(currentPath.getCurrentY()) + Double.parseDouble(attributes.get(5).toString());

		String tikzDraw = "\\draw (" + abs_x1 + "," + abs_y1 + ") .. controls (" + abs_x2 + "," + abs_y2 + " .. ("
				+ abs_x + "," + abs_y + ")";
		currentPath.addComponent(tikzDraw);
	}

	@Override
	public void exitPath_element_lineto_rel(Path_element_lineto_relContext ctx) {

		List<TerminalNode> attributes = ctx.NUMBER();

		double abs_x = Double.parseDouble(currentPath.getCurrentX()) + Double.parseDouble(attributes.get(0).toString());
		double abs_y = Double.parseDouble(currentPath.getCurrentY()) + Double.parseDouble(attributes.get(1).toString());

		String tikzDraw = "\\draw (" + currentPath.getCurrentX() + "," + currentPath.getCurrentY() + ") -- (" + abs_x
				+ "," + abs_y + ")";
		currentPath.addComponent(tikzDraw);
	}

	@Override
	public void exitPath_element_close(Path_element_closeContext ctx) {
		// draw straight line back to start-coord:
		String tikzDraw = "\\draw (" + currentPath.getCurrentX() + "," + currentPath.getCurrentY() + ") -- ("
				+ currentPath.getStartX() + "," + currentPath.getStartY() + ")";
	}

	@Override
	public void exitText(TextContext ctx) {
		// TODO Auto-generated method stub
		super.exitText(ctx);
	}

	@Override
	public void exitUnnamedElement(UnnamedElementContext ctx) {
		System.out.println("FOUND UNKNOWN NODE! IGNORING.");
	}

	@Override
	public void exitUnnamedElement_SelfClose(UnnamedElement_SelfCloseContext ctx) {
		System.out.println("FOUND UNKNOWN NODE! IGNORING.");
	}

}
