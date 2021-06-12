lexer grammar CommonLexerRules;

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
CONST: 'const';
EQ: '=';
VIRG: ',';
ABCHA: '{';
FCCHA: '}';
APARE: '(';
FPARE: ')';
IF: 'if';
WHILE: 'while';
FOR: 'for';
MENORQ: '<';
MAIORQ: '>';
ELSE: 'else';
PRINTLN: 'println';
PONTVIG: ';';
ID: [a-zA-Z]+;
INT: [0-9]+;
NEWLINE: '\r'? '\n';
COMMENT: '/*' .*? '*/' -> skip;
WS: [ \t]+ -> skip;