// Generated from C:/Users/Alex/IdeaProjects/untitled/src\E.g4 by ANTLR 4.7
package com.company.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_statement = 2, RULE_digit_expression = 3, 
		RULE_expression = 4, RULE_input_signature = 5, RULE_assign_int = 6, RULE_assign_int_by_subprogram = 7, 
		RULE_programm_call = 8, RULE_assign_vec = 9, RULE_assign_vec_by_subprogram = 10, 
		RULE_set_vec_expr = 11, RULE_set_vec_expr_by_mat = 12, RULE_assign_mat = 13, 
		RULE_set_mat = 14, RULE_set_mat_expr = 15, RULE_get_mat_row_by_id = 16, 
		RULE_print_number = 17, RULE_print_id = 18, RULE_print_string = 19, RULE_print_mat_row = 20, 
		RULE_simple_compare = 21, RULE_hard_compare = 22, RULE_else_compare = 23, 
		RULE_while_cicle = 24, RULE_compare = 25, RULE_type = 26, RULE_signature = 27, 
		RULE_subprogram_return = 28, RULE_subprogram_non_return = 29, RULE_block_return = 30, 
		RULE_block_non_return = 31, RULE_global_program = 32;
	public static final String[] ruleNames = {
		"program", "block", "statement", "digit_expression", "expression", "input_signature", 
		"assign_int", "assign_int_by_subprogram", "programm_call", "assign_vec", 
		"assign_vec_by_subprogram", "set_vec_expr", "set_vec_expr_by_mat", "assign_mat", 
		"set_mat", "set_mat_expr", "get_mat_row_by_id", "print_number", "print_id", 
		"print_string", "print_mat_row", "simple_compare", "hard_compare", "else_compare", 
		"while_cicle", "compare", "type", "signature", "subprogram_return", "subprogram_non_return", 
		"block_return", "block_non_return", "global_program"
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

	@Override
	public String getGrammarFileName() { return "E.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__0);
			setState(67);
			block();
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(EParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(EParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(BEGIN);
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				statement();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << IF) | (1L << WHILE) | (1L << VECTOR) | (1L << MATRIX) | (1L << ID))) != 0) );
			setState(75);
			match(END);
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

	public static class StatementContext extends ParserRuleContext {
		public Assign_intContext assign_int() {
			return getRuleContext(Assign_intContext.class,0);
		}
		public Assign_int_by_subprogramContext assign_int_by_subprogram() {
			return getRuleContext(Assign_int_by_subprogramContext.class,0);
		}
		public Programm_callContext programm_call() {
			return getRuleContext(Programm_callContext.class,0);
		}
		public While_cicleContext while_cicle() {
			return getRuleContext(While_cicleContext.class,0);
		}
		public Assign_vecContext assign_vec() {
			return getRuleContext(Assign_vecContext.class,0);
		}
		public Set_vec_exprContext set_vec_expr() {
			return getRuleContext(Set_vec_exprContext.class,0);
		}
		public Set_vec_expr_by_matContext set_vec_expr_by_mat() {
			return getRuleContext(Set_vec_expr_by_matContext.class,0);
		}
		public Assign_vec_by_subprogramContext assign_vec_by_subprogram() {
			return getRuleContext(Assign_vec_by_subprogramContext.class,0);
		}
		public Assign_matContext assign_mat() {
			return getRuleContext(Assign_matContext.class,0);
		}
		public Set_mat_exprContext set_mat_expr() {
			return getRuleContext(Set_mat_exprContext.class,0);
		}
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public Print_idContext print_id() {
			return getRuleContext(Print_idContext.class,0);
		}
		public Print_mat_rowContext print_mat_row() {
			return getRuleContext(Print_mat_rowContext.class,0);
		}
		public Print_stringContext print_string() {
			return getRuleContext(Print_stringContext.class,0);
		}
		public Print_numberContext print_number() {
			return getRuleContext(Print_numberContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(92);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				assign_int();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				assign_int_by_subprogram();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				programm_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				while_cicle();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				assign_vec();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				set_vec_expr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				set_vec_expr_by_mat();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(84);
				assign_vec_by_subprogram();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				assign_mat();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(86);
				set_mat_expr();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(87);
				compare();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(88);
				print_id();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(89);
				print_mat_row();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(90);
				print_string();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(91);
				print_number();
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

	public static class Digit_expressionContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(EParser.NUMBER, 0); }
		public TerminalNode ID() { return getToken(EParser.ID, 0); }
		public List<Digit_expressionContext> digit_expression() {
			return getRuleContexts(Digit_expressionContext.class);
		}
		public Digit_expressionContext digit_expression(int i) {
			return getRuleContext(Digit_expressionContext.class,i);
		}
		public TerminalNode MULTIPLY() { return getToken(EParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(EParser.DIVIDE, 0); }
		public TerminalNode PLUS() { return getToken(EParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(EParser.MINUS, 0); }
		public Digit_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitDigit_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Digit_expressionContext digit_expression() throws RecognitionException {
		return digit_expression(0);
	}

	private Digit_expressionContext digit_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Digit_expressionContext _localctx = new Digit_expressionContext(_ctx, _parentState);
		Digit_expressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_digit_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				{
				setState(95);
				match(NUMBER);
				}
				break;
			case ID:
				{
				setState(96);
				match(ID);
				}
				break;
			case O_BRACKET:
				{
				setState(97);
				match(O_BRACKET);
				setState(98);
				digit_expression(0);
				setState(99);
				match(C_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(109);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new Digit_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_digit_expression);
						setState(103);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(104);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(105);
						digit_expression(6);
						}
						break;
					case 2:
						{
						_localctx = new Digit_expressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_digit_expression);
						setState(106);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(107);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(108);
						digit_expression(5);
						}
						break;
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EParser.ID, 0); }
		public TerminalNode O_BRACKET() { return getToken(EParser.O_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode C_BRACKET() { return getToken(EParser.C_BRACKET, 0); }
		public TerminalNode MULTIPLY() { return getToken(EParser.MULTIPLY, 0); }
		public TerminalNode PLUS() { return getToken(EParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(EParser.MINUS, 0); }
		public Digit_expressionContext digit_expression() {
			return getRuleContext(Digit_expressionContext.class,0);
		}
		public TerminalNode DIVIDE() { return getToken(EParser.DIVIDE, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(115);
				match(ID);
				}
				break;
			case O_BRACKET:
				{
				setState(116);
				match(O_BRACKET);
				setState(117);
				expression(0);
				setState(118);
				match(C_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(133);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(131);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(122);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(123);
						match(MULTIPLY);
						}
						setState(124);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(125);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(126);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(127);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(128);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(129);
						_la = _input.LA(1);
						if ( !(_la==MULTIPLY || _la==DIVIDE) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(130);
						digit_expression(0);
						}
						break;
					}
					} 
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class Input_signatureContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(EParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(EParser.C_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(EParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EParser.ID, i);
		}
		public Input_signatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_signature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitInput_signature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_signatureContext input_signature() throws RecognitionException {
		Input_signatureContext _localctx = new Input_signatureContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_input_signature);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(136);
			match(O_BRACKET);
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					match(ID);
					setState(138);
					match(COMMA);
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			{
			setState(144);
			match(ID);
			}
			setState(145);
			match(C_BRACKET);
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

	public static class Assign_intContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(EParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EParser.INT, i);
		}
		public TerminalNode ID() { return getToken(EParser.ID, 0); }
		public TerminalNode O_BRACKET() { return getToken(EParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(EParser.C_BRACKET, 0); }
		public Digit_expressionContext digit_expression() {
			return getRuleContext(Digit_expressionContext.class,0);
		}
		public Assign_intContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_int; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitAssign_int(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_intContext assign_int() throws RecognitionException {
		Assign_intContext _localctx = new Assign_intContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assign_int);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				{
				setState(147);
				match(INT);
				setState(148);
				match(ID);
				setState(149);
				match(T__1);
				{
				setState(150);
				match(O_BRACKET);
				setState(151);
				match(INT);
				setState(152);
				match(C_BRACKET);
				}
				{
				setState(154);
				digit_expression(0);
				}
				}
				}
				break;
			case ID:
				{
				{
				setState(155);
				match(ID);
				setState(156);
				match(T__1);
				{
				setState(157);
				match(O_BRACKET);
				setState(158);
				match(INT);
				setState(159);
				match(C_BRACKET);
				}
				{
				setState(161);
				digit_expression(0);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Assign_int_by_subprogramContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(EParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(EParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(EParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EParser.ID, i);
		}
		public List<TerminalNode> O_BRACKET() { return getTokens(EParser.O_BRACKET); }
		public TerminalNode O_BRACKET(int i) {
			return getToken(EParser.O_BRACKET, i);
		}
		public List<TerminalNode> C_BRACKET() { return getTokens(EParser.C_BRACKET); }
		public TerminalNode C_BRACKET(int i) {
			return getToken(EParser.C_BRACKET, i);
		}
		public Input_signatureContext input_signature() {
			return getRuleContext(Input_signatureContext.class,0);
		}
		public Assign_int_by_subprogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_int_by_subprogram; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitAssign_int_by_subprogram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_int_by_subprogramContext assign_int_by_subprogram() throws RecognitionException {
		Assign_int_by_subprogramContext _localctx = new Assign_int_by_subprogramContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign_int_by_subprogram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				{
				setState(164);
				match(INT);
				setState(165);
				match(ID);
				setState(166);
				match(T__1);
				{
				setState(167);
				match(O_BRACKET);
				setState(168);
				match(INT);
				setState(169);
				match(C_BRACKET);
				}
				{
				setState(171);
				match(ID);
				setState(175);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(172);
					input_signature();
					}
					break;
				case 2:
					{
					{
					setState(173);
					match(O_BRACKET);
					setState(174);
					match(C_BRACKET);
					}
					}
					break;
				}
				}
				}
				}
				break;
			case ID:
				{
				{
				setState(177);
				match(ID);
				setState(178);
				match(T__1);
				{
				setState(179);
				match(O_BRACKET);
				setState(180);
				match(INT);
				setState(181);
				match(C_BRACKET);
				}
				{
				setState(183);
				match(ID);
				setState(187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(184);
					input_signature();
					}
					break;
				case 2:
					{
					{
					setState(185);
					match(O_BRACKET);
					setState(186);
					match(C_BRACKET);
					}
					}
					break;
				}
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Programm_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EParser.ID, 0); }
		public Input_signatureContext input_signature() {
			return getRuleContext(Input_signatureContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(EParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(EParser.C_BRACKET, 0); }
		public Programm_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programm_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitProgramm_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Programm_callContext programm_call() throws RecognitionException {
		Programm_callContext _localctx = new Programm_callContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_programm_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(191);
			match(ID);
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(192);
				input_signature();
				}
				break;
			case 2:
				{
				{
				setState(193);
				match(O_BRACKET);
				setState(194);
				match(C_BRACKET);
				}
				}
				break;
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

	public static class Assign_vecContext extends ParserRuleContext {
		public TerminalNode VECTOR() { return getToken(EParser.VECTOR, 0); }
		public TerminalNode ID() { return getToken(EParser.ID, 0); }
		public TerminalNode VECTOR_EXPR() { return getToken(EParser.VECTOR_EXPR, 0); }
		public Assign_vecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_vec; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitAssign_vec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_vecContext assign_vec() throws RecognitionException {
		Assign_vecContext _localctx = new Assign_vecContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assign_vec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VECTOR:
				{
				{
				setState(197);
				match(VECTOR);
				setState(198);
				match(ID);
				setState(199);
				match(T__1);
				{
				setState(200);
				match(VECTOR_EXPR);
				}
				}
				}
				break;
			case ID:
				{
				{
				setState(201);
				match(ID);
				setState(202);
				match(T__1);
				{
				setState(203);
				match(VECTOR_EXPR);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Assign_vec_by_subprogramContext extends ParserRuleContext {
		public List<TerminalNode> VECTOR() { return getTokens(EParser.VECTOR); }
		public TerminalNode VECTOR(int i) {
			return getToken(EParser.VECTOR, i);
		}
		public List<TerminalNode> ID() { return getTokens(EParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EParser.ID, i);
		}
		public List<TerminalNode> O_BRACKET() { return getTokens(EParser.O_BRACKET); }
		public TerminalNode O_BRACKET(int i) {
			return getToken(EParser.O_BRACKET, i);
		}
		public List<TerminalNode> C_BRACKET() { return getTokens(EParser.C_BRACKET); }
		public TerminalNode C_BRACKET(int i) {
			return getToken(EParser.C_BRACKET, i);
		}
		public Input_signatureContext input_signature() {
			return getRuleContext(Input_signatureContext.class,0);
		}
		public Assign_vec_by_subprogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_vec_by_subprogram; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitAssign_vec_by_subprogram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_vec_by_subprogramContext assign_vec_by_subprogram() throws RecognitionException {
		Assign_vec_by_subprogramContext _localctx = new Assign_vec_by_subprogramContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign_vec_by_subprogram);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VECTOR:
				{
				{
				setState(206);
				match(VECTOR);
				setState(207);
				match(ID);
				setState(208);
				match(T__1);
				{
				setState(209);
				match(O_BRACKET);
				setState(210);
				match(VECTOR);
				setState(211);
				match(C_BRACKET);
				}
				{
				setState(213);
				match(ID);
				setState(217);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(214);
					input_signature();
					}
					break;
				case 2:
					{
					{
					setState(215);
					match(O_BRACKET);
					setState(216);
					match(C_BRACKET);
					}
					}
					break;
				}
				}
				}
				}
				break;
			case ID:
				{
				{
				setState(219);
				match(ID);
				setState(220);
				match(T__1);
				{
				setState(221);
				match(O_BRACKET);
				setState(222);
				match(VECTOR);
				setState(223);
				match(C_BRACKET);
				}
				{
				setState(225);
				match(ID);
				setState(229);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(226);
					input_signature();
					}
					break;
				case 2:
					{
					{
					setState(227);
					match(O_BRACKET);
					setState(228);
					match(C_BRACKET);
					}
					}
					break;
				}
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Set_vec_exprContext extends ParserRuleContext {
		public List<TerminalNode> VECTOR() { return getTokens(EParser.VECTOR); }
		public TerminalNode VECTOR(int i) {
			return getToken(EParser.VECTOR, i);
		}
		public TerminalNode ID() { return getToken(EParser.ID, 0); }
		public TerminalNode O_BRACKET() { return getToken(EParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(EParser.C_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Set_vec_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_vec_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitSet_vec_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_vec_exprContext set_vec_expr() throws RecognitionException {
		Set_vec_exprContext _localctx = new Set_vec_exprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_set_vec_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VECTOR:
				{
				{
				setState(233);
				match(VECTOR);
				setState(234);
				match(ID);
				setState(235);
				match(T__1);
				{
				setState(236);
				match(O_BRACKET);
				setState(237);
				match(VECTOR);
				setState(238);
				match(C_BRACKET);
				}
				{
				setState(240);
				expression(0);
				}
				}
				}
				break;
			case ID:
				{
				{
				setState(241);
				match(ID);
				setState(242);
				match(T__1);
				{
				setState(243);
				match(O_BRACKET);
				setState(244);
				match(VECTOR);
				setState(245);
				match(C_BRACKET);
				}
				{
				setState(247);
				expression(0);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Set_vec_expr_by_matContext extends ParserRuleContext {
		public TerminalNode VECTOR() { return getToken(EParser.VECTOR, 0); }
		public TerminalNode ID() { return getToken(EParser.ID, 0); }
		public Get_mat_row_by_idContext get_mat_row_by_id() {
			return getRuleContext(Get_mat_row_by_idContext.class,0);
		}
		public Set_vec_expr_by_matContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_vec_expr_by_mat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitSet_vec_expr_by_mat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_vec_expr_by_matContext set_vec_expr_by_mat() throws RecognitionException {
		Set_vec_expr_by_matContext _localctx = new Set_vec_expr_by_matContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_set_vec_expr_by_mat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VECTOR:
				{
				{
				setState(250);
				match(VECTOR);
				setState(251);
				match(ID);
				setState(252);
				match(T__1);
				setState(253);
				get_mat_row_by_id();
				}
				}
				break;
			case ID:
				{
				{
				setState(254);
				match(ID);
				setState(255);
				match(T__1);
				setState(256);
				get_mat_row_by_id();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Assign_matContext extends ParserRuleContext {
		public TerminalNode MATRIX() { return getToken(EParser.MATRIX, 0); }
		public TerminalNode ID() { return getToken(EParser.ID, 0); }
		public TerminalNode MATRIX_EXPR() { return getToken(EParser.MATRIX_EXPR, 0); }
		public Assign_matContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign_mat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitAssign_mat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assign_matContext assign_mat() throws RecognitionException {
		Assign_matContext _localctx = new Assign_matContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign_mat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MATRIX:
				{
				{
				setState(259);
				match(MATRIX);
				setState(260);
				match(ID);
				setState(261);
				match(T__1);
				{
				setState(262);
				match(MATRIX_EXPR);
				}
				}
				}
				break;
			case ID:
				{
				{
				setState(263);
				match(ID);
				setState(264);
				match(T__1);
				{
				setState(265);
				match(MATRIX_EXPR);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Set_matContext extends ParserRuleContext {
		public List<TerminalNode> MATRIX() { return getTokens(EParser.MATRIX); }
		public TerminalNode MATRIX(int i) {
			return getToken(EParser.MATRIX, i);
		}
		public List<TerminalNode> ID() { return getTokens(EParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EParser.ID, i);
		}
		public TerminalNode O_BRACKET() { return getToken(EParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(EParser.C_BRACKET, 0); }
		public Set_matContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_mat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitSet_mat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_matContext set_mat() throws RecognitionException {
		Set_matContext _localctx = new Set_matContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_set_mat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MATRIX:
				{
				{
				setState(268);
				match(MATRIX);
				setState(269);
				match(ID);
				setState(270);
				match(T__1);
				{
				setState(271);
				match(O_BRACKET);
				setState(272);
				match(MATRIX);
				setState(273);
				match(C_BRACKET);
				}
				{
				setState(275);
				match(ID);
				}
				}
				}
				break;
			case ID:
				{
				{
				setState(276);
				match(ID);
				setState(277);
				match(T__1);
				{
				setState(278);
				match(O_BRACKET);
				setState(279);
				match(MATRIX);
				setState(280);
				match(C_BRACKET);
				}
				{
				setState(282);
				match(ID);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Set_mat_exprContext extends ParserRuleContext {
		public List<TerminalNode> MATRIX() { return getTokens(EParser.MATRIX); }
		public TerminalNode MATRIX(int i) {
			return getToken(EParser.MATRIX, i);
		}
		public TerminalNode ID() { return getToken(EParser.ID, 0); }
		public TerminalNode O_BRACKET() { return getToken(EParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(EParser.C_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Set_mat_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_mat_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitSet_mat_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_mat_exprContext set_mat_expr() throws RecognitionException {
		Set_mat_exprContext _localctx = new Set_mat_exprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_set_mat_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MATRIX:
				{
				{
				setState(285);
				match(MATRIX);
				setState(286);
				match(ID);
				setState(287);
				match(T__1);
				{
				setState(288);
				match(O_BRACKET);
				setState(289);
				match(MATRIX);
				setState(290);
				match(C_BRACKET);
				}
				{
				setState(292);
				expression(0);
				}
				}
				}
				break;
			case ID:
				{
				{
				setState(293);
				match(ID);
				setState(294);
				match(T__1);
				{
				setState(295);
				match(O_BRACKET);
				setState(296);
				match(MATRIX);
				setState(297);
				match(C_BRACKET);
				}
				{
				setState(299);
				expression(0);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Get_mat_row_by_idContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EParser.ID, 0); }
		public TerminalNode O_SQARE_BRACKET() { return getToken(EParser.O_SQARE_BRACKET, 0); }
		public Digit_expressionContext digit_expression() {
			return getRuleContext(Digit_expressionContext.class,0);
		}
		public TerminalNode C_SQARE_BRACKET() { return getToken(EParser.C_SQARE_BRACKET, 0); }
		public Get_mat_row_by_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_mat_row_by_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitGet_mat_row_by_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_mat_row_by_idContext get_mat_row_by_id() throws RecognitionException {
		Get_mat_row_by_idContext _localctx = new Get_mat_row_by_idContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_get_mat_row_by_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(302);
			match(ID);
			setState(303);
			match(O_SQARE_BRACKET);
			setState(304);
			digit_expression(0);
			setState(305);
			match(C_SQARE_BRACKET);
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

	public static class Print_numberContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(EParser.PRINT, 0); }
		public TerminalNode O_BRACKET() { return getToken(EParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(EParser.C_BRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(EParser.NUMBER, 0); }
		public Print_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitPrint_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_numberContext print_number() throws RecognitionException {
		Print_numberContext _localctx = new Print_numberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_print_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(PRINT);
			setState(308);
			match(O_BRACKET);
			{
			setState(309);
			match(NUMBER);
			}
			setState(310);
			match(C_BRACKET);
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

	public static class Print_idContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(EParser.PRINT, 0); }
		public TerminalNode O_BRACKET() { return getToken(EParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(EParser.C_BRACKET, 0); }
		public TerminalNode ID() { return getToken(EParser.ID, 0); }
		public Print_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitPrint_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_idContext print_id() throws RecognitionException {
		Print_idContext _localctx = new Print_idContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_print_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(PRINT);
			setState(313);
			match(O_BRACKET);
			{
			setState(314);
			match(ID);
			}
			setState(315);
			match(C_BRACKET);
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

	public static class Print_stringContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(EParser.PRINT, 0); }
		public TerminalNode O_BRACKET() { return getToken(EParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(EParser.C_BRACKET, 0); }
		public TerminalNode ID() { return getToken(EParser.ID, 0); }
		public Print_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_string; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitPrint_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_stringContext print_string() throws RecognitionException {
		Print_stringContext _localctx = new Print_stringContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_print_string);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(PRINT);
			setState(318);
			match(O_BRACKET);
			{
			{
			setState(319);
			match(T__2);
			}
			{
			setState(320);
			match(ID);
			}
			{
			setState(321);
			match(T__2);
			}
			}
			setState(323);
			match(C_BRACKET);
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

	public static class Print_mat_rowContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(EParser.PRINT, 0); }
		public TerminalNode O_BRACKET() { return getToken(EParser.O_BRACKET, 0); }
		public Get_mat_row_by_idContext get_mat_row_by_id() {
			return getRuleContext(Get_mat_row_by_idContext.class,0);
		}
		public TerminalNode C_BRACKET() { return getToken(EParser.C_BRACKET, 0); }
		public Print_mat_rowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_mat_row; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitPrint_mat_row(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_mat_rowContext print_mat_row() throws RecognitionException {
		Print_mat_rowContext _localctx = new Print_mat_rowContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_print_mat_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(PRINT);
			setState(326);
			match(O_BRACKET);
			setState(327);
			get_mat_row_by_id();
			setState(328);
			match(C_BRACKET);
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

	public static class Simple_compareContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(EParser.EQUAL, 0); }
		public TerminalNode NON_EQUAL() { return getToken(EParser.NON_EQUAL, 0); }
		public TerminalNode LESS() { return getToken(EParser.LESS, 0); }
		public TerminalNode GREATER() { return getToken(EParser.GREATER, 0); }
		public List<TerminalNode> ID() { return getTokens(EParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EParser.ID, i);
		}
		public List<Digit_expressionContext> digit_expression() {
			return getRuleContexts(Digit_expressionContext.class);
		}
		public Digit_expressionContext digit_expression(int i) {
			return getRuleContext(Digit_expressionContext.class,i);
		}
		public Simple_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_compare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitSimple_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_compareContext simple_compare() throws RecognitionException {
		Simple_compareContext _localctx = new Simple_compareContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_simple_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(330);
				match(ID);
				}
				break;
			case 2:
				{
				setState(331);
				digit_expression(0);
				}
				break;
			}
			setState(334);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << NON_EQUAL) | (1L << LESS) | (1L << GREATER))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(335);
				match(ID);
				}
				break;
			case 2:
				{
				setState(336);
				digit_expression(0);
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

	public static class Hard_compareContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(EParser.O_BRACKET, 0); }
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public TerminalNode C_BRACKET() { return getToken(EParser.C_BRACKET, 0); }
		public TerminalNode NEGATION() { return getToken(EParser.NEGATION, 0); }
		public Hard_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hard_compare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitHard_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hard_compareContext hard_compare() throws RecognitionException {
		Hard_compareContext _localctx = new Hard_compareContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_hard_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEGATION) {
				{
				setState(339);
				match(NEGATION);
				}
			}

			setState(342);
			match(O_BRACKET);
			setState(343);
			simple_compare();
			setState(344);
			match(C_BRACKET);
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

	public static class Else_compareContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(EParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Else_compareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_compare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitElse_compare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_compareContext else_compare() throws RecognitionException {
		Else_compareContext _localctx = new Else_compareContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_else_compare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(ELSE);
			setState(347);
			block();
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

	public static class While_cicleContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(EParser.WHILE, 0); }
		public TerminalNode O_BRACKET() { return getToken(EParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(EParser.C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public Hard_compareContext hard_compare() {
			return getRuleContext(Hard_compareContext.class,0);
		}
		public While_cicleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_cicle; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitWhile_cicle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_cicleContext while_cicle() throws RecognitionException {
		While_cicleContext _localctx = new While_cicleContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_while_cicle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(WHILE);
			setState(350);
			match(O_BRACKET);
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(351);
				simple_compare();
				}
				break;
			case 2:
				{
				setState(352);
				hard_compare();
				}
				break;
			}
			setState(355);
			match(C_BRACKET);
			setState(356);
			block();
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

	public static class CompareContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(EParser.IF, 0); }
		public TerminalNode O_BRACKET() { return getToken(EParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(EParser.C_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Simple_compareContext simple_compare() {
			return getRuleContext(Simple_compareContext.class,0);
		}
		public Hard_compareContext hard_compare() {
			return getRuleContext(Hard_compareContext.class,0);
		}
		public Else_compareContext else_compare() {
			return getRuleContext(Else_compareContext.class,0);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_compare);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(IF);
			setState(359);
			match(O_BRACKET);
			setState(362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(360);
				simple_compare();
				}
				break;
			case 2:
				{
				setState(361);
				hard_compare();
				}
				break;
			}
			setState(364);
			match(C_BRACKET);
			setState(365);
			block();
			setState(367);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(366);
				else_compare();
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode VECTOR() { return getToken(EParser.VECTOR, 0); }
		public TerminalNode MATRIX() { return getToken(EParser.MATRIX, 0); }
		public TerminalNode INT() { return getToken(EParser.INT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << VECTOR) | (1L << MATRIX))) != 0)) ) {
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

	public static class SignatureContext extends ParserRuleContext {
		public TerminalNode O_BRACKET() { return getToken(EParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(EParser.C_BRACKET, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(EParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(EParser.ID, i);
		}
		public SignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signature; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignatureContext signature() throws RecognitionException {
		SignatureContext _localctx = new SignatureContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_signature);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(371);
			match(O_BRACKET);
			setState(378);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(372);
					type();
					setState(373);
					match(ID);
					setState(374);
					match(COMMA);
					}
					} 
				}
				setState(380);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			{
			setState(381);
			type();
			setState(382);
			match(ID);
			}
			setState(384);
			match(C_BRACKET);
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

	public static class Subprogram_returnContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(EParser.ID, 0); }
		public Block_returnContext block_return() {
			return getRuleContext(Block_returnContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(EParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(EParser.C_BRACKET, 0); }
		public Subprogram_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_return; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitSubprogram_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_returnContext subprogram_return() throws RecognitionException {
		Subprogram_returnContext _localctx = new Subprogram_returnContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_subprogram_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(T__3);
			setState(387);
			type();
			setState(388);
			match(ID);
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(389);
				signature();
				}
				break;
			case 2:
				{
				{
				setState(390);
				match(O_BRACKET);
				setState(391);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(394);
			block_return();
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

	public static class Subprogram_non_returnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EParser.ID, 0); }
		public Block_non_returnContext block_non_return() {
			return getRuleContext(Block_non_returnContext.class,0);
		}
		public SignatureContext signature() {
			return getRuleContext(SignatureContext.class,0);
		}
		public TerminalNode O_BRACKET() { return getToken(EParser.O_BRACKET, 0); }
		public TerminalNode C_BRACKET() { return getToken(EParser.C_BRACKET, 0); }
		public Subprogram_non_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subprogram_non_return; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitSubprogram_non_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Subprogram_non_returnContext subprogram_non_return() throws RecognitionException {
		Subprogram_non_returnContext _localctx = new Subprogram_non_returnContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_subprogram_non_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(T__3);
			setState(397);
			match(ID);
			setState(401);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(398);
				signature();
				}
				break;
			case 2:
				{
				{
				setState(399);
				match(O_BRACKET);
				setState(400);
				match(C_BRACKET);
				}
				}
				break;
			}
			setState(403);
			block_non_return();
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

	public static class Block_returnContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(EParser.BEGIN, 0); }
		public TerminalNode RETURN() { return getToken(EParser.RETURN, 0); }
		public TerminalNode ID() { return getToken(EParser.ID, 0); }
		public TerminalNode END() { return getToken(EParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_return; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitBlock_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_returnContext block_return() throws RecognitionException {
		Block_returnContext _localctx = new Block_returnContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_block_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			match(BEGIN);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << IF) | (1L << WHILE) | (1L << VECTOR) | (1L << MATRIX) | (1L << ID))) != 0)) {
				{
				{
				setState(406);
				statement();
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
			match(RETURN);
			setState(413);
			match(ID);
			setState(414);
			match(END);
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

	public static class Block_non_returnContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(EParser.BEGIN, 0); }
		public TerminalNode RETURN() { return getToken(EParser.RETURN, 0); }
		public TerminalNode END() { return getToken(EParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Block_non_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block_non_return; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitBlock_non_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Block_non_returnContext block_non_return() throws RecognitionException {
		Block_non_returnContext _localctx = new Block_non_returnContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_block_non_return);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(BEGIN);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << INT) | (1L << IF) | (1L << WHILE) | (1L << VECTOR) | (1L << MATRIX) | (1L << ID))) != 0)) {
				{
				{
				setState(417);
				statement();
				}
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(423);
			match(RETURN);
			setState(424);
			match(END);
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

	public static class Global_programContext extends ParserRuleContext {
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<Subprogram_returnContext> subprogram_return() {
			return getRuleContexts(Subprogram_returnContext.class);
		}
		public Subprogram_returnContext subprogram_return(int i) {
			return getRuleContext(Subprogram_returnContext.class,i);
		}
		public List<Subprogram_non_returnContext> subprogram_non_return() {
			return getRuleContexts(Subprogram_non_returnContext.class);
		}
		public Subprogram_non_returnContext subprogram_non_return(int i) {
			return getRuleContext(Subprogram_non_returnContext.class,i);
		}
		public Global_programContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_global_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EVisitor ) return ((EVisitor<? extends T>)visitor).visitGlobal_program(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Global_programContext global_program() throws RecognitionException {
		Global_programContext _localctx = new Global_programContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_global_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			program();
			setState(432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				setState(430);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(428);
					subprogram_return();
					}
					break;
				case 2:
					{
					setState(429);
					subprogram_non_return();
					}
					break;
				}
				}
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
		case 3:
			return digit_expression_sempred((Digit_expressionContext)_localctx, predIndex);
		case 4:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean digit_expression_sempred(Digit_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u01b6\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\3\3\3\6\3J\n\3\r\3\16\3K\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4_\n\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5h\n\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5p\n\5\f\5\16\5s\13"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6{\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\7\6\u0086\n\6\f\6\16\6\u0089\13\6\3\7\3\7\3\7\7\7\u008e\n\7\f\7\16"+
		"\7\u0091\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\5\b\u00a5\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00b2\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00be\n"+
		"\t\5\t\u00c0\n\t\3\n\3\n\3\n\3\n\5\n\u00c6\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00cf\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u00dc\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e8\n\f\5"+
		"\f\u00ea\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u00fb\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0104\n\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u010d\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u011e\n\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u012f\n\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\5\27\u014f\n\27\3\27\3\27\3\27\5\27\u0154"+
		"\n\27\3\30\5\30\u0157\n\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\32\5\32\u0164\n\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\5\33\u016d"+
		"\n\33\3\33\3\33\3\33\5\33\u0172\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\7\35\u017b\n\35\f\35\16\35\u017e\13\35\3\35\3\35\3\35\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\5\36\u018b\n\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\5\37\u0194\n\37\3\37\3\37\3 \3 \7 \u019a\n \f \16 \u019d\13 \3 "+
		"\3 \3 \3 \3!\3!\7!\u01a5\n!\f!\16!\u01a8\13!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\7\"\u01b1\n\"\f\"\16\"\u01b4\13\"\3\"\2\4\b\n#\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@B\2\6\3\2\36\37\3\2\34\35\3\2"+
		"!$\4\2\n\n\17\20\2\u01c7\2D\3\2\2\2\4G\3\2\2\2\6^\3\2\2\2\bg\3\2\2\2\n"+
		"z\3\2\2\2\f\u008a\3\2\2\2\16\u00a4\3\2\2\2\20\u00bf\3\2\2\2\22\u00c1\3"+
		"\2\2\2\24\u00ce\3\2\2\2\26\u00e9\3\2\2\2\30\u00fa\3\2\2\2\32\u0103\3\2"+
		"\2\2\34\u010c\3\2\2\2\36\u011d\3\2\2\2 \u012e\3\2\2\2\"\u0130\3\2\2\2"+
		"$\u0135\3\2\2\2&\u013a\3\2\2\2(\u013f\3\2\2\2*\u0147\3\2\2\2,\u014e\3"+
		"\2\2\2.\u0156\3\2\2\2\60\u015c\3\2\2\2\62\u015f\3\2\2\2\64\u0168\3\2\2"+
		"\2\66\u0173\3\2\2\28\u0175\3\2\2\2:\u0184\3\2\2\2<\u018e\3\2\2\2>\u0197"+
		"\3\2\2\2@\u01a2\3\2\2\2B\u01ac\3\2\2\2DE\7\3\2\2EF\5\4\3\2F\3\3\2\2\2"+
		"GI\7\7\2\2HJ\5\6\4\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2LM\3\2\2\2"+
		"MN\7\b\2\2N\5\3\2\2\2O_\5\16\b\2P_\5\20\t\2Q_\5\22\n\2R_\5\62\32\2S_\5"+
		"\24\13\2T_\5\30\r\2U_\5\32\16\2V_\5\26\f\2W_\5\34\17\2X_\5 \21\2Y_\5\64"+
		"\33\2Z_\5&\24\2[_\5*\26\2\\_\5(\25\2]_\5$\23\2^O\3\2\2\2^P\3\2\2\2^Q\3"+
		"\2\2\2^R\3\2\2\2^S\3\2\2\2^T\3\2\2\2^U\3\2\2\2^V\3\2\2\2^W\3\2\2\2^X\3"+
		"\2\2\2^Y\3\2\2\2^Z\3\2\2\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\7\3\2\2\2`"+
		"a\b\5\1\2ah\7\23\2\2bh\7\22\2\2cd\7\25\2\2de\5\b\5\2ef\7\26\2\2fh\3\2"+
		"\2\2g`\3\2\2\2gb\3\2\2\2gc\3\2\2\2hq\3\2\2\2ij\f\7\2\2jk\t\2\2\2kp\5\b"+
		"\5\blm\f\6\2\2mn\t\3\2\2np\5\b\5\7oi\3\2\2\2ol\3\2\2\2ps\3\2\2\2qo\3\2"+
		"\2\2qr\3\2\2\2r\t\3\2\2\2sq\3\2\2\2tu\b\6\1\2u{\7\22\2\2vw\7\25\2\2wx"+
		"\5\n\6\2xy\7\26\2\2y{\3\2\2\2zt\3\2\2\2zv\3\2\2\2{\u0087\3\2\2\2|}\f\7"+
		"\2\2}~\7\36\2\2~\u0086\5\n\6\b\177\u0080\f\6\2\2\u0080\u0081\t\3\2\2\u0081"+
		"\u0086\5\n\6\7\u0082\u0083\f\4\2\2\u0083\u0084\t\2\2\2\u0084\u0086\5\b"+
		"\5\2\u0085|\3\2\2\2\u0085\177\3\2\2\2\u0085\u0082\3\2\2\2\u0086\u0089"+
		"\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\13\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008f\7\25\2\2\u008b\u008c\7\22\2\2\u008c\u008e\7"+
		"\33\2\2\u008d\u008b\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0092\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0093\7\22"+
		"\2\2\u0093\u0094\7\26\2\2\u0094\r\3\2\2\2\u0095\u0096\7\n\2\2\u0096\u0097"+
		"\7\22\2\2\u0097\u0098\7\4\2\2\u0098\u0099\7\25\2\2\u0099\u009a\7\n\2\2"+
		"\u009a\u009b\7\26\2\2\u009b\u009c\3\2\2\2\u009c\u00a5\5\b\5\2\u009d\u009e"+
		"\7\22\2\2\u009e\u009f\7\4\2\2\u009f\u00a0\7\25\2\2\u00a0\u00a1\7\n\2\2"+
		"\u00a1\u00a2\7\26\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\5\b\5\2\u00a4\u0095"+
		"\3\2\2\2\u00a4\u009d\3\2\2\2\u00a5\17\3\2\2\2\u00a6\u00a7\7\n\2\2\u00a7"+
		"\u00a8\7\22\2\2\u00a8\u00a9\7\4\2\2\u00a9\u00aa\7\25\2\2\u00aa\u00ab\7"+
		"\n\2\2\u00ab\u00ac\7\26\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b1\7\22\2\2\u00ae"+
		"\u00b2\5\f\7\2\u00af\u00b0\7\25\2\2\u00b0\u00b2\7\26\2\2\u00b1\u00ae\3"+
		"\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00c0\3\2\2\2\u00b3\u00b4\7\22\2\2\u00b4"+
		"\u00b5\7\4\2\2\u00b5\u00b6\7\25\2\2\u00b6\u00b7\7\n\2\2\u00b7\u00b8\7"+
		"\26\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bd\7\22\2\2\u00ba\u00be\5\f\7\2\u00bb"+
		"\u00bc\7\25\2\2\u00bc\u00be\7\26\2\2\u00bd\u00ba\3\2\2\2\u00bd\u00bb\3"+
		"\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00a6\3\2\2\2\u00bf\u00b3\3\2\2\2\u00c0"+
		"\21\3\2\2\2\u00c1\u00c5\7\22\2\2\u00c2\u00c6\5\f\7\2\u00c3\u00c4\7\25"+
		"\2\2\u00c4\u00c6\7\26\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\23\3\2\2\2\u00c7\u00c8\7\17\2\2\u00c8\u00c9\7\22\2\2\u00c9\u00ca\7\4"+
		"\2\2\u00ca\u00cf\7%\2\2\u00cb\u00cc\7\22\2\2\u00cc\u00cd\7\4\2\2\u00cd"+
		"\u00cf\7%\2\2\u00ce\u00c7\3\2\2\2\u00ce\u00cb\3\2\2\2\u00cf\25\3\2\2\2"+
		"\u00d0\u00d1\7\17\2\2\u00d1\u00d2\7\22\2\2\u00d2\u00d3\7\4\2\2\u00d3\u00d4"+
		"\7\25\2\2\u00d4\u00d5\7\17\2\2\u00d5\u00d6\7\26\2\2\u00d6\u00d7\3\2\2"+
		"\2\u00d7\u00db\7\22\2\2\u00d8\u00dc\5\f\7\2\u00d9\u00da\7\25\2\2\u00da"+
		"\u00dc\7\26\2\2\u00db\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00dc\u00ea\3"+
		"\2\2\2\u00dd\u00de\7\22\2\2\u00de\u00df\7\4\2\2\u00df\u00e0\7\25\2\2\u00e0"+
		"\u00e1\7\17\2\2\u00e1\u00e2\7\26\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e7\7"+
		"\22\2\2\u00e4\u00e8\5\f\7\2\u00e5\u00e6\7\25\2\2\u00e6\u00e8\7\26\2\2"+
		"\u00e7\u00e4\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00ea\3\2\2\2\u00e9\u00d0"+
		"\3\2\2\2\u00e9\u00dd\3\2\2\2\u00ea\27\3\2\2\2\u00eb\u00ec\7\17\2\2\u00ec"+
		"\u00ed\7\22\2\2\u00ed\u00ee\7\4\2\2\u00ee\u00ef\7\25\2\2\u00ef\u00f0\7"+
		"\17\2\2\u00f0\u00f1\7\26\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00fb\5\n\6\2\u00f3"+
		"\u00f4\7\22\2\2\u00f4\u00f5\7\4\2\2\u00f5\u00f6\7\25\2\2\u00f6\u00f7\7"+
		"\17\2\2\u00f7\u00f8\7\26\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fb\5\n\6\2\u00fa"+
		"\u00eb\3\2\2\2\u00fa\u00f3\3\2\2\2\u00fb\31\3\2\2\2\u00fc\u00fd\7\17\2"+
		"\2\u00fd\u00fe\7\22\2\2\u00fe\u00ff\7\4\2\2\u00ff\u0104\5\"\22\2\u0100"+
		"\u0101\7\22\2\2\u0101\u0102\7\4\2\2\u0102\u0104\5\"\22\2\u0103\u00fc\3"+
		"\2\2\2\u0103\u0100\3\2\2\2\u0104\33\3\2\2\2\u0105\u0106\7\20\2\2\u0106"+
		"\u0107\7\22\2\2\u0107\u0108\7\4\2\2\u0108\u010d\7&\2\2\u0109\u010a\7\22"+
		"\2\2\u010a\u010b\7\4\2\2\u010b\u010d\7&\2\2\u010c\u0105\3\2\2\2\u010c"+
		"\u0109\3\2\2\2\u010d\35\3\2\2\2\u010e\u010f\7\20\2\2\u010f\u0110\7\22"+
		"\2\2\u0110\u0111\7\4\2\2\u0111\u0112\7\25\2\2\u0112\u0113\7\20\2\2\u0113"+
		"\u0114\7\26\2\2\u0114\u0115\3\2\2\2\u0115\u011e\7\22\2\2\u0116\u0117\7"+
		"\22\2\2\u0117\u0118\7\4\2\2\u0118\u0119\7\25\2\2\u0119\u011a\7\20\2\2"+
		"\u011a\u011b\7\26\2\2\u011b\u011c\3\2\2\2\u011c\u011e\7\22\2\2\u011d\u010e"+
		"\3\2\2\2\u011d\u0116\3\2\2\2\u011e\37\3\2\2\2\u011f\u0120\7\20\2\2\u0120"+
		"\u0121\7\22\2\2\u0121\u0122\7\4\2\2\u0122\u0123\7\25\2\2\u0123\u0124\7"+
		"\20\2\2\u0124\u0125\7\26\2\2\u0125\u0126\3\2\2\2\u0126\u012f\5\n\6\2\u0127"+
		"\u0128\7\22\2\2\u0128\u0129\7\4\2\2\u0129\u012a\7\25\2\2\u012a\u012b\7"+
		"\20\2\2\u012b\u012c\7\26\2\2\u012c\u012d\3\2\2\2\u012d\u012f\5\n\6\2\u012e"+
		"\u011f\3\2\2\2\u012e\u0127\3\2\2\2\u012f!\3\2\2\2\u0130\u0131\7\22\2\2"+
		"\u0131\u0132\7\27\2\2\u0132\u0133\5\b\5\2\u0133\u0134\7\30\2\2\u0134#"+
		"\3\2\2\2\u0135\u0136\7\t\2\2\u0136\u0137\7\25\2\2\u0137\u0138\7\23\2\2"+
		"\u0138\u0139\7\26\2\2\u0139%\3\2\2\2\u013a\u013b\7\t\2\2\u013b\u013c\7"+
		"\25\2\2\u013c\u013d\7\22\2\2\u013d\u013e\7\26\2\2\u013e\'\3\2\2\2\u013f"+
		"\u0140\7\t\2\2\u0140\u0141\7\25\2\2\u0141\u0142\7\5\2\2\u0142\u0143\7"+
		"\22\2\2\u0143\u0144\7\5\2\2\u0144\u0145\3\2\2\2\u0145\u0146\7\26\2\2\u0146"+
		")\3\2\2\2\u0147\u0148\7\t\2\2\u0148\u0149\7\25\2\2\u0149\u014a\5\"\22"+
		"\2\u014a\u014b\7\26\2\2\u014b+\3\2\2\2\u014c\u014f\7\22\2\2\u014d\u014f"+
		"\5\b\5\2\u014e\u014c\3\2\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u0153\t\4\2\2\u0151\u0154\7\22\2\2\u0152\u0154\5\b\5\2\u0153\u0151\3"+
		"\2\2\2\u0153\u0152\3\2\2\2\u0154-\3\2\2\2\u0155\u0157\7 \2\2\u0156\u0155"+
		"\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0158\3\2\2\2\u0158\u0159\7\25\2\2"+
		"\u0159\u015a\5,\27\2\u015a\u015b\7\26\2\2\u015b/\3\2\2\2\u015c\u015d\7"+
		"\f\2\2\u015d\u015e\5\4\3\2\u015e\61\3\2\2\2\u015f\u0160\7\16\2\2\u0160"+
		"\u0163\7\25\2\2\u0161\u0164\5,\27\2\u0162\u0164\5.\30\2\u0163\u0161\3"+
		"\2\2\2\u0163\u0162\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\7\26\2\2\u0166"+
		"\u0167\5\4\3\2\u0167\63\3\2\2\2\u0168\u0169\7\13\2\2\u0169\u016c\7\25"+
		"\2\2\u016a\u016d\5,\27\2\u016b\u016d\5.\30\2\u016c\u016a\3\2\2\2\u016c"+
		"\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\7\26\2\2\u016f\u0171\5"+
		"\4\3\2\u0170\u0172\5\60\31\2\u0171\u0170\3\2\2\2\u0171\u0172\3\2\2\2\u0172"+
		"\65\3\2\2\2\u0173\u0174\t\5\2\2\u0174\67\3\2\2\2\u0175\u017c\7\25\2\2"+
		"\u0176\u0177\5\66\34\2\u0177\u0178\7\22\2\2\u0178\u0179\7\33\2\2\u0179"+
		"\u017b\3\2\2\2\u017a\u0176\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2"+
		"\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e\u017c\3\2\2\2\u017f"+
		"\u0180\5\66\34\2\u0180\u0181\7\22\2\2\u0181\u0182\3\2\2\2\u0182\u0183"+
		"\7\26\2\2\u01839\3\2\2\2\u0184\u0185\7\6\2\2\u0185\u0186\5\66\34\2\u0186"+
		"\u018a\7\22\2\2\u0187\u018b\58\35\2\u0188\u0189\7\25\2\2\u0189\u018b\7"+
		"\26\2\2\u018a\u0187\3\2\2\2\u018a\u0188\3\2\2\2\u018b\u018c\3\2\2\2\u018c"+
		"\u018d\5> \2\u018d;\3\2\2\2\u018e\u018f\7\6\2\2\u018f\u0193\7\22\2\2\u0190"+
		"\u0194\58\35\2\u0191\u0192\7\25\2\2\u0192\u0194\7\26\2\2\u0193\u0190\3"+
		"\2\2\2\u0193\u0191\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0196\5@!\2\u0196"+
		"=\3\2\2\2\u0197\u019b\7\7\2\2\u0198\u019a\5\6\4\2\u0199\u0198\3\2\2\2"+
		"\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019e"+
		"\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\7\21\2\2\u019f\u01a0\7\22\2\2"+
		"\u01a0\u01a1\7\b\2\2\u01a1?\3\2\2\2\u01a2\u01a6\7\7\2\2\u01a3\u01a5\5"+
		"\6\4\2\u01a4\u01a3\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\u01a9\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\7\21"+
		"\2\2\u01aa\u01ab\7\b\2\2\u01abA\3\2\2\2\u01ac\u01ad\5\2\2\2\u01ad\u01b2"+
		"\b\"\1\2\u01ae\u01b1\5:\36\2\u01af\u01b1\5<\37\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2"+
		"\2\2\u01b3C\3\2\2\2\u01b4\u01b2\3\2\2\2&K^goqz\u0085\u0087\u008f\u00a4"+
		"\u00b1\u00bd\u00bf\u00c5\u00ce\u00db\u00e7\u00e9\u00fa\u0103\u010c\u011d"+
		"\u012e\u014e\u0153\u0156\u0163\u016c\u0171\u017c\u018a\u0193\u019b\u01a6"+
		"\u01b0\u01b2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}