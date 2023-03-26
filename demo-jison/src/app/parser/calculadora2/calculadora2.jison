
%lex
/* regular expressions */

id                  [_][a-z][a-z0-9]*
integer             [0]|[1-9][0-9]*
number              {integer}(\.[0-9]+)?\b
lineTerminator      \r|\n|\r\n
whitespace          {lineTerminator}|[ \t\f]
sqrt                "sqrt"|"SQRT"
pow                 "pow"|"POW"

/* operators */
plus						  	"+"
minus						  	"-"
times			  				"*"
divide		  				"/"
mod                 "%"
lparen              "("
rparen              ")"
semi                ";"
comma               ","

%%

{whitespace}        /* skip */
{number}            return "NUMBER";
{sqrt}              return "SQRT";
{pow}               return "POW";
{plus}              return "PLUS";
{minus}             return "MINUS";
{times}             return "TIMES";
{divide}            return "DIVIDE";
{mod}               return "MOD";
{lparen}            return "LPAREN";
{rparen}            return "RPAREN";
{semi}              return "SEMI";
{comma}             return "COMMA";
{id}                return "ID";
<<EOF>>             %{
                        console.log('fin de archivo');
                        return "EOF";
                    %}
.                   %{
                        console.log(`Error lexico ${yytext}`);
                        return "INVALID";
                    %}

/lex

%start initial

%%

initial
  : operations EOF
    { return $1; }
  | EOF
    { return []; }
  ;

operations
  : operations operation
    { $$ = $1; $$.push($2); }
  | operation
    { $$ = []; $$.push($1); }
  ;

operation
  : a SEMI
    { $$ = $1; }
  ;

a
  : a PLUS b
    { $$ = $1 + $3; }
  | a MINUS b
    { $$ = $1 - $3; }
  | b
    { $$ = $1; }
  ;

b
  : b TIMES c
    { $$ = $1 * $3; }
  | b DIVIDE c
    { $$ = $1 / $3; }
  | b MOD c
    { $$ = $1 % $3; }
  | c
    { $$ = $1; }
  ;

c
  : POW LPAREN a COMMA a RPAREN
    { $$ = Math.pow($3, $5); }
  | SQRT LPAREN a RPAREN
    { $$ = Math.sqrt($3); }
  | d
    { $$ = $1; }
  ;

d
  : MINUS e
    { $$ = -1 * $2; }
  | e
    { $$ = $1; }
  ;

e
  : NUMBER
    { $$ = Number($1); }
  | ID
  | LPAREN a RPAREN
    { $$ = $2; }
  ;
