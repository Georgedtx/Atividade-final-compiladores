package parser;

import java.util.HashMap;
import java.util.Map;

public class EvalVisitor extends LabeledExprBaseVisitor<Object> {
    Map<String, Boolean> memoryConstants = new HashMap<String, Boolean>();
    Map<String, Object> memory = new HashMap<String, Object>();

    @Override public Object visitAssingString(LabeledExprParser.AssingStringContext ctx) {
        try{
            String id = ctx.ID().getText();

            if(memoryConstants.containsKey(id)) { throw new Exception("Variavel ja declarada"); }
            if(!memory.containsKey(id)) { throw new Exception("Variavel nao declarada"); }

            Object value = null;

            if (ctx.stringexpr() != null){
                value = visit(ctx.stringexpr());
            }

            value = tryParse(value);

            memory.put(id, value);

            return value;
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }

        return null;
    }

    @Override
    public Boolean visitAssingNumber(LabeledExprParser.AssingNumberContext ctx) {
        try{
            String id = ctx.ID().getText();

            if(memoryConstants.containsKey(id)) { throw new Exception("Variavel ja declarada"); }
            if(!memory.containsKey(id)) { throw new Exception("Variavel nao declarada"); }

            Object value = null;

            if(ctx.expr() != null){
                value = visit(ctx.expr());
            }

            value = tryParse(value);

            memory.put(id, value);

            return true;
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }

        return false;
    }

    @Override
    public Integer visitPrintln(LabeledExprParser.PrintlnContext ctx) {
        Object value = null;

        if (ctx.expr() != null){
            value = visit(ctx.expr());
        }

        System.out.println(value);

        return 0;
    }

