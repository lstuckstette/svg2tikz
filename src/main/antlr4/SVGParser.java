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
		"COMMENT_INSIDE", "ATTRIBUTECLOSE", "BLANK", "PATH_M_REL", "PATH_M", "PATH_L_REL", 
		"PATH_L", "PATH_H_REL", "PATH_H", "PATH_V_REL", "PATH_V", "PATH_Z_REL", 
		"PATH_Z", "PATH_C_REL", "PATH_C", "PATH_S_REL", "PATH_S", "PATH_Q_REL", 
		"PATH_Q", "PATH_T_REL", "PATH_T", "PATH_A_REL", "PATH_A", "WS_PATH", "UNARY_OPERATOR", 
		"UNSIGNED_INT", "UNSIGNED_FLOAT"
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
			setState(258);
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
				match(SLASH_CLOSE);
				}
				break;
			case 9:
				_localctx = new GContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(140);
				match(OPEN);
				setState(141);
				match(NAME_G);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==PATH_ATTRIBUTE) {
					{
					{
					setState(142);
					attribute();
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(CLOSE);
				setState(150); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(149);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(152); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(154);
				match(OPEN);
				setState(155);
				match(SLASH);
				setState(156);
				match(NAME_G);
				setState(157);
				match(CLOSE);
				}
				break;
			case 10:
				_localctx = new FilterContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(159);
				match(OPEN);
				setState(160);
				match(NAME_FILTER);
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(161);
					attribute();
					}
					}
					setState(164); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(166);
				match(SLASH_CLOSE);
				}
				break;
			case 11:
				_localctx = new StopContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(168);
				match(OPEN);
				setState(169);
				match(NAME_STOP);
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(170);
					attribute();
					}
					}
					setState(173); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME || _la==PATH_ATTRIBUTE );
				setState(175);
				match(SLASH_CLOSE);
				}
				break;
			case 12:
				_localctx = new DefsContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(177);
				match(OPEN);
				setState(178);
				match(NAME_DEFS);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==PATH_ATTRIBUTE) {
					{
					{
					setState(179);
					attribute();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(CLOSE);
				setState(187); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(186);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(189); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(191);
				match(OPEN);
				setState(192);
				match(SLASH);
				setState(193);
				match(NAME_DEFS);
				setState(194);
				match(CLOSE);
				}
				break;
			case 13:
				_localctx = new LinearGradientContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(196);
				match(OPEN);
				setState(197);
				match(NAME_LINEARGRADIENT);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==PATH_ATTRIBUTE) {
					{
					{
					setState(198);
					attribute();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(CLOSE);
				setState(206); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(205);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(208); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(210);
				match(OPEN);
				setState(211);
				match(SLASH);
				setState(212);
				match(NAME_LINEARGRADIENT);
				setState(213);
				match(CLOSE);
				}
				break;
			case 14:
				_localctx = new RadialGradientContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(215);
				match(OPEN);
				setState(216);
				match(NAME_RADIALGRADIENT);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==PATH_ATTRIBUTE) {
					{
					{
					setState(217);
					attribute();
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				match(CLOSE);
				setState(225); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(224);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(227); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(229);
				match(OPEN);
				setState(230);
				match(SLASH);
				setState(231);
				match(NAME_RADIALGRADIENT);
				setState(232);
				match(CLOSE);
				}
				break;
			case 15:
				_localctx = new UnnamedElementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(234);
				match(OPEN);
				setState(235);
				match(NAME);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==PATH_ATTRIBUTE) {
					{
					{
					setState(236);
					attribute();
					}
					}
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN) {
					{
					{
					setState(242);
					element();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248);
				match(CLOSE);
				}
				break;
			case 16:
				_localctx = new UnnamedElement_SelfCloseContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(249);
				match(OPEN);
				setState(250);
				match(NAME);
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME || _la==PATH_ATTRIBUTE) {
					{
					{
					setState(251);
					attribute();
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(257);
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
			setState(271);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(NAME);
				setState(261);
				match(EQUALS);
				setState(262);
				match(STRING);
				}
				break;
			case PATH_ATTRIBUTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(PATH_ATTRIBUTE);
				setState(265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(264);
					path_elements();
					}
					}
					setState(267); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BLANK) | (1L << PATH_M_REL) | (1L << PATH_M) | (1L << PATH_L_REL) | (1L << PATH_L) | (1L << PATH_H_REL) | (1L << PATH_H) | (1L << PATH_V_REL) | (1L << PATH_V) | (1L << PATH_Z_REL) | (1L << PATH_Z) | (1L << PATH_C_REL) | (1L << PATH_C) | (1L << PATH_S_REL) | (1L << PATH_S) | (1L << PATH_Q_REL) | (1L << PATH_Q) | (1L << PATH_T_REL) | (1L << PATH_T) | (1L << PATH_A_REL) | (1L << PATH_A))) != 0) );
				setState(269);
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
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				path_element_moveto();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
				path_element_moveto_rel();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(275);
				path_element_lineto_rel();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				path_element_lineto();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(277);
				path_element_horizontalline_rel();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(278);
				path_element_horizontalline();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(279);
				path_element_verticalline_rel();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(280);
				path_element_verticalline();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(281);
				path_element_close();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(282);
				path_element_cubiccurve_rel();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(283);
				path_element_cubiccurve();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(284);
				path_element_cubicreflectcurve_rel();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(285);
				path_element_cubicreflectcurve();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(286);
				path_element_quadraticcurve_rel();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(287);
				path_element_quadraticcurve();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(288);
				path_element_quadraticreflectcurve_rel();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(289);
				path_element_quadraticreflectcurve();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(290);
				path_element_arc_rel();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(291);
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
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNARY_OPERATOR) {
				{
				setState(294);
				match(UNARY_OPERATOR);
				}
			}

			setState(297);
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
			setState(299);
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
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(301);
				match(BLANK);
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(307);
			match(PATH_M_REL);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(308);
				match(BLANK);
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			number();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(315);
				match(BLANK);
				}
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(321);
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
			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(323);
				match(BLANK);
				}
				}
				setState(328);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			match(PATH_M);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(330);
				match(BLANK);
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			number();
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(337);
				match(BLANK);
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
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
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(345);
				match(BLANK);
				}
				}
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(351);
			match(PATH_L_REL);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(352);
				match(BLANK);
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			number();
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(359);
				match(BLANK);
				}
				}
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(365);
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
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(367);
				match(BLANK);
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			match(PATH_L);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(374);
				match(BLANK);
				}
				}
				setState(379);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(380);
			number();
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(381);
				match(BLANK);
				}
				}
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(387);
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
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(389);
				match(BLANK);
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(395);
			match(PATH_H_REL);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(396);
				match(BLANK);
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
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
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(404);
				match(BLANK);
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
			match(PATH_H);
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(411);
				match(BLANK);
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
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
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(419);
				match(BLANK);
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
			match(PATH_V_REL);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(426);
				match(BLANK);
				}
				}
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(432);
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
			setState(437);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(434);
				match(BLANK);
				}
				}
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(440);
			match(PATH_V);
			setState(444);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(441);
				match(BLANK);
				}
				}
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(447);
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
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BLANK) {
					{
					{
					setState(449);
					match(BLANK);
					}
					}
					setState(454);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(455);
				match(PATH_Z_REL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==BLANK) {
					{
					{
					setState(456);
					match(BLANK);
					}
					}
					setState(461);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(462);
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
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(465);
				match(BLANK);
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471);
			match(PATH_C_REL);
			setState(475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(472);
				match(BLANK);
				}
				}
				setState(477);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(478);
			number();
			setState(482);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(479);
				match(BLANK);
				}
				}
				setState(484);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(485);
			number();
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(486);
				match(BLANK);
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
			number();
			setState(496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(493);
				match(BLANK);
				}
				}
				setState(498);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(499);
			number();
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(500);
				match(BLANK);
				}
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(506);
			number();
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(507);
				match(BLANK);
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(513);
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
			setState(518);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(515);
				match(BLANK);
				}
				}
				setState(520);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(521);
			match(PATH_C);
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(522);
				match(BLANK);
				}
				}
				setState(527);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(528);
			number();
			setState(532);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(529);
				match(BLANK);
				}
				}
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(535);
			number();
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(536);
				match(BLANK);
				}
				}
				setState(541);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(542);
			number();
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(543);
				match(BLANK);
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(549);
			number();
			setState(553);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(550);
				match(BLANK);
				}
				}
				setState(555);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(556);
			number();
			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(557);
				match(BLANK);
				}
				}
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(563);
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
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(565);
				match(BLANK);
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(571);
			match(PATH_S_REL);
			setState(575);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(572);
				match(BLANK);
				}
				}
				setState(577);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(578);
			number();
			setState(582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(579);
				match(BLANK);
				}
				}
				setState(584);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(585);
			number();
			setState(589);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(586);
				match(BLANK);
				}
				}
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(592);
			number();
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(593);
				match(BLANK);
				}
				}
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(599);
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
			setState(604);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(601);
				match(BLANK);
				}
				}
				setState(606);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(607);
			match(PATH_S);
			setState(611);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(608);
				match(BLANK);
				}
				}
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(614);
			number();
			setState(618);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(615);
				match(BLANK);
				}
				}
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(621);
			number();
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(622);
				match(BLANK);
				}
				}
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(628);
			number();
			setState(632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(629);
				match(BLANK);
				}
				}
				setState(634);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(635);
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
			setState(640);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(637);
				match(BLANK);
				}
				}
				setState(642);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(643);
			match(PATH_Q_REL);
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(644);
				match(BLANK);
				}
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(650);
			number();
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(651);
				match(BLANK);
				}
				}
				setState(656);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(657);
			number();
			setState(661);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(658);
				match(BLANK);
				}
				}
				setState(663);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(664);
			number();
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(665);
				match(BLANK);
				}
				}
				setState(670);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(671);
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
			setState(676);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(673);
				match(BLANK);
				}
				}
				setState(678);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(679);
			match(PATH_Q);
			setState(683);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(680);
				match(BLANK);
				}
				}
				setState(685);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(686);
			number();
			setState(690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(687);
				match(BLANK);
				}
				}
				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(693);
			number();
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(694);
				match(BLANK);
				}
				}
				setState(699);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(700);
			number();
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(701);
				match(BLANK);
				}
				}
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(707);
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
			setState(712);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(709);
				match(BLANK);
				}
				}
				setState(714);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(715);
			match(PATH_T_REL);
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(716);
				match(BLANK);
				}
				}
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(722);
			number();
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(723);
				match(BLANK);
				}
				}
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(729);
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
			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(731);
				match(BLANK);
				}
				}
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(737);
			match(PATH_T);
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(738);
				match(BLANK);
				}
				}
				setState(743);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(744);
			number();
			setState(748);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(745);
				match(BLANK);
				}
				}
				setState(750);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(751);
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
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(753);
				match(BLANK);
				}
				}
				setState(758);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(759);
			match(PATH_A_REL);
			setState(763);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(760);
				match(BLANK);
				}
				}
				setState(765);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(766);
			number();
			setState(770);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(767);
				match(BLANK);
				}
				}
				setState(772);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(773);
			number();
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(774);
				match(BLANK);
				}
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(780);
			number();
			setState(784);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(781);
				match(BLANK);
				}
				}
				setState(786);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(787);
			number();
			setState(791);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(788);
				match(BLANK);
				}
				}
				setState(793);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(794);
			number();
			setState(798);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(795);
				match(BLANK);
				}
				}
				setState(800);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(801);
			number();
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(802);
				match(BLANK);
				}
				}
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(808);
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
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(810);
				match(BLANK);
				}
				}
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(816);
			match(PATH_A);
			setState(820);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(817);
				match(BLANK);
				}
				}
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(823);
			number();
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(824);
				match(BLANK);
				}
				}
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(830);
			number();
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(831);
				match(BLANK);
				}
				}
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(837);
			number();
			setState(841);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(838);
				match(BLANK);
				}
				}
				setState(843);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(844);
			number();
			setState(848);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(845);
				match(BLANK);
				}
				}
				setState(850);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(851);
			number();
			setState(855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(852);
				match(BLANK);
				}
				}
				setState(857);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(858);
			number();
			setState(862);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(859);
				match(BLANK);
				}
				}
				setState(864);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(865);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u0366\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\6\28\n\2\r\2\16\29\3\2\3\2\6\2>\n\2\r\2\16\2?\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\6\3J\n\3\r\3\16\3K\3\3\3\3\3\3\3\3\3\3"+
		"\6\3S\n\3\r\3\16\3T\3\3\3\3\3\3\3\3\3\3\6\3\\\n\3\r\3\16\3]\3\3\3\3\3"+
		"\3\3\3\3\3\6\3e\n\3\r\3\16\3f\3\3\3\3\3\3\3\3\3\3\6\3n\n\3\r\3\16\3o\3"+
		"\3\3\3\3\3\3\3\3\3\6\3w\n\3\r\3\16\3x\3\3\3\3\3\3\3\3\3\3\6\3\u0080\n"+
		"\3\r\3\16\3\u0081\3\3\3\3\3\3\3\3\3\3\6\3\u0089\n\3\r\3\16\3\u008a\3\3"+
		"\3\3\3\3\3\3\3\3\7\3\u0092\n\3\f\3\16\3\u0095\13\3\3\3\3\3\6\3\u0099\n"+
		"\3\r\3\16\3\u009a\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\6\3\u00a5\n\3\r\3\16"+
		"\3\u00a6\3\3\3\3\3\3\3\3\3\3\6\3\u00ae\n\3\r\3\16\3\u00af\3\3\3\3\3\3"+
		"\3\3\3\3\7\3\u00b7\n\3\f\3\16\3\u00ba\13\3\3\3\3\3\6\3\u00be\n\3\r\3\16"+
		"\3\u00bf\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00ca\n\3\f\3\16\3\u00cd"+
		"\13\3\3\3\3\3\6\3\u00d1\n\3\r\3\16\3\u00d2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\7\3\u00dd\n\3\f\3\16\3\u00e0\13\3\3\3\3\3\6\3\u00e4\n\3\r\3\16\3"+
		"\u00e5\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00f0\n\3\f\3\16\3\u00f3\13"+
		"\3\3\3\7\3\u00f6\n\3\f\3\16\3\u00f9\13\3\3\3\3\3\3\3\3\3\7\3\u00ff\n\3"+
		"\f\3\16\3\u0102\13\3\3\3\5\3\u0105\n\3\3\4\3\4\3\4\3\4\3\4\6\4\u010c\n"+
		"\4\r\4\16\4\u010d\3\4\3\4\5\4\u0112\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0127\n\5\3\6\5\6\u012a"+
		"\n\6\3\6\3\6\3\7\3\7\3\b\7\b\u0131\n\b\f\b\16\b\u0134\13\b\3\b\3\b\7\b"+
		"\u0138\n\b\f\b\16\b\u013b\13\b\3\b\3\b\7\b\u013f\n\b\f\b\16\b\u0142\13"+
		"\b\3\b\3\b\3\t\7\t\u0147\n\t\f\t\16\t\u014a\13\t\3\t\3\t\7\t\u014e\n\t"+
		"\f\t\16\t\u0151\13\t\3\t\3\t\7\t\u0155\n\t\f\t\16\t\u0158\13\t\3\t\3\t"+
		"\3\n\7\n\u015d\n\n\f\n\16\n\u0160\13\n\3\n\3\n\7\n\u0164\n\n\f\n\16\n"+
		"\u0167\13\n\3\n\3\n\7\n\u016b\n\n\f\n\16\n\u016e\13\n\3\n\3\n\3\13\7\13"+
		"\u0173\n\13\f\13\16\13\u0176\13\13\3\13\3\13\7\13\u017a\n\13\f\13\16\13"+
		"\u017d\13\13\3\13\3\13\7\13\u0181\n\13\f\13\16\13\u0184\13\13\3\13\3\13"+
		"\3\f\7\f\u0189\n\f\f\f\16\f\u018c\13\f\3\f\3\f\7\f\u0190\n\f\f\f\16\f"+
		"\u0193\13\f\3\f\3\f\3\r\7\r\u0198\n\r\f\r\16\r\u019b\13\r\3\r\3\r\7\r"+
		"\u019f\n\r\f\r\16\r\u01a2\13\r\3\r\3\r\3\16\7\16\u01a7\n\16\f\16\16\16"+
		"\u01aa\13\16\3\16\3\16\7\16\u01ae\n\16\f\16\16\16\u01b1\13\16\3\16\3\16"+
		"\3\17\7\17\u01b6\n\17\f\17\16\17\u01b9\13\17\3\17\3\17\7\17\u01bd\n\17"+
		"\f\17\16\17\u01c0\13\17\3\17\3\17\3\20\7\20\u01c5\n\20\f\20\16\20\u01c8"+
		"\13\20\3\20\3\20\7\20\u01cc\n\20\f\20\16\20\u01cf\13\20\3\20\5\20\u01d2"+
		"\n\20\3\21\7\21\u01d5\n\21\f\21\16\21\u01d8\13\21\3\21\3\21\7\21\u01dc"+
		"\n\21\f\21\16\21\u01df\13\21\3\21\3\21\7\21\u01e3\n\21\f\21\16\21\u01e6"+
		"\13\21\3\21\3\21\7\21\u01ea\n\21\f\21\16\21\u01ed\13\21\3\21\3\21\7\21"+
		"\u01f1\n\21\f\21\16\21\u01f4\13\21\3\21\3\21\7\21\u01f8\n\21\f\21\16\21"+
		"\u01fb\13\21\3\21\3\21\7\21\u01ff\n\21\f\21\16\21\u0202\13\21\3\21\3\21"+
		"\3\22\7\22\u0207\n\22\f\22\16\22\u020a\13\22\3\22\3\22\7\22\u020e\n\22"+
		"\f\22\16\22\u0211\13\22\3\22\3\22\7\22\u0215\n\22\f\22\16\22\u0218\13"+
		"\22\3\22\3\22\7\22\u021c\n\22\f\22\16\22\u021f\13\22\3\22\3\22\7\22\u0223"+
		"\n\22\f\22\16\22\u0226\13\22\3\22\3\22\7\22\u022a\n\22\f\22\16\22\u022d"+
		"\13\22\3\22\3\22\7\22\u0231\n\22\f\22\16\22\u0234\13\22\3\22\3\22\3\23"+
		"\7\23\u0239\n\23\f\23\16\23\u023c\13\23\3\23\3\23\7\23\u0240\n\23\f\23"+
		"\16\23\u0243\13\23\3\23\3\23\7\23\u0247\n\23\f\23\16\23\u024a\13\23\3"+
		"\23\3\23\7\23\u024e\n\23\f\23\16\23\u0251\13\23\3\23\3\23\7\23\u0255\n"+
		"\23\f\23\16\23\u0258\13\23\3\23\3\23\3\24\7\24\u025d\n\24\f\24\16\24\u0260"+
		"\13\24\3\24\3\24\7\24\u0264\n\24\f\24\16\24\u0267\13\24\3\24\3\24\7\24"+
		"\u026b\n\24\f\24\16\24\u026e\13\24\3\24\3\24\7\24\u0272\n\24\f\24\16\24"+
		"\u0275\13\24\3\24\3\24\7\24\u0279\n\24\f\24\16\24\u027c\13\24\3\24\3\24"+
		"\3\25\7\25\u0281\n\25\f\25\16\25\u0284\13\25\3\25\3\25\7\25\u0288\n\25"+
		"\f\25\16\25\u028b\13\25\3\25\3\25\7\25\u028f\n\25\f\25\16\25\u0292\13"+
		"\25\3\25\3\25\7\25\u0296\n\25\f\25\16\25\u0299\13\25\3\25\3\25\7\25\u029d"+
		"\n\25\f\25\16\25\u02a0\13\25\3\25\3\25\3\26\7\26\u02a5\n\26\f\26\16\26"+
		"\u02a8\13\26\3\26\3\26\7\26\u02ac\n\26\f\26\16\26\u02af\13\26\3\26\3\26"+
		"\7\26\u02b3\n\26\f\26\16\26\u02b6\13\26\3\26\3\26\7\26\u02ba\n\26\f\26"+
		"\16\26\u02bd\13\26\3\26\3\26\7\26\u02c1\n\26\f\26\16\26\u02c4\13\26\3"+
		"\26\3\26\3\27\7\27\u02c9\n\27\f\27\16\27\u02cc\13\27\3\27\3\27\7\27\u02d0"+
		"\n\27\f\27\16\27\u02d3\13\27\3\27\3\27\7\27\u02d7\n\27\f\27\16\27\u02da"+
		"\13\27\3\27\3\27\3\30\7\30\u02df\n\30\f\30\16\30\u02e2\13\30\3\30\3\30"+
		"\7\30\u02e6\n\30\f\30\16\30\u02e9\13\30\3\30\3\30\7\30\u02ed\n\30\f\30"+
		"\16\30\u02f0\13\30\3\30\3\30\3\31\7\31\u02f5\n\31\f\31\16\31\u02f8\13"+
		"\31\3\31\3\31\7\31\u02fc\n\31\f\31\16\31\u02ff\13\31\3\31\3\31\7\31\u0303"+
		"\n\31\f\31\16\31\u0306\13\31\3\31\3\31\7\31\u030a\n\31\f\31\16\31\u030d"+
		"\13\31\3\31\3\31\7\31\u0311\n\31\f\31\16\31\u0314\13\31\3\31\3\31\7\31"+
		"\u0318\n\31\f\31\16\31\u031b\13\31\3\31\3\31\7\31\u031f\n\31\f\31\16\31"+
		"\u0322\13\31\3\31\3\31\7\31\u0326\n\31\f\31\16\31\u0329\13\31\3\31\3\31"+
		"\3\32\7\32\u032e\n\32\f\32\16\32\u0331\13\32\3\32\3\32\7\32\u0335\n\32"+
		"\f\32\16\32\u0338\13\32\3\32\3\32\7\32\u033c\n\32\f\32\16\32\u033f\13"+
		"\32\3\32\3\32\7\32\u0343\n\32\f\32\16\32\u0346\13\32\3\32\3\32\7\32\u034a"+
		"\n\32\f\32\16\32\u034d\13\32\3\32\3\32\7\32\u0351\n\32\f\32\16\32\u0354"+
		"\13\32\3\32\3\32\7\32\u0358\n\32\f\32\16\32\u035b\13\32\3\32\3\32\7\32"+
		"\u035f\n\32\f\32\16\32\u0362\13\32\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2\3\3\29:\2\u03d6\2\64\3\2\2\2"+
		"\4\u0104\3\2\2\2\6\u0111\3\2\2\2\b\u0126\3\2\2\2\n\u0129\3\2\2\2\f\u012d"+
		"\3\2\2\2\16\u0132\3\2\2\2\20\u0148\3\2\2\2\22\u015e\3\2\2\2\24\u0174\3"+
		"\2\2\2\26\u018a\3\2\2\2\30\u0199\3\2\2\2\32\u01a8\3\2\2\2\34\u01b7\3\2"+
		"\2\2\36\u01d1\3\2\2\2 \u01d6\3\2\2\2\"\u0208\3\2\2\2$\u023a\3\2\2\2&\u025e"+
		"\3\2\2\2(\u0282\3\2\2\2*\u02a6\3\2\2\2,\u02ca\3\2\2\2.\u02e0\3\2\2\2\60"+
		"\u02f6\3\2\2\2\62\u032f\3\2\2\2\64\65\7\7\2\2\65\67\7\t\2\2\668\5\6\4"+
		"\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;=\7\31\2\2"+
		"<>\5\4\3\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AB\7\7\2\2"+
		"BC\7\33\2\2CD\7\t\2\2DE\7\31\2\2E\3\3\2\2\2FG\7\7\2\2GI\7\n\2\2HJ\5\6"+
		"\4\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2MN\7\32\2\2N\u0105"+
		"\3\2\2\2OP\7\7\2\2PR\7\13\2\2QS\5\6\4\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2"+
		"TU\3\2\2\2UV\3\2\2\2VW\7\32\2\2W\u0105\3\2\2\2XY\7\7\2\2Y[\7\f\2\2Z\\"+
		"\5\6\4\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\32\2\2"+
		"`\u0105\3\2\2\2ab\7\7\2\2bd\7\r\2\2ce\5\6\4\2dc\3\2\2\2ef\3\2\2\2fd\3"+
		"\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\32\2\2i\u0105\3\2\2\2jk\7\7\2\2km\7\16"+
		"\2\2ln\5\6\4\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2pq\3\2\2\2qr\7\32"+
		"\2\2r\u0105\3\2\2\2st\7\7\2\2tv\7\17\2\2uw\5\6\4\2vu\3\2\2\2wx\3\2\2\2"+
		"xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\7\32\2\2{\u0105\3\2\2\2|}\7\7\2\2}\177"+
		"\7\20\2\2~\u0080\5\6\4\2\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3"+
		"\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\32\2\2\u0084"+
		"\u0105\3\2\2\2\u0085\u0086\7\7\2\2\u0086\u0088\7\21\2\2\u0087\u0089\5"+
		"\6\4\2\u0088\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008d\7\32\2\2\u008d\u0105\3"+
		"\2\2\2\u008e\u008f\7\7\2\2\u008f\u0093\7\22\2\2\u0090\u0092\5\6\4\2\u0091"+
		"\u0090\3\2\2\2\u0092\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0093\u0094\3\2"+
		"\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096\u0098\7\31\2\2\u0097"+
		"\u0099\5\4\3\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u0098\3\2"+
		"\2\2\u009a\u009b\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\7\2\2\u009d"+
		"\u009e\7\33\2\2\u009e\u009f\7\22\2\2\u009f\u00a0\7\31\2\2\u00a0\u0105"+
		"\3\2\2\2\u00a1\u00a2\7\7\2\2\u00a2\u00a4\7\24\2\2\u00a3\u00a5\5\6\4\2"+
		"\u00a4\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\7\32\2\2\u00a9\u0105\3\2\2\2"+
		"\u00aa\u00ab\7\7\2\2\u00ab\u00ad\7\27\2\2\u00ac\u00ae\5\6\4\2\u00ad\u00ac"+
		"\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b1\3\2\2\2\u00b1\u00b2\7\32\2\2\u00b2\u0105\3\2\2\2\u00b3\u00b4\7"+
		"\7\2\2\u00b4\u00b8\7\23\2\2\u00b5\u00b7\5\6\4\2\u00b6\u00b5\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2"+
		"\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\7\31\2\2\u00bc\u00be\5\4\3\2\u00bd"+
		"\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\7\2\2\u00c2\u00c3\7\33\2\2\u00c3"+
		"\u00c4\7\23\2\2\u00c4\u00c5\7\31\2\2\u00c5\u0105\3\2\2\2\u00c6\u00c7\7"+
		"\7\2\2\u00c7\u00cb\7\25\2\2\u00c8\u00ca\5\6\4\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d0\7\31\2\2\u00cf\u00d1\5\4\3\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\7\7\2\2\u00d5\u00d6\7\33\2\2\u00d6"+
		"\u00d7\7\25\2\2\u00d7\u00d8\7\31\2\2\u00d8\u0105\3\2\2\2\u00d9\u00da\7"+
		"\7\2\2\u00da\u00de\7\26\2\2\u00db\u00dd\5\6\4\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e3\7\31\2\2\u00e2\u00e4\5\4\3\2\u00e3"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2"+
		"\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\7\7\2\2\u00e8\u00e9\7\33\2\2\u00e9"+
		"\u00ea\7\26\2\2\u00ea\u00eb\7\31\2\2\u00eb\u0105\3\2\2\2\u00ec\u00ed\7"+
		"\7\2\2\u00ed\u00f1\7\30\2\2\u00ee\u00f0\5\6\4\2\u00ef\u00ee\3\2\2\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f7\3\2"+
		"\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f6\5\4\3\2\u00f5\u00f4\3\2\2\2\u00f6"+
		"\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2"+
		"\2\2\u00f9\u00f7\3\2\2\2\u00fa\u0105\7\31\2\2\u00fb\u00fc\7\7\2\2\u00fc"+
		"\u0100\7\30\2\2\u00fd\u00ff\5\6\4\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3"+
		"\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0105\7\32\2\2\u0104F\3\2\2\2\u0104O\3\2\2\2\u0104"+
		"X\3\2\2\2\u0104a\3\2\2\2\u0104j\3\2\2\2\u0104s\3\2\2\2\u0104|\3\2\2\2"+
		"\u0104\u0085\3\2\2\2\u0104\u008e\3\2\2\2\u0104\u00a1\3\2\2\2\u0104\u00aa"+
		"\3\2\2\2\u0104\u00b3\3\2\2\2\u0104\u00c6\3\2\2\2\u0104\u00d9\3\2\2\2\u0104"+
		"\u00ec\3\2\2\2\u0104\u00fb\3\2\2\2\u0105\5\3\2\2\2\u0106\u0107\7\30\2"+
		"\2\u0107\u0108\7\34\2\2\u0108\u0112\7\36\2\2\u0109\u010b\7\35\2\2\u010a"+
		"\u010c\5\b\5\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2"+
		"\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7!\2\2\u0110"+
		"\u0112\3\2\2\2\u0111\u0106\3\2\2\2\u0111\u0109\3\2\2\2\u0112\7\3\2\2\2"+
		"\u0113\u0127\5\20\t\2\u0114\u0127\5\16\b\2\u0115\u0127\5\22\n\2\u0116"+
		"\u0127\5\24\13\2\u0117\u0127\5\26\f\2\u0118\u0127\5\30\r\2\u0119\u0127"+
		"\5\32\16\2\u011a\u0127\5\34\17\2\u011b\u0127\5\36\20\2\u011c\u0127\5 "+
		"\21\2\u011d\u0127\5\"\22\2\u011e\u0127\5$\23\2\u011f\u0127\5&\24\2\u0120"+
		"\u0127\5(\25\2\u0121\u0127\5*\26\2\u0122\u0127\5,\27\2\u0123\u0127\5."+
		"\30\2\u0124\u0127\5\60\31\2\u0125\u0127\5\62\32\2\u0126\u0113\3\2\2\2"+
		"\u0126\u0114\3\2\2\2\u0126\u0115\3\2\2\2\u0126\u0116\3\2\2\2\u0126\u0117"+
		"\3\2\2\2\u0126\u0118\3\2\2\2\u0126\u0119\3\2\2\2\u0126\u011a\3\2\2\2\u0126"+
		"\u011b\3\2\2\2\u0126\u011c\3\2\2\2\u0126\u011d\3\2\2\2\u0126\u011e\3\2"+
		"\2\2\u0126\u011f\3\2\2\2\u0126\u0120\3\2\2\2\u0126\u0121\3\2\2\2\u0126"+
		"\u0122\3\2\2\2\u0126\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2"+
		"\2\2\u0127\t\3\2\2\2\u0128\u012a\78\2\2\u0129\u0128\3\2\2\2\u0129\u012a"+
		"\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\5\f\7\2\u012c\13\3\2\2\2\u012d"+
		"\u012e\t\2\2\2\u012e\r\3\2\2\2\u012f\u0131\7\"\2\2\u0130\u012f\3\2\2\2"+
		"\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0135"+
		"\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u0139\7#\2\2\u0136\u0138\7\"\2\2\u0137"+
		"\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u0140\5\n\6\2\u013d"+
		"\u013f\7\"\2\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2"+
		"\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0144\5\n\6\2\u0144\17\3\2\2\2\u0145\u0147\7\"\2\2\u0146\u0145\3\2\2"+
		"\2\u0147\u014a\3\2\2\2\u0148\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b"+
		"\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014f\7$\2\2\u014c\u014e\7\"\2\2\u014d"+
		"\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2"+
		"\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0156\5\n\6\2\u0153"+
		"\u0155\7\"\2\2\u0154\u0153\3\2\2\2\u0155\u0158\3\2\2\2\u0156\u0154\3\2"+
		"\2\2\u0156\u0157\3\2\2\2\u0157\u0159\3\2\2\2\u0158\u0156\3\2\2\2\u0159"+
		"\u015a\5\n\6\2\u015a\21\3\2\2\2\u015b\u015d\7\"\2\2\u015c\u015b\3\2\2"+
		"\2\u015d\u0160\3\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0161"+
		"\3\2\2\2\u0160\u015e\3\2\2\2\u0161\u0165\7%\2\2\u0162\u0164\7\"\2\2\u0163"+
		"\u0162\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2"+
		"\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u016c\5\n\6\2\u0169"+
		"\u016b\7\"\2\2\u016a\u0169\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2"+
		"\2\2\u016c\u016d\3\2\2\2\u016d\u016f\3\2\2\2\u016e\u016c\3\2\2\2\u016f"+
		"\u0170\5\n\6\2\u0170\23\3\2\2\2\u0171\u0173\7\"\2\2\u0172\u0171\3\2\2"+
		"\2\u0173\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177"+
		"\3\2\2\2\u0176\u0174\3\2\2\2\u0177\u017b\7&\2\2\u0178\u017a\7\"\2\2\u0179"+
		"\u0178\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2"+
		"\2\2\u017c\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u0182\5\n\6\2\u017f"+
		"\u0181\7\"\2\2\u0180\u017f\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0185\3\2\2\2\u0184\u0182\3\2\2\2\u0185"+
		"\u0186\5\n\6\2\u0186\25\3\2\2\2\u0187\u0189\7\"\2\2\u0188\u0187\3\2\2"+
		"\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018d"+
		"\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u0191\7\'\2\2\u018e\u0190\7\"\2\2\u018f"+
		"\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191\u0192\3\2"+
		"\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\5\n\6\2\u0195"+
		"\27\3\2\2\2\u0196\u0198\7\"\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2"+
		"\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199"+
		"\3\2\2\2\u019c\u01a0\7(\2\2\u019d\u019f\7\"\2\2\u019e\u019d\3\2\2\2\u019f"+
		"\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2"+
		"\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a4\5\n\6\2\u01a4\31\3\2\2\2\u01a5\u01a7"+
		"\7\"\2\2\u01a6\u01a5\3\2\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8"+
		"\u01a9\3\2\2\2\u01a9\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01af\7)"+
		"\2\2\u01ac\u01ae\7\"\2\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af"+
		"\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2"+
		"\2\2\u01b2\u01b3\5\n\6\2\u01b3\33\3\2\2\2\u01b4\u01b6\7\"\2\2\u01b5\u01b4"+
		"\3\2\2\2\u01b6\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8"+
		"\u01ba\3\2\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01be\7*\2\2\u01bb\u01bd\7\""+
		"\2\2\u01bc\u01bb\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be"+
		"\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c2\5\n"+
		"\6\2\u01c2\35\3\2\2\2\u01c3\u01c5\7\"\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8"+
		"\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c9\u01d2\7+\2\2\u01ca\u01cc\7\"\2\2\u01cb\u01ca\3\2"+
		"\2\2\u01cc\u01cf\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce"+
		"\u01d0\3\2\2\2\u01cf\u01cd\3\2\2\2\u01d0\u01d2\7,\2\2\u01d1\u01c6\3\2"+
		"\2\2\u01d1\u01cd\3\2\2\2\u01d2\37\3\2\2\2\u01d3\u01d5\7\"\2\2\u01d4\u01d3"+
		"\3\2\2\2\u01d5\u01d8\3\2\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7"+
		"\u01d9\3\2\2\2\u01d8\u01d6\3\2\2\2\u01d9\u01dd\7-\2\2\u01da\u01dc\7\""+
		"\2\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd"+
		"\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2\2\2\u01e0\u01e4\5\n"+
		"\6\2\u01e1\u01e3\7\"\2\2\u01e2\u01e1\3\2\2\2\u01e3\u01e6\3\2\2\2\u01e4"+
		"\u01e2\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6\u01e4\3\2"+
		"\2\2\u01e7\u01eb\5\n\6\2\u01e8\u01ea\7\"\2\2\u01e9\u01e8\3\2\2\2\u01ea"+
		"\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2"+
		"\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01f2\5\n\6\2\u01ef\u01f1\7\"\2\2\u01f0"+
		"\u01ef\3\2\2\2\u01f1\u01f4\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f2\u01f3\3\2"+
		"\2\2\u01f3\u01f5\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5\u01f9\5\n\6\2\u01f6"+
		"\u01f8\7\"\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9\u01f7\3\2"+
		"\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fc"+
		"\u0200\5\n\6\2\u01fd\u01ff\7\"\2\2\u01fe\u01fd\3\2\2\2\u01ff\u0202\3\2"+
		"\2\2\u0200\u01fe\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202"+
		"\u0200\3\2\2\2\u0203\u0204\5\n\6\2\u0204!\3\2\2\2\u0205\u0207\7\"\2\2"+
		"\u0206\u0205\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209"+
		"\3\2\2\2\u0209\u020b\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u020f\7.\2\2\u020c"+
		"\u020e\7\"\2\2\u020d\u020c\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2"+
		"\2\2\u020f\u0210\3\2\2\2\u0210\u0212\3\2\2\2\u0211\u020f\3\2\2\2\u0212"+
		"\u0216\5\n\6\2\u0213\u0215\7\"\2\2\u0214\u0213\3\2\2\2\u0215\u0218\3\2"+
		"\2\2\u0216\u0214\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0219\3\2\2\2\u0218"+
		"\u0216\3\2\2\2\u0219\u021d\5\n\6\2\u021a\u021c\7\"\2\2\u021b\u021a\3\2"+
		"\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e"+
		"\u0220\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0224\5\n\6\2\u0221\u0223\7\""+
		"\2\2\u0222\u0221\3\2\2\2\u0223\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0227\3\2\2\2\u0226\u0224\3\2\2\2\u0227\u022b\5\n"+
		"\6\2\u0228\u022a\7\"\2\2\u0229\u0228\3\2\2\2\u022a\u022d\3\2\2\2\u022b"+
		"\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022e\3\2\2\2\u022d\u022b\3\2"+
		"\2\2\u022e\u0232\5\n\6\2\u022f\u0231\7\"\2\2\u0230\u022f\3\2\2\2\u0231"+
		"\u0234\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2"+
		"\2\2\u0234\u0232\3\2\2\2\u0235\u0236\5\n\6\2\u0236#\3\2\2\2\u0237\u0239"+
		"\7\"\2\2\u0238\u0237\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b\u023d\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u0241\7/"+
		"\2\2\u023e\u0240\7\"\2\2\u023f\u023e\3\2\2\2\u0240\u0243\3\2\2\2\u0241"+
		"\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\3\2\2\2\u0243\u0241\3\2"+
		"\2\2\u0244\u0248\5\n\6\2\u0245\u0247\7\"\2\2\u0246\u0245\3\2\2\2\u0247"+
		"\u024a\3\2\2\2\u0248\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u024b\3\2"+
		"\2\2\u024a\u0248\3\2\2\2\u024b\u024f\5\n\6\2\u024c\u024e\7\"\2\2\u024d"+
		"\u024c\3\2\2\2\u024e\u0251\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2"+
		"\2\2\u0250\u0252\3\2\2\2\u0251\u024f\3\2\2\2\u0252\u0256\5\n\6\2\u0253"+
		"\u0255\7\"\2\2\u0254\u0253\3\2\2\2\u0255\u0258\3\2\2\2\u0256\u0254\3\2"+
		"\2\2\u0256\u0257\3\2\2\2\u0257\u0259\3\2\2\2\u0258\u0256\3\2\2\2\u0259"+
		"\u025a\5\n\6\2\u025a%\3\2\2\2\u025b\u025d\7\"\2\2\u025c\u025b\3\2\2\2"+
		"\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0261"+
		"\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0265\7\60\2\2\u0262\u0264\7\"\2\2"+
		"\u0263\u0262\3\2\2\2\u0264\u0267\3\2\2\2\u0265\u0263\3\2\2\2\u0265\u0266"+
		"\3\2\2\2\u0266\u0268\3\2\2\2\u0267\u0265\3\2\2\2\u0268\u026c\5\n\6\2\u0269"+
		"\u026b\7\"\2\2\u026a\u0269\3\2\2\2\u026b\u026e\3\2\2\2\u026c\u026a\3\2"+
		"\2\2\u026c\u026d\3\2\2\2\u026d\u026f\3\2\2\2\u026e\u026c\3\2\2\2\u026f"+
		"\u0273\5\n\6\2\u0270\u0272\7\"\2\2\u0271\u0270\3\2\2\2\u0272\u0275\3\2"+
		"\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0276\3\2\2\2\u0275"+
		"\u0273\3\2\2\2\u0276\u027a\5\n\6\2\u0277\u0279\7\"\2\2\u0278\u0277\3\2"+
		"\2\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b"+
		"\u027d\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u027e\5\n\6\2\u027e\'\3\2\2\2"+
		"\u027f\u0281\7\"\2\2\u0280\u027f\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280"+
		"\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0285\3\2\2\2\u0284\u0282\3\2\2\2\u0285"+
		"\u0289\7\61\2\2\u0286\u0288\7\"\2\2\u0287\u0286\3\2\2\2\u0288\u028b\3"+
		"\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\3\2\2\2\u028b"+
		"\u0289\3\2\2\2\u028c\u0290\5\n\6\2\u028d\u028f\7\"\2\2\u028e\u028d\3\2"+
		"\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"\u0293\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0297\5\n\6\2\u0294\u0296\7\""+
		"\2\2\u0295\u0294\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298\u029a\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029e\5\n"+
		"\6\2\u029b\u029d\7\"\2\2\u029c\u029b\3\2\2\2\u029d\u02a0\3\2\2\2\u029e"+
		"\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a1\3\2\2\2\u02a0\u029e\3\2"+
		"\2\2\u02a1\u02a2\5\n\6\2\u02a2)\3\2\2\2\u02a3\u02a5\7\"\2\2\u02a4\u02a3"+
		"\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2\2\2\u02a7"+
		"\u02a9\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02ad\7\62\2\2\u02aa\u02ac\7"+
		"\"\2\2\u02ab\u02aa\3\2\2\2\u02ac\u02af\3\2\2\2\u02ad\u02ab\3\2\2\2\u02ad"+
		"\u02ae\3\2\2\2\u02ae\u02b0\3\2\2\2\u02af\u02ad\3\2\2\2\u02b0\u02b4\5\n"+
		"\6\2\u02b1\u02b3\7\"\2\2\u02b2\u02b1\3\2\2\2\u02b3\u02b6\3\2\2\2\u02b4"+
		"\u02b2\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\3\2\2\2\u02b6\u02b4\3\2"+
		"\2\2\u02b7\u02bb\5\n\6\2\u02b8\u02ba\7\"\2\2\u02b9\u02b8\3\2\2\2\u02ba"+
		"\u02bd\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bc\u02be\3\2"+
		"\2\2\u02bd\u02bb\3\2\2\2\u02be\u02c2\5\n\6\2\u02bf\u02c1\7\"\2\2\u02c0"+
		"\u02bf\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2"+
		"\2\2\u02c3\u02c5\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02c6\5\n\6\2\u02c6"+
		"+\3\2\2\2\u02c7\u02c9\7\"\2\2\u02c8\u02c7\3\2\2\2\u02c9\u02cc\3\2\2\2"+
		"\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc\u02ca"+
		"\3\2\2\2\u02cd\u02d1\7\63\2\2\u02ce\u02d0\7\"\2\2\u02cf\u02ce\3\2\2\2"+
		"\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d4"+
		"\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02d8\5\n\6\2\u02d5\u02d7\7\"\2\2\u02d6"+
		"\u02d5\3\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8\u02d9\3\2"+
		"\2\2\u02d9\u02db\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02dc\5\n\6\2\u02dc"+
		"-\3\2\2\2\u02dd\u02df\7\"\2\2\u02de\u02dd\3\2\2\2\u02df\u02e2\3\2\2\2"+
		"\u02e0\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02e3\3\2\2\2\u02e2\u02e0"+
		"\3\2\2\2\u02e3\u02e7\7\64\2\2\u02e4\u02e6\7\"\2\2\u02e5\u02e4\3\2\2\2"+
		"\u02e6\u02e9\3\2\2\2\u02e7\u02e5\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02ea"+
		"\3\2\2\2\u02e9\u02e7\3\2\2\2\u02ea\u02ee\5\n\6\2\u02eb\u02ed\7\"\2\2\u02ec"+
		"\u02eb\3\2\2\2\u02ed\u02f0\3\2\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2"+
		"\2\2\u02ef\u02f1\3\2\2\2\u02f0\u02ee\3\2\2\2\u02f1\u02f2\5\n\6\2\u02f2"+
		"/\3\2\2\2\u02f3\u02f5\7\"\2\2\u02f4\u02f3\3\2\2\2\u02f5\u02f8\3\2\2\2"+
		"\u02f6\u02f4\3\2\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f9\3\2\2\2\u02f8\u02f6"+
		"\3\2\2\2\u02f9\u02fd\7\65\2\2\u02fa\u02fc\7\"\2\2\u02fb\u02fa\3\2\2\2"+
		"\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02fe\u0300"+
		"\3\2\2\2\u02ff\u02fd\3\2\2\2\u0300\u0304\5\n\6\2\u0301\u0303\7\"\2\2\u0302"+
		"\u0301\3\2\2\2\u0303\u0306\3\2\2\2\u0304\u0302\3\2\2\2\u0304\u0305\3\2"+
		"\2\2\u0305\u0307\3\2\2\2\u0306\u0304\3\2\2\2\u0307\u030b\5\n\6\2\u0308"+
		"\u030a\7\"\2\2\u0309\u0308\3\2\2\2\u030a\u030d\3\2\2\2\u030b\u0309\3\2"+
		"\2\2\u030b\u030c\3\2\2\2\u030c\u030e\3\2\2\2\u030d\u030b\3\2\2\2\u030e"+
		"\u0312\5\n\6\2\u030f\u0311\7\"\2\2\u0310\u030f\3\2\2\2\u0311\u0314\3\2"+
		"\2\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313\u0315\3\2\2\2\u0314"+
		"\u0312\3\2\2\2\u0315\u0319\5\n\6\2\u0316\u0318\7\"\2\2\u0317\u0316\3\2"+
		"\2\2\u0318\u031b\3\2\2\2\u0319\u0317\3\2\2\2\u0319\u031a\3\2\2\2\u031a"+
		"\u031c\3\2\2\2\u031b\u0319\3\2\2\2\u031c\u0320\5\n\6\2\u031d\u031f\7\""+
		"\2\2\u031e\u031d\3\2\2\2\u031f\u0322\3\2\2\2\u0320\u031e\3\2\2\2\u0320"+
		"\u0321\3\2\2\2\u0321\u0323\3\2\2\2\u0322\u0320\3\2\2\2\u0323\u0327\5\n"+
		"\6\2\u0324\u0326\7\"\2\2\u0325\u0324\3\2\2\2\u0326\u0329\3\2\2\2\u0327"+
		"\u0325\3\2\2\2\u0327\u0328\3\2\2\2\u0328\u032a\3\2\2\2\u0329\u0327\3\2"+
		"\2\2\u032a\u032b\5\n\6\2\u032b\61\3\2\2\2\u032c\u032e\7\"\2\2\u032d\u032c"+
		"\3\2\2\2\u032e\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330"+
		"\u0332\3\2\2\2\u0331\u032f\3\2\2\2\u0332\u0336\7\66\2\2\u0333\u0335\7"+
		"\"\2\2\u0334\u0333\3\2\2\2\u0335\u0338\3\2\2\2\u0336\u0334\3\2\2\2\u0336"+
		"\u0337\3\2\2\2\u0337\u0339\3\2\2\2\u0338\u0336\3\2\2\2\u0339\u033d\5\n"+
		"\6\2\u033a\u033c\7\"\2\2\u033b\u033a\3\2\2\2\u033c\u033f\3\2\2\2\u033d"+
		"\u033b\3\2\2\2\u033d\u033e\3\2\2\2\u033e\u0340\3\2\2\2\u033f\u033d\3\2"+
		"\2\2\u0340\u0344\5\n\6\2\u0341\u0343\7\"\2\2\u0342\u0341\3\2\2\2\u0343"+
		"\u0346\3\2\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345\u0347\3\2"+
		"\2\2\u0346\u0344\3\2\2\2\u0347\u034b\5\n\6\2\u0348\u034a\7\"\2\2\u0349"+
		"\u0348\3\2\2\2\u034a\u034d\3\2\2\2\u034b\u0349\3\2\2\2\u034b\u034c\3\2"+
		"\2\2\u034c\u034e\3\2\2\2\u034d\u034b\3\2\2\2\u034e\u0352\5\n\6\2\u034f"+
		"\u0351\7\"\2\2\u0350\u034f\3\2\2\2\u0351\u0354\3\2\2\2\u0352\u0350\3\2"+
		"\2\2\u0352\u0353\3\2\2\2\u0353\u0355\3\2\2\2\u0354\u0352\3\2\2\2\u0355"+
		"\u0359\5\n\6\2\u0356\u0358\7\"\2\2\u0357\u0356\3\2\2\2\u0358\u035b\3\2"+
		"\2\2\u0359\u0357\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035c\3\2\2\2\u035b"+
		"\u0359\3\2\2\2\u035c\u0360\5\n\6\2\u035d\u035f\7\"\2\2\u035e\u035d\3\2"+
		"\2\2\u035f\u0362\3\2\2\2\u0360\u035e\3\2\2\2\u0360\u0361\3\2\2\2\u0361"+
		"\u0363\3\2\2\2\u0362\u0360\3\2\2\2\u0363\u0364\5\n\6\2\u0364\63\3\2\2"+
		"\2m9?KT]fox\u0081\u008a\u0093\u009a\u00a6\u00af\u00b8\u00bf\u00cb\u00d2"+
		"\u00de\u00e5\u00f1\u00f7\u0100\u0104\u010d\u0111\u0126\u0129\u0132\u0139"+
		"\u0140\u0148\u014f\u0156\u015e\u0165\u016c\u0174\u017b\u0182\u018a\u0191"+
		"\u0199\u01a0\u01a8\u01af\u01b7\u01be\u01c6\u01cd\u01d1\u01d6\u01dd\u01e4"+
		"\u01eb\u01f2\u01f9\u0200\u0208\u020f\u0216\u021d\u0224\u022b\u0232\u023a"+
		"\u0241\u0248\u024f\u0256\u025e\u0265\u026c\u0273\u027a\u0282\u0289\u0290"+
		"\u0297\u029e\u02a6\u02ad\u02b4\u02bb\u02c2\u02ca\u02d1\u02d8\u02e0\u02e7"+
		"\u02ee\u02f6\u02fd\u0304\u030b\u0312\u0319\u0320\u0327\u032f\u0336\u033d"+
		"\u0344\u034b\u0352\u0359\u0360";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}