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
		PATH_Z=42, PATH_C_REL=43, PATH_C=44, PATH_S_REL=45, PATH_S=46, NUMBER=47;
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
		"PATH_C", "PATH_S_REL", "PATH_S", "NUMBER", "INT", "FLOAT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'<'", null, "'svg'", "'circle'", "'rect'", 
		"'ellipse'", "'line'", "'polygon'", "'polyline'", "'path'", "'text'", 
		"'g'", "'defs'", "'filter'", "'linearGradient'", "'radialGradient'", "'stop'", 
		null, "'>'", "'/>'", "'/'", "'='", "'d=\"'", null, null, null, "'\"'", 
		null, "'m'", "'M'", "'l'", "'L'", "'h'", "'H'", "'v'", "'V'", "'z'", "'Z'", 
		"'c'", "'C'", "'s'", "'S'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "XML_DECL", "DOCTYPE", "OPEN", "TEXT", "NAME_SVG", 
		"NAME_CIRCLE", "NAME_RECT", "NAME_ELLIPSE", "NAME_LINE", "NAME_POLYGON", 
		"NAME_POLYLINE", "NAME_PATH", "NAME_TEXT", "NAME_G", "NAME_DEFS", "NAME_FILTER", 
		"NAME_LINEARGRADIENT", "NAME_RADIALGRADIENT", "NAME_STOP", "NAME", "CLOSE", 
		"SLASH_CLOSE", "SLASH", "EQUALS", "PATH_ATTRIBUTE", "STRING", "WS_INSIDE", 
		"COMMENT_INSIDE", "ATTRIBUTECLOSE", "BLANK", "PATH_M_REL", "PATH_M", "PATH_L_REL", 
		"PATH_L", "PATH_H_REL", "PATH_H", "PATH_V_REL", "PATH_V", "PATH_Z_REL", 
		"PATH_Z", "PATH_C_REL", "PATH_C", "PATH_S_REL", "PATH_S", "NUMBER"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u017e\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t"+
		"\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4"+
		"*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\6"+
		"\2i\n\2\r\2\16\2j\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3u\n\3\f\3\16\3x\13"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0087\n\4\f"+
		"\4\16\4\u008a\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u0095\n\5\f"+
		"\5\16\5\u0098\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\6\7\u00a3\n\7\r"+
		"\7\16\7\u00a4\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\6\27\u0111\n\27\r\27\16\27\u0112\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\7\35\u012a\n\35\f\35\16\35\u012d\13\35\3\35\3"+
		"\35\3\36\6\36\u0132\n\36\r\36\16\36\u0133\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\7\37\u013e\n\37\f\37\16\37\u0141\13\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3"+
		"(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\5\60\u016d\n"+
		"\60\3\61\6\61\u0170\n\61\r\61\16\61\u0171\3\62\6\62\u0175\n\62\r\62\16"+
		"\62\u0176\3\62\3\62\6\62\u017b\n\62\r\62\16\62\u017c\6v\u0088\u0096\u013f"+
		"\2\63\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17"+
		"\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36"+
		"=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,Y-[.]/_\60a\61c\2e\2\5\2\3\4\b\5\2\13"+
		"\f\17\17\"\"\4\2((>>\6\2//\62<C\\c|\4\2$$>>\4\2\"\"..\3\2\62;\2\u0186"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\3\21\3\2\2\2\3\23\3\2\2\2\3\25\3\2\2\2\3\27\3\2\2\2\3\31\3\2\2\2"+
		"\3\33\3\2\2\2\3\35\3\2\2\2\3\37\3\2\2\2\3!\3\2\2\2\3#\3\2\2\2\3%\3\2\2"+
		"\2\3\'\3\2\2\2\3)\3\2\2\2\3+\3\2\2\2\3-\3\2\2\2\3/\3\2\2\2\3\61\3\2\2"+
		"\2\3\63\3\2\2\2\3\65\3\2\2\2\3\67\3\2\2\2\39\3\2\2\2\3;\3\2\2\2\3=\3\2"+
		"\2\2\3?\3\2\2\2\4A\3\2\2\2\4C\3\2\2\2\4E\3\2\2\2\4G\3\2\2\2\4I\3\2\2\2"+
		"\4K\3\2\2\2\4M\3\2\2\2\4O\3\2\2\2\4Q\3\2\2\2\4S\3\2\2\2\4U\3\2\2\2\4W"+
		"\3\2\2\2\4Y\3\2\2\2\4[\3\2\2\2\4]\3\2\2\2\4_\3\2\2\2\4a\3\2\2\2\5h\3\2"+
		"\2\2\7n\3\2\2\2\t\177\3\2\2\2\13\u0090\3\2\2\2\r\u009d\3\2\2\2\17\u00a2"+
		"\3\2\2\2\21\u00a6\3\2\2\2\23\u00aa\3\2\2\2\25\u00b1\3\2\2\2\27\u00b6\3"+
		"\2\2\2\31\u00be\3\2\2\2\33\u00c3\3\2\2\2\35\u00cb\3\2\2\2\37\u00d4\3\2"+
		"\2\2!\u00d9\3\2\2\2#\u00de\3\2\2\2%\u00e0\3\2\2\2\'\u00e5\3\2\2\2)\u00ec"+
		"\3\2\2\2+\u00fb\3\2\2\2-\u010a\3\2\2\2/\u0110\3\2\2\2\61\u0114\3\2\2\2"+
		"\63\u0118\3\2\2\2\65\u011d\3\2\2\2\67\u011f\3\2\2\29\u0121\3\2\2\2;\u0127"+
		"\3\2\2\2=\u0131\3\2\2\2?\u0137\3\2\2\2A\u0148\3\2\2\2C\u014c\3\2\2\2E"+
		"\u014e\3\2\2\2G\u0150\3\2\2\2I\u0152\3\2\2\2K\u0154\3\2\2\2M\u0156\3\2"+
		"\2\2O\u0158\3\2\2\2Q\u015a\3\2\2\2S\u015c\3\2\2\2U\u015e\3\2\2\2W\u0160"+
		"\3\2\2\2Y\u0162\3\2\2\2[\u0164\3\2\2\2]\u0166\3\2\2\2_\u0168\3\2\2\2a"+
		"\u016c\3\2\2\2c\u016f\3\2\2\2e\u0174\3\2\2\2gi\t\2\2\2hg\3\2\2\2ij\3\2"+
		"\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\b\2\2\2m\6\3\2\2\2no\7>\2\2op\7#"+
		"\2\2pq\7/\2\2qr\7/\2\2rv\3\2\2\2su\13\2\2\2ts\3\2\2\2ux\3\2\2\2vw\3\2"+
		"\2\2vt\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7/\2\2z{\7/\2\2{|\7@\2\2|}\3\2\2"+
		"\2}~\b\3\2\2~\b\3\2\2\2\177\u0080\7>\2\2\u0080\u0081\7A\2\2\u0081\u0082"+
		"\7z\2\2\u0082\u0083\7o\2\2\u0083\u0084\7n\2\2\u0084\u0088\3\2\2\2\u0085"+
		"\u0087\13\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\7A\2\2\u008c\u008d\7@\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\4\2"+
		"\2\u008f\n\3\2\2\2\u0090\u0091\7>\2\2\u0091\u0092\7#\2\2\u0092\u0096\3"+
		"\2\2\2\u0093\u0095\13\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\u009a\7@\2\2\u009a\u009b\3\2\2\2\u009b\u009c\b\5\2\2\u009c"+
		"\f\3\2\2\2\u009d\u009e\7>\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\6\3\2"+
		"\u00a0\16\3\2\2\2\u00a1\u00a3\n\3\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4"+
		"\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\20\3\2\2\2\u00a6"+
		"\u00a7\7u\2\2\u00a7\u00a8\7x\2\2\u00a8\u00a9\7i\2\2\u00a9\22\3\2\2\2\u00aa"+
		"\u00ab\7e\2\2\u00ab\u00ac\7k\2\2\u00ac\u00ad\7t\2\2\u00ad\u00ae\7e\2\2"+
		"\u00ae\u00af\7n\2\2\u00af\u00b0\7g\2\2\u00b0\24\3\2\2\2\u00b1\u00b2\7"+
		"t\2\2\u00b2\u00b3\7g\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7v\2\2\u00b5\26"+
		"\3\2\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7n\2\2\u00b9"+
		"\u00ba\7k\2\2\u00ba\u00bb\7r\2\2\u00bb\u00bc\7u\2\2\u00bc\u00bd\7g\2\2"+
		"\u00bd\30\3\2\2\2\u00be\u00bf\7n\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7"+
		"p\2\2\u00c1\u00c2\7g\2\2\u00c2\32\3\2\2\2\u00c3\u00c4\7r\2\2\u00c4\u00c5"+
		"\7q\2\2\u00c5\u00c6\7n\2\2\u00c6\u00c7\7{\2\2\u00c7\u00c8\7i\2\2\u00c8"+
		"\u00c9\7q\2\2\u00c9\u00ca\7p\2\2\u00ca\34\3\2\2\2\u00cb\u00cc\7r\2\2\u00cc"+
		"\u00cd\7q\2\2\u00cd\u00ce\7n\2\2\u00ce\u00cf\7{\2\2\u00cf\u00d0\7n\2\2"+
		"\u00d0\u00d1\7k\2\2\u00d1\u00d2\7p\2\2\u00d2\u00d3\7g\2\2\u00d3\36\3\2"+
		"\2\2\u00d4\u00d5\7r\2\2\u00d5\u00d6\7c\2\2\u00d6\u00d7\7v\2\2\u00d7\u00d8"+
		"\7j\2\2\u00d8 \3\2\2\2\u00d9\u00da\7v\2\2\u00da\u00db\7g\2\2\u00db\u00dc"+
		"\7z\2\2\u00dc\u00dd\7v\2\2\u00dd\"\3\2\2\2\u00de\u00df\7i\2\2\u00df$\3"+
		"\2\2\2\u00e0\u00e1\7f\2\2\u00e1\u00e2\7g\2\2\u00e2\u00e3\7h\2\2\u00e3"+
		"\u00e4\7u\2\2\u00e4&\3\2\2\2\u00e5\u00e6\7h\2\2\u00e6\u00e7\7k\2\2\u00e7"+
		"\u00e8\7n\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb\7t\2\2"+
		"\u00eb(\3\2\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7p\2"+
		"\2\u00ef\u00f0\7g\2\2\u00f0\u00f1\7c\2\2\u00f1\u00f2\7t\2\2\u00f2\u00f3"+
		"\7I\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7c\2\2\u00f5\u00f6\7f\2\2\u00f6"+
		"\u00f7\7k\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa\7v\2\2"+
		"\u00fa*\3\2\2\2\u00fb\u00fc\7t\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7f\2"+
		"\2\u00fe\u00ff\7k\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7n\2\2\u0101\u0102"+
		"\7I\2\2\u0102\u0103\7t\2\2\u0103\u0104\7c\2\2\u0104\u0105\7f\2\2\u0105"+
		"\u0106\7k\2\2\u0106\u0107\7g\2\2\u0107\u0108\7p\2\2\u0108\u0109\7v\2\2"+
		"\u0109,\3\2\2\2\u010a\u010b\7u\2\2\u010b\u010c\7v\2\2\u010c\u010d\7q\2"+
		"\2\u010d\u010e\7r\2\2\u010e.\3\2\2\2\u010f\u0111\t\4\2\2\u0110\u010f\3"+
		"\2\2\2\u0111\u0112\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113"+
		"\60\3\2\2\2\u0114\u0115\7@\2\2\u0115\u0116\3\2\2\2\u0116\u0117\b\30\4"+
		"\2\u0117\62\3\2\2\2\u0118\u0119\7\61\2\2\u0119\u011a\7@\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u011c\b\31\4\2\u011c\64\3\2\2\2\u011d\u011e\7\61\2\2\u011e"+
		"\66\3\2\2\2\u011f\u0120\7?\2\2\u01208\3\2\2\2\u0121\u0122\7f\2\2\u0122"+
		"\u0123\7?\2\2\u0123\u0124\7$\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b\34"+
		"\5\2\u0126:\3\2\2\2\u0127\u012b\7$\2\2\u0128\u012a\n\5\2\2\u0129\u0128"+
		"\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c"+
		"\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u012f\7$\2\2\u012f<\3\2\2\2\u0130"+
		"\u0132\t\2\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0131\3\2"+
		"\2\2\u0133\u0134\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\b\36\2\2\u0136"+
		">\3\2\2\2\u0137\u0138\7>\2\2\u0138\u0139\7#\2\2\u0139\u013a\7/\2\2\u013a"+
		"\u013b\7/\2\2\u013b\u013f\3\2\2\2\u013c\u013e\13\2\2\2\u013d\u013c\3\2"+
		"\2\2\u013e\u0141\3\2\2\2\u013f\u0140\3\2\2\2\u013f\u013d\3\2\2\2\u0140"+
		"\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142\u0143\7/\2\2\u0143\u0144\7/\2"+
		"\2\u0144\u0145\7@\2\2\u0145\u0146\3\2\2\2\u0146\u0147\b\37\2\2\u0147@"+
		"\3\2\2\2\u0148\u0149\7$\2\2\u0149\u014a\3\2\2\2\u014a\u014b\b \4\2\u014b"+
		"B\3\2\2\2\u014c\u014d\t\6\2\2\u014dD\3\2\2\2\u014e\u014f\7o\2\2\u014f"+
		"F\3\2\2\2\u0150\u0151\7O\2\2\u0151H\3\2\2\2\u0152\u0153\7n\2\2\u0153J"+
		"\3\2\2\2\u0154\u0155\7N\2\2\u0155L\3\2\2\2\u0156\u0157\7j\2\2\u0157N\3"+
		"\2\2\2\u0158\u0159\7J\2\2\u0159P\3\2\2\2\u015a\u015b\7x\2\2\u015bR\3\2"+
		"\2\2\u015c\u015d\7X\2\2\u015dT\3\2\2\2\u015e\u015f\7|\2\2\u015fV\3\2\2"+
		"\2\u0160\u0161\7\\\2\2\u0161X\3\2\2\2\u0162\u0163\7e\2\2\u0163Z\3\2\2"+
		"\2\u0164\u0165\7E\2\2\u0165\\\3\2\2\2\u0166\u0167\7u\2\2\u0167^\3\2\2"+
		"\2\u0168\u0169\7U\2\2\u0169`\3\2\2\2\u016a\u016d\5c\61\2\u016b\u016d\5"+
		"e\62\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2\u016db\3\2\2\2\u016e\u0170"+
		"\t\7\2\2\u016f\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u016f\3\2\2\2\u0171"+
		"\u0172\3\2\2\2\u0172d\3\2\2\2\u0173\u0175\5c\61\2\u0174\u0173\3\2\2\2"+
		"\u0175\u0176\3\2\2\2\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u0178"+
		"\3\2\2\2\u0178\u017a\7\60\2\2\u0179\u017b\5c\61\2\u017a\u0179\3\2\2\2"+
		"\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017df\3"+
		"\2\2\2\22\2\3\4jv\u0088\u0096\u00a4\u0112\u012b\u0133\u013f\u016c\u0171"+
		"\u0176\u017c\6\b\2\2\7\3\2\6\2\2\7\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}