    @Override
    public Integer visitInt(LabeledExprParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override public Double visitFloat(LabeledExprParser.FloatContext ctx) {
        return Double.valueOf(ctx.getText());
    }

    @Override public String visitString(LabeledExprParser.StringContext ctx) {
        String str = ctx.getText();
        str = str.substring(1, str.length() - 1).replace("\"\"", "\"");
        return str;
    }

    @Override
    public Object visitId(LabeledExprParser.IdContext ctx) {
        try{
            String id = ctx.ID().getText();

            if(memory.containsKey(id)) return memory.get(id);

            throw new Exception("Variavel nao declarada");
        }catch(Exception ex){
            System.err.println("Variavel nao declarada");
        }

        return null;
    }

    @Override
    public Object visitMulDiv(LabeledExprParser.MulDivContext ctx) {
        Object left = visit(ctx.expr(0));

        Object right = visit(ctx.expr(1));


        Integer castIntegerLeft = left instanceof Integer ? (Integer) left : null;
        Double castDoubleLeft = left instanceof Double ? (Double) left : null;

        Integer castIntegerRight = right instanceof Integer ? (Integer) right : null;
        Double castDoubleRight = right instanceof Double ? (Double) right : null;

        if(castIntegerLeft == null && castDoubleLeft == null ||
                (castIntegerRight == null && castDoubleRight == null)){
            System.err.println("Variavel incorreta");
        }

        if(ctx.op.getType() == LabeledExprParser.MUL){
            if(castIntegerLeft != null){
                if(castIntegerRight != null){
                    return castIntegerLeft * castIntegerRight;
                }
                return castIntegerLeft * castDoubleRight;
            }
            if(castDoubleLeft != null){
                if(castDoubleRight != null){
                    return castDoubleLeft * castDoubleRight;
                }
                return castDoubleLeft * castIntegerRight;
            }
        }else{
            if(castIntegerLeft != null){
                if(castIntegerRight != null){
                    return castIntegerLeft / castIntegerRight;
                }
                return castIntegerLeft / castDoubleRight;
            }
            if(castDoubleLeft != null){
                if(castDoubleRight != null){
                    return castDoubleLeft / castDoubleRight;
                }
                return castDoubleLeft / castIntegerRight;
            }
        }

        return null;
    }

    @Override public Object visitStringNumberSum(LabeledExprParser.StringNumberSumContext ctx) {
        if (ctx.sumStringExpr() != null){
             return visit(ctx.sumStringExpr());
        }

        return visit(ctx.expr());
    }


    @Override public Object visitAdd(LabeledExprParser.AddContext ctx) {
        Object value = null;
        boolean isString = ctx.op.getType() == LabeledExprParser.STRING;
        boolean isInt = ctx.op.getType() == LabeledExprParser.INT;
        boolean isFloat = ctx.op.getType() == LabeledExprParser.FLOAT;

        try{
            if(isString){
                value = ctx.op.getText().replace("\"","");
            }else if(isInt){
                value = Integer.parseInt(ctx.op.getText());
            }else if(isFloat){
                value = Double.parseDouble(ctx.op.getText());
            }else{
                if(!memory.containsKey(ctx.op.getText())){
                    throw new Exception("Variavel nao declarada");
                }
                value = memory.get(ctx.op.getText());

                if(value instanceof String){
                    isString = true;
                }else if(value instanceof Integer){
                    isInt = true;
                }else{
                    isFloat = true;
                }
            }

            for (int i = 0; i < ctx.stringNumberSumExpr().size(); i++) {

                Object actualValue = visit(ctx.stringNumberSumExpr(i));
                boolean isStringActualValue = false;
                boolean isIntActualValue = false;
                boolean isFloatActualValue = false;
                if(actualValue instanceof Integer){
                    if(isInt){
                        value = (Integer) value + (Integer) actualValue;
                        isIntActualValue = true;
                    }else if(isFloat){
                        value = (Double) value + (Integer) actualValue;
                        isFloatActualValue = true;
                    }else{
                        value = (String) value + actualValue;
                        isStringActualValue = true;
                    }
                }
                if(actualValue instanceof Double){
                    if(isInt){
                        value = (Integer) value + (Double) actualValue;
                        isFloatActualValue = true;
                    }else if(isFloat){
                        value = (Double) value + (Double) actualValue;
                        isFloatActualValue = true;
                    }else{
                        value = (String) value + actualValue;
                        isStringActualValue = true;
                    }
                }
                if(actualValue instanceof String){
                    value = value + (String) actualValue;
                    isStringActualValue = true;
                }
                isString = isStringActualValue;
                isFloat = isFloatActualValue;
                isInt = isFloatActualValue;
            }

            return value;
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }

        return null;
    }

    @Override public Object visitSub(LabeledExprParser.SubContext ctx) {
        Object left = visit(ctx.expr(0));

        Object right = visit(ctx.expr(1));


        Integer castIntegerLeft = left instanceof Integer ? (Integer) left : null;
        Double castDoubleLeft = left instanceof Double ? (Double) left : null;

        Integer castIntegerRight = right instanceof Integer ? (Integer) right : null;
        Double castDoubleRight = right instanceof Double ? (Double) right : null;

        if(castIntegerLeft == null && castDoubleLeft == null ||
                (castIntegerRight == null && castDoubleRight == null)){
            System.err.println("Variavel incorreta");
        }

        if(castIntegerLeft != null){
            if(castIntegerRight != null){
                return castIntegerLeft - castIntegerRight;
            }
            return castIntegerLeft - castDoubleRight;
        }
        if(castDoubleLeft != null){
            if(castDoubleRight != null){
                return castDoubleLeft - castDoubleRight;
            }
            return castDoubleLeft - castIntegerRight;
        }

        return null;
    }

    @Override public String visitSumString(LabeledExprParser.SumStringContext ctx) {
        try{
            if (ctx.op2.getType() == LabeledExprParser.ID){
                if(!memory.containsKey(ctx.op2.getText())){
                    throw new Exception("Variavel nao declarada");
                }

                Object resultTyped = memory.get(ctx.op2.getText());
                return resultTyped == null ? "" : resultTyped.toString();
            }
            return ctx.op2.getText().replace("\"","");
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }
        return "";
    }

    @Override
    public Object visitParen(LabeledExprParser.ParenContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Integer visitDeclar(LabeledExprParser.DeclarContext ctx){
        try{
            String[] types = new String[]{ "int", "float", "string" };

            String declarationText =  ctx.getText();


            declarationText = declarationText.replace(";","");
            String[] variaveis = declarationText.split(",");

            for (int varIndex = 0; varIndex < variaveis.length; varIndex++){
                String variavel = variaveis[varIndex];
                String identificador = "";

                for (int typeIndex = 0; typeIndex < types.length; typeIndex++){
                    String tipoAtual = types[typeIndex];
                    int posicaoTipo = variavel.indexOf(tipoAtual);
                    if(posicaoTipo >= 0){
                        identificador = variavel.replace(tipoAtual,"");
                        break;
                    }
                }

                identificador = identificador.trim();

                if(memory.containsKey(identificador)) { throw new Exception("Variavel ja declarada"); }

                memory.put(identificador, null);
            }
        }catch(Exception ex){
            System.err.println("Variavel ja declarada");
        }

        return 0;
    }

    @Override
    public Integer visitDeclarSimple(LabeledExprParser.DeclarSimpleContext ctx){
        try{
            String[] types = new String[]{ "int", "float", "string" };

            String declarationText =  ctx.getText();


            declarationText = declarationText.replace(";","");
            String[] variaveis = declarationText.split(",");

            for (int varIndex = 0; varIndex < variaveis.length; varIndex++){
                String variavel = variaveis[varIndex];
                String identificador = "";
                for (int typeIndex = 0; typeIndex < types.length; typeIndex++){
                    String tipoAtual = types[typeIndex];
                    int posicaoTipo = variavel.indexOf(tipoAtual);
                    if(posicaoTipo >= 0){
                        identificador = variavel.replace(tipoAtual,"");
                        break;
                    }
                }

                if(identificador.isEmpty()){
                    identificador = variavel;
                }

                identificador = identificador.trim();

                if(memory.containsKey(identificador)) { throw new Exception("Variavel ja declarada"); }

                memory.put(identificador, null);
            }
        }catch(Exception ex){
            System.err.println("Variavel ja declarada");
        }

        return 0;
    }

    @Override
    public Boolean visitDecConstExpr(LabeledExprParser.DecConstExprContext ctx){
        String id = ctx.ID().getText();

        try{
            if(memory.containsKey(id)) { throw new Exception("Variavel ja declarada"); }

            Object value = null;

            if (ctx.stringexpr() != null){
                value = visit(ctx.stringexpr());
            }else{
                value = visit(ctx.expr());
            }

            value = tryParse(value);

            memory.put(id, value);
            memoryConstants.put(id, true);

            return true;
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }

        return false;
    }

    @Override
    public Integer visitCondExpr(LabeledExprParser.CondExprContext ctx) {
        int result = (Integer) visit(ctx.comparisson());

        if (result == 1){
            visit(ctx.conditionalExecExpr(0));
        }else{
            visit(ctx.conditionalExecExpr(1));
        }

        return 0;
    }

    @Override
    public Integer visitCondExec(LabeledExprParser.CondExecContext ctx) {
        for (int i = 0; i < ctx.stat().size(); i++) {
            visit(ctx.stat(i));
        }
        return 1;
    }

    @Override
    public Integer visitWhileExpr(LabeledExprParser.WhileExprContext ctx) {
        int result = (Integer) visit(ctx.comparisson());

        while (result == 1){
            for (int i = 0; i < ctx.stat().size(); i++) {
                visit(ctx.stat(i));
            }
            result = (Integer) visit(ctx.comparisson());
        }

        return 0;
    }

    @Override
    public Integer visitCompareExpr(LabeledExprParser.CompareExprContext ctx) {
        Object element1;
        Object element2;

        if (ctx.op1.getType() == LabeledExprParser.INT){
            element1 = Integer.valueOf(ctx.op1.getText());
        }else if(ctx.op1.getType() == LabeledExprParser.FLOAT){
            element1 = Double.valueOf(ctx.op1.getText());
        }else if(ctx.op1.getType() == LabeledExprParser.STRING){
            element1 = ctx.op1.getText().replace("\"","");
        }else{
            element1 = memory.get(ctx.op1.getText());
        }

        if (ctx.op2.getType() == LabeledExprParser.INT){
            element2 = Integer.valueOf(ctx.op2.getText());
        }else if(ctx.op2.getType() == LabeledExprParser.FLOAT){
            element2 = Double.valueOf(ctx.op2.getText());
        }else if(ctx.op2.getType() == LabeledExprParser.STRING){
            element2 = ctx.op2.getText().replace("\"","");
        }else{
            element2 = memory.get(ctx.op2.getText());
        }

        String comparador = ctx.OPEREL().getText();

        try{
            if (comparador.equals("<")){
                if(element1 instanceof Integer){
                    if(element2 instanceof Integer){
                        return (Integer) element1 < (Integer)  element2 ? 1 : 0;
                    }else if(element2 instanceof Double){
                        return (Integer) element1 < (Double)  element2 ? 1 : 0;
                    }
                    throw new Exception("Tipos nao podem ser comparados");
                }else if(element1 instanceof Double){
                    if(element2 instanceof Integer){
                        return (Double) element1 < (Integer) element2 ? 1 : 0;
                    }else if(element2 instanceof Double){
                        return (Double) element1 < (Double) element2 ? 1 : 0;
                    }
                    throw new Exception("Tipos nao podem ser comparados");
                }else{
                    throw new Exception("Tipo incorreto");
                }
            }else if(comparador.equals(">")){
                if(element1 instanceof Integer){
                    if(element2 instanceof Integer){
                        return (Integer) element1 > (Integer)  element2 ? 1 : 0;
                    }else if(element2 instanceof Double){
                        return (Integer) element1 > (Double)  element2 ? 1 : 0;
                    }
                    throw new Exception("Tipos nao podem ser comparados");
                }else if(element1 instanceof Double){
                    if(element2 instanceof Integer){
                        return (Double) element1 > (Integer) element2 ? 1 : 0;
                    }else if(element2 instanceof Double){
                        return (Double) element1 > (Double) element2 ? 1 : 0;
                    }
                    throw new Exception("Tipos nao podem ser comparados");
                }else{
                    throw new Exception("Tipo incorreto");
                }
            }else if(comparador.equals("==")){
                if(element1 instanceof Integer){
                    if(element2 instanceof Integer){
                        return ((Integer) element1).equals((Integer)  element2) ? 1 : 0;
                    }else if(element2 instanceof Double){
                        return 0;
                    }
                    throw new Exception("Tipos nao podem ser comparados");
                }else if(element1 instanceof Double){
                    if(element2 instanceof Integer){
                        return 0;
                    }else if(element2 instanceof Double){
                        return ((Double) element1).equals((Double)  element2) ? 1 : 0;
                    }
                    throw new Exception("Tipos nao podem ser comparados");
                }else{
                    if(!(element2 instanceof String)){
                        throw new Exception("Tipo incorreto");
                    }
                    return ((String) element1).equals((String)  element2) ? 1 : 0;
                }
            }else if(comparador.equals(">=")){
                if(element1 instanceof Integer){
                    if(element2 instanceof Integer){
                        return (Integer) element1 >= (Integer)  element2 ? 1 : 0;
                    }else if(element2 instanceof Double){
                        return (Integer) element1 >= (Double)  element2 ? 1 : 0;
                    }
                    throw new Exception("Tipos nao podem ser comparados");
                }else if(element1 instanceof Double){
                    if(element2 instanceof Integer){
                        return (Double) element1 >= (Integer) element2 ? 1 : 0;
                    }else if(element2 instanceof Double){
                        return (Double) element1 >= (Double) element2 ? 1 : 0;
                    }
                    throw new Exception("Tipos nao podem ser comparados");
                }else{
                    throw new Exception("Tipo incorreto");
                }
            }else if(comparador.equals("<=")){
                if(element1 instanceof Integer){
                    if(element2 instanceof Integer){
                        return (Integer) element1 <= (Integer)  element2 ? 1 : 0;
                    }else if(element2 instanceof Double){
                        return (Integer) element1 <= (Double)  element2 ? 1 : 0;
                    }
                    throw new Exception("Tipos nao podem ser comparados");
                }else if(element1 instanceof Double){
                    if(element2 instanceof Integer){
                        return (Double) element1 <= (Integer) element2 ? 1 : 0;
                    }else if(element2 instanceof Double){
                        return (Double) element1 <= (Double) element2 ? 1 : 0;
                    }
                    throw new Exception("Tipos nao podem ser comparados");
                }else{
                    throw new Exception("Tipo incorreto");
                }
            }else{
                if(element1 instanceof Integer){
                    if(element2 instanceof Integer){
                        return !((Integer) element1).equals((Integer)  element2) ? 1 : 0;
                    }else if(element2 instanceof Double){
                        return 0;
                    }
                    throw new Exception("Tipos nao podem ser comparados");
                }else if(element1 instanceof Double){
                    if(element2 instanceof Integer){
                        return 0;
                    }else if(element2 instanceof Double){
                        return !((Double) element1).equals((Double)  element2) ? 1 : 0;
                    }
                    throw new Exception("Tipos nao podem ser comparados");
                }else{
                    if(!(element2 instanceof String)){
                        throw new Exception("Tipo incorreto");
                    }
                    return !((String) element1).equals((String)  element2) ? 1 : 0;
                }
            }
        }catch (Exception ex){
            System.err.println(ex.getMessage());
        }

        return null;
    }


    public static Object tryParse(Object value){
        if(value == null){
            return null;
        }

        Integer convertedInt = tryParseInt(value.toString());

        if(convertedInt != null){
            return convertedInt;
        }

        Double convertedDouble = tryParseDouble(value.toString());

        if(convertedDouble != null){
            return convertedDouble;
        }

        return value;
    }

    private static Integer tryParseInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    private static Double tryParseDouble(String value) {
        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

}