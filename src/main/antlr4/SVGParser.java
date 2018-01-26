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
		PATHATTRIBUTECLOSE=31, BLANK=32, PATH_M_REL=33, PATH_M=34, PATH_L_REL=35, 
		PATH_L=36, PATH_H_REL=37, PATH_H=38, PATH_V_REL=39, PATH_V=40, PATH_Z_REL=41, 
		PATH_Z=42, PATH_C_REL=43, PATH_C=44, PATH_S_REL=45, PATH_S=46, PATH_Q_REL=47, 
		PATH_Q=48, PATH_T_REL=49, PATH_T=50, PATH_A_REL=51, PATH_A=52, WS_PATH=53, 
		UNARY_OPERATOR=54, UNSIGNED_INT=55, UNSIGNED_FLOAT=56;
	public static final int
		RULE_svgRoot = 0, RULE_element = 1, RULE_attribute = 2, RULE_path_elements = 3, 
		RULE_number = 4, RULE_unsigned_number = 5, RULE_path_element_moveto_rel = 6, 
		RULE_path_element_moveto = 7, RULE_path_element_lineto_rel = 8, RULE_path_element_lineto = 9, 
		RULE_path_element_horizontalline_rel = 10, RULE_path_element_horizontalline = 11, 
		RULE_path_element_verticalline_rel = 12, RULE_path_element_verticalline = 13, 
		RULE_path_element_close = 14, RULE_path_element_cubiccurve_rel = 15, RULE_path_element_cubiccurve = 16, 
		RULE_path_element_cubicreflectcurve_rel = 17, RULE_path_element_cubicreflectcurve = 18, 
		RULE_path_element_quadraticcurve_rel = 19, RULE_path_element_quadraticcurve = 20, 
		RULE_path_element_quadraticreflectcurve_rel = 21, RULE_path_element_quadraticreflectcurve = 22, 
		RULE_path_element_arc_rel = 23, RULE_path_element_arc = 24;
	public static final String[] ruleNames = {
		"svgRoot", "element", "attribute", "path_elements", "number", "unsigned_number", 
		"path_element_moveto_rel", "path_element_moveto", "path_element_lineto_rel", 
		"path_element_lineto", "path_element_horizontalline_rel", "path_element_horizontalline", 
		"path_element_verticalline_rel", "path_element_verticalline", "path_element_close", 
		"path_element_cubiccurve_rel", "path_element_cubiccurve", "path_element_cubicreflectcurve_rel", 
		"path_element_cubicreflectcurve", "path_element_quadraticcurve_rel", "path_element_quadraticcurve", 
		"path_element_quadraticreflectcurve_rel", "path_element_quadraticreflectcurve", 
		"path_element_arc_rel", "path_element_arc"
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
		"COMMENT_INSIDE", "PATHATTRIBUTECLOSE", "BLANK", "PATH_M_REL", "PATH_M", 
		"PATH_L_REL", "PATH_L", "PATH_H_REL", "PATH_H", "PATH_V_REL", "PATH_V", 
		"PATH_Z_REL", "PATH_Z", "PATH_C_REL", "PATH_C", "PATH_S_REL", "PATH_S", 
		"PATH_Q_REL", "PATH_Q", "PATH_T_REL", "PATH_T", "PATH_A_REL", "PATH_A", 
		"WS_PATH", "UNARY_OPERATOR", "UNSIGNED_INT", "UNSIGNED_FLOAT"
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
			setState(50);
			match(OPEN);
			setState(51);
			match(NAME_SVG);
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				attribute();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME || _la==PATH_ATTRIBUTE );
			setState(57);
			match(CLOSE);
			setState(59); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(58);
					element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(61); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(63);
			match(OPEN);
			setState(64);
			match(SLASH);
			setState(65);
			match(NAME_SVG);
			setState(66);
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
		public TerminalNode TEXT() { return getToken(SVGParser.TEXT, 0); }
		public TerminalNode SLASH() { return getToken(SVGParser.SLASH, 0); }
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
			setState(263);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				_localctx = new CircleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				match(OPEN);
				setState(69);
				match(NAME_CIRCLE);
				setState(71); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(70);
					attribute();
					}
					}
					setState(73); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(75);
				match(SLASH_CLOSE);
				}
				break;
			case 2:
				_localctx = new RectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(OPEN);
				setState(78);
				match(NAME_RECT);
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(79);
					attribute();
					}
					}
					setState(82); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(84);
				match(SLASH_CLOSE);
				}
				break;
			case 3:
				_localctx = new EllipseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(OPEN);
				setState(87);
				match(NAME_ELLIPSE);
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(88);
					attribute();
					}
					}
					setState(91); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(93);
				match(SLASH_CLOSE);
				}
				break;
			case 4:
				_localctx = new LineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(95);
				match(OPEN);
				setState(96);
				match(NAME_LINE);
				setState(98); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(97);
					attribute();
					}
					}
					setState(100); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(102);
				match(SLASH_CLOSE);
				}
				break;
			case 5:
				_localctx = new PolygonContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				match(OPEN);
				setState(105);
				match(NAME_POLYGON);
				setState(107); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(106);
					attribute();
					}
					}
					setState(109); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(111);
				match(SLASH_CLOSE);
				}
				break;
			case 6:
				_localctx = new PolylineContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(113);
				match(OPEN);
				setState(114);
				match(NAME_POLYLINE);
				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(115);
					attribute();
					}
					}
					setState(118); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(120);
				match(SLASH_CLOSE);
				}
				break;
			case 7:
				_localctx = new PathContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(122);
				match(OPEN);
				setState(123);
				match(NAME_PATH);
				setState(125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(124);
					attribute();
					}
					}
					setState(127); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(129);
				match(SLASH_CLOSE);
				}
				break;
			case 8:
				_localctx = new TextContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(131);
				match(OPEN);
				setState(132);
				match(NAME_TEXT);
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(133);
					attribute();
					}
					}
					setState(136); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(138);
				match(CLOSE);
				setState(139);
				match(TEXT);
				setState(140);
				match(OPEN);
				setState(141);
				match(SLASH);
				setState(142);
				match(NAME_TEXT);
				setState(143);
				match(CLOSE);
				}
				break;
			case 9:
				_localctx = new GContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(145);
				match(OPEN);
				setState(146);
				match(NAME_G);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==PATH_ATTRIBUTE) {
					{
					{
					setState(147);
					attribute();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(153);
				match(CLOSE);
				setState(155); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(154);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(157); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(159);
				match(OPEN);
				setState(160);
				match(SLASH);
				setState(161);
				match(NAME_G);
				setState(162);
				match(CLOSE);
				}
				break;
			case 10:
				_localctx = new FilterContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(164);
				match(OPEN);
				setState(165);
				match(NAME_FILTER);
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
			case 11:
				_localctx = new StopContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(173);
				match(OPEN);
				setState(174);
				match(NAME_STOP);
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(175);
					attribute();
					}
					}
					setState(178); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(180);
				match(SLASH_CLOSE);
				}
				break;
			case 12:
				_localctx = new DefsContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(182);
				match(OPEN);
				setState(183);
				match(NAME_DEFS);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==PATH_ATTRIBUTE) {
					{
					{
					setState(184);
					attribute();
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				match(CLOSE);
				setState(192); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(191);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(194); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(196);
				match(OPEN);
				setState(197);
				match(SLASH);
				setState(198);
				match(NAME_DEFS);
				setState(199);
				match(CLOSE);
				}
				break;
			case 13:
				_localctx = new LinearGradientContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(201);
				match(OPEN);
				setState(202);
				match(NAME_LINEARGRADIENT);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==PATH_ATTRIBUTE) {
					{
					{
					setState(203);
					attribute();
					}
					}
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
				match(CLOSE);
				setState(211); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(210);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(213); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(215);
				match(OPEN);
				setState(216);
				match(SLASH);
				setState(217);
				match(NAME_LINEARGRADIENT);
				setState(218);
				match(CLOSE);
				}
				break;
			case 14:
				_localctx = new RadialGradientContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(220);
				match(OPEN);
				setState(221);
				match(NAME_RADIALGRADIENT);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==PATH_ATTRIBUTE) {
					{
					{
					setState(222);
					attribute();
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228);
				match(CLOSE);
				setState(230); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(229);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(232); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(234);
				match(OPEN);
				setState(235);
				match(SLASH);
				setState(236);
				match(NAME_RADIALGRADIENT);
				setState(237);
				match(CLOSE);
				}
				break;
			case 15:
				_localctx = new UnnamedElementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(239);
				match(OPEN);
				setState(240);
				match(NAME);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==PATH_ATTRIBUTE) {
					{
					{
					setState(241);
					attribute();
					}
					}
					setState(246);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN) {
					{
					{
					setState(247);
					element();
					}
					}
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(253);
				match(CLOSE);
				}
				break;
			case 16:
				_localctx = new UnnamedElement_SelfCloseContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(254);
				match(OPEN);
				setState(255);
				match(NAME);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==PATH_ATTRIBUTE) {
					{
					{
					setState(256);
					attribute();
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(262);
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
			setState(276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(NAME);
				setState(266);
				match(EQUALS);
				setState(267);
				match(STRING);
				}
				break;
			case PATH_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				match(PATH_ATTRIBUTE);
				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(269);
					path_elements();
					}
					}
					setState(272); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BLANK) | (1L << PATH_M_REL) | (1L << PATH_M) | (1L << PATH_L_REL) | (1L << PATH_L) | (1L << PATH_H_REL) | (1L << PATH_H) | (1L << PATH_V_REL) | (1L << PATH_V) | (1L << PATH_Z_REL) | (1L << PATH_Z) | (1L << PATH_C_REL) | (1L << PATH_C) | (1L << PATH_S_REL) | (1L << PATH_S) | (1L << PATH_Q_REL) | (1L << PATH_Q) | (1L << PATH_T_REL) | (1L << PATH_T) | (1L << PATH_A_REL) | (1L << PATH_A))) != 0) );
				setState(274);
				match(PATHATTRIBUTECLOSE);
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
		public Path_element_moveto_relContext path_element_moveto_rel() {
			return getRuleContext(Path_element_moveto_relContext.class,0);
		}
		public Path_element_movetoContext path_element_moveto() {
			return getRuleContext(Path_element_movetoContext.class,0);
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
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				path_element_moveto_rel();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				path_element_moveto();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				path_element_lineto_rel();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(281);
				path_element_lineto();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(282);
				path_element_horizontalline_rel();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				path_element_horizontalline();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(284);
				path_element_verticalline_rel();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(285);
				path_element_verticalline();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(286);
				path_element_close();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(287);
				path_element_cubiccurve_rel();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(288);
				path_element_cubiccurve();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(289);
				path_element_cubicreflectcurve_rel();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(290);
				path_element_cubicreflectcurve();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(291);
				path_element_quadraticcurve_rel();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(292);
				path_element_quadraticcurve();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(293);
				path_element_quadraticreflectcurve_rel();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(294);
				path_element_quadraticreflectcurve();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(295);
				path_element_arc_rel();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(296);
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

	public static class NumberContext extends ParserRuleContext {
		public Unsigned_numberContext unsigned_number() {
			return getRuleContext(Unsigned_numberContext.class,0);
		}
		public TerminalNode UNARY_OPERATOR() { return getToken(SVGParser.UNARY_OPERATOR, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNARY_OPERATOR) {
				{
				setState(299);
				match(UNARY_OPERATOR);
				}
			}

			setState(302);
			unsigned_number();
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

	public static class Unsigned_numberContext extends ParserRuleContext {
		public TerminalNode UNSIGNED_INT() { return getToken(SVGParser.UNSIGNED_INT, 0); }
		public TerminalNode UNSIGNED_FLOAT() { return getToken(SVGParser.UNSIGNED_FLOAT, 0); }
		public Unsigned_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsigned_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterUnsigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitUnsigned_number(this);
		}
	}

	public final Unsigned_numberContext unsigned_number() throws RecognitionException {
		Unsigned_numberContext _localctx = new Unsigned_numberContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unsigned_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			_la = _input.LA(1);
			if ( !(_la==UNSIGNED_INT || _la==UNSIGNED_FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 12, RULE_path_element_moveto_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(306);
				match(BLANK);
				}
				}
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(312);
			match(PATH_M_REL);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(313);
				match(BLANK);
				}
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(319);
			number();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(320);
				match(BLANK);
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
			number();
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 14, RULE_path_element_moveto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(328);
				match(BLANK);
				}
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(334);
			match(PATH_M);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(335);
				match(BLANK);
				}
				}
				setState(340);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(341);
			number();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(342);
				match(BLANK);
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
			number();
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 16, RULE_path_element_lineto_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(350);
				match(BLANK);
				}
				}
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(356);
			match(PATH_L_REL);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(357);
				match(BLANK);
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			number();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(364);
				match(BLANK);
				}
				}
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(370);
			number();
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 18, RULE_path_element_lineto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(372);
				match(BLANK);
				}
				}
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(378);
			match(PATH_L);
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(379);
				match(BLANK);
				}
				}
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(385);
			number();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(386);
				match(BLANK);
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			number();
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
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
		enterRule(_localctx, 20, RULE_path_element_horizontalline_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(394);
				match(BLANK);
				}
				}
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(400);
			match(PATH_H_REL);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(401);
				match(BLANK);
				}
				}
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(407);
			number();
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
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
		enterRule(_localctx, 22, RULE_path_element_horizontalline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(409);
				match(BLANK);
				}
				}
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(415);
			match(PATH_H);
			setState(419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(416);
				match(BLANK);
				}
				}
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(422);
			number();
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
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
		enterRule(_localctx, 24, RULE_path_element_verticalline_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(424);
				match(BLANK);
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(430);
			match(PATH_V_REL);
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(431);
				match(BLANK);
				}
				}
				setState(436);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(437);
			number();
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
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
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
		enterRule(_localctx, 26, RULE_path_element_verticalline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(439);
				match(BLANK);
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(445);
			match(PATH_V);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(446);
				match(BLANK);
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(452);
			number();
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
		enterRule(_localctx, 28, RULE_path_element_close);
		int _la;
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
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
				match(PATH_Z_REL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 30, RULE_path_element_cubiccurve_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(470);
				match(BLANK);
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(476);
			match(PATH_C_REL);
			setState(480);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(477);
				match(BLANK);
				}
				}
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(483);
			number();
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(484);
				match(BLANK);
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(490);
			number();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(491);
				match(BLANK);
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(497);
			number();
			setState(501);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(498);
				match(BLANK);
				}
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(504);
			number();
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(505);
				match(BLANK);
				}
				}
				setState(510);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(511);
			number();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(512);
				match(BLANK);
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(518);
			number();
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 32, RULE_path_element_cubiccurve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(520);
				match(BLANK);
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(526);
			match(PATH_C);
			setState(530);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(527);
				match(BLANK);
				}
				}
				setState(532);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(533);
			number();
			setState(537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(534);
				match(BLANK);
				}
				}
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(540);
			number();
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(541);
				match(BLANK);
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(547);
			number();
			setState(551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(548);
				match(BLANK);
				}
				}
				setState(553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(554);
			number();
			setState(558);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(555);
				match(BLANK);
				}
				}
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(561);
			number();
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(562);
				match(BLANK);
				}
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(568);
			number();
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 34, RULE_path_element_cubicreflectcurve_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(570);
				match(BLANK);
				}
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(576);
			match(PATH_S_REL);
			setState(580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(577);
				match(BLANK);
				}
				}
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(583);
			number();
			setState(587);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(584);
				match(BLANK);
				}
				}
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(590);
			number();
			setState(594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(591);
				match(BLANK);
				}
				}
				setState(596);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(597);
			number();
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(598);
				match(BLANK);
				}
				}
				setState(603);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(604);
			number();
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 36, RULE_path_element_cubicreflectcurve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(606);
				match(BLANK);
				}
				}
				setState(611);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(612);
			match(PATH_S);
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(613);
				match(BLANK);
				}
				}
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(619);
			number();
			setState(623);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(620);
				match(BLANK);
				}
				}
				setState(625);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(626);
			number();
			setState(630);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(627);
				match(BLANK);
				}
				}
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(633);
			number();
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(634);
				match(BLANK);
				}
				}
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(640);
			number();
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 38, RULE_path_element_quadraticcurve_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(642);
				match(BLANK);
				}
				}
				setState(647);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(648);
			match(PATH_Q_REL);
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(649);
				match(BLANK);
				}
				}
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(655);
			number();
			setState(659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(656);
				match(BLANK);
				}
				}
				setState(661);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(662);
			number();
			setState(666);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(663);
				match(BLANK);
				}
				}
				setState(668);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(669);
			number();
			setState(673);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(670);
				match(BLANK);
				}
				}
				setState(675);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(676);
			number();
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 40, RULE_path_element_quadraticcurve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(678);
				match(BLANK);
				}
				}
				setState(683);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(684);
			match(PATH_Q);
			setState(688);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(685);
				match(BLANK);
				}
				}
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(691);
			number();
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(692);
				match(BLANK);
				}
				}
				setState(697);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(698);
			number();
			setState(702);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(699);
				match(BLANK);
				}
				}
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(705);
			number();
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(706);
				match(BLANK);
				}
				}
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(712);
			number();
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 42, RULE_path_element_quadraticreflectcurve_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(714);
				match(BLANK);
				}
				}
				setState(719);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(720);
			match(PATH_T_REL);
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(721);
				match(BLANK);
				}
				}
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(727);
			number();
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(728);
				match(BLANK);
				}
				}
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(734);
			number();
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 44, RULE_path_element_quadraticreflectcurve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(736);
				match(BLANK);
				}
				}
				setState(741);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(742);
			match(PATH_T);
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(743);
				match(BLANK);
				}
				}
				setState(748);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(749);
			number();
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(750);
				match(BLANK);
				}
				}
				setState(755);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(756);
			number();
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 46, RULE_path_element_arc_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(758);
				match(BLANK);
				}
				}
				setState(763);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(764);
			match(PATH_A_REL);
			setState(768);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(765);
				match(BLANK);
				}
				}
				setState(770);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(771);
			number();
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(772);
				match(BLANK);
				}
				}
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(778);
			number();
			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(779);
				match(BLANK);
				}
				}
				setState(784);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(785);
			number();
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(786);
				match(BLANK);
				}
				}
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(792);
			number();
			setState(796);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(793);
				match(BLANK);
				}
				}
				setState(798);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(799);
			number();
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(800);
				match(BLANK);
				}
				}
				setState(805);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(806);
			number();
			setState(810);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(807);
				match(BLANK);
				}
				}
				setState(812);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(813);
			number();
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
		enterRule(_localctx, 48, RULE_path_element_arc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(815);
				match(BLANK);
				}
				}
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(821);
			match(PATH_A);
			setState(825);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(822);
				match(BLANK);
				}
				}
				setState(827);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(828);
			number();
			setState(832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(829);
				match(BLANK);
				}
				}
				setState(834);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(835);
			number();
			setState(839);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(836);
				match(BLANK);
				}
				}
				setState(841);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(842);
			number();
			setState(846);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(843);
				match(BLANK);
				}
				}
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(849);
			number();
			setState(853);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(850);
				match(BLANK);
				}
				}
				setState(855);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(856);
			number();
			setState(860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(857);
				match(BLANK);
				}
				}
				setState(862);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(863);
			number();
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(864);
				match(BLANK);
				}
				}
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(870);
			number();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u036b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\6\28\n\2\r\2\16\29\3\2\3\2\6\2>\n\2\r\2\16\2?\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\6\3J\n\3\r\3\16\3K\3\3\3\3\3\3\3\3\3\3"+
		"\6\3S\n\3\r\3\16\3T\3\3\3\3\3\3\3\3\3\3\6\3\\\n\3\r\3\16\3]\3\3\3\3\3"+
		"\3\3\3\3\3\6\3e\n\3\r\3\16\3f\3\3\3\3\3\3\3\3\3\3\6\3n\n\3\r\3\16\3o\3"+
		"\3\3\3\3\3\3\3\3\3\6\3w\n\3\r\3\16\3x\3\3\3\3\3\3\3\3\3\3\6\3\u0080\n"+
		"\3\r\3\16\3\u0081\3\3\3\3\3\3\3\3\3\3\6\3\u0089\n\3\r\3\16\3\u008a\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0097\n\3\f\3\16\3\u009a\13\3"+
		"\3\3\3\3\6\3\u009e\n\3\r\3\16\3\u009f\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\6\3\u00aa\n\3\r\3\16\3\u00ab\3\3\3\3\3\3\3\3\3\3\6\3\u00b3\n\3\r\3\16"+
		"\3\u00b4\3\3\3\3\3\3\3\3\3\3\7\3\u00bc\n\3\f\3\16\3\u00bf\13\3\3\3\3\3"+
		"\6\3\u00c3\n\3\r\3\16\3\u00c4\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00cf"+
		"\n\3\f\3\16\3\u00d2\13\3\3\3\3\3\6\3\u00d6\n\3\r\3\16\3\u00d7\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00e2\n\3\f\3\16\3\u00e5\13\3\3\3\3\3\6\3"+
		"\u00e9\n\3\r\3\16\3\u00ea\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00f5\n"+
		"\3\f\3\16\3\u00f8\13\3\3\3\7\3\u00fb\n\3\f\3\16\3\u00fe\13\3\3\3\3\3\3"+
		"\3\3\3\7\3\u0104\n\3\f\3\16\3\u0107\13\3\3\3\5\3\u010a\n\3\3\4\3\4\3\4"+
		"\3\4\3\4\6\4\u0111\n\4\r\4\16\4\u0112\3\4\3\4\5\4\u0117\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"\u012c\n\5\3\6\5\6\u012f\n\6\3\6\3\6\3\7\3\7\3\b\7\b\u0136\n\b\f\b\16"+
		"\b\u0139\13\b\3\b\3\b\7\b\u013d\n\b\f\b\16\b\u0140\13\b\3\b\3\b\7\b\u0144"+
		"\n\b\f\b\16\b\u0147\13\b\3\b\3\b\3\t\7\t\u014c\n\t\f\t\16\t\u014f\13\t"+
		"\3\t\3\t\7\t\u0153\n\t\f\t\16\t\u0156\13\t\3\t\3\t\7\t\u015a\n\t\f\t\16"+
		"\t\u015d\13\t\3\t\3\t\3\n\7\n\u0162\n\n\f\n\16\n\u0165\13\n\3\n\3\n\7"+
		"\n\u0169\n\n\f\n\16\n\u016c\13\n\3\n\3\n\7\n\u0170\n\n\f\n\16\n\u0173"+
		"\13\n\3\n\3\n\3\13\7\13\u0178\n\13\f\13\16\13\u017b\13\13\3\13\3\13\7"+
		"\13\u017f\n\13\f\13\16\13\u0182\13\13\3\13\3\13\7\13\u0186\n\13\f\13\16"+
		"\13\u0189\13\13\3\13\3\13\3\f\7\f\u018e\n\f\f\f\16\f\u0191\13\f\3\f\3"+
		"\f\7\f\u0195\n\f\f\f\16\f\u0198\13\f\3\f\3\f\3\r\7\r\u019d\n\r\f\r\16"+
		"\r\u01a0\13\r\3\r\3\r\7\r\u01a4\n\r\f\r\16\r\u01a7\13\r\3\r\3\r\3\16\7"+
		"\16\u01ac\n\16\f\16\16\16\u01af\13\16\3\16\3\16\7\16\u01b3\n\16\f\16\16"+
		"\16\u01b6\13\16\3\16\3\16\3\17\7\17\u01bb\n\17\f\17\16\17\u01be\13\17"+
		"\3\17\3\17\7\17\u01c2\n\17\f\17\16\17\u01c5\13\17\3\17\3\17\3\20\7\20"+
		"\u01ca\n\20\f\20\16\20\u01cd\13\20\3\20\3\20\7\20\u01d1\n\20\f\20\16\20"+
		"\u01d4\13\20\3\20\5\20\u01d7\n\20\3\21\7\21\u01da\n\21\f\21\16\21\u01dd"+
		"\13\21\3\21\3\21\7\21\u01e1\n\21\f\21\16\21\u01e4\13\21\3\21\3\21\7\21"+
		"\u01e8\n\21\f\21\16\21\u01eb\13\21\3\21\3\21\7\21\u01ef\n\21\f\21\16\21"+
		"\u01f2\13\21\3\21\3\21\7\21\u01f6\n\21\f\21\16\21\u01f9\13\21\3\21\3\21"+
		"\7\21\u01fd\n\21\f\21\16\21\u0200\13\21\3\21\3\21\7\21\u0204\n\21\f\21"+
		"\16\21\u0207\13\21\3\21\3\21\3\22\7\22\u020c\n\22\f\22\16\22\u020f\13"+
		"\22\3\22\3\22\7\22\u0213\n\22\f\22\16\22\u0216\13\22\3\22\3\22\7\22\u021a"+
		"\n\22\f\22\16\22\u021d\13\22\3\22\3\22\7\22\u0221\n\22\f\22\16\22\u0224"+
		"\13\22\3\22\3\22\7\22\u0228\n\22\f\22\16\22\u022b\13\22\3\22\3\22\7\22"+
		"\u022f\n\22\f\22\16\22\u0232\13\22\3\22\3\22\7\22\u0236\n\22\f\22\16\22"+
		"\u0239\13\22\3\22\3\22\3\23\7\23\u023e\n\23\f\23\16\23\u0241\13\23\3\23"+
		"\3\23\7\23\u0245\n\23\f\23\16\23\u0248\13\23\3\23\3\23\7\23\u024c\n\23"+
		"\f\23\16\23\u024f\13\23\3\23\3\23\7\23\u0253\n\23\f\23\16\23\u0256\13"+
		"\23\3\23\3\23\7\23\u025a\n\23\f\23\16\23\u025d\13\23\3\23\3\23\3\24\7"+
		"\24\u0262\n\24\f\24\16\24\u0265\13\24\3\24\3\24\7\24\u0269\n\24\f\24\16"+
		"\24\u026c\13\24\3\24\3\24\7\24\u0270\n\24\f\24\16\24\u0273\13\24\3\24"+
		"\3\24\7\24\u0277\n\24\f\24\16\24\u027a\13\24\3\24\3\24\7\24\u027e\n\24"+
		"\f\24\16\24\u0281\13\24\3\24\3\24\3\25\7\25\u0286\n\25\f\25\16\25\u0289"+
		"\13\25\3\25\3\25\7\25\u028d\n\25\f\25\16\25\u0290\13\25\3\25\3\25\7\25"+
		"\u0294\n\25\f\25\16\25\u0297\13\25\3\25\3\25\7\25\u029b\n\25\f\25\16\25"+
		"\u029e\13\25\3\25\3\25\7\25\u02a2\n\25\f\25\16\25\u02a5\13\25\3\25\3\25"+
		"\3\26\7\26\u02aa\n\26\f\26\16\26\u02ad\13\26\3\26\3\26\7\26\u02b1\n\26"+
		"\f\26\16\26\u02b4\13\26\3\26\3\26\7\26\u02b8\n\26\f\26\16\26\u02bb\13"+
		"\26\3\26\3\26\7\26\u02bf\n\26\f\26\16\26\u02c2\13\26\3\26\3\26\7\26\u02c6"+
		"\n\26\f\26\16\26\u02c9\13\26\3\26\3\26\3\27\7\27\u02ce\n\27\f\27\16\27"+
		"\u02d1\13\27\3\27\3\27\7\27\u02d5\n\27\f\27\16\27\u02d8\13\27\3\27\3\27"+
		"\7\27\u02dc\n\27\f\27\16\27\u02df\13\27\3\27\3\27\3\30\7\30\u02e4\n\30"+
		"\f\30\16\30\u02e7\13\30\3\30\3\30\7\30\u02eb\n\30\f\30\16\30\u02ee\13"+
		"\30\3\30\3\30\7\30\u02f2\n\30\f\30\16\30\u02f5\13\30\3\30\3\30\3\31\7"+
		"\31\u02fa\n\31\f\31\16\31\u02fd\13\31\3\31\3\31\7\31\u0301\n\31\f\31\16"+
		"\31\u0304\13\31\3\31\3\31\7\31\u0308\n\31\f\31\16\31\u030b\13\31\3\31"+
		"\3\31\7\31\u030f\n\31\f\31\16\31\u0312\13\31\3\31\3\31\7\31\u0316\n\31"+
		"\f\31\16\31\u0319\13\31\3\31\3\31\7\31\u031d\n\31\f\31\16\31\u0320\13"+
		"\31\3\31\3\31\7\31\u0324\n\31\f\31\16\31\u0327\13\31\3\31\3\31\7\31\u032b"+
		"\n\31\f\31\16\31\u032e\13\31\3\31\3\31\3\32\7\32\u0333\n\32\f\32\16\32"+
		"\u0336\13\32\3\32\3\32\7\32\u033a\n\32\f\32\16\32\u033d\13\32\3\32\3\32"+
		"\7\32\u0341\n\32\f\32\16\32\u0344\13\32\3\32\3\32\7\32\u0348\n\32\f\32"+
		"\16\32\u034b\13\32\3\32\3\32\7\32\u034f\n\32\f\32\16\32\u0352\13\32\3"+
		"\32\3\32\7\32\u0356\n\32\f\32\16\32\u0359\13\32\3\32\3\32\7\32\u035d\n"+
		"\32\f\32\16\32\u0360\13\32\3\32\3\32\7\32\u0364\n\32\f\32\16\32\u0367"+
		"\13\32\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\2\3\3\29:\2\u03db\2\64\3\2\2\2\4\u0109\3\2\2\2\6\u0116\3"+
		"\2\2\2\b\u012b\3\2\2\2\n\u012e\3\2\2\2\f\u0132\3\2\2\2\16\u0137\3\2\2"+
		"\2\20\u014d\3\2\2\2\22\u0163\3\2\2\2\24\u0179\3\2\2\2\26\u018f\3\2\2\2"+
		"\30\u019e\3\2\2\2\32\u01ad\3\2\2\2\34\u01bc\3\2\2\2\36\u01d6\3\2\2\2 "+
		"\u01db\3\2\2\2\"\u020d\3\2\2\2$\u023f\3\2\2\2&\u0263\3\2\2\2(\u0287\3"+
		"\2\2\2*\u02ab\3\2\2\2,\u02cf\3\2\2\2.\u02e5\3\2\2\2\60\u02fb\3\2\2\2\62"+
		"\u0334\3\2\2\2\64\65\7\7\2\2\65\67\7\t\2\2\668\5\6\4\2\67\66\3\2\2\28"+
		"9\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;=\7\31\2\2<>\5\4\3\2=<\3\2\2"+
		"\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\7\2\2BC\7\33\2\2CD\7\t"+
		"\2\2DE\7\31\2\2E\3\3\2\2\2FG\7\7\2\2GI\7\n\2\2HJ\5\6\4\2IH\3\2\2\2JK\3"+
		"\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\32\2\2N\u010a\3\2\2\2OP\7\7\2"+
		"\2PR\7\13\2\2QS\5\6\4\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3\2"+
		"\2\2VW\7\32\2\2W\u010a\3\2\2\2XY\7\7\2\2Y[\7\f\2\2Z\\\5\6\4\2[Z\3\2\2"+
		"\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\32\2\2`\u010a\3\2\2\2"+
		"ab\7\7\2\2bd\7\r\2\2ce\5\6\4\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2"+
		"gh\3\2\2\2hi\7\32\2\2i\u010a\3\2\2\2jk\7\7\2\2km\7\16\2\2ln\5\6\4\2ml"+
		"\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\32\2\2r\u010a\3\2"+
		"\2\2st\7\7\2\2tv\7\17\2\2uw\5\6\4\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3"+
		"\2\2\2yz\3\2\2\2z{\7\32\2\2{\u010a\3\2\2\2|}\7\7\2\2}\177\7\20\2\2~\u0080"+
		"\5\6\4\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\32\2\2\u0084\u010a\3\2\2\2"+
		"\u0085\u0086\7\7\2\2\u0086\u0088\7\21\2\2\u0087\u0089\5\6\4\2\u0088\u0087"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008d\7\31\2\2\u008d\u008e\7\b\2\2\u008e\u008f\7"+
		"\7\2\2\u008f\u0090\7\33\2\2\u0090\u0091\7\21\2\2\u0091\u0092\7\31\2\2"+
		"\u0092\u010a\3\2\2\2\u0093\u0094\7\7\2\2\u0094\u0098\7\22\2\2\u0095\u0097"+
		"\5\6\4\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009d\7\31"+
		"\2\2\u009c\u009e\5\4\3\2\u009d\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\7\7"+
		"\2\2\u00a2\u00a3\7\33\2\2\u00a3\u00a4\7\22\2\2\u00a4\u00a5\7\31\2\2\u00a5"+
		"\u010a\3\2\2\2\u00a6\u00a7\7\7\2\2\u00a7\u00a9\7\24\2\2\u00a8\u00aa\5"+
		"\6\4\2\u00a9\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab"+
		"\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\32\2\2\u00ae\u010a\3"+
		"\2\2\2\u00af\u00b0\7\7\2\2\u00b0\u00b2\7\27\2\2\u00b1\u00b3\5\6\4\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\32\2\2\u00b7\u010a\3\2\2\2\u00b8"+
		"\u00b9\7\7\2\2\u00b9\u00bd\7\23\2\2\u00ba\u00bc\5\6\4\2\u00bb\u00ba\3"+
		"\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\7\31\2\2\u00c1\u00c3\5"+
		"\4\3\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c7\7\7\2\2\u00c7\u00c8\7\33"+
		"\2\2\u00c8\u00c9\7\23\2\2\u00c9\u00ca\7\31\2\2\u00ca\u010a\3\2\2\2\u00cb"+
		"\u00cc\7\7\2\2\u00cc\u00d0\7\25\2\2\u00cd\u00cf\5\6\4\2\u00ce\u00cd\3"+
		"\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\7\31\2\2\u00d4\u00d6\5"+
		"\4\3\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\7\7\2\2\u00da\u00db\7\33"+
		"\2\2\u00db\u00dc\7\25\2\2\u00dc\u00dd\7\31\2\2\u00dd\u010a\3\2\2\2\u00de"+
		"\u00df\7\7\2\2\u00df\u00e3\7\26\2\2\u00e0\u00e2\5\6\4\2\u00e1\u00e0\3"+
		"\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e6\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\7\31\2\2\u00e7\u00e9\5"+
		"\4\3\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7\7\2\2\u00ed\u00ee\7\33"+
		"\2\2\u00ee\u00ef\7\26\2\2\u00ef\u00f0\7\31\2\2\u00f0\u010a\3\2\2\2\u00f1"+
		"\u00f2\7\7\2\2\u00f2\u00f6\7\30\2\2\u00f3\u00f5\5\6\4\2\u00f4\u00f3\3"+
		"\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\u00fc\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fb\5\4\3\2\u00fa\u00f9\3\2"+
		"\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd"+
		"\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u010a\7\31\2\2\u0100\u0101\7"+
		"\7\2\2\u0101\u0105\7\30\2\2\u0102\u0104\5\6\4\2\u0103\u0102\3\2\2\2\u0104"+
		"\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0108\3\2"+
		"\2\2\u0107\u0105\3\2\2\2\u0108\u010a\7\32\2\2\u0109F\3\2\2\2\u0109O\3"+
		"\2\2\2\u0109X\3\2\2\2\u0109a\3\2\2\2\u0109j\3\2\2\2\u0109s\3\2\2\2\u0109"+
		"|\3\2\2\2\u0109\u0085\3\2\2\2\u0109\u0093\3\2\2\2\u0109\u00a6\3\2\2\2"+
		"\u0109\u00af\3\2\2\2\u0109\u00b8\3\2\2\2\u0109\u00cb\3\2\2\2\u0109\u00de"+
		"\3\2\2\2\u0109\u00f1\3\2\2\2\u0109\u0100\3\2\2\2\u010a\5\3\2\2\2\u010b"+
		"\u010c\7\30\2\2\u010c\u010d\7\34\2\2\u010d\u0117\7\36\2\2\u010e\u0110"+
		"\7\35\2\2\u010f\u0111\5\b\5\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2"+
		"\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114\u0115"+
		"\7!\2\2\u0115\u0117\3\2\2\2\u0116\u010b\3\2\2\2\u0116\u010e\3\2\2\2\u0117"+
		"\7\3\2\2\2\u0118\u012c\5\16\b\2\u0119\u012c\5\20\t\2\u011a\u012c\5\22"+
		"\n\2\u011b\u012c\5\24\13\2\u011c\u012c\5\26\f\2\u011d\u012c\5\30\r\2\u011e"+
		"\u012c\5\32\16\2\u011f\u012c\5\34\17\2\u0120\u012c\5\36\20\2\u0121\u012c"+
		"\5 \21\2\u0122\u012c\5\"\22\2\u0123\u012c\5$\23\2\u0124\u012c\5&\24\2"+
		"\u0125\u012c\5(\25\2\u0126\u012c\5*\26\2\u0127\u012c\5,\27\2\u0128\u012c"+
		"\5.\30\2\u0129\u012c\5\60\31\2\u012a\u012c\5\62\32\2\u012b\u0118\3\2\2"+
		"\2\u012b\u0119\3\2\2\2\u012b\u011a\3\2\2\2\u012b\u011b\3\2\2\2\u012b\u011c"+
		"\3\2\2\2\u012b\u011d\3\2\2\2\u012b\u011e\3\2\2\2\u012b\u011f\3\2\2\2\u012b"+
		"\u0120\3\2\2\2\u012b\u0121\3\2\2\2\u012b\u0122\3\2\2\2\u012b\u0123\3\2"+
		"\2\2\u012b\u0124\3\2\2\2\u012b\u0125\3\2\2\2\u012b\u0126\3\2\2\2\u012b"+
		"\u0127\3\2\2\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2"+
		"\2\2\u012c\t\3\2\2\2\u012d\u012f\78\2\2\u012e\u012d\3\2\2\2\u012e\u012f"+
		"\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\5\f\7\2\u0131\13\3\2\2\2\u0132"+
		"\u0133\t\2\2\2\u0133\r\3\2\2\2\u0134\u0136\7\"\2\2\u0135\u0134\3\2\2\2"+
		"\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013e\7#\2\2\u013b\u013d\7\"\2\2\u013c"+
		"\u013b\3\2\2\2\u013d\u0140\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0141\3\2\2\2\u0140\u013e\3\2\2\2\u0141\u0145\5\n\6\2\u0142"+
		"\u0144\7\"\2\2\u0143\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2"+
		"\2\2\u0145\u0146\3\2\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148"+
		"\u0149\5\n\6\2\u0149\17\3\2\2\2\u014a\u014c\7\"\2\2\u014b\u014a\3\2\2"+
		"\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150"+
		"\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0154\7$\2\2\u0151\u0153\7\"\2\2\u0152"+
		"\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155\3\2"+
		"\2\2\u0155\u0157\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u015b\5\n\6\2\u0158"+
		"\u015a\7\"\2\2\u0159\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2"+
		"\2\2\u015b\u015c\3\2\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e"+
		"\u015f\5\n\6\2\u015f\21\3\2\2\2\u0160\u0162\7\"\2\2\u0161\u0160\3\2\2"+
		"\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166"+
		"\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u016a\7%\2\2\u0167\u0169\7\"\2\2\u0168"+
		"\u0167\3\2\2\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2"+
		"\2\2\u016b\u016d\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0171\5\n\6\2\u016e"+
		"\u0170\7\"\2\2\u016f\u016e\3\2\2\2\u0170\u0173\3\2\2\2\u0171\u016f\3\2"+
		"\2\2\u0171\u0172\3\2\2\2\u0172\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174"+
		"\u0175\5\n\6\2\u0175\23\3\2\2\2\u0176\u0178\7\"\2\2\u0177\u0176\3\2\2"+
		"\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c"+
		"\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u0180\7&\2\2\u017d\u017f\7\"\2\2\u017e"+
		"\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0187\5\n\6\2\u0184"+
		"\u0186\7\"\2\2\u0185\u0184\3\2\2\2\u0186\u0189\3\2\2\2\u0187\u0185\3\2"+
		"\2\2\u0187\u0188\3\2\2\2\u0188\u018a\3\2\2\2\u0189\u0187\3\2\2\2\u018a"+
		"\u018b\5\n\6\2\u018b\25\3\2\2\2\u018c\u018e\7\"\2\2\u018d\u018c\3\2\2"+
		"\2\u018e\u0191\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192"+
		"\3\2\2\2\u0191\u018f\3\2\2\2\u0192\u0196\7\'\2\2\u0193\u0195\7\"\2\2\u0194"+
		"\u0193\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0199\3\2\2\2\u0198\u0196\3\2\2\2\u0199\u019a\5\n\6\2\u019a"+
		"\27\3\2\2\2\u019b\u019d\7\"\2\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2"+
		"\2\u019e\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e"+
		"\3\2\2\2\u01a1\u01a5\7(\2\2\u01a2\u01a4\7\"\2\2\u01a3\u01a2\3\2\2\2\u01a4"+
		"\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a8\3\2"+
		"\2\2\u01a7\u01a5\3\2\2\2\u01a8\u01a9\5\n\6\2\u01a9\31\3\2\2\2\u01aa\u01ac"+
		"\7\"\2\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad"+
		"\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b4\7)"+
		"\2\2\u01b1\u01b3\7\"\2\2\u01b2\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4"+
		"\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2"+
		"\2\2\u01b7\u01b8\5\n\6\2\u01b8\33\3\2\2\2\u01b9\u01bb\7\"\2\2\u01ba\u01b9"+
		"\3\2\2\2\u01bb\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd"+
		"\u01bf\3\2\2\2\u01be\u01bc\3\2\2\2\u01bf\u01c3\7*\2\2\u01c0\u01c2\7\""+
		"\2\2\u01c1\u01c0\3\2\2\2\u01c2\u01c5\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c3"+
		"\u01c4\3\2\2\2\u01c4\u01c6\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c6\u01c7\5\n"+
		"\6\2\u01c7\35\3\2\2\2\u01c8\u01ca\7\"\2\2\u01c9\u01c8\3\2\2\2\u01ca\u01cd"+
		"\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01ce\3\2\2\2\u01cd"+
		"\u01cb\3\2\2\2\u01ce\u01d7\7+\2\2\u01cf\u01d1\7\"\2\2\u01d0\u01cf\3\2"+
		"\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3"+
		"\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d7\7,\2\2\u01d6\u01cb\3\2"+
		"\2\2\u01d6\u01d2\3\2\2\2\u01d7\37\3\2\2\2\u01d8\u01da\7\"\2\2\u01d9\u01d8"+
		"\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc"+
		"\u01de\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01e2\7-\2\2\u01df\u01e1\7\""+
		"\2\2\u01e0\u01df\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2"+
		"\u01e3\3\2\2\2\u01e3\u01e5\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e9\5\n"+
		"\6\2\u01e6\u01e8\7\"\2\2\u01e7\u01e6\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9"+
		"\u01e7\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea\u01ec\3\2\2\2\u01eb\u01e9\3\2"+
		"\2\2\u01ec\u01f0\5\n\6\2\u01ed\u01ef\7\"\2\2\u01ee\u01ed\3\2\2\2\u01ef"+
		"\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f3\3\2"+
		"\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f7\5\n\6\2\u01f4\u01f6\7\"\2\2\u01f5"+
		"\u01f4\3\2\2\2\u01f6\u01f9\3\2\2\2\u01f7\u01f5\3\2\2\2\u01f7\u01f8\3\2"+
		"\2\2\u01f8\u01fa\3\2\2\2\u01f9\u01f7\3\2\2\2\u01fa\u01fe\5\n\6\2\u01fb"+
		"\u01fd\7\"\2\2\u01fc\u01fb\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2"+
		"\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0201\3\2\2\2\u0200\u01fe\3\2\2\2\u0201"+
		"\u0205\5\n\6\2\u0202\u0204\7\"\2\2\u0203\u0202\3\2\2\2\u0204\u0207\3\2"+
		"\2\2\u0205\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0208\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0208\u0209\5\n\6\2\u0209!\3\2\2\2\u020a\u020c\7\"\2\2"+
		"\u020b\u020a\3\2\2\2\u020c\u020f\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020e"+
		"\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u020d\3\2\2\2\u0210\u0214\7.\2\2\u0211"+
		"\u0213\7\"\2\2\u0212\u0211\3\2\2\2\u0213\u0216\3\2\2\2\u0214\u0212\3\2"+
		"\2\2\u0214\u0215\3\2\2\2\u0215\u0217\3\2\2\2\u0216\u0214\3\2\2\2\u0217"+
		"\u021b\5\n\6\2\u0218\u021a\7\"\2\2\u0219\u0218\3\2\2\2\u021a\u021d\3\2"+
		"\2\2\u021b\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021e\3\2\2\2\u021d"+
		"\u021b\3\2\2\2\u021e\u0222\5\n\6\2\u021f\u0221\7\"\2\2\u0220\u021f\3\2"+
		"\2\2\u0221\u0224\3\2\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0225\3\2\2\2\u0224\u0222\3\2\2\2\u0225\u0229\5\n\6\2\u0226\u0228\7\""+
		"\2\2\u0227\u0226\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2\2\2\u0229"+
		"\u022a\3\2\2\2\u022a\u022c\3\2\2\2\u022b\u0229\3\2\2\2\u022c\u0230\5\n"+
		"\6\2\u022d\u022f\7\"\2\2\u022e\u022d\3\2\2\2\u022f\u0232\3\2\2\2\u0230"+
		"\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231\u0233\3\2\2\2\u0232\u0230\3\2"+
		"\2\2\u0233\u0237\5\n\6\2\u0234\u0236\7\"\2\2\u0235\u0234\3\2\2\2\u0236"+
		"\u0239\3\2\2\2\u0237\u0235\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u023a\3\2"+
		"\2\2\u0239\u0237\3\2\2\2\u023a\u023b\5\n\6\2\u023b#\3\2\2\2\u023c\u023e"+
		"\7\"\2\2\u023d\u023c\3\2\2\2\u023e\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f"+
		"\u0240\3\2\2\2\u0240\u0242\3\2\2\2\u0241\u023f\3\2\2\2\u0242\u0246\7/"+
		"\2\2\u0243\u0245\7\"\2\2\u0244\u0243\3\2\2\2\u0245\u0248\3\2\2\2\u0246"+
		"\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249\3\2\2\2\u0248\u0246\3\2"+
		"\2\2\u0249\u024d\5\n\6\2\u024a\u024c\7\"\2\2\u024b\u024a\3\2\2\2\u024c"+
		"\u024f\3\2\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\u0250\3\2"+
		"\2\2\u024f\u024d\3\2\2\2\u0250\u0254\5\n\6\2\u0251\u0253\7\"\2\2\u0252"+
		"\u0251\3\2\2\2\u0253\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0254\u0255\3\2"+
		"\2\2\u0255\u0257\3\2\2\2\u0256\u0254\3\2\2\2\u0257\u025b\5\n\6\2\u0258"+
		"\u025a\7\"\2\2\u0259\u0258\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2"+
		"\2\2\u025b\u025c\3\2\2\2\u025c\u025e\3\2\2\2\u025d\u025b\3\2\2\2\u025e"+
		"\u025f\5\n\6\2\u025f%\3\2\2\2\u0260\u0262\7\"\2\2\u0261\u0260\3\2\2\2"+
		"\u0262\u0265\3\2\2\2\u0263\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0266"+
		"\3\2\2\2\u0265\u0263\3\2\2\2\u0266\u026a\7\60\2\2\u0267\u0269\7\"\2\2"+
		"\u0268\u0267\3\2\2\2\u0269\u026c\3\2\2\2\u026a\u0268\3\2\2\2\u026a\u026b"+
		"\3\2\2\2\u026b\u026d\3\2\2\2\u026c\u026a\3\2\2\2\u026d\u0271\5\n\6\2\u026e"+
		"\u0270\7\"\2\2\u026f\u026e\3\2\2\2\u0270\u0273\3\2\2\2\u0271\u026f\3\2"+
		"\2\2\u0271\u0272\3\2\2\2\u0272\u0274\3\2\2\2\u0273\u0271\3\2\2\2\u0274"+
		"\u0278\5\n\6\2\u0275\u0277\7\"\2\2\u0276\u0275\3\2\2\2\u0277\u027a\3\2"+
		"\2\2\u0278\u0276\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027b\3\2\2\2\u027a"+
		"\u0278\3\2\2\2\u027b\u027f\5\n\6\2\u027c\u027e\7\"\2\2\u027d\u027c\3\2"+
		"\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f\u0280\3\2\2\2\u0280"+
		"\u0282\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0283\5\n\6\2\u0283\'\3\2\2\2"+
		"\u0284\u0286\7\"\2\2\u0285\u0284\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285"+
		"\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u028a\3\2\2\2\u0289\u0287\3\2\2\2\u028a"+
		"\u028e\7\61\2\2\u028b\u028d\7\"\2\2\u028c\u028b\3\2\2\2\u028d\u0290\3"+
		"\2\2\2\u028e\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291\3\2\2\2\u0290"+
		"\u028e\3\2\2\2\u0291\u0295\5\n\6\2\u0292\u0294\7\"\2\2\u0293\u0292\3\2"+
		"\2\2\u0294\u0297\3\2\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296"+
		"\u0298\3\2\2\2\u0297\u0295\3\2\2\2\u0298\u029c\5\n\6\2\u0299\u029b\7\""+
		"\2\2\u029a\u0299\3\2\2\2\u029b\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029c"+
		"\u029d\3\2\2\2\u029d\u029f\3\2\2\2\u029e\u029c\3\2\2\2\u029f\u02a3\5\n"+
		"\6\2\u02a0\u02a2\7\"\2\2\u02a1\u02a0\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3"+
		"\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4\u02a6\3\2\2\2\u02a5\u02a3\3\2"+
		"\2\2\u02a6\u02a7\5\n\6\2\u02a7)\3\2\2\2\u02a8\u02aa\7\"\2\2\u02a9\u02a8"+
		"\3\2\2\2\u02aa\u02ad\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ab\u02ac\3\2\2\2\u02ac"+
		"\u02ae\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ae\u02b2\7\62\2\2\u02af\u02b1\7"+
		"\"\2\2\u02b0\u02af\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2"+
		"\u02b3\3\2\2\2\u02b3\u02b5\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02b9\5\n"+
		"\6\2\u02b6\u02b8\7\"\2\2\u02b7\u02b6\3\2\2\2\u02b8\u02bb\3\2\2\2\u02b9"+
		"\u02b7\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bc\3\2\2\2\u02bb\u02b9\3\2"+
		"\2\2\u02bc\u02c0\5\n\6\2\u02bd\u02bf\7\"\2\2\u02be\u02bd\3\2\2\2\u02bf"+
		"\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c3\3\2"+
		"\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c7\5\n\6\2\u02c4\u02c6\7\"\2\2\u02c5"+
		"\u02c4\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7\u02c8\3\2"+
		"\2\2\u02c8\u02ca\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cb\5\n\6\2\u02cb"+
		"+\3\2\2\2\u02cc\u02ce\7\"\2\2\u02cd\u02cc\3\2\2\2\u02ce\u02d1\3\2\2\2"+
		"\u02cf\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d2\3\2\2\2\u02d1\u02cf"+
		"\3\2\2\2\u02d2\u02d6\7\63\2\2\u02d3\u02d5\7\"\2\2\u02d4\u02d3\3\2\2\2"+
		"\u02d5\u02d8\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d9"+
		"\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d9\u02dd\5\n\6\2\u02da\u02dc\7\"\2\2\u02db"+
		"\u02da\3\2\2\2\u02dc\u02df\3\2\2\2\u02dd\u02db\3\2\2\2\u02dd\u02de\3\2"+
		"\2\2\u02de\u02e0\3\2\2\2\u02df\u02dd\3\2\2\2\u02e0\u02e1\5\n\6\2\u02e1"+
		"-\3\2\2\2\u02e2\u02e4\7\"\2\2\u02e3\u02e2\3\2\2\2\u02e4\u02e7\3\2\2\2"+
		"\u02e5\u02e3\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6\u02e8\3\2\2\2\u02e7\u02e5"+
		"\3\2\2\2\u02e8\u02ec\7\64\2\2\u02e9\u02eb\7\"\2\2\u02ea\u02e9\3\2\2\2"+
		"\u02eb\u02ee\3\2\2\2\u02ec\u02ea\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ef"+
		"\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ef\u02f3\5\n\6\2\u02f0\u02f2\7\"\2\2\u02f1"+
		"\u02f0\3\2\2\2\u02f2\u02f5\3\2\2\2\u02f3\u02f1\3\2\2\2\u02f3\u02f4\3\2"+
		"\2\2\u02f4\u02f6\3\2\2\2\u02f5\u02f3\3\2\2\2\u02f6\u02f7\5\n\6\2\u02f7"+
		"/\3\2\2\2\u02f8\u02fa\7\"\2\2\u02f9\u02f8\3\2\2\2\u02fa\u02fd\3\2\2\2"+
		"\u02fb\u02f9\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fe\3\2\2\2\u02fd\u02fb"+
		"\3\2\2\2\u02fe\u0302\7\65\2\2\u02ff\u0301\7\"\2\2\u0300\u02ff\3\2\2\2"+
		"\u0301\u0304\3\2\2\2\u0302\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0305"+
		"\3\2\2\2\u0304\u0302\3\2\2\2\u0305\u0309\5\n\6\2\u0306\u0308\7\"\2\2\u0307"+
		"\u0306\3\2\2\2\u0308\u030b\3\2\2\2\u0309\u0307\3\2\2\2\u0309\u030a\3\2"+
		"\2\2\u030a\u030c\3\2\2\2\u030b\u0309\3\2\2\2\u030c\u0310\5\n\6\2\u030d"+
		"\u030f\7\"\2\2\u030e\u030d\3\2\2\2\u030f\u0312\3\2\2\2\u0310\u030e\3\2"+
		"\2\2\u0310\u0311\3\2\2\2\u0311\u0313\3\2\2\2\u0312\u0310\3\2\2\2\u0313"+
		"\u0317\5\n\6\2\u0314\u0316\7\"\2\2\u0315\u0314\3\2\2\2\u0316\u0319\3\2"+
		"\2\2\u0317\u0315\3\2\2\2\u0317\u0318\3\2\2\2\u0318\u031a\3\2\2\2\u0319"+
		"\u0317\3\2\2\2\u031a\u031e\5\n\6\2\u031b\u031d\7\"\2\2\u031c\u031b\3\2"+
		"\2\2\u031d\u0320\3\2\2\2\u031e\u031c\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u0321\3\2\2\2\u0320\u031e\3\2\2\2\u0321\u0325\5\n\6\2\u0322\u0324\7\""+
		"\2\2\u0323\u0322\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325"+
		"\u0326\3\2\2\2\u0326\u0328\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u032c\5\n"+
		"\6\2\u0329\u032b\7\"\2\2\u032a\u0329\3\2\2\2\u032b\u032e\3\2\2\2\u032c"+
		"\u032a\3\2\2\2\u032c\u032d\3\2\2\2\u032d\u032f\3\2\2\2\u032e\u032c\3\2"+
		"\2\2\u032f\u0330\5\n\6\2\u0330\61\3\2\2\2\u0331\u0333\7\"\2\2\u0332\u0331"+
		"\3\2\2\2\u0333\u0336\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335"+
		"\u0337\3\2\2\2\u0336\u0334\3\2\2\2\u0337\u033b\7\66\2\2\u0338\u033a\7"+
		"\"\2\2\u0339\u0338\3\2\2\2\u033a\u033d\3\2\2\2\u033b\u0339\3\2\2\2\u033b"+
		"\u033c\3\2\2\2\u033c\u033e\3\2\2\2\u033d\u033b\3\2\2\2\u033e\u0342\5\n"+
		"\6\2\u033f\u0341\7\"\2\2\u0340\u033f\3\2\2\2\u0341\u0344\3\2\2\2\u0342"+
		"\u0340\3\2\2\2\u0342\u0343\3\2\2\2\u0343\u0345\3\2\2\2\u0344\u0342\3\2"+
		"\2\2\u0345\u0349\5\n\6\2\u0346\u0348\7\"\2\2\u0347\u0346\3\2\2\2\u0348"+
		"\u034b\3\2\2\2\u0349\u0347\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034c\3\2"+
		"\2\2\u034b\u0349\3\2\2\2\u034c\u0350\5\n\6\2\u034d\u034f\7\"\2\2\u034e"+
		"\u034d\3\2\2\2\u034f\u0352\3\2\2\2\u0350\u034e\3\2\2\2\u0350\u0351\3\2"+
		"\2\2\u0351\u0353\3\2\2\2\u0352\u0350\3\2\2\2\u0353\u0357\5\n\6\2\u0354"+
		"\u0356\7\"\2\2\u0355\u0354\3\2\2\2\u0356\u0359\3\2\2\2\u0357\u0355\3\2"+
		"\2\2\u0357\u0358\3\2\2\2\u0358\u035a\3\2\2\2\u0359\u0357\3\2\2\2\u035a"+
		"\u035e\5\n\6\2\u035b\u035d\7\"\2\2\u035c\u035b\3\2\2\2\u035d\u0360\3\2"+
		"\2\2\u035e\u035c\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0361\3\2\2\2\u0360"+
		"\u035e\3\2\2\2\u0361\u0365\5\n\6\2\u0362\u0364\7\"\2\2\u0363\u0362\3\2"+
		"\2\2\u0364\u0367\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366"+
		"\u0368\3\2\2\2\u0367\u0365\3\2\2\2\u0368\u0369\5\n\6\2\u0369\63\3\2\2"+
		"\2m9?KT]fox\u0081\u008a\u0098\u009f\u00ab\u00b4\u00bd\u00c4\u00d0\u00d7"+
		"\u00e3\u00ea\u00f6\u00fc\u0105\u0109\u0112\u0116\u012b\u012e\u0137\u013e"+
		"\u0145\u014d\u0154\u015b\u0163\u016a\u0171\u0179\u0180\u0187\u018f\u0196"+
		"\u019e\u01a5\u01ad\u01b4\u01bc\u01c3\u01cb\u01d2\u01d6\u01db\u01e2\u01e9"+
		"\u01f0\u01f7\u01fe\u0205\u020d\u0214\u021b\u0222\u0229\u0230\u0237\u023f"+
		"\u0246\u024d\u0254\u025b\u0263\u026a\u0271\u0278\u027f\u0287\u028e\u0295"+
		"\u029c\u02a3\u02ab\u02b2\u02b9\u02c0\u02c7\u02cf\u02d6\u02dd\u02e5\u02ec"+
		"\u02f3\u02fb\u0302\u0309\u0310\u0317\u031e\u0325\u032c\u0334\u033b\u0342"+
		"\u0349\u0350\u0357\u035e\u0365";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}