
%lex
/* regular expressions */

id                  [a-zA-Z_][a-zA-Z_0-9]*
integer             [0]|[1-9][0-9]*
decimal             {integer}(\.[0-9]+)
lineTerminator      \r|\n|\r\n
whitespace          {lineTerminator}|[ \t\f]
sqrt                "sqrt"|"SQRT"
pow                 "pow"|"POW"
int                 "int"
double              "double"
while               "while"
println             "System.out.println"

/* operators */
plus						  	"+"
minus						  	"-"
times			  				"*"
divide		  				"/"
mod                 "%"
comma               ","
lparen              "("
rparen              ")"
lbrace              "{"
rbrace              "}"
semi                ";"
greater             ">"
less                "<"
eq                  "="
eqeq                "=="
neq                 "!="
and                 "&&"
or                  "or"
not                 "!"

%%

{whitespace}        /* skip */
{decimal}           return "DECIMAL";
{integer}           return "INTEGER";
{sqrt}              return "SQRT";
{pow}               return "POW";
{int}               return "INT";
{double}            return "DOUBLE";
{while}             return "WHILE";
{println}           return "PRINTLN";

/* operators */
{plus}              return "PLUS";
{minus}             return "MINUS";
{times}             return "TIMES";
{divide}            return "DIVIDE";
{mod}               return "MOD";
{comma}             return "COMMA";
{greater}           return "GREATER";
{less}              return "LESS";
{eq}                return "EQ";
{eqeq}              return "EQEQ";
{neq}               return "NEQ";
{and}               return "AND";
{or}                return "OR";
{not}               return "NOT";
{lparen}            return "LPAREN";
{rparen}            return "RPAREN";
{lbrace}            return "LBRACE";
{rbrace}            return "RBRACE";
{semi}              return "SEMI";

/* id */
{id}                return "ID";

<<EOF>>               return "EOF";
.                   %{
                        console.log(`Error lexico ${yytext}`);
                        return "INVALID";
                    %}

/lex

%start initial

%%

initial
  : statements EOF
    { return 0; }
  ;

statements
  : statements statement
  |
  ;

statement
  : assign_stmt
  | declaration_stmt
  | while_stmt
  | println_stmt
  ;

while_stmt
  : WHILE LPAREN a RPAREN LBRACE statements RBRACE
  ;

println_stmt
  : PRINTLN LPAREN a RPAREN SEMI
  ;

assign_stmt
  : ID EQ a SEMI
  ;

declaration_stmt
  : type ID EQ a SEMI
  ;

type
  : INT
  | DOUBLE
  ;

a
  : a OR b
  | b
  ;

b
  : b AND c
  | c
  ;

c
  : c GREATER d
  | c LESS d
  | c EQEQ d
  | c NEQ d
  | d
  ;

d
  : d PLUS e
  | d MINUS e
  | e
  ;

e
  : e TIMES f
  | e DIVIDE f
  | e MOD f
  | f
  ;

f
  : POW LPAREN a COMMA a RPAREN
  | SQRT LPAREN a RPAREN
  | g
  ;

g
  : MINUS h
  | h
  ;

h
  : DECIMAL
  | INTEGER
  | ID
  | LPAREN a RPAREN
  ;
