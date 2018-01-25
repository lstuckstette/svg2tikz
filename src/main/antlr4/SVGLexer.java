// Generated from SVGLexer.g4 by ANTLR 4.7.1

package main.antlr4;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SVGLexer extends Lexer {
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
		INSIDE=1, PATHATTRIBUTE=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE", "PATHATTRIBUTE"
	};

	public static final String[] ruleNames = {
		"WS", "COMMENT", "XML_DECL", "DOCTYPE", "OPEN", "TEXT", "NAME_SVG", "NAME_CIRCLE", 
		"NAME_RECT", "NAME_ELLIPSE", "NAME_LINE", "NAME_POLYGON", "NAME_POLYLINE", 
		"NAME_PATH", "NAME_TEXT", "NAME_G", "NAME_DEFS", "NAME_FILTER", "NAME_LINEARGRADIENT", 
		"NAME_RADIALGRADIENT", "NAME_STOP", "NAME", "CLOSE", "SLASH_CLOSE", "SLASH", 
		"EQUALS", "PATH_ATTRIBUTE", "STRING", "WS_INSIDE", "COMMENT_INSIDE", "ATTRIBUTECLOSE", 
		"BLANK", "PATH_M_REL", "PATH_M", "PATH_L_REL", "PATH_L", "PATH_H_REL", 
		"PATH_H", "PATH_V_REL", "PATH_V", "PATH_Z_REL", "PATH_Z", "PATH_C_REL", 
		"PATH_C", "PATH_S_REL", "PATH_S", "PATH_Q_REL", "PATH_Q", "PATH_T_REL", 
		"PATH_T", "PATH_A_REL", "PATH_A", "WS_PATH", "UNARY_OPERATOR", "UNSIGNED_INT", 
		"UNSIGNED_FLOAT", "Exponent"
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


	public SVGLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SVGLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u01c2\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\6\2y\n"+
		"\2\r\2\16\2z\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0085\n\3\f\3\16\3\u0088"+
		"\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0097\n"+
		"\4\f\4\16\4\u009a\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u00a5\n"+
		"\5\f\5\16\5\u00a8\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\6\7\u00b3\n"+
		"\7\r\7\16\7\u00b4\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\6\27\u0121\n\27\r\27\16\27\u0122\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\7\35\u013a\n\35\f\35\16\35\u013d\13\35\3"+
		"\35\3\35\3\36\6\36\u0142\n\36\r\36\16\36\u0143\3\36\3\36\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\7\37\u014e\n\37\f\37\16\37\u0151\13\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3"+
		"\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\6\66\u0188\n\66\r\66"+
		"\16\66\u0189\3\66\3\66\3\67\3\67\38\38\38\78\u0193\n8\f8\168\u0196\13"+
		"8\58\u0198\n8\39\69\u019b\n9\r9\169\u019c\39\39\79\u01a1\n9\f9\169\u01a4"+
		"\139\39\59\u01a7\n9\39\39\69\u01ab\n9\r9\169\u01ac\39\59\u01b0\n9\39\6"+
		"9\u01b3\n9\r9\169\u01b4\39\59\u01b8\n9\3:\3:\5:\u01bc\n:\3:\6:\u01bf\n"+
		":\r:\16:\u01c0\6\u0086\u0098\u00a6\u014f\2;\5\3\7\4\t\5\13\6\r\7\17\b"+
		"\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26"+
		"-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U"+
		"+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8q9s:u\2\5\2\3\4\t\5\2\13\f"+
		"\17\17\"\"\4\2((>>\6\2//\62<C\\c|\4\2$$>>\4\2\"\"..\4\2--//\4\2GGgg\2"+
		"\u01d4\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\3\21\3\2\2\2\3\23\3\2\2\2\3\25\3\2\2\2\3\27\3\2\2\2\3\31\3"+
		"\2\2\2\3\33\3\2\2\2\3\35\3\2\2\2\3\37\3\2\2\2\3!\3\2\2\2\3#\3\2\2\2\3"+
		"%\3\2\2\2\3\'\3\2\2\2\3)\3\2\2\2\3+\3\2\2\2\3-\3\2\2\2\3/\3\2\2\2\3\61"+
		"\3\2\2\2\3\63\3\2\2\2\3\65\3\2\2\2\3\67\3\2\2\2\39\3\2\2\2\3;\3\2\2\2"+
		"\3=\3\2\2\2\3?\3\2\2\2\4A\3\2\2\2\4C\3\2\2\2\4E\3\2\2\2\4G\3\2\2\2\4I"+
		"\3\2\2\2\4K\3\2\2\2\4M\3\2\2\2\4O\3\2\2\2\4Q\3\2\2\2\4S\3\2\2\2\4U\3\2"+
		"\2\2\4W\3\2\2\2\4Y\3\2\2\2\4[\3\2\2\2\4]\3\2\2\2\4_\3\2\2\2\4a\3\2\2\2"+
		"\4c\3\2\2\2\4e\3\2\2\2\4g\3\2\2\2\4i\3\2\2\2\4k\3\2\2\2\4m\3\2\2\2\4o"+
		"\3\2\2\2\4q\3\2\2\2\4s\3\2\2\2\5x\3\2\2\2\7~\3\2\2\2\t\u008f\3\2\2\2\13"+
		"\u00a0\3\2\2\2\r\u00ad\3\2\2\2\17\u00b2\3\2\2\2\21\u00b6\3\2\2\2\23\u00ba"+
		"\3\2\2\2\25\u00c1\3\2\2\2\27\u00c6\3\2\2\2\31\u00ce\3\2\2\2\33\u00d3\3"+
		"\2\2\2\35\u00db\3\2\2\2\37\u00e4\3\2\2\2!\u00e9\3\2\2\2#\u00ee\3\2\2\2"+
		"%\u00f0\3\2\2\2\'\u00f5\3\2\2\2)\u00fc\3\2\2\2+\u010b\3\2\2\2-\u011a\3"+
		"\2\2\2/\u0120\3\2\2\2\61\u0124\3\2\2\2\63\u0128\3\2\2\2\65\u012d\3\2\2"+
		"\2\67\u012f\3\2\2\29\u0131\3\2\2\2;\u0137\3\2\2\2=\u0141\3\2\2\2?\u0147"+
		"\3\2\2\2A\u0158\3\2\2\2C\u015c\3\2\2\2E\u015e\3\2\2\2G\u0160\3\2\2\2I"+
		"\u0162\3\2\2\2K\u0164\3\2\2\2M\u0166\3\2\2\2O\u0168\3\2\2\2Q\u016a\3\2"+
		"\2\2S\u016c\3\2\2\2U\u016e\3\2\2\2W\u0170\3\2\2\2Y\u0172\3\2\2\2[\u0174"+
		"\3\2\2\2]\u0176\3\2\2\2_\u0178\3\2\2\2a\u017a\3\2\2\2c\u017c\3\2\2\2e"+
		"\u017e\3\2\2\2g\u0180\3\2\2\2i\u0182\3\2\2\2k\u0184\3\2\2\2m\u0187\3\2"+
		"\2\2o\u018d\3\2\2\2q\u0197\3\2\2\2s\u01b7\3\2\2\2u\u01b9\3\2\2\2wy\t\2"+
		"\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\2\2\2}\6\3"+
		"\2\2\2~\177\7>\2\2\177\u0080\7#\2\2\u0080\u0081\7/\2\2\u0081\u0082\7/"+
		"\2\2\u0082\u0086\3\2\2\2\u0083\u0085\13\2\2\2\u0084\u0083\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0089\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7/\2\2\u008a\u008b\7/\2\2\u008b\u008c"+
		"\7@\2\2\u008c\u008d\3\2\2\2\u008d\u008e\b\3\2\2\u008e\b\3\2\2\2\u008f"+
		"\u0090\7>\2\2\u0090\u0091\7A\2\2\u0091\u0092\7z\2\2\u0092\u0093\7o\2\2"+
		"\u0093\u0094\7n\2\2\u0094\u0098\3\2\2\2\u0095\u0097\13\2\2\2\u0096\u0095"+
		"\3\2\2\2\u0097\u009a\3\2\2\2\u0098\u0099\3\2\2\2\u0098\u0096\3\2\2\2\u0099"+
		"\u009b\3\2\2\2\u009a\u0098\3\2\2\2\u009b\u009c\7A\2\2\u009c\u009d\7@\2"+
		"\2\u009d\u009e\3\2\2\2\u009e\u009f\b\4\2\2\u009f\n\3\2\2\2\u00a0\u00a1"+
		"\7>\2\2\u00a1\u00a2\7#\2\2\u00a2\u00a6\3\2\2\2\u00a3\u00a5\13\2\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a6\u00a4\3\2"+
		"\2\2\u00a7\u00a9\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7@\2\2\u00aa"+
		"\u00ab\3\2\2\2\u00ab\u00ac\b\5\2\2\u00ac\f\3\2\2\2\u00ad\u00ae\7>\2\2"+
		"\u00ae\u00af\3\2\2\2\u00af\u00b0\b\6\3\2\u00b0\16\3\2\2\2\u00b1\u00b3"+
		"\n\3\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\20\3\2\2\2\u00b6\u00b7\7u\2\2\u00b7\u00b8\7x\2\2"+
		"\u00b8\u00b9\7i\2\2\u00b9\22\3\2\2\2\u00ba\u00bb\7e\2\2\u00bb\u00bc\7"+
		"k\2\2\u00bc\u00bd\7t\2\2\u00bd\u00be\7e\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0"+
		"\7g\2\2\u00c0\24\3\2\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4"+
		"\7e\2\2\u00c4\u00c5\7v\2\2\u00c5\26\3\2\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8"+
		"\7n\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7r\2\2\u00cb"+
		"\u00cc\7u\2\2\u00cc\u00cd\7g\2\2\u00cd\30\3\2\2\2\u00ce\u00cf\7n\2\2\u00cf"+
		"\u00d0\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7g\2\2\u00d2\32\3\2\2\2\u00d3"+
		"\u00d4\7r\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7n\2\2\u00d6\u00d7\7{\2\2"+
		"\u00d7\u00d8\7i\2\2\u00d8\u00d9\7q\2\2\u00d9\u00da\7p\2\2\u00da\34\3\2"+
		"\2\2\u00db\u00dc\7r\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7n\2\2\u00de\u00df"+
		"\7{\2\2\u00df\u00e0\7n\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7p\2\2\u00e2"+
		"\u00e3\7g\2\2\u00e3\36\3\2\2\2\u00e4\u00e5\7r\2\2\u00e5\u00e6\7c\2\2\u00e6"+
		"\u00e7\7v\2\2\u00e7\u00e8\7j\2\2\u00e8 \3\2\2\2\u00e9\u00ea\7v\2\2\u00ea"+
		"\u00eb\7g\2\2\u00eb\u00ec\7z\2\2\u00ec\u00ed\7v\2\2\u00ed\"\3\2\2\2\u00ee"+
		"\u00ef\7i\2\2\u00ef$\3\2\2\2\u00f0\u00f1\7f\2\2\u00f1\u00f2\7g\2\2\u00f2"+
		"\u00f3\7h\2\2\u00f3\u00f4\7u\2\2\u00f4&\3\2\2\2\u00f5\u00f6\7h\2\2\u00f6"+
		"\u00f7\7k\2\2\u00f7\u00f8\7n\2\2\u00f8\u00f9\7v\2\2\u00f9\u00fa\7g\2\2"+
		"\u00fa\u00fb\7t\2\2\u00fb(\3\2\2\2\u00fc\u00fd\7n\2\2\u00fd\u00fe\7k\2"+
		"\2\u00fe\u00ff\7p\2\2\u00ff\u0100\7g\2\2\u0100\u0101\7c\2\2\u0101\u0102"+
		"\7t\2\2\u0102\u0103\7I\2\2\u0103\u0104\7t\2\2\u0104\u0105\7c\2\2\u0105"+
		"\u0106\7f\2\2\u0106\u0107\7k\2\2\u0107\u0108\7g\2\2\u0108\u0109\7p\2\2"+
		"\u0109\u010a\7v\2\2\u010a*\3\2\2\2\u010b\u010c\7t\2\2\u010c\u010d\7c\2"+
		"\2\u010d\u010e\7f\2\2\u010e\u010f\7k\2\2\u010f\u0110\7c\2\2\u0110\u0111"+
		"\7n\2\2\u0111\u0112\7I\2\2\u0112\u0113\7t\2\2\u0113\u0114\7c\2\2\u0114"+
		"\u0115\7f\2\2\u0115\u0116\7k\2\2\u0116\u0117\7g\2\2\u0117\u0118\7p\2\2"+
		"\u0118\u0119\7v\2\2\u0119,\3\2\2\2\u011a\u011b\7u\2\2\u011b\u011c\7v\2"+
		"\2\u011c\u011d\7q\2\2\u011d\u011e\7r\2\2\u011e.\3\2\2\2\u011f\u0121\t"+
		"\4\2\2\u0120\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0120\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\60\3\2\2\2\u0124\u0125\7@\2\2\u0125\u0126\3\2\2\2"+
		"\u0126\u0127\b\30\4\2\u0127\62\3\2\2\2\u0128\u0129\7\61\2\2\u0129\u012a"+
		"\7@\2\2\u012a\u012b\3\2\2\2\u012b\u012c\b\31\4\2\u012c\64\3\2\2\2\u012d"+
		"\u012e\7\61\2\2\u012e\66\3\2\2\2\u012f\u0130\7?\2\2\u01308\3\2\2\2\u0131"+
		"\u0132\7f\2\2\u0132\u0133\7?\2\2\u0133\u0134\7$\2\2\u0134\u0135\3\2\2"+
		"\2\u0135\u0136\b\34\5\2\u0136:\3\2\2\2\u0137\u013b\7$\2\2\u0138\u013a"+
		"\n\5\2\2\u0139\u0138\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b"+
		"\u013c\3\2\2\2\u013c\u013e\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u013f\7$"+
		"\2\2\u013f<\3\2\2\2\u0140\u0142\t\2\2\2\u0141\u0140\3\2\2\2\u0142\u0143"+
		"\3\2\2\2\u0143\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145"+
		"\u0146\b\36\2\2\u0146>\3\2\2\2\u0147\u0148\7>\2\2\u0148\u0149\7#\2\2\u0149"+
		"\u014a\7/\2\2\u014a\u014b\7/\2\2\u014b\u014f\3\2\2\2\u014c\u014e\13\2"+
		"\2\2\u014d\u014c\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u0150\3\2\2\2\u014f"+
		"\u014d\3\2\2\2\u0150\u0152\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0153\7/"+
		"\2\2\u0153\u0154\7/\2\2\u0154\u0155\7@\2\2\u0155\u0156\3\2\2\2\u0156\u0157"+
		"\b\37\2\2\u0157@\3\2\2\2\u0158\u0159\7$\2\2\u0159\u015a\3\2\2\2\u015a"+
		"\u015b\b \4\2\u015bB\3\2\2\2\u015c\u015d\t\6\2\2\u015dD\3\2\2\2\u015e"+
		"\u015f\7o\2\2\u015fF\3\2\2\2\u0160\u0161\7O\2\2\u0161H\3\2\2\2\u0162\u0163"+
		"\7n\2\2\u0163J\3\2\2\2\u0164\u0165\7N\2\2\u0165L\3\2\2\2\u0166\u0167\7"+
		"j\2\2\u0167N\3\2\2\2\u0168\u0169\7J\2\2\u0169P\3\2\2\2\u016a\u016b\7x"+
		"\2\2\u016bR\3\2\2\2\u016c\u016d\7X\2\2\u016dT\3\2\2\2\u016e\u016f\7|\2"+
		"\2\u016fV\3\2\2\2\u0170\u0171\7\\\2\2\u0171X\3\2\2\2\u0172\u0173\7e\2"+
		"\2\u0173Z\3\2\2\2\u0174\u0175\7E\2\2\u0175\\\3\2\2\2\u0176\u0177\7u\2"+
		"\2\u0177^\3\2\2\2\u0178\u0179\7U\2\2\u0179`\3\2\2\2\u017a\u017b\7s\2\2"+
		"\u017bb\3\2\2\2\u017c\u017d\7S\2\2\u017dd\3\2\2\2\u017e\u017f\7v\2\2\u017f"+
		"f\3\2\2\2\u0180\u0181\7V\2\2\u0181h\3\2\2\2\u0182\u0183\7c\2\2\u0183j"+
		"\3\2\2\2\u0184\u0185\7C\2\2\u0185l\3\2\2\2\u0186\u0188\t\2\2\2\u0187\u0186"+
		"\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b\u018c\b\66\2\2\u018cn\3\2\2\2\u018d\u018e\t\7\2\2"+
		"\u018ep\3\2\2\2\u018f\u0198\7\62\2\2\u0190\u0194\4\63;\2\u0191\u0193\4"+
		"\62;\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3\2\2\2\u0194"+
		"\u0195\3\2\2\2\u0195\u0198\3\2\2\2\u0196\u0194\3\2\2\2\u0197\u018f\3\2"+
		"\2\2\u0197\u0190\3\2\2\2\u0198r\3\2\2\2\u0199\u019b\4\62;\2\u019a\u0199"+
		"\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019a\3\2\2\2\u019c\u019d\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u01a2\7\60\2\2\u019f\u01a1\4\62;\2\u01a0\u019f\3"+
		"\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3"+
		"\u01a6\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a7\5u:\2\u01a6\u01a5\3\2\2"+
		"\2\u01a6\u01a7\3\2\2\2\u01a7\u01b8\3\2\2\2\u01a8\u01aa\7\60\2\2\u01a9"+
		"\u01ab\4\62;\2\u01aa\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01aa\3\2"+
		"\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\3\2\2\2\u01ae\u01b0\5u:\2\u01af\u01ae"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b8\3\2\2\2\u01b1\u01b3\4\62;\2\u01b2"+
		"\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2"+
		"\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\5u:\2\u01b7\u019a\3\2\2\2\u01b7\u01a8"+
		"\3\2\2\2\u01b7\u01b2\3\2\2\2\u01b8t\3\2\2\2\u01b9\u01bb\t\b\2\2\u01ba"+
		"\u01bc\t\7\2\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2"+
		"\2\2\u01bd\u01bf\4\62;\2\u01be\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0"+
		"\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1v\3\2\2\2\32\2\3\4z\u0086\u0098"+
		"\u00a6\u00b4\u0122\u013b\u0143\u014f\u0189\u0194\u0197\u019c\u01a2\u01a6"+
		"\u01ac\u01af\u01b4\u01b7\u01bb\u01c0\6\b\2\2\7\3\2\6\2\2\7\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}