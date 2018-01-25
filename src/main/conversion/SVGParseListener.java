package main.conversion;

import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.GeneralPath;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.io.output.ByteArrayOutputStream;

import main.antlr4.SVGParser.AttributeContext;
import main.antlr4.SVGParser.CircleContext;
import main.antlr4.SVGParser.DefsContext;
import main.antlr4.SVGParser.EllipseContext;
import main.antlr4.SVGParser.FilterContext;
import main.antlr4.SVGParser.GContext;
import main.antlr4.SVGParser.LineContext;
import main.antlr4.SVGParser.LinearGradientContext;
import main.antlr4.SVGParser.NumberContext;
import main.antlr4.SVGParser.PathContext;
import main.antlr4.SVGParser.Path_element_arcContext;
import main.antlr4.SVGParser.Path_element_arc_relContext;
import main.antlr4.SVGParser.Path_element_closeContext;
import main.antlr4.SVGParser.Path_element_cubiccurveContext;
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
import main.jtikz.TikzGraphics2D;

public class SVGParseListener extends SVGParserBaseListener {

	private Path2D currentPath;
	// private TikzGraphics2D g2d;
	private Graphics2D g2d;
	BufferedImage output;

	public SVGParseListener(ByteArrayOutputStream tikzOutput) {
		g2d = new TikzGraphics2D(tikzOutput);
		currentPath = new Path2D.Double();

		output = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB);
		g2d = output.createGraphics();
		JOptionPane.showMessageDialog(null, new ImageIcon(output));

	}

	static double getNumber(NumberContext ctx) {

		boolean signed = ctx.UNARY_OPERATOR() != null ? true : false;

		String unsignedBody = "";
		if (ctx.unsigned_number().UNSIGNED_FLOAT() != null) {
			unsignedBody = ctx.unsigned_number().UNSIGNED_FLOAT().toString();
		} else if (ctx.unsigned_number().UNSIGNED_INT() != null) {
			unsignedBody = ctx.unsigned_number().UNSIGNED_INT().toString();
		} else {
			unsignedBody = "0";
			System.out.println("FATAL NUMBER ERROR!!!!!!!");
		}

		double ret = Double.parseDouble(unsignedBody);

		if (signed) {
			ret = 0 - ret;
		}

		return ret;
	}

	@Override
	public void exitSvgRoot(SvgRootContext ctx) {
		JOptionPane.showMessageDialog(null, new ImageIcon(output));
	}

	@Override
	public void exitCircle(CircleContext ctx) {
		// TODO Auto-generated method stub
		super.exitCircle(ctx);

		List<AttributeContext> list = ctx.attribute();

		String r = "0";
		String cx = "0";
		String cy = "0";

		for (AttributeContext a : list) {
			// System.out.println("Attribute Name: "+a.NAME());
			// System.out.println("Attribute Value: "+a.STRING());

			String test = a.NAME().toString();

			if (a.NAME().toString().equals("r")) {
				r = a.STRING().getText();
				Pattern pp = Pattern.compile("\\d+");
				Matcher m = pp.matcher(r);
				while (m.find()) {
					r = m.group();
				}
			}

			if (a.NAME().toString().equals("cx")) {
				cx = a.STRING().getText();
				Pattern pp = Pattern.compile("\\d+");
				Matcher m = pp.matcher(cx);
				while (m.find()) {
					cx = m.group();
				}
			}

			if (a.NAME().toString().equals("cy")) {
				cy = a.STRING().getText();
				Pattern pp = Pattern.compile("\\d+");
				Matcher m = pp.matcher(cy);
				while (m.find()) {
					cy = m.group();
				}
			}

		}

		String path = "\\draw (" + cx + "," + cy + ") circle (" + r + ");";

		// tikzBuilder.appendString(path);

	}

	@Override
	public void exitRect(RectContext ctx) {
		// TODO Auto-generated method stub
		super.exitRect(ctx);

		List<AttributeContext> list = ctx.attribute();

		String x = "0";
		String y = "0";
		String width = "0";
		String height = "0";

		for (AttributeContext a : list) {

			if (a.NAME().toString().equals("x")) {
				x = a.STRING().getText();
				Pattern pp = Pattern.compile("\\d+");
				Matcher m = pp.matcher(x);
				while (m.find()) {
					x = m.group();
				}
			}

			if (a.NAME().toString().equals("y")) {
				y = a.STRING().getText();
				Pattern pp = Pattern.compile("\\d+");
				Matcher m = pp.matcher(y);
				while (m.find()) {
					y = m.group();
				}
			}

			if (a.NAME().toString().equals("width")) {
				width = a.STRING().getText();
				Pattern pp = Pattern.compile("\\d+");
				Matcher m = pp.matcher(width);
				while (m.find()) {
					width = m.group();
				}
			}

			if (a.NAME().toString().equals("height")) {
				height = a.STRING().getText();
				Pattern pp = Pattern.compile("\\d+");
				Matcher m = pp.matcher(height);
				while (m.find()) {
					height = m.group();
				}
			}

		}

		String path = "\\draw (" + x + "," + y + ") -- (" + height + "," + y + ") -- (" + height + "," + width
				+ ") -- (" + x + "," + width + ") -- (" + x + "," + y + ");";

		// tikzBuilder.appendString(path);
	}

	@Override
	public void exitEllipse(EllipseContext ctx) {
		// TODO Auto-generated method stub
		super.exitEllipse(ctx);

		List<AttributeContext> list = ctx.attribute();

		String cx = "0";
		String cy = "0";
		String rx = "0";
		String ry = "0";

		for (AttributeContext a : list) {

			if (a.NAME().toString().equals("cx")) {
				cx = a.STRING().getText();
				Pattern pp = Pattern.compile("\\d+");
				Matcher m = pp.matcher(cx);
				while (m.find()) {
					cx = m.group();
				}
			}

			if (a.NAME().toString().equals("cy")) {
				cy = a.STRING().getText();
				Pattern pp = Pattern.compile("\\d+");
				Matcher m = pp.matcher(cy);
				while (m.find()) {
					cy = m.group();
				}
			}

			if (a.NAME().toString().equals("rx")) {
				rx = a.STRING().getText();
				Pattern pp = Pattern.compile("\\d+");
				Matcher m = pp.matcher(rx);
				while (m.find()) {
					rx = m.group();
				}
			}

			if (a.NAME().toString().equals("ry")) {
				ry = a.STRING().getText();
				Pattern pp = Pattern.compile("\\d+");
				Matcher m = pp.matcher(ry);
				while (m.find()) {
					ry = m.group();
				}
			}

		}

		String path = "\\draw (" + cx + "," + cy + ") ellipse (" + rx + " and " + ry + ");";

		// tikzBuilder.appendString(path);

	}

	@Override
	public void exitLine(LineContext ctx) {
		// TODO Auto-generated method stub
		super.exitLine(ctx);

		List<AttributeContext> list = ctx.attribute();

		String x1 = "0";
		String y1 = "0";
		String x2 = "0";
		String y2 = "0";

		for (AttributeContext a : list) {

			if (a.NAME().toString().equals("x1")) {
				x1 = a.STRING().getText();
				Pattern pp = Pattern.compile("\\d+");
				Matcher m = pp.matcher(x1);
				while (m.find()) {
					x1 = m.group();
				}
			}

			if (a.NAME().toString().equals("y1")) {
				y1 = a.STRING().getText();
				Pattern pp = Pattern.compile("\\d+");
				Matcher m = pp.matcher(y1);
				while (m.find()) {
					y1 = m.group();
				}
			}

			if (a.NAME().toString().equals("x2")) {
				x2 = a.STRING().getText();
				Pattern pp = Pattern.compile("\\d+");
				Matcher m = pp.matcher(x2);
				while (m.find()) {
					x2 = m.group();
				}
			}

			if (a.NAME().toString().equals("y2")) {
				y2 = a.STRING().getText();
				Pattern pp = Pattern.compile("\\d+");
				Matcher m = pp.matcher(y2);
				while (m.find()) {
					y2 = m.group();
				}
			}

		}

		String path = "\\draw (" + x1 + "," + y1 + ") -- (" + x2 + "," + y2 + ");";

		// tikzBuilder.appendString(path);
	}

	@Override
	public void exitPolygon(PolygonContext ctx) {
		// TODO Auto-generated method stub
		super.exitPolygon(ctx);

		List<AttributeContext> list = ctx.attribute();

		String points = "0,0";

		String coordinates = "";

		for (AttributeContext a : list) {

			if (a.NAME().toString().equals("points")) {

				points = a.STRING().getText();

				String[] point = points.split(" ");

				for (int i = 0; i < point.length; i++) {

					String coordinate = point[i];

					if (i == 0) {
						coordinate = coordinate.substring(1);
					}

					if (i + 1 == point.length) {
						coordinate = coordinate.substring(0, coordinate.length() - 1);
					}

					if (i + 1 < point.length) {
						coordinates = coordinates + " (" + coordinate + ") --";
					} else {
						coordinates = coordinates + " (" + coordinate + ") -- cycle";
					}

				}

			}

		}

		String scope = "\\begin{scope}[xscale=1,yscale=-1]";
		String path = "\\draw" + coordinates + ";";
		String scope2 = "\\end{scope}";

		/*
		 * tikzBuilder.appendString(scope); tikzBuilder.appendString(path);
		 * tikzBuilder.appendString(scope2);
		 */
	}

	@Override
	public void exitPolyline(PolylineContext ctx) {
		// TODO Auto-generated method stub
		super.exitPolyline(ctx);

		List<AttributeContext> list = ctx.attribute();

		String points = "0,0";

		String coordinates = "";

		for (AttributeContext a : list) {

			if (a.NAME().toString().equals("points")) {

				points = a.STRING().getText();

				String[] point = points.split(" ");

				for (int i = 0; i < point.length; i++) {

					String coordinate = point[i];

					if (i == 0) {
						coordinate = coordinate.substring(1);
					}

					if (i + 1 == point.length) {
						coordinate = coordinate.substring(0, coordinate.length() - 1);
					}

					if (i + 1 < point.length) {
						coordinates = coordinates + " (" + coordinate + ") --";
					} else {
						coordinates = coordinates + " (" + coordinate + ")";
					}

				}
			}

		}

		String scope = "\\begin{scope}[xscale=1,yscale=-1]";
		String path = "\\draw" + coordinates + ";";
		String scope2 = "\\end{scope}";

		/*
		 * tikzBuilder.appendString(scope); tikzBuilder.appendString(path);
		 * tikzBuilder.appendString(scope2);
		 */
	}

	@Override
	public void enterPath(PathContext ctx) {
		System.out.println("reached!?");
		currentPath = new Path2D.Double();
	}

	@Override
	public void exitPath(PathContext ctx) {
		/*
		 * gute quelle: https://en.wikibooks.org/wiki/LaTeX/PGF/TikZ
		 * 
		 */

		// Add style-info to current PathContext
		// List<AttributeContext> list = ctx.attribute();
		// for (AttributeContext a : list) {
		// switch (a.NAME().toString()) {
		//
		// case "transform":
		// // handle transformation:
		// currentPath.setTransformation(a.STRING().toString());
		// break;
		// case "fill":
		// // handle fill color:
		// currentPath.setFillColor(a.STRING().toString());
		// break;
		// case "stroke":
		// // handle line color:
		// currentPath.setStrokeColor(a.STRING().toString());
		// break;
		// case "stroke-width":
		// // handle line-width
		// currentPath.setStrokeWidth(a.STRING().toString());
		// break;
		//
		// }
		// }

		g2d.draw(currentPath);
		// create new
		currentPath = new Path2D.Double();

	}

	@Override
	public void exitPath_element_moveto(Path_element_movetoContext ctx) {

		List<NumberContext> attributes = ctx.number();
		// check input parameters:
		if (attributes.size() < 2) {
			System.out.println("Error on Path-MoveTo! to few inputs.");
			return;
		}
		// move current Path:
		double x = SVGParseListener.getNumber(attributes.get(0));
		double y = SVGParseListener.getNumber(attributes.get(1));
		currentPath.moveTo(x, y);
	}

	@Override
	public void exitPath_element_moveto_rel(Path_element_moveto_relContext ctx) {
		// JUST ASSUME RELATVE POSITION WAS 0,0!!!! not nice!
		List<NumberContext> attributes = ctx.number();
		// check input parameters:
		if (attributes.size() < 2) {
			System.out.println("Error on Path-MoveTo! Too few inputs.");
			return;
		}
		// move current Path:
		double x = SVGParseListener.getNumber(attributes.get(0));
		double y = SVGParseListener.getNumber(attributes.get(1));
		currentPath.moveTo(x, y);
	}

	@Override
	public void exitPath_element_cubiccurve_rel(Path_element_cubiccurve_relContext ctx) {
		// check: https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths
		List<NumberContext> attributes = ctx.number();

		// System.out.println("CC: " + currentPath.getCurrentPoint().getX() + "|" +
		// currentPath.getCurrentPoint().getY());

		// check input parameters:
		if (attributes.size() < 6) {
			System.out.println("Error on cubic-curve-rel! Too few inputs.");
			return;
		}
		// assign parsed numbers:
		double x1_rel = SVGParseListener.getNumber(attributes.get(0));
		double y1_rel = SVGParseListener.getNumber(attributes.get(1));
		double x2_rel = SVGParseListener.getNumber(attributes.get(2));
		double y2_rel = SVGParseListener.getNumber(attributes.get(3));
		double x_rel = SVGParseListener.getNumber(attributes.get(4));
		double y_rel = SVGParseListener.getNumber(attributes.get(5));

		// convert relative to absolute coords:

		double x1 = currentPath.getCurrentPoint().getX() + x1_rel;
		double y1 = currentPath.getCurrentPoint().getX() + y1_rel;
		double x2 = currentPath.getCurrentPoint().getX() + x2_rel;
		double y2 = currentPath.getCurrentPoint().getX() + y2_rel;
		double x = currentPath.getCurrentPoint().getX() + x_rel;
		double y = currentPath.getCurrentPoint().getX() + y_rel;

		currentPath.curveTo(x1, y1, x2, y2, x, y);
		currentPath.moveTo(x, y);

	}

	@Override
	public void exitPath_element_cubiccurve(Path_element_cubiccurveContext ctx) {
		// check: https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths
		List<NumberContext> attributes = ctx.number();

		// check input parameters:
		if (attributes.size() < 6) {
			System.out.println("Error on cubic-curve! Too few inputs.");
			return;
		}
		// assign parsed numbers:
		double x1 = SVGParseListener.getNumber(attributes.get(0));
		double y1 = SVGParseListener.getNumber(attributes.get(1));
		double x2 = SVGParseListener.getNumber(attributes.get(2));
		double y2 = SVGParseListener.getNumber(attributes.get(3));
		double x = SVGParseListener.getNumber(attributes.get(4));
		double y = SVGParseListener.getNumber(attributes.get(5));

		currentPath.curveTo(x1, y1, x2, y2, x, y);
	}

	@Override
	public void exitPath_element_arc_rel(Path_element_arc_relContext ctx) {
		// check: https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths
		List<NumberContext> attributes = ctx.number();
		
		// check input parameters:
		if (attributes.size() < 7) {
			System.out.println("Error on arc-rel! Too few inputs.");
			return;
		}

		double xradius = SVGParseListener.getNumber(attributes.get(0));
		double yradius = SVGParseListener.getNumber(attributes.get(1));
		double rotation = SVGParseListener.getNumber(attributes.get(2));
		double largearc = SVGParseListener.getNumber(attributes.get(3));
		double sweep = SVGParseListener.getNumber(attributes.get(4));
		double xendstroke = SVGParseListener.getNumber(attributes.get(5));
		double yendstroke = SVGParseListener.getNumber(attributes.get(6));

		Arc2D arc = new Arc2D.Double(currentPath.getCurrentPoint().getX(), currentPath.getCurrentPoint().getY(), 50, 50,
				40, 40, Arc2D.OPEN);
		
		
	}

	@Override
	public void exitPath_element_arc(Path_element_arcContext ctx) {
		// TODO Auto-generated method stub
		super.exitPath_element_arc(ctx);
	}

	@Override
	public void exitPath_element_lineto_rel(Path_element_lineto_relContext ctx) {
		// check: https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths
		List<NumberContext> attributes = ctx.number();

		System.out.println("lineto!");

		// check input parameters:
		if (attributes.size() < 2) {
			System.out.println("Error on lineto-rel! Too few inputs.");
			return;
		}
		// assign parsed numbers:
		double x = SVGParseListener.getNumber(attributes.get(0));
		double y = SVGParseListener.getNumber(attributes.get(1));

		currentPath.lineTo(x, y);
		currentPath.moveTo(x, y);

	}

	@Override
	public void exitPath_element_close(Path_element_closeContext ctx) {
		// simply close path:
		currentPath.closePath();
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
