// Generated from C:/JavaLib/exemplo_atividade/g4files\LabeledExpr.g4 by ANTLR 4.9.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LabeledExprParser}.
 */
public interface LabeledExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LabeledExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LabeledExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(LabeledExprParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(LabeledExprParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LabeledExprParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LabeledExprParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(LabeledExprParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(LabeledExprParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfElse(LabeledExprParser.IfElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElse}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfElse(LabeledExprParser.IfElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code println}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(LabeledExprParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code println}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(LabeledExprParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printlnComComentario}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintlnComComentario(LabeledExprParser.PrintlnComComentarioContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printlnComComentario}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintlnComComentario(LabeledExprParser.PrintlnComComentarioContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile(LabeledExprParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile(LabeledExprParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFor(LabeledExprParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFor(LabeledExprParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(LabeledExprParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(LabeledExprParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaracao}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao(LabeledExprParser.DeclaracaoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaracao}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao(LabeledExprParser.DeclaracaoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(LabeledExprParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(LabeledExprParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(LabeledExprParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(LabeledExprParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MaiorMenor}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMaiorMenor(LabeledExprParser.MaiorMenorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MaiorMenor}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMaiorMenor(LabeledExprParser.MaiorMenorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(LabeledExprParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(LabeledExprParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variavel}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(LabeledExprParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variavel}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(LabeledExprParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LabeledExprParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(LabeledExprParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link LabeledExprParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(LabeledExprParser.DecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link LabeledExprParser#var}.
	 * @param ctx the parse tree
	 */
	void enterInt(LabeledExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LabeledExprParser#var}.
	 * @param ctx the parse tree
	 */
	void exitInt(LabeledExprParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link LabeledExprParser#var}.
	 * @param ctx the parse tree
	 */
	void enterString(LabeledExprParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link LabeledExprParser#var}.
	 * @param ctx the parse tree
	 */
	void exitString(LabeledExprParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link LabeledExprParser#var}.
	 * @param ctx the parse tree
	 */
	void enterFloat(LabeledExprParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link LabeledExprParser#var}.
	 * @param ctx the parse tree
	 */
	void exitFloat(LabeledExprParser.FloatContext ctx);
}