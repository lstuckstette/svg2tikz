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
		NUMBER=54, INT=55, FLOAT=56;
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
		"PATH_T", "PATH_A_REL", "PATH_A", "WS_PATH", "NUMBER", "INT", "FLOAT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2:\u01b5\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63"+
		"\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\3\2\6\2w\n\2\r\2"+
		"\16\2x\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0083\n\3\f\3\16\3\u0086\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0095\n\4\f"+
		"\4\16\4\u0098\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u00a3\n\5\f"+
		"\5\16\5\u00a6\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\6\7\u00b1\n\7\r"+
		"\7\16\7\u00b2\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\6\27\u011f\n\27\r\27\16\27\u0120\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\7\35\u0138\n\35\f\35\16\35\u013b\13\35\3\35\3"+
		"\35\3\36\6\36\u0140\n\36\r\36\16\36\u0141\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\7\37\u014c\n\37\f\37\16\37\u014f\13\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\6\66\u0186\n\66\r\66\16\66\u0187"+
		"\3\66\3\66\3\67\3\67\5\67\u018e\n\67\38\68\u0191\n8\r8\168\u0192\38\3"+
		"8\78\u0197\n8\f8\168\u019a\138\58\u019c\n8\39\69\u019f\n9\r9\169\u01a0"+
		"\39\39\69\u01a5\n9\r9\169\u01a6\39\69\u01aa\n9\r9\169\u01ab\39\39\69\u01b0"+
		"\n9\r9\169\u01b1\59\u01b4\n9\6\u0084\u0096\u00a4\u014d\2:\5\3\7\4\t\5"+
		"\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23"+
		"\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I"+
		"%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o8q9s:\5\2\3\4\b"+
		"\5\2\13\f\17\17\"\"\4\2((>>\6\2//\62<C\\c|\4\2$$>>\4\2\"\"..\3\2\62;\2"+
		"\u01c5\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\3\21\3\2\2\2\3\23\3\2\2\2\3\25\3\2\2\2\3\27\3\2\2\2\3\31\3"+
		"\2\2\2\3\33\3\2\2\2\3\35\3\2\2\2\3\37\3\2\2\2\3!\3\2\2\2\3#\3\2\2\2\3"+
		"%\3\2\2\2\3\'\3\2\2\2\3)\3\2\2\2\3+\3\2\2\2\3-\3\2\2\2\3/\3\2\2\2\3\61"+
		"\3\2\2\2\3\63\3\2\2\2\3\65\3\2\2\2\3\67\3\2\2\2\39\3\2\2\2\3;\3\2\2\2"+
		"\3=\3\2\2\2\3?\3\2\2\2\4A\3\2\2\2\4C\3\2\2\2\4E\3\2\2\2\4G\3\2\2\2\4I"+
		"\3\2\2\2\4K\3\2\2\2\4M\3\2\2\2\4O\3\2\2\2\4Q\3\2\2\2\4S\3\2\2\2\4U\3\2"+
		"\2\2\4W\3\2\2\2\4Y\3\2\2\2\4[\3\2\2\2\4]\3\2\2\2\4_\3\2\2\2\4a\3\2\2\2"+
		"\4c\3\2\2\2\4e\3\2\2\2\4g\3\2\2\2\4i\3\2\2\2\4k\3\2\2\2\4m\3\2\2\2\4o"+
		"\3\2\2\2\4q\3\2\2\2\4s\3\2\2\2\5v\3\2\2\2\7|\3\2\2\2\t\u008d\3\2\2\2\13"+
		"\u009e\3\2\2\2\r\u00ab\3\2\2\2\17\u00b0\3\2\2\2\21\u00b4\3\2\2\2\23\u00b8"+
		"\3\2\2\2\25\u00bf\3\2\2\2\27\u00c4\3\2\2\2\31\u00cc\3\2\2\2\33\u00d1\3"+
		"\2\2\2\35\u00d9\3\2\2\2\37\u00e2\3\2\2\2!\u00e7\3\2\2\2#\u00ec\3\2\2\2"+
		"%\u00ee\3\2\2\2\'\u00f3\3\2\2\2)\u00fa\3\2\2\2+\u0109\3\2\2\2-\u0118\3"+
		"\2\2\2/\u011e\3\2\2\2\61\u0122\3\2\2\2\63\u0126\3\2\2\2\65\u012b\3\2\2"+
		"\2\67\u012d\3\2\2\29\u012f\3\2\2\2;\u0135\3\2\2\2=\u013f\3\2\2\2?\u0145"+
		"\3\2\2\2A\u0156\3\2\2\2C\u015a\3\2\2\2E\u015c\3\2\2\2G\u015e\3\2\2\2I"+
		"\u0160\3\2\2\2K\u0162\3\2\2\2M\u0164\3\2\2\2O\u0166\3\2\2\2Q\u0168\3\2"+
		"\2\2S\u016a\3\2\2\2U\u016c\3\2\2\2W\u016e\3\2\2\2Y\u0170\3\2\2\2[\u0172"+
		"\3\2\2\2]\u0174\3\2\2\2_\u0176\3\2\2\2a\u0178\3\2\2\2c\u017a\3\2\2\2e"+
		"\u017c\3\2\2\2g\u017e\3\2\2\2i\u0180\3\2\2\2k\u0182\3\2\2\2m\u0185\3\2"+
		"\2\2o\u018d\3\2\2\2q\u019b\3\2\2\2s\u01b3\3\2\2\2uw\t\2\2\2vu\3\2\2\2"+
		"wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\b\2\2\2{\6\3\2\2\2|}\7>\2\2"+
		"}~\7#\2\2~\177\7/\2\2\177\u0080\7/\2\2\u0080\u0084\3\2\2\2\u0081\u0083"+
		"\13\2\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0084\u0082\3\2\2\2\u0085\u0087\3\2\2\2\u0086\u0084\3\2\2\2\u0087\u0088"+
		"\7/\2\2\u0088\u0089\7/\2\2\u0089\u008a\7@\2\2\u008a\u008b\3\2\2\2\u008b"+
		"\u008c\b\3\2\2\u008c\b\3\2\2\2\u008d\u008e\7>\2\2\u008e\u008f\7A\2\2\u008f"+
		"\u0090\7z\2\2\u0090\u0091\7o\2\2\u0091\u0092\7n\2\2\u0092\u0096\3\2\2"+
		"\2\u0093\u0095\13\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009a\7A\2\2\u009a\u009b\7@\2\2\u009b\u009c\3\2\2\2\u009c\u009d"+
		"\b\4\2\2\u009d\n\3\2\2\2\u009e\u009f\7>\2\2\u009f\u00a0\7#\2\2\u00a0\u00a4"+
		"\3\2\2\2\u00a1\u00a3\13\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a6\3\2\2\2"+
		"\u00a4\u00a5\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a7\u00a8\7@\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00aa\b\5\2\2\u00aa"+
		"\f\3\2\2\2\u00ab\u00ac\7>\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\b\6\3\2"+
		"\u00ae\16\3\2\2\2\u00af\u00b1\n\3\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\20\3\2\2\2\u00b4"+
		"\u00b5\7u\2\2\u00b5\u00b6\7x\2\2\u00b6\u00b7\7i\2\2\u00b7\22\3\2\2\2\u00b8"+
		"\u00b9\7e\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7t\2\2\u00bb\u00bc\7e\2\2"+
		"\u00bc\u00bd\7n\2\2\u00bd\u00be\7g\2\2\u00be\24\3\2\2\2\u00bf\u00c0\7"+
		"t\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7e\2\2\u00c2\u00c3\7v\2\2\u00c3\26"+
		"\3\2\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7n\2\2\u00c7"+
		"\u00c8\7k\2\2\u00c8\u00c9\7r\2\2\u00c9\u00ca\7u\2\2\u00ca\u00cb\7g\2\2"+
		"\u00cb\30\3\2\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7"+
		"p\2\2\u00cf\u00d0\7g\2\2\u00d0\32\3\2\2\2\u00d1\u00d2\7r\2\2\u00d2\u00d3"+
		"\7q\2\2\u00d3\u00d4\7n\2\2\u00d4\u00d5\7{\2\2\u00d5\u00d6\7i\2\2\u00d6"+
		"\u00d7\7q\2\2\u00d7\u00d8\7p\2\2\u00d8\34\3\2\2\2\u00d9\u00da\7r\2\2\u00da"+
		"\u00db\7q\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7{\2\2\u00dd\u00de\7n\2\2"+
		"\u00de\u00df\7k\2\2\u00df\u00e0\7p\2\2\u00e0\u00e1\7g\2\2\u00e1\36\3\2"+
		"\2\2\u00e2\u00e3\7r\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6"+
		"\7j\2\2\u00e6 \3\2\2\2\u00e7\u00e8\7v\2\2\u00e8\u00e9\7g\2\2\u00e9\u00ea"+
		"\7z\2\2\u00ea\u00eb\7v\2\2\u00eb\"\3\2\2\2\u00ec\u00ed\7i\2\2\u00ed$\3"+
		"\2\2\2\u00ee\u00ef\7f\2\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7h\2\2\u00f1"+
		"\u00f2\7u\2\2\u00f2&\3\2\2\2\u00f3\u00f4\7h\2\2\u00f4\u00f5\7k\2\2\u00f5"+
		"\u00f6\7n\2\2\u00f6\u00f7\7v\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7t\2\2"+
		"\u00f9(\3\2\2\2\u00fa\u00fb\7n\2\2\u00fb\u00fc\7k\2\2\u00fc\u00fd\7p\2"+
		"\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7c\2\2\u00ff\u0100\7t\2\2\u0100\u0101"+
		"\7I\2\2\u0101\u0102\7t\2\2\u0102\u0103\7c\2\2\u0103\u0104\7f\2\2\u0104"+
		"\u0105\7k\2\2\u0105\u0106\7g\2\2\u0106\u0107\7p\2\2\u0107\u0108\7v\2\2"+
		"\u0108*\3\2\2\2\u0109\u010a\7t\2\2\u010a\u010b\7c\2\2\u010b\u010c\7f\2"+
		"\2\u010c\u010d\7k\2\2\u010d\u010e\7c\2\2\u010e\u010f\7n\2\2\u010f\u0110"+
		"\7I\2\2\u0110\u0111\7t\2\2\u0111\u0112\7c\2\2\u0112\u0113\7f\2\2\u0113"+
		"\u0114\7k\2\2\u0114\u0115\7g\2\2\u0115\u0116\7p\2\2\u0116\u0117\7v\2\2"+
		"\u0117,\3\2\2\2\u0118\u0119\7u\2\2\u0119\u011a\7v\2\2\u011a\u011b\7q\2"+
		"\2\u011b\u011c\7r\2\2\u011c.\3\2\2\2\u011d\u011f\t\4\2\2\u011e\u011d\3"+
		"\2\2\2\u011f\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\60\3\2\2\2\u0122\u0123\7@\2\2\u0123\u0124\3\2\2\2\u0124\u0125\b\30\4"+
		"\2\u0125\62\3\2\2\2\u0126\u0127\7\61\2\2\u0127\u0128\7@\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u012a\b\31\4\2\u012a\64\3\2\2\2\u012b\u012c\7\61\2\2\u012c"+
		"\66\3\2\2\2\u012d\u012e\7?\2\2\u012e8\3\2\2\2\u012f\u0130\7f\2\2\u0130"+
		"\u0131\7?\2\2\u0131\u0132\7$\2\2\u0132\u0133\3\2\2\2\u0133\u0134\b\34"+
		"\5\2\u0134:\3\2\2\2\u0135\u0139\7$\2\2\u0136\u0138\n\5\2\2\u0137\u0136"+
		"\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7$\2\2\u013d<\3\2\2\2\u013e"+
		"\u0140\t\2\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u013f\3\2"+
		"\2\2\u0141\u0142\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u0144\b\36\2\2\u0144"+
		">\3\2\2\2\u0145\u0146\7>\2\2\u0146\u0147\7#\2\2\u0147\u0148\7/\2\2\u0148"+
		"\u0149\7/\2\2\u0149\u014d\3\2\2\2\u014a\u014c\13\2\2\2\u014b\u014a\3\2"+
		"\2\2\u014c\u014f\3\2\2\2\u014d\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e"+
		"\u0150\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\7/\2\2\u0151\u0152\7/\2"+
		"\2\u0152\u0153\7@\2\2\u0153\u0154\3\2\2\2\u0154\u0155\b\37\2\2\u0155@"+
		"\3\2\2\2\u0156\u0157\7$\2\2\u0157\u0158\3\2\2\2\u0158\u0159\b \4\2\u0159"+
		"B\3\2\2\2\u015a\u015b\t\6\2\2\u015bD\3\2\2\2\u015c\u015d\7o\2\2\u015d"+
		"F\3\2\2\2\u015e\u015f\7O\2\2\u015fH\3\2\2\2\u0160\u0161\7n\2\2\u0161J"+
		"\3\2\2\2\u0162\u0163\7N\2\2\u0163L\3\2\2\2\u0164\u0165\7j\2\2\u0165N\3"+
		"\2\2\2\u0166\u0167\7J\2\2\u0167P\3\2\2\2\u0168\u0169\7x\2\2\u0169R\3\2"+
		"\2\2\u016a\u016b\7X\2\2\u016bT\3\2\2\2\u016c\u016d\7|\2\2\u016dV\3\2\2"+
		"\2\u016e\u016f\7\\\2\2\u016fX\3\2\2\2\u0170\u0171\7e\2\2\u0171Z\3\2\2"+
		"\2\u0172\u0173\7E\2\2\u0173\\\3\2\2\2\u0174\u0175\7u\2\2\u0175^\3\2\2"+
		"\2\u0176\u0177\7U\2\2\u0177`\3\2\2\2\u0178\u0179\7s\2\2\u0179b\3\2\2\2"+
		"\u017a\u017b\7S\2\2\u017bd\3\2\2\2\u017c\u017d\7v\2\2\u017df\3\2\2\2\u017e"+
		"\u017f\7V\2\2\u017fh\3\2\2\2\u0180\u0181\7c\2\2\u0181j\3\2\2\2\u0182\u0183"+
		"\7C\2\2\u0183l\3\2\2\2\u0184\u0186\t\2\2\2\u0185\u0184\3\2\2\2\u0186\u0187"+
		"\3\2\2\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u018a\b\66\2\2\u018an\3\2\2\2\u018b\u018e\5q8\2\u018c\u018e\5s9\2\u018d"+
		"\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018ep\3\2\2\2\u018f\u0191\t\7\2\2"+
		"\u0190\u018f\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193"+
		"\3\2\2\2\u0193\u019c\3\2\2\2\u0194\u0198\7/\2\2\u0195\u0197\t\7\2\2\u0196"+
		"\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198\u0199\3\2"+
		"\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u0190\3\2\2\2\u019b"+
		"\u0194\3\2\2\2\u019cr\3\2\2\2\u019d\u019f\5q8\2\u019e\u019d\3\2\2\2\u019f"+
		"\u01a0\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a2\3\2"+
		"\2\2\u01a2\u01a4\7\60\2\2\u01a3\u01a5\5q8\2\u01a4\u01a3\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01b4\3\2"+
		"\2\2\u01a8\u01aa\5q8\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01a9"+
		"\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01af\7g\2\2\u01ae"+
		"\u01b0\5q8\2\u01af\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01af\3\2\2"+
		"\2\u01b1\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u019e\3\2\2\2\u01b3\u01a9"+
		"\3\2\2\2\u01b4t\3\2\2\2\30\2\3\4x\u0084\u0096\u00a4\u00b2\u0120\u0139"+
		"\u0141\u014d\u0187\u018d\u0192\u0198\u019b\u01a0\u01a6\u01ab\u01b1\u01b3"+
		"\6\b\2\2\7\3\2\6\2\2\7\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}