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

	}

	@Override
	public void exitRect(RectContext ctx) {
		// TODO Auto-generated method stub
		super.exitRect(ctx);
	}

	@Override
	public void exitEllipse(EllipseContext ctx) {
		// TODO Auto-generated method stub
		super.exitEllipse(ctx);
	}

	@Override
	public void exitLine(LineContext ctx) {
		// TODO Auto-generated method stub
		super.exitLine(ctx);
	}

	@Override
	public void exitPolygon(PolygonContext ctx) {
		// TODO Auto-generated method stub
		super.exitPolygon(ctx);
	}

	@Override
	public void exitPolyline(PolylineContext ctx) {
		// TODO Auto-generated method stub
		super.exitPolyline(ctx);
	}

	@Override
	public void exitPath(PathContext ctx) {
		String[] pathElem = new String[3];
		List<AttributeContext> list = ctx.attribute();
		for (AttributeContext a : list) {
			// System.out.println("Attribute Name: " + a.NAME());
			// System.out.println("Attribute Value: " + a.STRING());

			switch (a.NAME().toString()) {
			case "d":
				pathElem[1] = "\\draw [fill=tmpcolor] svg {" + a.STRING().toString() + "};";
				break;
			case "style":
				String[] stylevalues = a.STRING().toString().split(";");
				for (String s : stylevalues) {
					if (s.startsWith("\"fill")) {
						String[] fillColor = s.split(":");
						int R = Integer.parseInt(fillColor[1].substring(1, 3), 16);
						int G = Integer.parseInt(fillColor[1].substring(3, 5), 16);
						int B = Integer.parseInt(fillColor[1].substring(5, 7), 16);
						//System.out.println(fillColor[1] +" -> "+R + "  " + G + "  " + B);
						pathElem[0] = "\\definecolor{tmpcolor}{RGB}{"+R+","+G+","+B+"}";
						break;
					}
				}
				break;
			default:
				break;
			}
		}
		tikzBuilder.appendString(pathElem[0]);
		tikzBuilder.appendString(pathElem[1]);
		pathCount++;

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
