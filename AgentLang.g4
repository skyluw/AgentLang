grammar AgentLang;

programa   : agente+ EOF ;

agente     : 'agente' ID '{' cuerpo '}' ;

cuerpo     : estadoDecl? percepcion* regla* ;

estadoDecl : 'estado' ':' ID ';' ;

percepcion : 'percibe' ID ';' ;

regla      : 'si' expr 'entonces' accion ';'
           | 'si' expr 'entonces' accion 'sino' accion ';'
           ;

accion     : ID '(' ID? ')' ;

expr       : ID OP NUMBER ;

ID         : [a-zA-Z][a-zA-Z0-9_]* ;
NUMBER     : [0-9]+ ('.' [0-9]+)? ;
OP         : '>' | '<' | '>=' | '<=' | '==' ;
WS         : [ \t\r\n]+ -> skip ;