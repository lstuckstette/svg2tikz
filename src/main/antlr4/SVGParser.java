// Generated from SVGParser.g4 by ANTLR 4.7.1

package main.antlr4;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SVGParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, COMMENT=2, XML_DECL=3, DOCTYPE=4, OPEN=5, TEXT=6, NAME_SVG=7, NAME_CIRCLE=8, 
		NAME_RECT=9, NAME_ELLIPSE=10, NAME_LINE=11, NAME_POLYGON=12, NAME_POLYLINE=13, 
		NAME_PATH=14, NAME_TEXT=15, NAME_G=16, NAME_DEFS=17, NAME_FILTER=18, NAME_LINEARGRADIENT=19, 
		NAME_RADIALGRADIENT=20, NAME_STOP=21, NAME=22, CLOSE=23, SLASH_CLOSE=24, 
		SLASH=25, EQUALS=26, PATH_ATTRIBUTE=27, STRING=28, WS_INSIDE=29, COMMENT_INSIDE=30, 
		ATTRIBUTECLOSE=31, BLANK=32, PATH_M_REL=33, PATH_M=34, PATH_L_REL=35, 
		PATH_L=36, PATH_H_REL=37, PATH_H=38, PATH_V_REL=39, PATH_V=40, PATH_Z_REL=41, 
		PATH_Z=42, PATH_C_REL=43, PATH_C=44, PATH_S_REL=45, PATH_S=46, PATH_Q_REL=47, 
		PATH_Q=48, PATH_T_REL=49, PATH_T=50, PATH_A_REL=51, PATH_A=52, WS_PATH=53, 
		NUMBER=54, INT=55, FLOAT=56;
	public static final int
		RULE_svgRoot = 0, RULE_element = 1, RULE_attribute = 2, RULE_path_elements = 3, 
		RULE_path_element_moveto_rel = 4, RULE_path_element_moveto = 5, RULE_path_element_lineto_rel = 6, 
		RULE_path_element_lineto = 7, RULE_path_element_horizontalline_rel = 8, 
		RULE_path_element_horizontalline = 9, RULE_path_element_verticalline_rel = 10, 
		RULE_path_element_verticalline = 11, RULE_path_element_close = 12, RULE_path_element_cubiccurve_rel = 13, 
		RULE_path_element_cubiccurve = 14, RULE_path_element_cubicreflectcurve_rel = 15, 
		RULE_path_element_cubicreflectcurve = 16, RULE_path_element_quadraticcurve_rel = 17, 
		RULE_path_element_quadraticcurve = 18, RULE_path_element_quadraticreflectcurve_rel = 19, 
		RULE_path_element_quadraticreflectcurve = 20, RULE_path_element_arc_rel = 21, 
		RULE_path_element_arc = 22;
	public static final String[] ruleNames = {
		"svgRoot", "element", "attribute", "path_elements", "path_element_moveto_rel", 
		"path_element_moveto", "path_element_lineto_rel", "path_element_lineto", 
		"path_element_horizontalline_rel", "path_element_horizontalline", "path_element_verticalline_rel", 
		"path_element_verticalline", "path_element_close", "path_element_cubiccurve_rel", 
		"path_element_cubiccurve", "path_element_cubicreflectcurve_rel", "path_element_cubicreflectcurve", 
		"path_element_quadraticcurve_rel", "path_element_quadraticcurve", "path_element_quadraticreflectcurve_rel", 
		"path_element_quadraticreflectcurve", "path_element_arc_rel", "path_element_arc"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'<'", null, "'svg'", "'circle'", "'rect'", 
		"'ellipse'", "'line'", "'polygon'", "'polyline'", "'path'", "'text'", 
		"'g'", "'defs'", "'filter'", "'linearGradient'", "'radialGradient'", "'stop'", 
		null, "'>'", "'/>'", "'/'", "'='", "'d=\"'", null, null, null, "'\"'", 
		null, "'m'", "'M'", "'l'", "'L'", "'h'", "'H'", "'v'", "'V'", "'z'", "'Z'", 
		"'c'", "'C'", "'s'", "'S'", "'q'", "'Q'", "'t'", "'T'", "'a'", "'A'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "XML_DECL", "DOCTYPE", "OPEN", "TEXT", "NAME_SVG", 
		"NAME_CIRCLE", "NAME_RECT", "NAME_ELLIPSE", "NAME_LINE", "NAME_POLYGON", 
		"NAME_POLYLINE", "NAME_PATH", "NAME_TEXT", "NAME_G", "NAME_DEFS", "NAME_FILTER", 
		"NAME_LINEARGRADIENT", "NAME_RADIALGRADIENT", "NAME_STOP", "NAME", "CLOSE", 
		"SLASH_CLOSE", "SLASH", "EQUALS", "PATH_ATTRIBUTE", "STRING", "WS_INSIDE", 
		"COMMENT_INSIDE", "ATTRIBUTECLOSE", "BLANK", "PATH_M_REL", "PATH_M", "PATH_L_REL", 
		"PATH_L", "PATH_H_REL", "PATH_H", "PATH_V_REL", "PATH_V", "PATH_Z_REL", 
		"PATH_Z", "PATH_C_REL", "PATH_C", "PATH_S_REL", "PATH_S", "PATH_Q_REL", 
		"PATH_Q", "PATH_T_REL", "PATH_T", "PATH_A_REL", "PATH_A", "WS_PATH", "NUMBER", 
		"INT", "FLOAT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SVGParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SVGParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SvgRootContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(SVGParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public SvgRootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_svgRoot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterSvgRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitSvgRoot(this);
		}
	}

	public final SvgRootContext svgRoot() throws RecognitionException {
		SvgRootContext _localctx = new SvgRootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_svgRoot);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(OPEN);
			setState(47);
			match(NAME_SVG);
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				attribute();
				}
				}
				setState(51); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME || _la==PATH_ATTRIBUTE );
			setState(53);
			match(CLOSE);
			setState(55); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(54);
					element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(57); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(59);
			match(OPEN);
			setState(60);
			match(SLASH);
			setState(61);
			match(NAME_SVG);
			setState(62);
			match(CLOSE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementContext extends ParserRuleContext {
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
	 
		public ElementContext() { }
		public void copyFrom(ElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PathContext extends ElementContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public PathContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath(this);
		}
	}
	public static class CircleContext extends ElementContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public CircleContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterCircle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitCircle(this);
		}
	}
	public static class RectContext extends ElementContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public RectContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterRect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitRect(this);
		}
	}
	public static class EllipseContext extends ElementContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public EllipseContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterEllipse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitEllipse(this);
		}
	}
	public static class StopContext extends ElementContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public StopContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterStop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitStop(this);
		}
	}
	public static class GContext extends ElementContext {
		public TerminalNode SLASH() { return getToken(SVGParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public GContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterG(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitG(this);
		}
	}
	public static class RadialGradientContext extends ElementContext {
		public TerminalNode SLASH() { return getToken(SVGParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public RadialGradientContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterRadialGradient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitRadialGradient(this);
		}
	}
	public static class TextContext extends ElementContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public TextContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitText(this);
		}
	}
	public static class DefsContext extends ElementContext {
		public TerminalNode SLASH() { return getToken(SVGParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public DefsContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterDefs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitDefs(this);
		}
	}
	public static class LineContext extends ElementContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public LineContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitLine(this);
		}
	}
	public static class LinearGradientContext extends ElementContext {
		public TerminalNode SLASH() { return getToken(SVGParser.SLASH, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public LinearGradientContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterLinearGradient(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitLinearGradient(this);
		}
	}
	public static class FilterContext extends ElementContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public FilterContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitFilter(this);
		}
	}
	public static class PolylineContext extends ElementContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public PolylineContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPolyline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPolyline(this);
		}
	}
	public static class UnnamedElement_SelfCloseContext extends ElementContext {
		public TerminalNode NAME() { return getToken(SVGParser.NAME, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public UnnamedElement_SelfCloseContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterUnnamedElement_SelfClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitUnnamedElement_SelfClose(this);
		}
	}
	public static class PolygonContext extends ElementContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public PolygonContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPolygon(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPolygon(this);
		}
	}
	public static class UnnamedElementContext extends ElementContext {
		public TerminalNode NAME() { return getToken(SVGParser.NAME, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public UnnamedElementContext(ElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterUnnamedElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitUnnamedElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		int _la;
		try {
			int _alt;
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new CircleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(OPEN);
				setState(65);
				match(NAME_CIRCLE);
				setState(67); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(66);
					attribute();
					}
					}
					setState(69); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(71);
				match(SLASH_CLOSE);
				}
				break;
			case 2:
				_localctx = new RectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(OPEN);
				setState(74);
				match(NAME_RECT);
				setState(76); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(75);
					attribute();
					}
					}
					setState(78); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(80);
				match(SLASH_CLOSE);
				}
				break;
			case 3:
				_localctx = new EllipseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(OPEN);
				setState(83);
				match(NAME_ELLIPSE);
				setState(85); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(84);
					attribute();
					}
					}
					setState(87); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(89);
				match(SLASH_CLOSE);
				}
				break;
			case 4:
				_localctx = new LineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(91);
				match(OPEN);
				setState(92);
				match(NAME_LINE);
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(93);
					attribute();
					}
					}
					setState(96); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(98);
				match(SLASH_CLOSE);
				}
				break;
			case 5:
				_localctx = new PolygonContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				match(OPEN);
				setState(101);
				match(NAME_POLYGON);
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(102);
					attribute();
					}
					}
					setState(105); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(107);
				match(SLASH_CLOSE);
				}
				break;
			case 6:
				_localctx = new PolylineContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(109);
				match(OPEN);
				setState(110);
				match(NAME_POLYLINE);
				setState(112); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(111);
					attribute();
					}
					}
					setState(114); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(116);
				match(SLASH_CLOSE);
				}
				break;
			case 7:
				_localctx = new PathContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(118);
				match(OPEN);
				setState(119);
				match(NAME_PATH);
				setState(121); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(120);
					attribute();
					}
					}
					setState(123); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(125);
				match(SLASH_CLOSE);
				}
				break;
			case 8:
				_localctx = new TextContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(127);
				match(OPEN);
				setState(128);
				match(NAME_TEXT);
				setState(130); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(129);
					attribute();
					}
					}
					setState(132); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(134);
				match(SLASH_CLOSE);
				}
				break;
			case 9:
				_localctx = new GContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(136);
				match(OPEN);
				setState(137);
				match(NAME_G);
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==PATH_ATTRIBUTE) {
					{
					{
					setState(138);
					attribute();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(144);
				match(CLOSE);
				setState(146); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(145);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(148); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(150);
				match(OPEN);
				setState(151);
				match(SLASH);
				setState(152);
				match(NAME_G);
				setState(153);
				match(CLOSE);
				}
				break;
			case 10:
				_localctx = new FilterContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(155);
				match(OPEN);
				setState(156);
				match(NAME_FILTER);
				setState(158); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(157);
					attribute();
					}
					}
					setState(160); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(162);
				match(SLASH_CLOSE);
				}
				break;
			case 11:
				_localctx = new StopContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(164);
				match(OPEN);
				setState(165);
				match(NAME_STOP);
				setState(167); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(166);
					attribute();
					}
					}
					setState(169); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(171);
				match(SLASH_CLOSE);
				}
				break;
			case 12:
				_localctx = new DefsContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(173);
				match(OPEN);
				setState(174);
				match(NAME_DEFS);
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==PATH_ATTRIBUTE) {
					{
					{
					setState(175);
					attribute();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(181);
				match(CLOSE);
				setState(183); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(182);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(185); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(187);
				match(OPEN);
				setState(188);
				match(SLASH);
				setState(189);
				match(NAME_DEFS);
				setState(190);
				match(CLOSE);
				}
				break;
			case 13:
				_localctx = new LinearGradientContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(192);
				match(OPEN);
				setState(193);
				match(NAME_LINEARGRADIENT);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==PATH_ATTRIBUTE) {
					{
					{
					setState(194);
					attribute();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				match(CLOSE);
				setState(202); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(201);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(204); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(206);
				match(OPEN);
				setState(207);
				match(SLASH);
				setState(208);
				match(NAME_LINEARGRADIENT);
				setState(209);
				match(CLOSE);
				}
				break;
			case 14:
				_localctx = new RadialGradientContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(211);
				match(OPEN);
				setState(212);
				match(NAME_RADIALGRADIENT);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==PATH_ATTRIBUTE) {
					{
					{
					setState(213);
					attribute();
					}
					}
					setState(218);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(219);
				match(CLOSE);
				setState(221); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(220);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(223); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(225);
				match(OPEN);
				setState(226);
				match(SLASH);
				setState(227);
				match(NAME_RADIALGRADIENT);
				setState(228);
				match(CLOSE);
				}
				break;
			case 15:
				_localctx = new UnnamedElementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(230);
				match(OPEN);
				setState(231);
				match(NAME);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==PATH_ATTRIBUTE) {
					{
					{
					setState(232);
					attribute();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN) {
					{
					{
					setState(238);
					element();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
				match(CLOSE);
				}
				break;
			case 16:
				_localctx = new UnnamedElement_SelfCloseContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(245);
				match(OPEN);
				setState(246);
				match(NAME);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==PATH_ATTRIBUTE) {
					{
					{
					setState(247);
					attribute();
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253);
				match(SLASH_CLOSE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SVGParser.NAME, 0); }
		public TerminalNode STRING() { return getToken(SVGParser.STRING, 0); }
		public List<Path_elementsContext> path_elements() {
			return getRuleContexts(Path_elementsContext.class);
		}
		public Path_elementsContext path_elements(int i) {
			return getRuleContext(Path_elementsContext.class,i);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attribute);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(NAME);
				setState(257);
				match(EQUALS);
				setState(258);
				match(STRING);
				}
				break;
			case PATH_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(PATH_ATTRIBUTE);
				setState(261); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(260);
					path_elements();
					}
					}
					setState(263); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BLANK) | (1L << PATH_M_REL) | (1L << PATH_M) | (1L << PATH_L_REL) | (1L << PATH_L) | (1L << PATH_H_REL) | (1L << PATH_H) | (1L << PATH_V_REL) | (1L << PATH_V) | (1L << PATH_Z_REL) | (1L << PATH_Z) | (1L << PATH_C_REL) | (1L << PATH_C) | (1L << PATH_S_REL) | (1L << PATH_S) | (1L << PATH_Q_REL) | (1L << PATH_Q) | (1L << PATH_T_REL) | (1L << PATH_T) | (1L << PATH_A_REL) | (1L << PATH_A))) != 0) );
				setState(265);
				match(ATTRIBUTECLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_elementsContext extends ParserRuleContext {
		public Path_element_movetoContext path_element_moveto() {
			return getRuleContext(Path_element_movetoContext.class,0);
		}
		public Path_element_moveto_relContext path_element_moveto_rel() {
			return getRuleContext(Path_element_moveto_relContext.class,0);
		}
		public Path_element_lineto_relContext path_element_lineto_rel() {
			return getRuleContext(Path_element_lineto_relContext.class,0);
		}
		public Path_element_linetoContext path_element_lineto() {
			return getRuleContext(Path_element_linetoContext.class,0);
		}
		public Path_element_horizontalline_relContext path_element_horizontalline_rel() {
			return getRuleContext(Path_element_horizontalline_relContext.class,0);
		}
		public Path_element_horizontallineContext path_element_horizontalline() {
			return getRuleContext(Path_element_horizontallineContext.class,0);
		}
		public Path_element_verticalline_relContext path_element_verticalline_rel() {
			return getRuleContext(Path_element_verticalline_relContext.class,0);
		}
		public Path_element_verticallineContext path_element_verticalline() {
			return getRuleContext(Path_element_verticallineContext.class,0);
		}
		public Path_element_closeContext path_element_close() {
			return getRuleContext(Path_element_closeContext.class,0);
		}
		public Path_element_cubiccurve_relContext path_element_cubiccurve_rel() {
			return getRuleContext(Path_element_cubiccurve_relContext.class,0);
		}
		public Path_element_cubiccurveContext path_element_cubiccurve() {
			return getRuleContext(Path_element_cubiccurveContext.class,0);
		}
		public Path_element_cubicreflectcurve_relContext path_element_cubicreflectcurve_rel() {
			return getRuleContext(Path_element_cubicreflectcurve_relContext.class,0);
		}
		public Path_element_cubicreflectcurveContext path_element_cubicreflectcurve() {
			return getRuleContext(Path_element_cubicreflectcurveContext.class,0);
		}
		public Path_element_quadraticcurve_relContext path_element_quadraticcurve_rel() {
			return getRuleContext(Path_element_quadraticcurve_relContext.class,0);
		}
		public Path_element_quadraticcurveContext path_element_quadraticcurve() {
			return getRuleContext(Path_element_quadraticcurveContext.class,0);
		}
		public Path_element_quadraticreflectcurve_relContext path_element_quadraticreflectcurve_rel() {
			return getRuleContext(Path_element_quadraticreflectcurve_relContext.class,0);
		}
		public Path_element_quadraticreflectcurveContext path_element_quadraticreflectcurve() {
			return getRuleContext(Path_element_quadraticreflectcurveContext.class,0);
		}
		public Path_element_arc_relContext path_element_arc_rel() {
			return getRuleContext(Path_element_arc_relContext.class,0);
		}
		public Path_element_arcContext path_element_arc() {
			return getRuleContext(Path_element_arcContext.class,0);
		}
		public Path_elementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_elements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_elements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_elements(this);
		}
	}

	public final Path_elementsContext path_elements() throws RecognitionException {
		Path_elementsContext _localctx = new Path_elementsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_path_elements);
		try {
			setState(288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				path_element_moveto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				path_element_moveto_rel();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(271);
				path_element_lineto_rel();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				path_element_lineto();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
				path_element_horizontalline_rel();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				path_element_horizontalline();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(275);
				path_element_verticalline_rel();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(276);
				path_element_verticalline();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(277);
				path_element_close();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(278);
				path_element_cubiccurve_rel();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(279);
				path_element_cubiccurve();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(280);
				path_element_cubicreflectcurve_rel();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(281);
				path_element_cubicreflectcurve();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(282);
				path_element_quadraticcurve_rel();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(283);
				path_element_quadraticcurve();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(284);
				path_element_quadraticreflectcurve_rel();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(285);
				path_element_quadraticreflectcurve();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(286);
				path_element_arc_rel();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(287);
				path_element_arc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_moveto_relContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SVGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SVGParser.NUMBER, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_moveto_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_moveto_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_moveto_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_moveto_rel(this);
		}
	}

	public final Path_element_moveto_relContext path_element_moveto_rel() throws RecognitionException {
		Path_element_moveto_relContext _localctx = new Path_element_moveto_relContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_path_element_moveto_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(290);
				match(BLANK);
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(PATH_M_REL);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(297);
				match(BLANK);
				}
				}
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(303);
			match(NUMBER);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(304);
				match(BLANK);
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(310);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_movetoContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SVGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SVGParser.NUMBER, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_movetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_moveto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_moveto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_moveto(this);
		}
	}

	public final Path_element_movetoContext path_element_moveto() throws RecognitionException {
		Path_element_movetoContext _localctx = new Path_element_movetoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_path_element_moveto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(312);
				match(BLANK);
				}
				}
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(318);
			match(PATH_M);
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(319);
				match(BLANK);
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(325);
			match(NUMBER);
			setState(329);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(326);
				match(BLANK);
				}
				}
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(332);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_lineto_relContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SVGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SVGParser.NUMBER, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_lineto_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_lineto_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_lineto_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_lineto_rel(this);
		}
	}

	public final Path_element_lineto_relContext path_element_lineto_rel() throws RecognitionException {
		Path_element_lineto_relContext _localctx = new Path_element_lineto_relContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_path_element_lineto_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(334);
				match(BLANK);
				}
				}
				setState(339);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(340);
			match(PATH_L_REL);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(341);
				match(BLANK);
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(347);
			match(NUMBER);
			setState(351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(348);
				match(BLANK);
				}
				}
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(354);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_linetoContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SVGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SVGParser.NUMBER, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_linetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_lineto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_lineto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_lineto(this);
		}
	}

	public final Path_element_linetoContext path_element_lineto() throws RecognitionException {
		Path_element_linetoContext _localctx = new Path_element_linetoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_path_element_lineto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(356);
				match(BLANK);
				}
				}
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(362);
			match(PATH_L);
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(363);
				match(BLANK);
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369);
			match(NUMBER);
			setState(373);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(370);
				match(BLANK);
				}
				}
				setState(375);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(376);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_horizontalline_relContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SVGParser.NUMBER, 0); }
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_horizontalline_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_horizontalline_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_horizontalline_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_horizontalline_rel(this);
		}
	}

	public final Path_element_horizontalline_relContext path_element_horizontalline_rel() throws RecognitionException {
		Path_element_horizontalline_relContext _localctx = new Path_element_horizontalline_relContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_path_element_horizontalline_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(378);
				match(BLANK);
				}
				}
				setState(383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(384);
			match(PATH_H_REL);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(385);
				match(BLANK);
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(391);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_horizontallineContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SVGParser.NUMBER, 0); }
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_horizontallineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_horizontalline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_horizontalline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_horizontalline(this);
		}
	}

	public final Path_element_horizontallineContext path_element_horizontalline() throws RecognitionException {
		Path_element_horizontallineContext _localctx = new Path_element_horizontallineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_path_element_horizontalline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(393);
				match(BLANK);
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
			match(PATH_H);
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(400);
				match(BLANK);
				}
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(406);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_verticalline_relContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SVGParser.NUMBER, 0); }
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_verticalline_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_verticalline_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_verticalline_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_verticalline_rel(this);
		}
	}

	public final Path_element_verticalline_relContext path_element_verticalline_rel() throws RecognitionException {
		Path_element_verticalline_relContext _localctx = new Path_element_verticalline_relContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_path_element_verticalline_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(408);
				match(BLANK);
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
			match(PATH_V_REL);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(415);
				match(BLANK);
				}
				}
				setState(420);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(421);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_verticallineContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(SVGParser.NUMBER, 0); }
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_verticallineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_verticalline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_verticalline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_verticalline(this);
		}
	}

	public final Path_element_verticallineContext path_element_verticalline() throws RecognitionException {
		Path_element_verticallineContext _localctx = new Path_element_verticallineContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_path_element_verticalline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(423);
				match(BLANK);
				}
				}
				setState(428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(429);
			match(PATH_V);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(430);
				match(BLANK);
				}
				}
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(436);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_closeContext extends ParserRuleContext {
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_closeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_close; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_close(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_close(this);
		}
	}

	public final Path_element_closeContext path_element_close() throws RecognitionException {
		Path_element_closeContext _localctx = new Path_element_closeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_path_element_close);
		int _la;
		try {
			setState(452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BLANK) {
					{
					{
					setState(438);
					match(BLANK);
					}
					}
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(444);
				match(PATH_Z_REL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BLANK) {
					{
					{
					setState(445);
					match(BLANK);
					}
					}
					setState(450);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(451);
				match(PATH_Z);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_cubiccurve_relContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SVGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SVGParser.NUMBER, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_cubiccurve_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_cubiccurve_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_cubiccurve_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_cubiccurve_rel(this);
		}
	}

	public final Path_element_cubiccurve_relContext path_element_cubiccurve_rel() throws RecognitionException {
		Path_element_cubiccurve_relContext _localctx = new Path_element_cubiccurve_relContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_path_element_cubiccurve_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(454);
				match(BLANK);
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(460);
			match(PATH_C_REL);
			setState(464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(461);
				match(BLANK);
				}
				}
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(467);
			match(NUMBER);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(468);
				match(BLANK);
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
			match(NUMBER);
			setState(478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(475);
				match(BLANK);
				}
				}
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(481);
			match(NUMBER);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(482);
				match(BLANK);
				}
				}
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(488);
			match(NUMBER);
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(489);
				match(BLANK);
				}
				}
				setState(494);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(495);
			match(NUMBER);
			setState(499);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(496);
				match(BLANK);
				}
				}
				setState(501);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(502);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_cubiccurveContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SVGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SVGParser.NUMBER, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_cubiccurveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_cubiccurve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_cubiccurve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_cubiccurve(this);
		}
	}

	public final Path_element_cubiccurveContext path_element_cubiccurve() throws RecognitionException {
		Path_element_cubiccurveContext _localctx = new Path_element_cubiccurveContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_path_element_cubiccurve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(504);
				match(BLANK);
				}
				}
				setState(509);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(510);
			match(PATH_C);
			setState(514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(511);
				match(BLANK);
				}
				}
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(517);
			match(NUMBER);
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(518);
				match(BLANK);
				}
				}
				setState(523);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(524);
			match(NUMBER);
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(525);
				match(BLANK);
				}
				}
				setState(530);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(531);
			match(NUMBER);
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(532);
				match(BLANK);
				}
				}
				setState(537);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(538);
			match(NUMBER);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(539);
				match(BLANK);
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(545);
			match(NUMBER);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(546);
				match(BLANK);
				}
				}
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(552);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_cubicreflectcurve_relContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SVGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SVGParser.NUMBER, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_cubicreflectcurve_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_cubicreflectcurve_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_cubicreflectcurve_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_cubicreflectcurve_rel(this);
		}
	}

	public final Path_element_cubicreflectcurve_relContext path_element_cubicreflectcurve_rel() throws RecognitionException {
		Path_element_cubicreflectcurve_relContext _localctx = new Path_element_cubicreflectcurve_relContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_path_element_cubicreflectcurve_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(554);
				match(BLANK);
				}
				}
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(560);
			match(PATH_S_REL);
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(561);
				match(BLANK);
				}
				}
				setState(566);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(567);
			match(NUMBER);
			setState(571);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(568);
				match(BLANK);
				}
				}
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(574);
			match(NUMBER);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(575);
				match(BLANK);
				}
				}
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(581);
			match(NUMBER);
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(582);
				match(BLANK);
				}
				}
				setState(587);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(588);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_cubicreflectcurveContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SVGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SVGParser.NUMBER, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_cubicreflectcurveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_cubicreflectcurve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_cubicreflectcurve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_cubicreflectcurve(this);
		}
	}

	public final Path_element_cubicreflectcurveContext path_element_cubicreflectcurve() throws RecognitionException {
		Path_element_cubicreflectcurveContext _localctx = new Path_element_cubicreflectcurveContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_path_element_cubicreflectcurve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(590);
				match(BLANK);
				}
				}
				setState(595);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(596);
			match(PATH_S);
			setState(600);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(597);
				match(BLANK);
				}
				}
				setState(602);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(603);
			match(NUMBER);
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(604);
				match(BLANK);
				}
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(610);
			match(NUMBER);
			setState(614);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(611);
				match(BLANK);
				}
				}
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(617);
			match(NUMBER);
			setState(621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(618);
				match(BLANK);
				}
				}
				setState(623);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(624);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_quadraticcurve_relContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SVGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SVGParser.NUMBER, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_quadraticcurve_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_quadraticcurve_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_quadraticcurve_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_quadraticcurve_rel(this);
		}
	}

	public final Path_element_quadraticcurve_relContext path_element_quadraticcurve_rel() throws RecognitionException {
		Path_element_quadraticcurve_relContext _localctx = new Path_element_quadraticcurve_relContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_path_element_quadraticcurve_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(626);
				match(BLANK);
				}
				}
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(632);
			match(PATH_Q_REL);
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(633);
				match(BLANK);
				}
				}
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(639);
			match(NUMBER);
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(640);
				match(BLANK);
				}
				}
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(646);
			match(NUMBER);
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(647);
				match(BLANK);
				}
				}
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(653);
			match(NUMBER);
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(654);
				match(BLANK);
				}
				}
				setState(659);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(660);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_quadraticcurveContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SVGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SVGParser.NUMBER, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_quadraticcurveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_quadraticcurve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_quadraticcurve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_quadraticcurve(this);
		}
	}

	public final Path_element_quadraticcurveContext path_element_quadraticcurve() throws RecognitionException {
		Path_element_quadraticcurveContext _localctx = new Path_element_quadraticcurveContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_path_element_quadraticcurve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(662);
				match(BLANK);
				}
				}
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(668);
			match(PATH_Q);
			setState(672);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(669);
				match(BLANK);
				}
				}
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(675);
			match(NUMBER);
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(676);
				match(BLANK);
				}
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(682);
			match(NUMBER);
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(683);
				match(BLANK);
				}
				}
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(689);
			match(NUMBER);
			setState(693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(690);
				match(BLANK);
				}
				}
				setState(695);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(696);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_quadraticreflectcurve_relContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SVGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SVGParser.NUMBER, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_quadraticreflectcurve_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_quadraticreflectcurve_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_quadraticreflectcurve_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_quadraticreflectcurve_rel(this);
		}
	}

	public final Path_element_quadraticreflectcurve_relContext path_element_quadraticreflectcurve_rel() throws RecognitionException {
		Path_element_quadraticreflectcurve_relContext _localctx = new Path_element_quadraticreflectcurve_relContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_path_element_quadraticreflectcurve_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(698);
				match(BLANK);
				}
				}
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(704);
			match(PATH_T_REL);
			setState(708);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(705);
				match(BLANK);
				}
				}
				setState(710);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(711);
			match(NUMBER);
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(712);
				match(BLANK);
				}
				}
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(718);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_quadraticreflectcurveContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SVGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SVGParser.NUMBER, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_quadraticreflectcurveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_quadraticreflectcurve; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_quadraticreflectcurve(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_quadraticreflectcurve(this);
		}
	}

	public final Path_element_quadraticreflectcurveContext path_element_quadraticreflectcurve() throws RecognitionException {
		Path_element_quadraticreflectcurveContext _localctx = new Path_element_quadraticreflectcurveContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_path_element_quadraticreflectcurve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(723);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(720);
				match(BLANK);
				}
				}
				setState(725);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(726);
			match(PATH_T);
			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(727);
				match(BLANK);
				}
				}
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(733);
			match(NUMBER);
			setState(737);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(734);
				match(BLANK);
				}
				}
				setState(739);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(740);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_arc_relContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SVGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SVGParser.NUMBER, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_arc_relContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_arc_rel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_arc_rel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_arc_rel(this);
		}
	}

	public final Path_element_arc_relContext path_element_arc_rel() throws RecognitionException {
		Path_element_arc_relContext _localctx = new Path_element_arc_relContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_path_element_arc_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(742);
				match(BLANK);
				}
				}
				setState(747);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(748);
			match(PATH_A_REL);
			setState(752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(749);
				match(BLANK);
				}
				}
				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(755);
			match(NUMBER);
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(756);
				match(BLANK);
				}
				}
				setState(761);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(762);
			match(NUMBER);
			setState(766);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(763);
				match(BLANK);
				}
				}
				setState(768);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(769);
			match(NUMBER);
			setState(773);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(770);
				match(BLANK);
				}
				}
				setState(775);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(776);
			match(NUMBER);
			setState(780);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(777);
				match(BLANK);
				}
				}
				setState(782);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(783);
			match(NUMBER);
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(784);
				match(BLANK);
				}
				}
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(790);
			match(NUMBER);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(791);
				match(BLANK);
				}
				}
				setState(796);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(797);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Path_element_arcContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(SVGParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(SVGParser.NUMBER, i);
		}
		public List<TerminalNode> BLANK() { return getTokens(SVGParser.BLANK); }
		public TerminalNode BLANK(int i) {
			return getToken(SVGParser.BLANK, i);
		}
		public Path_element_arcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_element_arc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_element_arc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_element_arc(this);
		}
	}

	public final Path_element_arcContext path_element_arc() throws RecognitionException {
		Path_element_arcContext _localctx = new Path_element_arcContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_path_element_arc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(799);
				match(BLANK);
				}
				}
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(805);
			match(PATH_A);
			setState(809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(806);
				match(BLANK);
				}
				}
				setState(811);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(812);
			match(NUMBER);
			setState(816);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(813);
				match(BLANK);
				}
				}
				setState(818);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(819);
			match(NUMBER);
			setState(823);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(820);
				match(BLANK);
				}
				}
				setState(825);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(826);
			match(NUMBER);
			setState(830);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(827);
				match(BLANK);
				}
				}
				setState(832);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(833);
			match(NUMBER);
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(834);
				match(BLANK);
				}
				}
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(840);
			match(NUMBER);
			setState(844);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(841);
				match(BLANK);
				}
				}
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(847);
			match(NUMBER);
			setState(851);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(848);
				match(BLANK);
				}
				}
				setState(853);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(854);
			match(NUMBER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u035b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\2\6\2\64\n\2\r\2\16\2\65\3\2\3\2\6\2:\n\2\r\2\16\2;\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\6\3F\n\3\r\3\16\3G\3\3\3\3\3\3\3\3\3\3\6\3O\n\3\r\3\16"+
		"\3P\3\3\3\3\3\3\3\3\3\3\6\3X\n\3\r\3\16\3Y\3\3\3\3\3\3\3\3\3\3\6\3a\n"+
		"\3\r\3\16\3b\3\3\3\3\3\3\3\3\3\3\6\3j\n\3\r\3\16\3k\3\3\3\3\3\3\3\3\3"+
		"\3\6\3s\n\3\r\3\16\3t\3\3\3\3\3\3\3\3\3\3\6\3|\n\3\r\3\16\3}\3\3\3\3\3"+
		"\3\3\3\3\3\6\3\u0085\n\3\r\3\16\3\u0086\3\3\3\3\3\3\3\3\3\3\7\3\u008e"+
		"\n\3\f\3\16\3\u0091\13\3\3\3\3\3\6\3\u0095\n\3\r\3\16\3\u0096\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\6\3\u00a1\n\3\r\3\16\3\u00a2\3\3\3\3\3\3\3\3"+
		"\3\3\6\3\u00aa\n\3\r\3\16\3\u00ab\3\3\3\3\3\3\3\3\3\3\7\3\u00b3\n\3\f"+
		"\3\16\3\u00b6\13\3\3\3\3\3\6\3\u00ba\n\3\r\3\16\3\u00bb\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\7\3\u00c6\n\3\f\3\16\3\u00c9\13\3\3\3\3\3\6\3\u00cd"+
		"\n\3\r\3\16\3\u00ce\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00d9\n\3\f\3"+
		"\16\3\u00dc\13\3\3\3\3\3\6\3\u00e0\n\3\r\3\16\3\u00e1\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3\u00ec\n\3\f\3\16\3\u00ef\13\3\3\3\7\3\u00f2\n\3\f"+
		"\3\16\3\u00f5\13\3\3\3\3\3\3\3\3\3\7\3\u00fb\n\3\f\3\16\3\u00fe\13\3\3"+
		"\3\5\3\u0101\n\3\3\4\3\4\3\4\3\4\3\4\6\4\u0108\n\4\r\4\16\4\u0109\3\4"+
		"\3\4\5\4\u010e\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0123\n\5\3\6\7\6\u0126\n\6\f\6\16\6\u0129"+
		"\13\6\3\6\3\6\7\6\u012d\n\6\f\6\16\6\u0130\13\6\3\6\3\6\7\6\u0134\n\6"+
		"\f\6\16\6\u0137\13\6\3\6\3\6\3\7\7\7\u013c\n\7\f\7\16\7\u013f\13\7\3\7"+
		"\3\7\7\7\u0143\n\7\f\7\16\7\u0146\13\7\3\7\3\7\7\7\u014a\n\7\f\7\16\7"+
		"\u014d\13\7\3\7\3\7\3\b\7\b\u0152\n\b\f\b\16\b\u0155\13\b\3\b\3\b\7\b"+
		"\u0159\n\b\f\b\16\b\u015c\13\b\3\b\3\b\7\b\u0160\n\b\f\b\16\b\u0163\13"+
		"\b\3\b\3\b\3\t\7\t\u0168\n\t\f\t\16\t\u016b\13\t\3\t\3\t\7\t\u016f\n\t"+
		"\f\t\16\t\u0172\13\t\3\t\3\t\7\t\u0176\n\t\f\t\16\t\u0179\13\t\3\t\3\t"+
		"\3\n\7\n\u017e\n\n\f\n\16\n\u0181\13\n\3\n\3\n\7\n\u0185\n\n\f\n\16\n"+
		"\u0188\13\n\3\n\3\n\3\13\7\13\u018d\n\13\f\13\16\13\u0190\13\13\3\13\3"+
		"\13\7\13\u0194\n\13\f\13\16\13\u0197\13\13\3\13\3\13\3\f\7\f\u019c\n\f"+
		"\f\f\16\f\u019f\13\f\3\f\3\f\7\f\u01a3\n\f\f\f\16\f\u01a6\13\f\3\f\3\f"+
		"\3\r\7\r\u01ab\n\r\f\r\16\r\u01ae\13\r\3\r\3\r\7\r\u01b2\n\r\f\r\16\r"+
		"\u01b5\13\r\3\r\3\r\3\16\7\16\u01ba\n\16\f\16\16\16\u01bd\13\16\3\16\3"+
		"\16\7\16\u01c1\n\16\f\16\16\16\u01c4\13\16\3\16\5\16\u01c7\n\16\3\17\7"+
		"\17\u01ca\n\17\f\17\16\17\u01cd\13\17\3\17\3\17\7\17\u01d1\n\17\f\17\16"+
		"\17\u01d4\13\17\3\17\3\17\7\17\u01d8\n\17\f\17\16\17\u01db\13\17\3\17"+
		"\3\17\7\17\u01df\n\17\f\17\16\17\u01e2\13\17\3\17\3\17\7\17\u01e6\n\17"+
		"\f\17\16\17\u01e9\13\17\3\17\3\17\7\17\u01ed\n\17\f\17\16\17\u01f0\13"+
		"\17\3\17\3\17\7\17\u01f4\n\17\f\17\16\17\u01f7\13\17\3\17\3\17\3\20\7"+
		"\20\u01fc\n\20\f\20\16\20\u01ff\13\20\3\20\3\20\7\20\u0203\n\20\f\20\16"+
		"\20\u0206\13\20\3\20\3\20\7\20\u020a\n\20\f\20\16\20\u020d\13\20\3\20"+
		"\3\20\7\20\u0211\n\20\f\20\16\20\u0214\13\20\3\20\3\20\7\20\u0218\n\20"+
		"\f\20\16\20\u021b\13\20\3\20\3\20\7\20\u021f\n\20\f\20\16\20\u0222\13"+
		"\20\3\20\3\20\7\20\u0226\n\20\f\20\16\20\u0229\13\20\3\20\3\20\3\21\7"+
		"\21\u022e\n\21\f\21\16\21\u0231\13\21\3\21\3\21\7\21\u0235\n\21\f\21\16"+
		"\21\u0238\13\21\3\21\3\21\7\21\u023c\n\21\f\21\16\21\u023f\13\21\3\21"+
		"\3\21\7\21\u0243\n\21\f\21\16\21\u0246\13\21\3\21\3\21\7\21\u024a\n\21"+
		"\f\21\16\21\u024d\13\21\3\21\3\21\3\22\7\22\u0252\n\22\f\22\16\22\u0255"+
		"\13\22\3\22\3\22\7\22\u0259\n\22\f\22\16\22\u025c\13\22\3\22\3\22\7\22"+
		"\u0260\n\22\f\22\16\22\u0263\13\22\3\22\3\22\7\22\u0267\n\22\f\22\16\22"+
		"\u026a\13\22\3\22\3\22\7\22\u026e\n\22\f\22\16\22\u0271\13\22\3\22\3\22"+
		"\3\23\7\23\u0276\n\23\f\23\16\23\u0279\13\23\3\23\3\23\7\23\u027d\n\23"+
		"\f\23\16\23\u0280\13\23\3\23\3\23\7\23\u0284\n\23\f\23\16\23\u0287\13"+
		"\23\3\23\3\23\7\23\u028b\n\23\f\23\16\23\u028e\13\23\3\23\3\23\7\23\u0292"+
		"\n\23\f\23\16\23\u0295\13\23\3\23\3\23\3\24\7\24\u029a\n\24\f\24\16\24"+
		"\u029d\13\24\3\24\3\24\7\24\u02a1\n\24\f\24\16\24\u02a4\13\24\3\24\3\24"+
		"\7\24\u02a8\n\24\f\24\16\24\u02ab\13\24\3\24\3\24\7\24\u02af\n\24\f\24"+
		"\16\24\u02b2\13\24\3\24\3\24\7\24\u02b6\n\24\f\24\16\24\u02b9\13\24\3"+
		"\24\3\24\3\25\7\25\u02be\n\25\f\25\16\25\u02c1\13\25\3\25\3\25\7\25\u02c5"+
		"\n\25\f\25\16\25\u02c8\13\25\3\25\3\25\7\25\u02cc\n\25\f\25\16\25\u02cf"+
		"\13\25\3\25\3\25\3\26\7\26\u02d4\n\26\f\26\16\26\u02d7\13\26\3\26\3\26"+
		"\7\26\u02db\n\26\f\26\16\26\u02de\13\26\3\26\3\26\7\26\u02e2\n\26\f\26"+
		"\16\26\u02e5\13\26\3\26\3\26\3\27\7\27\u02ea\n\27\f\27\16\27\u02ed\13"+
		"\27\3\27\3\27\7\27\u02f1\n\27\f\27\16\27\u02f4\13\27\3\27\3\27\7\27\u02f8"+
		"\n\27\f\27\16\27\u02fb\13\27\3\27\3\27\7\27\u02ff\n\27\f\27\16\27\u0302"+
		"\13\27\3\27\3\27\7\27\u0306\n\27\f\27\16\27\u0309\13\27\3\27\3\27\7\27"+
		"\u030d\n\27\f\27\16\27\u0310\13\27\3\27\3\27\7\27\u0314\n\27\f\27\16\27"+
		"\u0317\13\27\3\27\3\27\7\27\u031b\n\27\f\27\16\27\u031e\13\27\3\27\3\27"+
		"\3\30\7\30\u0323\n\30\f\30\16\30\u0326\13\30\3\30\3\30\7\30\u032a\n\30"+
		"\f\30\16\30\u032d\13\30\3\30\3\30\7\30\u0331\n\30\f\30\16\30\u0334\13"+
		"\30\3\30\3\30\7\30\u0338\n\30\f\30\16\30\u033b\13\30\3\30\3\30\7\30\u033f"+
		"\n\30\f\30\16\30\u0342\13\30\3\30\3\30\7\30\u0346\n\30\f\30\16\30\u0349"+
		"\13\30\3\30\3\30\7\30\u034d\n\30\f\30\16\30\u0350\13\30\3\30\3\30\7\30"+
		"\u0354\n\30\f\30\16\30\u0357\13\30\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\2\2\2\u03cc\2\60\3\2\2\2\4\u0100\3\2"+
		"\2\2\6\u010d\3\2\2\2\b\u0122\3\2\2\2\n\u0127\3\2\2\2\f\u013d\3\2\2\2\16"+
		"\u0153\3\2\2\2\20\u0169\3\2\2\2\22\u017f\3\2\2\2\24\u018e\3\2\2\2\26\u019d"+
		"\3\2\2\2\30\u01ac\3\2\2\2\32\u01c6\3\2\2\2\34\u01cb\3\2\2\2\36\u01fd\3"+
		"\2\2\2 \u022f\3\2\2\2\"\u0253\3\2\2\2$\u0277\3\2\2\2&\u029b\3\2\2\2(\u02bf"+
		"\3\2\2\2*\u02d5\3\2\2\2,\u02eb\3\2\2\2.\u0324\3\2\2\2\60\61\7\7\2\2\61"+
		"\63\7\t\2\2\62\64\5\6\4\2\63\62\3\2\2\2\64\65\3\2\2\2\65\63\3\2\2\2\65"+
		"\66\3\2\2\2\66\67\3\2\2\2\679\7\31\2\28:\5\4\3\298\3\2\2\2:;\3\2\2\2;"+
		"9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=>\7\7\2\2>?\7\33\2\2?@\7\t\2\2@A\7\31\2"+
		"\2A\3\3\2\2\2BC\7\7\2\2CE\7\n\2\2DF\5\6\4\2ED\3\2\2\2FG\3\2\2\2GE\3\2"+
		"\2\2GH\3\2\2\2HI\3\2\2\2IJ\7\32\2\2J\u0101\3\2\2\2KL\7\7\2\2LN\7\13\2"+
		"\2MO\5\6\4\2NM\3\2\2\2OP\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7\32"+
		"\2\2S\u0101\3\2\2\2TU\7\7\2\2UW\7\f\2\2VX\5\6\4\2WV\3\2\2\2XY\3\2\2\2"+
		"YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\32\2\2\\\u0101\3\2\2\2]^\7\7\2\2^"+
		"`\7\r\2\2_a\5\6\4\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2"+
		"de\7\32\2\2e\u0101\3\2\2\2fg\7\7\2\2gi\7\16\2\2hj\5\6\4\2ih\3\2\2\2jk"+
		"\3\2\2\2ki\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\32\2\2n\u0101\3\2\2\2op\7\7"+
		"\2\2pr\7\17\2\2qs\5\6\4\2rq\3\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2uv\3"+
		"\2\2\2vw\7\32\2\2w\u0101\3\2\2\2xy\7\7\2\2y{\7\20\2\2z|\5\6\4\2{z\3\2"+
		"\2\2|}\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\7\32\2\2\u0080"+
		"\u0101\3\2\2\2\u0081\u0082\7\7\2\2\u0082\u0084\7\21\2\2\u0083\u0085\5"+
		"\6\4\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\7\32\2\2\u0089\u0101\3"+
		"\2\2\2\u008a\u008b\7\7\2\2\u008b\u008f\7\22\2\2\u008c\u008e\5\6\4\2\u008d"+
		"\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\7\31\2\2\u0093"+
		"\u0095\5\4\3\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0094\3\2"+
		"\2\2\u0096\u0097\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7\7\2\2\u0099"+
		"\u009a\7\33\2\2\u009a\u009b\7\22\2\2\u009b\u009c\7\31\2\2\u009c\u0101"+
		"\3\2\2\2\u009d\u009e\7\7\2\2\u009e\u00a0\7\24\2\2\u009f\u00a1\5\6\4\2"+
		"\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\32\2\2\u00a5\u0101\3\2\2\2"+
		"\u00a6\u00a7\7\7\2\2\u00a7\u00a9\7\27\2\2\u00a8\u00aa\5\6\4\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\7\32\2\2\u00ae\u0101\3\2\2\2\u00af\u00b0\7"+
		"\7\2\2\u00b0\u00b4\7\23\2\2\u00b1\u00b3\5\6\4\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b9\7\31\2\2\u00b8\u00ba\5\4\3\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\7\2\2\u00be\u00bf\7\33\2\2\u00bf"+
		"\u00c0\7\23\2\2\u00c0\u00c1\7\31\2\2\u00c1\u0101\3\2\2\2\u00c2\u00c3\7"+
		"\7\2\2\u00c3\u00c7\7\25\2\2\u00c4\u00c6\5\6\4\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00ca\3\2"+
		"\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cc\7\31\2\2\u00cb\u00cd\5\4\3\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\7\2\2\u00d1\u00d2\7\33\2\2\u00d2"+
		"\u00d3\7\25\2\2\u00d3\u00d4\7\31\2\2\u00d4\u0101\3\2\2\2\u00d5\u00d6\7"+
		"\7\2\2\u00d6\u00da\7\26\2\2\u00d7\u00d9\5\6\4\2\u00d8\u00d7\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2"+
		"\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\7\31\2\2\u00de\u00e0\5\4\3\2\u00df"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\7\7\2\2\u00e4\u00e5\7\33\2\2\u00e5"+
		"\u00e6\7\26\2\2\u00e6\u00e7\7\31\2\2\u00e7\u0101\3\2\2\2\u00e8\u00e9\7"+
		"\7\2\2\u00e9\u00ed\7\30\2\2\u00ea\u00ec\5\6\4\2\u00eb\u00ea\3\2\2\2\u00ec"+
		"\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f3\3\2"+
		"\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f2\5\4\3\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f6\u0101\7\31\2\2\u00f7\u00f8\7\7\2\2\u00f8"+
		"\u00fc\7\30\2\2\u00f9\u00fb\5\6\4\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3"+
		"\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe"+
		"\u00fc\3\2\2\2\u00ff\u0101\7\32\2\2\u0100B\3\2\2\2\u0100K\3\2\2\2\u0100"+
		"T\3\2\2\2\u0100]\3\2\2\2\u0100f\3\2\2\2\u0100o\3\2\2\2\u0100x\3\2\2\2"+
		"\u0100\u0081\3\2\2\2\u0100\u008a\3\2\2\2\u0100\u009d\3\2\2\2\u0100\u00a6"+
		"\3\2\2\2\u0100\u00af\3\2\2\2\u0100\u00c2\3\2\2\2\u0100\u00d5\3\2\2\2\u0100"+
		"\u00e8\3\2\2\2\u0100\u00f7\3\2\2\2\u0101\5\3\2\2\2\u0102\u0103\7\30\2"+
		"\2\u0103\u0104\7\34\2\2\u0104\u010e\7\36\2\2\u0105\u0107\7\35\2\2\u0106"+
		"\u0108\5\b\5\2\u0107\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u010c\7!\2\2\u010c"+
		"\u010e\3\2\2\2\u010d\u0102\3\2\2\2\u010d\u0105\3\2\2\2\u010e\7\3\2\2\2"+
		"\u010f\u0123\5\f\7\2\u0110\u0123\5\n\6\2\u0111\u0123\5\16\b\2\u0112\u0123"+
		"\5\20\t\2\u0113\u0123\5\22\n\2\u0114\u0123\5\24\13\2\u0115\u0123\5\26"+
		"\f\2\u0116\u0123\5\30\r\2\u0117\u0123\5\32\16\2\u0118\u0123\5\34\17\2"+
		"\u0119\u0123\5\36\20\2\u011a\u0123\5 \21\2\u011b\u0123\5\"\22\2\u011c"+
		"\u0123\5$\23\2\u011d\u0123\5&\24\2\u011e\u0123\5(\25\2\u011f\u0123\5*"+
		"\26\2\u0120\u0123\5,\27\2\u0121\u0123\5.\30\2\u0122\u010f\3\2\2\2\u0122"+
		"\u0110\3\2\2\2\u0122\u0111\3\2\2\2\u0122\u0112\3\2\2\2\u0122\u0113\3\2"+
		"\2\2\u0122\u0114\3\2\2\2\u0122\u0115\3\2\2\2\u0122\u0116\3\2\2\2\u0122"+
		"\u0117\3\2\2\2\u0122\u0118\3\2\2\2\u0122\u0119\3\2\2\2\u0122\u011a\3\2"+
		"\2\2\u0122\u011b\3\2\2\2\u0122\u011c\3\2\2\2\u0122\u011d\3\2\2\2\u0122"+
		"\u011e\3\2\2\2\u0122\u011f\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0121\3\2"+
		"\2\2\u0123\t\3\2\2\2\u0124\u0126\7\"\2\2\u0125\u0124\3\2\2\2\u0126\u0129"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012e\7#\2\2\u012b\u012d\7\"\2\2\u012c\u012b\3\2"+
		"\2\2\u012d\u0130\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f"+
		"\u0131\3\2\2\2\u0130\u012e\3\2\2\2\u0131\u0135\78\2\2\u0132\u0134\7\""+
		"\2\2\u0133\u0132\3\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135"+
		"\u0136\3\2\2\2\u0136\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u0139\78"+
		"\2\2\u0139\13\3\2\2\2\u013a\u013c\7\"\2\2\u013b\u013a\3\2\2\2\u013c\u013f"+
		"\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0140\3\2\2\2\u013f"+
		"\u013d\3\2\2\2\u0140\u0144\7$\2\2\u0141\u0143\7\"\2\2\u0142\u0141\3\2"+
		"\2\2\u0143\u0146\3\2\2\2\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0147\3\2\2\2\u0146\u0144\3\2\2\2\u0147\u014b\78\2\2\u0148\u014a\7\""+
		"\2\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b"+
		"\u014c\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\78"+
		"\2\2\u014f\r\3\2\2\2\u0150\u0152\7\"\2\2\u0151\u0150\3\2\2\2\u0152\u0155"+
		"\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u015a\7%\2\2\u0157\u0159\7\"\2\2\u0158\u0157\3\2"+
		"\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015d\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u0161\78\2\2\u015e\u0160\7\""+
		"\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161"+
		"\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0161\3\2\2\2\u0164\u0165\78"+
		"\2\2\u0165\17\3\2\2\2\u0166\u0168\7\"\2\2\u0167\u0166\3\2\2\2\u0168\u016b"+
		"\3\2\2\2\u0169\u0167\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u016c\3\2\2\2\u016b"+
		"\u0169\3\2\2\2\u016c\u0170\7&\2\2\u016d\u016f\7\"\2\2\u016e\u016d\3\2"+
		"\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"\u0173\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0177\78\2\2\u0174\u0176\7\""+
		"\2\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177"+
		"\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017b\78"+
		"\2\2\u017b\21\3\2\2\2\u017c\u017e\7\"\2\2\u017d\u017c\3\2\2\2\u017e\u0181"+
		"\3\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0182\u0186\7\'\2\2\u0183\u0185\7\"\2\2\u0184\u0183\3\2"+
		"\2\2\u0185\u0188\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0189\3\2\2\2\u0188\u0186\3\2\2\2\u0189\u018a\78\2\2\u018a\23\3\2\2\2"+
		"\u018b\u018d\7\"\2\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e\u018c"+
		"\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2\2\2\u0191"+
		"\u0195\7(\2\2\u0192\u0194\7\"\2\2\u0193\u0192\3\2\2\2\u0194\u0197\3\2"+
		"\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0198\u0199\78\2\2\u0199\25\3\2\2\2\u019a\u019c\7\"\2\2"+
		"\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2\2\u019d\u019e"+
		"\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a4\7)\2\2\u01a1"+
		"\u01a3\7\"\2\2\u01a2\u01a1\3\2\2\2\u01a3\u01a6\3\2\2\2\u01a4\u01a2\3\2"+
		"\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a7"+
		"\u01a8\78\2\2\u01a8\27\3\2\2\2\u01a9\u01ab\7\"\2\2\u01aa\u01a9\3\2\2\2"+
		"\u01ab\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af"+
		"\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b3\7*\2\2\u01b0\u01b2\7\"\2\2\u01b1"+
		"\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3\u01b4\3\2"+
		"\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01b7\78\2\2\u01b7"+
		"\31\3\2\2\2\u01b8\u01ba\7\"\2\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd\3\2\2"+
		"\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd\u01bb"+
		"\3\2\2\2\u01be\u01c7\7+\2\2\u01bf\u01c1\7\"\2\2\u01c0\u01bf\3\2\2\2\u01c1"+
		"\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c5\3\2"+
		"\2\2\u01c4\u01c2\3\2\2\2\u01c5\u01c7\7,\2\2\u01c6\u01bb\3\2\2\2\u01c6"+
		"\u01c2\3\2\2\2\u01c7\33\3\2\2\2\u01c8\u01ca\7\"\2\2\u01c9\u01c8\3\2\2"+
		"\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce"+
		"\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01d2\7-\2\2\u01cf\u01d1\7\"\2\2\u01d0"+
		"\u01cf\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2"+
		"\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d9\78\2\2\u01d6"+
		"\u01d8\7\"\2\2\u01d7\u01d6\3\2\2\2\u01d8\u01db\3\2\2\2\u01d9\u01d7\3\2"+
		"\2\2\u01d9\u01da\3\2\2\2\u01da\u01dc\3\2\2\2\u01db\u01d9\3\2\2\2\u01dc"+
		"\u01e0\78\2\2\u01dd\u01df\7\"\2\2\u01de\u01dd\3\2\2\2\u01df\u01e2\3\2"+
		"\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e3\3\2\2\2\u01e2"+
		"\u01e0\3\2\2\2\u01e3\u01e7\78\2\2\u01e4\u01e6\7\"\2\2\u01e5\u01e4\3\2"+
		"\2\2\u01e6\u01e9\3\2\2\2\u01e7\u01e5\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01ea\3\2\2\2\u01e9\u01e7\3\2\2\2\u01ea\u01ee\78\2\2\u01eb\u01ed\7\""+
		"\2\2\u01ec\u01eb\3\2\2\2\u01ed\u01f0\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ee"+
		"\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f1\u01f5\78"+
		"\2\2\u01f2\u01f4\7\"\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f7\3\2\2\2\u01f5"+
		"\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f8\3\2\2\2\u01f7\u01f5\3\2"+
		"\2\2\u01f8\u01f9\78\2\2\u01f9\35\3\2\2\2\u01fa\u01fc\7\"\2\2\u01fb\u01fa"+
		"\3\2\2\2\u01fc\u01ff\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fd\u01fe\3\2\2\2\u01fe"+
		"\u0200\3\2\2\2\u01ff\u01fd\3\2\2\2\u0200\u0204\7.\2\2\u0201\u0203\7\""+
		"\2\2\u0202\u0201\3\2\2\2\u0203\u0206\3\2\2\2\u0204\u0202\3\2\2\2\u0204"+
		"\u0205\3\2\2\2\u0205\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u020b\78"+
		"\2\2\u0208\u020a\7\"\2\2\u0209\u0208\3\2\2\2\u020a\u020d\3\2\2\2\u020b"+
		"\u0209\3\2\2\2\u020b\u020c\3\2\2\2\u020c\u020e\3\2\2\2\u020d\u020b\3\2"+
		"\2\2\u020e\u0212\78\2\2\u020f\u0211\7\"\2\2\u0210\u020f\3\2\2\2\u0211"+
		"\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0215\3\2"+
		"\2\2\u0214\u0212\3\2\2\2\u0215\u0219\78\2\2\u0216\u0218\7\"\2\2\u0217"+
		"\u0216\3\2\2\2\u0218\u021b\3\2\2\2\u0219\u0217\3\2\2\2\u0219\u021a\3\2"+
		"\2\2\u021a\u021c\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u0220\78\2\2\u021d"+
		"\u021f\7\"\2\2\u021e\u021d\3\2\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2"+
		"\2\2\u0220\u0221\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u0220\3\2\2\2\u0223"+
		"\u0227\78\2\2\u0224\u0226\7\"\2\2\u0225\u0224\3\2\2\2\u0226\u0229\3\2"+
		"\2\2\u0227\u0225\3\2\2\2\u0227\u0228\3\2\2\2\u0228\u022a\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u022a\u022b\78\2\2\u022b\37\3\2\2\2\u022c\u022e\7\"\2\2"+
		"\u022d\u022c\3\2\2\2\u022e\u0231\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230"+
		"\3\2\2\2\u0230\u0232\3\2\2\2\u0231\u022f\3\2\2\2\u0232\u0236\7/\2\2\u0233"+
		"\u0235\7\"\2\2\u0234\u0233\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2"+
		"\2\2\u0236\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0236\3\2\2\2\u0239"+
		"\u023d\78\2\2\u023a\u023c\7\"\2\2\u023b\u023a\3\2\2\2\u023c\u023f\3\2"+
		"\2\2\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f"+
		"\u023d\3\2\2\2\u0240\u0244\78\2\2\u0241\u0243\7\"\2\2\u0242\u0241\3\2"+
		"\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245"+
		"\u0247\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u024b\78\2\2\u0248\u024a\7\""+
		"\2\2\u0249\u0248\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b"+
		"\u024c\3\2\2\2\u024c\u024e\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u024f\78"+
		"\2\2\u024f!\3\2\2\2\u0250\u0252\7\"\2\2\u0251\u0250\3\2\2\2\u0252\u0255"+
		"\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255"+
		"\u0253\3\2\2\2\u0256\u025a\7\60\2\2\u0257\u0259\7\"\2\2\u0258\u0257\3"+
		"\2\2\2\u0259\u025c\3\2\2\2\u025a\u0258\3\2\2\2\u025a\u025b\3\2\2\2\u025b"+
		"\u025d\3\2\2\2\u025c\u025a\3\2\2\2\u025d\u0261\78\2\2\u025e\u0260\7\""+
		"\2\2\u025f\u025e\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2\2\2\u0261"+
		"\u0262\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u0261\3\2\2\2\u0264\u0268\78"+
		"\2\2\u0265\u0267\7\"\2\2\u0266\u0265\3\2\2\2\u0267\u026a\3\2\2\2\u0268"+
		"\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u026b\3\2\2\2\u026a\u0268\3\2"+
		"\2\2\u026b\u026f\78\2\2\u026c\u026e\7\"\2\2\u026d\u026c\3\2\2\2\u026e"+
		"\u0271\3\2\2\2\u026f\u026d\3\2\2\2\u026f\u0270\3\2\2\2\u0270\u0272\3\2"+
		"\2\2\u0271\u026f\3\2\2\2\u0272\u0273\78\2\2\u0273#\3\2\2\2\u0274\u0276"+
		"\7\"\2\2\u0275\u0274\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2\2\2\u0277"+
		"\u0278\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u0277\3\2\2\2\u027a\u027e\7\61"+
		"\2\2\u027b\u027d\7\"\2\2\u027c\u027b\3\2\2\2\u027d\u0280\3\2\2\2\u027e"+
		"\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f\u0281\3\2\2\2\u0280\u027e\3\2"+
		"\2\2\u0281\u0285\78\2\2\u0282\u0284\7\"\2\2\u0283\u0282\3\2\2\2\u0284"+
		"\u0287\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0288\3\2"+
		"\2\2\u0287\u0285\3\2\2\2\u0288\u028c\78\2\2\u0289\u028b\7\"\2\2\u028a"+
		"\u0289\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c\u028d\3\2"+
		"\2\2\u028d\u028f\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0293\78\2\2\u0290"+
		"\u0292\7\"\2\2\u0291\u0290\3\2\2\2\u0292\u0295\3\2\2\2\u0293\u0291\3\2"+
		"\2\2\u0293\u0294\3\2\2\2\u0294\u0296\3\2\2\2\u0295\u0293\3\2\2\2\u0296"+
		"\u0297\78\2\2\u0297%\3\2\2\2\u0298\u029a\7\"\2\2\u0299\u0298\3\2\2\2\u029a"+
		"\u029d\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029c\3\2\2\2\u029c\u029e\3\2"+
		"\2\2\u029d\u029b\3\2\2\2\u029e\u02a2\7\62\2\2\u029f\u02a1\7\"\2\2\u02a0"+
		"\u029f\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2"+
		"\2\2\u02a3\u02a5\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a9\78\2\2\u02a6"+
		"\u02a8\7\"\2\2\u02a7\u02a6\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2"+
		"\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ac\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac"+
		"\u02b0\78\2\2\u02ad\u02af\7\"\2\2\u02ae\u02ad\3\2\2\2\u02af\u02b2\3\2"+
		"\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2"+
		"\u02b0\3\2\2\2\u02b3\u02b7\78\2\2\u02b4\u02b6\7\"\2\2\u02b5\u02b4\3\2"+
		"\2\2\u02b6\u02b9\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8"+
		"\u02ba\3\2\2\2\u02b9\u02b7\3\2\2\2\u02ba\u02bb\78\2\2\u02bb\'\3\2\2\2"+
		"\u02bc\u02be\7\"\2\2\u02bd\u02bc\3\2\2\2\u02be\u02c1\3\2\2\2\u02bf\u02bd"+
		"\3\2\2\2\u02bf\u02c0\3\2\2\2\u02c0\u02c2\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c2"+
		"\u02c6\7\63\2\2\u02c3\u02c5\7\"\2\2\u02c4\u02c3\3\2\2\2\u02c5\u02c8\3"+
		"\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02c9\3\2\2\2\u02c8"+
		"\u02c6\3\2\2\2\u02c9\u02cd\78\2\2\u02ca\u02cc\7\"\2\2\u02cb\u02ca\3\2"+
		"\2\2\u02cc\u02cf\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ce"+
		"\u02d0\3\2\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d1\78\2\2\u02d1)\3\2\2\2\u02d2"+
		"\u02d4\7\"\2\2\u02d3\u02d2\3\2\2\2\u02d4\u02d7\3\2\2\2\u02d5\u02d3\3\2"+
		"\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02d8\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8"+
		"\u02dc\7\64\2\2\u02d9\u02db\7\"\2\2\u02da\u02d9\3\2\2\2\u02db\u02de\3"+
		"\2\2\2\u02dc\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df\3\2\2\2\u02de"+
		"\u02dc\3\2\2\2\u02df\u02e3\78\2\2\u02e0\u02e2\7\"\2\2\u02e1\u02e0\3\2"+
		"\2\2\u02e2\u02e5\3\2\2\2\u02e3\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4"+
		"\u02e6\3\2\2\2\u02e5\u02e3\3\2\2\2\u02e6\u02e7\78\2\2\u02e7+\3\2\2\2\u02e8"+
		"\u02ea\7\"\2\2\u02e9\u02e8\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2"+
		"\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ee\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee"+
		"\u02f2\7\65\2\2\u02ef\u02f1\7\"\2\2\u02f0\u02ef\3\2\2\2\u02f1\u02f4\3"+
		"\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f5\3\2\2\2\u02f4"+
		"\u02f2\3\2\2\2\u02f5\u02f9\78\2\2\u02f6\u02f8\7\"\2\2\u02f7\u02f6\3\2"+
		"\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa"+
		"\u02fc\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc\u0300\78\2\2\u02fd\u02ff\7\""+
		"\2\2\u02fe\u02fd\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2\2\u0300"+
		"\u0301\3\2\2\2\u0301\u0303\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u0307\78"+
		"\2\2\u0304\u0306\7\"\2\2\u0305\u0304\3\2\2\2\u0306\u0309\3\2\2\2\u0307"+
		"\u0305\3\2\2\2\u0307\u0308\3\2\2\2\u0308\u030a\3\2\2\2\u0309\u0307\3\2"+
		"\2\2\u030a\u030e\78\2\2\u030b\u030d\7\"\2\2\u030c\u030b\3\2\2\2\u030d"+
		"\u0310\3\2\2\2\u030e\u030c\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0311\3\2"+
		"\2\2\u0310\u030e\3\2\2\2\u0311\u0315\78\2\2\u0312\u0314\7\"\2\2\u0313"+
		"\u0312\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2"+
		"\2\2\u0316\u0318\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u031c\78\2\2\u0319"+
		"\u031b\7\"\2\2\u031a\u0319\3\2\2\2\u031b\u031e\3\2\2\2\u031c\u031a\3\2"+
		"\2\2\u031c\u031d\3\2\2\2\u031d\u031f\3\2\2\2\u031e\u031c\3\2\2\2\u031f"+
		"\u0320\78\2\2\u0320-\3\2\2\2\u0321\u0323\7\"\2\2\u0322\u0321\3\2\2\2\u0323"+
		"\u0326\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2\2\2\u0325\u0327\3\2"+
		"\2\2\u0326\u0324\3\2\2\2\u0327\u032b\7\66\2\2\u0328\u032a\7\"\2\2\u0329"+
		"\u0328\3\2\2\2\u032a\u032d\3\2\2\2\u032b\u0329\3\2\2\2\u032b\u032c\3\2"+
		"\2\2\u032c\u032e\3\2\2\2\u032d\u032b\3\2\2\2\u032e\u0332\78\2\2\u032f"+
		"\u0331\7\"\2\2\u0330\u032f\3\2\2\2\u0331\u0334\3\2\2\2\u0332\u0330\3\2"+
		"\2\2\u0332\u0333\3\2\2\2\u0333\u0335\3\2\2\2\u0334\u0332\3\2\2\2\u0335"+
		"\u0339\78\2\2\u0336\u0338\7\"\2\2\u0337\u0336\3\2\2\2\u0338\u033b\3\2"+
		"\2\2\u0339\u0337\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033c\3\2\2\2\u033b"+
		"\u0339\3\2\2\2\u033c\u0340\78\2\2\u033d\u033f\7\"\2\2\u033e\u033d\3\2"+
		"\2\2\u033f\u0342\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341"+
		"\u0343\3\2\2\2\u0342\u0340\3\2\2\2\u0343\u0347\78\2\2\u0344\u0346\7\""+
		"\2\2\u0345\u0344\3\2\2\2\u0346\u0349\3\2\2\2\u0347\u0345\3\2\2\2\u0347"+
		"\u0348\3\2\2\2\u0348\u034a\3\2\2\2\u0349\u0347\3\2\2\2\u034a\u034e\78"+
		"\2\2\u034b\u034d\7\"\2\2\u034c\u034b\3\2\2\2\u034d\u0350\3\2\2\2\u034e"+
		"\u034c\3\2\2\2\u034e\u034f\3\2\2\2\u034f\u0351\3\2\2\2\u0350\u034e\3\2"+
		"\2\2\u0351\u0355\78\2\2\u0352\u0354\7\"\2\2\u0353\u0352\3\2\2\2\u0354"+
		"\u0357\3\2\2\2\u0355\u0353\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0358\3\2"+
		"\2\2\u0357\u0355\3\2\2\2\u0358\u0359\78\2\2\u0359/\3\2\2\2l\65;GPYbkt"+
		"}\u0086\u008f\u0096\u00a2\u00ab\u00b4\u00bb\u00c7\u00ce\u00da\u00e1\u00ed"+
		"\u00f3\u00fc\u0100\u0109\u010d\u0122\u0127\u012e\u0135\u013d\u0144\u014b"+
		"\u0153\u015a\u0161\u0169\u0170\u0177\u017f\u0186\u018e\u0195\u019d\u01a4"+
		"\u01ac\u01b3\u01bb\u01c2\u01c6\u01cb\u01d2\u01d9\u01e0\u01e7\u01ee\u01f5"+
		"\u01fd\u0204\u020b\u0212\u0219\u0220\u0227\u022f\u0236\u023d\u0244\u024b"+
		"\u0253\u025a\u0261\u0268\u026f\u0277\u027e\u0285\u028c\u0293\u029b\u02a2"+
		"\u02a9\u02b0\u02b7\u02bf\u02c6\u02cd\u02d5\u02dc\u02e3\u02eb\u02f2\u02f9"+
		"\u0300\u0307\u030e\u0315\u031c\u0324\u032b\u0332\u0339\u0340\u0347\u034e"+
		"\u0355";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}