package com.labcompi1.demo1.parser

import java.io.StringReader

class ParserHandle {

    fun compile (input: String): Int? {
        var result: Int? = null;

        val lexer = SimpleLexer1(StringReader(input))
        val parser = SimpleParser1(lexer);

        result = parser.parse().value as Int?;

        return result;
    }
}
