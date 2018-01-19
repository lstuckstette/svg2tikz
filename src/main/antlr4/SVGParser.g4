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
			

			
attribute	: NAME '=' STRING ;
/*
omitted elements:

- filterElements (https://www.w3schools.com/graphics/svg_filters_intro.asp)

*/



