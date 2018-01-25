// Generated from SVGParser.g4 by ANTLR 4.7.1

package main.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SVGParser}.
 */
public interface SVGParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SVGParser#svgRoot}.
	 * @param ctx the parse tree
	 */
	void enterSvgRoot(SVGParser.SvgRootContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#svgRoot}.
	 * @param ctx the parse tree
	 */
	void exitSvgRoot(SVGParser.SvgRootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Circle}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void enterCircle(SVGParser.CircleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Circle}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void exitCircle(SVGParser.CircleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Rect}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void enterRect(SVGParser.RectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Rect}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void exitRect(SVGParser.RectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Ellipse}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void enterEllipse(SVGParser.EllipseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Ellipse}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void exitEllipse(SVGParser.EllipseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Line}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void enterLine(SVGParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Line}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void exitLine(SVGParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Polygon}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void enterPolygon(SVGParser.PolygonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Polygon}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void exitPolygon(SVGParser.PolygonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Polyline}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void enterPolyline(SVGParser.PolylineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Polyline}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void exitPolyline(SVGParser.PolylineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Path}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void enterPath(SVGParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Path}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void exitPath(SVGParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Text}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void enterText(SVGParser.TextContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Text}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void exitText(SVGParser.TextContext ctx);
	/**
	 * Enter a parse tree produced by the {@code G}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void enterG(SVGParser.GContext ctx);
	/**
	 * Exit a parse tree produced by the {@code G}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void exitG(SVGParser.GContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Filter}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void enterFilter(SVGParser.FilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Filter}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void exitFilter(SVGParser.FilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Stop}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void enterStop(SVGParser.StopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Stop}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void exitStop(SVGParser.StopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Defs}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void enterDefs(SVGParser.DefsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Defs}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void exitDefs(SVGParser.DefsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LinearGradient}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void enterLinearGradient(SVGParser.LinearGradientContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LinearGradient}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void exitLinearGradient(SVGParser.LinearGradientContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RadialGradient}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void enterRadialGradient(SVGParser.RadialGradientContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RadialGradient}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void exitRadialGradient(SVGParser.RadialGradientContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnnamedElement}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedElement(SVGParser.UnnamedElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnnamedElement}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedElement(SVGParser.UnnamedElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnnamedElement_SelfClose}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void enterUnnamedElement_SelfClose(SVGParser.UnnamedElement_SelfCloseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnnamedElement_SelfClose}
	 * labeled alternative in {@link SVGParser#element}.
	 * @param ctx the parse tree
	 */
	void exitUnnamedElement_SelfClose(SVGParser.UnnamedElement_SelfCloseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(SVGParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(SVGParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_elements}.
	 * @param ctx the parse tree
	 */
	void enterPath_elements(SVGParser.Path_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_elements}.
	 * @param ctx the parse tree
	 */
	void exitPath_elements(SVGParser.Path_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(SVGParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(SVGParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#unsigned_number}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_number(SVGParser.Unsigned_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#unsigned_number}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_number(SVGParser.Unsigned_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_moveto_rel}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_moveto_rel(SVGParser.Path_element_moveto_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_moveto_rel}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_moveto_rel(SVGParser.Path_element_moveto_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_moveto}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_moveto(SVGParser.Path_element_movetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_moveto}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_moveto(SVGParser.Path_element_movetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_lineto_rel}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_lineto_rel(SVGParser.Path_element_lineto_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_lineto_rel}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_lineto_rel(SVGParser.Path_element_lineto_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_lineto}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_lineto(SVGParser.Path_element_linetoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_lineto}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_lineto(SVGParser.Path_element_linetoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_horizontalline_rel}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_horizontalline_rel(SVGParser.Path_element_horizontalline_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_horizontalline_rel}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_horizontalline_rel(SVGParser.Path_element_horizontalline_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_horizontalline}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_horizontalline(SVGParser.Path_element_horizontallineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_horizontalline}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_horizontalline(SVGParser.Path_element_horizontallineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_verticalline_rel}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_verticalline_rel(SVGParser.Path_element_verticalline_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_verticalline_rel}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_verticalline_rel(SVGParser.Path_element_verticalline_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_verticalline}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_verticalline(SVGParser.Path_element_verticallineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_verticalline}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_verticalline(SVGParser.Path_element_verticallineContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_close}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_close(SVGParser.Path_element_closeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_close}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_close(SVGParser.Path_element_closeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_cubiccurve_rel}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_cubiccurve_rel(SVGParser.Path_element_cubiccurve_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_cubiccurve_rel}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_cubiccurve_rel(SVGParser.Path_element_cubiccurve_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_cubiccurve}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_cubiccurve(SVGParser.Path_element_cubiccurveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_cubiccurve}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_cubiccurve(SVGParser.Path_element_cubiccurveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_cubicreflectcurve_rel}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_cubicreflectcurve_rel(SVGParser.Path_element_cubicreflectcurve_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_cubicreflectcurve_rel}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_cubicreflectcurve_rel(SVGParser.Path_element_cubicreflectcurve_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_cubicreflectcurve}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_cubicreflectcurve(SVGParser.Path_element_cubicreflectcurveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_cubicreflectcurve}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_cubicreflectcurve(SVGParser.Path_element_cubicreflectcurveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_quadraticcurve_rel}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_quadraticcurve_rel(SVGParser.Path_element_quadraticcurve_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_quadraticcurve_rel}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_quadraticcurve_rel(SVGParser.Path_element_quadraticcurve_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_quadraticcurve}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_quadraticcurve(SVGParser.Path_element_quadraticcurveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_quadraticcurve}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_quadraticcurve(SVGParser.Path_element_quadraticcurveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_quadraticreflectcurve_rel}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_quadraticreflectcurve_rel(SVGParser.Path_element_quadraticreflectcurve_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_quadraticreflectcurve_rel}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_quadraticreflectcurve_rel(SVGParser.Path_element_quadraticreflectcurve_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_quadraticreflectcurve}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_quadraticreflectcurve(SVGParser.Path_element_quadraticreflectcurveContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_quadraticreflectcurve}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_quadraticreflectcurve(SVGParser.Path_element_quadraticreflectcurveContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_arc_rel}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_arc_rel(SVGParser.Path_element_arc_relContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_arc_rel}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_arc_rel(SVGParser.Path_element_arc_relContext ctx);
	/**
	 * Enter a parse tree produced by {@link SVGParser#path_element_arc}.
	 * @param ctx the parse tree
	 */
	void enterPath_element_arc(SVGParser.Path_element_arcContext ctx);
	/**
	 * Exit a parse tree produced by {@link SVGParser#path_element_arc}.
	 * @param ctx the parse tree
	 */
	void exitPath_element_arc(SVGParser.Path_element_arcContext ctx);
}