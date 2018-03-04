// Generated from C:/Users/Alex/IdeaProjects/untitled/src\E.g4 by ANTLR 4.7
package com.company.gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ELexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, BEGIN=5, END=6, PRINT=7, INT=8, IF=9, 
		ELSE=10, FOR=11, WHILE=12, VECTOR=13, MATRIX=14, RETURN=15, ID=16, NUMBER=17, 
		WS=18, O_BRACKET=19, C_BRACKET=20, O_SQARE_BRACKET=21, C_SQARE_BRACKET=22, 
		O_S_BRACKET=23, C_S_BRACKET=24, COMMA=25, PLUS=26, MINUS=27, MULTIPLY=28, 
		DIVIDE=29, NEGATION=30, EQUAL=31, NON_EQUAL=32, LESS=33, GREATER=34, VECTOR_EXPR=35, 
		MATRIX_EXPR=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "BEGIN", "END", "PRINT", "INT", "IF", 
		"ELSE", "FOR", "WHILE", "VECTOR", "MATRIX", "RETURN", "ID", "NUMBER", 
		"WS", "O_BRACKET", "C_BRACKET", "O_SQARE_BRACKET", "C_SQARE_BRACKET", 
		"O_S_BRACKET", "C_S_BRACKET", "COMMA", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", 
		"NEGATION", "EQUAL", "NON_EQUAL", "LESS", "GREATER", "VECTOR_EXPR", "MATRIX_EXPR"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'main_program'", "'='", "'\"'", "'sub_program'", "'begin'", "'end'", 
		"'print'", "'int'", "'if'", "'else'", "'for'", "'while'", "'vector'", 
		"'matrix'", "'return'", null, null, null, "'('", "')'", "'['", "']'", 
		"'{'", "'}'", "','", "'+'", "'-'", "'*'", "'/'", "'!'", "'=='", "'!='", 
		"'<'", "'>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, "BEGIN", "END", "PRINT", "INT", "IF", "ELSE", 
		"FOR", "WHILE", "VECTOR", "MATRIX", "RETURN", "ID", "NUMBER", "WS", "O_BRACKET", 
		"C_BRACKET", "O_SQARE_BRACKET", "C_SQARE_BRACKET", "O_S_BRACKET", "C_S_BRACKET", 
		"COMMA", "PLUS", "MINUS", "MULTIPLY", "DIVIDE", "NEGATION", "EQUAL", "NON_EQUAL", 
		"LESS", "GREATER", "VECTOR_EXPR", "MATRIX_EXPR"
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


	public ELexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "E.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00f2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\7\21\u00a6\n\21\f\21\16\21\u00a9\13\21\3\22\6\22\u00ac\n\22\r\22\16\22"+
		"\u00ad\3\23\6\23\u00b1\n\23\r\23\16\23\u00b2\3\23\3\23\3\24\3\24\3\25"+
		"\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3"+
		"$\3$\3$\3$\7$\u00dd\n$\f$\16$\u00e0\13$\3$\3$\3$\3$\3%\3%\3%\3%\7%\u00ea"+
		"\n%\f%\16%\u00ed\13%\3%\3%\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\6\5\2C\\aac|\6"+
		"\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17\"\"\2\u00f6\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2"+
		"\2\5X\3\2\2\2\7Z\3\2\2\2\t\\\3\2\2\2\13h\3\2\2\2\rn\3\2\2\2\17r\3\2\2"+
		"\2\21x\3\2\2\2\23|\3\2\2\2\25\177\3\2\2\2\27\u0084\3\2\2\2\31\u0088\3"+
		"\2\2\2\33\u008e\3\2\2\2\35\u0095\3\2\2\2\37\u009c\3\2\2\2!\u00a3\3\2\2"+
		"\2#\u00ab\3\2\2\2%\u00b0\3\2\2\2\'\u00b6\3\2\2\2)\u00b8\3\2\2\2+\u00ba"+
		"\3\2\2\2-\u00bc\3\2\2\2/\u00be\3\2\2\2\61\u00c0\3\2\2\2\63\u00c2\3\2\2"+
		"\2\65\u00c4\3\2\2\2\67\u00c6\3\2\2\29\u00c8\3\2\2\2;\u00ca\3\2\2\2=\u00cc"+
		"\3\2\2\2?\u00ce\3\2\2\2A\u00d1\3\2\2\2C\u00d4\3\2\2\2E\u00d6\3\2\2\2G"+
		"\u00d8\3\2\2\2I\u00e5\3\2\2\2KL\7o\2\2LM\7c\2\2MN\7k\2\2NO\7p\2\2OP\7"+
		"a\2\2PQ\7r\2\2QR\7t\2\2RS\7q\2\2ST\7i\2\2TU\7t\2\2UV\7c\2\2VW\7o\2\2W"+
		"\4\3\2\2\2XY\7?\2\2Y\6\3\2\2\2Z[\7$\2\2[\b\3\2\2\2\\]\7u\2\2]^\7w\2\2"+
		"^_\7d\2\2_`\7a\2\2`a\7r\2\2ab\7t\2\2bc\7q\2\2cd\7i\2\2de\7t\2\2ef\7c\2"+
		"\2fg\7o\2\2g\n\3\2\2\2hi\7d\2\2ij\7g\2\2jk\7i\2\2kl\7k\2\2lm\7p\2\2m\f"+
		"\3\2\2\2no\7g\2\2op\7p\2\2pq\7f\2\2q\16\3\2\2\2rs\7r\2\2st\7t\2\2tu\7"+
		"k\2\2uv\7p\2\2vw\7v\2\2w\20\3\2\2\2xy\7k\2\2yz\7p\2\2z{\7v\2\2{\22\3\2"+
		"\2\2|}\7k\2\2}~\7h\2\2~\24\3\2\2\2\177\u0080\7g\2\2\u0080\u0081\7n\2\2"+
		"\u0081\u0082\7u\2\2\u0082\u0083\7g\2\2\u0083\26\3\2\2\2\u0084\u0085\7"+
		"h\2\2\u0085\u0086\7q\2\2\u0086\u0087\7t\2\2\u0087\30\3\2\2\2\u0088\u0089"+
		"\7y\2\2\u0089\u008a\7j\2\2\u008a\u008b\7k\2\2\u008b\u008c\7n\2\2\u008c"+
		"\u008d\7g\2\2\u008d\32\3\2\2\2\u008e\u008f\7x\2\2\u008f\u0090\7g\2\2\u0090"+
		"\u0091\7e\2\2\u0091\u0092\7v\2\2\u0092\u0093\7q\2\2\u0093\u0094\7t\2\2"+
		"\u0094\34\3\2\2\2\u0095\u0096\7o\2\2\u0096\u0097\7c\2\2\u0097\u0098\7"+
		"v\2\2\u0098\u0099\7t\2\2\u0099\u009a\7k\2\2\u009a\u009b\7z\2\2\u009b\36"+
		"\3\2\2\2\u009c\u009d\7t\2\2\u009d\u009e\7g\2\2\u009e\u009f\7v\2\2\u009f"+
		"\u00a0\7w\2\2\u00a0\u00a1\7t\2\2\u00a1\u00a2\7p\2\2\u00a2 \3\2\2\2\u00a3"+
		"\u00a7\t\2\2\2\u00a4\u00a6\t\3\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\"\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00aa\u00ac\t\4\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae$\3\2\2\2\u00af\u00b1\t\5\2\2"+
		"\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\b\23\2\2\u00b5&\3\2\2\2\u00b6"+
		"\u00b7\7*\2\2\u00b7(\3\2\2\2\u00b8\u00b9\7+\2\2\u00b9*\3\2\2\2\u00ba\u00bb"+
		"\7]\2\2\u00bb,\3\2\2\2\u00bc\u00bd\7_\2\2\u00bd.\3\2\2\2\u00be\u00bf\7"+
		"}\2\2\u00bf\60\3\2\2\2\u00c0\u00c1\7\177\2\2\u00c1\62\3\2\2\2\u00c2\u00c3"+
		"\7.\2\2\u00c3\64\3\2\2\2\u00c4\u00c5\7-\2\2\u00c5\66\3\2\2\2\u00c6\u00c7"+
		"\7/\2\2\u00c78\3\2\2\2\u00c8\u00c9\7,\2\2\u00c9:\3\2\2\2\u00ca\u00cb\7"+
		"\61\2\2\u00cb<\3\2\2\2\u00cc\u00cd\7#\2\2\u00cd>\3\2\2\2\u00ce\u00cf\7"+
		"?\2\2\u00cf\u00d0\7?\2\2\u00d0@\3\2\2\2\u00d1\u00d2\7#\2\2\u00d2\u00d3"+
		"\7?\2\2\u00d3B\3\2\2\2\u00d4\u00d5\7>\2\2\u00d5D\3\2\2\2\u00d6\u00d7\7"+
		"@\2\2\u00d7F\3\2\2\2\u00d8\u00de\5/\30\2\u00d9\u00da\5#\22\2\u00da\u00db"+
		"\5\63\32\2\u00db\u00dd\3\2\2\2\u00dc\u00d9\3\2\2\2\u00dd\u00e0\3\2\2\2"+
		"\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00e2\5#\22\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\5\61\31\2"+
		"\u00e4H\3\2\2\2\u00e5\u00eb\5/\30\2\u00e6\u00e7\5G$\2\u00e7\u00e8\5\63"+
		"\32\2\u00e8\u00ea\3\2\2\2\u00e9\u00e6\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ee\3\2\2\2\u00ed\u00eb\3\2"+
		"\2\2\u00ee\u00ef\5G$\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\5\61\31\2\u00f1"+
		"J\3\2\2\2\b\2\u00a7\u00ad\u00b2\u00de\u00eb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}