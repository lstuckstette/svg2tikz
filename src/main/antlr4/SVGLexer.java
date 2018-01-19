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
		SLASH=25, EQUALS=26, STRING=27, WS_INSIDE=28, COMMENT_INSIDE=29;
	public static final int
		INSIDE=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "INSIDE"
	};

	public static final String[] ruleNames = {
		"WS", "COMMENT", "XML_DECL", "DOCTYPE", "OPEN", "TEXT", "NAME_SVG", "NAME_CIRCLE", 
		"NAME_RECT", "NAME_ELLIPSE", "NAME_LINE", "NAME_POLYGON", "NAME_POLYLINE", 
		"NAME_PATH", "NAME_TEXT", "NAME_G", "NAME_DEFS", "NAME_FILTER", "NAME_LINEARGRADIENT", 
		"NAME_RADIALGRADIENT", "NAME_STOP", "NAME", "CLOSE", "SLASH_CLOSE", "SLASH", 
		"EQUALS", "STRING", "WS_INSIDE", "COMMENT_INSIDE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'<'", null, "'svg'", "'circle'", "'rect'", 
		"'ellipse'", "'line'", "'polygon'", "'polyline'", "'path'", "'text'", 
		"'g'", "'defs'", "'filter'", "'linearGradient'", "'radialGradient'", "'stop'", 
		null, "'>'", "'/>'", "'/'", "'='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "COMMENT", "XML_DECL", "DOCTYPE", "OPEN", "TEXT", "NAME_SVG", 
		"NAME_CIRCLE", "NAME_RECT", "NAME_ELLIPSE", "NAME_LINE", "NAME_POLYGON", 
		"NAME_POLYLINE", "NAME_PATH", "NAME_TEXT", "NAME_G", "NAME_DEFS", "NAME_FILTER", 
		"NAME_LINEARGRADIENT", "NAME_RADIALGRADIENT", "NAME_STOP", "NAME", "CLOSE", 
		"SLASH_CLOSE", "SLASH", "EQUALS", "STRING", "WS_INSIDE", "COMMENT_INSIDE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u0122\b\1\b\1"+
		"\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t"+
		"\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4"+
		"\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4"+
		"\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\6\2@\n"+
		"\2\r\2\16\2A\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3L\n\3\f\3\16\3O\13\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4^\n\4\f\4\16\4a"+
		"\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5l\n\5\f\5\16\5o\13\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\6\7z\n\7\r\7\16\7{\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\6\27\u00e8"+
		"\n\27\r\27\16\27\u00e9\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\7\34\u00fb\n\34\f\34\16\34\u00fe\13\34\3"+
		"\34\3\34\3\34\7\34\u0103\n\34\f\34\16\34\u0106\13\34\3\34\5\34\u0109\n"+
		"\34\3\35\6\35\u010c\n\35\r\35\16\35\u010d\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\7\36\u0118\n\36\f\36\16\36\u011b\13\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\6M_m\u0119\2\37\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26"+
		"\f\30\r\32\16\34\17\36\20 \21\"\22$\23&\24(\25*\26,\27.\30\60\31\62\32"+
		"\64\33\66\348\35:\36<\37\4\2\3\7\5\2\13\f\17\17\"\"\4\2((>>\6\2//<<C\\"+
		"c|\4\2$$>>\4\2))>>\2\u012b\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2"+
		"\2\2\2\f\3\2\2\2\2\16\3\2\2\2\3\20\3\2\2\2\3\22\3\2\2\2\3\24\3\2\2\2\3"+
		"\26\3\2\2\2\3\30\3\2\2\2\3\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2\3 \3\2"+
		"\2\2\3\"\3\2\2\2\3$\3\2\2\2\3&\3\2\2\2\3(\3\2\2\2\3*\3\2\2\2\3,\3\2\2"+
		"\2\3.\3\2\2\2\3\60\3\2\2\2\3\62\3\2\2\2\3\64\3\2\2\2\3\66\3\2\2\2\38\3"+
		"\2\2\2\3:\3\2\2\2\3<\3\2\2\2\4?\3\2\2\2\6E\3\2\2\2\bV\3\2\2\2\ng\3\2\2"+
		"\2\ft\3\2\2\2\16y\3\2\2\2\20}\3\2\2\2\22\u0081\3\2\2\2\24\u0088\3\2\2"+
		"\2\26\u008d\3\2\2\2\30\u0095\3\2\2\2\32\u009a\3\2\2\2\34\u00a2\3\2\2\2"+
		"\36\u00ab\3\2\2\2 \u00b0\3\2\2\2\"\u00b5\3\2\2\2$\u00b7\3\2\2\2&\u00bc"+
		"\3\2\2\2(\u00c3\3\2\2\2*\u00d2\3\2\2\2,\u00e1\3\2\2\2.\u00e7\3\2\2\2\60"+
		"\u00eb\3\2\2\2\62\u00ef\3\2\2\2\64\u00f4\3\2\2\2\66\u00f6\3\2\2\28\u0108"+
		"\3\2\2\2:\u010b\3\2\2\2<\u0111\3\2\2\2>@\t\2\2\2?>\3\2\2\2@A\3\2\2\2A"+
		"?\3\2\2\2AB\3\2\2\2BC\3\2\2\2CD\b\2\2\2D\5\3\2\2\2EF\7>\2\2FG\7#\2\2G"+
		"H\7/\2\2HI\7/\2\2IM\3\2\2\2JL\13\2\2\2KJ\3\2\2\2LO\3\2\2\2MN\3\2\2\2M"+
		"K\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7/\2\2QR\7/\2\2RS\7@\2\2ST\3\2\2\2TU\b"+
		"\3\2\2U\7\3\2\2\2VW\7>\2\2WX\7A\2\2XY\7z\2\2YZ\7o\2\2Z[\7n\2\2[_\3\2\2"+
		"\2\\^\13\2\2\2]\\\3\2\2\2^a\3\2\2\2_`\3\2\2\2_]\3\2\2\2`b\3\2\2\2a_\3"+
		"\2\2\2bc\7A\2\2cd\7@\2\2de\3\2\2\2ef\b\4\2\2f\t\3\2\2\2gh\7>\2\2hi\7#"+
		"\2\2im\3\2\2\2jl\13\2\2\2kj\3\2\2\2lo\3\2\2\2mn\3\2\2\2mk\3\2\2\2np\3"+
		"\2\2\2om\3\2\2\2pq\7@\2\2qr\3\2\2\2rs\b\5\2\2s\13\3\2\2\2tu\7>\2\2uv\3"+
		"\2\2\2vw\b\6\3\2w\r\3\2\2\2xz\n\3\2\2yx\3\2\2\2z{\3\2\2\2{y\3\2\2\2{|"+
		"\3\2\2\2|\17\3\2\2\2}~\7u\2\2~\177\7x\2\2\177\u0080\7i\2\2\u0080\21\3"+
		"\2\2\2\u0081\u0082\7e\2\2\u0082\u0083\7k\2\2\u0083\u0084\7t\2\2\u0084"+
		"\u0085\7e\2\2\u0085\u0086\7n\2\2\u0086\u0087\7g\2\2\u0087\23\3\2\2\2\u0088"+
		"\u0089\7t\2\2\u0089\u008a\7g\2\2\u008a\u008b\7e\2\2\u008b\u008c\7v\2\2"+
		"\u008c\25\3\2\2\2\u008d\u008e\7g\2\2\u008e\u008f\7n\2\2\u008f\u0090\7"+
		"n\2\2\u0090\u0091\7k\2\2\u0091\u0092\7r\2\2\u0092\u0093\7u\2\2\u0093\u0094"+
		"\7g\2\2\u0094\27\3\2\2\2\u0095\u0096\7n\2\2\u0096\u0097\7k\2\2\u0097\u0098"+
		"\7p\2\2\u0098\u0099\7g\2\2\u0099\31\3\2\2\2\u009a\u009b\7r\2\2\u009b\u009c"+
		"\7q\2\2\u009c\u009d\7n\2\2\u009d\u009e\7{\2\2\u009e\u009f\7i\2\2\u009f"+
		"\u00a0\7q\2\2\u00a0\u00a1\7p\2\2\u00a1\33\3\2\2\2\u00a2\u00a3\7r\2\2\u00a3"+
		"\u00a4\7q\2\2\u00a4\u00a5\7n\2\2\u00a5\u00a6\7{\2\2\u00a6\u00a7\7n\2\2"+
		"\u00a7\u00a8\7k\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7g\2\2\u00aa\35\3\2"+
		"\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af"+
		"\7j\2\2\u00af\37\3\2\2\2\u00b0\u00b1\7v\2\2\u00b1\u00b2\7g\2\2\u00b2\u00b3"+
		"\7z\2\2\u00b3\u00b4\7v\2\2\u00b4!\3\2\2\2\u00b5\u00b6\7i\2\2\u00b6#\3"+
		"\2\2\2\u00b7\u00b8\7f\2\2\u00b8\u00b9\7g\2\2\u00b9\u00ba\7h\2\2\u00ba"+
		"\u00bb\7u\2\2\u00bb%\3\2\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be\7k\2\2\u00be"+
		"\u00bf\7n\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7t\2\2"+
		"\u00c2\'\3\2\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7k\2\2\u00c5\u00c6\7p"+
		"\2\2\u00c6\u00c7\7g\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca"+
		"\7I\2\2\u00ca\u00cb\7t\2\2\u00cb\u00cc\7c\2\2\u00cc\u00cd\7f\2\2\u00cd"+
		"\u00ce\7k\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7p\2\2\u00d0\u00d1\7v\2\2"+
		"\u00d1)\3\2\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7f\2"+
		"\2\u00d5\u00d6\7k\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9"+
		"\7I\2\2\u00d9\u00da\7t\2\2\u00da\u00db\7c\2\2\u00db\u00dc\7f\2\2\u00dc"+
		"\u00dd\7k\2\2\u00dd\u00de\7g\2\2\u00de\u00df\7p\2\2\u00df\u00e0\7v\2\2"+
		"\u00e0+\3\2\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4\7q\2"+
		"\2\u00e4\u00e5\7r\2\2\u00e5-\3\2\2\2\u00e6\u00e8\t\4\2\2\u00e7\u00e6\3"+
		"\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea"+
		"/\3\2\2\2\u00eb\u00ec\7@\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b\30\4\2"+
		"\u00ee\61\3\2\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f1\7@\2\2\u00f1\u00f2"+
		"\3\2\2\2\u00f2\u00f3\b\31\4\2\u00f3\63\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f5"+
		"\65\3\2\2\2\u00f6\u00f7\7?\2\2\u00f7\67\3\2\2\2\u00f8\u00fc\7$\2\2\u00f9"+
		"\u00fb\n\5\2\2\u00fa\u00f9\3\2\2\2\u00fb\u00fe\3\2\2\2\u00fc\u00fa\3\2"+
		"\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff"+
		"\u0109\7$\2\2\u0100\u0104\7)\2\2\u0101\u0103\n\6\2\2\u0102\u0101\3\2\2"+
		"\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107"+
		"\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u0109\7)\2\2\u0108\u00f8\3\2\2\2\u0108"+
		"\u0100\3\2\2\2\u01099\3\2\2\2\u010a\u010c\t\2\2\2\u010b\u010a\3\2\2\2"+
		"\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f"+
		"\3\2\2\2\u010f\u0110\b\35\2\2\u0110;\3\2\2\2\u0111\u0112\7>\2\2\u0112"+
		"\u0113\7#\2\2\u0113\u0114\7/\2\2\u0114\u0115\7/\2\2\u0115\u0119\3\2\2"+
		"\2\u0116\u0118\13\2\2\2\u0117\u0116\3\2\2\2\u0118\u011b\3\2\2\2\u0119"+
		"\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011c\3\2\2\2\u011b\u0119\3\2"+
		"\2\2\u011c\u011d\7/\2\2\u011d\u011e\7/\2\2\u011e\u011f\7@\2\2\u011f\u0120"+
		"\3\2\2\2\u0120\u0121\b\36\2\2\u0121=\3\2\2\2\17\2\3AM_m{\u00e9\u00fc\u0104"+
		"\u0108\u010d\u0119\5\b\2\2\7\3\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}