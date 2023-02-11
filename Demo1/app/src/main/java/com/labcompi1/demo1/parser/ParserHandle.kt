package com.labcompi1.demo1.parser

import java.io.StringReader

class ParserHandle {

    fun compile (input: String): Int? {
        val lexer = SimpleLexer(StringReader(input))
        val parser = SimpleParser(lexer);
        val result: Int? = parser.parse().value as Int?;
        return result;
    }
}
