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
		MUL=1, DIV=2, ADD=3, SUB=4, EQ=5, VIRG=6, ABCHA=7, FCCHA=8, APARE=9, FPARE=10, 
		IF=11, WHILE=12, FOR=13, MENORQ=14, MAIORQ=15, ELSE=16, PRINTLN=17, PONTVIG=18, 
		ID=19, INT=20, NEWLINE=21, COMMENT=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"MUL", "DIV", "ADD", "SUB", "EQ", "VIRG", "ABCHA", "FCCHA", "APARE", 
			"FPARE", "IF", "WHILE", "FOR", "MENORQ", "MAIORQ", "ELSE", "PRINTLN", 
			"PONTVIG", "ID", "INT", "NEWLINE", "COMMENT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'/'", "'+'", "'-'", "'='", "','", "'{'", "'}'", "'('", 
			"')'", "'if'", "'while'", "'for'", "'<'", "'>'", "'else'", "'println'", 
			"';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MUL", "DIV", "ADD", "SUB", "EQ", "VIRG", "ABCHA", "FCCHA", "APARE", 
			"FPARE", "IF", "WHILE", "FOR", "MENORQ", "MAIORQ", "ELSE", "PRINTLN", 
			"PONTVIG", "ID", "INT", "NEWLINE", "COMMENT", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0089\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\6\24g\n\24\r\24\16\24h\3\25\6\25l\n\25\r\25"+
		"\16\25m\3\26\5\26q\n\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27y\n\27\f\27"+
		"\16\27|\13\27\3\27\3\27\3\27\3\27\3\27\3\30\6\30\u0084\n\30\r\30\16\30"+
		"\u0085\3\30\3\30\3z\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f"+
		"\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\5\4"+
		"\2C\\c|\3\2\62;\4\2\13\13\"\"\2\u008d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61\3\2\2\2\5\63\3\2\2\2\7\65"+
		"\3\2\2\2\t\67\3\2\2\2\139\3\2\2\2\r;\3\2\2\2\17=\3\2\2\2\21?\3\2\2\2\23"+
		"A\3\2\2\2\25C\3\2\2\2\27E\3\2\2\2\31H\3\2\2\2\33N\3\2\2\2\35R\3\2\2\2"+
		"\37T\3\2\2\2!V\3\2\2\2#[\3\2\2\2%c\3\2\2\2\'f\3\2\2\2)k\3\2\2\2+p\3\2"+
		"\2\2-t\3\2\2\2/\u0083\3\2\2\2\61\62\7,\2\2\62\4\3\2\2\2\63\64\7\61\2\2"+
		"\64\6\3\2\2\2\65\66\7-\2\2\66\b\3\2\2\2\678\7/\2\28\n\3\2\2\29:\7?\2\2"+
		":\f\3\2\2\2;<\7.\2\2<\16\3\2\2\2=>\7}\2\2>\20\3\2\2\2?@\7\177\2\2@\22"+
		"\3\2\2\2AB\7*\2\2B\24\3\2\2\2CD\7+\2\2D\26\3\2\2\2EF\7k\2\2FG\7h\2\2G"+
		"\30\3\2\2\2HI\7y\2\2IJ\7j\2\2JK\7k\2\2KL\7n\2\2LM\7g\2\2M\32\3\2\2\2N"+
		"O\7h\2\2OP\7q\2\2PQ\7t\2\2Q\34\3\2\2\2RS\7>\2\2S\36\3\2\2\2TU\7@\2\2U"+
		" \3\2\2\2VW\7g\2\2WX\7n\2\2XY\7u\2\2YZ\7g\2\2Z\"\3\2\2\2[\\\7r\2\2\\]"+
		"\7t\2\2]^\7k\2\2^_\7p\2\2_`\7v\2\2`a\7n\2\2ab\7p\2\2b$\3\2\2\2cd\7=\2"+
		"\2d&\3\2\2\2eg\t\2\2\2fe\3\2\2\2gh\3\2\2\2hf\3\2\2\2hi\3\2\2\2i(\3\2\2"+
		"\2jl\t\3\2\2kj\3\2\2\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2n*\3\2\2\2oq\7\17"+
		"\2\2po\3\2\2\2pq\3\2\2\2qr\3\2\2\2rs\7\f\2\2s,\3\2\2\2tu\7\61\2\2uv\7"+
		",\2\2vz\3\2\2\2wy\13\2\2\2xw\3\2\2\2y|\3\2\2\2z{\3\2\2\2zx\3\2\2\2{}\3"+
		"\2\2\2|z\3\2\2\2}~\7,\2\2~\177\7\61\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\b\27\2\2\u0081.\3\2\2\2\u0082\u0084\t\4\2\2\u0083\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\b\30\2\2\u0088\60\3\2\2\2\b\2hmpz\u0085\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}