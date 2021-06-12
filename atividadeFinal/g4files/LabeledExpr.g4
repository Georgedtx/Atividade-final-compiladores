grammar LabeledExpr;

import CommonLexerRules;

prog: stat+;

stat: expr NEWLINE  # printExpr
    | ID EQ expr NEWLINE # assign
    | NEWLINE # blank
    | IF expr ABCHA NEWLINE stat NEWLINE FCCHA ELSE ABCHA NEWLINE stat NEWLINE FCCHA # ifElse
    | PRINTLN expr # println
    | WHILE expr ABCHA NEWLINE stat NEWLINE FCCHA # while
    | FOR expr PONTVIG expr ABCHA NEWLINE stat NEWLINE FCCHA # for
    ;

expr: expr op=(MUL | DIV) expr # MulDiv
    | expr op=(ADD | SUB) expr # AddSub
    | expr op=(MENORQ | MAIORQ) expr # MaiorMenor
    | ID # id
    | dec # declaracao
    | var # variavel
    | APARE expr FPARE # parens
    ;

dec:  var ID PONTVIG 
    | var ID VIRG var 
    ;

var:  INT # int
    | STRING # string
    | FLOAT # float
    ;