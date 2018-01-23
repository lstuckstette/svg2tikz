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
		PATH_Q=48, PATH_T_REL=49, PATH_T=50, PATH_A_REL=51, PATH_A=52, NUMBER=53;
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
		"PATH_T", "PATH_A_REL", "PATH_A", "NUMBER", "INT", "FLOAT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\67\u01a3\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t"+
		"\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4"+
		"*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\4\64\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\3\2\6\2u\n\2\r\2\16"+
		"\2v\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\7\3\u0081\n\3\f\3\16\3\u0084\13\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u0093\n\4\f\4"+
		"\16\4\u0096\13\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5\u00a1\n\5\f\5"+
		"\16\5\u00a4\13\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\6\7\u00af\n\7\r\7"+
		"\16\7\u00b0\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\6\27\u011d\n\27\r\27\16\27\u011e\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\7\35\u0136\n\35\f\35\16\35\u0139\13\35\3\35\3\35"+
		"\3\36\6\36\u013e\n\36\r\36\16\36\u013f\3\36\3\36\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\7\37\u014a\n\37\f\37\16\37\u014d\13\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3 \3 \3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3("+
		"\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62"+
		"\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\5\66\u0185\n\66\3\67\6\67"+
		"\u0188\n\67\r\67\16\67\u0189\38\68\u018d\n8\r8\168\u018e\38\38\68\u0193"+
		"\n8\r8\168\u0194\38\68\u0198\n8\r8\168\u0199\38\38\68\u019e\n8\r8\168"+
		"\u019f\58\u01a2\n8\6\u0082\u0094\u00a2\u014b\29\5\3\7\4\t\5\13\6\r\7\17"+
		"\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26"+
		"-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U"+
		"+W,Y-[.]/_\60a\61c\62e\63g\64i\65k\66m\67o\2q\2\5\2\3\4\b\5\2\13\f\17"+
		"\17\"\"\4\2((>>\6\2//\62<C\\c|\4\2$$>>\4\2\"\"..\3\2\62;\2\u01ae\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\3"+
		"\21\3\2\2\2\3\23\3\2\2\2\3\25\3\2\2\2\3\27\3\2\2\2\3\31\3\2\2\2\3\33\3"+
		"\2\2\2\3\35\3\2\2\2\3\37\3\2\2\2\3!\3\2\2\2\3#\3\2\2\2\3%\3\2\2\2\3\'"+
		"\3\2\2\2\3)\3\2\2\2\3+\3\2\2\2\3-\3\2\2\2\3/\3\2\2\2\3\61\3\2\2\2\3\63"+
		"\3\2\2\2\3\65\3\2\2\2\3\67\3\2\2\2\39\3\2\2\2\3;\3\2\2\2\3=\3\2\2\2\3"+
		"?\3\2\2\2\4A\3\2\2\2\4C\3\2\2\2\4E\3\2\2\2\4G\3\2\2\2\4I\3\2\2\2\4K\3"+
		"\2\2\2\4M\3\2\2\2\4O\3\2\2\2\4Q\3\2\2\2\4S\3\2\2\2\4U\3\2\2\2\4W\3\2\2"+
		"\2\4Y\3\2\2\2\4[\3\2\2\2\4]\3\2\2\2\4_\3\2\2\2\4a\3\2\2\2\4c\3\2\2\2\4"+
		"e\3\2\2\2\4g\3\2\2\2\4i\3\2\2\2\4k\3\2\2\2\4m\3\2\2\2\5t\3\2\2\2\7z\3"+
		"\2\2\2\t\u008b\3\2\2\2\13\u009c\3\2\2\2\r\u00a9\3\2\2\2\17\u00ae\3\2\2"+
		"\2\21\u00b2\3\2\2\2\23\u00b6\3\2\2\2\25\u00bd\3\2\2\2\27\u00c2\3\2\2\2"+
		"\31\u00ca\3\2\2\2\33\u00cf\3\2\2\2\35\u00d7\3\2\2\2\37\u00e0\3\2\2\2!"+
		"\u00e5\3\2\2\2#\u00ea\3\2\2\2%\u00ec\3\2\2\2\'\u00f1\3\2\2\2)\u00f8\3"+
		"\2\2\2+\u0107\3\2\2\2-\u0116\3\2\2\2/\u011c\3\2\2\2\61\u0120\3\2\2\2\63"+
		"\u0124\3\2\2\2\65\u0129\3\2\2\2\67\u012b\3\2\2\29\u012d\3\2\2\2;\u0133"+
		"\3\2\2\2=\u013d\3\2\2\2?\u0143\3\2\2\2A\u0154\3\2\2\2C\u0158\3\2\2\2E"+
		"\u015a\3\2\2\2G\u015c\3\2\2\2I\u015e\3\2\2\2K\u0160\3\2\2\2M\u0162\3\2"+
		"\2\2O\u0164\3\2\2\2Q\u0166\3\2\2\2S\u0168\3\2\2\2U\u016a\3\2\2\2W\u016c"+
		"\3\2\2\2Y\u016e\3\2\2\2[\u0170\3\2\2\2]\u0172\3\2\2\2_\u0174\3\2\2\2a"+
		"\u0176\3\2\2\2c\u0178\3\2\2\2e\u017a\3\2\2\2g\u017c\3\2\2\2i\u017e\3\2"+
		"\2\2k\u0180\3\2\2\2m\u0184\3\2\2\2o\u0187\3\2\2\2q\u01a1\3\2\2\2su\t\2"+
		"\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2wx\3\2\2\2xy\b\2\2\2y\6\3"+
		"\2\2\2z{\7>\2\2{|\7#\2\2|}\7/\2\2}~\7/\2\2~\u0082\3\2\2\2\177\u0081\13"+
		"\2\2\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0083\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\7/"+
		"\2\2\u0086\u0087\7/\2\2\u0087\u0088\7@\2\2\u0088\u0089\3\2\2\2\u0089\u008a"+
		"\b\3\2\2\u008a\b\3\2\2\2\u008b\u008c\7>\2\2\u008c\u008d\7A\2\2\u008d\u008e"+
		"\7z\2\2\u008e\u008f\7o\2\2\u008f\u0090\7n\2\2\u0090\u0094\3\2\2\2\u0091"+
		"\u0093\13\2\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0095\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\7A\2\2\u0098\u0099\7@\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\4\2"+
		"\2\u009b\n\3\2\2\2\u009c\u009d\7>\2\2\u009d\u009e\7#\2\2\u009e\u00a2\3"+
		"\2\2\2\u009f\u00a1\13\2\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u00a2\3\2"+
		"\2\2\u00a5\u00a6\7@\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a8\b\5\2\2\u00a8"+
		"\f\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\6\3\2"+
		"\u00ac\16\3\2\2\2\u00ad\u00af\n\3\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\20\3\2\2\2\u00b2"+
		"\u00b3\7u\2\2\u00b3\u00b4\7x\2\2\u00b4\u00b5\7i\2\2\u00b5\22\3\2\2\2\u00b6"+
		"\u00b7\7e\2\2\u00b7\u00b8\7k\2\2\u00b8\u00b9\7t\2\2\u00b9\u00ba\7e\2\2"+
		"\u00ba\u00bb\7n\2\2\u00bb\u00bc\7g\2\2\u00bc\24\3\2\2\2\u00bd\u00be\7"+
		"t\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0\7e\2\2\u00c0\u00c1\7v\2\2\u00c1\26"+
		"\3\2\2\2\u00c2\u00c3\7g\2\2\u00c3\u00c4\7n\2\2\u00c4\u00c5\7n\2\2\u00c5"+
		"\u00c6\7k\2\2\u00c6\u00c7\7r\2\2\u00c7\u00c8\7u\2\2\u00c8\u00c9\7g\2\2"+
		"\u00c9\30\3\2\2\2\u00ca\u00cb\7n\2\2\u00cb\u00cc\7k\2\2\u00cc\u00cd\7"+
		"p\2\2\u00cd\u00ce\7g\2\2\u00ce\32\3\2\2\2\u00cf\u00d0\7r\2\2\u00d0\u00d1"+
		"\7q\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7{\2\2\u00d3\u00d4\7i\2\2\u00d4"+
		"\u00d5\7q\2\2\u00d5\u00d6\7p\2\2\u00d6\34\3\2\2\2\u00d7\u00d8\7r\2\2\u00d8"+
		"\u00d9\7q\2\2\u00d9\u00da\7n\2\2\u00da\u00db\7{\2\2\u00db\u00dc\7n\2\2"+
		"\u00dc\u00dd\7k\2\2\u00dd\u00de\7p\2\2\u00de\u00df\7g\2\2\u00df\36\3\2"+
		"\2\2\u00e0\u00e1\7r\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7v\2\2\u00e3\u00e4"+
		"\7j\2\2\u00e4 \3\2\2\2\u00e5\u00e6\7v\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8"+
		"\7z\2\2\u00e8\u00e9\7v\2\2\u00e9\"\3\2\2\2\u00ea\u00eb\7i\2\2\u00eb$\3"+
		"\2\2\2\u00ec\u00ed\7f\2\2\u00ed\u00ee\7g\2\2\u00ee\u00ef\7h\2\2\u00ef"+
		"\u00f0\7u\2\2\u00f0&\3\2\2\2\u00f1\u00f2\7h\2\2\u00f2\u00f3\7k\2\2\u00f3"+
		"\u00f4\7n\2\2\u00f4\u00f5\7v\2\2\u00f5\u00f6\7g\2\2\u00f6\u00f7\7t\2\2"+
		"\u00f7(\3\2\2\2\u00f8\u00f9\7n\2\2\u00f9\u00fa\7k\2\2\u00fa\u00fb\7p\2"+
		"\2\u00fb\u00fc\7g\2\2\u00fc\u00fd\7c\2\2\u00fd\u00fe\7t\2\2\u00fe\u00ff"+
		"\7I\2\2\u00ff\u0100\7t\2\2\u0100\u0101\7c\2\2\u0101\u0102\7f\2\2\u0102"+
		"\u0103\7k\2\2\u0103\u0104\7g\2\2\u0104\u0105\7p\2\2\u0105\u0106\7v\2\2"+
		"\u0106*\3\2\2\2\u0107\u0108\7t\2\2\u0108\u0109\7c\2\2\u0109\u010a\7f\2"+
		"\2\u010a\u010b\7k\2\2\u010b\u010c\7c\2\2\u010c\u010d\7n\2\2\u010d\u010e"+
		"\7I\2\2\u010e\u010f\7t\2\2\u010f\u0110\7c\2\2\u0110\u0111\7f\2\2\u0111"+
		"\u0112\7k\2\2\u0112\u0113\7g\2\2\u0113\u0114\7p\2\2\u0114\u0115\7v\2\2"+
		"\u0115,\3\2\2\2\u0116\u0117\7u\2\2\u0117\u0118\7v\2\2\u0118\u0119\7q\2"+
		"\2\u0119\u011a\7r\2\2\u011a.\3\2\2\2\u011b\u011d\t\4\2\2\u011c\u011b\3"+
		"\2\2\2\u011d\u011e\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f"+
		"\60\3\2\2\2\u0120\u0121\7@\2\2\u0121\u0122\3\2\2\2\u0122\u0123\b\30\4"+
		"\2\u0123\62\3\2\2\2\u0124\u0125\7\61\2\2\u0125\u0126\7@\2\2\u0126\u0127"+
		"\3\2\2\2\u0127\u0128\b\31\4\2\u0128\64\3\2\2\2\u0129\u012a\7\61\2\2\u012a"+
		"\66\3\2\2\2\u012b\u012c\7?\2\2\u012c8\3\2\2\2\u012d\u012e\7f\2\2\u012e"+
		"\u012f\7?\2\2\u012f\u0130\7$\2\2\u0130\u0131\3\2\2\2\u0131\u0132\b\34"+
		"\5\2\u0132:\3\2\2\2\u0133\u0137\7$\2\2\u0134\u0136\n\5\2\2\u0135\u0134"+
		"\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138"+
		"\u013a\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013b\7$\2\2\u013b<\3\2\2\2\u013c"+
		"\u013e\t\2\2\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0142\b\36\2\2\u0142"+
		">\3\2\2\2\u0143\u0144\7>\2\2\u0144\u0145\7#\2\2\u0145\u0146\7/\2\2\u0146"+
		"\u0147\7/\2\2\u0147\u014b\3\2\2\2\u0148\u014a\13\2\2\2\u0149\u0148\3\2"+
		"\2\2\u014a\u014d\3\2\2\2\u014b\u014c\3\2\2\2\u014b\u0149\3\2\2\2\u014c"+
		"\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u014f\7/\2\2\u014f\u0150\7/\2"+
		"\2\u0150\u0151\7@\2\2\u0151\u0152\3\2\2\2\u0152\u0153\b\37\2\2\u0153@"+
		"\3\2\2\2\u0154\u0155\7$\2\2\u0155\u0156\3\2\2\2\u0156\u0157\b \4\2\u0157"+
		"B\3\2\2\2\u0158\u0159\t\6\2\2\u0159D\3\2\2\2\u015a\u015b\7o\2\2\u015b"+
		"F\3\2\2\2\u015c\u015d\7O\2\2\u015dH\3\2\2\2\u015e\u015f\7n\2\2\u015fJ"+
		"\3\2\2\2\u0160\u0161\7N\2\2\u0161L\3\2\2\2\u0162\u0163\7j\2\2\u0163N\3"+
		"\2\2\2\u0164\u0165\7J\2\2\u0165P\3\2\2\2\u0166\u0167\7x\2\2\u0167R\3\2"+
		"\2\2\u0168\u0169\7X\2\2\u0169T\3\2\2\2\u016a\u016b\7|\2\2\u016bV\3\2\2"+
		"\2\u016c\u016d\7\\\2\2\u016dX\3\2\2\2\u016e\u016f\7e\2\2\u016fZ\3\2\2"+
		"\2\u0170\u0171\7E\2\2\u0171\\\3\2\2\2\u0172\u0173\7u\2\2\u0173^\3\2\2"+
		"\2\u0174\u0175\7U\2\2\u0175`\3\2\2\2\u0176\u0177\7s\2\2\u0177b\3\2\2\2"+
		"\u0178\u0179\7S\2\2\u0179d\3\2\2\2\u017a\u017b\7v\2\2\u017bf\3\2\2\2\u017c"+
		"\u017d\7V\2\2\u017dh\3\2\2\2\u017e\u017f\7c\2\2\u017fj\3\2\2\2\u0180\u0181"+
		"\7C\2\2\u0181l\3\2\2\2\u0182\u0185\5o\67\2\u0183\u0185\5q8\2\u0184\u0182"+
		"\3\2\2\2\u0184\u0183\3\2\2\2\u0185n\3\2\2\2\u0186\u0188\t\7\2\2\u0187"+
		"\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2"+
		"\2\2\u018ap\3\2\2\2\u018b\u018d\5o\67\2\u018c\u018b\3\2\2\2\u018d\u018e"+
		"\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0190\3\2\2\2\u0190"+
		"\u0192\7\60\2\2\u0191\u0193\5o\67\2\u0192\u0191\3\2\2\2\u0193\u0194\3"+
		"\2\2\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u01a2\3\2\2\2\u0196"+
		"\u0198\5o\67\2\u0197\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u0197\3\2"+
		"\2\2\u0199\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019d\7g\2\2\u019c"+
		"\u019e\5o\67\2\u019d\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u019d\3\2"+
		"\2\2\u019f\u01a0\3\2\2\2\u01a0\u01a2\3\2\2\2\u01a1\u018c\3\2\2\2\u01a1"+
		"\u0197\3\2\2\2\u01a2r\3\2\2\2\25\2\3\4v\u0082\u0094\u00a2\u00b0\u011e"+
		"\u0137\u013f\u014b\u0184\u0189\u018e\u0194\u0199\u019f\u01a1\6\b\2\2\7"+
		"\3\2\6\2\2\7\4\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}