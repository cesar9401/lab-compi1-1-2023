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
// decimal = {integer}\.\d+
// id = [_a-zA-Z][a-zA-Z0-9]*

/*
    graficar circulo (centroX, centroY, radio);
    graficar cuadrado (posX, posY, lado);
    graficar rectangulo(posX, posY, alto, ancho);
*/

%%

<YYINITIAL> {
    "graficar"
    {
        return token(GRAPH);
    }

    "circulo"
    {
        return token(CIRCLE);
    }

    "cuadrado"
    {
        return token(SQUARE);
    }

    "rectangulo"
    {
        return token(RECTANGLE);
    }

    ";"
    {
        return token(SEMICOLON);
    }

    ","
    {
        return token(COMMA);
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

    "("
    {
        return token(LPAREN);
    }

    ")"
    {
        return token(RPAREN);
    }

    {integer}
    {
        return token(INTEGER, yytext());
    }

    {WhiteSpace}
    { /* Ignorar */ }
}

[^]
{
    System.out.println("Error: <" + yytext() + ">");
}
