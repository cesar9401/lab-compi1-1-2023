package com.labcompi1.demo1.parser;

%%

%class SimpleLexer
%unicode
%line
%column
%type Token

%{
    private Token token(Object value, TokenType type) {
        return new Token(value.toString(), type, yyline + 1, yycolumn + 1);
    }

    private Token token(TokenType type) {
        return new Token(null, type, yyline + 1, yycolumn + 1);
    }
%}

%eofval{
    return token(TokenType.EOF);
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
        return token(yytext(), TokenType.ID);
    }

    {decimal}
    {
        return token(yytext(), TokenType.DECIMAL);
    }

    {integer}
    {
        return token(yytext(), TokenType.INTEGER);
    }

    {WhiteSpace}
    { /* Ignorar */ }
}

[^]
{
    System.out.println("Error: <" + yytext() + ">");
}
