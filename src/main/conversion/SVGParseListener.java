package main.conversion;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import org.apache.batik.parser.AWTPathProducer;
import org.apache.commons.io.output.ByteArrayOutputStream;

import edu.emory.mathcs.backport.java.util.Arrays;
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
import main.antlr4.SVGParser.Path_element_lineto_relContext;
import main.antlr4.SVGParser.Path_element_movetoContext;
import main.antlr4.SVGParser.Path_element_moveto_relContext;
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

	private int pathCounter=0;
	private AWTPathProducer currentPath;
	//private TikzGraphics2D g2d;
	private Graphics2D g2d;
	BufferedImage output;

	public SVGParseListener(ByteArrayOutputStream tikzOutput) {
		//g2d = new TikzGraphics2D(tikzOutput);
		currentPath = new AWTPathProducer();
		currentPath.setWindingRule(0); // tf is a windingrule oO?
		currentPath.startPath();

		
		output = new BufferedImage(1000, 1000, BufferedImage.TYPE_INT_RGB);
		
		g2d = output.createGraphics();
		
		g2d.setPaint ( Color.white );
		
		
        g2d.fillRect ( 0, 0, output.getWidth(), output.getHeight() );
		
		

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
		System.out.println("visited "+pathCounter+" Paths!");
		//g2d.flush(); // force tikz-output!
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

		String fill = "";
		String stroke = "";
		String strokeWidth = "";
		String style = "";
		
		Color c = Color.decode("#498bea");
		
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

		}
		
		if(!fill.equals(""))
		{
			c = Color.decode(fill);
			g2d.setColor(c);
			g2d.fillOval(Integer.parseInt(cx), Integer.parseInt(cx), 2*Integer.parseInt(r), 2*Integer.parseInt(r));
		}
		
		if(!strokeWidth.equals(""))
		{
			g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidth))); 
		}
		
		if(!stroke.equals(""))
		{
			c = Color.decode(stroke);
			g2d.setColor(c);
			g2d.drawOval(Integer.parseInt(cx), Integer.parseInt(cx), 2*Integer.parseInt(r), 2*Integer.parseInt(r));
		}
		
		if(!style.equals(""))
		{
			String[] styles = style.split(";");
			
			String fillStyle = "";
			String strokeStyle = "";
			String strokeWidthStyle = "";
			
			for(int i=0;i<styles.length;i++)
			{
				String[] styleAttribute = styles[i].split(":");
				
				if(styleAttribute[0].equals("fill"))
				{
					fillStyle=styleAttribute[1];
				}
				
				if(styleAttribute[0].equals("stroke-width"))
				{
					strokeWidthStyle=styleAttribute[1];
				}
				
				if(styleAttribute[0].equals("stroke"))
				{
					strokeStyle=styleAttribute[1];
				}
			}
			
			if(!fillStyle.equals(""))
			{
				c = Color.decode(fillStyle);
				g2d.setColor(c);
				g2d.fillOval(Integer.parseInt(cx), Integer.parseInt(cx), 2*Integer.parseInt(r), 2*Integer.parseInt(r));
			}
			
			if(!strokeWidthStyle.equals(""))
			{
				g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidthStyle))); 
			}
			
			if(!strokeStyle.equals(""))
			{
				c = Color.decode(strokeStyle);
				g2d.setColor(c);
				g2d.drawOval(Integer.parseInt(cx), Integer.parseInt(cx), 2*Integer.parseInt(r), 2*Integer.parseInt(r));
			}
		}

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
		
		String fill = "";
		String stroke = "";
		String strokeWidth = "";
		String style = "";

		Color c = Color.decode("#498bea");
		
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


		}

		if(!fill.equals(""))
		{
			c = Color.decode(fill);
			g2d.setColor(c);
			g2d.fillRect(Integer.parseInt(x), Integer.parseInt(y), Integer.parseInt(width), Integer.parseInt(height));
		}
		
		if(!strokeWidth.equals(""))
		{
			g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidth))); 
		}
		
		if(!stroke.equals(""))
		{
			c = Color.decode(stroke);
			g2d.setColor(c);
			g2d.drawRect(Integer.parseInt(x), Integer.parseInt(y), Integer.parseInt(width), Integer.parseInt(height));
		}
		
		if(!style.equals(""))
		{
			String[] styles = style.split(";");
			
			String fillStyle = "";
			String strokeStyle = "";
			String strokeWidthStyle = "";
			
			for(int i=0;i<styles.length;i++)
			{
				String[] styleAttribute = styles[i].split(":");
				
				if(styleAttribute[0].equals("fill"))
				{
					fillStyle=styleAttribute[1];
				}
				
				if(styleAttribute[0].equals("stroke-width"))
				{
					strokeWidthStyle=styleAttribute[1];
				}
				
				if(styleAttribute[0].equals("stroke"))
				{
					strokeStyle=styleAttribute[1];
				}
			}
			
			if(!fillStyle.equals(""))
			{
				c = Color.decode(fillStyle);
				g2d.setColor(c);
				g2d.fillRect(Integer.parseInt(x), Integer.parseInt(y), Integer.parseInt(width), Integer.parseInt(height));
			}
			
			if(!strokeWidthStyle.equals(""))
			{
				g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidthStyle))); 
			}
			
			if(!strokeStyle.equals(""))
			{
				c = Color.decode(strokeStyle);
				g2d.setColor(c);
				g2d.drawRect(Integer.parseInt(x), Integer.parseInt(y), Integer.parseInt(width), Integer.parseInt(height));
			}
		}
		
		//String path = "\\draw (" + x + "," + y + ") -- (" + height + "," + y + ") -- (" + height + "," + width+ ") -- (" + x + "," + width + ") -- (" + x + "," + y + ");";

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
		
		String fill = "";
		String stroke = "";
		String strokeWidth = "";
		String style = "";

		Color c = Color.decode("#498bea");

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

		}
		
		if(!fill.equals(""))
		{
			c = Color.decode(fill);
			g2d.setColor(c);
			g2d.fillOval(Integer.parseInt(cx), Integer.parseInt(cx), 2*Integer.parseInt(rx), 2*Integer.parseInt(ry));
		}
		
		if(!strokeWidth.equals(""))
		{
			g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidth))); 
		}
		
		if(!stroke.equals(""))
		{
			c = Color.decode(stroke);
			g2d.setColor(c);
			g2d.drawOval(Integer.parseInt(cx), Integer.parseInt(cx), 2*Integer.parseInt(rx), 2*Integer.parseInt(ry));
		}
		
		if(!style.equals(""))
		{
			String[] styles = style.split(";");
			
			String fillStyle = "";
			String strokeStyle = "";
			String strokeWidthStyle = "";
			
			for(int i=0;i<styles.length;i++)
			{
				String[] styleAttribute = styles[i].split(":");
				
				if(styleAttribute[0].equals("fill"))
				{
					fillStyle=styleAttribute[1];
				}
				
				if(styleAttribute[0].equals("stroke-width"))
				{
					strokeWidthStyle=styleAttribute[1];
				}
				
				if(styleAttribute[0].equals("stroke"))
				{
					strokeStyle=styleAttribute[1];
				}
			}
			
			if(!fillStyle.equals(""))
			{
				c = Color.decode(fillStyle);
				g2d.setColor(c);
				g2d.fillOval(Integer.parseInt(cx), Integer.parseInt(cx), 2*Integer.parseInt(rx), 2*Integer.parseInt(ry));
			}
			
			if(!strokeWidthStyle.equals(""))
			{
				g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidthStyle))); 
			}
			
			if(!strokeStyle.equals(""))
			{
				c = Color.decode(strokeStyle);
				g2d.setColor(c);
				g2d.drawOval(Integer.parseInt(cx), Integer.parseInt(cx), 2*Integer.parseInt(rx), 2*Integer.parseInt(ry));
			}
		}

		//String path = "\\draw (" + cx + "," + cy + ") ellipse (" + rx + " and " + ry + ");";

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
		
		String fill = "";
		String stroke = "";
		String strokeWidth = "";
		String style = "";

		Color c = Color.decode("#498bea");

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

		}
		
		if(!fill.equals(""))
		{
			c = Color.decode(fill);
			g2d.setColor(c);
			g2d.drawLine(Integer.parseInt(x1), Integer.parseInt(y1), Integer.parseInt(x2), Integer.parseInt(y2));
		}
		
		if(!strokeWidth.equals(""))
		{
			g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidth))); 
		}
		
		if(!stroke.equals(""))
		{
			c = Color.decode(stroke);
			g2d.setColor(c);
			g2d.drawLine(Integer.parseInt(x1), Integer.parseInt(y1), Integer.parseInt(x2), Integer.parseInt(y2));
		}
		
		if(!style.equals(""))
		{
			String[] styles = style.split(";");
			
			String fillStyle = "";
			String strokeStyle = "";
			String strokeWidthStyle = "";
			
			for(int i=0;i<styles.length;i++)
			{
				String[] styleAttribute = styles[i].split(":");
				
				if(styleAttribute[0].equals("fill"))
				{
					fillStyle=styleAttribute[1];
				}
				
				if(styleAttribute[0].equals("stroke-width"))
				{
					strokeWidthStyle=styleAttribute[1];
				}
				
				if(styleAttribute[0].equals("stroke"))
				{
					strokeStyle=styleAttribute[1];
				}
			}
			
			if(!fillStyle.equals(""))
			{
				c = Color.decode(fillStyle);
				g2d.setColor(c);
				g2d.drawLine(Integer.parseInt(x1), Integer.parseInt(y1), Integer.parseInt(x2), Integer.parseInt(y2));
			}
			
			if(!strokeWidthStyle.equals(""))
			{
				g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidthStyle))); 
			}
			
			if(!strokeStyle.equals(""))
			{
				c = Color.decode(strokeStyle);
				g2d.setColor(c);
				g2d.drawLine(Integer.parseInt(x1), Integer.parseInt(y1), Integer.parseInt(x2), Integer.parseInt(y2));
			}
		}

		//String path = "\\draw (" + x1 + "," + y1 + ") -- (" + x2 + "," + y2 + ");";

		// tikzBuilder.appendString(path);
	}

	@Override
	public void exitPolygon(PolygonContext ctx) {
		// TODO Auto-generated method stub
		super.exitPolygon(ctx);

		List<AttributeContext> list = ctx.attribute();

		String points = "0,0";
		
		int xPoly[] = {0};
        int yPoly[] = {0};

        String fill = "";
		String stroke = "";
		String strokeWidth = "";
		String style = "";

		Color c = Color.decode("#498bea");
        
		for (AttributeContext a : list) {

			if (a.NAME().toString().equals("points")) {

				points = a.STRING().getText().replaceAll("\"", "");

				String[] point = points.split(" ");
				
				xPoly = new int[point.length];
		        yPoly = new int[point.length];

				for (int i = 0; i < point.length; i++) {

					String coordinate = point[i];

					String[] coordinates =coordinate.split(",");
					
					xPoly[i]=Integer.parseInt(coordinates[0]);
					yPoly[i]=Integer.parseInt(coordinates[1]);

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

		}

        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
		
        if(!fill.equals(""))
		{
			c = Color.decode(fill);
			g2d.setColor(c);
			g2d.fillPolygon(poly);
		}
		
		if(!strokeWidth.equals(""))
		{
			g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidth))); 
		}
		
		if(!stroke.equals(""))
		{
			c = Color.decode(stroke);
			g2d.setColor(c);
			g2d.drawPolygon(poly);
		}
		
		if(!style.equals(""))
		{
			String[] styles = style.split(";");
			
			String fillStyle = "";
			String strokeStyle = "";
			String strokeWidthStyle = "";
			
			for(int i=0;i<styles.length;i++)
			{
				String[] styleAttribute = styles[i].split(":");
				
				if(styleAttribute[0].equals("fill"))
				{
					fillStyle=styleAttribute[1];
				}
				
				if(styleAttribute[0].equals("stroke-width"))
				{
					strokeWidthStyle=styleAttribute[1];
				}
				
				if(styleAttribute[0].equals("stroke"))
				{
					strokeStyle=styleAttribute[1];
				}
			}
			
			if(!fillStyle.equals(""))
			{
				c = Color.decode(fillStyle);
				g2d.setColor(c);
				g2d.fillPolygon(poly);
			}
			
			if(!strokeWidthStyle.equals(""))
			{
				g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidthStyle))); 
			}
			
			if(!strokeStyle.equals(""))
			{
				c = Color.decode(strokeStyle);
				g2d.setColor(c);
				g2d.drawPolygon(poly);
			}
		}
	}

	@Override
	public void exitPolyline(PolylineContext ctx) {
		// TODO Auto-generated method stub
		super.exitPolyline(ctx);

		List<AttributeContext> list = ctx.attribute();

		String points = "0,0";
		
		int xPoly[] = {0};
        int yPoly[] = {0};
        
        String fill = "";
		String stroke = "";
		String strokeWidth = "";
		String style = "";

		Color c = Color.decode("#498bea");

		for (AttributeContext a : list) {

			if (a.NAME().toString().equals("points")) {

				points = a.STRING().getText().replaceAll("\"", "");

				String[] point = points.split(" ");
				
				xPoly = new int[point.length];
		        yPoly = new int[point.length];

				for (int i = 0; i < point.length; i++) {

					String coordinate = point[i];

					String[] coordinates =coordinate.split(",");
					
					xPoly[i]=Integer.parseInt(coordinates[0]);
					yPoly[i]=Integer.parseInt(coordinates[1]);

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

		}
		
		if(!fill.equals(""))
		{
			c = Color.decode(fill);
			g2d.setColor(c);
			g2d.drawPolyline(xPoly, yPoly, xPoly.length);
		}
		
		if(!strokeWidth.equals(""))
		{
			g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidth))); 
		}
		
		if(!stroke.equals(""))
		{
			c = Color.decode(stroke);
			g2d.setColor(c);
			g2d.drawPolyline(xPoly, yPoly, xPoly.length);
		}
		
		if(!style.equals(""))
		{
			String[] styles = style.split(";");
			
			String fillStyle = "";
			String strokeStyle = "";
			String strokeWidthStyle = "";
			
			for(int i=0;i<styles.length;i++)
			{
				String[] styleAttribute = styles[i].split(":");
				
				if(styleAttribute[0].equals("fill"))
				{
					fillStyle=styleAttribute[1];
				}
				
				if(styleAttribute[0].equals("stroke-width"))
				{
					strokeWidthStyle=styleAttribute[1];
				}
				
				if(styleAttribute[0].equals("stroke"))
				{
					strokeStyle=styleAttribute[1];
				}
			}
			
			if(!fillStyle.equals(""))
			{
				c = Color.decode(fillStyle);
				g2d.setColor(c);
				g2d.drawPolyline(xPoly, yPoly, xPoly.length);
			}
			
			if(!strokeWidthStyle.equals(""))
			{
				g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidthStyle))); 
			}
			
			if(!strokeStyle.equals(""))
			{
				c = Color.decode(strokeStyle);
				g2d.setColor(c);
				g2d.drawPolyline(xPoly, yPoly, xPoly.length);
			}
		}

	}

	@Override
	public void enterPath(PathContext ctx) {
		System.out.println("reached!?");

	}

	@Override
	public void enterG(GContext ctx) {
		System.out.println("visit G!");
	}

	@Override
	public void exitPath(PathContext ctx) {
		/*
		 * gute quelle: https://en.wikibooks.org/wiki/LaTeX/PGF/TikZ
		 * 
		 */
		
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
					String style =a.STRING().toString().replaceAll("\"", "");
					String [] styleContent = style.split(";");
					for(String styleAttr : styleContent) {
						if(styleAttr.startsWith("fill:")) {
							fillColor = styleAttr.split(":")[1];
						}
					}
					break;

				}
			}
		}

		if(!fillColor.equals(""))
		{
			if(!fillColor.equals("none")) {
			Color c = Color.decode(fillColor);
			g2d.setColor(c);
			}
			
			g2d.fill(path);
		}
		
		if(!strokeWidth.equals(""))
		{
			g2d.setStroke(new BasicStroke(Float.parseFloat(strokeWidth))); 
		}
		
		if(!strokeColor.equals(""))
		{
			Color c = Color.decode(strokeColor);
			g2d.setColor(c);
			g2d.draw(path);
		}
				
		g2d.setTransform(old); // reset transform!
		g2d.setColor(oldColor); //reset Color!
		// create new
		currentPath = new AWTPathProducer();
		currentPath.setWindingRule(0); // tf is a windingrule oO?
		currentPath.startPath();

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
