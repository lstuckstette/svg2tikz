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
		| '<' 'text' attribute+ '>'	TEXT '<' SLASH 'text' SLASH '>'						# Text
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



path_elements	: path_element_moveto_rel
				| path_element_moveto
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
				

				
number			: UNARY_OPERATOR? unsigned_number;

unsigned_number : UNSIGNED_INT
				| UNSIGNED_FLOAT
				;

path_element_moveto_rel					: BLANK* 'm' BLANK* number BLANK* number ;
path_element_moveto						: BLANK* 'M' BLANK* number BLANK* number ;

path_element_lineto_rel					: BLANK* 'l' BLANK* number BLANK* number ;
path_element_lineto						: BLANK* 'L' BLANK* number BLANK* number ;

path_element_horizontalline_rel			: BLANK* 'h' BLANK* number ;
path_element_horizontalline				: BLANK* 'H' BLANK* number ;

path_element_verticalline_rel			: BLANK* 'v' BLANK* number ;
path_element_verticalline				: BLANK* 'V' BLANK* number ;

path_element_close						: BLANK* 'z' 
										| BLANK* 'Z'
										;
path_element_cubiccurve_rel				: BLANK* 'c' BLANK* number BLANK* number BLANK* number BLANK* number BLANK* number BLANK* number ;
path_element_cubiccurve					: BLANK* 'C' BLANK* number BLANK* number BLANK* number BLANK* number BLANK* number BLANK* number ;

path_element_cubicreflectcurve_rel		: BLANK* 's' BLANK* number BLANK* number BLANK* number BLANK* number ;
path_element_cubicreflectcurve			: BLANK* 'S' BLANK* number BLANK* number BLANK* number BLANK* number ;

path_element_quadraticcurve_rel			: BLANK* 'q'  BLANK* number BLANK* number BLANK* number BLANK* number ;
path_element_quadraticcurve				: BLANK* 'Q'  BLANK* number BLANK* number BLANK* number BLANK* number ;

path_element_quadraticreflectcurve_rel	: BLANK* 't'  BLANK* number BLANK* number ;
path_element_quadraticreflectcurve		: BLANK* 'T'  BLANK* number BLANK* number ;

path_element_arc_rel					: BLANK* 'a' BLANK* number BLANK* number BLANK* number BLANK* number BLANK* number BLANK* number BLANK* number ;
path_element_arc						: BLANK* 'A' BLANK* number BLANK* number BLANK* number BLANK* number BLANK* number BLANK* number BLANK* number ;



				 
/*
omitted elements:

- filterElements (https://www.w3schools.com/graphics/svg_filters_intro.asp)

*/



