lexer grammar CommonLexerRules;

IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
PRINTLN: 'println';
PRINT: 'print';
OPEREL: ('<'|'>'|'=='|'!='|'>='|'<=');
MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
EQ: '=';
ABCHAV: '{';
FCCHAV: '}';
APARE: '(';
FPARE: ')';
VIRG: ',';
PTVIRG: ';';
TYPES: ('int'|'float'|'string');
CONST: 'const';
ID: [a-zA-Z]+;
INT: [0-9]+;
FLOAT
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;
STRING
 : '"' (~["\r\n] | '""')* '"'
 ;
COMMENT: '/*' .*? '*/' -> skip;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;