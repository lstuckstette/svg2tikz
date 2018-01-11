parser grammar SVGParser;

@header {
package main.antlr4;
}


options { tokenVocab=SVGLexer; }

svgElements
    : htmlMisc* svgElement htmlMisc*
    ;

svgElement
    : circle
    | rect
    | ellipse
    | line
    | polygon
    | polyline
	| path
	| text
	| g
	| defs
	| filter
	| linearGradient
	| radialGradient
	| stop
    ;

circle
    : CIRCLE_OPEN htmlAttribute* CIRCLE_CLOSE
	;
	
rect
    : RECT_OPEN htmlAttribute* RECT_CLOSE
	;

ellipse
    : ELLIPSE_OPEN htmlAttribute* ELLIPSE_CLOSE
	;
	
line
    : LINE_OPEN htmlAttribute* LINE_CLOSE
	;
	
polygon
    : POLYGON_OPEN htmlAttribute* POLYGON_CLOSE
	;
	
polyline
    : POLYLINE_OPEN htmlAttribute* POLYLINE_CLOSE
	;
	
path
    : PATH_OPEN htmlAttribute* PATH_CLOSE
	;
	
text
    : TEXT_OPEN htmlAttribute* TAG_CLOSE htmlContent TEXT_CLOSE
	;
	
g
    : STROKE_OPEN htmlAttribute* TAG_CLOSE htmlContent STROKE_CLOSE
	;
	
defs
    : DEFS_OPEN htmlAttribute* TAG_CLOSE htmlContent DEFS_CLOSE
	;
	
filter
    : FILTER_OPEN htmlAttribute* TAG_CLOSE htmlContent FILTER_CLOSE
	;
	
linearGradient
    : LINEARGRADIENT_OPEN htmlAttribute* TAG_CLOSE htmlContent LINEARGRADIENT_CLOSE
	;
	
radialGradient
    : RADIALGRADIENT_OPEN htmlAttribute* TAG_CLOSE htmlContent RADIALGRADIENT_CLOSE
	;
	
stop
    : STOP_OPEN htmlAttribute* STOP_CLOSE
	;

htmlAttribute
    : htmlAttributeName TAG_EQUALS htmlAttributeValue
    | htmlAttributeName
    ;

htmlAttributeName
    : TAG_NAME
    ;

htmlAttributeValue
    : ATTVALUE_VALUE
    ;

htmlTagName
    : TAG_NAME
    ;

htmlDocument
    : (scriptlet | SEA_WS)* xml? (scriptlet | SEA_WS)* dtd? (scriptlet | SEA_WS)* SVG_OPEN svgElements* SVG_OPEN
    ;
	
htmlElements
    : htmlMisc* htmlElement htmlMisc*
    ;

htmlElement
    : TAG_OPEN htmlTagName htmlAttribute* TAG_CLOSE htmlContent TAG_OPEN TAG_SLASH htmlTagName TAG_CLOSE
    | TAG_OPEN htmlTagName htmlAttribute* TAG_SLASH_CLOSE
    | TAG_OPEN htmlTagName htmlAttribute* TAG_CLOSE
    | scriptlet
    | script
    | style
    ;

htmlContent
    : htmlChardata? ((htmlElement | xhtmlCDATA | htmlComment) htmlChardata?)*
    ;

htmlAttribute
    : htmlAttributeName TAG_EQUALS htmlAttributeValue
    | htmlAttributeName
    ;

htmlAttributeName
    : TAG_NAME
    ;

htmlAttributeValue
    : ATTVALUE_VALUE
    ;

htmlTagName
    : TAG_NAME
    ;

htmlChardata
    : HTML_TEXT
    | SEA_WS
    ;

htmlMisc
    : htmlComment
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT
    ;

xhtmlCDATA
    : CDATA
    ;

dtd
    : DTD
    ;

xml
    : XML_DECLARATION
    ;

scriptlet
    : SCRIPTLET
    ;

script
    : SCRIPT_OPEN ( SCRIPT_BODY | SCRIPT_SHORT_BODY)
    ;

style
    : STYLE_OPEN ( STYLE_BODY | STYLE_SHORT_BODY)
;