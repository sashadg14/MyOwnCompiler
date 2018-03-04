grammar E;
program : 'main_program' block;

block :BEGIN statement+ END;
statement :
    assign_int
    |assign_int_by_subprogram
    |programm_call
    |while_cicle

    |assign_vec
    /*|set_vec*/
    |set_vec_expr
    |set_vec_expr_by_mat
    |assign_vec_by_subprogram
    | assign_mat
   // |set_mat
    |set_mat_expr

    | compare

    | print_id
    | print_mat_row
    | print_string
    | print_number ;

BEGIN : 'begin';
END : 'end';
PRINT: 'print';
INT: 'int';
IF: 'if';
ELSE: 'else';
FOR: 'for';
WHILE: 'while';
VECTOR: 'vector';
MATRIX: 'matrix';
RETURN: 'return';

ID     : [a-zA-Z_][a-zA-Z_0-9]* ;
NUMBER : [0-9]+ ;
WS     : [ \n\t\r]+ -> skip;

O_BRACKET : '(';
C_BRACKET : ')';
O_SQARE_BRACKET : '[';
C_SQARE_BRACKET : ']';
O_S_BRACKET : '{';
C_S_BRACKET : '}';

COMMA : ',' ;
PLUS : '+' ;
MINUS : '-' ;
MULTIPLY : '*' ;
DIVIDE : '/' ;


NEGATION : '!';
EQUAL: '==';
NON_EQUAL: '!=';
LESS: '<';
GREATER: '>';

digit_expression:	digit_expression (MULTIPLY|DIVIDE) digit_expression
    |	digit_expression (PLUS|MINUS) digit_expression
    |	NUMBER
    |	ID
    |	'(' digit_expression ')'
    ;

expression:	expression (MULTIPLY) expression
    |	expression (PLUS|MINUS) expression
    |	ID
    |   expression (MULTIPLY|DIVIDE) digit_expression
    |	O_BRACKET expression C_BRACKET
    ;

VECTOR_EXPR : O_S_BRACKET (((NUMBER COMMA)*NUMBER)) C_S_BRACKET;
MATRIX_EXPR : (O_S_BRACKET (((VECTOR_EXPR COMMA )*VECTOR_EXPR)) C_S_BRACKET);

input_signature: (O_BRACKET (ID ',')* (ID) C_BRACKET);
assign_int    : ( (INT ID '=' (O_BRACKET INT C_BRACKET)(digit_expression))|(ID '=' (O_BRACKET INT C_BRACKET)(digit_expression)));
assign_int_by_subprogram :((INT ID '=' (O_BRACKET INT C_BRACKET)(ID (input_signature|(O_BRACKET C_BRACKET)))) | (ID '=' (O_BRACKET INT C_BRACKET)(ID (input_signature|(O_BRACKET C_BRACKET)))));

programm_call: (ID (input_signature|(O_BRACKET C_BRACKET)));

assign_vec    : ( (VECTOR ID '=' (VECTOR_EXPR))|(ID '=' (VECTOR_EXPR)) );
assign_vec_by_subprogram : ((VECTOR ID '=' (O_BRACKET VECTOR C_BRACKET)(ID (input_signature|(O_BRACKET C_BRACKET)))) | (ID '=' (O_BRACKET VECTOR C_BRACKET)(ID (input_signature|(O_BRACKET C_BRACKET)))));
/*set_vec    : ( (VECTOR ID '=' (ID))|(ID '=' (ID)) );*/
set_vec_expr    : ( (VECTOR ID '=' (O_BRACKET VECTOR C_BRACKET)(expression))|(ID '=' (O_BRACKET VECTOR C_BRACKET)(expression)));
set_vec_expr_by_mat    : ((VECTOR ID '=' get_mat_row_by_id)|(ID '=' get_mat_row_by_id));


assign_mat    : ( (MATRIX ID '=' (MATRIX_EXPR))|(ID '=' (MATRIX_EXPR)));
set_mat    : ( (MATRIX ID '=' (O_BRACKET MATRIX C_BRACKET)(ID ))|(ID '=' (O_BRACKET MATRIX C_BRACKET) (ID )));
set_mat_expr    : ( (MATRIX ID '=' (O_BRACKET MATRIX C_BRACKET)(expression ))|(ID '='(O_BRACKET MATRIX C_BRACKET)(expression)));

get_mat_row_by_id: (ID O_SQARE_BRACKET digit_expression C_SQARE_BRACKET) ;

print_number     : PRINT O_BRACKET (NUMBER) C_BRACKET ;
print_id     : PRINT O_BRACKET (ID) C_BRACKET ;
print_string     : PRINT O_BRACKET (('"')(ID)('"')) C_BRACKET ;
print_mat_row : PRINT O_BRACKET get_mat_row_by_id C_BRACKET ;

simple_compare : (ID|digit_expression) (EQUAL|NON_EQUAL|LESS|GREATER) (ID|digit_expression);
hard_compare : NEGATION? O_BRACKET simple_compare C_BRACKET;
else_compare: ELSE block;

while_cicle: WHILE O_BRACKET (simple_compare|hard_compare) C_BRACKET block;

compare : IF O_BRACKET (simple_compare|hard_compare) C_BRACKET block else_compare?;

type: VECTOR|MATRIX|INT;
signature: (O_BRACKET (type ID ',')* (type ID) C_BRACKET);
subprogram_return : 'sub_program' type ID (signature|(O_BRACKET C_BRACKET)) block_return;
subprogram_non_return : 'sub_program' ID (signature|(O_BRACKET C_BRACKET)) block_non_return;

block_return : BEGIN statement* RETURN ID END;
block_non_return : BEGIN statement* RETURN  END;



global_program: program{1} (subprogram_return|subprogram_non_return)*;