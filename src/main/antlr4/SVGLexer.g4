lexer grammar  SVGLexer;

@header {
package main.antlr4;
}


SVG_OPEN
	: '<svg>'
	;
	
SVG_CLOSE
	: '</svg>'
	;

CIRCLE_OPEN
	: '<circle' -> pushMode(TAG)
	;
	
CIRCLE_CLOSE
	: '/>' -> popMode
	;
	
RECT_OPEN
	: '<rect' -> pushMode(TAG)
	;
	
RECT_CLOSE
	: '/>' -> popMode
	;
	
ELLIPSE_OPEN
	: '<ellipse' -> pushMode(TAG)
	;
	
ELLIPSE_CLOSE
	: '/>' -> popMode
	;

LINE_OPEN
	: '<line' -> pushMode(TAG)
	;
	
LINE_CLOSE
	: '/>' -> popMode
	;

POLYGON_OPEN
	: '<polygon' -> pushMode(TAG)
	;
	
POLYGON_CLOSE
	: '/>' -> popMode
	;
	
POLYLINE_OPEN
	: '<polyline' -> pushMode(TAG)
	;
	
POLYLINE_CLOSE
	: '/>' -> popMode
	;
	
PATH_OPEN
	: '<path' -> pushMode(TAG)
	;
	
PATH_CLOSE
	: '/>' -> popMode
	;
	
TEXT_OPEN
	: '<text' -> pushMode(TAG)
	;
	
TEXT_CLOSE
	: '</text>' -> popMode
	;
	
STROKE_OPEN
	: '<g' -> pushMode(TAG)
	;
	
STROKE_CLOSE
	: '</g>' -> popMode
	;
	
DEFS_OPEN
	: '<defs' -> pushMode(TAG)
	;
	
DEFS_CLOSE
	: '</defs>' -> popMode
	;
	
FILTER_OPEN
	: '<filter' -> pushMode(TAG)
	;
	
FILTER_CLOSE
	: '</filter>' -> popMode
	;
	
FEOFFSET_OPEN
	: '<feOffset' -> pushMode(TAG)
	;
	
FEOFFSET_CLOSE
	: '/>' -> popMode
	;
	
FEBLEND_OPEN
	: '<feBlend' -> pushMode(TAG)
	;
	
FEBLEND_CLOSE
	: '/>' -> popMode
	;
	
LINEARGRADIENT_OPEN
	: '<linearGradient' -> pushMode(TAG)
	;
	
LINEARGRADIENT_CLOSE
	: '</linearGradient>' -> popMode
	;
	
STOP_OPEN
	: '<stop' -> pushMode(TAG)
	;
	
STOP_CLOSE
	: '/>' -> popMode
	;
	
RADIALGRADIENT_OPEN
	: '<radialGradient' -> pushMode(TAG)
	;
	
RADIALGRADIENT_CLOSE
	: '</radialGradient>' -> popMode
	;
	
HTML_COMMENT
    : '<!--' .*? '-->'
    ;

HTML_CONDITIONAL_COMMENT
    : '<![' .*? ']>'
    ;

XML_DECLARATION
    : '<?xml' .*? '>'
    ;

CDATA
    : '<![CDATA[' .*? ']]>'
    ;

DTD
    : '<!' .*? '>'
    ;

SCRIPTLET
    : '<?' .*? '?>'
    | '<%' .*? '%>'
    ;

SEA_WS
    :  (' '|'\t'|'\r'? '\n')+
    ;

SCRIPT_OPEN
    : '<script' .*? '>' ->pushMode(SCRIPT)
    ;

STYLE_OPEN
    : '<style' .*? '>'  ->pushMode(STYLE)
    ;

TAG_OPEN
    : '<' -> pushMode(TAG)
    ;

HTML_TEXT
    : ~'<'+
    ;

//
// tag declarations
//
mode TAG;

TAG_CLOSE
    : '>' -> popMode
    ;

TAG_SLASH_CLOSE
    : '/>' -> popMode
    ;

TAG_SLASH
    : '/'
    ;

//
// lexing mode for attribute values
//
TAG_EQUALS
    : '=' -> pushMode(ATTVALUE)
    ;
	
TAG_NAME
    : TAG_NameStartChar TAG_NameChar*
    ;

TAG_WHITESPACE
    : [ \t\r\n] -> skip
    ;

fragment
HEXDIGIT
    : [a-fA-F0-9]
    ;

fragment
DIGIT
    : [0-9]
    ;

fragment
TAG_NameChar
    : TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
    |   '\u00B7'
    |   '\u0300'..'\u036F'
    |   '\u203F'..'\u2040'
    ;

fragment
TAG_NameStartChar
    :   [:a-zA-Z]
    |   '\u2070'..'\u218F'
    |   '\u2C00'..'\u2FEF'
    |   '\u3001'..'\uD7FF'
    |   '\uF900'..'\uFDCF'
    |   '\uFDF0'..'\uFFFD'
    ;

//
// <scripts>
//
mode SCRIPT;

SCRIPT_BODY
    : .*? '</script>' -> popMode
    ;

SCRIPT_SHORT_BODY
    : .*? '</>' -> popMode
    ;

//
// <styles>
//
mode STYLE;

STYLE_BODY
    : .*? '</style>' -> popMode
    ;

STYLE_SHORT_BODY
    : .*? '</>' -> popMode
    ;

//
// attribute values
//
mode ATTVALUE;

// an attribute value may have spaces b/t the '=' and the value
ATTVALUE_VALUE
    : [ ]* ATTRIBUTE -> popMode
    ;

ATTRIBUTE
    : DOUBLE_QUOTE_STRING
    | SINGLE_QUOTE_STRING
    | ATTCHARS
    | HEXCHARS
    | DECCHARS
    ;

fragment ATTCHAR
    : '-'
    | '_'
    | '.'
    | '/'
    | '+'
    | ','
    | '?'
    | '='
    | ':'
    | ';'
    | '#'
    | [0-9a-zA-Z]
    ;

fragment ATTCHARS
    : ATTCHAR+ ' '?
    ;

fragment HEXCHARS
    : '#' [0-9a-fA-F]+
    ;

fragment DECCHARS
    : [0-9]+ '%'?
    ;

fragment DOUBLE_QUOTE_STRING
    : '"' ~[<"]* '"'
    ;
fragment SINGLE_QUOTE_STRING
    : '\'' ~[<']* '\''
;