package com.labcompi1.demo1.parser;

%%

%class SimpleLexer1
%unicode
%line
%column
// %standalone
%type Token

%{
    private Token token(String value, TokenType type, int line, int column) {
        return new Token(value, type, line + 1, column + 1);
    }
%}

%eofval{
    return token(null, TokenType.EOF, yyline, yycolumn);
%eofval}
%eofclose

LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator}|[ \t\f]

integer = 0|[1-9][0-9]*
decimal = {integer}\.\d+
id = [_a-zA-Z][a-zA-Z0-9]*

%%

<YYINITIAL> {

    {id}
    {
        return token(yytext(), TokenType.ID, yyline, yycolumn);
    }

    {decimal}
    {
        return token(yytext(), TokenType.DECIMAL, yyline, yycolumn);
    }

    {integer}
    {
        return token(yytext(), TokenType.INTEGER, yyline, yycolumn);
    }

    {WhiteSpace}
    { /* Ignorar */ }
}

[^]
{
    System.out.println("Error: <" + yytext() + ">");
}
