grammar AgentLang;

// ── PARSER RULES ──────────────────────────
programa   : agente+ EOF ;

agente     : 'agente' ID '{' cuerpo '}' ;

cuerpo     : estadoDecl? percepcion* regla* ;

estadoDecl : 'estado' ':' ID ';' ;

percepcion : 'percibe' tipo ID ';' ;

regla      : 'si' condicion 'entonces' '{' accion+ '}'
           | 'si' condicion 'entonces' '{' accion+ '}' 'sino' '{' accion+ '}'
           ;

condicion  : expr (('y' | 'o') expr)* ;

expr       : ID OP valor
           | ID
           | 'no' ID
           ;

accion     : 'accion' ID '(' args? ')' ';'
           | 'enviar' '(' STRING ',' ID ')' ';'
           ;

args       : valor (',' valor)* ;

valor      : NUMBER | STRING | ID | BOOL ;

tipo       : 'numero' | 'texto' | 'booleano' ;

// ── LEXER RULES ───────────────────────────
BOOL      : 'verdadero' | 'falso' ;
STRING    : '"' (~["\r\n])* '"' ;
ID        : [a-zA-Z][a-zA-Z0-9_]* ;
NUMBER    : '-'? [0-9]+ ('.' [0-9]+)? ;
OP        : '>' | '<' | '>=' | '<=' | '==' | '!=' ;
WS        : [ \t\r\n]+ -> skip ;
COMMENT   : '//' ~[\r\n]* -> skip ;