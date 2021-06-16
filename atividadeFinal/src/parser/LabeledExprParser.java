// Generated from C:/Users/gilia/Documents/Dev/Atividade-final-compiladores/atividadeFinal/g4files\LabeledExpr.g4 by ANTLR 4.9.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LabeledExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, ELSE=2, WHILE=3, FOR=4, PRINTLN=5, PRINT=6, OPEREL=7, MUL=8, DIV=9, 
		ADD=10, SUB=11, EQ=12, ABCHAV=13, FCCHAV=14, APARE=15, FPARE=16, VIRG=17, 
		PTVIRG=18, TYPES=19, CONST=20, ID=21, INT=22, FLOAT=23, STRING=24, COMMENT=25, 
		NEWLINE=26, WS=27;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_declaration = 2, RULE_declarationSimple = 3, 
		RULE_declarationConst = 4, RULE_conditional = 5, RULE_conditionalExecExpr = 6, 
		RULE_whileloop = 7, RULE_asignNumberExpr = 8, RULE_asignStringExpr = 9, 
		RULE_expr = 10, RULE_addExpr = 11, RULE_stringNumberSumExpr = 12, RULE_stringexpr = 13, 
		RULE_sumStringExpr = 14, RULE_comparisson = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "declaration", "declarationSimple", "declarationConst", 
			"conditional", "conditionalExecExpr", "whileloop", "asignNumberExpr", 
			"asignStringExpr", "expr", "addExpr", "stringNumberSumExpr", "stringexpr", 
			"sumStringExpr", "comparisson"
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
			"PTVIRG", "TYPES", "CONST", "ID", "INT", "FLOAT", "STRING", "COMMENT", 
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

	@Override
	public String getGrammarFileName() { return "LabeledExpr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LabeledExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				stat();
				}
				}
				setState(35); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINTLN) | (1L << APARE) | (1L << TYPES) | (1L << CONST) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << NEWLINE))) != 0) );
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

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondiContext extends StatContext {
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public CondiContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterCondi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitCondi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitCondi(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssingContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public AsignNumberExprContext asignNumberExpr() {
			return getRuleContext(AsignNumberExprContext.class,0);
		}
		public AsignStringExprContext asignStringExpr() {
			return getRuleContext(AsignStringExprContext.class,0);
		}
		public AssingContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAssing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAssing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAssing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterBlank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitBlank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitBlank(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarConstContext extends StatContext {
		public DeclarationConstContext declarationConst() {
			return getRuleContext(DeclarationConstContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public DeclarConstContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterDeclarConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitDeclarConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitDeclarConst(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileLoopCContext extends StatContext {
		public WhileloopContext whileloop() {
			return getRuleContext(WhileloopContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public WhileLoopCContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterWhileLoopC(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitWhileLoopC(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitWhileLoopC(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarSimpleContext extends StatContext {
		public DeclarationSimpleContext declarationSimple() {
			return getRuleContext(DeclarationSimpleContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public DeclarSimpleContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterDeclarSimple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitDeclarSimple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitDeclarSimple(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeclarContext extends StatContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public DeclarContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterDeclar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitDeclar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitDeclar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintlnContext extends StatContext {
		public TerminalNode PRINTLN() { return getToken(LabeledExprParser.PRINTLN, 0); }
		public TerminalNode APARE() { return getToken(LabeledExprParser.APARE, 0); }
		public TerminalNode FPARE() { return getToken(LabeledExprParser.FPARE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintlnContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitPrintln(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExpContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(LabeledExprParser.NEWLINE, 0); }
		public ExpContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new WhileLoopCContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				whileloop();
				setState(38);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new CondiContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				conditional();
				setState(41);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new ExpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				expr(0);
				setState(44);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new DeclarContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				declaration();
				setState(47);
				match(NEWLINE);
				}
				break;
			case 5:
				_localctx = new DeclarSimpleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				declarationSimple();
				setState(50);
				match(NEWLINE);
				}
				break;
			case 6:
				_localctx = new DeclarConstContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(52);
				declarationConst();
				setState(53);
				match(NEWLINE);
				}
				break;
			case 7:
				_localctx = new AssingContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(55);
					asignNumberExpr();
					}
					break;
				case 2:
					{
					setState(56);
					asignStringExpr();
					}
					break;
				}
				setState(59);
				match(NEWLINE);
				}
				break;
			case 8:
				_localctx = new PrintlnContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(61);
				match(PRINTLN);
				setState(62);
				match(APARE);
				{
				setState(63);
				expr(0);
				}
				setState(64);
				match(FPARE);
				}
				break;
			case 9:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(66);
				match(NEWLINE);
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

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	 
		public DeclarationContext() { }
		public void copyFrom(DeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecExprContext extends DeclarationContext {
		public List<TerminalNode> TYPES() { return getTokens(LabeledExprParser.TYPES); }
		public TerminalNode TYPES(int i) {
			return getToken(LabeledExprParser.TYPES, i);
		}
		public List<TerminalNode> ID() { return getTokens(LabeledExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LabeledExprParser.ID, i);
		}
		public TerminalNode PTVIRG() { return getToken(LabeledExprParser.PTVIRG, 0); }
		public List<TerminalNode> VIRG() { return getTokens(LabeledExprParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(LabeledExprParser.VIRG, i);
		}
		public DecExprContext(DeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterDecExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitDecExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitDecExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			_localctx = new DecExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(TYPES);
			setState(70);
			match(ID);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(71);
				match(VIRG);
				setState(72);
				match(TYPES);
				setState(73);
				match(ID);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(PTVIRG);
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

	public static class DeclarationSimpleContext extends ParserRuleContext {
		public DeclarationSimpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSimple; }
	 
		public DeclarationSimpleContext() { }
		public void copyFrom(DeclarationSimpleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecSimpleExprContext extends DeclarationSimpleContext {
		public TerminalNode TYPES() { return getToken(LabeledExprParser.TYPES, 0); }
		public List<TerminalNode> ID() { return getTokens(LabeledExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LabeledExprParser.ID, i);
		}
		public TerminalNode PTVIRG() { return getToken(LabeledExprParser.PTVIRG, 0); }
		public List<TerminalNode> VIRG() { return getTokens(LabeledExprParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(LabeledExprParser.VIRG, i);
		}
		public DecSimpleExprContext(DeclarationSimpleContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterDecSimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitDecSimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitDecSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSimpleContext declarationSimple() throws RecognitionException {
		DeclarationSimpleContext _localctx = new DeclarationSimpleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declarationSimple);
		int _la;
		try {
			_localctx = new DecSimpleExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(TYPES);
			setState(82);
			match(ID);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(83);
				match(VIRG);
				setState(84);
				match(ID);
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(90);
			match(PTVIRG);
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

	public static class DeclarationConstContext extends ParserRuleContext {
		public DeclarationConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationConst; }
	 
		public DeclarationConstContext() { }
		public void copyFrom(DeclarationConstContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecConstExprContext extends DeclarationConstContext {
		public TerminalNode CONST() { return getToken(LabeledExprParser.CONST, 0); }
		public TerminalNode TYPES() { return getToken(LabeledExprParser.TYPES, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LabeledExprParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StringexprContext stringexpr() {
			return getRuleContext(StringexprContext.class,0);
		}
		public DecConstExprContext(DeclarationConstContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterDecConstExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitDecConstExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitDecConstExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationConstContext declarationConst() throws RecognitionException {
		DeclarationConstContext _localctx = new DeclarationConstContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarationConst);
		try {
			_localctx = new DecConstExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(CONST);
			setState(93);
			match(TYPES);
			setState(94);
			match(ID);
			setState(95);
			match(EQ);
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(96);
				expr(0);
				}
				break;
			case 2:
				{
				setState(97);
				stringexpr();
				}
				break;
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

	public static class ConditionalContext extends ParserRuleContext {
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	 
		public ConditionalContext() { }
		public void copyFrom(ConditionalContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondExprContext extends ConditionalContext {
		public TerminalNode IF() { return getToken(LabeledExprParser.IF, 0); }
		public TerminalNode APARE() { return getToken(LabeledExprParser.APARE, 0); }
		public ComparissonContext comparisson() {
			return getRuleContext(ComparissonContext.class,0);
		}
		public TerminalNode FPARE() { return getToken(LabeledExprParser.FPARE, 0); }
		public List<TerminalNode> ABCHAV() { return getTokens(LabeledExprParser.ABCHAV); }
		public TerminalNode ABCHAV(int i) {
			return getToken(LabeledExprParser.ABCHAV, i);
		}
		public List<ConditionalExecExprContext> conditionalExecExpr() {
			return getRuleContexts(ConditionalExecExprContext.class);
		}
		public ConditionalExecExprContext conditionalExecExpr(int i) {
			return getRuleContext(ConditionalExecExprContext.class,i);
		}
		public List<TerminalNode> FCCHAV() { return getTokens(LabeledExprParser.FCCHAV); }
		public TerminalNode FCCHAV(int i) {
			return getToken(LabeledExprParser.FCCHAV, i);
		}
		public TerminalNode ELSE() { return getToken(LabeledExprParser.ELSE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(LabeledExprParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(LabeledExprParser.NEWLINE, i);
		}
		public CondExprContext(ConditionalContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterCondExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitCondExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitCondExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditional);
		int _la;
		try {
			int _alt;
			_localctx = new CondExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(IF);
			setState(101);
			match(APARE);
			setState(102);
			comparisson();
			setState(103);
			match(FPARE);
			setState(104);
			match(ABCHAV);
			setState(105);
			conditionalExecExpr();
			setState(106);
			match(FCCHAV);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(107);
				match(ELSE);
				setState(108);
				match(ABCHAV);
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(109);
						match(NEWLINE);
						}
						} 
					}
					setState(114);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(115);
				conditionalExecExpr();
				setState(116);
				match(FCCHAV);
				}
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

	public static class ConditionalExecExprContext extends ParserRuleContext {
		public ConditionalExecExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExecExpr; }
	 
		public ConditionalExecExprContext() { }
		public void copyFrom(ConditionalExecExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondExecContext extends ConditionalExecExprContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public CondExecContext(ConditionalExecExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterCondExec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitCondExec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitCondExec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExecExprContext conditionalExecExpr() throws RecognitionException {
		ConditionalExecExprContext _localctx = new ConditionalExecExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_conditionalExecExpr);
		int _la;
		try {
			_localctx = new CondExecContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(121); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(120);
				stat();
				}
				}
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINTLN) | (1L << APARE) | (1L << TYPES) | (1L << CONST) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << NEWLINE))) != 0) );
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

	public static class WhileloopContext extends ParserRuleContext {
		public WhileloopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileloop; }
	 
		public WhileloopContext() { }
		public void copyFrom(WhileloopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhileExprContext extends WhileloopContext {
		public TerminalNode WHILE() { return getToken(LabeledExprParser.WHILE, 0); }
		public TerminalNode APARE() { return getToken(LabeledExprParser.APARE, 0); }
		public ComparissonContext comparisson() {
			return getRuleContext(ComparissonContext.class,0);
		}
		public TerminalNode FPARE() { return getToken(LabeledExprParser.FPARE, 0); }
		public TerminalNode ABCHAV() { return getToken(LabeledExprParser.ABCHAV, 0); }
		public TerminalNode FCCHAV() { return getToken(LabeledExprParser.FCCHAV, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public WhileExprContext(WhileloopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterWhileExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitWhileExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitWhileExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileloopContext whileloop() throws RecognitionException {
		WhileloopContext _localctx = new WhileloopContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileloop);
		int _la;
		try {
			_localctx = new WhileExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(WHILE);
			setState(126);
			match(APARE);
			setState(127);
			comparisson();
			setState(128);
			match(FPARE);
			setState(129);
			match(ABCHAV);
			setState(131); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(130);
				stat();
				}
				}
				setState(133); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << PRINTLN) | (1L << APARE) | (1L << TYPES) | (1L << CONST) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << NEWLINE))) != 0) );
			setState(135);
			match(FCCHAV);
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

	public static class AsignNumberExprContext extends ParserRuleContext {
		public AsignNumberExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignNumberExpr; }
	 
		public AsignNumberExprContext() { }
		public void copyFrom(AsignNumberExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssingNumberContext extends AsignNumberExprContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LabeledExprParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssingNumberContext(AsignNumberExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAssingNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAssingNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAssingNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignNumberExprContext asignNumberExpr() throws RecognitionException {
		AsignNumberExprContext _localctx = new AsignNumberExprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignNumberExpr);
		try {
			_localctx = new AssingNumberContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(ID);
			setState(138);
			match(EQ);
			setState(139);
			expr(0);
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

	public static class AsignStringExprContext extends ParserRuleContext {
		public AsignStringExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignStringExpr; }
	 
		public AsignStringExprContext() { }
		public void copyFrom(AsignStringExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssingStringContext extends AsignStringExprContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode EQ() { return getToken(LabeledExprParser.EQ, 0); }
		public StringexprContext stringexpr() {
			return getRuleContext(StringexprContext.class,0);
		}
		public AssingStringContext(AsignStringExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAssingString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAssingString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAssingString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignStringExprContext asignStringExpr() throws RecognitionException {
		AsignStringExprContext _localctx = new AsignStringExprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_asignStringExpr);
		try {
			_localctx = new AssingStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(ID);
			setState(142);
			match(EQ);
			setState(143);
			stringexpr();
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode SUB() { return getToken(LabeledExprParser.SUB, 0); }
		public SubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenContext extends ExprContext {
		public TerminalNode APARE() { return getToken(LabeledExprParser.APARE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FPARE() { return getToken(LabeledExprParser.FPARE, 0); }
		public ParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(LabeledExprParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(LabeledExprParser.DIV, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddEContext extends ExprContext {
		public AddExprContext addExpr() {
			return getRuleContext(AddExprContext.class,0);
		}
		public AddEContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAddE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAddE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAddE(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(LabeledExprParser.FLOAT, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new AddEContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(146);
				addExpr();
				}
				break;
			case 2:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(147);
				match(INT);
				}
				break;
			case 3:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(148);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(FLOAT);
				}
				break;
			case 5:
				{
				_localctx = new ParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(APARE);
				setState(151);
				expr(0);
				setState(152);
				match(FPARE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(157);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL || _la==DIV) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(158);
						expr(8);
						}
						break;
					case 2:
						{
						_localctx = new SubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(159);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(160);
						match(SUB);
						setState(161);
						expr(6);
						}
						break;
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AddExprContext extends ParserRuleContext {
		public AddExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExpr; }
	 
		public AddExprContext() { }
		public void copyFrom(AddExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AddContext extends AddExprContext {
		public Token op;
		public TerminalNode ADD() { return getToken(LabeledExprParser.ADD, 0); }
		public TerminalNode STRING() { return getToken(LabeledExprParser.STRING, 0); }
		public TerminalNode INT() { return getToken(LabeledExprParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(LabeledExprParser.FLOAT, 0); }
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public List<StringNumberSumExprContext> stringNumberSumExpr() {
			return getRuleContexts(StringNumberSumExprContext.class);
		}
		public StringNumberSumExprContext stringNumberSumExpr(int i) {
			return getRuleContext(StringNumberSumExprContext.class,i);
		}
		public AddContext(AddExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExprContext addExpr() throws RecognitionException {
		AddExprContext _localctx = new AddExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_addExpr);
		int _la;
		try {
			int _alt;
			_localctx = new AddContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			((AddContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
				((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(168);
			match(ADD);
			setState(170); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(169);
					stringNumberSumExpr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(172); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class StringNumberSumExprContext extends ParserRuleContext {
		public StringNumberSumExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringNumberSumExpr; }
	 
		public StringNumberSumExprContext() { }
		public void copyFrom(StringNumberSumExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringNumberSumContext extends StringNumberSumExprContext {
		public SumStringExprContext sumStringExpr() {
			return getRuleContext(SumStringExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StringNumberSumContext(StringNumberSumExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterStringNumberSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitStringNumberSum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitStringNumberSum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringNumberSumExprContext stringNumberSumExpr() throws RecognitionException {
		StringNumberSumExprContext _localctx = new StringNumberSumExprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stringNumberSumExpr);
		try {
			_localctx = new StringNumberSumContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(174);
				sumStringExpr();
				}
				break;
			case 2:
				{
				setState(175);
				expr(0);
				}
				break;
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

	public static class StringexprContext extends ParserRuleContext {
		public StringexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringexpr; }
	 
		public StringexprContext() { }
		public void copyFrom(StringexprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StringContext extends StringexprContext {
		public TerminalNode STRING() { return getToken(LabeledExprParser.STRING, 0); }
		public StringContext(StringexprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringexprContext stringexpr() throws RecognitionException {
		StringexprContext _localctx = new StringexprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_stringexpr);
		try {
			_localctx = new StringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
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

	public static class SumStringExprContext extends ParserRuleContext {
		public SumStringExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumStringExpr; }
	 
		public SumStringExprContext() { }
		public void copyFrom(SumStringExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SumStringContext extends SumStringExprContext {
		public Token op2;
		public TerminalNode ID() { return getToken(LabeledExprParser.ID, 0); }
		public TerminalNode STRING() { return getToken(LabeledExprParser.STRING, 0); }
		public SumStringContext(SumStringExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterSumString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitSumString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitSumString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumStringExprContext sumStringExpr() throws RecognitionException {
		SumStringExprContext _localctx = new SumStringExprContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sumStringExpr);
		int _la;
		try {
			_localctx = new SumStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			((SumStringContext)_localctx).op2 = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
				((SumStringContext)_localctx).op2 = (Token)_errHandler.recoverInline(this);
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

	public static class ComparissonContext extends ParserRuleContext {
		public ComparissonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisson; }
	 
		public ComparissonContext() { }
		public void copyFrom(ComparissonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompareExprContext extends ComparissonContext {
		public Token op1;
		public Token op2;
		public TerminalNode OPEREL() { return getToken(LabeledExprParser.OPEREL, 0); }
		public List<TerminalNode> INT() { return getTokens(LabeledExprParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(LabeledExprParser.INT, i);
		}
		public List<TerminalNode> FLOAT() { return getTokens(LabeledExprParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(LabeledExprParser.FLOAT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(LabeledExprParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LabeledExprParser.STRING, i);
		}
		public List<TerminalNode> ID() { return getTokens(LabeledExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LabeledExprParser.ID, i);
		}
		public CompareExprContext(ComparissonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).enterCompareExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LabeledExprListener ) ((LabeledExprListener)listener).exitCompareExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LabeledExprVisitor ) return ((LabeledExprVisitor<? extends T>)visitor).visitCompareExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparissonContext comparisson() throws RecognitionException {
		ComparissonContext _localctx = new ComparissonContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comparisson);
		int _la;
		try {
			_localctx = new CompareExprContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			((CompareExprContext)_localctx).op1 = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
				((CompareExprContext)_localctx).op1 = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(183);
			match(OPEREL);
			setState(184);
			((CompareExprContext)_localctx).op2 = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) ) {
				((CompareExprContext)_localctx).op2 = (Token)_errHandler.recoverInline(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00bd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2"+
		"$\n\2\r\2\16\2%\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3F\n\3\3\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6e\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7q\n\7\f\7\16\7t\13\7\3\7"+
		"\3\7\3\7\5\7y\n\7\3\b\6\b|\n\b\r\b\16\b}\3\t\3\t\3\t\3\t\3\t\3\t\6\t\u0086"+
		"\n\t\r\t\16\t\u0087\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u009d\n\f\3\f\3\f\3\f\3\f\3\f\3\f\7"+
		"\f\u00a5\n\f\f\f\16\f\u00a8\13\f\3\r\3\r\3\r\6\r\u00ad\n\r\r\r\16\r\u00ae"+
		"\3\16\3\16\5\16\u00b3\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\2\3\26\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\5\3\2\n\13\3\2\27"+
		"\32\4\2\27\27\32\32\2\u00c5\2#\3\2\2\2\4E\3\2\2\2\6G\3\2\2\2\bS\3\2\2"+
		"\2\n^\3\2\2\2\ff\3\2\2\2\16{\3\2\2\2\20\177\3\2\2\2\22\u008b\3\2\2\2\24"+
		"\u008f\3\2\2\2\26\u009c\3\2\2\2\30\u00a9\3\2\2\2\32\u00b2\3\2\2\2\34\u00b4"+
		"\3\2\2\2\36\u00b6\3\2\2\2 \u00b8\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$%\3\2\2"+
		"\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'(\5\20\t\2()\7\34\2\2)F\3\2\2\2*+\5"+
		"\f\7\2+,\7\34\2\2,F\3\2\2\2-.\5\26\f\2./\7\34\2\2/F\3\2\2\2\60\61\5\6"+
		"\4\2\61\62\7\34\2\2\62F\3\2\2\2\63\64\5\b\5\2\64\65\7\34\2\2\65F\3\2\2"+
		"\2\66\67\5\n\6\2\678\7\34\2\28F\3\2\2\29<\5\22\n\2:<\5\24\13\2;9\3\2\2"+
		"\2;:\3\2\2\2<=\3\2\2\2=>\7\34\2\2>F\3\2\2\2?@\7\7\2\2@A\7\21\2\2AB\5\26"+
		"\f\2BC\7\22\2\2CF\3\2\2\2DF\7\34\2\2E\'\3\2\2\2E*\3\2\2\2E-\3\2\2\2E\60"+
		"\3\2\2\2E\63\3\2\2\2E\66\3\2\2\2E;\3\2\2\2E?\3\2\2\2ED\3\2\2\2F\5\3\2"+
		"\2\2GH\7\25\2\2HN\7\27\2\2IJ\7\23\2\2JK\7\25\2\2KM\7\27\2\2LI\3\2\2\2"+
		"MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\24\2\2R\7\3\2\2"+
		"\2ST\7\25\2\2TY\7\27\2\2UV\7\23\2\2VX\7\27\2\2WU\3\2\2\2X[\3\2\2\2YW\3"+
		"\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7\24\2\2]\t\3\2\2\2^_\7\26\2"+
		"\2_`\7\25\2\2`a\7\27\2\2ad\7\16\2\2be\5\26\f\2ce\5\34\17\2db\3\2\2\2d"+
		"c\3\2\2\2e\13\3\2\2\2fg\7\3\2\2gh\7\21\2\2hi\5 \21\2ij\7\22\2\2jk\7\17"+
		"\2\2kl\5\16\b\2lx\7\20\2\2mn\7\4\2\2nr\7\17\2\2oq\7\34\2\2po\3\2\2\2q"+
		"t\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\5\16\b\2vw\7\20\2"+
		"\2wy\3\2\2\2xm\3\2\2\2xy\3\2\2\2y\r\3\2\2\2z|\5\4\3\2{z\3\2\2\2|}\3\2"+
		"\2\2}{\3\2\2\2}~\3\2\2\2~\17\3\2\2\2\177\u0080\7\5\2\2\u0080\u0081\7\21"+
		"\2\2\u0081\u0082\5 \21\2\u0082\u0083\7\22\2\2\u0083\u0085\7\17\2\2\u0084"+
		"\u0086\5\4\3\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2"+
		"\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\7\20\2\2\u008a"+
		"\21\3\2\2\2\u008b\u008c\7\27\2\2\u008c\u008d\7\16\2\2\u008d\u008e\5\26"+
		"\f\2\u008e\23\3\2\2\2\u008f\u0090\7\27\2\2\u0090\u0091\7\16\2\2\u0091"+
		"\u0092\5\34\17\2\u0092\25\3\2\2\2\u0093\u0094\b\f\1\2\u0094\u009d\5\30"+
		"\r\2\u0095\u009d\7\30\2\2\u0096\u009d\7\27\2\2\u0097\u009d\7\31\2\2\u0098"+
		"\u0099\7\21\2\2\u0099\u009a\5\26\f\2\u009a\u009b\7\22\2\2\u009b\u009d"+
		"\3\2\2\2\u009c\u0093\3\2\2\2\u009c\u0095\3\2\2\2\u009c\u0096\3\2\2\2\u009c"+
		"\u0097\3\2\2\2\u009c\u0098\3\2\2\2\u009d\u00a6\3\2\2\2\u009e\u009f\f\t"+
		"\2\2\u009f\u00a0\t\2\2\2\u00a0\u00a5\5\26\f\n\u00a1\u00a2\f\7\2\2\u00a2"+
		"\u00a3\7\r\2\2\u00a3\u00a5\5\26\f\b\u00a4\u009e\3\2\2\2\u00a4\u00a1\3"+
		"\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7"+
		"\27\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\t\3\2\2\u00aa\u00ac\7\f\2"+
		"\2\u00ab\u00ad\5\32\16\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\31\3\2\2\2\u00b0\u00b3\5\36\20"+
		"\2\u00b1\u00b3\5\26\f\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3"+
		"\33\3\2\2\2\u00b4\u00b5\7\32\2\2\u00b5\35\3\2\2\2\u00b6\u00b7\t\4\2\2"+
		"\u00b7\37\3\2\2\2\u00b8\u00b9\t\3\2\2\u00b9\u00ba\7\t\2\2\u00ba\u00bb"+
		"\t\3\2\2\u00bb!\3\2\2\2\21%;ENYdrx}\u0087\u009c\u00a4\u00a6\u00ae\u00b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}