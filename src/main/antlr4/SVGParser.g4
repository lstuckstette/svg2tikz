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
		| '<' 'path' path_attribute+ attribute* '/>'													# Path
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
			

			
attribute	: NAME '=' STRING ;

path_attribute : 'd="' path_elements+ '"';

path_elements	: path_element_moveto
				| path_element_moveto_rel
				| path_element_lineto_rel
				| path_element_lineto
				| path_element_horizontalline_rel
				| path_element_horizontalline
				| path_element_verticalline_rel
				| path_element_verticalline
				| path_element_close
				;

path_element_moveto_rel			: 'm' BLANK* NUMBER BLANK* NUMBER ;
path_element_moveto				: 'M' BLANK* NUMBER BLANK* NUMBER ;

path_element_lineto_rel			: 'l' BLANK* NUMBER BLANK* NUMBER ;
path_element_lineto				: 'L' BLANK* NUMBER BLANK* NUMBER ;

path_element_horizontalline_rel	: 'h' BLANK* NUMBER ;
path_element_horizontalline		: 'H' BLANK* NUMBER ;

path_element_verticalline_rel	: 'v' BLANK* NUMBER ;
path_element_verticalline		: 'V' BLANK* NUMBER ;

path_element_close				: 'z' 
								| 'Z'
								;
path_element_cubiccurve_rel		: 'c' BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER ;
path_element_cubiccurve			: 'C' BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER ;

path_element_cubicreflectcurve_rel		: 's' BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER  ;
path_element_cubicreflectcurve			: 'S' BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER BLANK* NUMBER  ;



				 
/*
omitted elements:

- filterElements (https://www.w3schools.com/graphics/svg_filters_intro.asp)

*/



