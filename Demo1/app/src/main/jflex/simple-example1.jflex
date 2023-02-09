
%%

%class SimpleLexer1
%unicode
%line
%column
%standalone

LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator}|[ \t\f]

integer = 0|[1-9][0-9]*
id = [_a-zA-Z][a-zA-Z0-9]*

%%

<YYINITIAL> {

    {id}
    {
        System.out.println("Identificador: " + yytext() + ", line: " + (yyline + 1) + ", col: " + (yycolumn + 1));
    }

    {integer}
    {
        System.out.println("Entero: " + yytext() + ", line: " + (yyline + 1) + ", col: " + (yycolumn + 1));
    }

    {WhiteSpace}
    { /* Ignorar */ }
}

[^]
{
    System.out.println("Error: <" + yytext() + ">");
}
