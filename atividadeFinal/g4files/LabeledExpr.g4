grammar LabeledExpr;

import CommonLexerRules;

prog: stat+;

stat: whileloop NEWLINE # whileLoopC
    | conditional NEWLINE # condi
    | expr NEWLINE # exp
    | declaration NEWLINE # declar
    | declarationSimple NEWLINE # declarSimple
    | declarationConst NEWLINE # declarConst
    | (asignNumberExpr|asignStringExpr) NEWLINE # assing
    | PRINTLN APARE (expr) FPARE # Println
    | NEWLINE # blank
    ;


declaration:
    TYPES ID (VIRG TYPES ID)*PTVIRG # decExpr
    ;


declarationSimple:
    TYPES ID (VIRG ID)*PTVIRG # decSimpleExpr
    ;


declarationConst:
    CONST TYPES ID EQ (expr | stringexpr) # decConstExpr
    ;


conditional:
    IF APARE comparisson FPARE ABCHAV conditionalExecExpr FCCHAV (ELSE ABCHAV NEWLINE* conditionalExecExpr FCCHAV)? # condExpr
    ;

conditionalExecExpr:
    stat+ # condExec
    ;


whileloop:
    WHILE APARE comparisson FPARE ABCHAV stat+ FCCHAV # whileExpr
    ;

asignNumberExpr:
    ID EQ expr # assingNumber
    ;

asignStringExpr:
    ID EQ stringexpr # assingString
    ;


expr:
    expr op=(MUL | DIV) expr # MulDiv
    | addExpr # AddE
    | expr SUB expr # Sub
    | INT # int
    | ID # id
    | FLOAT # float
    | APARE expr FPARE # paren
    ;

addExpr:
    op=(STRING | INT | FLOAT | ID) ADD stringNumberSumExpr+ # Add
    ;

stringNumberSumExpr:
    (sumStringExpr | expr) # stringNumberSum
    ;

stringexpr:
    STRING # string
    ;

sumStringExpr:
    op2=(ID | STRING) # sumString
    ;

comparisson:
    op1=(INT | FLOAT | STRING | ID) OPEREL op2=(INT | FLOAT | STRING | ID) # compareExpr
    ;