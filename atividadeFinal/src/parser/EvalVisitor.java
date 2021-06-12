package parser;

import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends LabeledExprBaseVisitor<Integer> {
    Map<String, Integer> memory = new HashMap<String, Integer>();


    /** ID '=' expr NEWLINE */
    @Override
    public Integer visitAssign(LabeledExprParser.AssignContext ctx) {
        String id = ctx.ID().getText();

        int value = visit(ctx.expr());

        memory.put(id, value);

        return value;

    }

    /** expr NEWLINE */
    @Override
    public Integer visitPrintExpr(LabeledExprParser.PrintExprContext ctx) {
        Integer value = visit(ctx.expr());

        System.out.println(value);

        return 0;

    }

    /** INT */
    @Override
    public Integer visitInt(LabeledExprParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    /** Float */
    @Override
    public Float visitFloat(LabeledExprParser.FloatContext ctx) {
        return Float.valueOf(ctx.FLOAT().getText());
    }

    /** String */
    @Override
    public String visitString(LabeledExprParser.StringContext ctx) {
        return String.valueOf(ctx.STRING().getText());
    }

    /** ID */
    @Override
    public Integer visitId(LabeledExprParser.IdContext ctx) {
        String id = ctx.ID().getText();

        if(memory.containsKey(id)) return memory.get(id);

        return 0;
    }


    /** expr op=('*'|'/') expr */
    @Override
    public Integer visitMulDiv(LabeledExprParser.MulDivContext ctx) {
        int left = visit(ctx.expr(0));

        int right = visit(ctx.expr(1));

        if(ctx.op.getType() == LabeledExprParser.MUL) return left * right;

        return left / right;
    }

    /** expr op=('+' | '-') */
    @Override
    public Integer visitAddSub(LabeledExprParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));


        if(ctx.op.getType() == LabeledExprParser.ADD) return left + right;

        return left - right;

    }

    /** '(' expr ')' */
    @Override
    public Integer visitParens(LabeledExprParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    /** expr NEWLINE */
    @Override 
    public Integer visitPrintln(LabeledExprParser.PrintlnContext ctx) { 
        Integer value = visit(ctx.expr());

        System.out.println(value);

        return 0;
    }

    /** expr op=('>' | '<') */
    @Override 
    public Integer visitMaiorMenor(LabeledExprParser.MaiorMenorContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));


        if((ctx.op.getType() == LabeledExprParser.MAIORQ) && (left > right)){
            return 1;
        }else if((ctx.op.getType() == LabeledExprParser.MENORQ) && (left < right)) {
            return 1;
        }else {
            return 0;
        }      
    }

    @Override
    public Integer visitPrintlnComComentario(LabeledExprParser.PrintlnComComentarioContext ctx) {
        Integer value = visit(ctx.expr());
        String text = String.valueOf(visit(ctx.var()));

        System.out.println(text + value);

        return 0;
    }

    /** If (expr) else (expr) */ 
    @Override 
    public Integer visitIfElse(LabeledExprParser.IfElseContext ctx) {


        /*if(ctx.op.getType() == LabeledExprParser.IF){
            if(ctx.op.getType() == LabeledExprParser.MAIORQ){
                
            }else{

            }
            return 0;
        }*/ 

        return 0;

    }

    @Override
    public Integer visitWhile(LabeledExprParser.WhileContext ctx) { return visitChildren(ctx); }

    @Override 
    public Integer visitVariavel(LabeledExprParser.VariavelContext ctx) { 
        return visitChildren(ctx);
    }
}