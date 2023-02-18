package com.labcompi1.democanvas.parser

import java.io.StringReader

class ParserHandle {

    fun compile (input: String): Int? {
        var result: Int? = null;

        val lexer = Lexer(StringReader(input))
        val parser = Parser(lexer);

        result = parser.parse().value as Int?;

        return result;
    }
}
