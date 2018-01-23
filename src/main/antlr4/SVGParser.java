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
		PATH_Q=48, PATH_T_REL=49, PATH_T=50, PATH_A_REL=51, PATH_A=52, NUMBER=53;
	public static final int
		RULE_svgRoot = 0, RULE_element = 1, RULE_path_attribute = 2, RULE_attribute = 3, 
		RULE_path_elements = 4, RULE_path_element_moveto_rel = 5, RULE_path_element_moveto = 6, 
		RULE_path_element_lineto_rel = 7, RULE_path_element_lineto = 8, RULE_path_element_horizontalline_rel = 9, 
		RULE_path_element_horizontalline = 10, RULE_path_element_verticalline_rel = 11, 
		RULE_path_element_verticalline = 12, RULE_path_element_close = 13, RULE_path_element_cubiccurve_rel = 14, 
		RULE_path_element_cubiccurve = 15, RULE_path_element_cubicreflectcurve_rel = 16, 
		RULE_path_element_cubicreflectcurve = 17, RULE_path_element_quadraticcurve_rel = 18, 
		RULE_path_element_quadraticcurve = 19, RULE_path_element_quadraticreflectcurve_rel = 20, 
		RULE_path_element_quadraticreflectcurve = 21, RULE_path_element_arc_rel = 22, 
		RULE_path_element_arc = 23;
	public static final String[] ruleNames = {
		"svgRoot", "element", "path_attribute", "attribute", "path_elements", 
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
		"PATH_Q", "PATH_T_REL", "PATH_T", "PATH_A_REL", "PATH_A", "NUMBER"
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
			setState(48);
			match(OPEN);
			setState(49);
			match(NAME_SVG);
			setState(51); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(50);
				attribute();
				}
				}
				setState(53); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NAME );
			setState(55);
			match(CLOSE);
			setState(57); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(56);
					element();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(59); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(61);
			match(OPEN);
			setState(62);
			match(SLASH);
			setState(63);
			match(NAME_SVG);
			setState(64);
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
		public List<Path_attributeContext> path_attribute() {
			return getRuleContexts(Path_attributeContext.class);
		}
		public Path_attributeContext path_attribute(int i) {
			return getRuleContext(Path_attributeContext.class,i);
		}
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
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				_localctx = new CircleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(OPEN);
				setState(67);
				match(NAME_CIRCLE);
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(68);
					attribute();
					}
					}
					setState(71); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(73);
				match(SLASH_CLOSE);
				}
				break;
			case 2:
				_localctx = new RectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(OPEN);
				setState(76);
				match(NAME_RECT);
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(77);
					attribute();
					}
					}
					setState(80); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(82);
				match(SLASH_CLOSE);
				}
				break;
			case 3:
				_localctx = new EllipseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(OPEN);
				setState(85);
				match(NAME_ELLIPSE);
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(86);
					attribute();
					}
					}
					setState(89); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(91);
				match(SLASH_CLOSE);
				}
				break;
			case 4:
				_localctx = new LineContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(93);
				match(OPEN);
				setState(94);
				match(NAME_LINE);
				setState(96); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(95);
					attribute();
					}
					}
					setState(98); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(100);
				match(SLASH_CLOSE);
				}
				break;
			case 5:
				_localctx = new PolygonContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				match(OPEN);
				setState(103);
				match(NAME_POLYGON);
				setState(105); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(104);
					attribute();
					}
					}
					setState(107); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(109);
				match(SLASH_CLOSE);
				}
				break;
			case 6:
				_localctx = new PolylineContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(111);
				match(OPEN);
				setState(112);
				match(NAME_POLYLINE);
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(113);
					attribute();
					}
					}
					setState(116); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(118);
				match(SLASH_CLOSE);
				}
				break;
			case 7:
				_localctx = new PathContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(120);
				match(OPEN);
				setState(121);
				match(NAME_PATH);
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(122);
					path_attribute();
					}
					}
					setState(125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PATH_ATTRIBUTE );
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(127);
					attribute();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(SLASH_CLOSE);
				}
				break;
			case 8:
				_localctx = new TextContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(135);
				match(OPEN);
				setState(136);
				match(NAME_TEXT);
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(137);
					attribute();
					}
					}
					setState(140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(142);
				match(SLASH_CLOSE);
				}
				break;
			case 9:
				_localctx = new GContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(144);
				match(OPEN);
				setState(145);
				match(NAME_G);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(146);
					attribute();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				match(CLOSE);
				setState(154); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(153);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(156); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(158);
				match(OPEN);
				setState(159);
				match(SLASH);
				setState(160);
				match(NAME_G);
				setState(161);
				match(CLOSE);
				}
				break;
			case 10:
				_localctx = new FilterContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(163);
				match(OPEN);
				setState(164);
				match(NAME_FILTER);
				setState(166); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(165);
					attribute();
					}
					}
					setState(168); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(170);
				match(SLASH_CLOSE);
				}
				break;
			case 11:
				_localctx = new StopContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(172);
				match(OPEN);
				setState(173);
				match(NAME_STOP);
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(174);
					attribute();
					}
					}
					setState(177); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NAME );
				setState(179);
				match(SLASH_CLOSE);
				}
				break;
			case 12:
				_localctx = new DefsContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(181);
				match(OPEN);
				setState(182);
				match(NAME_DEFS);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(183);
					attribute();
					}
					}
					setState(188);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(189);
				match(CLOSE);
				setState(191); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(190);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(193); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(195);
				match(OPEN);
				setState(196);
				match(SLASH);
				setState(197);
				match(NAME_DEFS);
				setState(198);
				match(CLOSE);
				}
				break;
			case 13:
				_localctx = new LinearGradientContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(200);
				match(OPEN);
				setState(201);
				match(NAME_LINEARGRADIENT);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(202);
					attribute();
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(208);
				match(CLOSE);
				setState(210); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(209);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(212); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(214);
				match(OPEN);
				setState(215);
				match(SLASH);
				setState(216);
				match(NAME_LINEARGRADIENT);
				setState(217);
				match(CLOSE);
				}
				break;
			case 14:
				_localctx = new RadialGradientContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(219);
				match(OPEN);
				setState(220);
				match(NAME_RADIALGRADIENT);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(221);
					attribute();
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
				match(CLOSE);
				setState(229); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(228);
						element();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(231); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(233);
				match(OPEN);
				setState(234);
				match(SLASH);
				setState(235);
				match(NAME_RADIALGRADIENT);
				setState(236);
				match(CLOSE);
				}
				break;
			case 15:
				_localctx = new UnnamedElementContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(238);
				match(OPEN);
				setState(239);
				match(NAME);
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(240);
					attribute();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN) {
					{
					{
					setState(246);
					element();
					}
					}
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(252);
				match(CLOSE);
				}
				break;
			case 16:
				_localctx = new UnnamedElement_SelfCloseContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(253);
				match(OPEN);
				setState(254);
				match(NAME);
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NAME) {
					{
					{
					setState(255);
					attribute();
					}
					}
					setState(260);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(261);
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

	public static class Path_attributeContext extends ParserRuleContext {
		public List<Path_elementsContext> path_elements() {
			return getRuleContexts(Path_elementsContext.class);
		}
		public Path_elementsContext path_elements(int i) {
			return getRuleContext(Path_elementsContext.class,i);
		}
		public Path_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).enterPath_attribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SVGParserListener ) ((SVGParserListener)listener).exitPath_attribute(this);
		}
	}

	public final Path_attributeContext path_attribute() throws RecognitionException {
		Path_attributeContext _localctx = new Path_attributeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_path_attribute);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(PATH_ATTRIBUTE);
			setState(266); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(265);
				path_elements();
				}
				}
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PATH_M_REL) | (1L << PATH_M) | (1L << PATH_L_REL) | (1L << PATH_L) | (1L << PATH_H_REL) | (1L << PATH_H) | (1L << PATH_V_REL) | (1L << PATH_V) | (1L << PATH_Z_REL) | (1L << PATH_Z))) != 0) );
			setState(270);
			match(ATTRIBUTECLOSE);
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
		enterRule(_localctx, 6, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(NAME);
			setState(273);
			match(EQUALS);
			setState(274);
			match(STRING);
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
		enterRule(_localctx, 8, RULE_path_elements);
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PATH_M:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				path_element_moveto();
				}
				break;
			case PATH_M_REL:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				path_element_moveto_rel();
				}
				break;
			case PATH_L_REL:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				path_element_lineto_rel();
				}
				break;
			case PATH_L:
				enterOuterAlt(_localctx, 4);
				{
				setState(279);
				path_element_lineto();
				}
				break;
			case PATH_H_REL:
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				path_element_horizontalline_rel();
				}
				break;
			case PATH_H:
				enterOuterAlt(_localctx, 6);
				{
				setState(281);
				path_element_horizontalline();
				}
				break;
			case PATH_V_REL:
				enterOuterAlt(_localctx, 7);
				{
				setState(282);
				path_element_verticalline_rel();
				}
				break;
			case PATH_V:
				enterOuterAlt(_localctx, 8);
				{
				setState(283);
				path_element_verticalline();
				}
				break;
			case PATH_Z_REL:
			case PATH_Z:
				enterOuterAlt(_localctx, 9);
				{
				setState(284);
				path_element_close();
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
		enterRule(_localctx, 10, RULE_path_element_moveto_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(PATH_M_REL);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(288);
				match(BLANK);
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(294);
			match(NUMBER);
			setState(298);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(295);
				match(BLANK);
				}
				}
				setState(300);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(301);
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
		enterRule(_localctx, 12, RULE_path_element_moveto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(PATH_M);
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
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(311);
				match(BLANK);
				}
				}
				setState(316);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(317);
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
		enterRule(_localctx, 14, RULE_path_element_lineto_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			match(PATH_L_REL);
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
			match(NUMBER);
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(327);
				match(BLANK);
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(333);
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
		enterRule(_localctx, 16, RULE_path_element_lineto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(PATH_L);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(336);
				match(BLANK);
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(NUMBER);
			setState(346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(343);
				match(BLANK);
				}
				}
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(349);
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
		enterRule(_localctx, 18, RULE_path_element_horizontalline_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(PATH_H_REL);
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
		enterRule(_localctx, 20, RULE_path_element_horizontalline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(PATH_H);
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(361);
				match(BLANK);
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
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
		enterRule(_localctx, 22, RULE_path_element_verticalline_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			match(PATH_V_REL);
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
		enterRule(_localctx, 24, RULE_path_element_verticalline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(PATH_V);
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
		enterRule(_localctx, 26, RULE_path_element_close);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_la = _input.LA(1);
			if ( !(_la==PATH_Z_REL || _la==PATH_Z) ) {
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
		enterRule(_localctx, 28, RULE_path_element_cubiccurve_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			match(PATH_C_REL);
			setState(393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(390);
				match(BLANK);
				}
				}
				setState(395);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(396);
			match(NUMBER);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(397);
				match(BLANK);
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(403);
			match(NUMBER);
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
			match(NUMBER);
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
			match(NUMBER);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(418);
				match(BLANK);
				}
				}
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(424);
			match(NUMBER);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(425);
				match(BLANK);
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
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
		enterRule(_localctx, 30, RULE_path_element_cubiccurve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(PATH_C);
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
			match(NUMBER);
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
			match(NUMBER);
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(448);
				match(BLANK);
				}
				}
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(454);
			match(NUMBER);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(455);
				match(BLANK);
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(461);
			match(NUMBER);
			setState(465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(462);
				match(BLANK);
				}
				}
				setState(467);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(468);
			match(NUMBER);
			setState(472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(469);
				match(BLANK);
				}
				}
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(475);
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
		enterRule(_localctx, 32, RULE_path_element_cubicreflectcurve_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(PATH_S_REL);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(478);
				match(BLANK);
				}
				}
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(484);
			match(NUMBER);
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(485);
				match(BLANK);
				}
				}
				setState(490);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(491);
			match(NUMBER);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(492);
				match(BLANK);
				}
				}
				setState(497);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(498);
			match(NUMBER);
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(499);
				match(BLANK);
				}
				}
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(505);
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
		enterRule(_localctx, 34, RULE_path_element_cubicreflectcurve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(PATH_S);
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(508);
				match(BLANK);
				}
				}
				setState(513);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(514);
			match(NUMBER);
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
			match(NUMBER);
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
			match(NUMBER);
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
		enterRule(_localctx, 36, RULE_path_element_quadraticcurve_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(PATH_Q_REL);
			setState(541);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(538);
				match(BLANK);
				}
				}
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(544);
			match(NUMBER);
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(545);
				match(BLANK);
				}
				}
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(551);
			match(NUMBER);
			setState(555);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(552);
				match(BLANK);
				}
				}
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(558);
			match(NUMBER);
			setState(562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(559);
				match(BLANK);
				}
				}
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(565);
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
		enterRule(_localctx, 38, RULE_path_element_quadraticcurve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			match(PATH_Q);
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
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(589);
				match(BLANK);
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(595);
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
		enterRule(_localctx, 40, RULE_path_element_quadraticreflectcurve_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(PATH_T_REL);
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
			match(NUMBER);
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(605);
				match(BLANK);
				}
				}
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(611);
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
		enterRule(_localctx, 42, RULE_path_element_quadraticreflectcurve);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(PATH_T);
			setState(617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(614);
				match(BLANK);
				}
				}
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(620);
			match(NUMBER);
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(621);
				match(BLANK);
				}
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(627);
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
		enterRule(_localctx, 44, RULE_path_element_arc_rel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(PATH_A_REL);
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(630);
				match(BLANK);
				}
				}
				setState(635);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(636);
			match(NUMBER);
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
			match(NUMBER);
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
			match(NUMBER);
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
			match(NUMBER);
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
			match(NUMBER);
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
			match(NUMBER);
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(672);
				match(BLANK);
				}
				}
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(678);
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
		enterRule(_localctx, 46, RULE_path_element_arc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(PATH_A);
			setState(684);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(681);
				match(BLANK);
				}
				}
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(687);
			match(NUMBER);
			setState(691);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(688);
				match(BLANK);
				}
				}
				setState(693);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(694);
			match(NUMBER);
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(695);
				match(BLANK);
				}
				}
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(701);
			match(NUMBER);
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BLANK) {
				{
				{
				setState(702);
				match(BLANK);
				}
				}
				setState(707);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(708);
			match(NUMBER);
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
			match(NUMBER);
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
			match(NUMBER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u02de\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\6\2\66\n\2\r\2\16\2\67\3\2\3\2\6\2<\n\2\r\2\16\2=\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\6\3H\n\3\r\3\16\3I\3\3\3\3\3\3\3\3\3\3\6\3Q\n"+
		"\3\r\3\16\3R\3\3\3\3\3\3\3\3\3\3\6\3Z\n\3\r\3\16\3[\3\3\3\3\3\3\3\3\3"+
		"\3\6\3c\n\3\r\3\16\3d\3\3\3\3\3\3\3\3\3\3\6\3l\n\3\r\3\16\3m\3\3\3\3\3"+
		"\3\3\3\3\3\6\3u\n\3\r\3\16\3v\3\3\3\3\3\3\3\3\3\3\6\3~\n\3\r\3\16\3\177"+
		"\3\3\7\3\u0083\n\3\f\3\16\3\u0086\13\3\3\3\3\3\3\3\3\3\3\3\6\3\u008d\n"+
		"\3\r\3\16\3\u008e\3\3\3\3\3\3\3\3\3\3\7\3\u0096\n\3\f\3\16\3\u0099\13"+
		"\3\3\3\3\3\6\3\u009d\n\3\r\3\16\3\u009e\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\6\3\u00a9\n\3\r\3\16\3\u00aa\3\3\3\3\3\3\3\3\3\3\6\3\u00b2\n\3\r\3"+
		"\16\3\u00b3\3\3\3\3\3\3\3\3\3\3\7\3\u00bb\n\3\f\3\16\3\u00be\13\3\3\3"+
		"\3\3\6\3\u00c2\n\3\r\3\16\3\u00c3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3"+
		"\u00ce\n\3\f\3\16\3\u00d1\13\3\3\3\3\3\6\3\u00d5\n\3\r\3\16\3\u00d6\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00e1\n\3\f\3\16\3\u00e4\13\3\3\3\3"+
		"\3\6\3\u00e8\n\3\r\3\16\3\u00e9\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u00f4"+
		"\n\3\f\3\16\3\u00f7\13\3\3\3\7\3\u00fa\n\3\f\3\16\3\u00fd\13\3\3\3\3\3"+
		"\3\3\3\3\7\3\u0103\n\3\f\3\16\3\u0106\13\3\3\3\5\3\u0109\n\3\3\4\3\4\6"+
		"\4\u010d\n\4\r\4\16\4\u010e\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\5\6\u0120\n\6\3\7\3\7\7\7\u0124\n\7\f\7\16\7\u0127"+
		"\13\7\3\7\3\7\7\7\u012b\n\7\f\7\16\7\u012e\13\7\3\7\3\7\3\b\3\b\7\b\u0134"+
		"\n\b\f\b\16\b\u0137\13\b\3\b\3\b\7\b\u013b\n\b\f\b\16\b\u013e\13\b\3\b"+
		"\3\b\3\t\3\t\7\t\u0144\n\t\f\t\16\t\u0147\13\t\3\t\3\t\7\t\u014b\n\t\f"+
		"\t\16\t\u014e\13\t\3\t\3\t\3\n\3\n\7\n\u0154\n\n\f\n\16\n\u0157\13\n\3"+
		"\n\3\n\7\n\u015b\n\n\f\n\16\n\u015e\13\n\3\n\3\n\3\13\3\13\7\13\u0164"+
		"\n\13\f\13\16\13\u0167\13\13\3\13\3\13\3\f\3\f\7\f\u016d\n\f\f\f\16\f"+
		"\u0170\13\f\3\f\3\f\3\r\3\r\7\r\u0176\n\r\f\r\16\r\u0179\13\r\3\r\3\r"+
		"\3\16\3\16\7\16\u017f\n\16\f\16\16\16\u0182\13\16\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\7\20\u018a\n\20\f\20\16\20\u018d\13\20\3\20\3\20\7\20\u0191"+
		"\n\20\f\20\16\20\u0194\13\20\3\20\3\20\7\20\u0198\n\20\f\20\16\20\u019b"+
		"\13\20\3\20\3\20\7\20\u019f\n\20\f\20\16\20\u01a2\13\20\3\20\3\20\7\20"+
		"\u01a6\n\20\f\20\16\20\u01a9\13\20\3\20\3\20\7\20\u01ad\n\20\f\20\16\20"+
		"\u01b0\13\20\3\20\3\20\3\21\3\21\7\21\u01b6\n\21\f\21\16\21\u01b9\13\21"+
		"\3\21\3\21\7\21\u01bd\n\21\f\21\16\21\u01c0\13\21\3\21\3\21\7\21\u01c4"+
		"\n\21\f\21\16\21\u01c7\13\21\3\21\3\21\7\21\u01cb\n\21\f\21\16\21\u01ce"+
		"\13\21\3\21\3\21\7\21\u01d2\n\21\f\21\16\21\u01d5\13\21\3\21\3\21\7\21"+
		"\u01d9\n\21\f\21\16\21\u01dc\13\21\3\21\3\21\3\22\3\22\7\22\u01e2\n\22"+
		"\f\22\16\22\u01e5\13\22\3\22\3\22\7\22\u01e9\n\22\f\22\16\22\u01ec\13"+
		"\22\3\22\3\22\7\22\u01f0\n\22\f\22\16\22\u01f3\13\22\3\22\3\22\7\22\u01f7"+
		"\n\22\f\22\16\22\u01fa\13\22\3\22\3\22\3\23\3\23\7\23\u0200\n\23\f\23"+
		"\16\23\u0203\13\23\3\23\3\23\7\23\u0207\n\23\f\23\16\23\u020a\13\23\3"+
		"\23\3\23\7\23\u020e\n\23\f\23\16\23\u0211\13\23\3\23\3\23\7\23\u0215\n"+
		"\23\f\23\16\23\u0218\13\23\3\23\3\23\3\24\3\24\7\24\u021e\n\24\f\24\16"+
		"\24\u0221\13\24\3\24\3\24\7\24\u0225\n\24\f\24\16\24\u0228\13\24\3\24"+
		"\3\24\7\24\u022c\n\24\f\24\16\24\u022f\13\24\3\24\3\24\7\24\u0233\n\24"+
		"\f\24\16\24\u0236\13\24\3\24\3\24\3\25\3\25\7\25\u023c\n\25\f\25\16\25"+
		"\u023f\13\25\3\25\3\25\7\25\u0243\n\25\f\25\16\25\u0246\13\25\3\25\3\25"+
		"\7\25\u024a\n\25\f\25\16\25\u024d\13\25\3\25\3\25\7\25\u0251\n\25\f\25"+
		"\16\25\u0254\13\25\3\25\3\25\3\26\3\26\7\26\u025a\n\26\f\26\16\26\u025d"+
		"\13\26\3\26\3\26\7\26\u0261\n\26\f\26\16\26\u0264\13\26\3\26\3\26\3\27"+
		"\3\27\7\27\u026a\n\27\f\27\16\27\u026d\13\27\3\27\3\27\7\27\u0271\n\27"+
		"\f\27\16\27\u0274\13\27\3\27\3\27\3\30\3\30\7\30\u027a\n\30\f\30\16\30"+
		"\u027d\13\30\3\30\3\30\7\30\u0281\n\30\f\30\16\30\u0284\13\30\3\30\3\30"+
		"\7\30\u0288\n\30\f\30\16\30\u028b\13\30\3\30\3\30\7\30\u028f\n\30\f\30"+
		"\16\30\u0292\13\30\3\30\3\30\7\30\u0296\n\30\f\30\16\30\u0299\13\30\3"+
		"\30\3\30\7\30\u029d\n\30\f\30\16\30\u02a0\13\30\3\30\3\30\7\30\u02a4\n"+
		"\30\f\30\16\30\u02a7\13\30\3\30\3\30\3\31\3\31\7\31\u02ad\n\31\f\31\16"+
		"\31\u02b0\13\31\3\31\3\31\7\31\u02b4\n\31\f\31\16\31\u02b7\13\31\3\31"+
		"\3\31\7\31\u02bb\n\31\f\31\16\31\u02be\13\31\3\31\3\31\7\31\u02c2\n\31"+
		"\f\31\16\31\u02c5\13\31\3\31\3\31\7\31\u02c9\n\31\f\31\16\31\u02cc\13"+
		"\31\3\31\3\31\7\31\u02d0\n\31\f\31\16\31\u02d3\13\31\3\31\3\31\7\31\u02d7"+
		"\n\31\f\31\16\31\u02da\13\31\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\2\3\3\2+,\2\u032f\2\62\3\2\2\2\4\u0108"+
		"\3\2\2\2\6\u010a\3\2\2\2\b\u0112\3\2\2\2\n\u011f\3\2\2\2\f\u0121\3\2\2"+
		"\2\16\u0131\3\2\2\2\20\u0141\3\2\2\2\22\u0151\3\2\2\2\24\u0161\3\2\2\2"+
		"\26\u016a\3\2\2\2\30\u0173\3\2\2\2\32\u017c\3\2\2\2\34\u0185\3\2\2\2\36"+
		"\u0187\3\2\2\2 \u01b3\3\2\2\2\"\u01df\3\2\2\2$\u01fd\3\2\2\2&\u021b\3"+
		"\2\2\2(\u0239\3\2\2\2*\u0257\3\2\2\2,\u0267\3\2\2\2.\u0277\3\2\2\2\60"+
		"\u02aa\3\2\2\2\62\63\7\7\2\2\63\65\7\t\2\2\64\66\5\b\5\2\65\64\3\2\2\2"+
		"\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\289\3\2\2\29;\7\31\2\2:<\5\4\3"+
		"\2;:\3\2\2\2<=\3\2\2\2=;\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\7\2\2@A\7\33"+
		"\2\2AB\7\t\2\2BC\7\31\2\2C\3\3\2\2\2DE\7\7\2\2EG\7\n\2\2FH\5\b\5\2GF\3"+
		"\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2KL\7\32\2\2L\u0109\3\2\2"+
		"\2MN\7\7\2\2NP\7\13\2\2OQ\5\b\5\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2"+
		"\2\2ST\3\2\2\2TU\7\32\2\2U\u0109\3\2\2\2VW\7\7\2\2WY\7\f\2\2XZ\5\b\5\2"+
		"YX\3\2\2\2Z[\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7\32\2\2^\u0109"+
		"\3\2\2\2_`\7\7\2\2`b\7\r\2\2ac\5\b\5\2ba\3\2\2\2cd\3\2\2\2db\3\2\2\2d"+
		"e\3\2\2\2ef\3\2\2\2fg\7\32\2\2g\u0109\3\2\2\2hi\7\7\2\2ik\7\16\2\2jl\5"+
		"\b\5\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7\32\2\2p\u0109"+
		"\3\2\2\2qr\7\7\2\2rt\7\17\2\2su\5\b\5\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2"+
		"vw\3\2\2\2wx\3\2\2\2xy\7\32\2\2y\u0109\3\2\2\2z{\7\7\2\2{}\7\20\2\2|~"+
		"\5\6\4\2}|\3\2\2\2~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0084"+
		"\3\2\2\2\u0081\u0083\5\b\5\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2"+
		"\2\2\u0087\u0088\7\32\2\2\u0088\u0109\3\2\2\2\u0089\u008a\7\7\2\2\u008a"+
		"\u008c\7\21\2\2\u008b\u008d\5\b\5\2\u008c\u008b\3\2\2\2\u008d\u008e\3"+
		"\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\7\32\2\2\u0091\u0109\3\2\2\2\u0092\u0093\7\7\2\2\u0093\u0097\7"+
		"\22\2\2\u0094\u0096\5\b\5\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2"+
		"\2\2\u009a\u009c\7\31\2\2\u009b\u009d\5\4\3\2\u009c\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\u00a1\7\7\2\2\u00a1\u00a2\7\33\2\2\u00a2\u00a3\7\22\2\2\u00a3"+
		"\u00a4\7\31\2\2\u00a4\u0109\3\2\2\2\u00a5\u00a6\7\7\2\2\u00a6\u00a8\7"+
		"\24\2\2\u00a7\u00a9\5\b\5\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\7\32"+
		"\2\2\u00ad\u0109\3\2\2\2\u00ae\u00af\7\7\2\2\u00af\u00b1\7\27\2\2\u00b0"+
		"\u00b2\5\b\5\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2"+
		"\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\7\32\2\2\u00b6"+
		"\u0109\3\2\2\2\u00b7\u00b8\7\7\2\2\u00b8\u00bc\7\23\2\2\u00b9\u00bb\5"+
		"\b\5\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c1\7\31"+
		"\2\2\u00c0\u00c2\5\4\3\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\7"+
		"\2\2\u00c6\u00c7\7\33\2\2\u00c7\u00c8\7\23\2\2\u00c8\u00c9\7\31\2\2\u00c9"+
		"\u0109\3\2\2\2\u00ca\u00cb\7\7\2\2\u00cb\u00cf\7\25\2\2\u00cc\u00ce\5"+
		"\b\5\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf"+
		"\u00d0\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d4\7\31"+
		"\2\2\u00d3\u00d5\5\4\3\2\u00d4\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\7\7"+
		"\2\2\u00d9\u00da\7\33\2\2\u00da\u00db\7\25\2\2\u00db\u00dc\7\31\2\2\u00dc"+
		"\u0109\3\2\2\2\u00dd\u00de\7\7\2\2\u00de\u00e2\7\26\2\2\u00df\u00e1\5"+
		"\b\5\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\7\31"+
		"\2\2\u00e6\u00e8\5\4\3\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7\7"+
		"\2\2\u00ec\u00ed\7\33\2\2\u00ed\u00ee\7\26\2\2\u00ee\u00ef\7\31\2\2\u00ef"+
		"\u0109\3\2\2\2\u00f0\u00f1\7\7\2\2\u00f1\u00f5\7\30\2\2\u00f2\u00f4\5"+
		"\b\5\2\u00f3\u00f2\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00fb\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\5\4"+
		"\3\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fe\u0109\7\31"+
		"\2\2\u00ff\u0100\7\7\2\2\u0100\u0104\7\30\2\2\u0101\u0103\5\b\5\2\u0102"+
		"\u0101\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2"+
		"\2\2\u0105\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\7\32\2\2\u0108"+
		"D\3\2\2\2\u0108M\3\2\2\2\u0108V\3\2\2\2\u0108_\3\2\2\2\u0108h\3\2\2\2"+
		"\u0108q\3\2\2\2\u0108z\3\2\2\2\u0108\u0089\3\2\2\2\u0108\u0092\3\2\2\2"+
		"\u0108\u00a5\3\2\2\2\u0108\u00ae\3\2\2\2\u0108\u00b7\3\2\2\2\u0108\u00ca"+
		"\3\2\2\2\u0108\u00dd\3\2\2\2\u0108\u00f0\3\2\2\2\u0108\u00ff\3\2\2\2\u0109"+
		"\5\3\2\2\2\u010a\u010c\7\35\2\2\u010b\u010d\5\n\6\2\u010c\u010b\3\2\2"+
		"\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110"+
		"\3\2\2\2\u0110\u0111\7!\2\2\u0111\7\3\2\2\2\u0112\u0113\7\30\2\2\u0113"+
		"\u0114\7\34\2\2\u0114\u0115\7\36\2\2\u0115\t\3\2\2\2\u0116\u0120\5\16"+
		"\b\2\u0117\u0120\5\f\7\2\u0118\u0120\5\20\t\2\u0119\u0120\5\22\n\2\u011a"+
		"\u0120\5\24\13\2\u011b\u0120\5\26\f\2\u011c\u0120\5\30\r\2\u011d\u0120"+
		"\5\32\16\2\u011e\u0120\5\34\17\2\u011f\u0116\3\2\2\2\u011f\u0117\3\2\2"+
		"\2\u011f\u0118\3\2\2\2\u011f\u0119\3\2\2\2\u011f\u011a\3\2\2\2\u011f\u011b"+
		"\3\2\2\2\u011f\u011c\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120"+
		"\13\3\2\2\2\u0121\u0125\7#\2\2\u0122\u0124\7\"\2\2\u0123\u0122\3\2\2\2"+
		"\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u012c\7\67\2\2\u0129\u012b\7\"\2\2"+
		"\u012a\u0129\3\2\2\2\u012b\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012f\3\2\2\2\u012e\u012c\3\2\2\2\u012f\u0130\7\67\2\2"+
		"\u0130\r\3\2\2\2\u0131\u0135\7$\2\2\u0132\u0134\7\"\2\2\u0133\u0132\3"+
		"\2\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013c\7\67\2\2\u0139\u013b\7"+
		"\"\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c\u013a\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u013c\3\2\2\2\u013f\u0140\7\67"+
		"\2\2\u0140\17\3\2\2\2\u0141\u0145\7%\2\2\u0142\u0144\7\"\2\2\u0143\u0142"+
		"\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2\2\2\u0146"+
		"\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014c\7\67\2\2\u0149\u014b\7"+
		"\"\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7\67"+
		"\2\2\u0150\21\3\2\2\2\u0151\u0155\7&\2\2\u0152\u0154\7\"\2\2\u0153\u0152"+
		"\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156"+
		"\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015c\7\67\2\2\u0159\u015b\7"+
		"\"\2\2\u015a\u0159\3\2\2\2\u015b\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015c"+
		"\u015d\3\2\2\2\u015d\u015f\3\2\2\2\u015e\u015c\3\2\2\2\u015f\u0160\7\67"+
		"\2\2\u0160\23\3\2\2\2\u0161\u0165\7\'\2\2\u0162\u0164\7\"\2\2\u0163\u0162"+
		"\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7\67\2\2\u0169\25\3\2\2"+
		"\2\u016a\u016e\7(\2\2\u016b\u016d\7\"\2\2\u016c\u016b\3\2\2\2\u016d\u0170"+
		"\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170"+
		"\u016e\3\2\2\2\u0171\u0172\7\67\2\2\u0172\27\3\2\2\2\u0173\u0177\7)\2"+
		"\2\u0174\u0176\7\"\2\2\u0175\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175"+
		"\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a"+
		"\u017b\7\67\2\2\u017b\31\3\2\2\2\u017c\u0180\7*\2\2\u017d\u017f\7\"\2"+
		"\2\u017e\u017d\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181"+
		"\3\2\2\2\u0181\u0183\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0184\7\67\2\2"+
		"\u0184\33\3\2\2\2\u0185\u0186\t\2\2\2\u0186\35\3\2\2\2\u0187\u018b\7-"+
		"\2\2\u0188\u018a\7\"\2\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018e\u0192\7\67\2\2\u018f\u0191\7\"\2\2\u0190\u018f\3\2\2\2\u0191"+
		"\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0195\3\2"+
		"\2\2\u0194\u0192\3\2\2\2\u0195\u0199\7\67\2\2\u0196\u0198\7\"\2\2\u0197"+
		"\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2"+
		"\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u01a0\7\67\2\2\u019d"+
		"\u019f\7\"\2\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2"+
		"\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3"+
		"\u01a7\7\67\2\2\u01a4\u01a6\7\"\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a9\3"+
		"\2\2\2\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01aa\3\2\2\2\u01a9"+
		"\u01a7\3\2\2\2\u01aa\u01ae\7\67\2\2\u01ab\u01ad\7\"\2\2\u01ac\u01ab\3"+
		"\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af"+
		"\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1\u01b2\7\67\2\2\u01b2\37\3\2\2"+
		"\2\u01b3\u01b7\7.\2\2\u01b4\u01b6\7\"\2\2\u01b5\u01b4\3\2\2\2\u01b6\u01b9"+
		"\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01ba\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01ba\u01be\7\67\2\2\u01bb\u01bd\7\"\2\2\u01bc\u01bb\3"+
		"\2\2\2\u01bd\u01c0\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf"+
		"\u01c1\3\2\2\2\u01c0\u01be\3\2\2\2\u01c1\u01c5\7\67\2\2\u01c2\u01c4\7"+
		"\"\2\2\u01c3\u01c2\3\2\2\2\u01c4\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5"+
		"\u01c6\3\2\2\2\u01c6\u01c8\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01cc\7\67"+
		"\2\2\u01c9\u01cb\7\"\2\2\u01ca\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd\u01cf\3\2\2\2\u01ce\u01cc\3\2"+
		"\2\2\u01cf\u01d3\7\67\2\2\u01d0\u01d2\7\"\2\2\u01d1\u01d0\3\2\2\2\u01d2"+
		"\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d6\3\2"+
		"\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01da\7\67\2\2\u01d7\u01d9\7\"\2\2\u01d8"+
		"\u01d7\3\2\2\2\u01d9\u01dc\3\2\2\2\u01da\u01d8\3\2\2\2\u01da\u01db\3\2"+
		"\2\2\u01db\u01dd\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01de\7\67\2\2\u01de"+
		"!\3\2\2\2\u01df\u01e3\7/\2\2\u01e0\u01e2\7\"\2\2\u01e1\u01e0\3\2\2\2\u01e2"+
		"\u01e5\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e6\3\2"+
		"\2\2\u01e5\u01e3\3\2\2\2\u01e6\u01ea\7\67\2\2\u01e7\u01e9\7\"\2\2\u01e8"+
		"\u01e7\3\2\2\2\u01e9\u01ec\3\2\2\2\u01ea\u01e8\3\2\2\2\u01ea\u01eb\3\2"+
		"\2\2\u01eb\u01ed\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ed\u01f1\7\67\2\2\u01ee"+
		"\u01f0\7\"\2\2\u01ef\u01ee\3\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2"+
		"\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4"+
		"\u01f8\7\67\2\2\u01f5\u01f7\7\"\2\2\u01f6\u01f5\3\2\2\2\u01f7\u01fa\3"+
		"\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\3\2\2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fb\u01fc\7\67\2\2\u01fc#\3\2\2\2\u01fd\u0201\7\60\2"+
		"\2\u01fe\u0200\7\"\2\2\u01ff\u01fe\3\2\2\2\u0200\u0203\3\2\2\2\u0201\u01ff"+
		"\3\2\2\2\u0201\u0202\3\2\2\2\u0202\u0204\3\2\2\2\u0203\u0201\3\2\2\2\u0204"+
		"\u0208\7\67\2\2\u0205\u0207\7\"\2\2\u0206\u0205\3\2\2\2\u0207\u020a\3"+
		"\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209\3\2\2\2\u0209\u020b\3\2\2\2\u020a"+
		"\u0208\3\2\2\2\u020b\u020f\7\67\2\2\u020c\u020e\7\"\2\2\u020d\u020c\3"+
		"\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210\3\2\2\2\u0210"+
		"\u0212\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u0216\7\67\2\2\u0213\u0215\7"+
		"\"\2\2\u0214\u0213\3\2\2\2\u0215\u0218\3\2\2\2\u0216\u0214\3\2\2\2\u0216"+
		"\u0217\3\2\2\2\u0217\u0219\3\2\2\2\u0218\u0216\3\2\2\2\u0219\u021a\7\67"+
		"\2\2\u021a%\3\2\2\2\u021b\u021f\7\61\2\2\u021c\u021e\7\"\2\2\u021d\u021c"+
		"\3\2\2\2\u021e\u0221\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220\3\2\2\2\u0220"+
		"\u0222\3\2\2\2\u0221\u021f\3\2\2\2\u0222\u0226\7\67\2\2\u0223\u0225\7"+
		"\"\2\2\u0224\u0223\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226"+
		"\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u022d\7\67"+
		"\2\2\u022a\u022c\7\"\2\2\u022b\u022a\3\2\2\2\u022c\u022f\3\2\2\2\u022d"+
		"\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u0230\3\2\2\2\u022f\u022d\3\2"+
		"\2\2\u0230\u0234\7\67\2\2\u0231\u0233\7\"\2\2\u0232\u0231\3\2\2\2\u0233"+
		"\u0236\3\2\2\2\u0234\u0232\3\2\2\2\u0234\u0235\3\2\2\2\u0235\u0237\3\2"+
		"\2\2\u0236\u0234\3\2\2\2\u0237\u0238\7\67\2\2\u0238\'\3\2\2\2\u0239\u023d"+
		"\7\62\2\2\u023a\u023c\7\"\2\2\u023b\u023a\3\2\2\2\u023c\u023f\3\2\2\2"+
		"\u023d\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0240\3\2\2\2\u023f\u023d"+
		"\3\2\2\2\u0240\u0244\7\67\2\2\u0241\u0243\7\"\2\2\u0242\u0241\3\2\2\2"+
		"\u0243\u0246\3\2\2\2\u0244\u0242\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247"+
		"\3\2\2\2\u0246\u0244\3\2\2\2\u0247\u024b\7\67\2\2\u0248\u024a\7\"\2\2"+
		"\u0249\u0248\3\2\2\2\u024a\u024d\3\2\2\2\u024b\u0249\3\2\2\2\u024b\u024c"+
		"\3\2\2\2\u024c\u024e\3\2\2\2\u024d\u024b\3\2\2\2\u024e\u0252\7\67\2\2"+
		"\u024f\u0251\7\"\2\2\u0250\u024f\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250"+
		"\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0255\3\2\2\2\u0254\u0252\3\2\2\2\u0255"+
		"\u0256\7\67\2\2\u0256)\3\2\2\2\u0257\u025b\7\63\2\2\u0258\u025a\7\"\2"+
		"\2\u0259\u0258\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c"+
		"\3\2\2\2\u025c\u025e\3\2\2\2\u025d\u025b\3\2\2\2\u025e\u0262\7\67\2\2"+
		"\u025f\u0261\7\"\2\2\u0260\u025f\3\2\2\2\u0261\u0264\3\2\2\2\u0262\u0260"+
		"\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0265\3\2\2\2\u0264\u0262\3\2\2\2\u0265"+
		"\u0266\7\67\2\2\u0266+\3\2\2\2\u0267\u026b\7\64\2\2\u0268\u026a\7\"\2"+
		"\2\u0269\u0268\3\2\2\2\u026a\u026d\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c"+
		"\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u026b\3\2\2\2\u026e\u0272\7\67\2\2"+
		"\u026f\u0271\7\"\2\2\u0270\u026f\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270"+
		"\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0275\3\2\2\2\u0274\u0272\3\2\2\2\u0275"+
		"\u0276\7\67\2\2\u0276-\3\2\2\2\u0277\u027b\7\65\2\2\u0278\u027a\7\"\2"+
		"\2\u0279\u0278\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3\2\2\2\u027b\u027c"+
		"\3\2\2\2\u027c\u027e\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u0282\7\67\2\2"+
		"\u027f\u0281\7\"\2\2\u0280\u027f\3\2\2\2\u0281\u0284\3\2\2\2\u0282\u0280"+
		"\3\2\2\2\u0282\u0283\3\2\2\2\u0283\u0285\3\2\2\2\u0284\u0282\3\2\2\2\u0285"+
		"\u0289\7\67\2\2\u0286\u0288\7\"\2\2\u0287\u0286\3\2\2\2\u0288\u028b\3"+
		"\2\2\2\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\3\2\2\2\u028b"+
		"\u0289\3\2\2\2\u028c\u0290\7\67\2\2\u028d\u028f\7\"\2\2\u028e\u028d\3"+
		"\2\2\2\u028f\u0292\3\2\2\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291"+
		"\u0293\3\2\2\2\u0292\u0290\3\2\2\2\u0293\u0297\7\67\2\2\u0294\u0296\7"+
		"\"\2\2\u0295\u0294\3\2\2\2\u0296\u0299\3\2\2\2\u0297\u0295\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298\u029a\3\2\2\2\u0299\u0297\3\2\2\2\u029a\u029e\7\67"+
		"\2\2\u029b\u029d\7\"\2\2\u029c\u029b\3\2\2\2\u029d\u02a0\3\2\2\2\u029e"+
		"\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a1\3\2\2\2\u02a0\u029e\3\2"+
		"\2\2\u02a1\u02a5\7\67\2\2\u02a2\u02a4\7\"\2\2\u02a3\u02a2\3\2\2\2\u02a4"+
		"\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6\u02a8\3\2"+
		"\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a9\7\67\2\2\u02a9/\3\2\2\2\u02aa\u02ae"+
		"\7\66\2\2\u02ab\u02ad\7\"\2\2\u02ac\u02ab\3\2\2\2\u02ad\u02b0\3\2\2\2"+
		"\u02ae\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2\u02af\u02b1\3\2\2\2\u02b0\u02ae"+
		"\3\2\2\2\u02b1\u02b5\7\67\2\2\u02b2\u02b4\7\"\2\2\u02b3\u02b2\3\2\2\2"+
		"\u02b4\u02b7\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b8"+
		"\3\2\2\2\u02b7\u02b5\3\2\2\2\u02b8\u02bc\7\67\2\2\u02b9\u02bb\7\"\2\2"+
		"\u02ba\u02b9\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd"+
		"\3\2\2\2\u02bd\u02bf\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c3\7\67\2\2"+
		"\u02c0\u02c2\7\"\2\2\u02c1\u02c0\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1"+
		"\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c6\3\2\2\2\u02c5\u02c3\3\2\2\2\u02c6"+
		"\u02ca\7\67\2\2\u02c7\u02c9\7\"\2\2\u02c8\u02c7\3\2\2\2\u02c9\u02cc\3"+
		"\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2\2\2\u02cc"+
		"\u02ca\3\2\2\2\u02cd\u02d1\7\67\2\2\u02ce\u02d0\7\"\2\2\u02cf\u02ce\3"+
		"\2\2\2\u02d0\u02d3\3\2\2\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02d4\3\2\2\2\u02d3\u02d1\3\2\2\2\u02d4\u02d8\7\67\2\2\u02d5\u02d7\7"+
		"\"\2\2\u02d6\u02d5\3\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8"+
		"\u02d9\3\2\2\2\u02d9\u02db\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02dc\7\67"+
		"\2\2\u02dc\61\3\2\2\2W\67=IR[dmv\177\u0084\u008e\u0097\u009e\u00aa\u00b3"+
		"\u00bc\u00c3\u00cf\u00d6\u00e2\u00e9\u00f5\u00fb\u0104\u0108\u010e\u011f"+
		"\u0125\u012c\u0135\u013c\u0145\u014c\u0155\u015c\u0165\u016e\u0177\u0180"+
		"\u018b\u0192\u0199\u01a0\u01a7\u01ae\u01b7\u01be\u01c5\u01cc\u01d3\u01da"+
		"\u01e3\u01ea\u01f1\u01f8\u0201\u0208\u020f\u0216\u021f\u0226\u022d\u0234"+
		"\u023d\u0244\u024b\u0252\u025b\u0262\u026b\u0272\u027b\u0282\u0289\u0290"+
		"\u0297\u029e\u02a5\u02ae\u02b5\u02bc\u02c3\u02ca\u02d1\u02d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}