/*
@author L.Stuckstette, B.Schmidt
*/

lexer grammar  SVGLexer;

@header {
package main.antlr4;
}

// skip whitespace
WS  :   [ \t\n\r]+ -> skip ;

// skip SVG/XML comments
COMMENT 	: '<!--' .*? '-->'  -> skip ;

// skip XML Declaration
XML_DECL 	: '<?xml' .*? '?>' 	-> skip;

// skip DOCTYPE
DOCTYPE 	: '<!' .*? '>'		-> skip ;

// tag open
OPEN 		: '<'		-> pushMode(INSIDE);

//general text
TEXT 		: ~[<&]+ ;

mode INSIDE;

NAME_SVG				: 'svg' ;
NAME_CIRCLE				: 'circle' ;
NAME_RECT				: 'rect' ;
NAME_ELLIPSE			: 'ellipse' ;
NAME_LINE				: 'line' ;
NAME_POLYGON			: 'polygon' ;
NAME_POLYLINE			: 'polyline' ;
NAME_PATH				: 'path' ;
NAME_TEXT				: 'text' ;
NAME_G					: 'g' ;
NAME_DEFS				: 'defs' ;
NAME_FILTER				: 'filter' ;
NAME_LINEARGRADIENT		: 'linearGradient' ;
NAME_RADIALGRADIENT		: 'radialGradient' ;
NAME_STOP				: 'stop' ;
				
NAME	: [a-zA-Z:]+ ;
CLOSE 			: '>' 		-> popMode ;
SLASH_CLOSE 	: '/>'		-> popMode ;
SLASH			: '/' ;
EQUALS			: '=' ;
STRING			: '"' ~[<"]* '"'
				| '\'' ~[<']* '\''
				;
// skip whitespace again, because of inner mode ~
WS_INSIDE  :   [ \t\n\r]+ -> skip ;
// skip SVG/XML comments
COMMENT_INSIDE 	: '<!--' .*? '-->'  -> skip ;