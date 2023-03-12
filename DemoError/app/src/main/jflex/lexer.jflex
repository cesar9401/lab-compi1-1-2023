package com.labcompi1.demo1.parser;

import static com.labcompi1.demo1.parser.ParserSym.*;

import java_cup.runtime.Symbol;

%%

%class Lexer
%unicode
%line
%column
%type java_cup.runtime.Symbol
%cup

%{
    private Symbol token(int type, Object value) {
        return new Symbol(type, new Token(value.toString(), type, yyline + 1, yycolumn + 1));
    }

    private Symbol token(int type) {
        return new Symbol(type, new Token(null, type, yyline + 1, yycolumn + 1));
    }
%}

%eofval{
    return token(EOF);
%eofval}
%eofclose

LineTerminator = \r|\n|\r\n
WhiteSpace = {LineTerminator}|[ \t\f]

integer = 0|[1-9][0-9]*
decimal = {integer}\.\d+
sym = [&!@#$%_\[\]\{\}\|:'\"<>\?a-zA-Z\\]+

%%

<YYINITIAL> {
    ";"
    {
        return token(SEMICOLON);
    }

    "+"
    {
        return token(PLUS);
    }

    "-"
    {
        return token(MINUS);
    }

    "*"
    {
        return token(TIMES);
    }

    "/"
    {
        return token(DIVIDE);
    }

    "^"
    {
        return token(POW);
    }

    "("
    {
        return token(LPAREN);
    }

    ")"
    {
        return token(RPAREN);
    }

    "SQRT"|"sqrt"
    {
        return token(SQRT);
    }

    {integer}
    {
        return token(INTEGER, yytext());
    }

    {decimal}
    {
        return token (DECIMAL, yytext());
    }

    {WhiteSpace}
    { /* Ignorar */ }

    {sym}
    {
        System.out.println("Finding something else: <" + yytext() + ">");
        return token(SYM, yytext());
    }
}

[^]
{
    System.out.println("Error: <" + yytext() + ">");
}
