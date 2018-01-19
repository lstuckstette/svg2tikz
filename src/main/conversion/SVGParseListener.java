package main.conversion;

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
		List<AttributeContext> list = ctx.attribute();
		for(AttributeContext a : list) {
			System.out.println("Attribute Name: "+a.NAME());
			System.out.println("Attribute Value: "+a.STRING());
		}
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
		// TODO Auto-generated method stub

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
