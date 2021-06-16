grammar LabeledExpr;

import CommonLexerRules;

prog: stat+;

stat: condicional NEWLINE # condi
    | expr NEWLINE # exp
    | dec NEWLINE # declar
    | enquanto NEWLINE # enquantoE
    | para NEWLINE # paraP
    | decSimples NEWLINE # declarSimple
    | decConst NEWLINE # declarConst
    | (asignNumberExpr|asignStringExpr) NEWLINE # assing
    | PRINTLN APARE (expr) FPARE # Println
    | NEWLINE # blank
    ;

condicional:
    IF APARE comparar FPARE ABCHAV condicionalExecExpr FCCHAV (ELSE ABCHAV NEWLINE* condicionalExecExpr FCCHAV)? # condicionalExpr
    ;

condicionalExecExpr:
    stat+ # condExec
    ;

para:
    FOR APARE asignNumberExpr PTVIRG comparar FPARE ABCHAV stat+ FCCHAV # paraExpr
    ;

enquanto:
    WHILE APARE comparar FPARE ABCHAV stat+ FCCHAV # enquantoExpr
    ;

asignNumberExpr:
    ID EQ expr # assingNumber
    ;

asignStringExpr:
    ID EQ stringExpr # assingString
    ;


expr:
    expr op=(MUL | DIV) expr # MulDiv
    | adicionarExpr # AddE
    | expr SUB expr # Sub
    | INT # int
    | ID # id
    | FLOAT # float
    | APARE expr FPARE # paren
    ;

adicionarExpr:
    op=(STRING | INT | FLOAT | ID) ADD stringNumberExpr+ # Add
    ;

stringNumberExpr:
    (sumStringExpr | expr) # stringNumber
    ;

stringExpr:
    STRING # string
    ;

sumStringExpr:
    op2=(ID | STRING) # sumString
    ;

comparar:
    op1=(INT | FLOAT | STRING | ID) OPEREL op2=(INT | FLOAT | STRING | ID) # compararExpr
    ;

dec:
    TIPO ID (VIRG TIPO ID)*PTVIRG # decExpr
    ;


decSimples:
    TIPO ID (VIRG ID)*PTVIRG # decSimpleExpr
    ;


decConst:
    CONST TIPO ID EQ (expr | stringExpr) # decConstExpr
    ;