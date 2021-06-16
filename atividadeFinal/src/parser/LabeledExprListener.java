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
	 * Enter a parse tree produced by the {@code condi}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterCondi(LabeledExprParser.CondiContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condi}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitCondi(LabeledExprParser.CondiContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exp}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExp(LabeledExprParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExp(LabeledExprParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declar}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclar(LabeledExprParser.DeclarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declar}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclar(LabeledExprParser.DeclarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enquantoE}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterEnquantoE(LabeledExprParser.EnquantoEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enquantoE}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitEnquantoE(LabeledExprParser.EnquantoEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paraP}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterParaP(LabeledExprParser.ParaPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paraP}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitParaP(LabeledExprParser.ParaPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarSimple}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclarSimple(LabeledExprParser.DeclarSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarSimple}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclarSimple(LabeledExprParser.DeclarSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declarConst}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclarConst(LabeledExprParser.DeclarConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declarConst}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclarConst(LabeledExprParser.DeclarConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assing}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssing(LabeledExprParser.AssingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assing}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssing(LabeledExprParser.AssingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Println}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(LabeledExprParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Println}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(LabeledExprParser.PrintlnContext ctx);
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
	 * Enter a parse tree produced by the {@code condicionalExpr}
	 * labeled alternative in {@link LabeledExprParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalExpr(LabeledExprParser.CondicionalExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condicionalExpr}
	 * labeled alternative in {@link LabeledExprParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalExpr(LabeledExprParser.CondicionalExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condExec}
	 * labeled alternative in {@link LabeledExprParser#condicionalExecExpr}.
	 * @param ctx the parse tree
	 */
	void enterCondExec(LabeledExprParser.CondExecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condExec}
	 * labeled alternative in {@link LabeledExprParser#condicionalExecExpr}.
	 * @param ctx the parse tree
	 */
	void exitCondExec(LabeledExprParser.CondExecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paraExpr}
	 * labeled alternative in {@link LabeledExprParser#para}.
	 * @param ctx the parse tree
	 */
	void enterParaExpr(LabeledExprParser.ParaExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paraExpr}
	 * labeled alternative in {@link LabeledExprParser#para}.
	 * @param ctx the parse tree
	 */
	void exitParaExpr(LabeledExprParser.ParaExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code enquantoExpr}
	 * labeled alternative in {@link LabeledExprParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquantoExpr(LabeledExprParser.EnquantoExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code enquantoExpr}
	 * labeled alternative in {@link LabeledExprParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquantoExpr(LabeledExprParser.EnquantoExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assingNumber}
	 * labeled alternative in {@link LabeledExprParser#asignNumberExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssingNumber(LabeledExprParser.AssingNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assingNumber}
	 * labeled alternative in {@link LabeledExprParser#asignNumberExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssingNumber(LabeledExprParser.AssingNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assingString}
	 * labeled alternative in {@link LabeledExprParser#asignStringExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssingString(LabeledExprParser.AssingStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assingString}
	 * labeled alternative in {@link LabeledExprParser#asignStringExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssingString(LabeledExprParser.AssingStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSub(LabeledExprParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSub(LabeledExprParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paren}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParen(LabeledExprParser.ParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParen(LabeledExprParser.ParenContext ctx);
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
	 * Enter a parse tree produced by the {@code AddE}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddE(LabeledExprParser.AddEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddE}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddE(LabeledExprParser.AddEContext ctx);
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
	 * Enter a parse tree produced by the {@code float}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloat(LabeledExprParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code float}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloat(LabeledExprParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(LabeledExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(LabeledExprParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link LabeledExprParser#adicionarExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdd(LabeledExprParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link LabeledExprParser#adicionarExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdd(LabeledExprParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringNumber}
	 * labeled alternative in {@link LabeledExprParser#stringNumberExpr}.
	 * @param ctx the parse tree
	 */
	void enterStringNumber(LabeledExprParser.StringNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringNumber}
	 * labeled alternative in {@link LabeledExprParser#stringNumberExpr}.
	 * @param ctx the parse tree
	 */
	void exitStringNumber(LabeledExprParser.StringNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link LabeledExprParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void enterString(LabeledExprParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link LabeledExprParser#stringExpr}.
	 * @param ctx the parse tree
	 */
	void exitString(LabeledExprParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sumString}
	 * labeled alternative in {@link LabeledExprParser#sumStringExpr}.
	 * @param ctx the parse tree
	 */
	void enterSumString(LabeledExprParser.SumStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sumString}
	 * labeled alternative in {@link LabeledExprParser#sumStringExpr}.
	 * @param ctx the parse tree
	 */
	void exitSumString(LabeledExprParser.SumStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compararExpr}
	 * labeled alternative in {@link LabeledExprParser#comparar}.
	 * @param ctx the parse tree
	 */
	void enterCompararExpr(LabeledExprParser.CompararExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compararExpr}
	 * labeled alternative in {@link LabeledExprParser#comparar}.
	 * @param ctx the parse tree
	 */
	void exitCompararExpr(LabeledExprParser.CompararExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decExpr}
	 * labeled alternative in {@link LabeledExprParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDecExpr(LabeledExprParser.DecExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decExpr}
	 * labeled alternative in {@link LabeledExprParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDecExpr(LabeledExprParser.DecExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decSimpleExpr}
	 * labeled alternative in {@link LabeledExprParser#decSimples}.
	 * @param ctx the parse tree
	 */
	void enterDecSimpleExpr(LabeledExprParser.DecSimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decSimpleExpr}
	 * labeled alternative in {@link LabeledExprParser#decSimples}.
	 * @param ctx the parse tree
	 */
	void exitDecSimpleExpr(LabeledExprParser.DecSimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decConstExpr}
	 * labeled alternative in {@link LabeledExprParser#decConst}.
	 * @param ctx the parse tree
	 */
	void enterDecConstExpr(LabeledExprParser.DecConstExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decConstExpr}
	 * labeled alternative in {@link LabeledExprParser#decConst}.
	 * @param ctx the parse tree
	 */
	void exitDecConstExpr(LabeledExprParser.DecConstExprContext ctx);
}