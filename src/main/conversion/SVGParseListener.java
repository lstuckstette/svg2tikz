package main.conversion;

import java.util.ArrayList;
import java.util.List;

import main.antlr4.SVGParser.AttributeContext;
import main.antlr4.SVGParser.CircleContext;
import main.antlr4.SVGParser.DefsContext;
import main.antlr4.SVGParser.EllipseContext;
import main.antlr4.SVGParser.FilterContext;
import main.antlr4.SVGParser.GContext;
import main.antlr4.SVGParser.LineContext;
import main.antlr4.SVGParser.LinearGradientContext;
import main.antlr4.SVGParser.PathContext;
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
	private int pathCount = 0;

	public SVGParseListener(TikzBuilder tikzBuilder) {
		this.tikzBuilder = tikzBuilder;
	}

	@Override
	public void exitSvgRoot(SvgRootContext ctx) {
		System.out.println("SAW " + pathCount + " Paths. =)");
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
		
		for(AttributeContext a : list) {
			
			String points="0,0 ";
			
			if(a.NAME().toString()=="points"){
				points=a.STRING().toString();
			}
			
			String[] point = points.split(" ");
			
			String coordinates="";
			
			for(String coordinate : point) {
				coordinates=coordinates+" ("+coordinate+")";
			}
			
			
			String path="\\draw plot[smooth, tension=2] coordinates { "+coordinates+"};";
			
			tikzBuilder.appendString(path);
		}
	}

	@Override
	public void exitPath(PathContext ctx) {
	
		List<AttributeContext> list = ctx.attribute();
		for (AttributeContext a : list) {
			switch(a.NAME().toString()) {
			
			case "transform": 
				//TODO: handle transform!
				break;
			}
		}
		
		pathCount++;

	}

	@Override
	public void exitPath_element_moveto_rel(Path_element_moveto_relContext ctx) {
		
		
	}
	
	
	
	

	@Override
	public void exitText(TextContext ctx) {
		// TODO Auto-generated method stub
		super.exitText(ctx);
	}

	@Override
	public void exitG(GContext ctx) {
		// TODO Auto-generated method stub
		super.exitG(ctx);
	}

	@Override
	public void exitFilter(FilterContext ctx) {
		// TODO Auto-generated method stub
		super.exitFilter(ctx);
	}

	@Override
	public void exitStop(StopContext ctx) {
		// TODO Auto-generated method stub
		super.exitStop(ctx);
	}

	@Override
	public void exitDefs(DefsContext ctx) {
		// TODO Auto-generated method stub
		super.exitDefs(ctx);
	}

	@Override
	public void exitLinearGradient(LinearGradientContext ctx) {
		// TODO Auto-generated method stub
		super.exitLinearGradient(ctx);
	}

	@Override
	public void exitRadialGradient(RadialGradientContext ctx) {
		// TODO Auto-generated method stub
		super.exitRadialGradient(ctx);
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
