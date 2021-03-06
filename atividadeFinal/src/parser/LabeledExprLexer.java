// Generated from C:/JavaLib/exemplo_atividade/g4files\LabeledExpr.g4 by ANTLR 4.9.1
package parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, FOR=4, PRINTLN=5, PRINT=6, OPEREL=7, MUL=8, DIV=9, 
		ADD=10, SUB=11, EQ=12, ABCHAV=13, FCCHAV=14, APARE=15, FPARE=16, VIRG=17, 
		PTVIRG=18, TIPO=19, CONST=20, ID=21, INT=22, FLOAT=23, STRING=24, COMMENT=25, 
		NEWLINE=26, WS=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "ELSE", "WHILE", "FOR", "PRINTLN", "PRINT", "OPEREL", "MUL", "DIV", 
			"ADD", "SUB", "EQ", "ABCHAV", "FCCHAV", "APARE", "FPARE", "VIRG", "PTVIRG", 
			"TIPO", "CONST", "ID", "INT", "FLOAT", "STRING", "COMMENT", "NEWLINE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'else'", "'while'", "'for'", "'println'", "'print'", null, 
			"'*'", "'/'", "'+'", "'-'", "'='", "'{'", "'}'", "'('", "')'", "','", 
			"';'", null, "'const'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "ELSE", "WHILE", "FOR", "PRINTLN", "PRINT", "OPEREL", "MUL", 
			"DIV", "ADD", "SUB", "EQ", "ABCHAV", "FCCHAV", "APARE", "FPARE", "VIRG", 
			"PTVIRG", "TIPO", "CONST", "ID", "INT", "FLOAT", "STRING", "COMMENT", 
			"NEWLINE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public LabeledExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00d3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bc\n\b"+
		"\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0089\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\6\26\u0092\n\26\r\26\16\26\u0093\3\27\6\27\u0097\n\27"+
		"\r\27\16\27\u0098\3\30\6\30\u009c\n\30\r\30\16\30\u009d\3\30\3\30\7\30"+
		"\u00a2\n\30\f\30\16\30\u00a5\13\30\3\30\3\30\6\30\u00a9\n\30\r\30\16\30"+
		"\u00aa\5\30\u00ad\n\30\3\31\3\31\3\31\3\31\7\31\u00b3\n\31\f\31\16\31"+
		"\u00b6\13\31\3\31\3\31\3\32\3\32\3\32\3\32\7\32\u00be\n\32\f\32\16\32"+
		"\u00c1\13\32\3\32\3\32\3\32\3\32\3\32\3\33\5\33\u00c9\n\33\3\33\3\33\3"+
		"\34\6\34\u00ce\n\34\r\34\16\34\u00cf\3\34\3\34\3\u00bf\2\35\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\7\4\2>>@@\4"+
		"\2C\\c|\3\2\62;\5\2\f\f\17\17$$\4\2\13\13\"\"\2\u00e3\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5<\3\2\2\2\7A\3\2\2\2"+
		"\tG\3\2\2\2\13K\3\2\2\2\rS\3\2\2\2\17b\3\2\2\2\21d\3\2\2\2\23f\3\2\2\2"+
		"\25h\3\2\2\2\27j\3\2\2\2\31l\3\2\2\2\33n\3\2\2\2\35p\3\2\2\2\37r\3\2\2"+
		"\2!t\3\2\2\2#v\3\2\2\2%x\3\2\2\2\'\u0088\3\2\2\2)\u008a\3\2\2\2+\u0091"+
		"\3\2\2\2-\u0096\3\2\2\2/\u00ac\3\2\2\2\61\u00ae\3\2\2\2\63\u00b9\3\2\2"+
		"\2\65\u00c8\3\2\2\2\67\u00cd\3\2\2\29:\7k\2\2:;\7h\2\2;\4\3\2\2\2<=\7"+
		"g\2\2=>\7n\2\2>?\7u\2\2?@\7g\2\2@\6\3\2\2\2AB\7y\2\2BC\7j\2\2CD\7k\2\2"+
		"DE\7n\2\2EF\7g\2\2F\b\3\2\2\2GH\7h\2\2HI\7q\2\2IJ\7t\2\2J\n\3\2\2\2KL"+
		"\7r\2\2LM\7t\2\2MN\7k\2\2NO\7p\2\2OP\7v\2\2PQ\7n\2\2QR\7p\2\2R\f\3\2\2"+
		"\2ST\7r\2\2TU\7t\2\2UV\7k\2\2VW\7p\2\2WX\7v\2\2X\16\3\2\2\2Yc\t\2\2\2"+
		"Z[\7?\2\2[c\7?\2\2\\]\7#\2\2]c\7?\2\2^_\7@\2\2_c\7?\2\2`a\7>\2\2ac\7?"+
		"\2\2bY\3\2\2\2bZ\3\2\2\2b\\\3\2\2\2b^\3\2\2\2b`\3\2\2\2c\20\3\2\2\2de"+
		"\7,\2\2e\22\3\2\2\2fg\7\61\2\2g\24\3\2\2\2hi\7-\2\2i\26\3\2\2\2jk\7/\2"+
		"\2k\30\3\2\2\2lm\7?\2\2m\32\3\2\2\2no\7}\2\2o\34\3\2\2\2pq\7\177\2\2q"+
		"\36\3\2\2\2rs\7*\2\2s \3\2\2\2tu\7+\2\2u\"\3\2\2\2vw\7.\2\2w$\3\2\2\2"+
		"xy\7=\2\2y&\3\2\2\2z{\7k\2\2{|\7p\2\2|\u0089\7v\2\2}~\7h\2\2~\177\7n\2"+
		"\2\177\u0080\7q\2\2\u0080\u0081\7c\2\2\u0081\u0089\7v\2\2\u0082\u0083"+
		"\7u\2\2\u0083\u0084\7v\2\2\u0084\u0085\7t\2\2\u0085\u0086\7k\2\2\u0086"+
		"\u0087\7p\2\2\u0087\u0089\7i\2\2\u0088z\3\2\2\2\u0088}\3\2\2\2\u0088\u0082"+
		"\3\2\2\2\u0089(\3\2\2\2\u008a\u008b\7e\2\2\u008b\u008c\7q\2\2\u008c\u008d"+
		"\7p\2\2\u008d\u008e\7u\2\2\u008e\u008f\7v\2\2\u008f*\3\2\2\2\u0090\u0092"+
		"\t\3\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0091\3\2\2\2\u0093"+
		"\u0094\3\2\2\2\u0094,\3\2\2\2\u0095\u0097\t\4\2\2\u0096\u0095\3\2\2\2"+
		"\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099.\3"+
		"\2\2\2\u009a\u009c\t\4\2\2\u009b\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a3\7\60"+
		"\2\2\u00a0\u00a2\t\4\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00ad\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a6\u00a8\7\60\2\2\u00a7\u00a9\t\4\2\2\u00a8\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ad\3\2"+
		"\2\2\u00ac\u009b\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ad\60\3\2\2\2\u00ae\u00b4"+
		"\7$\2\2\u00af\u00b3\n\5\2\2\u00b0\u00b1\7$\2\2\u00b1\u00b3\7$\2\2\u00b2"+
		"\u00af\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7"+
		"\u00b8\7$\2\2\u00b8\62\3\2\2\2\u00b9\u00ba\7\61\2\2\u00ba\u00bb\7,\2\2"+
		"\u00bb\u00bf\3\2\2\2\u00bc\u00be\13\2\2\2\u00bd\u00bc\3\2\2\2\u00be\u00c1"+
		"\3\2\2\2\u00bf\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c2\u00c3\7,\2\2\u00c3\u00c4\7\61\2\2\u00c4\u00c5\3\2"+
		"\2\2\u00c5\u00c6\b\32\2\2\u00c6\64\3\2\2\2\u00c7\u00c9\7\17\2\2\u00c8"+
		"\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\f"+
		"\2\2\u00cb\66\3\2\2\2\u00cc\u00ce\t\6\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d2\b\34\2\2\u00d28\3\2\2\2\20\2b\u0088\u0093\u0098\u009d\u00a3\u00aa"+
		"\u00ac\u00b2\u00b4\u00bf\u00c8\u00cf\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}