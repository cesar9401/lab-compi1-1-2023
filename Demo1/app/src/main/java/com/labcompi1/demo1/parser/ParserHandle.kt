package com.labcompi1.demo1.parser

import java.io.StringReader

class ParserHandle {

    fun compile (input: String): List<Token> {
        val tokenList = ArrayList<Token>()

        val lexer = SimpleLexer1(StringReader(input));
        var token = lexer.yylex()
        while(token != null && token.type != TokenType.EOF) {
            tokenList.add(token)
            token.printInfo()
            token = lexer.yylex()
        }

        return tokenList
    }
}
