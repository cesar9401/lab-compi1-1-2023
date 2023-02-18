package com.labcompi1.demo1.parser

import java.io.StringReader

class ParserHandle {

    fun compile (input: String): Int? {
        val lexer = Lexer(StringReader(input))
        val parser = Parser(lexer)

        parser.parse();

        return 0;
    }
}
