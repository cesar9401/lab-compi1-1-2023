package com.labcompi1.demo1.parser;

import static com.labcompi1.demo1.parser.SimpleParserSym.*;

import java_cup.runtime.Symbol;

%%

%class SimpleLexer
%unicode
%line
%column
%cup
%type java_cup.runtime.Symbol

%{
    /*
    private Token token(Object value, TokenType type) {
        return new Token(value.toString(), type, yyline + 1, yycolumn + 1);
    }

    private Token token(TokenType type) {
        return new Token(null, type, yyline + 1, yycolumn + 1);
    }
    */

    private Symbol symbol(int type, Object value) {
        return new Symbol(type, new Token(value.toString(), type, yyline + 1, yycolumn + 1));
    }

    private Symbol symbol(int type) {
        return new Symbol(type, new Token(null, type, yyline + 1, yycolumn + 1));
    }
%}

%eofval{
    return symbol(EOF);
%eofval}
%eofclose

LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator}|[ \t\f]

integer = 0|[1-9][0-9]*

%%

<YYINITIAL> {
    "+"
    {
        return symbol(PLUS);
    }

    "-"
    {
        return symbol(MINUS);
    }

    "*"
    {
        return symbol(TIMES);
    }

    "/"
    {
        return symbol(DIVIDE);
    }

    "^"
    {
        return symbol(POW);
    }

    {integer}
    {
        return symbol(INTEGER, yytext());
    }

    {WhiteSpace}
    { /* Ignorar */ }
}

[^]
{
    System.out.println("Error: <" + yytext() + ">");
}
