package main.conversion;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.lang.reflect.Field;
import java.util.List;

import org.apache.batik.parser.AWTPathProducer;
import org.apache.commons.io.output.ByteArrayOutputStream;

import main.antlr4.SVGParser.AttributeContext;
import main.antlr4.SVGParser.CircleContext;
import main.antlr4.SVGParser.EllipseContext;
import main.antlr4.SVGParser.GContext;
import main.antlr4.SVGParser.LineContext;
import main.antlr4.SVGParser.NumberContext;
import main.antlr4.SVGParser.PathContext;
import main.antlr4.SVGParser.Path_element_arcContext;
import main.antlr4.SVGParser.Path_element_arc_relContext;
import main.antlr4.SVGParser.Path_element_closeContext;
import main.antlr4.SVGParser.Path_element_cubiccurveContext;
import main.antlr4.SVGParser.Path_element_cubiccurve_relContext;
import main.antlr4.SVGParser.Path_element_cubicreflectcurveContext;
import main.antlr4.SVGParser.Path_element_cubicreflectcurve_relContext;
import main.antlr4.SVGParser.Path_element_horizontallineContext;
import main.antlr4.SVGParser.Path_element_horizontalline_relContext;
import main.antlr4.SVGParser.Path_element_linetoContext;
import main.antlr4.SVGParser.Path_element_lineto_relContext;
import main.antlr4.SVGParser.Path_element_movetoContext;
import main.antlr4.SVGParser.Path_element_moveto_relContext;
import main.antlr4.SVGParser.Path_element_quadraticcurveContext;
import main.antlr4.SVGParser.Path_element_quadraticcurve_relContext;
import main.antlr4.SVGParser.Path_element_quadraticreflectcurveContext;
import main.antlr4.SVGParser.Path_element_quadraticreflectcurve_relContext;
import main.antlr4.SVGParser.Path_element_verticallineContext;
import main.antlr4.SVGParser.Path_element_verticalline_relContext;
import main.antlr4.SVGParser.PolygonContext;
import main.antlr4.SVGParser.PolylineContext;
import main.antlr4.SVGParser.RectContext;
import main.antlr4.SVGParser.SvgRootContext;
import main.antlr4.SVGParser.TextContext;
import main.antlr4.SVGParser.UnnamedElementContext;
import main.antlr4.SVGParser.UnnamedElement_SelfCloseContext;
import main.antlr4.SVGParserBaseListener;
import main.jtikz.TikzGraphics2D;

public class SVGParseListener extends SVGParserBaseListener {

	private int pathCounter = 0;
	private AWTPathProducer currentPath;
	private TikzGraphics2D g2d;
	// private Graphics2D g2d;
	// BufferedImage output;

	public SVGParseListener(ByteArrayOutputStream tikzOutput) {
		g2d = new TikzGraphics2D(tikzOutput);
		currentPath = new AWTPathProducer();
		currentPath.setWindingRule(0); // tf is a windingrule oO?
		currentPath.startPath();

		// output = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB);
		// g2d = output.createGraphics();
		// g2d.setPaint(Color.white);
		// g2d.fillRect(0, 0, output.getWidth(), output.getHeight());

	}

	static float getNumber(NumberContext ctx) {

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

		float ret = Float.parseFloat(unsignedBody);

		if (signed) {
			ret = 0 - ret;
		}

		return ret;
	}

	@Override
	public void exitSvgRoot(SvgRootContext ctx) {
		System.out.println("visited " + pathCounter + " Paths!");
		g2d.flush(); // force tikz-output!
		// JOptionPane.showMessageDialog(null, new ImageIcon(output));
	}

