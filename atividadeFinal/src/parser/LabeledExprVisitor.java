// Generated from C:/JavaLib/exemplo_atividade/g4files\LabeledExpr.g4 by ANTLR 4.9.1
package parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LabeledExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LabeledExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LabeledExprParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(LabeledExprParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condi}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondi(LabeledExprParser.CondiContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exp}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(LabeledExprParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declar}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclar(LabeledExprParser.DeclarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enquantoE}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnquantoE(LabeledExprParser.EnquantoEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paraP}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaP(LabeledExprParser.ParaPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarSimple}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarSimple(LabeledExprParser.DeclarSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarConst}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarConst(LabeledExprParser.DeclarConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assing}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssing(LabeledExprParser.AssingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Println}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(LabeledExprParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LabeledExprParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(LabeledExprParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condicionalExpr}
	 * labeled alternative in {@link LabeledExprParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionalExpr(LabeledExprParser.CondicionalExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condExec}
	 * labeled alternative in {@link LabeledExprParser#condicionalExecExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExec(LabeledExprParser.CondExecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paraExpr}
	 * labeled alternative in {@link LabeledExprParser#para}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParaExpr(LabeledExprParser.ParaExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code enquantoExpr}
	 * labeled alternative in {@link LabeledExprParser#enquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnquantoExpr(LabeledExprParser.EnquantoExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assingNumber}
	 * labeled alternative in {@link LabeledExprParser#asignNumberExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssingNumber(LabeledExprParser.AssingNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assingString}
	 * labeled alternative in {@link LabeledExprParser#asignStringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssingString(LabeledExprParser.AssingStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(LabeledExprParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paren}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParen(LabeledExprParser.ParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(LabeledExprParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddE}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddE(LabeledExprParser.AddEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(LabeledExprParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code float}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(LabeledExprParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LabeledExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(LabeledExprParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link LabeledExprParser#adicionarExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(LabeledExprParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringNumber}
	 * labeled alternative in {@link LabeledExprParser#stringNumberExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringNumber(LabeledExprParser.StringNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link LabeledExprParser#stringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(LabeledExprParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sumString}
	 * labeled alternative in {@link LabeledExprParser#sumStringExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSumString(LabeledExprParser.SumStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compararExpr}
	 * labeled alternative in {@link LabeledExprParser#comparar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompararExpr(LabeledExprParser.CompararExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decExpr}
	 * labeled alternative in {@link LabeledExprParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecExpr(LabeledExprParser.DecExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decSimpleExpr}
	 * labeled alternative in {@link LabeledExprParser#decSimples}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecSimpleExpr(LabeledExprParser.DecSimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decConstExpr}
	 * labeled alternative in {@link LabeledExprParser#decConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecConstExpr(LabeledExprParser.DecConstExprContext ctx);
}