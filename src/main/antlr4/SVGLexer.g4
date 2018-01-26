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
				
NAME	: [a-zA-Z0-9:-]+ ;
CLOSE 			: '>' 		-> popMode ;
SLASH_CLOSE 	: '/>'		-> popMode ;
SLASH			: '/' ;
EQUALS			: '=' ;
PATH_ATTRIBUTE	: 'd="' 		-> pushMode(PATHATTRIBUTE);
STRING			: '"' ~[<"]* '"' ;
				
// skip whitespace again, because of inner mode ~
WS_INSIDE  :   [ \t\n\r]+ -> skip ;
// skip SVG/XML comments
COMMENT_INSIDE 	: '<!--' .*? '-->'  -> skip ;

mode PATHATTRIBUTE;

PATHATTRIBUTECLOSE		: '"' -> popMode ;
BLANK				: ' '
					| ',' ;
PATH_M_REL			: 'm';
PATH_M				: 'M';
PATH_L_REL			: 'l';
PATH_L				: 'L';
PATH_H_REL			: 'h';
PATH_H				: 'H';
PATH_V_REL			: 'v';
PATH_V				: 'V';
PATH_Z_REL			: 'z';
PATH_Z				: 'Z';
PATH_C_REL			: 'c';
PATH_C				: 'C';
PATH_S_REL			: 's';
PATH_S				: 'S';
PATH_Q_REL			: 'q';
PATH_Q				: 'Q';
PATH_T_REL			: 't';
PATH_T				: 'T';
PATH_A_REL			: 'a';
PATH_A				: 'A';

WS_PATH  :   [ \t\n\r]+ -> skip ;

UNARY_OPERATOR	: '-'
				| '+'
				;
UNSIGNED_INT : ('0' | '1'..'9' '0'..'9'*);

UNSIGNED_FLOAT	:   ('0'..'9')+ '.' ('0'..'9')* Exponent?
				|   '.' ('0'..'9')+ Exponent?
				|   ('0'..'9')+ Exponent
				;
fragment
Exponent 		: ('e'|'E') ('+'|'-')? ('0'..'9')+ ;



