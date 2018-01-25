/*
@author L.Stuckstette, B.Schmidt
*/

parser grammar SVGParser;

@header {
package main.antlr4;
}

options { tokenVocab=SVGLexer; }

svgRoot		: '<' 'svg' attribute+ '>' element+ '<' SLASH 'svg' '>' ;

element	: '<' 'circle' attribute+ '/>'													# Circle
		| '<' 'rect' attribute+ '/>'													# Rect
		| '<' 'ellipse' attribute+ '/>'													# Ellipse
		| '<' 'line' attribute+ '/>'													# Line
		| '<' 'polygon' attribute+ '/>'													# Polygon
		| '<' 'polyline' attribute+ '/>'												# Polyline
		| '<' 'path' attribute+ '/>'													# Path
		| '<' 'text' attribute+ '/>'													# Text
		| '<' 'g' attribute* '>' element+ '<' SLASH 'g' '>'								# G
		| '<' 'filter' attribute+ '/>'													# Filter							
		| '<' 'stop' attribute+ '/>'													# Stop
		| '<' 'defs' attribute* '>' element+ '<' SLASH 'defs' '>'						# Defs
		| '<' 'linearGradient' attribute* '>' element+ '<' SLASH 'linearGradient' '>'	# LinearGradient
		| '<' 'radialGradient' attribute* '>' element+ '<' SLASH 'radialGradient' '>'	# RadialGradient
		| '<' NAME attribute* element* '>' 												# UnnamedElement
		| '<' NAME attribute* '/>'														# UnnamedElement_SelfClose
		;

attribute		: NAME '=' STRING 
				| 'd="' path_elements+ '"';



path_elements	: path_element_moveto
				| path_element_moveto_rel
				| path_element_lineto_rel
				| path_element_lineto
				| path_element_horizontalline_rel
				| path_element_horizontalline
				| path_element_verticalline_rel
				| path_element_verticalline
				| path_element_close
				| path_element_cubiccurve_rel
				| path_element_cubiccurve
				| path_element_cubicreflectcurve_rel
				| path_element_cubicreflectcurve
				| path_element_quadraticcurve_rel
				| path_element_quadraticcurve
				| path_element_quadraticreflectcurve_rel
				| path_element_quadraticreflectcurve
				| path_element_arc_rel
				| path_element_arc
				;

path_element_moveto_rel					: BLANK* 'm' BLANK* NUMBER BLANK* NUMBER ;
path_element_moveto						: BLANK* 'M' BLANK* NUMBER BLANK* NUMBER ;

path_element_lineto_rel					: BLANK* 'l' BLANK* NUMBER BLANK* NUMBER ;
path_element_lineto						: BLANK* 'L' BLANK* NUMBER BLANK* NUMBER ;

path_element_horizontalline_rel			: BLANK* 'h' BLANK* NUMBER ;
path_element_horizontalline				: BLANK* 'H' BLANK* NUMBER ;

path_element_verticalline_rel			: BLANK* 'v' BLANK* NUMBER ;
path_element_verticalline				: BLANK* 'V' BLANK* NUMBER ;

path_element_close						: BLANK* 'z' 
										| BLANK* 'Z'
										;
path_element_cubiccurve_rel				: BLANK* 'c' BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER ;
path_element_cubiccurve					: BLANK* 'C' BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER ;

path_element_cubicreflectcurve_rel		: BLANK* 's' BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER ;
path_element_cubicreflectcurve			: BLANK* 'S' BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER ;

path_element_quadraticcurve_rel			: BLANK* 'q'  BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER ;
path_element_quadraticcurve				: BLANK* 'Q'  BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER ;

path_element_quadraticreflectcurve_rel	: BLANK* 't'  BLANK* NUMBER BLANK* NUMBER ;
path_element_quadraticreflectcurve		: BLANK* 'T'  BLANK* NUMBER BLANK* NUMBER ;

path_element_arc_rel					: BLANK* 'a' BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER ;
path_element_arc						: BLANK* 'A' BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER ;



				 
/*
omitted elements:

- filterElements (https://www.w3schools.com/graphics/svg_filters_intro.asp)

*/