	public void exitCircle(CircleContext ctx) {
		AffineTransform old = g2d.getTransform(); // save old Transform!

		List<AttributeContext> list = ctx.attribute();

		String r = "0";
		String cx = "0";
		String cy = "0";

		String fill = "";
		String stroke = "";
		String strokeWidth = "";
		String style = "";

		Color c = Color.decode("#000000");

		for (AttributeContext a : list) {
			// System.out.println("Attribute Name: "+a.NAME());
			// System.out.println("Attribute Value: "+a.STRING());

			if (a.NAME().toString().equals("r")) {
				r = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("cx")) {
				cx = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("cy")) {
				cy = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("stroke")) {
				stroke = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("fill")) {
				fill = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("stroke-width")) {
				strokeWidth = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("style")) {
				style = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("transform")) {
				String transformNode = a.STRING().toString();
				transformNode = transformNode.replaceAll("\"", "");
				// example:
				// matrix(0.7071067811865474,0.7071067811865473,-0.7071067811865474,0.7071067811865473,0,0)
				transformNode = transformNode.replace("matrix", "");
				transformNode = transformNode.replaceAll("\\(", "");
				transformNode = transformNode.replaceAll("\\)", "");
				// example:
				// 1.892338560388366,1.892338560388366,-1.892338560388366,1.892338560388366,588.3352226488195,-294.8095263511118
				String[] variableStrings = transformNode.split(",");
				if (variableStrings.length != 6) {
					System.err.println("malformed transform-matrix in path!");
					break;
				}
				float variables[] = new float[6];
				for (int i = 0; i < variableStrings.length; i++) {
					variables[i] = Float.parseFloat(variableStrings[i]);
				}
				AffineTransform trans = new AffineTransform(variables[0], variables[1], variables[2], variables[3],
						variables[4], variables[5]);
				g2d.transform(trans); // add transformation to graphics!
			}

		}

		if (!fill.equals("") && !fill.equals("none")) {
			c = stringToColor(fill);
			g2d.setColor(c);
			Ellipse2D c2 = new Ellipse2D.Float(Float.parseFloat(cx), Float.parseFloat(cy), 2 * Float.parseFloat(r),
					2 * Float.parseFloat(r));
			g2d.fill(c2);
		}

		if (!strokeWidth.equals("") && !strokeWidth.equals("none")) {
			g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidth)));
		}

		if (!stroke.equals("") && !stroke.equals("none")) {
			c = stringToColor(stroke);
			g2d.setColor(c);
			Ellipse2D c2 = new Ellipse2D.Float(Float.parseFloat(cx), Float.parseFloat(cy), 2 * Float.parseFloat(r),
					2 * Float.parseFloat(r));
			g2d.draw(c2);
		}

		if (!style.equals("") && !style.equals("none")) {
			String[] styles = style.split(";");

			String fillStyle = "";
			String strokeStyle = "";
			String strokeWidthStyle = "";

			for (int i = 0; i < styles.length; i++) {
				String[] styleAttribute = styles[i].split(":");

				if (styleAttribute[0].equals("fill")) {
					fillStyle = styleAttribute[1];
				}

				if (styleAttribute[0].equals("stroke-width")) {
					strokeWidthStyle = styleAttribute[1];
				}

				if (styleAttribute[0].equals("stroke")) {
					strokeStyle = styleAttribute[1];
				}
			}

			if (!fillStyle.equals("") && !fillStyle.equals("none")) {
				c = stringToColor(fillStyle);
				g2d.setColor(c);
				Ellipse2D c2 = new Ellipse2D.Float(Float.parseFloat(cx), Float.parseFloat(cy), 2 * Float.parseFloat(r),
						2 * Float.parseFloat(r));
				g2d.fill(c2);
			}

			if (!strokeWidthStyle.equals("") && !strokeWidthStyle.equals("none")) {
				g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidthStyle)));
			}

			if (!strokeStyle.equals("") && !strokeStyle.equals("none")) {
				c = stringToColor(strokeStyle);
				g2d.setColor(c);
				Ellipse2D c2 = new Ellipse2D.Float(Float.parseFloat(cx), Float.parseFloat(cy), 2 * Float.parseFloat(r),
						2 * Float.parseFloat(r));
				g2d.draw(c2);
			}
		}

		g2d.setTransform(old); // reset transform!

	}

	@Override
	public void exitRect(RectContext ctx) {
		AffineTransform old = g2d.getTransform(); // save old Transform!

		List<AttributeContext> list = ctx.attribute();

		String x = "0";
		String y = "0";
		String width = "0";
		String height = "0";

		String fill = "";
		String stroke = "";
		String strokeWidth = "";
		String style = "";

		Color c = Color.decode("#000000");

		for (AttributeContext a : list) {

			if (a.NAME().toString().equals("x")) {
				x = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("y")) {
				y = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("width")) {
				width = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("height")) {
				height = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("stroke")) {
				stroke = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("fill")) {
				fill = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("stroke-width")) {
				strokeWidth = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("style")) {
				style = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("transform")) {
				String transformNode = a.STRING().toString();
				transformNode = transformNode.replaceAll("\"", "");
				// example:
				// matrix(0.7071067811865474,0.7071067811865473,-0.7071067811865474,0.7071067811865473,0,0)
				transformNode = transformNode.replace("matrix", "");
				transformNode = transformNode.replaceAll("\\(", "");
				transformNode = transformNode.replaceAll("\\)", "");
				// example:
				// 1.892338560388366,1.892338560388366,-1.892338560388366,1.892338560388366,588.3352226488195,-294.8095263511118
				String[] variableStrings = transformNode.split(",");
				if (variableStrings.length != 6) {
					System.err.println("malformed transform-matrix in path!");
					break;
				}
				float variables[] = new float[6];
				for (int i = 0; i < variableStrings.length; i++) {
					variables[i] = Float.parseFloat(variableStrings[i]);
				}
				AffineTransform trans = new AffineTransform(variables[0], variables[1], variables[2], variables[3],
						variables[4], variables[5]);
				g2d.transform(trans); // add transformation to graphics!
			}

		}

		if (!fill.equals("") && !fill.equals("none")) {
			c = stringToColor(fill);
			g2d.setColor(c);
			Rectangle2D r = new Rectangle2D.Float(Float.parseFloat(x), Float.parseFloat(y), Float.parseFloat(width),
					Float.parseFloat(height));
			g2d.fill(r);
		}

		if (!strokeWidth.equals("") && !strokeWidth.equals("none")) {
			g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidth)));
		}

		if (!stroke.equals("") && !stroke.equals("none")) {
			c = stringToColor(stroke);
			g2d.setColor(c);
			Rectangle2D r = new Rectangle2D.Float(Float.parseFloat(x), Float.parseFloat(y), Float.parseFloat(width),
					Float.parseFloat(height));
			g2d.draw(r);

		}

		if (!style.equals("") && !style.equals("none")) {
			String[] styles = style.split(";");

			String fillStyle = "";
			String strokeStyle = "";
			String strokeWidthStyle = "";

			for (int i = 0; i < styles.length; i++) {
				String[] styleAttribute = styles[i].split(":");

				if (styleAttribute[0].equals("fill")) {
					fillStyle = styleAttribute[1];
				}

				if (styleAttribute[0].equals("stroke-width")) {
					strokeWidthStyle = styleAttribute[1];
				}

				if (styleAttribute[0].equals("stroke")) {
					strokeStyle = styleAttribute[1];
				}
			}

			if (!fillStyle.equals("") && !fillStyle.equals("none")) {
				c = stringToColor(fillStyle);
				g2d.setColor(c);
				Rectangle2D r = new Rectangle2D.Float(Float.parseFloat(x), Float.parseFloat(y), Float.parseFloat(width),
						Float.parseFloat(height));
				g2d.fill(r);
			}

			if (!strokeWidthStyle.equals("") && !strokeWidthStyle.equals("none")) {
				g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidthStyle)));
			}

			if (!strokeStyle.equals("") && !strokeStyle.equals("none")) {
				c = stringToColor(strokeStyle);
				g2d.setColor(c);
				Rectangle2D r = new Rectangle2D.Float(Float.parseFloat(x), Float.parseFloat(y), Float.parseFloat(width),
						Float.parseFloat(height));
				g2d.draw(r);
			}
		}

		g2d.setTransform(old); // reset transform!
	}

	@Override
	public void exitEllipse(EllipseContext ctx) {
		AffineTransform old = g2d.getTransform(); // save old Transform!

		List<AttributeContext> list = ctx.attribute();

		String cx = "0";
		String cy = "0";
		String rx = "0";
		String ry = "0";

		String fill = "";
		String stroke = "";
		String strokeWidth = "";
		String style = "";

		Color c = Color.decode("#000000");

		for (AttributeContext a : list) {

			if (a.NAME().toString().equals("cx")) {
				cx = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("cy")) {
				cy = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("rx")) {
				rx = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("ry")) {
				ry = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("stroke")) {
				stroke = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("fill")) {
				fill = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("stroke-width")) {
				strokeWidth = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("style")) {
				style = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("transform")) {
				String transformNode = a.STRING().toString();
				transformNode = transformNode.replaceAll("\"", "");
				// example:
				// matrix(0.7071067811865474,0.7071067811865473,-0.7071067811865474,0.7071067811865473,0,0)
				transformNode = transformNode.replace("matrix", "");
				transformNode = transformNode.replaceAll("\\(", "");
				transformNode = transformNode.replaceAll("\\)", "");
				// example:
				// 1.892338560388366,1.892338560388366,-1.892338560388366,1.892338560388366,588.3352226488195,-294.8095263511118
				String[] variableStrings = transformNode.split(",");
				if (variableStrings.length != 6) {
					System.err.println("malformed transform-matrix in path!");
					break;
				}
				float variables[] = new float[6];
				for (int i = 0; i < variableStrings.length; i++) {
					variables[i] = Float.parseFloat(variableStrings[i]);
				}
				AffineTransform trans = new AffineTransform(variables[0], variables[1], variables[2], variables[3],
						variables[4], variables[5]);
				g2d.transform(trans); // add transformation to graphics!
			}

		}

		if (!fill.equals("") && !fill.equals("none")) {
			c = stringToColor(fill);
			g2d.setColor(c);
			Ellipse2D c2 = new Ellipse2D.Float(Float.parseFloat(cx), Float.parseFloat(cy), 2 * Float.parseFloat(rx),
					2 * Float.parseFloat(ry));
			g2d.fill(c2);
		}

		if (!strokeWidth.equals("") && !strokeWidth.equals("none")) {
			g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidth)));
		}

		if (!stroke.equals("") && !stroke.equals("none")) {
			c = stringToColor(stroke);
			g2d.setColor(c);
			Ellipse2D c2 = new Ellipse2D.Float(Float.parseFloat(cx), Float.parseFloat(cy), 2 * Float.parseFloat(rx),
					2 * Float.parseFloat(ry));
			g2d.draw(c2);
		}

		if (!style.equals("") && !style.equals("none")) {
			String[] styles = style.split(";");

			String fillStyle = "";
			String strokeStyle = "";
			String strokeWidthStyle = "";

			for (int i = 0; i < styles.length; i++) {
				String[] styleAttribute = styles[i].split(":");

				if (styleAttribute[0].equals("fill")) {
					fillStyle = styleAttribute[1];
				}

				if (styleAttribute[0].equals("stroke-width")) {
					strokeWidthStyle = styleAttribute[1];
				}

				if (styleAttribute[0].equals("stroke")) {
					strokeStyle = styleAttribute[1];
				}
			}

			if (!fillStyle.equals("") && !fillStyle.equals("none")) {
				c = stringToColor(fillStyle);
				g2d.setColor(c);
				Ellipse2D c2 = new Ellipse2D.Float(Float.parseFloat(cx), Float.parseFloat(cy), 2 * Float.parseFloat(rx),
						2 * Float.parseFloat(ry));
				g2d.fill(c2);
			}

			if (!strokeWidthStyle.equals("") && !strokeWidthStyle.equals("none")) {
				g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidthStyle)));
			}

			if (!strokeStyle.equals("") && !strokeStyle.equals("none")) {
				c = stringToColor(strokeStyle);
				g2d.setColor(c);
				Ellipse2D c2 = new Ellipse2D.Float(Float.parseFloat(cx), Float.parseFloat(cy), 2 * Float.parseFloat(rx),
						2 * Float.parseFloat(ry));
				g2d.draw(c2);
			}
		}

		g2d.setTransform(old); // reset transform!

	}

	@Override
	public void exitLine(LineContext ctx) {
		AffineTransform old = g2d.getTransform(); // save old Transform!

		List<AttributeContext> list = ctx.attribute();

		String x1 = "0";
		String y1 = "0";
		String x2 = "0";
		String y2 = "0";

		String fill = "";
		String stroke = "";
		String strokeWidth = "";
		String style = "";

		Color c = Color.decode("#000000");

		for (AttributeContext a : list) {

			if (a.NAME().toString().equals("x1")) {
				x1 = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("y1")) {
				y1 = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("x2")) {
				x2 = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("y2")) {
				y2 = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("stroke")) {
				stroke = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("fill")) {
				fill = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("stroke-width")) {
				strokeWidth = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("style")) {
				style = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("transform")) {
				String transformNode = a.STRING().toString();
				transformNode = transformNode.replaceAll("\"", "");
				// example:
				// matrix(0.7071067811865474,0.7071067811865473,-0.7071067811865474,0.7071067811865473,0,0)
				transformNode = transformNode.replace("matrix", "");
				transformNode = transformNode.replaceAll("\\(", "");
				transformNode = transformNode.replaceAll("\\)", "");
				// example:
				// 1.892338560388366,1.892338560388366,-1.892338560388366,1.892338560388366,588.3352226488195,-294.8095263511118
				String[] variableStrings = transformNode.split(",");
				if (variableStrings.length != 6) {
					System.err.println("malformed transform-matrix in path!");
					break;
				}
				float variables[] = new float[6];
				for (int i = 0; i < variableStrings.length; i++) {
					variables[i] = Float.parseFloat(variableStrings[i]);
				}
				AffineTransform trans = new AffineTransform(variables[0], variables[1], variables[2], variables[3],
						variables[4], variables[5]);
				g2d.transform(trans); // add transformation to graphics!
			}

		}

		if (!fill.equals("") && !fill.equals("none")) {
			c = stringToColor(fill);
			g2d.setColor(c);
			Line2D c2 = new Line2D.Float(Float.parseFloat(x1), Float.parseFloat(y1), Float.parseFloat(x2),
					Float.parseFloat(y2));
			g2d.draw(c2);
		}

		if (!strokeWidth.equals("") && !strokeWidth.equals("none")) {
			g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidth)));
		}

		if (!stroke.equals("") && !stroke.equals("none")) {
			c = stringToColor(stroke);
			g2d.setColor(c);
			Line2D c2 = new Line2D.Float(Float.parseFloat(x1), Float.parseFloat(y1), Float.parseFloat(x2),
					Float.parseFloat(y2));
			g2d.draw(c2);
		}

		if (!style.equals("") && !style.equals("none")) {
			String[] styles = style.split(";");

			String fillStyle = "";
			String strokeStyle = "";
			String strokeWidthStyle = "";

			for (int i = 0; i < styles.length; i++) {
				String[] styleAttribute = styles[i].split(":");

				if (styleAttribute[0].equals("fill")) {
					fillStyle = styleAttribute[1];
				}

				if (styleAttribute[0].equals("stroke-width")) {
					strokeWidthStyle = styleAttribute[1];
				}

				if (styleAttribute[0].equals("stroke")) {
					strokeStyle = styleAttribute[1];
				}
			}

			if (!fillStyle.equals("") && !fillStyle.equals("none")) {
				c = stringToColor(fillStyle);
				g2d.setColor(c);
				Line2D c2 = new Line2D.Float(Float.parseFloat(x1), Float.parseFloat(y1), Float.parseFloat(x2),
						Float.parseFloat(y2));
				g2d.draw(c2);
			}

			if (!strokeWidthStyle.equals("") && !strokeWidthStyle.equals("none")) {
				g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidthStyle)));
			}

			if (!strokeStyle.equals("") && !strokeStyle.equals("none")) {
				c = stringToColor(strokeStyle);
				g2d.setColor(c);
				Line2D c2 = new Line2D.Float(Float.parseFloat(x1), Float.parseFloat(y1), Float.parseFloat(x2),
						Float.parseFloat(y2));
				g2d.draw(c2);
			}
		}

		g2d.setTransform(old); // reset transform!
	}

	@Override
	public void exitPolygon(PolygonContext ctx) {
		AffineTransform old = g2d.getTransform(); // save old Transform!

		List<AttributeContext> list = ctx.attribute();

		String points = "0,0";

		int xPoly[] = { 0 };
		int yPoly[] = { 0 };

		String fill = "";
		String stroke = "";
		String strokeWidth = "";
		String style = "";

		Color c = Color.decode("#000000");

		for (AttributeContext a : list) {

			if (a.NAME().toString().equals("points")) {

				points = a.STRING().getText().replaceAll("\"", "");

				String[] point = points.split(" ");

				xPoly = new int[point.length];
				yPoly = new int[point.length];

				for (int i = 0; i < point.length; i++) {

					String coordinate = point[i];

					String[] coordinates = coordinate.split(",");

					xPoly[i] = (int) Float.parseFloat(coordinates[0]);
					yPoly[i] = (int) Float.parseFloat(coordinates[1]);

				}

			}

			if (a.NAME().toString().equals("stroke")) {
				stroke = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("fill")) {
				fill = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("stroke-width")) {
				strokeWidth = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("style")) {
				style = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("transform")) {
				String transformNode = a.STRING().toString();
				transformNode = transformNode.replaceAll("\"", "");
				// example:
				// matrix(0.7071067811865474,0.7071067811865473,-0.7071067811865474,0.7071067811865473,0,0)
				transformNode = transformNode.replace("matrix", "");
				transformNode = transformNode.replaceAll("\\(", "");
				transformNode = transformNode.replaceAll("\\)", "");
				// example:
				// 1.892338560388366,1.892338560388366,-1.892338560388366,1.892338560388366,588.3352226488195,-294.8095263511118
				String[] variableStrings = transformNode.split(",");
				if (variableStrings.length != 6) {
					System.err.println("malformed transform-matrix in path!");
					break;
				}
				float variables[] = new float[6];
				for (int i = 0; i < variableStrings.length; i++) {
					variables[i] = Float.parseFloat(variableStrings[i]);
				}
				AffineTransform trans = new AffineTransform(variables[0], variables[1], variables[2], variables[3],
						variables[4], variables[5]);
				g2d.transform(trans); // add transformation to graphics!
			}

		}

		Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
		// Polygon2D c2 = new Polygon2D(xPoly, yPoly, xPoly.length);

		if (!fill.equals("") && !fill.equals("none")) {
			c = stringToColor(fill);
			g2d.setColor(c);
			g2d.fillPolygon(poly);
			// g2d.fill(c2);
		}

		if (!strokeWidth.equals("") && !strokeWidth.equals("none")) {
			g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidth)));
		}

		if (!stroke.equals("") && !stroke.equals("none")) {
			c = stringToColor(stroke);
			g2d.setColor(c);
			g2d.drawPolygon(poly);
		}

		if (!style.equals("") && !style.equals("none")) {
			String[] styles = style.split(";");

			String fillStyle = "";
			String strokeStyle = "";
			String strokeWidthStyle = "";

			for (int i = 0; i < styles.length; i++) {
				String[] styleAttribute = styles[i].split(":");

				if (styleAttribute[0].equals("fill")) {
					fillStyle = styleAttribute[1];
				}

				if (styleAttribute[0].equals("stroke-width")) {
					strokeWidthStyle = styleAttribute[1];
				}

				if (styleAttribute[0].equals("stroke")) {
					strokeStyle = styleAttribute[1];
				}
			}

			if (!fillStyle.equals("") && !fillStyle.equals("none")) {
				c = stringToColor(fillStyle);
				g2d.setColor(c);
				g2d.fillPolygon(poly);
			}

			if (!strokeWidthStyle.equals("") && !strokeWidthStyle.equals("none")) {
				g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidthStyle)));
			}

			if (!strokeStyle.equals("") && !strokeStyle.equals("none")) {
				c = stringToColor(strokeStyle);
				g2d.setColor(c);
				g2d.drawPolygon(poly);
			}
		}

		g2d.setTransform(old); // reset transform!
	}

	@Override
	public void exitPolyline(PolylineContext ctx) {
		AffineTransform old = g2d.getTransform(); // save old Transform!

		List<AttributeContext> list = ctx.attribute();

		String points = "0,0";

		int xPoly[] = { 0 };
		int yPoly[] = { 0 };

		String fill = "";
		String stroke = "";
		String strokeWidth = "";
		String style = "";

		Color c = Color.decode("#000000");

		for (AttributeContext a : list) {

			if (a.NAME().toString().equals("points")) {

				points = a.STRING().getText().replaceAll("\"", "");

				String[] point = points.split(" ");

				xPoly = new int[point.length];
				yPoly = new int[point.length];

				for (int i = 0; i < point.length; i++) {

					String coordinate = point[i];

					String[] coordinates = coordinate.split(",");

					xPoly[i] = (int) Float.parseFloat(coordinates[0]);
					yPoly[i] = (int) Float.parseFloat(coordinates[1]);

				}

			}

			if (a.NAME().toString().equals("stroke")) {
				stroke = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("fill")) {
				fill = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("stroke-width")) {
				strokeWidth = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("style")) {
				style = a.STRING().getText().replaceAll("\"", "");
			}

			if (a.NAME().toString().equals("transform")) {
				String transformNode = a.STRING().toString();
				transformNode = transformNode.replaceAll("\"", "");
				// example:
				// matrix(0.7071067811865474,0.7071067811865473,-0.7071067811865474,0.7071067811865473,0,0)
				transformNode = transformNode.replace("matrix", "");
				transformNode = transformNode.replaceAll("\\(", "");
				transformNode = transformNode.replaceAll("\\)", "");
				// example:
				// 1.892338560388366,1.892338560388366,-1.892338560388366,1.892338560388366,588.3352226488195,-294.8095263511118
				String[] variableStrings = transformNode.split(",");
				if (variableStrings.length != 6) {
					System.err.println("malformed transform-matrix in path!");
					break;
				}
				float variables[] = new float[6];
				for (int i = 0; i < variableStrings.length; i++) {
					variables[i] = Float.parseFloat(variableStrings[i]);
				}
				AffineTransform trans = new AffineTransform(variables[0], variables[1], variables[2], variables[3],
						variables[4], variables[5]);
				g2d.transform(trans); // add transformation to graphics!
			}
		}

		if (!fill.equals("") && !fill.equals("none")) {
			c = stringToColor(fill);
			g2d.setColor(c);
			g2d.drawPolyline(xPoly, yPoly, xPoly.length);
			// Polyline2D c2 = new Polyline2D.Float(Float.parseFloat(x1),
			// Float.parseFloat(y1), Float.parseFloat(x2),Float.parseFloat(y2));
			// g2d.draw(c2);
		}

		if (!strokeWidth.equals("") && !strokeWidth.equals("none")) {
			g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidth)));
		}

		if (!stroke.equals("") && !stroke.equals("none")) {
			c = stringToColor(stroke);
			g2d.setColor(c);
			g2d.drawPolyline(xPoly, yPoly, xPoly.length);
		}

		if (!style.equals("") && !style.equals("none")) {
			String[] styles = style.split(";");

			String fillStyle = "";
			String strokeWidthStyle = "";
			String strokeStyle = "";

			for (int i = 0; i < styles.length; i++) {
				String[] styleAttribute = styles[i].split(":");

				if (styleAttribute[0].equals("fill")) {
					fillStyle = styleAttribute[1];
				}

				if (styleAttribute[0].equals("stroke-width")) {
					strokeWidthStyle = styleAttribute[1];
				}

				if (styleAttribute[0].equals("stroke")) {
					strokeStyle = styleAttribute[1];
				}
			}

			if (!fillStyle.equals("") && !fillStyle.equals("none")) {
				c = stringToColor(fillStyle);
				g2d.setColor(c);
				g2d.drawPolyline(xPoly, yPoly, xPoly.length);
			}

			if (!strokeWidthStyle.equals("") && !strokeWidthStyle.equals("none")) {
				g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidthStyle)));
			}

			if (!strokeStyle.equals("") && !strokeStyle.equals("none")) {
				c = stringToColor(strokeStyle);
				g2d.setColor(c);
				g2d.drawPolyline(xPoly, yPoly, xPoly.length);
			}
		}

		g2d.setTransform(old); // reset transform!

	}

	@Override
	public void enterPath(PathContext ctx) {

		currentPath = new AWTPathProducer();
		currentPath.setWindingRule(0); // tf is a windingrule oO?
		currentPath.startPath();
	}

	@Override
	public void enterG(GContext ctx) {
		List<AttributeContext> list = ctx.attribute();

		for (AttributeContext a : list) {
			if (a.NAME() != null) {
				switch (a.NAME().toString()) {

				case "transform":
					String transformNode = a.STRING().toString().replaceAll("\"", "");
					if (transformNode.startsWith("translate")) {
						transformNode = transformNode.replaceAll("translate", "");
						transformNode = transformNode.replaceAll("\\(", "");
						transformNode = transformNode.replaceAll("\\)", "");
						String[] variables = transformNode.split(",");
						float x = Float.parseFloat(variables[0]);
						float y = Float.parseFloat(variables[1]);
						g2d.translate(x, y);
					}
					break;
				}
			}
		}
	}

	@Override
	public void exitPath(PathContext ctx) {

		pathCounter++;
		Shape path = currentPath.getShape();
		AffineTransform old = g2d.getTransform(); // save old Transform!
		Color oldColor = g2d.getColor(); // save old color!

		String fillColor = "";
		String strokeColor = "";
		String strokeWidth = "";

		List<AttributeContext> list = ctx.attribute();
		for (AttributeContext a : list) {
			if (a.NAME() != null) {
				switch (a.NAME().toString()) {

				case "transform":
					String transformNode = a.STRING().toString();
					transformNode = transformNode.replaceAll("\"", "");
					// example:
					// matrix(0.7071067811865474,0.7071067811865473,-0.7071067811865474,0.7071067811865473,0,0)
					transformNode = transformNode.replace("matrix", "");
					transformNode = transformNode.replaceAll("\\(", "");
					transformNode = transformNode.replaceAll("\\)", "");
					// example:
					// 1.892338560388366,1.892338560388366,-1.892338560388366,1.892338560388366,588.3352226488195,-294.8095263511118
					String[] variableStrings = transformNode.split(",");
					if (variableStrings.length != 6) {
						System.err.println("malformed transform-matrix in path!");
						break;
					}
					float variables[] = new float[6];
					for (int i = 0; i < variableStrings.length; i++) {
						variables[i] = Float.parseFloat(variableStrings[i]);
					}
					AffineTransform trans = new AffineTransform(variables[0], variables[1], variables[2], variables[3],
							variables[4], variables[5]);
					g2d.transform(trans); // add transformation to graphics!
					break;
				case "fill":
					// handle fill color:
					fillColor = a.STRING().toString().replaceAll("\"", "");
					break;
				case "stroke":
					strokeColor = a.STRING().toString().replaceAll("\"", "");
					break;
				case "stroke-width":
					strokeWidth = a.STRING().toString().replaceAll("\"", "");
					break;

				case "style":
					String style = a.STRING().toString().replaceAll("\"", "");
					String[] styleContent = style.split(";");
					for (String styleAttr : styleContent) {
						if (styleAttr.startsWith("fill:")) {
							fillColor = styleAttr.split(":")[1];
						}
					}
					break;

				}
			}
		}

		if (!fillColor.equals("")) {
			if (!fillColor.equals("none")) {
				Color c = Color.decode(fillColor);
				g2d.setColor(c);
				g2d.fill(path);
			}

		}

		if (!strokeWidth.equals("")) {
			g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidth)));
		}

		if (!strokeColor.equals("")) {
			Color c = Color.decode(strokeColor);
			g2d.setColor(c);
			g2d.draw(path);
		}

		if (strokeColor.equals("") && fillColor.equals("")) {
			// defaults to Black fill!
			g2d.setColor(Color.black);
			g2d.fill(path);
		}

		g2d.setTransform(old); // reset transform!
		g2d.setColor(oldColor); // reset Color!
		// create new
		// currentPath = new AWTPathProducer();
		// currentPath.setWindingRule(0); // tf is a windingrule oO?
		// currentPath.startPath();

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
		float x = SVGParseListener.getNumber(attributes.get(0));
		float y = SVGParseListener.getNumber(attributes.get(1));
		currentPath.movetoAbs(x, y);

	}

	@Override
	public void exitPath_element_moveto_rel(Path_element_moveto_relContext ctx) {
		System.out.println("moveto_rel!");
		List<NumberContext> attributes = ctx.number();
		// check input parameters:
		if (attributes.size() < 2) {
			System.out.println("Error on Path-MoveTo! Too few inputs.");
			return;
		}
		// move current Path:
		float x = SVGParseListener.getNumber(attributes.get(0));
		float y = SVGParseListener.getNumber(attributes.get(1));
		currentPath.movetoRel(x, y);
	}

	@Override
	public void exitPath_element_cubiccurve_rel(Path_element_cubiccurve_relContext ctx) {
		// check: https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths
		List<NumberContext> attributes = ctx.number();

		// check input parameters:
		if (attributes.size() < 6) {
			System.out.println("Error on cubic-curve-rel! Too few inputs.");
			return;
		}
		// assign parsed numbers:
		float x1 = SVGParseListener.getNumber(attributes.get(0));
		float y1 = SVGParseListener.getNumber(attributes.get(1));
		float x2 = SVGParseListener.getNumber(attributes.get(2));
		float y2 = SVGParseListener.getNumber(attributes.get(3));
		float x = SVGParseListener.getNumber(attributes.get(4));
		float y = SVGParseListener.getNumber(attributes.get(5));

		currentPath.curvetoCubicRel(x1, y1, x2, y2, x, y);

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
		float x1 = SVGParseListener.getNumber(attributes.get(0));
		float y1 = SVGParseListener.getNumber(attributes.get(1));
		float x2 = SVGParseListener.getNumber(attributes.get(2));
		float y2 = SVGParseListener.getNumber(attributes.get(3));
		float x = SVGParseListener.getNumber(attributes.get(4));
		float y = SVGParseListener.getNumber(attributes.get(5));

		currentPath.curvetoCubicAbs(x1, y1, x2, y2, x, y);
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

		float rx = SVGParseListener.getNumber(attributes.get(0));
		float ry = SVGParseListener.getNumber(attributes.get(1));
		float xAxisRotation = SVGParseListener.getNumber(attributes.get(2));

		float largeArcFlag = SVGParseListener.getNumber(attributes.get(3));
		float sweepFlag = SVGParseListener.getNumber(attributes.get(4));

		float x = SVGParseListener.getNumber(attributes.get(5));
		float y = SVGParseListener.getNumber(attributes.get(6));

		currentPath.arcRel(rx, ry, xAxisRotation, largeArcFlag == 1, sweepFlag == 1, x, y);

	}

	@Override
	public void exitPath_element_arc(Path_element_arcContext ctx) {
		// check: https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths
		List<NumberContext> attributes = ctx.number();

		// check input parameters:
		if (attributes.size() < 7) {
			System.out.println("Error on arc-rel! Too few inputs.");
			return;
		}

		float rx = SVGParseListener.getNumber(attributes.get(0));
		float ry = SVGParseListener.getNumber(attributes.get(1));
		float xAxisRotation = SVGParseListener.getNumber(attributes.get(2));

		float largeArcFlag = SVGParseListener.getNumber(attributes.get(3));
		float sweepFlag = SVGParseListener.getNumber(attributes.get(4));

		float x = SVGParseListener.getNumber(attributes.get(5));
		float y = SVGParseListener.getNumber(attributes.get(6));

		currentPath.arcAbs(rx, ry, xAxisRotation, largeArcFlag == 1, sweepFlag == 1, x, y);

	}

	@Override
	public void exitPath_element_lineto_rel(Path_element_lineto_relContext ctx) {
		// check: https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths
		List<NumberContext> attributes = ctx.number();

		// check input parameters:
		if (attributes.size() < 2) {
			System.out.println("Error on lineto-rel! Too few inputs.");
			return;
		}
		// assign parsed numbers:
		float x = SVGParseListener.getNumber(attributes.get(0));
		float y = SVGParseListener.getNumber(attributes.get(1));

		currentPath.linetoRel(x, y);

	}

	@Override
	public void exitPath_element_close(Path_element_closeContext ctx) {
		// simply close path:
		currentPath.closePath();
	}

	@Override
	public void exitPath_element_lineto(Path_element_linetoContext ctx) {
		// check: https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths
		List<NumberContext> attributes = ctx.number();

		// check input parameters:
		if (attributes.size() < 2) {
			System.out.println("Error on lineto-abs! Too few inputs.");
			return;
		}

		float x = SVGParseListener.getNumber(attributes.get(0));
		float y = SVGParseListener.getNumber(attributes.get(1));
		currentPath.linetoAbs(x, y);
	}

	@Override
	public void exitPath_element_horizontalline_rel(Path_element_horizontalline_relContext ctx) {
		// check: https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths
		NumberContext attributes = ctx.number();

		// check input parameters:
		if (attributes == null) {
			System.out.println("Error on hline-rel! Too few inputs.");
			return;
		}

		float x = SVGParseListener.getNumber(attributes);
		currentPath.linetoHorizontalRel(x);
	}

	@Override
	public void exitPath_element_horizontalline(Path_element_horizontallineContext ctx) {
		// check: https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths
		NumberContext attributes = ctx.number();

		// check input parameters:
		if (attributes == null) {
			System.out.println("Error on hline-abs! Too few inputs.");
			return;
		}

		float x = SVGParseListener.getNumber(attributes);
		currentPath.linetoHorizontalAbs(x);
	}

	@Override
	public void exitPath_element_verticalline_rel(Path_element_verticalline_relContext ctx) {
		// check: https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths
		NumberContext attributes = ctx.number();

		// check input parameters:
		if (attributes == null) {
			System.out.println("Error on vline-rel! Too few inputs.");
			return;
		}

		float y = SVGParseListener.getNumber(attributes);
		currentPath.linetoVerticalRel(y);
	}

	@Override
	public void exitPath_element_verticalline(Path_element_verticallineContext ctx) {
		// check: https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths
		NumberContext attributes = ctx.number();

		// check input parameters:
		if (attributes == null) {
			System.out.println("Error on vline-abs! Too few inputs.");
			return;
		}

		float y = SVGParseListener.getNumber(attributes);
		currentPath.linetoVerticalAbs(y);
	}

	@Override
	public void exitPath_element_cubicreflectcurve_rel(Path_element_cubicreflectcurve_relContext ctx) {
		// check: https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths
		List<NumberContext> attributes = ctx.number();

		// check input parameters:
		if (attributes.size() < 4) {
			System.out.println("Error on cubic-curve-reflect-rel! Too few inputs.");
			return;
		}

		float x2 = SVGParseListener.getNumber(attributes.get(0));
		float y2 = SVGParseListener.getNumber(attributes.get(1));
		float x = SVGParseListener.getNumber(attributes.get(2));
		float y = SVGParseListener.getNumber(attributes.get(3));

		currentPath.curvetoCubicSmoothRel(x2, y2, x, y);
	}

	@Override
	public void exitPath_element_cubicreflectcurve(Path_element_cubicreflectcurveContext ctx) {
		// check: https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths
		List<NumberContext> attributes = ctx.number();

		// check input parameters:
		if (attributes.size() < 4) {
			System.out.println("Error on cubic-curve-reflect-abs! Too few inputs.");
			return;
		}

		float x2 = SVGParseListener.getNumber(attributes.get(0));
		float y2 = SVGParseListener.getNumber(attributes.get(1));
		float x = SVGParseListener.getNumber(attributes.get(2));
		float y = SVGParseListener.getNumber(attributes.get(3));

		currentPath.curvetoCubicSmoothAbs(x2, y2, x, y);
	}

	@Override
	public void exitPath_element_quadraticcurve_rel(Path_element_quadraticcurve_relContext ctx) {
		// check: https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths
		List<NumberContext> attributes = ctx.number();

		// check input parameters:
		if (attributes.size() < 4) {
			System.out.println("Error on quadratic-curve-rel! Too few inputs.");
			return;
		}

		float x1 = SVGParseListener.getNumber(attributes.get(0));
		float y1 = SVGParseListener.getNumber(attributes.get(1));
		float x = SVGParseListener.getNumber(attributes.get(2));
		float y = SVGParseListener.getNumber(attributes.get(3));

		currentPath.curvetoQuadraticRel(x1, y1, x, y);
		;
	}

	@Override
	public void exitPath_element_quadraticcurve(Path_element_quadraticcurveContext ctx) {
		// check: https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths
		List<NumberContext> attributes = ctx.number();

		// check input parameters:
		if (attributes.size() < 4) {
			System.out.println("Error on quadratic-curve-abs! Too few inputs.");
			return;
		}

		float x1 = SVGParseListener.getNumber(attributes.get(0));
		float y1 = SVGParseListener.getNumber(attributes.get(1));
		float x = SVGParseListener.getNumber(attributes.get(2));
		float y = SVGParseListener.getNumber(attributes.get(3));

		currentPath.curvetoQuadraticAbs(x1, y1, x, y);
		;
	}

	@Override
	public void exitPath_element_quadraticreflectcurve_rel(Path_element_quadraticreflectcurve_relContext ctx) {
		// check: https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths
		List<NumberContext> attributes = ctx.number();

		// check input parameters:
		if (attributes.size() < 2) {
			System.out.println("Error on quadratic-curve-reflect-rel! Too few inputs.");
			return;
		}

		float x = SVGParseListener.getNumber(attributes.get(0));
		float y = SVGParseListener.getNumber(attributes.get(1));

		currentPath.curvetoQuadraticSmoothRel(x, y);
	}

	@Override
	public void exitPath_element_quadraticreflectcurve(Path_element_quadraticreflectcurveContext ctx) {
		// check: https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths
		List<NumberContext> attributes = ctx.number();

		// check input parameters:
		if (attributes.size() < 2) {
			System.out.println("Error on quadratic-curve-reflect-abs! Too few inputs.");
			return;
		}

		float x = SVGParseListener.getNumber(attributes.get(0));
		float y = SVGParseListener.getNumber(attributes.get(1));

		currentPath.curvetoQuadraticSmoothAbs(x, y);
	}

	@Override
	public void exitText(TextContext ctx) {
		List<AttributeContext> attributes = ctx.attribute();
		String text = ctx.TEXT().toString();

		AffineTransform oldtrans = g2d.getTransform(); // save old Transform!
		String x = "0";
		String y = "0";
		String fill = "";

		for (AttributeContext a : attributes) {
			if (a.NAME() != null) {
				switch (a.NAME().toString()) {
				case "x":
					x = a.STRING().toString().replaceAll("\"", "");
					break;
				case "y":
					y = a.STRING().toString().replaceAll("\"", "");
					break;
				case "fill":
					fill = a.STRING().toString().replaceAll("\"", "");
					break;

				case "transform":
					String transformNode = a.STRING().toString();
					transformNode = transformNode.replaceAll("\"", "");
					transformNode = transformNode.replace("matrix", "");
					transformNode = transformNode.replaceAll("\\(", "");
					transformNode = transformNode.replaceAll("\\)", "");
					String[] variableStrings = transformNode.split(",");
					if (variableStrings.length != 6) {
						System.err.println("malformed transform-matrix in path!");
						break;
					}
					float variables[] = new float[6];
					for (int i = 0; i < variableStrings.length; i++) {
						variables[i] = Float.parseFloat(variableStrings[i]);
					}
					AffineTransform trans = new AffineTransform(variables[0], variables[1], variables[2], variables[3],
							variables[4], variables[5]);
					g2d.transform(trans); // add transformation to graphics!
					break;
				}
			}
		}

		Color oldcolor = g2d.getColor();
		g2d.setColor(SVGParseListener.stringToColor(fill));
		g2d.drawString(text, (int) Float.parseFloat(x), (int) Float.parseFloat(y));
		g2d.setColor(oldcolor); // reset old color!
		g2d.setTransform(oldtrans); // reset transform!
	}

	@Override
	public void exitUnnamedElement(UnnamedElementContext ctx) {
		System.out.println("FOUND UNKNOWN NODE! IGNORING.");
	}

	@Override
	public void exitUnnamedElement_SelfClose(UnnamedElement_SelfCloseContext ctx) {
		System.out.println("FOUND UNKNOWN NODE! IGNORING.");
	}

	public static Color stringToColor(final String value) {
		if (value == null) {
			return Color.black;
		}
		try {
			// get color by hex or octal value
			return Color.decode(value);
		} catch (NumberFormatException nfe) {
			// if we can't decode lets try to get it by name
			try {
				// try to get a color by name using reflection
				final Field f = Color.class.getField(value);

				return (Color) f.get(null);
			} catch (Exception ce) {
				// if we can't get any color return black
				return Color.black;
			}
		}
	}

}
